/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends ri {
    static String[] field_y;
    static volatile boolean field_A;
    static int field_w;
    static String field_C;
    static String field_D;
    static tf field_B;
    static byte[] field_x;
    static String[][] field_z;

    final static void a(int param0, int param1) {
        hn var2 = null;
        hn var2Lifetime1;
        if (param0 == 65536) {
          var2 = new hn(1, new int[]{param1});
          ii.a(var2, 69);
          return;
        }
        rp.a(false, -70);
        var2Lifetime1 = new hn(1, new int[]{param1});
        ii.a(var2Lifetime1, 69);
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 == 1) {
          if (rd.a(-16143, param1)) {
            return 29;
          }
          if (param2 <= -123) {
            return sr.field_j[param0];
          }
          return -2;
        }
        if (param2 <= -123) {
          return sr.field_j[param0];
        }
        return -2;
    }

    final static int a(boolean param0, int param1) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          nq.field_I = nq.field_I + 65536;
          if (param1 != -587) {
            rp.b(-111);
          }
          while (bd.a(vp.field_a, false, nq.field_I) >= 65536) {
            nq.field_I = nq.field_I - vp.field_a;
          }
          var2_int = -1;
          if (wo.field_n != null) {
            var2_int = wo.field_n.length;
          } else {
            if (null != sb.field_b) {
              var2_int = sb.field_b.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (vp.field_f > ig.field_g) {
              ig.field_g = ig.field_g + 1;
              if (vp.field_c < ig.field_g && (wo.field_n == null ||
                wo.field_n[ps.field_e] == null)) {
                ig.field_g = ig.field_g - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ig.field_g >= vp.field_f &&
                  null == wo.field_n[(ps.field_e + 1) % var2_int]) {
                  ig.field_g = ig.field_g - 1;
                }
              }
            }
            if (vp.field_f <= ig.field_g) {
              ig.field_g = ig.field_g - vp.field_f;
              if (sm.field_m) {
                ps.field_e = ps.field_e + 1;
                if (ps.field_e >= var2_int) {
                  ps.field_e = ps.field_e - var2_int;
                }
              } else {
                ps.field_e = ps.field_e - 1;
                if (ps.field_e < 0) {
                  ps.field_e = ps.field_e + var2_int;
                }
              }
            }
            if (vp.field_c < ig.field_g) {
              sm.field_m = true;
            }
          }
          if (null != ga.field_E) {
            var3 = -(ga.field_E.field_v / 2) + 357;
            var4 = 0;
            if (0 != wj.field_A &&
              vc.field_y > var3 &&
              ga.field_E.field_w + var3 > vc.field_y) {
              if (269 - ga.field_E.field_q < sm.field_q &&
                sm.field_q < 269) {
                sm.field_m = false;
                ig.field_g = vp.field_f;
                var4 = 1;
              }
              if (sm.field_q > 586 &&
                sm.field_q < ga.field_E.field_q + 586) {
                ig.field_g = vp.field_f;
                var4 = 1;
                sm.field_m = true;
              }
            }
            if (var4 == 0 &&
              ig.field_g > vp.field_c &&
              var3 < n.field_m &&
              var3 + ga.field_E.field_w > n.field_m) {
              if (el.field_A > 269 - ga.field_E.field_q &&
                269 > el.field_A) {
                ig.field_g = vp.field_c;
              }
              if (el.field_A > 586 &&
                el.field_A < ga.field_E.field_q + 586) {
                ig.field_g = vp.field_c;
              }
            }
          }
          if (!param0) {
            return 0;
          }
          fp.field_l.a(-21174, vp.a(n.field_m, el.field_A, (byte) 98), vp.a(vc.field_y, sm.field_q, (byte) 69));
          if (fp.field_l.c(-1)) {
            if (fp.field_l.field_e == 0) {
              stackIn_58_0 = 3;
              return stackIn_58_0;
            }
            if (fp.field_l.field_e == 1) {
              stackIn_61_0 = 2;
              return stackIn_61_0;
            }
          }
          stackIn_64_0 = -59;
          while (true) {
            if (!nk.$cfr$intArgs$b$c4997cb15529(stackIn_64_0)) {
              stackIn_77_0 = 0;
              return stackIn_77_0;
            }
            fp.field_l.a(0, true);
            if (fp.field_l.c(param1 ^ 586)) {
              if (fp.field_l.field_e == 0) {
                stackIn_69_0 = 3;
                return stackIn_69_0;
              }
              if (1 == fp.field_l.field_e) {
                stackIn_72_0 = 1;
                return stackIn_72_0;
              }
            }
            if (cc.field_e != 13) {
              stackIn_64_0 = -59;
              continue;
            }
            break;
          }
          stackIn_75_0 = 1;
          return stackIn_75_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "rp.BA(" + param0 + ',' + param1 + ')');
        }
    }

    private rp(hu param0, int param1) {
        super(param0, param1);
    }

    final String b(byte param0, fd param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -38) {
            field_D = (String) null;
          }
          stackIn_3_0 = ce.a('*', (byte) 48, param1.field_q.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rp.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static ff[] b(int param0) {
        if (param0 == -27666) {
          return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
        }
        field_A = true;
        return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
    }

    rp(int param0) {
        this(gf.field_a, param0);
    }

    public static void a(int param0) {
        field_C = null;
        field_z = (String[][]) null;
        field_y = null;
        field_B = null;
        field_D = null;
        field_x = null;
        if (param0 < 84) {
          rp.a(114, -72, -26);
          return;
        }
    }

    static {
        field_y = new String[]{"Timelimit", "Facebook", "Gamemode", "Tournament"};
        field_A = false;
        field_C = "This player did not sell. He remains in your team.";
        field_D = "Computer";
        field_z = new String[][]{new String[]{"000000000000000cf00102040800f300000000000000000000000000000000000", "000000000000000000e1800e1800e100000000000000000000000000000000000", "000000000000000000e1840e18002000000000000000000000000000000000000", "00000000000000000021840e18402100000000000000000000000000000000000"}, new String[]{"000000000000000cf0c0030c0030f300000000000000000000000000000000000", "000000000000000000e1840e18402100000000000000000000000000000000000", "000000000000000000e1030c0030e100000000000000000000000000000000000", "00000000000000000022890a28c02200000000000000000000000000000000000"}};
    }
}
