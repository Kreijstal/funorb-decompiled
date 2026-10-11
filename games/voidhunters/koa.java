/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa extends le {
    private int field_l;
    private int field_i;
    private int field_j;
    static String field_k;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        ds var6 = null;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            var6 = (ds) null;
            this.a(61, -46, (ds) null);
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.field_l = param2.e(1869);
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                stackIn_13_1 = (param2.e((byte) -93) == 1);
                this.field_g = stackIn_13_1;
              }
            } else {
              this.field_j = param2.e(1869);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("koa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 < 9) {
          koa.d(-110);
        }
        field_k = null;
    }

    final int[] a(int param0, boolean param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!param1) {
          return (int[]) null;
        }
        int[] var7 = this.field_f.a((byte) 117, param0);
        int[] var3 = var7;
        if (this.field_f.field_e) {
          var4 = this.a(0, param0, 255);
          for (var5 = 0; var5 < hob.field_d; var5++) {
            var7[var5] = (var4[var5] * this.field_i >> 12) + this.field_l;
          }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
        int[][] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        if (param0 != 255) {
          this.field_l = 63;
        }
        int[][] var20 = this.field_d.a(param1, (byte) -126);
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (this.field_d.field_g) {
          var28 = this.a((byte) 65, 0, param1);
          var29 = var28[0];
          var30 = var28[1];
          var31 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; var11 < hob.field_d; var11++) {
            var8[var11] = (var29[var11] * this.field_i >> 12) + this.field_l;
            var9[var11] = (this.field_i * var30[var11] >> 12) + this.field_l;
            var10[var11] = (this.field_i * var31[var11] >> 12) + this.field_l;
          }
        }
        return var13;
    }

    public koa() {
        super(1, false);
        this.field_j = 3072;
        this.field_i = 2048;
        this.field_l = 1024;
    }

    final void c(byte param0) {
        this.field_i = -this.field_l + this.field_j;
        if (param0 > -35) {
          this.a(3, false);
        }
    }

    static {
        field_k = "Waiting for textures";
    }
}
