/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jda extends ci {
    static int field_m;

    final static void a(boolean param0, int param1) {
        gl.a(false, param0, (byte) 116);
        if (param1 != 262144) {
            field_m = -89;
        }
    }

    public jda() {
        super(1, true);
    }

    final static boolean d(int param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        if (param1 == -28090) {
          L0: {
            stackIn_4_0 = go.d(param0, param2, param1 ^ -3045);

            if (-1 == (262144 & param2 ^ -1)) {
              stackIn_5_0 = stackIn_4_0;
              stackIn_5_1 = 0;
              break L0;
            } else {
              stackIn_5_0 = stackIn_4_0;
              stackIn_5_1 = 1;
              break L0;
            }
          }
          if (stackIn_5_0 | stackIn_5_1 == 0) {
            if (no.a(param0, param2, 36864)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_8_0 = 1;
            return stackIn_8_0 != 0;
          }
        } else {
          return false;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int[][] var4;
        int[] var5;
        int[] var6;
        int[] var7;
        int var8;
        int var9;
        int[] var10;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = this.field_i.a((byte) -103, param1);
        var3 = var10;
        if (param0 == 1) {
          if (!this.field_i.field_d) {
            return var3;
          } else {
            var4 = this.a(param1, 0, -1);
            var5 = var4[0];
            var6 = var4[1];
            var7 = var4[2];
            var8 = 0;
            L0: while (true) {
              if (ns.field_g <= var8) {
                return var3;
              } else {
                var10[var8] = (var7[var8] + (var6[var8] + var5[var8])) / 3;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return (int[]) null;
        }
    }

    static {
    }
}
