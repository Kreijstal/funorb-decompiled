/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et extends k {
    static java.awt.Image field_m;
    private int field_o;
    static int field_l;
    private int field_k;
    static kv field_p;
    private int field_n;

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
          this.a(-5, -83);
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 >= -40) {
          et.d(-100);
        }
        field_m = null;
    }

    final int[] a(int param0, int param1) {
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
        var11 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.field_o = -26;
        }
        var14 = this.field_j.a(param0, -1);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (this.field_j.field_m) {
          var4 = tj.field_f[param0];
          var5 = -2048 + var4 >> 1;
          for (var6 = 0; var6 < hh.field_d; var6++) {
            var8 = jq.field_k[var6];
            var9 = -2048 + var8 >> 1;
            if (this.field_k != 0) {
              var10 = var9 * var9 + var5 * var5 >> 12;
              var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
              var7 = (int)(3.141592653589793 * (double)(this.field_n * var7));
            } else {
              var7 = this.field_n * (var8 - var4);
            }
            L4: {
              var7 = var7 - (var7 & -4096);
              if (this.field_o == 0) {
                var7 = 4096 + baa.field_z[var7 >> 4 & 255] >> 1;
              } else {
                if (this.field_o != 2) {
                  var14[var6] = var7;
                  break L4;
                }
                var7 -= 2048;
                if (var7 < 0) {
                  var7 = -var7;
                }
                var7 = 2048 - var7 << 1;
              }
              var14[var6] = var7;
            }
          }
        }
        return var12;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            return;
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_k = param1.b(16711935);
          } else {
            if (var4_int != 1) {
              if (var4_int == 3) {
                this.field_n = param1.b(16711935);
              }
            } else {
              this.field_o = param1.b(16711935);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("et.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public et() {
        super(0, true);
        this.field_o = 0;
        this.field_k = 0;
        this.field_n = 1;
    }

    static {
    }
}
