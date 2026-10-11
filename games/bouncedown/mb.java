/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ed {
    private boolean field_l;
    static qc field_n;
    private tj field_i;
    static long field_s;
    static int[] field_o;
    private int field_g;
    private int field_f;
    private String field_m;
    static int field_e;
    static tg field_q;
    private int field_p;
    static String field_k;
    private int field_r;
    static int field_j;
    private int field_h;

    final void a(int param0, tj param1, String param2, boolean param3, int param4, int param5, int param6, int param7) {
        bh stackIn_37_0;
        bh stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        bh stackIn_38_0 = null;
        bh stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        tj stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bh var14 = null;
        int var15 = 0;
        tj var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        int var12Lifetime1;
        var15 = Bounce.field_N;
        try {
          if (0 == param7) {
            param7 = param1.field_p;
          }
          if (param2 == null) {
            this.field_a = null;
            return;
          }
          if (this.field_i == param1 &&
            !this.field_l &&
            param6 == this.field_p &&
            this.field_f == param5 &&
            this.field_r == param7 &&
            param4 == this.field_h &&
            param0 == this.field_g &&
            this.field_m != null &&
            this.field_m.equals(param2)) {
            return;
          }
          this.field_h = param4;
          this.field_p = param6;
          this.field_i = param1;
          this.field_r = param7;
          this.field_g = param0;
          this.field_l = false;
          this.field_f = param5;
          if (!param3) {
            var16 = (tj) null;
            this.a((String) null, -57, (byte) -100, -16, (tj) null);
          }
          this.field_m = param2;
          var17 = new String[1 + param1.a(param2, param0)];
          var18 = var17;
          var10 = Math.max(1, param1.a(param2, new int[]{param0}, var18));
          if (this.field_f == 3 &&
            var10 == 1) {
            this.field_f = 1;
          }
          this.field_a = new bh[var10];
          if (this.field_f != 0) {
            if (this.field_f == 1) {
              var11 = param1.field_s + (this.field_h - var10 * this.field_r >> 1);
            } else {
              if (this.field_f == 2) {
                var11 = -(this.field_r * var10) - param1.field_x + this.field_h;
              } else {
                var12 = (this.field_h - this.field_r * var10) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_r = this.field_r + var12;
                var11 = var12 + param1.field_s;
              }
            }
          } else {
            var11 = param1.field_s;
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var17[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param1.field_s + var11;
            stackIn_37_3 = var11 + param1.field_x;
            if (var13 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            }
            var14 = new bh(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_a[0] = 0;
            if (var13 != null) {
              var14.field_a[var13.length()] = param1.b(var13);
              stackIn_42_0 = (tj) (param1);
              stackIn_42_1 = var13;
              if (param6 != 3) {
                stackIn_43_2 = 0;
              } else {
                stackIn_43_2 = this.a(param1.b(var13), param0, -127, var13);
              }
              wi.a(stackIn_42_0, stackIn_42_1, stackIn_43_2, false, var14);
            }
            var11 = var11 + param7;
            this.field_a[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("mb.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param2 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final bh a(int param0, byte param1, String param2, tj param3) {
        bh var5 = null;
        RuntimeException var5_ref = null;
        bh var6 = null;
        bh stackIn_2_0 = null;
        bh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 97) {
            stackIn_2_0 = (bh) null;
            return stackIn_2_0;
          }
          var6 = new bh(-param3.field_s + param0, param0 + param3.field_x, param2.length());
          var5 = var6;
          this.field_a = new bh[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("mb.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(String param0, tj param1, int param2, int param3, int param4) {
        bh var9 = null;
        bh var10 = null;
        if (param0 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_i == param1 &&
          this.field_l &&
          this.field_p == 2 &&
          this.field_m != null &&
          this.field_m.equals(param0)) {
          return;
        }
        try {
          this.field_i = param1;
          this.field_p = 2;
          this.field_l = true;
          this.field_m = param0;
          var9 = this.a(param2, (byte) 102, param0, param1);
          var10 = var9;
          var10.field_a[0] = -param1.b(param0) + param4;
          int var7 = 117 / ((1 - param3) / 57);
          var10.field_a[param0.length()] = param4;
          wi.a(param1, param0, 0, false, var10);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "mb.R(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        field_o = null;
        field_q = null;
        if (param0 < 18) {
          field_e = 1;
        }
        field_k = null;
    }

    final void a(int param0, String param1, tj param2, int param3, boolean param4) {
        bh var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_a = null;
          return;
        }
        if (param2 == this.field_i && this.field_l && this.field_p == 1 && this.field_m != null &&
          this.field_m.equals(param1)) {
          return;
        }
        try {
          this.field_l = true;
          this.field_i = param2;
          this.field_p = 1;
          var8 = this.a(param0, (byte) 107, param1, param2);
          var7 = param2.b(param1);
          var8.field_a[0] = param3 - (var7 >> 1);
          var8.field_a[param1.length()] = param3 + (var7 >> 1);
          wi.a(param2, param1, 0, param4, var8);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "mb.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, byte param2, int param3, tj param4) {
        bh var7 = null;
        if (param0 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_i == param4 &&
          this.field_l &&
          0 == this.field_p &&
          null != this.field_m &&
          this.field_m.equals(param0)) {
          return;
        }
        try {
          int var6_int = -29 / ((-10 - param2) / 63);
          this.field_l = true;
          this.field_p = 0;
          this.field_m = param0;
          this.field_i = param4;
          var7 = this.a(param1, (byte) 100, param0, param4);
          var7.field_a[0] = param3;
          var7.field_a[param0.length()] = param4.b(param0) + param3;
          wi.a(param4, param0, 0, false, var7);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "mb.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public mb() {
    }

    static {
        field_o = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_n = new qc();
        field_e = 20;
        field_k = "This password contains repeated characters, and would be easy to guess";
        field_j = 0;
    }
}
