/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static boolean field_g;
    static String field_h;
    static boolean field_d;
    private int[][] field_i;
    static String field_f;
    static pb[] field_a;
    static wk field_e;
    private int field_c;
    private int field_b;

    final int a(int param0, int param1) {
        int var3 = 64 % ((param1 + 51) / 53);
        if (null != this.field_i) {
          param0 = (int)((long)param0 * (long)this.field_c / (long)this.field_b);
        }
        return param0;
    }

    final static void a(boolean param0) {
        qh.b(-21923);
        if (!param0) {
          return;
        }
        rh.a(4, (byte) -72);
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        if (param0 < 52) {
          field_a = (pb[]) null;
        }
        var1_ref = pk.field_e;
        synchronized (var1_ref) {
          if (di.field_a == q.field_c) {
            return false;
          }
          gi.field_f = sf.field_d[di.field_a];
          uc.field_b = ac.field_i[di.field_a];
          di.field_a = 127 & di.field_a + 1;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final byte[] a(int param0, byte[] param1) {
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        var12 = stellarshard.field_B;
        try {
          var3_int = -69 % ((17 - param0) / 59);
          if (this.field_i != null) {
            var4 = (int)((long)param1.length * (long)this.field_c / (long)this.field_b) + 14;
            var17 = new int[var4];
            var15 = var17;
            var5 = var15;
            var6 = 0;
            var7 = 0;
            for (var8 = 0; var8 < param1.length; var8++) {
              var9 = param1[var8];
              var19 = this.field_i[var7];
              for (var11 = 0; var11 < 14; var11++) {
                var5[var11 + var6] = var5[var11 + var6] + var19[var11] * var9;
              }
              var7 = var7 + this.field_c;
              var11Lifetime1 = var7 / this.field_b;
              var6 = var6 + var11Lifetime1;
              var7 = var7 - var11Lifetime1 * this.field_b;
            }
            param1 = new byte[var4];
            var13 = 0;
            var8Lifetime1 = var13;
            while (var4 > var13) {
              var9Lifetime1 = 32768 + var17[var13] >> 16;
              if (-128 > var9Lifetime1) {
                param1[var13] = (byte)-128;
              } else {
                if (127 >= var9Lifetime1) {
                  param1[var13] = (byte)var9Lifetime1;
                } else {
                  param1[var13] = (byte)127;
                }
              }
              var13++;
            }
          }
          stackIn_17_0 = (byte[]) (param1);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("qh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (this.field_i != null) {
          param0 = (int)((long)this.field_c * (long)param0 / (long)this.field_b) + 6;
        }
        if (param1 != -10689) {
          this.a(121, 34);
        }
        return param0;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -15520) {
          field_f = (String) null;
        }
        field_e = null;
        field_h = null;
        field_a = null;
    }

    final static void b(int param0) {
        na.field_d.e((byte) 109);
        if (param0 != -21923) {
          return;
        }
        if (qf.field_d == null) {
          qf.field_d = new ql(na.field_d, ii.field_F);
        }
        na.field_d.a((byte) 72, (rj) (qf.field_d));
    }

    final static void a(int param0, ha param1) {
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
          lb var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          lb var17 = null;
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
          var12 = stellarshard.field_B;
          try {
            var13 = (lb) (oc.field_c.b(-121));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            if (param0 < 84) {
              qh.a(false);
            }
            for (var4 = 0; var17.field_s > var4; var4++) {
              if (null != var13.field_r[var4]) {
                if (var13.field_r[var4].field_f == 2) {
                  var13.field_p[var4] = -5;
                }
                if (var13.field_r[var4].field_f == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_q[var4]) {
                if (var13.field_q[var4].field_f == 2) {
                  var13.field_p[var4] = -6;
                }
                if (0 == var13.field_q[var4].field_f) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_k;
            param1.b(0, var17.field_l);
            for (var5 = 0; var17.field_s > var5; var5++) {
              if (var17.field_p[var5] != 0) {
                param1.a(false, var17.field_p[var5]);
              } else {
                try {
                  var6_int = var17.field_k[var5];
                  if (0 == var6_int) {
                    var15 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                    var8 = var15.getInt((Object) null);
                    param1.a(false, 0);
                    param1.b(0, var8);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_n[var5]);
                      param1.a(false, 0);
                    } else {
                      if (2 == var6_int) {
                        var26 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                        var8 = var26.getModifiers();
                        param1.a(false, 0);
                        param1.b(0, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_q[var5].field_b);
                    var25 = var17.field_m[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.a(false, 0);
                    } else if (var10 instanceof Number) {
                      param1.a(false, 1);
                      param1.a((byte) 120, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.a(false, 4);
                    } else {
                      param1.a(false, 2);
                      param1.b((String) (var10), -9799);
                    }
                  } else {
                    if (4 == var6_int) {
                      var27 = (java.lang.reflect.Method) (var17.field_q[var5].field_b);
                      var8Lifetime1 = var27.getModifiers();
                      param1.a(false, 0);
                      param1.b(0, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.a(false, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.a(false, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.a(false, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.a(false, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.a(false, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.a(false, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.a(false, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.a(false, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.a(false, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.a(false, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.a(false, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.a(false, -21);
                }
              }
            }
            param1.c(var4, (byte) -3);
            var17.c(20);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_71_0 = var2;
            stackIn_71_1 = new StringBuilder().append("qh.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qh(int param0, int param1) {
        int var4 = 0;
        int var3;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param0 == param1) {
          return;
        }
        var3 = fe.a(-102, param0, param1);
        param0 = param0 / var3;
        param1 = param1 / var3;
        this.field_b = param0;
        this.field_i = new int[param0][14];
        this.field_c = param1;
        for (var4 = 0; var4 < param0; var4++) {
          var5 = this.field_i[var4];
          var6 = (double)var4 / (double)param0 + 6.0;
          var8 = (int)Math.floor(1.0 + (-7.0 + var6));
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(7.0 + var6);
          if (var9 > 14) {
            var9 = 14;
          }
          var10 = (double)param1 / (double)param0;
          while (var8 < var9) {
            var12 = (-var6 + (double)var8) * 3.141592653589793;
            var14 = var10;
            if (-0.0001 > var12 ||
              0.0001 < var12) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (0.54 + Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46);
            var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
            var8++;
          }
        }
        return;
    }

    static {
        field_f = "Waiting for music";
        field_h = "Ion cannon";
        field_g = false;
    }
}
