/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class ql extends mj {
    static int field_i;
    private java.net.ProxySelector field_j;
    static String field_f;
    static qf field_e;
    static int field_g;
    static String field_h;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_5_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Terraphoenix.field_V;
                        if (bl.field_e) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            if (param1 == -15) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = 1;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            var3 = (String) cd.a((byte) -128, "getcookies", param0);
                            var4 = nc.a(14352, var3, ';');
                            var5 = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 16;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 13;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var5++;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var2_ref = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (null == param0.getParameter("tuhstatbut")) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
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

    public static void b(int param0) {
        if (param0 != -5) {
            Object var2 = null;
            ql.a(67, (uc) null);
        }
        field_h = null;
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, uc param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            wf var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            wf var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var16 = null;
                        var20 = null;
                        var22 = null;
                        var12 = Terraphoenix.field_V;
                        var13 = (wf) (Object) rd.field_k.d(9272);
                        var17 = var13;
                        if (var17 == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (var4 >= var17.field_p) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null != var13.field_s[var4]) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if ((var13.field_s[var4].field_d ^ -1) != -3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var13.field_r[var4] = -5;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (var13.field_s[var4].field_d == 0) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var3 = 1;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var13.field_j[var4] != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 14: {
                        if (2 != var13.field_j[var4].field_d) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var13.field_r[var4] = -6;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 == var13.field_j[var4].field_d) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 18: {
                        var3 = 1;
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 19: {
                        if (var3 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        return;
                    }
                    case 21: {
                        var4 = param1.field_k;
                        param1.e(var17.field_i, 8959);
                        if (param0 <= -115) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        field_e = null;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        var5 = 0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var5 >= var17.field_p) {
                            statePc = 60;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var17.field_r[var5] == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        param1.i(var17.field_r[var5], -109);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            var6_int = var17.field_k[var5];
                            if (var6_int == 0) {
                                statePc = 32;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 47 : (stateCaught_27 instanceof InvalidClassException ? 48 : (stateCaught_27 instanceof StreamCorruptedException ? 49 : (stateCaught_27 instanceof OptionalDataException ? 50 : (stateCaught_27 instanceof IllegalAccessException ? 51 : (stateCaught_27 instanceof IllegalArgumentException ? 52 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_27 instanceof SecurityException ? 54 : (stateCaught_27 instanceof IOException ? 55 : (stateCaught_27 instanceof NullPointerException ? 56 : (stateCaught_27 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var6_int == -2) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 47 : (stateCaught_28 instanceof InvalidClassException ? 48 : (stateCaught_28 instanceof StreamCorruptedException ? 49 : (stateCaught_28 instanceof OptionalDataException ? 50 : (stateCaught_28 instanceof IllegalAccessException ? 51 : (stateCaught_28 instanceof IllegalArgumentException ? 52 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_28 instanceof SecurityException ? 54 : (stateCaught_28 instanceof IOException ? 55 : (stateCaught_28 instanceof NullPointerException ? 56 : (stateCaught_28 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-3 != var6_int) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 47 : (stateCaught_29 instanceof InvalidClassException ? 48 : (stateCaught_29 instanceof StreamCorruptedException ? 49 : (stateCaught_29 instanceof OptionalDataException ? 50 : (stateCaught_29 instanceof IllegalAccessException ? 51 : (stateCaught_29 instanceof IllegalArgumentException ? 52 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_29 instanceof SecurityException ? 54 : (stateCaught_29 instanceof IOException ? 55 : (stateCaught_29 instanceof NullPointerException ? 56 : (stateCaught_29 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_s[var5].field_e;
                            var8 = var26.getModifiers();
                            param1.i(0, -93);
                            param1.e(var8, 8959);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 47 : (stateCaught_30 instanceof InvalidClassException ? 48 : (stateCaught_30 instanceof StreamCorruptedException ? 49 : (stateCaught_30 instanceof OptionalDataException ? 50 : (stateCaught_30 instanceof IllegalAccessException ? 51 : (stateCaught_30 instanceof IllegalArgumentException ? 52 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_30 instanceof SecurityException ? 54 : (stateCaught_30 instanceof IOException ? 55 : (stateCaught_30 instanceof NullPointerException ? 56 : (stateCaught_30 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_s[var5].field_e;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_m[var5]);
                            param1.i(0, -102);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 47 : (stateCaught_31 instanceof InvalidClassException ? 48 : (stateCaught_31 instanceof StreamCorruptedException ? 49 : (stateCaught_31 instanceof OptionalDataException ? 50 : (stateCaught_31 instanceof IllegalAccessException ? 51 : (stateCaught_31 instanceof IllegalArgumentException ? 52 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_31 instanceof SecurityException ? 54 : (stateCaught_31 instanceof IOException ? 55 : (stateCaught_31 instanceof NullPointerException ? 56 : (stateCaught_31 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_s[var5].field_e;
                            var8 = var15.getInt((Object) null);
                            param1.i(0, -106);
                            param1.e(var8, 8959);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 47 : (stateCaught_32 instanceof InvalidClassException ? 48 : (stateCaught_32 instanceof StreamCorruptedException ? 49 : (stateCaught_32 instanceof OptionalDataException ? 50 : (stateCaught_32 instanceof IllegalAccessException ? 51 : (stateCaught_32 instanceof IllegalArgumentException ? 52 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_32 instanceof SecurityException ? 54 : (stateCaught_32 instanceof IOException ? 55 : (stateCaught_32 instanceof NullPointerException ? 56 : (stateCaught_32 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var6_int == 3) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 47 : (stateCaught_33 instanceof InvalidClassException ? 48 : (stateCaught_33 instanceof StreamCorruptedException ? 49 : (stateCaught_33 instanceof OptionalDataException ? 50 : (stateCaught_33 instanceof IllegalAccessException ? 51 : (stateCaught_33 instanceof IllegalArgumentException ? 52 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_33 instanceof SecurityException ? 54 : (stateCaught_33 instanceof IOException ? 55 : (stateCaught_33 instanceof NullPointerException ? 56 : (stateCaught_33 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-5 != (var6_int ^ -1)) {
                                statePc = 59;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 47 : (stateCaught_34 instanceof InvalidClassException ? 48 : (stateCaught_34 instanceof StreamCorruptedException ? 49 : (stateCaught_34 instanceof OptionalDataException ? 50 : (stateCaught_34 instanceof IllegalAccessException ? 51 : (stateCaught_34 instanceof IllegalArgumentException ? 52 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_34 instanceof SecurityException ? 54 : (stateCaught_34 instanceof IOException ? 55 : (stateCaught_34 instanceof NullPointerException ? 56 : (stateCaught_34 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_j[var5].field_e;
                            var8 = var27.getModifiers();
                            param1.i(0, 74);
                            param1.e(var8, 8959);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 47 : (stateCaught_35 instanceof InvalidClassException ? 48 : (stateCaught_35 instanceof StreamCorruptedException ? 49 : (stateCaught_35 instanceof OptionalDataException ? 50 : (stateCaught_35 instanceof IllegalAccessException ? 51 : (stateCaught_35 instanceof IllegalArgumentException ? 52 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_35 instanceof SecurityException ? 54 : (stateCaught_35 instanceof IOException ? 55 : (stateCaught_35 instanceof NullPointerException ? 56 : (stateCaught_35 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_j[var5].field_e;
                            var25 = var17.field_o[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 47 : (stateCaught_36 instanceof InvalidClassException ? 48 : (stateCaught_36 instanceof StreamCorruptedException ? 49 : (stateCaught_36 instanceof OptionalDataException ? 50 : (stateCaught_36 instanceof IllegalAccessException ? 51 : (stateCaught_36 instanceof IllegalArgumentException ? 52 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_36 instanceof SecurityException ? 54 : (stateCaught_36 instanceof IOException ? 55 : (stateCaught_36 instanceof NullPointerException ? 56 : (stateCaught_36 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var25.length <= var10_int) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 47 : (stateCaught_37 instanceof InvalidClassException ? 48 : (stateCaught_37 instanceof StreamCorruptedException ? 49 : (stateCaught_37 instanceof OptionalDataException ? 50 : (stateCaught_37 instanceof IllegalAccessException ? 51 : (stateCaught_37 instanceof IllegalArgumentException ? 52 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_37 instanceof SecurityException ? 54 : (stateCaught_37 instanceof IOException ? 55 : (stateCaught_37 instanceof NullPointerException ? 56 : (stateCaught_37 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 47 : (stateCaught_38 instanceof InvalidClassException ? 48 : (stateCaught_38 instanceof StreamCorruptedException ? 49 : (stateCaught_38 instanceof OptionalDataException ? 50 : (stateCaught_38 instanceof IllegalAccessException ? 51 : (stateCaught_38 instanceof IllegalArgumentException ? 52 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_38 instanceof SecurityException ? 54 : (stateCaught_38 instanceof IOException ? 55 : (stateCaught_38 instanceof NullPointerException ? 56 : (stateCaught_38 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 45;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 47 : (stateCaught_39 instanceof InvalidClassException ? 48 : (stateCaught_39 instanceof StreamCorruptedException ? 49 : (stateCaught_39 instanceof OptionalDataException ? 50 : (stateCaught_39 instanceof IllegalAccessException ? 51 : (stateCaught_39 instanceof IllegalArgumentException ? 52 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_39 instanceof SecurityException ? 54 : (stateCaught_39 instanceof IOException ? 55 : (stateCaught_39 instanceof NullPointerException ? 56 : (stateCaught_39 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!(var10 instanceof Number)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 47 : (stateCaught_40 instanceof InvalidClassException ? 48 : (stateCaught_40 instanceof StreamCorruptedException ? 49 : (stateCaught_40 instanceof OptionalDataException ? 50 : (stateCaught_40 instanceof IllegalAccessException ? 51 : (stateCaught_40 instanceof IllegalArgumentException ? 52 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_40 instanceof SecurityException ? 54 : (stateCaught_40 instanceof IOException ? 55 : (stateCaught_40 instanceof NullPointerException ? 56 : (stateCaught_40 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param1.i(1, 59);
                            param1.a(((Number) var10).longValue(), 53);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 47 : (stateCaught_41 instanceof InvalidClassException ? 48 : (stateCaught_41 instanceof StreamCorruptedException ? 49 : (stateCaught_41 instanceof OptionalDataException ? 50 : (stateCaught_41 instanceof IllegalAccessException ? 51 : (stateCaught_41 instanceof IllegalArgumentException ? 52 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_41 instanceof SecurityException ? 54 : (stateCaught_41 instanceof IOException ? 55 : (stateCaught_41 instanceof NullPointerException ? 56 : (stateCaught_41 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 47 : (stateCaught_42 instanceof InvalidClassException ? 48 : (stateCaught_42 instanceof StreamCorruptedException ? 49 : (stateCaught_42 instanceof OptionalDataException ? 50 : (stateCaught_42 instanceof IllegalAccessException ? 51 : (stateCaught_42 instanceof IllegalArgumentException ? 52 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_42 instanceof SecurityException ? 54 : (stateCaught_42 instanceof IOException ? 55 : (stateCaught_42 instanceof NullPointerException ? 56 : (stateCaught_42 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param1.i(4, 119);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 47 : (stateCaught_43 instanceof InvalidClassException ? 48 : (stateCaught_43 instanceof StreamCorruptedException ? 49 : (stateCaught_43 instanceof OptionalDataException ? 50 : (stateCaught_43 instanceof IllegalAccessException ? 51 : (stateCaught_43 instanceof IllegalArgumentException ? 52 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_43 instanceof SecurityException ? 54 : (stateCaught_43 instanceof IOException ? 55 : (stateCaught_43 instanceof NullPointerException ? 56 : (stateCaught_43 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param1.i(2, -105);
                            param1.a((String) var10, 2295);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 47 : (stateCaught_44 instanceof InvalidClassException ? 48 : (stateCaught_44 instanceof StreamCorruptedException ? 49 : (stateCaught_44 instanceof OptionalDataException ? 50 : (stateCaught_44 instanceof IllegalAccessException ? 51 : (stateCaught_44 instanceof IllegalArgumentException ? 52 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_44 instanceof SecurityException ? 54 : (stateCaught_44 instanceof IOException ? 55 : (stateCaught_44 instanceof NullPointerException ? 56 : (stateCaught_44 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param1.i(0, -107);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 47 : (stateCaught_45 instanceof InvalidClassException ? 48 : (stateCaught_45 instanceof StreamCorruptedException ? 49 : (stateCaught_45 instanceof OptionalDataException ? 50 : (stateCaught_45 instanceof IllegalAccessException ? 51 : (stateCaught_45 instanceof IllegalArgumentException ? 52 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_45 instanceof SecurityException ? 54 : (stateCaught_45 instanceof IOException ? 55 : (stateCaught_45 instanceof NullPointerException ? 56 : (stateCaught_45 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param1.i(-10, -10);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.i(-11, 15);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.i(-12, -91);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.i(-13, 3);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.i(-14, 91);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.i(-15, -120);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.i(-16, 27);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.i(-17, -112);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.i(-18, -124);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.i(-19, 1);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.i(-20, -97);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref11 = caughtException;
                        param1.i(-21, 50);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        var5++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$1 = param1.d(var4, 8600);
                        var17.b((byte) 12);
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

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        Object var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        java.net.Socket var5 = null;
        Exception var6 = null;
        Class var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Object var14 = null;
        Class var15 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0.type() == java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return ((ql) this).a(true);
                }
                case 3: {
                    var3 = param0.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return null;
                }
                case 5: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1 == 15736) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var14 = null;
                    ql.a(-77, (uc) null);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (param0.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 10;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ql) this).field_d, ((ql) this).field_b));
                    return var5;
                }
                case 11: {
                    var5 = null;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var15;
                        var7 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return this.a(var4_ref.getPort(), var4_ref.getHostName(), (byte) 28, (String) (Object) var5);
                }
                case 19: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(int param0, String param1, byte param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        L0: {
          var12 = Terraphoenix.field_V;
          if (param2 == 28) {
            break L0;
          } else {
            ((ql) this).field_j = null;
            break L0;
          }
        }
        L1: {
          var13 = new java.net.Socket(param1, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 == null) {
            var6.write(("CONNECT " + ((ql) this).field_d + ":" + ((ql) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L1;
          } else {
            var6.write(("CONNECT " + ((ql) this).field_d + ":" + ((ql) this).field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L1;
          }
        }
        L2: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var8 = var7.readLine();
          if (var8 != null) {
            L3: {
              if (var8.startsWith("HTTP/1.0 200")) {
                break L3;
              } else {
                if (var8.startsWith("HTTP/1.1 200")) {
                  break L3;
                } else {
                  L4: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      break L4;
                    } else {
                      if (var8.startsWith("HTTP/1.1 407")) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
                  var8 = var7.readLine();
                  L5: while (true) {
                    L6: {
                      if (var8 == null) {
                        break L6;
                      } else {
                        if (-51 >= (var9 ^ -1)) {
                          break L6;
                        } else {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L7: {
                              var14 = var8.substring(var10.length()).trim();
                              var8 = var14;
                              var8 = var14;
                              var11 = var14.indexOf(' ');
                              if (0 == (var11 ^ -1)) {
                                break L7;
                              } else {
                                var8 = var14.substring(0, var11);
                                break L7;
                              }
                            }
                            throw new wb(var8);
                          } else {
                            var9++;
                            var8 = var7.readLine();
                            continue L5;
                          }
                        }
                      }
                    }
                    throw new wb("");
                  }
                }
              }
            }
            return var13;
          } else {
            break L2;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    ql() {
        ((ql) this).field_j = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(boolean param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        wb var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        wb var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_7_0 = null;
        java.net.URI stackIn_7_1 = null;
        java.net.URI stackIn_7_2 = null;
        StringBuilder stackIn_7_3 = null;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        java.net.Socket stackIn_21_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        java.net.ProxySelector stackOut_6_0 = null;
        java.net.URI stackOut_6_1 = null;
        java.net.URI stackOut_6_2 = null;
        StringBuilder stackOut_6_3 = null;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        String stackOut_7_4 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.Socket stackOut_20_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Terraphoenix.field_V;
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (((ql) this).field_b != 443) {
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
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = ((ql) this).field_j;
                        stackOut_6_1 = null;
                        stackOut_6_2 = null;
                        stackOut_6_3 = new StringBuilder();
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        stackIn_8_3 = stackOut_6_3;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (java.net.ProxySelector) (Object) stackIn_7_0;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = (StringBuilder) (Object) stackIn_7_3;
                        stackOut_7_4 = "https";
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_9_4 = stackOut_7_4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                        stackOut_8_4 = "http";
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        stackIn_9_4 = stackOut_8_4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        new java.net.URI(stackIn_9_4 + "://" + ((ql) this).field_d);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((ql) this).field_j;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = new StringBuilder();
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                        stackOut_10_4 = "http";
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                        stackOut_11_4 = "https";
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        new java.net.URI(stackIn_12_4 + "://" + ((ql) this).field_d);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(stackIn_12_1);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((ql) this).a(true);
                }
                case 15: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var8_array.length <= var9) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var12_ref2 = this.a(var11, 15736);
                        if (var12_ref2 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof wb ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof wb ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (java.net.Socket) var12_ref2;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof wb ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var12 = (wb) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 23: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 24: {
                    if (param0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    ql.b(56);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var7 != null) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    throw var7;
                }
                case 29: {
                    return ((ql) this).a(true);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Press 'L' to reload, cost: 14tus";
        field_e = new qf();
        field_h = "to return to the normal view.";
    }
}
