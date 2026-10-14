/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateValidator extends DebouncedValidationSource implements TextFieldListener, ph {
    DateInputWidget dateInput;
    static String[] field_j;
    static String field_g;
    static QuickChatParameterType field_i;
    static int field_h;
    static long receivedChatSenderId;

    public static void c(byte param0) {
        field_j = null;
        field_i = null;
        field_g = null;
        if (param0 >= -22) {
          BirthDateValidator.c((byte) 116);
        }
    }

    final ValidationStatus computeValidationStatus(int obfuscationGuard) {
        int day = 0;
        NumberFormatException var2 = null;
        int monthIndex = 0;
        int year = 0;
        int currentYear = 0;
        ValidationStatus stackIn_2_0 = null;
        ValidationStatus stackIn_6_0 = null;
        ValidationStatus stackIn_9_0 = null;
        ValidationStatus stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          day = this.dateInput.getDay((byte) -89);
          if (obfuscationGuard != 4) {
            stackIn_2_0 = (ValidationStatus) null;
            return stackIn_2_0;
          }
          monthIndex = this.dateInput.getMonthIndex((byte) -117);
          year = this.dateInput.getYear(5390);
          currentYear = un.a(1);
          if (1890 > year) {
            stackIn_6_0 = lp.validationInvalid;
            return stackIn_6_0;
          }
          if (year > -3 + currentYear) {
            stackIn_9_0 = lp.validationInvalid;
            return stackIn_9_0;
          }
          if (!PlayerInputBatch.a((byte) -49, day, year, monthIndex)) {
            stackIn_13_0 = lp.validationInvalid;
            return stackIn_13_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return lp.validationInvalid;
        }
        return DualLinkIterator.validationValid;
    }

    public final void onSubmitted(TextFieldWidget textField, int obfuscationGuard) {
        try {
          if (obfuscationGuard != -40) {
            field_i = (QuickChatParameterType) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "an.H(" + (textField != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final void onTextChanged(TextFieldWidget textField, byte obfuscationGuard) {
        try {
          this.markEdited(false);
          if (obfuscationGuard > -39) {
            this.computeValidationStatus(113);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "an.I(" + (textField != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final String computeValidationMessage(int obfuscationGuard) {
        int day = 0;
        NumberFormatException var2 = null;
        int monthIndex = 0;
        int year = 0;
        int currentYear = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          day = this.dateInput.getDay((byte) -93);
          monthIndex = this.dateInput.getMonthIndex((byte) -117);
          year = this.dateInput.getYear(5390);
          if (obfuscationGuard != 28600) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          currentYear = un.a(1);
          if (year >= 1890 &&
            currentYear - 3 >= year) {
            if (PlayerInputBatch.a((byte) -49, day, year, monthIndex)) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
          } else {
            stackIn_7_0 = rd.a(ig.field_J, new String[]{"1890", Integer.toString(-3 + currentYear)}, (byte) 103);
            return stackIn_7_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return ScrollPaneWithFooter.field_Rb;
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var1_int = 0; var1_int < ScrollPane.chatHistorySize; var1_int++) {
            UnderwaterBackground.chatHistory[var1_int] = null;
          }
          if (param0 != -56) {
            field_i = (QuickChatParameterType) null;
          }
          ScrollPane.chatHistorySize = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "an.R(" + param0 + ')');
        }
    }

    public final boolean isIncomplete(byte obfuscationGuard) {
        if (obfuscationGuard > -27) {
          receivedChatSenderId = 93L;
        }
        return this.dateInput.isDateIncomplete((byte) -124);
    }

    public BirthDateValidator() {
    }

    static {
        field_g = "Show chat (1 unread message)";
        field_i = new QuickChatParameterType(4, 1, 1, 1);
    }
}
