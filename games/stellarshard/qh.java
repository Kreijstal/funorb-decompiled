/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static boolean field_g;
    static String field_h;
    static boolean field_d;
    private int[][] field_i;
    static String field_f;
    static pb[] field_a;
    static wk field_e;
    private int field_c;
    private int field_b;

    final int a(int param0, int param1) {
        int var3 = 64 % ((param1 - -51) / 53);
        if (null != ((qh) this).field_i) {
            param0 = (int)((long)param0 * (long)((qh) this).field_c / (long)((qh) this).field_b);
        }
        return param0;
    }

    final static void a(boolean param0) {
        qh.b(-21923);
        if (!param0) {
            return;
        }
        rh.a(4, (byte) -72);
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= 52) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) pk.field_e;
                    // monitorenter pk.field_e
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (di.field_a != q.field_c) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        // monitorexit var1
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        gi.field_f = sf.field_d[di.field_a];
                        uc.field_b = ac.field_i[di.field_a];
                        di.field_a = 127 & di.field_a + 1;
                        // monitorexit var1
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var12 = stellarshard.field_B;
          var3 = -69 % ((17 - param0) / 59);
          if (((qh) this).field_i == null) {
            break L0;
          } else {
            var4 = (int)((long)param1.length * (long)((qh) this).field_c / (long)((qh) this).field_b) - -14;
            var21 = new int[var4];
            var19 = var21;
            var17 = var19;
            var15 = var17;
            var5 = var15;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= param1.length) {
                param1 = new byte[var4];
                var13 = 0;
                var8 = var13;
                L2: while (true) {
                  if (var4 <= var13) {
                    break L0;
                  } else {
                    var9 = 32768 + var21[var13] >> -1090445136;
                    if (-128 > var9) {
                      param1[var13] = (byte)-128;
                      var13++;
                      continue L2;
                    } else {
                      if (127 >= var9) {
                        param1[var13] = (byte)var9;
                        var13++;
                        continue L2;
                      } else {
                        param1[var13] = (byte)127;
                        var13++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var9 = param1[var8];
                var20 = ((qh) this).field_i[var7];
                var11 = 0;
                L3: while (true) {
                  if (var11 >= 14) {
                    var7 = var7 + ((qh) this).field_c;
                    var11 = var7 / ((qh) this).field_b;
                    var6 = var6 + var11;
                    var7 = var7 - var11 * ((qh) this).field_b;
                    var8++;
                    continue L1;
                  } else {
                    var5[var11 + var6] = var5[var11 + var6] + var20[var11] * var9;
                    var11++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        return param1;
    }

    final int b(int param0, int param1) {
        if (((qh) this).field_i != null) {
            param0 = (int)((long)((qh) this).field_c * (long)param0 / (long)((qh) this).field_b) + 6;
        }
        if (param1 != -10689) {
            int discarded$0 = ((qh) this).a(121, 34);
        }
        return param0;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -15520) {
            field_f = null;
        }
        field_e = null;
        field_h = null;
        field_a = null;
    }

    final static void b(int param0) {
        na.field_d.e((byte) 109);
        if (param0 != -21923) {
            return;
        }
        if (qf.field_d == null) {
            qf.field_d = new ql(na.field_d, ii.field_F);
        }
        na.field_d.a((byte) 72, (rj) (Object) qf.field_d);
    }

    final static void a(int param0, ha param1) {
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
            lb var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lb var17 = null;
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
                        var12 = stellarshard.field_B;
                        var13 = (lb) (Object) oc.field_c.b(-121);
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
                        if (param0 >= 84) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        qh.a(false);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var4 = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (var17.field_s <= var4) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (null == var13.field_r[var4]) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if ((var13.field_r[var4].field_f ^ -1) != -3) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var13.field_p[var4] = -5;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var13.field_r[var4].field_f == 0) {
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
                        if (null != var13.field_q[var4]) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var4++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 15: {
                        if (var13.field_q[var4].field_f == 2) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var13.field_p[var4] = -6;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (0 == var13.field_q[var4].field_f) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var4++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 20: {
                        var3 = 1;
                        var4++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var3 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        return;
                    }
                    case 24: {
                        var4 = param1.field_k;
                        param1.b(0, var17.field_l);
                        var5 = 0;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var17.field_s <= var5) {
                            statePc = 63;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (-1 != (var17.field_p[var5] ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        param1.a(false, var17.field_p[var5]);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            var6_int = var17.field_k[var5];
                            if (0 == var6_int) {
                                statePc = 34;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 50 : (stateCaught_29 instanceof InvalidClassException ? 51 : (stateCaught_29 instanceof StreamCorruptedException ? 52 : (stateCaught_29 instanceof OptionalDataException ? 53 : (stateCaught_29 instanceof IllegalAccessException ? 54 : (stateCaught_29 instanceof IllegalArgumentException ? 55 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_29 instanceof SecurityException ? 57 : (stateCaught_29 instanceof IOException ? 58 : (stateCaught_29 instanceof NullPointerException ? 59 : (stateCaught_29 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 50 : (stateCaught_30 instanceof InvalidClassException ? 51 : (stateCaught_30 instanceof StreamCorruptedException ? 52 : (stateCaught_30 instanceof OptionalDataException ? 53 : (stateCaught_30 instanceof IllegalAccessException ? 54 : (stateCaught_30 instanceof IllegalArgumentException ? 55 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_30 instanceof SecurityException ? 57 : (stateCaught_30 instanceof IOException ? 58 : (stateCaught_30 instanceof NullPointerException ? 59 : (stateCaught_30 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (2 != var6_int) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 50 : (stateCaught_31 instanceof InvalidClassException ? 51 : (stateCaught_31 instanceof StreamCorruptedException ? 52 : (stateCaught_31 instanceof OptionalDataException ? 53 : (stateCaught_31 instanceof IllegalAccessException ? 54 : (stateCaught_31 instanceof IllegalArgumentException ? 55 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_31 instanceof SecurityException ? 57 : (stateCaught_31 instanceof IOException ? 58 : (stateCaught_31 instanceof NullPointerException ? 59 : (stateCaught_31 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_r[var5].field_b;
                            var8 = var26.getModifiers();
                            param1.a(false, 0);
                            param1.b(0, var8);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 50 : (stateCaught_32 instanceof InvalidClassException ? 51 : (stateCaught_32 instanceof StreamCorruptedException ? 52 : (stateCaught_32 instanceof OptionalDataException ? 53 : (stateCaught_32 instanceof IllegalAccessException ? 54 : (stateCaught_32 instanceof IllegalArgumentException ? 55 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_32 instanceof SecurityException ? 57 : (stateCaught_32 instanceof IOException ? 58 : (stateCaught_32 instanceof NullPointerException ? 59 : (stateCaught_32 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_r[var5].field_b;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_n[var5]);
                            param1.a(false, 0);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 50 : (stateCaught_33 instanceof InvalidClassException ? 51 : (stateCaught_33 instanceof StreamCorruptedException ? 52 : (stateCaught_33 instanceof OptionalDataException ? 53 : (stateCaught_33 instanceof IllegalAccessException ? 54 : (stateCaught_33 instanceof IllegalArgumentException ? 55 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_33 instanceof SecurityException ? 57 : (stateCaught_33 instanceof IOException ? 58 : (stateCaught_33 instanceof NullPointerException ? 59 : (stateCaught_33 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_r[var5].field_b;
                            var8 = var15.getInt((Object) null);
                            param1.a(false, 0);
                            param1.b(0, var8);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 50 : (stateCaught_34 instanceof InvalidClassException ? 51 : (stateCaught_34 instanceof StreamCorruptedException ? 52 : (stateCaught_34 instanceof OptionalDataException ? 53 : (stateCaught_34 instanceof IllegalAccessException ? 54 : (stateCaught_34 instanceof IllegalArgumentException ? 55 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_34 instanceof SecurityException ? 57 : (stateCaught_34 instanceof IOException ? 58 : (stateCaught_34 instanceof NullPointerException ? 59 : (stateCaught_34 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var6_int == 3) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 50 : (stateCaught_35 instanceof InvalidClassException ? 51 : (stateCaught_35 instanceof StreamCorruptedException ? 52 : (stateCaught_35 instanceof OptionalDataException ? 53 : (stateCaught_35 instanceof IllegalAccessException ? 54 : (stateCaught_35 instanceof IllegalArgumentException ? 55 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_35 instanceof SecurityException ? 57 : (stateCaught_35 instanceof IOException ? 58 : (stateCaught_35 instanceof NullPointerException ? 59 : (stateCaught_35 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (4 == var6_int) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 50 : (stateCaught_36 instanceof InvalidClassException ? 51 : (stateCaught_36 instanceof StreamCorruptedException ? 52 : (stateCaught_36 instanceof OptionalDataException ? 53 : (stateCaught_36 instanceof IllegalAccessException ? 54 : (stateCaught_36 instanceof IllegalArgumentException ? 55 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_36 instanceof SecurityException ? 57 : (stateCaught_36 instanceof IOException ? 58 : (stateCaught_36 instanceof NullPointerException ? 59 : (stateCaught_36 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 50 : (stateCaught_37 instanceof InvalidClassException ? 51 : (stateCaught_37 instanceof StreamCorruptedException ? 52 : (stateCaught_37 instanceof OptionalDataException ? 53 : (stateCaught_37 instanceof IllegalAccessException ? 54 : (stateCaught_37 instanceof IllegalArgumentException ? 55 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_37 instanceof SecurityException ? 57 : (stateCaught_37 instanceof IOException ? 58 : (stateCaught_37 instanceof NullPointerException ? 59 : (stateCaught_37 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_q[var5].field_b;
                            var8 = var27.getModifiers();
                            param1.a(false, 0);
                            param1.b(0, var8);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 50 : (stateCaught_38 instanceof InvalidClassException ? 51 : (stateCaught_38 instanceof StreamCorruptedException ? 52 : (stateCaught_38 instanceof OptionalDataException ? 53 : (stateCaught_38 instanceof IllegalAccessException ? 54 : (stateCaught_38 instanceof IllegalArgumentException ? 55 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_38 instanceof SecurityException ? 57 : (stateCaught_38 instanceof IOException ? 58 : (stateCaught_38 instanceof NullPointerException ? 59 : (stateCaught_38 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_q[var5].field_b;
                            var25 = var17.field_m[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 50 : (stateCaught_39 instanceof InvalidClassException ? 51 : (stateCaught_39 instanceof StreamCorruptedException ? 52 : (stateCaught_39 instanceof OptionalDataException ? 53 : (stateCaught_39 instanceof IllegalAccessException ? 54 : (stateCaught_39 instanceof IllegalArgumentException ? 55 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_39 instanceof SecurityException ? 57 : (stateCaught_39 instanceof IOException ? 58 : (stateCaught_39 instanceof NullPointerException ? 59 : (stateCaught_39 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var25.length <= var10_int) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 50 : (stateCaught_40 instanceof InvalidClassException ? 51 : (stateCaught_40 instanceof StreamCorruptedException ? 52 : (stateCaught_40 instanceof OptionalDataException ? 53 : (stateCaught_40 instanceof IllegalAccessException ? 54 : (stateCaught_40 instanceof IllegalArgumentException ? 55 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_40 instanceof SecurityException ? 57 : (stateCaught_40 instanceof IOException ? 58 : (stateCaught_40 instanceof NullPointerException ? 59 : (stateCaught_40 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 50 : (stateCaught_41 instanceof InvalidClassException ? 51 : (stateCaught_41 instanceof StreamCorruptedException ? 52 : (stateCaught_41 instanceof OptionalDataException ? 53 : (stateCaught_41 instanceof IllegalAccessException ? 54 : (stateCaught_41 instanceof IllegalArgumentException ? 55 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_41 instanceof SecurityException ? 57 : (stateCaught_41 instanceof IOException ? 58 : (stateCaught_41 instanceof NullPointerException ? 59 : (stateCaught_41 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 50 : (stateCaught_42 instanceof InvalidClassException ? 51 : (stateCaught_42 instanceof StreamCorruptedException ? 52 : (stateCaught_42 instanceof OptionalDataException ? 53 : (stateCaught_42 instanceof IllegalAccessException ? 54 : (stateCaught_42 instanceof IllegalArgumentException ? 55 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_42 instanceof SecurityException ? 57 : (stateCaught_42 instanceof IOException ? 58 : (stateCaught_42 instanceof NullPointerException ? 59 : (stateCaught_42 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param1.a(false, 0);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 50 : (stateCaught_43 instanceof InvalidClassException ? 51 : (stateCaught_43 instanceof StreamCorruptedException ? 52 : (stateCaught_43 instanceof OptionalDataException ? 53 : (stateCaught_43 instanceof IllegalAccessException ? 54 : (stateCaught_43 instanceof IllegalArgumentException ? 55 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_43 instanceof SecurityException ? 57 : (stateCaught_43 instanceof IOException ? 58 : (stateCaught_43 instanceof NullPointerException ? 59 : (stateCaught_43 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ClassNotFoundException ? 50 : (stateCaught_44 instanceof InvalidClassException ? 51 : (stateCaught_44 instanceof StreamCorruptedException ? 52 : (stateCaught_44 instanceof OptionalDataException ? 53 : (stateCaught_44 instanceof IllegalAccessException ? 54 : (stateCaught_44 instanceof IllegalArgumentException ? 55 : (stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_44 instanceof SecurityException ? 57 : (stateCaught_44 instanceof IOException ? 58 : (stateCaught_44 instanceof NullPointerException ? 59 : (stateCaught_44 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ClassNotFoundException ? 50 : (stateCaught_45 instanceof InvalidClassException ? 51 : (stateCaught_45 instanceof StreamCorruptedException ? 52 : (stateCaught_45 instanceof OptionalDataException ? 53 : (stateCaught_45 instanceof IllegalAccessException ? 54 : (stateCaught_45 instanceof IllegalArgumentException ? 55 : (stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_45 instanceof SecurityException ? 57 : (stateCaught_45 instanceof IOException ? 58 : (stateCaught_45 instanceof NullPointerException ? 59 : (stateCaught_45 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param1.a(false, 2);
                            param1.b((String) var10, -9799);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ClassNotFoundException ? 50 : (stateCaught_46 instanceof InvalidClassException ? 51 : (stateCaught_46 instanceof StreamCorruptedException ? 52 : (stateCaught_46 instanceof OptionalDataException ? 53 : (stateCaught_46 instanceof IllegalAccessException ? 54 : (stateCaught_46 instanceof IllegalArgumentException ? 55 : (stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_46 instanceof SecurityException ? 57 : (stateCaught_46 instanceof IOException ? 58 : (stateCaught_46 instanceof NullPointerException ? 59 : (stateCaught_46 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param1.a(false, 4);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ClassNotFoundException ? 50 : (stateCaught_47 instanceof InvalidClassException ? 51 : (stateCaught_47 instanceof StreamCorruptedException ? 52 : (stateCaught_47 instanceof OptionalDataException ? 53 : (stateCaught_47 instanceof IllegalAccessException ? 54 : (stateCaught_47 instanceof IllegalArgumentException ? 55 : (stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_47 instanceof SecurityException ? 57 : (stateCaught_47 instanceof IOException ? 58 : (stateCaught_47 instanceof NullPointerException ? 59 : (stateCaught_47 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            param1.a(false, 1);
                            param1.a((byte) 120, ((Number) var10).longValue());
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ClassNotFoundException ? 50 : (stateCaught_48 instanceof InvalidClassException ? 51 : (stateCaught_48 instanceof StreamCorruptedException ? 52 : (stateCaught_48 instanceof OptionalDataException ? 53 : (stateCaught_48 instanceof IllegalAccessException ? 54 : (stateCaught_48 instanceof IllegalArgumentException ? 55 : (stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 56 : (stateCaught_48 instanceof SecurityException ? 57 : (stateCaught_48 instanceof IOException ? 58 : (stateCaught_48 instanceof NullPointerException ? 59 : (stateCaught_48 instanceof Exception ? 60 : 61)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param1.a(false, -10);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.a(false, -11);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.a(false, -12);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.a(false, -13);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.a(false, -14);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.a(false, -15);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.a(false, -16);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.a(false, -17);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.a(false, -18);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.a(false, -19);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 60: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.a(false, -20);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 61: {
                        var6_ref11 = caughtException;
                        param1.a(false, -21);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        var5++;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 63: {
                        int discarded$1 = param1.c(var4, (byte) -3);
                        var17.c(20);
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

    qh(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = fe.a(-102, param0, param1);
          param0 = param0 / var3;
          param1 = param1 / var3;
          ((qh) this).field_b = param0;
          ((qh) this).field_i = new int[param0][14];
          ((qh) this).field_c = param1;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
            } else {
              L1: {
                var5 = ((qh) this).field_i[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (-7.0 + var6));
                if ((var8 ^ -1) <= -1) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if ((var9 ^ -1) >= -15) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var8 >= var9) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = (-var6 + (double)var8) * 3.141592653589793;
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46);
                  var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Waiting for music";
        field_h = "Ion cannon";
        field_g = false;
    }
}
