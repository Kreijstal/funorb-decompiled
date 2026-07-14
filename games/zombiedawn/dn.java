/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dn extends pa {
    static wl field_I;
    private vo field_H;
    static vo field_D;
    static String field_G;
    static vn field_E;
    static String field_J;

    final void b(int param0, boolean param1, int param2) {
        int var8 = ZombieDawn.field_J;
        if (param2 == ((dn) this).field_i) {
            if (!(param0 != ((dn) this).field_n)) {
                return;
            }
        }
        int var4 = (-((dn) this).field_i + param2) / 2;
        int var5 = (-((dn) this).field_n + param0) / 2;
        cj var6 = new cj(((dn) this).field_H);
        ei var7 = (ei) (Object) var6.c((byte) -119);
        while (var7 != null) {
            var7.field_k = var7.field_k + var4;
            var7.field_j = var7.field_j + var5;
            var7 = (ei) (Object) var6.a((byte) 61);
        }
        ((dn) this).field_i = param2;
        ((dn) this).field_n = param0;
        if (param1) {
            field_G = null;
        }
    }

    final ei c(boolean param0) {
        cj var2 = null;
        ei var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          var2 = new cj(((dn) this).field_H);
          if (param0) {
            break L0;
          } else {
            ((dn) this).j(112);
            break L0;
          }
        }
        var3 = (ei) (Object) var2.c((byte) -116);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_H) {
              var3 = (ei) (Object) var2.a((byte) 61);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    public static void h(int param0) {
        field_D = null;
        field_E = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            return;
        }
        field_G = null;
    }

    final static void a(am param0, int param1) {
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
            n var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            n var17 = null;
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
                        var12 = ZombieDawn.field_J;
                        var13 = (n) (Object) dj.field_l.b((byte) 26);
                        var17 = var13;
                        if (var17 != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        if (param1 >= 57) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        boolean discarded$2 = dn.i(-44);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (var4 >= var17.field_l) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == var13.field_n[var4]) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (var13.field_n[var4].field_f != 2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var13.field_q[var4] = -5;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (var13.field_n[var4].field_f == 0) {
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
                        if (var13.field_m[var4] != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var4++;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var13.field_m[var4].field_f != -3) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var13.field_q[var4] = -6;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (-1 == var13.field_m[var4].field_f) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var4++;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 18: {
                        var3 = 1;
                        var4++;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 19: {
                        if (var3 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        return;
                    }
                    case 22: {
                        var4 = param0.field_j;
                        param0.h(-116, var17.field_o);
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var17.field_l <= var5) {
                            statePc = 61;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-1 != (var17.field_q[var5] ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        param0.i(var17.field_q[var5], 111);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            var6_int = var17.field_h[var5];
                            if (var6_int == 0) {
                                statePc = 32;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 48 : (stateCaught_27 instanceof InvalidClassException ? 49 : (stateCaught_27 instanceof StreamCorruptedException ? 50 : (stateCaught_27 instanceof OptionalDataException ? 51 : (stateCaught_27 instanceof IllegalAccessException ? 52 : (stateCaught_27 instanceof IllegalArgumentException ? 53 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_27 instanceof SecurityException ? 55 : (stateCaught_27 instanceof IOException ? 56 : (stateCaught_27 instanceof NullPointerException ? 57 : (stateCaught_27 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 48 : (stateCaught_28 instanceof InvalidClassException ? 49 : (stateCaught_28 instanceof StreamCorruptedException ? 50 : (stateCaught_28 instanceof OptionalDataException ? 51 : (stateCaught_28 instanceof IllegalAccessException ? 52 : (stateCaught_28 instanceof IllegalArgumentException ? 53 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_28 instanceof SecurityException ? 55 : (stateCaught_28 instanceof IOException ? 56 : (stateCaught_28 instanceof NullPointerException ? 57 : (stateCaught_28 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((var6_int ^ -1) != -3) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 48 : (stateCaught_29 instanceof InvalidClassException ? 49 : (stateCaught_29 instanceof StreamCorruptedException ? 50 : (stateCaught_29 instanceof OptionalDataException ? 51 : (stateCaught_29 instanceof IllegalAccessException ? 52 : (stateCaught_29 instanceof IllegalArgumentException ? 53 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_29 instanceof SecurityException ? 55 : (stateCaught_29 instanceof IOException ? 56 : (stateCaught_29 instanceof NullPointerException ? 57 : (stateCaught_29 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_n[var5].field_d;
                            var8 = var26.getModifiers();
                            param0.i(0, 29);
                            param0.h(73, var8);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 48 : (stateCaught_30 instanceof InvalidClassException ? 49 : (stateCaught_30 instanceof StreamCorruptedException ? 50 : (stateCaught_30 instanceof OptionalDataException ? 51 : (stateCaught_30 instanceof IllegalAccessException ? 52 : (stateCaught_30 instanceof IllegalArgumentException ? 53 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_30 instanceof SecurityException ? 55 : (stateCaught_30 instanceof IOException ? 56 : (stateCaught_30 instanceof NullPointerException ? 57 : (stateCaught_30 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_d;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_j[var5]);
                            param0.i(0, 122);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 48 : (stateCaught_31 instanceof InvalidClassException ? 49 : (stateCaught_31 instanceof StreamCorruptedException ? 50 : (stateCaught_31 instanceof OptionalDataException ? 51 : (stateCaught_31 instanceof IllegalAccessException ? 52 : (stateCaught_31 instanceof IllegalArgumentException ? 53 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_31 instanceof SecurityException ? 55 : (stateCaught_31 instanceof IOException ? 56 : (stateCaught_31 instanceof NullPointerException ? 57 : (stateCaught_31 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_n[var5].field_d;
                            var8 = var15.getInt((Object) null);
                            param0.i(0, 64);
                            param0.h(102, var8);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 48 : (stateCaught_32 instanceof InvalidClassException ? 49 : (stateCaught_32 instanceof StreamCorruptedException ? 50 : (stateCaught_32 instanceof OptionalDataException ? 51 : (stateCaught_32 instanceof IllegalAccessException ? 52 : (stateCaught_32 instanceof IllegalArgumentException ? 53 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_32 instanceof SecurityException ? 55 : (stateCaught_32 instanceof IOException ? 56 : (stateCaught_32 instanceof NullPointerException ? 57 : (stateCaught_32 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var6_int == 3) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 48 : (stateCaught_33 instanceof InvalidClassException ? 49 : (stateCaught_33 instanceof StreamCorruptedException ? 50 : (stateCaught_33 instanceof OptionalDataException ? 51 : (stateCaught_33 instanceof IllegalAccessException ? 52 : (stateCaught_33 instanceof IllegalArgumentException ? 53 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_33 instanceof SecurityException ? 55 : (stateCaught_33 instanceof IOException ? 56 : (stateCaught_33 instanceof NullPointerException ? 57 : (stateCaught_33 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-5 == (var6_int ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 48 : (stateCaught_34 instanceof InvalidClassException ? 49 : (stateCaught_34 instanceof StreamCorruptedException ? 50 : (stateCaught_34 instanceof OptionalDataException ? 51 : (stateCaught_34 instanceof IllegalAccessException ? 52 : (stateCaught_34 instanceof IllegalArgumentException ? 53 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_34 instanceof SecurityException ? 55 : (stateCaught_34 instanceof IOException ? 56 : (stateCaught_34 instanceof NullPointerException ? 57 : (stateCaught_34 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 48 : (stateCaught_35 instanceof InvalidClassException ? 49 : (stateCaught_35 instanceof StreamCorruptedException ? 50 : (stateCaught_35 instanceof OptionalDataException ? 51 : (stateCaught_35 instanceof IllegalAccessException ? 52 : (stateCaught_35 instanceof IllegalArgumentException ? 53 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_35 instanceof SecurityException ? 55 : (stateCaught_35 instanceof IOException ? 56 : (stateCaught_35 instanceof NullPointerException ? 57 : (stateCaught_35 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_m[var5].field_d;
                            var8 = var27.getModifiers();
                            param0.i(0, -84);
                            param0.h(69, var8);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 48 : (stateCaught_36 instanceof InvalidClassException ? 49 : (stateCaught_36 instanceof StreamCorruptedException ? 50 : (stateCaught_36 instanceof OptionalDataException ? 51 : (stateCaught_36 instanceof IllegalAccessException ? 52 : (stateCaught_36 instanceof IllegalArgumentException ? 53 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_36 instanceof SecurityException ? 55 : (stateCaught_36 instanceof IOException ? 56 : (stateCaught_36 instanceof NullPointerException ? 57 : (stateCaught_36 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_m[var5].field_d;
                            var25 = var17.field_i[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 48 : (stateCaught_37 instanceof InvalidClassException ? 49 : (stateCaught_37 instanceof StreamCorruptedException ? 50 : (stateCaught_37 instanceof OptionalDataException ? 51 : (stateCaught_37 instanceof IllegalAccessException ? 52 : (stateCaught_37 instanceof IllegalArgumentException ? 53 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_37 instanceof SecurityException ? 55 : (stateCaught_37 instanceof IOException ? 56 : (stateCaught_37 instanceof NullPointerException ? 57 : (stateCaught_37 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var25.length <= var10_int) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 48 : (stateCaught_38 instanceof InvalidClassException ? 49 : (stateCaught_38 instanceof StreamCorruptedException ? 50 : (stateCaught_38 instanceof OptionalDataException ? 51 : (stateCaught_38 instanceof IllegalAccessException ? 52 : (stateCaught_38 instanceof IllegalArgumentException ? 53 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_38 instanceof SecurityException ? 55 : (stateCaught_38 instanceof IOException ? 56 : (stateCaught_38 instanceof NullPointerException ? 57 : (stateCaught_38 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 48 : (stateCaught_39 instanceof InvalidClassException ? 49 : (stateCaught_39 instanceof StreamCorruptedException ? 50 : (stateCaught_39 instanceof OptionalDataException ? 51 : (stateCaught_39 instanceof IllegalAccessException ? 52 : (stateCaught_39 instanceof IllegalArgumentException ? 53 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_39 instanceof SecurityException ? 55 : (stateCaught_39 instanceof IOException ? 56 : (stateCaught_39 instanceof NullPointerException ? 57 : (stateCaught_39 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 48 : (stateCaught_40 instanceof InvalidClassException ? 49 : (stateCaught_40 instanceof StreamCorruptedException ? 50 : (stateCaught_40 instanceof OptionalDataException ? 51 : (stateCaught_40 instanceof IllegalAccessException ? 52 : (stateCaught_40 instanceof IllegalArgumentException ? 53 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_40 instanceof SecurityException ? 55 : (stateCaught_40 instanceof IOException ? 56 : (stateCaught_40 instanceof NullPointerException ? 57 : (stateCaught_40 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.i(0, 89);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 48 : (stateCaught_41 instanceof InvalidClassException ? 49 : (stateCaught_41 instanceof StreamCorruptedException ? 50 : (stateCaught_41 instanceof OptionalDataException ? 51 : (stateCaught_41 instanceof IllegalAccessException ? 52 : (stateCaught_41 instanceof IllegalArgumentException ? 53 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_41 instanceof SecurityException ? 55 : (stateCaught_41 instanceof IOException ? 56 : (stateCaught_41 instanceof NullPointerException ? 57 : (stateCaught_41 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 48 : (stateCaught_42 instanceof InvalidClassException ? 49 : (stateCaught_42 instanceof StreamCorruptedException ? 50 : (stateCaught_42 instanceof OptionalDataException ? 51 : (stateCaught_42 instanceof IllegalAccessException ? 52 : (stateCaught_42 instanceof IllegalArgumentException ? 53 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_42 instanceof SecurityException ? 55 : (stateCaught_42 instanceof IOException ? 56 : (stateCaught_42 instanceof NullPointerException ? 57 : (stateCaught_42 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 48 : (stateCaught_43 instanceof InvalidClassException ? 49 : (stateCaught_43 instanceof StreamCorruptedException ? 50 : (stateCaught_43 instanceof OptionalDataException ? 51 : (stateCaught_43 instanceof IllegalAccessException ? 52 : (stateCaught_43 instanceof IllegalArgumentException ? 53 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_43 instanceof SecurityException ? 55 : (stateCaught_43 instanceof IOException ? 56 : (stateCaught_43 instanceof NullPointerException ? 57 : (stateCaught_43 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param0.i(4, -119);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 48 : (stateCaught_44 instanceof InvalidClassException ? 49 : (stateCaught_44 instanceof StreamCorruptedException ? 50 : (stateCaught_44 instanceof OptionalDataException ? 51 : (stateCaught_44 instanceof IllegalAccessException ? 52 : (stateCaught_44 instanceof IllegalArgumentException ? 53 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_44 instanceof SecurityException ? 55 : (stateCaught_44 instanceof IOException ? 56 : (stateCaught_44 instanceof NullPointerException ? 57 : (stateCaught_44 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param0.i(2, 61);
                            param0.a(128, (String) var10);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 48 : (stateCaught_45 instanceof InvalidClassException ? 49 : (stateCaught_45 instanceof StreamCorruptedException ? 50 : (stateCaught_45 instanceof OptionalDataException ? 51 : (stateCaught_45 instanceof IllegalAccessException ? 52 : (stateCaught_45 instanceof IllegalArgumentException ? 53 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_45 instanceof SecurityException ? 55 : (stateCaught_45 instanceof IOException ? 56 : (stateCaught_45 instanceof NullPointerException ? 57 : (stateCaught_45 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param0.i(1, 12);
                            param0.a(((Number) var10).longValue(), 121);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 48 : (stateCaught_46 instanceof InvalidClassException ? 49 : (stateCaught_46 instanceof StreamCorruptedException ? 50 : (stateCaught_46 instanceof OptionalDataException ? 51 : (stateCaught_46 instanceof IllegalAccessException ? 52 : (stateCaught_46 instanceof IllegalArgumentException ? 53 : (stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_46 instanceof SecurityException ? 55 : (stateCaught_46 instanceof IOException ? 56 : (stateCaught_46 instanceof NullPointerException ? 57 : (stateCaught_46 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.i(-10, 74);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.i(-11, -95);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.i(-12, -113);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.i(-13, -90);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.i(-14, 18);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.i(-15, -113);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.i(-16, 53);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.i(-17, -95);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.i(-18, -103);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.i(-19, -91);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.i(-20, 37);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref11 = caughtException;
                        param0.i(-21, 58);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 61: {
                        int discarded$3 = param0.e(-120, var4);
                        var17.b(-27598);
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

    final static vn[] f(byte param0) {
        vn[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = ZombieDawn.field_J;
        var1 = new vn[t.field_h];
        if (param0 == 43) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= t.field_h) {
              no.f((byte) -114);
              return var1;
            } else {
              var3 = uf.field_n[var2] * bn.field_c[var2];
              var21 = vj.field_m[var2];
              if (jc.field_r[var2]) {
                var23 = ka.field_f[var2];
                var24 = new int[var3];
                var20 = var24;
                var16 = var20;
                var13 = var16;
                var6 = var13;
                var7 = 0;
                L1: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (vn) (Object) new cd(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var24);
                    var2++;
                    continue L0;
                  } else {
                    var6[var7] = hi.a(j.field_a[eg.a((int) var21[var7], 255)], eg.a((int) var23[var7], 255) << -158746600);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                var9 = new int[var3];
                var22 = var9;
                var6_int = 0;
                L2: while (true) {
                  if (var3 <= var6_int) {
                    var1[var2] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var22);
                    var2++;
                    continue L0;
                  } else {
                    var9[var6_int] = j.field_a[eg.a((int) var21[var6_int], 255)];
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final ga f(int param0) {
        cj var2 = null;
        ei var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 <= -2) {
            break L0;
          } else {
            ga discarded$2 = ((dn) this).f(-10);
            break L0;
          }
        }
        var2 = new cj(((dn) this).field_H);
        var3 = (ei) (Object) var2.c((byte) -116);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_H) {
              return var3.d((byte) 35);
            } else {
              var3 = (ei) (Object) var2.a((byte) 61);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void g(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 > -122) {
            field_J = null;
        }
        cj var2 = new cj(((dn) this).field_H);
        ei var3 = (ei) (Object) var2.c((byte) -116);
        while (var3 != null) {
            if (!(!var3.j(2634))) {
                var3.b(-27598);
            }
            var3 = (ei) (Object) var2.a((byte) 61);
        }
        ((dn) this).field_z = (ga) (Object) ((dn) this).c(true);
    }

    final void a(ga param0, boolean param1) {
        if (!(param0 instanceof ei)) {
            throw new IllegalArgumentException();
        }
        ei var3 = (ei) (Object) param0;
        ((dn) this).field_H.a((le) (Object) var3, -112);
        var3.field_H = param1 ? true : false;
        boolean discarded$0 = var3.a((byte) 107, (ga) this);
    }

    final void j(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -636330975) {
            ((dn) this).j(-51);
        }
        cj var2 = new cj(((dn) this).field_H);
        ei var3 = (ei) (Object) var2.c((byte) -123);
        while (var3 != null) {
            var3.field_H = false;
            var3 = (ei) (Object) var2.a((byte) 61);
        }
        ((dn) this).field_z = null;
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -19301) {
            break L0;
          } else {
            dn.h(28);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((fl.field_a ^ -1) > -11) {
              break L2;
            } else {
              if (i.field_Y) {
                break L2;
              } else {
                if (ng.a((byte) -64)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void e(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -36) {
            return;
        }
        cj var2 = new cj(((dn) this).field_H);
        ei var3 = (ei) (Object) var2.c((byte) -125);
        while (var3 != null) {
            if (var3.e((byte) 28)) {
                var3.b(-27598);
            }
            var3 = (ei) (Object) var2.a((byte) 61);
        }
    }

    public dn() {
        super(0, 0, pk.field_N, b.field_l, (io) null, (sk) null);
        ((dn) this).field_H = new vo();
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        if (!param1) {
          var3 = 0;
          var4 = el.field_k;
          L0: while (true) {
            if (n.field_r.length <= var3) {
              return -1;
            } else {
              var5 = la.field_b[var3];
              if ((var5 ^ -1) <= -1) {
                var6 = sm.a(32564, true, n.field_r[var3]);
                var7 = im.field_d - (var6 >> -829750783);
                var4 = var4 + qb.field_i;
                if (bf.a(var7 + -nb.field_m, 0, param2, var4, var6 + (nb.field_m << -2141274143), (lb.field_Y << -636330975) + ma.field_k, param0)) {
                  return var5;
                } else {
                  var4 = var4 + ((lb.field_Y << 1388407393) + qb.field_i + ma.field_k);
                  var3++;
                  continue L0;
                }
              } else {
                var4 = var4 + mh.field_G;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 57;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (!(((dn) this).field_h == null)) {
            ((dn) this).field_h.a(16777215, true, param0, (ga) this, param2);
        }
        if (param3 != 0) {
            return;
        }
        cj var5 = new cj(((dn) this).field_H);
        ga var6 = (ga) (Object) var5.b((byte) -21);
        while (var6 != null) {
            var6.a(((dn) this).field_j + param0, param1, ((dn) this).field_k + param2, param3 ^ 0);
            var6 = (ga) (Object) var5.a(17);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new wl();
        field_G = "Names cannot start or end with space or underscore";
        field_D = new vo();
        field_E = new vn(48, 48);
        field_J = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
