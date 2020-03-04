import datetime
import gantt

# Change font default
gantt.define_font_attributes(fill='black',
                             stroke='black',
                             stroke_width=0,
                             font_family="Verdana")

# Add vacations for everyone
gantt.add_vacations(datetime.date(2020, 12, 25))
gantt.add_vacations(datetime.date(2021, 1, 1))
gantt.add_vacations(datetime.date(2021, 1, 13))

# Create two resources
resource_andre = gantt.Resource('Andre')
resource_test = gantt.Resource('Test')

# Add vacations for one lucky resource
resource_andre.add_vacations(
    dfrom=datetime.date(2019, 12, 29), 
    dto=datetime.date(2020, 1, 4) 
    )
resource_andre.add_vacations(
    dfrom=datetime.date(2019, 1, 6), 
    dto=datetime.date(2020, 1, 8) 
    )

# Test if this resource is  avalaible for some dates
print(resource_andre.is_available(datetime.date(2015, 1, 5)))
print(resource_andre.is_available(datetime.date(2015, 1, 8)))
print(resource_andre.is_available(datetime.date(2015, 1, 6)))
print(resource_andre.is_available(datetime.date(2015, 1, 2)))
print(resource_andre.is_available(datetime.date(2015, 1, 1)))


# Create some tasks
t1 = gantt.Task(name='Task one',
                start=datetime.date(2019, 12, 25),
                duration=4,
                percent_done=44,
                resources=[resource_andre],
                color="#FF8080")
t2 = gantt.Task(name='Task Two',
                start=datetime.date(2019, 12, 28),
                duration=6,
                resources=[resource_test])
t7 = gantt.Task(name='Task Seven',
                start=datetime.date(2019, 12, 28),
                duration=5,
                percent_done=50)
t3 = gantt.Task(name='Task three',
                start=datetime.date(2019, 12, 25),
                duration=4,
                depends_of=[t1, t7, t2],
                resources=[resource_test])
t4 = gantt.Task(name='Task Four',
                start=datetime.date(2020, 01, 01),
                duration=4,
                depends_of=t1,
                resources=[resource_test])
t5 = gantt.Task(name='Task Five',
                start=datetime.date(2020, 01, 23),
                duration=3)
t6 = gantt.Task(name='Task Six',
                start=datetime.date(2020, 01, 25),
                duration=4,
                depends_of=t7,
                resources=[resource_andre])
t8 = gantt.Task(name='Task Eight',
                start=datetime.date(2020, 01, 25),
                duration=4,
                depends_of=t7,
                resources=[resource_andre, resource_test])


# Create a project
p1 = gantt.Project(name='Project One')

# Add tasks to this project
p1.add_task(t1)
p1.add_task(t7)
p1.add_task(t2)
p1.add_task(t3)
p1.add_task(t5)
p1.add_task(t8)



# Create another project
p2 = gantt.Project(name='Project Two', color='#FFFF40')

# Add tasks to this project
p2.add_task(t4)


# Create another project
p = gantt.Project(name='Project Macro')
# wich contains the first two projects
# and a single task
p.add_task(p1)
p.add_task(p2)
p.add_task(t6)



# Test cases for milestones
# Create another project
ptcm = gantt.Project(name='Project Four')

tcm11 = gantt.Task(name='tcm11',
                   start=datetime.date(2019, 12, 25),
                   duration=4)
tcm12 = gantt.Task(name='tcm12',
                   start=datetime.date(2019, 12, 26),
                   duration=5)
ms1 = gantt.Milestone(name=' ',
                      depends_of=[tcm11, tcm12])
tcm21 = gantt.Task(name='tcm21',
                   start=datetime.date(2019, 12, 30),
                   duration=4,
                   depends_of=[ms1])
tcm22 = gantt.Task(name='tcm22',
                   start=datetime.date(2019, 12, 30),
                   duration=6,
                   depends_of=[ms1])
ms2 = gantt.Milestone(name='MS2',
                      depends_of=[ms1, tcm21, tcm22])
tcm31 = gantt.Task(name='tcm31',
                   start=datetime.date(2019, 12, 30),
                   duration=6,
                   depends_of=[ms2])
ms3 = gantt.Milestone(name='MS3', depends_of=[ms1])


ptcm.add_task(tcm11)
ptcm.add_task(tcm12)
ptcm.add_task(ms1)
ptcm.add_task(tcm21)
ptcm.add_task(tcm22)
ptcm.add_task(ms2)
ptcm.add_task(tcm31)
ptcm.add_task(ms3)


p.add_task(ptcm)

##########################$ MAKE DRAW ###############
p.make_svg_for_tasks(filename='test_full.svg',
                     today=datetime.date(2020, 03, 04),
                     start=datetime.date(2019, 11, 01),
                     end=datetime.date(2020, 03, 14))
p.make_svg_for_tasks(filename='test_full2.svg',
                     today=datetime.date(2020, 03, 04))
p.make_svg_for_tasks(filename='test.svg',
                     today=datetime.date(2020, 03, 04),
                     start=datetime.date(2019, 11, 01),
                     end=datetime.date(2020, 03, 14))
p1.make_svg_for_tasks(filename='test_p1.svg',
                     today=datetime.date(2020, 03, 04))
p2.make_svg_for_tasks(filename='test_p2.svg',
                     today=datetime.date(2020, 03, 04))
p.make_svg_for_resources(filename='test_resources.svg',
                         today=datetime.date(2020, 03, 04),
                         resources=[resource_andre, resource_test])
p.make_svg_for_tasks(filename='test_weekly.svg',
                     today=datetime.date(2020, 03, 04),
                     scale=gantt.DRAW_WITH_WEEKLY_SCALE)
##########################$ /MAKE DRAW ###############