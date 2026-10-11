/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends ci {
    static StringBuilder field_n;
    private int field_r;
    static String field_o;
    static kh field_q;
    static cn field_p;
    private int field_m;
    static String field_s;
    private int field_t;

    public static void c(int param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        field_s = null;
        field_n = null;
        if (param0 == 3) {
          return;
        }
        field_n = (StringBuilder) null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_r = param1.h(255);
          } else {
            if (var4_int != 1) {
              if (2 == var4_int) {
                this.field_m = param1.d(124);
              }
            } else {
              this.field_t = param1.h(255);
            }
          }
          if (param0 != 107) {
            this.field_t = -73;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        var13 = this.field_i.a((byte) 28, param1);
        var12 = var13;
        var3 = var12;
        if (param0 != 1) {
          this.field_m = 74;
          if (!this.field_i.field_d) {
            return var3;
          }
          for (var4 = 0; ns.field_g > var4; var4++) {
            L10: {
              L11: {
                var5 = ht.field_Fb[var4];
                var6 = sj.field_b[param1];
                var7 = var5 * this.field_r >> 12;
                var8 = this.field_t * var6 >> 12;
                var9 = var5 % (4096 / this.field_r) * this.field_r;
                var10 = var6 % (4096 / this.field_t) * this.field_t;
                if (var10 < this.field_m) {
                  for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                  }
                  while (var7 > 3) {
                    var7 -= 4;
                  }
                  if (1 != var7) {
                    break L11;
                  }
                  if (var9 < this.field_m) {
                    var13[var4] = 0;
                    break L10;
                  }
                }
                if (var9 >= this.field_m) {
                  var13[var4] = 4096;
                  break L10;
                }
                for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                }
                while (var7 > 3) {
                  var7 -= 4;
                }
                if (var7 <= 0) {
                  var13[var4] = 4096;
                  break L10;
                }
              }
              var13[var4] = 0;
            }
          }
          return var3;
        }
        if (!this.field_i.field_d) {
          return var3;
        }
        for (var4Lifetime1 = 0; ns.field_g > var4Lifetime1; var4Lifetime1++) {
          L1: {
            L2: {
              var5Lifetime1 = ht.field_Fb[var4Lifetime1];
              var6Lifetime1 = sj.field_b[param1];
              var7Lifetime1 = var5Lifetime1 * this.field_r >> 12;
              var8Lifetime1 = this.field_t * var6Lifetime1 >> 12;
              var9Lifetime1 = var5Lifetime1 % (4096 / this.field_r) * this.field_r;
              var10Lifetime1 = var6Lifetime1 % (4096 / this.field_t) * this.field_t;
              if (var10Lifetime1 < this.field_m) {
                for (var7Lifetime1 = var7Lifetime1 - var8Lifetime1; var7Lifetime1 < 0; var7Lifetime1 += 4) {
                }
                while (var7Lifetime1 > 3) {
                  var7Lifetime1 -= 4;
                }
                if (1 != var7Lifetime1) {
                  break L2;
                }
                if (var9Lifetime1 < this.field_m) {
                  var13[var4Lifetime1] = 0;
                  break L1;
                }
              }
              if (var9Lifetime1 < this.field_m) {
                for (var7Lifetime1 = var7Lifetime1 - var8Lifetime1; var7Lifetime1 < 0; var7Lifetime1 += 4) {
                }
                while (var7Lifetime1 > 3) {
                  var7Lifetime1 -= 4;
                }
                if (var7Lifetime1 > 0) {
                  break L2;
                }
              }
              var13[var4Lifetime1] = 4096;
              break L1;
            }
            var13[var4Lifetime1] = 0;
          }
        }
        return var3;
    }

    public vc() {
        super(0, true);
        this.field_r = 1;
        this.field_m = 204;
        this.field_t = 1;
    }

    static {
        field_o = "Kick";
        field_s = "Accept";
        field_n = new StringBuilder(80);
    }
}
