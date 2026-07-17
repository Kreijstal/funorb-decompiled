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
            var2 = (ik) (Object) qc.field_Y.b(0);
            L2: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                L3: {
                  if (var2.field_p == param0) {
                    break L3;
                  } else {
                    var2.a(param0, false);
                    break L3;
                  }
                }
                L4: {
                  var3 = var2.field_r;
                  if (4 == param0) {
                    var3 = var2.field_r >> 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 == 7) {
                    var3 = (var2.field_n + 480) * var2.field_r / 1920;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2.field_j.e(var2.field_l >> 2, 0, var3);
                var2 = (ik) (Object) qc.field_Y.f(-24059);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2_ref, "nc.B(" + param0 + 44 + 1 + 41);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Circuitous Route";
        field_c = "Skin";
    }
}
