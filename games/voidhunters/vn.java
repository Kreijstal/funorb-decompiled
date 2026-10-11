/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends le {
    private int field_k;
    static int field_m;
    static String field_i;
    private int field_l;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ds var6 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int == 0) {
            this.field_j = param2.e((byte) -108);
          } else {
            if (1 != var4_int) {
              if (2 == var4_int) {
                this.field_k = param2.e(1869);
              }
            } else {
              this.field_l = param2.e((byte) -93);
            }
          }
          if (param1 >= -60) {
            var6 = (ds) null;
            this.a(-122, -52, (ds) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vn.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
    }

    final int[] a(int param0, boolean param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        var11 = VoidHunters.field_G;
        var13 = this.field_f.a((byte) 120, param0);
        var12 = var13;
        var3 = var12;
        if (this.field_f.field_e) {
          for (var4 = 0; var4 < hob.field_d; var4++) {
            boolean decompiledFrameRemainder0 = true;
            var5 = grb.field_l[var4];
            var6 = sj.field_p[param0];
            var7 = var5 * this.field_j >> 12;
            var8 = this.field_l * var6 >> 12;
            var9 = this.field_j * (var5 % (4096 / this.field_j));
            var10 = var6 % (4096 / this.field_l) * this.field_l;
            if (var10 < this.field_k) {
              for (var7 = var7 - var8; var7 < 0; var7 += 4) {
              }
              while (3 < var7) {
                var7 -= 4;
              }
              var13 = var12;
              if (var7 != 1) {
                var13[var4] = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                var13 = var12;
                if (this.field_k > var9) {
                  var13[var4] = 0;
                  decompiledFrameRemainder0 = false;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (this.field_k > var9) {
                for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                }
                while (var7 > 3) {
                  var7 -= 4;
                }
                if (0 < var7) {
                  var13[var4] = 0;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                var13[var4] = 4096;
              }
            }
          }
        }
        if (param1) {
          return var3;
        }
        return (int[]) null;
    }

    public vn() {
        super(0, true);
        this.field_k = 204;
        this.field_l = 1;
        this.field_j = 1;
    }

    static {
        field_m = 32;
        field_i = "Standard thruster";
    }
}
