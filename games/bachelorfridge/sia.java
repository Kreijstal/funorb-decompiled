/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sia extends kj {
    private kv field_l;
    static kv field_j;
    static boolean field_h;
    static kv field_g;
    private int field_f;
    static java.awt.Canvas field_i;
    private ad field_k;

    public static void c(int param0) {
        field_j = null;
        if (param0 != 10371) {
          sia.c(13);
        }
        field_g = null;
        field_i = null;
    }

    sia(gj param0, int param1, int param2, ad param3) {
        super(param0, param1, param2);
        try {
          this.field_k = param3;
          this.field_f = 100;
          this.field_l = en.field_a.a();
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 < 21) {
          sia.c(-46);
        }
        int fieldTemp$0 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        return 0 >= fieldTemp$0 ? true : false;
    }

    final static void a(pf param0, int param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
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
          fka var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          Object var17 = null;
          java.lang.reflect.Field var17_ref = null;
          fka var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var17 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = BachelorFridge.field_y;
          try {
            var13 = (fka) (fd.field_z.b((byte) 90));
            var18 = var13;
            if (var18 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var18.field_k; var4++) {
              if (null != var13.field_i[var4]) {
                if (2 == var13.field_i[var4].field_f) {
                  var13.field_l[var4] = -5;
                }
                if (var13.field_i[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_j[var4]) {
                if (var13.field_j[var4].field_f == 2) {
                  var13.field_l[var4] = -6;
                }
                if (var13.field_j[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_g;
            param0.e(var18.field_n, -1615464796);
            for (var5 = 0; var5 < var18.field_k; var5++) {
              if (var18.field_l[var5] != 0) {
                param0.d(var18.field_l[var5], 0);
              } else {
                try {
                  var6_int = var18.field_g[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var18.field_i[var5].field_e);
                    var8 = var15.getInt((Object) null);
                    param0.d(0, 0);
                    param0.e(var8, -1615464796);
                  } else {
                    if (1 != var6_int) {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var18.field_i[var5].field_e);
                        var8 = var26.getModifiers();
                        param0.d(0, 0);
                        param0.e(var8, -1615464796);
                      }
                    } else {
                      var17_ref = (java.lang.reflect.Field) (var18.field_i[var5].field_e);
                      var19 = var17_ref;
                      var19.setInt((Object) null, var18.field_m[var5]);
                      param0.d(0, 0);
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var18.field_j[var5].field_e);
                    var25 = var18.field_f[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.d(0, 0);
                    } else if (var10 instanceof Number) {
                      param0.d(1, 0);
                      param0.b(1686281208, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.d(4, 0);
                    } else {
                      param0.d(2, 0);
                      param0.a((byte) -50, (String) (var10));
                    }
                  } else {
                    if (4 == var6_int) {
                      var27 = (java.lang.reflect.Method) (var18.field_j[var5].field_e);
                      var8Lifetime1 = var27.getModifiers();
                      param0.d(0, 0);
                      param0.e(var8Lifetime1, -1615464796);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.d(-10, 0);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.d(-11, 0);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.d(-12, 0);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.d(-13, 0);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.d(-14, 0);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.d(-15, 0);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.d(-16, 0);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.d(-17, 0);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.d(-18, 0);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.d(-19, 0);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.d(-20, 0);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.d(-21, 0);
                }
              }
            }
            if (param1 <= 66) {
              field_g = (kv) null;
            }
            param0.a(var4, 19);
            var18.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("sia.A(");
            if (param0 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kv var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = BachelorFridge.field_y;
        param2 -= 4;
        int var4 = 128;
        param0 -= 120;
        if (this.field_f > 80) {
          param0 = param0 + (-80 + this.field_f);
          var4 = (100 - this.field_f) * var4 / 20;
        }
        if (40 > this.field_f) {
          param0 = param0 - (-this.field_f + 40 >> 1);
          var4 = this.field_f * var4 / 40;
        }
        this.field_k.field_f.a(-10 + param0, 2048, param2 - 10, 2048, var4, (byte) 119);
        if (!param1) {
          this.field_k = (ad) null;
        }
        for (var5 = 0; 3 > var5; var5++) {
          var6 = 50 * vr.field_b + 65536 * var5 / 3;
          var7 = via.a(var6, (byte) 106);
          var8 = ft.a(var6, (byte) -128);
          var9 = this.field_l;
          var10 = var9.field_n >> 1;
          var11 = var9.field_o >> 1;
          var12 = 20;
          var8 = (var12 * var8 >> 16) + param0 + 60;
          var7 = param2 + 70 + (var7 * var12 >> 16);
          var9.c(var7 - (var10 >> 1), var8 - (var11 >> 1), var10, var11, var4);
        }
    }

    static {
    }
}
