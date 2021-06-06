package client.controller;

import java.net.URL;
import java.util.ResourceBundle;

import client.dataModel.ElectionResultDataModel;
import client.dataModel.ElectionResultDataModel2;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class localChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private SplitMenuButton electionList; // ���� ���
	@FXML private TableView<ElectionResultDataModel2> electionResult; // ���� ���
	@FXML private TableColumn<ElectionResultDataModel2, String> partyCol; // ����
	@FXML private TableColumn<ElectionResultDataModel2, String> amountCol; // ����
	@FXML private TableColumn<ElectionResultDataModel2, String> rateCol; // ����
	@FXML private Text party1; // ���� 1
	@FXML private Text party2; // ���� 2
	@FXML private Text party3; // ���� 3
	@FXML private Text party4; // ���� 4
	@FXML private Text party5; // ���� 5
	
    ObservableList<ElectionResultDataModel2>myList = FXCollections.observableArrayList(
    		new ElectionResultDataModel2(new SimpleStringProperty("���Ҿ���ִ�"), new SimpleStringProperty("652��"), new SimpleStringProperty("79.1%"))
    		);
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("������ ��", 20),
    		    new PieChart.Data("���Ҿ���ִ�", 32),
    		    new PieChart.Data("���Ǵ�", 24),
    		    new PieChart.Data("�����Ǵ�", 7)
    		));
    	partyCol.setCellValueFactory(cellData->cellData.getValue().partyProperty());
    	amountCol.setCellValueFactory(cellData->cellData.getValue().amountProperty());
    	rateCol.setCellValueFactory(cellData->cellData.getValue().rateProperty());
    	electionResult.setItems(myList);
    }
    
}