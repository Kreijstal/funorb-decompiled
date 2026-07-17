/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends fa {
    static boolean field_m;
    int field_p;
    static String field_l;
    fa field_k;
    static ak field_o;
    pp field_n;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (param0.length() <= var3) {
                var4 = 125 / ((param1 - -52) / 59);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (var2_int == param0.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("cm.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (ni.field_q + -640) / 2;
        var3 = qh.field_c * qh.field_c;
        var4 = -(param0 * param0) + var3;
        if (param1 != 4740) {
          return;
        } else {
          ff.field_h.a(90, -124 + (t.field_d + -90), -(var4 * 199 / var3) + var2, 256, 199);
          ai.field_A.a(0, t.field_d - 124, var4 * 438 / var3 + (var2 + 202), 256, 438);
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var4 = -77 % ((param1 - 28) / 58);
        int var3 = param2 >>> 31;
        return (param2 - -var3) / param0 + -var3;
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param0;
        if (var2 != 0) {
          if (128 <= var2) {
            if (160 <= var2) {
              return (char)var2;
            } else {
              L0: {
                var3 = jg.field_I[-128 + var2];
                if (0 != var3) {
                  break L0;
                } else {
                  var3 = 63;
                  break L0;
                }
              }
              var2 = var3;
              return (char)var2;
            }
          } else {
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        field_l = null;
        field_o = null;
    }

    final static void a(int param0, boolean param1, long param2, String param3, int param4, int param5) {
        int var8 = 0;
        try {
            int var7_int = -86 % ((-33 - param0) / 49);
            aa.field_f.g(param5, 15514);
            aa.field_f.field_m = aa.field_f.field_m + 1;
            var8 = aa.field_f.field_m;
            aa.field_f.a(false, param2);
            aa.field_f.b((byte) -41, param3);
            aa.field_f.e(160, param4);
            aa.field_f.e(160, param1 ? 1 : 0);
            aa.field_f.f(aa.field_f.field_m + -var8, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "cm.G(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 < -84) {
            break L0;
          } else {
            var3 = null;
            cm.a(-64, true, 36L, (String) null, -110, -88);
            break L0;
          }
        }
        var1 = (Object) (Object) fj.field_c;
        synchronized (var1) {
          L1: {
            oi.field_c = oi.field_c + 1;
            ef.field_b = jm.field_o;
            uf.field_d = u.field_b;
            bg.field_k = ra.field_d;
            im.field_Jb = u.field_j;
            u.field_j = false;
            nm.field_c = tl.field_a;
            uo.field_a = c.field_X;
            ji.field_c = fa.field_j;
            tl.field_a = 0;
            break L1;
          }
        }
    }

    cm(pp param0, fa param1) {
        try {
            ((cm) this).field_n = param0;
            ((cm) this).field_p = param0.e();
            ((cm) this).field_k = param1;
            ((cm) this).field_n.h(128 + ia.field_h * ((cm) this).field_p >> 8);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "cm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
        field_l = "Instructions";
    }
}
