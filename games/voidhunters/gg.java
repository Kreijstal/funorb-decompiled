/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends le {
    private int field_l;
    private int field_k;
    static int field_j;
    private int field_i;

    final void c(byte param0) {
        taa.e((byte) -91);
        if (param0 >= -35) {
          this.field_k = 85;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (0 == var4_int) {
            this.field_k = param2.e((byte) -105);
          } else {
            if (var4_int != 1) {
              if (var4_int == 3) {
                this.field_l = param2.e((byte) -107);
              }
            } else {
              this.field_i = param2.e((byte) -104);
            }
          }
          if (param1 >= -60) {
            this.c((byte) 61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("gg.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1) {
        int var6 = 0;
        int[] var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int[] var14;
        int[] var14Lifetime1;
        int[] var14Lifetime1Lifetime1;
        var11 = VoidHunters.field_G;
        var14 = this.field_f.a((byte) -80, param0);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (this.field_f.field_e) {
          var4 = sj.field_p[param0];
          var5 = var4 - 2048 >> 1;
          for (var6 = 0; var6 < hob.field_d; var6++) {
            var8 = grb.field_l[var6];
            var9 = var8 - 2048 >> 1;
            if (this.field_k == 0) {
              var7 = this.field_l * (var8 - var4);
            } else {
              var10 = var5 * var5 + var9 * var9 >> 12;
              var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
              var7 = (int)(3.141592653589793 * (double)(var7 * this.field_l));
            }
            var7 = var7 - (-4096 & var7);
            if (this.field_i == 0) {
              var14Lifetime1 = var13;
              var7 = 4096 + qta.field_o[255 & var7 >> 4] >> 1;
            } else {
              if (2 == this.field_i) {
                var7 -= 2048;
                if (var7 < 0) {
                  var7 = -var7;
                }
                var7 = -var7 + 2048 << 1;
              }
            }
            var14Lifetime1Lifetime1 = var13;
            var14Lifetime1Lifetime1[var6] = var7;
          }
        }
        if (!param1) {
          this.field_k = -110;
        }
        return var12;
    }

    public gg() {
        super(0, true);
        this.field_k = 0;
        this.field_l = 1;
        this.field_i = 0;
    }

    static {
        field_j = 56;
    }
}
