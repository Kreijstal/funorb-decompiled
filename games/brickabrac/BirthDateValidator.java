/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateValidator extends DebouncedValidationSource implements TextFieldListener, BirthDateValidationMarker {
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
        NumberFormatException ignoredInvalidNumber = null;
        int monthIndex = 0;
        int year = 0;
        int currentYear = 0;
        ValidationStatus guardRejectedStatus = null;
        ValidationStatus yearTooOldStatus = null;
        ValidationStatus yearTooRecentStatus = null;
        ValidationStatus invalidDateStatus = null;
        Throwable caughtFailure = null;
        try {
          day = this.dateInput.getDay((byte) -89);
          if (obfuscationGuard != 4) {
            guardRejectedStatus = (ValidationStatus) null;
            return guardRejectedStatus;
          }
          monthIndex = this.dateInput.getMonthIndex((byte) -117);
          year = this.dateInput.getYear(5390);
          currentYear = CalendarRankingHelpers.getCurrentLocalYear(1);
          if (1890 > year) {
            yearTooOldStatus = AccountMessageDialog.validationInvalid;
            return yearTooOldStatus;
          }
          if (year > -3 + currentYear) {
            yearTooRecentStatus = AccountMessageDialog.validationInvalid;
            return yearTooRecentStatus;
          }
          if (!PlayerInputBatch.isValidLegacyDate((byte) -49, day, year, monthIndex)) {
            invalidDateStatus = AccountMessageDialog.validationInvalid;
            return invalidDateStatus;
          }
        } catch (java.lang.NumberFormatException caughtNumberFailure) {
          caughtFailure = caughtNumberFailure;
          ignoredInvalidNumber = (NumberFormatException) (Object) caughtFailure;
          return AccountMessageDialog.validationInvalid;
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
        NumberFormatException ignoredInvalidNumber = null;
        int monthIndex = 0;
        int year = 0;
        int currentYear = 0;
        String guardRejectedMessage = null;
        String yearRangeMessage = null;
        Object validMessage = null;
        Throwable caughtFailure = null;
        try {
          day = this.dateInput.getDay((byte) -93);
          monthIndex = this.dateInput.getMonthIndex((byte) -117);
          year = this.dateInput.getYear(5390);
          if (obfuscationGuard != 28600) {
            guardRejectedMessage = (String) null;
            return guardRejectedMessage;
          }
          currentYear = CalendarRankingHelpers.getCurrentLocalYear(1);
          if (year >= 1890 &&
            currentYear - 3 >= year) {
            if (PlayerInputBatch.isValidLegacyDate((byte) -49, day, year, monthIndex)) {
              validMessage = null;
              return (String) (validMessage);
            }
          } else {
            yearRangeMessage = GamePresentationHelpers.formatIndexedText(Under13RegistrationNoticePanel.field_J, new String[]{"1890", Integer.toString(-3 + currentYear)}, (byte) 103);
            return yearRangeMessage;
          }
        } catch (java.lang.NumberFormatException caughtNumberFailure) {
          caughtFailure = caughtNumberFailure;
          ignoredInvalidNumber = (NumberFormatException) (Object) caughtFailure;
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
