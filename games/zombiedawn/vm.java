/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends vf {
    private int field_r;
    private int field_v;
    private vn[] field_s;
    static int field_w;
    private int field_t;
    static int[][] field_u;

    final static vn[] a(byte param0, String param1, String param2, dj param3) {
        int var4 = param3.a(param2, (byte) 8);
        int var6 = -84 / ((param0 - 64) / 43);
        int var5 = param3.a(var4, param1, true);
        return ji.a(param3, -1, var4, var5);
    }

    final static boolean c(int param0) {
        int[] var13 = null;
        int[] var11 = null;
        int[] var6 = null;
        int[] var1 = null;
        int[] var7 = null;
        int var3 = 0;
        int[] var14 = null;
        int[] var12 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var4 = ZombieDawn.field_J;
        if (!(hg.field_b != null)) {
            hg.field_b = l.b(67, 4);
        }
        if (!(!hg.field_b.field_o)) {
            var13 = dj.field_i;
            var11 = var13;
            var6 = var11;
            var1 = var6;
            var7 = hg.field_b.field_k;
            for (var3 = 0; (var3 ^ -1) > -9; var3++) {
                var6[var3] = hi.a(var13[var3], var7[var3]);
            }
            var14 = kg.field_g;
            var12 = var14;
            var8 = var12;
            var1 = var8;
            var9 = hg.field_b.field_k;
            var10 = 0;
            var3 = var10;
            while (8 > var10) {
                var8[var10] = eg.a(var14[var10], var9[var10] ^ -1);
                var10++;
            }
            hg.field_b = null;
            return true;
        }
        if (param0 != 1) {
            Object var5 = null;
            vn[] discarded$0 = vm.a((byte) 126, (String) null, (String) null, (dj) null);
            return false;
        }
        return false;
    }

    public vm() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_u = null;
        if (!param0) {
            field_w = -51;
        }
    }

    private vm(int param0, int param1, int param2) {
        ((vm) this).field_s = ia.field_d;
        ((vm) this).field_r = param1;
        ((vm) this).field_m = rk.field_b;
        ((vm) this).field_v = param0;
        ((vm) this).field_t = param2;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          if (!param3.field_l) {
            if (param3.e(-17741)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_6_0;
        if (param0 == 16777215) {
          L1: {
            if (!(param3 instanceof an)) {
              break L1;
            } else {
              param1 = param1 & ((an) (Object) param3).field_C;
              break L1;
            }
          }
          L2: {
            if (!param1) {
              stackOut_14_0 = ((vm) this).field_t;
              stackIn_15_0 = stackOut_14_0;
              break L2;
            } else {
              if (var6 == 0) {
                stackOut_13_0 = ((vm) this).field_v;
                stackIn_15_0 = stackOut_13_0;
                break L2;
              } else {
                stackOut_12_0 = ((vm) this).field_r;
                stackIn_15_0 = stackOut_12_0;
                break L2;
              }
            }
          }
          L3: {
            var7 = stackIn_15_0;
            tm.a(param3.field_k + param4, 32421, (param3.field_n - ((vm) this).field_s[0].field_q >> -1436022879) + (param2 + param3.field_j), ((vm) this).field_s, var7, param3.field_i);
            if (param1) {
              stackOut_17_0 = 16777215;
              stackIn_18_0 = stackOut_17_0;
              break L3;
            } else {
              stackOut_16_0 = 7105644;
              stackIn_18_0 = stackOut_16_0;
              break L3;
            }
          }
          var8 = stackIn_18_0;
          int discarded$1 = ((vm) this).field_m.a(param3.field_o, param3.field_k + param4, param3.field_j + (param2 + -2), param3.field_i, param3.field_n, var8, -1, 1, 1, ((vm) this).field_m.field_I);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
    }
}
