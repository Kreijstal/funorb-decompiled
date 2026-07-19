/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq {
    static bi field_a;
    static qr field_b;
    static boolean field_c;
    static String field_d;

    final static void a(int param0, int param1, ob param2, byte param3, int param4) {
        param2.c(12, (byte) -126);
        param2.d(17, param3 + 235);
        if (param3 != 20) {
            return;
        }
        try {
            param2.d(param1, 255);
            param2.d(param0, 255);
            param2.c(param4, (byte) -59);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hq.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        boolean discarded$6 = false;
        if (param0 < -17) {
          if (param1 < 65) {
            if (97 <= param1) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 90) {
              if (97 <= param1) {
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
          }
        } else {
          discarded$6 = hq.a(75, 'ﾥ');
          if (param1 >= 65) {
            if (param1 > 90) {
              if (97 <= param1) {
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
            if (97 <= param1) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 <= 70) {
            return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_d = "This password contains your email address, and would be easy to guess";
    }
}
