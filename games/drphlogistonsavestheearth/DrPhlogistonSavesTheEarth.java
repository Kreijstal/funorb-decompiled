/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class DrPhlogistonSavesTheEarth extends sl {
    static nh field_J;
    static vd field_F;
    static long field_I;
    static String field_L;
    static int field_K;
    private int field_H;
    static String field_E;
    private boolean field_C;
    static he[] field_G;
    public static boolean field_D;

    public final void init() {
        try {
            this.a(12, "drphlogistonsavestheearth", (byte) 12);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.init()");
        }
    }

    private final he[] a(he param0, byte param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        he[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new he[1];
            var4 = -95 / ((param1 - 56) / 32);
            var3[0] = be.a(param0);
            var3[0].c();
            stackIn_1_0 = (he[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.PA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void d(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        we.a(qa.field_O, -106, 82.0f);
                        bd.field_P = qk.a("", kf.field_d, "weapongattlinggun", true);
                        le.field_d = qk.a("", kf.field_d, "weapongattlinggun2", true);
                        qf.field_b = qk.a("", kf.field_d, "weapongattlinggun3", param0);
                        lh.field_p = qk.a("", kf.field_d, "weaponhomingmissile", true);
                        nc.field_K = qk.a("", kf.field_d, "weaponbomb", true);
                        f.field_i = cl.a("", kf.field_d, -116, "weaponmegacannonshot");
                        oj.field_c = ij.a("bulletspark", (byte) 96, kf.field_d, "");
                        hb.field_a = new nh(15, 15);
                        hb.field_a.c();
                        wj.b(7, 7, 7, 8388608);
                        lb.field_C.a(123);
                        oi.field_d = new nh(20, 20);
                        oi.field_d.c();
                        wj.b(9, 9, 6, 61568);
                        lb.field_C.a(119);
                        li.field_i = new nh(10, 10);
                        li.field_i.c();
                        wj.b(5, 5, 5, 8421504);
                        lb.field_C.a(122);
                        al.field_b = new nh(800, 32);
                        al.field_b.c();
                        wj.g(0, 7, 800, 16711680);
                        wj.g(0, 8, 800, 16776960);
                        wj.g(0, 9, 800, 16777215);
                        wj.g(0, 10, 800, 16777215);
                        wj.g(0, 11, 800, 16776960);
                        wj.g(0, 12, 800, 16711680);
                        lb.field_C.a(101);
                        kc.field_p = new nh(32, 430);
                        kc.field_p.c();
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= 16) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        wj.c(var2_int, 430 * (-var2_int + 16) / 16, 430, 16711680 - -(var2_int * 4096));
                        wj.c(-var2_int + 31, (6880 - 430 * var2_int) / 16, 430, 16711680 - -(4096 * var2_int));
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lb.field_C.a(98);
                        kc.field_q = new nh(800, 20);
                        kc.field_q.c();
                        wj.g(0, 6, 800, 65280);
                        wj.g(0, 7, 800, 65280);
                        wj.g(0, 8, 800, 65535);
                        wj.g(0, 9, 800, 16777215);
                        wj.g(0, 10, 800, 16777215);
                        wj.g(0, 11, 800, 65535);
                        wj.g(0, 12, 800, 65280);
                        wj.g(0, 13, 800, 65280);
                        lb.field_C.a(127);
                        qa.field_M = new nh(20, 20);
                        qa.field_M.c();
                        wj.b(9, 9, 6, 8421376);
                        lb.field_C.a(104);
                        nd.field_L = new nh(20, 20);
                        nd.field_L.c();
                        wj.b(9, 9, 6, 8421376);
                        lb.field_C.a(97);
                        sa.field_c = new nh(20, 20);
                        sa.field_c.c();
                        wj.b(9, 9, 6, 8388736);
                        lb.field_C.a(110);
                        field_J = sa.field_c;
                        mh.field_c = nd.field_L;
                        jj.field_c = new nh(800, 32);
                        jj.field_c.c();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var2_int ^ -1) <= -17) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        wj.g(0, var2_int, 800, 4096 * var2_int + 16711680);
                        wj.g(0, 32 - var2_int, 800, 16711680 + 4096 * var2_int);
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        wj.g(0, 16, 800, 16777215);
                        lb.field_C.a(117);
                        am.field_o = new nh(8, 8);
                        am.field_o.c();
                        wj.b(4, 4, 4, 65535);
                        lb.field_C.a(111);
                        ik.field_b = new nh(3, 3);
                        ik.field_b.c();
                        wj.b(1, 1, 1, 65408);
                        lb.field_C.a(105);
                        cj.field_d = new nh(256, 256);
                        lb.field_C.a(111);
                        db.field_e = new nh(1, 1);
                        ii.field_b = ij.a("playerfxspawn", (byte) 78, kf.field_d, "");
                        ub.a(0);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.GB(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final he[] a(int param0, int param1, he param2) {
        he[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        he[] stackIn_7_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -1745) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_G = (he[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = new he[param1];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 <= var5) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_11_0 = (he[]) (var4);
                        stackIn_7_0 = stackIn_11_0;
                        if (var6 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_7_0[var5] = param2;
                        var5++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (he[]) (var4);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var4_ref);
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.MB(").append(param0).append(',').append(param1).append(',');
                    stackIn_13_1 = stackIn_15_1;
                    if (param2 == null) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_13_1);
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
                    throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        boolean discarded$0 = false;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        je var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ia.a((byte) 9);
                        if (!this.field_C) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!s.field_a.e(16)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        sc.a(-1, true, ad.field_q);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (df.field_l == null) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!df.field_l.field_h) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        qk.a(true);
                        vj.b((byte) 72);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 == 35) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.a((he[]) null, 93, (he[]) null);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_20_0 = this;
                        stackIn_18_0 = stackIn_20_0;
                        if (df.field_l == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_21_0 = this;
                        stackIn_21_1 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = this;
                        stackIn_21_1 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.a(stackIn_21_1 != 0, 55);
                        if (!nd.field_Q) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.p(-119);
                        nd.field_Q = false;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ni.field_x = ni.field_x + 1;
                        lf.field_b = lf.field_b + 1;
                        if (kh.a(false)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.m(-128);
                        if (!kh.a(false)) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (bj.a(13)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        discarded$0 = this.b(false, -111);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return;
                }
                case 35: {
                    try {
                        if (this.field_C) {
                            statePc = 42;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ui.a(ma.field_sb, param0 + -34);
                        if (!this.b(true, param0 ^ -88)) {
                            statePc = 109;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_C = true;
                        if (var5 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!a.a(param0 ^ -27336)) {
                            statePc = 98;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!pf.a((byte) 97)) {
                            statePc = 71;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var2_int = (int)(32.0 * ji.a(65535, (double)ni.field_x / 25.0) + 224.0);
                        var3 = 3 * var2_int / 4;
                        pj.field_E = var2_int + ((var3 << -357803408) - -(var3 << -1873746072));
                        var2_int = (int)(224.0 + pj.a((double)ni.field_x / 25.0, param0 ^ 32803) * 32.0);
                        a.field_i = var2_int << 361898928;
                        if (ul.field_a != 0) {
                            statePc = 65;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4 = qg.n((byte) 46);
                        if (2 != var4) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        qk.a(true);
                        if (var5 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-4 == (var4 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (-5 == (var4 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        wl.a(-2, 0, 108);
                        if (var5 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        s.a(true, (byte) -121);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var5 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.v(-8755);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (pf.a((byte) 97)) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        th.field_a[hl.field_f].a(true, (byte) 98);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var5 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (bb.a((byte) -103)) {
                            statePc = 77;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.v(param0 + -8790);
                        if (var5 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_82_0 = this;
                        stackIn_78_0 = stackIn_82_0;
                        stackIn_82_1 = 5017;
                        stackIn_78_1 = stackIn_82_1;
                        if (null == df.field_l) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_80_0 = this;
                        stackIn_80_1 = stackIn_78_1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_83_0 = this;
                        stackIn_83_1 = stackIn_80_1;
                        stackIn_83_2 = 1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = this;
                        stackIn_83_1 = stackIn_82_1;
                        stackIn_83_2 = 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var2_int = this.b(stackIn_83_1, stackIn_83_2 != 0);
                        if ((var2_int ^ -1) == -2) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-3 == (var2_int ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (null != df.field_l) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        hb.a(-5, df.field_l);
                        df.field_l.a(sb.field_d, true);
                        df.field_l = null;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if ((var2_int ^ -1) == -3) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        DrPhlogistonSavesTheEarth.a(nb.a(-106), -117);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var5 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        hc.b((byte) -51);
                        if (!a.a(-27365)) {
                            statePc = 109;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        bh.b(-95);
                        gf.b((byte) 86);
                        if ((hl.field_f ^ -1) != -10) {
                            statePc = 109;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (-1 != (ej.field_h ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        hl.field_f = 2;
                        ek.a(-114, false, 2);
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (!oh.a(0)) {
                            statePc = 112;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var2 = (je) ((Object) nf.field_x.d(180479896));
                        if (var2 == null) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        wb.a(true, 4, var2);
                        if (var5 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var5 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (!th.a(false, vi.field_a)) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.c(true);
                        if (var5 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var5 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        qj.a(0, 14656);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (sb.b(-11)) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var2_int = this.b(false);
                        if (var2_int == 0) {
                            statePc = 132;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (var2_int == 1) {
                            statePc = 132;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        el.a(false, 2);
                        ka.a(3, (byte) -40);
                        i.a(4, 0);
                        dj.a(false, 5);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (-3 != (var2_int ^ -1)) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        am.e(11);
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (vi.field_c == null) {
                            statePc = 148;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (!vi.field_c.field_i) {
                            statePc = 148;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (gf.field_D >= vi.field_c.field_j[0]) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        gf.field_D = vi.field_c.field_j[0];
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        vi.field_c = null;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 147: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.BA(" + param0 + ')');
                }
                case 148: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        we.a(qa.field_O, -89, 88.0f);
                        of.field_x = eh.a("", (byte) -61, kf.field_d, "poweruplife");
                        od.field_k = eh.a("", (byte) -66, kf.field_d, "poweruppoints100");
                        qc.field_a = eh.a("", (byte) -56, kf.field_d, "poweruppoints1000");
                        p.field_e = eh.a("", (byte) -31, kf.field_d, "poweruppoints5000");
                        c.field_a[0] = eh.a("", (byte) -47, kf.field_d, "powerupx2");
                        c.field_a[1] = eh.a("", (byte) -23, kf.field_d, "powerupx3");
                        c.field_a[2] = eh.a("", (byte) -96, kf.field_d, "powerupx4");
                        c.field_a[3] = eh.a("", (byte) -92, kf.field_d, "powerupx5");
                        c.field_a[4] = eh.a("", (byte) -55, kf.field_d, "powerupx6");
                        ri.field_b = eh.a("", (byte) -71, kf.field_d, "powerupshield");
                        re.field_d = eh.a("", (byte) -110, kf.field_d, "powerupweapon");
                        si.f(10);
                        di.field_b = ij.a("awardarray_big", (byte) 63, kf.field_d, "");
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (di.field_b.length <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        di.field_b[var2_int].c();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        tl.field_P = eh.a("basic", (byte) -53, ph.field_b, "unachieved");
                        ce.field_b = eh.a("basic", (byte) -39, ph.field_b, "orbcoin");
                        ge.field_d = eh.a("basic", (byte) -55, ph.field_b, "locked");
                        ol.a(false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (9 <= var2_int) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        eb.field_e[var2_int] = new nh(64, 64);
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        eb.field_e[0].c();
                        wj.f(0, 0, 64, 64, 10836, 21672);
                        oi.field_f.a(0, 0, 256, 64);
                        eb.field_e[1].c();
                        wj.f(0, 0, 64, 64, 262656, 11754240);
                        sg.field_e.a(0, 0, 256, 64);
                        eb.field_e[2].c();
                        wj.f(0, 0, 64, 64, 258, 13932);
                        uk.field_h.a(0, 0, 256, 64);
                        eb.field_e[3].c();
                        nb.field_b.a(0, 0);
                        kl.field_R[0].d(0, 0);
                        eb.field_e[4].c();
                        nb.field_b.a(0, 0);
                        sh.field_b.d(-715, -185);
                        od.field_i[0].a(10, 5);
                        eb.field_e[5].c();
                        nb.field_b.a(0, 0);
                        be.a(sh.field_b, -715, -75);
                        eb.field_e[6].c();
                        wj.f(0, 0, 64, 64, 7091712, 131328);
                        vi.field_g.a(0, 0, 256, 64);
                        var2_int = -13 % ((param0 - 56) / 56);
                        eb.field_e[7].c();
                        wj.f(0, 0, 64, 64, 27648, 512);
                        vi.field_g.a(0, 0, 256, 64);
                        eb.field_e[8].c();
                        wj.f(0, 0, 64, 64, 27648, 512);
                        vi.field_g.a(-30, 0, 256, 64);
                        md.field_f = new nh(64, 64);
                        md.field_f.c();
                        wj.f(0, 0, 64, 64, 2897296, 0);
                        cb.field_b.b("?", 32, 32, 16777215, 1);
                        wi.field_a = new nh(64, 64);
                        wi.field_a.c();
                        wj.f(0, 0, 64, 64, 2897296, 0);
                        cb.field_b.b("?", 32, 32, 16777215, 1);
                        ge.field_d.b(32, 32);
                        lb.field_C.a(103);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.VA(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              DrPhlogistonSavesTheEarth.u(-16387);
              vd.a(true);
              dk.a(24);
              tb.a((byte) 35);
              ul.a((byte) 8);
              rk.a((byte) 52);
              gd.a(-27770);
              ld.e((byte) 39);
              ij.a(15596);
              sl.j(26395);
              gl.a(false);
              li.c(-1);
              fi.a(125);
              fe.a((byte) 119);
              aj.a(45);
              oi.a((byte) 86);
              wj.d();
              vj.c(0);
              pc.a(13302);
              bc.a(66);
              od.d(4);
              la.a((byte) 0);
              lf.a(-127);
              le.a(param0);
              oe.a(5);
              kf.a(23050);
              th.a((byte) 111);
              al.a(false);
              oh.a(false);
              bj.a(true);
              we.a((byte) 120);
              qh.a(1);
              ab.a(false);
              if (param0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              m.a(stackIn_4_0 != 0);
              na.a((byte) -33);
              sb.a((byte) 33);
              q.a(25270);
              wg.b(2);
              ng.a(0);
              cf.a(-127);
              mk.a(0);
              j.h(24342);
              nb.a((byte) 76);
              i.a((byte) -118);
              gb.b(6);
              n.b(-31553);
              df.c(110);
              ge.a(false);
              qe.c(0);
              oj.a(false);
              fj.d(57);
              gf.a(param0);
              ib.a(9);
              bf.c((byte) -114);
              td.a(869637800);
              ck.a(7268);
              gi.b(10589);
              ug.h(-921185753);
              tg.a(0);
              cc.a((byte) -8);
              rl.f();
              am.f(-112);
              if (param0) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            ml.a(stackIn_8_0 != 0);
            id.e();
            eb.a(5);
            ql.a((byte) -114);
            of.g(1024);
            gk.a(false);
            d.a((byte) 39);
            rf.a();
            ui.a(-19662);
            rg.a((byte) -20);
            di.a((byte) 27);
            ea.a(0);
            kh.a((byte) -63);
            mg.a((byte) 5);
            wd.a(99);
            eg.a(-1);
            qj.a((byte) -126);
            k.g((byte) 52);
            qd.o(9791);
            tf.c(false);
            el.n(20);
            ma.n(19678);
            v.j(3);
            ff.i(-1);
            wa.j(-11179);
            ah.k(-988);
            a.b(2);
            sf.a(param0);
            ub.a((byte) -119);
            s.a(7);
            fb.a(256);
            cb.a((byte) 122);
            mf.g(-62);
            uh.d(-24338);
            lh.p(0);
            jj.a(111);
            nk.a();
            sg.a((byte) -57);
            tk.b();
            gj.b();
            ha.a((byte) 69);
            pe.b(0);
            be.a();
            hi.b(109);
            aa.a(1);
            ee.a(1);
            ii.a(110);
            db.a((byte) 89);
            u.a((byte) 50);
            t.a((byte) -114);
            ta.b(1441320386);
            cl.d(0);
            hl.e(108);
            cm.a((byte) -113);
            ik.a(0);
            bi.a((byte) 119);
            de.d(117);
            pf.b(-79);
            c.a((byte) -58);
            lb.h(30);
            fl.a(118);
            qc.a(24937);
            ae.n(1);
            kk.a((byte) 44);
            l.a(0);
            uc.c();
            sh.a((byte) 119);
            ej.a(12018);
            ja.a(93);
            fc.a(-60);
            af.a(4);
            pd.a(false);
            mh.a((byte) -9);
            r.a((byte) 11);
            ce.a(-105);
            hc.c((byte) -98);
            hm.c(-99);
            ua.a((byte) 50);
            rc.a(2);
            qf.a((byte) 64);
            bh.a(67);
            gh.a();
            lc.b((byte) 111);
            sc.a(-63);
            ki.a(true);
            hb.a((byte) 101);
            ch.b((byte) 94);
            lg.a((byte) -119);
            fm.a(-109);
            vg.f((byte) -102);
            hf.f(7966);
            si.g(6714);
            ca.m(-2110416344);
            bd.a((byte) -120);
            pj.f(-86);
            rh.b(-2);
            ob.a((byte) 52);
            cj.a(-95);
            ai.h(-30463);
            p.a(-29912);
            ac.a((byte) -91);
            ol.a((byte) -116);
            eh.a((byte) -84);
            wi.a(2);
            ji.a(true);
            ph.a(1);
            hj.a(-20385);
            qk.b(65280);
            bk.b(66);
            fa.e(-57);
            ga.a((byte) -4);
            wb.b(34);
            gg.b(-339514552);
            nj.b(0);
            ig.e(-15877);
            ri.a(param0);
            dh.j(3);
            qg.n(-1);
            kl.j((byte) 78);
            jf.h((byte) 127);
            hd.b(false);
            jd.a((byte) 108);
            qa.a((byte) 122);
            gm.h(-112);
            ci.i(-76);
            nc.a((byte) 126);
            ei.d(1);
            md.a(75);
            ih.l(288);
            nd.b(true);
            tl.a((byte) -39);
            da.a();
            hh.a(false);
            o.a((byte) 99);
            jc.c((byte) 56);
            rb.a(0);
            pi.j(2147483647);
            jk.j(7624);
            sa.a(250);
            tc.a(-9292);
            dg.a(true);
            wh.c((byte) -86);
            rd.g(-125);
            ka.c(26713);
            pa.a(-1);
            re.b(967);
            oa.a(71);
            vb.d(4);
            bg.a((byte) 102);
            sj.a(true);
            kc.a((byte) -1);
            ie.c(78);
            uk.a(false);
            mj.c(2147483647);
            dm.d((byte) -126);
            ue.a(117);
            dl.j(0);
            hg.h(-15);
            b.d(-382);
            uf.a((byte) -60);
            f.d(-1);
            je.a((byte) 19);
            nl.a((byte) -106);
            vc.a(0);
            bb.b(param0);
            wk.d(80);
            qb.a(false);
            og.a(120);
            sd.a(2);
            lk.a(-27996);
            ll.d((byte) 104);
            dd.a(false);
            ia.b(27174);
            ek.e(-126);
            uj.d(1);
            jl.d(65535);
            kj.a(14970);
            mi.b((byte) 91);
            ad.e(0);
            ni.d((byte) 125);
            g.b(true);
            nf.d((byte) -95);
            cd.b((byte) -47);
            fk.a((byte) 111);
            vh.a(84);
            dc.c(88);
            vi.a(2823);
            this.field_z = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.W(" + param0 + ')');
        }
    }

    final static boolean t(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 18137) {
              L1: {
                L2: {
                  if (uj.field_j == null) {
                    break L2;
                  } else {
                    if (!tl.field_O.a(false)) {
                      break L2;
                    } else {
                      stackIn_10_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "DrPhlogistonSavesTheEarth.IB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void p(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != df.field_m) {
                q.a(df.field_m, 255);
                df.field_m = null;
                tc.a((byte) 86);
                break L1;
              } else {
                break L1;
              }
            }
            kf.field_d = al.a(3, 1);
            aa.field_b = al.a(3, 2);
            ua.field_b = al.a(3, 3);
            ui.field_a = al.a(3, 4);
            df.field_a = al.a(3, 5);
            mh.field_a = al.a(3, 6);
            ff.field_P = al.a(3, 7);
            s.c((byte) 126);
            var2_int = -107 % ((-65 - param0) / 41);
            gd.a(si.field_E, 255, ph.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.RA(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 176) {
              var3_int = param0 >> 1153343807 & param1 - 1;
              stackIn_4_0 = (param0 - -(param0 >>> -144144289)) % param1 - -var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -7;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "DrPhlogistonSavesTheEarth.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final he[] a(he[] param0, int param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        he[] stackIn_7_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = new he[param0.length];
                        if (param1 == 65793) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.h(-112);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4 ^ -1) <= (var3.length ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3[var4] = param0[var4].e();
                        stackIn_11_0 = (he[]) (var3);
                        stackIn_7_0 = stackIn_11_0;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((he) (Object) stackIn_7_0[var4]).d();
                        var4++;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (he[]) (var3);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var3_ref);
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.CB(");
                    stackIn_13_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_13_1);
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
                    throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, he[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3_int = 0;
                        if (param0 >= 80) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_J = (nh) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1.length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 18;
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
                        param1[var3_int].c();
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 18;
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
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.WA(").append(param0).append(',');
                    stackIn_14_1 = stackIn_16_1;
                    if (param1 == null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_14_1);
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
                    throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void h(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (df.field_l != null) {
                stackIn_5_0 = df.field_l;
                break L1;
              } else {
                stackIn_5_0 = n.field_g;
                break L1;
              }
            }
            var2 = stackIn_5_0;
            if (kh.a(false)) {
              L2: {
                if (null == df.field_l) {
                  stackIn_12_0 = pj.field_C ? 1 : 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              o.a(stackIn_12_0 != 0, 320, (java.awt.Canvas) (var2));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.field_C) {
                dh.a(41, (java.awt.Canvas) (var2));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (a.a(-27365)) {
                  L3: {
                    L4: {
                      if (r.field_d != hl.field_f) {
                        break L4;
                      } else {
                        L5: {
                          if (hl.field_f != -1) {
                            break L5;
                          } else {
                            sd.field_a.y(6212);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        th.field_a[hl.field_f].f(-8448);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (16 <= ue.field_b) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              if (0 == (hl.field_f ^ -1)) {
                                break L9;
                              } else {
                                th.field_a[hl.field_f].f(-8448);
                                if (var4 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            sd.field_a.y(6212);
                            break L8;
                          }
                          be.a(ue.field_b * 15 - -1);
                          be.a(0, 0, 640, 480, 14713896, ue.field_b * 10);
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L10: {
                        L11: {
                          lf.field_b = 0;
                          if (r.field_d == -1) {
                            break L11;
                          } else {
                            th.field_a[r.field_d].f(-8448);
                            if (var4 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        sd.field_a.y(6212);
                        break L10;
                      }
                      be.a(15 * (-ue.field_b + 32 + 1));
                      be.a(0, 0, 640, 480, 22070844, -(10 * ue.field_b) + 320);
                      break L6;
                    }
                    if ((ue.field_b ^ -1) != -1) {
                      break L3;
                    } else {
                      if (r.field_d != 11) {
                        break L3;
                      } else {
                        ti.a(true, 0);
                        break L3;
                      }
                    }
                  }
                  L12: {
                    if (!pf.a((byte) 97)) {
                      break L12;
                    } else {
                      wj.a(0, 0, wj.field_k, wj.field_c);
                      ug.a(ca.field_W[0].field_y, ca.field_W[0].field_w, ca.field_W, 37);
                      break L12;
                    }
                  }
                  L13: {
                    if (0 != ul.field_a) {
                      var3 = 256 * ue.field_b / 32;
                      if (var3 <= 0) {
                        break L13;
                      } else {
                        wj.d(0, 0, wj.field_k, wj.field_c, 0, var3);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (!bb.a((byte) -103)) {
                          break L16;
                        } else {
                          if (!pf.a((byte) 97)) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (!fl.b(73)) {
                        break L14;
                      } else {
                        if (!pf.a((byte) 97)) {
                          wj.a(0, 0, wj.field_k, wj.field_c);
                          qe.a(ca.field_W[0].field_y, ca.field_W[0].field_w, ca.field_W, (byte) -76);
                          if (var4 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      stackIn_86_0 = 91;

                      if (df.field_l != null) {
                        stackIn_87_0 = stackIn_86_0;
                        stackIn_87_1 = 1;
                        break L17;
                      } else {

                        stackIn_87_0 = stackIn_86_0;
                        stackIn_87_1 = pj.field_C ? 1 : 0;
                        break L17;
                      }
                    }
                    dh.a((byte) stackIn_87_0, stackIn_87_1 != 0);
                    break L14;
                  }
                  L18: {
                    if (-3 < (nj.field_j ^ -1)) {
                      break L18;
                    } else {
                      a.field_g.c(qj.field_c + " lps", 15, 15, 16777215, 65793);
                      break L18;
                    }
                  }
                  DrPhlogistonSavesTheEarth.a(param0, -74, (java.awt.Canvas) (var2), 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  we.a(ia.field_b, -119, 100.0f);
                  dh.a(21, (java.awt.Canvas) (var2));
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.LA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void v(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -8755) {
                break L1;
              } else {
                field_F = (vd) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (ul.field_a != 0) {
                  break L3;
                } else {
                  L4: {
                    if ((r.field_d ^ -1) == (hl.field_f ^ -1)) {
                      break L4;
                    } else {
                      ue.field_b = ue.field_b + 1;
                      if ((ue.field_b ^ -1) != -33) {
                        break L2;
                      } else {
                        L5: {
                          if (hl.field_f != 2) {
                            break L5;
                          } else {
                            ob.field_b = null;
                            break L5;
                          }
                        }
                        hl.field_f = r.field_d;
                        ue.field_b = 0;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L6: {
                    if ((hl.field_f ^ -1) != 0) {
                      break L6;
                    } else {
                      sd.field_a.r(param0 ^ 8794);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  th.field_a[hl.field_f].l(-14689);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (-2 != (ul.field_a ^ -1)) {
                  break L7;
                } else {
                  ue.field_b = ue.field_b + 1;
                  if (-33 == (ue.field_b ^ -1)) {
                    L8: {
                      L9: {
                        if (pf.a((byte) 97)) {
                          break L9;
                        } else {
                          cj.b(8227);
                          if (var3 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      og.a((byte) 78);
                      break L8;
                    }
                    ul.field_a = 2;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L10: {
                if (-3 == (ul.field_a ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    if (-1 <= (ue.field_b ^ -1)) {
                      ul.field_a = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ue.field_b = ue.field_b - 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if (oh.a(param0 + 8755)) {
                    break L13;
                  } else {
                    L14: {
                      ri.field_f = ge.a(4, (byte) -125);
                      if (null == sd.field_a) {
                        break L14;
                      } else {
                        bf.field_h = sd.field_a.j((byte) -68);
                        break L14;
                      }
                    }
                    hl.field_f = hg.field_sb;
                    eb.a((byte) 20);
                    li.b(param0 + 8638);
                    if ((hl.field_f ^ -1) != 1) {
                      break L12;
                    } else {
                      hl.field_f = 0;
                      s.a(false, (byte) -122);
                      if (var3 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                hl.field_f = tf.field_jb;
                break L12;
              }
              ek.a(-114, false, hl.field_f);
              ul.field_a = 3;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.LB(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        we.a(qa.field_O, -80, 68.0f);
                        mk.field_g[0] = eh.a("", (byte) -66, kf.field_d, "act_screen_intro_1_part_1");
                        mk.field_g[1] = eh.a("", (byte) -90, kf.field_d, "act_screen_intro_1_part_2");
                        mk.field_g[2] = eh.a("", (byte) -99, kf.field_d, "act_screen_intro_1_part_3");
                        mk.field_g[3] = eh.a("", (byte) -90, kf.field_d, "act_screen_intro_1_part_4");
                        mk.field_g[4] = eh.a("", (byte) -110, kf.field_d, "act_screen_intro_1_part_5");
                        mk.field_g[5] = eh.a("", (byte) -75, kf.field_d, "act_screen_intro_1_part_6");
                        mk.field_g[6] = eh.a("", (byte) -23, kf.field_d, "act_screen_intro_1_part_7");
                        mk.field_g[7] = eh.a("", (byte) -65, kf.field_d, "act_screen_intro_1_part_8");
                        wb.field_a[0] = eh.a("", (byte) -92, kf.field_d, "act_screen_intro_2");
                        gl.field_b[0] = eh.a("", (byte) -127, kf.field_d, "act_screen_intro_3");
                        pc.field_b[0] = eh.a("", (byte) -35, kf.field_d, "act_screen_intro_4_part_1");
                        pc.field_b[1] = eh.a("", (byte) -102, kf.field_d, "act_screen_intro_4_part_2");
                        pc.field_b[2] = eh.a("", (byte) -61, kf.field_d, "act_screen_intro_4_part_3");
                        ge.field_p[0] = eh.a("", (byte) -93, kf.field_d, "act_screen_intro_5");
                        th.field_b[0] = eh.a("", (byte) -31, kf.field_d, "act_screen_intro_6");
                        v.field_W[0] = eh.a("", (byte) -100, kf.field_d, "act_screen_intro_7_part_1");
                        v.field_W[1] = eh.a("", (byte) -75, kf.field_d, "act_screen_intro_7_part_2");
                        v.field_W[2] = eh.a("", (byte) -50, kf.field_d, "act_screen_intro_7_part_3");
                        ie.field_x[0] = eh.a("", (byte) -122, kf.field_d, "act_screen_intro_8");
                        rg.field_c[0] = eh.a("", (byte) -84, kf.field_d, "act_screen_intro_9");
                        if (param0 == 22) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        l.field_f[0][0] = eh.a("", (byte) -78, kf.field_d, "act_screen_death_1");
                        l.field_f[1][0] = l.field_f[0][0];
                        l.field_f[2][0] = l.field_f[0][0];
                        l.field_f[3][0] = eh.a("", (byte) -105, kf.field_d, "act_screen_death_4");
                        l.field_f[4][0] = l.field_f[3][0];
                        l.field_f[5][0] = l.field_f[3][0];
                        l.field_f[6][0] = eh.a("", (byte) -49, kf.field_d, "act_screen_death_7");
                        l.field_f[7][0] = l.field_f[6][0];
                        l.field_f[8][0] = l.field_f[6][0];
                        l.field_f[0][1] = eh.a("", (byte) -101, kf.field_d, "act_screen_death_boss_123");
                        l.field_f[1][1] = l.field_f[0][1];
                        l.field_f[2][1] = l.field_f[0][1];
                        l.field_f[3][1] = eh.a("", (byte) -96, kf.field_d, "act_screen_death_boss_456");
                        l.field_f[4][1] = l.field_f[3][1];
                        l.field_f[5][1] = l.field_f[3][1];
                        l.field_f[6][1] = eh.a("", (byte) -34, kf.field_d, "act_screen_death_boss_789");
                        l.field_f[7][1] = l.field_f[6][1];
                        l.field_f[8][1] = l.field_f[6][1];
                        hh.field_d[2] = eh.a("", (byte) -114, kf.field_d, "act_screen_completion_1");
                        hh.field_d[5] = eh.a("", (byte) -83, kf.field_d, "act_screen_completion_2");
                        hh.field_d[8] = eh.a("", (byte) -111, kf.field_d, "act_screen_completion_3");
                        al.field_c = eh.a("", (byte) -95, kf.field_d, "act_screen_completion_4");
                        var2_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (9 <= var2_int) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (2 <= var3) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        rc.field_a[var2_int][var3] = new nh(l.field_f[var2_int][var3].field_h / 4, l.field_f[var2_int][var3].field_c / 4);
                        rc.field_a[var2_int][var3].c();
                        l.field_f[var2_int][var3].b(0, 0);
                        var3++;
                        if (var4 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dc.field_a = new nh(al.field_c.field_h / 4, al.field_c.field_c / 4);
                        dc.field_a.c();
                        al.field_c.b(0, 0);
                        lb.field_C.a(98);
                        rh.field_h = hh.field_d[2];
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.TA(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(he[] param0, int param1, he[] param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_E = (String) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = param2.length - 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 > var4_int) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param2[var4_int].d(param0[var4_int].field_k + -param2[var4_int].field_k);
                        var4_int--;
                        if (var5 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var4);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.UA(");
                    stackIn_12_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
                    stackIn_16_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_16_1);
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
                    throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                lb.field_C.a(var4, param3, param0, 255);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            L3: {
              if (param1 <= -67) {
                break L3;
              } else {
                field_G = (he[]) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref2);

            stackIn_10_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.OB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    private final void j(byte param0) {
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        kb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              we.a(sl.field_s, -79, 50.0f);
              this.h(0);
              nl.field_r[0] = kb.a(aa.field_b, "", "menu_select").a().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_1_gatling_gun_fire");
              if (null != var2) {
                nl.field_r[1] = var2.a().a(qk.field_g);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = kb.a(aa.field_b, "", "DrP_2_drop_bomb");
              if (var2 == null) {
                break L2;
              } else {
                nl.field_r[2] = var2.a().a(qk.field_g);
                break L2;
              }
            }
            L3: {
              var2 = kb.a(aa.field_b, "", "DrP_3_sonic_canon_fire");
              if (null != var2) {
                nl.field_r[3] = var2.a().a(qk.field_g);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = kb.a(aa.field_b, "", "DrP_4_homing_missile_fire");
              if (var2 != null) {
                nl.field_r[4] = var2.a().a(qk.field_g);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              nl.field_r[5] = wi.a(2205, 100, 100);
              var2 = kb.a(aa.field_b, "", "DrP_6_mega_canon_fire");
              if (var2 != null) {
                nl.field_r[6] = var2.a().a(qk.field_g);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2 = kb.a(aa.field_b, "", "DrP_7_loose_life");
              if (var2 == null) {
                break L6;
              } else {
                nl.field_r[7] = var2.a().a(qk.field_g);
                break L6;
              }
            }
            L7: {
              nl.field_r[8] = tk.a(ua.field_b, "", "DrP_8_respawn").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_9_final_death");
              if (null == var2) {
                break L7;
              } else {
                nl.field_r[9] = var2.a().a(qk.field_g);
                break L7;
              }
            }
            L8: {
              var2 = kb.a(aa.field_b, "", "DrP_10_tripod_hit");
              if (null != var2) {
                nl.field_r[10] = var2.a().a(qk.field_g);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2 = kb.a(aa.field_b, "", "DrP_11_tripod_fire");
              if (var2 != null) {
                nl.field_r[11] = var2.a().a(qk.field_g);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var2 = kb.a(aa.field_b, "", "DrP_12_probes_hit");
              if (var2 != null) {
                nl.field_r[12] = var2.a().a(qk.field_g);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              nl.field_r[13] = tk.a(ua.field_b, "", "DrP_13_probes_die").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_14_glider_fire");
              if (null != var2) {
                nl.field_r[14] = var2.a().a(qk.field_g);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2 = kb.a(aa.field_b, "", "DrP_15_glider_die");
              if (var2 == null) {
                break L12;
              } else {
                nl.field_r[15] = var2.a().a(qk.field_g);
                break L12;
              }
            }
            L13: {
              var2 = kb.a(aa.field_b, "", "DrP_16_shredder_hit");
              if (null == var2) {
                break L13;
              } else {
                nl.field_r[16] = var2.a().a(qk.field_g);
                break L13;
              }
            }
            L14: {
              var2 = kb.a(aa.field_b, "", "DrP_17_shredder_die");
              if (var2 != null) {
                nl.field_r[17] = var2.a().a(qk.field_g);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = kb.a(aa.field_b, "", "DrP_18_as_bot_hit");
              if (var2 == null) {
                break L15;
              } else {
                nl.field_r[18] = var2.a().a(qk.field_g);
                break L15;
              }
            }
            L16: {
              var2 = kb.a(aa.field_b, "", "DrP_19_as_bot_fire");
              if (null != var2) {
                nl.field_r[19] = var2.a().a(qk.field_g);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              nl.field_r[20] = tk.a(ua.field_b, "", "DrP_20_as_bot_die").c().a(qk.field_g);
              nl.field_r[21] = tk.a(ua.field_b, "", "DrP_21_dropship_move").c().a(qk.field_g);
              nl.field_r[22] = tk.a(ua.field_b, "", "DrP_22_dropship_chrg").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_23_dropship_spawn");
              if (var2 == null) {
                break L17;
              } else {
                nl.field_r[23] = var2.a().a(qk.field_g);
                break L17;
              }
            }
            L18: {
              var2 = kb.a(aa.field_b, "", "DrP_24_dropship_fire");
              if (var2 == null) {
                break L18;
              } else {
                nl.field_r[24] = var2.a().a(qk.field_g);
                break L18;
              }
            }
            L19: {
              var2 = kb.a(aa.field_b, "", "DrP_25_dropship_hit");
              if (null == var2) {
                break L19;
              } else {
                nl.field_r[25] = var2.a().a(qk.field_g);
                break L19;
              }
            }
            L20: {
              nl.field_r[26] = tk.a(ua.field_b, "", "DrP_26_dropship_die").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_27_spacemine_exp");
              if (null != var2) {
                nl.field_r[27] = var2.a().a(qk.field_g);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2 = kb.a(aa.field_b, "", "DrP_28_miner_hit");
              if (var2 == null) {
                break L21;
              } else {
                nl.field_r[28] = var2.a().a(qk.field_g);
                break L21;
              }
            }
            L22: {
              nl.field_r[29] = tk.a(ua.field_b, "", "DrP_29_miner_move").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_30_miner_die");
              if (null == var2) {
                break L22;
              } else {
                nl.field_r[30] = var2.a().a(qk.field_g);
                break L22;
              }
            }
            L23: {
              var2 = kb.a(aa.field_b, "", "DrP_31_asteroid_hit");
              if (var2 == null) {
                break L23;
              } else {
                nl.field_r[31] = var2.a().a(qk.field_g);
                break L23;
              }
            }
            L24: {
              var2 = kb.a(aa.field_b, "", "DrP_32b_asteroid_dest");
              if (null == var2) {
                break L24;
              } else {
                nl.field_r[32] = var2.a().a(qk.field_g);
                break L24;
              }
            }
            L25: {
              nl.field_r[33] = tk.a(ua.field_b, "", "DrP_33_battlecarr_move").c().a(qk.field_g);
              nl.field_r[34] = tk.a(ua.field_b, "", "DrP_34_battlecarr_charge").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_35_battlecarr_fire");
              if (var2 != null) {
                nl.field_r[35] = var2.a().a(qk.field_g);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = kb.a(aa.field_b, "", "DrP_36_battlecarr_spawn");
              if (null != var2) {
                nl.field_r[36] = var2.a().a(qk.field_g);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = kb.a(aa.field_b, "", "DrP_37_battlecarr_hit");
              if (var2 != null) {
                nl.field_r[37] = var2.a().a(qk.field_g);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              nl.field_r[38] = tk.a(ua.field_b, "", "DrP_38_battlecarr_die").c().a(qk.field_g);
              nl.field_r[39] = tk.a(ua.field_b, "", "DrP_39_bunkers_hit").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_40_bunkers_die");
              if (null == var2) {
                break L28;
              } else {
                nl.field_r[40] = var2.a().a(qk.field_g);
                break L28;
              }
            }
            L29: {
              var2 = kb.a(aa.field_b, "", "DrP_41_combtank_fire");
              if (var2 == null) {
                break L29;
              } else {
                nl.field_r[41] = var2.a().a(qk.field_g);
                break L29;
              }
            }
            L30: {
              var2 = kb.a(aa.field_b, "", "DrP_42_combtank_hit");
              if (var2 == null) {
                break L30;
              } else {
                nl.field_r[42] = var2.a().a(qk.field_g);
                break L30;
              }
            }
            L31: {
              var2 = kb.a(aa.field_b, "", "DrP_43_combtank_die");
              if (var2 == null) {
                break L31;
              } else {
                nl.field_r[43] = var2.a().a(qk.field_g);
                break L31;
              }
            }
            L32: {
              var2 = kb.a(aa.field_b, "", "DrP_44_battank_fire");
              if (var2 == null) {
                break L32;
              } else {
                nl.field_r[44] = var2.a().a(qk.field_g);
                break L32;
              }
            }
            L33: {
              var2 = kb.a(aa.field_b, "", "DrP_45_battank_hit");
              if (var2 != null) {
                nl.field_r[45] = var2.a().a(qk.field_g);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = kb.a(aa.field_b, "", "DrP_46_battank_die");
              if (var2 != null) {
                nl.field_r[46] = var2.a().a(qk.field_g);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              nl.field_r[47] = tk.a(ua.field_b, "", "DrP_47_attackcop_move").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_48_attackcop_fire");
              if (null == var2) {
                break L35;
              } else {
                nl.field_r[48] = var2.a().a(qk.field_g);
                break L35;
              }
            }
            L36: {
              var2 = kb.a(aa.field_b, "", "DrP_49_attackcop_hit");
              if (var2 != null) {
                nl.field_r[49] = var2.a().a(qk.field_g);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              nl.field_r[50] = tk.a(ua.field_b, "", "DrP_50_attackcop_die").c().a(qk.field_g);
              nl.field_r[51] = tk.a(ua.field_b, "", "DrP_51_doomcop_move").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_52_doomcop_fire");
              if (var2 != null) {
                nl.field_r[52] = var2.a().a(qk.field_g);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2 = kb.a(aa.field_b, "", "DrP_53_doomcop_hit");
              if (null != var2) {
                nl.field_r[53] = var2.a().a(qk.field_g);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              nl.field_r[54] = tk.a(ua.field_b, "", "DrP_54_doomcop_die").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_55_floatbat_move");
              if (null != var2) {
                nl.field_r[55] = var2.a().a(qk.field_g);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              nl.field_r[56] = tk.a(ua.field_b, "", "DrP_56_floatbat_chrg").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_57_floatbat_fire");
              if (null != var2) {
                nl.field_r[57] = var2.a().a(qk.field_g);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2 = kb.a(aa.field_b, "", "DrP_58_floatbat_spawn");
              if (null != var2) {
                nl.field_r[58] = var2.a().a(qk.field_g);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2 = kb.a(aa.field_b, "", "DrP_59_floatbat_hit");
              if (null == var2) {
                break L42;
              } else {
                nl.field_r[59] = var2.a().a(qk.field_g);
                break L42;
              }
            }
            L43: {
              nl.field_r[60] = tk.a(ua.field_b, "", "DrP_60_floatbat_die").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_61_alcomship_move");
              if (var2 == null) {
                break L43;
              } else {
                nl.field_r[61] = var2.a().a(qk.field_g);
                break L43;
              }
            }
            L44: {
              nl.field_r[62] = tk.a(ua.field_b, "", "DrP_62_alcomship_chrg").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_63_alcomship_fire");
              if (null == var2) {
                break L44;
              } else {
                nl.field_r[63] = var2.a().a(qk.field_g);
                break L44;
              }
            }
            L45: {
              var2 = kb.a(aa.field_b, "", "DrP_64_alcomship_spawn");
              if (null != var2) {
                nl.field_r[64] = var2.a().a(qk.field_g);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2 = kb.a(aa.field_b, "", "DrP_65_alcomship_fire2");
              if (var2 != null) {
                nl.field_r[65] = var2.a().a(qk.field_g);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = kb.a(aa.field_b, "", "DrP_66_alcomship_hit");
              if (null != var2) {
                nl.field_r[66] = var2.a().a(qk.field_g);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              nl.field_r[67] = tk.a(ua.field_b, "", "DrP_67_alcomship_die").c().a(qk.field_g);
              var2 = kb.a(aa.field_b, "", "DrP_68_humbuild_hit");
              if (var2 != null) {
                nl.field_r[68] = var2.a().a(qk.field_g);
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (var2 == null) {
                break L49;
              } else {
                nl.field_r[69] = var2.a().a(qk.field_g);
                break L49;
              }
            }
            L50: {
              var2 = kb.a(aa.field_b, "", "DrP_70_allpowerups");
              if (var2 == null) {
                break L50;
              } else {
                nl.field_r[70] = var2.a().a(qk.field_g);
                break L50;
              }
            }
            L51: {
              var2 = kb.a(aa.field_b, "", "DrP_32c_asteroid_dest");
              var3 = 47 / ((param0 - 19) / 45);
              if (var2 == null) {
                break L51;
              } else {
                nl.field_r[71] = var2.a().a(qk.field_g);
                break L51;
              }
            }
            L52: {
              var2 = kb.a(aa.field_b, "", "DrP_32a_asteroid_dest");
              if (var2 == null) {
                break L52;
              } else {
                nl.field_r[72] = var2.a().a(qk.field_g);
                break L52;
              }
            }
            L53: {
              var2 = kb.a(aa.field_b, "", "drp_71_tesla_coil");
              if (var2 == null) {
                break L53;
              } else {
                nl.field_r[73] = var2.a().a(qk.field_g);
                break L53;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.KB(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 <= -92) {
                        break L2;
                      } else {
                        DrPhlogistonSavesTheEarth.t(-37);
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    param0.getAppletContext().showDocument(kk.a(var2, param0, 4767999), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.JB(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(byte param0) {
        we.a(qa.field_O, -77, 60.0f);
        ni.field_q = kc.a(ff.field_P, kf.field_d, "", param0 ^ -116, "font");
        if (param0 != -83) {
            return;
        }
        try {
            a.field_g = kc.a(ff.field_P, kf.field_d, "", 85, "small_font");
            ji.field_d = kc.a(ff.field_P, kf.field_d, "", -101, "bottomheavy32");
            cb.field_b = kc.a(ff.field_P, kf.field_d, "", -95, "scriptfont");
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.NB(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              we.a(qa.field_O, -111, 95.0f);
              nc.field_M = qk.a("", kf.field_d, "mb_foreground", true);
              eb.field_g = qk.a("", kf.field_d, "mb_logo", true);
              qk.a("", kf.field_d, "mb_transparency_layer", true);
              qk.a("", kf.field_d, "mb_signup_button_frame", true);
              v.field_Y = qk.a("", kf.field_d, "mb_price_background", true);
              qk.a("", kf.field_d, "mb_menu_button_frame", true);
              cm.field_R = new nh[8];
              cm.field_R[0] = qk.a("", kf.field_d, "mb_screenshot_1", true);
              cm.field_R[1] = qk.a("", kf.field_d, "mb_screenshot_2", true);
              cm.field_R[2] = qk.a("", kf.field_d, "mb_screenshot_3", true);
              cm.field_R[3] = qk.a("", kf.field_d, "mb_screenshot_4", true);
              cm.field_R[4] = qk.a("", kf.field_d, "mb_screenshot_5", true);
              if (param0 == -23796) {
                break L1;
              } else {
                this.s(-63);
                break L1;
              }
            }
            cm.field_R[5] = qk.a("", kf.field_d, "mb_screenshot_6", true);
            cm.field_R[6] = qk.a("", kf.field_d, "mb_screenshot_7", true);
            cm.field_R[7] = qk.a("", kf.field_d, "mb_screenshot_8", true);
            sg.field_e.h();
            uk.field_h.h();
            oi.field_f.h();
            nj.field_o.h();
            cc.field_w.h();
            b.field_k.h();
            lb.field_C.a(107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.EB(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              ek.d(-2);
              if (null != df.field_l) {
                hb.a(-5, df.field_l);
                df.field_l.a(sb.field_d, true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              sb.b((byte) 67);
              if (param0 <= -120) {
                break L2;
              } else {
                field_I = 81L;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.AA(" + param0 + ')');
        }
    }

    final void a(int param0) {
        ug var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                field_J = (nh) null;
                break L1;
              }
            }
            this.a(8, 4, false, 7320, 0, 11, 10, 9);
            var2 = new ug();
            var2.d(9, 128, param0 ^ 85);
            var2.a(oa.field_b, (byte) -13);
            dc.a(sb.field_d, 22050, true, var2, (byte) -92, (java.awt.Component) ((Object) n.field_g));
            a.field_i = 16711680;
            pj.field_E = 11184895;
            b.field_h = 16777215;
            this.a(true, false, true, true, -6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.MA(" + param0 + ')');
        }
    }

    private final he[] a(byte param0, he[] param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        he[] stackIn_7_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = new he[param1.length];
                        if (param0 == -105) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.d(true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= param1.length) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_11_0 = (he[]) (var3);
                        stackIn_7_0 = stackIn_11_0;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_7_0[var4] = param1[var4].a();
                        var4++;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (he[]) (var3);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var3_ref);
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.AB(").append(param0).append(',');
                    stackIn_13_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_13_1);
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
                    throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void u(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -16387) {
            return;
        }
        try {
            field_J = null;
            field_L = null;
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.QA(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        try {
            we.a(qa.field_O, -126, 62.0f);
            ea.field_c = eh.a("", (byte) -92, kf.field_d, "gameinterface");
            fk.field_m = eh.a("", (byte) -78, kf.field_d, "get_ready_window");
            ph.field_h = eh.a("", (byte) -40, kf.field_d, "title_screen");
            qj.field_f = eh.a("", (byte) -126, kf.field_d, "title_screen_chars");
            rk.field_a = eh.a("", (byte) -99, kf.field_d, "slider_background");
            oi.field_h = eh.a("", (byte) -100, kf.field_d, "slider_foreground");
            gg.field_d = eh.a("", (byte) -84, kf.field_d, "title_text_highscore_screen");
            we.field_g = eh.a("", (byte) -61, kf.field_d, "title_text_instructions_screen");
            qe.field_k = eh.a("", (byte) -87, kf.field_d, "title_text_achievements_screen");
            el.field_ub = eh.a("", (byte) -23, kf.field_d, "title_text_achievements_this_game_screen");
            jk.field_L = eh.a("", (byte) -100, kf.field_d, "title_text_level_select_screen");
            cj.field_g = eh.a("", (byte) -24, kf.field_d, "title_text_world_complete");
            eh.a("", (byte) -91, kf.field_d, "title_text_members_benefits");
            oj.field_d = eh.a("", (byte) -54, kf.field_d, "title_text_log_in");
            pi.field_S = ij.a("numbers", (byte) 111, kf.field_d, "");
            t.field_a = eh.a("", (byte) -65, kf.field_d, "claw");
            bb.field_b = t.field_a.e();
            bb.field_b.g();
            la.field_a = t.field_a.e();
            la.field_a.f();
            ri.field_o = bb.field_b.e();
            ri.field_o.f();
            ek.field_m = eh.a("", (byte) -115, kf.field_d, "claw_h_bar");
            cl.field_t = eh.a("", (byte) -57, kf.field_d, "claw_v_bar");
            tb.field_d = cl.field_t.e();
            tb.field_d.g();
            jl.field_h = eh.a("", (byte) -89, kf.field_d, "help_key_shift");
            wg.field_c = eh.a("", (byte) -49, kf.field_d, "help_key_ctrl");
            na.field_c = eh.a("", (byte) -33, kf.field_d, "help_key_space");
            ul.field_h = eh.a("", (byte) -82, kf.field_d, "help_key_z");
            qb.field_d = eh.a("", (byte) -72, kf.field_d, "help_key_x");
            lk.field_k = eh.a("", (byte) -98, kf.field_d, "help_key_c");
            lb.field_D = eh.a("", (byte) -69, kf.field_d, "help_key_v");
            ki.field_b = eh.a("", (byte) -40, kf.field_d, "help_key_up");
            si.field_D = ki.field_b.e();
            si.field_D.i();
            fk.field_l = si.field_D.e();
            fk.field_l.i();
            lc.field_s = fk.field_l.e();
            lc.field_s.i();
            dh.field_R[0] = eh.a("", (byte) -66, kf.field_d, "game_interface_weapon_gatling_gun");
            dh.field_R[1] = eh.a("", (byte) -33, kf.field_d, "game_interface_weapon_bomb");
            dh.field_R[param0] = eh.a("", (byte) -45, kf.field_d, "game_interface_weapon_sonic");
            dh.field_R[3] = eh.a("", (byte) -25, kf.field_d, "game_interface_weapon_missile");
            al.field_a[0] = eh.a("", (byte) -48, kf.field_d, "tutorial_dp_happy");
            al.field_a[1] = eh.a("", (byte) -27, kf.field_d, "tutorial_dp_det");
            al.field_a[2] = eh.a("", (byte) -103, kf.field_d, "tutorial_cp_happy");
            al.field_a[3] = eh.a("", (byte) -113, kf.field_d, "tutorial_cp_det");
            ca.field_W = la.a("", kf.field_d, "frame", -82);
            ch.field_z = la.a("", kf.field_d, "frame_button", -53);
            ee.field_c = la.a("", kf.field_d, "frame_button_dn", -54);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.BB(" + param0 + ')');
        }
    }

    private final void i(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        we.a(qa.field_O, -105, 78.0f);
                        ph.field_a = ij.a("alientripod", (byte) 69, kf.field_d, "");
                        af.field_e = new he[ph.field_a.length];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ph.field_a.length <= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ph.field_a[var2_int].c();
                        af.field_e[var2_int] = ph.field_a[var2_int].a();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ib.field_u = ij.a("alienprobe", (byte) 77, kf.field_d, "");
                        bg.field_t = ij.a("aliendeathprobe", (byte) 73, kf.field_d, "");
                        dh.field_S = ij.a("aliendeathglider", (byte) 113, kf.field_d, "");
                        mj.field_w = this.a((byte) -105, dh.field_S);
                        wd.field_f = ij.a("aliendoomglider", (byte) 114, kf.field_d, "");
                        fa.field_n = ij.a("alienshredder", (byte) 118, kf.field_d, "");
                        t.field_c = ij.a("alienassaultbot", (byte) 127, kf.field_d, "");
                        cm.field_Q = ij.a("aliendropship", (byte) 58, kf.field_d, "");
                        od.field_i = ij.a("alienspacemine", (byte) 101, kf.field_d, "");
                        uf.field_j = ij.a("alienspacemineseeking", (byte) 89, kf.field_d, "");
                        ng.field_f = ij.a("alienparamine", (byte) 112, kf.field_d, "");
                        jd.field_M = ij.a("alienminer", (byte) 77, kf.field_d, "");
                        vd.field_g = ij.a("alienminer_door", (byte) 63, kf.field_d, "");
                        we.field_b = be.b(eh.a("", (byte) -36, kf.field_d, "alienasteroid_1"), 64);
                        ee.field_b = be.b(eh.a("", (byte) -92, kf.field_d, "alienasteroid_2"), 64);
                        ae.field_lb = be.b(eh.a("", (byte) -81, kf.field_d, "alienasteroid_3"), 64);
                        ad.field_s = ij.a("alienbattlecarrier", (byte) 54, kf.field_d, "");
                        ib.field_r = ij.a("alienbattlecarrier_side_arms", (byte) 85, kf.field_d, "");
                        mi.field_i = ij.a("alienbattlecarrier_middle_arms", (byte) 90, kf.field_d, "");
                        fa.field_k = ij.a("alienbunker", (byte) 123, kf.field_d, "");
                        ub.field_a = be.a(eh.a("", (byte) -111, kf.field_d, "alienbunker_rubble"), fa.field_k.length);
                        ib.field_j = new he[fa.field_k.length];
                        rh.field_l = new he[fa.field_k.length];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var2_int ^ -1) <= (ib.field_j.length ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fa.field_k[var2_int].c();
                        ub.field_a[var2_int].c();
                        ib.field_j[var2_int] = fa.field_k[var2_int].e();
                        ib.field_j[var2_int].c(128);
                        rh.field_l[var2_int] = ub.field_a[var2_int].e();
                        rh.field_l[var2_int].c(128);
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        lb.field_C.a(100);
                        wk.field_m = ij.a("alienbunker_big", (byte) 123, kf.field_d, "");
                        this.a(99, wk.field_m);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 < -110) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_C = false;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        qb.field_a = be.a(eh.a("", (byte) -80, kf.field_d, "alienbunker_big_rubble"), wk.field_m.length);
                        this.a(85, qb.field_a);
                        uk.field_b = be.a(eh.a("", (byte) -34, kf.field_d, "alienbunker_big_fire_mask"), wk.field_m.length);
                        this.a(99, uk.field_b);
                        j.field_db = ij.a("aliencombattank", (byte) 105, kf.field_d, "");
                        var2_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (j.field_db.length <= var2_int) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        j.field_db[var2_int].c();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        jj.field_a = be.a(eh.a("", (byte) -110, kf.field_d, "aliencombattank_rubble"), j.field_db.length);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2_int = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var2_int >= jj.field_a.length) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        jj.field_a[var2_int].c();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var3 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        mk.field_e = ij.a("alienbattletank", (byte) 62, kf.field_d, "");
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var2_int = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var2_int ^ -1) <= (mk.field_e.length ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        mk.field_e[var2_int].c();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var3 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        nc.field_I = be.a(eh.a("", (byte) -42, kf.field_d, "alienbattletank_rubble"), mk.field_e.length);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var2_int = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (nc.field_I.length <= var2_int) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        nc.field_I[var2_int].c();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var3 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        pf.field_c = ij.a("alienattackcopter", (byte) 113, kf.field_d, "");
                        wd.field_a = ij.a("aliendoomcopter", (byte) 118, kf.field_d, "");
                        sd.field_c = ij.a("alienflyingbattlestation", (byte) 111, kf.field_d, "");
                        ff.field_R = ij.a("alienalienbattleship", (byte) 84, kf.field_d, "");
                        nj.field_d = ij.a("alien_meteor", (byte) 82, kf.field_d, "");
                        wi.field_c = ij.a("alien_abductor", (byte) 94, kf.field_d, "");
                        wa.field_O = ij.a("scenery_tile_tesla_coil", (byte) 64, kf.field_d, "");
                        u.field_a = this.a(-1745, 2, eh.a("", (byte) -55, kf.field_d, "scenery_tile_tesla_coil_broken"));
                        this.a(122, u.field_a);
                        jk.field_H = this.a(wa.field_O, 65793);
                        si.field_G = this.a(u.field_a, 65793);
                        eh.field_b = ij.a("alien_cargo_ship", (byte) 101, kf.field_d, "");
                        pj.field_B[0] = ij.a("scenery_tile_mothership_girder_1", (byte) 89, kf.field_d, "");
                        pj.field_B[1] = ij.a("scenery_tile_mothership_girder_2", (byte) 110, kf.field_d, "");
                        pj.field_B[2] = ij.a("scenery_tile_mothership_girder_3", (byte) 116, kf.field_d, "");
                        nl.field_n[0] = ij.a("scenery_tile_mothership_background_1", (byte) 72, kf.field_d, "");
                        nl.field_n[1] = ij.a("scenery_tile_mothership_window", (byte) 78, kf.field_d, "");
                        nl.field_n[2] = ij.a("scenery_tile_mothership_background_3", (byte) 107, kf.field_d, "");
                        kc.field_l = ij.a("scenery_tile_mothership_antennae_yagi", (byte) 54, kf.field_d, "");
                        ta.field_d = ij.a("scenery_tile_mothership_antennae_parabolic", (byte) 109, kf.field_d, "");
                        m.field_a = ij.a("scenery_tile_mothership_antennae_yagi_broken", (byte) 90, kf.field_d, "");
                        ki.field_a = ij.a("scenery_tile_mothership_antennae_parabolic_broken", (byte) 83, kf.field_d, "");
                        hc.field_M[0] = ij.a("scenery_tile_mothership_platform_1", (byte) 110, kf.field_d, "");
                        hc.field_M[1] = ij.a("scenery_tile_mothership_platform_2", (byte) 102, kf.field_d, "");
                        hc.field_M[2] = ij.a("scenery_tile_mothership_platform_3", (byte) 72, kf.field_d, "");
                        kk.field_b[0] = ij.a("scenery_tile_mothership_scenery_1", (byte) 64, kf.field_d, "");
                        kk.field_b[1] = ij.a("scenery_tile_mothership_scenery_2", (byte) 82, kf.field_d, "");
                        lf.field_e[0] = ij.a("scenery_tile_mothership_scenery_1_broken", (byte) 118, kf.field_d, "");
                        lf.field_e[1] = ij.a("scenery_tile_mothership_scenery_2_broken", (byte) 68, kf.field_d, "");
                        this.a(kk.field_b[0], 0, lf.field_e[0]);
                        this.a(kk.field_b[1], 0, lf.field_e[1]);
                        ca.field_bb = ij.a("scenery_tile_mothership_docking_platform", (byte) 82, kf.field_d, "");
                        sf.field_m = ij.a("scenery_tile_mothership_gun_turret_base", (byte) 83, kf.field_d, "");
                        sf.field_m[0].c();
                        lc.field_i = be.b(eh.a("", (byte) -26, kf.field_d, "scenery_tile_mothership_gun_turret"), 32);
                        bh.field_b = new he[1];
                        bh.field_b[0] = sf.field_m[0].e();
                        bh.field_b[0].f();
                        bh.field_b[0].c();
                        sj.field_f = sf.field_m;
                        jk.field_I = be.b(eh.a("", (byte) -47, kf.field_d, "scenery_tile_mothership_missile_launcher"), 32);
                        qf.field_g = this.a(-1745, 4, eh.a("", (byte) -78, kf.field_d, "scenery_tile_mothership_docking_platform_broken"));
                        qg.field_W = ij.a("scenery_tile_mothership_gun_turret_broken", (byte) 114, kf.field_d, "");
                        tl.field_I = new he[1];
                        tl.field_I[0] = qg.field_W[0].e();
                        tl.field_I[0].f();
                        eg.field_f = qg.field_W;
                        le.field_b = ij.a("scenery_tile_smokestack", (byte) 114, kf.field_d, "");
                        ck.field_k = ij.a("scenery_tile_smokestack_broken", (byte) 59, kf.field_d, "");
                        le.field_b[0].c();
                        ck.field_k[0].c();
                        ad.field_v = new he[1];
                        bh.field_e = new he[1];
                        ad.field_v[0] = le.field_b[0].a();
                        bh.field_e[0] = ck.field_k[0].a();
                        this.a(124, pj.field_B[0]);
                        this.a(97, pj.field_B[1]);
                        this.a(97, pj.field_B[2]);
                        this.a(98, nl.field_n[0]);
                        this.a(91, nl.field_n[1]);
                        this.a(118, nl.field_n[2]);
                        this.a(118, kc.field_l);
                        this.a(99, ta.field_d);
                        this.a(107, m.field_a);
                        this.a(121, ki.field_a);
                        this.a(82, hc.field_M[0]);
                        this.a(98, hc.field_M[1]);
                        this.a(127, hc.field_M[2]);
                        this.a(95, ph.field_c[0]);
                        this.a(98, ph.field_c[1]);
                        this.a(82, ph.field_c[2]);
                        this.a(102, ca.field_bb);
                        this.a(86, sf.field_m);
                        this.a(107, sj.field_f);
                        this.a(81, qf.field_g);
                        this.a(99, qg.field_W);
                        this.a(98, eg.field_f);
                        oi.field_a = ij.a("human_abductee_male", (byte) 67, kf.field_d, "");
                        cc.field_y = ij.a("human_abductee_female", (byte) 87, kf.field_d, "");
                        og.field_e = ij.a("human_abductee_baby", (byte) 95, kf.field_d, "");
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.DB(" + param0 + ')');
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public DrPhlogistonSavesTheEarth() {
        this.field_H = 0;
        this.field_C = false;
    }

    private final boolean b(boolean param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_144_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == aa.field_b) {
                            statePc = 71;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!aa.field_b.a(0)) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (aa.field_b.c((byte) 79)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        we.a(qg.a(wi.field_h, ig.field_o, 34, "", aa.field_b), -88, 5.0f);
                        stackIn_9_0 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        if (!ua.field_b.a(0)) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!ua.field_b.c((byte) 21)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        we.a(qg.a(wi.field_h, ig.field_o, 34, "", ua.field_b), -105, 8.0f);
                        stackIn_17_0 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        if (!ui.field_a.a(0)) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!ui.field_a.c((byte) 56)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        we.a(hj.a(qd.field_Fb, ui.field_a, r.field_a, 0, 17733), -83, 10.0f);
                        stackIn_25_0 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        if (!df.field_a.a(0)) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!df.field_a.c((byte) 53)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        we.a(qg.a(qd.field_Fb, r.field_a, 34, "", df.field_a), -105, 13.0f);
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    try {
                        if (!kf.field_d.a(0)) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!kf.field_d.c((byte) 84)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        we.a(qg.a(td.field_o, sa.field_b, 34, "", kf.field_d), -118, 18.0f);
                        stackIn_41_0 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    try {
                        if (!mh.field_a.a(0)) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!mh.field_a.c((byte) 64)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        we.a(qg.a(l.field_s, hl.field_e, 34, "", mh.field_a), -115, 40.0f);
                        stackIn_49_0 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0 != 0;
                }
                case 50: {
                    try {
                        if (!ff.field_P.a(0)) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!ff.field_P.c((byte) 109)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        we.a(qg.a(bh.field_d, ij.field_a, 34, "", ff.field_P), -127, 45.0f);
                        stackIn_57_0 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0 != 0;
                }
                case 58: {
                    try {
                        if (!ph.field_b.a(0)) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!ph.field_b.a(255, "basic")) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        we.a(qg.a(td.field_o, sa.field_b, 34, "basic", ph.field_b), -118, 48.0f);
                        stackIn_65_0 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0 != 0;
                }
                case 66: {
                    try {
                        if (param0) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return stackIn_68_0 != 0;
                }
                case 69: {
                    try {
                        bh.b(77);
                        cf.field_c = new cf(aa.field_b, ua.field_b);
                        qk.field_g = new ng(22050, id.field_d);
                        this.j((byte) -30);
                        aa.field_b = null;
                        stackIn_70_0 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 70: {
                    return stackIn_70_0 != 0;
                }
                case 71: {
                    try {
                        if (null != ua.field_b) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        qk.field_g = null;
                        ua.field_b = null;
                        tc.a((byte) 86);
                        stackIn_75_0 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 75: {
                    return stackIn_75_0 != 0;
                }
                case 76: {
                    try {
                        if (null != df.field_a) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        we.a(ai.field_x, -83, 55.0f);
                        this.h(0);
                        ad.field_q = ok.a(df.field_a, "", "Dr_Phlogiston_Title");
                        s.field_a.a(0, ui.field_a, 0, ad.field_q, cf.field_c);
                        ki.field_c = ok.a(df.field_a, "", "Dr_Phlogiston_Earth");
                        s.field_a.a(0, ui.field_a, 0, ki.field_c, cf.field_c);
                        hi.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_Space");
                        s.field_a.a(0, ui.field_a, 0, hi.field_l, cf.field_c);
                        le.field_e = ok.a(df.field_a, "", "Dr_Phlogiston_Alien");
                        s.field_a.a(0, ui.field_a, 0, le.field_e, cf.field_c);
                        lh.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_Boss_Break");
                        dm.field_x = ok.a(df.field_a, "", "Dr_Phlogiston_GameOver_jingle");
                        s.field_a.a(0, ui.field_a, 0, dm.field_x, cf.field_c);
                        ml.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_GameComplete_jingle");
                        s.field_a.a(0, ui.field_a, 0, ml.field_l, cf.field_c);
                        s.field_a.b((byte) 47);
                        cf.field_c = null;
                        df.field_a = null;
                        ui.field_a = null;
                        tc.a((byte) 86);
                        stackIn_80_0 = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return stackIn_80_0 != 0;
                }
                case 81: {
                    try {
                        if (null != kf.field_d) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-1 == (this.field_H ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        this.h((byte) -83);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-2 == (this.field_H ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        this.r(2);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (2 != this.field_H) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        this.k((byte) 22);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((this.field_H ^ -1) == -4) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        this.q(-11666);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (-5 != (this.field_H ^ -1)) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        this.i((byte) -125);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (this.field_H == 5) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        this.d(true);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (this.field_H == 6) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.o(125);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (this.field_H == 7) {
                            statePc = 113;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        this.s(-23796);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (-9 == (this.field_H ^ -1)) {
                            statePc = 117;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        kf.field_d = null;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.field_H = this.field_H + 1;
                        tc.a((byte) 86);
                        stackIn_119_0 = 0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 119: {
                    return stackIn_119_0 != 0;
                }
                case 120: {
                    try {
                        if (null == mh.field_a) {
                            statePc = 130;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var3_int = 0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (-10 >= (var3_int ^ -1)) {
                            statePc = 127;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        bi.field_K[var3_int] = new mk(mh.field_a.a("", "AchirdAttacks_level_" + (1 + var3_int) + ".lvl", 24874), var3_int % 3 - -1);
                        var3_int++;
                        if (var10 != 0) {
                            statePc = 128;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var10 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        mh.field_a = null;
                        tc.a((byte) 86);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackIn_129_0 = 0;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 129: {
                    return stackIn_129_0 != 0;
                }
                case 130: {
                    try {
                        var3_int = 0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (13 <= var3_int) {
                            statePc = 136;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        th.field_a[var3_int] = new ld(var3_int);
                        var3_int++;
                        if (var10 != 0) {
                            statePc = 137;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var10 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        hl.field_f = 0;
                        s.c((byte) 88);
                        var3_int = 3072;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var4 = 30;
                        var5 = 15;
                        var6 = 10;
                        var7 = -2;
                        var8 = v.field_Y.field_y - 20;
                        var9 = v.field_Y.field_w - 20;
                        gl.a(var9, var8, (byte) -96, var5, var4, v.field_Y, var7, var6, var3_int);
                        gg.a(1000, cm.field_R);
                        bi.a(ml.field_j, 121, nc.field_M);
                        if (param1 <= -91) {
                            statePc = 140;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        field_L = (String) null;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        pi.a(eb.field_g, 21914);
                        wb.a((java.applet.Applet) (this), 2, 1052688, 150, ej.field_e, 15488514);
                        ah.a((byte) 109, 50);
                        k.a(0, 50);
                        if (oh.a(0)) {
                            statePc = 143;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        ri.field_f = ge.a(4, (byte) -79);
                        vi.field_c = ck.a(0, 5, 1, true);
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        tc.a((byte) 86);
                        stackIn_144_0 = 1;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 144: {
                    return stackIn_144_0 != 0;
                }
                case 145: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ie.a((Throwable) ((Object) var3), "DrPhlogistonSavesTheEarth.FB(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void q(int param0) {
        nh dupTemp$1 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    we.a(qa.field_O, -103, 73.0f);
                    bc.field_d = new nh(50, 300);
                    q.field_f = new he(50, 300, 2);
                    var2_int = q.field_f.field_d * 260;
                    var3 = -1 + q.field_f.field_m.length;
                    var4 = var2_int;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var3 ^ -1) > (var4 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    q.field_f.field_m[var4] = (byte) 1;
                    var4++;
                    if (var6 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var6 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    v.field_O = new nh(640, 430);
                    v.field_O.c();
                    var4 = 336 * wj.field_k;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-2001 >= (var5 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    wj.field_l[hi.a(var4, param0 + 11670, pd.field_c)] = 65793 * (hi.a(254, 4, pd.field_c) + 1);
                    var5++;
                    if (var6 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var6 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (430 <= var5) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    wj.e(0, var5, 640, 258 * ((9 + var5) / 7), (var5 - -435) / 3);
                    var5++;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var6 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    lb.field_C.a(125);
                    nb.field_b = new nh(640, 430);
                    nb.field_b.c();
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var5 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((var5 ^ -1) <= -1501) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    wj.field_l[hi.a(wj.field_l.length, qk.a(param0, -11670), pd.field_c)] = hi.a(256, 4, pd.field_c) * 65793;
                    var5++;
                    if (var6 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (-501 >= (var5 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    wj.field_l[hi.a(wj.field_l.length, 4, pd.field_c)] = 131329 * hi.a(128, 4, pd.field_c);
                    var5++;
                    if (var6 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var6 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var5 >= 500) {
                        statePc = 45;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    wj.field_l[hi.a(wj.field_l.length, 4, pd.field_c)] = hi.a(128, 4, pd.field_c) * 65794;
                    var5++;
                    if (var6 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var6 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    lb.field_C.a(96);
                    sg.field_e = eh.a("", (byte) -103, kf.field_d, "background_bath");
                    uk.field_h = eh.a("", (byte) -52, kf.field_d, "background_london");
                    oi.field_f = eh.a("", (byte) -121, kf.field_d, "background_brighton");
                    nj.field_o = eh.a("", (byte) -97, kf.field_d, "midground_earth");
                    hc.field_K = cl.a("", kf.field_d, -116, "background_space");
                    dupTemp$1 = hc.field_K[1];
                    dupTemp$1.field_D = dupTemp$1.field_D + 800;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (param0 == -11666) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return;
                }
                case 48: {
                    sh.field_b = qk.a("", kf.field_d, "midground_space", true);
                    vi.field_g = eh.a("", (byte) -111, kf.field_d, "background_alien");
                    gb.field_e = eh.a("", (byte) -79, kf.field_d, "background_alien_8");
                    ha.field_b = eh.a("", (byte) -112, kf.field_d, "background_alien_9");
                    q.field_e = qk.a("", kf.field_d, "scenery_earth_background_clouds_lit", true);
                    kl.field_R[0] = qk.a("", kf.field_d, "scenery_space_background_asteroid_1", true);
                    kl.field_R[1] = qk.a("", kf.field_d, "scenery_space_background_asteroid_2", true);
                    kl.field_R[2] = qk.a("", kf.field_d, "scenery_space_background_asteroid_3", true);
                    kl.field_R[3] = qk.a("", kf.field_d, "scenery_space_background_asteroid_4", true);
                    kl.field_R[4] = qk.a("", kf.field_d, "scenery_space_background_asteroid_5", true);
                    si.field_F = qk.a("", kf.field_d, "background_space_comet", true);
                    cc.field_w = eh.a("", (byte) -89, kf.field_d, "midground_alien");
                    b.field_k = eh.a("", (byte) -45, kf.field_d, "midground_alien_8");
                    nf.field_v = eh.a("", (byte) -77, kf.field_d, "midground_alien_9");
                    kh.field_e = eh.a("", (byte) -116, kf.field_d, "playership");
                    kh.field_e.d(3);
                    ri.field_e = kh.field_e.field_k;
                    am.field_l = kh.field_e.field_d;
                    am.field_p = am.field_l / 2;
                    ri.field_q = ri.field_e / 2;
                    df.field_f = this.a(eh.a("", (byte) -85, kf.field_d, "scenery_tile_earth_1"), (byte) 88);
                    ah.field_L = this.a(eh.a("", (byte) -118, kf.field_d, "scenery_tile_earth_2"), (byte) 103);
                    mk.field_f = this.a(eh.a("", (byte) -120, kf.field_d, "scenery_tile_earth_3"), (byte) -60);
                    qg.field_U = this.a(eh.a("", (byte) -126, kf.field_d, "scenery_tile_earth_4"), (byte) 24);
                    bf.field_v = this.a(eh.a("", (byte) -106, kf.field_d, "scenery_tile_earth_5"), (byte) 113);
                    vg.field_h = this.a(eh.a("", (byte) -55, kf.field_d, "scenery_tile_earth_6"), (byte) -124);
                    rg.field_a = this.a(eh.a("", (byte) -29, kf.field_d, "scenery_tile_earth_7"), (byte) 120);
                    fi.field_e = this.a(eh.a("", (byte) -127, kf.field_d, "scenery_tile_earth_8"), (byte) -29);
                    jd.field_Q = this.a(eh.a("", (byte) -82, kf.field_d, "scenery_tile_earth_9"), (byte) 118);
                    r.field_e = this.a(eh.a("", (byte) -49, kf.field_d, "scenery_tile_earth_10"), (byte) 127);
                    nf.field_s = ij.a("scenery_tile_earth_11", (byte) 99, kf.field_d, "");
                    nf.field_s[0].c();
                    pc.field_c = new he[1];
                    pc.field_c[0] = nf.field_s[0].e();
                    pc.field_c[0].g();
                    rh.field_f = this.a(eh.a("", (byte) -109, kf.field_d, "scenery_tile_earth_1_rubble"), (byte) -34);
                    sd.field_d = this.a(eh.a("", (byte) -112, kf.field_d, "scenery_tile_earth_2_rubble"), (byte) 110);
                    tb.field_b = this.a(eh.a("", (byte) -78, kf.field_d, "scenery_tile_earth_3_rubble"), (byte) -20);
                    qf.field_e = this.a(eh.a("", (byte) -36, kf.field_d, "scenery_tile_earth_4_rubble"), (byte) -48);
                    dm.field_z = this.a(eh.a("", (byte) -76, kf.field_d, "scenery_tile_earth_5_rubble"), (byte) -23);
                    qd.field_Cb = this.a(eh.a("", (byte) -107, kf.field_d, "scenery_tile_earth_6_rubble"), (byte) 90);
                    gm.field_L = this.a(eh.a("", (byte) -77, kf.field_d, "scenery_tile_earth_7_rubble"), (byte) -97);
                    rb.field_c = this.a(eh.a("", (byte) -57, kf.field_d, "scenery_tile_earth_8_rubble"), (byte) -40);
                    sc.field_a = this.a(eh.a("", (byte) -61, kf.field_d, "scenery_tile_earth_9_rubble"), (byte) 103);
                    rd.field_A = this.a(eh.a("", (byte) -29, kf.field_d, "scenery_tile_earth_10_rubble"), (byte) -77);
                    re.field_i = ij.a("scenery_tile_earth_11_rubble", (byte) 84, kf.field_d, "");
                    re.field_i[0].c();
                    re.field_h = new he[1];
                    re.field_h[0] = re.field_i[0].e();
                    re.field_h[0].g();
                    dm.field_y = this.a(eh.a("", (byte) -69, kf.field_d, "scenery_tile_earth_1_fire_mask"), (byte) 105);
                    wh.field_u = this.a(eh.a("", (byte) -31, kf.field_d, "scenery_tile_earth_2_fire_mask"), (byte) -120);
                    ng.field_b = this.a(eh.a("", (byte) -68, kf.field_d, "scenery_tile_earth_3_fire_mask"), (byte) 17);
                    g.field_q = this.a(eh.a("", (byte) -70, kf.field_d, "scenery_tile_earth_4_fire_mask"), (byte) -124);
                    pj.field_z = this.a(eh.a("", (byte) -123, kf.field_d, "scenery_tile_earth_5_fire_mask"), (byte) 98);
                    tl.field_Q = this.a(eh.a("", (byte) -108, kf.field_d, "scenery_tile_earth_6_fire_mask"), (byte) -7);
                    ld.field_d = this.a(eh.a("", (byte) -71, kf.field_d, "scenery_tile_earth_7_fire_mask"), (byte) 1);
                    eb.field_c = this.a(eh.a("", (byte) -61, kf.field_d, "scenery_tile_earth_8_fire_mask"), (byte) -28);
                    ri.field_h = this.a(eh.a("", (byte) -53, kf.field_d, "scenery_tile_earth_9_fire_mask"), (byte) 119);
                    el.field_vb = this.a(eh.a("", (byte) -25, kf.field_d, "scenery_tile_earth_10_fire_mask"), (byte) -126);
                    bk.field_j = ij.a("scenery_tile_earth_11_fire_mask", (byte) 73, kf.field_d, "");
                    bk.field_j[0].c();
                    ik.field_f = new he[1];
                    ik.field_f[0] = bk.field_j[0].e();
                    ik.field_f[0].g();
                    fa.field_m = this.a(eh.a("", (byte) -30, kf.field_d, "scenery_tile_earth_bath_01"), (byte) -35);
                    we.field_c = this.a(eh.a("", (byte) -107, kf.field_d, "scenery_tile_earth_bath_02"), (byte) -7);
                    d.field_c = ij.a("scenery_tile_earth_bath_03", (byte) 115, kf.field_d, "");
                    d.field_c[0].c();
                    ek.field_l = this.a(eh.a("", (byte) -89, kf.field_d, "scenery_tile_earth_bath_04"), (byte) -110);
                    oj.field_g = this.a(eh.a("", (byte) -117, kf.field_d, "scenery_tile_earth_bath_05"), (byte) -24);
                    mh.field_g = this.a(eh.a("", (byte) -58, kf.field_d, "scenery_tile_earth_bath_06"), (byte) 101);
                    u.field_c = this.a(eh.a("", (byte) -93, kf.field_d, "scenery_tile_earth_bath_07"), (byte) 112);
                    ai.field_y = this.a(eh.a("", (byte) -43, kf.field_d, "scenery_tile_earth_bath_08"), (byte) 117);
                    bk.field_d = this.a(eh.a("", (byte) -80, kf.field_d, "scenery_tile_earth_bath_09"), (byte) 23);
                    ek.field_t = this.a(eh.a("", (byte) -59, kf.field_d, "scenery_tile_earth_bath_10"), (byte) 103);
                    hh.field_c = ij.a("scenery_tile_earth_bath_11", (byte) 71, kf.field_d, "");
                    hh.field_c[0].c();
                    lk.field_m = new he[1];
                    lk.field_m[0] = hh.field_c[0].e();
                    lk.field_m[0].g();
                    gi.field_d = ij.a("scenery_tile_earth_bath_01_broken", (byte) 108, kf.field_d, "");
                    gi.field_d[0].c();
                    lc.field_q = ij.a("scenery_tile_earth_bath_02_broken", (byte) 92, kf.field_d, "");
                    lc.field_q[0].c();
                    ca.field_V = ij.a("scenery_tile_earth_bath_03_broken", (byte) 86, kf.field_d, "");
                    ca.field_V[0].c();
                    ac.field_g = ij.a("scenery_tile_earth_bath_04_broken", (byte) 109, kf.field_d, "");
                    ac.field_g[0].c();
                    df.field_k = this.a(eh.a("", (byte) -59, kf.field_d, "scenery_tile_earth_bath_05_broken"), (byte) -88);
                    sl.field_x = ij.a("scenery_tile_earth_bath_06_broken", (byte) 80, kf.field_d, "");
                    sl.field_x[0].c();
                    qj.field_a = this.a(eh.a("", (byte) -81, kf.field_d, "scenery_tile_earth_bath_07_broken"), (byte) 102);
                    og.field_c = ij.a("scenery_tile_earth_bath_08_broken", (byte) 120, kf.field_d, "");
                    og.field_c[0].c();
                    ck.field_d = this.a(eh.a("", (byte) -39, kf.field_d, "scenery_tile_earth_bath_09_broken"), (byte) 89);
                    field_G = this.a(eh.a("", (byte) -71, kf.field_d, "scenery_tile_earth_bath_10_broken"), (byte) 7);
                    qa.field_S = ij.a("scenery_tile_earth_bath_11_broken", (byte) 61, kf.field_d, "");
                    qa.field_S[0].c();
                    nf.field_p = new he[1];
                    nf.field_p[0] = hh.field_c[0].e();
                    nf.field_p[0].g();
                    eb.field_a = ij.a("scenery_tile_earth_bath_01_fire_mask", (byte) 121, kf.field_d, "");
                    eb.field_a[0].c();
                    wb.field_b = ij.a("scenery_tile_earth_bath_02_fire_mask", (byte) 108, kf.field_d, "");
                    wb.field_b[0].c();
                    cm.field_L = ij.a("scenery_tile_earth_bath_03_fire_mask", (byte) 75, kf.field_d, "");
                    cm.field_L[0].c();
                    ca.field_Y = ij.a("scenery_tile_earth_bath_04_fire_mask", (byte) 106, kf.field_d, "");
                    ca.field_Y[0].c();
                    oj.field_f = ij.a("scenery_tile_earth_bath_05_fire_mask", (byte) 114, kf.field_d, "");
                    oj.field_f[0].c();
                    ld.field_f = ij.a("scenery_tile_earth_bath_06_fire_mask", (byte) 60, kf.field_d, "");
                    ld.field_f[0].c();
                    cf.field_g = this.a(eh.a("", (byte) -48, kf.field_d, "scenery_tile_earth_bath_07_fire_mask"), (byte) 101);
                    cf.field_g[0].c();
                    ri.field_r = ij.a("scenery_tile_earth_bath_08_fire_mask", (byte) 62, kf.field_d, "");
                    ri.field_r[0].c();
                    cl.field_n = ij.a("scenery_tile_earth_bath_09_fire_mask", (byte) 102, kf.field_d, "");
                    cl.field_n[0].c();
                    kj.field_g = ij.a("scenery_tile_earth_bath_10_fire_mask", (byte) 120, kf.field_d, "");
                    kj.field_g[0].c();
                    ei.field_k = ij.a("scenery_tile_earth_bath_11_fire_mask", (byte) 125, kf.field_d, "");
                    ei.field_k[0].c();
                    ij.field_e = new he[1];
                    ij.field_e[0] = ei.field_k[0].e();
                    ij.field_e[0].g();
                    vc.field_b = ij.a("scenery_tile_alien_1", (byte) 107, kf.field_d, "");
                    ij.field_d = ij.a("scenery_tile_alien_2", (byte) 103, kf.field_d, "");
                    db.field_b = ij.a("scenery_tile_alien_3", (byte) 112, kf.field_d, "");
                    kf.field_e = ij.a("scenery_tile_alien_4", (byte) 72, kf.field_d, "");
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_L = "Resume Game";
        field_E = "Retry";
        field_F = new vd();
    }
}
