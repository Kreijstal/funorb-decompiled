/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class msa {
    static int field_a;
    static String field_b;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = gha.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((param0 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            var2_int = -69 % ((param1 - 34) / 55);
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "msa.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    static {
        field_a = 0;
        field_b = "Scarlett";
    }
}
