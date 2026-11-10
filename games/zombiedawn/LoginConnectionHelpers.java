/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginConnectionHelpers {
    static MouseInputHandler field_b;
    static boolean field_e;
    static Sprite[] field_c;
    static AccountCreationForm field_a;
    static String field_d;

    final static void composeAgreementText(int param0) {
        SecondaryNodeDequeIterator.field_c = CacheEntry.field_p + " <b>" + LevelResultScreen.field_s + "</b> " + Tree.field_S + " <b>" + ContentTransitionDialog.field_bb + "</b> " + LevelHud.field_j + "<br>" + "<br>" + LevelObstacle.field_L;
        if (param0 < 74) {
          field_b = (MouseInputHandler) null;
        }
    }

    final static boolean isLoggedInConnection(byte param0) {
        if (param0 != -64) {
          LoginConnectionHelpers.isLoggedInConnection((byte) -16);
          if (null == LoginMethod.field_c) {
            return false;
          }
          if (PendingFlagRequest.field_j == ValidatedTextWidget.field_T) {
            return true;
          }
          return false;
        }
        if (null == LoginMethod.field_c) {
          return false;
        }
        if (PendingFlagRequest.field_j == ValidatedTextWidget.field_T) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 > -125) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_b = new MouseInputHandler();
        field_e = false;
        field_d = "Email address is unavailable";
    }
}
