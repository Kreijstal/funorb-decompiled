/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends llb {
    static byte[] field_zb;
    int field_yb;
    llb field_wb;
    static boolean field_xb;
    llb field_Eb;
    String field_Cb;
    String field_Ab;
    llb field_Bb;
    String field_vb;
    static int field_Db;
    String field_Fb;

    final static int b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_26_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var5 = -14 + vkb.a(param1 + 35, param4 ^ param4 >> 968220511 | param2 >> -58486145 ^ param2 | param0 ^ param0 >> 721639711);
          if (-1 > (var5 ^ -1)) {
            param2 = param2 >> var5;
            param4 = param4 >> var5;
            param0 = param0 >> var5;
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 <= 0) {
          return -1;
        } else {
          var6 = param2 * param2 + -(param0 * (2 * param4));
          if (var6 < 0) {
            return -1;
          } else {
            var7 = lw.a((byte) -73, var6);
            var8 = (-param2 + var7 << param3) / param4;
            var9 = (-param2 + -var7 << param3) / param4;
            if (var8 >= param1) {
              if (1 << param3 >= var8) {
                if (0 <= var9) {
                  if (var8 <= var9) {
                    return var8;
                  } else {
                    return var9;
                  }
                } else {
                  stackOut_24_0 = var8;
                  stackIn_26_0 = stackOut_24_0;
                  return stackIn_26_0;
                }
              } else {
                if (-1 >= (var9 ^ -1)) {
                  if (1 << param3 < var9) {
                    return -1;
                  } else {
                    return var9;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (-1 >= (var9 ^ -1)) {
                if (1 << param3 < var9) {
                  return -1;
                } else {
                  return var9;
                }
              } else {
                return -1;
              }
            }
          }
        }
    }

    public static void e(byte param0) {
        field_zb = null;
        if (param0 != 113) {
            int discarded$0 = vu.b(30, 61, 5, 19, 62);
        }
    }

    vu() {
        super(0L, (llb) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = 36;
    }
}
