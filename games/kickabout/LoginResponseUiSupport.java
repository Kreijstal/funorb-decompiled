/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginResponseUiSupport {
    static boolean field_f;
    static RenderedFootballer field_c;
    static ArgbSprite field_h;
    static String field_e;
    static int field_a;
    static String field_b;
    static boolean field_d;
    static int[] field_g;

    public static void releaseStatics(int param0) {
        field_h = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 29136) {
          String var2 = (String) null;
          LoginResponseUiSupport.showLoginResponse((String) null, -116, 0);
        }
    }

    final static void showLoginResponse(String param0, int param1, int param2) {
        int var4 = 0;
        try {
          SocialRowOrderSupport.field_f = false;
          DiagnosticsOverlaySupport.field_g = false;
          int var3_int = 123 / ((param2 - 22) / 47);
          if (null != WorldSpriteSequence.field_f) {
            if (!WorldSpriteSequence.field_f.field_C) {
              return;
            }
            var4 = 1;
            if (param1 != 8) {
            } else {
              param1 = 2;
              if (!AuctionBidDialog.field_G) {
                param0 = PitchPurchaseSupport.field_f;
              } else {
                param0 = OffscreenPlayerArrow.field_j;
              }
              IsSixCommand.field_E.setUsername(TutorialMessages.field_b, (byte) 120);
            }
            if (param1 == 10) {
              DisplayNameUiSupport.showDisplayNameForm((byte) -126);
              var4 = 0;
            }
            if (var4 != 0) {
              if (SocialRowOrderSupport.field_f) {
                param0 = LoginDialog.substitutePlaceholders(-18, EmailAvailabilityValidator.field_l, new String[]{param0});
              }
              if (TextLineLayoutSupport.field_a) {
                param0 = AccountTermsPanel.field_L;
              }
              WorldSpriteSequence.field_f.showRequestResponse(param1, 101, param0);
            }
            if (param1 != 256 &&
              param1 != 10 &&
              !AuctionBidDialog.field_G) {
              IsSixCommand.field_E.focusFields((byte) -76);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = 2;
        field_e = "Slight stagger";
        field_b = "rankings";
    }
}
