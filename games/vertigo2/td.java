/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements ur {
    private int field_f;
    static cr field_c;
    private int field_e;
    private int field_h;
    private int field_k;
    private int field_j;
    private cc field_d;
    static int field_g;
    private int field_b;
    private int field_i;
    static mp field_a;
    static String[] field_l;

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ao var14 = null;
        iq stackIn_3_0 = null;
        iq stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof ao) {
            stackOut_2_0 = (iq) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (iq) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (ao) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          bi.b(param1 + param3.field_o, param4 + param3.field_t, param3.field_n, param3.field_s, ((td) this).field_h);
          var7 = var14.field_J + param3.field_o + param1;
          var8 = param3.field_t + param4 - -var14.field_M;
          bi.f(var7, var8, var14.field_L, ((td) this).field_e);
          if (var14.field_I != -1) {
            var9 = 2.0 * ((double)var14.field_I * 3.141592653589793) / (double)var14.field_S;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_L);
            var12 = (int)(Math.cos(var9) * (double)var14.field_L);
            bi.f(var11 + var7, var12 + var8, 1, ((td) this).field_i);
            break L2;
          } else {
            break L2;
          }
        }
        bi.f(var7, var8, 2, 1);
        var9 = 2.0 * (3.141592653589793 * (double)var14.field_T) / (double)var14.field_S;
        var11 = (int)(-Math.sin(var9) * (double)var14.field_L);
        var12 = (int)(Math.cos(var9) * (double)var14.field_L);
        bi.a(var7, var8, var7 - -var11, var8 - -var12, 1);
        if (param2) {
          L3: {
            if (null != ((td) this).field_d) {
              var13 = ((td) this).field_f + (var14.field_J + var14.field_L);
              int discarded$1 = ((td) this).field_d.a(param3.field_w, var13 + (param1 - -param3.field_o), param3.field_t + param4 + ((td) this).field_b, -var13 - ((td) this).field_f + param3.field_n, -(((td) this).field_f << 1360413025) + param3.field_s, ((td) this).field_k, ((td) this).field_j, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static qr a(boolean param0, ed param1) {
        if (param0) {
            return null;
        }
        return new qr(param1.n(2), param1.n(2), param1.n(2), param1.n(2), param1.m(0), param1.m(0), param1.h(-11));
    }

    public static void a(byte param0) {
        field_a = null;
        field_l = null;
        if (param0 < 22) {
            return;
        }
        field_c = null;
    }

    final static er a(int param0) {
        int var1 = 0;
        fe var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        byte[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        int[] var21 = null;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 4205) {
            break L0;
          } else {
            field_g = -98;
            break L0;
          }
        }
        L1: {
          var1 = vi.field_w[0] * mh.field_c[0];
          var18 = se.field_y[0];
          if (vl.field_j[0]) {
            var20 = ej.field_c[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            var6 = 0;
            L2: while (true) {
              if (var1 <= var6) {
                var3 = new fe(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], var21);
                break L1;
              } else {
                var5[var6] = om.a(b.a((int) var20[var6], 255) << 1693118200, in.field_c[b.a(255, (int) var18[var6])]);
                var6++;
                continue L2;
              }
            }
          } else {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            var5_int = 0;
            L3: while (true) {
              if (var5_int >= var1) {
                var3 = (fe) (Object) new er(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], var19);
                break L1;
              } else {
                var8[var5_int] = in.field_c[b.a((int) var18[var5_int], 255)];
                var5_int++;
                continue L3;
              }
            }
          }
        }
        la.a((byte) 37);
        return (er) (Object) var3;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param1) {
            bi.b(0, 0, bi.field_e, bi.field_j, 0, 192);
        } else {
            bi.c();
        }
        if (param2 != -77) {
            td.a((byte) -93);
        }
        mh.a(param1, false);
    }

    td(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((td) this).field_f = param1;
        ((td) this).field_e = param5;
        ((td) this).field_j = param4;
        ((td) this).field_k = param3;
        ((td) this).field_i = param6;
        ((td) this).field_b = param2;
        ((td) this).field_d = param0;
        ((td) this).field_h = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 10;
    }
}
