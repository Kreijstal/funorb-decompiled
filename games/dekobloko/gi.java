/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_b;
    static int field_e;
    static int field_a;
    static int field_c;
    static String field_d;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 <= param2) {
          if (param3 + param6 > param2) {
            if (param1 >= param4) {
              if (param4 - -param5 <= param1) {
                return false;
              } else {
                return true;
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

    public static void a(int param0) {
        int var1 = 0;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ie.field_c.a(640, 0, 0, param0, 5);
        if (null == mg.field_bc) {
          if (param6 >= -83) {
            field_e = -12;
            return;
          } else {
            return;
          }
        } else {
          mg.field_bc.a(param3, -l.field_f + param3, param0, param1, (byte) -18, param0);
          if (param6 < -83) {
            return;
          } else {
            field_e = -12;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, wl param3, int param4) {
        try {
            param3.a(true, 12);
            param3.d(-1, 17);
            param3.d(-1, param4);
            param3.d(-1, param0);
            param3.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gi.C(" + param0 + ',' + param1 + ',' + 17 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
