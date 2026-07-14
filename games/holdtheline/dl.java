/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    static int field_i;
    static String field_h;
    private DataInputStream field_f;
    private th field_g;
    private af field_d;
    static int[][] field_k;
    static String field_n;
    private java.net.URL field_b;
    static float[] field_m;
    static String field_j;
    private int field_c;
    private af field_a;
    private af field_e;
    private ib field_l;

    final static void a(int[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        boolean stackIn_4_0 = false;
        boolean stackOut_2_0 = false;
        boolean stackOut_3_0 = false;
        L0: {
          var5 = HoldTheLine.field_D;
          gf.a();
          gf.a(param0, 0, param0.length);
          gf.c();
          if (param1 < -53) {
            break L0;
          } else {
            var6 = null;
            dl.a(20, (da) null);
            break L0;
          }
        }
        stackOut_2_0 = gf.d();
        stackIn_4_0 = stackOut_2_0;
        L1: while (true) {
          if (!stackIn_4_0) {
            return;
          } else {
            tc.c(gf.field_g, gf.field_a, gf.field_b + -gf.field_g, param3, param2);
            stackOut_3_0 = gf.d();
            stackIn_4_0 = stackOut_3_0;
            continue L1;
          }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = HoldTheLine.field_D;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((dl) this).field_g.field_l >= ((dl) this).field_g.field_i.length) {
                                statePc = 5;
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
                            var1_int = ((dl) this).field_f.read(((dl) this).field_g.field_i, ((dl) this).field_g.field_l, -((dl) this).field_g.field_l + ((dl) this).field_g.field_i.length);
                            if (-1 >= (var1_int ^ -1)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((dl) this).field_g.field_l = ((dl) this).field_g.field_l + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((dl) this).field_g.field_l != ((dl) this).field_g.field_i.length) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((dl) this).field_g.field_i.length + " " + ((dl) this).field_b);
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((dl) this).finalize();
                            ((dl) this).field_c = 3;
                            // monitorexit var1
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((dl) this).finalize();
                            ((dl) this).field_c = ((dl) this).field_c + 1;
                            // monitorexit var2_ref
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 18: {
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

    final static hj a(gn param0, String param1, boolean param2, String param3) {
        int var4 = param0.c(param1, 3);
        int var5 = param0.a(var4, param3, param2);
        return ll.a(-1, var5, var4, param0);
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 >= (((dl) this).field_c ^ -1)) {
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
                    if (((dl) this).field_c == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (((dl) this).field_a == null) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((dl) this).field_a = ((dl) this).field_l.a(((dl) this).field_b, 0);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (0 == ((dl) this).field_a.field_d) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    if (((dl) this).field_a.field_d == 1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    ((dl) this).field_a = null;
                    return false;
                }
                case 13: {
                    if (param0 >= 57) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return false;
                }
                case 15: {
                    if (1 == ((dl) this).field_c) {
                        statePc = 17;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (null != ((dl) this).field_d) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((dl) this).field_d = ((dl) this).field_l.a(0, 443, ((dl) this).field_b.getHost());
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (0 == ((dl) this).field_d.field_d) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return false;
                }
                case 22: {
                    if (-2 == (((dl) this).field_d.field_d ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    ((dl) this).field_d = null;
                    return false;
                }
                case 24: {
                    if (((dl) this).field_f == null) {
                        statePc = 26;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (0 == ((dl) this).field_c) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((dl) this).field_f = (DataInputStream) ((dl) this).field_a.field_b;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((dl) this).field_c == 1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4 = (java.net.Socket) ((dl) this).field_d.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((dl) this).field_b.getFile() + "\n\n");
                        var3.write(sj.a((byte) -103, var5));
                        ((dl) this).field_f = new DataInputStream(var4.getInputStream());
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((dl) this).field_g.field_l = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var2 = (IOException) (Object) caughtException;
                    ((dl) this).finalize();
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (((dl) this).field_e != null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((dl) this).field_e = ((dl) this).field_l.a((byte) -28, 5, (Runnable) this);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (((dl) this).field_e.field_d == 0) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    return false;
                }
                case 40: {
                    if (1 == ((dl) this).field_e.field_d) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((dl) this).finalize();
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    return false;
                }
                case 42: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_h = null;
        int var1 = -122 % ((param0 - 50) / 38);
        field_m = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, da param1) {
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
            ki var13 = null;
            java.lang.reflect.Field var15 = null;
            ki var16 = null;
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
                        var12 = HoldTheLine.field_D;
                        var13 = (ki) (Object) sl.field_b.b((byte) 96);
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
                        if (var16.field_p <= var4) {
                            statePc = 20;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null != var13.field_k[var4]) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (-3 != var13.field_k[var4].field_d) {
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
                        if (-1 == var13.field_k[var4].field_d) {
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
                        if (null != var13.field_l[var4]) {
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
                        if (var13.field_l[var4].field_d == 2) {
                            statePc = 16;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var13.field_r[var4] = -6;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (-1 == (var13.field_l[var4].field_d ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 19: {
                        var3 = 1;
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 20: {
                        if (var3 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        var4 = param1.field_l;
                        param1.a((byte) -58, var16.field_n);
                        var5 = param0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var5 >= var16.field_p) {
                            statePc = 61;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (0 == var16.field_r[var5]) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        param1.f(111, var16.field_r[var5]);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            var6_int = var16.field_m[var5];
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
                            if (-2 != (var6_int ^ -1)) {
                                statePc = 30;
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
                            var15 = (java.lang.reflect.Field) var16.field_k[var5].field_b;
                            var17 = var15;
                            var17.setInt((Object) null, var16.field_j[var5]);
                            param1.f(111, 0);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 48 : (stateCaught_29 instanceof InvalidClassException ? 49 : (stateCaught_29 instanceof StreamCorruptedException ? 50 : (stateCaught_29 instanceof OptionalDataException ? 51 : (stateCaught_29 instanceof IllegalAccessException ? 52 : (stateCaught_29 instanceof IllegalArgumentException ? 53 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_29 instanceof SecurityException ? 55 : (stateCaught_29 instanceof IOException ? 56 : (stateCaught_29 instanceof NullPointerException ? 57 : (stateCaught_29 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var6_int ^ -1) != -3) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 48 : (stateCaught_30 instanceof InvalidClassException ? 49 : (stateCaught_30 instanceof StreamCorruptedException ? 50 : (stateCaught_30 instanceof OptionalDataException ? 51 : (stateCaught_30 instanceof IllegalAccessException ? 52 : (stateCaught_30 instanceof IllegalArgumentException ? 53 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_30 instanceof SecurityException ? 55 : (stateCaught_30 instanceof IOException ? 56 : (stateCaught_30 instanceof NullPointerException ? 57 : (stateCaught_30 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var26 = (java.lang.reflect.Field) var16.field_k[var5].field_b;
                            var8 = var26.getModifiers();
                            param1.f(111, 0);
                            param1.a((byte) -58, var8);
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
                            var27 = (java.lang.reflect.Field) var16.field_k[var5].field_b;
                            var8 = var27.getInt((Object) null);
                            param1.f(111, 0);
                            param1.a((byte) -58, var8);
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
                            if ((var6_int ^ -1) == -4) {
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
                            if (4 == var6_int) {
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
                            var28 = (java.lang.reflect.Method) var16.field_l[var5].field_b;
                            var8 = var28.getModifiers();
                            param1.f(111, 0);
                            param1.a((byte) -58, var8);
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
                            var29 = (java.lang.reflect.Method) var16.field_l[var5].field_b;
                            var25 = var16.field_q[var5];
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
                            var10 = var29.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 46;
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
                            if (!(var10 instanceof Number)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 48 : (stateCaught_41 instanceof InvalidClassException ? 49 : (stateCaught_41 instanceof StreamCorruptedException ? 50 : (stateCaught_41 instanceof OptionalDataException ? 51 : (stateCaught_41 instanceof IllegalAccessException ? 52 : (stateCaught_41 instanceof IllegalArgumentException ? 53 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 54 : (stateCaught_41 instanceof SecurityException ? 55 : (stateCaught_41 instanceof IOException ? 56 : (stateCaught_41 instanceof NullPointerException ? 57 : (stateCaught_41 instanceof Exception ? 58 : 59)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param1.f(param0 ^ 111, 1);
                            param1.a((byte) -84, ((Number) var10).longValue());
                            statePc = 60;
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
                            param1.f(111, 4);
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
                            param1.f(111, 2);
                            param1.c(param0 ^ 82, (String) var10);
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
                            param1.f(111, 0);
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
                        param1.f(param0 + 111, -10);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param1.f(111, -11);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param1.f(param0 + 111, -12);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param1.f(111, -13);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param1.f(param0 + 111, -14);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param1.f(111, -15);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param1.f(111, -16);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param1.f(param0 ^ 111, -17);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param1.f(111, -18);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param1.f(111, -19);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param1.f(param0 ^ 111, -20);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        var6_ref11 = caughtException;
                        param1.f(111, -21);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        var5++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 61: {
                        int discarded$1 = param1.a(var4, (byte) 47);
                        var16.d(param0 + 0);
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

    protected final void finalize() {
        if (!(null == ((dl) this).field_a)) {
            if (!(null == ((dl) this).field_a.field_b)) {
                try {
                    ((DataInputStream) ((dl) this).field_a.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((dl) this).field_a = null;
        }
        if (!(null == ((dl) this).field_d)) {
            if (!(null == ((dl) this).field_d.field_b)) {
                try {
                    ((java.net.Socket) ((dl) this).field_d.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((dl) this).field_d = null;
        }
        if (((dl) this).field_f != null) {
            try {
                ((dl) this).field_f.close();
            } catch (Exception exception) {
            }
            ((dl) this).field_f = null;
        }
        ((dl) this).field_e = null;
    }

    final th b(byte param0) {
        if (param0 < 65) {
            th discarded$0 = ((dl) this).b((byte) -33);
        }
        if (!(-4 != (((dl) this).field_c ^ -1))) {
            return ((dl) this).field_g;
        }
        return null;
    }

    dl(ib param0, java.net.URL param1, int param2) {
        ((dl) this).field_l = param0;
        ((dl) this).field_b = param1;
        ((dl) this).field_g = new th(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_n = "Quit to website";
        field_k = new int[14][];
        field_k[1] = new int[6];
        field_k[13] = new int[2];
        field_k[6] = new int[1];
        field_k[3] = new int[1];
        field_k[9] = new int[1];
        field_k[7] = new int[1];
        field_k[8] = new int[1];
        field_k[0] = new int[8];
        field_k[12] = new int[0];
        field_k[5] = new int[1];
        field_k[10] = new int[1];
        field_k[4] = new int[2];
        field_k[2] = new int[1];
        field_k[11] = new int[0];
        field_m = new float[]{1.0f, 2.0f, 2.0f, 2.0f};
    }
}
