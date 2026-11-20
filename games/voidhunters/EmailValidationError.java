/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidationError {
    static int[] field_a;

    public static void clearSharedReferences(int param0) {
        if (param0 != 199) {
          return;
        }
        field_a = null;
    }

    final static void layoutSlidingLobbyPanels(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 < -100) {
          var2 = (-640 + GetShieldsDirectionalArcParticleLife.field_p) / 2;
          var3 = GetRepairModePower.field_o * GetRepairModePower.field_o;
          var4 = var3 - param0 * param0;
          WaterTextures.field_g.setBounds(var2 - 199 * var4 / var3, 122, 199, 90, -94 + (-120 + SoftwareRasterizer2D.height));
          ThreeSliceButtonStyle.field_r.setBounds(var2 + 202 + 438 * var4 / var3, 26, 438, 0, -124 + SoftwareRasterizer2D.height);
          return;
        }
        EmailValidationError.clearSharedReferences(92);
        var2Lifetime1 = (-640 + GetShieldsDirectionalArcParticleLife.field_p) / 2;
        var3Lifetime1 = GetRepairModePower.field_o * GetRepairModePower.field_o;
        var4Lifetime1 = var3Lifetime1 - param0 * param0;
        WaterTextures.field_g.setBounds(var2Lifetime1 - 199 * var4Lifetime1 / var3Lifetime1, 122, 199, 90, -94 + (-120 + SoftwareRasterizer2D.height));
        ThreeSliceButtonStyle.field_r.setBounds(var2Lifetime1 + 202 + 438 * var4Lifetime1 / var3Lifetime1, 26, 438, 0, -124 + SoftwareRasterizer2D.height);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static EmailValidationError validateEmailAddress(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        EmailValidationError var5 = null;
        EmailValidationError stackIn_6_0 = null;
        EmailValidationError stackIn_10_0 = null;
        EmailValidationError stackIn_13_0 = null;
        EmailValidationError stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -68) {
            field_a = (int[]) null;
          }
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_10_0 = IntegerArrayReadRequest.incompleteEmailError;
              return stackIn_10_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = SetToggledScoreboard.validateEmailLocalPart((byte) 108, var3);
            if (var5 == null) {
              stackIn_15_0 = SetServerinfoComponentstate.validateEmailDomain(0, var4);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_6_0 = GetGrapplingHookCooldown.emptyEmailError;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("lkb.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new int[1];
    }
}
