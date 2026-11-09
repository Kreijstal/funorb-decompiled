/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlRenderBufferSet extends RenderBufferSet {
    static TextureCombineOperation REPLACE;
    static TextureCoordinateGeneration DISABLED;
    static String[] monthNames;

    final static void setSoundVolume(int volume, byte guard) {
        PlayingSound var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        PlayingSound var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          RasterColorTables.soundVolume = volume;
          if (guard != -58) {
            return;
          }
          var2 = (PlayingSound) (ContentTransitionPhase.field_c.first(81));
          while (var2 != null) {
            if (!var2.lifetimeNode.isLinked(false)) {
              var2.unlink(false);
            } else {
              var2.stream.setVolume(128 + var2.originalVolume * RasterColorTables.soundVolume >> 8);
            }
            var2 = (PlayingSound) (ContentTransitionPhase.field_c.next((byte) 18));
          }
          if (null != TextHotspot.field_u) {
            var2Lifetime1 = (PlayingSound) (TextHotspot.field_u.first(guard ^ -123));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.lifetimeNode.isLinked(false);
              if (stackIn_14_0) {
                var2Lifetime1.stream.setVolume(128 + RasterColorTables.soundVolume * var2Lifetime1.originalVolume >> 8);
              } else {
                var2Lifetime1.unlink(false);
              }
              var2Lifetime1 = (PlayingSound) (TextHotspot.field_u.next((byte) 18));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "lf.E(" + volume + ',' + guard + ')');
        }
    }

    final static void stopLoopingSamples(byte guard) {
        int var2 = 0;
        PcmSampleStream[] var1 = null;
        PcmSampleStream var3 = null;
        int var4 = 0;
        PcmSampleStream[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = ImageProducerRasterBuffer.field_n;
          var1 = var5;
          for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            GpuDataType.removeSoundStream(109, var3);
          }
          if (guard > -113) {
            LegacyOpenGlRenderBufferSet.setMusicVolume(-101, 66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "lf.C(" + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 1821625704) {
          LegacyOpenGlRenderBufferSet.isIntroFinished(-118);
        }
        REPLACE = null;
        DISABLED = null;
        monthNames = null;
    }

    LegacyOpenGlRenderBufferSet(LegacyOpenGlGraphicsToolkit toolkit) {
        LegacyVertexAttribute discarded$0 = null;
        LegacyVertexAttribute discarded$1 = null;
        LegacyVertexAttribute discarded$2 = null;
        LegacyVertexAttribute discarded$3 = null;
        AppletInstanceState discarded$4 = null;
        try {
          discarded$0 = new LegacyVertexAttribute((LegacyVertexBuffer) null, 5126, 3, 0);
          discarded$1 = new LegacyVertexAttribute((LegacyVertexBuffer) null, 5126, 2, 0);
          discarded$2 = new LegacyVertexAttribute((LegacyVertexBuffer) null, 5126, 3, 0);
          discarded$3 = new LegacyVertexAttribute((LegacyVertexBuffer) null, 5121, 4, 0);
          discarded$4 = new AppletInstanceState();
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lf.<init>(" + (toolkit != null ? "{...}" : "null") + ')');
        }
    }

    final static void setMusicVolume(int guard, int volume) {
        TextureGeneratorNode.musicVolume = volume;
        if (null != DroneIntroductionOverlay.field_e) {
          DroneIntroductionOverlay.field_e.setMasterVolume(volume, true);
        }
        if (guard != 0) {
          return;
        }
        if (AccountConnectionPhase.field_b != null) {
          AccountConnectionPhase.field_b.setVolume((byte) -43, volume);
        }
    }

    final static boolean isIntroFinished(int guard) {
        if (guard != -251) {
          LegacyOpenGlRenderBufferSet.setSoundVolume(98, (byte) -77);
        }
        return MusicPatch.introFrame > 250 ? true : false;
    }

    static {
        REPLACE = new TextureCombineOperation();
        monthNames = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        DISABLED = new TextureCoordinateGeneration();
    }
}
