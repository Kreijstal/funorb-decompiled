/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    ml field_a;
    static String field_d;
    static String field_c;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = param1.length();
          if ((var2 ^ -1) < -21) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            if (param0 == -1212) {
              return new String(var8);
            } else {
              return null;
            }
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(var5 - -32);
                  var4++;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (var5 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var5 < 48) {
                  break L5;
                } else {
                  if (var5 <= 57) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L1;
          }
        }
    }

    final static mo a(byte param0, boolean param1) {
        bv var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        bv var8 = null;
        ar var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var8 = mg.field_e;
                    var2 = var8;
                    var3 = var8.k(0);
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
                    ui.field_b = stackIn_3_0 != 0;
                    u.field_k = var3 & 127;
                    hc.field_e = var8.k(0);
                    gk.field_I = var8.j((byte) -2);
                    if (2 == u.field_k) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    rh.field_e = 0;
                    th.field_c = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    rh.field_e = var8.e((byte) -104);
                    th.field_c = var8.d((byte) -13);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var8.k(0) != 1) {
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
                    qd.field_L = var8.g(1);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    gp.field_b = var8.g(1);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    gp.field_b = qd.field_L;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (u.field_k == 1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((u.field_k ^ -1) == -5) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ut.field_eb = 0;
                    aw.field_k = null;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    ut.field_eb = var8.e((byte) -104);
                    aw.field_k = var8.g(1);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    ut.field_eb = var8.e((byte) -104);
                    aw.field_k = var8.g(1);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param1) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = var8.e((byte) -104);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = ce.field_K.a(var5, -124);
                        dg.field_b = var9.d((byte) 97);
                        if (gp.field_b.equals((Object) (Object) mv.field_d)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var9.field_A;
                        stackIn_22_0 = stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = null;
                        stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        hv.field_R = (int[]) (Object) stackIn_22_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    af.a((Throwable) (Object) var6, -120, "CC1");
                    hv.field_R = null;
                    dg.field_b = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    dg.field_b = le.a(80, (byte) -25, (vh) (Object) var8);
                    hv.field_R = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var5 = -17 / ((param0 - 47) / 42);
                    return new mo(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static pf a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        pf var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var2 = fk.a((byte) 102, param1, "jagex-last-login-method");
        if (var2 == null) {
            return u.field_l;
        }
        pf[] var3 = ca.c(0);
        for (var4 = param0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a((byte) -106, var2)) {
                return var5;
            }
        }
        return u.field_l;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        if (param1 > -117) {
            mo discarded$0 = ea.a((byte) -115, true);
        }
        ((ea) this).field_a.a(param3, param4, param2, var7, 0, var6, param0);
        bn.field_c.a(jn.field_d, -20500, su.field_d.field_gb, 0, 0);
        wn.field_kb.a(18, -20500, -2 + (-2 + su.field_d.field_gb + (-jn.field_c - 80)), 2 + jn.field_d, 0);
        ek.field_a.a(18, -20500, 82 + jn.field_c, jn.field_d + 2, -82 + (su.field_d.field_gb + -jn.field_c));
        mw.field_E.a(0, jn.field_c, 2, 20, su.field_d.field_gb, 20 + (2 + jn.field_d), -2 + (su.field_d.field_ob - jn.field_d) + -20, (byte) -92);
        sc.field_g.a((byte) -110, jn.field_c, 20, 2);
    }

    ea(String param0, je param1) {
        String[] var3 = new String[]{param0, wg.field_a, op.field_e};
        je[] var4 = new je[]{param1, su.field_d, (je) (Object) sc.field_g};
        ((ea) this).field_a = new ml(0L, h.field_d, var3, wm.field_c, var4, 0);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 43 % ((19 - param0) / 38);
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has joined your game.";
        field_c = "Passwords can only contain letters and numbers";
        field_b = "Magical incantations to instantly change the tide of battle.";
    }
}
