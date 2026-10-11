/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eva extends rqa {
    static gl field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
          field_o = (gl) null;
        }
    }

    final static String a(boolean param0, Throwable param1) throws IOException {
        hva var14 = null;
        StringWriter var21 = null;
        PrintWriter var20 = null;
        String var22 = null;
        BufferedReader var23 = null;
        String var29 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var2 = null;
        String var11 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = VoidHunters.field_G;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime7;
        String var11Lifetime8;
        String var11Lifetime9;
        String var11Lifetime10;
        String var11Lifetime11;
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime1Lifetime3;
        String var11Lifetime1Lifetime4;
        String var11Lifetime1Lifetime5;
        String var11Lifetime1Lifetime6;
        String var11Lifetime8Lifetime1;
        String var11Lifetime8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        if (!(param1 instanceof hva)) {
          var2 = "";
        } else {
          var14 = (hva) ((Object) param1);
          param1 = var14.field_b;
          var2 = var14.field_a + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime11 = var2;
        }
        if (!param0) {
          field_o = (gl) null;
        } else {
          var21 = new StringWriter();
          var20 = new PrintWriter((Writer) ((Object) var21));
          param1.printStackTrace(var20);
          var20.close();
          var22 = var21.toString();
          var11Lifetime1 = var22;
          var2Lifetime1 = var11Lifetime1;
          var11Lifetime1Lifetime1 = var22;
          var23 = new BufferedReader((Reader) ((Object) new StringReader(var22)));
          var29 = var23.readLine();
          var11Lifetime1Lifetime2 = var29;
          var2Lifetime1Lifetime1 = var11Lifetime1Lifetime2;
          var11Lifetime1Lifetime3 = var29;
          while (true) {
            var24 = var23.readLine();
            var11Lifetime1Lifetime4 = var24;
            var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            var11Lifetime1Lifetime4 = var24;
            if (var24 == null) {
              break;
            }
            var9 = var24.indexOf('(');
            var10 = var24.indexOf(')', 1 + var9);
            if (var9 == -1) {
              var11Lifetime1Lifetime4 = var24;
            } else {
              var11Lifetime1Lifetime4 = var24.substring(0, var9);
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            }
            var25 = var11Lifetime1Lifetime4.trim();
            var2Lifetime1Lifetime1 = var25;
            var2Lifetime1Lifetime1 = var25;
            var26 = var25.substring(var25.lastIndexOf(' ') + 1);
            var2Lifetime1Lifetime1 = var26;
            var2Lifetime1Lifetime1 = var26;
            var27 = var26.substring(var26.lastIndexOf('\t') + 1);
            var2Lifetime1Lifetime1 = var27;
            var2Lifetime1Lifetime1 = var27;
            var28 = var2Lifetime1Lifetime1 + var27;
            var2Lifetime1Lifetime1 = var28;
            var2Lifetime1Lifetime1 = var28;
            var2Lifetime1Lifetime1 = var28;
            if (var9 != -1 &&
              var10 != -1) {
              var12 = var24.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime1 = var28 + var24.substring(var12 + 5, var10);
              }
            }
            var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + ' ';
          }
          var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + "| " + var29;
          var11Lifetime1Lifetime5 = var2Lifetime1Lifetime1;
          var2Lifetime1Lifetime2 = var11Lifetime1Lifetime5;
          var11Lifetime1Lifetime6 = var2Lifetime1Lifetime2;
          return var2Lifetime1Lifetime2;
        }
        StringWriter var31 = new StringWriter();
        PrintWriter var30 = new PrintWriter((Writer) ((Object) var31));
        param1.printStackTrace(var30);
        var30.close();
        String var32 = var31.toString();
        var11Lifetime2 = var32;
        var2Lifetime2 = var11Lifetime2;
        var11Lifetime3 = var32;
        BufferedReader var33 = new BufferedReader((Reader) ((Object) new StringReader(var32)));
        BufferedReader var6 = var33;
        String var39 = var33.readLine();
        var11Lifetime4 = var39;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var39;
        String var7 = var39;
        var11Lifetime6 = var7;
        var2Lifetime4 = var11Lifetime6;
        var11Lifetime7 = var7;
        while (true) {
          var34 = var33.readLine();
          var11Lifetime8 = var34;
          var2Lifetime4 = var11Lifetime8;
          var11Lifetime8Lifetime1 = var34;
          if (var34 == null) {
            break;
          }
          var9Lifetime1 = var34.indexOf('(');
          var10Lifetime1 = var34.indexOf(')', 1 + var9Lifetime1);
          if (var9Lifetime1 == -1) {
            var11Lifetime8Lifetime2 = var34;
          } else {
            var11Lifetime8Lifetime2 = var34.substring(0, var9Lifetime1);
            var2Lifetime4 = var11Lifetime8Lifetime2;
            var2Lifetime4 = var11Lifetime8Lifetime2;
          }
          var35 = var11Lifetime8Lifetime2.trim();
          var2Lifetime4 = var35;
          var2Lifetime4 = var35;
          var36 = var35.substring(var35.lastIndexOf(' ') + 1);
          var2Lifetime4 = var36;
          var2Lifetime4 = var36;
          var37 = var36.substring(var36.lastIndexOf('\t') + 1);
          var2Lifetime4 = var37;
          var2Lifetime4 = var37;
          var38 = var2Lifetime4 + var37;
          var2Lifetime4 = var38;
          var2Lifetime4 = var38;
          var2Lifetime4 = var38;
          if (var9Lifetime1 != -1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var34.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime4 = var38 + var34.substring(var12Lifetime1 + 5, var10Lifetime1);
            }
          }
          var2Lifetime4 = var2Lifetime4 + ' ';
        }
        var2Lifetime4 = var2Lifetime4 + "| " + var39;
        var11Lifetime9 = var2Lifetime4;
        var2Lifetime5 = var11Lifetime9;
        var11Lifetime10 = var2Lifetime5;
        return var2Lifetime5;
    }

    eva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            eva.a(-113);
          }
          stackIn_3_0 = new nc(frb.a(146, 124));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eva.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(br param0, int param1, int param2) {
        faa var3 = null;
        try {
          var3 = dpa.field_p;
          int var4 = -115 / ((param1 - 64) / 46);
          var3.h(24335, param2);
          var3.c(0, 2);
          var3.c(0, 0);
          var3.c(0, param0.field_e);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eva.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = new gl(5);
    }
}
