/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends ki {
    int field_C;
    static long field_B;
    static int field_D;
    ka field_G;
    byte field_F;
    static String field_E;

    final int a(boolean param0) {
        if (null == ((ph) this).field_G) {
          return 0;
        } else {
          if (!param0) {
            ((ph) this).field_F = (byte) 65;
            return 100 * ((ph) this).field_G.field_k / (-((ph) this).field_F + ((ph) this).field_G.field_r.length);
          } else {
            return 100 * ((ph) this).field_G.field_k / (-((ph) this).field_F + ((ph) this).field_G.field_r.length);
          }
        }
    }

    final static void a(int param0, qc param1, int param2, int param3, int param4, qc param5) {
        le.field_k = param3;
        nh.field_h = param2;
        if (param0 != 14835) {
            return;
        }
        nh.field_f = param4;
        ld.field_y = param5;
        pk.field_a = param1;
    }

    final static void a(String param0, int param1, java.awt.Color param2, int param3, boolean param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = qd.field_j.getGraphics();
                        if (null == sj.field_F) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        sj.field_F = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, lk.field_j, td.field_d);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param2 = new java.awt.Color(140, 17, 17);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null == wc.field_C) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        wc.field_C = qd.field_j.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = wc.field_C.getGraphics();
                        var10.setColor(param2);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(3 * param3 + 2, param1, -(3 * param3) + 300, 30);
                        var10.setFont(sj.field_F);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (-(6 * param0.length()) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(wc.field_C, lk.field_j / 2 + -152, -18 + td.field_d / 2, (java.awt.image.ImageObserver) null);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = lk.field_j / 2 + -152;
                        var8 = -18 + td.field_d / 2;
                        var9.setColor(param2);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, 2 + var8, 3 * param3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, var8 + 1, 301, 31);
                        var9.fillRect(var7 - -2 + param3 * 3, 2 + var8, -(3 * param3) + 300, 30);
                        var9.setFont(sj.field_F);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, var7 + (-(6 * param0.length()) + 304) / 2, var8 - -22);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (hf.field_j == null) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9.setFont(sj.field_F);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(hf.field_j, lk.field_j / 2 + -(hf.field_j.length() * 6 / 2), -26 + td.field_d / 2);
                        return;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    qd.field_j.repaint();
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] g(int param0) {
        if (param0 == -27203) {
          if (!((ph) this).field_w) {
            if (((ph) this).field_G.field_k < -((ph) this).field_F + ((ph) this).field_G.field_r.length) {
              throw new RuntimeException();
            } else {
              return ((ph) this).field_G.field_r;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    public static void h(int param0) {
        int var1 = -69 % ((param0 - 44) / 32);
        field_E = null;
    }

    ph() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 20000000L;
        field_E = "FULL ACCESS";
    }
}
