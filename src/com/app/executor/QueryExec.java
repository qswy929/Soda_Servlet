package com.app.executor;

public class QueryExec {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        QueryTimer qt = new QueryTimer();
        qt.QueryNow();
        //qt.QueryEvery5Mintue();
        qt.QueryEveryHour();
        
	}

}