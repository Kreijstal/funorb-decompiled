/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int field_d;
    static int field_b;
    static String field_e;
    static String[] field_c;
    static String field_a;

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = stellarshard.field_B;
        try {
          L0: {
            na.field_d.a(true, (byte) -123, ll.field_d, gi.field_c);
            na.field_d.f((byte) -127);
            L1: while (true) {
              if (!qh.c(123)) {
                if (-1 != ee.field_a) {
                  var1_int = ee.field_a;
                  rh.a(-1, (byte) -72);
                  stackIn_7_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L2: {
                    if (param0 < -82) {
                      break L2;
                    } else {
                      field_d = -92;
                      break L2;
                    }
                  }
                  if (!ck.field_db) {
                    if (dj.field_a != el.field_E) {
                      if (al.field_f.a(true)) {
                        if (dj.field_a != o.field_l) {
                          stackIn_23_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_21_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                na.field_d.a(gi.field_f, uc.field_b, true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "td.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_23_0;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 != -17) {
            field_c = (String[]) null;
        }
    }

    static {
        field_b = 10;
        field_a = "Close";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_e = "Laser";
    }
}
