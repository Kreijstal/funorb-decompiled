/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static boolean field_j;
    int field_p;
    nl field_o;
    int field_e;
    int field_c;
    nl field_k;
    static String field_r;
    int field_m;
    static String field_q;
    nl field_a;
    int field_b;
    int field_d;
    nl field_s;
    fm field_h;
    nl field_n;
    static cj field_i;
    private int field_f;
    int field_l;
    private boolean field_g;

    final static int a(byte param0) {
        int var1 = -1;
        return qk.field_j;
    }

    public static void a(int param0) {
        field_i = null;
        field_q = null;
        field_r = null;
    }

    private final void a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
              var5_int = ((sk) this).field_h.a(param1);
              var6 = ((sk) this).field_h.field_J - -((sk) this).field_h.field_r;
              var7 = param2;
              if (var7 + var5_int - -6 <= oo.field_b) {
                break L1;
              } else {
                var7 = -var5_int + (oo.field_b - 6);
                break L1;
              }
            }
            L2: {
              var8 = 32 + (-((sk) this).field_h.field_J + param3);
              if (var6 + var8 + 6 > oo.field_l) {
                var8 = -var6 + oo.field_l - 6;
                break L2;
              } else {
                break L2;
              }
            }
            oo.a(var7, var8, 6 + var5_int, 6 + var6, ((sk) this).field_f);
            oo.e(1 + var7, 1 + var8, 4 + var5_int, var6 - -4, ((sk) this).field_d);
            ((sk) this).field_h.c(param1, 3 + var7, ((sk) this).field_h.field_J + (3 + var8), ((sk) this).field_f, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("sk.G(").append(6).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = -11 % ((param3 - -28) / 57);
        oo.f(param0, param6, param2, param1, param4, param5);
    }

    final void a(int param0, fm param1) {
        RuntimeException var3 = null;
        jl var4 = null;
        ja[] var5 = null;
        jl var6 = null;
        int var7_int = 0;
        jl var7 = null;
        jl var8 = null;
        ja[] var9 = null;
        ja[] var10 = null;
        jl var11 = null;
        jl var12 = null;
        ja var13 = null;
        jl var14 = null;
        int var15 = 0;
        Object var16 = null;
        rf var17 = null;
        hq var18 = null;
        rf var19 = null;
        jl var20 = null;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var18 = new hq(param1, 2, 2, 2236962, 1, 1, 1, param1.field_r + (param1.field_C + 2));
            ((sk) this).field_s = (nl) (Object) var18;
            var18.field_q = 16777215;
            var4 = new jl();
            var18.a(param0 + -125269882, (hq) (Object) var4);
            ((sk) this).field_d = 5592405;
            ((sk) this).field_h = param1;
            var4.field_i = 11711154;
            ((sk) this).field_p = -1;
            ((sk) this).field_b = 15658734;
            ((sk) this).field_l = 3;
            ((sk) this).field_f = 15658734;
            var4.field_h = 15658734;
            ((sk) this).field_m = 3;
            ((sk) this).field_c = 3;
            ((sk) this).field_e = 3;
            mk discarded$10 = var4.a(0, (byte) -36).b(15658734, 0).a(vn.a(43, 7829367, 10066329, 8947848), 2147483647);
            mk discarded$11 = var4.a(1, (byte) -36).a(vn.a(62, 13421772, 10066329, 11184810), 2147483647);
            mk discarded$12 = var4.a(3, (byte) -36).a(vn.a(67, 10066329, 7829367, 8947848), 2147483647).a(1, 2147483647).a(1, (byte) 47);
            var5 = new ja[9];
            var17 = new rf(32, 32);
            var19 = var17;
            var7_int = 0;
            L1: while (true) {
              if (var19.field_B.length <= var7_int) {
                L2: {
                  var5[4] = (ja) (Object) var19;
                  mk discarded$13 = var4.a(4, (byte) -36).a(true, 2521).a(var5, 2147483647);
                  mk discarded$14 = var4.a(5, (byte) -36).a(u.a(21242, 0, 65793, 0, 0), 2147483647).a(true, 2521).b(-1, 0);
                  ((sk) this).field_n = (nl) (Object) var4;
                  var6 = new jl(var4, true);
                  var6.field_d = 0;
                  var7 = new jl(var4, true);
                  var7.field_d = 0;
                  var7.a(nk.a(8947848, (byte) -98), false);
                  mk discarded$15 = var7.a(1, (byte) -36).a(nk.a(11184810, (byte) 108), 2147483647).b(2236962, 0);
                  ((sk) this).field_k = (nl) (Object) new ij(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                  bg discarded$16 = new bg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                  wa discarded$17 = new wa(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                  var8 = new jl();
                  var18.a(-3, (hq) (Object) var8);
                  mk discarded$18 = var8.a(0, (byte) -36).a(vn.a(120, 10066329, 7829367, 15658734), 2147483647).b(1118481, 0).a((byte) 44, -1);
                  mk discarded$19 = var8.a(4, (byte) -36).a(true, 2521).a(var5, 2147483647);
                  ((sk) this).field_o = (nl) (Object) var8;
                  var9 = new ja[9];
                  var10 = new ja[9];
                  var9[4] = new ja(2, 1);
                  var10[4] = new ja(1, 2);
                  var9[4].field_B = new int[]{6710886, 7829367};
                  var10[4].field_B = new int[]{6710886, 7829367};
                  var11 = new jl();
                  var12 = new jl();
                  var11.a(var9, 0, false);
                  if (param0 == 125269879) {
                    break L2;
                  } else {
                    var16 = null;
                    ((sk) this).a(21, (String) null, -114, (byte) -66);
                    break L2;
                  }
                }
                var12.a(var10, 0, false);
                var13 = new ja(7, 4);
                var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new jl(var4, true);
                var14.a(var13.c(), (byte) -102);
                var13.b();
                var14 = new jl(var4, true);
                var14.a(var13.c(), (byte) 79);
                var13.b();
                var14 = new jl(var4, true);
                var14.a(var13.c(), (byte) -53);
                var13.b();
                var20 = new jl(var4, true);
                var20.a(var13, (byte) -107);
                break L0;
              } else {
                var17.field_B[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sk.E(").append(param0).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        vj.field_t = param1;
        if (!(b.field_d == t.field_e)) {
            var2 = b.field_d * b.field_d;
            var3 = -(t.field_e * t.field_e) + var2;
            param1 = param1 + var3 * (-param1 + km.field_cb) / var2;
        }
        dq.field_k.a(120, param1, 640, ck.field_a, -3344);
        eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
    }

    final void a(int param0, String param1, int param2, byte param3) {
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
            if (param3 == 95) {
              break L0;
            } else {
              ((sk) this).field_h = null;
              break L0;
            }
          }
          if (!((sk) this).field_g) {
            this.a(6, param1, param0, param2);
            return;
          } else {
            this.a(param2, 2, param1, param0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sk.B(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 != 100) {
          ((sk) this).field_c = 52;
          oo.g(param1, param2, param5, param0, param3);
          return;
        } else {
          oo.g(param1, param2, param5, param0, param3);
          return;
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((sk) this).field_l - -((sk) this).field_c;
              var6 = ((sk) this).field_m + ((sk) this).field_e;
              var7 = ((sk) this).field_p;
              if (-1 == var7) {
                var7 = ((sk) this).field_h.field_C + ((sk) this).field_h.field_r;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = oo.field_b >> 2;
                var9 = ((sk) this).field_h.a(param2);
                var10 = ((sk) this).field_h.field_r + ((sk) this).field_h.field_C;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf("<br>")) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (vm.field_gb == null) {
                  vm.field_gb = new String[16];
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
                  break L5;
                }
              }
              var11 = ((sk) this).field_h.a(param2, new int[1], vm.field_gb);
              var9 = 0;
              var10 = var10 + var7 * (-1 + var11);
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((sk) this).field_h.a(vm.field_gb[var13]);
                    if (var9 < var14) {
                      var9 = var14;
                      var13++;
                      break L7;
                    } else {
                      var13++;
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
              if (var9 + var12 - -var5_int > oo.field_b) {
                var12 = oo.field_b - (var9 - -var5_int);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = -((sk) this).field_h.field_J + (param0 - -32);
              if (var13 - (-var10 + -var6) <= oo.field_l) {
                break L9;
              } else {
                var13 = -var10 + param0 - var6;
                break L9;
              }
            }
            oo.a(var12, var13, var9 + var5_int, var6 + var10, ((sk) this).field_b);
            oo.e(1 + var12, var13 - -1, -2 + (var5_int + var9), var6 + var10 + -2, ((sk) this).field_d);
            int discarded$1 = ((sk) this).field_h.a(param2, var12 + ((sk) this).field_l, var13 - -((sk) this).field_e, var9, var10, ((sk) this).field_f, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("sk.I(").append(param0).append(',').append(2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param3 + ')');
        }
    }

    public sk() {
        ((sk) this).field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Powerups with this modifier will fool even enemy overlords.";
    }
}
