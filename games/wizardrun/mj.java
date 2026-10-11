/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mj {
    static String field_d;
    static o field_b;
    static boolean field_c;
    static int[] field_a;

    final static int a(byte param0) {
        int var1 = 36 / ((param0 + 19) / 45);
        return oc.field_a;
    }

    final static ib a(String param0, int param1, int param2) {
        ea var3 = null;
        RuntimeException var3_ref = null;
        ib stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            stackIn_2_0 = (ib) null;
            return stackIn_2_0;
          }
          var3 = new ea();
          ((ib) ((Object) var3)).field_a = param0;
          ((ib) ((Object) var3)).field_c = param1;
          stackIn_4_0 = var3;
          return (ib) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("mj.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeKeyListener(ff.field_H);
          if (param1 <= 91) {
            field_c = true;
          }
          param0.removeFocusListener(ff.field_H);
          wk.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "mj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        int var9;
        int var10;
        String var11;
        int var13;
        java.awt.Component var14;
        eb var15;
        StringWriter var16;
        String var21;
        BufferedReader var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        BufferedReader var6;
        String var7;
        int var12;
        String var29;
        BufferedReader var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var36;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
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
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var2Lifetime5Lifetime1;
        String var2Lifetime5Lifetime2;
        String var2Lifetime5Lifetime3;
        String var2Lifetime5Lifetime4;
        String var2Lifetime5Lifetime5;
        String var2Lifetime5Lifetime6;
        String var2Lifetime5Lifetime7;
        String var2Lifetime5Lifetime8;
        String var2Lifetime5Lifetime9;
        String var2Lifetime5Lifetime10;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime1Lifetime3;
        String var11Lifetime1Lifetime4;
        String var11Lifetime8Lifetime1;
        String var11Lifetime8Lifetime2;
        String var11Lifetime8Lifetime3;
        var13 = wizardrun.field_H;
        if (!(param0 instanceof eb)) {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime9 = var2;
        } else {
          var15 = (eb) ((Object) param0);
          param0 = var15.field_c;
          var2 = var15.field_b + " | ";
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var16));
        param0.printStackTrace(var4);
        var4.close();
        if (param1 <= -80) {
          var21 = var16.toString();
          var11Lifetime1 = var21;
          var2Lifetime1 = var11Lifetime1;
          var11Lifetime1Lifetime1 = var21;
          var22 = new BufferedReader((Reader) ((Object) new StringReader(var21)));
          var28 = var22.readLine();
          var11Lifetime1Lifetime2 = var28;
          var2Lifetime1Lifetime1 = var11Lifetime1Lifetime2;
          var11Lifetime1Lifetime3 = var28;
          while (true) {
            var23 = var22.readLine();
            var11Lifetime1Lifetime4 = var23;
            var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
            var11Lifetime1Lifetime4 = var23;
            if (var23 == null) {
              var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + "| " + var28;
              var11Lifetime1Lifetime4 = var2Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
              var11Lifetime1Lifetime4 = var2Lifetime1Lifetime2;
              return var2Lifetime1Lifetime2;
            }
            var9 = var23.indexOf('(');
            var10 = var23.indexOf(')', var9 + 1);
            if (-1 != var9) {
              var11Lifetime1Lifetime4 = var23.substring(0, var9);
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime4;
            } else {
              var11Lifetime1Lifetime4 = var23;
            }
            var24 = var11Lifetime1Lifetime4.trim();
            var2Lifetime1Lifetime2 = var24;
            var2Lifetime1Lifetime2 = var24;
            var25 = var24.substring(var24.lastIndexOf(' ') + 1);
            var2Lifetime1Lifetime2 = var25;
            var2Lifetime1Lifetime2 = var25;
            var26 = var25.substring(1 + var25.lastIndexOf('\t'));
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            var27 = var2Lifetime1Lifetime2 + var26;
            var2Lifetime1Lifetime2 = var27;
            var2Lifetime1Lifetime2 = var27;
            var2Lifetime1Lifetime2 = var27;
            if (-1 != var9) {
              if (var10 == -1) {
                var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + ' ';
                continue;
              }
              var12 = var23.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime2 = var27 + var23.substring(5 + var12, var10);
              }
            }
            var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + ' ';
          }
        }
        var14 = (java.awt.Component) null;
        mj.a((java.awt.Component) null, (byte) -41);
        var29 = var16.toString();
        var11Lifetime2 = var29;
        var2Lifetime2 = var11Lifetime2;
        var11Lifetime3 = var29;
        var30 = new BufferedReader((Reader) ((Object) new StringReader(var29)));
        var6 = var30;
        var36 = var30.readLine();
        var11Lifetime4 = var36;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var36;
        var7 = var36;
        var11Lifetime6 = var7;
        var2Lifetime4 = var11Lifetime6;
        var11Lifetime7 = var7;
        while (true) {
          var31 = var30.readLine();
          var11Lifetime8 = var31;
          var2Lifetime5 = var11Lifetime8;
          var11Lifetime8Lifetime1 = var31;
          if (var31 == null) {
            var2Lifetime5 = var2Lifetime5 + "| " + var36;
            var11Lifetime8Lifetime2 = var2Lifetime5;
            var2Lifetime5 = var11Lifetime8Lifetime2;
            var11Lifetime8Lifetime2 = var2Lifetime5;
            return var2Lifetime5;
          }
          var9Lifetime1 = var31.indexOf('(');
          var10Lifetime1 = var31.indexOf(')', var9Lifetime1 + 1);
          if (-1 != var9Lifetime1) {
            var11Lifetime8Lifetime3 = var31.substring(0, var9Lifetime1);
            var2Lifetime5Lifetime1 = var11Lifetime8Lifetime3;
            var2Lifetime5Lifetime1 = var11Lifetime8Lifetime3;
          } else {
            var11Lifetime8Lifetime3 = var31;
          }
          var32 = var11Lifetime8Lifetime3.trim();
          var2Lifetime5Lifetime2 = var32;
          var2Lifetime5Lifetime3 = var32;
          var33 = var32.substring(var32.lastIndexOf(' ') + 1);
          var2Lifetime5Lifetime4 = var33;
          var2Lifetime5Lifetime5 = var33;
          var34 = var33.substring(1 + var33.lastIndexOf('\t'));
          var2Lifetime5Lifetime6 = var34;
          var2Lifetime5Lifetime7 = var34;
          var35 = var2Lifetime5Lifetime7 + var34;
          var2Lifetime5Lifetime8 = var35;
          var2Lifetime5Lifetime9 = var35;
          var2Lifetime5Lifetime10 = var35;
          if (-1 != var9Lifetime1) {
            if (var10Lifetime1 == -1) {
              var2Lifetime5Lifetime10 = var2Lifetime5Lifetime10 + ' ';
              continue;
            }
            var12Lifetime1 = var31.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime5Lifetime10 = var35 + var31.substring(5 + var12Lifetime1, var10Lifetime1);
            }
          }
          var2Lifetime5Lifetime10 = var2Lifetime5Lifetime10 + ' ';
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 13214) {
          field_b = (o) null;
        }
    }

    static {
        field_d = "Loading fonts";
    }
}
