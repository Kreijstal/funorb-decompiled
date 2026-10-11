/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gb {
    static String field_a;
    static cc field_b;
    static cr field_c;
    static int field_d;

    final static er[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 28290) {
          field_d = -33;
        }
        return ui.a(1, 1, param4, param1, param0, 1, 5, param2, 3);
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != -49) {
            stackIn_3_0 = 126;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param2.charAt(var5) == param1) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("gb.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 19199) {
          gb.a(-81, 34, -41, -66, -87);
        }
    }

    final static void a(int param0, fb param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        try {
          if (param7 >= -82) {
            field_a = (String) null;
          }
          jn.a(param4, param5, param1, param0, 256, param2, param3, 10, param6);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "gb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static String a(Throwable param0, boolean param1) throws IOException {
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        dg var14 = null;
        String var2 = null;
        String var11 = null;
        int var13 = Vertigo2.field_L ? 1 : 0;
        String var2Lifetime1;
        String var2Lifetime2;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        if (param0 instanceof dg) {
          var14 = (dg) ((Object) param0);
          var2 = var14.field_e + " | ";
          param0 = var14.field_a;
        } else {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        String var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        if (param1) {
          return (String) null;
        }
        BufferedReader var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        String var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime2 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            break;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (-1 != var9) {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
          } else {
            var11Lifetime5Lifetime2 = var8;
            var2Lifetime2 = var11Lifetime5Lifetime2;
            var2Lifetime2 = var11Lifetime5Lifetime2;
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime2 = var16;
          var2Lifetime2 = var16;
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime2 = var17;
          var2Lifetime2 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf('\t'));
          var2Lifetime2 = var18;
          var2Lifetime2 = var18;
          var19 = var2Lifetime2 + var18;
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          if (var9 != -1 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime2 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime2 = var2Lifetime2 + ' ';
        }
        var2Lifetime2 = var2Lifetime2 + "| " + var7;
        return var2Lifetime2;
    }

    static {
        field_a = "Return to game";
        field_d = 0;
    }
}
