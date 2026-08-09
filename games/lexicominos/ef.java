/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_e;
    static String field_c;
    static int field_f;
    static db[] field_d;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        CharSequence[] var2;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          var2 = (CharSequence[]) null;
          ef.a((CharSequence[]) null, 75);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_e = 96;
                break L1;
              }
            }
            stackIn_3_0 = vl.a(param0.length, param0, 0, -96);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ef.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static kb a(long param0, int param1, String param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        pf stackIn_5_0 = null;
        a stackIn_7_0 = null;
        kb stackIn_10_0 = null;
        fk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0L != param0) {
                break L1;
              } else {
                if (param2 != null) {
                  stackIn_7_0 = new a(param2, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param3) {
              if (param1 == -27981) {
                stackIn_12_0 = new fk(param0, param4);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_10_0 = (kb) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_5_0 = new pf(param0, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ef.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kb) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kb) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (kb) ((Object) stackIn_12_0);
            }
          }
        }
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        String stackIn_3_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        var3 = new StringBuilder(var2_int);
                        if (param1 <= -12) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 31;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = param0.charAt(var4);
                        if (var5 < 97) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (122 >= var5) {
                            statePc = 27;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 < 48) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 <= 57) {
                            statePc = 28;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 < 65) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (90 < var5) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        discarded$0 = var3.append((char)(-65 + (var5 + 97)));
                        if (var7 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var5 == 43) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5 != 38) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        discarded$1 = var3.append('+');
                        if (var7 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = var3.length();
                        if ((var6 ^ -1) >= -1) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-96 != (var3.charAt(var6 - 1) ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        discarded$2 = var3.append('_');
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        discarded$3 = var3.append((char) var5);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        discarded$4 = var3.append((char) var5);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        discarded$5 = var3.append((char) var5);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = var3.toString();
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0;
                }
                case 33: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_35_0 = (RuntimeException) (var2);
                    stackIn_34_0 = stackIn_35_0;
                    stackIn_35_1 = new StringBuilder().append("ef.D(");
                    stackIn_34_1 = stackIn_35_1;
                    if (param0 == null) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    throw ld.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = 0;
        field_c = "Waiting for extra data";
        field_a = 0;
    }
}
