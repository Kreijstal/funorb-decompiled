/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static long field_h;
    static co field_a;
    static String field_d;
    static int field_e;
    static String field_b;
    static String field_g;
    static String field_c;
    static String field_i;
    static qb[] field_f;

    final static String a(int param0) {
        if (!oh.field_i) {
          if (oa.field_e <= jh.field_f) {
            if (oa.field_e - -qc.field_e <= jh.field_f) {
              if (param0 == -14150) {
                return null;
              } else {
                return (String) null;
              }
            } else {
              return cb.field_c;
            }
          } else {
            if (param0 == -14150) {
              return null;
            } else {
              return (String) null;
            }
          }
        } else {
          if (param0 == -14150) {
            return null;
          } else {
            return (String) null;
          }
        }
    }

    final static void a(ec param0, int param1, int param2, int param3) {
        String discarded$0 = null;
        try {
            mj.field_r = param2;
            if (param1 != -28995) {
                discarded$0 = sk.a(-70);
            }
            ol.field_f = param0;
            tg.field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        field_g = null;
        int var1 = 43 % ((param0 - 46) / 42);
        field_f = null;
    }

    static {
        field_d = "You can spectate this game";
        field_a = new co();
        field_b = "Retry";
        field_i = "You cannot get damaged in this arena, so select the spell again and try to shoot the target. Remember to hold down the mouse button to increase the velocity of your attack.";
        field_g = "You have <%0> unread messages!";
        field_c = "<br><br>Press 'Enter' to continue";
    }
}
