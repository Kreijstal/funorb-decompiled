/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv extends le {
    private int field_j;
    private int field_m;
    private int field_i;
    private int[] field_k;
    static String field_l;

    public wv() {
        super(0, false);
        ((wv) this).field_i = -1;
    }

    final void a(int param0, int param1, ds param2) {
        if (param1 > -60) {
            wv.d(-72);
        }
        if (param0 == 0) {
            ((wv) this).field_i = param2.e(1869);
        }
    }

    public static void d(int param0) {
        if (param0 != 65280) {
            return;
        }
        field_l = null;
    }

    final void c(int param0) {
        super.c(-115);
        ((wv) this).field_k = null;
        if (param0 > -23) {
            ((wv) this).field_i = 99;
        }
    }

    final int d(byte param0) {
        if (param0 < 62) {
            ((wv) this).c(111);
        }
        return ((wv) this).field_i;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var11 = VoidHunters.field_G;
        if (param0 == 255) {
          L0: {
            var16 = ((wv) this).field_d.a(param1, (byte) -101);
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var3 = var12;
            if (!((wv) this).field_d.field_g) {
              break L0;
            } else {
              L1: {
                stackOut_3_0 = ((wv) this).field_m;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (noa.field_o != ((wv) this).field_j) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = ((wv) this).field_j * param1 / noa.field_o;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = param1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              var4 = stackIn_6_0 * stackIn_6_1;
              var5 = var16[0];
              var6 = var16[1];
              var7 = var16[2];
              if (((wv) this).field_m != hob.field_d) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= hob.field_d) {
                    break L0;
                  } else {
                    var9 = var8 * ((wv) this).field_m / hob.field_d;
                    var10 = ((wv) this).field_k[var4 - -var9];
                    var7[var8] = dla.a(255, var10) << 975436100;
                    var6[var8] = dla.a(var10 >> -1942130620, 4080);
                    var5[var8] = dla.a(16711680, var10) >> -1656817044;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (hob.field_d <= var8) {
                    break L0;
                  } else {
                    var4++;
                    var9 = ((wv) this).field_k[var4];
                    var7[var8] = dla.a(var9 << -1820230716, 4080);
                    var6[var8] = dla.a(var9, 65280) >> 1134535780;
                    var5[var8] = dla.a(var9 >> 443042092, 4080);
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        super.b(param0, param1, param2);
        if (((wv) this).field_i >= 0) {
            if (!(nl.field_e == null)) {
                var4 = nl.field_e.a(-20292, ((wv) this).field_i).field_h ? 64 : 128;
                ((wv) this).field_k = nl.field_e.a(var4, 1.0f, true, ((wv) this).field_i, var4, false);
                ((wv) this).field_j = var4;
                ((wv) this).field_m = var4;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Back";
    }
}
