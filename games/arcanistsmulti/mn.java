/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends rl {
    static String field_w;
    static String field_v;
    static String field_q;
    static int field_r;
    static kc[] field_s;
    static kc field_t;
    static ll field_y;
    private rn field_u;
    static String field_x;

    final eh a(String param0, int param1) {
        pd var4 = null;
        int var3 = 85 % ((param1 - -50) / 36);
        if (((mn) this).field_u instanceof el) {
            var4 = ((el) (Object) ((mn) this).field_u).a(0);
            if (var4 != null) {
                if (!(var4.a(-88) == nn.field_s)) {
                    return ra.field_k;
                }
            }
        }
        return !param0.equals((Object) (Object) ((mn) this).field_u.field_g) ? ra.field_k : nn.field_s;
    }

    public static void d(byte param0) {
        field_w = null;
        field_t = null;
        int var1 = 20 % ((-64 - param0) / 51);
        field_x = null;
        field_q = null;
        field_v = null;
        field_y = null;
        field_s = null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        int var10 = 0;
        int stackIn_12_0 = 0;
        ec stackIn_17_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        ec stackOut_16_0 = null;
        ec stackOut_15_0 = null;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          var1 = bj.field_tb + -bk.field_I;
          bk.field_I = af.field_Eb + -(var1 >> 1064012897);
          qe.field_o = -(ih.field_b >> -471074783) + ub.field_g;
          bj.field_tb = bk.field_I - -var1;
          if (param0 == -1) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        var2 = qe.field_o;
        var3 = 0;
        L1: while (true) {
          if (var3 >= pm.field_f.length) {
            return;
          } else {
            L2: {
              var4 = ln.field_M[var3];
              if ((var4 ^ -1) <= -1) {
                if (wl.field_S.field_h != var4) {
                  var5 = wm.field_I;
                  break L2;
                } else {
                  var5 = pn.field_d;
                  break L2;
                }
              } else {
                var5 = ql.field_a;
                break L2;
              }
            }
            L3: {
              var6 = pm.field_f[var3];
              if (0 > var4) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var7 = lc.a(stackIn_12_0 != 0, var6, (byte) -83);
              var8 = af.field_Eb + -(var7 >> -1090047327);
              if ((var4 ^ -1) <= -1) {
                L5: {
                  var2 = var2 + ic.field_a;
                  if (wl.field_S.field_h != var4) {
                    stackOut_16_0 = kg.field_h;
                    stackIn_17_0 = stackOut_16_0;
                    break L5;
                  } else {
                    stackOut_15_0 = vf.field_s;
                    stackIn_17_0 = stackOut_15_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = (ec) (Object) stackIn_17_0;
                  if (var9 == null) {
                    break L6;
                  } else {
                    var9.a(var8 - f.field_h, var2, param0 ^ 114, var7 + (f.field_h << -1690882271), tm.field_b - -(uk.field_d << -279471647));
                    break L6;
                  }
                }
                var2 = var2 + uk.field_d;
                break L4;
              } else {
                break L4;
              }
            }
            if (0 <= var4) {
              vd.field_c.a(var6, var8, mh.field_H + var2, var5, -1);
              var2 = var2 + (ic.field_a + (uk.field_d - -tm.field_b));
              var3++;
              continue L1;
            } else {
              ob.field_T.a(var6, var8, var2 + lj.field_k, var5, -1);
              var2 = var2 + u.field_l;
              var3++;
              continue L1;
            }
          }
        }
    }

    mn(rn param0, rn param1) {
        super(param0);
        ((mn) this).field_u = param1;
    }

    final String a(String param0, byte param1) {
        pd var3 = null;
        if (!(!(((mn) this).field_u instanceof el))) {
            var3 = ((el) (Object) ((mn) this).field_u).a(0);
            if (var3 != null) {
                if (var3.a(-69) == nn.field_s) {
                    if (!(param0.equals((Object) (Object) ((mn) this).field_u.field_g))) {
                        return lf.field_i;
                    }
                }
                return var3.c(26146);
            }
        }
        if (!param0.equals((Object) (Object) ((mn) this).field_u.field_g)) {
            return lf.field_i;
        }
        if (param1 < -114) {
            return null;
        }
        Object var4 = null;
        String discarded$0 = ((mn) this).a((String) null, (byte) -98);
        return null;
    }

    final static void e(int param0) {
        if (null != wd.field_a) {
            wn.field_D = wd.field_a;
            sa.field_Cb = lo.field_y;
            wn.field_D.field_J = -1;
            wd.field_a = null;
            lo.field_y = null;
            wn.field_D.field_eb = -1;
        }
        ck.field_d = null;
        tm.field_d = null;
        bi.field_U = null;
        if (param0 < 78) {
            mn.e(18);
        }
        ef.field_r = true;
        hf.field_f = null;
        ih.field_d = null;
    }

    final static void a(boolean param0, int param1) {
        to.a(param0, (byte) 124);
        uh.a(param0, 116);
        int var2 = -38 / ((28 - param1) / 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Next";
        field_v = "Reading Book of Underdark";
        field_q = "Bolts:";
        field_x = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
