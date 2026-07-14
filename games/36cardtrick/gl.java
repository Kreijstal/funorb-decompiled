/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends hl {
    private int field_E;
    private ba field_F;
    static String[] field_G;

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_G = null;
    }

    final String b(byte param0) {
        if (((gl) this).field_j) {
            return ((gl) this).field_F.b(26766);
        }
        if (param0 == -79) {
            return null;
        }
        field_G = (String[]) null;
        return null;
    }

    final static boolean b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        fd var5 = null;
        fd var6 = null;
        fd var7 = null;
        fd var8 = null;
        var3 = Main.field_T;
        if (param0) {
          var8 = (fd) vb.field_e.a((byte) 74);
          var7 = var8;
          if (var7 != null) {
            var2 = 0;
            L0: while (true) {
              if (((fd) var7).field_o > var2) {
                L1: {
                  if (null == ((fd) var8).field_p[var2]) {
                    break L1;
                  } else {
                    if (0 != ((fd) var8).field_p[var2].field_a) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                if (null != ((fd) var8).field_r[var2]) {
                  if (-1 == (((fd) var8).field_r[var2].field_a ^ -1)) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          field_G = (String[]) null;
          var6 = (fd) vb.field_e.a((byte) 74);
          var5 = var6;
          if (var5 != null) {
            var2 = 0;
            L2: while (true) {
              if (((fd) var5).field_o > var2) {
                L3: {
                  if (null == ((fd) var6).field_p[var2]) {
                    break L3;
                  } else {
                    if (0 != ((fd) var6).field_p[var2].field_a) {
                      break L3;
                    } else {
                      return false;
                    }
                  }
                }
                if (null != ((fd) var6).field_r[var2]) {
                  if (-1 == (((fd) var6).field_r[var2].field_a ^ -1)) {
                    return false;
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L2;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Main.field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 873140897) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 1;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (!le.field_m.startsWith("win")) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param0.startsWith("https://")) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var3++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        ((gl) this).field_E = ((gl) this).field_E + 1;
        this.a(param0, param1, param2, param3);
    }

    final static kc[] a(String param0, qk param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        var4 = param1.a(18659, param2);
        var5 = param1.a(var4, param0, (byte) 7);
        if (param3 != -13244) {
          var6 = (String) null;
          boolean discarded$2 = gl.a((String) null, 104);
          return hl.a(param1, 117, var4, var5);
        } else {
          return hl.a(param1, 117, var4, var5);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        sg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kc var12 = null;
        kc var13 = null;
        kc var15 = null;
        kc var16 = null;
        var11 = Main.field_T;
        this.a(param0, param1, -1, param3);
        if (param2 != (param3 ^ -1)) {
          return;
        } else {
          var5 = ((gl) this).field_o + param0 + (((gl) this).field_h >> -605328159);
          var6 = (((gl) this).field_q >> -1866628191) + ((gl) this).field_i + param1;
          var8 = ((gl) this).field_F.a(true);
          if (tb.field_b != var8) {
            if (a.field_n != var8) {
              if (pe.field_b != var8) {
                if (ii.field_e != var8) {
                  return;
                } else {
                  var12 = gh.field_n[1];
                  var12.b(-(((kc) var12).field_p >> -605323231) + var5, var6 - (((kc) var12).field_o >> -1958899519), 256);
                  return;
                }
              } else {
                var13 = gh.field_n[2];
                var13.b(var5 - (((kc) var13).field_p >> 862157121), -(((kc) var13).field_o >> -416620415) + var6, 256);
                return;
              }
            } else {
              var16 = gh.field_n[0];
              var9 = ((kc) var16).field_l << 873140897;
              var10 = ((kc) var16).field_k << -854242559;
              if (null != hb.field_c) {
                if (var9 <= hb.field_c.field_p) {
                  if (var10 > hb.field_c.field_o) {
                    hb.field_c = new kc(var9, var10);
                    dl.a(97, hb.field_c);
                    var16.a(112, 144, ((kc) var16).field_l << -2065336412, ((kc) var16).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                    gg.a(14756);
                    hb.field_c.b(var5 - ((kc) var16).field_l, -((kc) var16).field_k + var6, 256);
                    return;
                  } else {
                    dl.a(param2 + 96, hb.field_c);
                    vj.d();
                    var16.a(112, 144, ((kc) var16).field_l << -2065336412, ((kc) var16).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                    gg.a(14756);
                    hb.field_c.b(var5 - ((kc) var16).field_l, -((kc) var16).field_k + var6, 256);
                    return;
                  }
                } else {
                  hb.field_c = new kc(var9, var10);
                  dl.a(97, hb.field_c);
                  var16.a(112, 144, ((kc) var16).field_l << -2065336412, ((kc) var16).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                  gg.a(14756);
                  hb.field_c.b(var5 - ((kc) var16).field_l, -((kc) var16).field_k + var6, 256);
                  return;
                }
              } else {
                hb.field_c = new kc(var9, var10);
                dl.a(97, hb.field_c);
                var16.a(112, 144, ((kc) var16).field_l << -2065336412, ((kc) var16).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                gg.a(14756);
                hb.field_c.b(var5 - ((kc) var16).field_l, -((kc) var16).field_k + var6, 256);
                return;
              }
            }
          } else {
            var15 = gh.field_n[0];
            var9 = ((kc) var15).field_l << 873140897;
            var10 = ((kc) var15).field_k << -854242559;
            if (null != hb.field_c) {
              if (var9 <= hb.field_c.field_p) {
                if (var10 > hb.field_c.field_o) {
                  hb.field_c = new kc(var9, var10);
                  dl.a(97, hb.field_c);
                  var15.a(112, 144, ((kc) var15).field_l << -2065336412, ((kc) var15).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                  gg.a(14756);
                  hb.field_c.b(var5 - ((kc) var15).field_l, -((kc) var15).field_k + var6, 256);
                  return;
                } else {
                  dl.a(param2 + 96, hb.field_c);
                  vj.d();
                  var15.a(112, 144, ((kc) var15).field_l << -2065336412, ((kc) var15).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                  gg.a(14756);
                  hb.field_c.b(var5 - ((kc) var15).field_l, -((kc) var15).field_k + var6, 256);
                  return;
                }
              } else {
                hb.field_c = new kc(var9, var10);
                dl.a(97, hb.field_c);
                var15.a(112, 144, ((kc) var15).field_l << -2065336412, ((kc) var15).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
                gg.a(14756);
                hb.field_c.b(var5 - ((kc) var15).field_l, -((kc) var15).field_k + var6, 256);
                return;
              }
            } else {
              hb.field_c = new kc(var9, var10);
              dl.a(97, hb.field_c);
              var15.a(112, 144, ((kc) var15).field_l << -2065336412, ((kc) var15).field_k << 1136977924, -((gl) this).field_E << -1455706710, 4096);
              gg.a(14756);
              hb.field_c.b(var5 - ((kc) var15).field_l, -((kc) var15).field_k + var6, 256);
              return;
            }
          }
        }
    }

    final boolean a(int param0, lk param1) {
        if (param0 <= 71) {
            return true;
        }
        return false;
    }

    final static boolean a(boolean param0) {
        String var2 = null;
        L0: {
          if (al.field_a == -1) {
            if (!r.a(1, (byte) 123)) {
              return false;
            } else {
              al.field_a = rd.field_j.f(-97);
              rd.field_j.field_i = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if ((al.field_a ^ -1) != 1) {
            break L1;
          } else {
            if (r.a(2, (byte) 127)) {
              al.field_a = rd.field_j.d((byte) 72);
              rd.field_j.field_i = 0;
              break L1;
            } else {
              return false;
            }
          }
        }
        if (param0) {
          var2 = (String) null;
          boolean discarded$2 = gl.a((String) null, 98);
          return r.a(al.field_a, (byte) 123);
        } else {
          return r.a(al.field_a, (byte) 123);
        }
    }

    final static void a(int param0, ib param1, int param2, int param3) {
        li var4 = null;
        jg var5 = null;
        if (param3 != 804) {
          return;
        } else {
          var4 = li.a(param1, 100, param2);
          var5 = ug.a((je) (Object) var4, param3 + -803, param0);
          aj.field_s.a((qb) (Object) new gi(var4, (qb) (Object) var5), 27362);
          bg.field_tb.b((je) (Object) var5);
          return;
        }
    }

    gl(ba param0) {
        ((gl) this).field_F = param0;
    }

    static {
    }
}
