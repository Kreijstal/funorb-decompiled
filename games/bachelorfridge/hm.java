/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_a;
    static boolean field_b;

    public static void a(int param0) {
        if (param0 != -123) {
            hm.a(-6);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param0 > 89) {
          if (48 > param1) {
            if (param1 < 65) {
              L0: {
                if (param1 < 97) {
                  break L0;
                } else {
                  if (param1 > 122) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (90 >= param1) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param1 < 97) {
                      break L2;
                    } else {
                      if (param1 > 122) {
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
                if (90 < param1) {
                  if (param1 >= 97) {
                    if (param1 > 122) {
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
                if (param1 >= 97) {
                  if (param1 > 122) {
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

    static {
        field_a = "Confirm Password: ";
    }
}
