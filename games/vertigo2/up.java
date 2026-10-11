/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends ji {
    static cb field_z;
    private int field_E;
    private int field_C;
    static String field_D;
    static String field_y;
    static si[] field_B;
    private int field_A;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            return;
          }
          var4_int = param1;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_A = param2.a((byte) -11);
              }
            } else {
              this.field_E = param2.h(-11);
            }
          } else {
            this.field_C = param2.h(-11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("up.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 != -3144) {
          field_y = (String) null;
        }
        field_B = null;
        field_z = null;
        field_y = null;
        field_D = null;
    }

    final int[] c(int param0, int param1) {
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
        var11 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          this.field_A = 97;
        }
        var13 = this.field_x.a(param0, (byte) 62);
        var12 = var13;
        var3 = var12;
        if (this.field_x.field_i) {
          for (var4 = 0; var4 < we.field_M; var4++) {
            boolean decompiledFrameRemainder0 = true;
            var5 = rh.field_O[var4];
            var6 = lf.field_y[param0];
            var7 = var5 * this.field_C >> 12;
            var8 = var6 * this.field_E >> 12;
            var9 = var5 % (4096 / this.field_C) * this.field_C;
            var10 = this.field_E * (var6 % (4096 / this.field_E));
            if (this.field_A > var10) {
              for (var7 = var7 - var8; var7 < 0; var7 += 4) {
              }
              while (var7 > 3) {
                var7 -= 4;
              }
              var13 = var12;
              if (var7 != 1) {
                var13[var4] = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                var13 = var12;
                if (this.field_A > var9) {
                  var13[var4] = 0;
                  decompiledFrameRemainder0 = false;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (var9 < this.field_A) {
                for (var7 = var7 - var8; var7 < 0; var7 += 4) {
                }
                while (var7 > 3) {
                  var7 -= 4;
                }
                if (var7 > 0) {
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
        return var3;
    }

    public up() {
        super(0, true);
        this.field_E = 1;
        this.field_A = 204;
        this.field_C = 1;
    }

    static {
        field_D = "Message game";
        field_y = "Unrated game";
        field_B = new si[3];
    }
}
