/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ml extends va {
    static r field_u;
    static int field_v;
    static String field_A;
    static int field_w;
    static String field_x;
    static int[] field_t;
    static r field_y;
    static int field_z;

    ml(int param0) {
        this(qc.field_x, param0);
    }

    ml(cc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_z, -1, 2147483647, false);
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        try {
          if (param0) {
            h.a(param1 + param3.field_o, 1, param3.field_t + param4, param3.field_n, param3.field_s);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ml.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6;
        var6 = 44 / ((param5 + 43) / 56);
        if (param1 >= ap.field_e &&
          ib.field_a >= param4 &&
          param3 >= ua.field_e &&
          cj.field_D >= param2) {
          bg.a(param0, 61, param4, param3, param1, param2);
        } else {
          hb.b(param4, param2, 94, param0, param3, param1);
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_u = null;
        field_t = null;
        field_A = null;
        if (param0 != -15) {
          field_u = (r) null;
        }
        field_y = null;
    }

    final static er[] a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        er var13 = null;
        er var14 = null;
        if (param0 != -13) {
          ml.a(34, -51, 103, 63, -22, 15);
        }
        int[] var16 = bi.field_l;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = bi.field_e;
        int var8 = bi.field_j;
        er var9 = new er(16, param4);
        var9.d();
        bi.e(0, 0, 16, param4, param1, param3);
        Object var10 = null;
        Object var11 = null;
        if (param2) {
          var13 = var9.c();
          var10 = var13;
          var13.d();
          bi.b(0, 0, 5, 0);
          bi.b(0, 1, 3, 0);
          bi.b(0, 2, 2, 0);
          bi.b(0, 3, 1, 0);
          bi.b(0, 4, 1, 0);
        }
        if (param5) {
          var14 = var9.c();
          var11 = var14;
          var14.d();
          bi.b(11, 0, 5, 0);
          bi.b(13, 1, 3, 0);
          bi.b(14, 2, 2, 0);
          bi.b(15, 3, 1, 0);
          bi.b(15, 4, 1, 0);
        }
        bi.a(var16, var7, var8);
        return new er[]{null, null, null, (er) (var10), var9, (er) (var11), null, null, null};
    }

    final static void a(mi param0, byte param1) {
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
          oc var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          oc var17 = null;
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
          var12 = Vertigo2.field_L ? 1 : 0;
          try {
            var13 = (oc) (mg.field_N.a((byte) 100));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            if (param1 > -2) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_n; var4++) {
              if (null != var13.field_t[var4]) {
                if (var13.field_t[var4].field_b == 2) {
                  var13.field_y[var4] = -5;
                }
                if (var13.field_t[var4].field_b == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_w[var4] != null) {
                if (var13.field_w[var4].field_b == 2) {
                  var13.field_y[var4] = -6;
                }
                if (var13.field_w[var4].field_b == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_u;
            param0.e(var17.field_p, 0);
            for (var5 = 0; var5 < var17.field_n; var5++) {
              if (0 != var17.field_y[var5]) {
                param0.f(var17.field_y[var5], -79);
              } else {
                try {
                  var6_int = var17.field_o[var5];
                  if (var6_int != 0) {
                    if (var6_int != 1) {
                      if (var6_int == 2) {
                        var15 = (java.lang.reflect.Field) (var17.field_t[var5].field_d);
                        var8 = var15.getModifiers();
                        param0.f(0, -112);
                        param0.e(var8, 0);
                      }
                    } else {
                      var16_ref = (java.lang.reflect.Field) (var17.field_t[var5].field_d);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_u[var5]);
                      param0.f(0, 107);
                    }
                  } else {
                    var26 = (java.lang.reflect.Field) (var17.field_t[var5].field_d);
                    var8 = var26.getInt((Object) null);
                    param0.f(0, -90);
                    param0.e(var8, 0);
                  }
                  if (var6_int == 3) {
                    var27 = (java.lang.reflect.Method) (var17.field_w[var5].field_d);
                    var25 = var17.field_q[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var27.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.f(0, 101);
                    } else if (var10 instanceof Number) {
                      param0.f(1, 107);
                      param0.a((byte) -126, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.f(4, -112);
                    } else {
                      param0.f(2, -65);
                      param0.a((byte) 0, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var28 = (java.lang.reflect.Method) (var17.field_w[var5].field_d);
                      var8Lifetime1 = var28.getModifiers();
                      param0.f(0, 119);
                      param0.e(var8Lifetime1, 0);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.f(-10, -76);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.f(-11, -128);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.f(-12, 79);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.f(-13, 127);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.f(-14, 96);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.f(-15, -57);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.f(-16, -60);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.f(-17, 117);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.f(-18, -99);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.f(-19, 88);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.f(-20, 91);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.f(-21, -75);
                }
              }
            }
            param0.c(var4, -123);
            var17.c(2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_71_0 = var2;
            stackIn_71_1 = new StringBuilder().append("ml.D(");
            if (param0 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_w = 0;
        field_x = "ESC - cancel this line";
        field_A = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_t = new int[8192];
    }
}
