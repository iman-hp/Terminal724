package ir.terminal724.www.terminal724.Public;

import ir.terminal724.www.terminal724.Service.Endpoints;
import ir.terminal724.www.terminal724.Service.Service_Generator;

public class Constants {
    public static String BASE_URL="https://www.bilitja.com/";
    public static Endpoints endpoints=Service_Generator.getRetrofit();
}
