/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBombletSprayProjectileLife extends ConsoleCommand {
    static String field_p;
    static boolean[] allowedCommonPackets;

    final static Sprite[] createCenterSpriteArray(boolean param0, Sprite param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new Sprite[9];
          var2 = var3;
          if (param0) {
            SetBombletSprayProjectileLife.clearSharedReferences((byte) -84);
          }
          var3[4] = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("lna.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_p = null;
        if (param0 >= -113) {
          OpenGlToolkit var2 = (OpenGlToolkit) null;
          SetBombletSprayProjectileLife.initializeWaterNoiseVolumes((OpenGlToolkit) null, 103);
          allowedCommonPackets = null;
          return;
        }
        allowedCommonPackets = null;
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
          SetMachineGunEnergyUsed.a(92, 62, arguments[0].intValue(112));
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lna.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetBombletSprayProjectileLife(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void initializeWaterNoiseVolumes(OpenGlToolkit param0, int param1) {
        RuntimeException var2 = null;
        LegacyRidgedNoiseVolume var7 = null;
        LegacyFractalNoiseVolume var9 = null;
        LegacyOpenGlNormalMapGenerator var11 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (GetMissionTimeLimit.field_p == null) {
            var7 = new LegacyRidgedNoiseVolume();
            var19 = var7.generateVolume(128, (byte) -66, 128, 16);
            GetMissionTimeLimit.field_p = EscapePodFactory.storeBytes(false, var19, -12445);
          }
          if (ScrollBarWidget.field_vb == null) {
            var9 = new LegacyFractalNoiseVolume();
            var20 = var9.generateVolume(128, (byte) -29, 128, 16);
            ScrollBarWidget.field_vb = EscapePodFactory.storeBytes(false, var20, -12445);
          }
          var11 = param0.field_yb;
          if (var11.ensureProgram(param1 + 77) &&
            null == SetPhasedEnergyBeamProjectileOndamageParticles.field_o) {
            var21 = GetFighterRepairTime.a(4.0f, 0.6000000238418579f, (byte) 80, 8, new FloatGradientNoiseSliceGenerator(419684), 16, 128, 128, 0.5f, 4.0f, 16.0f);
            SetPhasedEnergyBeamProjectileOndamageParticles.field_o = EscapePodFactory.storeBytes(false, var21, param1 - 12461);
          }
          if (param1 == 16) {
            return;
          }
          SetBombletSprayProjectileLife.clearSharedReferences((byte) -27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("lna.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "This password is part of your Player Name, and would be easy to guess";
        allowedCommonPackets = new boolean[64];
    }
}
