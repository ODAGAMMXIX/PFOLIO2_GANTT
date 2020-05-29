package nectosystemteste;

/**
 *
 * @author Denise Oliveira
 */
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.ui.RefineryUtilities;


public class NectoSystemTeste extends JFrame{ //herança de classe
    public NectoSystemTeste(final String title){ //metodo construtor
        //abaixo temos os metodos de configuração da janela:
        super (title);
        final IntervalCategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);//objeto painel
        chartPanel.setPreferredSize(new java.awt.Dimension(700, 500));
        setContentPane(chartPanel);
        
       
    }
    //Conjunto de dados da categoria de intervalo:    
    public static IntervalCategoryDataset createDataset() { 
       //linha 35: metodo que add as tasks
        final TaskSeries s1 = new TaskSeries("Projeto I ");//legenda do grafico
        //adicionando tarefas:
        s1.add(new Task("Projeto Teste A",
               new SimpleTimePeriod(date(1, Calendar.APRIL, 2020),
                                    date(10, Calendar.APRIL, 2020))));
        s1.add(new Task("Projeto Teste B",
               new SimpleTimePeriod(date(9, Calendar.APRIL, 2020),
                                    date(9, Calendar.APRIL, 2020))));
        s1.add(new Task("Projeto Teste C",
               new SimpleTimePeriod(date(10, Calendar.APRIL, 2020),
                                    date(5, Calendar.MAY, 2020))));
        s1.add(new Task("Projeto Teste D",
               new SimpleTimePeriod(date(6, Calendar.MAY, 2020),
                                    date(30, Calendar.MAY, 2020))));
        s1.add(new Task("Projeto Teste E",
               new SimpleTimePeriod(date(2, Calendar.JUNE, 2020),
                                    date(2, Calendar.JUNE, 2020))));
        s1.add(new Task("Projeto Teste  F",
               new SimpleTimePeriod(date(3, Calendar.JUNE, 2020),
                                    date(31, Calendar.JULY, 2020))));
        s1.add(new Task("Projeto Teste G",
               new SimpleTimePeriod(date(1, Calendar.AUGUST, 2020),
                                    date(8, Calendar.AUGUST, 2020))));
        s1.add(new Task("Projeto Teste H",
               new SimpleTimePeriod(date(10, Calendar.AUGUST, 2020),
                                    date(10, Calendar.AUGUST, 2020))));
        s1.add(new Task("Projeto Teste I",
               new SimpleTimePeriod(date(12, Calendar.AUGUST, 2020),
                                    date(12, Calendar.SEPTEMBER, 2020))));
        s1.add(new Task("Testando",
               new SimpleTimePeriod(date(13, Calendar.SEPTEMBER, 2020),
                                    date(31, Calendar.OCTOBER, 2020))));
        s1.add(new Task("Implementação Final",
               new SimpleTimePeriod(date(1, Calendar.NOVEMBER, 2020),
                                    date(15, Calendar.NOVEMBER, 2020))));
        s1.add(new Task("Signoff",
               new SimpleTimePeriod(date(28, Calendar.NOVEMBER, 2020),
                                    date(30, Calendar.NOVEMBER, 2020))));

        final TaskSeries s2 = new TaskSeries("Evolução");//legenda
        s2.add(new Task("Projeto A",
               new SimpleTimePeriod(date(1, Calendar.APRIL, 2020),
                                    date(15, Calendar.APRIL, 2020))));
        s2.add(new Task("Aprovado",
               new SimpleTimePeriod(date(9, Calendar.APRIL, 2020),
                                    date(9, Calendar.APRIL, 2020))));
        s2.add(new Task("Analise",
               new SimpleTimePeriod(date(10, Calendar.APRIL, 2020),
                                    date(15, Calendar.MAY, 2020))));
        s2.add(new Task("Design",
               new SimpleTimePeriod(date(15, Calendar.MAY, 2020),
                                    date(17, Calendar.JUNE, 2020))));
        s2.add(new Task("Design Signoff",
               new SimpleTimePeriod(date(30, Calendar.JUNE, 2020),
                                    date(30, Calendar.JUNE, 2020))));
        s2.add(new Task("Implementacao I",
               new SimpleTimePeriod(date(1, Calendar.JULY, 2020),
                                    date(12, Calendar.SEPTEMBER, 2020))));
        s2.add(new Task("Design Review",
               new SimpleTimePeriod(date(12, Calendar.SEPTEMBER, 2020),
                                    date(22, Calendar.SEPTEMBER, 2020))));
        s2.add(new Task("Revised Design Signoff",
               new SimpleTimePeriod(date(25, Calendar.SEPTEMBER, 2020),
                                    date(27, Calendar.SEPTEMBER, 2020))));
        s2.add(new Task("Implementacao B",
               new SimpleTimePeriod(date(27, Calendar.SEPTEMBER, 2020),
                                    date(30, Calendar.OCTOBER, 2020))));
        s2.add(new Task("Testando",
               new SimpleTimePeriod(date(31, Calendar.OCTOBER, 2020),
                                    date(17, Calendar.NOVEMBER, 2020))));
        s2.add(new Task("Implementacao Final",
               new SimpleTimePeriod(date(18, Calendar.NOVEMBER, 2020),
                                    date(5, Calendar.DECEMBER, 2020))));
        s2.add(new Task("Signoff",
               new SimpleTimePeriod(date(10, Calendar.DECEMBER, 2020),
                                    date(11, Calendar.DECEMBER, 2020))));
        
         final TaskSeries s3 = new TaskSeries("Projeto II ");
         s3.add(new Task("Projeto Teste A",
               new SimpleTimePeriod(date(1, Calendar.JANUARY, 2020),
                                    date(5, Calendar.JANUARY, 2020))));
        s3.add(new Task("Projeto Teste B",
               new SimpleTimePeriod(date(9, Calendar.FEBRUARY, 2020),
                                    date(9, Calendar.FEBRUARY, 2020))));
        s3.add(new Task("Projeto Teste C",
               new SimpleTimePeriod(date(10, Calendar.APRIL, 2020),
                                    date(5, Calendar.MAY, 2020))));
        s3.add(new Task("Projeto Teste D",
               new SimpleTimePeriod(date(6, Calendar.MAY, 2020),
                                    date(30, Calendar.MAY, 2020))));
        s3.add(new Task("Projeto Teste E",
               new SimpleTimePeriod(date(2, Calendar.JUNE, 2020),
                                    date(2, Calendar.JUNE, 2020))));
        s3.add(new Task("Projeto Teste  F",
               new SimpleTimePeriod(date(3, Calendar.JUNE, 2020),
                                    date(31, Calendar.JULY, 2020))));
        s3.add(new Task("Projeto Teste G",
               new SimpleTimePeriod(date(1, Calendar.AUGUST, 2020),
                                    date(8, Calendar.AUGUST, 2020))));
        s3.add(new Task("Projeto Teste H",
               new SimpleTimePeriod(date(10, Calendar.AUGUST, 2020),
                                    date(10, Calendar.AUGUST, 2020))));
        s3.add(new Task("Projeto Teste I",
               new SimpleTimePeriod(date(12, Calendar.AUGUST, 2020),
                                    date(12, Calendar.SEPTEMBER, 2020))));
        s3.add(new Task("Testando",
               new SimpleTimePeriod(date(13, Calendar.SEPTEMBER, 2020),
                                    date(31, Calendar.OCTOBER, 2020))));
        s3.add(new Task("Implementação Final",
               new SimpleTimePeriod(date(1, Calendar.NOVEMBER, 2020),
                                    date(15, Calendar.NOVEMBER, 2020))));
        s3.add(new Task("Signoff",
               new SimpleTimePeriod(date(28, Calendar.NOVEMBER, 2020),
                                    date(30, Calendar.NOVEMBER, 2020))));

        final TaskSeries s4 = new TaskSeries("Evolução");//legenda
        s4.add(new Task("Projeto A",
               new SimpleTimePeriod(date(1, Calendar.FEBRUARY, 2020),
                                    date(8, Calendar.FEBRUARY, 2020))));
        s4.add(new Task("Aprovado",
               new SimpleTimePeriod(date(9, Calendar.APRIL, 2020),
                                    date(10, Calendar.APRIL, 2020))));
        s4.add(new Task("Analise",
               new SimpleTimePeriod(date(10, Calendar.APRIL, 2020),
                                    date(12, Calendar.MAY, 2020))));
        s4.add(new Task("Design",
               new SimpleTimePeriod(date(15, Calendar.MAY, 2020),
                                    date(18, Calendar.JUNE, 2020))));
        s4.add(new Task("Design Signoff",
               new SimpleTimePeriod(date(28, Calendar.JUNE, 2020),
                                    date(30, Calendar.JUNE, 2020))));
        s4.add(new Task("Implementacao I",
               new SimpleTimePeriod(date(1, Calendar.JULY, 2020),
                                    date(10, Calendar.SEPTEMBER, 2020))));
        s4.add(new Task("Design Review",
               new SimpleTimePeriod(date(11, Calendar.SEPTEMBER, 2020),
                                    date(20, Calendar.SEPTEMBER, 2020))));
        s4.add(new Task("Revised Design Signoff",
               new SimpleTimePeriod(date(25, Calendar.SEPTEMBER, 2020),
                                    date(30, Calendar.SEPTEMBER, 2020))));
        s4.add(new Task("Implementacao B",
               new SimpleTimePeriod(date(27, Calendar.SEPTEMBER, 2020),
                                    date(31, Calendar.OCTOBER, 2020))));
        s4.add(new Task("Testando",
               new SimpleTimePeriod(date(31, Calendar.OCTOBER, 2020),
                                    date(10, Calendar.NOVEMBER, 2020))));
        s4.add(new Task("Implementacao Final",
               new SimpleTimePeriod(date(15, Calendar.NOVEMBER, 2020),
                                    date(5, Calendar.DECEMBER, 2020))));
        s4.add(new Task("Signoff",
               new SimpleTimePeriod(date(10, Calendar.DECEMBER, 2020),
                                    date(11, Calendar.DECEMBER, 2020))));

        final TaskSeriesCollection collection = new TaskSeriesCollection();
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s4);

        return collection;
    }
private static Date date(final int day, final int month, final int year) {

        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        final Date result = calendar.getTime();
        return result;

    } 
private JFreeChart createChart(final IntervalCategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createGanttChart(
            "Gantt Chart Teste I Necto System",  // Titulo do Grafico
            "Task",              // rotulo do eixo
            "Data",              // etiqueta data
            dataset,             // data
            true,                // include legend
            true,                // tooltips
            false                // urls
        );    

        return chart;    
    }
public static void main(final String[] args) {
        //Obj deve ter o msm nome da classe:
        final NectoSystemTeste demo = new NectoSystemTeste("Gantt Teste");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
    }


