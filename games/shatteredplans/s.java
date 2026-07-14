/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class s {
    static int[] field_f;
    static int field_c;
    private java.util.zip.Inflater field_g;
    static int field_i;
    static int field_e;
    static String field_h;
    static boolean field_d;
    static String field_a;
    static String field_b;

    public s() {
        this(-1, 1000000, 1000000);
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        sl var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref = null;
        int var4 = 0;
        String var5 = null;
        ve var6 = null;
        String var7 = null;
        ve var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_13_0 = 0;
        ve stackIn_50_0 = null;
        boolean stackIn_51_0 = false;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        ve stackOut_49_0 = null;
        boolean stackOut_50_0 = false;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = sa.field_a;
                        var2 = var1_ref.j(-64);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 == (var2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (sl.field_m != null) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        sl.field_m = new in(128);
                        oi.field_e = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (1 != var1_ref.j(-65)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_int = stackIn_13_0;
                        var4_ref = var1_ref.e(-1);
                        if (var3_int == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var1_ref.e(-1);
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = var4_ref;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = di.a(var4_ref, 124);
                        var7 = var1_ref.e(-1);
                        var8 = ji.a((CharSequence) (Object) var4_ref, true);
                        if (var8 != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = var4_ref;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var6 != null) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = di.a(var7, 124);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null == var6) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        sl.field_m.a((long)var8.hashCode(), (df) (Object) var6, true);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null != var6) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = new ve();
                        sl.field_m.a((long)var8.hashCode(), (df) (Object) var6, param0);
                        oi.field_e = oi.field_e + 1;
                        var6.field_zb = oi.field_e;
                        fp.field_b.a((byte) -113, (oh) (Object) var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6.field_Eb = var5;
                        var6.field_Ab = var4_ref;
                        var6.field_Bb = var7;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return;
                }
                case 28: {
                    try {
                        if (1 == var2) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (eg.field_q != null) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        eg.field_q = new in(128);
                        r.field_c = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3 = var1_ref.e(-1);
                        if (!var3.equals((Object) (Object) "")) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3 = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4_ref = var1_ref.e(-1);
                        var5 = var1_ref.e(-1);
                        var6 = hb.a((byte) -90, var4_ref);
                        if (var6 != null) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = hb.a((byte) -90, var5);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == var6) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        eg.field_q.a((long)ji.a((CharSequence) (Object) var4_ref, param0).hashCode(), (df) (Object) var6, true);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null != var6) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var6 = new ve();
                        eg.field_q.a((long)ji.a((CharSequence) (Object) var4_ref, true).hashCode(), (df) (Object) var6, true);
                        r.field_c = r.field_c + 1;
                        var6.field_zb = r.field_c;
                        vd.field_j.a((byte) -113, (oh) (Object) var6);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var3 == null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3 = var3.intern();
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6.field_Ab = var4_ref;
                        var6.field_xb = var3;
                        var6.field_Bb = var5;
                        var6.b((byte) -125);
                        var7_ref = (ve) (Object) vd.field_j.d(0);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var7_ref == null) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = (ve) var7_ref;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = d.a(stackIn_50_0, var6, (byte) -81);
                        stackIn_59_0 = stackOut_50_0 ? 1 : 0;
                        stackIn_51_0 = stackOut_50_0;
                        if (var9 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!stackIn_51_0) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7_ref = (ve) (Object) vd.field_j.a((byte) -71);
                        if (var9 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7_ref == null) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = -126;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = stackIn_57_0;
                        stackIn_59_0 = stackOut_57_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        wp.a((byte) stackIn_59_0, (oh) (Object) var6, (oh) (Object) var7_ref);
                        if (var9 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        vd.field_j.a((byte) -113, (oh) (Object) var6);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return;
                }
                case 64: {
                    try {
                        if (param0) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        field_i = 92;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (2 == var2) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((po.field_b ^ -1) != -2) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        po.field_b = 2;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 75: {
                    return;
                }
                case 76: {
                    try {
                        if (3 != var2) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (2 == po.field_b) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        po.field_b = 1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 83: {
                    return;
                }
                case 84: {
                    try {
                        if (var2 == 4) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        po.field_b = 1;
                        var3 = var1_ref.e(-1);
                        jo.field_d = var3.intern();
                        var4 = var1_ref.j(-71);
                        os.a(-82, var4);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    return;
                }
                case 89: {
                    try {
                        jq.a(-29901, (Throwable) null, "F1: " + w.a(16738));
                        q.g(-101);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "s.A(" + param0 + 41);
                }
                case 92: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        ec.a(-1, eb.field_a, 5);
        if (param0 != 1) {
            return;
        }
        try {
            ec.a(param0 ^ -2, bg.field_c, 8);
            if (!kl.d((byte) 104)) {
                ec.a(-1, rm.field_h, 1);
                ec.a(-1, up.field_b, 2);
                ec.a(param0 ^ -2, hr.field_e, 3);
                ec.a(param0 ^ -2, lm.field_e, 4);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "s.C(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        try {
            field_a = null;
            field_h = null;
            field_b = null;
            field_f = null;
            if (param0 != 114) {
                field_e = 10;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "s.D(" + param0 + 41);
        }
    }

    private s(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, ob param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            int stackIn_2_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            int stackOut_1_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param1.field_h[param1.field_j] != 31) {
                                statePc = 5;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 19 : 4);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = 116;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 19 : 4);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (stackIn_2_0 == (param1.field_h[1 + param1.field_j] ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 6 : 19);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 6 : 19);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 6 : 19);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 6 : 19);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (null != ((s) this).field_g) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 10 : 19);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((s) this).field_g = new java.util.zip.Inflater(true);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 10 : 19);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((s) this).field_g.setInput(param1.field_h, param1.field_j + 10, -10 - (param1.field_j + 8) + param1.field_h.length);
                            int discarded$2 = ((s) this).field_g.inflate(param0);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            exception = (Exception) (Object) caughtException;
                            ((s) this).field_g.reset();
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((s) this).field_g.reset();
                            if (param2 == 5591) {
                                statePc = 29;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 17 : 19);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            s.a(-110);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 17 : 19);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var4 = (RuntimeException) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = (RuntimeException) var4;
                            stackOut_20_1 = new StringBuilder().append("s.B(");
                            stackIn_23_0 = stackOut_20_0;
                            stackIn_23_1 = stackOut_20_1;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            if (param0 == null) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                            stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                            stackOut_21_2 = "{...}";
                            stackIn_24_0 = stackOut_21_0;
                            stackIn_24_1 = stackOut_21_1;
                            stackIn_24_2 = stackOut_21_2;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "null";
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
                            stackIn_27_0 = stackOut_24_0;
                            stackIn_27_1 = stackOut_24_1;
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            if (param1 == null) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                            stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                            stackOut_25_2 = "{...}";
                            stackIn_28_0 = stackOut_25_0;
                            stackIn_28_1 = stackOut_25_1;
                            stackIn_28_2 = stackOut_25_2;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 27: {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "null";
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param2 + 41);
                    }
                    case 29: {
                        return;
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
        field_c = -1;
        field_f = new int[4];
        field_h = "Message lobby";
        field_a = "Security";
        field_b = "<%0> has withdrawn the request to join.";
    }
}
