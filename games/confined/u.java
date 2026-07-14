/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends ee {
    static od field_T;
    private int field_V;
    private double field_S;
    static String field_U;
    private da field_W;
    private int field_R;
    private da field_Q;

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            field_U = null;
            return true;
        }
        return true;
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            return true;
        }
        return false;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 == 14170) {
          ((u) this).field_S = ((u) this).field_S - param2;
          if (0.0 >= ((u) this).field_S) {
            ((u) this).d(10797);
            return -((u) this).field_S;
          } else {
            return 0.0;
          }
        } else {
          ((u) this).a(96, -108);
          ((u) this).field_S = ((u) this).field_S - param2;
          if (0.0 >= ((u) this).field_S) {
            ((u) this).d(10797);
            return -((u) this).field_S;
          } else {
            return 0.0;
          }
        }
    }

    final void g(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        u var9 = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        ka var18 = null;
        ka var19 = null;
        var16 = Confined.field_J ? 1 : 0;
        if ((((u) this).field_V ^ -1) > -3) {
          L0: {
            var2 = 0.25 * ((u) this).field_M;
            var4 = var2 * 16.0 / 1.0;
            var6 = (int)(-((u) this).field_S / var4);
            if (0 > var6) {
              var6 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var6 > 4) {
              var6 = 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            ((u) this).field_S = ((u) this).field_S + var4 * (double)var6;
            if (((u) this).field_V == 0) {
              var7 = ha.field_f[1] - -(4 * ha.field_f[2]);
              break L2;
            } else {
              var7 = ha.field_f[2];
              break L2;
            }
          }
          ((u) this).field_A.a((byte) 50, var7 * var6);
          var8 = 0;
          L3: while (true) {
            if (-var6 + 4 > var8) {
              var9 = new u(((u) this).field_A, ((u) this).field_E, ((u) this).field_t, ((u) this).field_D, 0.6299605249474366 * ((u) this).field_C, var2, ((u) this).field_V + 1);
              var10 = 1.998 * Math.random() - 0.999;
              var12 = Math.sqrt(1.0 - var10 * var10) * 0.04;
              var14 = 6.283185307179586 * Math.random();
              var9.field_K = Math.sin(var14) * var12;
              var9.field_G = Math.cos(var14) * var12;
              var9.field_L = var10 * 0.04;
              ri.a((rk) this, param0 + -26402, (rk) (Object) var9);
              if (((u) this).field_S >= 0.0) {
                var8++;
                var8++;
                var8++;
                continue L3;
              } else {
                hn.field_I = false;
                ((u) this).field_S = -var9.a(14170, true, -((u) this).field_S);
                hn.field_I = true;
                var8++;
                var8++;
                continue L3;
              }
            } else {
              L4: {
                if (!hn.field_I) {
                  break L4;
                } else {
                  var19 = ((u) this).a((byte) 120, jn.field_U, 1.0);
                  var19.field_M.field_m = 96 >> ((u) this).field_V;
                  break L4;
                }
              }
              if (param0 != 26402) {
                ((u) this).a(84, -0.09469503278387087);
                ((u) this).field_A.a((byte) 50, ha.field_f[((u) this).field_V]);
                return;
              } else {
                ((u) this).field_A.a((byte) 50, ha.field_f[((u) this).field_V]);
                return;
              }
            }
          }
        } else {
          L5: {
            if (!hn.field_I) {
              break L5;
            } else {
              var18 = ((u) this).a((byte) 120, jn.field_U, 1.0);
              var18.field_M.field_m = 96 >> ((u) this).field_V;
              break L5;
            }
          }
          if (param0 != 26402) {
            ((u) this).a(84, -0.09469503278387087);
            ((u) this).field_A.a((byte) 50, ha.field_f[((u) this).field_V]);
            return;
          } else {
            ((u) this).field_A.a((byte) 50, ha.field_f[((u) this).field_V]);
            return;
          }
        }
    }

    private u(hn param0, double param1, double param2, double param3, double param4, double param5, int param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((u) this).field_W = new da();
        ((u) this).field_Q = new da();
        ((u) this).field_V = param6;
        ((u) this).field_R = (int)(Math.random() * 3.99);
        ((u) this).field_S = 16.0 * param5 / 1.0;
        double var13 = -0.999 + Math.random() * 1.998;
        double var15 = Math.sqrt(1.0 - var13 * var13);
        double var17 = 2.0 * (Math.random() * 3.141592653589793);
        ((u) this).field_Q.a(0.1 * Math.random(), var13, var15 * Math.sin(var17), Math.cos(var17) * var15, 7);
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (!((u) this).field_N) {
          if (param2 > -5) {
            ((u) this).field_Q = null;
            ((u) this).a(bf.field_R[((u) this).field_V][((u) this).field_R], ((u) this).field_W, param4, (byte) 64, param1, param0, param3, 128);
            return;
          } else {
            ((u) this).a(bf.field_R[((u) this).field_V][((u) this).field_R], ((u) this).field_W, param4, (byte) 64, param1, param0, param3, 128);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            u.h((byte) 61);
            return false;
        }
        return false;
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return true;
    }

    final void a(int param0, double param1) {
        int var4 = 92 % ((-16 - param0) / 34);
    }

    final void a(int param0, int param1) {
        ((u) this).field_W.a(param0 ^ -11789, ((u) this).field_Q);
        super.a(param0, param1);
        if (!(0.0 <= ((u) this).field_D)) {
            ((u) this).field_s = 2;
            ((u) this).field_z = true;
        }
    }

    public static void h(byte param0) {
        field_T = null;
        field_U = null;
        if (param0 != -118) {
            field_T = null;
        }
    }

    u(hn param0, double param1, double param2, double param3) {
        this(param0, param1, param2, param3, 0.4, 1.0, 0);
        double var8 = 1.998 * Math.random() - 0.999;
        double var10 = Math.sqrt(-(var8 * var8) + 1.0);
        double var12 = Math.random() * 6.283185307179586;
        double var14 = Math.sin(var12) * var10;
        double var16 = var10 * Math.cos(var12);
        var10 = Math.pow(Math.random(), 0.3333333333333333) * 0.01;
        ((u) this).field_G = var10 * var16;
        ((u) this).field_L = var10 * var8;
        ((u) this).field_K = var10 * var14;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "<col=FFFFFF>Ctrl</col> also still works.";
    }
}
