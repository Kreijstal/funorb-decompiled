/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends hl {
    private String field_n;
    private String field_o;
    static int field_m;
    static String field_l;

    final void a(ec param0, byte param1) {
        if (param1 >= -5) {
            return;
        }
        param0.a(2, ((vl) this).field_o);
        param0.a(((vl) this).field_n, (byte) 101);
    }

    final static String c(int param0) {
        if (ql.field_f != ol.field_i) {
          if (ql.field_f == wd.field_d) {
            return bf.field_o;
          } else {
            if (param0 == -29455) {
              if (!im.field_b.b(36)) {
                return bf.field_o;
              } else {
                return co.field_C;
              }
            } else {
              vl.a(32, (byte) 15);
              if (!im.field_b.b(36)) {
                return bf.field_o;
              } else {
                return co.field_C;
              }
            }
          }
        } else {
          return ho.field_i;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 > -51) {
            vl.a(-115, (byte) 61);
        }
    }

    final static q[] d(int param0) {
        q[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        var1 = new q[dk.field_d];
        var2 = 0;
        L0: while (true) {
          if (dk.field_d <= var2) {
            if (param0 > -62) {
              String discarded$2 = vl.c(-93);
              sb.a(500);
              return var1;
            } else {
              sb.a(500);
              return var1;
            }
          } else {
            var1[var2] = new q(ce.field_x, tb.field_i, hg.field_t[var2], fe.field_g[var2], jc.field_f[var2], jn.field_k[var2], ub.field_q[var2], uo.field_b);
            var2++;
            continue L0;
          }
        }
    }

    final fd b(int param0) {
        int var2 = -64 / ((param0 - -56) / 41);
        return pe.field_j;
    }

    final static void a(int param0, byte param1) {
        Object var3 = null;
        L0: {
          if (!ed.c(true)) {
            if (param0 <= gm.field_d.field_K) {
              return;
            } else {
              gm.field_d.field_K = param0;
              ac.field_B.d((byte) -78, 72);
              ac.field_B.a(6, gm.field_d.field_K);
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (param1 != -49) {
          var3 = null;
          boolean discarded$2 = vl.a(105, 115, (int[]) null);
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 > -58) {
          L0: {
            field_l = null;
            if (-1 == (param2[param0 >> 15042597] & 1 << (param0 & 31))) {
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
            if (-1 == (param2[param0 >> 15042597] & 1 << (param0 & 31))) {
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

    vl(String param0, String param1) {
        ((vl) this).field_o = param0;
        ((vl) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_l = "This target is much less powerful than you, and is <%0>% more likely to wake.<br>(Renown gambled: <%1>)";
    }
}
