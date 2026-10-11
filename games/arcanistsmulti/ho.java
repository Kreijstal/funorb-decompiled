/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ho {
    static long field_c;
    String[] field_b;
    String field_e;
    boolean field_h;
    int field_a;
    static eg field_g;
    static int[] field_i;
    boolean field_f;
    static String field_d;

    final static void a(int param0, ab param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_68_0 = null;
          StringBuilder stackIn_68_1 = null;
          String stackIn_69_2 = null;
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
          oh var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          oh var17 = null;
          Object var18 = null;
          Object var19 = null;
          java.lang.reflect.Field var20 = null;
          Object var22 = null;
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
          var22 = null;
          var23 = null;
          var12 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (param0 != -5534) {
              field_d = (String) null;
            }
            var13 = (oh) (la.field_b.b(12623));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_s; var4++) {
              if (var13.field_n[var4] != null) {
                if (2 == var13.field_n[var4].field_e) {
                  var13.field_j[var4] = -5;
                }
                if (0 == var13.field_n[var4].field_e) {
                  var3 = 1;
                }
              }
              if (var13.field_g[var4] != null) {
                if (var13.field_g[var4].field_e == 2) {
                  var13.field_j[var4] = -6;
                }
                if (var13.field_g[var4].field_e == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_g;
            param1.a(var17.field_m, (byte) -101);
            for (var5 = 0; var17.field_s > var5; var5++) {
              if (var17.field_j[var5] == 0) {
                try {
                  var6_int = var17.field_o[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_n[var5].field_g);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_p[var5]);
                      param1.f(0, (byte) -10);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_n[var5].field_g);
                        var8 = var28.getModifiers();
                        param1.f(0, (byte) -10);
                        param1.a(var8, (byte) -101);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_n[var5].field_g);
                    var8 = var27.getInt((Object) null);
                    param1.f(0, (byte) -37);
                    param1.a(var8, (byte) -101);
                  }
                  if (var6_int == 3) {
                    var29 = (java.lang.reflect.Method) (var17.field_g[var5].field_g);
                    var26 = var17.field_l[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var26.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var29.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.f(0, (byte) -66);
                    } else if (var10 instanceof Number) {
                      param1.f(1, (byte) -64);
                      param1.a(((Number) (var10)).longValue(), (byte) 78);
                    } else if (!(var10 instanceof String)) {
                      param1.f(4, (byte) -115);
                    } else {
                      param1.f(2, (byte) -118);
                      param1.a((String) (var10), 23333);
                    }
                  } else {
                    if (var6_int == 4) {
                      var30 = (java.lang.reflect.Method) (var17.field_g[var5].field_g);
                      var8Lifetime1 = var30.getModifiers();
                      param1.f(0, (byte) -102);
                      param1.a(var8Lifetime1, (byte) -101);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.f(-10, (byte) -115);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.f(-11, (byte) -85);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.f(-12, (byte) -106);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.f(-13, (byte) -60);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.f(-14, (byte) -25);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.f(-15, (byte) -70);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.f(-16, (byte) -69);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.f(-17, (byte) -36);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.f(-18, (byte) -82);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.f(-19, (byte) -65);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.f(-20, (byte) -118);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.f(-21, (byte) -27);
                }
              } else {
                param1.f(var17.field_j[var5], (byte) -67);
              }
            }
            param1.a(true, var4);
            var17.a(true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var2;
            stackIn_68_1 = new StringBuilder().append("ho.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 <= 36) {
          return;
        }
        ub.field_g = param1;
        af.field_Eb = param2;
    }

    final static void a(int param0) {
        oc.a(false);
        if (param0 != 0) {
          return;
        }
        ld.c((byte) 13);
        db.field_a = null;
        gb.a(14);
    }

    final static ho a(byte param0, String[] param1) {
        ho var2 = null;
        RuntimeException var2_ref = null;
        ho stackIn_2_0 = null;
        ho stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ho(false);
          var2.field_b = param1;
          if (param0 >= 82) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (ho) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ho.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String b(byte param0) {
        String var1 = "";
        if (null != wh.field_f) {
          var1 = wh.field_f.e(true);
        }
        if (0 == var1.length()) {
          var1 = gi.a(0);
        }
        int var2 = 101 / ((24 - param0) / 56);
        if (var1.length() == 0) {
          var1 = ob.field_ib;
        }
        return var1;
    }

    final static boolean a(byte param0) {
        int var1 = -61 / ((12 - param0) / 47);
        return bj.field_mb;
    }

    ho(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        if (param0 != 0) {
          field_d = (String) null;
        }
        field_g = null;
    }

    static {
        field_d = "<%0> cannot join; the game has started.";
    }
}
