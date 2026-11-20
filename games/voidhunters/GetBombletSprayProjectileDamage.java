/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GetBombletSprayProjectileDamage extends ConsoleCommand {
    static GameStateFactory field_q;
    static int field_o;
    static int field_p;

    final static short[] a(short[] param0, int param1, int param2) {
        short[] var3 = null;
        RuntimeException var3_ref = null;
        short[] var4 = null;
        short[] var5 = null;
        short[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 70) {
            var4 = (short[]) null;
            GetBombletSprayProjectileDamage.a((short[]) null, -85, 57);
          }
          var5 = new short[param2];
          var3 = var5;
          ArrayOperations.copy(param0, 0, var5, 0, param2);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ioa.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2) {
        PcmSample var10 = null;
        SoundPlayback var11 = null;
        int var4 = 0;
        PcmSample var12 = null;
        LoopingSound var3 = null;
        PcmSample var12Lifetime1;
        LoopingSound var3Lifetime1;
        PcmSample var12Lifetime2;
        int var4Lifetime1;
        if (TextureTransformMode.field_a == null) {
          return;
        }
        LoopingSound var8 = SetThrusterParticleSpeedDownshift.findLoopingSound(param0, -26, param1);
        LoopingSound var9 = var8;
        if (param2 >= -31) {
          field_q = (GameStateFactory) null;
          if (var9 != null) {
            var9.refreshed = true;
            return;
          }
          var4 = param0;
          if (LegacyOpenGlMaterialEffectManager.field_j[param0] > 1) {
            var4 = TextHotspotRegion.randomBoundedInt(OpenGlGpuToolkit.field_Jc, LegacyOpenGlMaterialEffectManager.field_j[param0], 123) + param0;
          }
          var10 = PendingScoreboardRequest.soundEffects[var4];
          var12 = var10;
          var12Lifetime2 = var10;
          var11 = GetNebulaFadesOutWhenClose.a(-102, var10);
          var11.stream.setLoopCount(-1);
          var3 = new LoopingSound();
          var3.refreshed = true;
          var3.playback = var11;
          var3.key = param1;
          var3.positional = false;
          var3.sampleId = param0;
          PlayerReady.activeLoopingSounds.addLast(-10258, var3);
          return;
        }
        if (var9 != null) {
          var9.refreshed = true;
          return;
        }
        var4Lifetime1 = param0;
        if (LegacyOpenGlMaterialEffectManager.field_j[param0] > 1) {
          var4Lifetime1 = TextHotspotRegion.randomBoundedInt(OpenGlGpuToolkit.field_Jc, LegacyOpenGlMaterialEffectManager.field_j[param0], 123) + param0;
        }
        var12Lifetime1 = PendingScoreboardRequest.soundEffects[var4Lifetime1];
        SoundPlayback var13 = GetNebulaFadesOutWhenClose.a(-102, var12Lifetime1);
        var13.stream.setLoopCount(-1);
        var3Lifetime1 = new LoopingSound();
        var3Lifetime1.refreshed = true;
        var3Lifetime1.playback = var13;
        var3Lifetime1.key = param1;
        var3Lifetime1.positional = false;
        var3Lifetime1.sampleId = param0;
        PlayerReady.activeLoopingSounds.addLast(-10258, var3Lifetime1);
    }

    public static void clearSharedReferences(byte param0) {
        field_q = null;
        if (param0 != -102) {
          GetBombletSprayProjectileDamage.clearSharedReferences((byte) -93);
        }
    }

    GetBombletSprayProjectileDamage(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(148, 90));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ioa.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = 0;
        field_o = 10;
        field_q = (GameStateFactory) ((Object) new SpawnPointFactory());
    }
}
