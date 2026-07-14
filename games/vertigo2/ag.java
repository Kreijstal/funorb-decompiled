/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static nj field_b;
    static String field_c;
    static String[] field_a;

    final static aa a(cr param0, cr param1, int param2, int[] param3, cr param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        aa[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        q var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Vertigo2.field_L ? 1 : 0;
                    var5 = param3.length;
                    if (param2 > 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new aa[var5];
                    var9 = 49;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var10_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10_int >= var5) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = wm.field_k.a(1, param3[var10_int]);
                        var6[var10_int] = var11.h(33);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 8: {
                    return new aa(0L, param4, param1, param0, var8, param3, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -2883) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 != 49) {
            boolean discarded$0 = ag.b(-63);
        }
        return sq.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nj();
        field_c = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new String[]{"Contains enough paint for five tiles; comes in blue and purple.", "This is worth 100 points.", "Lets you destroy blocks around you; use it to save paint.", "Pick this up to gain an extra life!", "Lets you jump higher than normal. Each jetpack has enough fuel for one use.", "Saves the level so that, if you die, you'll start from when you touched it.", "Shows the entire level to aid navigation."};
    }
}
