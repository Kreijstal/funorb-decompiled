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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 47) {
          L0: {
            field_o = null;
            int fieldTemp$4 = ((kc) this).field_k + 1;
            ((kc) this).field_k = ((kc) this).field_k + 1;
            if (fieldTemp$4 >= 40) {
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
            int fieldTemp$5 = ((kc) this).field_k + 1;
            ((kc) this).field_k = ((kc) this).field_k + 1;
            if (fieldTemp$5 >= 40) {
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
            throw qb.a((Throwable) (Object) runtimeException, "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (int)((Math.exp((double)((float)(-((kc) this).field_k) / 20.0f)) - Math.exp(-2.0)) * 200.0);
        var6 = this.a((byte) 116);
        al.a(param2 - -((((kc) this).field_l >> 8) / param0), var6 / (param0 << 1), (-((kc) this).field_k + 40 << 8) / 40, var5, -94, var6 / param0, (((kc) this).field_m >> 8) / param0 + param1);
        if (!param3) {
          boolean discarded$2 = ((kc) this).c((byte) -61);
          return;
        } else {
          return;
        }
    }

    final static jp[] a(int param0, boolean param1) {
        jp[] var2 = null;
        jp[] var3 = null;
        var3 = new jp[9];
        var2 = var3;
        if (param1) {
          gb discarded$2 = kc.a((byte) -5, false);
          var3[4] = hd.a(param0, 64, (byte) -6);
          return var2;
        } else {
          var3[4] = hd.a(param0, 64, (byte) -6);
          return var2;
        }
    }

    private final int a(byte param0) {
        int var2 = -80;
        return ((kc) this).field_k * (-((kc) this).field_k + 100) / 20 + -5;
    }

    final static gb a(byte param0, boolean param1) {
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pi var8 = null;
        wd var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
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
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
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
        if (param1) {
          var5 = var8.i(65280);
          try {
            L7: {
              L8: {
                var9 = nh.field_c.a(var5, true);
                gd.field_d = var9.h(-3);
                if (nd.field_g.equals((Object) (Object) tb.field_cb)) {
                  stackOut_23_0 = null;
                  stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                  break L8;
                } else {
                  stackOut_22_0 = var9.field_u;
                  stackIn_24_0 = stackOut_22_0;
                  break L8;
                }
              }
              rn.field_m = stackIn_24_0;
              break L7;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            rk.a("CC1", (Throwable) (Object) var6, param0 ^ 16);
            rn.field_m = null;
            gd.field_d = null;
            return new gb(param1);
          }
          return new gb(param1);
        } else {
          gd.field_d = bj.a(80, (byte) 76, (wq) (Object) var8);
          rn.field_m = null;
          return new gb(param1);
        }
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
