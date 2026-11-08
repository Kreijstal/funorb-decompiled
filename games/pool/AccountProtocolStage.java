/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountProtocolStage {
    static int[] field_g;
    static UiComponent field_d;
    static String tutorialLose;
    static volatile long field_b;
    static Sprite field_f;
    static int field_e;
    static String rmXFromIgnore;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var1_int = -124 / ((param0 - 38) / 54);
          TabbedPane.field_Ub.processPointerFrame(-120, AvailabilityQueryResult.field_b, true, PasswordInputPainter.field_D);
          TabbedPane.field_Ub.advanceDialogAnimations((byte) 126);
          while (LabeledChildWidget.h(127)) {
            TabbedPane.field_Ub.dispatchKeyInputOrRequestFocus(-81, IterableDualLinkDeque.field_a, LoginMethod.field_b);
          }
          if (Atan2Support.field_b != -1) {
            var2 = Atan2Support.field_b;
            LoginEncryptionSupport.a(-1, (byte) 92);
            stackIn_6_0 = var2;
            return stackIn_6_0;
          }
          if (NetworkGameClient.field_z) {
            stackIn_9_0 = 3;
            return stackIn_9_0;
          }
          if (TimeTrialSelectScreen.field_I == IntegerRecordProtocolSupport.field_e) {
            stackIn_13_0 = 1;
            return stackIn_13_0;
          }
          if (!TextInputValidator.field_j.isComplete(112)) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (IntegerRecordProtocolSupport.field_e != TabbedPane.field_Lb) {
            return -1;
          }
          stackIn_20_0 = 2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "ph.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        tutorialLose = null;
        rmXFromIgnore = null;
        field_d = null;
        if (!param0) {
          field_f = null;
          return;
        }
        tutorialLose = (String) null;
        field_f = null;
    }

    static {
        rmXFromIgnore = "Remove <%0> from ignore list";
        field_b = 0L;
        tutorialLose = "You would have lost!";
    }
}
