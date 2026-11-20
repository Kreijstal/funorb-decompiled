/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetNebulaFadesOutWhenClose extends ConsoleCommand {
    final static void selectMenuScreen(int param0, boolean param1, byte param2, int param3) {
        SetCountermeasureLauncherProjectileLife.field_o = param0;
        SetVariableAction.field_b = 0;
        AgeValidator.field_f = param3;
        if (param2 != -85) {
          return;
        }
        if (!BodyInZoneConditionFactory.isMenuScreenActive(false, AgeValidator.field_f)) {
          return;
        }
        GetNebulaFadesOutWhenClose.playSample(-103, PendingScoreboardRequest.soundEffects[75]);
        int var4 = 0;
        if (AgeValidator.field_f == 7) {
          var4 = -1;
        }
        if (5 == AgeValidator.field_f) {
          var4 = 1;
        }
        WorldSpriteTiler.field_a[AgeValidator.field_f].resetSelection(param1, 320, var4);
        if (AgeValidator.field_f == 7) {
          BombletSprayWeaponDefinition.a(param1, (byte) 90);
          return;
        }
    }

    GetNebulaFadesOutWhenClose(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static SoundPlayback playSample(int param0, PcmSample param1) {
        RuntimeException var2 = null;
        SoundPlayback stackIn_2_0 = null;
        SoundPlayback stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -85) {
            stackIn_4_0 = Model3D.playSampleStream(61, PcmSampleStream.create(param1, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (SoundPlayback) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lha.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        PcmSample var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (PcmSample) null;
            GetNebulaFadesOutWhenClose.playSample(-99, (PcmSample) null);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(17, 86));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lha.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
