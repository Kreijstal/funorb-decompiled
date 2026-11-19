/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextWidget implements ValidatorProvider {
    static int field_W;
    private int field_X;
    static int field_V;
    private Validator field_T;
    static int field_U;

    ValidatedTextField(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          var2_int = param1.charAt(0);
          var3 = 1;
          if (param0) {
            field_W = 38;
          }
          while (var3 < param1.length()) {
            if (param1.charAt(var3) != var2_int) {
              return false;
            }
            var3++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("p.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void updateInput(int param0, int param1, int param2, UiWidget param3) {
        if (param0 != 10000536) {
          return;
        }
        try {
          super.updateInput(param0 + 0, param1, param2, param3);
          this.field_X = -param2 + (AchievementSubmission.field_n - this.x);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "p.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, Validator param1) {
        if (param0 != 0) {
          return;
        }
        try {
          this.field_T = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "p.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void i(byte param0) {
        super.i((byte) -73);
        if (param0 > -59) {
          Validator var3 = (Validator) null;
          this.a(-16, (Validator) null);
        }
        if (null != this.field_T) {
          this.field_T.invalidate((byte) -115);
        }
    }

    public final Validator getValidator(byte param0) {
        int var2 = -2 % ((62 - param0) / 36);
        return this.field_T;
    }

    final static void drawProgressBar(byte param0, String param1, boolean param2, float param3) {
        try {
          if (ProxySocketConnector.field_e == null) {
            ProxySocketConnector.field_e = new ProgressDialog(GameShell.field_A, QuickChatDynamicCommand.field_a);
            GameShell.field_A.b((UiWidget) (ProxySocketConnector.field_e), (byte) 126);
          }
          int var4_int = 25 % ((param0 + 75) / 34);
          ProxySocketConnector.field_e.a(param1, param3, 2113632, param2);
          SoftwareRasterizer.clear();
          WidgetTheme.a(-117, true);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "p.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static LoginMethodPreference[] l(byte param0) {
        if (param0 != 100) {
          return (LoginMethodPreference[]) null;
        }
        return new LoginMethodPreference[]{StripedProgressBar.field_C, IndexedSpriteState.field_e, ra.field_j};
    }

    final String getTooltip(boolean param0) {
        if (!this.hovered) {
          return null;
        }
        if (null == this.tooltip) {
          return null;
        }
        if (param0) {
          this.getValidator((byte) -27);
        }
        EditableTextWidget.a(AchievementSubmission.field_n - this.field_X + this.width, NetworkArchiveRequest.field_B, -91);
        return this.tooltip;
    }

    static {
        field_V = 0;
        field_U = 0;
        field_W = -1;
    }
}
