/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShipToShipRamDamage extends ConsoleCommand {
    static Widget field_q;
    static int field_o;
    static String field_p;

    final static void fillBorderedEllipse(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param0 != 11) {
          return;
        }
        if (param5 == param1) {
          AwardVictoryToWinnerActionFactory.fillBorderedCircle(param6, param7, param2, param5, param0 + 1512, param4, param3);
          return;
        }
        if (OpenGlTexture3D.rasterClipMinX > -param5 + param6) {
          SetOndamageParticleSpeed.fillBorderedEllipseClipped(2051507073, param4, param7, param3, param2, param5, param6, param1);
          return;
        }
        if (param6 + param5 > GetCountermeasureLauncherProjectiles.rasterClipMaxX) {
          SetOndamageParticleSpeed.fillBorderedEllipseClipped(2051507073, param4, param7, param3, param2, param5, param6, param1);
          return;
        }
        if (-param1 + param7 < NebulaField.rasterClipMinY) {
          SetOndamageParticleSpeed.fillBorderedEllipseClipped(2051507073, param4, param7, param3, param2, param5, param6, param1);
          return;
        }
        if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY >= param1 + param7) {
          GetBots.fillBorderedEllipseUnclipped(param2, param1, param5, param7, param6, param3, param4, 21601);
          return;
        }
        SetOndamageParticleSpeed.fillBorderedEllipseClipped(2051507073, param4, param7, param3, param2, param5, param6, param1);
    }

    GetShipToShipRamDamage(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_q = (Widget) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(3, 77));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nt.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_q = null;
        if (param0 != 2) {
          field_p = (String) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    static {
        field_o = 2;
        field_p = "Try again";
    }
}
