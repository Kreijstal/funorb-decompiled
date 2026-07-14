/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ia {
    static wk[] field_s;
    static int[] field_u;
    static String field_q;
    static String field_t;
    static int[] field_o;
    static int field_n;
    static String field_r;
    static wk[] field_p;

    final static boolean b(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        if (param1 == 29974) {
          var2 = param0.charAt(0);
          var3 = 1;
          L0: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          field_n = -3;
          var2 = param0.charAt(0);
          var3 = 1;
          L1: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L1;
              }
            } else {
              return true;
            }
          }
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_t = null;
        if (param0 <= 14) {
          field_s = null;
          field_r = null;
          field_q = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    final vd a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var4 = (CharSequence) (Object) param0;
        if (!fg.a(var4, -71)) {
          return fa.field_d;
        } else {
          if (param1 == -1) {
            var6 = (CharSequence) (Object) param0;
            var3 = dj.a(var6, -124);
            if (0 < var3) {
              if (-131 > (var3 ^ -1)) {
                return fa.field_d;
              } else {
                return vf.field_b;
              }
            } else {
              return fa.field_d;
            }
          } else {
            field_s = null;
            var5 = (CharSequence) (Object) param0;
            var3 = dj.a(var5, -124);
            if (0 < var3) {
              if (-131 > (var3 ^ -1)) {
                return fa.field_d;
              } else {
                return vf.field_b;
              }
            } else {
              return fa.field_d;
            }
          }
        }
    }

    final String a(int param0, String param1) {
        if (((eb) this).a(param1, -1) == fa.field_d) {
          return vn.field_j;
        } else {
          if (param0 == 100) {
            return null;
          } else {
            field_u = null;
            return null;
          }
        }
    }

    final static void a(int param0, gh param1, gh param2, gh param3, gh param4) {
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = SteelSentinels.field_G;
        if (tj.field_f != null) {
          return;
        } else {
          jn.field_g = false;
          if (!fj.field_e) {
            if (uc.field_g) {
              var5 = al.field_b;
              var7 = null;
              qb.a(-104, v.field_e, var5, 0, (String) null);
              vd.field_d.field_rb = ((td.field_ic.field_rb & 16711422) >> 128478081) + (v.field_e - ((16711422 & v.field_e) >> -1260345023));
              vd.field_d.field_xb = (8355711 & td.field_ic.field_xb >> -1796357951) + -((16711422 & v.field_e) >> -99130879) + v.field_e;
              sb.field_ab = wh.field_e;
              tj.field_f = vd.field_d;
              vd.field_d.field_Mb = (td.field_ic.field_Mb >> 1271937665 & 8355711) + -((16711422 & v.field_e) >> -1166514047) + v.field_e;
              hh.field_a = new gh(0L, param2);
              cc.field_bc = new gh(0L, param4);
              in.field_d = new gh(0L, (gh) null);
              te.field_f = new gh(0L, param1);
              vd.field_d = new gh((long)param0, param3);
              vd.field_d.field_L = pl.field_X;
              te.field_f.a(vd.field_d, 122);
              wh.field_e = new gh(0L, sb.field_ab);
              te.field_f.a(wh.field_e, 125);
              vc.field_f = new gh(0L, td.field_ic, re.field_cb);
              qa.field_N = new gh(0L, td.field_ic);
              hh.field_a.a(cc.field_bc, 124);
              hh.field_a.a(in.field_d, 127);
              in.field_d.a(te.field_f, 122);
              in.field_d.a(vc.field_f, 119);
              in.field_d.a(qa.field_N, 121);
              return;
            } else {
              var5 = sg.field_h;
              var7 = null;
              qb.a(-104, v.field_e, var5, 0, (String) null);
              vd.field_d.field_rb = ((td.field_ic.field_rb & 16711422) >> 128478081) + (v.field_e - ((16711422 & v.field_e) >> -1260345023));
              vd.field_d.field_xb = (8355711 & td.field_ic.field_xb >> -1796357951) + -((16711422 & v.field_e) >> -99130879) + v.field_e;
              sb.field_ab = wh.field_e;
              tj.field_f = vd.field_d;
              vd.field_d.field_Mb = (td.field_ic.field_Mb >> 1271937665 & 8355711) + -((16711422 & v.field_e) >> -1166514047) + v.field_e;
              hh.field_a = new gh(0L, param2);
              cc.field_bc = new gh(0L, param4);
              in.field_d = new gh(0L, (gh) null);
              te.field_f = new gh(0L, param1);
              vd.field_d = new gh((long)param0, param3);
              vd.field_d.field_L = pl.field_X;
              te.field_f.a(vd.field_d, 122);
              wh.field_e = new gh(0L, sb.field_ab);
              te.field_f.a(wh.field_e, 125);
              vc.field_f = new gh(0L, td.field_ic, re.field_cb);
              qa.field_N = new gh(0L, td.field_ic);
              hh.field_a.a(cc.field_bc, 124);
              hh.field_a.a(in.field_d, 127);
              in.field_d.a(te.field_f, 122);
              in.field_d.a(vc.field_f, 119);
              in.field_d.a(qa.field_N, 121);
              return;
            }
          } else {
            var5 = hk.field_Kc;
            var7 = null;
            qb.a(-104, v.field_e, var5, 0, (String) null);
            vd.field_d.field_rb = ((td.field_ic.field_rb & 16711422) >> 128478081) + (v.field_e - ((16711422 & v.field_e) >> -1260345023));
            vd.field_d.field_xb = (8355711 & td.field_ic.field_xb >> -1796357951) + -((16711422 & v.field_e) >> -99130879) + v.field_e;
            sb.field_ab = wh.field_e;
            tj.field_f = vd.field_d;
            vd.field_d.field_Mb = (td.field_ic.field_Mb >> 1271937665 & 8355711) + -((16711422 & v.field_e) >> -1166514047) + v.field_e;
            hh.field_a = new gh(0L, param2);
            cc.field_bc = new gh(0L, param4);
            in.field_d = new gh(0L, (gh) null);
            te.field_f = new gh(0L, param1);
            vd.field_d = new gh((long)param0, param3);
            vd.field_d.field_L = pl.field_X;
            te.field_f.a(vd.field_d, 122);
            wh.field_e = new gh(0L, sb.field_ab);
            te.field_f.a(wh.field_e, 125);
            vc.field_f = new gh(0L, td.field_ic, re.field_cb);
            qa.field_N = new gh(0L, td.field_ic);
            hh.field_a.a(cc.field_bc, 124);
            hh.field_a.a(in.field_d, 127);
            in.field_d.a(te.field_f, 122);
            in.field_d.a(vc.field_f, 119);
            in.field_d.a(qa.field_N, 121);
            return;
          }
        }
    }

    final static na a(byte param0, boolean param1) {
        kj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kj var8 = null;
        ao var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_23_0 = null;
        Object stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    var8 = rf.field_d;
                    var2 = var8;
                    var3 = var8.f((byte) -87);
                    m.field_a = var3 & 127;
                    if (0 == (var3 & 128)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    oh.field_e = stackIn_3_0 != 0;
                    be.field_b = var8.f((byte) -121);
                    ni.field_d = var8.g((byte) -116);
                    if (m.field_a != 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    dk.field_a = var8.c((byte) -60);
                    t.field_k = var8.a(false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    dk.field_a = 0;
                    t.field_k = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var8.f((byte) -77) ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    b.field_g = var8.h(1);
                    if (param0 < -50) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_s = null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    jk.field_e = b.field_g;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    jk.field_e = var8.h(1);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == (m.field_a ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (m.field_a == 4) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    uj.field_a = null;
                    gd.field_lb = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 17: {
                    gd.field_lb = var8.c((byte) -60);
                    uj.field_a = var8.h(1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    gd.field_lb = var8.c((byte) -60);
                    uj.field_a = var8.h(1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    bg.field_F = cd.a((gi) (Object) var8, 80, (byte) -100);
                    bc.field_ob = null;
                    return new na(param1);
                }
                case 21: {
                    var5 = var8.c((byte) -60);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = jl.field_w.a(var5, -81);
                        bg.field_F = var9.i(1);
                        if (jk.field_e.equals((Object) (Object) g.field_l)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var9.field_F;
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = null;
                        stackIn_25_0 = (int[]) (Object) stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        bc.field_ob = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return new na(param1);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    sj.a("CC1", -66, (Throwable) (Object) var6);
                    bg.field_F = null;
                    bc.field_ob = null;
                    return new na(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    eb(jf param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Loading...";
        field_o = new int[]{55, 53, 24, 24, 24, 24, 54, 83, 24, 24, 56, 83, 24, 24, 83, 24, 24, 97, 35, -1, -1, -1, -1, -1, -1, -1};
        field_t = "PER MONTH";
        field_r = "You are on <%0>";
    }
}
