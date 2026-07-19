/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends aa {
    static int field_f;
    static pa field_g;
    el field_e;

    public static void c(int param0) {
        field_g = null;
        if (param0 != -58) {
            dc.c(33);
        }
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param0 < -67) {
          if (param1 < 48) {
            if (param1 < 65) {
              L0: {
                if (97 > param1) {
                  break L0;
                } else {
                  if (122 < param1) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param1 <= 90) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (97 > param1) {
                      break L2;
                    } else {
                      if (122 < param1) {
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
            if (param1 > 57) {
              if (param1 >= 65) {
                if (param1 > 90) {
                  if (97 <= param1) {
                    if (122 < param1) {
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
                if (97 <= param1) {
                  if (122 < param1) {
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
          return false;
        }
    }

    private dc() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 20;
    }
}
