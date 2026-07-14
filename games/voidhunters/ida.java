/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ida extends mc {
    static kba field_x;
    static gj field_w;
    private ij field_v;

    final void a(boolean param0, shb param1) {
        if (!(param1 instanceof bl)) {
            throw new IllegalArgumentException();
        }
        bl var3 = (bl) (Object) param1;
        ((ida) this).field_v.a((ksa) (Object) var3, (byte) -55);
        var3.field_z = true;
        if (param0) {
            return;
        }
        boolean discarded$0 = var3.a(0, (shb) this);
    }

    final int f(int param0) {
        wc var2 = null;
        int var3 = 0;
        bl var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var2 = new wc(((ida) this).field_v);
        var3 = param0;
        var4 = (bl) (Object) var2.c(570);
        L0: while (true) {
          if (var4 == null) {
            return var3;
          } else {
            L1: {
              if (!var4.field_z) {
                break L1;
              } else {
                if (var3 < var4.field_f) {
                  var3 = var4.field_f;
                  break L1;
                } else {
                  var4 = (bl) (Object) var2.a(19072);
                  continue L0;
                }
              }
            }
            var4 = (bl) (Object) var2.a(19072);
            continue L0;
          }
        }
    }

    final void g(byte param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        bl var3 = (bl) (Object) var2.c(570);
        while (var3 != null) {
            var3.field_z = false;
            var3 = (bl) (Object) var2.a(19072);
        }
        ((ida) this).field_t = null;
        if (param0 != -17) {
            field_w = null;
        }
    }

    final bl g(int param0) {
        wc var2 = null;
        bl var3 = null;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          var2 = new wc(((ida) this).field_v);
          if (param0 == 0) {
            break L0;
          } else {
            ((ida) this).g((byte) 100);
            break L0;
          }
        }
        var3 = (bl) (Object) var2.c(param0 ^ 570);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_z) {
              return var3;
            } else {
              var3 = (bl) (Object) var2.a(19072);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        hoa.a(param1, 0, param0);
        if (!(lob.field_a == null)) {
            ukb.a(lob.field_a, (byte) 92);
        }
        if (param2 > -66) {
            Object var4 = null;
            ida.a((faa) null, (byte) -6);
        }
    }

    final shb d(int param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        bl var3 = (bl) (Object) var2.c(570);
        while (var3 != null) {
            if (var3.field_z) {
                return var3.g((byte) -74);
            }
            var3 = (bl) (Object) var2.a(19072);
        }
        if (param0 == 6093) {
            return null;
        }
        field_x = null;
        return null;
    }

    final void e(int param0) {
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        int var3 = 74 % ((53 - param0) / 55);
        bl var4 = (bl) (Object) var2.c(570);
        while (var4 != null) {
            if (!(!var4.j((byte) 55))) {
                var4.b(-3846);
            }
            var4 = (bl) (Object) var2.a(19072);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var7 = VoidHunters.field_G;
        if (!(((ida) this).field_q == null)) {
            ((ida) this).field_q.a(-93, (shb) this, param0, param3, true);
        }
        if (param2 < 47) {
            shb discarded$0 = ((ida) this).d(51);
        }
        wc var5 = new wc(((ida) this).field_v);
        shb var6 = (shb) (Object) var5.b((byte) 83);
        while (var6 != null) {
            var6.b(param0 + ((ida) this).field_g, param1, 111, ((ida) this).field_r + param3);
            var6 = (shb) (Object) var5.a((byte) 108);
        }
    }

    public static void h(byte param0) {
        field_x = null;
        int var1 = -8 % ((param0 - 22) / 62);
        field_w = null;
    }

    final int i(int param0) {
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        int var3 = -2147483648;
        if (param0 > -90) {
            return 20;
        }
        bl var4 = (bl) (Object) var2.c(570);
        while (var4 != null) {
            if (var4.field_z) {
                if (var3 < var4.field_h) {
                    var3 = var4.field_h;
                }
            }
            var4 = (bl) (Object) var2.a(19072);
        }
        return var3;
    }

    public ida() {
        super(0, 0, fob.field_a, vi.field_p, (wwa) null, (sba) null);
        ((ida) this).field_v = new ij();
    }

    final static void a(faa param0, byte param1) {
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
            mv var13 = null;
            java.lang.reflect.Field var15 = null;
            mv var16 = null;
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
                        var12 = VoidHunters.field_G;
                        var13 = (mv) (Object) tma.field_r.d(0);
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
                        if (var4 >= var16.field_i) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (var13.field_g[var4] != null) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if ((var13.field_g[var4].field_f ^ -1) == -3) {
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
                        if (0 != var13.field_g[var4].field_f) {
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
                        if (null != var13.field_e[var4]) {
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
                        if ((var13.field_e[var4].field_f ^ -1) != -3) {
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
                        if (var13.field_e[var4].field_f == 0) {
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
                        var4 = param0.field_e;
                        param0.d(var16.field_d, 332614536);
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var5 >= var16.field_i) {
                            statePc = 60;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-1 == (var16.field_k[var5] ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        param0.c(0, var16.field_k[var5]);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 26: {
                        try {
                            var6_int = var16.field_h[var5];
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 32;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 47 : (stateCaught_26 instanceof InvalidClassException ? 48 : (stateCaught_26 instanceof StreamCorruptedException ? 49 : (stateCaught_26 instanceof OptionalDataException ? 50 : (stateCaught_26 instanceof IllegalAccessException ? 51 : (stateCaught_26 instanceof IllegalArgumentException ? 52 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_26 instanceof SecurityException ? 54 : (stateCaught_26 instanceof IOException ? 55 : (stateCaught_26 instanceof NullPointerException ? 56 : (stateCaught_26 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var6_int != 1) {
                                statePc = 29;
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
                            var15 = (java.lang.reflect.Field) var16.field_g[var5].field_d;
                            var17 = var15;
                            var17.setInt((Object) null, var16.field_j[var5]);
                            param0.c(0, 0);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 47 : (stateCaught_28 instanceof InvalidClassException ? 48 : (stateCaught_28 instanceof StreamCorruptedException ? 49 : (stateCaught_28 instanceof OptionalDataException ? 50 : (stateCaught_28 instanceof IllegalAccessException ? 51 : (stateCaught_28 instanceof IllegalArgumentException ? 52 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 53 : (stateCaught_28 instanceof SecurityException ? 54 : (stateCaught_28 instanceof IOException ? 55 : (stateCaught_28 instanceof NullPointerException ? 56 : (stateCaught_28 instanceof Exception ? 57 : 58)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-3 == (var6_int ^ -1)) {
                                statePc = 31;
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
                            var26 = (java.lang.reflect.Field) var16.field_g[var5].field_d;
                            var8 = var26.getModifiers();
                            param0.c(0, 0);
                            param0.d(var8, 332614536);
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
                            var27 = (java.lang.reflect.Field) var16.field_g[var5].field_d;
                            var8 = var27.getInt((Object) null);
                            param0.c(0, 0);
                            param0.d(var8, 332614536);
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
                            var28 = (java.lang.reflect.Method) var16.field_e[var5].field_d;
                            var8 = var28.getModifiers();
                            param0.c(0, 0);
                            param0.d(var8, 332614536);
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
                            var29 = (java.lang.reflect.Method) var16.field_e[var5].field_d;
                            var25 = var16.field_f[var5];
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
                            if (var10_int >= var25.length) {
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
                            param0.c(0, 1);
                            param0.a(((Number) var10).longValue(), 111);
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
                            param0.c(0, 4);
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
                            param0.c(0, 2);
                            param0.a(true, (String) var10);
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
                            param0.c(0, 0);
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
                        param0.c(0, -10);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.c(0, -11);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.c(0, -12);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.c(0, -13);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.c(0, -14);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.c(0, -15);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.c(0, -16);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.c(0, -17);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.c(0, -18);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.c(0, -19);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 57: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.c(0, -20);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        var6_ref11 = caughtException;
                        param0.c(0, -21);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$1 = param0.g(1595, var4);
                        var16.b(-3846);
                        if (param1 >= 77) {
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

    final void h(int param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 19976) {
            return;
        }
        wc var2 = new wc(((ida) this).field_v);
        bl var3 = (bl) (Object) var2.c(570);
        while (var3 != null) {
            if (var3.a(248)) {
                var3.b(-3846);
            }
            var3 = (bl) (Object) var2.a(param0 ^ 1160);
        }
        ((ida) this).field_t = (shb) (Object) ((ida) this).g(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new kba();
        field_w = new gj();
    }
}
