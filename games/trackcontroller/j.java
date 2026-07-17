/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j {
    static qj[] field_b;
    static int field_a;
    private boolean field_g;
    static int[] field_f;
    static kk field_h;
    private String field_e;
    static String field_d;
    private boolean field_i;
    static int field_c;

    final boolean b(byte param0) {
        if (param0 < 73) {
            return false;
        }
        return ((j) this).field_g;
    }

    final boolean c(byte param0) {
        if (param0 > -71) {
            return true;
        }
        return ((j) this).field_i;
    }

    final String a(byte param0) {
        if (param0 != 63) {
            return null;
        }
        return ((j) this).field_e;
    }

    final static String a(boolean param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        nl var14 = null;
        StringWriter var15 = null;
        String var20 = null;
        BufferedReader var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        BufferedReader var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        L0: {
          var13 = TrackController.field_F ? 1 : 0;
          if (!(param1 instanceof nl)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (nl) (Object) param1;
            var2 = var14.field_a + " | ";
            param1 = var14.field_d;
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        if (!param0) {
          var20 = var15.toString();
          var11 = var20;
          var2 = var11;
          var11 = var20;
          var21 = new BufferedReader((Reader) (Object) new StringReader(var20));
          var27 = var21.readLine();
          var11 = var27;
          var2 = var11;
          var11 = var27;
          L1: while (true) {
            var22 = var21.readLine();
            var11 = var22;
            var2 = var11;
            var11 = var22;
            if (var22 == null) {
              var2 = var2 + "| " + var27;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var22.indexOf('(');
                var10 = var22.indexOf(')', 1 + var9);
                if (-1 != var9) {
                  var11 = var22.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var22;
                  break L2;
                }
              }
              L3: {
                var23 = var11.trim();
                var2 = var23;
                var2 = var23;
                var24 = var23.substring(var23.lastIndexOf(' ') + 1);
                var2 = var24;
                var2 = var24;
                var25 = var24.substring(1 + var24.lastIndexOf('\t'));
                var2 = var25;
                var2 = var25;
                var26 = var2 + var25;
                var2 = var26;
                var2 = var26;
                if (var9 == -1) {
                  break L3;
                } else {
                  if (var10 != -1) {
                    var12 = var22.indexOf(".java:", var9);
                    if (0 <= var12) {
                      var2 = var26 + var22.substring(var12 - -5, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var2 = var2 + 32;
                    continue L1;
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            }
          }
        } else {
          field_a = 20;
          var28 = var15.toString();
          var11 = var28;
          var2 = var11;
          var11 = var28;
          var29 = new BufferedReader((Reader) (Object) new StringReader(var28));
          var6 = var29;
          var35 = var29.readLine();
          var11 = var35;
          var2 = var11;
          var11 = var35;
          var7 = var35;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var30 = var29.readLine();
            var11 = var30;
            var2 = var11;
            var11 = var30;
            if (var30 == null) {
              var2 = var2 + "| " + var35;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var30.indexOf('(');
                var10 = var30.indexOf(')', 1 + var9);
                if (-1 != var9) {
                  var11 = var30.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var30;
                  break L5;
                }
              }
              L6: {
                var31 = var11.trim();
                var2 = var31;
                var2 = var31;
                var32 = var31.substring(var31.lastIndexOf(' ') + 1);
                var2 = var32;
                var2 = var32;
                var33 = var32.substring(1 + var32.lastIndexOf('\t'));
                var2 = var33;
                var2 = var33;
                var34 = var2 + var33;
                var2 = var34;
                var2 = var34;
                if (var9 == -1) {
                  break L6;
                } else {
                  if (var10 != -1) {
                    var12 = var30.indexOf(".java:", var9);
                    if (0 <= var12) {
                      var2 = var34 + var30.substring(var12 - -5, var10);
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    var2 = var2 + 32;
                    continue L4;
                  }
                }
              }
              var2 = var2 + 32;
              continue L4;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        ((j) this).field_i = param0 ? true : false;
        ((j) this).field_g = param1 ? true : false;
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) cj.field_o);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) cj.field_o);
            mg.field_f = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("j.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 103 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_h = null;
    }

    j(String param0) {
        ((j) this).field_g = false;
        ((j) this).field_i = false;
        try {
            ((j) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "j.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "More suggestions";
        field_c = -1;
    }
}
