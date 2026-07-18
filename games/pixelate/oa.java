/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa extends hn implements hi, mb {
    static int field_j;
    static String field_h;
    kb field_g;
    static boolean field_i;

    public final void a(int param0, c param1) {
        try {
            int var3_int = -49 / ((-30 - param0) / 60);
            ((oa) this).b(2048);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "oa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b() {
        field_h = null;
    }

    final static String a(Throwable param0) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        qa var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Pixelate.field_H ? 1 : 0;
          if (param0 instanceof qa) {
            var14 = (qa) (Object) param0;
            param0 = var14.field_c;
            var2 = var14.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8_ref_String = var6.readLine();
          var11 = var8_ref_String;
          var2 = var11;
          var11 = var8_ref_String;
          if (var8_ref_String == null) {
            var8 = 0;
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var9 = var8_ref_String.indexOf('(');
              var10 = var8_ref_String.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8_ref_String;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8_ref_String.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == 0) {
                  break L3;
                } else {
                  var12 = var8_ref_String.indexOf(".java:", var9);
                  if (-1 <= var12) {
                    var2 = var19 + var8_ref_String.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        return (-param0 & param0) == param0;
    }

    final dj a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dj stackIn_3_0 = null;
        dj stackIn_7_0 = null;
        dj stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        dj stackOut_2_0 = null;
        dj stackOut_6_0 = null;
        dj stackOut_9_0 = null;
        try {
          L0: {
            var2_int = ((oa) this).field_g.e((byte) 90);
            var3 = ((oa) this).field_g.l(25);
            var4 = ((oa) this).field_g.c(param0);
            var5 = wa.b(-80);
            if (1890 > var4) {
              stackOut_2_0 = sk.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (-3 + var5 < var4) {
                stackOut_6_0 = sk.field_a;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (dq.a(var2_int, var3, -2, var4)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_9_0 = sk.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return sk.field_a;
        }
        if (decompiledRegionSelector0 == 0) {
          return qk.field_g;
        } else {
          return stackIn_10_0;
        }
    }

    public final void a(c param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                ((oa) this).field_g = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oa.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -22265) {
            field_i = false;
            return ((oa) this).field_g.m(-1);
        }
        return ((oa) this).field_g.m(-1);
    }

    final String c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((oa) this).field_g.e((byte) -84);
              var3 = ((oa) this).field_g.l(25);
              var4 = ((oa) this).field_g.c(true);
              var5 = wa.b(-127);
              if (var4 < 1890) {
                break L1;
              } else {
                if (var5 - 3 < var4) {
                  break L1;
                } else {
                  if (!dq.a(var2_int, var3, param0 + param0, var4)) {
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            stackOut_3_0 = sd.a(kd.field_d, 120, new String[2]);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        return ue.field_p;
    }

    public oa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
