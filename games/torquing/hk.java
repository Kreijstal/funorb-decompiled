/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class hk extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_e;
    public static boolean field_a;
    public static int field_b;
    public static int field_g;
    public static boolean field_f;
    public static boolean field_c;
    public static boolean field_h;
    public static int field_d;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == un.field_b) {
              L1: {
                if (wj.field_g == null) {
                  break L1;
                } else {
                  if (wj.field_g == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = wj.field_g.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "hk.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(df param0, int param1) {
        try {
            int stackIn_34_0 = 0;
            int stackIn_95_0 = 0;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            String stackIn_101_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            pm var2 = null;
            RuntimeException var2_ref = null;
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
            java.lang.reflect.Method var7_ref = null;
            int var8 = 0;
            byte[][] var8_ref_byte____ = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var12 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = (pm) ((Object) ul.field_e.b(param1 ^ -2933));
                            if (var2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var3 = 0;
                            var4 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((var4 ^ -1) <= (var2.field_l ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var12 != 0) {
                                statePc = 31;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (null != var2.field_u[var4]) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var2.field_u[var4].field_a == 2) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var2.field_t[var4] = -5;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (0 == var2.field_u[var4].field_a) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3 = 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (null == var2.field_n[var4]) {
                                statePc = 27;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-3 != (var2.field_n[var4].field_a ^ -1)) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2.field_t[var4] = -6;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-1 != (var2.field_n[var4].field_a ^ -1)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3 = 1;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var3 == 0) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return;
                    }
                    case 30: {
                        try {
                            var4 = param0.field_n;
                            param0.b((byte) 60, var2.field_j);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var5 = 0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var5 >= var2.field_l) {
                                statePc = 94;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            stackIn_95_0 = -1;
                            stackIn_34_0 = stackIn_95_0;
                            if (var12 != 0) {
                                statePc = 95;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (stackIn_34_0 == (var2.field_t[var5] ^ -1)) {
                                statePc = 40;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            param0.b(90, var2.field_t[var5]);
                            if (var12 == 0) {
                                statePc = 93;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6_int = var2.field_q[var5];
                            if ((var6_int ^ -1) != -1) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_40 instanceof InvalidClassException ? 82 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_40 instanceof OptionalDataException ? 84 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_40 instanceof SecurityException ? 88 : ((Object) stateCaught_40 instanceof IOException ? 89 : ((Object) stateCaught_40 instanceof NullPointerException ? 90 : ((Object) stateCaught_40 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var7 = (java.lang.reflect.Field) (var2.field_u[var5].field_d);
                            var8 = var7.getInt((Object) null);
                            param0.b(90, 0);
                            param0.b((byte) 60, var8);
                            if (var12 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_41 instanceof InvalidClassException ? 82 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_41 instanceof OptionalDataException ? 84 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_41 instanceof SecurityException ? 88 : ((Object) stateCaught_41 instanceof IOException ? 89 : ((Object) stateCaught_41 instanceof NullPointerException ? 90 : ((Object) stateCaught_41 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (1 != var6_int) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_42 instanceof InvalidClassException ? 82 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_42 instanceof OptionalDataException ? 84 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_42 instanceof SecurityException ? 88 : ((Object) stateCaught_42 instanceof IOException ? 89 : ((Object) stateCaught_42 instanceof NullPointerException ? 90 : ((Object) stateCaught_42 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_43 instanceof InvalidClassException ? 82 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_43 instanceof OptionalDataException ? 84 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_43 instanceof SecurityException ? 88 : ((Object) stateCaught_43 instanceof IOException ? 89 : ((Object) stateCaught_43 instanceof NullPointerException ? 90 : ((Object) stateCaught_43 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var7 = (java.lang.reflect.Field) (var2.field_u[var5].field_d);
                            var7.setInt((Object) null, var2.field_k[var5]);
                            param0.b(90, 0);
                            if (var12 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_45 instanceof InvalidClassException ? 82 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_45 instanceof OptionalDataException ? 84 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_45 instanceof SecurityException ? 88 : ((Object) stateCaught_45 instanceof IOException ? 89 : ((Object) stateCaught_45 instanceof NullPointerException ? 90 : ((Object) stateCaught_45 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((var6_int ^ -1) != -3) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_46 instanceof InvalidClassException ? 82 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_46 instanceof OptionalDataException ? 84 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_46 instanceof SecurityException ? 88 : ((Object) stateCaught_46 instanceof IOException ? 89 : ((Object) stateCaught_46 instanceof NullPointerException ? 90 : ((Object) stateCaught_46 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_47 instanceof InvalidClassException ? 82 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_47 instanceof OptionalDataException ? 84 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_47 instanceof SecurityException ? 88 : ((Object) stateCaught_47 instanceof IOException ? 89 : ((Object) stateCaught_47 instanceof NullPointerException ? 90 : ((Object) stateCaught_47 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var7 = (java.lang.reflect.Field) (var2.field_u[var5].field_d);
                            var8 = var7.getModifiers();
                            param0.b(90, 0);
                            param0.b((byte) 60, var8);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_49 instanceof InvalidClassException ? 82 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_49 instanceof OptionalDataException ? 84 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_49 instanceof SecurityException ? 88 : ((Object) stateCaught_49 instanceof IOException ? 89 : ((Object) stateCaught_49 instanceof NullPointerException ? 90 : ((Object) stateCaught_49 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (-4 != (var6_int ^ -1)) {
                                statePc = 76;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_50 instanceof InvalidClassException ? 82 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_50 instanceof OptionalDataException ? 84 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_50 instanceof SecurityException ? 88 : ((Object) stateCaught_50 instanceof IOException ? 89 : ((Object) stateCaught_50 instanceof NullPointerException ? 90 : ((Object) stateCaught_50 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var7_ref = (java.lang.reflect.Method) (var2.field_n[var5].field_d);
                            var8_ref_byte____ = var2.field_o[var5];
                            var9 = new Object[var8_ref_byte____.length];
                            var10_int = 0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_51 instanceof InvalidClassException ? 82 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_51 instanceof OptionalDataException ? 84 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_51 instanceof SecurityException ? 88 : ((Object) stateCaught_51 instanceof IOException ? 89 : ((Object) stateCaught_51 instanceof NullPointerException ? 90 : ((Object) stateCaught_51 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var8_ref_byte____.length ^ -1) >= (var10_int ^ -1)) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_52 instanceof InvalidClassException ? 82 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_52 instanceof OptionalDataException ? 84 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_52 instanceof SecurityException ? 88 : ((Object) stateCaught_52 instanceof IOException ? 89 : ((Object) stateCaught_52 instanceof NullPointerException ? 90 : ((Object) stateCaught_52 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var8_ref_byte____[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 80;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_53 instanceof InvalidClassException ? 82 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_53 instanceof OptionalDataException ? 84 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_53 instanceof SecurityException ? 88 : ((Object) stateCaught_53 instanceof IOException ? 89 : ((Object) stateCaught_53 instanceof NullPointerException ? 90 : ((Object) stateCaught_53 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var12 == 0) {
                                statePc = 52;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_54 instanceof InvalidClassException ? 82 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_54 instanceof OptionalDataException ? 84 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_54 instanceof SecurityException ? 88 : ((Object) stateCaught_54 instanceof IOException ? 89 : ((Object) stateCaught_54 instanceof NullPointerException ? 90 : ((Object) stateCaught_54 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = ((Object) stateCaught_55 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_55 instanceof InvalidClassException ? 82 : ((Object) stateCaught_55 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_55 instanceof OptionalDataException ? 84 : ((Object) stateCaught_55 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_55 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_55 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_55 instanceof SecurityException ? 88 : ((Object) stateCaught_55 instanceof IOException ? 89 : ((Object) stateCaught_55 instanceof NullPointerException ? 90 : ((Object) stateCaught_55 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var10 = var7_ref.invoke((Object) null, var9);
                            if (null == var10) {
                                statePc = 73;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_57 instanceof InvalidClassException ? 82 : ((Object) stateCaught_57 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_57 instanceof OptionalDataException ? 84 : ((Object) stateCaught_57 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_57 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_57 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_57 instanceof SecurityException ? 88 : ((Object) stateCaught_57 instanceof IOException ? 89 : ((Object) stateCaught_57 instanceof NullPointerException ? 90 : ((Object) stateCaught_57 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 70;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = ((Object) stateCaught_58 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_58 instanceof InvalidClassException ? 82 : ((Object) stateCaught_58 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_58 instanceof OptionalDataException ? 84 : ((Object) stateCaught_58 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_58 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_58 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_58 instanceof SecurityException ? 88 : ((Object) stateCaught_58 instanceof IOException ? 89 : ((Object) stateCaught_58 instanceof NullPointerException ? 90 : ((Object) stateCaught_58 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = ((Object) stateCaught_59 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_59 instanceof InvalidClassException ? 82 : ((Object) stateCaught_59 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_59 instanceof OptionalDataException ? 84 : ((Object) stateCaught_59 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_59 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_59 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_59 instanceof SecurityException ? 88 : ((Object) stateCaught_59 instanceof IOException ? 89 : ((Object) stateCaught_59 instanceof NullPointerException ? 90 : ((Object) stateCaught_59 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 67;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = ((Object) stateCaught_61 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_61 instanceof InvalidClassException ? 82 : ((Object) stateCaught_61 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_61 instanceof OptionalDataException ? 84 : ((Object) stateCaught_61 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_61 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_61 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_61 instanceof SecurityException ? 88 : ((Object) stateCaught_61 instanceof IOException ? 89 : ((Object) stateCaught_61 instanceof NullPointerException ? 90 : ((Object) stateCaught_61 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = ((Object) stateCaught_62 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_62 instanceof InvalidClassException ? 82 : ((Object) stateCaught_62 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_62 instanceof OptionalDataException ? 84 : ((Object) stateCaught_62 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_62 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_62 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_62 instanceof SecurityException ? 88 : ((Object) stateCaught_62 instanceof IOException ? 89 : ((Object) stateCaught_62 instanceof NullPointerException ? 90 : ((Object) stateCaught_62 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            param0.b(90, 2);
                            param0.b((byte) 4, (String) (var10));
                            if (var12 == 0) {
                                statePc = 75;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = ((Object) stateCaught_64 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_64 instanceof InvalidClassException ? 82 : ((Object) stateCaught_64 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_64 instanceof OptionalDataException ? 84 : ((Object) stateCaught_64 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_64 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_64 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_64 instanceof SecurityException ? 88 : ((Object) stateCaught_64 instanceof IOException ? 89 : ((Object) stateCaught_64 instanceof NullPointerException ? 90 : ((Object) stateCaught_64 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = ((Object) stateCaught_65 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_65 instanceof InvalidClassException ? 82 : ((Object) stateCaught_65 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_65 instanceof OptionalDataException ? 84 : ((Object) stateCaught_65 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_65 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_65 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_65 instanceof SecurityException ? 88 : ((Object) stateCaught_65 instanceof IOException ? 89 : ((Object) stateCaught_65 instanceof NullPointerException ? 90 : ((Object) stateCaught_65 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            param0.b(90, 4);
                            if (var12 == 0) {
                                statePc = 75;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = ((Object) stateCaught_67 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_67 instanceof InvalidClassException ? 82 : ((Object) stateCaught_67 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_67 instanceof OptionalDataException ? 84 : ((Object) stateCaught_67 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_67 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_67 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_67 instanceof SecurityException ? 88 : ((Object) stateCaught_67 instanceof IOException ? 89 : ((Object) stateCaught_67 instanceof NullPointerException ? 90 : ((Object) stateCaught_67 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = ((Object) stateCaught_68 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_68 instanceof InvalidClassException ? 82 : ((Object) stateCaught_68 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_68 instanceof OptionalDataException ? 84 : ((Object) stateCaught_68 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_68 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_68 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_68 instanceof SecurityException ? 88 : ((Object) stateCaught_68 instanceof IOException ? 89 : ((Object) stateCaught_68 instanceof NullPointerException ? 90 : ((Object) stateCaught_68 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            param0.b(90, 1);
                            param0.a(102, ((Number) (var10)).longValue());
                            if (var12 == 0) {
                                statePc = 75;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = ((Object) stateCaught_70 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_70 instanceof InvalidClassException ? 82 : ((Object) stateCaught_70 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_70 instanceof OptionalDataException ? 84 : ((Object) stateCaught_70 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_70 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_70 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_70 instanceof SecurityException ? 88 : ((Object) stateCaught_70 instanceof IOException ? 89 : ((Object) stateCaught_70 instanceof NullPointerException ? 90 : ((Object) stateCaught_70 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = ((Object) stateCaught_71 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_71 instanceof InvalidClassException ? 82 : ((Object) stateCaught_71 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_71 instanceof OptionalDataException ? 84 : ((Object) stateCaught_71 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_71 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_71 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_71 instanceof SecurityException ? 88 : ((Object) stateCaught_71 instanceof IOException ? 89 : ((Object) stateCaught_71 instanceof NullPointerException ? 90 : ((Object) stateCaught_71 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            param0.b(90, 0);
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = ((Object) stateCaught_73 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_73 instanceof InvalidClassException ? 82 : ((Object) stateCaught_73 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_73 instanceof OptionalDataException ? 84 : ((Object) stateCaught_73 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_73 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_73 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_73 instanceof SecurityException ? 88 : ((Object) stateCaught_73 instanceof IOException ? 89 : ((Object) stateCaught_73 instanceof NullPointerException ? 90 : ((Object) stateCaught_73 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var12 == 0) {
                                statePc = 80;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = ((Object) stateCaught_75 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_75 instanceof InvalidClassException ? 82 : ((Object) stateCaught_75 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_75 instanceof OptionalDataException ? 84 : ((Object) stateCaught_75 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_75 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_75 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_75 instanceof SecurityException ? 88 : ((Object) stateCaught_75 instanceof IOException ? 89 : ((Object) stateCaught_75 instanceof NullPointerException ? 90 : ((Object) stateCaught_75 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var6_int != 4) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = ((Object) stateCaught_76 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_76 instanceof InvalidClassException ? 82 : ((Object) stateCaught_76 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_76 instanceof OptionalDataException ? 84 : ((Object) stateCaught_76 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_76 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_76 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_76 instanceof SecurityException ? 88 : ((Object) stateCaught_76 instanceof IOException ? 89 : ((Object) stateCaught_76 instanceof NullPointerException ? 90 : ((Object) stateCaught_76 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = ((Object) stateCaught_77 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_77 instanceof InvalidClassException ? 82 : ((Object) stateCaught_77 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_77 instanceof OptionalDataException ? 84 : ((Object) stateCaught_77 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_77 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_77 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_77 instanceof SecurityException ? 88 : ((Object) stateCaught_77 instanceof IOException ? 89 : ((Object) stateCaught_77 instanceof NullPointerException ? 90 : ((Object) stateCaught_77 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var7_ref = (java.lang.reflect.Method) (var2.field_n[var5].field_d);
                            var8 = var7_ref.getModifiers();
                            param0.b(90, 0);
                            param0.b((byte) 60, var8);
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = ((Object) stateCaught_79 instanceof ClassNotFoundException ? 81 : ((Object) stateCaught_79 instanceof InvalidClassException ? 82 : ((Object) stateCaught_79 instanceof StreamCorruptedException ? 83 : ((Object) stateCaught_79 instanceof OptionalDataException ? 84 : ((Object) stateCaught_79 instanceof IllegalAccessException ? 85 : ((Object) stateCaught_79 instanceof IllegalArgumentException ? 86 : ((Object) stateCaught_79 instanceof java.lang.reflect.InvocationTargetException ? 87 : ((Object) stateCaught_79 instanceof SecurityException ? 88 : ((Object) stateCaught_79 instanceof IOException ? 89 : ((Object) stateCaught_79 instanceof NullPointerException ? 90 : ((Object) stateCaught_79 instanceof Exception ? 91 : 92)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param0.b(90, -10);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param0.b(90, -11);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param0.b(90, -12);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param0.b(90, -13);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param0.b(90, -14);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param0.b(90, -15);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param0.b(90, -16);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param0.b(90, -17);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param0.b(90, -18);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param0.b(90, -19);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param0.b(90, -20);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var6_ref11 = caughtException;
                            param0.b(90, -21);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 32;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            stackIn_95_0 = param0.a(var4, true);
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var2.f(param1 ^ param1);
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 97;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        return;
                    }
                    case 97: {
                        var2_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_100_0 = (RuntimeException) (var2_ref);
                        stackIn_98_0 = stackIn_100_0;
                        stackIn_100_1 = new StringBuilder().append("hk.BA(");
                        stackIn_98_1 = stackIn_100_1;
                        if (param0 == null) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 98: {
                        stackIn_101_0 = (RuntimeException) ((Object) stackIn_98_0);
                        stackIn_101_1 = (StringBuilder) ((Object) stackIn_98_1);
                        stackIn_101_2 = "{...}";
                        statePc = 101;
                        continue stateLoop;
                    }
                    case 100: {
                        stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
                        stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
                        stackIn_101_2 = "null";
                        statePc = 101;
                        continue stateLoop;
                    }
                    case 101: {
                        throw rb.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param1 + ')');
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

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hk.update(");

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void b(byte param0);

    public final void stop() {
        if (vk.field_B != this || fq.field_E) {
            return;
        }
        try {
            eq.field_d = km.b(-1) - -4000L;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "hk.stop()");
        }
    }

    public abstract void init();

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (un.field_b == null) {
              L1: {
                if (null == wj.field_g) {
                  break L1;
                } else {
                  if (this == wj.field_g) {
                    break L1;
                  } else {
                    stackIn_8_0 = wj.field_g.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "hk.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = km.b(-1);
              var4 = jl.field_V[bo.field_k];
              jl.field_V[bo.field_k] = var2_long;
              if (0L == var4) {
                break L1;
              } else {
                if ((var4 ^ -1L) > (var2_long ^ -1L)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            bo.field_k = 31 & bo.field_k - param0;
            var6 = this;
            synchronized (var6) {
              L2: {
                ae.field_ib = bn.field_b;
                break L2;
              }
            }
            this.a((byte) -30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.LA(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            bn.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hk.focusLost(");

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (k.field_d != null) {
                k.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
                k.field_d.getParent().setBackground(java.awt.Color.black);
                k.field_d.getParent().remove((java.awt.Component) ((Object) k.field_d));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != il.field_q) {
                  break L3;
                } else {
                  L4: {
                    if (null == un.field_b) {
                      break L4;
                    } else {
                      var2 = un.field_b;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (wj.field_g == null) {
                      break L5;
                    } else {
                      var2 = wj.field_g;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = vk.field_B;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = il.field_q;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                k.field_d = (java.awt.Canvas) ((Object) new md((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) k.field_d));
                k.field_d.setSize(wk.field_d, ul.field_a);
                k.field_d.setVisible(true);
                if (var2 == un.field_b) {
                  break L7;
                } else {
                  k.field_d.setLocation(aq.field_d, hg.field_a);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = un.field_b.getInsets();
              k.field_d.setLocation(aq.field_d + var3.left, hg.field_a + var3.top);
              break L6;
            }
            k.field_d.addFocusListener((java.awt.event.FocusListener) (this));
            k.field_d.requestFocus();
            bn.field_b = true;
            ae.field_ib = true;
            cf.field_c = true;
            b.field_v = param0;
            aa.field_Q = km.b(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (var2), "hk.KA(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        try {
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (!this.field_e) {
                  this.field_e = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      L2: {
                        hp.a(ip.a(9), (byte) -85, "loggedout");
                        if (param0 == 10) {
                          break L2;
                        } else {
                          this.stop();
                          break L2;
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      break L3;
                    }
                  }
                  try {
                    L4: {
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var3_ref2);

                stackIn_14_1 = new StringBuilder().append("hk.FA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            boolean stackIn_52_0 = false;
            boolean stackIn_70_0 = false;
            int stackIn_75_0 = 0;
            int stackIn_75_1 = 0;
            int stackIn_86_0 = 0;
            int stackIn_86_1 = 0;
            int stackIn_98_0 = 0;
            int stackIn_103_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            int var2_int = 0;
            java.lang.reflect.Method var2_ref = null;
            int var3 = 0;
            Throwable var3_ref_Throwable = null;
            String var4 = null;
            int var5 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != vh.field_u) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = vh.field_u.toLowerCase();
                            if ((((String) (var1)).indexOf("sun") ^ -1) != 0) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (-1 != ((String) (var1)).indexOf("apple")) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = vh.field_v;
                            if (var2.equals("1.1")) {
                                statePc = 43;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 43;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 43;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 43;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 43;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 43;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 43;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 43;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 43;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 43;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var2.equals("1.6.0")) {
                                statePc = 43;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            this.a(10, "wrongjava");
                            if (var5 == 0) {
                                statePc = 111;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var2.startsWith("1.6.0_")) {
                                statePc = 49;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3 = 6;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if ((var3 ^ -1) <= (var2.length() ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackIn_70_0 = ui.a(-110, var2.charAt(var3));
                            stackIn_52_0 = stackIn_70_0;
                            if (var5 != 0) {
                                statePc = 70;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!stackIn_52_0) {
                                statePc = 58;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!ip.a((byte) -104, (CharSequence) ((Object) var4))) {
                                statePc = 65;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((kc.a((byte) -85, (CharSequence) ((Object) var4)) ^ -1) > -11) {
                                statePc = 64;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            this.a(10, "wrongjava");
                            if (var5 == 0) {
                                statePc = 111;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (vh.field_v == null) {
                                statePc = 89;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackIn_70_0 = vh.field_v.startsWith("1.");
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (stackIn_70_0) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if ((vh.field_v.length() ^ -1) >= (var1_int ^ -1)) {
                                statePc = 85;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var3 = vh.field_v.charAt(var1_int);
                            stackIn_86_0 = -49;
                            stackIn_75_0 = stackIn_86_0;
                            stackIn_86_1 = var3 ^ -1;
                            stackIn_75_1 = stackIn_86_1;
                            if (var5 != 0) {
                                statePc = 86;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (stackIn_75_0 < stackIn_75_1) {
                                statePc = 85;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if ((var3 ^ -1) >= -58) {
                                statePc = 84;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var5 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var2_int = -48 + (var3 + 10 * var2_int);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 73;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            stackIn_86_0 = var2_int;
                            stackIn_86_1 = 5;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (stackIn_86_0 < stackIn_86_1) {
                                statePc = 89;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            fn.field_b = true;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var1 = vk.field_B;
                            if (wj.field_g == null) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var1 = wj.field_g;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var2_ref = vh.field_j;
                            if (var2_ref == null) {
                                statePc = 95;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            rd.b(36);
                            this.a(false);
                            mk.field_b = fd.a(0, ul.field_a, wk.field_d, (java.awt.Component) ((Object) k.field_d));
                            this.c(-593);
                            df.field_q = lh.a(-24858);
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (eq.field_d == 0L) {
                                statePc = 101;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            stackIn_103_0 = (eq.field_d < km.b(-1) ? -1 : (eq.field_d == km.b(-1) ? 0 : 1));
                            stackIn_98_0 = stackIn_103_0;
                            if (var5 != 0) {
                                statePc = 103;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (stackIn_98_0 <= 0) {
                                statePc = 111;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            oi.field_b = df.field_q.a((byte) -117, eg.field_u);
                            stackIn_103_0 = 0;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var3 = stackIn_103_0;
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if ((oi.field_b ^ -1) >= (var3 ^ -1)) {
                                statePc = 109;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.e(-1);
                            var3++;
                            if (var5 != 0) {
                                statePc = 110;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (var5 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            this.d(-18222);
                            oe.a(nk.field_u, 0, k.field_d);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if (var5 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var1 = caughtException;
                            nn.a((String) null, (Throwable) (var1), -9958);
                            this.a(10, "crash");
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            this.a(true, -11);
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        var1 = caughtException;
                        throw rb.a((Throwable) (var1), "hk.run()");
                    }
                    case 116: {
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

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != vk.field_B) {
                break L1;
              } else {
                if (fq.field_E) {
                  break L1;
                } else {
                  eq.field_d = km.b(-1);
                  ub.a(1976, 5000L);
                  pp.field_f = null;
                  this.a(false, -11);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = km.b(param0 ^ 18221);
              var4 = ui.field_l[ub.field_C];
              ui.field_l[ub.field_C] = var2_long;
              ub.field_C = 1 + ub.field_C & 31;
              if ((var4 ^ -1L) == -1L) {
                break L1;
              } else {
                if (var4 < var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              fieldTemp$1 = jk.field_a;
              jk.field_a = jk.field_a + 1;
              if (fieldTemp$1 <= 50) {
                break L2;
              } else {
                L3: {
                  L4: {
                    cf.field_c = true;
                    jk.field_a = jk.field_a - 50;
                    k.field_d.setSize(wk.field_d, ul.field_a);
                    k.field_d.setVisible(true);
                    if (un.field_b == null) {
                      break L4;
                    } else {
                      if (null == il.field_q) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  k.field_d.setLocation(aq.field_d, hg.field_a);
                  if (Torquing.field_u == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = un.field_b.getInsets();
                k.field_d.setLocation(aq.field_d + var6.left, hg.field_a + var6.top);
                break L2;
              }
            }
            L5: {
              this.b((byte) 73);
              if (param0 == -18222) {
                break L5;
              } else {
                this.a(68, (String) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.CA(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param1.length()) {
                    break L3;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackIn_16_0 = ra.a((char) var3, (byte) -55);

                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_16_0) {
                          break L4;
                        } else {
                          if (!ui.a(-59, (char) var3)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_16_0 = param0;
                break L2;
              }
              L5: {
                if (stackIn_16_0) {
                  break L5;
                } else {
                  hk.a(true, (String) null);
                  break L5;
                }
              }
              stackIn_20_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("hk.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != vk.field_B) {
                break L1;
              } else {
                if (fq.field_E) {
                  break L1;
                } else {
                  eq.field_d = 0L;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void b(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            wj.field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hk.provideLoaderApplet(");

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != un.field_b) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (wj.field_g == null) {
                  break L1;
                } else {
                  if (wj.field_g == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = wj.field_g.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("hk.getParameter(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    abstract void c(int param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (vk.field_B != this) {
                break L1;
              } else {
                if (!fq.field_E) {
                  L2: {
                    cf.field_c = true;
                    if (!fn.field_b) {
                      break L2;
                    } else {
                      if ((km.b(-1) - aa.field_Q ^ -1L) < -1001L) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (th.field_G > var2.width) {
                              break L2;
                            } else {
                              if (mi.field_s > var2.height) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        b.field_v = true;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("hk.paint(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (un.field_b == null) {
          L0: {
            if (wj.field_g == null) {
              break L0;
            } else {
              if (wj.field_g == this) {
                break L0;
              } else {
                return wj.field_g.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            bn.field_b = true;
            cf.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hk.focusGained(");

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            vh dupTemp$0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var8_int = 0;
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            rc var9 = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (vk.field_B != null) {
                                statePc = 4;
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
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            cf.field_g = cf.field_g + 1;
                            if (cf.field_g < 3) {
                                statePc = 7;
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
                            this.a(10, "alreadyloaded");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            wk.field_d = param4;
                            th.field_G = param4;
                            vk.field_B = (hk) (this);
                            dq.field_m = param0;
                            hg.field_a = 0;
                            ul.field_a = param3;
                            mi.field_s = param3;
                            aq.field_d = 0;
                            lg.field_B = ip.a(9);
                            dupTemp$0 = new vh(param5, param2, param6, true);
                            nk.field_u = dupTemp$0;
                            pp.field_f = dupTemp$0;
                            var8_int = 117 % ((param1 - 76) / 34);
                            var9 = nk.field_u.a((byte) -91, 1, (Runnable) (this));
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var9.field_a != 0) {
                                statePc = 15;
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
                            ub.a(1976, 10L);
                            if (var10 != 0) {
                                statePc = 23;
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
                            if (var10 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var8 = caughtException;
                            nn.a((String) null, var8, -9958);
                            this.a(10, "crash");
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var8_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_21_0 = (RuntimeException) (var8_ref);
                        stackIn_19_0 = stackIn_21_0;
                        stackIn_21_1 = new StringBuilder().append("hk.V(").append(param0).append(',').append(param1).append(',');
                        stackIn_19_1 = stackIn_21_1;
                        if (param2 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);
                        stackIn_22_1 = (StringBuilder) ((Object) stackIn_19_1);
                        stackIn_22_2 = "{...}";
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                        stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                        stackIn_22_2 = "null";
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 23: {
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

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1 == -11) {
                break L1;
              } else {
                this.a(94);
                break L1;
              }
            }
            var3_ref = this;
            synchronized (var3_ref) {
              L2: {
                if (!fq.field_E) {
                  fq.field_E = true;
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              if (wj.field_g == null) {
                break L3;
              } else {
                wj.field_g.destroy();
                break L3;
              }
            }
            try {
              L4: {
                this.b(6);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (null != k.field_d) {
                try {
                  L7: {
                    k.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
                    k.field_d.getParent().remove((java.awt.Component) ((Object) k.field_d));
                    break L7;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L8: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (nk.field_u == null) {
                break L9;
              } else {
                try {
                  L10: {
                    nk.field_u.b(6);
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                break L9;
              }
            }
            L12: {
              this.a(param1 + 15);
              if (un.field_b == null) {
                break L12;
              } else {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    throwable = decompiledCaughtException;
                    break L14;
                  }
                }
                break L12;
              }
            }
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.W(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hk.windowClosing(");

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected hk() {
        this.field_e = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    final boolean b(boolean param0) {
        return true;
    }

    abstract void a(int param0);

    final static String a(int param0, boolean param1, int param2, byte[] param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = new char[param0];
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        hk.a((df) null, -7);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = 0;
                        var6 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param0 ^ -1) >= (var6 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = param3[var6 + param2] & 255;
                        if (var7 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-129 < (var7 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var7 ^ -1) <= -161) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = ef.field_c[-128 + var7];
                        if (0 != var8) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = 63;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = var8;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = (char)var7;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 5;
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
                        stackIn_22_0 = new String(var4, 0, var5);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4_ref);
                    stackIn_24_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("hk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_24_1 = stackIn_26_1;
                    if (param3 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw rb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
