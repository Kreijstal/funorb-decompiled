/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_c;
    static int field_a;
    static String field_e;
    static jg field_b;
    static ne[] field_d;

    final static ha a(ki param0, int param1, d param2, java.awt.Canvas param3, int param4) {
        if (!of.c((byte) 119)) {
            throw new RuntimeException("");
        }
        if (param1 != -6708) {
            sb.a(false);
        }
        if (!mc.b((byte) 120, "jaggl")) {
            throw new RuntimeException("");
        }
        jaggl.OpenGL var9 = new jaggl.OpenGL();
        long var6 = var9.init(param3, 8, 8, 8, 24, 0, param4);
        if (var6 == 0L) {
            throw new RuntimeException("");
        }
        on var8 = new on(var9, param3, var6, param2, param0, param4);
        var8.e(false);
        return (ha) (Object) var8;
    }

    final static void a(int param0, int param1, int param2, int param3, fs param4) {
        param4.b((byte) 122, 12);
        param4.b(-42, 17);
        if (param1 <= 77) {
            Object var6 = null;
            ha discarded$0 = sb.a((ki) null, -117, (d) null, (java.awt.Canvas) null, 97);
        }
        param4.b(117, param3);
        param4.b(117, param2);
        param4.b((byte) 52, param0);
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_c = 40;
        }
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0, ki param1) {
        int var2 = 0;
        wc[] var4 = null;
        int var5_int = 0;
        vl[] var5 = null;
        int var6 = 0;
        fs var6_ref = null;
        Exception var7 = null;
        wc[] var7_array = null;
        wc[] var8 = null;
        int var9 = 0;
        fs var10 = null;
        int var11 = 0;
        fs var14 = null;
        wc[] var16 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Sumoblitz.field_L ? 1 : 0;
                    var2 = param1.a(param0 + 9937, "waves/");
                    var23 = param1.a(var2, -25915);
                    cb.field_a = new wc[41];
                    var4 = new wc[41];
                    var5_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var23.length <= var5_int) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6_ref = new fs(param1.a((byte) 94, var23[var5_int], var2));
                    var6_ref.field_p = var6_ref.field_p + 1;
                    var4[var5_int] = wr.a(true, var6_ref, false);
                    cb.field_a[var4[var5_int].field_a] = var4[var5_int];
                    var5_int++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 3: {
                    var2 = param1.a(param0 ^ param0, "levels/");
                    var24 = param1.a(var2, -25915);
                    var5 = new vl[var24.length];
                    dr.field_S = new vl[25];
                    var6 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var24.length <= var6) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var14 = new fs(param1.a((byte) 98, var24[var6], var2));
                    var14.field_p = var14.field_p + 1;
                    var5[var6] = pi.a(var14, true, 102);
                    if (25 > var5[var6].field_e) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 7: {
                    dr.field_S[var5[var6].field_e] = var5[var6];
                    var6++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 9: {
                    ab.field_a = new te(16);
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (9 <= var6) {
                        statePc = 20;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    try {
                        var2 = param1.a(0, "engineered_levels/" + (1 + var6) + "/");
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var7 = (Exception) (Object) caughtException;
                    var6++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 14: {
                    if ((var2 ^ -1) != 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 16: {
                    var25 = param1.a(var2, -25915);
                    var16 = new wc[var25.length];
                    var7_array = var16;
                    var8 = new wc[var25.length];
                    var9 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var9 >= var25.length) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = new fs(param1.a((byte) 106, var25[var9], var2));
                    var10.field_p = var10.field_p + 1;
                    var7_array[var9] = wr.a(true, var10, false);
                    var8[var16[var9].field_a] = var16[var9];
                    var9++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 19: {
                    ab.field_a.a((ms) (Object) new om(var8), param0 ^ 9936, (long)sp.field_x[var6]);
                    var6++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, int param1, int param2, byte param3) {
        if (param3 <= 46) {
            return 59;
        }
        return se.a(19886);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_e = "Open in popup window";
        field_c = 250;
        field_b = new jg();
    }
}
