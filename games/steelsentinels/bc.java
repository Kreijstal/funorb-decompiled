/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends jf implements qn {
    static wk field_wb;
    private tl field_zb;
    static wk field_sb;
    static String field_mb;
    static int[] field_ob;
    static wk field_ub;
    private int field_tb;
    static wk field_qb;
    static String field_xb;
    static byte[][] field_vb;
    static wk field_pb;
    static String field_yb;
    static wk[] field_rb;
    static String field_nb;

    final static void a(String param0, ee param1, byte param2) {
        int var3 = 0;
        String[] var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        Object var9 = null;
        var8 = SteelSentinels.field_G;
        if ((ed.field_j ^ -1) == 1) {
          return;
        } else {
          L0: {
            if (param2 == 100) {
              break L0;
            } else {
              var9 = null;
              bc.a(32, 18, 86, -6, (wk) null, -101, -54);
              break L0;
            }
          }
          L1: {
            var3 = sn.field_j.field_zb - 20 + -pl.field_X.c("[" + db.a(pd.field_ab, -49, new String[2]));
            if (var3 >= pl.field_X.c(param0)) {
              sj.a(param1.field_bb[0], param0, 0, (byte) 21, (String) null, 1);
              ln.field_e = ln.field_e - 1;
              break L1;
            } else {
              var4 = ao.a(pl.field_X, new int[1], 18985, param0);
              var5 = var4;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var5.length) {
                  break L1;
                } else {
                  var7 = var5[var6];
                  sj.a(param1.field_bb[0], var7, 0, (byte) 21, (String) null, 1);
                  ln.field_e = ln.field_e - 1;
                  var6++;
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(boolean param0, int param1, boolean param2, me param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          dj.field_k[0] = rb.field_g.nextInt();
          dj.field_k[1] = rb.field_g.nextInt();
          ne.field_y.field_p = 0;
          dj.field_k[param1] = (int)(oa.field_G >> -619429920);
          dj.field_k[3] = (int)oa.field_G;
          ne.field_y.b(true, dj.field_k[0]);
          ne.field_y.b(true, dj.field_k[1]);
          ne.field_y.b(true, dj.field_k[2]);
          ne.field_y.b(true, dj.field_k[3]);
          jk.a(125, ne.field_y);
          ne.field_y.d(param4, 18);
          param3.a(ne.field_y, false);
          mm.field_g.field_p = 0;
          if (!param0) {
            mm.field_g.a((byte) 126, 16);
            break L0;
          } else {
            mm.field_g.a((byte) 120, 18);
            break L0;
          }
        }
        L1: {
          mm.field_g.field_p = mm.field_g.field_p + 2;
          var5 = mm.field_g.field_p;
          mm.field_g.b(true, kk.field_d);
          mm.field_g.b(-28875, og.field_b);
          var6 = 0;
          if (!ki.field_ib) {
            break L1;
          } else {
            var6 = var6 | 1;
            break L1;
          }
        }
        L2: {
          if (cd.field_a) {
            var6 = var6 | 4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2) {
            var6 = var6 | 8;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (on.field_k == null) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        L5: {
          mm.field_g.a((byte) 124, var6);
          var7 = gh.a(param1 ^ -82, wl.d((byte) -21));
          if (var7 != null) {
            break L5;
          } else {
            var7 = "";
            break L5;
          }
        }
        L6: {
          mm.field_g.a(var7, -67);
          if (null != on.field_k) {
            mm.field_g.a(13588, on.field_k);
            break L6;
          } else {
            break L6;
          }
        }
        qi.a(jd.field_ib, ne.field_y, (gi) (Object) mm.field_g, qe.field_d, 5);
        mm.field_g.c(param1 ^ 28, -var5 + mm.field_g.field_p);
        gj.a(0, -1);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        cj.a(param0, k.field_Lb, (byte) 125, kc.field_z, 0, true, nj.field_S);
        if (param1 <= 94) {
            return;
        }
        for (var2 = 0; var2 < kc.field_z; var2++) {
            un.field_j[param0 + var2] = var2;
        }
        cj.a(param0 + param0, mj.field_cc, (byte) 125, kc.field_z - -param0, param0, false, ti.field_w);
        if (param0 < kc.field_z) {
            kc.field_z = param0;
        }
    }

    final static void a(long param0, String param1, int param2) {
        ib.field_b = param2;
        en.field_e = param1;
        CharSequence var5 = (CharSequence) (Object) param1;
        bk.field_U = ui.a(param2 ^ 3, var5);
        jn.field_g = true;
        ti.field_p = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, wk param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        param2 = param2 & 255;
        param1 = param1 & param6;
        var7 = param4.field_z;
        var8 = param3 * var7;
        var11 = param3;
        L0: while (true) {
          if (var11 >= param0) {
            return;
          } else {
            var9 = ((-var11 + param0) * param1 + (var11 - param3) * param2) / (param0 + -param3);
            var9 = var9 * 65793;
            var10 = 0;
            L1: while (true) {
              if (var7 <= var10) {
                var8 = var8 + var7;
                var11++;
                continue L0;
              } else {
                if (param5 == param4.field_E[var10 + var8]) {
                  param4.field_E[var10 + var8] = var9;
                  var10++;
                  continue L1;
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, tl param1) {
        if (!param0) {
            return;
        }
        ((bc) this).field_zb = param1;
    }

    final void k(int param0) {
        super.k(-118);
        int var2 = -88 / ((param0 - -37) / 43);
        if (((bc) this).field_zb != null) {
            ((bc) this).field_zb.a(-17382);
        }
    }

    public final tl a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((bc) this).field_zb;
    }

    public static void i(byte param0) {
        field_wb = null;
        field_qb = null;
        field_vb = null;
        field_ob = null;
        if (param0 >= -36) {
            return;
        }
        field_nb = null;
        field_xb = null;
        field_mb = null;
        field_rb = null;
        field_sb = null;
        field_yb = null;
        field_pb = null;
        field_ub = null;
    }

    bc(String param0, tn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, lh param2, int param3) {
        super.a(param0, 112, param2, param3);
        if (param1 < 56) {
            field_wb = null;
        }
        ((bc) this).field_tb = oh.field_f - (((bc) this).field_o + param0);
    }

    final String e(int param0) {
        if (!((bc) this).field_C) {
            return null;
        }
        if (null == ((bc) this).field_v) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        hk.a(pi.field_c, oh.field_f + ((bc) this).field_x + -((bc) this).field_tb, 17237);
        return ((bc) this).field_v;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = "Error connecting to server. Please try using a different server.";
        field_vb = new byte[50][];
        field_xb = "Who can join";
        field_yb = "To disable this control, click on <col=1f76a6><%0></col> in the options menu.";
        field_nb = "Empty slot";
    }
}
