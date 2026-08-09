/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends ca {
    static int field_j;
    o field_f;
    o field_g;
    long field_h;
    static String field_i;

    final static void d(int param0) {
        L0: {
          bm.field_d.n(7920);
          if (na.field_c == null) {
            na.field_c = new ve(bm.field_d, bm.field_a);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          bm.field_d.b((byte) 74, (pj) (na.field_c));
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 107 % ((param0 - 8) / 51);
    }

    final void c(int param0) {
        String[] var3;
        if (this.field_g != null) {
          this.field_g.field_f = this.field_f;
          this.field_f.field_g = this.field_g;
          this.field_f = null;
          if (param0 != -1) {
            var3 = (String[]) null;
            o.a(5, (byte) -99, (java.applet.Applet) null, (String[]) null, 44, -56);
            this.field_g = null;
            return;
          } else {
            this.field_g = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        te.field_O = 0;
        kk.field_S = param3;
        bk.field_e = param0;
        if (b.a((byte) 112, kk.field_S)) {
          L0: {
            var4 = 0;
            if ((kk.field_S ^ -1) == -8) {
              var4 = -1;
              break L0;
            } else {
              break L0;
            }
          }
          nc.field_cb[kk.field_S].a((byte) -108, var4, param2);
          if ((kk.field_S ^ -1) == -8) {
            vk.a(0, param2);
            if (param1 != 2) {
              field_j = -61;
              return;
            } else {
              return;
            }
          } else {
            if (param1 == 2) {
              return;
            } else {
              field_j = -61;
              return;
            }
          }
        } else {
          if (param1 == 2) {
            return;
          } else {
            field_j = -61;
            return;
          }
        }
    }

    final static void a(int param0, byte param1, java.applet.Applet param2, String[] param3, int param4, int param5) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        lf.field_c = param2.getParameter("overxgames");
                        if (lf.field_c != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        lf.field_c = "0";
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        pl.field_a = param2.getParameter("overxachievements");
                        if (pl.field_a == null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        pl.field_a = "0";
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = param2.getParameter("currency");
                        if (var6 == null) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!tk.a(10, (CharSequence) ((Object) var6))) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ml.field_j = th.a(103, (CharSequence) ((Object) var6));
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ml.field_j = 2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ml.field_j = 2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ml.field_j = 2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        hd.field_t = param0;
                        var7 = -51 / ((param1 - 18) / 56);
                        pl.field_d = param5;
                        uh.field_a = param4;
                        il.field_e = new hj[param3.length];
                        var8 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param3.length <= var8) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        il.field_e[var8] = new hj(317, 34);
                        var8++;
                        if (var9 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        tb.field_c = param3;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var6_ref);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("o.GA(").append(param0).append(',').append(param1).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param2 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param3 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw dd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ',' + param5 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected o() {
    }

    static {
        field_i = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
