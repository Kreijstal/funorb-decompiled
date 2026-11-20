/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends UiTextField implements ValidatableInput {
    static boolean field_N;
    private InputValidator validator;
    private int pointerOffsetX;
    static String[] field_M;

    public static void clearSharedReferences(int param0) {
        field_M = null;
        if (param0 <= 69) {
          ValidatedTextField.clearSharedReferences(21);
        }
    }

    final void notifyTextChanged(byte param0) {
        super.notifyTextChanged(param0);
        if (this.validator != null) {
          this.validator.markChanged(99);
        }
    }

    final String getTooltip(byte param0) {
        if (!this.hovered) {
          return null;
        }
        if (this.tooltip == null) {
          return null;
        }
        if (param0 == 125) {
          SetExplosionPushMultiplier.setTooltipPosition(PlayerGameData.field_b + (this.width - this.pointerOffsetX), (byte) -114, OpenGlFaceAttachment.field_b);
          return this.tooltip;
        }
        field_M = (String[]) null;
        SetExplosionPushMultiplier.setTooltipPosition(PlayerGameData.field_b + (this.width - this.pointerOffsetX), (byte) -114, OpenGlFaceAttachment.field_b);
        return this.tooltip;
    }

    final void setValidator(int param0, InputValidator param1) {
        if (param0 != 6614) {
          return;
        }
        try {
          this.validator = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tga.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final InputValidator getValidator(int param0) {
        if (param0 != -782444220) {
          InputValidator var3 = (InputValidator) null;
          this.setValidator(64, (InputValidator) null);
          return this.validator;
        }
        return this.validator;
    }

    ValidatedTextField(String param0, UiListener param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, int param1, byte param2, byte[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          if (param2 <= 66) {
            field_M = (String[]) null;
          }
          var5_int = 0;
          while (true) {
            if (SocialTabsPanel.field_b.length <= var5_int) {
              return;
            }
            param1 = SocialTabsPanel.field_b[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param4 = SetMissionDebrisDefaultProbability.field_p[incrementValue$1];
              dupTemp$2 = param3[param4];
              dupTemp$3 = param0[dupTemp$2];
              param0[dupTemp$2] = dupTemp$3 + 1;
              SetMissionDebrisDefaultProbability.field_p[dupTemp$3] = param4;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("tga.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.pointerOffsetX = -param1 + (PlayerGameData.field_b - this.x);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tga.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = new String[]{"Simple", "Standard", "Advanced"};
        field_N = false;
    }
}
