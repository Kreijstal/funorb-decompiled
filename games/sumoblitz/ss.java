/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss {
    static String restartLevelText;

    public static void releaseStatics(byte param0) {
        restartLevelText = null;
        if (param0 <= 69) {
          restartLevelText = (String) null;
        }
    }

    final static void a(PcmStreamMixer param0, byte param1, ResourceArchive param2, int param3) {
        try {
          LegacyOpenGlRidgedWaterEffect.field_i = vm.a(-32) * param3 / 1000;
          MenuScreen.initializeLogoAudio(param2, 100);
          wq.a(false, param2);
          lq.a(param2, -84);
          qt.b(true);
          ResourceRequest.a((byte) -90);
          if (param1 < 125) {
            restartLevelText = (String) null;
          }
          MusicPatch.field_u = 0 - LegacyOpenGlRidgedWaterEffect.field_i;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ss.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, qv param2) {
        IsaacPacketBuffer var3 = null;
        try {
          var3 = InwardSparkParticle.field_v;
          if (param1 != 1000) {
            restartLevelText = (String) null;
          }
          var3.writeCipherByte(param0, 8);
          var3.writeByte((byte) 16, 2);
          var3.writeByte((byte) 89, 0);
          var3.writeByte((byte) 82, param2.field_n);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ss.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        restartLevelText = "Restart level";
    }
}
