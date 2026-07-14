/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq {
    static String field_b;
    static String field_e;
    byte[] field_m;
    int field_n;
    int field_d;
    byte[] field_g;
    static int[] field_h;
    int field_f;
    int field_i;
    int field_l;
    static String[] field_k;
    int field_c;
    int field_j;
    static String field_a;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        var6 = param4;
        var7 = -param4;
        var8 = -1;
        if (param3 == -13) {
          nra.a((byte) -55, param2, param4 + param1, vaa.field_a[param0], -param4 + param1);
          L0: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L1: {
                var8 += 2;
                var5++;
                var7 = var7 + var8;
                if (0 > var7) {
                  break L1;
                } else {
                  var6--;
                  var7 = var7 - (var6 << -1333958623);
                  var14 = vaa.field_a[var6 + param0];
                  var15 = vaa.field_a[-var6 + param0];
                  var11 = param1 + var5;
                  var12 = -var5 + param1;
                  nra.a((byte) -55, param2, var11, var14, var12);
                  nra.a((byte) -55, param2, var11, var15, var12);
                  break L1;
                }
              }
              var9 = param1 + var6;
              var10 = param1 - var6;
              var16 = vaa.field_a[var5 + param0];
              var17 = vaa.field_a[-var5 + param0];
              nra.a((byte) -55, param2, var9, var16, var10);
              nra.a((byte) -55, param2, var9, var17, var10);
              continue L0;
            }
          }
        } else {
          bq.a(61, -28, 117, (byte) -18, -123);
          nra.a((byte) -55, param2, param4 + param1, vaa.field_a[param0], -param4 + param1);
          L2: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L3: {
                var8 += 2;
                var5++;
                var7 = var7 + var8;
                if (0 > var7) {
                  break L3;
                } else {
                  var6--;
                  var7 = var7 - (var6 << -1333958623);
                  var18 = vaa.field_a[var6 + param0];
                  var19 = vaa.field_a[-var6 + param0];
                  var11 = param1 + var5;
                  var12 = -var5 + param1;
                  nra.a((byte) -55, param2, var11, var18, var12);
                  nra.a((byte) -55, param2, var11, var19, var12);
                  break L3;
                }
              }
              var9 = param1 + var6;
              var10 = param1 - var6;
              var20 = vaa.field_a[var5 + param0];
              var21 = vaa.field_a[-var5 + param0];
              nra.a((byte) -55, param2, var9, var20, var10);
              nra.a((byte) -55, param2, var9, var21, var10);
              continue L2;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -31 / ((-57 - param0) / 53);
        field_b = null;
        field_h = null;
        field_e = null;
        field_k = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_e = "People, objects and projectiles that enter a portal will instantly appear somewhere else. It's a piece of cake.";
        field_a = "Point Lights: ";
    }
}
