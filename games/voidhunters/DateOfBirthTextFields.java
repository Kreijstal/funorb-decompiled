/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthTextFields extends DateOfBirthInput {
    private boolean monthFirst;
    static String field_A;
    static String field_D;
    private UiTextField dayField;
    private UiTextField monthField;
    private UiTextField yearField;

    private final void drawFieldLabel(UiComponent param0, int param1, String param2, int param3, int param4) {
        try {
          SetTorpedoProjectileLife.field_o.drawCentered(param2, (param0.width >> 1) + (param4 + param0.x), param1 + param0.y - 5, 16777215, -1);
          if (param3 != 1225728129) {
            this.isIncomplete(108);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ita.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    DateOfBirthTextFields(UiRenderer param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param2, param4, param5, 1, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ita.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, 66, param3);
        if (param2 < 47) {
          field_D = (String) null;
          if (0 != param1) {
            return;
          }
          param0 = param0 + this.x;
          param3 = param3 + this.y;
          this.drawFieldLabel(this.dayField, param3, GetReadyRoomMissionTime.field_q, 1225728129, param0);
          this.drawFieldLabel(this.monthField, param3, GetBombletSprayAimspeed.field_o, 1225728129, param0);
          this.drawFieldLabel(this.yearField, param3, GetMissileLauncherRandomness.field_q, 1225728129, param0);
          return;
        }
        if (0 != param1) {
          return;
        }
        param0 = param0 + this.x;
        param3 = param3 + this.y;
        this.drawFieldLabel(this.dayField, param3, GetReadyRoomMissionTime.field_q, 1225728129, param0);
        this.drawFieldLabel(this.monthField, param3, GetBombletSprayAimspeed.field_o, 1225728129, param0);
        this.drawFieldLabel(this.yearField, param3, GetMissileLauncherRandomness.field_q, 1225728129, param0);
    }

    final int getYear(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 3476) {
          return 3;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.yearField.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean isIncomplete(int param0) {
        DateOfBirthValidator var3;
        if (param0 == 0) {
          if (null != this.dayField.text &&
            this.dayField.text.length() != 0) {
            if (this.monthField.text == null) {
              return true;
            }
            if (0 == this.monthField.text.length()) {
              return true;
            }
            if (this.yearField.text != null &&
              this.yearField.text.length() != 0) {
              return false;
            }
            return true;
          }
          return true;
        }
        var3 = (DateOfBirthValidator) null;
        this.setValidator(41, (DateOfBirthValidator) null);
        if (null == this.dayField.text) {
          return true;
        }
        if (this.dayField.text.length() == 0) {
          return true;
        }
        if (this.monthField.text == null) {
          return true;
        }
        if (0 == this.monthField.text.length()) {
          return true;
        }
        if (this.yearField.text == null) {
          return true;
        }
        if (this.yearField.text.length() == 0) {
          return true;
        }
        return false;
    }

    final int getDayOfMonth(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -5) {
          return -67;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.dayField.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static BitmapFont getDefaultBitmapFont(int param0, int param1) {
        if (param1 != 7988) {
          field_D = (String) null;
          return GrapplingHookFactory.field_a;
        }
        return GrapplingHookFactory.field_a;
    }

    final String getTooltip(byte param0) {
        String var2 = this.monthField.getTooltip(param0);
        if (var2 != null) {
          return var2;
        }
        if (this.hovered) {
          return null == this.tooltip ? this.text : this.tooltip;
        }
        return null;
    }

    final void setValidator(int param0, DateOfBirthValidator param1) {
        try {
          super.setValidator(75, param1);
          this.dayField.listener = (UiListener) ((Object) param1);
          this.monthField.listener = (UiListener) ((Object) param1);
          this.yearField.listener = (UiListener) ((Object) param1);
          if (param0 <= 73) {
            this.isIncomplete(-83);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ita.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getMonthIndex(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          return 37;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.monthField.text) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private DateOfBirthTextFields(UiRenderer param0, boolean param1) {
        super(0, 0, 0, 0, (UiRenderer) null);
        try {
          this.dayField = (UiTextField) ((Object) new ValidatedTextField("", (UiListener) null, 2));
          this.monthField = (UiTextField) ((Object) new ValidatedTextField("", (UiListener) null, 2));
          this.yearField = (UiTextField) ((Object) new ValidatedTextField("", (UiListener) null, 4));
          this.yearField.renderer = param0;
          this.monthField.renderer = param0;
          this.dayField.renderer = param0;
          this.monthFirst = param1 ? true : false;
          if (!this.monthFirst) {
            this.addChild(-18756, this.dayField);
            this.addChild(-18756, this.monthField);
          } else {
            this.addChild(-18756, this.monthField);
            this.addChild(-18756, this.dayField);
          }
          this.addChild(-18756, this.yearField);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ita.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3 ^ 0, param4);
        if (param3 != 1) {
          this.isIncomplete(-41);
        }
        int var6 = param1 - 130 >> 1;
        if (!this.monthFirst) {
          this.dayField.setBounds(var6, 25, param2, param3 + 0, 0);
          this.monthField.setBounds(var6 + 45, 25, param2, param3 + 0, 0);
          this.yearField.setBounds(90 + var6, 40, param2, param3 + 0, 0);
          return;
        }
        this.monthField.setBounds(var6, 25, param2, 1, 0);
        this.dayField.setBounds(var6 + 45, 25, param2, 1, 0);
        this.yearField.setBounds(90 + var6, 40, param2, param3 + 0, 0);
    }

    public static void clearSharedReferences(byte param0) {
        field_A = null;
        field_D = null;
        if (param0 <= 71) {
          field_A = (String) null;
        }
    }

    static {
        field_D = "Next";
        field_A = "Hide chat";
    }
}
