/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static boolean field_d;
    static int[] field_b;
    static oc field_a;
    static int field_c;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param5 < -25) {
          if (param2 > param7) {
            if (param2 >= param4) {
              if (param7 < param4) {
                oe.a((byte) 106, param3, lf.field_b, param0, param6, param7, param2, param1, param4);
                return;
              } else {
                oe.a((byte) 106, param3, lf.field_b, param0, param1, param4, param2, param6, param7);
                return;
              }
            } else {
              oe.a((byte) 113, param6, lf.field_b, param0, param3, param7, param4, param1, param2);
              return;
            }
          } else {
            if (param4 <= param7) {
              if (param4 <= param2) {
                oe.a((byte) 91, param1, lf.field_b, param0, param3, param4, param7, param6, param2);
                return;
              } else {
                oe.a((byte) 113, param1, lf.field_b, param0, param6, param2, param7, param3, param4);
                return;
              }
            } else {
              oe.a((byte) 74, param6, lf.field_b, param0, param1, param2, param4, param3, param7);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != 105) {
            field_d = true;
        }
    }

    final static String a(byte param0, sh param1, String param2, int param3, String param4) {
        if (param0 != 100) {
            field_a = null;
            if (!(param1.c(127))) {
                return param4;
            }
            return param2 + " - " + param1.b((byte) -102, param3) + "%";
        }
        if (!(param1.c(127))) {
            return param4;
        }
        return param2 + " - " + param1.b((byte) -102, param3) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = true;
        field_b = new int[1024];
        field_a = new oc();
    }
}
