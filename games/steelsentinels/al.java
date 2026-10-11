/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al {
    static String[] field_a;
    static int field_g;
    static String field_c;
    static hl field_i;
    static int field_d;
    static String field_e;
    static String[] field_f;
    static String field_b;
    static String field_h;

    abstract long a(byte param0);

    final static void a(boolean param0, java.awt.Component param1) {
        param1.addMouseListener(ub.field_e);
        param1.addMouseMotionListener(ub.field_e);
        if (!param0) {
          return;
        }
        try {
          param1.addFocusListener(ub.field_e);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "al.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
          field_a = (String[]) null;
        }
        return SceneWidget.field_hb;
    }

    final static RgbSprite[] a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 72) {
          al.a(-2);
        }
        return SteelSentinels.a(param0, param3, (byte) -62, 1, param2);
    }

    final int a(byte param0, long param1) {
        int var4 = -100 / ((param0 + 28) / 54);
        long var5 = this.a((byte) 120);
        if (var5 > 0L) {
          a.a((byte) 121, var5);
        }
        return this.a(param1, (byte) -97);
    }

    final static void a(pn param0, boolean param1, PacketBuffer param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          ua var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = SteelSentinels.obfuscationControl;
          try {
            if (param1) {
              al.a(-105, (byte) -107, 76, 3);
            }
            var18 = new ua();
            var18.field_B = param2.readUnsignedByte((byte) -80);
            var18.field_q = param2.readInt(0);
            var18.field_w = new int[var18.field_B];
            var18.field_F = new byte[var18.field_B][][];
            var18.field_K = new wj[var18.field_B];
            var18.field_A = new int[var18.field_B];
            var18.field_y = new wj[var18.field_B];
            var18.field_s = new int[var18.field_B];
            for (var5 = 0; var18.field_B > var5; var5++) {
              try {
                var6_int = param2.readUnsignedByte((byte) -117);
                if (0 != var6_int &&
                  1 != var6_int &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    4 == var6_int) {
                    var20 = param2.h(1);
                    var8 = param2.h(1);
                    var9 = param2.readUnsignedByte((byte) -84);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param2.h(1);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param2.readInt(0);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.readBytes(0, var21[var12_int], 28, var13);
                      }
                    }
                    var18.field_s[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var17 < var9) {
                      var12[var17] = Sprite.a(10126, var10[var17]);
                      var17++;
                    }
                    var18.field_K[var5] = param0.a(var8, (byte) 52, Sprite.a(10126, var20), var12);
                    var18.field_F[var5] = var21;
                  }
                } else {
                  var15 = param2.h(1);
                  dupTemp$1 = param2.h(1);
                  var16 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param2.readInt(0);
                  }
                  var18.field_s[var5] = var6_int;
                  var18.field_w[var5] = var9;
                  var18.field_y[var5] = param0.a(9, Sprite.a(10126, var15), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_A[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_A[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_A[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_A[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_A[var5] = -5;
              }
            }
            rg.field_d.addLast(3, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("al.A(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int[] param1, int param2, int[][] param3, int param4, int param5, int param6) {
        if (ua.field_p >= 30) {
          ua.field_p = ua.field_p + 1;
          return;
        }
        try {
          ua.field_t[ua.field_p][0] = param4;
          ua.field_t[ua.field_p][1] = param2;
          if (param0 < 44) {
            field_b = (String) null;
          }
          ua.field_t[ua.field_p][2] = param5;
          ua.field_t[ua.field_p][3] = param6;
          ua.field_C[ua.field_p] = param1;
          ua.field_I[ua.field_p] = param3;
          ua.field_p = ua.field_p + 1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "al.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    abstract void c(byte param0);

    final static e b(byte param0) {
        if (param0 != 73) {
          al.a(105, (int[]) null, -49, (int[][]) null, 72, 102, -29);
        }
        if (cb.field_j == mm.field_e) {
          throw new IllegalStateException();
        }
        if (cb.field_j != sn.field_p) {
          return null;
        }
        cb.field_j = mm.field_e;
        return qf.field_d;
    }

    abstract int a(long param0, byte param1);

    public static void b(int param0) {
        if (param0 != 30) {
          al.a(-15);
        }
        field_c = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    static {
        field_g = 0;
        field_c = "Honour";
        field_e = "Module slots: <%0>";
        field_b = "Press F10 to open Quick Chat.";
        field_f = new String[]{"OK"};
        field_h = "Cannot ordinarily be fired while your sentinel is in the air.";
    }
}
