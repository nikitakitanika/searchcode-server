package com.searchcode.app.dto.api.legacy;

import java.util.ArrayList;

public class codesearch_I {
    public String matchterm;
    public String searchterm;
    public String query;
    public int total;
    public int page;
    public int nextpage;
    public int previouspage;
    public ArrayList<String> source_filters;
    public ArrayList<String> language_filters;
    public ArrayList<result_codesearch_I> results;
}