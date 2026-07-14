/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class tl {
    static bk field_a;
    int field_d;
    String field_c;
    static int field_b;

    public static void b(int param0) {
        if (param0 != 80) {
            return;
        }
        field_a = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(String param0, String param1, int param2) {
        if (param2 <= 102) {
            return;
        }
        ej.a((byte) -121, param0, param1, false);
    }

    final static vk a(int param0, boolean param1) {
        w var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        w var8 = null;
        vd var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_22_0 = null;
        int[] stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Main.field_T;
                    if (param0 == 24881) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (vk) null;
                }
                case 2: {
                    var8 = rd.field_j;
                    var2 = var8;
                    var3 = var8.f(-112);
                    if (0 == (var3 & 128)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    gg.field_a = stackIn_5_0 != 0;
                    hg.field_b = 127 & var3;
                    be.field_a = var8.f(102);
                    ff.field_a = var8.d(true);
                    if (hg.field_b == 2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    bi.field_a = 0;
                    fg.field_l = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    fg.field_l = var8.d((byte) 72);
                    bi.field_a = var8.e(true);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var8.f(76) != 1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    cd.field_g = var8.c(false);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    fj.field_c = cd.field_g;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    fj.field_c = var8.c(false);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((hg.field_b ^ -1) == -2) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((hg.field_b ^ -1) == -5) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.d((byte) 72);
                    String discarded$5 = var8.c(false);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.d((byte) 72);
                    String discarded$7 = var8.c(false);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param1) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.d((byte) 72);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = mh.field_d.a(var5, -32769);
                        hi.field_b = var9.b((byte) 28);
                        if (!fj.field_c.equals((Object) (Object) ri.field_c)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = ((vd) var9).field_m;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        bl.field_c = (int[]) (Object) stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new vk(param1);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    k.a((Throwable) (Object) var6, (byte) 111, "CC1");
                    bl.field_c = null;
                    hi.field_b = null;
                    return new vk(param1);
                }
                case 27: {
                    hi.field_b = ab.a((pb) (Object) var8, param0 ^ 24921, 80);
                    bl.field_c = null;
                    return new vk(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          ((tl) this).field_d = 5;
          return new java.net.Socket(((tl) this).field_c, ((tl) this).field_d);
        } else {
          return new java.net.Socket(((tl) this).field_c, ((tl) this).field_d);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bk();
    }
}
