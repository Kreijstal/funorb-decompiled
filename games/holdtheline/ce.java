/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rd {
    static int[] field_q;
    private int field_s;
    static wj field_n;
    private uh field_p;
    static int field_r;
    static int field_m;
    private uh field_o;

    final static float a(int param0, wc[] param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        float stackIn_3_0 = 0.0f;
        float stackIn_7_0 = 0.0f;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          var2_float = 0.0f;
          var3 = 0;
          if (param0 != -1) {
            stackIn_3_0 = 0.04640667513012886f;
            return stackIn_3_0;
          }
          while (param1.length > var3) {
            var2_float = var2_float + param1[var3].f(50);
            var3++;
          }
          stackIn_7_0 = var2_float;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ce.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var6Lifetime2Lifetime1;
        var11 = HoldTheLine.field_D;
        try {
          var12 = new int[param3.length + param0.length];
          var14 = var12;
          var13 = var14;
          var5 = var13;
          for (var6 = 0; var6 < param0.length; var6++) {
            var12[var6] = param0[var6];
          }
          for (var6Lifetime1 = 0; param3.length / 2 > var6Lifetime1; var6Lifetime1++) {
            var5[2 * var6Lifetime1 + param0.length] = param3[-(2 * var6Lifetime1) + (-2 + param3.length)];
            var5[var6Lifetime1 * 2 + param0.length + 1] = param3[-(var6Lifetime1 * 2) - 1 + param3.length];
          }
          this.field_p.a(param0, 0);
          this.field_o.a(param3, 0);
          gf.a(var14, 12566463);
          if (param2 > -49) {
            return;
          }
          if (param1 != this.field_s) {
            if (this.field_p.b(-127) > 0 &&
              this.field_o.b(-115) > 0) {
              var7 = this.field_p.a((byte) 127, 0);
              var8 = this.field_p.a((byte) 105, 1);
              for (var6Lifetime2 = 0; var6Lifetime2 < this.field_p.b(-117); var6Lifetime2 += 2) {
                var9 = this.field_p.a((byte) 110, var6Lifetime2);
                var10 = this.field_p.a((byte) 13, 1 + var6Lifetime2);
                tc.d(var7, var8, var9, var10, 4144959);
                var7 = var9;
                var8 = var10;
              }
              var9Lifetime1 = this.field_o.a((byte) 81, -2 + this.field_o.b(-111));
              var10Lifetime1 = this.field_o.a((byte) 46, this.field_o.b(-119) - 1);
              tc.d(var7, var8, var9Lifetime1, var10Lifetime1, 4144959);
              var8Lifetime1 = var10Lifetime1;
              var7Lifetime1 = var9Lifetime1;
              for (var6Lifetime2Lifetime1 = -2 + this.field_o.b(-115); var6Lifetime2Lifetime1 >= 0; var6Lifetime2Lifetime1 -= 2) {
                var9Lifetime2 = this.field_o.a((byte) 19, var6Lifetime2Lifetime1);
                var10Lifetime2 = this.field_o.a((byte) 107, var6Lifetime2Lifetime1 + 1);
                tc.d(var7Lifetime1, var8Lifetime1, var9Lifetime2, var10Lifetime2, 4144959);
                var7Lifetime1 = var9Lifetime2;
                var8Lifetime1 = var10Lifetime2;
              }
              var9Lifetime3 = this.field_p.a((byte) 28, 0);
              var10Lifetime3 = this.field_p.a((byte) 118, 1);
              tc.d(var7Lifetime1, var8Lifetime1, var9Lifetime3, var10Lifetime3, 4144959);
              var7Lifetime2 = var9Lifetime3;
              var8Lifetime2 = var10Lifetime3;
              this.field_p = o.a((byte) 103);
              this.field_o = o.a((byte) -115);
            }
            this.field_s = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("ce.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static ql a(int param0, byte[] param1, bm[] param2, int param3, int param4, int param5) {
        int var16_int = 0;
        byte[] array$0 = null;
        int var26 = 0;
        int incrementValue$2 = 0;
        ql stackIn_5_0 = null;
        ql stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        ql var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var23Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        var27 = HoldTheLine.field_D;
        try {
          if (param2.length != 256) {
            throw new IllegalArgumentException();
          }
          var38 = new int[256];
          var31 = var38;
          var6 = var31;
          var39 = new int[256];
          var32 = var39;
          var7 = var32;
          var37 = new int[256];
          var30 = var37;
          var8 = var30;
          var36 = new int[256];
          var29 = var36;
          var9 = var29;
          var10 = new int[]{0, param4, param0};
          var40 = new byte[256][];
          var33 = var40;
          var11 = var33;
          var45 = tc.field_b;
          var13 = tc.field_j;
          if (param5 != 8) {
            stackIn_5_0 = (ql) null;
            return stackIn_5_0;
          }
          var14 = tc.field_c;
          var44 = new int[4];
          tc.b(var44);
          for (var16_int = 0; var16_int < 256; var16_int++) {
            var6[var16_int] = param2[var16_int].field_k - param3;
            var7[var16_int] = -param3 + param2[var16_int].field_d;
            var8[var16_int] = (param3 << 1) + param2[var16_int].field_i;
            var9[var16_int] = (param3 << 1) + param2[var16_int].field_l;
            array$0 = new byte[var36[var16_int] * var37[var16_int]];
            var11[var16_int] = array$0;
            var17 = array$0;
            var18 = param2[var16_int].field_m;
            var19 = param2[var16_int].field_i;
            var20 = param2[var16_int].field_l;
            var21 = var37[var16_int];
            tc.a(new int[var36[var16_int] * var37[var16_int]], var37[var16_int], var36[var16_int]);
            var22 = -var19 + var21;
            var23 = 0;
            for (var24 = 0; var24 < var20; var24++) {
              for (var25 = 0; var25 < var19; var25++) {
                if (var18[var23++] != 0) {
                  tc.d(var25 + param3, var24 + param3, param3, 2);
                }
              }
            }
            for (var24Lifetime1 = 0; var17.length > var24Lifetime1; var24Lifetime1++) {
              var17[var24Lifetime1] = (byte)tc.field_b[var24Lifetime1];
            }
            var23Lifetime1 = 0;
            var24Lifetime2 = (1 + var37[var16_int]) * param3;
            for (var25Lifetime1 = 0; var20 > var25Lifetime1; var25Lifetime1++) {
              for (var26 = 0; var19 > var26; var26++) {
                if (var18[var23Lifetime1++] != 0) {
                  incrementValue$2 = var24Lifetime2;
                  var24Lifetime2++;
                  var17[incrementValue$2] = (byte) 1;
                } else {
                  var24Lifetime2++;
                }
              }
              var24Lifetime2 = var24Lifetime2 + var22;
            }
          }
          var16 = new ql(param1, var38, var39, var37, var36, var10, var40);
          var16.field_I = var16.field_I - param3;
          var16.field_s = var16.field_s - param3;
          var16.field_G = var16.field_G - param3;
          tc.a(var45, var13, var14);
          tc.a(var44);
          stackIn_31_0 = var16;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_34_0 = var6_ref;
          stackIn_34_1 = new StringBuilder().append("ce.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_n = null;
        if (param0 != -10162) {
          field_q = (int[]) null;
        }
    }

    final static hj[] a(String param0, int param1, String param2, gn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj[] stackIn_2_0 = null;
        hj[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17870) {
            stackIn_2_0 = (hj[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.c(param2, 3);
          var5 = param3.a(var4_int, param0, false);
          stackIn_4_0 = jc.a(-1, var5, param3, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ce.C(");
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(int param0, vk param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param0 != -14646) {
            stackIn_3_0 = -59;
            return stackIn_3_0;
          }
          var2_int = kg.a((byte) 26, param1);
          var3 = go.field_g[param1.field_p];
          for (var4 = 0; var3.length > var4; var4++) {
            if (ge.field_c[var3[var4]].field_b.b((byte) 58)) {
              var2_int += 8;
            }
            if (ge.field_c[var3[var4]].field_z.b((byte) 58)) {
              var2_int += 8;
            }
          }
          if (mc.field_a[9].field_c) {
            var2_int += 8;
          }
          if (mc.field_a[11].field_c) {
            var2_int += 8;
          }
          if (!nn.a(-64)) {
            var2_int += 88;
          }
          stackIn_22_0 = 2 * var2_int / 3;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ce.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    ce(int param0, float param1) {
        this.field_c = 0;
        this.field_i = 1;
        this.field_h = param0;
        this.field_k = param1;
        this.field_p = o.a((byte) 50);
        this.field_o = o.a((byte) 96);
        this.field_s = 0;
    }

    static {
        field_q = new int[4];
    }
}
