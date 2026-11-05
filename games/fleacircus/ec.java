/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    volatile boolean field_h;
    ce field_f;
    volatile boolean field_g;
    static fh field_b;
    volatile la[] field_c;
    static String field_d;
    static String field_e;
    static String field_a;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 <= 116) {
          field_a = (String) null;
        }
    }

    final static void a(ih param0, boolean param1) {
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
          fg var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          fg var17 = null;
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
          var12 = fleas.field_A ? 1 : 0;
          try {
            var13 = (fg) (jk.field_m.c((byte) 47));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = param1 ? 1 : 0;
            for (var4 = 0; var17.field_k > var4; var4++) {
              if (null != var13.field_n[var4]) {
                if (2 == var13.field_n[var4].field_b) {
                  var13.field_r[var4] = -5;
                }
                if (0 == var13.field_n[var4].field_b) {
                  var3 = 1;
                }
              }
              if (var13.field_s[var4] != null) {
                if (2 == var13.field_s[var4].field_b) {
                  var13.field_r[var4] = -6;
                }
                if (var13.field_s[var4].field_b == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_i;
            param0.a(var17.field_v, (byte) -84);
            for (var5 = 0; var17.field_k > var5; var5++) {
              if (var17.field_r[var5] != 0) {
                param0.a(-11, var17.field_r[var5]);
              } else {
                try {
                  var6_int = var17.field_o[var5];
                  if (var6_int != 0) {
                    if (var6_int != 1) {
                      if (2 == var6_int) {
                        var15 = (java.lang.reflect.Field) (var17.field_n[var5].field_e);
                        var8 = var15.getModifiers();
                        param0.a(-11, 0);
                        param0.a(var8, (byte) -18);
                      }
                    } else {
                      var16_ref = (java.lang.reflect.Field) (var17.field_n[var5].field_e);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_p[var5]);
                      param0.a(-11, 0);
                    }
                  } else {
                    var26 = (java.lang.reflect.Field) (var17.field_n[var5].field_e);
                    var8 = var26.getInt((Object) null);
                    param0.a(-11, 0);
                    param0.a(var8, (byte) -58);
                  }
                  if (var6_int == 3) {
                    var27 = (java.lang.reflect.Method) (var17.field_s[var5].field_e);
                    var25 = var17.field_w[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var27.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.a(-11, 0);
                    } else if (var10 instanceof Number) {
                      param0.a(-11, 1);
                      param0.a(-83, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.a(-11, 4);
                    } else {
                      param0.a(-11, 2);
                      param0.a(127, (String) (var10));
                    }
                  } else {
                    if (4 == var6_int) {
                      var28 = (java.lang.reflect.Method) (var17.field_s[var5].field_e);
                      var8Lifetime1 = var28.getModifiers();
                      param0.a(-11, 0);
                      param0.a(var8Lifetime1, (byte) -32);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.a(-11, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.a(-11, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.a(-11, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.a(-11, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.a(-11, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.a(-11, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.a(-11, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.a(-11, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.a(-11, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.a(-11, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.a(-11, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.a(-11, -21);
                }
              }
            }
            param0.c(var4, -30532);
            var17.c(-1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var2;
            stackIn_67_1 = new StringBuilder().append("ec.C(");
            if (param0 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(hg param0, byte param1, int param2) {
        ih var3 = ud.field_b;
        var3.e(8, param2);
        if (param1 != 30) {
          return;
        }
        try {
          var3.a(-11, param0.field_m);
          var3.a(-11, param0.field_j);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ec.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void run() {
        int var1_int = 0;
        la var2 = null;
        int var4 = fleas.field_A ? 1 : 0;
        this.field_h = true;
        try {
          while (!this.field_g) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_c[var1_int];
              if (var2 != null) {
                var2.a();
              }
            }
            vh.a(10L, -108);
            aj.a((byte) -60, (Object) null, this.field_f);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          ud.a((String) null, (Throwable) ((Object) exception), 0);
        } finally {
          this.field_h = false;
        }
    }

    ec() {
        this.field_c = new la[2];
        this.field_g = false;
        this.field_h = false;
    }

    static {
        field_b = new fh(1, 2, 2, 0);
        field_d = "Hints (1/2)";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_a = "Start new levels";
    }
}
