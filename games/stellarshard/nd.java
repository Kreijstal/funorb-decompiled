/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ig {
    static String field_F;

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var23Lifetime1;
        int var23Lifetime2;
        var24 = stellarshard.field_B;
        try {
          var6_int = param5 * param5;
          if (param4 > -17) {
            field_F = (String) null;
          }
          var7 = -param5 + param1;
          var8 = param5 + param1;
          var9 = -param5 + param3;
          var10 = param5 + param3;
          if (ti.field_e > var9) {
            var9 = ti.field_e;
          }
          if (var8 > ti.field_l) {
            var8 = ti.field_l;
          }
          if (var7 < ti.field_f) {
            var7 = ti.field_f;
          }
          if (ti.field_c < var10) {
            var10 = ti.field_c;
          }
          var26 = ti.field_a;
          var25 = var26;
          var11 = var25;
          for (var16 = var7; var8 > var16; var16++) {
            for (var17 = var9; var17 < var10; var17++) {
              boolean decompiledFrameRemainder0 = true;
              var13 = var17 - param3;
              var14 = -param1 + var16;
              var15 = var14 * var14 + var13 * var13;
              if (var15 < var6_int) {
                if (var15 == 0) {
                  var15 = 1;
                }
                var12 = ti.field_i * var16 + var17;
                if (param0 < 0) {
                  var18 = -param0 + 256 - (-param0 + 256) * var15 / var6_int;
                } else {
                  var18 = 256 + (param0 * var15 / var6_int - param0);
                }
                var19 = var26[var12];
                var20 = var19 >> 16 & 255;
                var21 = 255 & var19 >> 8;
                var22 = 255 & var19;
                if (0 < var18) {
                  if (var18 >= 256) {
                    var11[var12] = vf.b(vf.b(var21 << 8, var20 << 16), var22);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var23 = var18;
                    if (var23 > (param2 & 16711680) >> 16) {
                      var23 = 255 & param2 >> 16;
                    }
                    if (var20 < var23) {
                      var20 = var20 + (((16711680 & param2) >> 16) - var23);
                    } else {
                      var20 = (16711680 & param2) >> 16;
                    }
                    var23Lifetime1 = var18;
                    if (var23Lifetime1 > (255 & param2 >> 8)) {
                      var23Lifetime1 = 255 & param2 >> 8;
                    }
                    if (var21 >= var23Lifetime1) {
                      var21 = (65280 & param2) >> 8;
                    } else {
                      var21 = var21 + (-var23Lifetime1 + (param2 >> 8 & 255));
                    }
                    var23Lifetime2 = var18;
                    if (var23Lifetime2 > (param2 & 255)) {
                      var23Lifetime2 = param2 & 255;
                    }
                    if (var22 < var23Lifetime2) {
                      var22 = var22 + (-var23Lifetime2 + (param2 & 255));
                    } else {
                      var22 = 255 & param2;
                    }
                  }
                } else {
                  var21 = 255 & param2 >> 8;
                  var22 = 255 & param2;
                  var20 = (param2 & 16711680) >> 16;
                }
                if (decompiledFrameRemainder0) {
                  var11[var12] = vf.b(vf.b(var21 << 8, var20 << 16), var22);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var6), "nd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private nd(String param0, lf param1) {
        this(param0, n.field_i.field_b, param1);
        try {
          this.field_u = n.field_i.field_j;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_F = null;
        int var1 = -67 / ((-44 - param0) / 44);
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        try {
          ti.g(param3, param1, 1 + param0, 10000536);
          ti.g(param3, param2 + param1, 1 + param0, 12105912);
          var5_int = 1;
          var6 = param2;
          if (param4 >= -76) {
            field_F = (String) null;
          }
          if (ti.field_f > param1 + var5_int) {
            var5_int = ti.field_f - param1;
          }
          if (param1 + var6 > ti.field_l) {
            var6 = -param1 + ti.field_l;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 48 * var7 / param2 + 152;
            var9 = var8 | (var8 << 8 | var8 << 16);
            ti.field_a[ti.field_i * (param1 + var7) + param3] = var9;
            ti.field_a[param0 + (var7 + param1) * ti.field_i + param3] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "nd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ah.a((java.awt.Component) ((Object) param1), false);
          sl.a((java.awt.Component) ((Object) param1), (byte) 103);
          if (param0 != -26621) {
            var3 = (CharSequence) null;
            nd.a((CharSequence) null, (byte) -126);
          }
          if (og.field_c != null) {
            og.field_c.a(24186, (java.awt.Component) ((Object) param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        try {
          if (null != e.field_a) {
            try {
              e.field_a.a(0L, 0);
              e.field_a.a(24, ae.field_N.field_k, -1, ae.field_N.field_r);
            } catch (Exception exception) {
            }
          }
          if (param0 != -26923) {
            return;
          }
          ae.field_N.field_k = ae.field_N.field_k + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        super.a(param0, param1, param2, 107);
        if (param3 < 39) {
          CharSequence var6 = (CharSequence) null;
          nd.a((CharSequence) null, (byte) 46);
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = stellarshard.field_B;
        try {
          var2_long = 0L;
          var4 = param0.length();
          var5 = 0;
          if (param1 != -35) {
            stackIn_3_0 = 24L;
            return stackIn_3_0;
          }
          while (var5 < var4) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 + (var6 - 65));
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-96 + var6);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(27 - (-var6 + 48));
              }
            }
            if (var2_long < 177917621779460413L) {
              var5++;
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("nd.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private nd(String param0, uk param1, lf param2) {
        super(param0, param1, param2);
        try {
          this.field_u = n.field_i.field_j;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nd(String param0, lf param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_F = "Anomaly detected";
    }
}
