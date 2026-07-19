/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cfa extends bw {
    int field_j;
    int field_i;
    int field_g;
    int field_k;
    int field_h;
    int field_f;

    final static void a(int param0, int param1, float param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = 100;
              if (var6_int < param0) {
                param0 = var6_int;
                break L1;
              } else {
                break L1;
              }
            }
            var7 = 16 / var6_int + 1;
            var8 = var6_int * var7;
            var16 = new int[4 + var8 * 2];
            var15 = var16;
            var9 = var15;
            var10 = 0;
            var11 = param0;
            if (-1 != (var11 ^ -1)) {
              var16[0] = param3;
              var16[1] = param5;
              var12 = var11 * var7;
              var13 = 0;
              if (param1 == 13574) {
                L2: while (true) {
                  if (var12 < var13) {
                    sq.a(var16, 0, 2 * (2 + var12), param4);
                    var10 = var10 + var12;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var9[2 + 2 * var13] = param3 - (int)((double)param2 * Math.sin(6.283185307179586 * (double)(-(var10 - -var13)) / (double)var8));
                    var9[1 + (2 - -(2 * var13))] = -(int)(Math.cos((double)(-(var13 + var10)) * 6.283185307179586 / (double)var8) * (double)param2) + param5;
                    var13++;
                    continue L2;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "cfa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private cfa() throws Throwable {
        throw new Error();
    }

    static {
    }
}
