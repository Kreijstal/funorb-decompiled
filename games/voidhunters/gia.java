/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends le {
    private boolean field_l;
    private int field_i;
    static eab field_k;
    static String field_j;

    final void a(int param0, int param1, ds param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            field_k = (eab) null;
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.field_i = param2.e(1869);
            return;
          }
          if (var4_int == 1) {
            stackIn_10_1 = (param2.e((byte) -118) == 1);
            this.field_l = stackIn_10_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("gia.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public gia() {
        super(1, false);
        this.field_i = 4096;
        this.field_l = true;
    }

    final int[][] a(int param0, int param1) {
        int[] var41 = null;
        int[] var5 = null;
        int[] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int var10 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var13 = 0;
        int var12 = 0;
        int var11 = 0;
        int var21 = VoidHunters.field_G;
        int[][] var29 = this.field_d.a(param1, (byte) -85);
        int[][] var23 = var29;
        int[][] var22 = var23;
        int[][] var3 = var22;
        if (param0 != 255) {
          return (int[][]) null;
        }
        if (this.field_d.field_g) {
          var41 = this.a(0, wf.field_d & param1 - 1, 255);
          var5 = this.a(0, param1, 255);
          var40 = this.a(0, 1 + param1 & wf.field_d, 255);
          var42 = var29[0];
          var43 = var29[1];
          var44 = var29[2];
          for (var10 = 0; hob.field_d > var10; var10++) {
            var14 = this.field_i * (var40[var10] - var41[var10]);
            var15 = (var5[gbb.field_q & var10 + 1] - var5[gbb.field_q & -1 + var10]) * this.field_i;
            var16 = var15 >> 12;
            var17 = var14 >> 12;
            var18 = var16 * var16 >> 12;
            var19 = var17 * var17 >> 12;
            var20 = (int)(Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)) * 4096.0);
            if (var20 == 0) {
              var13 = 0;
              var12 = 0;
              var11 = 0;
            } else {
              var12 = var14 / var20;
              var13 = 16777216 / var20;
              var11 = var15 / var20;
            }
            if (this.field_l) {
              var13 = 2048 + (var13 >> 1);
              var11 = 2048 + (var11 >> 1);
              var12 = 2048 + (var12 >> 1);
            }
            var42[var10] = var11;
            var43[var10] = var12;
            var44[var10] = var13;
          }
          return var22;
        }
        return var22;
    }

    public static void a(boolean param0) {
        field_j = null;
        field_k = null;
        if (param0) {
          gia.a(true);
        }
    }

    final static int d(int param0) {
        if (param0 != -2) {
          field_j = (String) null;
          return rpa.field_b;
        }
        return rpa.field_b;
    }

    static {
        field_j = "Boosters";
    }
}
