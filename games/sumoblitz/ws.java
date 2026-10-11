/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ws {
    static int field_b;
    static String field_a;

    final static int a(io param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 116) {
            field_b = -70;
          }
          if (param0 == io.field_i) {
            stackIn_25_0 = 5120;
            return stackIn_25_0;
          }
          if (param0 == io.field_f) {
            stackIn_5_0 = 5122;
            return stackIn_5_0;
          }
          if (io.field_c == param0) {
            stackIn_8_0 = 5124;
            return stackIn_8_0;
          }
          if (param0 == io.field_g) {
            stackIn_11_0 = 5121;
            return stackIn_11_0;
          }
          if (param0 == io.field_k) {
            stackIn_23_0 = 5123;
            return stackIn_23_0;
          }
          if (param0 == io.field_h) {
            stackIn_15_0 = 5125;
            return stackIn_15_0;
          }
          if (param0 == io.field_e) {
            stackIn_21_0 = 5131;
            return stackIn_21_0;
          }
          if (param0 != io.field_d) {
            throw new IllegalArgumentException("");
          }
          stackIn_19_0 = 5126;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("ws.B(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 52) {
          field_a = (String) null;
          return is.field_b;
        }
        return is.field_b;
    }

    public static void a(byte param0) {
        if (param0 != -71) {
          field_b = -48;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        su var14 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        String var2 = null;
        String var11 = null;
        int var13 = Sumoblitz.field_L ? 1 : 0;
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
        if (!(param1 instanceof su)) {
          var2 = "";
        } else {
          var14 = (su) ((Object) param1);
          var2 = var14.field_a + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
          param1 = var14.field_b;
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        String var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
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
          var10 = var8.indexOf(')', var9 + 1);
          if (var9 != -1) {
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
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime2 = var18;
          var2Lifetime2 = var18;
          var19 = var2Lifetime2 + var18;
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          var2Lifetime2 = var19;
          if (var9 != -1 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (0 <= var12) {
              var2Lifetime2 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime2 = var2Lifetime2 + ' ';
        }
        var2Lifetime2 = var2Lifetime2 + "| " + var7;
        if (param0 == 71) {
          return var2Lifetime2;
        }
        return (String) null;
    }

    static {
        field_a = "to keep fullscreen or";
    }
}
