/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static sl field_d;
    static cf field_b;
    static int field_e;
    static eg field_c;
    static int[] field_g;
    static dk field_f;
    static ka[] field_a;

    final static int a(int param0, int param1, int param2) {
        if (null == ub.field_e) {
          return -1;
        } else {
          if (param2 >= wc.field_b) {
            if (ub.field_e.field_u + wc.field_b > param2) {
              L0: {
                if (bi.field_i > param0) {
                  break L0;
                } else {
                  if (param0 >= ub.field_e.field_x + bi.field_i) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (field_e <= param2) {
                if (param2 < ub.field_e.field_u + field_e) {
                  if (ii.field_a <= param0) {
                    if (ub.field_e.field_x + ii.field_a > param0) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              if (field_e <= param2) {
                if (param2 < ub.field_e.field_u + field_e) {
                  if (ii.field_a <= param0) {
                    if (ub.field_e.field_x + ii.field_a <= param0) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (field_e <= param2) {
              if (param2 < ub.field_e.field_u + field_e) {
                if (ii.field_a <= param0) {
                  if (ub.field_e.field_x + ii.field_a <= param0) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    public static void a() {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new sl();
        field_b = new cf();
        field_g = new int[4];
    }
}
