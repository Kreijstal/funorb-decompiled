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
        sl var3 = null;
        RuntimeException var3_ref = null;
        sl stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new sl(false);
            var3.field_j = param1;
            var3.field_e = param0;
            stackOut_0_0 = (sl) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ig.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    static {
    }
}
