/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthValidator extends DebouncedValidator implements EditableTextWidgetListener, DropdownSelectionListener {
    DateInputWidget input;
    static int[] field_g;
    static ClientUiComponent field_i;
    static String field_f;
    static PacketBuffer field_h;
    static int consoleArgumentCommaKind;
    static ResourceArchive field_e;

    public final void textChanged(EditableTextWidget widget, int obfuscationGuard) {
        try {
          int var3_int = -12 / ((-80 - obfuscationGuard) / 33);
          this.validationChanged(127);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sb.FA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final void selectionChanged(int obfuscationGuard, DropdownSelector selector) {
        if (obfuscationGuard > -82) {
          return;
        }
        try {
          this.validationChanged(125);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sb.N(" + obfuscationGuard + ',' + (selector != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0) {
          String var2 = (String) null;
          DateOfBirthValidator.a((String) null, (byte) -81);
        }
    }

    public DateOfBirthValidator() {
    }

    final String evaluateMessage(byte obfuscationGuard) {
        int day = 0;
        NumberFormatException parseFailure = null;
        int monthIndex = 0;
        int year = 0;
        int currentYear = 0;
        String yearRangeDiagnostic = null;
        Object validDiagnostic = null;
        Throwable decompiledCaughtException = null;
        try {
          day = this.input.getDay(97);
          monthIndex = this.input.getMonthIndex(-26458);
          if (obfuscationGuard != -71) {
            this.evaluateState(-41);
          }
          year = this.input.getYear((byte) -77);
          currentYear = ActionSpell.b(true);
          if (year >= 1890 &&
            year <= currentYear - 3) {
            if (dt.isValidDate(year, -24375, monthIndex, day)) {
              validDiagnostic = null;
              return (String) (validDiagnostic);
            }
          } else {
            yearRangeDiagnostic = EmailCheckResult.a(4800, CampaignMenu.field_r, new String[]{"1890", Integer.toString(-3 + currentYear)});
            return yearRangeDiagnostic;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          parseFailure = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return StateChangeEvent.field_z;
    }

    final static rn a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_18_0 = null;
        rn stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = HotspotTextWidget.field_N;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = el.field_e;
            return stackIn_8_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_18_0 = ov.field_h;
                return stackIn_18_0;
              }
            } else {
              if (ArchiveProvider.field_c.indexOf(var4) == -1) {
                stackIn_21_0 = ov.field_h;
                return stackIn_21_0;
              }
            }
          }
          if (param1 == -107) {
            return null;
          }
          var6 = (String) null;
          DateOfBirthValidator.a((String) null, (byte) -62);
          stackIn_26_0 = null;
          return (rn) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("sb.P(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final ValidationState evaluateState(int obfuscationGuard) {
        int day = 0;
        NumberFormatException parseFailure = null;
        int monthIndex = 0;
        int year = 0;
        int currentYear = 0;
        int guardRemainder = 0;
        ValidationState tooOldState = null;
        ValidationState tooRecentState = null;
        ValidationState invalidCalendarState = null;
        Throwable decompiledCaughtException = null;
        try {
          day = this.input.getDay(50);
          monthIndex = this.input.getMonthIndex(-26458);
          year = this.input.getYear((byte) -77);
          currentYear = ActionSpell.b(true);
          if (year < 1890) {
            tooOldState = rn.validationInvalid;
            return tooOldState;
          }
          guardRemainder = 26 % ((obfuscationGuard - 56) / 32);
          if (year > -3 + currentYear) {
            tooRecentState = rn.validationInvalid;
            return tooRecentState;
          }
          if (!dt.isValidDate(year, -24375, monthIndex, day)) {
            invalidCalendarState = rn.validationInvalid;
            return invalidCalendarState;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          parseFailure = (NumberFormatException) (Object) decompiledCaughtException;
          return rn.validationInvalid;
        }
        return oo.validationValid;
    }

    public final boolean isInputEmpty(int obfuscationGuard) {
        if (obfuscationGuard <= 12) {
          field_g = (int[]) null;
        }
        return this.input.isDateEmpty(-22339);
    }

    public final void textSubmitted(EditableTextWidget widget, int obfuscationGuard) {
        try {
          if (obfuscationGuard != 80) {
            field_h = (PacketBuffer) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sb.EA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
        consoleArgumentCommaKind = 2;
        field_f = "You currently have an ongoing mission at this location.<br><Br>You are on turn <col=ffff00><%0></col>. <br><br>Do you wish to resume this mission or do you want to abort it and restart?";
        field_g = new int[]{166};
    }
}
