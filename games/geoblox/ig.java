/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        if (param0) {
          if (hg.field_a[param3] >= hg.field_a[param1]) {
            if (hg.field_a[param3] <= hg.field_a[param1]) {
              if (gk.field_a[param3] < gk.field_a[param1]) {
                return true;
              } else {
                if (gk.field_a[param3] <= gk.field_a[param1]) {
                  var4 = cj.field_b[param3] + fb.field_m[param3] + k.field_i[param3];
                  var5 = fb.field_m[param1] + (k.field_i[param1] + cj.field_b[param1]);
                  var6 = 76 % ((-38 - param2) / 45);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var4 <= var5) {
                      if (param3 >= param1) {
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
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (gk.field_a[param3] >= gk.field_a[param1]) {
            if (gk.field_a[param3] > gk.field_a[param1]) {
              return false;
            } else {
              if (hg.field_a[param1] > hg.field_a[param3]) {
                return true;
              } else {
                if (hg.field_a[param3] <= hg.field_a[param1]) {
                  var4 = cj.field_b[param3] + fb.field_m[param3] + k.field_i[param3];
                  var5 = fb.field_m[param1] + (k.field_i[param1] + cj.field_b[param1]);
                  var6 = 76 % ((-38 - param2) / 45);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param3 >= param1) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L0;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L0;
                        }
                      }
                      return stackIn_36_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final static sl a(String param0, int param1, boolean param2) {
        sl var3 = new sl(param2);
        var3.field_j = param1;
        var3.field_e = param0;
        return var3;
    }

    static {
    }
}
