/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class de {
    static ci field_d;
    static String field_a;
    static le field_c;
    static String field_b;

    final static void a(nk param0, byte param1) {
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
          nk var13 = null;
          fl var14 = null;
          Object var17 = null;
          java.lang.reflect.Field var17_ref = null;
          fl var18 = null;
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
          var12 = Chess.field_G;
          try {
            var14 = (fl) (vj.field_c.g(param1 ^ -18175));
            var18 = var14;
            if (var18 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var18.field_l > var4; var4++) {
              if (null != var14.field_w[var4]) {
                if (var14.field_w[var4].field_f == 2) {
                  var14.field_o[var4] = -5;
                }
                if (var14.field_w[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (null != var14.field_u[var4]) {
                if (var14.field_u[var4].field_f == 2) {
                  var14.field_o[var4] = -6;
                }
                if (var14.field_u[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_l;
            param0.d(var18.field_t, (byte) -81);
            for (var5 = 0; var5 < var18.field_l; var5++) {
              if (0 == var18.field_o[var5]) {
                try {
                  var6_int = var18.field_q[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var17_ref = (java.lang.reflect.Field) (var18.field_w[var5].field_b);
                      var21 = var17_ref;
                      var21.setInt((Object) null, var18.field_v[var5]);
                      param0.c(0, (byte) 75);
                    } else {
                      if (var6_int == 2) {
                        var29 = (java.lang.reflect.Field) (var18.field_w[var5].field_b);
                        var8 = var29.getModifiers();
                        param0.c(0, (byte) -96);
                        param0.d(var8, (byte) -81);
                      }
                    }
                  } else {
                    var28 = (java.lang.reflect.Field) (var18.field_w[var5].field_b);
                    var8 = var28.getInt((Object) null);
                    param0.c(0, (byte) 116);
                    param0.d(var8, (byte) -81);
                  }
                  if (3 == var6_int) {
                    var30 = (java.lang.reflect.Method) (var18.field_u[var5].field_b);
                    var27 = var18.field_r[var5];
                    var9 = new Object[var27.length];
                    for (var10_int = 0; var27.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var27[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var30.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.c(0, (byte) -67);
                    } else if (var10 instanceof Number) {
                      param0.c(1, (byte) -100);
                      param0.a(-98, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.c(4, (byte) -51);
                    } else {
                      param0.c(2, (byte) -90);
                      param0.a(-108, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var31 = (java.lang.reflect.Method) (var18.field_u[var5].field_b);
                      var8Lifetime1 = var31.getModifiers();
                      param0.c(0, (byte) 111);
                      param0.d(var8Lifetime1, (byte) -81);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.c(-10, (byte) -85);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.c(-11, (byte) 105);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.c(-12, (byte) -102);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.c(-13, (byte) 116);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.c(-14, (byte) -115);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.c(-15, (byte) 123);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.c(-16, (byte) 79);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.c(-17, (byte) 114);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.c(-18, (byte) -56);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.c(-19, (byte) -114);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.c(-20, (byte) -113);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.c(-21, (byte) 118);
                }
              } else {
                param0.c(var18.field_o[var5], (byte) 48);
              }
            }
            if (param1 != 67) {
              var13 = (nk) null;
              de.a((nk) null, (byte) -43);
            }
            param0.b(var4, (byte) -126);
            var18.c(-2193);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var2;
            stackIn_68_1 = new StringBuilder().append("de.B(");
            if (param0 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 > -101) {
          field_a = (String) null;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
          nk var3 = (nk) null;
          de.a((nk) null, (byte) -114);
        }
        if (pc.field_Mb != null) {
          sj.a(pc.field_Mb, (byte) 85);
        }
        if (null != pi.field_d) {
          pi.field_d.b(-65, param1);
        }
        k.a(param1, param0 ^ 100);
        if (pj.field_h != null) {
          pj.field_h.a(false, param1);
        }
        vk.a(false, param1);
    }

    final static void a(int param0) {
        if (qk.field_h == jc.field_f) {
          return;
        }
        if (0 <= jc.field_f) {
          ae.field_e[jc.field_f].c((byte) -57);
        }
        if (param0 != -31645) {
          return;
        }
        jc.field_f = qk.field_h;
        if (lc.field_q) {
          oc.field_p = null;
          lc.field_q = false;
        }
        nc.field_T = 0;
        wn.field_e = ma.field_D;
        if (mf.field_o) {
          cb.field_e = null;
          tg.field_e = new jc();
          wc.field_w = 0;
          mf.field_o = false;
          vk.field_b = 0;
        }
        if (ji.field_P) {
          fj.a(param0 + 31645);
          vf.a(true);
          pd.field_Lb = null;
          ji.field_P = false;
        }
    }

    static {
        field_a = "Owner";
        field_b = "This password contains repeated characters, and would be easy to guess";
    }
}
