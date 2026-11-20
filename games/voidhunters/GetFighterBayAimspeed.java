/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetFighterBayAimspeed extends ConsoleCommand {
    static String requestedPlayerName;
    static String field_q;
    static String field_p;

    GetFighterBayAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void initializeAudio(PlatformService param0, MidiCrossfadeStream param1, java.awt.Component param2, boolean param3, int param4, int param5, byte param6, int param7) {
        try {
          AudioOutput.configure(param7, param3, 10);
          SetSelfDestructTimer.musicOutput = AudioOutput.create(param0, param2, 0, param4);
          LobbyGameContextMenuBuilder.effectsOutput = AudioOutput.create(param0, param2, 1, param5);
          if (param6 != 21) {
            field_q = (String) null;
          }
          MaskedPasswordTextStyle.effectsMixer = new PcmStreamMixer();
          LegacyOpenGlWaveWaterEffect.effectsBufferSize = param5;
          LobbyGameContextMenuBuilder.effectsOutput.setStream(MaskedPasswordTextStyle.effectsMixer);
          GetBurstFireMaxEnergy.musicStream = param1;
          GetBurstFireMaxEnergy.musicStream.setMasterGain((byte) -108, GetMutatorVotes.field_p);
          SetSelfDestructTimer.musicOutput.setStream(GetBurstFireMaxEnergy.musicStream);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vda.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static SoftwareAlphaBitmapFont loadSoftwareAlphaFontByName(int param0, String param1, ResourceArchive param2, ResourceArchive param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        SoftwareAlphaBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            requestedPlayerName = (String) null;
          }
          var5_int = param2.getGroupId(param1, -127);
          var6 = param2.getFileId(true, var5_int, param4);
          stackIn_3_0 = GetMissionTerrainAsteroidProbability.a(320, var6, param3, var5_int, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vda.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -112);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(120, 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vda.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 == 99) {
          field_p = null;
          requestedPlayerName = null;
          field_q = null;
          return;
        }
        field_q = (String) null;
        field_p = null;
        requestedPlayerName = null;
        field_q = null;
    }

    static {
        field_p = "to keep fullscreen or";
        field_q = "Quit to website";
    }
}
