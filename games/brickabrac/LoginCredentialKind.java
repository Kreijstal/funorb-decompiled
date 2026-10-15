/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentialKind {
    static NineSliceFrame field_c;
    static UiComponent field_d;
    static MusicTrack field_g;
    static String field_f;
    static IndexedSprite[] field_b;
    int wireCode;
    static int field_e;
    static RgbSprite[] field_h;

    final static boolean a(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        long var1Lifetime1;
        long var3Lifetime1;
        int var5Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (param0 < -126) {
          var1 = MonotonicTime.nowMillis(false);
          var3 = -PasswordFieldRenderer.field_G + var1;
          if (var3 > 30000L) {
            GameplayScreen.field_h = 0;
            PasswordFieldRenderer.field_G = var1;
            return true;
          }
          var5 = 3000;
          if (7 <= GameplayScreen.field_h) {
            var5 = 12000;
          } else {
            if (5 <= GameplayScreen.field_h) {
              var5 = 9000;
            } else {
              if (GameplayScreen.field_h >= 3) {
                var5 = 6000;
              }
            }
          }
          if (var3 <= (long)var5) {
            return false;
          }
          PasswordFieldRenderer.field_G = var1;
          GameplayScreen.field_h = GameplayScreen.field_h + 1;
          return true;
        }
        field_d = (UiComponent) null;
        var1Lifetime1 = MonotonicTime.nowMillis(false);
        var3Lifetime1 = -PasswordFieldRenderer.field_G + var1Lifetime1;
        if (var3Lifetime1 > 30000L) {
          GameplayScreen.field_h = 0;
          PasswordFieldRenderer.field_G = var1Lifetime1;
          return true;
        }
        var5Lifetime1 = 3000;
        if (7 <= GameplayScreen.field_h) {
          var5Lifetime1 = 12000;
        } else {
          if (5 <= GameplayScreen.field_h) {
            var5Lifetime1 = 9000;
          } else {
            if (GameplayScreen.field_h >= 3) {
              var5Lifetime1 = 6000;
            }
          }
        }
        if (var3Lifetime1 <= (long)var5Lifetime1) {
          return false;
        }
        PasswordFieldRenderer.field_G = var1Lifetime1;
        GameplayScreen.field_h = GameplayScreen.field_h + 1;
        return true;
    }

    final static AccountResponse a(boolean param0, boolean param1) {
        AccountResponse var2 = new AccountResponse(param0);
        var2.underThirteen = param1 ? true : false;
        return var2;
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        field_d = null;
        int var1 = 123 / ((param0 + 23) / 38);
        field_f = null;
        field_b = null;
        field_g = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void configureTextChoiceButtonFrames(NineSliceFrame buttonFrame, NineSliceFrame selectedButtonFrame, int gapY, int obfuscationGuard, int paddingY, int paddingX) {
        GameClock.textChoiceButtonGapY = gapY;
        if (obfuscationGuard != 7) {
          return;
        }
        try {
          EmailConfirmationValidator.textChoiceSelectedButtonFrame = selectedButtonFrame;
          ArrayWidgetGroup.textChoiceButtonFrame = buttonFrame;
          GameCanvas.textChoiceButtonPaddingY = paddingY;
          FullscreenFailureDialog.textChoiceButtonPaddingX = paddingX;
        } catch (RuntimeException configurationFailure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) configurationFailure), "cd.C(" + (buttonFrame != null ? "{...}" : "null") + ',' + (selectedButtonFrame != null ? "{...}" : "null") + ',' + gapY + ',' + obfuscationGuard + ',' + paddingY + ',' + paddingX + ')');
        }
    }

    LoginCredentialKind(int wireCode) {
        this.wireCode = wireCode;
    }

    static {
        field_f = "Connecting to<br>friend server...";
    }
}
