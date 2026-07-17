/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends gj {
    static String field_u;
    vh field_r;
    int field_p;
    byte[] field_s;
    static int field_w;
    static bc field_t;
    static String field_v;
    static mk field_q;

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        var2 = 92 % ((param0 - 32) / 39);
        if (param1 < 48) {
          if (65 > param1) {
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
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param1 < 97) {
                    break L2;
                  } else {
                    if (param1 > 122) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (param1 > 57) {
            if (65 <= param1) {
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
    }

    public static void d(int param0) {
        field_q = null;
        field_v = null;
        field_u = null;
        field_t = null;
    }

    final int c(byte param0) {
        if (param0 <= -100) {
          if (((md) this).field_n) {
            return 0;
          } else {
            return 100;
          }
        } else {
          ((md) this).field_s = null;
          if (((md) this).field_n) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    final byte[] d(byte param0) {
        if (param0 >= -106) {
            field_w = 85;
            if (!(!((md) this).field_n)) {
                throw new RuntimeException();
            }
            return ((md) this).field_s;
        }
        if (!(!((md) this).field_n)) {
            throw new RuntimeException();
        }
        return ((md) this).field_s;
    }

    md() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Sound ";
        field_w = 256;
        field_t = new bc();
        field_v = "You have <%0> unread messages!";
    }
}
