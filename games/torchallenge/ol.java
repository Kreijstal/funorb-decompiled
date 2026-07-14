/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_i;
    static int[][] field_e;
    static int field_d;
    static int[][][] field_c;
    static int field_h;
    static String field_f;
    static boolean field_a;
    static String[] field_b;
    static ra field_g;

    final static int b(int param0) {
        if (param0 > -115) {
            return 44;
        }
        return (int)(1000000000L / cj.field_i);
    }

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_g = null;
        if (param0 > -41) {
            field_i = null;
        }
    }

    final static e a(int param0, fe param1, int param2) {
        if (param0 > -116) {
            Object var4 = null;
            e discarded$0 = ol.a(-70, (fe) null, -27);
        }
        return we.a(nc.a(param1, 100, param2), 6222);
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (uj.field_a.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 8;
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
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        if (param1) {
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
                        ol.a((byte) -9);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
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
                        if (var3 >= param0.length()) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0, uj param1) {
        if (param0 != -119) {
            int discarded$0 = ol.b(-70);
        }
        return param1.a((byte) -76);
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if ((var1 ^ -1L) > (vk.field_f ^ -1L)) {
            mh.field_f = mh.field_f + (-var1 + vk.field_f);
        }
        if (param0 != 256) {
            field_b = null;
        }
        vk.field_f = var1;
        return var1 + mh.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Password is valid";
        field_e = new int[][]{new int[2], new int[2], new int[2]};
        field_h = 0;
        field_a = false;
        field_b = new String[]{"Fight your way to the top of the tower, defeating enemies and collecting seals along the way. You must collect 3 seals from 5 to unlock the exit. When you die, you start again at the last seal you collected. For every 5 seals collected, your monk's life force increases by 1 point. Passing over a collected seal will recharge your health.", "Choose one of the three brave young monks to play as. Each has their own special abilities.", null, null, "Each enemy that is defeated increases the monk's combo counter. When the monk's combo counter is full, it flashes for a short time before discharging. During this time, the monk's attacks will inflict extra damage.", null, "Collect coins to score points. There are a total of 3 jade coins hidden among the towers.", "Large bonus crystals are hidden among the towers. Collect one to reveal 10 small bonus crystals. Collect all 10 within the time limit to earn a score multiplier and an extra life.", "Health potions and extra lives are dotted around the towers.", "Help posts are located at important points to guide you in your quest. You can enable or disable the help posts from the menu."};
        field_c = new int[8][3][5];
    }
}
