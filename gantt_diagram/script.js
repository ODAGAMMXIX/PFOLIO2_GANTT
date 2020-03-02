//https://docs.dhtmlx.com/
//https://dhtmlx.com/blog/use-dhtmlxgantt-vue-js-framework-demo/

Vue.component('dhtmlxgantt', {
  template:`
<div ref="gantt"></div>
`,
  props: {
    tasks: {
      type: Object,
      default () {
        return {data: [], links: []}
      }
    }
  },
  mounted: function () {
    gantt.init(this.$refs.gantt)
    gantt.parse(this.$props.tasks)
  },
})

new Vue({
    el: '#app',
    data: {
        tasks: {
            "data": [{
                "id": 1,
                "text": "Project #1",
                "start_date": "01-01-2020",
                "duration": "11",
                "progress": 0.6,
                "open": true,
                "priority": "2"
            },
            {
                "id": 2,
                "text": "Task #1",
                "start_date": "03-01-2020",
                "duration": "5",
                "parent": "1",
                "progress": 1,
                "open": true,
                "priority": "1"
            },
            {
                "id": 3,
                "text": "Task #2",
                "start_date": "02-01-2020",
                "duration": "7",
                "parent": "1",
                "progress": 0.5,
                "open": true,
                "priority": "1"
            },
            {
                "id": 4,
                "text": "Task #3",
                "start_date": "01-01-2020",
                "duration": "6",
                "parent": "1",
                "progress": 0.8,
                "open": true,
                "priority": "2"
            },
            {
                "id": 5,
                "text": "Task #4",
                "start_date": "02-01-2020",
                "duration": "5",
                "parent": "1",
                "progress": 0.2,
                "open": true,
                "priority": "3"
            },
            {
                "id": 6,
                "text": "Task #5",
                "start_date": "02-01-2020",
                "duration": "7",
                "parent": "1",
                "progress": 0,
                "open": true,
                "priority": "2"
            },
            {
                "id": 7,
                "text": "Task #2.1",
                "start_date": "03-01-2020",
                "duration": "2",
                "parent": "3",
                "progress": 1,
                "open": true,
                "priority": "2"
            },
            {
                "id": 8,
                "text": "Task #2.2",
                "start_date": "06-01-2020",
                "duration": "3",
                "parent": "3",
                "progress": 0.8,
                "open": true,
                "priority": "3"
            },
            {
                "id": 9,
                "text": "Task #2.3",
                "start_date": "10-01-2020",
                "duration": "4",
                "parent": "3",
                "progress": 0.2,
                "open": true,
                "priority": "1"
            },
            {
                "id": 10,
                "text": "Task #2.4",
                "start_date": "10-01-2020",
                "duration": "4",
                "parent": "3",
                "progress": 0,
                "open": true,
                "priority": "1"
            },
            {
                "id": 11,
                "text": "Task #4.1",
                "start_date": "03-01-2020",
                "duration": "4",
                "parent": "5",
                "progress": 0.5,
                "open": true,
                "priority": "3"
            },
            {
                "id": 12,
                "text": "Task #4.2",
                "start_date": "03-01-2020",
                "duration": "4",
                "parent": "5",
                "progress": 0.1,
                "open": true,
                "priority": "3"
            },
            {
                "id": 13,
                "text": "Task #4.3",
                "start_date": "03-01-2020",
                "duration": "5",
                "parent": "5",
                "progress": 0,
                "open": true,
                "priority": "3"
            }],
            "links": [{
                "id": "10",
                "source": "11",
                "target": "12",
                "type": "1"
            },
            {
                "id": "11",
                "source": "11",
                "target": "13",
                "type": "1"
            }]
        },
    },
});