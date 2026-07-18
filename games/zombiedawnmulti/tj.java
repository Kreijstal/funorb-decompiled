/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_d;
    static int field_c;
    static eq field_a;
    static cj field_b;
    static boolean field_f;
    static String[][] field_e;

    final static void a(int param0, int param1) {
        we var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            db.field_c = param1;
            var2 = (we) (Object) gb.field_e.c(72);
            L1: while (true) {
              if (var2 == null) {
                L2: {
                  if (param0 == 3273) {
                    break L2;
                  } else {
                    tj.a(30, 48);
                    break L2;
                  }
                }
                if (null != wc.field_K) {
                  var2 = (we) (Object) wc.field_K.c(119);
                  L3: while (true) {
                    if (var2 == null) {
                      break L0;
                    } else {
                      L4: {
                        if (var2.field_h.b(param0 ^ 3277)) {
                          var2.field_f.d(128 + db.field_c * var2.field_m >> 8);
                          break L4;
                        } else {
                          var2.a(true);
                          break L4;
                        }
                      }
                      var2 = (we) (Object) wc.field_K.b(6);
                      continue L3;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L5: {
                  if (!var2.field_h.b(param0 ^ 3277)) {
                    var2.a(true);
                    break L5;
                  } else {
                    var2.field_f.d(128 + var2.field_m * db.field_c >> 8);
                    break L5;
                  }
                }
                var2 = (we) (Object) gb.field_e.b(6);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2_ref, "tj.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0) {
            tj.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Solicitation";
        field_c = -1;
        field_e = new String[][]{new String[5], new String[0]};
    }
}
