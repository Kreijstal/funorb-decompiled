/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityValidator extends TextFieldValidator {
    private String checkedName;
    private boolean nameAvailable;
    static GpuProjectionMode field_h;
    static byte[] field_i;

    UsernameAvailabilityValidator(UiTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final ValidationState validateValue(String param0, int param1) {
        AccountRequestResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_12_0 = null;
        ValidationState stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!GetUseBackground.a(var4, 0)) {
            stackIn_3_0 = SetArmageddonLength.invalidInput;
            return stackIn_3_0;
          }
          if (param1 != 16384) {
            field_i = (byte[]) null;
          }
          if (!param0.equals(this.checkedName)) {
            var3 = ComponentAttachmentPlan.pollNameAvailability(false, param0);
            if (var3 != null &&
              null == var3.message) {
              this.checkedName = param0;
              this.nameAvailable = var3.success;
            } else {
              stackIn_12_0 = SetFighterRepairTime.pendingValidation;
              return stackIn_12_0;
            }
          }
          if (this.nameAvailable) {
            stackIn_17_0 = GetShipPersistence.validInput;
          } else {
            stackIn_17_0 = SetArmageddonLength.invalidInput;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tib.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void invalidateAvailabilityCache(byte param0) {
        this.checkedName = null;
        if (param0 < 7) {
          field_h = (GpuProjectionMode) null;
        }
    }

    final String getValueValidationMessage(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountRequestResult var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        Object stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = igb.a(var5, (byte) 119);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param0.equals(this.checkedName)) {
            var4 = ComponentAttachmentPlan.pollNameAvailability(false, param0);
            if (var4 == null) {
              return null;
            }
            if (null != var4.message) {
              stackIn_13_0 = null;
              return (String) (stackIn_13_0);
            }
            this.nameAvailable = var4.success;
            this.checkedName = param0;
          }
          if (this.nameAvailable) {
            stackIn_19_0 = TutorialHintStatus.nameAvailableText;
            return stackIn_19_0;
          }
          stackIn_17_0 = GetLaserReload.field_p;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("tib.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int getFontAscent(boolean param0, int param1) {
        if (!param0) {
          field_h = (GpuProjectionMode) null;
          if (!OpenGlTexture1D.field_i) {
            return DateOfBirthTextFields.getDefaultBitmapFont(param1, 7988).maxAscent;
          }
          return SetTorpedoEnergyUsed.a(param1, 300).maxAscent;
        }
        if (!OpenGlTexture1D.field_i) {
          return DateOfBirthTextFields.getDefaultBitmapFont(param1, 7988).maxAscent;
        }
        return SetTorpedoEnergyUsed.a(param1, 300).maxAscent;
    }

    final static int parseInt(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -596) {
            field_h = (GpuProjectionMode) null;
          }
          stackIn_3_0 = SetMissionTerrainVotingChancestep.parseInt(true, param1, true, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tib.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 == 6312) {
          field_i = null;
          field_h = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        UsernameAvailabilityValidator.parseInt(46, (CharSequence) null, 2);
        field_i = null;
        field_h = null;
    }

    static {
        field_h = new GpuProjectionMode();
    }
}
