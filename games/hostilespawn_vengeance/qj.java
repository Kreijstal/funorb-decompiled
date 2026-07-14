/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends am {
    int field_j;
    int field_i;
    static byte[] field_h;
    static String field_m;
    static boolean[] field_k;
    static String field_n;
    static bd field_l;

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            vh.field_c = param0;
            String var3 = param1.getParameter("cookieprefix");
            String var5 = var3;
            var5 = var3;
            String var4 = param1.getParameter("cookiehost");
            var5 = var4;
            var5 = var4;
            if (param2 <= 47) {
                return;
            }
            try {
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (-1 == (param0.length() ^ -1)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                a.a(param1, 17467, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            e.a(23148, param1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static fa a(java.applet.Applet param0, byte param1) {
        int var4 = 0;
        fa var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        String var2 = ae.a(param0, "jagex-last-login-method", 0);
        if (var2 == null) {
            return w.field_S;
        }
        fa[] var3 = pe.p(274);
        if (param1 > -29) {
            field_l = null;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(0, var2)) {
                return var5;
            }
        }
        return w.field_S;
    }

    final static void a(byte param0, int param1) {
        int var3 = HostileSpawn.field_I ? 1 : 0;
        jd var4 = (jd) (Object) ib.field_a.g(-48);
        while (var4 != null) {
            ea.a(var4, param1, 70);
            var4 = (jd) (Object) ib.field_a.a(12684);
        }
        if (param0 != -21) {
            field_k = null;
        }
        ic var5 = (ic) (Object) ch.field_p.g(-41);
        while (var5 != null) {
            rl.a(param1, var5, 746037954);
            var5 = (ic) (Object) ch.field_p.a(12684);
        }
    }

    final static fn a(gb param0, gb param1, int param2, int param3, int param4) {
        if (param2 != -1) {
            Object var6 = null;
            fa discarded$0 = qj.a((java.applet.Applet) null, (byte) 22);
        }
        if (!rl.a(2884, param1, param4, param3)) {
            return null;
        }
        return th.a(-5427, param0.a(false, param3, param4));
    }

    final static void a(vi param0, byte param1) {
        hf.field_a = param0.e(8) << -1928690331;
        int var2 = param0.l(32270);
        sm.field_g = (7 & var2) << -167668142;
        hf.field_a = hf.field_a + (var2 >> -1578453277);
        sm.field_g = sm.field_g + (param0.e(8) << -1476488382);
        var2 = param0.l(32270);
        sm.field_g = sm.field_g + (var2 >> 1531800102);
        jn.field_J = var2 << 1020185039 & 2064384;
        jn.field_J = jn.field_J + (param0.l(32270) << 1061029479);
        if (param1 != -12) {
            Object var3 = null;
            qj.a((vi) null, (byte) -75);
        }
        var2 = param0.l(32270);
        jn.field_J = jn.field_J + (var2 >> -19013471);
        s.field_e = (var2 & 1) << 2003080368;
        s.field_e = s.field_e + param0.e(8);
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -13206) {
            return;
        }
        field_k = null;
        field_l = null;
        field_h = null;
        field_m = null;
    }

    final static void a(int param0, int param1, oc param2, oc param3) {
        int var4 = 0;
        oj var5 = null;
        oc var6 = null;
        oj var7 = null;
        oc var8 = null;
        og var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var4 = ln.field_a.field_d;
          var5 = mm.field_m[0];
          var6 = var5.field_j;
          var7 = mm.field_m[param1];
          var8 = var7.field_j;
          var9 = var7.field_l;
          if (param0 <= -87) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        L1: {
          var10 = var8.b(-4);
          if ((wb.field_R ^ -1) < -1) {
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
          var11 = stackIn_5_0;
          if (var11 != 0) {
            if ((cm.field_c[var10] ^ -1) < -1) {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            } else {
              stackOut_8_0 = 0;
              stackIn_11_0 = stackOut_8_0;
              break L2;
            }
          } else {
            stackOut_6_0 = 0;
            stackIn_11_0 = stackOut_6_0;
            break L2;
          }
        }
        var12 = stackIn_11_0;
        var15 = var7.a(3, var12 != 0);
        var16 = var7.field_E;
        var14 = (int)(24.0 * (-var9.field_a + ((double)(-var8.field_g) + (var5.field_l.field_a + (double)var6.field_g))));
        var17 = var7.field_r;
        var13 = (int)(24.0 * ((double)var6.field_e + var5.field_l.field_f - (double)var8.field_e - var9.field_f));
        if (1 != ue.field_d) {
          L3: {
            if ((ul.field_L ^ -1) >= 0) {
              break L3;
            } else {
              if (10 <= ul.field_L) {
                break L3;
              } else {
                return;
              }
            }
          }
          L4: {
            if (var7.field_i == 27) {
              L5: {
                if (0 >= var7.field_I) {
                  L6: {
                    var7.field_I = 0;
                    if (!var7.field_s) {
                      break L6;
                    } else {
                      tk.a(1, jc.field_c, 27, true);
                      break L6;
                    }
                  }
                  var7.field_s = false;
                  break L5;
                } else {
                  if (var7.field_x == var7.field_I) {
                    var7.field_s = true;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (var7.field_s) {
                  break L7;
                } else {
                  var17 = var17 * 8;
                  var7.field_I = var7.field_I + 1;
                  break L7;
                }
              }
              if ((var7.field_L ^ -1) >= -1) {
                break L4;
              } else {
                var7.field_I = var7.field_x;
                var7.field_L = var7.field_L - 1;
                break L4;
              }
            } else {
              break L4;
            }
          }
          L8: {
            L9: {
              if (1 != bm.field_c) {
                break L9;
              } else {
                if (-1 == rl.field_c) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            ei.a(var17, var16, var8, var11 != 0, var9, param3, var15, 6, var12 != 0, var7, var4, var13, var10, 81, 8, var14, var6);
            break L8;
          }
          return;
        } else {
          return;
        }
    }

    final static fe a(int param0, String param1, int param2) {
        if (param0 != 27) {
            field_m = null;
        }
        el var3 = new el();
        ((fe) (Object) var3).field_b = param2;
        ((fe) (Object) var3).field_a = param1;
        return (fe) (Object) var3;
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
