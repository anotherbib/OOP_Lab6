public class App {

	public static void main(String[] args) {
		
		//CSVParser realEstate = new RealEstateMarketDataParser();
		//CSVParser machineLearning = new MachineLearningDataParser();
		
		StockMarketDataParser stockMarketDataParser = new StockMarketDataParser();
        CSVParser stockMarketAdapter = new StockMarketAdapter(stockMarketDataParser);
		parse(stockMarketAdapter);
		
		//parse(realEstate);
		//parse(machineLearning);
		
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
