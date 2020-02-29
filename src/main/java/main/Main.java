package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart("Task types report", new ArrayList());

        BarChart barChartMadeWIthBuilder = BarChart.builder()
                .withTitle("test")
                .withFontSize(5)
                .build();
    }
}
