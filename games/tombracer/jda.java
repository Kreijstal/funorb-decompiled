/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jda extends ci {
    static int field_m;

    final static void a(boolean param0, int param1) {
        gl.a(false, param0, (byte) 116);
    }

    public jda() {
        super(1, true);
    }

    final static boolean d(int param0, int param1, int param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        if (param1 == -28090) {
          L0: {
            stackOut_2_0 = go.d(param0, param2, param1 ^ -3045);
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if ((262144 & param2) == 0) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
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
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            return stackIn_8_0 != 0;
          }
        } else {
          return false;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = ((jda) this).field_i.a((byte) -103, param1);
        var3 = var10;
        if (param0 == 1) {
          if (!((jda) this).field_i.field_d) {
            return var3;
          } else {
            var4 = ((jda) this).a(param1, 0, -1);
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
          return null;
        }
    }

    static {
    }
}
