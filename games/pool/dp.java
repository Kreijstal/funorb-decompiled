/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp implements in {
    static String field_h;
    static int[] field_e;
    private dh[] field_f;
    static char[] field_d;
    static int field_l;
    static int[] field_k;
    private ko field_a;
    static vh field_c;
    private int field_j;
    private int field_b;
    private int field_g;
    private di field_i;

    public final int[] a(boolean param0, int param1, float param2) {
        dh var8 = null;
        dh var7 = ((dp) this).field_f[param1];
        dh var6 = var7;
        var6 = var7;
        if (!param0) {
            return null;
        }
        if (var7 == null) {
            return null;
        }
        if (!(null == var7.field_r)) {
            if (!(param2 != var7.field_p)) {
                ((dp) this).field_a.a((byte) -84, (ma) (Object) var7);
                return var7.field_r;
            }
            var7.a((byte) -117);
            var7.a();
            ((dp) this).field_j = ((dp) this).field_j + 1;
        }
        if (!(!var7.a(param2, ((dp) this).field_b, ((dp) this).field_i))) {
            if (0 == ((dp) this).field_j) {
                var8 = (dh) (Object) ((dp) this).field_a.b(-1);
                var8.a();
                ((dp) this).field_a.a((byte) -84, (ma) (Object) var7);
                return var7.field_r;
            }
            ((dp) this).field_j = ((dp) this).field_j - 1;
            ((dp) this).field_a.a((byte) -84, (ma) (Object) var7);
            return var7.field_r;
        }
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param3 > param2) {
            if (param1 <= param3) {
                if (param1 <= param2) {
                    ol.a(qh.field_d, param5, param4, param2, param7, param1, param3, param0, 19547);
                    if (param6 == 108) {
                        return;
                    }
                    int discarded$0 = dp.a(-1);
                    return;
                }
                ol.a(qh.field_d, param5, param7, param1, param4, param2, param3, param0, 19547);
                if (param6 == 108) {
                    return;
                }
                int discarded$1 = dp.a(-1);
                return;
            }
            ol.a(qh.field_d, param5, param7, param3, param0, param2, param1, param4, 19547);
            if (param6 != 108) {
                int discarded$2 = dp.a(-1);
                return;
            }
            return;
        }
        if (param1 > param2) {
            ol.a(qh.field_d, param5, param0, param2, param7, param3, param1, param4, param6 + 19439);
            if (param6 != 108) {
                int discarded$3 = dp.a(-1);
                return;
            }
            return;
        }
        if (param1 <= param3) {
            ol.a(qh.field_d, param5, param4, param3, param0, param1, param2, param7, 19547);
            if (param6 != 108) {
                int discarded$4 = dp.a(-1);
                return;
            }
            return;
        }
        ol.a(qh.field_d, param5, param0, param1, param4, param3, param2, param7, param6 + 19439);
        if (param6 != 108) {
            int discarded$5 = dp.a(-1);
            return;
        }
    }

    final static int a(int param0) {
        if (param0 != 104) {
            Object var2 = null;
            dp.a(70, (kh) null);
            if (oa.field_j) {
                return -1;
            }
            if (hh.field_a < se.field_l) {
                return -1;
            }
            if (!(oe.field_Q + se.field_l <= hh.field_a)) {
                return ac.field_m;
            }
            return -1;
        }
        if (oa.field_j) {
            return -1;
        }
        if (hh.field_a < se.field_l) {
            return -1;
        }
        if (oe.field_Q + se.field_l <= hh.field_a) {
            return -1;
        }
        return ac.field_m;
    }

    public final int a(int param0, byte param1) {
        if (param1 != -91) {
            field_c = null;
            if (!((dp) this).field_f[param0].field_n) {
                return 1;
            }
            return 0;
        }
        if (!((dp) this).field_f[param0].field_n) {
            return 1;
        }
        return 0;
    }

    public final int b(int param0, int param1) {
        if (param0 < 44) {
            return -97;
        }
        if (((dp) this).field_f[param1] == null) {
            return 0;
        }
        return ((dp) this).field_f[param1].field_o;
    }

    final static void a(int param0, kh param1) {
        kh var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            param1.a((byte) -117);
            var2 = (kh) (Object) ep.field_A.c((byte) -72);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param1, false)) {
                    break L2;
                  } else {
                    var2 = (kh) (Object) ep.field_A.f((byte) -5);
                    continue L1;
                  }
                }
              }
              L3: {
                if (var2 != null) {
                  vj.a((ma) (Object) param1, (byte) -119, (ma) (Object) var2);
                  break L3;
                } else {
                  ep.field_A.b((byte) -108, (ma) (Object) param1);
                  break L3;
                }
              }
              L4: {
                if (param0 <= -73) {
                  break L4;
                } else {
                  field_c = null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("dp.D(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void a(vh param0, vh param1) {
        param1.field_qb = param0.field_gb + -param1.field_gb >> 1;
        try {
            param1.field_eb = param0.field_Db + (-param1.field_Db + -10);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dp.F(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + -89 + 41);
        }
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 55) {
            return true;
        }
        return 64 == ((dp) this).field_b ? true : false;
    }

    public final boolean a(byte param0, int param1) {
        if (param0 <= 97) {
            dp.a(72, -96, -108, 104, -44, -64, -2, -66);
            return true;
        }
        return true;
    }

    final static int b(int param0) {
        nk.field_m.b((byte) -46);
        int var1 = 55 / ((25 - param0) / 40);
        if (!sq.field_c.d(-2147483648)) {
            int discarded$0 = -27108;
            return ug.g();
        }
        return 0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 < 12) {
            int discarded$0 = dp.b(26);
            of.a(param1, (byte) 0, param0);
            return (tp.field_h[0] << 9) / tp.field_h[2] + 320;
        }
        of.a(param1, (byte) 0, param0);
        return (tp.field_h[0] << 9) / tp.field_h[2] + 320;
    }

    public static void c(int param0) {
        field_h = null;
        field_d = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 != 3729) {
            field_e = null;
        }
    }

    dp(di param0, di param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        ge var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((dp) this).field_a = new ko();
        ((dp) this).field_b = 128;
        ((dp) this).field_j = 0;
        try {
          L0: {
            ((dp) this).field_i = param1;
            ((dp) this).field_g = param2;
            ((dp) this).field_j = ((dp) this).field_g;
            ((dp) this).field_b = param3;
            var14 = param0.a(0, 0);
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var5 = var10;
            var6 = var14.length;
            ((dp) this).field_f = new dh[param0.a(false, 0)];
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = new ge(param0.a(86, var14[var7], 0));
                ((dp) this).field_f[var14[var7]] = new dh(var8);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("dp.<init>(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_h = "Day";
        field_k = new int[]{0, 1, 3, 9, 10, 8, 7, 5, 15, 2, 12, 14, 4, 13, 11, 6};
    }
}
