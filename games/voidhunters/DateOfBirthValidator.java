/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthValidator extends DebouncedInputValidator implements UiTextFieldListener, UiComboBoxSelectionListener {
    DateOfBirthInput input;

    public final void onTextChanged(UiTextField param0, byte param1) {
        try {
          this.markChanged(18);
          if (param1 != 100) {
            this.input = (DateOfBirthInput) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "wta.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onSelectionChanged(int param0, UiComboBox param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -3) {
            this.input = (DateOfBirthInput) null;
            this.markChanged(79);
          } else {
            this.markChanged(79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wta.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public DateOfBirthValidator() {
    }

    final String getCurrentValidationMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.input.getDayOfMonth(-5);
          var3 = this.input.getMonthIndex(true);
          var4 = this.input.getYear(3476);
          if (param0 != 16384) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = SecondaryNodeQueue.getCurrentYear(true);
          if (var4 >= 1890 &&
            -3 + var5 >= var4) {
            if (BodyInZoneCondition.isValidDate(var3, var2_int, true, var4)) {
              return null;
            }
          } else {
            stackIn_7_0 = SetReverbGain.substituteIndexedPlaceholders(ComponentBehaviourFactory.field_d, new String[]{"1890", Integer.toString(var5 - 3)}, 79);
            return stackIn_7_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return GetUseRectFill.field_o;
    }

    final ValidationState validateCurrentValue(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_9_0 = null;
        ValidationState stackIn_12_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.input.getDayOfMonth(-5);
          var3 = this.input.getMonthIndex(true);
          if (param0 != -1) {
            this.input = (DateOfBirthInput) null;
          }
          var4 = this.input.getYear(3476);
          var5 = SecondaryNodeQueue.getCurrentYear(true);
          if (var4 < 1890) {
            stackIn_5_0 = SetArmageddonLength.invalidInput;
            return stackIn_5_0;
          }
          if (var4 > -3 + var5) {
            stackIn_9_0 = SetArmageddonLength.invalidInput;
            return stackIn_9_0;
          }
          if (!BodyInZoneCondition.isValidDate(var3, var2_int, true, var4)) {
            stackIn_12_0 = SetArmageddonLength.invalidInput;
            return stackIn_12_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return SetArmageddonLength.invalidInput;
        }
        return GetShipPersistence.validInput;
    }

    public final void onSubmitted(int param0, UiTextField param1) {
        try {
          if (param0 != -12409) {
            this.getCurrentValidationMessage(116);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "wta.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean isEmpty(byte param0) {
        if (param0 >= -100) {
          this.isEmpty((byte) 87);
          return this.input.isIncomplete(0);
        }
        return this.input.isIncomplete(0);
    }

    static {
    }
}
