/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends aa {
    private int field_f;
    private long field_j;
    private int field_h;
    private long field_i;
    static int[] field_g;
    private long field_k;
    private long[] field_e;

    final void b(int param0) {
        if ((this.field_i ^ -1L) > (this.field_j ^ -1L)) {
          this.field_i = this.field_i + (-this.field_i + this.field_j);
          this.field_k = (long)param0;
          return;
        } else {
          this.field_k = (long)param0;
          return;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        int var1 = 31 / ((48 - param0) / 47);
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 == -21342) {
          if (this.field_j <= this.field_i) {
            var4 = 0;
            L0: while (true) {
              this.field_j = this.field_j + param1;
              var4++;
              stackIn_16_0 = 10;
              L1: while (true) {
                L2: {
                  if (stackIn_16_0 <= var4) {
                    break L2;
                  } else {
                    if ((this.field_i ^ -1L) < (this.field_j ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_16_0 = ((this.field_j ^ -1L) < (this.field_i ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_i ^ -1L) ? 0 : 1));

                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_16_0 > 0) {
                    this.field_j = this.field_i;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_k = this.field_k + (this.field_j - this.field_i);
            this.field_i = this.field_i + (-this.field_i + this.field_j);
            this.field_j = this.field_j + param1;
            return 1;
          }
        } else {
          this.field_h = 48;
          if (this.field_j <= this.field_i) {
            var4 = 0;
            L3: while (true) {
              this.field_j = this.field_j + param1;
              var4++;
              stackIn_5_0 = 10;
              L4: while (true) {
                L5: {
                  if (stackIn_5_0 <= var4) {
                    break L5;
                  } else {
                    if ((this.field_i ^ -1L) < (this.field_j ^ -1L)) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_5_0 = ((this.field_j ^ -1L) < (this.field_i ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_i ^ -1L) ? 0 : 1));

                if (var5 != 0) {
                  continue L4;
                } else {
                  if (stackIn_5_0 <= 0) {
                    return var4;
                  } else {
                    this.field_j = this.field_i;
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_k = this.field_k + (this.field_j - this.field_i);
            this.field_i = this.field_i + (-this.field_i + this.field_j);
            this.field_j = this.field_j + param1;
            return 1;
          }
        }
    }

    final long a(int param0) {
        this.field_i = this.field_i + this.a(false);
        if (param0 != 17990) {
            this.a(74);
            if (!(this.field_i >= this.field_j)) {
                return (this.field_j - this.field_i) / 1000000L;
            }
            return 0L;
        }
        if (!(this.field_i >= this.field_j)) {
            return (this.field_j - this.field_i) / 1000000L;
        }
        return 0L;
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -119) {
                break L1;
              } else {
                g.b((byte) 111);
                break L1;
              }
            }
            L2: {
              var2 = jj.a(param1 + 14580, bk.a(124, param0));
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("g.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static String[] a(int param0, char param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var11 = (CharSequence) ((Object) param2);
                        var3_int = bi.a(var11, param1, 126);
                        var4 = new String[1 + var3_int];
                        var5 = 0;
                        var7 = 85 % ((param0 - -27) / 51);
                        var6 = 0;
                        var8 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3_int <= var8) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var10 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = var6;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == param2.charAt(var9)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9++;
                        if (var10 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = param2.substring(var6, var9);
                        var6 = var9 + 1;
                        var8++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4[var3_int] = param2.substring(var6);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = (String[]) (var4);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var3);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("g.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param2 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final long a(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_5_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_15_0 = 0L;
        long stackIn_17_0 = 0L;
        long stackIn_25_0 = 0L;
        long stackIn_27_0 = 0L;
        long stackIn_34_0 = 0L;
        long stackIn_36_0 = 0L;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    var2 = System.nanoTime();
                    var4 = -this.field_k + var2;
                    this.field_k = var2;
                    if (var4 > -5000000000L) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var8 > this.field_h) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_7_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                    stackIn_5_0 = stackIn_7_0;
                    if (var9 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = stackIn_5_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = var6 / (long)this.field_h;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    return 29L;
                }
                case 10: {
                    if (5000000000L > var4) {
                        statePc = 20;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var8 > this.field_h) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                    stackIn_15_0 = stackIn_17_0;
                    if (var9 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = stackIn_15_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = var6 / (long)this.field_h;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    return 29L;
                }
                case 20: {
                    this.field_e[this.field_f] = var4;
                    this.field_f = (this.field_f - -1) % 10;
                    if (1 > this.field_h) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (param0) {
                        statePc = 28;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var8 > this.field_h) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                    stackIn_25_0 = stackIn_27_0;
                    if (var9 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6 = stackIn_25_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = var6 / (long)this.field_h;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    return 29L;
                }
                case 30: {
                    this.field_h = this.field_h + 1;
                    if (param0) {
                        statePc = 37;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var8 > this.field_h) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                    stackIn_34_0 = stackIn_36_0;
                    if (var9 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var6 = stackIn_34_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = var6 / (long)this.field_h;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    return 29L;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
            String var4 = null;
            java.net.URL var5 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param0 == 1) {
                      break L1;
                    } else {
                      var4 = (String) null;
                      g.a(16, 'L', (String) null);
                      break L1;
                    }
                  }
                  var5 = param1.getCodeBase();
                  var3 = f.a(param1, var5, -123).getFile();
                  gm.a(true, "updatelinks", new Object[]{"home", var3 + "home.ws"}, param1);
                  gm.a(true, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, param1);
                  gm.a(true, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1);
                  gm.a(true, "updatelinks", new Object[]{"options", var3 + "options.ws"}, param1);
                  gm.a(true, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param1);
                  gm.a(true, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param1);
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

                stackIn_8_1 = new StringBuilder().append("g.D(").append(param0).append(',');

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
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    g() {
        this.field_f = 0;
        this.field_h = 1;
        this.field_i = 0L;
        this.field_k = 0L;
        this.field_j = 0L;
        this.field_e = new long[10];
        this.field_i = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_g = new int[128];
    }
}
