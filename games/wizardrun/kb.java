/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb extends gf {
    static o field_jb;

    final static void j(byte param0) {
        if (param0 != 63) {
          field_jb = (o) null;
        }
        tj.a(param0 + 3025, jg.f(1));
    }

    kb(wi param0, ub param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, mg param1) {
        try {
          int var10_int = 0;
          RuntimeException stackIn_67_0 = null;
          StringBuilder stackIn_67_1 = null;
          String stackIn_68_2 = null;
          Throwable decompiledCaughtException = null;
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
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          pk var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          pk var17 = null;
          Object var18 = null;
          Object var19 = null;
          java.lang.reflect.Field var20 = null;
          Object var21 = null;
          Object var23 = null;
          byte[][] var26 = null;
          java.lang.reflect.Field var27 = null;
          java.lang.reflect.Field var28 = null;
          java.lang.reflect.Method var29 = null;
          java.lang.reflect.Method var30 = null;
          int var8Lifetime1;
          var18 = null;
          var19 = null;
          var16 = null;
          var21 = null;
          var23 = null;
          var12 = wizardrun.field_H;
          try {
            var13 = (pk) (kj.field_d.b((byte) 60));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_r; var4++) {
              if (null != var13.field_l[var4]) {
                if (var13.field_l[var4].field_a == 2) {
                  var13.field_j[var4] = -5;
                }
                if (var13.field_l[var4].field_a == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_m[var4] != null) {
                if (var13.field_m[var4].field_a == 2) {
                  var13.field_j[var4] = -6;
                }
                if (var13.field_m[var4].field_a == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_m;
            param1.f(var17.field_i, 613003928);
            var5 = 0;
            if (param0 < 17) {
              kb.j((byte) -60);
            }
            while (var17.field_r > var5) {
              if (var17.field_j[var5] != 0) {
                param1.b((byte) 11, var17.field_j[var5]);
              } else {
                try {
                  var6_int = var17.field_t[var5];
                  if (0 != var6_int) {
                    if (1 == var6_int) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_l[var5].field_e);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_p[var5]);
                      param1.b((byte) 11, 0);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_l[var5].field_e);
                        var8 = var28.getModifiers();
                        param1.b((byte) 11, 0);
                        param1.f(var8, 613003928);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_l[var5].field_e);
                    var8 = var27.getInt((Object) null);
                    param1.b((byte) 11, 0);
                    param1.f(var8, 613003928);
                  }
                  if (var6_int == 3) {
                    var30 = (java.lang.reflect.Method) (var17.field_m[var5].field_e);
                    var26 = var17.field_k[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var10_int < var26.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var30.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.b((byte) 11, 0);
                    } else if (var10 instanceof Number) {
                      param1.b((byte) 11, 1);
                      param1.b(1290648728, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.b((byte) 11, 4);
                    } else {
                      param1.b((byte) 11, 2);
                      param1.a((String) (var10), false);
                    }
                  } else {
                    if (4 == var6_int) {
                      var29 = (java.lang.reflect.Method) (var17.field_m[var5].field_e);
                      var8Lifetime1 = var29.getModifiers();
                      param1.b((byte) 11, 0);
                      param1.f(var8Lifetime1, 613003928);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.b((byte) 11, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.b((byte) 11, -21);
                }
              }
              var5++;
            }
            param1.e(var4, -1182887024);
            var17.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var2;
            stackIn_67_1 = new StringBuilder().append("kb.EA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(ub param0, int param1) {
        try {
          super.c(param0, -119);
          if (param1 > -109) {
            field_jb = (o) null;
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kb.VB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 != 1) {
          field_jb = (o) null;
        }
        field_jb = null;
    }

    static {
    }
}
