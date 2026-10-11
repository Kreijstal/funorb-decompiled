/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fd {
    static cm field_s;
    private bd field_v;
    private bd[] field_A;
    static int[] field_B;
    static String field_z;
    static String field_u;
    static boolean field_x;
    static ci field_y;
    static ci[] field_w;
    static boolean field_t;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        gl stackIn_5_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        bd var7 = null;
        bd var9 = null;
        eb var10 = null;
        bd var11 = null;
        bd var12 = null;
        bd var13 = null;
        bd var14 = null;
        try {
          if (param3 != -24381) {
            field_t = false;
          }
          if (param1 instanceof eb) {
            stackIn_5_0 = (gl) (param1);
          } else {
            stackIn_5_0 = null;
          }
          var10 = (eb) (stackIn_5_0);
          di.a(param1.field_p + param1.field_w + param2, param0 + param1.field_u, 16105, param1.field_n + param1.field_u + param0, param1.field_w + param2);
          if (var10 != null) {
            param4 = param4 & var10.field_A;
          }
          var7 = this.field_A[0];
          this.field_v.a(param3 ^ -24369);
          var7.a(param1, this.field_v, this, param0, (byte) -127, param2);
          if (var10 != null) {
            if (var10.field_C) {
              var11 = this.field_A[1];
              if (var11 != null) {
                var11.a(param1, this.field_v, this, param0, (byte) -128, param2);
              }
            }
            if (var10.field_s) {
              var12 = this.field_A[3];
              if (var10.field_j != 0 &&
                var12 != null) {
                var12.a(param1, this.field_v, this, param0, (byte) -126, param2);
              } else {
                var9 = this.field_A[2];
                if (var9 != null) {
                  var9.a(param1, this.field_v, this, param0, (byte) -126, param2);
                }
              }
            }
          }
          if (param1.d(-111)) {
            var13 = this.field_A[5];
            if (var13 != null) {
              var13.a(param1, this.field_v, this, param0, (byte) -127, param2);
            }
          }
          if (!param4) {
            var14 = this.field_A[4];
            if (var14 != null) {
              var14.a(param1, this.field_v, this, param0, (byte) -127, param2);
            }
          }
          this.field_v.a(param0, param1, param2, 1, this);
          ij.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("hf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    hf(hf param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, (byte) -126);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, ci[] param2) {
        int var4_int = 0;
        if (param0 != -26108) {
          return;
        }
        try {
          var4_int = param1;
          if (this.field_A[var4_int] == null) {
            this.field_A[var4_int] = new bd();
          }
          this.field_A[param1].field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hf.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ok a(int param0, byte param1) {
        ok var2 = new ok();
        vc.field_g.a(var2, -16611);
        eb.a(param0, (byte) 126);
        int var3 = 116 % ((param1 + 59) / 35);
        return var2;
    }

    final void a(int param0, ci param1) {
        int var4 = 0;
        bd[] var3 = null;
        bd var5 = null;
        int var6 = 0;
        bd[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Terraphoenix.field_V;
        try {
          var7 = this.field_A;
          var3 = var7;
          for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_c = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("hf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -11) {
            var3 = (CharSequence) null;
            hf.a((CharSequence) null, (byte) 93);
          }
          stackIn_3_0 = im.a(param0, (byte) -14, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hf.GA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public hf() {
        this.field_A = new bd[6];
        this.field_v = new bd();
        bd dupTemp$0 = new bd();
        this.field_A[0] = dupTemp$0;
        bd var1 = dupTemp$0;
        var1.a(15);
    }

    public static void a(byte param0) {
        field_z = null;
        field_u = null;
        field_s = null;
        field_w = null;
        field_y = null;
        field_B = null;
        int var1 = 40 / ((-66 - param0) / 44);
    }

    final void a(ci[] param0, byte param1) {
        int var4 = 0;
        bd[] var3 = null;
        int var5 = 0;
        bd var6 = null;
        int var7 = 0;
        bd[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Terraphoenix.field_V;
        try {
          var8 = this.field_A;
          var3 = var8;
          var5 = -100 % ((param1 - 63) / 62);
          for (var4 = 0; var8.length > var4; var4++) {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_b = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("hf.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, hf param1, byte param2) {
        int var4_int = 0;
        bd dupTemp$0 = null;
        bd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        bd stackIn_10_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        bd var5 = null;
        bd var6 = null;
        int var7 = 0;
        bd var6Lifetime1;
        bd var6Lifetime2;
        var7 = Terraphoenix.field_V;
        try {
          super.a(param1, -111);
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_A[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param1.field_A[var4_int];
                stackIn_9_0 = var5;
                stackIn_9_1 = -46;
                if (var6Lifetime2 != null) {
                  stackIn_10_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new bd();
                  param1.field_A[var4_int] = dupTemp$0;
                  stackIn_10_2 = dupTemp$0;
                }
                ((bd) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
              } else {
                param1.field_A[var4_int] = null;
              }
            }
          } else {
            ka.a(this.field_A, 0, param1.field_A, 0, 6);
          }
          if (param2 > -113) {
            this.field_A = (bd[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("hf.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final bd a(int param0, int param1) {
        if (param1 != 3) {
          hf.a((byte) -125);
        }
        bd dupTemp$0 = new bd();
        this.field_A[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
        field_s = new cm(2);
        field_u = "Reload game";
        field_t = true;
        field_z = "Not yet achieved";
    }
}
