package global;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;





public class Grafico extends JFrame {
	
	
			
	
	   public  long serialVersionUID = 1L;

	   public Grafico(String title) {
	      super(title);
	      // Create dataset
	      IntervalCategoryDataset dataset = getCategoryDataset1();
	    
	      // Create chart
	      JFreeChart chart = ChartFactory.createGanttChart(
	            "Nome Projeto", // Chart title
	            "Tarefas", // X-Axis Label
	            "Linha do Tempo", // Y-Axis Label
	            dataset);

	      ChartPanel panel = new ChartPanel(chart);
	      setContentPane(panel);
	   }
	   
	   String Projeto1 = "Nome do Projeto:";	    
	    
		
		String Tarefa1 = "Nome da Tarefa 1:";
		
		String dataInicio = ("12/03/2020");
		int diaInicio = Integer.parseInt(dataInicio.substring(0,2));
		int mesInicio = Integer.parseInt(dataInicio.substring(3,5));
		int anoInicio = Integer.parseInt(dataInicio.substring(6,10));		
		
		String dataFim = ("22/05/2020");
		int diaFim = Integer.parseInt(dataFim.substring(0,2));
		int mesFim = Integer.parseInt(dataFim.substring(3,5));
		int anoFim = Integer.parseInt(dataFim.substring(6,10));			   
	   	   
	   
	   
	public IntervalCategoryDataset getCategoryDataset1() {		
					
		
			TaskSeries series1 = new TaskSeries(Tarefa1);
	          series1.add(new Task(Projeto1,
	        		Date.from(LocalDate.of(anoInicio, mesInicio, diaInicio).atStartOfDay().toInstant(ZoneOffset.UTC)),
	                Date.from(LocalDate.of(anoFim, mesFim, diaFim).atStartOfDay().toInstant(ZoneOffset.UTC))
	         ));     
	      /*series1.add(new Task("Projeto 2",
		        Date.from(LocalDate.of(2020, 8, 03).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 8, 05).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	      series1.add(new Task("Projeto 3",
		        Date.from(LocalDate.of(2020, 9, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 9, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	      	      	      
	     TaskSeries series2 = new TaskSeries("Tarefa 2");
	      series2.add(new Task(Projeto1,
	            Date.from(LocalDate.of(2020, 7, 5).atStartOfDay().toInstant(ZoneOffset.UTC)),
	            Date.from(LocalDate.of(2020, 7, 8).atStartOfDay().toInstant(ZoneOffset.UTC))
	         ));
	      series2.add(new Task("Projeto 2",
		        Date.from(LocalDate.of(2020, 8, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 8, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	      series2.add(new Task("Projeto 3",
		        Date.from(LocalDate.of(2020, 9, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 9, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	     
	      TaskSeries series3 = new TaskSeries("Tarefa 3");
	      series3.add(new Task(Projeto1,
	            Date.from(LocalDate.of(2020, 7, 8).atStartOfDay().toInstant(ZoneOffset.UTC)),
	            Date.from(LocalDate.of(2020, 7, 11).atStartOfDay().toInstant(ZoneOffset.UTC))
	         ));
	      series3.add(new Task("Projeto 2",
		        Date.from(LocalDate.of(2020, 8, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 8, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	      series3.add(new Task("Projeto 3",
		        Date.from(LocalDate.of(2020, 9, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 9, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	      
	      TaskSeries series4 = new TaskSeries("Tarefa 4");
	      series4.add(new Task(Projeto1,
	            Date.from(LocalDate.of(2020, 7, 11).atStartOfDay().toInstant(ZoneOffset.UTC)),
	            Date.from(LocalDate.of(2020, 7, 15).atStartOfDay().toInstant(ZoneOffset.UTC))
	         ));
	      series4.add(new Task("Projeto 2",
		        Date.from(LocalDate.of(2020, 8, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 8, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));
	      series4.add(new Task("Projeto 3",
		        Date.from(LocalDate.of(2020, 9, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
		        Date.from(LocalDate.of(2020, 9, 5).atStartOfDay().toInstant(ZoneOffset.UTC))
		         ));*/
	            	            
	      
	      TaskSeriesCollection dataset = new TaskSeriesCollection();
	      //for (int i = 0; i < 10; i++)	    	  
	    	  dataset.add(series1);
	        //dataset.add(series2);
	        //dataset.add(series3);
	        //dataset.add(series4);
	      return dataset;
	   }

	   public static void main(String[] args) {
	      SwingUtilities.invokeLater(() -> {
	         Grafico example = new Grafico("Gantt Chart Example");
	         example.setSize(800, 400);
	         example.setLocationRelativeTo(null);
	         example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	         example.setVisible(true);
	      });
	   }
	}