/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends hf {
    int field_h;
    byte[] field_f;
    static volatile boolean field_g;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = qj.a(param1, "", '_', (byte) 127);
        var3 = bj.a(82, param1);
        if (param2 <= -77) {
          if (param0.indexOf(param1) == -1) {
            if (param0.indexOf(var3) != -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_g = true;
          if (param0.indexOf(param1) != -1) {
            return true;
          } else {
            L0: {
              if (param0.indexOf(var3) == -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(float param0, byte param1) {
        if (!((jf.field_j ^ -1) >= -1)) {
            return;
        }
        r.field_ub = rj.field_c;
        int var3 = -71 / ((-59 - param1) / 47);
        float var2 = param0 / 52900.0f;
        int var4 = (int)(0.5f + 4.0f * var2);
        md.field_b = (float)(-(rj.field_c >> 1885504112 & 255) + ((uf.field_h[var4] & 16722826) >> -1433217648));
        fe.field_c = (float)((uf.field_h[var4] >> -1928984216 & 255) + -(rj.field_c >> -846446392 & 255));
        uk.field_j = (float)(-(255 & rj.field_c) + (255 & uf.field_h[var4]));
        jf.field_j = 50;
    }

    private wc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
    }
}
