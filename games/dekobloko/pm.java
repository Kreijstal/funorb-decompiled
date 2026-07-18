/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static boolean field_b;
    static String field_a;
    static long field_e;
    static int field_g;
    static String field_c;
    static int field_f;
    static int field_d;

    public static void a() {
        int var1 = -13;
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -2141435999) {
                break L1;
              } else {
                int discarded$2 = pm.a(7, 120, -115);
                break L1;
              }
            }
            var4 = rn.field_d;
            L2: while (true) {
              if (ef.field_M.length <= var3_int) {
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  var5 = ug.field_q[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + ma.field_I;
                    var3_int++;
                    break L3;
                  } else {
                    var6 = qb.a(0, ef.field_M[var3_int], true);
                    var4 = var4 + je.field_c;
                    var7 = -(var6 >> 1) + af.field_f;
                    if (!gi.a(17, param0, param2, var6 + (ba.field_d << 1), var4, vb.field_V - -(le.field_t << 1), var7 + -ba.field_d)) {
                      var4 = var4 + ((le.field_t << 1) + (je.field_c + vb.field_V));
                      var3_int++;
                      break L3;
                    } else {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "pm.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "You have declined the invitation.";
        field_c = "Sound: ";
        field_f = 0;
    }
}
