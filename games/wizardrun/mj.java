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
        int var1 = 36 / ((param0 - -19) / 45);
        return oc.field_a;
    }

    final static ib a(String param0, int param1, int param2) {
        ea var3 = null;
        RuntimeException var3_ref = null;
        ib stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_3_0 = null;
        ib stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 == -1) {
              var3 = new ea();
              ((ib) ((Object) var3)).field_a = param0;
              ((ib) ((Object) var3)).field_c = param1;
              stackOut_3_0 = (ea) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ib) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("mj.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ib) ((Object) stackIn_4_0);
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
        String var2 = null;
        PrintWriter var4 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.awt.Component var14 = null;
        eb var15 = null;
        StringWriter var16 = null;
        String var21 = null;
        BufferedReader var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        BufferedReader var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        L0: {
          var13 = wizardrun.field_H;
          if (!(param0 instanceof eb)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var15 = (eb) ((Object) param0);
            param0 = var15.field_c;
            var2 = var15.field_b + " | ";
            break L0;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var16));
        param0.printStackTrace(var4);
        var4.close();
        if (param1 <= -80) {
          var21 = var16.toString();
          var11 = var21;
          var2 = var11;
          var11 = var21;
          var22 = new BufferedReader((Reader) ((Object) new StringReader(var21)));
          var28 = var22.readLine();
          var11 = var28;
          var2 = var11;
          var11 = var28;
          L1: while (true) {
            var23 = var22.readLine();
            var11 = var23;
            var2 = var11;
            var11 = var23;
            if (var23 == null) {
              var2 = var2 + "| " + var28;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var23.indexOf('(');
                var10 = var23.indexOf(')', var9 + 1);
                if (-1 != var9) {
                  var11 = var23.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var23;
                  break L2;
                }
              }
              L3: {
                var24 = var11.trim();
                var2 = var24;
                var2 = var24;
                var25 = var24.substring(var24.lastIndexOf(' ') + 1);
                var2 = var25;
                var2 = var25;
                var26 = var25.substring(1 + var25.lastIndexOf('\t'));
                var2 = var26;
                var2 = var26;
                var27 = var2 + var26;
                var2 = var27;
                var2 = var27;
                var2 = var27;
                if (-1 == var9) {
                  break L3;
                } else {
                  if (0 != (var10 ^ -1)) {
                    var12 = var23.indexOf(".java:", var9);
                    if (-1 < (var12 ^ -1)) {
                      break L3;
                    } else {
                      var2 = var27 + var23.substring(5 + var12, var10);
                      break L3;
                    }
                  } else {
                    var2 = var2 + ' ';
                    continue L1;
                  }
                }
              }
              var2 = var2 + ' ';
              continue L1;
            }
          }
        } else {
          var14 = (java.awt.Component) null;
          mj.a((java.awt.Component) null, (byte) -41);
          var29 = var16.toString();
          var11 = var29;
          var2 = var11;
          var11 = var29;
          var30 = new BufferedReader((Reader) ((Object) new StringReader(var29)));
          var6 = var30;
          var36 = var30.readLine();
          var11 = var36;
          var2 = var11;
          var11 = var36;
          var7 = var36;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var31 = var30.readLine();
            var11 = var31;
            var2 = var11;
            var11 = var31;
            if (var31 == null) {
              var2 = var2 + "| " + var36;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var31.indexOf('(');
                var10 = var31.indexOf(')', var9 + 1);
                if (-1 != var9) {
                  var11 = var31.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var31;
                  break L5;
                }
              }
              L6: {
                var32 = var11.trim();
                var2 = var32;
                var2 = var32;
                var33 = var32.substring(var32.lastIndexOf(' ') + 1);
                var2 = var33;
                var2 = var33;
                var34 = var33.substring(1 + var33.lastIndexOf('\t'));
                var2 = var34;
                var2 = var34;
                var35 = var2 + var34;
                var2 = var35;
                var2 = var35;
                var2 = var35;
                if (-1 == var9) {
                  break L6;
                } else {
                  if (0 != (var10 ^ -1)) {
                    var12 = var31.indexOf(".java:", var9);
                    if (-1 < (var12 ^ -1)) {
                      break L6;
                    } else {
                      var2 = var35 + var31.substring(5 + var12, var10);
                      break L6;
                    }
                  } else {
                    var2 = var2 + ' ';
                    continue L4;
                  }
                }
              }
              var2 = var2 + ' ';
              continue L4;
            }
          }
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
