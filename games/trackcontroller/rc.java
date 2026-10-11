/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rc {
    int[] field_b;
    int field_c;
    int field_a;
    java.awt.Image field_d;

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static void a(int param0, la param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_71_0 = null;
          StringBuilder stackIn_71_1 = null;
          String stackIn_72_2 = null;
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
          la var13 = null;
          kj var14 = null;
          Object var17 = null;
          java.lang.reflect.Field var17_ref = null;
          kj var18 = null;
          Object var19 = null;
          Object var20 = null;
          java.lang.reflect.Field var21 = null;
          Object var23 = null;
          Object var24 = null;
          byte[][] var27 = null;
          java.lang.reflect.Field var28 = null;
          java.lang.reflect.Field var29 = null;
          java.lang.reflect.Method var30 = null;
          java.lang.reflect.Method var31 = null;
          int var8Lifetime1;
          var19 = null;
          var20 = null;
          var17 = null;
          var23 = null;
          var24 = null;
          var12 = TrackController.field_F ? 1 : 0;
          try {
            var14 = (kj) (si.field_a.b(2));
            var18 = var14;
            if (var18 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var18.field_n; var4++) {
              if (null != var14.field_j[var4]) {
                if (var14.field_j[var4].field_f == 2) {
                  var14.field_i[var4] = -5;
                }
                if (var14.field_j[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (var14.field_v[var4] != null) {
                if (var14.field_v[var4].field_f == 2) {
                  var14.field_i[var4] = -6;
                }
                if (var14.field_v[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            if (param0 < 45) {
              var13 = (la) null;
              rc.a(92, (la) null);
            }
            var4 = param1.field_k;
            param1.b(false, var18.field_w);
            for (var5 = 0; var5 < var18.field_n; var5++) {
              if (var18.field_i[var5] != 0) {
                param1.a(var18.field_i[var5], (byte) -75);
              } else {
                try {
                  var6_int = var18.field_m[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var17_ref = (java.lang.reflect.Field) (var18.field_j[var5].field_e);
                      var21 = var17_ref;
                      var21.setInt((Object) null, var18.field_u[var5]);
                      param1.a(0, (byte) -117);
                    } else {
                      if (var6_int == 2) {
                        var29 = (java.lang.reflect.Field) (var18.field_j[var5].field_e);
                        var8 = var29.getModifiers();
                        param1.a(0, (byte) -100);
                        param1.b(false, var8);
                      }
                    }
                  } else {
                    var28 = (java.lang.reflect.Field) (var18.field_j[var5].field_e);
                    var8 = var28.getInt((Object) null);
                    param1.a(0, (byte) -122);
                    param1.b(false, var8);
                  }
                  if (3 == var6_int) {
                    var30 = (java.lang.reflect.Method) (var18.field_v[var5].field_e);
                    var27 = var18.field_p[var5];
                    var9 = new Object[var27.length];
                    for (var10_int = 0; var27.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var27[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var30.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.a(0, (byte) -114);
                    } else if (var10 instanceof Number) {
                      param1.a(1, (byte) -60);
                      param1.a(((Number) (var10)).longValue(), 2147483647);
                    } else if (!(var10 instanceof String)) {
                      param1.a(4, (byte) -91);
                    } else {
                      param1.a(2, (byte) -127);
                      param1.a((byte) -57, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var31 = (java.lang.reflect.Method) (var18.field_v[var5].field_e);
                      var8Lifetime1 = var31.getModifiers();
                      param1.a(0, (byte) -110);
                      param1.b(false, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a(-10, (byte) -122);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a(-11, (byte) -123);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a(-12, (byte) -88);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a(-13, (byte) -66);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a(-14, (byte) -112);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a(-15, (byte) -83);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a(-16, (byte) -62);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a(-17, (byte) -91);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a(-18, (byte) -79);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a(-19, (byte) -85);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a(-20, (byte) -97);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.a(-21, (byte) -67);
                }
              }
            }
            param1.a(var4, false);
            var18.a(-79);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_71_0 = var2;
            stackIn_71_1 = new StringBuilder().append("rc.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final void a(int param0) {
        if (param0 != -91) {
          java.awt.Graphics var3 = (java.awt.Graphics) null;
          this.a(-118, (java.awt.Graphics) null, -61, 99);
        }
        ll.a(this.field_b, this.field_c, this.field_a);
    }

    final static boolean a(int param0, kk param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -23) {
            stackIn_4_0 = param1.a((byte) 48);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
