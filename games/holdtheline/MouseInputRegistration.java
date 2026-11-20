/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputRegistration {
    static String field_c;
    static String field_a;
    static RotatedSpriteAsset field_b;
    static float[] field_d;

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 == 115) {
          field_b = null;
          field_d = null;
          return;
        }
        MouseInputRegistration.clearSharedReferences((byte) 54);
        field_b = null;
        field_d = null;
    }

    final static void attachMouseInput(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(ArchiveLoadStage.field_d);
          if (param1 <= 26) {
            field_d = (float[]) null;
          }
          param0.addMouseMotionListener(ArchiveLoadStage.field_d);
          param0.addFocusListener(ArchiveLoadStage.field_d);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "gk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "AI racers: ";
        field_a = "(Including <%0>)";
        field_d = new float[3];
    }
}
