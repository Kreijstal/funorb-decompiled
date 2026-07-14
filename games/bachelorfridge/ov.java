/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends uo {
    static sna field_d;
    static String field_g;
    static int field_c;
    static int[] field_e;
    static java.applet.Applet field_f;

    final static int b(int param0, int param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 60) {
          if (param0 > 0) {
            if (-5 > (param0 ^ -1)) {
              return 0;
            } else {
              L0: {
                if ((param0 ^ -1) <= -4) {
                  stackOut_7_0 = -2 + param0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = param0 - -2;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0;
            }
          } else {
            return 0;
          }
        } else {
          return 32;
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -5) {
            return;
        }
        field_d = null;
    }

    final static iga a(long param0, boolean param1, String param2, String param3, byte param4) {
        if ((param0 ^ -1L) != -1L) {
          if (!param1) {
            if (param4 < 41) {
              return null;
            } else {
              return (iga) (Object) new ot(param0, param3);
            }
          } else {
            return (iga) (Object) new bd(param0, param3);
          }
        } else {
          if (param2 == null) {
            if (!param1) {
              if (param4 < 41) {
                return null;
              } else {
                return (iga) (Object) new ot(param0, param3);
              }
            } else {
              return (iga) (Object) new bd(param0, param3);
            }
          } else {
            return (iga) (Object) new jda(param2, param3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_e = new int[]{100, 60, 30, 10};
    }
}
