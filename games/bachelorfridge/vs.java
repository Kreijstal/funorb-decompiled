/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static boolean field_d;
    static kv field_b;
    static boolean field_c;
    static String[] field_a;

    final static boolean a(int param0) {
        if (param0 != 23864) {
            field_a = null;
            return fr.field_n;
        }
        return fr.field_n;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        var3 = vm.a(param1, (byte) 113);
        if (param0 <= -23) {
          if (0 == (param2.indexOf(param1) ^ -1)) {
            if ((param2.indexOf(var3) ^ -1) == 0) {
              if (!param2.startsWith(param1)) {
                if (!param2.startsWith(var3)) {
                  if (!param2.endsWith(param1)) {
                    if (param2.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$6 = vs.a(69);
          if (0 == (param2.indexOf(param1) ^ -1)) {
            if ((param2.indexOf(var3) ^ -1) == 0) {
              if (!param2.startsWith(param1)) {
                if (!param2.startsWith(var3)) {
                  if (!param2.endsWith(param1)) {
                    if (param2.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 10530) {
            vs.b(24);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
    }
}
