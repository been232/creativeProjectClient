package client.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class nationalAssemblyChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private LineChart<String, Integer> lineChart;
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	 XYChart.Series<String, Integer> series1 = null;
    	 series1 = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series1.getData().add(new XYChart.Data<String, Integer>("2012",30));
         series1.getData().add(new XYChart.Data<String, Integer>("2016",40));
         series1.getData().add(new XYChart.Data<String, Integer>("2020",50));

         series1.setName("��������");
         
    	 XYChart.Series<String, Integer> series2 = null;
    	 series2 = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series2.getData().add(new XYChart.Data<String, Integer>("2012",40));
         series2.getData().add(new XYChart.Data<String, Integer>("2016",30));
         series2.getData().add(new XYChart.Data<String, Integer>("2020",15));

         series2.setName("���Ҿ���ִ�");
         
    	 XYChart.Series<String, Integer> series3 = null;
    	 series3 = new XYChart.Series<String, Integer>();
         // series�� ���� ������ �߰� 
         series3.getData().add(new XYChart.Data<String, Integer>("2012",5));
         series3.getData().add(new XYChart.Data<String, Integer>("2016",2));
         series3.getData().add(new XYChart.Data<String, Integer>("2020",3));

         series3.setName("�����Ǵ�");

         // ������Ʈ�� series �߰� 
         lineChart.getData().add(series1);
         lineChart.getData().add(series2);
         lineChart.getData().add(series3);
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("������ ��", 20),
    		    new PieChart.Data("���Ҿ���ִ�", 32),
    		    new PieChart.Data("���Ǵ�", 24),
    		    new PieChart.Data("�����Ǵ�", 7)
    		));
    }
    
}