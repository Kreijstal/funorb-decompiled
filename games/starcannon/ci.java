/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci implements de {
    private qe field_h;
    static lb[] field_g;
    private int field_e;
    private int field_c;
    private int field_f;
    static long field_b;
    private int field_j;
    static String field_d;
    private int field_a;
    private int field_i;

    final static void a(String param0, int param1) {
        if (param1 != 0) {
            ci.a(-63);
        }
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sj var13 = null;
        uj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        uj stackOut_1_0 = null;
        L0: {
          var12 = StarCannon.field_A;
          if (!(param4 instanceof sj)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (uj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (uj) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = (sj) (Object) stackIn_3_0;
          ki.d(param4.field_s + param0, param4.field_j + param3, param4.field_i, param4.field_f, ((ci) this).field_a);
          var7 = 14 / ((2 - param2) / 54);
          if (var13 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var8 = param4.field_i - 2 * var13.field_G;
        var9 = param4.field_s + (param0 + var13.field_G);
        var10 = param3 - (-param4.field_j + -var13.field_A);
        ki.a(var9, var10, var8 + var9, var10, ((ci) this).field_f);
        var11 = -1 + var13.e((byte) 114);
        L2: while (true) {
          if (-1 < (var11 ^ -1)) {
            L3: {
              if (null != ((ci) this).field_h) {
                ((ci) this).field_h.b(var13.field_k, var8 / 2 + var9, ((ci) this).field_h.field_x + var10 - -var13.field_A, ((ci) this).field_j, ((ci) this).field_e);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            ki.e(var13.a(2, var11) * var8 / var13.e(-32242) + var9, var10, ((ci) this).field_i, ((ci) this).field_c);
            var11--;
            continue L2;
          }
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var10 = kj.field_E.getGraphics();
                        if (null == jb.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        jb.field_c = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param4 == -27746) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = null;
                        ci.a(9, (java.awt.Color) null, (String) null, true, -93);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10.setColor(java.awt.Color.black);
                        var10.fillRect(0, 0, eh.field_n, ef.field_d);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (nh.field_h != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        nh.field_h = kj.field_E.createImage(304, 34);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = nh.field_h.getGraphics();
                        var11.setColor(param1);
                        var11.drawRect(0, 0, 303, 33);
                        var11.fillRect(2, 2, 3 * param0, 30);
                        var11.setColor(java.awt.Color.black);
                        var11.drawRect(1, 1, 301, 31);
                        var11.fillRect(2 + 3 * param0, 2, 300 + -(param0 * 3), 30);
                        var11.setFont(jb.field_c);
                        var11.setColor(java.awt.Color.white);
                        var11.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var10.drawImage(nh.field_h, -152 + eh.field_n / 2, -18 + ef.field_d / 2, (java.awt.image.ImageObserver) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + eh.field_n / 2;
                        var8 = ef.field_d / 2 - 18;
                        var10.setColor(param1);
                        var10.drawRect(var7, var8, 303, 33);
                        var10.fillRect(var7 - -2, var8 + 2, param0 * 3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1 + var7, var8 + 1, 301, 31);
                        var10.fillRect(2 + var7 - -(3 * param0), 2 + var8, -(param0 * 3) + 300, 30);
                        var10.setFont(jb.field_c);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param2, var7 - -((304 + -(param2.length() * 6)) / 2), 22 + var8);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (hi.field_a == null) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10.setFont(jb.field_c);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(hi.field_a, eh.field_n / 2 + -(hi.field_a.length() * 6 / 2), -26 + ef.field_d / 2);
                        return;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    kj.field_E.repaint();
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -114) {
            ci.a(47);
            field_g = null;
            return;
        }
        field_g = null;
    }

    ci(qe param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ci) this).field_i = param5;
        ((ci) this).field_h = param0;
        ((ci) this).field_a = param4;
        ((ci) this).field_c = param6;
        ((ci) this).field_j = param1;
        ((ci) this).field_f = param3;
        ((ci) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
        field_d = "More suggestions";
    }
}
