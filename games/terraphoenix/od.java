/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static ba[] field_h;
    static re[] field_c;
    static String field_b;
    static bg field_e;
    static boolean field_a;
    static String field_f;
    static o field_g;
    static String field_d;

    final static boolean b() {
        return ig.field_e != null && mh.field_a.a(true);
    }

    final static void a(dc param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0.field_h == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (param0.field_f != 0) {
                    break L2;
                  } else {
                    if (param0.field_j == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= am.field_J) {
                    break L1;
                  } else {
                    L4: {
                      var3 = ra.field_i[var2_int];
                      if (var3.field_l != 2) {
                        break L4;
                      } else {
                        if (var3.field_f != param0.field_f) {
                          break L4;
                        } else {
                          if (var3.field_j != param0.field_j) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_i != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              int discarded$2 = -119;
              jd.a(param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("od.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + -97 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_f = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new re[21];
        field_b = "Waiting for music";
        field_h = new ba[255];
        for (var0 = 0; field_h.length > var0; var0++) {
            field_h[var0] = new ba();
        }
        field_f = "Start the mission";
        field_g = new o();
        field_d = "Close minimap";
    }
}
