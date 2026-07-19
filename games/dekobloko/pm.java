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
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -2141435999) {
                break L1;
              } else {
                discarded$2 = pm.a(7, 120, -115);
                break L1;
              }
            }
            var4 = rn.field_d;
            L2: while (true) {
              L3: {
                if (ef.field_M.length <= var3_int) {
                  stackOut_13_0 = -1;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  var5 = ug.field_q[var3_int];
                  stackOut_5_0 = -1;
                  stackIn_14_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_6_0 < (var5 ^ -1)) {
                          break L5;
                        } else {
                          var6 = qb.a(0, ef.field_M[var3_int], true);
                          var4 = var4 + je.field_c;
                          var7 = -(var6 >> -2141435999) + af.field_f;
                          if (!gi.a(17, param0, param2, var6 + (ba.field_d << 695051425), var4, vb.field_V - -(le.field_t << 1525011617), var7 + -ba.field_d)) {
                            var4 = var4 + ((le.field_t << -201922079) + (je.field_c + vb.field_V));
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            stackOut_8_0 = var5;
                            stackIn_9_0 = stackOut_8_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var4 = var4 + ma.field_I;
                      break L4;
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "pm.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_b = false;
        field_a = "You have declined the invitation.";
        field_c = "Sound: ";
        field_f = 0;
    }
}
