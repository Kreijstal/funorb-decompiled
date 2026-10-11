/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dk {
    static int field_a;
    static String field_b;
    static int[] field_c;

    final static int[] a(int param0, int param1, boolean param2) {
        if (param2) {
          field_c = (int[]) null;
        }
        int var3 = lm.a(param0, (byte) -125);
        int var4 = mf.a(param0, -128);
        int var5 = lm.a(param1, (byte) -118);
        int var6 = mf.a(param1, -19);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0) {
        il.a(4, 0);
        int var1 = 68 / ((-63 - param0) / 54);
    }

    final static void a(int param0) {
        bg.a(false);
        int var1 = -84 / ((15 - param0) / 63);
        vh.field_j = true;
        ca.field_b = true;
        bm.field_d.n(7920);
        vd.a(false, -536866817, hi.field_f);
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          field_a = -40;
        }
    }

    final static void a(byte param0, se param1) {
        try {
          int var6 = 0;
          int var11_int = 0;
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var5 = 0;
          int var7_int = 0;
          ClassNotFoundException var7 = null;
          InvalidClassException var7_ref = null;
          StreamCorruptedException var7_ref2 = null;
          OptionalDataException var7_ref3 = null;
          IllegalAccessException var7_ref4 = null;
          IllegalArgumentException var7_ref5 = null;
          java.lang.reflect.InvocationTargetException var7_ref6 = null;
          SecurityException var7_ref7 = null;
          IOException var7_ref8 = null;
          NullPointerException var7_ref9 = null;
          Exception var7_ref10 = null;
          Throwable var7_ref11 = null;
          int var9 = 0;
          Object[] var10 = null;
          Object var11 = null;
          ObjectInputStream var12 = null;
          int var13 = 0;
          ud var14 = null;
          Object var16 = null;
          Object var17 = null;
          java.lang.reflect.Field var17_ref = null;
          ud var18 = null;
          Object var19 = null;
          java.lang.reflect.Field var20 = null;
          Object var21 = null;
          Object var23 = null;
          byte[][] var26 = null;
          java.lang.reflect.Field var27 = null;
          java.lang.reflect.Field var28 = null;
          java.lang.reflect.Method var29 = null;
          java.lang.reflect.Method var30 = null;
          int var9Lifetime1;
          var19 = null;
          var17 = null;
          var16 = null;
          var21 = null;
          var23 = null;
          var13 = OrbDefence.field_D ? 1 : 0;
          try {
            var14 = (ud) (ab.field_h.b((byte) 114));
            var18 = var14;
            if (var18 == null) {
              return;
            }
            var3 = 87 % ((param0 - 65) / 32);
            var4 = 0;
            for (var5 = 0; var5 < var18.field_o; var5++) {
              if (var14.field_h[var5] != null) {
                if (var14.field_h[var5].field_a == 2) {
                  var14.field_m[var5] = -5;
                }
                if (var14.field_h[var5].field_a == 0) {
                  var4 = 1;
                }
              }
              if (var14.field_i[var5] != null) {
                if (var14.field_i[var5].field_a == 2) {
                  var14.field_m[var5] = -6;
                }
                if (0 == var14.field_i[var5].field_a) {
                  var4 = 1;
                }
              }
            }
            if (var4 != 0) {
              return;
            }
            var5 = param1.field_i;
            param1.b(var18.field_k, -1);
            for (var6 = 0; var6 < var18.field_o; var6++) {
              if (var18.field_m[var6] != 0) {
                param1.a(var18.field_m[var6], -17);
              } else {
                try {
                  var7_int = var18.field_l[var6];
                  if (var7_int != 0) {
                    if (var7_int != 1) {
                      if (2 == var7_int) {
                        var28 = (java.lang.reflect.Field) (var18.field_h[var6].field_g);
                        var9 = var28.getModifiers();
                        param1.a(0, -48);
                        param1.b(var9, -1);
                      }
                    } else {
                      var17_ref = (java.lang.reflect.Field) (var18.field_h[var6].field_g);
                      var20 = var17_ref;
                      var20.setInt((Object) null, var18.field_n[var6]);
                      param1.a(0, -36);
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var18.field_h[var6].field_g);
                    var9 = var27.getInt((Object) null);
                    param1.a(0, -127);
                    param1.b(var9, -1);
                  }
                  if (var7_int == 3) {
                    var30 = (java.lang.reflect.Method) (var18.field_i[var6].field_g);
                    var26 = var18.field_g[var6];
                    var10 = new Object[var26.length];
                    for (var11_int = 0; var26.length > var11_int; var11_int++) {
                      var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var11_int])));
                      var10[var11_int] = var12.readObject();
                    }
                    var11 = var30.invoke((Object) null, var10);
                    if (var11 == null) {
                      param1.a(0, -76);
                    } else if (var11 instanceof Number) {
                      param1.a(1, -62);
                      param1.a(((Number) (var11)).longValue(), -16943);
                    } else if (!(var11 instanceof String)) {
                      param1.a(4, -48);
                    } else {
                      param1.a(2, -26);
                      param1.a((String) (var11), -6528);
                    }
                  } else {
                    if (var7_int == 4) {
                      var29 = (java.lang.reflect.Method) (var18.field_i[var6].field_g);
                      var9Lifetime1 = var29.getModifiers();
                      param1.a(0, -120);
                      param1.b(var9Lifetime1, -1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a(-10, -16);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a(-11, -119);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a(-12, -123);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a(-13, -9);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a(-14, -99);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a(-15, -86);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a(-16, -73);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a(-17, -58);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var7_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a(-18, -96);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a(-19, -7);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var7_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a(-20, -108);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var7_ref11 = decompiledCaughtException;
                  param1.a(-21, -71);
                }
              }
            }
            param1.e(-18951, var5);
            var18.b(57);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5408) {
            dk.a(-113);
          }
          stackIn_3_0 = tj.a(false, param1 - 5408, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dk.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, ki param1, ki param2, ki param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.b(-1) &&
            param1.b((byte) 104, "commonui")) {
            if (param0 != 1) {
              field_a = -12;
            }
            if (param3.b(-1) &&
              param3.b((byte) 92, "commonui")) {
              if (!param2.b(param0 - 2)) {
                return false;
              }
              if (!param2.b((byte) -110, "button.gif")) {
                return false;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_b = "End Game";
    }
}
