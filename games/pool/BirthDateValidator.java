/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateValidator extends DebouncedValidationProvider implements TextInputListener, BirthDateValidationMarker {
    static IndexedSprite[] field_h;
    static String muChatLobby;
    static String ballsetSpaceGroup0;
    DateInputWidget dateInput;
    static String themeRandom;
    static UiComponent field_m;
    static byte[] field_n;

    public final void onTextInputChanged(TextInputWidget param0, int param1) {
        try {
          int var3_int = -25 % ((-43 - param1) / 35);
          this.resetValidationDelay(11755);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sn.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_n = null;
        field_m = null;
        muChatLobby = null;
        field_h = null;
        if (param0 == -119) {
          themeRandom = null;
          ballsetSpaceGroup0 = null;
          return;
        }
        BirthDateValidator.releaseStatics((byte) -90);
        themeRandom = null;
        ballsetSpaceGroup0 = null;
    }

    final String currentValidationMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.dateInput.getDay((byte) -119);
          var3 = this.dateInput.getMonthIndex(25);
          var5 = -15 / ((-30 - param0) / 45);
          var4 = this.dateInput.getYear(119);
          var6 = HighscoresScreen.currentYear(36);
          if (var4 >= 1890 &&
            var6 - 3 >= var4) {
            if (QuickChatMenu.isValidCalendarDate((byte) 123, var4, var3, var2_int)) {
              return null;
            }
          } else {
            stackIn_4_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{"1890", Integer.toString(-3 + var6)}, -1, JaggrabDownloader.createAlertYearrange);
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return AnimatedNotification.createAlertInvaliddate;
    }

    final static boolean handleNamePopupKey(int obfuscationGuard) {
        if (obfuscationGuard != -3) {
          return true;
        }
        if (null == PasswordInputPainter.field_C) {
          return false;
        }
        if (!PasswordInputPainter.field_C.handleNormalizedNameKey(20628)) {
          return false;
        }
        return true;
    }

    final IntegerSyntaxSupport currentValidationState(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        IntegerSyntaxSupport stackIn_4_0 = null;
        IntegerSyntaxSupport stackIn_8_0 = null;
        IntegerSyntaxSupport stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != -14836) {
            themeRandom = (String) null;
          }
          var2_int = this.dateInput.getDay((byte) -119);
          var3 = this.dateInput.getMonthIndex(param0 ^ -14827);
          var4 = this.dateInput.getYear(49);
          var5 = HighscoresScreen.currentYear(param0 + 14872);
          if (1890 > var4) {
            stackIn_4_0 = AchievementProtocolSupport.field_d;
            return stackIn_4_0;
          }
          if (-3 + var5 < var4) {
            stackIn_8_0 = AchievementProtocolSupport.field_d;
            return stackIn_8_0;
          }
          if (!QuickChatMenu.isValidCalendarDate((byte) 122, var4, var3, var2_int)) {
            stackIn_11_0 = AchievementProtocolSupport.field_d;
            return stackIn_11_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return AchievementProtocolSupport.field_d;
        }
        return ProxySocketConnector.field_e;
    }

    public final void onTextInputSubmitted(TextInputWidget param0, boolean param1) {
        try {
          if (param1) {
            TextInputWidget var4 = (TextInputWidget) null;
            this.onTextInputChanged((TextInputWidget) null, -31);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sn.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public BirthDateValidator() {
    }

    public final boolean isInputEmpty(int param0) {
        if (param0 != -3) {
          BirthDateValidator.handleNamePopupKey(41);
          return this.dateInput.isDateIncomplete((byte) 114);
        }
        return this.dateInput.isDateIncomplete((byte) 114);
    }

    static {
        ballsetSpaceGroup0 = "Spots";
        muChatLobby = "Lobby";
        themeRandom = "Random";
    }
}
