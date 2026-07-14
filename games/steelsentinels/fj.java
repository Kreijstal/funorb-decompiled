/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_g;
    static String[][] field_b;
    static boolean field_e;
    static String field_c;
    static String field_i;
    static int field_f;
    static int[] field_a;
    static int[] field_h;
    static int field_d;

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_a = null;
        if (param0 > -118) {
          field_b = null;
          field_b = null;
          field_g = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        param0 = hk.a('_', "", true, param0);
        var3 = ri.a(param1 ^ 7035, param2);
        if (param1 == -7036) {
          if (0 == param0.indexOf(param2)) {
            if (0 != param0.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static boolean a(char param0, CharSequence param1, int param2) {
        int var3 = 0;
        if (qh.a((byte) -30, param0)) {
          if (param2 <= -93) {
            if (param1 != null) {
              var3 = param1.length();
              if (12 <= var3) {
                return false;
              } else {
                if (jd.a(param0, -33)) {
                  if (0 != var3) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            fj.a((byte) 85);
            if (param1 != null) {
              var3 = param1.length();
              if (12 <= var3) {
                return false;
              } else {
                if (jd.a(param0, -33)) {
                  if (0 == var3) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_g = "Year";
        field_a = new int[]{65535, 15614976, 65280, 6711039, 16776960, 16711935, 2236962, 16777215, 16737894, 6750054, 16777062, 16738047};
        field_h = field_a;
        field_d = 3;
        field_i = "Camera left/right: Normal";
        field_c = "Only show private chat from my friends and opponents";
    }
}
