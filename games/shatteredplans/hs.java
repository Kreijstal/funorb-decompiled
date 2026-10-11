/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class hs implements fo {
    int field_e;
    int field_h;
    static nf field_j;
    static int[] field_i;
    ln[] field_f;
    int field_d;
    int field_c;
    private int field_k;
    int field_b;
    static qf field_l;
    static String field_g;
    int field_a;

    private final void a(l param0, int param1) {
        int var3_int = 0;
        ln[] var8 = null;
        ln var11 = null;
        ln[] var9 = null;
        int var10 = 0;
        ln var12 = null;
        ln var6 = null;
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        int var5Lifetime1;
        try {
          og.a(-119, this.field_f, this.field_c, this.field_b);
          var3_int = nn.a(param0.field_e, 0);
          vf.a(this.field_c, var3_int, (int)(200.0 * rh.field_d / 2.0), true, param0.field_e, param0.field_j, this.field_f);
          var8 = param0.field_e;
          for (var5 = 0; var8.length > var5; var5++) {
            var11 = var8[var5];
            var11.e((byte) -126);
          }
          var9 = param0.field_e;
          var10 = param1;
          var5Lifetime1 = var10;
          while (var10 < var9.length) {
            var12 = var9[var10];
            var6 = var12;
            if (var12.field_D == null) {
              var6.field_D = new ln[]{};
            }
            var10++;
          }
          param0.a(param1 + 26253);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hs.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(l param0, int param1) {
        int var4 = 0;
        ln[] var3 = null;
        ln var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 < 0) {
            return;
          }
          var7 = param0.field_e;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            var5.a(param0.field_j, (byte) 82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("hs.V(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        ln var3;
        int var4;
        int var5;
        ln[] var6;
        int var7;
        int var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -11) {
          field_i = (int[]) null;
        }
        for (var2 = 0; this.field_f.length > var2; var2++) {
          if (this.field_f[var2] != null) {
            var3 = this.field_f[var2];
            var4 = var2 / this.field_c;
            stackIn_10_0 = (var4 % 2 != 0) ? 0 : 1;
            var5 = stackIn_10_0;
            var6 = new ln[6];
            if (var4 != 0 && (var5 == 0 ||
              var2 % this.field_c != 0)) {
              if (var5 == 0) {
                var7 = var2 - this.field_c;
              } else {
                var7 = var2 - 1 - this.field_c;
              }
              if (this.field_f[var7] != null) {
                var6[0] = this.field_f[var7];
              }
            }
            if (0 != var4 && (var5 != 0 ||
              0 != (var2 + 1) % this.field_c)) {
              if (var5 == 0) {
                var7Lifetime1 = -this.field_c + 1 + var2;
              } else {
                var7Lifetime1 = -this.field_c + var2;
              }
              if (this.field_f[var7Lifetime1] != null) {
                var6[1] = this.field_f[var7Lifetime1];
              }
            }
            var7Lifetime2 = var2 + 1;
            if (0 != var7Lifetime2 % this.field_c &&
              null != this.field_f[var7Lifetime2]) {
              var6[2] = this.field_f[var7Lifetime2];
            }
            if (-1 + this.field_b > var4 && (var5 != 0 ||
              (var2 + 1) % this.field_c != 0)) {
              if (var5 == 0) {
                var7Lifetime3 = var2 + this.field_c + 1;
              } else {
                var7Lifetime3 = this.field_c + var2;
              }
              if (null != this.field_f[var7Lifetime3]) {
                var6[3] = this.field_f[var7Lifetime3];
              }
            }
            if (var4 < this.field_b - 1 && (var5 == 0 ||
              var2 % this.field_c != 0)) {
              if (var5 == 0) {
                var7Lifetime4 = var2 + this.field_c;
              } else {
                var7Lifetime4 = this.field_c + var2 - 1;
              }
              if (null != this.field_f[var7Lifetime4]) {
                var6[4] = this.field_f[var7Lifetime4];
              }
            }
            var7Lifetime5 = var2 - 1;
            if (0 != var2 % this.field_c &&
              this.field_f[var7Lifetime5] != null) {
              var6[5] = this.field_f[var7Lifetime5];
            }
            var3.field_r = new jd[6];
            var3.field_r[0] = new jd(var3, var6[0], (ln) null, var3.field_A, (int)(-(0.5 * (200.0 * rh.field_d)) + (double)var3.field_S), 0);
            var3.field_r[1] = new jd(var3, var6[1], (ln) null, 100 + var3.field_A, (int)(-(0.25 * (rh.field_d * 200.0)) + (double)var3.field_S), 0);
            var3.field_r[2] = new jd(var3, var6[2], (ln) null, 100 + var3.field_A, (int)(0.25 * (rh.field_d * 200.0) + (double)var3.field_S), 0);
            var3.field_r[3] = new jd(var3, var6[3], (ln) null, var3.field_A, (int)(rh.field_d * 200.0 * 0.5 + (double)var3.field_S), 0);
            var3.field_r[4] = new jd(var3, var6[4], (ln) null, -100 + var3.field_A, (int)((double)var3.field_S + 0.25 * (rh.field_d * 200.0)), 0);
            var3.field_r[5] = new jd(var3, var6[5], (ln) null, -100 + var3.field_A, (int)((double)var3.field_S - 200.0 * rh.field_d * 0.25), 0);
            for (var8 = 0; 6 > var8; var8++) {
              var3.field_r[var8].field_g = (int)(0.5 * (rh.field_d * 200.0));
            }
          }
        }
    }

    final static void a(sl param0, byte param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_65_0 = null;
          StringBuilder stackIn_65_1 = null;
          String stackIn_66_2 = null;
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
          eq var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          eq var17 = null;
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
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var13 = (eq) (kc.field_b.d(0));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            if (param1 >= -127) {
              field_l = (qf) null;
            }
            for (var4 = 0; var4 < var17.field_l; var4++) {
              if (null != var13.field_q[var4]) {
                if (var13.field_q[var4].field_d == 2) {
                  var13.field_p[var4] = -5;
                }
                if (var13.field_q[var4].field_d == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_n[var4] != null) {
                if (var13.field_n[var4].field_d == 2) {
                  var13.field_p[var4] = -6;
                }
                if (var13.field_n[var4].field_d == 0) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.field_j;
            param0.e(11135, var17.field_j);
            for (var5 = 0; var17.field_l > var5; var5++) {
              if (var17.field_p[var5] == 0) {
                try {
                  var6_int = var17.field_m[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_q[var5].field_e);
                    var8 = var15.getInt((Object) null);
                    param0.c(0, (byte) -106);
                    param0.e(11135, var8);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_q[var5].field_e);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_r[var5]);
                      param0.c(0, (byte) -102);
                    } else {
                      if (2 == var6_int) {
                        var26 = (java.lang.reflect.Field) (var17.field_q[var5].field_e);
                        var8 = var26.getModifiers();
                        param0.c(0, (byte) -97);
                        param0.e(11135, var8);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var27 = (java.lang.reflect.Method) (var17.field_n[var5].field_e);
                    var25 = var17.field_h[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var27.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.c(0, (byte) -72);
                    } else if (var10 instanceof Number) {
                      param0.c(1, (byte) -99);
                      param0.b(-16426, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.c(4, (byte) -73);
                    } else {
                      param0.c(2, (byte) -86);
                      param0.a((String) (var10), (byte) 0);
                    }
                  } else {
                    if (var6_int == 4) {
                      var28 = (java.lang.reflect.Method) (var17.field_n[var5].field_e);
                      var8Lifetime1 = var28.getModifiers();
                      param0.c(0, (byte) -114);
                      param0.e(11135, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.c(-10, (byte) -57);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.c(-11, (byte) -59);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.c(-12, (byte) -120);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.c(-13, (byte) -76);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.c(-14, (byte) -127);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.c(-15, (byte) -119);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.c(-16, (byte) -65);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.c(-17, (byte) -68);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.c(-18, (byte) -69);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.c(-19, (byte) -70);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.c(-20, (byte) -109);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.c(-21, (byte) -74);
                }
              } else {
                param0.c(var17.field_p[var5], (byte) -74);
              }
            }
            param0.a(var4, -109);
            var17.b((byte) -78);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_65_0 = var2;
            stackIn_65_1 = new StringBuilder().append("hs.P(");
            if (param0 == null) {
              stackIn_66_2 = "null";
            } else {
              stackIn_66_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public l a(byte param0) throws jn {
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        l var8 = new l(pe.a((byte) 34, this.field_c), ls.a(this.field_b, 2), this.field_h, this.field_d);
        int var6Lifetime1;
        this.a(false, var8);
        this.a(var8, 0);
        int[] var14 = this.a(var8.field_j, var8.field_e, var8.field_c, 4, (byte) -84, 4, 4, (int[]) null, this.field_a);
        int[] var5 = this.a(var8.field_j, var8.field_e, var8.field_c, 2, (byte) -126, 16, 2, var14, this.field_e + this.field_a);
        int[] var12 = new int[this.field_e];
        int[] var10 = var12;
        int[] var4 = var10;
        for (var6 = 0; var6 < this.field_e; var6++) {
          var4[var6] = var5[this.field_a + var6];
        }
        this.a(3, var8, -126, var14);
        this.a(2, var8, 102, var12);
        var6Lifetime1 = 127 % ((param0 + 67) / 44);
        this.a((byte) 95, var14, var12, var8);
        this.a((byte) -108, var8);
        this.c(var8, 5);
        return var8;
    }

    private final void a(byte param0, int[] param1, int[] param2, l param3) throws jn {
        try {
          if (param0 != 95) {
            Random var6 = (Random) null;
            this.a((ln) null, (byte) 67, (Random) null);
          }
          this.a(param1, param3, 4);
          this.a(param3, param2, 0);
          this.b(param3, param0 ^ 92);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hs.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, l param1, int param2, int[] param3) {
        int var5_int = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var5_intLifetime1;
        try {
          for (var5_int = 0; param3.length > var5_int; var5_int++) {
            param1.field_e[param3[var5_int]].field_L = param0;
          }
          var5_intLifetime1 = -105 % ((param2 + 36) / 38);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hs.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
          ae.a((java.awt.Component) ((Object) param0), 18014);
          sb.a((byte) 89, (java.awt.Component) ((Object) param0));
          if (aj.field_b != null) {
            aj.field_b.a((java.awt.Component) ((Object) param0), 120);
          }
          int var2_int = 84 % ((param1 + 39) / 45);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hs.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(boolean param0, l param1) throws jn {
        ln stackIn_39_0 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ln[] var6 = null;
        int var7_int = 0;
        t var7 = null;
        ln var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        ln[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ln[] var6Lifetime1;
        int var5Lifetime1;
        int var6_intLifetime1;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var4Lifetime1;
        int var5Lifetime2;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = null;
          if (mh.field_h != null) {
            var4 = mh.field_h.length;
            var14 = new int[var4];
            var11 = var14;
            var10 = var11;
            var15 = var10;
            var12 = var15;
            var3 = var12;
            for (var5 = 0; var4 > var5; var5++) {
              var14[var5] = var5;
            }
            for (var5Lifetime2 = 0; var4 - 1 > var5Lifetime2; var5Lifetime2++) {
              var6_int = d.a((byte) -12, var5Lifetime2 + 1, var4 - 1, param1.field_j);
              var7_int = var15[var6_int];
              ((int[]) (var3))[var6_int] = var15[var5Lifetime2];
              var15[var5Lifetime2] = var7_int;
            }
          }
          var4Lifetime1 = this.field_b * this.field_c;
          var5Lifetime1 = 0;
          if (this.field_f != null) {
            var13 = this.field_f;
            var6 = var13;
            for (var7_intLifetime1 = 0; var7_intLifetime1 < var13.length; var7_intLifetime1++) {
              var8 = var13[var7_intLifetime1];
              if (var8 != null) {
                if (var8 != li.field_b) {
                  var5Lifetime1++;
                } else {
                  var4Lifetime1--;
                }
              }
            }
          } else {
            this.field_f = new ln[this.field_b * this.field_c];
          }
          param1.field_e = new ln[this.field_d];
          if (this.field_k < 50) {
            while (var5Lifetime1 < this.field_d) {
              var6_intLifetime1 = qf.a((byte) 110, this.field_f.length, param1.field_j);
              if (null != this.field_f[var6_intLifetime1]) {
                continue;
              }
              this.field_f[var6_intLifetime1] = this.a(var6_intLifetime1, this.field_c, this.field_b, 107, var5Lifetime1);
              var5Lifetime1++;
            }
          } else {
            while (var4Lifetime1 > this.field_d) {
              var6_intLifetime1 = qf.a((byte) 55, this.field_f.length, param1.field_j);
              if (null != this.field_f[var6_intLifetime1]) {
                continue;
              }
              var4Lifetime1--;
              this.field_f[var6_intLifetime1] = li.field_b;
            }
            var6_intLifetime1 = 0;
            for (var7_intLifetime2 = 0; this.field_f.length > var7_intLifetime2; var7_intLifetime2++) {
              if (null == this.field_f[var7_intLifetime2]) {
                this.field_f[var7_intLifetime2] = this.a(var7_intLifetime2, this.field_c, this.field_b, 123, var6_intLifetime1);
                var6_intLifetime1++;
              }
            }
          }
          var6Lifetime1 = new ln[this.field_d];
          if (param0) {
            return;
          }
          for (var7_intLifetime3 = 0; var7_intLifetime3 < this.field_f.length; var7_intLifetime3++) {
            stackIn_39_0 = this.field_f[var7_intLifetime3];
            if (stackIn_39_0 != null) {
              if (this.field_f[var7_intLifetime3] != li.field_b) {
                this.field_f[var7_intLifetime3].field_I = mh.field_h[((int[]) (var3))[this.field_f[var7_intLifetime3].field_p]];
                var6Lifetime1[this.field_f[var7_intLifetime3].field_p] = this.field_f[var7_intLifetime3];
              } else {
                this.field_f[var7_intLifetime3] = null;
              }
            }
          }
          param1.field_e = var6Lifetime1;
          var7 = new t(param1.field_e);
          var7.a(true, 1);
          this.a(-11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_49_0 = var3;
          stackIn_49_1 = new StringBuilder().append("hs.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    private final void a(l param0, int[] param1, int param2) {
        int var4_int = 0;
        int dupTemp$1 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var4_int = param2; param1.length > var4_int; var4_int++) {
            var5 = param0.field_e[param1[var4_int]];
            for (var6 = 0; var6 < 4; var6++) {
              var5.field_G[var6] = 1;
            }
            for (var6Lifetime1 = 0; 2 > var6Lifetime1; var6Lifetime1++) {
              dupTemp$1 = qf.a((byte) 124, 4, param0.field_j);
              var5.field_G[dupTemp$1] = var5.field_G[dupTemp$1] + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("hs.W(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(ln param0, byte param1, Random param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        int var5 = 0;
        java.awt.Canvas var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var4_int = 0; var4_int < 4; var4_int++) {
            param0.field_G[var4_int] = 2;
          }
          var4_intLifetime1 = 0;
          if (param1 < 66) {
            var6 = (java.awt.Canvas) null;
            hs.a((java.awt.Canvas) null, (byte) 94);
          }
          while (var4_intLifetime1 < 2) {
            dupTemp$2 = qf.a((byte) 44, 4, param2);
            param0.field_G[dupTemp$2] = param0.field_G[dupTemp$2] + 1;
            var4_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("hs.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void a(int[] param0, l param1, int param2) throws jn {
        int var4_int = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var4_int = 0; var4_int < param0.length; var4_int++) {
            var5 = param0[var4_int];
            var6 = param1.field_e[var5];
            this.a(var6, (byte) 84, param1.field_j);
          }
          this.a(1, 0, param0, param1, 2, (byte) 96, param2);
          this.a(4, 4, param0, param1, 4, (byte) 105, 12);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hs.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int[] param2, l param3, int param4, byte param5, int param6) throws jn {
        int dupTemp$1 = 0;
        int var11_int = 0;
        int var14_int = 0;
        int[] dupTemp$0 = null;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        ln var13_ref_ln = null;
        ln var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var8_int = 0;
          while (true) {
            if (var8_int >= param2.length) {
              var9 = 88 / ((37 - param5) / 55);
              return;
            }
            var19 = new int[4];
            var17 = var19;
            var9_ref_int__ = var17;
            for (var10 = 0; var10 < 4; var10++) {
              var19[var10] = param0;
            }
            for (var10 = 0; param4 > var10; var10++) {
              dupTemp$1 = qf.a((byte) 61, 4, param3.field_j);
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
            var10 = 0;
            for (var11_int = 0; var11_int < 4; var11_int++) {
              var10 = var10 + var19[var11_int];
            }
            var20 = nf.a(param3.field_c[param2[var8_int]], 3718);
            var18 = var20;
            var11 = var18;
            for (var12 = 1; var12 < param6; var12++) {
              var13_ref_ln = param3.field_e[var20[var12]];
              for (var14_int = 0; var14_int < 4; var14_int++) {
                var15 = var13_ref_ln.field_G[var14_int];
                if (var19[var14_int] < var15) {
                  var15 = var19[var14_int];
                }
                var9_ref_int__[var14_int] = var9_ref_int__[var14_int] - var15;
                var10 = var10 - var15;
              }
            }
            var12 = param1;
            {
              while (!(param6 <= var12)) {
                var13 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                L12: while (!(decompiledNaturalLoopExit0 = (4 <= var13))) {
                  if (param3.field_e[var20[var12]].field_G[var13] <= 0) {
                    var13++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  if (0 == var10) {
                    throw new jn("Insufficient resources to give production to each star. Close: " + param1 + ", Far: " + param6 + ", Minimum: " + param0 + ", Extra: " + param4 + ".");
                  }
                  do {
                    var13 = qf.a((byte) 55, 4, param3.field_j);
                  } while (var19[var13] == 0);
                  dupTemp$0 = param3.field_e[var20[var12]].field_G;
                  dupTemp$0[var13] = dupTemp$0[var13] + 1;
                  var9_ref_int__[var13] = var9_ref_int__[var13] - 1;
                  var10--;
                }
                var12++;
              }
              {
                stackIn_37_0 = (0 != param1) ? param1 : 1;
                var12 = stackIn_37_0;
                while (0 < var10) {
                  var13 = var11[d.a((byte) -12, var12, -1 + param6, param3.field_j)];
                  var14 = param3.field_e[var13];
                  var15 = qf.a((byte) 107, 4, param3.field_j);
                  if (qf.a((byte) 51, 2, param3.field_j) != 0) {
                    while (0 == var14.field_G[var15]) {
                      var15 = qf.a((byte) 11, 4, param3.field_j);
                    }
                  }
                  while (0 == var19[var15]) {
                    var15 = qf.a((byte) 111, 4, param3.field_j);
                  }
                  var14.field_G[var15] = var14.field_G[var15] + 1;
                  var10--;
                  var9_ref_int__[var15] = var9_ref_int__[var15] - 1;
                }
                var8_int++;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_51_0 = var8;
          stackIn_51_1 = new StringBuilder().append("hs.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void b(l param0, int param1) {
        int var4 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln[] var12 = null;
        int var7Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var12 = param0.field_e;
          for (var4 = 0; var4 < var12.length; var4++) {
            var5 = var12[var4];
            var6 = 0;
            for (var7 = 0; var7 < 4; var7++) {
              var6 = var6 + var5.field_G[var7];
            }
            if (var6 == 0) {
              var7Lifetime1 = qf.a((byte) 63, 100, param0.field_j);
              var8 = qf.a((byte) 78, 4, param0.field_j);
              var9 = qf.a((byte) 66, 3, param0.field_j);
              if (var9 == var8) {
                var9 = 3;
              }
              var10 = qf.a((byte) 32, 2, param0.field_j);
              if (var10 == var8 ||
                var10 == var9) {
                if (var8 != 2 &&
                  var9 != 2) {
                  stackIn_17_0 = 2;
                } else {
                  stackIn_17_0 = 3;
                }
                var10 = stackIn_17_0;
              }
              if (var7Lifetime1 >= 5) {
                if (var7Lifetime1 < 15) {
                  if (var7Lifetime1 >= 9) {
                    if (var7Lifetime1 >= 12) {
                      var5.field_G[var8] = 4;
                    } else {
                      var5.field_G[var8] = 3;
                      var5.field_G[var9] = 1;
                    }
                  } else {
                    var5.field_G[var8] = 2;
                    var5.field_G[var9] = 1;
                    var5.field_G[var10] = 1;
                  }
                } else {
                  if (var7Lifetime1 >= 30) {
                    if (var7Lifetime1 >= 50) {
                      var5.field_G[var8] = 1;
                    } else {
                      if (var7Lifetime1 >= 45) {
                        var5.field_G[var8] = 2;
                      } else {
                        var5.field_G[var8] = 1;
                        var5.field_G[var9] = 1;
                      }
                    }
                  } else {
                    if (25 <= var7Lifetime1) {
                      var5.field_G[var8] = 3;
                    } else {
                      var5.field_G[var8] = 2;
                      var5.field_G[var9] = 1;
                    }
                  }
                }
              } else {
                if (2 > var7Lifetime1) {
                  var5.field_G[var8] = 3;
                  var5.field_G[var9] = 1;
                  var5.field_G[var10] = 1;
                } else {
                  if (3 <= var7Lifetime1) {
                    var5.field_G[var8] = 5;
                  } else {
                    var5.field_G[var8] = 4;
                    var5.field_G[var9] = 1;
                  }
                }
              }
            }
          }
          if (param1 != 3) {
            hs.b(-112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("hs.Q(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, l param1) {
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var7Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var10 = param1.field_e;
          if (param0 > -70) {
            this.field_b = -95;
          }
          for (var4 = 0; var4 < var10.length; var4++) {
            var5 = var10[var4];
            if (var5.field_L != 3) {
              var6 = 0;
              for (var7 = 0; var7 < 4; var7++) {
                var6 = var6 + var5.field_G[var7];
              }
              var7Lifetime1 = var6 - 1;
              var8 = -1 + 2 * var6;
              var5.field_x = d.a((byte) -12, var7Lifetime1, var8, param1.field_j);
            } else {
              var5.field_x = 20;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hs.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final ln a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = param0 / param1;
        int var8 = -123 / ((52 - param3) / 52);
        int var7 = var6 % 2 == 0 ? 1 : 0;
        int var9 = var7 != 0 ? 100 : 200;
        var9 = 200 * (param0 - var6 * param1) + var9;
        int var10 = (int)(0.5 * (200.0 * rh.field_d));
        var10 = (int)((double)var6 * (0.75 * (rh.field_d * 200.0))) + var10;
        int var11 = 0;
        return new ln(param4, var9, var10, var11);
    }

    int[] a(Random param0, ln[] param1, int[][] param2, int param3, byte param4, int param5, int param6, int[] param7, int param8) throws jn {
        int var12_int = 0;
        int incrementValue$0 = 0;
        int var20 = 0;
        int var22 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_71_0 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ln var21 = null;
        int var23 = 0;
        int var24 = 0;
        l var25 = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var11Lifetime1;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var10_int = param1.length;
          var11 = 0;
          for (var12_int = 0; var12_int < var10_int; var12_int++) {
            var13_int = param1[var12_int].field_D.length;
            if (param6 <= var13_int &&
              var13_int <= param5) {
              var11++;
            }
          }
          var30 = new int[var11];
          var28 = var30;
          var12 = var28;
          var11Lifetime1 = 0;
          var26 = 0;
          var13_intLifetime1 = var26;
          while (var26 < var10_int) {
            var14 = param1[var26].field_D.length;
            if (param6 <= var14 &&
              param5 >= var14) {
              incrementValue$0 = var11Lifetime1;
              var11Lifetime1++;
              var12[incrementValue$0] = param1[var26].field_p;
            }
            var26++;
          }
          if (var11Lifetime1 < param8) {
            throw new jn("Not enough highly-connected systems!");
          }
          var29 = new int[param8];
          var27 = var29;
          var13 = var27;
          if (param7 != null) {
            stackIn_18_0 = param7.length;
          } else {
            stackIn_18_0 = 0;
          }
          var14Lifetime1 = stackIn_18_0;
          for (var15 = 0; var15 < var14Lifetime1; var15++) {
            var13[var15] = param7[var15];
          }
          for (var15Lifetime1 = var14Lifetime1; var15Lifetime1 < param8; var15Lifetime1++) {
            var16 = -1;
            while (var16 == -1) {
              var16 = var12[qf.a((byte) 63, var11Lifetime1, param0)];
              var17 = 0;
              while (var15Lifetime1 > var17) {
                if (~var29[var17] == ~var16) {
                  var16 = -1;
                  break;
                }
                var17++;
              }
            }
            var29[var15Lifetime1] = var16;
          }
          if (param4 >= -3) {
            var25 = (l) null;
            this.a((l) null, -72);
          }
          for (var15Lifetime2 = 0; var15Lifetime2 < var10_int; var15Lifetime2++) {
            for (var16Lifetime1 = var14Lifetime1; param8 > var16Lifetime1; var16Lifetime1++) {
              var17Lifetime1 = 0;
              var18 = -1;
              for (var20 = 0; var20 < var11Lifetime1; var20++) {
                var21 = param1[var30[var20]];
                var19 = 2147483647;
                for (var22 = 0; var22 < param8; var22++) {
                  var23 = param2[var21.field_p][var29[var22]];
                  if (~var22 != ~var16Lifetime1 &&
                    -1 != var23 &&
                    var23 < var19) {
                    var19 = var23;
                  }
                }
                if (var19 > var17Lifetime1) {
                  var17Lifetime1 = var19;
                  var18 = var21.field_p;
                }
              }
              var29[var16Lifetime1] = var18;
            }
          }
          var15Lifetime3 = param2[var29[0]][var29[1]];
          for (var16Lifetime2 = 0; var16Lifetime2 < param8; var16Lifetime2++) {
            for (var17Lifetime2 = var16Lifetime2 + 1; var17Lifetime2 < param8; var17Lifetime2++) {
              if (param2[var29[var16Lifetime2]][var29[var17Lifetime2]] < var15Lifetime3) {
                var15Lifetime3 = param2[var29[var16Lifetime2]][var29[var17Lifetime2]];
              }
            }
          }
          if (var15Lifetime3 < param3) {
            throw new jn("Start locations cannot be placed far enough apart!");
          }
          stackIn_71_0 = var13;
          return stackIn_71_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_74_0 = var10;
          stackIn_74_1 = new StringBuilder().append("hs.K(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param8).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          sl var2 = (sl) null;
          hs.a((sl) null, (byte) 120);
        }
        field_i = null;
        field_j = null;
        field_g = null;
        field_l = null;
    }

    hs(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = param1;
        this.field_d = param3;
        this.field_h = param2;
        this.field_a = param4;
        this.field_c = param0;
        this.field_e = -1 + this.field_a;
        if (this.field_c * this.field_b < this.field_d) {
          throw new RuntimeException("Requested starcount (" + this.field_d + ") is greater than map size (" + this.field_c * this.field_b + " hexes).");
        }
        this.field_k = this.field_b * (this.field_c * 100) / this.field_d;
    }

    static {
        field_g = "<%PROJECT_METAL> - (<%Resource0>) A <%project_metal> fortifies a system. The fleet strength of the <%glossary>system</col>'s garrison is treated as <%highlight>double when defending</col>. This project may be used on any system you control.";
    }
}
