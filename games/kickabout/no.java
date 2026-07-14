/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends i {
    static int field_F;
    static String field_G;
    static String[] field_K;
    static long field_H;
    static String field_I;
    static byte[] field_J;

    final static int b(int param0, int param1) {
        if (param1 != 15832) {
            field_J = null;
        }
        if (param0 < 0) {
            if (65535 < (param0 ^ -1)) {
                return ve.field_T[134217728 / -param0] + -2048;
            }
            return -ve.field_T[-param0 >> -1617764283];
        }
        if (-65537 <= (param0 ^ -1)) {
            return ve.field_T[param0 >> 622369765];
        }
        return 2048 + -ve.field_T[134217728 / param0];
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Kickabout.field_G;
          var1 = -24 % ((param0 - 38) / 56);
          if (1 == ks.field_e) {
            ps.a(-25246, true, false, false, false, false, false);
            break L0;
          } else {
            if (ks.field_e != 2) {
              if (3 != ks.field_e) {
                if ((ks.field_e ^ -1) != -5) {
                  if (ks.field_e != 5) {
                    if ((ks.field_e ^ -1) != -7) {
                      if ((ks.field_e ^ -1) != -8) {
                        if (8 != ks.field_e) {
                          if (-10 == (ks.field_e ^ -1)) {
                            ps.a(-25246, false, false, true, true, false, false);
                            break L0;
                          } else {
                            if (ks.field_e != 10) {
                              if (ks.field_e == 11) {
                                ps.a(-25246, true, true, true, true, false, true);
                                break L0;
                              } else {
                                if (ks.field_e != 12) {
                                  if (-14 == (ks.field_e ^ -1)) {
                                    ps.a(-25246, true, true, true, true, false, true);
                                    break L0;
                                  } else {
                                    ps.a(-25246, true, true, true, true, true, true);
                                    break L0;
                                  }
                                } else {
                                  ps.a(-25246, false, false, true, true, false, false);
                                  break L0;
                                }
                              }
                            } else {
                              ps.a(-25246, false, false, false, false, true, false);
                              break L0;
                            }
                          }
                        } else {
                          ps.a(-25246, true, true, false, true, false, true);
                          break L0;
                        }
                      } else {
                        ps.a(-25246, true, true, false, false, false, true);
                        break L0;
                      }
                    } else {
                      ps.a(-25246, false, false, false, true, false, false);
                      break L0;
                    }
                  } else {
                    ps.a(-25246, false, false, false, true, false, false);
                    break L0;
                  }
                } else {
                  ps.a(-25246, false, false, false, true, false, false);
                  break L0;
                }
              } else {
                ps.a(-25246, true, false, false, false, false, true);
                break L0;
              }
            } else {
              ps.a(-25246, false, false, false, false, false, true);
              break L0;
            }
          }
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        String[] var7 = null;
        int var5 = Kickabout.field_G;
        mj.field_a = cr.field_d;
        if (param3 != -1) {
            int discarded$0 = no.b(-9, -128);
        }
        if (255 == param1) {
            u.field_h = mf.a(-14 < (tn.field_b ^ -1) ? true : false, param3 ^ -42);
            pp.a(param3 ^ -18268, (String[]) null);
        } else {
            if ((param1 ^ -1) <= -101) {
                // if_icmplt L108
                var7 = args;
                pp.a(18267, var7);
                u.field_h = wt.a(-117, args);
            } else {
                u.field_h = wb.a(-124, param2, param1);
            }
        }
    }

    no() {
        super(9);
        ut var1 = kb.field_E[-1 + kb.field_E.length];
        String var2 = q.field_h[-1 + q.field_h.length];
        String var3 = vo.a((byte) -18, gd.field_e[9], new String[1]);
        ((no) this).a(var3, ((no) this).field_t, var1, -117, ((no) this).field_u);
    }

    final void a(int param0, int param1) {
        super.a(122, param1);
        if (!(!la.a(100))) {
            return;
        }
        if (param0 <= 60) {
            field_K = null;
        }
        or.field_d.b(78, (byte) 113);
    }

    final static ld a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var2 = param0.length();
        if (-1 != (var2 ^ -1)) {
          if ((var2 ^ -1) < -64) {
            return st.field_j;
          } else {
            if (param1 == 134217728) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2) {
                  var4 = param0.charAt(var3);
                  if (var4 != 45) {
                    if (-1 == qs.field_V.indexOf(var4)) {
                      return lm.field_F;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    L1: {
                      if (-1 == (var3 ^ -1)) {
                        break L1;
                      } else {
                        if (var2 + -1 == var3) {
                          break L1;
                        } else {
                          var3++;
                          continue L0;
                        }
                      }
                    }
                    return lm.field_F;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return ld.field_b;
        }
    }

    public static void g(byte param0) {
        field_I = null;
        field_G = null;
        field_K = null;
        if (param0 != -93) {
            no.g((byte) 67);
        }
        field_J = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Unpacking sound", "Unpacking patches", "Unpacking graphics", "Unpacking menus", "Unpacking lobby", "Unpacking 3D models", "Unpacking animations", "Initialising 3D", "Initialising game components", "Initialising menus", "Initialising HUDs", "Initialising pitch", "Initialising UI", "Initialising client", null};
        field_G = "This password contains your email address, and would be easy to guess";
        field_H = 20000000L;
        field_I = "Game full";
    }
}
