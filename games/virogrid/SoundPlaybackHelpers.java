/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundPlaybackHelpers {
    static double[] field_d;
    static int field_c;
    static PlatformTask field_b;
    static String textEndgameResigned;
    static boolean field_e;

    final static void drawLobbyOverlays(byte param0, boolean param1) {
        if (0 >= ClientServiceHelpers.field_d) {
          if (param0 < 16) {
            field_b = (PlatformTask) null;
            if (0 >= PendingHighscoreRequest.field_h &&
              QuickChatPhraseDefinition.field_z <= 0) {
              return;
            }
            if (!QuickChatPhraseRegistry.field_h) {
              return;
            }
            Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
            MouseTrailPoint.field_n.drawRoot(param1, 24960);
            return;
          }
          if (0 < PendingHighscoreRequest.field_h) {
            if (!QuickChatPhraseRegistry.field_h) {
              return;
            }
            Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
            MouseTrailPoint.field_n.drawRoot(param1, 24960);
            return;
          }
          if (QuickChatPhraseDefinition.field_z <= 0) {
            return;
          }
          if (QuickChatPhraseRegistry.field_h) {
            Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
            MouseTrailPoint.field_n.drawRoot(param1, 24960);
          }
          return;
        }
        if (!ScrollPaneWithFooter.field_Gb) {
          if (param0 < 16) {
            field_b = (PlatformTask) null;
          }
          if (0 < PendingHighscoreRequest.field_h) {
            if (!QuickChatPhraseRegistry.field_h) {
              return;
            }
            Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
            MouseTrailPoint.field_n.drawRoot(param1, 24960);
            return;
          }
          if (QuickChatPhraseDefinition.field_z <= 0) {
            return;
          }
          if (QuickChatPhraseRegistry.field_h) {
            Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
            MouseTrailPoint.field_n.drawRoot(param1, 24960);
          }
          return;
        }
        Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
        WidgetStyleLayer.field_a.drawRoot(param1, 24960);
        if (param0 < 16) {
          field_b = (PlatformTask) null;
        }
        if (0 < PendingHighscoreRequest.field_h) {
          if (!QuickChatPhraseRegistry.field_h) {
            return;
          }
          Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
          MouseTrailPoint.field_n.drawRoot(param1, 24960);
        } else {
          if (QuickChatPhraseDefinition.field_z > 0) {
            if (QuickChatPhraseRegistry.field_h) {
              Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, ClientEnvironmentHelpers.field_c.field_J);
              MouseTrailPoint.field_n.drawRoot(param1, 24960);
            }
            return;
          }
        }
    }

    final static MusicPatch loadMusicPatch(Js5Archive param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        MusicPatch stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.getFlatFile(param2, 27034);
          var3 = var4;
          if (var4 == null) {
            stackIn_2_0 = null;
            return (MusicPatch) (stackIn_2_0);
          }
          if (param1 <= 41) {
            field_d = (double[]) null;
          }
          stackIn_6_0 = new MusicPatch(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("vm.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static PlayingSound playSoundEffect(byte param0, PcmSample param1) {
        RuntimeException var2 = null;
        PlayingSound stackIn_2_0 = null;
        PlayingSound stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 30) {
            stackIn_4_0 = QueuedListRequest.queueSoundPlayback(PcmSampleStream.createAtRatePercent(param1, 100, 96), param0 ^ 65);
            return stackIn_4_0;
          }
          stackIn_2_0 = (PlayingSound) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        textEndgameResigned = null;
        if (param0 >= -105) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        textEndgameResigned = "<%0> resigned";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static PlayingSound playSoundEffect(int param0, PcmSample param1) {
        RuntimeException var2 = null;
        PlayingSound stackIn_2_0 = null;
        PlayingSound stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 30) {
            stackIn_4_0 = QueuedListRequest.queueSoundPlayback(PcmSampleStream.createAtRatePercent(param1, 100, 96), param0 ^ 65);
            return stackIn_4_0;
          }
          stackIn_2_0 = (PlayingSound) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }
}
