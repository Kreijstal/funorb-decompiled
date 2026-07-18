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
        int stackOut_25_0 = 0;
        L0: {
          var5 = -14 + vkb.a(35, param4 ^ param4 >> 31 | param2 >> 31 ^ param2 | param0 ^ param0 >> 31);
          if (var5 > 0) {
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
            var8 = (-param2 + var7 << 8) / param4;
            var9 = (-param2 + -var7 << 8) / param4;
            if (var8 >= 0) {
              if (var8 <= 256) {
                L1: {
                  if (0 > var9) {
                    stackOut_24_0 = var8;
                    stackIn_26_0 = stackOut_24_0;
                    break L1;
                  } else {
                    if (~var8 < ~var9) {
                      stackOut_25_0 = var9;
                      stackIn_26_0 = stackOut_25_0;
                      break L1;
                    } else {
                      return var8;
                    }
                  }
                }
                return stackIn_26_0;
              } else {
                if (var9 >= 0) {
                  if (var9 <= 256) {
                    return var9;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (var9 >= 0) {
                if (var9 <= 256) {
                  return var9;
                } else {
                  return -1;
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
