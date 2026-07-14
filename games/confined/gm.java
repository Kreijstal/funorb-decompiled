/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends ah {
    static ok field_cb;
    static int[] field_bb;
    private oi field_db;
    private pm field_eb;

    gm(hn param0, ee param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 8.0, param2, param3, param4, param5, fj.field_G);
        ((gm) this).field_db = new oi((pm) this);
        ((gm) this).field_eb = (pm) (Object) param0.field_B;
        ((gm) this).field_eb.h(17086);
        kj.a(ul.field_P, 96, (pm) (Object) param1);
    }

    final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        if (((gm) this).field_eb != null) {
          L0: {
            var3 = Math.sqrt(((gm) this).field_L * ((gm) this).field_L + (((gm) this).field_K * ((gm) this).field_K + ((gm) this).field_G * ((gm) this).field_G));
            if (var3 < 0.001) {
              var3 = 0.001;
              break L0;
            } else {
              break L0;
            }
          }
          var5 = ((gm) this).field_K / var3;
          var7 = ((gm) this).field_G / var3;
          var9 = ((gm) this).field_L / var3;
          if (((gm) this).a(var9, ((gm) this).field_eb, var5, 1, var7)) {
            ((gm) this).field_eb.f((byte) -119);
            ((gm) this).field_eb = ((gm) this).a(var5, var7, var9, false);
            if (null == ((gm) this).field_eb) {
              super.a(param0, param1);
              if (((gm) this).field_z) {
                if (((gm) this).field_eb == null) {
                  return;
                } else {
                  ((gm) this).field_eb.f((byte) -123);
                  ((gm) this).field_eb = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              ((gm) this).field_eb.h(17086);
              ((gm) this).b(((gm) this).field_eb, (byte) 106);
              ((gm) this).a(((gm) this).field_ab, true);
              super.a(param0, param1);
              if (((gm) this).field_z) {
                if (((gm) this).field_eb == null) {
                  return;
                } else {
                  ((gm) this).field_eb.f((byte) -123);
                  ((gm) this).field_eb = null;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((gm) this).b(((gm) this).field_eb, (byte) 106);
            ((gm) this).a(((gm) this).field_ab, true);
            super.a(param0, param1);
            if (((gm) this).field_z) {
              if (((gm) this).field_eb == null) {
                return;
              } else {
                ((gm) this).field_eb.f((byte) -123);
                ((gm) this).field_eb = null;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          super.a(param0, param1);
          if (((gm) this).field_z) {
            if (((gm) this).field_eb == null) {
              return;
            } else {
              ((gm) this).field_eb.f((byte) -123);
              ((gm) this).field_eb = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(mn param0, byte param1) {
        double[] var15 = new double[12];
        double[] var14 = var15;
        double[] var13 = var14;
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var3 = var11;
        ((gm) this).field_ab.a((byte) 112, var15);
        double var4 = var15[9];
        double var6 = var15[10];
        ((gm) this).field_db.field_t = -(((gm) this).field_C * var4 * 0.8) + ((gm) this).field_E;
        double var8 = var15[11];
        int var10 = 117 / ((-2 - param1) / 62);
        ((gm) this).field_db.field_o = ((gm) this).field_t - 0.8 * (var6 * ((gm) this).field_C);
        ((gm) this).field_db.field_v = -var8;
        ((gm) this).field_db.field_w = true;
        ((gm) this).field_db.field_u = 15.0;
        ((gm) this).field_db.field_m = -var4;
        ((gm) this).field_db.field_x = -var6;
        ((gm) this).field_db.field_p = -(var8 * ((gm) this).field_C * 0.8) + ((gm) this).field_D;
        param0.a((rk) (Object) ((gm) this).field_db, (byte) -88);
    }

    final void g(int param0) {
        Object var3 = null;
        if (param0 == 26402) {
          if (null != ((gm) this).field_eb) {
            ((gm) this).field_eb.f((byte) -125);
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
            return;
          } else {
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
            return;
          }
        } else {
          var3 = null;
          ((gm) this).a((mn) null, 0.183731807417079, -74, (vg) null, (oi) null);
          if (null == ((gm) this).field_eb) {
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
            return;
          } else {
            ((gm) this).field_eb.f((byte) -125);
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
            return;
          }
        }
    }

    gm(hn param0, dj param1) {
        super(param0, param1, 0.4, 0.02, 64.0, fj.field_G);
        ((gm) this).field_db = new oi((pm) this);
        double[] var4 = new double[12];
        double[] var3 = var4;
        ((gm) this).field_ab.a((byte) 81, var4);
        ((gm) this).field_eb = param1.a(var4[9], var4[10], var4[11], false);
        if (null != ((gm) this).field_eb) {
            ((gm) this).field_eb.h(17086);
        }
        kj.a(ul.field_P, 96, (pm) (Object) param1);
    }

    public static void m(int param0) {
        if (param0 != 15) {
            gm.m(-41);
            field_cb = null;
            field_bb = null;
            return;
        }
        field_cb = null;
        field_bb = null;
    }

    final static void i(byte param0) {
        if (!ka.k(-58)) {
            return;
        }
        if (param0 != -29) {
            return;
        }
        q.a(4, false, (byte) -101);
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double[] var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        double[] var19 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param2 <= -5) {
          if (((gm) this).field_N) {
            return;
          } else {
            L0: {
              var19 = new double[12];
              var18 = var19;
              var17 = var18;
              var16 = var17;
              var15 = var16;
              var7 = var15;
              ((gm) this).field_ab.a((byte) 123, var19);
              var8 = var19[9];
              var10 = var19[10];
              var12 = var19[11];
              if (var12 * param3.field_N + (param3.field_H * var10 + param3.field_P * var8) <= 0.0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            L1: {
              var14 = stackIn_6_0;
              if (var14 != 0) {
                ((gm) this).a(h.field_Y, ((gm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              pa.a(-(((gm) this).field_C * var8 * 0.8) + ((gm) this).field_E, 0.2 * ((gm) this).field_C, (byte) -11, 256, ((gm) this).field_D - var12 * ((gm) this).field_C * 0.8, ((gm) this).field_t - 0.8 * (var10 * ((gm) this).field_C), wb.field_a, param1, param3);
              if (var14 == 0) {
                ((gm) this).a(h.field_Y, ((gm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new int[8192];
    }
}
