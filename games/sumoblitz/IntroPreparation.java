/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroPreparation {
    static String restartLevelText;

    public static void releaseStatics(byte param0) {
        restartLevelText = null;
        if (param0 <= 69) {
          restartLevelText = (String) null;
        }
    }

    final static void prepareIntro(PcmStreamMixer unusedMixer, byte guard, ResourceArchive archive, int durationMillis) {
        try {
          LegacyOpenGlRidgedWaterEffect.field_i = Base37NameAlphabet.ticksPerSecond(-32) * durationMillis / 1000;
          MenuScreen.initializeLogoAudio(archive, 100);
          IntroMeshResources.loadIntroMeshes(false, archive);
          IntroFinalFrameResources.loadIntroFinalFrame(archive, -84);
          SelectionOverlay.initializeIntroLighting(true);
          ResourceRequest.a((byte) -90);
          if (guard < 125) {
            restartLevelText = (String) null;
          }
          MusicPatch.field_u = 0 - LegacyOpenGlRidgedWaterEffect.field_i;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ss.C(" + (unusedMixer != null ? "{...}" : "null") + ',' + guard + ',' + (archive != null ? "{...}" : "null") + ',' + durationMillis + ')');
        }
    }

    final static void sendQueuedIntArrayRequest(int opcode, int guard, QueuedIntArrayRequest request) {
        IsaacPacketBuffer var3 = null;
        try {
          var3 = InwardSparkParticle.outgoingPacket;
          if (guard != 1000) {
            restartLevelText = (String) null;
          }
          var3.writeCipherByte(opcode, 8);
          var3.writeByte((byte) 16, 2);
          var3.writeByte((byte) 89, 0);
          var3.writeByte((byte) 82, request.arrayId);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ss.A(" + opcode + ',' + guard + ',' + (request != null ? "{...}" : "null") + ')');
        }
    }

    static {
        restartLevelText = "Restart level";
    }
}
