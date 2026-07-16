/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends jd {
    static int[] field_j;
    static String field_k;
    private ga field_n;
    private ga field_o;
    static String field_m;
    static boolean field_l;

    private final boolean b(String param0, byte param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var3 = ((lo) this).field_o.field_q.toLowerCase();
        if (param1 > -60) {
            return true;
        }
        String var4 = param0.toLowerCase();
        if (0 < var3.length()) {
            if (0 < var4.length()) {
                var5 = var3.lastIndexOf("@");
                if ((var5 ^ -1) <= -1) {
                    if (var3.length() - 1 <= var5) {
                        return false;
                    }
                    var6 = var3.substring(0, var5);
                    var7 = var3.substring(1 + var5);
                    if ((var4.indexOf(var6) ^ -1) <= -1) {
                        return true;
                    }
                    return 0 > var4.indexOf(var7) ? false : true;
                }
            }
        }
        return false;
    }

    lo(ga param0, ga param1, ga param2) {
        super(param0);
        ((lo) this).field_n = param1;
        ((lo) this).field_o = param2;
    }

    public static void c(byte param0) {
        if (param0 != -96) {
            lo.a(32, -1, 38, -7, 52, false);
        }
        field_k = null;
        field_m = null;
        field_j = null;
    }

    final rv a(String param0, int param1) {
        if (param1 != -5) {
            Object var5 = null;
            boolean discarded$0 = this.b((String) null, (byte) -69);
        }
        String var3 = ((lo) this).field_n.field_q.toLowerCase();
        String var4 = param0.toLowerCase();
        if (!(var4.length() != 0)) {
            return jt.field_Bb;
        }
        if (!(bi.a(var4, param1 + -32336, var3))) {
            return jt.field_Bb;
        }
        if (!(!this.b(param0, (byte) -77))) {
            return jt.field_Bb;
        }
        return he.field_yb;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var10 = Kickabout.field_G;
          if (gv.field_h != param2) {
            break L0;
          } else {
            if (param1 != jr.field_Kb) {
              break L0;
            } else {
              if (wi.field_C != param3) {
                break L0;
              } else {
                if (param4 != gb.field_K) {
                  break L0;
                } else {
                  if (rg.field_f != param5) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
        L1: {
          gb.field_K = param4;
          gv.field_h = param2;
          wi.field_C = param3;
          if (!param5) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L1;
          }
        }
        L2: {
          rg.field_f = stackIn_9_0 != 0;
          jr.field_Kb = param1;
          var6 = (100 * jr.field_Kb >> -1579258584) + 50;
          var7 = (116 * gv.field_h >> -1028605144) + 40;
          iw.a(-68, wn.field_j);
          on.b();
          pt.a(var7, -22914, 0, on.field_f, 0);
          tn.field_e.a(0, 0, tn.field_e.field_o * var7 / 140, tn.field_e.field_v);
          ta.e(124);
          pt.a(on.field_g, -22914, var7, on.field_f, 0);
          tn.field_e.d(-140 + var7, 0);
          ta.e(param0 + -706856552);
          if (rg.field_f) {
            var8 = 0;
            L3: while (true) {
              if (on.field_a.length <= var8) {
                break L2;
              } else {
                on.field_a[var8] = (var6 * on.field_a[var8] >> 1910864744) * 65793;
                var8++;
                continue L3;
              }
            }
          } else {
            var8 = 0;
            L4: while (true) {
              if (var8 >= on.field_a.length) {
                break L2;
              } else {
                on.field_a[var8] = 16777215 + -(257 * (var6 * on.field_a[var8] >> 1770599784));
                var8++;
                continue L4;
              }
            }
          }
        }
        L5: {
          ta.e(121);
          iw.a(65, iw.field_g);
          on.b();
          var8 = uv.b(-gb.field_K, wi.field_C, (byte) 2);
          if (param0 == 706856675) {
            break L5;
          } else {
            field_j = null;
            break L5;
          }
        }
        var9 = wn.field_j.field_o;
        sa.field_e = -(var9 * we.a(var8, false)) >> 800626257;
        lr.field_m = var9 * ei.a(var8, (byte) -23) >> -1204910319;
        wn.field_j.a(wn.field_j.field_o << 534975331, wn.field_j.field_v << 706856675, on.field_g << 1491629315, on.field_f << -1672132157, var8 << -1837277181, 4096);
        ta.e(118);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        CharSequence var3 = null;
        L0: {
          var2 = param1.getParameter("username");
          if (param0 <= -78) {
            break L0;
          } else {
            lo.a(110, 93, 93);
            break L0;
          }
        }
        L1: {
          if (var2 == null) {
            break L1;
          } else {
            var3 = (CharSequence) (Object) var2;
            if ((jc.a(var3, false) ^ -1L) != -1L) {
              return;
            } else {
              break L1;
            }
          }
        }
    }

    final static he a(long param0, boolean param1) {
        if (param1) {
            field_j = null;
        }
        return (he) (Object) pq.field_N.a(-3611, param0);
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte param4) {
        if (param4 != -55) {
            he discarded$0 = lo.a(124L, false);
        }
        int var5 = (int)(nj.a(-62) % 2000L * 100L) / 2000;
        var5 = (var5 - -(param0 * 100 >> 1946682832)) % 100;
        ut var6 = lt.field_c[var5];
        if (!param3) {
            var6.c(-(var6.field_o >> -2078193791) + param1, -(var6.field_v >> 1581116417) + param2);
        } else {
            var6.f(param1 + -(var6.field_o >> 1990978049), param2 - (var6.field_v >> 680860993));
        }
    }

    final String a(byte param0, String param1) {
        String var6 = ((lo) this).field_n.field_q.toLowerCase();
        String var4 = param1.toLowerCase();
        if (param0 != 25) {
            field_k = null;
        }
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!lg.a(var5, (byte) 79))) {
            return b.field_M;
        }
        if (hf.a(var5, -3)) {
            return ua.field_h;
        }
        if (!(!qe.a(true, var5))) {
            return tq.field_D;
        }
        if (this.b(param1, (byte) -67)) {
            return no.field_G;
        }
        if (0 < var6.length()) {
            if (j.a((byte) 71, var6, var5)) {
                return we.field_b;
            }
            if (!(!uj.a(68, var5, var6))) {
                return js.field_f;
            }
            if (!(!lj.a((byte) 69, var6, var5))) {
                return we.field_b;
            }
            return b.field_M;
        }
        return jq.field_c;
    }

    final static void a(int param0, int param1, int param2) {
        uo var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uo var11 = null;
        var10 = Kickabout.field_G;
        var11 = pb.field_C;
        var3 = var11;
        if (param2 > 44) {
          var4 = Math.max(((hu) (Object) var11).a(ns.field_d[0]), Math.max(((hu) (Object) var11).a(ns.field_d[3]), ((hu) (Object) var11).a(ns.field_d[4]))) + 20;
          var5 = Math.max(((hu) (Object) var11).a(ns.field_d[1]), ((hu) (Object) var11).a(ns.field_d[2])) + 20;
          var6 = var5 + var5 + var4;
          var7 = -(var6 >> 2031871105) + param1;
          var8 = -34 + param0;
          on.a(var7, var8, var4 + (var5 << -549638527), 69, 16777215, 30);
          on.h(var7 + -1, -1 + var8, 2 + (var4 - -(var5 << 486463937)), 71, 16777215, 128);
          var9 = 1;
          L0: while (true) {
            if (var9 >= 3) {
              on.f(var7 + var4, 4 + var8, 59, 16777215, 100);
              on.f(var4 + var7 + var5, 4 + var8, 59, 16777215, 100);
              var9 = 22 + var8 + -4;
              ((hu) (Object) var3).c(ns.field_d[0], var7 - (-var4 - -5), var9, 16777215, 65793);
              ((hu) (Object) var3).d(ns.field_d[1], (var5 >> -1534714495) + (var7 + var4), var9, 16777215, 65793);
              ((hu) (Object) var3).d(ns.field_d[2], (var5 >> 2474593) + (var5 + var7 - -var4), var9, 16777215, 65793);
              var9 += 22;
              ((hu) (Object) var3).c(ns.field_d[3], -5 + var7 - -var4, var9, 16777215, 65793);
              ((hu) (Object) var3).d("+30", (var5 >> -1099075359) + (var4 + var7), var9, 16777215, 65793);
              ((hu) (Object) var3).d("+3", -2 + var7 + (var4 + (var5 - -(var5 >> -1994115103))), var9, 16777215, 65793);
              var9 += 22;
              ((hu) (Object) var3).c(ns.field_d[4], -5 + (var4 + var7), var9, 16777215, 65793);
              ((hu) (Object) var3).d("-10", (var5 >> 1266386209) + (var4 + var7), var9, 16777215, 65793);
              ((hu) (Object) var3).d("0", -2 + (var4 + var7 - (-var5 + -(var5 >> 167076321))), var9, 16777215, 65793);
              return;
            } else {
              on.c(var7 - -4, var8 + (var9 * 22 + -1), -10 + var6, 16777215, 100);
              var9++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static li a(li[] param0, boolean param1, tm[] param2, String param3) throws dw {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        var6 = Kickabout.field_G;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param2.length) {
            L1: {
              var7 = new StringBuilder("The method " + param3 + "(");
              if (!param1) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (param0.length <= var5) {
                StringBuilder discarded$19 = var7.append(") is undefined.");
                throw new dw(var7.toString());
              } else {
                L3: {
                  if (!param0[var5].field_b) {
                    StringBuilder discarded$20 = var7.append(dr.a(-117, param0[var5].field_d.getClass()));
                    break L3;
                  } else {
                    StringBuilder discarded$21 = var7.append(rm.a(param0[var5].field_d, (byte) 106).toString());
                    break L3;
                  }
                }
                if (-1 + param0.length > var5) {
                  StringBuilder discarded$22 = var7.append(44);
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            if (!param2[var4].a(param0, 2, param3)) {
              var4++;
              continue L0;
            } else {
              return param2[var4].a((byte) 84, param0);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Gamemodes";
        field_k = "There are no teams in this league";
    }
}
