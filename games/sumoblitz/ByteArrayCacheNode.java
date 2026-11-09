/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ByteArrayCacheNode extends DualLinkNode {
    byte[] bytes;
    static ResourceArchive field_r;
    static AccountConnectionPhase READY_TO_CONNECT;

    final static boolean a(String param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (AsciiCharacterChecks.containsNonAlphanumeric(false, param0)) {
            return false;
          }
          if (LegacyOpenGlCubeTexture.hasUniformCharacters(param0, true)) {
            return false;
          }
          if (ArrayWidgetContainer.isPasswordLengthInvalid(param0, 30996)) {
            return false;
          }
          var3_int = 11 / ((param2 - 63) / 59);
          if (param1.length() == 0) {
            return true;
          }
          if (MessageDialog.containsForwardOrReverse(param0, param1, 106)) {
            return false;
          }
          if (CachedTextLayout.isPasswordPartOfName(param0, (byte) 111, param1)) {
            return false;
          }
          if (!AccountNameSupport.containsNameIgnoringUnderscores(false, param0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("gg.C(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_r = (ResourceArchive) null;
        }
        READY_TO_CONNECT = null;
        field_r = null;
    }

    final static void initializeGameplaySession(byte guard) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          NativeLibraryExtractor.hudMessages.clear(122);
          SpriteMask.drones = new Drone[100];
          LoginCredentialFactory.initializePlayerFromUpgradeSettings(85);
          if (guard <= 81) {
            READY_TO_CONNECT = (AccountConnectionPhase) null;
          }
          EmailAvailabilityRequest.powerupPickups = new IntrusiveDeque();
          QuickChatPhraseProvider.arenaPads = new IntrusiveDeque();
          if (OpenGlShaderProgram.levelIndex != -1) {
            QuickChatPhraseProvider.arenaPads = EnemyDrone.field_S[OpenGlShaderProgram.levelIndex].pads;
          }
          HardwareGraphicsHeap.field_o = new Random();
          ServerDataWriteRequest.droneSlotLimit = 1;
          GridWidgetContainer.livesRemaining = 3;
          AccountServiceResult.waveIndex = 0;
          Bzip2State.field_J = new DroneWave[6];
          var1_int = 0;
          if (-1 != OpenGlShaderProgram.levelIndex) {
            if (!MidiNoteMixer.field_r[OpenGlShaderProgram.levelIndex]) {
              for (var2 = RendererStateSnapshot.field_e[OpenGlShaderProgram.levelIndex]; var2 < 6 + RendererStateSnapshot.field_e[OpenGlShaderProgram.levelIndex]; var2++) {
                Bzip2State.field_J[var1_int] = IntrusiveDequeCursor.field_a[var2];
                var1_int++;
              }
            } else {
              Bzip2State.field_J = ((DroneWaveDefinition) (NoiseSliceGenerator.field_a.get(107, (long)OpenGlShaderProgram.levelIndex))).waves(-120);
            }
          }
          FadingWidget.score = 0;
          if (5 >= BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10)) {
            LoginPacketWriter.field_a = LoginPacketWriter.field_a + TextureFormat.elapsedTicks;
          } else {
            GraphicsToolkit.field_f = GraphicsToolkit.field_f + TextureFormat.elapsedTicks;
          }
          TextureFormat.elapsedTicks = 0;
          MusicPatch.simulationPaused = false;
          AppletInstanceState.beginCurrentWave(false);
          HardwareUnlitEffect.powerupScoreThreshold = 1000;
          TextLayout.playGameTrack(0, OpenGlShaderProgram.levelIndex % 5 + 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "gg.B(" + guard + ')');
        }
    }

    ByteArrayCacheNode(byte[] bytes) {
        try {
          this.bytes = bytes;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gg.<init>(" + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    static {
        READY_TO_CONNECT = new AccountConnectionPhase();
    }
}
