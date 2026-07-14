/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sd {
    private int field_d;
    private hl field_h;
    private int field_g;
    static fs field_e;
    static String field_b;
    private um field_c;
    static ri[] field_a;
    static int field_f;

    final static ov a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ov var5 = null;
            fh var5_ref = null;
            Object stackIn_2_0 = null;
            ov stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            ov stackOut_3_0 = null;
            try {
              var4 = Class.forName("rk");
              var5 = (ov) var4.newInstance();
              if (param2 == 0) {
                return (ov) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var5.a(param3, param0, param1, param2 + -119);
              stackOut_3_0 = (ov) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final Object a(byte param0) {
        jt var2 = null;
        Object var3 = null;
        jt var4 = null;
        int var5 = 0;
        Object var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (jt) (Object) ((sd) this).field_c.a(-1);
        L0: while (true) {
          if (var2 == null) {
            if (param0 != -92) {
              var6 = null;
              String discarded$1 = sd.a((byte[]) null, 41, -100, 63);
              return null;
            } else {
              return null;
            }
          } else {
            var3 = var2.c((byte) 107);
            if (var3 != null) {
              return var3;
            } else {
              var4 = var2;
              var2 = (jt) (Object) ((sd) this).field_c.a(-1);
              var4.b(false);
              var4.c(-5106);
              ((sd) this).field_d = ((sd) this).field_d + var4.field_z;
              continue L0;
            }
          }
        }
    }

    final Object a(long param0, int param1) {
        av var6 = null;
        jt var7 = (jt) (Object) ((sd) this).field_c.a(575, param0);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.c((byte) -81);
        if (var5 == null) {
            var7.b(false);
            var7.c(-5106);
            ((sd) this).field_d = ((sd) this).field_d + var7.field_z;
            return null;
        }
        if (var7.e(115)) {
            var6 = new av(var5, var7.field_z);
            ((sd) this).field_c.a(-20657, (ms) (Object) var6, var7.field_h);
            ((sd) this).field_h.a((pj) (Object) var6, (byte) -122);
            ((jt) (Object) var6).field_l = 0L;
            var7.b(false);
            var7.c(-5106);
        } else {
            ((sd) this).field_h.a((pj) (Object) var7, (byte) -124);
            var7.field_l = 0L;
        }
        if (param1 <= 43) {
            ((sd) this).field_d = 126;
        }
        return var5;
    }

    final void a(int param0, int param1) {
        jt var3 = null;
        kl var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param1 == 22663) {
          var3 = (jt) (Object) ((sd) this).field_h.b(-1);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                if (var3.e(param1 ^ -22690)) {
                  if (var3.c((byte) -62) != null) {
                    break L1;
                  } else {
                    var3.b(false);
                    var3.c(-5106);
                    ((sd) this).field_d = ((sd) this).field_d + var3.field_z;
                    break L1;
                  }
                } else {
                  var3.field_l = var3.field_l + 1L;
                  if ((var3.field_l + 1L ^ -1L) < ((long)param0 ^ -1L)) {
                    var4 = new kl(var3.c((byte) -102), var3.field_z);
                    ((sd) this).field_c.a(param1 ^ -2104, (ms) (Object) var4, var3.field_h);
                    pt.a((pj) (Object) var3, 2066481250, (pj) (Object) var4);
                    var3.b(false);
                    var3.c(-5106);
                    break L1;
                  } else {
                    var3 = (jt) (Object) ((sd) this).field_h.a((byte) -122);
                    continue L0;
                  }
                }
              }
              var3 = (jt) (Object) ((sd) this).field_h.a((byte) -122);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(pl param0, int param1) {
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
            rd var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            rd var17 = null;
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
                        var12 = Sumoblitz.field_L ? 1 : 0;
                        if (param1 > 126) {
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
                        var13 = (rd) (Object) qr.field_c.b(-77);
                        var17 = var13;
                        if (var17 != null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (var17.field_p <= var4) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (var13.field_o[var4] == null) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (2 == var13.field_o[var4].field_c) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var13.field_k[var4] = -5;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (0 != var13.field_o[var4].field_c) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var3 = 1;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != var13.field_s[var4]) {
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
                        if (2 != var13.field_s[var4].field_c) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var13.field_k[var4] = -6;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (-1 == (var13.field_s[var4].field_c ^ -1)) {
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
                        var4 = param0.field_p;
                        param0.e(48, var17.field_t);
                        var5 = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var17.field_p <= var5) {
                            statePc = 59;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (var17.field_k[var5] == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        param0.b((byte) 118, var17.field_k[var5]);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            var6_int = var17.field_r[var5];
                            if (var6_int == -1) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 46 : (stateCaught_25 instanceof InvalidClassException ? 47 : (stateCaught_25 instanceof StreamCorruptedException ? 48 : (stateCaught_25 instanceof OptionalDataException ? 49 : (stateCaught_25 instanceof IllegalAccessException ? 50 : (stateCaught_25 instanceof IllegalArgumentException ? 51 : (stateCaught_25 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_25 instanceof SecurityException ? 53 : (stateCaught_25 instanceof IOException ? 54 : (stateCaught_25 instanceof NullPointerException ? 55 : (stateCaught_25 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (1 == var6_int) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 46 : (stateCaught_26 instanceof InvalidClassException ? 47 : (stateCaught_26 instanceof StreamCorruptedException ? 48 : (stateCaught_26 instanceof OptionalDataException ? 49 : (stateCaught_26 instanceof IllegalAccessException ? 50 : (stateCaught_26 instanceof IllegalArgumentException ? 51 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_26 instanceof SecurityException ? 53 : (stateCaught_26 instanceof IOException ? 54 : (stateCaught_26 instanceof NullPointerException ? 55 : (stateCaught_26 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-3 == var6_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 46 : (stateCaught_27 instanceof InvalidClassException ? 47 : (stateCaught_27 instanceof StreamCorruptedException ? 48 : (stateCaught_27 instanceof OptionalDataException ? 49 : (stateCaught_27 instanceof IllegalAccessException ? 50 : (stateCaught_27 instanceof IllegalArgumentException ? 51 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_27 instanceof SecurityException ? 53 : (stateCaught_27 instanceof IOException ? 54 : (stateCaught_27 instanceof NullPointerException ? 55 : (stateCaught_27 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 46 : (stateCaught_28 instanceof InvalidClassException ? 47 : (stateCaught_28 instanceof StreamCorruptedException ? 48 : (stateCaught_28 instanceof OptionalDataException ? 49 : (stateCaught_28 instanceof IllegalAccessException ? 50 : (stateCaught_28 instanceof IllegalArgumentException ? 51 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_28 instanceof SecurityException ? 53 : (stateCaught_28 instanceof IOException ? 54 : (stateCaught_28 instanceof NullPointerException ? 55 : (stateCaught_28 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_o[var5].field_d;
                            var8 = var26.getModifiers();
                            param0.b((byte) 88, 0);
                            param0.e(48, var8);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 46 : (stateCaught_29 instanceof InvalidClassException ? 47 : (stateCaught_29 instanceof StreamCorruptedException ? 48 : (stateCaught_29 instanceof OptionalDataException ? 49 : (stateCaught_29 instanceof IllegalAccessException ? 50 : (stateCaught_29 instanceof IllegalArgumentException ? 51 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_29 instanceof SecurityException ? 53 : (stateCaught_29 instanceof IOException ? 54 : (stateCaught_29 instanceof NullPointerException ? 55 : (stateCaught_29 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_o[var5].field_d;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_n[var5]);
                            param0.b((byte) 92, 0);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 46 : (stateCaught_30 instanceof InvalidClassException ? 47 : (stateCaught_30 instanceof StreamCorruptedException ? 48 : (stateCaught_30 instanceof OptionalDataException ? 49 : (stateCaught_30 instanceof IllegalAccessException ? 50 : (stateCaught_30 instanceof IllegalArgumentException ? 51 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_30 instanceof SecurityException ? 53 : (stateCaught_30 instanceof IOException ? 54 : (stateCaught_30 instanceof NullPointerException ? 55 : (stateCaught_30 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_o[var5].field_d;
                            var8 = var15.getInt((Object) null);
                            param0.b((byte) 106, 0);
                            param0.e(48, var8);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 46 : (stateCaught_31 instanceof InvalidClassException ? 47 : (stateCaught_31 instanceof StreamCorruptedException ? 48 : (stateCaught_31 instanceof OptionalDataException ? 49 : (stateCaught_31 instanceof IllegalAccessException ? 50 : (stateCaught_31 instanceof IllegalArgumentException ? 51 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_31 instanceof SecurityException ? 53 : (stateCaught_31 instanceof IOException ? 54 : (stateCaught_31 instanceof NullPointerException ? 55 : (stateCaught_31 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-4 == (var6_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 46 : (stateCaught_32 instanceof InvalidClassException ? 47 : (stateCaught_32 instanceof StreamCorruptedException ? 48 : (stateCaught_32 instanceof OptionalDataException ? 49 : (stateCaught_32 instanceof IllegalAccessException ? 50 : (stateCaught_32 instanceof IllegalArgumentException ? 51 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_32 instanceof SecurityException ? 53 : (stateCaught_32 instanceof IOException ? 54 : (stateCaught_32 instanceof NullPointerException ? 55 : (stateCaught_32 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (4 != var6_int) {
                                statePc = 58;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 46 : (stateCaught_33 instanceof InvalidClassException ? 47 : (stateCaught_33 instanceof StreamCorruptedException ? 48 : (stateCaught_33 instanceof OptionalDataException ? 49 : (stateCaught_33 instanceof IllegalAccessException ? 50 : (stateCaught_33 instanceof IllegalArgumentException ? 51 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_33 instanceof SecurityException ? 53 : (stateCaught_33 instanceof IOException ? 54 : (stateCaught_33 instanceof NullPointerException ? 55 : (stateCaught_33 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_s[var5].field_d;
                            var8 = var27.getModifiers();
                            param0.b((byte) 93, 0);
                            param0.e(48, var8);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 46 : (stateCaught_34 instanceof InvalidClassException ? 47 : (stateCaught_34 instanceof StreamCorruptedException ? 48 : (stateCaught_34 instanceof OptionalDataException ? 49 : (stateCaught_34 instanceof IllegalAccessException ? 50 : (stateCaught_34 instanceof IllegalArgumentException ? 51 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_34 instanceof SecurityException ? 53 : (stateCaught_34 instanceof IOException ? 54 : (stateCaught_34 instanceof NullPointerException ? 55 : (stateCaught_34 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_s[var5].field_d;
                            var25 = var17.field_u[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 46 : (stateCaught_35 instanceof InvalidClassException ? 47 : (stateCaught_35 instanceof StreamCorruptedException ? 48 : (stateCaught_35 instanceof OptionalDataException ? 49 : (stateCaught_35 instanceof IllegalAccessException ? 50 : (stateCaught_35 instanceof IllegalArgumentException ? 51 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_35 instanceof SecurityException ? 53 : (stateCaught_35 instanceof IOException ? 54 : (stateCaught_35 instanceof NullPointerException ? 55 : (stateCaught_35 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var10_int >= var25.length) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 46 : (stateCaught_36 instanceof InvalidClassException ? 47 : (stateCaught_36 instanceof StreamCorruptedException ? 48 : (stateCaught_36 instanceof OptionalDataException ? 49 : (stateCaught_36 instanceof IllegalAccessException ? 50 : (stateCaught_36 instanceof IllegalArgumentException ? 51 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_36 instanceof SecurityException ? 53 : (stateCaught_36 instanceof IOException ? 54 : (stateCaught_36 instanceof NullPointerException ? 55 : (stateCaught_36 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 46 : (stateCaught_37 instanceof InvalidClassException ? 47 : (stateCaught_37 instanceof StreamCorruptedException ? 48 : (stateCaught_37 instanceof OptionalDataException ? 49 : (stateCaught_37 instanceof IllegalAccessException ? 50 : (stateCaught_37 instanceof IllegalArgumentException ? 51 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_37 instanceof SecurityException ? 53 : (stateCaught_37 instanceof IOException ? 54 : (stateCaught_37 instanceof NullPointerException ? 55 : (stateCaught_37 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 44;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 46 : (stateCaught_38 instanceof InvalidClassException ? 47 : (stateCaught_38 instanceof StreamCorruptedException ? 48 : (stateCaught_38 instanceof OptionalDataException ? 49 : (stateCaught_38 instanceof IllegalAccessException ? 50 : (stateCaught_38 instanceof IllegalArgumentException ? 51 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_38 instanceof SecurityException ? 53 : (stateCaught_38 instanceof IOException ? 54 : (stateCaught_38 instanceof NullPointerException ? 55 : (stateCaught_38 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 46 : (stateCaught_39 instanceof InvalidClassException ? 47 : (stateCaught_39 instanceof StreamCorruptedException ? 48 : (stateCaught_39 instanceof OptionalDataException ? 49 : (stateCaught_39 instanceof IllegalAccessException ? 50 : (stateCaught_39 instanceof IllegalArgumentException ? 51 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_39 instanceof SecurityException ? 53 : (stateCaught_39 instanceof IOException ? 54 : (stateCaught_39 instanceof NullPointerException ? 55 : (stateCaught_39 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 46 : (stateCaught_40 instanceof InvalidClassException ? 47 : (stateCaught_40 instanceof StreamCorruptedException ? 48 : (stateCaught_40 instanceof OptionalDataException ? 49 : (stateCaught_40 instanceof IllegalAccessException ? 50 : (stateCaught_40 instanceof IllegalArgumentException ? 51 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_40 instanceof SecurityException ? 53 : (stateCaught_40 instanceof IOException ? 54 : (stateCaught_40 instanceof NullPointerException ? 55 : (stateCaught_40 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.b((byte) 34, 2);
                            param0.a((String) var10, (byte) -104);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 46 : (stateCaught_41 instanceof InvalidClassException ? 47 : (stateCaught_41 instanceof StreamCorruptedException ? 48 : (stateCaught_41 instanceof OptionalDataException ? 49 : (stateCaught_41 instanceof IllegalAccessException ? 50 : (stateCaught_41 instanceof IllegalArgumentException ? 51 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_41 instanceof SecurityException ? 53 : (stateCaught_41 instanceof IOException ? 54 : (stateCaught_41 instanceof NullPointerException ? 55 : (stateCaught_41 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.b((byte) 49, 4);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 46 : (stateCaught_42 instanceof InvalidClassException ? 47 : (stateCaught_42 instanceof StreamCorruptedException ? 48 : (stateCaught_42 instanceof OptionalDataException ? 49 : (stateCaught_42 instanceof IllegalAccessException ? 50 : (stateCaught_42 instanceof IllegalArgumentException ? 51 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_42 instanceof SecurityException ? 53 : (stateCaught_42 instanceof IOException ? 54 : (stateCaught_42 instanceof NullPointerException ? 55 : (stateCaught_42 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param0.b((byte) 56, 1);
                            param0.a(false, ((Number) var10).longValue());
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 46 : (stateCaught_43 instanceof InvalidClassException ? 47 : (stateCaught_43 instanceof StreamCorruptedException ? 48 : (stateCaught_43 instanceof OptionalDataException ? 49 : (stateCaught_43 instanceof IllegalAccessException ? 50 : (stateCaught_43 instanceof IllegalArgumentException ? 51 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_43 instanceof SecurityException ? 53 : (stateCaught_43 instanceof IOException ? 54 : (stateCaught_43 instanceof NullPointerException ? 55 : (stateCaught_43 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param0.b((byte) 39, 0);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 46 : (stateCaught_44 instanceof InvalidClassException ? 47 : (stateCaught_44 instanceof StreamCorruptedException ? 48 : (stateCaught_44 instanceof OptionalDataException ? 49 : (stateCaught_44 instanceof IllegalAccessException ? 50 : (stateCaught_44 instanceof IllegalArgumentException ? 51 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 52 : (stateCaught_44 instanceof SecurityException ? 53 : (stateCaught_44 instanceof IOException ? 54 : (stateCaught_44 instanceof NullPointerException ? 55 : (stateCaught_44 instanceof Exception ? 56 : 57)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.b((byte) 93, -10);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 47: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.b((byte) 41, -11);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.b((byte) 108, -12);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.b((byte) 42, -13);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.b((byte) 53, -14);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.b((byte) 86, -15);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.b((byte) 106, -16);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.b((byte) 33, -17);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.b((byte) 18, -18);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.b((byte) 48, -19);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.b((byte) 125, -20);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref11 = caughtException;
                        param0.b((byte) 86, -21);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        var5++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 59: {
                        int discarded$1 = param0.a(var4, false);
                        var17.b(false);
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

    sd(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          if (param3 == 27) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          if (param4 > param5) {
            if (param4 < param2) {
              uw.a(lk.field_a, param6, param5, param2, param1, param0, param3 + 1955582389, param7, param4);
              break L1;
            } else {
              if (param2 <= param5) {
                uw.a(lk.field_a, param0, param2, param4, param1, param7, 1955582416, param6, param5);
                break L1;
              } else {
                uw.a(lk.field_a, param0, param5, param4, param1, param6, param3 ^ 1955582411, param7, param2);
                break L1;
              }
            }
          } else {
            if (param2 <= param5) {
              if (param2 > param4) {
                uw.a(lk.field_a, param7, param4, param5, param1, param6, 1955582416, param0, param2);
                break L1;
              } else {
                uw.a(lk.field_a, param7, param2, param5, param1, param0, 1955582416, param6, param4);
                break L1;
              }
            } else {
              uw.a(lk.field_a, param6, param4, param2, param1, param7, 1955582416, param0, param5);
              break L1;
            }
          }
        }
    }

    private final void a(jt param0, byte param1) {
        if (!(param0 == null)) {
            param0.b(false);
            param0.c(-5106);
            ((sd) this).field_d = ((sd) this).field_d + param0.field_z;
        }
        if (param1 != -124) {
            field_a = null;
        }
    }

    final void a(long param0, Object param1, byte param2) {
        this.a(1, (byte) -95, param1, param0);
        if (param2 != 19) {
            this.a(-95L, false);
        }
    }

    final Object b(int param0) {
        jt var2 = null;
        Object var3 = null;
        jt var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (jt) (Object) ((sd) this).field_c.c(-1);
        if (param0 == 0) {
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.c((byte) 103);
              if (var3 != null) {
                return var3;
              } else {
                var4 = var2;
                var2 = (jt) (Object) ((sd) this).field_c.a(-1);
                var4.b(false);
                var4.c(-5106);
                ((sd) this).field_d = ((sd) this).field_d + var4.field_z;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var11 = new char[param2];
        var10 = var11;
        var4 = var10;
        if (param3 == 26564) {
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            if (var6 >= param2) {
              return new String(var11, 0, var5);
            } else {
              var7 = 255 & param0[param1 - -var6];
              if (0 != var7) {
                L1: {
                  if (-129 < (var7 ^ -1)) {
                    break L1;
                  } else {
                    if (var7 < 160) {
                      L2: {
                        var8 = uk.field_lb[var7 + -128];
                        if (var8 == 0) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var5++;
                var4[var5] = (char)var7;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(long param0, boolean param1) {
        jt var4 = (jt) (Object) ((sd) this).field_c.a(575, param0);
        if (param1) {
            this.a(-43, (byte) -104, (Object) null, -101L);
        }
        this.a(var4, (byte) -124);
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_a = null;
        }
        field_a = null;
        field_b = null;
        field_e = null;
    }

    private final void a(int param0, byte param1, Object param2, long param3) {
        jt var6 = null;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        if (!(((sd) this).field_g >= param0)) {
            throw new IllegalStateException();
        }
        this.a(param3, false);
        ((sd) this).field_d = ((sd) this).field_d - param0;
        while (0 > ((sd) this).field_d) {
            var6 = (jt) (Object) ((sd) this).field_h.b((byte) -61);
            this.a(var6, (byte) -124);
        }
        av var6_ref = new av(param2, param0);
        ((sd) this).field_c.a(-20657, (ms) (Object) var6_ref, param3);
        int var7 = 2 % ((12 - param1) / 33);
        ((sd) this).field_h.a((pj) (Object) var6_ref, (byte) -122);
        ((jt) (Object) var6_ref).field_l = 0L;
    }

    private sd(int param0, int param1) {
        ((sd) this).field_h = new hl();
        ((sd) this).field_d = param0;
        ((sd) this).field_g = param0;
        int var3 = 1;
        while (var3 + var3 < param0) {
            // if_icmple L46
            var3 = var3 + var3;
        }
        ((sd) this).field_c = new um(var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new fs(256);
        field_b = "ACHIEVEMENTS THIS GAME";
    }
}
