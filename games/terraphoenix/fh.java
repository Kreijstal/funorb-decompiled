/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    cj field_q;
    int field_m;
    int field_u;
    static ci field_c;
    static boolean field_g;
    int field_v;
    private boolean field_j;
    int field_r;
    cj field_n;
    static String field_x;
    static int field_h;
    static boolean field_f;
    pk field_b;
    cj field_i;
    static ci field_s;
    private int field_w;
    int field_o;
    int field_p;
    cj field_t;
    static fa field_d;
    cj field_e;
    static int field_a;
    static String field_l;
    int field_k;

    public static void a(byte param0) {
        field_x = null;
        field_c = null;
        field_d = null;
        field_s = null;
        field_l = null;
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((fh) this).field_b.b(param3);
              var6 = ((fh) this).field_b.field_p + ((fh) this).field_b.field_u;
              var7 = param1;
              if (6 + (var7 - -var5_int) > l.field_k) {
                var7 = -6 + (-var5_int + l.field_k);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 32 + (param0 + -((fh) this).field_b.field_u);
              if (var6 + var8 - -6 <= l.field_j) {
                break L2;
              } else {
                var8 = -6 + (l.field_j - var6);
                break L2;
              }
            }
            l.e(var7, var8, 6 + var5_int, var6 - -6, ((fh) this).field_w);
            l.f(var7 + 1, var8 - -1, 4 + var5_int, var6 + 4, ((fh) this).field_u);
            ((fh) this).field_b.b(param3, var7 - -3, 3 + (var8 - -((fh) this).field_b.field_u), ((fh) this).field_w, -1);
            var9 = 1 % ((param2 - -66) / 37);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("fh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = ((fh) this).field_v - -((fh) this).field_o;
              var6 = ((fh) this).field_k + ((fh) this).field_m;
              var7 = ((fh) this).field_p;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((fh) this).field_b.field_p + ((fh) this).field_b.field_s;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = l.field_k >> 2;
                var9 = ((fh) this).field_b.b(param1);
                var10 = ((fh) this).field_b.field_p + ((fh) this).field_b.field_s;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (param1.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == wg.field_h) {
                  wg.field_h = new String[16];
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 + (-1 + var9 % var8 + var13) / var13 * 2;
                  break L5;
                }
              }
              var11 = ((fh) this).field_b.a(param1, new int[1], wg.field_h);
              var9 = 0;
              var10 = var10 + var7 * (-1 + var11);
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((fh) this).field_b.b(wg.field_h[var13]);
                    if (var9 >= var14) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param3;
              if (var5_int + (var9 + var12) > l.field_k) {
                var12 = -var5_int + l.field_k + -var9;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = -((fh) this).field_b.field_u + param0 - -32;
              if (l.field_j < var6 + var13 + var10) {
                var13 = -var6 + (param0 + -var10);
                break L9;
              } else {
                break L9;
              }
            }
            l.e(var12, var13, var9 - -var5_int, var6 + var10, ((fh) this).field_r);
            l.f(1 + var12, var13 + 1, -2 + (var9 - -var5_int), -2 + var6 + var10, ((fh) this).field_u);
            int discarded$1 = ((fh) this).field_b.a(param1, ((fh) this).field_v + var12, ((fh) this).field_m + var13, var9, var10, ((fh) this).field_w, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("fh.C(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + 16 + ',' + param3 + ')');
        }
    }

    final void a(pk param0, byte param1) {
        RuntimeException var3 = null;
        hf var4 = null;
        ci[] var5 = null;
        hf var6 = null;
        int var7_int = 0;
        hf var7 = null;
        hf var8 = null;
        ci[] var9 = null;
        ci[] var10 = null;
        hf var11 = null;
        hf var12 = null;
        ci var13 = null;
        hf var14 = null;
        int var15 = 0;
        sg var16 = null;
        fd var17 = null;
        sg var18 = null;
        hf var19 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            var17 = new fd(param0, 2, 2, 2236962, 1, 1, 1, param0.field_s + param0.field_p - -2);
            ((fh) this).field_t = (cj) (Object) var17;
            var17.field_e = 16777215;
            var4 = new hf();
            var17.a((fd) (Object) var4, -46);
            var4.field_r = 11711154;
            ((fh) this).field_v = 3;
            ((fh) this).field_u = 5592405;
            ((fh) this).field_o = 3;
            var4.field_g = 15658734;
            ((fh) this).field_w = 15658734;
            ((fh) this).field_m = 3;
            ((fh) this).field_k = 3;
            ((fh) this).field_p = -1;
            ((fh) this).field_b = param0;
            ((fh) this).field_r = 15658734;
            bd discarded$10 = var4.a(0, 3).b(15658734, true).a(hl.a((byte) 94, 8947848, 7829367, 10066329), (byte) 45);
            bd discarded$11 = var4.a(1, 3).a(hl.a((byte) 18, 11184810, 13421772, 10066329), (byte) 45);
            bd discarded$12 = var4.a(3, 3).a(hl.a((byte) 115, 8947848, 10066329, 7829367), (byte) 45).b(80, 1).c(2, 1);
            var5 = new ci[9];
            var16 = new sg(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_z.length) {
                if (param1 < -84) {
                  var5[4] = (ci) (Object) var18;
                  bd discarded$13 = var4.a(4, 3).a(-47, true).a(var5, (byte) 45);
                  bd discarded$14 = var4.a(5, 3).a(al.a(0, 0, 0, 65793, (byte) -123), (byte) 45).a(-82, true).b(-1, true);
                  ((fh) this).field_n = (cj) (Object) var4;
                  var6 = new hf(var4, true);
                  var6.field_h = 0;
                  var7 = new hf(var4, true);
                  var7.field_h = 0;
                  var7.a(fa.f(8947848, 4), (byte) -24);
                  bd discarded$15 = var7.a(1, 3).a(fa.f(11184810, 4), (byte) 45).b(2236962, true);
                  ((fh) this).field_q = (cj) (Object) new ea(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                  f discarded$16 = new f(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                  sk discarded$17 = new sk(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                  var8 = new hf();
                  var17.a((fd) (Object) var8, -32);
                  bd discarded$18 = var8.a(0, 3).a(hl.a((byte) -81, 15658734, 10066329, 7829367), (byte) 45).b(1118481, true).a(-19426, -1);
                  bd discarded$19 = var8.a(4, 3).a(-86, true).a(var5, (byte) 45);
                  ((fh) this).field_i = (cj) (Object) var8;
                  var9 = new ci[9];
                  var9[4] = new ci(2, 1);
                  var10 = new ci[9];
                  var10[4] = new ci(1, 2);
                  var9[4].field_z = new int[]{6710886, 7829367};
                  var10[4].field_z = new int[]{6710886, 7829367};
                  var11 = new hf();
                  var12 = new hf();
                  var11.a(-26108, 0, var9);
                  var12.a(-26108, 0, var10);
                  var13 = new ci(7, 4);
                  var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                  var14 = new hf(var4, true);
                  var14.a(0, var13.d());
                  var13.b();
                  var14 = new hf(var4, true);
                  var14.a(0, var13.d());
                  var13.b();
                  var14 = new hf(var4, true);
                  var14.a(0, var13.d());
                  var13.b();
                  var19 = new hf(var4, true);
                  var19.a(0, var13);
                  break L0;
                } else {
                  return;
                }
              } else {
                var16.field_z[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fh.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (!param5) {
            return;
        }
        l.c(param1, param4, param2, param3, param0);
    }

    final void b(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param3 == 4473924) {
              L1: {
                if (!((fh) this).field_j) {
                  this.a(param0, param2, param3 + -4473911, param1);
                  break L1;
                } else {
                  this.a(param0, param1, 16, param2);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("fh.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 2) {
            return;
        }
        l.d(param1, param2, param6, param5, param0, param3);
    }

    final static void a(int param0, int param1) {
        dm.field_f = 20000000L;
    }

    public fh() {
        ((fh) this).field_j = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 250;
        field_g = true;
        field_x = "Logging in...";
        field_f = false;
        field_l = "5000pts";
        field_s = new ci(453, 361);
    }
}
