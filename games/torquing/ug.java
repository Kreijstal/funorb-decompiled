/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static String field_a;
    static int field_b;

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (TranslucentSpriteLayer.field_i == null) {
          return;
        }
        tf.a(-120, TranslucentSpriteLayer.field_i);
        TranslucentSpriteLayer.field_i.exitFullscreen(ArchiveRequest.field_u, 159);
        TranslucentSpriteLayer.field_i = null;
        if (AccountRegistrationPanel.field_D != null) {
          AccountRegistrationPanel.field_D.b(false);
        }
        if (param0 < -93) {
          k.field_d.requestFocus();
          return;
        }
        field_b = -39;
        k.field_d.requestFocus();
    }

    static {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
