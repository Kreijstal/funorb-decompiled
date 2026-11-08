/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginRsaKey {
    static java.math.BigInteger field_a;
    static BitmapFont arezzo14BoldFont;
    static boolean field_d;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void showMessageDialogText(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          ScrollPaneWithFooter.field_Gb = true;
          MusicVoiceMixer.field_o.field_V = param1;
          if (param0 <= 99) {
            field_d = false;
          }
          var2_int = LoginPanel.field_M.field_c;
          var3 = LoginPanel.field_M.field_b;
          var4 = MusicVoiceMixer.field_o.field_C.paragraphHeight(param1, 272, MusicVoiceMixer.field_o.field_fb);
          var5 = 7 + var3 / 2 - (110 + var4 / 2);
          WidgetStyleLayer.field_a.setGeometry((var2_int - 320) / 2, var3 - (120 + var5 * 2), 320, (byte) -128, var5);
          WidgetStyleLayer.field_a.field_vb = StatusAndUrlHelpers.createGradientFrameSprites(WidgetStyleLayer.field_a.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
          MusicVoiceMixer.field_o.setGeometry(24, -44 + WidgetStyleLayer.field_a.field_ub, WidgetStyleLayer.field_a.field_K - 24 - 24, (byte) -71, 16);
          HotspotTextWidget.field_H.setGeometry(120, 24, 80, (byte) -101, -24 + (-20 + WidgetStyleLayer.field_a.field_ub));
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "on.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void decreaseMusicVolume(int param0) {
        int var2 = 0;
        int var1 = 118 / ((24 - param0) / 46);
        if (32 >= DelegatingCanvas.field_c) {
          TextFieldValidator.setSoundEffectVolume((byte) 56, 0);
        } else {
          var2 = DelegatingCanvas.field_c % 32;
          if (var2 == 0) {
            var2 = 32;
          }
          TextFieldValidator.setSoundEffectVolume((byte) 104, DelegatingCanvas.field_c - var2);
        }
    }

    public static void releaseStatics(byte param0) {
        arezzo14BoldFont = null;
        if (param0 <= 42) {
          LoginRsaKey.decreaseMusicVolume(23);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_c = 0;
        field_a = new java.math.BigInteger("65537");
    }
}
