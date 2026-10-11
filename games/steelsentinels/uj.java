/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj {
    static String field_h;
    static String field_c;
    static gh field_e;
    static int field_d;
    static boolean field_f;
    static String field_k;
    static String field_g;
    static String field_a;
    static String field_b;
    static String field_l;
    static int[] field_i;
    static gh field_j;

    final static int a(int param0, int param1) {
        int var2 = (param0 & 16760920) >> 16;
        int var3 = 255 & param0 >> 8;
        var2 = 255 - (-var2 + 255) / 2;
        int var4 = 255 & param0;
        var3 = 255 - (-var3 + 255) / 2;
        if (param1 < 90) {
          return -125;
        }
        var4 = -((255 - var4) / 2) + 255;
        return (var2 << 16) - (-(var3 << 8) - var4);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, wk param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        wk var20 = null;
        wk var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        var19 = SteelSentinels.field_G;
        try {
          if (pb.field_i > param1) {
            param7 = param7 - (-param1 + pb.field_i);
            param1 = pb.field_i;
          }
          if (pb.field_b < param7 + param1) {
            param7 = pb.field_b - param1;
          }
          if (pb.field_l > param2) {
            param4 = param4 - (pb.field_l - param2);
            param2 = pb.field_l;
          }
          if (param4 + param2 > pb.field_d) {
            param4 = -param2 + pb.field_d;
          }
          if (param7 > 0 &&
            0 < param4) {
            var22 = param6.g();
            if (param3 > -16) {
              var20 = (wk) null;
              uj.a(-28, -57, -101, (byte) 67, 90, 52, (wk) null, -77);
            }
            var31 = pb.field_g;
            var10 = pb.field_c;
            var11 = pb.field_j;
            var30 = new int[4];
            pb.b(var30);
            param6.d();
            pb.h(var30[0], var30[1], var30[2], var30[3]);
            var13 = param1 + param2 * param6.field_A;
            var14 = -param7 + param6.field_A;
            var26 = var22.field_E;
            var23 = var26;
            var15 = var23;
            for (var16 = param2; var16 < param2 + param4; var16++) {
              for (var17 = param1; param7 + param1 > var17; var17++) {
                var18 = var26[var13];
                if (var18 != 0 && (var17 > 0 &&
                  var15[var13 - 1] == 0 ||
                  var16 > 0 &&
                  var15[var13 - param6.field_A] == 0 ||
                  var17 < param6.field_A - 1 &&
                  var15[1 + var13] == 0 ||
                  !(var16 >= param6.field_F - 1) &&
                  var15[var13 + param6.field_A] == 0)) {
                  pb.e(var17, var16, param0, param5);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var22.a(-param6.field_D, -param6.field_H);
            pb.a(var31, var10, var11);
            pb.a(var30);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
          return;
        }
        field_h = null;
        field_g = null;
        field_k = null;
        field_e = null;
        field_j = null;
        field_c = null;
        field_a = null;
        field_l = null;
        field_i = null;
    }

    final static void a(boolean param0, kj param1) {
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
          ua var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          ua var17 = null;
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
          var12 = SteelSentinels.field_G;
          try {
            var13 = (ua) (rg.field_d.e(13058));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_B; var4++) {
              if (var13.field_y[var4] != null) {
                if (var13.field_y[var4].field_a == 2) {
                  var13.field_A[var4] = -5;
                }
                if (var13.field_y[var4].field_a == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_K[var4] != null) {
                if (var13.field_K[var4].field_a == 2) {
                  var13.field_A[var4] = -6;
                }
                if (var13.field_K[var4].field_a == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_p;
            param1.b(param0, var17.field_q);
            for (var5 = 0; var17.field_B > var5; var5++) {
              if (var17.field_A[var5] != 0) {
                param1.a((byte) 116, var17.field_A[var5]);
              } else {
                try {
                  var6_int = var17.field_s[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_y[var5].field_c);
                    var8 = var15.getInt((Object) null);
                    param1.a((byte) 124, 0);
                    param1.b(true, var8);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_y[var5].field_c);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_w[var5]);
                      param1.a((byte) 117, 0);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_y[var5].field_c);
                        var8 = var26.getModifiers();
                        param1.a((byte) 110, 0);
                        param1.b(true, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var27 = (java.lang.reflect.Method) (var17.field_K[var5].field_c);
                    var25 = var17.field_F[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var27.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.a((byte) 125, 0);
                    } else if (var10 instanceof Number) {
                      param1.a((byte) 120, 1);
                      param1.b(-28875, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.a((byte) 111, 4);
                    } else {
                      param1.a((byte) 108, 2);
                      param1.a((String) (var10), -120);
                    }
                  } else {
                    if (4 == var6_int) {
                      var28 = (java.lang.reflect.Method) (var17.field_K[var5].field_c);
                      var8Lifetime1 = var28.getModifiers();
                      param1.a((byte) 112, 0);
                      param1.b(true, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a((byte) 116, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a((byte) 122, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a((byte) 125, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a((byte) 110, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a((byte) 119, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a((byte) 127, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a((byte) 117, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a((byte) 127, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a((byte) 117, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a((byte) 114, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a((byte) 121, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.a((byte) 113, -21);
                }
              }
            }
            param1.f(-127, var4);
            var17.b(4);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var2;
            stackIn_68_1 = new StringBuilder().append("uj.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (vn.field_h != 0 - vc.field_c &&
          250 - vc.field_c != vn.field_h) {
        }
        if (param0 != 29) {
          wk var2 = (wk) null;
          uj.a(17, 76, 105, (byte) 99, -38, -93, (wk) null, 68);
        }
        vn.field_h = vn.field_h + 1;
    }

    static {
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_g = "Name";
        field_b = "Searching for opponents";
        field_f = false;
        field_l = "You are advised to complete all training missions before attempting this mission.";
        field_h = "Steel Sentinels";
        field_i = new int[]{84, 104, 29, 87, 29, 24, 24, 24, 86, 85, 47, 17, 3, 8, 31, 29, 16, 30, 17, -1};
    }
}
