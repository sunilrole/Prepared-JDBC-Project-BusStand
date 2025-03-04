package com.countryController;

import com.countryService.BusStandService;

public class BusStandController {

	public static void main(String[] args) throws Exception {
		
		BusStandService bc = new BusStandService();
//		bc.insertService();
//		bc.deleteData();
//		bc.updateData();
		bc.fetchData();

	}

}
