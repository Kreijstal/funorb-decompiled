/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sna extends le {
    private int field_i;

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var23 = null;
        int[][] var27 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var34 = null;
        L0: {
          var17 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            sna.d(-89);
            break L0;
          }
        }
        L1: {
          var31 = ((sna) this).field_d.a(param1, (byte) -127);
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var18 = var19;
          var3 = var18;
          if (((sna) this).field_d.field_g) {
            var32 = ((sna) this).a(1, param1, 255);
            var33 = ((sna) this).a(2, param1, 255);
            var6 = var31[0];
            var7 = var31[1];
            var8 = var31[2];
            var9 = 0;
            L2: while (true) {
              if (hob.field_d <= var9) {
                break L1;
              } else {
                var10 = var32[var9] * 255 >> -1245494836 & 255;
                var11 = ((sna) this).field_i * var33[var9] >> -140573876;
                var12 = jmb.field_q[var10] * var11 >> -51824212;
                var13 = qta.field_o[var10] * var11 >> 1982431500;
                var14 = var9 - -(var12 >> -1674771924) & gbb.field_q;
                var15 = wf.field_d & param1 + (var13 >> -1029949396);
                var34 = ((sna) this).a((byte) 82, 0, var15);
                var6[var9] = var34[0][var14];
                var7[var9] = var34[1][var14];
                var8[var9] = var34[2][var14];
                var9++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var18;
    }

    final static byte[] a(byte[] param0, int param1, int param2) {
        byte[] var4 = new byte[param1];
        byte[] var3 = var4;
        cua.a(param0, 0, var4, 0, param1);
        if (param2 != 5666) {
            return null;
        }
        return var4;
    }

    final static Class a(Object param0, byte param1) {
        if (!(!Integer.class.isInstance(param0))) {
            return Integer.TYPE;
        }
        if (Byte.class.isInstance(param0)) {
            return Byte.TYPE;
        }
        if (Short.class.isInstance(param0)) {
            return Short.TYPE;
        }
        if (param1 <= 94) {
            return null;
        }
        if (!(!Long.class.isInstance(param0))) {
            return Long.TYPE;
        }
        if (!(!Boolean.class.isInstance(param0))) {
            return Boolean.TYPE;
        }
        if (!(!Float.class.isInstance(param0))) {
            return Float.TYPE;
        }
        if (Double.class.isInstance(param0)) {
            return Double.TYPE;
        }
        if (!Character.class.isInstance(param0)) {
            return null;
        }
        return Character.TYPE;
    }

    final static void d(int param0) {
        int var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_f) != -1) {
            ifa.field_g[8] = ut.field_a;
        } else {
            if (-1 != vqa.field_g.field_m.field_f) {
                ifa.field_g[8] = ema.field_q;
            } else {
                ifa.field_g[8] = ds.field_f;
            }
        }
        if (param0 != -19057) {
            sna.d(80);
        }
    }

    public sna() {
        super(3, false);
        ((sna) this).field_i = 32768;
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param1 <= -60) {
            break L0;
          } else {
            ((sna) this).field_i = -36;
            break L0;
          }
        }
        L1: {
          var4 = param0;
          if (-1 != var4) {
            if (-2 != var4) {
              break L1;
            } else {
              L2: {
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (-2 != (param2.e((byte) -121) ^ -1)) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L2;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L2;
                }
              }
              ((sna) this).field_g = stackIn_10_1 != 0;
              break L1;
            }
          } else {
            ((sna) this).field_i = param2.e(1869) << -1130615932;
            break L1;
          }
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var25 = null;
        int[] var26 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var27 = null;
        int var14 = VoidHunters.field_G;
        int[] var15 = ((sna) this).field_f.a((byte) -42, param0);
        int[] var3 = var15;
        if (((sna) this).field_f.field_e) {
            var25 = ((sna) this).a(1, param0, 255);
            var26 = ((sna) this).a(2, param0, 255);
            for (var6 = 0; var6 < hob.field_d; var6++) {
                var7 = (4084 & var25[var6]) >> -496625660;
                var8 = var26[var6] * ((sna) this).field_i >> 461765260;
                var9 = var8 * jmb.field_q[var7] >> -2135667284;
                var10 = var8 * qta.field_o[var7] >> 1467652364;
                var11 = gbb.field_q & (var9 >> 1940104204) + var6;
                var12 = wf.field_d & (var10 >> 1905867212) + param0;
                var27 = ((sna) this).a(0, var12, 255);
                var15[var6] = var27[var11];
            }
        }
        if (!param1) {
            return null;
        }
        return var3;
    }

    final void c(byte param0) {
        taa.e((byte) 124);
        if (param0 >= -35) {
            ((sna) this).field_i = 33;
        }
    }

    static {
    }
}
