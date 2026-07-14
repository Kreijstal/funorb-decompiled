/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends hd {
    private int field_Cb;
    private int field_Ab;
    private gr field_zb;
    int field_yb;
    static String field_Bb;

    final static boolean a(int param0, pt param1) {
        int var3 = 0;
        pt var4 = null;
        var3 = Kickabout.field_G;
        if (param0 == 140) {
          var4 = (pt) (Object) ce.field_K.g(param0 ^ 23877);
          L0: while (true) {
            if (var4 != null) {
              if (var4.a(param1, 5250)) {
                return false;
              } else {
                var4 = (pt) (Object) ce.field_K.c(param0 ^ 173);
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          gi.b(108);
          var4 = (pt) (Object) ce.field_K.g(param0 ^ 23877);
          L1: while (true) {
            if (var4 != null) {
              if (var4.a(param1, 5250)) {
                return false;
              } else {
                var4 = (pt) (Object) ce.field_K.c(param0 ^ 173);
                continue L1;
              }
            } else {
              return true;
            }
          }
        }
    }

    final boolean c(boolean param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((gi) this).field_Ab != 0) {
            stackOut_2_0 = ((gi) this).field_zb.field_R;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((gi) this).field_zb.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0) {
          return false;
        } else {
          L1: {
            if (var2 != ((gi) this).field_yb) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          return stackIn_7_0 != 0;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Kickabout.field_G;
          var2 = ((gi) this).c(false) ? 1 : 0;
          var3 = ((gi) this).field_F;
          var4 = ((gi) this).field_T;
          if (var2 != 0) {
            var6 = -4 + var4;
            var5 = -4 + var3;
            var7 = 29;
            break L0;
          } else {
            var5 = var3;
            var7 = 21;
            var6 = var4;
            break L0;
          }
        }
        on.e(var5 - -1, var6, -2 + var7, var7, 0);
        on.e(var5, 1 + var6, var7, var7 + -2, 0);
        on.a(2 + var5, var6 + 2, -4 + var7, -4 + var7, ((gi) this).field_Cb);
        if (var2 == 0) {
          if (!((gi) this).field_gb) {
            wt.field_z[0].b(var5 - -2, var6 + 2, 140);
            wt.field_z[1].b(var5 - -2, var6 + 2, 128);
            wt.field_z[3].c(2 + var5, 2 + var6, 128);
            on.c(var5 - -2, -3 + var7 + var6, -4 + var7, 0, 90);
            on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
            on.f(2 + var5, 2 + var6, var7 + -5, 0, 90);
            return;
          } else {
            on.c(var5 - -2, -3 + var7 + var6, -4 + var7, 0, 90);
            on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
            on.f(2 + var5, 2 + var6, var7 + -5, 0, 90);
            return;
          }
        } else {
          L1: {
            if (!((gi) this).field_gb) {
              wt.field_z[0].d(var5 - -2, var6 - -2, -4 + var7, var7 - 4, 140);
              wt.field_z[1].d(var5 + 2, var6 - -2, -4 + var7, -4 + var7, 128);
              wt.field_z[3].e(2 + var5, var6 + 2, -4 + var7, -4 + var7, 256);
              break L1;
            } else {
              break L1;
            }
          }
          su.field_a.c((-su.field_a.field_o + var7 >> -603192063) + var5, (var7 + -su.field_a.field_v >> -1443481887) + var6);
          on.c(var5 - -2, -3 + var7 + var6, -4 + var7, 0, 90);
          on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
          on.f(2 + var5, 2 + var6, var7 + -5, 0, 90);
          return;
        }
    }

    public static void h(int param0) {
        field_Bb = null;
        if (param0 != -31922) {
            field_Bb = null;
        }
    }

    gi(gr param0, int param1, int param2) {
        ((gi) this).field_yb = param2;
        ((gi) this).field_Ab = param1;
        ((gi) this).field_zb = param0;
        ((gi) this).field_Cb = t.field_l[ev.field_B[((gi) this).field_yb]];
    }

    final static void b(int param0) {
        int var2 = 0;
        wh var3 = null;
        var2 = Kickabout.field_G;
        gp.b((byte) -28);
        var3 = (wh) (Object) pn.field_z.g(24009);
        L0: while (true) {
          if (var3 == null) {
            if (param0 != 17702) {
              gi.b(94);
              return;
            } else {
              return;
            }
          } else {
            var3.f((byte) -127);
            var3 = (wh) (Object) pn.field_z.c(33);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "Your email address is used to identify this account";
    }
}
