/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md {
    static String field_b;
    static int field_a;

    final static void d(int param0) {
        if (param0 >= -86) {
          field_a = 92;
        }
        ef.field_tb = 0;
        rm.field_f = new eg(0);
        hc.field_u = mn.field_c;
        bg.field_f = -1;
    }

    final static void b(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        qn var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        bj var6_ref_bj = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hb var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != -10964) {
            field_b = (String) null;
          }
          var28 = e.field_c;
          var2 = var28.c(32);
          if (var2 == 0) {
            var3 = var28.a((byte) 25);
            var4 = (qn) (na.field_T.a(86));
            while (var4 != null) {
              if (var3 != var4.field_w) {
                var4 = (qn) (na.field_T.d(2123));
                continue;
              }
              break;
            }
            if (var4 == null) {
              dc.d(117);
              return;
            }
            var5 = var28.c(32);
            if (var5 != 0) {
              var6 = var4.field_o;
              in.field_e[0].field_a = false;
              in.field_e[0].field_g = qc.field_m;
              var7 = var4.field_s;
              in.field_e[0].field_b = null;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                in.field_e[var8_int].field_g = var28.d(true);
                in.field_e[var8_int].field_a = false;
                if (var28.c(param0 + 10996) != 1) {
                  in.field_e[var8_int].field_b = null;
                } else {
                  in.field_e[var8_int].field_b = var28.d(true);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_u = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_p = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_q = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.c(32);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.c(32);
                  var21 = in.field_e[var20].field_g;
                  var22 = var28.h((byte) -68);
                  var24 = var28.field_n;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = in.field_e[var20].field_b;
                    var10[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.f((byte) 52);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    im.a(var21, 61)) {
                    var8[1][var13] = qc.field_m;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.field_n = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.f((byte) 37);
                    }
                  }
                  if (var14 < var6 &&
                    !in.field_e[var20].field_a) {
                    in.field_e[var20].field_a = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = in.field_e[var20].field_b;
                    var10[2][var14] = var22;
                    var14++;
                    var28.field_n = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.f((byte) 100);
                    }
                  }
                }
              }
            }
            var4.field_t = true;
            var4.a(true);
            return;
          }
          if (1 == var2) {
            var3Lifetime1 = var28.a((byte) 25);
            var4_long = var28.h((byte) -68);
            var6_ref_bj = (bj) (lf.field_k.a(82));
            while (var6_ref_bj != null) {
              if (var6_ref_bj.field_p != var3Lifetime1) {
                var6_ref_bj = (bj) (lf.field_k.d(2123));
                continue;
              }
              break;
            }
            if (var6_ref_bj == null) {
              dc.d(108);
              return;
            }
            var6_ref_bj.field_v = var4_long;
            var6_ref_bj.a(true);
            return;
          }
          mb.a("HS1: " + ui.a(param0 ^ -10970), true, (Throwable) null);
          dc.d(102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "md.C(" + param0 + ')');
        }
    }

    final static void a(hb param0, byte param1) {
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
          dg var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          dg var17 = null;
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
          var12 = Confined.field_J ? 1 : 0;
          try {
            var13 = (dg) (af.field_cb.a(26));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_r; var4++) {
              if (null != var13.field_m[var4]) {
                if (var13.field_m[var4].field_g == 2) {
                  var13.field_u[var4] = -5;
                }
                if (var13.field_m[var4].field_g == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_q[var4]) {
                if (var13.field_q[var4].field_g == 2) {
                  var13.field_u[var4] = -6;
                }
                if (var13.field_q[var4].field_g == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_n;
            param0.d(-116, var17.field_t);
            for (var5 = 0; var5 < var17.field_r; var5++) {
              if (0 == var17.field_u[var5]) {
                try {
                  var6_int = var17.field_o[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_m[var5].field_f);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_v[var5]);
                      param0.f(94, 0);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_m[var5].field_f);
                        var8 = var28.getModifiers();
                        param0.f(117, 0);
                        param0.d(-121, var8);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_m[var5].field_f);
                    var8 = var27.getInt((Object) null);
                    param0.f(120, 0);
                    param0.d(-110, var8);
                  }
                  if (var6_int == 3) {
                    var29 = (java.lang.reflect.Method) (var17.field_q[var5].field_f);
                    var26 = var17.field_s[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var26.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var29.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.f(96, 0);
                    } else if (var10 instanceof Number) {
                      param0.f(104, 1);
                      param0.a(((Number) (var10)).longValue(), (byte) 110);
                    } else if (!(var10 instanceof String)) {
                      param0.f(94, 4);
                    } else {
                      param0.f(102, 2);
                      param0.a((String) (var10), -67);
                    }
                  } else {
                    if (4 == var6_int) {
                      var30 = (java.lang.reflect.Method) (var17.field_q[var5].field_f);
                      var8Lifetime1 = var30.getModifiers();
                      param0.f(90, 0);
                      param0.d(-126, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.f(95, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.f(100, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.f(103, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.f(88, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.f(100, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.f(103, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.f(114, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.f(93, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.f(115, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.f(106, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.f(125, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.f(97, -21);
                }
              } else {
                param0.f(99, var17.field_u[var5]);
              }
            }
            if (param1 <= 125) {
              md.b((byte) 97);
            }
            param0.e(26199, var4);
            var17.a(true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var2;
            stackIn_68_1 = new StringBuilder().append("md.G(");
            if (param0 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        int var1 = 84 % ((param0 - 33) / 48);
        field_b = null;
    }

    final static bn c(int param0) {
        if (param0 < 6) {
          md.b((byte) 101);
        }
        String var1 = mc.a(16);
        if (var1 != null &&
          var1.indexOf('@') >= 0) {
          var1 = "";
        }
        return new bn(mc.a(16), hf.l(50));
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hb var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        sf var12 = null;
        hb var13 = null;
        gd var14 = null;
        int[] var15 = null;
        Object var16 = null;
        gd var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param0 <= 85) {
            field_b = (String) null;
          }
          var13 = e.field_c;
          var2 = var13.c(32);
          if (var2 == 0) {
            var11 = ek.c(16317);
            var17 = var11;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((kg) ((Object) var5)).c(32);
            for (var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((kg) ((Object) var5)).f((byte) 61);
            }
            var16_ref = (gd) (ra.field_d.a(-120));
            if (var16_ref == null) {
              dc.d(105);
              return;
            }
            var16_ref.field_p = var3;
            var16_ref.field_s = var17[0];
            var16_ref.field_o = true;
            var16_ref.a(true);
            return;
          }
          if (1 == var2) {
            var12 = (sf) (sm.field_y.a(-125));
            if (var12 == null) {
              dc.d(118);
              return;
            }
            var12.a(true);
          } else {
            if (var2 != 2) {
              mb.a("A1: " + ui.a(10), true, (Throwable) null);
              dc.d(122);
            } else {
              var14 = (gd) (ra.field_d.a(121));
              if (var14 == null) {
                dc.d(126);
                return;
              }
              var14.field_p = ek.c(16317);
              var14.field_o = true;
              var14.field_s = var14.field_p[0];
              var14.a(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "md.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 >= -73) {
          md.d(-115);
        }
        stackIn_7_0 = (qc.field_n) && (!qn.field_v.field_B.field_z) && (qn.field_v.field_K == null);
        return stackIn_7_0;
    }

    static {
        field_b = "1 homing missile";
        field_a = 500;
    }
}
