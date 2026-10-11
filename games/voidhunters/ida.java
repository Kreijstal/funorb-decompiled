/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ida extends mc {
    static kba field_x;
    static gj field_w;
    private ij field_v;

    final void a(boolean param0, shb param1) {
        if (!(param1 instanceof bl)) {
          throw new IllegalArgumentException();
        }
        bl var3 = (bl) (param1);
        this.field_v.a(var3, (byte) -55);
        var3.field_z = true;
        if (param0) {
          return;
        }
        try {
          var3.a(0, (shb) (this));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ida.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0) {
        wc var2;
        int var3;
        bl var4;
        int var5;
        var5 = VoidHunters.field_G;
        var2 = new wc(this.field_v);
        var3 = param0;
        var4 = (bl) (var2.c(570));
        while (var4 != null) {
          if (var4.field_z) {
            if (var3 >= var4.field_f) {
              var4 = (bl) (var2.a(19072));
              continue;
            }
            var3 = var4.field_f;
          }
          var4 = (bl) (var2.a(19072));
        }
        return var3;
    }

    final void g(byte param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(this.field_v);
        bl var3 = (bl) (var2.c(570));
        while (var3 != null) {
          var3.field_z = false;
          var3 = (bl) (var2.a(19072));
        }
        this.field_t = null;
        if (param0 != -17) {
          field_w = (gj) null;
        }
    }

    final bl g(int param0) {
        wc var2;
        bl var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = new wc(this.field_v);
        if (param0 != 0) {
          this.g((byte) 100);
        }
        var3 = (bl) (var2.c(param0 ^ 570));
        while (var3 != null) {
          if (var3.field_z) {
            return var3;
          }
          var3 = (bl) (var2.a(19072));
        }
        return null;
    }

    final static void a(boolean param0, String param1, int param2) {
        faa var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          hoa.a(param1, 0, param0);
          if (lob.field_a != null) {
            ukb.a(lob.field_a, (byte) 92);
          }
          if (param2 > -66) {
            var4 = (faa) null;
            ida.a((faa) null, (byte) -6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ida.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final shb d(int param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(this.field_v);
        bl var3 = (bl) (var2.c(570));
        while (var3 != null) {
          if (var3.field_z) {
            return var3.g((byte) -74);
          }
          var3 = (bl) (var2.a(19072));
        }
        if (param0 == 6093) {
          return null;
        }
        field_x = (kba) null;
        return null;
    }

    final void e(int param0) {
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(this.field_v);
        int var3 = 74 % ((53 - param0) / 55);
        bl var4 = (bl) (var2.c(570));
        while (var4 != null) {
          if (var4.j((byte) 55)) {
            var4.b(-3846);
          }
          var4 = (bl) (var2.a(19072));
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var7 = VoidHunters.field_G;
        if (this.field_q != null) {
          this.field_q.a(-93, (shb) (this), param0, param3, true);
        }
        if (param2 < 47) {
          this.d(51);
        }
        wc var5 = new wc(this.field_v);
        shb var6 = (shb) (var5.b((byte) 83));
        while (var6 != null) {
          var6.b(param0 + this.field_g, param1, 111, this.field_r + param3);
          var6 = (shb) (var5.a((byte) 108));
        }
    }

    public static void h(byte param0) {
        field_x = null;
        int var1 = -8 % ((param0 - 22) / 62);
        field_w = null;
    }

    final int i(int param0) {
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(this.field_v);
        int var3 = -2147483648;
        if (param0 > -90) {
          return 20;
        }
        bl var4 = (bl) (var2.c(570));
        while (var4 != null) {
          if (var4.field_z &&
            var3 < var4.field_h) {
            var3 = var4.field_h;
          }
          var4 = (bl) (var2.a(19072));
        }
        return var3;
    }

    public ida() {
        super(0, 0, fob.field_a, vi.field_p, (wwa) null, (sba) null);
        this.field_v = new ij();
    }

    final static void a(faa param0, byte param1) {
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
          mv var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          Object var17 = null;
          java.lang.reflect.Field var17_ref = null;
          mv var18 = null;
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
          var12 = VoidHunters.field_G;
          try {
            var13 = (mv) (tma.field_r.d(0));
            var18 = var13;
            if (var18 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var18.field_i; var4++) {
              if (var13.field_g[var4] != null) {
                if (var13.field_g[var4].field_f == 2) {
                  var13.field_k[var4] = -5;
                }
                if (0 == var13.field_g[var4].field_f) {
                  var3 = 1;
                }
              }
              if (null != var13.field_e[var4]) {
                if (var13.field_e[var4].field_f == 2) {
                  var13.field_k[var4] = -6;
                }
                if (var13.field_e[var4].field_f == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_e;
            param0.d(var18.field_d, 332614536);
            for (var5 = 0; var5 < var18.field_i; var5++) {
              if (var18.field_k[var5] == 0) {
                try {
                  var6_int = var18.field_h[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var18.field_g[var5].field_d);
                    var8 = var15.getInt((Object) null);
                    param0.c(0, 0);
                    param0.d(var8, 332614536);
                  } else {
                    if (var6_int != 1) {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var18.field_g[var5].field_d);
                        var8 = var26.getModifiers();
                        param0.c(0, 0);
                        param0.d(var8, 332614536);
                      }
                    } else {
                      var17_ref = (java.lang.reflect.Field) (var18.field_g[var5].field_d);
                      var19 = var17_ref;
                      var19.setInt((Object) null, var18.field_j[var5]);
                      param0.c(0, 0);
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var18.field_e[var5].field_d);
                    var25 = var18.field_f[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var10_int < var25.length; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.c(0, 0);
                    } else if (var10 instanceof Number) {
                      param0.c(0, 1);
                      param0.a(((Number) (var10)).longValue(), 111);
                    } else if (!(var10 instanceof String)) {
                      param0.c(0, 4);
                    } else {
                      param0.c(0, 2);
                      param0.a(true, (String) (var10));
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var18.field_e[var5].field_d);
                      var8Lifetime1 = var27.getModifiers();
                      param0.c(0, 0);
                      param0.d(var8Lifetime1, 332614536);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.c(0, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.c(0, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.c(0, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.c(0, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.c(0, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.c(0, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.c(0, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.c(0, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.c(0, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.c(0, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.c(0, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.c(0, -21);
                }
              } else {
                param0.c(0, var18.field_k[var5]);
              }
            }
            param0.g(1595, var4);
            var18.b(-3846);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("ida.O(");
            if (param0 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 19976) {
          return;
        }
        wc var2 = new wc(this.field_v);
        bl var3 = (bl) (var2.c(570));
        while (var3 != null) {
          if (var3.a(248)) {
            var3.b(-3846);
          }
          var3 = (bl) (var2.a(param0 ^ 1160));
        }
        this.field_t = (shb) ((Object) this.g(0));
    }

    static {
        field_x = new kba();
        field_w = new gj();
    }
}
