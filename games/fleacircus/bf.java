/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static vc field_e;
    private pa field_c;
    static wh field_a;
    static int field_b;
    private pa field_g;
    static sf field_d;
    static int field_h;
    static String field_f;

    final void a(pa param0, int param1) {
        if (!(param0.field_m == null)) {
            param0.e(67);
        }
        if (param1 != -1089421886) {
            return;
        }
        try {
            param0.field_p = this.field_c;
            param0.field_m = this.field_c.field_m;
            param0.field_m.field_p = param0;
            param0.field_p.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(byte param0) {
        int var2;
        pa var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 < 4) {
          return 77;
        } else {
          var2 = 0;
          var3 = this.field_c.field_p;
          L0: while (true) {
            L1: {
              if (var3 == this.field_c) {
                break L1;
              } else {
                var3 = var3.field_p;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0) {
            bf.a(false, 51);
        }
    }

    final pa b(byte param0) {
        pa var2;
        var2 = this.field_c.field_p;
        if (var2 == this.field_c) {
          this.field_g = null;
          return null;
        } else {
          this.field_g = var2.field_p;
          if (param0 <= 104) {
            return (pa) null;
          } else {
            return var2;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              try {
                L0: {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = ib.a(param1, var4, param0 ^ -26699).getFile();
                    eb.a("updatelinks", new Object[]{"home", var3 + "home.ws"}, -11745, param1);
                    eb.a("updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, -11745, param1);
                    eb.a("updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0 + -43755, param1);
                    eb.a("updatelinks", new Object[]{"options", var3 + "options.ws"}, -11745, param1);
                    eb.a("updatelinks", new Object[]{"terms", var3 + "terms.ws"}, -11745, param1);
                    if (param0 == 32010) {
                      break L1;
                    } else {
                      field_d = (sf) null;
                      break L1;
                    }
                  }
                  eb.a("updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 + -43755, param1);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("bf.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dd[] a(int param0, int param1) {
        dd[] var2;
        dd[] var3;
        var3 = new dd[9];
        var2 = var3;
        var3[4] = oh.c(-81, param1, 64);
        if (param0 != 2885) {
          field_b = 93;
          return var2;
        } else {
          return var2;
        }
    }

    final static int a(boolean param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1156219201;
        param1 = param1 | param1 >>> -1089421886;
        param1 = param1 | param1 >>> -1300739132;
        param1 = param1 | param1 >>> 655408648;
        param1 = param1 | param1 >>> 1995812080;
        if (!param0) {
          return -122;
        } else {
          return param1 + 1;
        }
    }

    final pa c(byte param0) {
        pa var2 = this.field_g;
        if (param0 <= 65) {
            return (pa) null;
        }
        if (!(this.field_c != var2)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_p;
        return var2;
    }

    final pa a(int param0) {
        pa var2;
        var2 = this.field_c.field_p;
        if (var2 != this.field_c) {
          var2.e(-127);
          if (param0 >= -115) {
            field_f = (String) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static byte[] a(ih param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param0.b(param3, (byte) -87);
                        if (var4_int != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2.length == var4_int) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param2 = new byte[var4_int];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = param0.b(3, (byte) -87);
                        var6 = (byte)param0.b(param1, (byte) -87);
                        if ((var5 ^ -1) < -1) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param2[var7] = (byte)var6;
                        var7++;
                        if (var8 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_21_0 = (byte[]) (param2);
                        stackIn_18_0 = stackIn_21_0;
                        if (var8 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_18_0[var7] = (byte)(param0.b(var5, (byte) -87) + var6);
                        var7++;
                        if (var8 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (byte[]) (param2);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("bf.G(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param2 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public bf() {
        this.field_c = new pa();
        this.field_c.field_m = this.field_c;
        this.field_c.field_p = this.field_c;
    }

    static {
        field_e = new vc();
        field_b = 0;
        field_a = new wh("");
        field_f = "Waiting for graphics";
    }
}
