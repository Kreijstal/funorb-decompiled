/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends wg {
    volatile int field_l;
    static int field_k;
    static String field_n;
    volatile int field_o;
    private int field_m;
    static int field_q;
    private int field_p;

    final int a() {
        int var1 = (this.field_l >> 8) * this.field_o >> 16;
        if (var1 != 0) {
          return 1;
        }
        return 0;
    }

    final wg b() {
        return null;
    }

    public static void e(int param0) {
        field_n = null;
        if (param0 != -1600199832) {
          m.e(1);
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        if (param2 == 2) {
          return param1 * dk.field_h[param0 & 32767] >> 3;
        }
        if (param3 > -6) {
          return 63;
        }
        if (param2 != 3) {
          return 0;
        }
        return -param1 + (param1 * (32767 & param0) >> 14);
    }

    final static dk a(dk[] param0, int param1, int param2) {
        int var4 = 0;
        dk[] var3 = null;
        dk var5 = null;
        int var6 = 0;
        dk[] var7 = null;
        dk stackIn_7_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          var7 = param0;
          var3 = var7;
          for (var4 = param2; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (param1 == var5.field_c) {
              stackIn_7_0 = var5;
              return stackIn_7_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("m.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void d(int param0) {
    }

    final wg c() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = EscapeVector.field_A;
        try {
          var4_int = this.field_o;
          var5 = (this.field_l >> 8) * var4_int >> 16;
          if (0 == var5) {
            return;
          }
          var6 = (double)ie.field_q / 1000.0;
          var8 = (int)(25460.736 / var6);
          var9 = var5;
          var10 = (int)(196509.696 / var6);
          param2 = param2 + param1;
          var11 = (int)(98.304 / var6);
          if (ie.field_o) {
            param2 = param2 << 1;
            param1 = param1 << 1;
          }
          var12 = param1;
          while (param2 > var12) {
            var13 = 16384 + (var4_int >> 1);
            var14 = var9;
            var15 = 32768;
            var16 = 65536 - var13;
            var13 = var13 + (this.a(this.field_m, var16, 3, -60) >> 1);
            this.field_m = this.field_m + (var15 * var8 >> 16);
            var17 = this.a(this.field_p, var14, 2, -68);
            incrementValue$0 = var12;
            var12++;
            param0[incrementValue$0] = param0[incrementValue$0] + var17;
            if (ie.field_o) {
              incrementValue$1 = var12;
              var12++;
              param0[incrementValue$1] = param0[incrementValue$1] + var17;
            }
            this.field_p = this.field_p + (var11 + (var13 * var10 >> 16));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("m.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    m() {
        this.field_m = 0;
        this.field_p = 0;
    }

    static {
        field_n = "Press M to see the mini-map";
        field_k = 0;
        field_q = 0;
    }
}
