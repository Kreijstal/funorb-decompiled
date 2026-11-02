/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uab {
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = 112;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 != 44) {
          uab.a(54);
          return SetAngularForceDownshift.field_o;
        }
        return SetAngularForceDownshift.field_o;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(GetDebrisFoundInPairs.field_q);
          param1.removeMouseMotionListener(GetDebrisFoundInPairs.field_q);
          if (param0 != 1) {
            uab.a((byte) 73);
          }
          param1.removeFocusListener(GetDebrisFoundInPairs.field_q);
          GetBombletSprayAimarc.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uab.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Create unrated game";
        field_b = 1;
    }
}
