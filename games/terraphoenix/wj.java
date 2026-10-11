/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static String field_e;
    static t field_c;
    static int field_a;
    static String field_d;
    static String field_b;
    static String field_f;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 <= 2) {
          return;
        }
        field_e = null;
        field_f = null;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = Terraphoenix.field_V;
        if (me.field_o <= 0) {
          var2 = (bk.c(-25704)) ? 0 : 1;
        } else {
          if (null == ab.field_b) {
            a.field_b = jb.a(480, 640, 0, 0, (byte) 112, nj.field_l);
          } else {
            a.field_b = ab.field_b.b(0);
            ig.a(2, 12);
          }
          if (null != a.field_b) {
            am.a((byte) -114, a.field_b);
            var2 = 2;
          } else {
            var2 = 3;
          }
        }
        if (ab.field_b == null &&
          hf.field_t) {
          ja.a(param0 ^ 124, param1, var2);
        }
        if (param0 != 2) {
          wj.a(8, true);
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, boolean param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_45_0 = false;
          boolean stackIn_48_0 = false;
          int stackIn_76_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_95_0 = 0;
          int stackIn_97_0 = 0;
          RuntimeException stackIn_100_0 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
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
          var9 = Terraphoenix.field_V;
          try {
            if (ig.field_e == null &&
              !le.a(param0, (byte) 117)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (va.field_e == mh.field_a) {
              if (param0) {
                var10 = (String) null;
                am.field_K = nh.a(oj.field_y, false, -95, param2, (String) null);
              } else {
                am.field_K = ji.a(-1, param3, false, param2);
              }
              di.field_l.field_k = 0;
              di.field_l.i(14, 28);
              di.field_l.i(am.field_K.c(0).field_c, -115);
              bc.a(-1, 0);
              mh.field_a = s.field_c;
            }
            if (param1 != 29398) {
              wj.a(-111);
            }
            if (mh.field_a == s.field_c &&
              vc.a(-113, 1)) {
              var6_int = mk.field_j.a(-16384);
              mk.field_j.field_k = 0;
              if (0 != var6_int) {
                qk.field_b = var6_int;
                mh.field_a = vf.field_c;
                qh.field_d = -1;
              } else {
                mh.field_a = cb.field_J;
              }
            }
            if (mh.field_a == cb.field_J &&
              vc.a(-110, 8)) {
              kd.field_c = mk.field_j.h((byte) 78);
              mk.field_j.field_k = 0;
              gj.a(param0, param4, 1, am.field_K, param5);
              mh.field_a = af.field_b;
            }
            boolean decompiledFrameRemainder0 = true;
            if (mh.field_a == af.field_b &&
              vc.a(-115, 1)) {
              var6_intLifetime1 = mk.field_j.a(param1 - 45782);
              og.field_e = null;
              qk.field_b = var6_intLifetime1;
              mk.field_j.field_k = 0;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  mh.field_a = vf.field_c;
                  qh.field_d = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  gb.g(-17464);
                  vj.field_Q = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                mh.field_a = gb.field_B;
                qh.field_d = -1;
              }
            }
            if (gb.field_B == mh.field_a &&
              cm.b((byte) -61)) {
              oj.field_y = mk.field_j.h((byte) 78);
              mm.field_e = mk.field_j.a(-16384);
              mk.field_j.a(param1 ^ -19754);
              me.field_o = mk.field_j.i(param1 - 54976);
              var6 = mk.field_j.j(param1 ^ -1915102434);
              var7 = mk.field_j.a(param1 ^ -19754);
              if (0 != (var7 & 1)) {
                wh.b(96);
              }
              if (!param0) {
                stackIn_45_0 = ((4 & var7) != 0);
                si.field_gb = stackIn_45_0;
                stackIn_48_0 = (0 != (8 & var7));
                fh.field_g = stackIn_48_0;
                if (!fh.field_g) {
                }
              }
              if (hf.field_x) {
                mk.field_j.a(-16384);
                mk.field_j.a(-16384);
                mk.field_j.f((byte) -107);
                kf.field_g = mk.field_j.i(param1 ^ -4416);
                r.field_O = new byte[kf.field_g];
                for (var8 = 0; kf.field_g > var8; var8++) {
                  r.field_O[var8] = mk.field_j.f(2);
                }
              }
              kj.field_f = mk.field_j.e(-1);
              var11 = (CharSequence) ((Object) kj.field_f);
              jj.field_e = hm.a((byte) 2, var11);
              db.field_b = mk.field_j.a(-16384);
              mh.field_a = od.field_g;
              if (am.field_K.c(0) != rj.field_a) {
                if (am.field_K.c(param1 ^ 29398) == hf.field_s) {
                  gf.field_u.a(dg.a(false), (byte) 117);
                }
              } else {
                te.field_g.a(dg.a(false), (byte) 117);
              }
              vj.field_Q = false;
              if (var6 != null) {
                hk.a(var6, (byte) 3, dg.a(false));
              }
              if (0 >= me.field_o &&
                !si.field_gb) {
                try {
                  cd.a((byte) -128, "unzap", dg.a(false));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  cd.a(dg.a(false), "zap", new Object[]{hi.a(oj.field_y, param1 - 41780)}, 10056);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (me.field_o > 0) {
                jm.field_c = true;
              }
              di.field_l.a(ab.field_g, 16888);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                ab.field_g[var8Lifetime1] = ab.field_g[var8Lifetime1] + 50;
              }
              mk.field_j.a(ab.field_g, 16888);
              stackIn_76_0 = qk.field_b;
              return stackIn_76_0;
            }
            if (vf.field_c == mh.field_a &&
              cm.b((byte) -39)) {
              gb.g(-17464);
              if (qk.field_b == 7 &&
                !vj.field_Q) {
                vj.field_Q = true;
                stackIn_87_0 = -1;
                return stackIn_87_0;
              }
              if (7 == qk.field_b) {
                qk.field_b = 3;
              }
              bh.field_d = mk.field_j.e(-1);
              vj.field_Q = false;
              stackIn_85_0 = qk.field_b;
              return stackIn_85_0;
            }
            if (null == ig.field_e) {
              if (vj.field_Q) {
                if (30000L >= ce.b(1)) {
                  bh.field_d = cl.field_I;
                } else {
                  bh.field_d = qk.field_f;
                }
                vj.field_Q = false;
                stackIn_95_0 = 3;
                return stackIn_95_0;
              }
              var6_intLifetime2 = sb.field_i;
              sb.field_i = pg.field_f;
              pg.field_f = var6_intLifetime2;
              vj.field_Q = true;
            }
            stackIn_97_0 = -1;
            return stackIn_97_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_100_0 = var6_ref;
            stackIn_100_1 = new StringBuilder().append("wj.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
            if (param3 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static int a(int param0) {
        if (param0 >= -17) {
          field_c = (t) null;
        }
        return ng.field_t;
    }

    static {
        field_e = "Mission ";
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_d = "Sergeant ";
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_c = new t();
    }
}
