/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb implements ga {
    static String field_c;
    static int field_d;
    static ki field_b;
    private long field_a;

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        if (20 < var2_int) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = 20;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = new char[var2_int];
                        var7 = var8;
                        var3 = var7;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 24;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = param0.charAt(var4);
                        var10 = var5 ^ -1;
                        var9 = -66;
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 < var10) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 == var10) {
                            statePc = 26;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5 > 90) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3[var4] = (char)(32 + var5);
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 < 97) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (122 >= var5) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5 < 48) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var5 > 57) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var4] = (char)var5;
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3[var4] = (char)95;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param1 == 122) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        field_b = (ki) null;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = new String(var8);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_30_0 = (RuntimeException) (var2);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = new StringBuilder().append("wb.BA(");
                    stackIn_29_1 = stackIn_30_1;
                    if (param0 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw dd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract qd a(byte param0);

    final static String a(CharSequence[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -123) {
              stackIn_4_0 = vi.a(param0, 0, param0.length, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("wb.AA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != 7312) {
            return;
        }
        field_b = null;
    }

    public final String a(int param0) {
        if (!this.c(25296)) {
          if ((350L + this.field_a ^ -1L) >= (ji.b(123) ^ -1L)) {
            if (param0 <= 121) {
              field_c = (String) null;
              return this.e(-45);
            } else {
              return this.e(-45);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String e(int param0);

    public final qd d(int param0) {
        if (this.c(25296)) {
          return fm.field_a;
        } else {
          if ((350L + this.field_a ^ -1L) >= (ji.b(-84) ^ -1L)) {
            if (param0 != -7847) {
              return (qd) null;
            } else {
              return this.a((byte) 75);
            }
          } else {
            return ml.field_a;
          }
        }
    }

    public final void b(int param0) {
        this.field_a = ji.b(param0 + 21066);
        if (param0 != -20959) {
            field_c = (String) null;
        }
    }

    static {
        field_c = "Email is valid";
    }
}
