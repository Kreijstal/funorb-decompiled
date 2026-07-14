/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends rqa {
    static String field_o;

    nb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(195, 62, param0[0].a(23));
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if ((qmb.field_q ^ -1) > -11) {
                break L1;
              } else {
                if (cgb.field_a) {
                  break L1;
                } else {
                  if (wh.g(-115)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static void e(byte param0) {
        lta var2 = null;
        int var3 = 0;
        wfb var3_ref_wfb = null;
        Exception var4_ref_Exception = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var16 = null;
        int[] var19 = null;
        String var20 = null;
        wfb var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var33 = null;
        int[] var34 = null;
        int stackIn_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = VoidHunters.field_G;
                    og.field_r.GA(0);
                    if (param0 == 102) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var16 = "Component editor";
                    pm.a(ip.field_p.width / 2 - (tea.a(1, var16, param0 ^ 13905) >> 1889528737), -1, 30, var16, 1, 16756480, (byte) -94);
                    var2 = new lta();
                    var2.field_b = de.field_o;
                    var2.field_c = gt.field_p;
                    var2.field_a = ql.field_o;
                    if (fe.field_p == -1) {
                        statePc = 39;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3_ref_wfb = hab.field_g[fe.field_p];
                    if (var3_ref_wfb != null) {
                        statePc = 5;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 5: {
                    fr.a(var2, var3_ref_wfb, false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        if (au.field_c != 1) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 >= hw.field_d.length) {
                            statePc = 38;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var31 = hw.field_d[var4];
                        if (var31.length <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (au.field_c == 2) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var20 = obb.field_o[fe.field_p];
                        cka.a(-1, var20, 16763904, 80, 320 + -(kga.a(120, var20) / 2), param0 + 4164);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 0;
                        if (var3_ref_wfb.field_k) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = -2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (uob.field_g.length <= var5) {
                            statePc = 38;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var33 = uob.field_g[var5];
                        var29 = var33;
                        var25 = var29;
                        var19 = var25;
                        var6 = var19;
                        if (var5 != uob.field_g.length + -1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = stackIn_23_0;
                        var8 = 16777215;
                        if (var7 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8 = 11184810;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var9 >= var4 + var33.length) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10 = var33[var9];
                        var11 = var6[var9 + 1];
                        var12 = var6[(var9 + 2) % var33.length];
                        var13 = var6[(3 + var9) % var33.length];
                        c.a(var2.b(true, var13), var2.a(var12, (byte) 121), var2.a(var10, (byte) 121), var2.b(true, var11), -16777216, var8);
                        if (!var3_ref_wfb.field_k) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        c.a(var2.b(true, -var13), var2.a(var12, (byte) 123), var2.a(var10, (byte) 126), var2.b(true, -var11), -16777216, var8);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 += 2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var7 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var9 >= var33.length) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = var33[var9];
                        var11 = var6[var9 + 1];
                        kq.a(2.0f, (byte) 64, var2.b(true, var11), 16711935, var2.a(var10, (byte) 126));
                        var9 += 2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var4_ref_Exception = (Exception) (Object) caughtException;
                    var4_ref_Exception.printStackTrace();
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var20 = obb.field_o[fe.field_p];
                    cka.a(-1, var20, 16763904, 80, 320 + -(kga.a(120, var20) / 2), param0 + 4164);
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    var3 = 4 * -fnb.field_b;
                    var4 = fnb.field_b / 2;
                    var34 = uca.a(var4, (byte) 9, new int[23], var3);
                    var22 = new wfb(var34, 0, 0);
                    ta.a(var34, param0 + 12, var22);
                    var22.a(102, 15);
                    fr.a(var2, var22, false);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            nb.e((byte) 14);
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "CHAT";
    }
}
