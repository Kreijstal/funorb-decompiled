/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimeTrialSelectScreen extends MenuScreen {
    static UiComponent field_M;
    static UiComponent field_J;
    static java.awt.Canvas field_K;
    static int field_H;
    static AccountProtocolStage field_I;
    static int[] field_L;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (null != PlasmaBallSkin.field_m) {
          if (PlasmaBallSkin.field_m.handleCancelKey((byte) 111)) {
            ProgressDialog.m(8421504);
            return true;
          }
          if (param0) {
            TimeTrialSelectScreen.f(118);
          }
          if (null != AccountMenuText.field_b &&
            AccountMenuText.field_b.handleCancelKey(13)) {
            AccountMenuText.field_b = null;
            ProgressDialog.m(8421504);
            return true;
          }
          if (BirthDateValidator.handleNamePopupKey(-3)) {
            return true;
          }
          if (Pool.handleKeyPress(param3, param2, param1, -80)) {
            return true;
          }
          return false;
        }
        if (!param0) {
          if (null != AccountMenuText.field_b &&
            AccountMenuText.field_b.handleCancelKey(13)) {
            AccountMenuText.field_b = null;
            ProgressDialog.m(8421504);
            return true;
          }
          if (BirthDateValidator.handleNamePopupKey(-3)) {
            return true;
          }
          if (Pool.handleKeyPress(param3, param2, param1, -80)) {
            return true;
          }
          return false;
        }
        TimeTrialSelectScreen.f(118);
        if (null == AccountMenuText.field_b) {
          if (BirthDateValidator.handleNamePopupKey(-3)) {
            return true;
          }
          if (Pool.handleKeyPress(param3, param2, param1, -80)) {
            return true;
          }
          return false;
        }
        if (AccountMenuText.field_b.handleCancelKey(13)) {
          AccountMenuText.field_b = null;
          ProgressDialog.m(8421504);
          return true;
        }
        if (BirthDateValidator.handleNamePopupKey(-3)) {
          return true;
        }
        if (!Pool.handleKeyPress(param3, param2, param1, -80)) {
          return false;
        }
        return true;
    }

    TimeTrialSelectScreen(Sprite param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final static int f(int param0) {
        if (param0 == -1) {
          return Ball.field_B != null ? Ball.field_B.length : 0;
        }
        TimeTrialSelectScreen.a(false, 38, 98, -101);
        return Ball.field_B != null ? Ball.field_B.length : 0;
    }

    public static void releaseStatics(int param0) {
        field_I = null;
        field_M = null;
        field_L = null;
        field_J = null;
        field_K = null;
        if (param0 >= -31) {
          field_H = -98;
        }
    }

    final int getButtonTop(byte param0, int param1) {
        if (param0 == 6) {
          return (-1 + this.itemIds.length != param1 ? 0 : 20) + this.buttonTop + param1 * this.buttonSpacing;
        }
        return 103;
    }

    static {
        field_H = -1;
    }
}
