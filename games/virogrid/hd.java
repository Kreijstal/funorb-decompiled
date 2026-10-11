/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd {
    static int field_d;
    static String field_c;
    static v field_b;
    static r field_g;
    static String field_a;
    static int field_e;
    static long field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3881) {
          hd.a(-33);
        }
        field_b = null;
        field_g = null;
        field_c = null;
    }

    final static void a(boolean param0, hg param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_65_0 = null;
          StringBuilder stackIn_65_1 = null;
          String stackIn_66_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
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
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          bf var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          bf var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var21 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var21 = null;
          var22 = null;
          var12 = Virogrid.field_F ? 1 : 0;
          try {
            var13 = (bf) (l.field_c.a((byte) -104));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = param0 ? 1 : 0;
            for (var4 = 0; var4 < var17.field_n; var4++) {
              if (var13.field_q[var4] != null) {
                if (var13.field_q[var4].field_a == 2) {
                  var13.field_l[var4] = -5;
                }
                if (var13.field_q[var4].field_a == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_r[var4] != null) {
                if (var13.field_r[var4].field_a == 2) {
                  var13.field_l[var4] = -6;
                }
                if (var13.field_r[var4].field_a == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_l;
            param1.a(var17.field_h, (byte) -42);
            for (var5 = 0; var5 < var17.field_n; var5++) {
              if (var17.field_l[var5] == 0) {
                try {
                  var6_int = var17.field_g[var5];
                  if (0 == var6_int) {
                    var15 = (java.lang.reflect.Field) (var17.field_q[var5].field_f);
                    var8 = var15.getInt((Object) null);
                    param1.a(0, -104);
                    param1.a(var8, (byte) -42);
                  } else {
                    if (1 == var6_int) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_q[var5].field_f);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_u[var5]);
                      param1.a(0, -104);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_q[var5].field_f);
                        var8 = var26.getModifiers();
                        param1.a(0, 124);
                        param1.a(var8, (byte) -42);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var27 = (java.lang.reflect.Method) (var17.field_r[var5].field_f);
                    var25 = var17.field_j[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var27.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.a(0, 112);
                    } else if (var10 instanceof Number) {
                      param1.a(1, -88);
                      param1.a((byte) 88, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.a(4, 88);
                    } else {
                      param1.a(2, 125);
                      param1.a((String) (var10), (byte) -102);
                    }
                  } else {
                    if (4 == var6_int) {
                      var28 = (java.lang.reflect.Method) (var17.field_r[var5].field_f);
                      var8Lifetime1 = var28.getModifiers();
                      param1.a(0, 54);
                      param1.a(var8Lifetime1, (byte) -42);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a(-10, 120);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a(-11, -65);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a(-12, 76);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a(-13, -73);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a(-14, 78);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a(-15, 54);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a(-16, -97);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a(-17, 59);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a(-18, 84);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a(-19, -97);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a(-20, -96);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.a(-21, 80);
                }
              } else {
                param1.a(var17.field_l[var5], 61);
              }
            }
            param1.b((byte) -111, var4);
            var17.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_65_0 = var2;
            stackIn_65_1 = new StringBuilder().append("hd.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_66_2 = "null";
            } else {
              stackIn_66_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3) {
        if (param1 >= -110) {
          hd.a(-117);
        }
        nn.a(89, param3);
        nb.a(param3, param0, param2, 5);
    }

    static {
        field_a = "Remove <%0> from ignore list";
        field_c = "Please select options in the following rows:  ";
        field_f = 20000000L;
    }
}
