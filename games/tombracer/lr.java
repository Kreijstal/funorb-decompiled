/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends RuntimeException {
    String field_d;
    static jea field_b;
    Throwable field_a;
    static String field_e;
    static int field_c;

    final static int a(una param0, int param1) {
        if (param0 != una.field_a) {
          if (param0 != una.field_k) {
            if (param0 != una.field_m) {
              if (una.field_g != param0) {
                if (una.field_f != param0) {
                  if (param0 != una.field_i) {
                    if (param0 != una.field_l) {
                      if (param0 != una.field_h) {
                        if (param1 != 5126) {
                          return 1;
                        } else {
                          throw new IllegalArgumentException("");
                        }
                      } else {
                        return 5126;
                      }
                    } else {
                      return 5131;
                    }
                  } else {
                    return 5125;
                  }
                } else {
                  return 5123;
                }
              } else {
                return 5121;
              }
            } else {
              return 5124;
            }
          } else {
            return 5122;
          }
        } else {
          return 5120;
        }
    }

    final static float a(float param0, int param1, float param2, float param3) {
        if (param1 != 5122) {
          field_b = null;
          return param0 * (-param3 + param2) + param3;
        } else {
          return param0 * (-param3 + param2) + param3;
        }
    }

    lr(Throwable param0, String param1) {
        ((lr) this).field_a = param0;
        ((lr) this).field_d = param1;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        if (param0) {
            Object var2 = null;
            int discarded$0 = lr.a((una) null, 48);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Nutritious and delicious, there are rumours that this foul-smelling concoction has helpful effects when heated.";
    }
}
