/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static ti field_c;
    String field_d;
    ci field_a;
    String field_g;
    String field_b;
    static int[] field_e;
    int field_f;

    final static boolean a(char param0, byte param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param1 == -110) {
          if (param0 < 48) {
            if (65 > param0) {
              L0: {
                if (param0 < 97) {
                  break L0;
                } else {
                  if (122 < param0) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param0 <= 90) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param0 < 97) {
                      break L2;
                    } else {
                      if (122 < param0) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (65 <= param0) {
                if (param0 > 90) {
                  if (param0 >= 97) {
                    if (122 < param0) {
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
                if (param0 >= 97) {
                  if (122 < param0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -39 / ((2 - param0) / 42);
        field_e = null;
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
    }
}
