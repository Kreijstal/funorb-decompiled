/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jn extends fb {
    private vb field_O;
    static char[] field_M;
    private int field_N;
    static byte[] field_P;

    final void a(int param0, int param1, mf param2, int param3) {
        try {
          if (param1 >= -6) {
            this.g(110);
          }
          this.field_N = this.field_N + 1;
          super.a(param0, -10, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jn.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(double[] param0, int param1, int param2) {
        double var3_double = param0[param1];
        if (param2 != 16801) {
          jn.e((byte) 65);
        }
        double var5 = param0[param1 + 1];
        double var7 = param0[2 + param1];
        double var9 = var3_double * var3_double + var5 * var5 + var7 * var7;
        if (Math.abs(-1.0 + var9) < 1e-16) {
          return;
        }
        try {
          var9 = Math.sqrt(var9);
          param0[param1] = var3_double / var9;
          param0[1 + param1] = var5 / var9;
          param0[param1 + 2] = var7 / var9;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static rk a(String param0, int param1, String param2, um param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk stackIn_2_0 = null;
        rk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param2, 0);
          if (param1 != 8221) {
            stackIn_2_0 = (rk) null;
            return stackIn_2_0;
          }
          var5 = param3.a(param0, 7, var4_int);
          stackIn_4_0 = gi.a(var5, param1 - 4414, var4_int, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("jn.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        mk var8;
        int var9;
        int var10;
        int var11;
        km var15;
        km var16;
        km var17;
        km var18;
        km var19;
        km var20;
        km var21;
        km var22;
        int var5Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime3;
        int var10Lifetime3;
        mk var8Lifetime1;
        var11 = Chess.field_G;
        if (param2 < -80) {
          super.a(param0, param1, -109, param3);
          if (param1 != 0) {
            return;
          }
          var5 = (this.field_y >> 1) + param3 + this.field_u;
          var6 = param0 - (-this.field_r - (this.field_C >> 1));
          var8 = this.field_O.a(21314);
          if (in.field_g == var8) {
            var16 = uh.field_p[0];
            var9 = var16.field_v << 1;
            var10 = var16.field_u << 1;
            if (null == ca.field_a) {
              ca.field_a = new km(var9, var10);
              tl.a((byte) -67, ca.field_a);
            } else {
              if (ca.field_a.field_w < var9) {
                ca.field_a = new km(var9, var10);
                tl.a((byte) -67, ca.field_a);
              } else {
                if (var10 <= ca.field_a.field_t) {
                  tl.a((byte) -67, ca.field_a);
                  wb.b();
                } else {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                }
              }
            }
            var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -this.field_N << 10, 4096);
            fd.a(28773);
            ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
            return;
          }
          if (var8 != ek.field_d) {
            if (qk.field_b == var8) {
              var18 = uh.field_p[2];
              var18.d(var5 - (var18.field_w >> 1), -(var18.field_t >> 1) + var6, 256);
              return;
            }
            if (oa.field_a != var8) {
              return;
            }
            var17 = uh.field_p[1];
            var17.d(-(var17.field_w >> 1) + var5, var6 - (var17.field_t >> 1), 256);
            return;
          }
          var15 = uh.field_p[0];
          var9Lifetime3 = var15.field_v << 1;
          var10Lifetime3 = var15.field_u << 1;
          if (null != ca.field_a &&
            ca.field_a.field_w >= var9Lifetime3 &&
            var10Lifetime3 <= ca.field_a.field_t) {
            tl.a((byte) -67, ca.field_a);
            wb.b();
          } else {
            ca.field_a = new km(var9Lifetime3, var10Lifetime3);
            tl.a((byte) -67, ca.field_a);
          }
          var15.b(112, 144, var15.field_v << 4, var15.field_u << 4, -this.field_N << 10, 4096);
          fd.a(28773);
          ca.field_a.d(var5 - var15.field_v, var6 - var15.field_u, 256);
          return;
        }
        this.a(-42, 127, 34, -25);
        super.a(param0, param1, -109, param3);
        if (param1 != 0) {
          return;
        }
        var5Lifetime1 = (this.field_y >> 1) + param3 + this.field_u;
        var6Lifetime1 = param0 - (-this.field_r - (this.field_C >> 1));
        var8Lifetime1 = this.field_O.a(21314);
        if (in.field_g == var8Lifetime1) {
          var20 = uh.field_p[0];
          var9Lifetime1 = var20.field_v << 1;
          var10Lifetime1 = var20.field_u << 1;
          if (null == ca.field_a) {
            ca.field_a = new km(var9Lifetime1, var10Lifetime1);
            tl.a((byte) -67, ca.field_a);
          } else {
            if (ca.field_a.field_w < var9Lifetime1) {
              ca.field_a = new km(var9Lifetime1, var10Lifetime1);
              tl.a((byte) -67, ca.field_a);
            } else {
              if (var10Lifetime1 <= ca.field_a.field_t) {
                tl.a((byte) -67, ca.field_a);
                wb.b();
              } else {
                ca.field_a = new km(var9Lifetime1, var10Lifetime1);
                tl.a((byte) -67, ca.field_a);
              }
            }
          }
          var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -this.field_N << 10, 4096);
          fd.a(28773);
          ca.field_a.d(var5Lifetime1 - var20.field_v, var6Lifetime1 - var20.field_u, 256);
          return;
        }
        if (var8Lifetime1 != ek.field_d) {
          if (qk.field_b == var8Lifetime1) {
            var22 = uh.field_p[2];
            var22.d(var5Lifetime1 - (var22.field_w >> 1), -(var22.field_t >> 1) + var6Lifetime1, 256);
            return;
          }
          if (oa.field_a != var8Lifetime1) {
            return;
          }
          var21 = uh.field_p[1];
          var21.d(-(var21.field_w >> 1) + var5Lifetime1, var6Lifetime1 - (var21.field_t >> 1), 256);
          return;
        }
        var19 = uh.field_p[0];
        var9Lifetime2 = var19.field_v << 1;
        var10Lifetime2 = var19.field_u << 1;
        if (null == ca.field_a) {
          ca.field_a = new km(var9Lifetime2, var10Lifetime2);
          tl.a((byte) -67, ca.field_a);
        } else {
          if (ca.field_a.field_w >= var9Lifetime2 &&
            var10Lifetime2 <= ca.field_a.field_t) {
            tl.a((byte) -67, ca.field_a);
            wb.b();
          } else {
            ca.field_a = new km(var9Lifetime2, var10Lifetime2);
            tl.a((byte) -67, ca.field_a);
          }
        }
        var19.b(112, 144, var19.field_v << 4, var19.field_u << 4, -this.field_N << 10, 4096);
        fd.a(28773);
        ca.field_a.d(var5Lifetime1 - var19.field_v, var6Lifetime1 - var19.field_u, 256);
    }

    final static void a(boolean param0, jk param1, String param2, int param3, int param4, int param5, int param6, long param7, byte param8, int param9, boolean param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            tk.field_h = new nk(param5);
            qn.field_U = new nk(param9);
            qh.field_a = param4;
            if (param8 > -91) {
              field_M = (char[]) null;
            }
            cm.field_u = param6;
            ub.field_e = param3;
            gb.field_s = param13;
            fn.field_b = param12;
            am.field_d = param2;
            re.field_n = param1;
            on.field_a = param10;
            qc.field_a = param7;
            ln.field_Kb = param0;
            bk.field_n = param11;
            if (null != re.field_n.field_d) {
              try {
                tc.field_z = new lc(re.field_n.field_d, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("jn.H(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_P = (byte[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String g(int param0) {
        if (this.field_w) {
          return this.field_O.a(false);
        }
        if (param0 == 0) {
          return null;
        }
        return (String) null;
    }

    jn(vb param0) {
        try {
          this.field_O = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != 32359) {
          return false;
        }
        return of.a(bh.i(81), (byte) 95);
    }

    public static void e(byte param0) {
        field_P = null;
        if (param0 != -61) {
          field_P = (byte[]) null;
          field_M = null;
          return;
        }
        field_M = null;
    }

    static {
        field_M = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
