/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVolumeAndOverlayHelpers {
    static Sprite[] frameSprites;
    static String field_a;

    final static void stepMusicVolumeUp(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != 99) {
          MusicVolumeAndOverlayHelpers.stepMusicVolumeUp((byte) -63);
          if (DisplayNameHelpers.field_a >= 224) {
            CachedTextLayout.setMusicVolume(256, 0);
            return;
          }
          var1 = DisplayNameHelpers.field_a % 32;
          CachedTextLayout.setMusicVolume(32 + DisplayNameHelpers.field_a - var1, 0);
          return;
        }
        if (DisplayNameHelpers.field_a >= 224) {
          CachedTextLayout.setMusicVolume(256, 0);
          return;
        }
        var1Lifetime1 = DisplayNameHelpers.field_a % 32;
        CachedTextLayout.setMusicVolume(32 + DisplayNameHelpers.field_a - var1Lifetime1, 0);
    }

    final static void animateLobbyOverlayBounds(int param0) {
        int var1 = EmailValidator.field_t * EmailValidator.field_t;
        int var2 = var1 - Bzip2State.field_D * Bzip2State.field_D;
        int var3 = EmailDomainValidationHelpers.field_c + (IntrusiveDeque.field_h - EmailDomainValidationHelpers.field_c) * var2 / var1;
        ClientEnvironmentHelpers.field_c.setGeometry(BitwiseHelpers.field_f, 120, 640, (byte) -85, var3);
        DialWidgetPainter.layoutQuickChatRoot((byte) 118, 5, 640, PopupMenuDrawHelpers.field_d, 0, IntrusiveDeque.field_h - 24, ConnectionStage.field_b);
        if (param0 < -3) {
          return;
        }
        MusicVolumeAndOverlayHelpers.releaseStatics(94);
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -30) {
          field_a = (String) null;
          frameSprites = null;
          field_a = null;
          return;
        }
        frameSprites = null;
        field_a = null;
    }

    static {
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
