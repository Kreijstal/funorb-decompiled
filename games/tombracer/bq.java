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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = param4;
              var7 = -param4;
              var8 = -1;
              if (param3 == -13) {
                break L1;
              } else {
                bq.a(61, -28, 117, (byte) -18, -123);
                break L1;
              }
            }
            nra.a((byte) -55, param2, param4 + param1, vaa.field_a[param0], -param4 + param1);
            L2: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L3: {
                  var8 += 2;
                  var5_int++;
                  var7 = var7 + var8;
                  if (0 > var7) {
                    break L3;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << 1);
                    var9_ref_int__ = vaa.field_a[var6 + param0];
                    var10_ref_int__ = vaa.field_a[-var6 + param0];
                    var11_int = param1 + var5_int;
                    var12_int = -var5_int + param1;
                    nra.a((byte) -55, param2, var11_int, var9_ref_int__, var12_int);
                    nra.a((byte) -55, param2, var11_int, var10_ref_int__, var12_int);
                    break L3;
                  }
                }
                var9 = param1 + var6;
                var10 = param1 - var6;
                var11 = vaa.field_a[var5_int + param0];
                var12 = vaa.field_a[-var5_int + param0];
                nra.a((byte) -55, param2, var9, var11, var10);
                nra.a((byte) -55, param2, var9, var12, var10);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "bq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
        int var1 = 31;
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
