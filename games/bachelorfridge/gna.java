/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gna extends sna {
    private sna field_wb;
    sna field_vb;

    final static void f(byte param0) {
        int var1 = 20 % ((-9 - param0) / 54);
        bja.a(new kv(fi.field_p, (java.awt.Component) (Object) dca.field_y), 6, ep.field_m);
    }

    gna(long param0, sna param1, sna param2, sna param3, kv param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((gna) this).field_wb = new sna(0L, param2);
            ((gna) this).field_wb.field_v = param4;
            ((gna) this).a(-1, ((gna) this).field_wb);
        }
        if (param5 != null) {
            ((gna) this).field_vb = new sna(0L, param3, param5);
            ((gna) this).a(-1, ((gna) this).field_vb);
        }
        ((gna) this).d((byte) 121);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6, int param7, int param8) {
        if (param1 >= -90) {
          int discarded$2 = gna.a(11, (byte) 124, -90, -102);
          lu.a(0, param6, 0, (byte) -4, 0, param0, param7, 0, param2, 0, param4, dg.field_e, param5, param6.field_v, param3, param8, 0);
          return;
        } else {
          lu.a(0, param6, 0, (byte) -4, 0, param0, param7, 0, param2, 0, param4, dg.field_e, param5, param6.field_v, param3, param8, 0);
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0) {
          L0: {
            var4 = -param1;
            var5 = -param1;
            if (null == ((gna) this).field_wb) {
              break L0;
            } else {
              var4 = ((gna) this).field_wb.e(-1);
              break L0;
            }
          }
          L1: {
            if (((gna) this).field_vb == null) {
              break L1;
            } else {
              var5 = ((gna) this).field_vb.b(-param2 + (-var4 + -param2 + ((gna) this).field_sb + -param1), 127);
              break L1;
            }
          }
          L2: {
            var6 = param2 + (param2 + (var4 - -param1 - -var5));
            if (((gna) this).field_sb < var6) {
              var5 = var5 + (((gna) this).field_sb - var6);
              var6 = ((gna) this).field_sb;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (1 == ((gna) this).field_N) {
              param2 = param2 + (-var6 + ((gna) this).field_sb) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (2 != ((gna) this).field_N) {
              break L4;
            } else {
              param2 = param2 + (((gna) this).field_sb - var6);
              break L4;
            }
          }
          L5: {
            if (((gna) this).field_wb != null) {
              ((gna) this).field_wb.a(((gna) this).field_p, 31407, var4, param2, 0);
              ((gna) this).field_wb.field_Y = ((gna) this).field_Y;
              break L5;
            } else {
              break L5;
            }
          }
          if (null != ((gna) this).field_vb) {
            ((gna) this).field_vb.a(((gna) this).field_p, 31407, var5, param1 + param2 - -var4, 0);
            ((gna) this).field_vb.field_Y = ((gna) this).field_Y;
            if (((gna) this).field_wb != null) {
              ((gna) this).field_vb.field_N = 0;
              return;
            } else {
              ((gna) this).field_vb.field_N = ((gna) this).field_N;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            ((gna) this).field_wb = null;
            var4 = -param1;
            var5 = -param1;
            if (null == ((gna) this).field_wb) {
              break L6;
            } else {
              var4 = ((gna) this).field_wb.e(-1);
              break L6;
            }
          }
          L7: {
            if (((gna) this).field_vb == null) {
              break L7;
            } else {
              var5 = ((gna) this).field_vb.b(-param2 + (-var4 + -param2 + ((gna) this).field_sb + -param1), 127);
              break L7;
            }
          }
          L8: {
            var6 = param2 + (param2 + (var4 - -param1 - -var5));
            if (((gna) this).field_sb < var6) {
              var5 = var5 + (((gna) this).field_sb - var6);
              var6 = ((gna) this).field_sb;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (1 == ((gna) this).field_N) {
              param2 = param2 + (-var6 + ((gna) this).field_sb) / 2;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (2 != ((gna) this).field_N) {
              break L10;
            } else {
              param2 = param2 + (((gna) this).field_sb - var6);
              break L10;
            }
          }
          L11: {
            if (((gna) this).field_wb != null) {
              ((gna) this).field_wb.a(((gna) this).field_p, 31407, var4, param2, 0);
              ((gna) this).field_wb.field_Y = ((gna) this).field_Y;
              break L11;
            } else {
              break L11;
            }
          }
          if (null != ((gna) this).field_vb) {
            ((gna) this).field_vb.a(((gna) this).field_p, 31407, var5, param1 + param2 - -var4, 0);
            ((gna) this).field_vb.field_Y = ((gna) this).field_Y;
            if (((gna) this).field_wb != null) {
              ((gna) this).field_vb.field_N = 0;
              return;
            } else {
              ((gna) this).field_vb.field_N = ((gna) this).field_N;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, int[] param1, String param2, int param3, boolean param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        k.c(3685);
        var14 = dg.field_e;
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var6 = var10;
        var7 = dg.field_i;
        var8 = dg.field_c;
        if (null != sca.field_a) {
          if (lo.field_b != null) {
            L0: {
              param5 = param5 - (lo.field_b.field_F + -lo.field_b.field_B);
              var9 = lo.field_b.a(param2) - -10;
              sca.field_a.b();
              if (-2 == (1 & var9 ^ -1)) {
                var9++;
                break L0;
              } else {
                break L0;
              }
            }
            dg.d();
            lo.field_b.c(param2, 5, 3 + lo.field_b.field_u, 0, -1);
            dg.a(var14, var7, var8);
            fk.d((byte) -111);
            if (!param4) {
              if (!param0) {
                uma.a(var9, param3, 0, sca.field_a, param5, param1);
                return;
              } else {
                cn.a((byte) -63, var9, ap.field_c, param1, param3, param5, sca.field_a);
                return;
              }
            } else {
              gna.f((byte) -62);
              if (!param0) {
                uma.a(var9, param3, 0, sca.field_a, param5, param1);
                return;
              } else {
                cn.a((byte) -63, var9, ap.field_c, param1, param3, param5, sca.field_a);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = -param1;
        var5 = -param1;
        if (param0 <= 117) {
          L0: {
            gna.f((byte) 127);
            if (((gna) this).field_wb == null) {
              break L0;
            } else {
              var4 = ((gna) this).field_wb.e(-1);
              break L0;
            }
          }
          L1: {
            if (null == ((gna) this).field_vb) {
              break L1;
            } else {
              var5 = ((gna) this).field_vb.e(-1);
              break L1;
            }
          }
          return var5 + (var4 + param2 + (param1 - -param2));
        } else {
          L2: {
            if (((gna) this).field_wb == null) {
              break L2;
            } else {
              var4 = ((gna) this).field_wb.e(-1);
              break L2;
            }
          }
          L3: {
            if (null == ((gna) this).field_vb) {
              break L3;
            } else {
              var5 = ((gna) this).field_vb.e(-1);
              break L3;
            }
          }
          return var5 + (var4 + param2 + (param1 - -param2));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        ((gna) this).a(param2, 31407, param0, param3, param6);
        int var8 = -127 / ((param5 - -43) / 32);
        this.a(true, param4, param1);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 != 255) {
          return 109;
        } else {
          var3 = 0;
          L0: while (true) {
            if (0 >= param1) {
              return var3;
            } else {
              var3 = var3 << 522560609 | param2 & 1;
              param1--;
              param2 = param2 >>> 1;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int var4 = 23 / ((18 - param1) / 44);
        return param0 << -1449851728 & 16766326 | (1409286399 & param3) << -989012056 | 255 & param2;
    }

    static {
    }
}
