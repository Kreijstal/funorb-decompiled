/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static String field_j;
    static String[] field_m;
    private UiTextField usernameField;
    static int[] perlinFadeTable;
    private UiTextField emailField;
    static String waitingForTextMessage;
    static String field_g;
    static int field_l;

    final String getValueValidationMessage(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.usernameField.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (GetDebrisCarryOver.a(var5, 15)) {
            stackIn_5_0 = SetShipDirectionArrow.field_r;
            return stackIn_5_0;
          }
          if (SetAutozoomAmountMultiply.a((byte) 109, var5)) {
            stackIn_8_0 = GetThrusterParticleSpeedDownshift.field_o;
            return stackIn_8_0;
          }
          if (OpenGlPostEffect.isRepeatedCharacter(126, var5)) {
            stackIn_11_0 = ConsoleCharacterStream.field_a;
            return stackIn_11_0;
          }
          if (this.containsEmailPart(param0, false)) {
            stackIn_15_0 = NodeHashTable.field_f;
            return stackIn_15_0;
          }
          if (~var3.length() >= param1) {
            stackIn_18_0 = SetGrapplingHookMaxLength.field_q;
            return stackIn_18_0;
          }
          if (GetAngularVelocitySustainMax.a(var5, -1, var3)) {
            stackIn_21_0 = GetShieldsDirectionalArc.field_q;
            return stackIn_21_0;
          }
          if (SetMassDriverProjectileOndamageParticles.a(var3, 95, var5)) {
            stackIn_25_0 = SetBombletSprayProjectileLife.field_p;
            return stackIn_25_0;
          }
          if (!SetTabForScores.a(var5, var3, true)) {
            stackIn_30_0 = SetShipDirectionArrow.field_r;
            return stackIn_30_0;
          }
          stackIn_28_0 = GetShieldsDirectionalArc.field_q;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("ocb.C(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final static Widget a(int param0, int param1, int param2, BitmapFont param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        Widget var13 = null;
        RuntimeException var13_ref = null;
        Widget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new Widget(0L, (Widget) null);
          if (param2 != 10204) {
            waitingForTextMessage = (String) null;
          }
          var13.field_gb = SetBurstFireReload.createBorderedSpriteTiles(-26998, param4, param11);
          var13.field_mb = SetBurstFireReload.createBorderedSpriteTiles(param2 - 37202, param5, param6);
          var13.field_A = SetBurstFireReload.createBorderedSpriteTiles(param2 ^ -20138, param12, param9);
          var13.field_nb = SetBurstFireReload.createBorderedSpriteTiles(-26998, param7, param1);
          var13.field_ub = SetBurstFireReload.createBorderedSpriteTiles(param2 - 37202, param0, param8);
          var13.field_Y = param10;
          var13.font = param3;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("ocb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param0) {
          SetPedrosRepairMode.field_o = SetPedrosRepairMode.field_o + 1;
          SetDebrisCarryOver.e(param1 + 94);
        }
        if (param2) {
          SetPhasedEnergyBeamRandomness.field_p = SetPhasedEnergyBeamRandomness.field_p + 1;
          SetBuildViewAutozoom.a(param1 - 10726);
        }
        if (param1 != 33) {
          PasswordValidator.f(12);
        }
    }

    final static void f(int param0) {
        ShipSpawnedConditionFactory.a(100);
        if (param0 != -10150) {
          PasswordValidator.a(-128, 101, 87, (BitmapFont) null, 109, 83, -49, -78, 19, -41, 88, -111, 125);
        }
        GpuMaterialEffect.buildToolkitFonts(-2283);
        SetReadyRoomMutatorTime.e(-17);
    }

    public static void clearSharedReferences(byte param0) {
        field_m = null;
        field_g = null;
        if (param0 < 125) {
          return;
        }
        perlinFadeTable = null;
        waitingForTextMessage = null;
        field_j = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 <= 101) {
          field_g = (String) null;
        }
        if (RoundResultFactory.field_a != null) {
          SoftwareRasterizer2D.darkenRectangle(SoftwareRasterizer2D.clipLeft, SoftwareRasterizer2D.clipTop, -SoftwareRasterizer2D.clipLeft + SoftwareRasterizer2D.clipRight, -SoftwareRasterizer2D.clipTop + SoftwareRasterizer2D.clipBottom);
          RoundResultFactory.field_a.draw(param0, 22);
        }
    }

    PasswordValidator(UiTextField param0, UiTextField param1, UiTextField param2) {
        super(param0);
        try {
          this.emailField = param2;
          this.usernameField = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ocb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ValidationState validateValue(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_9_0 = null;
        ValidationState stackIn_12_0 = null;
        ValidationState stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.usernameField.text.toLowerCase();
          if (param1 != 16384) {
            stackIn_2_0 = (ValidationState) null;
            return stackIn_2_0;
          }
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = SetArmageddonLength.invalidInput;
            return stackIn_5_0;
          }
          if (!SetArmageddonWarning.a(var3, var4, -101)) {
            stackIn_9_0 = SetArmageddonLength.invalidInput;
            return stackIn_9_0;
          }
          if (!this.containsEmailPart(param0, false)) {
            stackIn_14_0 = GetShipPersistence.validInput;
            return stackIn_14_0;
          }
          stackIn_12_0 = SetArmageddonLength.invalidInput;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ocb.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean containsEmailPart(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.emailField.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (param1) {
            return true;
          }
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var3.length() - 1 > var5) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (0 <= var4.indexOf(var6)) {
                return true;
              }
              stackIn_16_0 = (var4.indexOf(var7) >= 0);
              return stackIn_16_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("ocb.Q(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_j = "Hide game chat";
        perlinFadeTable = new int[4096];
        for (var0 = 0; var0 < 4096; var0++) {
          perlinFadeTable[var0] = GetMomentOfInertiaPerpointCalcDownshift.perlinFade((byte) 60, var0);
        }
        field_g = "Chat is currently disabled.";
    }
}
