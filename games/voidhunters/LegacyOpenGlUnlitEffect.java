/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlUnlitEffect extends LegacyOpenGlMaterialEffect {
    static int field_c;
    static String field_d;

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        if (param0 <= 105) {
          String var2 = (String) null;
          LegacyOpenGlUnlitEffect.startAccountCreation((String) null, 66, (AccountCreationForm) null, true, -92, (String) null, (String) null);
        }
    }

    final void enable(boolean param0, int param1) {
        if (param1 >= 18) {
          this.toolkit.setLightingSuppressed(32925, true);
          return;
        }
        OpenGlTexture var4 = (OpenGlTexture) null;
        this.setTexture(-92, (byte) 78, (OpenGlTexture) null);
        this.toolkit.setLightingSuppressed(32925, true);
    }

    LegacyOpenGlUnlitEffect(OpenGlToolkit param0) {
        super(param0);
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        try {
          this.toolkit.bindTexture(80, param2);
          if (param1 != 125) {
            field_c = -10;
          }
          this.toolkit.setTextureCombineMode(0, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ku.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean startAccountCreation(String param0, int param1, AccountCreationForm param2, boolean param3, int param4, String param5, String param6) {
        AccountCreationDialog var7 = null;
        RuntimeException var7_ref = null;
        String var8 = null;
        AccountCreationDialog var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SetCountermeasureLauncherAimspeed.field_r != ToolkitRasterStateStack.field_d) {
            return false;
          }
          var9 = new AccountCreationDialog(GetLagStandardDeviationIn.field_r, param2);
          var7 = var9;
          GetLagStandardDeviationIn.field_r.pushPanel(false, var9);
          if (SetAutozoomAmountMultiply.f(0)) {
            var9.showAccountIneligible(false);
          } else {
            SetCountermeasureLauncherAimspeed.field_r = dw.field_c;
            SetResourceNodeCaptureTime.field_p = param6;
            GrapplingHook.field_x = param0;
            SetDebrisCarryOverPercentage.field_p = param1;
            cjb.field_b = null;
            GetTabForScores.field_o = param5;
            AdjustVariableAction.field_a = param3;
          }
          if (param4 == 1) {
            return true;
          }
          var8 = (String) null;
          LegacyOpenGlUnlitEffect.startAccountCreation((String) null, 104, (AccountCreationForm) null, true, 77, (String) null, (String) null);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("ku.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void disable(int param0) {
        this.toolkit.setLightingSuppressed(32925, false);
        if (param0 != 5890) {
          String var3 = (String) null;
          LegacyOpenGlUnlitEffect.startAccountCreation((String) null, -94, (AccountCreationForm) null, true, -26, (String) null, (String) null);
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param1 != -25139) {
          this.applyRenderState(true, true);
        }
    }

    final boolean isSupported(int param0) {
        if (param0 > -87) {
          field_c = -126;
          return true;
        }
        return true;
    }

    final void applyRenderState(boolean param0, boolean param1) {
        if (!param0) {
          LegacyOpenGlUnlitEffect.clearSharedReferences((byte) -82);
        }
    }

    static {
        field_c = 1;
    }
}
