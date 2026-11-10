/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateValidator extends DebouncedValidationProvider implements TextInputListener, BirthDateValidationMarker {
    DateInputWidget field_n;
    static ClientShellHelpers field_k;
    static IndexedSprite field_p;
    static int field_m;
    static boolean field_l;
    static String field_o;

    public BirthDateValidator() {
    }

    public final void onTextInputSubmitted(TextInputWidget param0, boolean param1) {
        try {
          if (!param1) {
            this.field_n = (DateInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -3) {
          field_o = null;
          field_k = null;
          field_p = null;
          return;
        }
        field_k = (ClientShellHelpers) null;
        field_o = null;
        field_k = null;
        field_p = null;
    }

    public final boolean isInputEmpty(int param0) {
        if (param0 != -3) {
          return false;
        }
        return this.field_n.isDateIncomplete(1872);
    }

    final ValidationState currentValidationState(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_6_0 = null;
        ValidationState stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_n.getDay(1);
          var3 = this.field_n.getZeroBasedMonth(param0 - 191);
          var4 = this.field_n.getYear((byte) -118);
          var5 = ClientTickHelpers.getCurrentYear((byte) -63);
          if (var4 < 1890) {
            stackIn_2_0 = PowerGaugeHelpers.field_b;
            return stackIn_2_0;
          }
          if (var4 > var5 + param0) {
            stackIn_6_0 = PowerGaugeHelpers.field_b;
            return stackIn_6_0;
          }
          if (!ImageProducerRasterBuffer.isValidDate((byte) -82, var3, var2_int, var4)) {
            stackIn_10_0 = PowerGaugeHelpers.field_b;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return PowerGaugeHelpers.field_b;
        }
        return AudioStartupHelpers.field_b;
    }

    public final void onTextInputChanged(TextInputWidget param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          this.resetValidationDelay(-1306);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String currentValidationMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -3) {
          this.currentValidationMessage(-103);
        }
        try {
          var2_int = this.field_n.getDay(1);
          var3 = this.field_n.getZeroBasedMonth(param0 - 191);
          var4 = this.field_n.getYear((byte) -86);
          var5 = ClientTickHelpers.getCurrentYear((byte) -44);
          if (var4 >= 1890 &&
            var4 <= var5 - 3) {
            if (ImageProducerRasterBuffer.isValidDate((byte) -65, var3, var2_int, var4)) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
          } else {
            stackIn_6_0 = QueuedListRequest.substituteTemplateArguments(PasswordValidator.field_v, new String[]{"1890", Integer.toString(var5 - 3)}, 2);
            return stackIn_6_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return MarkerSliderWidget.field_T;
    }

    static {
        field_k = new ClientShellHelpers();
        field_m = 4;
        field_o = "SCORE";
    }
}
