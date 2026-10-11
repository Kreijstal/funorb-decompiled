/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rh extends rf {
    int field_l;
    int field_k;
    static String field_g;
    static char[] field_j;
    static qe field_h;
    static hl[] field_f;
    static int field_i;

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
          return;
        }
        field_f = null;
        field_g = null;
        field_h = null;
    }

    private rh() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        boolean stackIn_6_0 = false;
        var7 = 91 % ((param6 - 41) / 38);
        stackIn_6_0 = (param1 >= param3) && (param2 + param3 > param1) && (param4 <= param5) && (param0 + param4 > param5);
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = StarCannon.field_A;
        try {
          if (ki.field_l > param3) {
            param1 = param1 - (ki.field_l - param3);
            param3 = ki.field_l;
          }
          if (param0 < ki.field_e) {
            param2 = param2 - (-param0 + ki.field_e);
            param0 = ki.field_e;
          }
          if (param3 + param1 > ki.field_g) {
            param1 = -param3 + ki.field_g;
          }
          if (param0 + param2 > ki.field_i) {
            param2 = -param0 + ki.field_i;
          }
          if (!param5) {
            field_f = (hl[]) null;
          }
          if (0 < param1 &&
            param2 > 0) {
            var6_int = param3 + param0 * ki.field_j;
            var7 = ki.field_j - param1;
            for (param0 = -param2; param0 < 0; param0++) {
              for (param3 = -param1; param3 < 0; param3++) {
                var8 = ki.field_a[var6_int];
                if ((var8 & 65280) >> 8 > param4 &&
                  (16711680 & var8) >> 16 <= (var8 & 65280) >> 8) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (255 < var9) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = (var8 & 255) >> 3;
                  ki.field_a[var6_int] = cl.a(var11, cl.a(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var6), "rh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static hb a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        hb var8 = new hb(param7, param0, param2, param4, param3, param1);
        hi.field_f.b(101, var8);
        if (param5 != -1893600464) {
          rh.a(false);
        }
        hb.a(-16, param6, var8);
        return var8;
    }

    final static void a(ia param0, byte param1) {
        try {
          int var10_int = 0;
          RuntimeException stackIn_65_0 = null;
          StringBuilder stackIn_65_1 = null;
          String stackIn_66_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var5 = 0;
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
          va var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          va var17 = null;
          Object var18 = null;
          Object var19 = null;
          java.lang.reflect.Field var20 = null;
          Object var21 = null;
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
          var21 = null;
          var23 = null;
          var12 = StarCannon.field_A;
          try {
            var13 = (va) (ee.field_a.c(-3905));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var17.field_n > var4; var4++) {
              if (null != var13.field_p[var4]) {
                if (2 == var13.field_p[var4].field_b) {
                  var13.field_g[var4] = -5;
                }
                if (var13.field_p[var4].field_b == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_i[var4]) {
                if (var13.field_i[var4].field_b == 2) {
                  var13.field_g[var4] = -6;
                }
                if (var13.field_i[var4].field_b == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_g;
            param0.c((byte) -127, var17.field_k);
            for (var5 = 0; var17.field_n > var5; var5++) {
              if (var17.field_g[var5] == 0) {
                try {
                  var6_int = var17.field_r[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_p[var5].field_f);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_q[var5]);
                      param0.a(0, -61);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_p[var5].field_f);
                        var8 = var28.getModifiers();
                        param0.a(0, -112);
                        param0.c((byte) -86, var8);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_p[var5].field_f);
                    var8 = var27.getInt((Object) null);
                    param0.a(0, -122);
                    param0.c((byte) -118, var8);
                  }
                  if (var6_int == 3) {
                    var30 = (java.lang.reflect.Method) (var17.field_i[var5].field_f);
                    var26 = var17.field_l[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var26.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var30.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.a(0, -74);
                    } else if (var10 instanceof Number) {
                      param0.a(1, -79);
                      param0.a(true, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.a(4, -51);
                    } else {
                      param0.a(2, -53);
                      param0.b(false, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var29 = (java.lang.reflect.Method) (var17.field_i[var5].field_f);
                      var8Lifetime1 = var29.getModifiers();
                      param0.a(0, -64);
                      param0.c((byte) -79, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.a(-10, -108);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.a(-11, -108);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.a(-12, -73);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.a(-13, -91);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.a(-14, -58);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.a(-15, -74);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.a(-16, -70);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.a(-17, -94);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.a(-18, -76);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.a(-19, -115);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.a(-20, -66);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.a(-21, -81);
                }
              } else {
                param0.a(var17.field_g[var5], -92);
              }
            }
            param0.b((byte) -89, var4);
            var17.b(4);
            var5 = -107 % ((param1 + 16) / 37);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_65_0 = var2;
            stackIn_65_1 = new StringBuilder().append("rh.A(");
            if (param0 == null) {
              stackIn_66_2 = "null";
            } else {
              stackIn_66_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = new hl[8];
        field_j = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
