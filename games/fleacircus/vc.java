/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    lh field_e;
    static int field_d;
    static boolean field_b;
    static int field_f;
    private lh field_c;
    static int field_a;
    static String field_g;

    final lh c(byte param0) {
        lh var2 = null;
        var2 = ((vc) this).field_e.field_h;
        if (var2 == ((vc) this).field_e) {
          ((vc) this).field_c = null;
          return null;
        } else {
          ((vc) this).field_c = var2.field_h;
          if (param0 != 47) {
            field_b = true;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final lh a(byte param0) {
        int var2 = 0;
        lh var3 = null;
        var2 = 3 / ((28 - param0) / 36);
        var3 = ((vc) this).field_e.field_a;
        if (((vc) this).field_e == var3) {
          return null;
        } else {
          var3.c(-1);
          return var3;
        }
    }

    final void b(boolean param0, lh param1) {
        try {
            if (param1.field_a != null) {
                param1.c(-1);
            }
            param1.field_a = ((vc) this).field_e;
            param1.field_h = ((vc) this).field_e.field_h;
            param1.field_a.field_h = param1;
            if (!param0) {
                Object var4 = null;
                ((vc) this).a(true, (lh) null);
            }
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final lh b(int param0) {
        lh var2 = null;
        var2 = ((vc) this).field_e.field_a;
        if (((vc) this).field_e != var2) {
          ((vc) this).field_c = var2.field_a;
          if (param0 > -33) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((vc) this).field_c = null;
          return null;
        }
    }

    final lh b(byte param0) {
        lh var2 = ((vc) this).field_c;
        if (param0 != -105) {
            field_g = null;
            if (!(var2 != ((vc) this).field_e)) {
                ((vc) this).field_c = null;
                return null;
            }
            ((vc) this).field_c = var2.field_h;
            return var2;
        }
        if (!(var2 != ((vc) this).field_e)) {
            ((vc) this).field_c = null;
            return null;
        }
        ((vc) this).field_c = var2.field_h;
        return var2;
    }

    final static void a(byte param0, rh param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        si var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ih var9 = null;
        ih var10 = null;
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
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var9 = new ih(param1.a(0, "", "logo.fo3d"));
            var10 = var9;
            var3 = var10.e(false);
            var10.k(8);
            fc.field_a = fleas.a(var10, -6383);
            ij.field_F = new si[var3];
            gm.field_kb = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.m(8);
                var4 = 0;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    break L0;
                  } else {
                    var6 = ij.field_F[var5];
                    var6.a(6, 1, 6, 6, 0);
                    var6.b(-23443);
                    var7 = new int[]{var6.field_m - -var6.field_B >> 1, var6.field_e + var6.field_k >> 1, var6.field_A + var6.field_b >> 1};
                    gm.field_kb[var5] = var7;
                    var6.a(-var7[1], -var7[0], -var7[2], (byte) -82);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ij.field_F[var4] = d.a(-124, var9);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("vc.H(").append(125).append(',');
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final lh c(int param0) {
        lh var2 = null;
        if (param0 <= 3) {
            field_d = -51;
            var2 = ((vc) this).field_c;
            if (!(var2 != ((vc) this).field_e)) {
                ((vc) this).field_c = null;
                return null;
            }
            ((vc) this).field_c = var2.field_a;
            return var2;
        }
        var2 = ((vc) this).field_c;
        if (!(var2 != ((vc) this).field_e)) {
            ((vc) this).field_c = null;
            return null;
        }
        ((vc) this).field_c = var2.field_a;
        return var2;
    }

    final void a(boolean param0, lh param1) {
        try {
            if (null != param1.field_a) {
                param1.c(-1);
            }
            if (param0) {
                field_b = false;
            }
            param1.field_h = ((vc) this).field_e;
            param1.field_a = ((vc) this).field_e.field_a;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "vc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 >= param0) {
              break L0;
            } else {
              var3_int = param2;
              param2 = param0;
              param0 = var3_int;
              break L0;
            }
          }
          L1: while (true) {
            if (param0 == 0) {
              return param2;
            } else {
              var3_int = param2 % param0;
              param2 = param0;
              param0 = var3_int;
              continue L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "vc.B(" + param0 + ',' + -1 + ',' + param2 + ')');
        }
    }

    final lh e(int param0) {
        lh var2 = null;
        var2 = ((vc) this).field_e.field_h;
        if (var2 != ((vc) this).field_e) {
          if (param0 != -22033) {
            return null;
          } else {
            var2.c(-1);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void f(int param0) {
        lh var2 = null;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          var2 = ((vc) this).field_e.field_h;
          if (((vc) this).field_e != var2) {
            var2.c(-1);
            continue L0;
          } else {
            if (param0 != 1) {
              field_a = 42;
              ((vc) this).field_c = null;
              return;
            } else {
              ((vc) this).field_c = null;
              return;
            }
          }
        }
    }

    public vc() {
        ((vc) this).field_e = new lh();
        ((vc) this).field_e.field_h = ((vc) this).field_e;
        ((vc) this).field_e.field_a = ((vc) this).field_e;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1092895903) {
          L0: {
            lh discarded$10 = ((vc) this).b((byte) -25);
            if (((vc) this).field_e.field_h != ((vc) this).field_e) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((vc) this).field_e.field_h != ((vc) this).field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void d() {
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_g = "You can quickly switch between left slopes, right slopes and blocks by pressing the keys 1, 2 and 3 respectively";
    }
}
