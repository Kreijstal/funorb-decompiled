/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static String field_j;
    static String[] field_h;
    static wk field_e;
    static int field_i;
    static int field_c;
    static int field_d;
    static gh field_a;
    int field_g;
    static String field_f;
    static wk[] field_k;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != -1) {
          field_e = (wk) null;
        }
        return gb.field_c.b(64);
    }

    final static String a(boolean param0) {
        if (cb.field_j == nj.field_ab) {
          return bk.field_ab;
        }
        if (nj.field_ab == jn.field_b) {
          return kh.field_z;
        }
        if (!gf.field_a.a((byte) -72)) {
          return kh.field_z;
        }
        if (!param0) {
          field_e = (wk) null;
        }
        return cc.field_Xb;
    }

    final static int a(int param0, int param1, String param2, boolean param3, boolean param4, String param5) {
        try {
          int stackIn_7_0 = 0;
          int stackIn_33_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_55_0 = false;
          int stackIn_86_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_108_0 = 0;
          RuntimeException stackIn_111_0 = null;
          StringBuilder stackIn_111_1 = null;
          String stackIn_112_2 = null;
          StringBuilder stackIn_114_1 = null;
          String stackIn_115_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = SteelSentinels.field_G;
          try {
            if (param0 > -98) {
              field_d = -13;
            }
            if (null == rb.field_h &&
              !rc.a(127, param4)) {
              stackIn_7_0 = -1;
              return stackIn_7_0;
            }
            if (lj.field_d == rn.field_v) {
              if (param4) {
                var10 = (String) null;
                ic.field_T = qi.a(false, li.field_w, param5, 0, (String) null);
              } else {
                ic.field_T = ak.a(param2, param5, -20407, false);
              }
              mm.field_g.field_p = 0;
              mm.field_g.a((byte) 115, 14);
              mm.field_g.a((byte) 109, ic.field_T.a((byte) 121).field_e);
              gj.a(0, -1);
              rn.field_v = f.field_D;
            }
            if (rn.field_v == f.field_D &&
              ve.a((byte) -127, 1)) {
              var6_int = rf.field_d.f((byte) -55);
              rf.field_d.field_p = 0;
              if (var6_int == 0) {
                rn.field_v = od.field_d;
              } else {
                jg.field_f = -1;
                rn.field_v = mn.field_G;
                ch.field_N = var6_int;
              }
            }
            if (rn.field_v == od.field_d &&
              ve.a((byte) -108, 8)) {
              oa.field_G = rf.field_d.g((byte) -115);
              rf.field_d.field_p = 0;
              bc.a(param4, 2, param3, ic.field_T, param1);
              rn.field_v = uf.field_g;
            }
            boolean decompiledFrameRemainder0 = true;
            if (rn.field_v == uf.field_g &&
              ve.a((byte) -86, 1)) {
              var6_intLifetime1 = rf.field_d.f((byte) -68);
              rf.field_d.field_p = 0;
              on.field_k = null;
              ch.field_N = var6_intLifetime1;
              if (0 != var6_intLifetime1 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  jg.field_f = -1;
                  rn.field_v = mn.field_G;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  pm.m(-123);
                  ui.field_T = false;
                  stackIn_33_0 = var6_intLifetime1;
                  return stackIn_33_0;
                }
              }
              if (decompiledFrameRemainder0) {
                jg.field_f = -1;
                rn.field_v = wl.field_N;
              }
            }
            if (wl.field_N == rn.field_v &&
              pm.n(121)) {
              li.field_w = rf.field_d.g((byte) -101);
              gj.field_b = param5;
              ul.field_d = rf.field_d.f((byte) -65);
              di.field_h = rf.field_d.f((byte) -54);
              rd.field_b = rf.field_d.c((byte) -60);
              var6 = rf.field_d.g(-122);
              var7 = rf.field_d.f((byte) -128);
              if (0 != (1 & var7)) {
                ed.b((byte) -105);
              }
              stackIn_44_0 = ((16 & var7) != 0);
              kj.field_B = stackIn_44_0;
              if (!param4) {
                stackIn_49_0 = ((8 & var7) != 0);
                fj.field_e = stackIn_49_0;
                stackIn_52_0 = (0 != (2 & var7));
                uc.field_g = stackIn_52_0;
                stackIn_55_0 = (0 != (4 & var7));
                ok.field_g = stackIn_55_0;
                if (fj.field_e) {
                  uc.field_g = true;
                }
              }
              if (cd.field_a) {
                rf.field_d.f((byte) -118);
                rf.field_d.f((byte) -83);
                rf.field_d.i(0);
                ag.field_q = rf.field_d.c((byte) -60);
                nj.field_Y = new byte[ag.field_q];
                for (var8 = 0; var8 < ag.field_q; var8++) {
                  nj.field_Y[var8] = rf.field_d.d((byte) -2);
                }
              }
              g.field_l = rf.field_d.h(1);
              var11 = (CharSequence) ((Object) g.field_l);
              ng.field_r = ui.a(1, var11);
              ua.field_o = rf.field_d.f((byte) -106);
              rn.field_v = jd.field_sb;
              if (ic.field_T.a((byte) 69) == nk.field_F) {
                qd.field_o.a(-48, wl.d((byte) -21));
              } else {
                if (ic.field_T.a((byte) 108) == ol.field_Sb) {
                  mj.field_Vb.a(-70, wl.d((byte) -21));
                }
              }
              ui.field_T = false;
              if (var6 != null) {
                ri.a(var6, wl.d((byte) -21), 124);
              }
              if (0 >= rd.field_b &&
                !ok.field_g) {
                try {
                  hn.a(wl.d((byte) -21), (byte) -96, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  hn.a("zap", (byte) -41, wl.d((byte) -21), new Object[]{hh.a(li.field_w, (byte) 65)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < rd.field_b) {
                ki.field_ib = true;
              }
              mm.field_g.a(-1833430685, dj.field_k);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                dj.field_k[var8Lifetime1] = dj.field_k[var8Lifetime1] + 50;
              }
              rf.field_d.a(-1833430685, dj.field_k);
              stackIn_86_0 = ch.field_N;
              return stackIn_86_0;
            }
            if (mn.field_G == rn.field_v &&
              pm.n(110)) {
              pm.m(100);
              if (ch.field_N == 7 &&
                !ui.field_T) {
                ui.field_T = true;
                stackIn_98_0 = -1;
                return stackIn_98_0;
              }
              if (ch.field_N == 7) {
                ch.field_N = 3;
              }
              di.field_e = rf.field_d.h(1);
              ui.field_T = false;
              stackIn_96_0 = ch.field_N;
              return stackIn_96_0;
            }
            if (null == rb.field_h) {
              if (ui.field_T) {
                if (30000L >= ki.l(150)) {
                  di.field_e = bc.field_mb;
                } else {
                  di.field_e = kj.field_E;
                }
                ui.field_T = false;
                stackIn_105_0 = 3;
                return stackIn_105_0;
              }
              var6_intLifetime2 = ll.field_l;
              ll.field_l = fe.field_F;
              ui.field_T = true;
              fe.field_F = var6_intLifetime2;
            }
            stackIn_108_0 = -1;
            return stackIn_108_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_111_0 = var6_ref;
            stackIn_111_1 = new StringBuilder().append("jj.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_112_2 = "null";
            } else {
              stackIn_112_2 = "{...}";
            }
            stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_115_2 = "null";
            } else {
              stackIn_115_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_e = null;
        field_j = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (param0 > -116) {
          field_k = (wk[]) null;
        }
        field_k = null;
    }

    static {
        field_h = new String[]{"HEALTH", "<%0> kPm", "SHIELDS", "<%0> GJ", "ENERGY CAPACITY", "<%0> TJ", "ENERGY GENERATION", "<%0> GJ/s", "JUMP", "<%0>%", "THRUST", "<%0>%"};
        field_c = -1;
        field_j = "<%0> has entered another game.";
        field_e = new wk(28, 28);
        field_f = "Waiting for <%0> to start the game...";
        field_b = "You have been removed from <%0>'s game.";
    }
}
