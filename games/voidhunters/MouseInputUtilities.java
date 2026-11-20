/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputUtilities {
    static String field_a;
    static int field_b;

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          field_b = 112;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean hasMenuInitializationStarted(byte param0) {
        if (param0 != 44) {
          MouseInputUtilities.clearSharedReferences(54);
          return SetAngularForceDownshift.menuInitializationStarted;
        }
        return SetAngularForceDownshift.menuInitializationStarted;
    }

    final static void detachMouseListeners(byte param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(GetDebrisFoundInPairs.field_q);
          param1.removeMouseMotionListener(GetDebrisFoundInPairs.field_q);
          if (param0 != 1) {
            MouseInputUtilities.hasMenuInitializationStarted((byte) 73);
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
