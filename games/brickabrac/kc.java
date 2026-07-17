/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends nm {
    static String field_i;
    private int field_l;
    private int field_k;
    static jp field_r;
    static jp field_p;
    static nb field_q;
    static mf field_j;
    static mh field_n;
    private int field_m;
    static String field_o;

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_p = null;
        int var1 = 0;
        field_r = null;
        field_i = null;
        field_j = null;
        field_q = null;
    }

    final boolean c(byte param0) {
        if (param0 < 47) {
            field_o = null;
        }
        int fieldTemp$0 = ((kc) this).field_k + 1;
        ((kc) this).field_k = ((kc) this).field_k + 1;
        return fieldTemp$0 < 40 ? true : false;
    }

    final static void a(mf param0, ra param1, int param2, int param3) {
        try {
            rn.field_i = wn.a((byte) -98) * param2 / 1000;
            if (param3 < 91) {
                Object var5 = null;
                kc.a((mf) null, (ra) null, -127, -72);
            }
            ck.a(-2196, param0);
            bm.a((byte) -70, param0);
            e.a(param0, 115);
            ul.a(-37);
            fl.e(-41);
            ld.field_t = -rn.field_i;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "kc.D(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = (int)((Math.exp((double)((float)(-((kc) this).field_k) / 20.0f)) - Math.exp(-2.0)) * 200.0);
        int var6 = this.a((byte) 116);
        al.a(param2 - -((((kc) this).field_l >> 8) / param0), var6 / (param0 << 1), (-((kc) this).field_k + 40 << 8) / 40, var5, -94, var6 / param0, (((kc) this).field_m >> 8) / param0 + param1);
        if (param3) {
            return;
        }
        boolean discarded$0 = ((kc) this).c((byte) -61);
    }

    final static jp[] a(int param0, boolean param1) {
        jp[] var3 = new jp[9];
        jp[] var2 = var3;
        if (param1) {
            gb discarded$0 = kc.a((byte) -5, false);
        }
        var3[4] = hd.a(param0, 64, (byte) -6);
        return var2;
    }

    private final int a(byte param0) {
        int var2 = -80;
        return ((kc) this).field_k * (-((kc) this).field_k + 100) / 20 + -5;
    }

    final static gb a(byte param0, boolean param1) {
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        pi var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          var8 = jl.field_e;
          var2 = var8;
          var3 = var8.l(param0 + 188);
          gj.field_a = 127 & var3;
          if (param0 == 67) {
            break L0;
          } else {
            jp[] discarded$1 = kc.a(73, true);
            break L0;
          }
        }
        L1: {
          if ((var3 & 128) == 0) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          ji.field_f = stackIn_5_0 != 0;
          nh.field_b = var8.l(255);
          an.field_k = var8.g(-32768);
          if (gj.field_a == 2) {
            gb.field_h = var8.i(65280);
            vq.field_H = var8.e((byte) -34);
            break L2;
          } else {
            gb.field_h = 0;
            vq.field_H = 0;
            break L2;
          }
        }
        L3: {
          if (var8.l(255) != 1) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_13_0;
          dp.field_t = var8.d(-1);
          if (var4 != 0) {
            nd.field_g = var8.d(-1);
            break L4;
          } else {
            nd.field_g = dp.field_t;
            break L4;
          }
        }
        L5: {
          L6: {
            if (1 == gj.field_a) {
              break L6;
            } else {
              if (4 == gj.field_a) {
                break L6;
              } else {
                ka.field_E = 0;
                sl.field_y = null;
                break L5;
              }
            }
          }
          ka.field_E = var8.i(param0 ^ 65347);
          sl.field_y = var8.d(-1);
          break L5;
        }
        gd.field_d = bj.a(80, (byte) 76, (wq) (Object) var8);
        rn.field_m = null;
        return new gb(false);
    }

    kc(int param0, int param1) {
        ((kc) this).field_m = param0;
        ((kc) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for music";
        field_o = "Average rating";
    }
}
