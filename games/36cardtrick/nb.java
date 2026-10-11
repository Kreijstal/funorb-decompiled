/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb implements ci {
    static wb[] field_d;
    private int field_c;
    private ee field_b;
    private int field_a;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        int var1 = -115 / ((param0 + 38) / 55);
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        try {
          if (!param1.field_j &&
            !param1.d(92)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          if (param2 != 11447) {
            this.field_c = 116;
          }
          this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_r + "</u>", param1.field_o + param0, param1.field_i + param3, param1.field_h, param1.field_q, var6_int, -1, this.field_c, this.field_a, this.field_b.field_x + this.field_b.field_s);
          if (param1.d(114)) {
            var7 = this.field_b.a(param1.field_r);
            var8 = this.field_b.field_x + this.field_b.field_s;
            var9 = param0 + param1.field_o;
            if (this.field_c == 2) {
              var9 = var9 + (param1.field_h - var7);
            } else {
              if (1 == this.field_c) {
                var9 = var9 + (param1.field_h - var7 >> 1);
              }
            }
            var10 = param3 + param1.field_i;
            if (this.field_a != 2) {
              if (this.field_a == 1) {
                var10 = var10 + (param1.field_q - var8 >> 1);
              }
            } else {
              var10 = var10 + (param1.field_q - var8);
            }
            na.a(2 + var10, 51, 4 + var7, var8, var9 - 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("nb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, int[] param1, int param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Main.field_T;
        try {
          if (param2 < param4) {
            var5_int = (param2 + param4) / 2;
            var6 = param2;
            var7 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var7;
            var8 = param1[var5_int];
            param1[var5_int] = param1[param4];
            param1[param4] = var8;
            stackIn_5_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_5_0;
            for (var10 = param2; param4 > var10; var10++) {
              if (param3[var10] > -(var9 & var10) + var7) {
                var11 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6] = var11;
                var12 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6++] = var12;
              }
            }
            param3[param4] = param3[var6];
            param3[var6] = var7;
            param1[param4] = param1[var6];
            param1[var6] = var8;
            nb.a((byte) -77, param1, param2, param3, -1 + var6);
            nb.a((byte) -100, param1, 1 + var6, param3, param4);
          }
          if (param0 <= -25) {
            return;
          }
          nb.a(-21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("nb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    public nb() {
        this.field_c = 1;
        this.field_b = j.field_C;
        this.field_a = 1;
    }

    nb(ee param0, int param1, int param2) {
        try {
          this.field_c = param1;
          this.field_a = param2;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static mg a(byte param0, w param1) {
        int var7 = 0;
        mg stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        mg var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        try {
          var2_int = param1.g(8, -1);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = di.a((byte) -115, param1) ? 1 : 0;
          var4 = di.a((byte) -117, param1) ? 1 : 0;
          var5 = new mg();
          var5.field_C = (short)param1.g(16, -1);
          var5.field_r = jc.a(param1, 16, 21, var5.field_r);
          var5.field_b = jc.a(param1, 16, 21, var5.field_b);
          var5.field_O = jc.a(param1, 16, 21, var5.field_O);
          var5.field_M = (short)param1.g(16, -1);
          var5.field_a = jc.a(param1, 16, 21, var5.field_a);
          var5.field_Q = jc.a(param1, 16, 21, var5.field_Q);
          var5.field_d = jc.a(param1, 16, 21, var5.field_d);
          if (var3 != 0) {
            var5.field_c = (short)param1.g(16, -1);
            var5.field_k = jc.a(param1, 16, 21, var5.field_k);
            var5.field_B = jc.a(param1, 16, 21, var5.field_B);
            var5.field_I = jc.a(param1, 16, 21, var5.field_I);
            var5.field_g = jc.a(param1, 16, 21, var5.field_g);
            var5.field_v = jc.a(param1, 16, 21, var5.field_v);
            var5.field_p = jc.a(param1, 16, 21, var5.field_p);
          }
          if (var4 != 0) {
            param1.g(16, -1);
            var5.field_n = jc.a(param1, 16, 21, var5.field_n);
            var5.field_J = jc.a(param1, 16, 21, var5.field_J);
            var5.field_t = jc.a(param1, 16, 21, var5.field_t);
            var5.field_l = jc.a(param1, 16, 21, var5.field_l);
            var5.field_H = jc.a(param1, 16, 21, var5.field_H);
          }
          if (param0 < 105) {
            field_e = -87;
          }
          if (di.a((byte) -79, param1)) {
            var5.field_N = jc.a(param1, 16, 21, var5.field_N);
          }
          if (di.a((byte) -97, param1)) {
            var5.field_D = di.a(var5.field_D, param1, 17259, 16);
            var6 = 0;
            for (var7 = 0; var5.field_D.length > var7; var7++) {
              if (var6 < (255 & var5.field_D[var7])) {
                var6 = var5.field_D[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_E = (byte)(1 + var6);
            } else {
              var5.field_D = null;
            }
          }
          stackIn_23_0 = var5;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("nb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
    }
}
