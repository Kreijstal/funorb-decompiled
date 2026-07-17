/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends tg {
    private le field_G;
    private int field_N;
    static String field_M;
    static kg field_I;
    static String field_F;
    static int field_K;
    static ld field_L;
    static boolean field_J;

    final static void a(byte param0, long param1, int param2) {
        hg var4 = null;
        int var5 = 0;
        var4 = gk.field_g;
        if (param0 != 74) {
          w.a((byte) -80, -70L, 4);
          var4.g(param2, param0 ^ 66);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(7, -114);
          var4.a((byte) 100, param1);
          var4.b(-var5 + var4.field_l, -1);
          return;
        } else {
          var4.g(param2, param0 ^ 66);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(7, -114);
          var4.a((byte) 100, param1);
          var4.b(-var5 + var4.field_l, -1);
          return;
        }
    }

    final static void a(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(11, 8);
        var2.a(1, -124);
        var2.a(0, -71);
    }

    w(le param0) {
        try {
            ((w) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "w.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_F = null;
        field_M = null;
        field_L = null;
        field_I = null;
    }

    final static boolean a(String param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = re.a("", false, '_', param1);
                var3 = od.b(0, param1);
                if (0 != param0.indexOf(param1)) {
                  break L2;
                } else {
                  if (0 == param0.indexOf(var3)) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("w.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 0 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static mg a(eh param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        mg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var4_int = 0;
            int discarded$7 = 109;
            if (hn.a(param0, param3, param2)) {
              stackOut_3_0 = gn.c((byte) -9);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("w.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -80 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        wl var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg var12 = null;
        mg var13 = null;
        mg var15 = null;
        mg var16 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = ((w) this).field_l + (param1 - -(((w) this).field_g >> 1));
          var6 = ((w) this).field_u + (param2 - -(((w) this).field_m >> 1));
          var8 = ((w) this).field_G.a(-22243);
          if (gd.field_r != var8) {
            if (var8 != te.field_d) {
              if (var8 != ee.field_c) {
                if (bm.field_i == var8) {
                  var13 = bf.field_p[1];
                  var13.e(var5 + -(var13.field_w >> 1), -(var13.field_p >> 1) + var6, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var12 = bf.field_p[2];
                var12.e(-(var12.field_w >> 1) + var5, var6 - (var12.field_p >> 1), 256);
                return;
              }
            } else {
              var16 = bf.field_p[0];
              var9 = var16.field_u << 1;
              var10 = var16.field_z << 1;
              if (null != hh.field_a) {
                if (var9 <= hh.field_a.field_w) {
                  if (hh.field_a.field_p >= var10) {
                    int discarded$8 = 16865;
                    kb.a(hh.field_a);
                    df.c();
                    var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -((w) this).field_N << 10, 4096);
                    ai.a(true);
                    hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                    return;
                  } else {
                    hh.field_a = new mg(var9, var10);
                    int discarded$9 = 16865;
                    kb.a(hh.field_a);
                    var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -((w) this).field_N << 10, 4096);
                    ai.a(true);
                    hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                    return;
                  }
                } else {
                  hh.field_a = new mg(var9, var10);
                  int discarded$10 = 16865;
                  kb.a(hh.field_a);
                  var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -((w) this).field_N << 10, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                  return;
                }
              } else {
                hh.field_a = new mg(var9, var10);
                int discarded$11 = 16865;
                kb.a(hh.field_a);
                var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -((w) this).field_N << 10, 4096);
                ai.a(true);
                hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                return;
              }
            }
          } else {
            var15 = bf.field_p[0];
            var9 = var15.field_u << 1;
            var10 = var15.field_z << 1;
            if (null != hh.field_a) {
              if (var9 <= hh.field_a.field_w) {
                if (hh.field_a.field_p >= var10) {
                  int discarded$12 = 16865;
                  kb.a(hh.field_a);
                  df.c();
                  var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -((w) this).field_N << 10, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                  return;
                } else {
                  hh.field_a = new mg(var9, var10);
                  int discarded$13 = 16865;
                  kb.a(hh.field_a);
                  var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -((w) this).field_N << 10, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                  return;
                }
              } else {
                hh.field_a = new mg(var9, var10);
                int discarded$14 = 16865;
                kb.a(hh.field_a);
                var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -((w) this).field_N << 10, 4096);
                ai.a(true);
                hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                return;
              }
            } else {
              hh.field_a = new mg(var9, var10);
              int discarded$15 = 16865;
              kb.a(hh.field_a);
              var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -((w) this).field_N << 10, 4096);
              ai.a(true);
              hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
              return;
            }
          }
        }
    }

    final String d(int param0) {
        if (param0 < 35) {
            field_L = null;
            if (!(!((w) this).field_p)) {
                return ((w) this).field_G.b(28433);
            }
            return null;
        }
        if (!(!((w) this).field_p)) {
            return ((w) this).field_G.b(28433);
        }
        return null;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        try {
            if (param1 <= 113) {
                w.a((byte) -19, -106L, -21);
            }
            ((w) this).field_N = ((w) this).field_N + 1;
            super.a(param0, 127, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "w.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == -8515) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((w) this).field_N = -119;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("w.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "(1 player wants to join)";
        field_F = "Only show game chat from my friends";
        field_K = 0;
        field_L = new ld();
        field_J = false;
    }
}
