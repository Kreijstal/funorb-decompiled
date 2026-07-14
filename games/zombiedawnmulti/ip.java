/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static String field_d;
    static String field_b;
    static String field_a;
    static String field_c;
    static int field_f;
    static ri field_e;

    final static void a(int param0, int param1) {
        if (param0 > -119) {
            field_c = null;
            td.field_g = 1000000000L / (long)param1;
            return;
        }
        td.field_g = 1000000000L / (long)param1;
    }

    final static void b(byte param0) {
        rb.field_c = new int[]{};
        me.field_f = new int[]{};
        nm.field_u = new int[]{};
        if (param0 <= 75) {
            field_d = null;
        }
    }

    final static void a(int param0, java.awt.Color param1, boolean param2, String param3, int param4) {
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
                        var9 = dk.field_Ib.getGraphics();
                        if (null == wb.field_hb) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        wb.field_hb = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, ng.field_d, pi.field_i);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null != fq.field_i) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        fq.field_i = dk.field_Ib.createImage(304, 34);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = fq.field_i.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param0, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        if (param4 == 34) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_c = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10.fillRect(param0 * 3 + 2, 2, -(3 * param0) + 300, 30);
                        var10.setFont(wb.field_hb);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param3, (-(param3.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(fq.field_i, ng.field_d / 2 + -152, -18 + pi.field_i / 2, (java.awt.image.ImageObserver) null);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = ng.field_d / 2 - 152;
                        var8 = -18 + pi.field_i / 2;
                        var9.setColor(param1);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(var7 + 2, var8 - -2, 3 * param0, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, 1 + var8, 301, 31);
                        var9.fillRect(2 + (var7 + param0 * 3), var8 + 2, -(3 * param0) + 300, 30);
                        var9.setFont(wb.field_hb);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param3, (-(6 * param3.length()) + 304) / 2 + var7, 22 + var8);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (gj.field_b == null) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9.setFont(wb.field_hb);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(gj.field_b, ng.field_d / 2 - 6 * gj.field_b.length() / 2, pi.field_i / 2 + -26);
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (Exception) (Object) caughtException;
                    dk.field_Ib.repaint();
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 < 118) {
          field_a = null;
          field_d = null;
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = 27 % ((param0 - 55) / 62);
        if (this != (Object) (Object) lc.field_l) {
          if ((Object) (Object) qb.field_e != this) {
            if (this == (Object) (Object) pi.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create";
        field_d = "Your zombies will not be affected by powerups. But you'll not be able to use any except Counter.";
        field_b = "Updates will sent to the email address you've given";
        field_c = "Summary";
        field_f = 3;
    }
}
