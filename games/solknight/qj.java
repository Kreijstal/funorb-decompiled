/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String[] field_a;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int >= fb.field_b.length) {
                            statePc = 20;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param3 = fb.field_b[var5_int];
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = var5_int << -634199996;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$4 = param3;
                        param3--;
                        if (incrementValue$4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$5 = var6;
                        var6++;
                        param4 = he.field_a[incrementValue$5];
                        dupTemp$6 = param1[param4];
                        dupTemp$7 = param2[dupTemp$6];
                        param2[dupTemp$6] = dupTemp$7 + 1;
                        he.field_a[dupTemp$7] = param4;
                        if (var7 != 0) {
                            statePc = 11;
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
                        if (var7 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int++;
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
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("qj.A(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -100) {
            int[] var2 = (int[]) null;
            qj.a(-2, (byte[]) null, (int[]) null, 24, 76);
        }
    }

    static {
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
