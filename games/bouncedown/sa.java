/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa extends ai {
    int field_g;
    int field_m;
    static int field_k;
    static char[] field_j;
    int[][] field_o;
    long[][] field_l;
    int field_n;
    boolean field_i;
    String[][] field_h;

    final static void a(byte param0, ii param1) {
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
          String var13 = null;
          hh var14 = null;
          Object var16 = null;
          Object var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var18_ref = null;
          hh var19 = null;
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
          var17 = null;
          var16 = null;
          var22 = null;
          var23 = null;
          var12 = Bounce.field_N;
          try {
            var14 = (hh) (ob.field_c.a((byte) -83));
            var19 = var14;
            if (param0 != -97) {
              var13 = (String) null;
              sa.a((String) null, true, -1, (String) null, 30, 22, (String) null);
            }
            if (var19 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var19.field_j > var4; var4++) {
              if (null != var14.field_n[var4]) {
                if (var14.field_n[var4].field_f == 2) {
                  var14.field_i[var4] = -5;
                }
                if (var14.field_n[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (null != var14.field_s[var4]) {
                if (var14.field_s[var4].field_f == 2) {
                  var14.field_i[var4] = -6;
                }
                if (var14.field_s[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_h;
            param1.b(var19.field_g, (byte) 51);
            for (var5 = 0; var19.field_j > var5; var5++) {
              if (var19.field_i[var5] == 0) {
                try {
                  var6_int = var19.field_o[var5];
                  if (var6_int == 0) {
                    var28 = (java.lang.reflect.Field) (var19.field_n[var5].field_e);
                    var8 = var28.getInt((Object) null);
                    param1.a(0, (byte) 77);
                    param1.b(var8, (byte) 50);
                  } else {
                    if (var6_int != 1) {
                      if (2 == var6_int) {
                        var27 = (java.lang.reflect.Field) (var19.field_n[var5].field_e);
                        var8 = var27.getModifiers();
                        param1.a(0, (byte) 82);
                        param1.b(var8, (byte) 62);
                      }
                    } else {
                      var18_ref = (java.lang.reflect.Field) (var19.field_n[var5].field_e);
                      var20 = var18_ref;
                      var20.setInt((Object) null, var19.field_l[var5]);
                      param1.a(0, (byte) 85);
                    }
                  }
                  if (var6_int == 3) {
                    var29 = (java.lang.reflect.Method) (var19.field_s[var5].field_e);
                    var26 = var19.field_m[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var26.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var29.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.a(0, (byte) 52);
                    } else if (var10 instanceof Number) {
                      param1.a(1, (byte) 61);
                      param1.a(252186072, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.a(4, (byte) 100);
                    } else {
                      param1.a(2, (byte) 125);
                      param1.a(param0 ^ 159, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var30 = (java.lang.reflect.Method) (var19.field_s[var5].field_e);
                      var8Lifetime1 = var30.getModifiers();
                      param1.a(0, (byte) 80);
                      param1.b(var8Lifetime1, (byte) 111);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a(-10, (byte) 84);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a(-11, (byte) 58);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a(-12, (byte) 79);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a(-13, (byte) 71);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a(-14, (byte) 111);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a(-15, (byte) 63);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a(-16, (byte) 124);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a(-17, (byte) 119);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a(-18, (byte) 96);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a(-19, (byte) 68);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a(-20, (byte) 48);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.a(-21, (byte) 79);
                }
              } else {
                param1.a(var19.field_i[var5], (byte) 75);
              }
            }
            param1.b(var4, -1);
            var19.c(2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var2;
            stackIn_68_1 = new StringBuilder().append("sa.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, int param2, String param3, int param4, int param5, String param6) {
        ve var7 = null;
        RuntimeException var7_ref = null;
        ve var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 53) {
            stackIn_2_0 = -104;
            return stackIn_2_0;
          }
          var7 = new ve(param3);
          var8 = new ve(param0);
          stackIn_4_0 = vb.a(param1, param6, 49, param5, var7, param2, var8);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("sa.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          sa.a((String) null, true, -118, (String) null, -72, 70, (String) null);
        }
        field_j = null;
    }

    sa() {
    }

    static {
        field_j = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
