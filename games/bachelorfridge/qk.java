/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends k {
    private int field_o;
    static int field_l;
    static String field_n;
    static sna field_q;
    static String field_p;
    static String field_k;
    static int[] field_m;

    public static void d(int param0) {
        field_q = null;
        if (param0 < 66) {
          return;
        }
        field_m = null;
        field_k = null;
        field_p = null;
        field_n = null;
    }

    final int[] a(int param0, int param1) {
        int[] var17 = null;
        int[] var3 = null;
        int[] var20 = null;
        int[] var5 = null;
        int[] var21 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = BachelorFridge.field_y;
        int[] var17Lifetime1;
        int[] var3Lifetime1;
        int[] var20Lifetime1;
        int[] var5Lifetime1;
        int[] var21Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        if (param1 != 0) {
          field_n = (String) null;
          var17 = this.field_j.a(param0, -1);
          var3 = var17;
          if (this.field_j.field_m) {
            var20 = this.a(0, -1 + param0 & it.field_r, (byte) 105);
            var5 = this.a(0, param0, (byte) 116);
            var21 = this.a(0, param0 + 1 & it.field_r, (byte) 109);
            for (var7 = 0; hh.field_d > var7; var7++) {
              var8 = this.field_o * (-var20[var7] + var21[var7]);
              var9 = (-var5[-1 + var7 & wp.field_r] + var5[1 + var7 & wp.field_r]) * this.field_o;
              var10 = var9 >> 12;
              var11 = var8 >> 12;
              var12 = var10 * var10 >> 12;
              var13 = var11 * var11 >> 12;
              var14 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var12 + var13)) / 4096.0f)));
              var15 = var14 != 0 ? 16777216 / var14 : 0;
              var17[var7] = -var15 + 4096;
            }
            return var17;
          }
          return var17;
        }
        var17Lifetime1 = this.field_j.a(param0, -1);
        var3Lifetime1 = var17Lifetime1;
        if (this.field_j.field_m) {
          var20Lifetime1 = this.a(0, -1 + param0 & it.field_r, (byte) 105);
          var5Lifetime1 = this.a(0, param0, (byte) 116);
          var21Lifetime1 = this.a(0, param0 + 1 & it.field_r, (byte) 109);
          for (var7Lifetime1 = 0; hh.field_d > var7Lifetime1; var7Lifetime1++) {
            var8Lifetime1 = this.field_o * (-var20Lifetime1[var7Lifetime1] + var21Lifetime1[var7Lifetime1]);
            var9Lifetime1 = (-var5Lifetime1[-1 + var7Lifetime1 & wp.field_r] + var5Lifetime1[1 + var7Lifetime1 & wp.field_r]) * this.field_o;
            var10Lifetime1 = var9Lifetime1 >> 12;
            var11Lifetime1 = var8Lifetime1 >> 12;
            var12Lifetime1 = var10Lifetime1 * var10Lifetime1 >> 12;
            var13Lifetime1 = var11Lifetime1 * var11Lifetime1 >> 12;
            var14Lifetime1 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var12Lifetime1 + var13Lifetime1)) / 4096.0f)));
            var15Lifetime1 = var14Lifetime1 != 0 ? 16777216 / var14Lifetime1 : 0;
            var17Lifetime1[var7Lifetime1] = -var15Lifetime1 + 4096;
          }
          return var17Lifetime1;
        }
        return var17Lifetime1;
    }

    public qk() {
        super(1, true);
        this.field_o = 4096;
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -71) {
            field_m = (int[]) null;
          }
          if (param2 != 0) {
            return;
          }
          this.field_o = param1.e((byte) 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("qk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_p = "Please select an option in the '<%0>' row.";
        field_k = "Bachelor Fridge";
    }
}
