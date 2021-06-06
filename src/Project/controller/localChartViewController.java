package Project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import Project.dataModel.ElectionResultDataModel2;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class localChartViewController implements Initializable {
	@FXML private ImageView liveVoteInfoBtn;
	@FXML private ImageView candidateAndElectionInfoBtn;
	@FXML private PieChart pieChart;
	@FXML private SplitMenuButton electionList; // 선거 목록
	@FXML private TableView<ElectionResultDataModel2> electionResult; // 선거 결과
	@FXML private TableColumn<ElectionResultDataModel2, String> partyCol; // 정당
	@FXML private TableColumn<ElectionResultDataModel2, String> amountCol; // 총합
	@FXML private TableColumn<ElectionResultDataModel2, String> rateCol; // 비율
	@FXML private Text party1; // 정당 1
	@FXML private Text party2; // 정당 2
	@FXML private Text party3; // 정당 3
	@FXML private Text party4; // 정당 4
	@FXML private Text party5; // 정당 5
	
    ObservableList<ElectionResultDataModel2>myList = FXCollections.observableArrayList(
    		new ElectionResultDataModel2(new SimpleStringProperty("더불어민주당"), new SimpleStringProperty("652석"), new SimpleStringProperty("79.1%"))
    		);
    @Override
    public void initialize(URL location, ResourceBundle resoruces) {
    	pieChart.setData(FXCollections.observableArrayList(
    		    new PieChart.Data("국민의 힘", 20),
    		    new PieChart.Data("더불어민주당", 32),
    		    new PieChart.Data("정의당", 24),
    		    new PieChart.Data("국민의당", 7)
    		));
    	partyCol.setCellValueFactory(cellData->cellData.getValue().partyProperty());
    	amountCol.setCellValueFactory(cellData->cellData.getValue().amountProperty());
    	rateCol.setCellValueFactory(cellData->cellData.getValue().rateProperty());
    	electionResult.setItems(myList);
    }
    
}