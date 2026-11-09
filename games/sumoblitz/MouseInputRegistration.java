/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputRegistration {
    static EmailValidationError INVALID_EMAIL_SYNTAX;
    static String youNeedToChooseText;
    static int[] field_b;

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 != 14) {
          return;
        }
        INVALID_EMAIL_SYNTAX = null;
        youNeedToChooseText = null;
    }

    final static void attachMouseInput(java.awt.Component component, boolean includeMotionAndFocus) {
        component.addMouseListener(ConfirmedEmailValidator.field_h);
        if (!includeMotionAndFocus) {
          return;
        }
        try {
          component.addMouseMotionListener(ConfirmedEmailValidator.field_h);
          component.addFocusListener(ConfirmedEmailValidator.field_h);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gs.B(" + (component != null ? "{...}" : "null") + ',' + includeMotionAndFocus + ')');
        }
    }

    static {
        INVALID_EMAIL_SYNTAX = new EmailValidationError();
        youNeedToChooseText = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
