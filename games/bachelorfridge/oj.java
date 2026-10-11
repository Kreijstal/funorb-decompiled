/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends k {
    static String field_m;
    private int field_p;
    private int field_q;
    private int field_l;
    static String field_o;
    private int field_k;
    static String field_n;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = BachelorFridge.field_y;
        try {
          if (param2 < 76) {
            oj.e((byte) -89);
          }
          param7--;
          while (param7 >= 0) {
            var17 = param4;
            var10 = var17;
            var11 = param3;
            var12 = param0;
            var13 = param6;
            var14 = param5;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = (dda.a(33493156, var14) >> 17) + dda.a(65280, var13 >> 9) + dda.a(var12 >> 1, 16711680) + var15;
            param5 = param5 + param9;
            param6 = param6 + param8;
            param0 = param0 + param1;
            param3++;
            param7--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_10_0 = var10_ref;
          stackIn_10_1 = new StringBuilder().append("oj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final int[] a(int param0, int param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int[] var15;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        var14 = BachelorFridge.field_y;
        if (param1 != 0) {
          return (int[]) null;
        }
        var15 = this.field_j.a(param0, ~param1);
        var3 = var15;
        if (!this.field_j.field_m) {
          return var15;
        }
        for (var4 = 0; hh.field_d > var4; var4++) {
          var5 = (jq.field_k[var4] << 12) / this.field_l + this.field_p;
          var6 = (tj.field_f[param0] << 12) / this.field_l + this.field_q;
          var7 = var5;
          var8 = var6;
          var9 = var5;
          var10 = var6;
          var11 = var5 * var5 >> 12;
          var12 = var6 * var6 >> 12;
          var13 = 0;
          while (16384 > var12 + var11) {
            if (var13 < this.field_k) {
              var10 = var8 + (var9 * var10 >> 12) * 2;
              var9 = -var12 + var11 + var7;
              var11 = var9 * var9 >> 12;
              var12 = var10 * var10 >> 12;
              var13++;
              continue;
            }
            break;
          }
          stackIn_11_0 = var15;
          stackIn_11_1 = var4;
          if (var13 >= -1 + this.field_k) {
            stackIn_12_2 = 0;
          } else {
            stackIn_12_2 = (var13 << 12) / this.field_k;
          }
          stackIn_11_0[stackIn_11_1] = stackIn_12_2;
        }
        return var15;
    }

    public oj() {
        super(0, true);
        this.field_q = 0;
        this.field_p = 0;
        this.field_l = 1365;
        this.field_k = 20;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_l = param1.e((byte) 90);
          } else {
            if (var4_int != 1) {
              if (2 != var4_int) {
                if (var4_int == 3) {
                  this.field_q = param1.e((byte) 57);
                }
              } else {
                this.field_p = param1.e((byte) 119);
              }
            } else {
              this.field_k = param1.e((byte) 114);
            }
          }
          if (param0 == -71) {
            return;
          }
          field_n = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("oj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 <= -114) {
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        }
        oj.e((byte) 62);
        field_n = null;
        field_m = null;
        field_o = null;
    }

    static {
        field_m = "Drinks";
        field_n = "Remove <%0> from ignore list";
        field_o = "Bakery";
    }
}
