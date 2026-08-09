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
        ik stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ik stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  if ((var2.field_p ^ -1) == (param0 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      stackIn_10_0 = (ik) (var2);

                      stackIn_10_1 = param0;

                      if (param1) {
                        stackIn_11_0 = (ik) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 0;
                        break L4;
                      } else {
                        stackIn_11_0 = (ik) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 1;
                        break L4;
                      }
                    }
                    ((ik) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0);
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
