import org.jfree.chart.ChartFactory;
        import org.jfree.chart.ChartPanel;
        import org.jfree.chart.JFreeChart;
        import org.jfree.chart.plot.PlotOrientation;
        import org.jfree.data.category.DefaultCategoryDataset;
        import org.jfree.ui.ApplicationFrame;

        import javax.swing.*;
        import java.awt.*;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAM");
        setContentPane(createPanel());
        pack();
    }

    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel(){
        ChartPanel chartPanel= new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominios email",
                "Nº emails",dataSet, PlotOrientation.VERTICAL,rootPaneCheckingEnabled,
                rootPaneCheckingEnabled,rootPaneCheckingEnabled);
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(4,"","gmail.com");
        dataset.addValue(6,"","outlook.com");
        dataset.addValue(8,"","hotmail.com");
        dataset.addValue(15,"","ulpgc.com");
        return dataset;
    }
}
