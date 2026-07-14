/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vma {
    private static String field_z;

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          if ((param1 ^ -1) <= -1) {
            break L0;
          } else {
            param1 = -param1;
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (65535 < param1) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-256 <= param1) {
            break L2;
          } else {
            var2 = var2 | 8;
            param1 = param1 >>> 8;
            break L2;
          }
        }
        if (param0 <= 110) {
          return 86;
        } else {
          L3: {
            if (-16 < param1) {
              param1 = param1 >>> 4;
              var2 = var2 | 4;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (-4 <= (param1 ^ -1)) {
              break L4;
            } else {
              param1 = param1 >>> 2;
              var2 = var2 | 2;
              break L4;
            }
          }
          L5: {
            if ((param1 ^ -1) >= -2) {
              break L5;
            } else {
              param1 = param1 >>> 1;
              var2 = var2 | 1;
              break L5;
            }
          }
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "vma.A(";
    }
}
