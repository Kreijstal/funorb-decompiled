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

    public static void a(int param0) {
        int var1 = -26 / ((param0 - -34) / 48);
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -2141435999) {
                break L1;
              } else {
                pm.a(7, 120, -115);
                break L1;
              }
            }
            var4 = rn.field_d;
            L2: while (true) {
              if (ef.field_M.length <= var3_int) {
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = ug.field_q[var3_int];
                  if (-1 < (var5 ^ -1)) {
                    var4 = var4 + ma.field_I;
                    break L3;
                  } else {
                    var6 = qb.a(0, ef.field_M[var3_int], true);
                    var4 = var4 + je.field_c;
                    var7 = -(var6 >> -2141435999) + af.field_f;
                    if (!gi.a(17, param0, param2, var6 + (ba.field_d << 695051425), var4, vb.field_V - -(le.field_t << 1525011617), var7 + -ba.field_d)) {
                      var4 = var4 + ((le.field_t << -201922079) + (je.field_c + vb.field_V));
                      break L3;
                    } else {
                      stackIn_8_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
          throw dh.a((Throwable) ((Object) var3), "pm.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_14_0;
        }
    }

    static {
        field_b = false;
        field_a = "You have declined the invitation.";
        field_c = "Sound: ";
        field_f = 0;
    }
}
