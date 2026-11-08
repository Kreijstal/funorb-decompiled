/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateInputValidator extends DebouncedValidationProvider implements TextInputListener, DateValidationMarker {
    DateInputWidget dateInput;
    static UiLayoutNode field_f;
    static int field_d;
    static IndexedSprite[] field_e;

    final static void a(boolean param0, UiLayoutNode param1) {
        UiLayoutNode var4 = null;
        UiLayoutNode var2 = null;
        int var3 = Kickabout.field_G;
        UiLayoutNode var2Lifetime1;
        try {
          var4 = (UiLayoutNode) (param1.field_jb.g(24009));
          var2 = var4;
          while (var4 != null) {
            var4.field_J = 0;
            var4.field_mb = 0;
            var4.field_L = 0;
            var4.field_v = 0;
            var4 = (UiLayoutNode) (param1.field_jb.c(33));
            var2Lifetime1 = var4;
          }
          if (!param0) {
            field_e = (IndexedSprite[]) null;
          }
          param1.field_J = 0;
          param1.field_mb = 0;
          param1.field_L = 0;
          param1.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "hl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onEnterPressed(int param0, TextInputWidget param1) {
        try {
          int var3_int = -20 % ((8 - param0) / 47);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "hl.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String evaluateValidationMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.dateInput.getDay(92);
          var3 = this.dateInput.getMonthIndex((byte) 48);
          var4 = this.dateInput.getYear(param0);
          var5 = th.b((byte) 113);
          if (var4 >= 1890 &&
            var4 <= var5 - 3) {
            if (FullscreenDisplayMode.isValidCalendarDate(true, var4, var2_int, var3)) {
              return null;
            }
          } else {
            stackIn_4_0 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, StringCursor.field_e, new String[]{"1890", Integer.toString(var5 - 3)});
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return rr.field_c;
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != -3) {
          field_f = (UiLayoutNode) null;
        }
    }

    public DateInputValidator() {
    }

    final ValidationState evaluateValidationState(boolean param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_6_0 = null;
        boolean stackIn_10_0 = false;
        ValidationState stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.dateInput.getDay(94);
          var3 = this.dateInput.getMonthIndex((byte) 48);
          var4 = this.dateInput.getYear(-1);
          var5 = th.b((byte) 108);
          if (var4 < 1890) {
            stackIn_3_0 = PitchOptionTile.field_Bb;
            return stackIn_3_0;
          }
          if (var5 - 3 < var4) {
            stackIn_6_0 = PitchOptionTile.field_Bb;
            return stackIn_6_0;
          }
          stackIn_10_0 = !param0;
          if (!FullscreenDisplayMode.isValidCalendarDate(stackIn_10_0, var4, var2_int, var3)) {
            stackIn_13_0 = PitchOptionTile.field_Bb;
            return stackIn_13_0;
          }
          if (param0) {
            this.dateInput = (DateInputWidget) null;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          return PitchOptionTile.field_Bb;
        }
        return LobbyPlayerRow.field_yb;
    }

    public final boolean isInputEmpty(byte param0) {
        if (param0 != -28) {
          this.isInputEmpty((byte) 110);
          return this.dateInput.b(true);
        }
        return this.dateInput.b(true);
    }

    public final void onTextChanged(byte param0, TextInputWidget param1) {
        try {
          this.validationChanged(113);
          if (param0 <= 65) {
            field_d = 37;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "hl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
