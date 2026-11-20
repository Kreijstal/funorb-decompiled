/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GetGrapplingHookAimarc extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(139, 88));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rmb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != -16777216) {
          return 34;
        }
        return (param1 >>> 1 & -2139127937) + (-16777216 & param1);
    }

    GetGrapplingHookAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void updateLoopingSound(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        PcmSample var9 = null;
        SoundPlayback var10 = null;
        LoopingSound var5 = null;
        int var6 = 0;
        int var6Lifetime1;
        if (null == TextureTransformMode.field_a) {
          return;
        }
        LoopingSound var12 = SetThrusterParticleSpeedDownshift.findLoopingSound(param2, -112, param1);
        LoopingSound var13 = var12;
        if (var13 != null) {
          var13.refreshed = true;
          var13.y = param0;
          var13.x = param4;
        } else {
          var6 = UiToggleButtonRenderer.computeSoundPan(128, param4);
          var7 = SpriteTextureOperation.computeSoundGain((byte) 126, param4, param0);
          var8 = param2;
          if (LegacyOpenGlMaterialEffectManager.field_j[param2] > 1) {
            var8 = TextHotspotRegion.randomBoundedInt(OpenGlGpuToolkit.field_Jc, LegacyOpenGlMaterialEffectManager.field_j[param2], 121) + param2;
          }
          var9 = PendingScoreboardRequest.soundEffects[var8];
          var10 = ServerInfo.playPannedSample(var7, 100, var6, var9);
          var10.stream.setLoopCount(-1);
          var5 = new LoopingSound();
          var5.x = param4;
          var5.sampleId = param2;
          var5.y = param0;
          var5.key = param1;
          var5.refreshed = true;
          var5.playback = var10;
          var5.positional = true;
          PlayerReady.activeLoopingSounds.addLast(-10258, var5);
        }
        var6Lifetime1 = 116 % ((param3 - 14) / 45);
    }

    static {
    }
}
