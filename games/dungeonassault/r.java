/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static int field_c;
    static int[] field_b;
    static String field_a;

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        if (param1) {
          if (i.field_t[param2] < i.field_t[param3]) {
            return true;
          } else {
            if (i.field_t[param2] <= i.field_t[param3]) {
              if (ci.field_n[param2] >= ci.field_n[param3]) {
                if (ci.field_n[param3] >= ci.field_n[param2]) {
                  var4 = tc.field_w[param2] + mf.field_d[param2] - -wa.field_m[param2];
                  var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param2 >= param3) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L0;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L0;
                        }
                      }
                      return stackIn_33_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (ci.field_n[param2] >= ci.field_n[param3]) {
            if (ci.field_n[param2] > ci.field_n[param3]) {
              return false;
            } else {
              if (i.field_t[param2] >= i.field_t[param3]) {
                if (i.field_t[param2] <= i.field_t[param3]) {
                  var4 = tc.field_w[param2] + mf.field_d[param2] - -wa.field_m[param2];
                  var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
                  if (var5 <= var4) {
                    if (var4 <= var5) {
                      if (param2 >= param3) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1) {
        lm.field_k = (param1 & 54) >> 4;
        mp.field_d = (12 & param1) >> 2;
        if (!(2 >= lm.field_k)) {
            lm.field_k = 2;
        }
        uk.field_c = param1 & 3;
        if (!(2 >= mp.field_d)) {
            mp.field_d = 2;
        }
        if (!(2 >= uk.field_c)) {
            uk.field_c = 2;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 4;
        field_a = "EXIT";
    }
}
