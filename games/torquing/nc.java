/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static int field_a;
    static String field_c;
    static String field_b;
    static t[] field_d;

    final static void a(int param0, boolean param1) {
        ik var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ik stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ik stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ik stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ik stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        ik stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (!ia.a(-22426, 0)) {
                break L1;
              } else {
                param0 = 6;
                break L1;
              }
            }
            var2 = (ik) ((Object) qc.field_Y.b(0));
            L2: while (true) {
              if (var2 == null) {
                if (param1) {
                  break L0;
                } else {
                  nc.a(-39);
                  return;
                }
              } else {
                L3: {
                  if (var2.field_p == param0) {
                    break L3;
                  } else {
                    L4: {
                      stackOut_6_0 = (ik) (var2);
                      stackOut_6_1 = param0;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (param1) {
                        stackOut_8_0 = (ik) ((Object) stackIn_8_0);
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L4;
                      } else {
                        stackOut_7_0 = (ik) ((Object) stackIn_7_0);
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L4;
                      }
                    }
                    ((ik) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0);
                    break L3;
                  }
                }
                L5: {
                  var3 = var2.field_r;
                  if (4 == param0) {
                    var3 = var2.field_r >> -1475667966;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-8 == (param0 ^ -1)) {
                    var3 = (var2.field_n + 480) * var2.field_r / 1920;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var2.field_j.e(var2.field_l >> 1895814082, 0, var3);
                var2 = (ik) ((Object) qc.field_Y.f(-24059));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "nc.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 53) {
            return;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_b = "Circuitous Route";
        field_c = "Skin";
    }
}
