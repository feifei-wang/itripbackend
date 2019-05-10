package cn.test.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.IOException;
import java.util.List;

public class TestSolr {
    public static void main(String[] args) throws IOException, SolrServerException {
      //与solr的hotel模块建立连接
        String url="http://localhost:8080/solr/hotel";
        HttpSolrClient httpSolrClient = new HttpSolrClient(url);
        //封装solr查询条件
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("keyword:北京");
        //执行查询，获得查询相应对象
        QueryResponse queryResponse=httpSolrClient.query(solrQuery);
        //获得查询结果实体类对象集合
        List<ItripHotel> itripHotels=queryResponse.getBeans(ItripHotel.class);
        for(ItripHotel itripHotel:itripHotels){
            for(String keyword:itripHotel.getKeyword()) {
                System.out.println("itripHotel keywords:----->" + keyword);
            }
        }




    }
}
