/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hk {
    lv field_c;
    gf[] field_d;
    lv field_f;
    boolean field_g;
    static jea field_e;
    private eo field_b;
    private gf[] field_a;

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -30634) {
          L0: {
            if (((hk) this).field_g) {
              if (null == ((hk) this).field_c) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            } else {
              if (((hk) this).field_d == null) {
                stackOut_5_0 = 0;
                stackIn_9_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_9_0 = stackOut_4_0;
                break L0;
              }
            }
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final boolean b(int param0) {
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var25 = null;
        byte[] var22 = null;
        byte[] var19 = null;
        byte[] var17 = null;
        byte[] var2_ref_byte__ = null;
        byte[] var29 = null;
        byte[] var26 = null;
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((hk) this).field_f)) {
            if (null == ui.field_c) {
                var27 = gaa.a(4.0f, 16.0f, 128, (jg) (Object) new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                ui.field_c = bw.a(270, var27, false);
            }
            var28 = ir.a(ui.field_c, 13588, false);
            var25 = var28;
            var22 = var25;
            var19 = var22;
            var17 = var19;
            var2_ref_byte__ = var17;
            var29 = new byte[var28.length * 4];
            var26 = var29;
            var23 = var26;
            var20 = var23;
            var3 = var20;
            var4 = 0;
            for (var5 = 0; 16 > var5; var5++) {
                var6 = 16384 * var5;
                var7 = var6;
                for (var8 = 0; -129 < (var8 ^ -1); var8++) {
                    var9 = 128 * var8 + var7;
                    var10 = var7 - -((127 & var8 + -1) * 128);
                    var11 = var7 - -((127 & var8 - -1) * 128);
                    for (var12 = 0; 128 > var12; var12++) {
                        var13 = (float)((var2_ref_byte__[var12 + var10] & 255) + -(255 & var2_ref_byte__[var12 + var11]));
                        var14 = (float)((var2_ref_byte__[(127 & var12 + -1) + var9] & 255) - (255 & var2_ref_byte__[var9 - -(127 & 1 + var12)]));
                        var15 = (float)(128.0 / Math.sqrt((double)(var14 * var14 + 16384.0f + var13 * var13)));
                        var4++;
                        var3[var4] = (byte)(int)(127.0f + var14 * var15);
                        var4++;
                        var3[var4] = (byte)(int)(128.0f * var15 + 127.0f);
                        var4++;
                        var3[var4] = (byte)(int)(var15 * var13 + 127.0f);
                        var4++;
                        var6++;
                        var3[var4] = var2_ref_byte__[var6];
                    }
                }
            }
            ((hk) this).field_f = ((hk) this).field_b.a(var29, gpa.field_a, (byte) -41, 128, 128, 16);
        }
        int var2 = -20 % ((23 - param0) / 48);
        return null != ((hk) this).field_f ? true : false;
    }

    final static void a(boolean param0, kh param1) {
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
            aj var13 = null;
            java.lang.reflect.Field var15 = null;
            aj var16 = null;
            java.lang.reflect.Field var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var20 = null;
                        var22 = null;
                        var12 = TombRacer.field_G ? 1 : 0;
                        var13 = (aj) (Object) al.field_g.f(-80);
                        var16 = var13;
                        if (var16 == null) {
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
                        if (var4 >= var16.field_f) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (var13.field_j[var4] != null) {
                            statePc = 7;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (2 == var13.field_j[var4].field_b) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var13.field_m[var4] = -5;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var13.field_j[var4].field_b == 0) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var3 = 1;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var13.field_k[var4] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 15: {
                        if (var13.field_k[var4].field_b == 2) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var13.field_m[var4] = -6;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (var13.field_k[var4].field_b == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 20: {
                        var3 = 1;
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var3 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        var4 = param1.field_h;
                        param1.a(var16.field_n, (byte) -59);
                        var5 = 0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var5 >= var16.field_f) {
                            statePc = 60;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (0 == var16.field_m[var5]) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        param1.i(var16.field_m[var5], 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            var6_int = var16.field_i[var5];
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
                            if (var6_int != 1) {
                                statePc = 30;
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
                            var15 = (java.lang.reflect.Field) var16.field_j[var5].field_f;
                            var17 = var15;
                            var17.setInt((Object) null, var16.field_h[var5]);
                            param1.i(0, 0);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 47 : (stateCaught_29 instanceof InvalidClassException ? 48 : (stateCaught_29 instanceof StreamCorruptedException ? 49 : (stateCaught_29 instanceof OptionalDataException ? 50 : (stateCaught_29 instanceof IllegalAccessException ? 51 : (stateCaught_29 instanceof IllegalArgumentException ? 52 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_29 instanceof SecurityException ? 54 : (stateCaught_29 instanceof IOException ? 55 : (stateCaught_29 instanceof NullPointerException ? 56 : (stateCaught_29 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var6_int != 2) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 47 : (stateCaught_30 instanceof InvalidClassException ? 48 : (stateCaught_30 instanceof StreamCorruptedException ? 49 : (stateCaught_30 instanceof OptionalDataException ? 50 : (stateCaught_30 instanceof IllegalAccessException ? 51 : (stateCaught_30 instanceof IllegalArgumentException ? 52 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_30 instanceof SecurityException ? 54 : (stateCaught_30 instanceof IOException ? 55 : (stateCaught_30 instanceof NullPointerException ? 56 : (stateCaught_30 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var26 = (java.lang.reflect.Field) var16.field_j[var5].field_f;
                            var8 = var26.getModifiers();
                            param1.i(0, 0);
                            param1.a(var8, (byte) 126);
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
                            var27 = (java.lang.reflect.Field) var16.field_j[var5].field_f;
                            var8 = var27.getInt((Object) null);
                            param1.i(0, 0);
                            param1.a(var8, (byte) 102);
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
                            if (-4 == var6_int) {
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
                            if (-5 != var6_int) {
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
                            var28 = (java.lang.reflect.Method) var16.field_k[var5].field_f;
                            var8 = var28.getModifiers();
                            param1.i(0, 0);
                            param1.a(var8, (byte) 93);
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
                            var29 = (java.lang.reflect.Method) var16.field_k[var5].field_f;
                            var25 = var16.field_g[var5];
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
                            var10 = var29.invoke((Object) null, var9);
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
                            if (var10 instanceof Number) {
                                statePc = 44;
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
                            if (var10 instanceof String) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 47 : (stateCaught_41 instanceof InvalidClassException ? 48 : (stateCaught_41 instanceof StreamCorruptedException ? 49 : (stateCaught_41 instanceof OptionalDataException ? 50 : (stateCaught_41 instanceof IllegalAccessException ? 51 : (stateCaught_41 instanceof IllegalArgumentException ? 52 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_41 instanceof SecurityException ? 54 : (stateCaught_41 instanceof IOException ? 55 : (stateCaught_41 instanceof NullPointerException ? 56 : (stateCaught_41 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param1.i(4, 0);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 47 : (stateCaught_42 instanceof InvalidClassException ? 48 : (stateCaught_42 instanceof StreamCorruptedException ? 49 : (stateCaught_42 instanceof OptionalDataException ? 50 : (stateCaught_42 instanceof IllegalAccessException ? 51 : (stateCaught_42 instanceof IllegalArgumentException ? 52 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_42 instanceof SecurityException ? 54 : (stateCaught_42 instanceof IOException ? 55 : (stateCaught_42 instanceof NullPointerException ? 56 : (stateCaught_42 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param1.i(2, 0);
                            param1.a((String) var10, false);
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
                            param1.i(1, 0);
                            param1.a(1736565456, ((Number) var10).longValue());
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
                            param1.i(0, 0);
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
                        param1.i(-10, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.i(-11, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.i(-12, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.i(-13, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.i(-14, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.i(-15, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.i(-16, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.i(-17, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.i(-18, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.i(-19, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.i(-20, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref11 = caughtException;
                        param1.i(-21, 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        var5++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$1 = param1.g(var4, 64);
                        var16.p(75);
                        if (param0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        return;
                    }
                    case 62: {
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

    public static void a(int param0) {
        if (param0 != 8) {
            field_e = null;
        }
        field_e = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 > -81) {
            hk.a(-35);
        }
        return (param0 & 50560) != 0 ? true : false;
    }

    hk(eo param0) {
        int var2 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        L0: {
          ((hk) this).field_c = null;
          ((hk) this).field_f = null;
          ((hk) this).field_a = null;
          ((hk) this).field_d = null;
          ((hk) this).field_b = param0;
          ((hk) this).field_g = ((hk) this).field_b.field_x;
          if (!((hk) this).field_g) {
            break L0;
          } else {
            if (((hk) this).field_b.a(una.field_g, -1, wo.field_i)) {
              break L0;
            } else {
              ((hk) this).field_g = false;
              break L0;
            }
          }
        }
        L1: {
          if (((hk) this).field_g) {
            break L1;
          } else {
            if (((hk) this).field_b.a(false, una.field_g, wo.field_i)) {
              break L1;
            } else {
            }
          }
        }
        L2: {
          tra.g(12890);
          if (!((hk) this).field_g) {
            ((hk) this).field_d = new gf[16];
            var2 = 0;
            L3: while (true) {
              if (-17 >= (var2 ^ -1)) {
                ((hk) this).field_a = new gf[16];
                var2 = 0;
                L4: while (true) {
                  if (16 <= var2) {
                    break L2;
                  } else {
                    var18 = ua.a(lt.field_f, 32768, var2 * 32768, false);
                    ((hk) this).field_a[var2] = ((hk) this).field_b.a(128, var18, true, wo.field_i, -77, 128);
                    var2++;
                    continue L4;
                  }
                }
              } else {
                var17 = ua.a(ak.field_o, 32768, 32768 * var2, false);
                ((hk) this).field_d[var2] = ((hk) this).field_b.a(128, var17, true, wo.field_i, -117, 128);
                var2++;
                continue L3;
              }
            }
          } else {
            var15 = ir.a(ak.field_o, 13588, false);
            ((hk) this).field_c = ((hk) this).field_b.a(var15, wo.field_i, (byte) -97, 128, 128, 16);
            var16 = ir.a(lt.field_f, 13588, false);
            lv discarded$1 = ((hk) this).field_b.a(var16, wo.field_i, (byte) -84, 128, 128, 16);
            break L2;
          }
        }
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          if (param4 == -2646) {
            break L0;
          } else {
            var16 = null;
            hk.a(-57, (long[]) null, -21, (int[]) null, -66);
            break L0;
          }
        }
        L1: {
          if (param2 >= param0) {
            break L1;
          } else {
            L2: {
              var5 = (param2 - -param0) / 2;
              var6 = param2;
              var7 = param1[var5];
              param1[var5] = param1[param0];
              param1[param0] = var7;
              var9 = param3[var5];
              param3[var5] = param3[param0];
              param3[param0] = var9;
              if (9223372036854775807L == var7) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var10 = stackIn_6_0;
            var11 = param2;
            L3: while (true) {
              if (var11 >= param0) {
                param1[param0] = param1[var6];
                param1[var6] = var7;
                param3[param0] = param3[var6];
                param3[var6] = var9;
                hk.a(-1 + var6, param1, param2, param3, -2646);
                hk.a(param0, param1, 1 + var6, param3, -2646);
                break L1;
              } else {
                if (((long)(var11 & var10) + var7 ^ -1L) < (param1[var11] ^ -1L)) {
                  var12 = param1[var11];
                  param1[var11] = param1[var6];
                  param1[var6] = var12;
                  var14 = param3[var11];
                  param3[var11] = param3[var6];
                  var6++;
                  param3[var6] = var14;
                  var11++;
                  continue L3;
                } else {
                  var11++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
    }
}
