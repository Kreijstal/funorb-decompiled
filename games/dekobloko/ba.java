/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ba implements nb {
    static um field_f;
    static String field_e;
    private long field_a;
    static wl field_b;
    static int field_d;
    static boolean field_c;

    public final void c(byte param0) {
        if (param0 != -51) {
            this.field_a = -32L;
        }
        this.field_a = ik.a(param0 + 55);
    }

    final static boolean a(ji param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -2147483648) {
                break L1;
              } else {
                field_f = (um) null;
                break L1;
              }
            }
            stackIn_3_0 = param0.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ba.AA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract String e(byte param0);

    public static void d(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 < 70) {
            return;
        }
        field_b = null;
    }

    public final String b(byte param0) {
        if (!this.a((byte) -101)) {
          if (param0 >= 52) {
            if ((ik.a(4) ^ -1L) > (350L + this.field_a ^ -1L)) {
              return null;
            } else {
              return this.e((byte) 49);
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    abstract tb b(int param0);

    final static void a(int param0, uf param1) {
        try {
            int stackIn_29_0 = 0;
            int stackIn_73_0 = 0;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            String stackIn_78_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
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
            java.lang.reflect.Field var7 = null;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            kl var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            kl var17 = null;
            Object var18 = null;
            Object var20 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var20 = null;
                        var21 = null;
                        var12 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var13 = (kl) ((Object) aa.field_f.c((byte) -54));
                            var17 = var13;
                            if (var17 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            var3 = 0;
                            if (param0 == -32141) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return;
                    }
                    case 6: {
                        try {
                            var4 = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var17.field_o <= var4) {
                                statePc = 23;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var12 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var13.field_y[var4] == null) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-3 != (var13.field_y[var4].field_c ^ -1)) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var13.field_A[var4] = -5;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var13.field_y[var4].field_c == 0) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3 = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var13.field_t[var4] != null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((var13.field_t[var4].field_c ^ -1) == -3) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var13.field_A[var4] = -6;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-1 != (var13.field_t[var4].field_c ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3 = 1;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var3 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return;
                    }
                    case 26: {
                        try {
                            var4 = param1.field_n;
                            param1.a(var17.field_C, false);
                            var5 = 0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var5 >= var17.field_o) {
                                statePc = 72;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackIn_73_0 = 0;
                            stackIn_29_0 = stackIn_73_0;
                            if (var12 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (stackIn_29_0 == var13.field_A[var5]) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            param1.a(true, var13.field_A[var5]);
                            if (var12 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var6_int = var13.field_u[var5];
                            if (var6_int == 0) {
                                statePc = 37;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_32 instanceof InvalidClassException ? 60 : ((Object) stateCaught_32 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_32 instanceof OptionalDataException ? 62 : ((Object) stateCaught_32 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_32 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_32 instanceof SecurityException ? 66 : ((Object) stateCaught_32 instanceof IOException ? 67 : ((Object) stateCaught_32 instanceof NullPointerException ? 68 : ((Object) stateCaught_32 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_33 instanceof InvalidClassException ? 60 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_33 instanceof OptionalDataException ? 62 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_33 instanceof SecurityException ? 66 : ((Object) stateCaught_33 instanceof IOException ? 67 : ((Object) stateCaught_33 instanceof NullPointerException ? 68 : ((Object) stateCaught_33 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-3 != (var6_int ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_34 instanceof InvalidClassException ? 60 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_34 instanceof OptionalDataException ? 62 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_34 instanceof SecurityException ? 66 : ((Object) stateCaught_34 instanceof IOException ? 67 : ((Object) stateCaught_34 instanceof NullPointerException ? 68 : ((Object) stateCaught_34 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var25 = (java.lang.reflect.Field) (var13.field_y[var5].field_b);
                            var8 = var25.getModifiers();
                            param1.a(true, 0);
                            param1.a(var8, false);
                            if (var12 == 0) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_35 instanceof InvalidClassException ? 60 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_35 instanceof OptionalDataException ? 62 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_35 instanceof SecurityException ? 66 : ((Object) stateCaught_35 instanceof IOException ? 67 : ((Object) stateCaught_35 instanceof NullPointerException ? 68 : ((Object) stateCaught_35 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var14 = (java.lang.reflect.Field) (var13.field_y[var5].field_b);
                            var7 = var14;
                            var14.setInt((Object) null, var13.field_q[var5]);
                            param1.a(true, 0);
                            if (var12 == 0) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_36 instanceof InvalidClassException ? 60 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_36 instanceof OptionalDataException ? 62 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_36 instanceof SecurityException ? 66 : ((Object) stateCaught_36 instanceof IOException ? 67 : ((Object) stateCaught_36 instanceof NullPointerException ? 68 : ((Object) stateCaught_36 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var15 = (java.lang.reflect.Field) (var13.field_y[var5].field_b);
                            var8 = var15.getInt((Object) null);
                            param1.a(true, 0);
                            param1.a(var8, false);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_37 instanceof InvalidClassException ? 60 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_37 instanceof OptionalDataException ? 62 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_37 instanceof SecurityException ? 66 : ((Object) stateCaught_37 instanceof IOException ? 67 : ((Object) stateCaught_37 instanceof NullPointerException ? 68 : ((Object) stateCaught_37 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (3 != var6_int) {
                                statePc = 55;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_38 instanceof InvalidClassException ? 60 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_38 instanceof OptionalDataException ? 62 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_38 instanceof SecurityException ? 66 : ((Object) stateCaught_38 instanceof IOException ? 67 : ((Object) stateCaught_38 instanceof NullPointerException ? 68 : ((Object) stateCaught_38 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var26 = (java.lang.reflect.Method) (var13.field_t[var5].field_b);
                            var24 = var13.field_s[var5];
                            var9 = new Object[var24.length];
                            var10_int = 0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_39 instanceof InvalidClassException ? 60 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_39 instanceof OptionalDataException ? 62 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_39 instanceof SecurityException ? 66 : ((Object) stateCaught_39 instanceof IOException ? 67 : ((Object) stateCaught_39 instanceof NullPointerException ? 68 : ((Object) stateCaught_39 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var10_int >= var24.length) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_40 instanceof InvalidClassException ? 60 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_40 instanceof OptionalDataException ? 62 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_40 instanceof SecurityException ? 66 : ((Object) stateCaught_40 instanceof IOException ? 67 : ((Object) stateCaught_40 instanceof NullPointerException ? 68 : ((Object) stateCaught_40 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 71;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_41 instanceof InvalidClassException ? 60 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_41 instanceof OptionalDataException ? 62 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_41 instanceof SecurityException ? 66 : ((Object) stateCaught_41 instanceof IOException ? 67 : ((Object) stateCaught_41 instanceof NullPointerException ? 68 : ((Object) stateCaught_41 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var12 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_42 instanceof InvalidClassException ? 60 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_42 instanceof OptionalDataException ? 62 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_42 instanceof SecurityException ? 66 : ((Object) stateCaught_42 instanceof IOException ? 67 : ((Object) stateCaught_42 instanceof NullPointerException ? 68 : ((Object) stateCaught_42 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_43 instanceof InvalidClassException ? 60 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_43 instanceof OptionalDataException ? 62 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_43 instanceof SecurityException ? 66 : ((Object) stateCaught_43 instanceof IOException ? 67 : ((Object) stateCaught_43 instanceof NullPointerException ? 68 : ((Object) stateCaught_43 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10 = var26.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 53;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_44 instanceof InvalidClassException ? 60 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_44 instanceof OptionalDataException ? 62 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_44 instanceof SecurityException ? 66 : ((Object) stateCaught_44 instanceof IOException ? 67 : ((Object) stateCaught_44 instanceof NullPointerException ? 68 : ((Object) stateCaught_44 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 51;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_45 instanceof InvalidClassException ? 60 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_45 instanceof OptionalDataException ? 62 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_45 instanceof SecurityException ? 66 : ((Object) stateCaught_45 instanceof IOException ? 67 : ((Object) stateCaught_45 instanceof NullPointerException ? 68 : ((Object) stateCaught_45 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 49;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_46 instanceof InvalidClassException ? 60 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_46 instanceof OptionalDataException ? 62 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_46 instanceof SecurityException ? 66 : ((Object) stateCaught_46 instanceof IOException ? 67 : ((Object) stateCaught_46 instanceof NullPointerException ? 68 : ((Object) stateCaught_46 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param1.a(true, 2);
                            param1.a(0, (String) (var10));
                            if (var12 == 0) {
                                statePc = 54;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_47 instanceof InvalidClassException ? 60 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_47 instanceof OptionalDataException ? 62 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_47 instanceof SecurityException ? 66 : ((Object) stateCaught_47 instanceof IOException ? 67 : ((Object) stateCaught_47 instanceof NullPointerException ? 68 : ((Object) stateCaught_47 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_48 instanceof InvalidClassException ? 60 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_48 instanceof OptionalDataException ? 62 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_48 instanceof SecurityException ? 66 : ((Object) stateCaught_48 instanceof IOException ? 67 : ((Object) stateCaught_48 instanceof NullPointerException ? 68 : ((Object) stateCaught_48 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            param1.a(true, 4);
                            if (var12 == 0) {
                                statePc = 54;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_49 instanceof InvalidClassException ? 60 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_49 instanceof OptionalDataException ? 62 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_49 instanceof SecurityException ? 66 : ((Object) stateCaught_49 instanceof IOException ? 67 : ((Object) stateCaught_49 instanceof NullPointerException ? 68 : ((Object) stateCaught_49 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_50 instanceof InvalidClassException ? 60 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_50 instanceof OptionalDataException ? 62 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_50 instanceof SecurityException ? 66 : ((Object) stateCaught_50 instanceof IOException ? 67 : ((Object) stateCaught_50 instanceof NullPointerException ? 68 : ((Object) stateCaught_50 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            param1.a(true, 1);
                            param1.a(((Number) (var10)).longValue(), (byte) 0);
                            if (var12 == 0) {
                                statePc = 54;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_51 instanceof InvalidClassException ? 60 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_51 instanceof OptionalDataException ? 62 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_51 instanceof SecurityException ? 66 : ((Object) stateCaught_51 instanceof IOException ? 67 : ((Object) stateCaught_51 instanceof NullPointerException ? 68 : ((Object) stateCaught_51 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_52 instanceof InvalidClassException ? 60 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_52 instanceof OptionalDataException ? 62 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_52 instanceof SecurityException ? 66 : ((Object) stateCaught_52 instanceof IOException ? 67 : ((Object) stateCaught_52 instanceof NullPointerException ? 68 : ((Object) stateCaught_52 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            param1.a(true, 0);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_53 instanceof InvalidClassException ? 60 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_53 instanceof OptionalDataException ? 62 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_53 instanceof SecurityException ? 66 : ((Object) stateCaught_53 instanceof IOException ? 67 : ((Object) stateCaught_53 instanceof NullPointerException ? 68 : ((Object) stateCaught_53 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var12 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_54 instanceof InvalidClassException ? 60 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_54 instanceof OptionalDataException ? 62 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_54 instanceof SecurityException ? 66 : ((Object) stateCaught_54 instanceof IOException ? 67 : ((Object) stateCaught_54 instanceof NullPointerException ? 68 : ((Object) stateCaught_54 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (4 == var6_int) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = ((Object) stateCaught_55 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_55 instanceof InvalidClassException ? 60 : ((Object) stateCaught_55 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_55 instanceof OptionalDataException ? 62 : ((Object) stateCaught_55 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_55 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_55 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_55 instanceof SecurityException ? 66 : ((Object) stateCaught_55 instanceof IOException ? 67 : ((Object) stateCaught_55 instanceof NullPointerException ? 68 : ((Object) stateCaught_55 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = ((Object) stateCaught_56 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_56 instanceof InvalidClassException ? 60 : ((Object) stateCaught_56 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_56 instanceof OptionalDataException ? 62 : ((Object) stateCaught_56 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_56 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_56 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_56 instanceof SecurityException ? 66 : ((Object) stateCaught_56 instanceof IOException ? 67 : ((Object) stateCaught_56 instanceof NullPointerException ? 68 : ((Object) stateCaught_56 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var27 = (java.lang.reflect.Method) (var13.field_t[var5].field_b);
                            var8 = var27.getModifiers();
                            param1.a(true, 0);
                            param1.a(var8, false);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof ClassNotFoundException ? 59 : ((Object) stateCaught_57 instanceof InvalidClassException ? 60 : ((Object) stateCaught_57 instanceof StreamCorruptedException ? 61 : ((Object) stateCaught_57 instanceof OptionalDataException ? 62 : ((Object) stateCaught_57 instanceof IllegalAccessException ? 63 : ((Object) stateCaught_57 instanceof IllegalArgumentException ? 64 : ((Object) stateCaught_57 instanceof java.lang.reflect.InvocationTargetException ? 65 : ((Object) stateCaught_57 instanceof SecurityException ? 66 : ((Object) stateCaught_57 instanceof IOException ? 67 : ((Object) stateCaught_57 instanceof NullPointerException ? 68 : ((Object) stateCaught_57 instanceof Exception ? 69 : 70)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param1.a(true, -10);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param1.a(true, -11);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param1.a(true, -12);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param1.a(true, -13);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param1.a(true, -14);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param1.a(true, -15);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param1.a(true, -16);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param1.a(true, -17);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param1.a(true, -18);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param1.a(true, -19);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param1.a(true, -20);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var6_ref11 = caughtException;
                            param1.a(true, -21);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 27;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            stackIn_73_0 = param1.a((byte) -15, var4);
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var17.b((byte) 103);
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        return;
                    }
                    case 75: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_77_0 = (RuntimeException) (var2);
                        stackIn_76_0 = stackIn_77_0;
                        stackIn_77_1 = new StringBuilder().append("ba.V(").append(param0).append(',');
                        stackIn_76_1 = stackIn_77_1;
                        if (param1 == null) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        stackIn_78_0 = (RuntimeException) ((Object) stackIn_76_0);
                        stackIn_78_1 = (StringBuilder) ((Object) stackIn_76_1);
                        stackIn_78_2 = "{...}";
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 77: {
                        stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                        stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                        stackIn_78_2 = "null";
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        throw dh.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
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

    public final tb a(int param0) {
        if (!(!this.a((byte) 119))) {
            return ki.field_t;
        }
        if (param0 != 20350) {
            ba.a(-21, -85, -33);
        }
        if (!(ik.a(4) >= this.field_a + 350L)) {
            return le.field_o;
        }
        return this.b(param0 + -25870);
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == db.field_b) {
              break L1;
            } else {
              if (db.field_b.length >= param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          db.field_b = new int[2 * param1];
          break L0;
        }
        L2: {
          L3: {
            if (ad.field_i == null) {
              break L3;
            } else {
              if (ad.field_i.length < param1) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          ad.field_i = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (oa.field_e == null) {
              break L5;
            } else {
              if (oa.field_e.length < param1) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          oa.field_e = new int[2 * param1];
          break L4;
        }
        L6: {
          L7: {
            if (ln.field_a == null) {
              break L7;
            } else {
              if (param1 > ln.field_a.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          ln.field_a = new int[2 * param1];
          break L6;
        }
        L8: {
          L9: {
            if (null == mk.field_b) {
              break L9;
            } else {
              if (param1 > mk.field_b.length) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          mk.field_b = new int[2 * param1];
          break L8;
        }
        L10: {
          L11: {
            if (null == cc.field_h) {
              break L11;
            } else {
              if (cc.field_h.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          cc.field_h = new int[param1 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (null == ch.field_a) {
              break L13;
            } else {
              if (ch.field_a.length < param1 - -param2) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          ch.field_a = new int[(param2 + param1) * 2];
          break L12;
        }
        L14: {
          L15: {
            if (null == oe.field_L) {
              break L15;
            } else {
              if (oe.field_L.length < param1) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          oe.field_L = new boolean[2 * param1];
          break L14;
        }
        ge.field_b = 2147483647;
        bg.field_d = -2147483648;
        og.field_eb = 0;
        mf.field_Q = param0;
        rf.field_g = -2147483648;
    }

    static {
        field_e = "Players";
        field_f = new um();
    }
}
