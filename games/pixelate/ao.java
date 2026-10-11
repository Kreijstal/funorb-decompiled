/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ao implements Runnable {
    static sb field_e;
    static String field_i;
    static int field_c;
    static int field_d;
    volatile boolean field_a;
    volatile boolean field_f;
    cb field_g;
    volatile mm[] field_h;
    static String field_b;

    final static void a(pc param0, int param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_67_0 = null;
          StringBuilder stackIn_67_1 = null;
          String stackIn_68_2 = null;
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
          java.lang.reflect.Field var14 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          aj var16_ref = null;
          Object var17 = null;
          java.lang.reflect.Field var18 = null;
          Object var20 = null;
          Object var21 = null;
          byte[][] var24 = null;
          java.lang.reflect.Field var25 = null;
          java.lang.reflect.Method var26 = null;
          java.lang.reflect.Method var27 = null;
          int var8Lifetime1;
          var16 = null;
          var17 = null;
          var20 = null;
          var21 = null;
          var12 = Pixelate.field_H ? 1 : 0;
          try {
            var16_ref = (aj) (ma.field_o.c(1504642273));
            if (var16_ref == null) {
              return;
            }
            var3 = 0;
            var4 = 0;
            if (param1 != -20) {
              ao.a(-40, -96);
            }
            while (var4 < var16_ref.field_s) {
              if (null != var16_ref.field_l[var4]) {
                if (var16_ref.field_l[var4].field_b == 2) {
                  var16_ref.field_u[var4] = -5;
                }
                if (0 == var16_ref.field_l[var4].field_b) {
                  var3 = 1;
                }
              }
              if (var16_ref.field_v[var4] != null) {
                if (var16_ref.field_v[var4].field_b == 2) {
                  var16_ref.field_u[var4] = -6;
                }
                if (var16_ref.field_v[var4].field_b == 0) {
                  var3 = 1;
                }
              }
              var4++;
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_m;
            param0.d(var16_ref.field_p, -66);
            for (var5 = 0; var16_ref.field_s > var5; var5++) {
              if (var16_ref.field_u[var5] == 0) {
                try {
                  var6_int = var16_ref.field_r[var5];
                  if (var6_int != 0) {
                    if (var6_int != 1) {
                      if (var6_int == 2) {
                        var14 = (java.lang.reflect.Field) (var16_ref.field_l[var5].field_e);
                        var8 = var14.getModifiers();
                        param0.e(160, 0);
                        param0.d(var8, -46);
                      }
                    } else {
                      var15 = (java.lang.reflect.Field) (var16_ref.field_l[var5].field_e);
                      var18 = var15;
                      var18.setInt((Object) null, var16_ref.field_q[var5]);
                      param0.e(160, 0);
                    }
                  } else {
                    var25 = (java.lang.reflect.Field) (var16_ref.field_l[var5].field_e);
                    var8 = var25.getInt((Object) null);
                    param0.e(160, 0);
                    param0.d(var8, -124);
                  }
                  if (var6_int == 3) {
                    var26 = (java.lang.reflect.Method) (var16_ref.field_v[var5].field_e);
                    var24 = var16_ref.field_w[var5];
                    var9 = new Object[var24.length];
                    for (var10_int = 0; var24.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var26.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.e(160, 0);
                    } else if (var10 instanceof Number) {
                      param0.e(160, 1);
                      param0.a(false, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.e(160, 4);
                    } else {
                      param0.e(160, 2);
                      param0.b((byte) -41, (String) (var10));
                    }
                  } else {
                    if (4 == var6_int) {
                      var27 = (java.lang.reflect.Method) (var16_ref.field_v[var5].field_e);
                      var8Lifetime1 = var27.getModifiers();
                      param0.e(160, 0);
                      param0.d(var8Lifetime1, -45);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.e(160, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.e(160, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.e(160, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.e(160, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.e(160, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.e(160, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.e(160, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.e(160, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.e(160, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.e(160, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.e(160, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.e(160, -21);
                }
              } else {
                param0.e(160, var16_ref.field_u[var5]);
              }
            }
            param0.b(var4, (byte) 111);
            var16_ref.c(2779);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var2;
            stackIn_67_1 = new StringBuilder().append("ao.C(");
            if (param0 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet a(int param0) {
        if (bd.field_b != null) {
          return bd.field_b;
        }
        if (param0 != 13867) {
          return (java.applet.Applet) null;
        }
        return (java.applet.Applet) ((Object) ne.field_I);
    }

    final static void b(int param0) {
        if (null != wa.field_c) {
          wa.field_c.a((byte) -22);
        }
        if (null != cn.field_b) {
          cn.field_b.o(30);
        }
        int var1 = -72 % ((param0 - 48) / 43);
        hm.a((byte) -95);
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          field_b = (String) null;
        }
        field_i = null;
        field_e = null;
    }

    public final void run() {
        int var1_int = 0;
        mm var2 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.field_f = true;
        try {
          while (!this.field_a) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_h[var1_int];
              if (var2 == null) {
              } else {
                var2.b();
              }
            }
            vg.a(10L, (byte) 23);
            Object var5 = (Object) null;
            fm.a(this.field_g, (Object) null, (byte) -52);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          jo.a(1, (String) null, (Throwable) ((Object) exception));
        } finally {
          this.field_f = false;
        }
    }

    ao() {
        this.field_h = new mm[2];
        this.field_a = false;
        this.field_f = false;
    }

    final static void a(int param0, int param1) {
        pc var2 = aa.field_f;
        int var3 = 77 % ((29 - param0) / 46);
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        field_c = -1;
        field_i = "Game options changed (<%0>)";
        field_b = "Unfortunately you are not eligible to create an account.";
    }
}
