/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static vk field_b;
    static PaletteBitmapFont field_c;
    static String field_a;

    final static void a(Sprite param0, int param1) {
        try {
          gm.field_b = param0;
          if (param1 != 22210) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ResourceArchive a(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param2 <= -81) {
          return EmailConfirmationValidator.createResourceArchive(param1, param3, param0, false, 10600, param4);
        }
        nm.clearSharedReferences(86);
        return EmailConfirmationValidator.createResourceArchive(param1, param3, param0, false, 10600, param4);
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 > -65) {
          field_b = (vk) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_a = "Music: ";
    }
}
