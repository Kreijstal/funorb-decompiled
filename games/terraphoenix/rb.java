/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static int[] field_a;
    static String field_c;
    static String[] field_d;
    static String[] field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        if (param1) {
          if (a.field_c[param0] < a.field_c[param3]) {
            return true;
          } else {
            if (a.field_c[param0] > a.field_c[param3]) {
              return false;
            } else {
              if (al.field_bb[param3] > al.field_bb[param0]) {
                return true;
              } else {
                if (al.field_bb[param0] <= al.field_bb[param3]) {
                  var4 = oa.field_a[param0] - (-oa.field_c[param0] - dd.field_L[param0]);
                  var5 = dd.field_L[param3] + (oa.field_a[param3] - -oa.field_c[param3]);
                  if (var4 < var5) {
                    return true;
                  } else {
                    var6 = 40 / ((param2 - 73) / 45);
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param3 <= param0) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L0;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L0;
                        }
                      }
                      return stackIn_39_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          if (al.field_bb[param0] < al.field_bb[param3]) {
            return true;
          } else {
            if (al.field_bb[param0] > al.field_bb[param3]) {
              return false;
            } else {
              if (a.field_c[param3] > a.field_c[param0]) {
                return true;
              } else {
                if (a.field_c[param0] <= a.field_c[param3]) {
                  var4 = oa.field_a[param0] - (-oa.field_c[param0] - dd.field_L[param0]);
                  var5 = dd.field_L[param3] + (oa.field_a[param3] - -oa.field_c[param3]);
                  if (var4 < var5) {
                    return true;
                  } else {
                    var6 = 40 / ((param2 - 73) / 45);
                    if (var4 <= var5) {
                      if (param3 <= param0) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Retry";
        field_a = new int[4];
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
