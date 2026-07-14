/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ej {
    static qk[] field_c;
    static String field_e;
    static ah field_a;
    static int field_b;
    static String field_d;

    abstract byte[] a(int param0);

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        if (param0 != -20) {
          field_a = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static boolean a(gn param0, gn param1, int param2, gn param3) {
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        if (param0.b((byte) -122)) {
          if (param0.b("commonui", -108)) {
            if (param1.b((byte) -111)) {
              if (param1.b("commonui", -83)) {
                if (param2 < 125) {
                  L0: {
                    L1: {
                      field_e = null;
                      if (!param3.b((byte) -75)) {
                        break L1;
                      } else {
                        if (!param3.b("button.gif", -85)) {
                          break L1;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L0;
                        }
                      }
                    }
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  }
                  return stackIn_20_0 != 0;
                } else {
                  L2: {
                    L3: {
                      if (!param3.b((byte) -75)) {
                        break L3;
                      } else {
                        if (!param3.b("button.gif", -85)) {
                          break L3;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  }
                  return stackIn_15_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static String a(String param0, String param1, String param2, boolean param3, gn param4) {
        if (param4.b((byte) -94)) {
          if (param3) {
            field_c = null;
            return param1 + " - " + param4.a(param2, 0) + "%";
          } else {
            return param1 + " - " + param4.a(param2, 0) + "%";
          }
        } else {
          return param0;
        }
    }

    abstract void a(int param0, byte[] param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Confirm Email:";
        field_d = "Next";
    }
}
