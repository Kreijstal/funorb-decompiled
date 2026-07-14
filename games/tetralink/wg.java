/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static af field_d;
    static String field_b;
    static String field_g;
    static int[] field_f;
    static int field_h;
    static int field_e;
    static String field_a;
    static int field_c;

    final static fj a(byte param0, boolean param1) {
        bc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        bc var8 = null;
        j var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TetraLink.field_J;
                    var8 = kb.field_q;
                    var2 = var8;
                    var3 = var8.d((byte) -99);
                    if (-1 == (var3 & 128 ^ -1)) {
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
                    bo.field_s = stackIn_3_0 != 0;
                    ng.field_u = var3 & 127;
                    og.field_i = var8.d((byte) -99);
                    if (param0 == 85) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return null;
                }
                case 5: {
                    el.field_tc = var8.c(255);
                    if (ng.field_u == 2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    hg.field_a = 0;
                    n.field_O = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    hg.field_a = var8.e(127);
                    n.field_O = var8.d(-1);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (1 != var8.d((byte) -99)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    g.field_O = var8.g((byte) 81);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    TetraLink.field_M = g.field_O;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    TetraLink.field_M = var8.g((byte) 81);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == (ng.field_u ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (4 != ng.field_u) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    vi.field_c = var8.e(127);
                    ab.field_U = var8.g((byte) 81);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    vi.field_c = 0;
                    ab.field_U = null;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param1) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.e(127);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = eh.field_p.a(var5, -128);
                        ml.field_fb = var9.h(-15);
                        if (TetraLink.field_M.equals((Object) (Object) ph.field_w)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var9.field_v;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ha.field_i = stackIn_24_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    fk.a(param0 ^ -122, (Throwable) (Object) var6, "CC1");
                    ml.field_fb = null;
                    ha.field_i = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    ml.field_fb = rh.a(119, (bh) (Object) var8, 80);
                    ha.field_i = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return new fj(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 6945) {
            return;
        }
        field_a = null;
        field_b = null;
        field_f = null;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        var3 = 26 / ((-70 - param1) / 51);
        if (param0 == null) {
          return ua.field_e;
        } else {
          L0: {
            var4 = param0.length();
            if (1 > var4) {
              break L0;
            } else {
              if ((var4 ^ -1) >= -13) {
                L1: {
                  var5 = cc.a(param0, (byte) 108);
                  if (var5 == null) {
                    break L1;
                  } else {
                    if (var5.length() >= 1) {
                      L2: {
                        if (tk.a((byte) 81, var5.charAt(0))) {
                          break L2;
                        } else {
                          if (tk.a((byte) 81, var5.charAt(var5.length() + -1))) {
                            break L2;
                          } else {
                            var6 = 0;
                            var7 = 0;
                            L3: while (true) {
                              if (var7 >= param0.length()) {
                                if (0 < var6) {
                                  return ed.field_U;
                                } else {
                                  return null;
                                }
                              } else {
                                L4: {
                                  var8 = param0.charAt(var7);
                                  if (tk.a((byte) 81, (char) var8)) {
                                    var6++;
                                    break L4;
                                  } else {
                                    var6 = 0;
                                    break L4;
                                  }
                                }
                                if (var6 >= 2) {
                                  if (!param2) {
                                    return hg.field_i;
                                  } else {
                                    var7++;
                                    continue L3;
                                  }
                                } else {
                                  var7++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      return ed.field_U;
                    } else {
                      break L1;
                    }
                  }
                }
                return ua.field_e;
              } else {
                break L0;
              }
            }
          }
          return ua.field_e;
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            wg.a(123);
        }
        return mc.field_f + ((me.field_b << -931675422) + (ik.field_e << 1875813956));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new af();
        field_b = null;
        field_f = new int[]{2, 14, 15, 6, 5, 16, 17, 18, 12};
        field_h = 4;
        field_e = 0;
        field_g = "Enter name of friend to delete from list";
        field_a = "Updates will sent to the email address you've given";
    }
}
