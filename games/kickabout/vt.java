/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt {
    static String field_a;
    static byte[][] field_d;
    static String field_b;
    static nu field_c;

    public static void a(int param0) {
        int var1 = 1;
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (param0 < 48) {
          if (param0 < 65) {
            L0: {
              if (97 > param0) {
                break L0;
              } else {
                if (param0 > 122) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param0 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (97 > param0) {
                    break L2;
                  } else {
                    if (param0 > 122) {
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
          if (param0 > 57) {
            if (param0 >= 65) {
              if (param0 > 90) {
                if (97 <= param0) {
                  if (param0 > 122) {
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
              if (97 <= param0) {
                if (param0 > 122) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new byte[50][];
        field_a = "Cancel";
    }
}
