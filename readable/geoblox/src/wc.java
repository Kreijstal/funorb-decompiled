/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends hf {
    int field_h;
    byte[] field_f;
    static volatile boolean field_g;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = qj.a(param1, "", '_', (byte) 127);
              var3 = bj.a(82, param1);
              if (param2 <= -77) {
                break L1;
              } else {
                field_g = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0.indexOf(param1) != -1) {
                  break L3;
                } else {
                  if (param0.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("wc.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
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
        field_g = true;
    }
}
