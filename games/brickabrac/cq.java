/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends nm {
    String[][] field_r;
    int field_s;
    static String field_i;
    int field_n;
    static String field_q;
    int field_l;
    boolean field_v;
    static int field_t;
    int field_j;
    int[][] field_u;
    static jp field_o;
    static int field_p;
    int field_m;
    int field_k;

    public static void a(byte param0) {
        field_q = null;
        field_o = null;
        if (param0 > -52) {
            return;
        }
        field_i = null;
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (param0 < 0) {
          if (0 != var2) {
            if (var2 >= 128) {
              if (-161 >= (var2 ^ -1)) {
                return (char)var2;
              } else {
                L0: {
                  var3 = ai.field_r[-128 + var2];
                  if (var3 != 0) {
                    break L0;
                  } else {
                    var3 = 63;
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          return '￪';
        }
    }

    final static void a(boolean param0, byte param1) {
        Object var3 = null;
        if (param1 >= -118) {
          L0: {
            var3 = null;
            cq.a(103, true, 42, (oi) null);
            if (null != ep.field_e) {
              pg.a(false, ep.field_e);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (bm.field_d != null) {
              bm.field_d.a((byte) -126, param0);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            de.a(param0, false);
            if (null != no.field_p) {
              no.field_p.a(true, param0);
              break L2;
            } else {
              break L2;
            }
          }
          eh.a(param0, true);
          return;
        } else {
          L3: {
            if (null != ep.field_e) {
              pg.a(false, ep.field_e);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (bm.field_d != null) {
              bm.field_d.a((byte) -126, param0);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            de.a(param0, false);
            if (null != no.field_p) {
              no.field_p.a(true, param0);
              break L5;
            } else {
              break L5;
            }
          }
          eh.a(param0, true);
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, oi param3) {
        String[] var5 = null;
        String[] stackIn_1_0 = null;
        String[] stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        String[] stackIn_2_0 = null;
        String[] stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        String[] stackIn_3_0 = null;
        String[] stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        String stackIn_3_3 = null;
        String[] stackOut_0_0;
        String[] stackOut_0_1;
        int stackOut_0_2;
        String[] stackOut_2_0;
        String[] stackOut_2_1;
        int stackOut_2_2;
        String stackOut_2_3;
        String[] stackOut_1_0;
        String[] stackOut_1_1;
        int stackOut_1_2;
        String stackOut_1_3;
        L0: {
          stackOut_0_0 = new String[1];
          stackOut_0_1 = new String[1];
          stackOut_0_2 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (tb.field_cb == null) {
            stackOut_2_0 = (String[]) (Object) stackIn_2_0;
            stackOut_2_1 = (String[]) (Object) stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = we.field_c;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (String[]) (Object) stackIn_1_0;
            stackOut_1_1 = (String[]) (Object) stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = tb.field_cb;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        stackIn_3_1[stackIn_3_2] = (String) (Object) stackIn_3_3;
        var5 = (String[]) (Object) stackIn_3_0;
        od.field_c = 13;
        fp.field_z = 57;
        og.field_Wb = 3;
        ep.field_i = 23;
        hg.field_e = 51550 + (hi.field_w.b(92) << -222260272);
        tm.field_g = 11;
        qm.field_a = 40;
        ek.field_kb = 72;
        ck.a((byte) 66);
        r.field_A = be.field_a;
        if (!r.field_A) {
          hd.a(true);
          pi.field_q = jj.field_d;
          if (param0 == 16727) {
            oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
            sk.a(var5, param2, param3, 1, param1, -12665);
            return;
          } else {
            field_t = 49;
            oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
            sk.a(var5, param2, param3, 1, param1, -12665);
            return;
          }
        } else {
          if (param3.field_b.field_h != 0) {
            hd.a(true);
            pi.field_q = jj.field_d;
            if (param0 == 16727) {
              oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
              sk.a(var5, param2, param3, 1, param1, -12665);
              return;
            } else {
              field_t = 49;
              oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
              sk.a(var5, param2, param3, 1, param1, -12665);
              return;
            }
          } else {
            if ((param2 ^ -1) >= -1) {
              if (param0 != 16727) {
                field_t = 49;
                oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
                sk.a(var5, param2, param3, 1, param1, -12665);
                return;
              } else {
                oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
                sk.a(var5, param2, param3, 1, param1, -12665);
                return;
              }
            } else {
              hd.a(true);
              pi.field_q = jj.field_d;
              if (param0 != 16727) {
                field_t = 49;
                oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
                sk.a(var5, param2, param3, 1, param1, -12665);
                return;
              } else {
                oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
                sk.a(var5, param2, param3, 1, param1, -12665);
                return;
              }
            }
          }
        }
    }

    cq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Kick <%0> from this game";
        field_i = "Names can only contain letters, numbers, spaces and underscores";
    }
}
