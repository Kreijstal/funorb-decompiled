/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends k {
    private int field_k;
    static String field_m;
    private int field_o;
    static String field_p;
    static String field_n;
    private int field_l;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        lu var6 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (2 == var4_int) {
                this.field_k = param1.e((byte) 52);
              }
            } else {
              this.field_o = param1.b(param0 ^ -16711866);
            }
          } else {
            this.field_l = param1.b(16711935);
          }
          if (param0 != -71) {
            var6 = (lu) null;
            this.a((byte) 105, (lu) null, -57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("sk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    public sk() {
        super(0, true);
        this.field_o = 1;
        this.field_k = 204;
        this.field_l = 1;
    }

    public static void d(int param0) {
        field_p = null;
        field_n = null;
        field_m = null;
        if (param0 >= -109) {
          field_n = (String) null;
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
        int[] var12;
        int[] var13;
        var11 = BachelorFridge.field_y;
        var13 = this.field_j.a(param0, param1 - 1);
        var12 = var13;
        var3 = var12;
        if (param1 != 0) {
          this.field_k = -14;
        }
        if (this.field_j.field_m) {
          for (var4 = 0; var4 < hh.field_d; var4++) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var5 = jq.field_k[var4];
            var6 = tj.field_f[param0];
            var7 = this.field_l * var5 >> 12;
            var8 = this.field_o * var6 >> 12;
            var9 = var5 % (4096 / this.field_l) * this.field_l;
            var10 = var6 % (4096 / this.field_o) * this.field_o;
            if (this.field_k > var10) {
              for (var7 = var7 - var8; var7 < 0; var7 += 4) {
              }
              while (var7 > 3) {
                var7 -= 4;
              }
              if (var7 != 1) {
                var13 = var12;
                var13[var4] = 0;
                decompiledFrameRemainder1 = false;
              }
              else {
                decompiledFrameRemainder0 = !(var9 < this.field_k);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              if (this.field_k > var9) {
                for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                }
                while (var7 > 3) {
                  var7 -= 4;
                }
                decompiledFrameRemainder0 = !(0 < var7);
              }
              if (decompiledFrameRemainder0) {
                var13[var4] = 4096;
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              var13[var4] = 0;
            }
          }
        }
        return var3;
    }

    static {
        field_n = "This is your shopping bag, where your food is stored once bought.";
        field_p = "Searching for an opponent";
        field_m = "Use the magnifier to view a creatures details.";
    }
}
