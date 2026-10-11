/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_n;
    static int[] field_j;
    static int[][] field_i;
    static int[] field_l;
    String field_a;
    static cj field_m;
    static boolean field_k;
    int field_g;
    String field_f;
    static String field_e;
    static int[] field_b;
    String field_h;
    ul field_d;
    static int field_c;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int stackIn_10_0 = 0;
        cj stackIn_24_0 = null;
        String stackIn_25_1 = null;
        cj stackIn_27_0 = null;
        String stackIn_28_1 = null;
        String stackIn_57_0 = null;
        cj stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        boolean stackIn_69_2 = false;
        cj stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        boolean stackIn_74_2 = false;
        cj stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        boolean stackIn_79_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        cj var5 = null;
        cj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        cj var15 = null;
        String var16 = null;
        cj var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          mf.a(sq.field_Q, false);
          if (ej.field_n != null) {
            var15 = en.field_b;
            var17 = var15;
            en.field_b.field_z = 0;
            var17.field_zb = 0;
            var5 = gb.field_a;
            gb.field_a.field_z = 0;
            var5.field_zb = 0;
            var6 = eb.field_B;
            eb.field_B.field_z = 0;
            var6.field_zb = 0;
            field_m.field_wb = mk.field_l.toUpperCase();
            var7 = (2 + fc.field_a.field_zb) / 2;
            eb.field_B.a(40, -40 + fc.field_a.field_z, -2 + var7, 0, -3344);
            gb.field_a.a(40, fc.field_a.field_z - 40, fc.field_a.field_zb - var7, var7, -3344);
            if (qo.field_r.length == 1 &&
              qo.field_r[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < qo.field_r.length) {
                  stackIn_10_0 = ((fg.field_k[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_10_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    qo.field_r[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            gb.field_a.field_Z = true;
            if (la.field_k) {
              sk.field_i.field_wb = qd.field_K;
              jp.field_b.field_Z = false;
              if (var8 != 0) {
                stackIn_57_0 = vc.field_c;
              } else {
                stackIn_57_0 = po.field_f;
              }
              var16 = stackIn_57_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = eb.field_B.field_yb.a(var16) + 3 * eb.field_B.field_yb.a('.');
              eb.field_B.field_R = 0;
              eb.field_B.field_V = (-var10Lifetime1 + eb.field_B.field_zb) / 2;
              if ((48 & qj.field_i) == 16) {
                var9 = var16 + ".";
              }
              if ((48 & qj.field_i) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & qj.field_i) == 48) {
                var9 = (String) (var9) + "...";
              }
              eb.field_B.field_wb = (String) (var9);
              gb.field_a.field_wb = gk.field_a.toUpperCase();
            } else {
              stackIn_24_0 = gb.field_a;
              if (var8 == 0) {
                stackIn_25_1 = qa.field_n;
              } else {
                stackIn_25_1 = dk.field_Jb;
              }
              stackIn_24_0.field_wb = ((String) (Object) stackIn_25_1).toUpperCase();
              stackIn_27_0 = sk.field_i;
              if (var8 == 0) {
                stackIn_28_1 = dq.field_i;
              } else {
                stackIn_28_1 = ol.field_l;
              }
              stackIn_27_0.field_wb = vl.a(stackIn_28_1, new String[]{gb.field_a.field_wb}, 2);
              jp.field_b.field_Z = true;
              eb.field_B.field_wb = ob.field_t;
              dj.field_l = true;
              if (null != iq.field_b) {
                lp.field_p = false;
                dj.field_l = false;
                if (null == rl.field_v) {
                  ll.field_c = new boolean[kj.field_h];
                  rl.field_v = new byte[kj.field_h];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < kj.field_h) {
                  ll.field_c[var13] = false;
                  var13++;
                }
                bh.a(-1712, -1, 0, ej.field_n, true, kj.field_h, -1, -1);
                if (!(2 > kj.field_q) &&
                  lc.field_m[12]) {
                  dj.field_l = true;
                }
              }
              if (!dj.field_l) {
                gb.field_a.field_Z = false;
                if (gb.field_a.field_pb) {
                  var9 = null;
                  if (lp.field_p) {
                    var9 = "<col=A00000>" + gi.field_n + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; kj.field_h > var10Lifetime1; var10Lifetime1++) {
                    if (ll.field_c[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + cf.field_f[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  ui.field_j = "<col=A00000>" + ke.field_k + "<br>" + fn.field_g + (String) (var9);
                }
              }
            }
          }
          stackIn_68_0 = mh.field_i;
          stackIn_68_1 = -11838;
          stackIn_69_2 = (param1) && (!param2) && (!io.field_b);
          ((cj) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_69_2);
          stackIn_73_0 = fc.field_a;
          stackIn_73_1 = -11838;
          stackIn_74_2 = (param1) && (!param2) && (!io.field_b);
          ((cj) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_74_2);
          stackIn_78_0 = qf.field_b;
          stackIn_78_1 = -11838;
          stackIn_79_2 = (param1) && (!param2) && (io.field_b);
          ((cj) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_79_2);
          if (!param3) {
            return;
          }
          em.field_U.field_c.h(-56);
          if (null != ej.field_n) {
            if (jp.field_b.field_T != 0) {
              jk.a(param0, 1);
            }
            if (gb.field_a.field_T != 0) {
              if (la.field_k) {
                ag.a(param0, (byte) 98);
              } else {
                uo.b(true, param0);
              }
            }
            ld.a(ej.field_n, true, param0, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "gg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0) {
        if (dj.field_k == id.field_B) {
          return mc.field_g;
        }
        if (param0 <= 0) {
          return (String) null;
        }
        if (!tg.field_g.d(-88)) {
          return tg.field_g.a(31027);
        }
        if (dj.field_k == ta.field_hb) {
          return tg.field_g.a(31027);
        }
        return fa.field_Ib;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 > -99) {
          return;
        }
        field_b = null;
        field_m = null;
        field_j = null;
        field_i = (int[][]) null;
        field_n = null;
        field_l = null;
    }

    private gg() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1) {
        if (mh.field_h > 0 &&
          ee.field_a) {
          oo.f(0, 0, oo.field_b, dq.field_k.field_qb);
          lm.field_gb.c(param1, -1);
        }
        if ((sq.field_Q > 0 || da.field_a > 0) &&
          io.field_b) {
          oo.f(0, 0, oo.field_b, dq.field_k.field_qb);
          qf.field_b.c(param1, -1);
        }
        int var2 = 2 / ((param0 + 11) / 49);
    }

    static {
        field_n = "Hide private chat and appear offline to friends";
        field_i = new int[36][];
        field_j = new int[36];
        field_l = new int[36];
        field_k = false;
        field_b = new int[36];
        field_e = "Decline invitation to <%0>'s game";
        field_b[0] = 6;
        field_l[0] = 0;
        field_b[1] = 8;
        field_j[0] = 4;
        field_l[1] = 6;
        field_j[1] = 4;
        field_b[2] = 10;
        field_l[2] = 18;
        field_b[3] = 3;
        field_j[2] = 7;
        field_l[3] = 12;
        field_j[3] = 4;
        field_b[25] = 11;
        field_l[25] = 30;
        field_j[25] = 4;
        field_b[30] = 11;
        field_l[30] = 30;
        field_j[30] = 4;
        field_b[16] = 3;
        field_l[16] = 12;
        field_j[16] = 4;
        field_b[10] = 8;
        field_l[10] = 24;
        field_j[10] = 3;
        field_b[11] = 20;
        field_l[11] = 24;
        field_b[4] = 20;
        field_j[11] = 1;
        field_l[4] = 0;
        field_b[5] = 5;
        field_j[4] = 7;
        field_l[5] = 7;
        field_j[5] = 7;
        field_b[6] = 10;
        field_l[6] = 7;
        field_b[7] = 6;
        field_j[6] = 7;
        field_l[7] = 14;
        field_j[7] = 4;
        field_b[22] = 2;
        field_l[22] = 14;
        field_b[9] = 2;
        field_j[22] = 4;
        field_l[9] = 93;
        field_b[12] = 50;
        field_j[9] = 6;
        field_l[12] = 14;
        field_j[12] = 1;
        field_b[13] = 35;
        field_l[13] = 91;
        field_b[23] = 5;
        field_j[13] = 3;
        field_l[23] = 0;
        field_b[14] = 12;
        field_j[23] = 7;
        field_l[14] = 56;
        field_b[15] = 12;
        field_j[14] = 5;
        field_l[15] = 49;
        field_j[15] = 5;
        field_b[17] = 8;
        field_l[17] = 42;
        field_j[17] = 8;
        field_b[8] = 4;
        field_l[8] = 4;
        field_j[8] = 4;
        field_b[19] = 10;
        field_l[19] = 63;
        field_j[19] = 6;
        field_b[27] = 5;
        field_i[27] = new int[]{0, 1, 2, 3, 4, 3, 4, 3, 4, 3, 2};
        field_l[27] = 105;
        field_j[27] = field_i[27].length;
        field_b[28] = 12;
        field_l[28] = 49;
        field_i[28] = new int[]{0, 1, 2, 3, 4, 3, 4, 3, 2, 0};
        field_j[28] = field_i[28].length;
        field_b[24] = field_b[19];
        field_l[24] = field_l[19];
        field_j[24] = field_j[19];
        field_b[26] = field_b[14];
        field_l[26] = field_l[14];
        field_b[34] = field_b[15];
        field_j[26] = field_j[14];
        field_l[34] = field_l[15];
        field_b[31] = 5;
        field_j[34] = field_j[15];
        field_l[31] = 119;
        field_j[31] = 14;
        field_b[32] = 5;
        field_l[32] = 22;
        field_j[32] = 1;
        field_b[29] = 20;
        field_l[29] = 0;
        field_j[29] = 7;
        field_b[33] = 20;
        field_l[33] = 0;
        field_j[33] = 7;
    }
}
