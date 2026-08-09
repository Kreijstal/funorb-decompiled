/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static wf field_a;
    static char[] field_d;
    static db[] field_b;
    static boolean field_e;
    static boolean field_c;

    final static boolean a(byte param0, char param1) {
        if (param0 >= 31) {
          if (param1 >= 48) {
            if (57 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = (char[]) null;
          if (param1 >= 48) {
            if (57 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 338) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static String a(char param0, String param1, String param2, byte param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_19_0 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param2.length();
                        var5 = param1.length();
                        var6 = var4_int;
                        var7 = var5 + -1;
                        if (0 != var7) {
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8_int = param2.indexOf((int) param0, var8_int);
                        if (-1 >= (var8_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var11 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var11 == 0) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = var6 + var7;
                        var8_int++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param3 <= -123) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_b = (db[]) null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = new StringBuilder(var6);
                        var9 = 0;
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
                        var10 = param2.indexOf((int) param0, var9);
                        if (var10 < 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        discarded$3 = var8.append(param2.substring(var9, var10));
                        discarded$4 = var8.append(param1);
                        var9 = var10 + 1;
                        if (var11 != 0) {
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
                        if (var11 == 0) {
                            statePc = 13;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        discarded$5 = var8.append(param2.substring(var9));
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
                        stackIn_19_0 = var8.toString();
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var4);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("ne.A(").append(param0).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param1 == null) {
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
                    if (param2 == null) {
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
                    throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_c = true;
        field_a = new wf((byte[]) null);
    }
}
