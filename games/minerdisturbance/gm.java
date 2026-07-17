/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static boolean field_a;
    static String field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 == 100) {
                break L1;
              } else {
                gm.b(26);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 3) {
                break L0;
              } else {
                L3: {
                  if (null == pa.field_a[var1_int]) {
                    break L3;
                  } else {
                    if (!pa.field_a[var1_int].k()) {
                      var1_int++;
                      var1_int++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                pa.field_a[var1_int] = rc.a(re.field_a[ll.a((byte) -73, 5) + 25], 100, oc.field_f);
                sa discarded$7 = mg.a(1963987425, pa.field_a[var1_int]);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "gm.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_c = "Loading music";
        field_b = "ON";
    }
}
