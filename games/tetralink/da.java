/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class da {
    static String field_h;
    static String field_i;
    static int[] field_d;
    static String field_a;
    static int[] field_g;
    static int field_e;
    static String field_c;
    static int[][] field_b;
    static hl field_f;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 <= -8) {
          field_g = null;
          field_i = null;
          field_b = (int[][]) null;
          field_h = null;
          field_d = null;
          return;
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        cn var14_ref = null;
        String var11 = null;
        StringWriter var15 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        Object var14 = null;
        int var13 = TetraLink.field_J;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        cn var14_refLifetime1;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        StringWriter var15Lifetime1;
        PrintWriter var4Lifetime1;
        String var5Lifetime1;
        BufferedReader var6Lifetime1;
        String var7Lifetime1;
        String var8Lifetime1;
        String var16Lifetime1;
        String var17Lifetime1;
        String var18Lifetime1;
        String var19Lifetime1;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime7;
        String var11Lifetime8;
        String var11Lifetime9;
        String var11Lifetime10;
        String var11Lifetime11;
        String var11Lifetime1Lifetime1;
        String var11Lifetime6Lifetime1;
        String var11Lifetime6Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        if (param0 == 118) {
          if (!(param1 instanceof cn)) {
            var2 = "";
          } else {
            var14_ref = (cn) ((Object) param1);
            param1 = var14_ref.field_a;
            var2 = var14_ref.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
          }
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var15));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var11Lifetime7 = var5;
          var2Lifetime4 = var11Lifetime7;
          var11Lifetime8 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var11Lifetime9 = var7;
          var2Lifetime5 = var11Lifetime9;
          var11Lifetime10 = var7;
          while (true) {
            var8 = var6.readLine();
            var11Lifetime11 = var8;
            var2Lifetime5 = var11Lifetime11;
            var11Lifetime11 = var8;
            if (var8 == null) {
              break;
            }
            var9 = var8.indexOf('(');
            var10 = var8.indexOf(')', 1 + var9);
            if (-1 == var9) {
              var11Lifetime11 = var8;
            } else {
              var11Lifetime11 = var8.substring(0, var9);
              var2Lifetime5 = var11Lifetime11;
              var2Lifetime5 = var11Lifetime11;
            }
            var16 = var11Lifetime11.trim();
            var2Lifetime5 = var16;
            var2Lifetime5 = var16;
            var17 = var16.substring(1 + var16.lastIndexOf(' '));
            var2Lifetime5 = var17;
            var2Lifetime5 = var17;
            var18 = var17.substring(1 + var17.lastIndexOf('\t'));
            var2Lifetime5 = var18;
            var2Lifetime5 = var18;
            var19 = var2Lifetime5 + var18;
            var2Lifetime5 = var19;
            var2Lifetime5 = var19;
            var2Lifetime5 = var19;
            if (-1 != var9 &&
              var10 != -1) {
              var12 = var8.indexOf(".java:", var9);
              if (0 <= var12) {
                var2Lifetime5 = var19 + var8.substring(5 + var12, var10);
              }
            }
            var2Lifetime5 = var2Lifetime5 + ' ';
          }
          var2Lifetime5 = var2Lifetime5 + "| " + var7;
          return var2Lifetime5;
        }
        field_h = (String) null;
        if (!(param1 instanceof cn)) {
          var2Lifetime1 = "";
        } else {
          var14_refLifetime1 = (cn) ((Object) param1);
          param1 = var14_refLifetime1.field_a;
          var2Lifetime1 = var14_refLifetime1.field_d + " | ";
          var11Lifetime1 = var2Lifetime1;
          var2Lifetime1 = var11Lifetime1;
          var11Lifetime1Lifetime1 = var2Lifetime1;
        }
        var15Lifetime1 = new StringWriter();
        var4Lifetime1 = new PrintWriter((Writer) ((Object) var15Lifetime1));
        param1.printStackTrace(var4Lifetime1);
        var4Lifetime1.close();
        var5Lifetime1 = var15Lifetime1.toString();
        var11Lifetime2 = var5Lifetime1;
        var2Lifetime2 = var11Lifetime2;
        var11Lifetime3 = var5Lifetime1;
        var6Lifetime1 = new BufferedReader((Reader) ((Object) new StringReader(var5Lifetime1)));
        var7Lifetime1 = var6Lifetime1.readLine();
        var11Lifetime4 = var7Lifetime1;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var7Lifetime1;
        while (true) {
          var8Lifetime1 = var6Lifetime1.readLine();
          var11Lifetime6 = var8Lifetime1;
          var2Lifetime3 = var11Lifetime6;
          var11Lifetime6Lifetime1 = var8Lifetime1;
          if (var8Lifetime1 == null) {
            break;
          }
          var9Lifetime1 = var8Lifetime1.indexOf('(');
          var10Lifetime1 = var8Lifetime1.indexOf(')', 1 + var9Lifetime1);
          if (-1 == var9Lifetime1) {
            var11Lifetime6Lifetime2 = var8Lifetime1;
          } else {
            var11Lifetime6Lifetime2 = var8Lifetime1.substring(0, var9Lifetime1);
            var2Lifetime3 = var11Lifetime6Lifetime2;
            var2Lifetime3 = var11Lifetime6Lifetime2;
          }
          var16Lifetime1 = var11Lifetime6Lifetime2.trim();
          var2Lifetime3 = var16Lifetime1;
          var2Lifetime3 = var16Lifetime1;
          var17Lifetime1 = var16Lifetime1.substring(1 + var16Lifetime1.lastIndexOf(' '));
          var2Lifetime3 = var17Lifetime1;
          var2Lifetime3 = var17Lifetime1;
          var18Lifetime1 = var17Lifetime1.substring(1 + var17Lifetime1.lastIndexOf('\t'));
          var2Lifetime3 = var18Lifetime1;
          var2Lifetime3 = var18Lifetime1;
          var19Lifetime1 = var2Lifetime3 + var18Lifetime1;
          var2Lifetime3 = var19Lifetime1;
          var2Lifetime3 = var19Lifetime1;
          var2Lifetime3 = var19Lifetime1;
          if (-1 != var9Lifetime1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var8Lifetime1.indexOf(".java:", var9Lifetime1);
            if (0 <= var12Lifetime1) {
              var2Lifetime3 = var19Lifetime1 + var8Lifetime1.substring(5 + var12Lifetime1, var10Lifetime1);
            }
          }
          var2Lifetime3 = var2Lifetime3 + ' ';
        }
        var2Lifetime3 = var2Lifetime3 + "| " + var7Lifetime1;
        return var2Lifetime3;
    }

    final static boolean a(ah param0, ah param1, int param2, ah param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.c(100)) {
            return false;
          }
          if (!param0.a("commonui", (byte) -124)) {
            return false;
          }
          var4_int = 51 / ((param2 - 43) / 40);
          if (param1.c(113) &&
            param1.a("commonui", (byte) -122)) {
            if (param3.c(102) &&
              param3.a("button.gif", (byte) -102)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("da.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, ve param2, int param3, int param4, ve param5) {
        try {
          if (param3 >= -100) {
            da.a(64);
          }
          aa.field_Wb = param5;
          cd.field_e = param0;
          ao.field_a = param1;
          bn.field_b = param2;
          hc.field_q = param4;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "da.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          me.a((java.awt.Component) ((Object) param1), 250);
          sd.a((java.awt.Component) ((Object) param1), 33);
          if (null != qf.field_k) {
            qf.field_k.b(-115, (java.awt.Component) ((Object) param1));
          }
          if (param0 < -55) {
            return;
          }
          field_i = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("da.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_d = new int[8192];
        field_h = "Report abuse";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Please try changing the following settings:  ";
    }
}
