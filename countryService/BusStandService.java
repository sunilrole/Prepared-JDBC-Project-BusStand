package com.countryService;

import com.countryDao.BusStandDao;

public class BusStandService {

	public void insertService() throws Exception {
		BusStandDao b = new BusStandDao();
		b.insertData();
	}
	
	public void deleteData() throws Exception {
		BusStandDao b = new BusStandDao();
		b.deleteData();
	}
	
	public void updateData() throws Exception {
		BusStandDao b = new BusStandDao();
		b.updateData();
	}
	
	public void fetchData() throws Exception {
		BusStandDao b = new BusStandDao();
		b.fetchData();
	}
}
