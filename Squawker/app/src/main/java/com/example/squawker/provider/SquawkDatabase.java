package com.example.squawker.provider;

@Database(version = SquawkDatabase.VERSION)
public class SquawkDatabase {

    public static final int VERSION = 4;

    @Table(SquawkContract.class)
    public static final String SQUAWK_MESSAGES = "squawk_messages";

}