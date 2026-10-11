/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dn extends pa {
    static wl field_I;
    private vo field_H;
    static vo field_D;
    static String field_G;
    static vn field_E;
    static String field_J;

    final void b(int param0, boolean param1, int param2) {
        int var8 = ZombieDawn.field_J;
        if (param2 == this.field_i &&
          param0 == this.field_n) {
          return;
        }
        int var4 = (-this.field_i + param2) / 2;
        int var5 = (-this.field_n + param0) / 2;
        cj var6 = new cj(this.field_H);
        ei var7 = (ei) (var6.c((byte) -119));
        while (var7 != null) {
          var7.field_k = var7.field_k + var4;
          var7.field_j = var7.field_j + var5;
          var7 = (ei) (var6.a((byte) 61));
        }
        this.field_i = param2;
        this.field_n = param0;
        if (param1) {
          field_G = (String) null;
        }
    }

    final ei c(boolean param0) {
        cj var2;
        ei var3;
        int var4;
        var4 = ZombieDawn.field_J;
        var2 = new cj(this.field_H);
        if (!param0) {
          this.j(112);
        }
        var3 = (ei) (var2.c((byte) -116));
        while (var3 != null) {
          if (var3.field_H) {
            return var3;
          }
          var3 = (ei) (var2.a((byte) 61));
        }
        return null;
    }

    public static void h(int param0) {
        field_D = null;
        field_E = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
          return;
        }
        field_G = null;
    }

    final static void a(am param0, int param1) {
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
          n var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          n var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = ZombieDawn.field_J;
          try {
            var13 = (n) (dj.field_l.b((byte) 26));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            if (param1 < 57) {
              dn.i(-44);
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_l; var4++) {
              if (null != var13.field_n[var4]) {
                if (var13.field_n[var4].field_f == 2) {
                  var13.field_q[var4] = -5;
                }
                if (var13.field_n[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_m[var4] != null) {
                if (var13.field_m[var4].field_f == 2) {
                  var13.field_q[var4] = -6;
                }
                if (var13.field_m[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_j;
            param0.h(-116, var17.field_o);
            for (var5 = 0; var17.field_l > var5; var5++) {
              if (var17.field_q[var5] != 0) {
                param0.i(var17.field_q[var5], 111);
              } else {
                try {
                  var6_int = var17.field_h[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_n[var5].field_d);
                    var8 = var15.getInt((Object) null);
                    param0.i(0, 64);
                    param0.h(102, var8);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_n[var5].field_d);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_j[var5]);
                      param0.i(0, 122);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_n[var5].field_d);
                        var8 = var26.getModifiers();
                        param0.i(0, 29);
                        param0.h(73, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_m[var5].field_d);
                    var25 = var17.field_i[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.i(0, 89);
                    } else if (var10 instanceof Number) {
                      param0.i(1, 12);
                      param0.a(((Number) (var10)).longValue(), 121);
                    } else if (!(var10 instanceof String)) {
                      param0.i(4, -119);
                    } else {
                      param0.i(2, 61);
                      param0.a(128, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_m[var5].field_d);
                      var8Lifetime1 = var27.getModifiers();
                      param0.i(0, -84);
                      param0.h(69, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.i(-10, 74);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.i(-11, -95);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.i(-12, -113);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.i(-13, -90);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.i(-14, 18);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.i(-15, -113);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.i(-16, 53);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.i(-17, -95);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.i(-18, -103);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.i(-19, -91);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.i(-20, 37);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.i(-21, 58);
                }
              }
            }
            param0.e(-120, var4);
            var17.b(-27598);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var2;
            stackIn_67_1 = new StringBuilder().append("dn.R(");
            if (param0 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static vn[] f(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        vn[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ZombieDawn.field_J;
        var1 = new vn[t.field_h];
        if (param0 != 43) {
          return (vn[]) null;
        }
        for (var2 = 0; var2 < t.field_h; var2++) {
          var3 = uf.field_n[var2] * bn.field_c[var2];
          var20 = vj.field_m[var2];
          if (!jc.field_r[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var9[var6_int] = j.field_a[eg.a((int) var20[var6_int], 255)];
            }
            var1[var2] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var21);
          } else {
            var22 = ka.field_f[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = hi.a(j.field_a[eg.a((int) var20[var7], 255)], eg.a((int) var22[var7], 255) << 24);
            }
            var1[var2] = (vn) ((Object) new cd(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var16));
          }
        }
        no.f((byte) -114);
        return var1;
    }

    final ga f(int param0) {
        cj var2;
        ei var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 > -2) {
          this.f(-10);
        }
        var2 = new cj(this.field_H);
        var3 = (ei) (var2.c((byte) -116));
        while (var3 != null) {
          if (var3.field_H) {
            return var3.d((byte) 35);
          }
          var3 = (ei) (var2.a((byte) 61));
        }
        return null;
    }

    final void g(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 > -122) {
          field_J = (String) null;
        }
        cj var2 = new cj(this.field_H);
        ei var3 = (ei) (var2.c((byte) -116));
        while (var3 != null) {
          if (var3.j(2634)) {
            var3.b(-27598);
          }
          var3 = (ei) (var2.a((byte) 61));
        }
        this.field_z = (ga) ((Object) this.c(true));
    }

    final void a(ga param0, boolean param1) {
        ei var3 = null;
        try {
          if (!(param0 instanceof ei)) {
            throw new IllegalArgumentException();
          }
          var3 = (ei) (param0);
          this.field_H.a(var3, -112);
          var3.field_H = param1 ? true : false;
          var3.a((byte) 107, (ga) (this));
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "dn.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -636330975) {
          this.j(-51);
        }
        cj var2 = new cj(this.field_H);
        ei var3 = (ei) (var2.c((byte) -123));
        while (var3 != null) {
          var3.field_H = false;
          var3 = (ei) (var2.a((byte) 61));
        }
        this.field_z = null;
    }

    final static boolean i(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -19301) {
          dn.h(28);
        }
        stackIn_7_0 = (fl.field_a >= 10) && (!i.field_Y) && (!ng.a((byte) -64));
        return stackIn_7_0;
    }

    final void e(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -36) {
          return;
        }
        cj var2 = new cj(this.field_H);
        ei var3 = (ei) (var2.c((byte) -125));
        while (var3 != null) {
          if (var3.e((byte) 28)) {
            var3.b(-27598);
          }
          var3 = (ei) (var2.a((byte) 61));
        }
    }

    public dn() {
        super(0, 0, pk.field_N, b.field_l, (io) null, (sk) null);
        this.field_H = new vo();
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          if (param1) {
            stackIn_3_0 = 57;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = el.field_k;
          while (n.field_r.length > var3_int) {
            var5 = la.field_b[var3_int];
            if (var5 >= 0) {
              var6 = sm.a(32564, true, n.field_r[var3_int]);
              var7 = im.field_d - (var6 >> 1);
              var4 = var4 + qb.field_i;
              if (bf.a(var7 - nb.field_m, 0, param2, var4, var6 + (nb.field_m << 1), (lb.field_Y << 1) + ma.field_k, param0)) {
                stackIn_11_0 = var5;
                return stackIn_11_0;
              }
              var4 = var4 + ((lb.field_Y << 1) + qb.field_i + ma.field_k);
            } else {
              var4 = var4 + mh.field_G;
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "dn.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (this.field_h != null) {
          this.field_h.a(16777215, true, param0, (ga) (this), param2);
        }
        if (param3 != 0) {
          return;
        }
        cj var5 = new cj(this.field_H);
        ga var6 = (ga) (var5.b((byte) -21));
        while (var6 != null) {
          var6.a(this.field_j + param0, param1, this.field_k + param2, param3 ^ 0);
          var6 = (ga) (var5.a(17));
        }
    }

    static {
        field_I = new wl();
        field_G = "Names cannot start or end with space or underscore";
        field_D = new vo();
        field_E = new vn(48, 48);
        field_J = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
