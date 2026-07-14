/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static ak field_c;
    static tf[] field_d;
    static String[] field_b;
    static int field_a;

    final static String a(byte param0, String param1, int param2) {
        if (!(3 != param2)) {
            return ko.field_ib;
        }
        if (!(param2 != 6)) {
            return nh.field_c;
        }
        if (param2 == 7) {
            return gq.field_l;
        }
        if (!(param2 != 8)) {
            return fb.field_Eb;
        }
        if (!(-10 != param2)) {
            return jb.field_c;
        }
        if (!(10 != param2)) {
            return c.field_O;
        }
        if (!(-12 != param2)) {
            return ve.field_Gb;
        }
        if (-15 == (param2 ^ -1)) {
            return sd.a(dd.field_m, 28, new String[1]);
        }
        if (param0 > 113) {
            return null;
        }
        field_b = null;
        return null;
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        if (param2 == null) {
          return em.field_b;
        } else {
          L0: {
            var3 = param2.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (var3 > 12) {
                break L0;
              } else {
                L1: {
                  var4 = dh.a(param2, (byte) 97);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L2: {
                        if (ii.a((byte) 122, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (ii.a((byte) 126, var4.charAt(-1 + var4.length()))) {
                            break L2;
                          } else {
                            L3: {
                              if (param0 == 11) {
                                break L3;
                              } else {
                                var9 = null;
                                lg.a(55, (fm) null);
                                break L3;
                              }
                            }
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (param2.length() <= var6) {
                                if (var5 > 0) {
                                  return ii.field_k;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param2.charAt(var6);
                                  if (!ii.a((byte) 118, (char) var7)) {
                                    var5 = 0;
                                    break L5;
                                  } else {
                                    var5++;
                                    break L5;
                                  }
                                }
                                if (2 <= var5) {
                                  if (!param1) {
                                    return fl.field_f;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return ii.field_k;
                    } else {
                      break L1;
                    }
                  }
                }
                return em.field_b;
              }
            }
          }
          return em.field_b;
        }
    }

    final static io a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        io var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param1 != -18992) {
            Object var7 = null;
            lg.a((sb) null, -23, -37, (sb) null, 119, 116);
        }
        String var2 = qn.a(param0, "jagex-last-login-method", (byte) -85);
        if (!(var2 != null)) {
            return cd.field_c;
        }
        io[] var3 = h.a((byte) -8);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(var2, -66))) {
                return var5;
            }
        }
        return cd.field_c;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        int var1 = -115 / ((param0 - -84) / 35);
    }

    final static void a(int param0, fm param1) {
        bj.field_c[0] = ua.a(param1, "", "pix_title");
        bj.field_c[1] = ua.a(param1, "", "pix_end_game");
        bj.field_c[2] = ua.a(param1, "", "skin1");
        bj.field_c[param0] = ua.a(param1, "", "skin8");
        bj.field_c[4] = ua.a(param1, "", "skin2");
        bj.field_c[5] = ua.a(param1, "", "skin9");
        bj.field_c[6] = ua.a(param1, "", "skin3");
        bj.field_c[7] = ua.a(param1, "", "skin16");
        bj.field_c[8] = ua.a(param1, "", "skin4");
        bj.field_c[9] = ua.a(param1, "", "skin11");
        bj.field_c[10] = ua.a(param1, "", "skin12");
        bj.field_c[11] = ua.a(param1, "", "skin7");
        bj.field_c[12] = ua.a(param1, "", "skin5");
        bj.field_c[13] = ua.a(param1, "", "skin6");
        bj.field_c[14] = ua.a(param1, "", "skin13");
        bj.field_c[15] = ua.a(param1, "", "skin14");
        bj.field_c[16] = ua.a(param1, "", "skin15");
        bj.field_c[17] = ua.a(param1, "", "skin10");
    }

    final static void a(sb param0, int param1, int param2, sb param3, int param4, int param5) {
        bd.field_c = param5;
        tm.field_N = param3;
        if (param2 >= -114) {
            lg.a((byte) 57);
        }
        ko.field_fb = param4;
        hc.field_J = param1;
        ao.field_e = param0;
    }

    final static java.net.URL a(boolean param0, java.applet.Applet param1, java.net.URL param2) {
        if (param0) {
            Object var5 = null;
            String discarded$0 = lg.a(-66, true, (CharSequence) null);
        }
        String var3 = null;
        String var4 = null;
        if (null != jp.field_c) {
            if (!jp.field_c.equals((Object) (Object) param1.getParameter("settings"))) {
                var3 = jp.field_c;
                var4 = var3;
                var4 = var3;
            }
        }
        if (null != bh.field_n) {
            if (!(bh.field_n.equals((Object) (Object) param1.getParameter("session")))) {
                var4 = bh.field_n;
            }
        }
        return ub.a(-102, param2, var3, var4, -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[255];
        field_d = new tf[2];
    }
}
