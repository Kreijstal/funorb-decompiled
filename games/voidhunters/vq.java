/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vq extends dqa implements lca {
    static int field_v;
    static fab field_x;
    private wta field_z;
    static String field_y;
    static String field_w;

    void a(int param0, wta param1) {
        ((vq) this).field_z = param1;
        if (param0 <= 73) {
          eeb discarded$2 = ((vq) this).a(68);
          ((vq) this).field_z.field_c = (vq) this;
          return;
        } else {
          ((vq) this).field_z.field_c = (vq) this;
          return;
        }
    }

    vq(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract boolean d(int param0);

    abstract int e(int param0);

    final static boolean a(faa param0, int param1, boolean param2) {
        int var3 = -28 / ((param1 - 0) / 33);
        param0.a(-632, !param2 ? 0 : 1, 1);
        return param2;
    }

    public final eeb a(int param0) {
        if (param0 != -782444220) {
            eeb discarded$0 = ((vq) this).a(84);
            return (eeb) (Object) ((vq) this).field_z;
        }
        return (eeb) (Object) ((vq) this).field_z;
    }

    abstract int f(int param0);

    public static void i(byte param0) {
        field_y = null;
        int var1 = -9 / ((35 - param0) / 62);
        field_w = null;
        field_x = null;
    }

    abstract int c(boolean param0);

    final static int g(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ds var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_36_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 >= ff.field_o.field_g) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 == ff.field_o.field_k) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 3;
                    }
                    case 5: {
                        if (ff.field_o.field_k == -2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        return 4;
                    }
                    case 9: {
                        if (param0 == -6269) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        return 121;
                    }
                    case 11: {
                        try {
                            if (0 == gob.field_c) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ija.field_b = gia.field_k.a(esa.field_p, hob.field_l, param0 ^ -6201);
                            gob.field_c = gob.field_c + 1;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (1 != gob.field_c) {
                                statePc = 21;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-3 != ija.field_b.field_f) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = jia.a(-93, -1);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        try {
                            if (-2 == ija.field_b.field_f) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            gob.field_c = gob.field_c + 1;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (gob.field_c != 2) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            eu.field_h = new lpb((java.net.Socket) ija.field_b.field_d, gia.field_k);
                            var2 = new ds(13);
                            jdb.a(nia.field_p, (byte) -48, wlb.field_o, var2, qfa.field_Ib);
                            var2.c(0, 15);
                            var2.d(ea.field_d, 332614536);
                            eu.field_h.a(0, var2.field_h, 13, 0);
                            gob.field_c = gob.field_c + 1;
                            ldb.field_r = 30000L + wt.a(false);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (gob.field_c != 3) {
                                statePc = 33;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (0 < eu.field_h.c(param0 ^ -6269)) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if ((ldb.field_r ^ -1L) <= (wt.a(false) ^ -1L)) {
                                statePc = 33;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = jia.a(-84, -2);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            var1_int = eu.field_h.a(-123);
                            if (var1_int != 0) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = jia.a(-71, var1_int);
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            gob.field_c = gob.field_c + 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (gob.field_c != 4) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ff.field_o.a((Object) (Object) eu.field_h, sw.field_f, false);
                            gob.field_c = 0;
                            eu.field_h = null;
                            ija.field_b = null;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = -1;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0;
                    }
                    case 38: {
                        var1 = (IOException) (Object) caughtException;
                        return jia.a(param0 ^ 6182, -3);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = -1;
        field_y = "Click or press F10 to open Quick Chat";
        field_w = "Playing";
    }
}
