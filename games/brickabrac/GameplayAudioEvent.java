/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GameplayAudioEvent extends IntrusiveNode {
    static RgbSprite[] field_l;
    static NodeDeque pendingTableRequests;
    static volatile boolean redrawRequested;
    static int mouseWheelDelta;
    int detailId;
    static ResourceArchive field_k;
    int eventCode;

    final static AccountResponse pollUsernameAvailability(String username, int obfuscationGuard) {
        RuntimeException var2 = null;
        AccountResponse stackIn_5_0 = null;
        AccountResponse stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MusicVoice.field_l == MusicEnvelope.field_f) {
            return null;
          }
          if (obfuscationGuard != 0) {
            stackIn_5_0 = (AccountResponse) null;
            return stackIn_5_0;
          }
          if (StatefulWidgetRenderer.field_v == MusicVoice.field_l &&
            username.equals(LobbyGame.field_pc)) {
            MusicVoice.field_l = StrongCacheEntry.field_P;
            stackIn_9_0 = AccountIntroductionPanel.field_H;
            return stackIn_9_0;
          }
          AccountIntroductionPanel.field_H = null;
          MusicVoice.field_l = MusicEnvelope.field_f;
          LobbyGame.field_pc = username;
          stackIn_11_0 = null;
          return (AccountResponse) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qc.B(");
          if (username == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        pendingTableRequests = null;
        if (obfuscationGuard != 0) {
          return;
        }
        field_l = null;
        field_k = null;
    }

    final static void closeArchiveConnections(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = BrickABrac.field_J ? 1 : 0;
          try {
            if (null != PacketReceiveHelpers.archiveFetchClient) {
              PacketReceiveHelpers.archiveFetchClient.closeTransport((byte) 30);
            }
            if (Brick.field_x != null) {
              Brick.field_x.shutdown((byte) 68);
            }
            if (param0 != 14676) {
              return;
            }
            if (Widget.field_k != null) {
              try {
                Widget.field_k.close(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != ClientException.field_g) {
              for (var1_int = 0; var1_int < ClientException.field_g.length; var1_int++) {
                if (null != ClientException.field_g[var1_int]) {
                  try {
                    ClientException.field_g[var1_int].close(false);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "qc.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void processUiLayerInput(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!ConditionalTextValue.hasVisibleLayer(param0 ^ 27146)) {
            if (null != GameplayRenderHelpers.fullscreenCanvas &&
              GameplayRenderHelpers.fullscreenCanvas.focusLossPending) {
              LevelPack.closeFullscreenCanvas(109);
              ParallaxMusicHelpers.field_b.pushLayer(-80, new FullscreenFailureDialog(ParallaxMusicHelpers.field_b, SocialListResponseHelpers.fullscreenFocusProblem));
            }
            return;
          }
          ParallaxMusicHelpers.field_b.processPointerInput(TextHuffmanHelpers.field_b, LobbyRenderGlobals.field_g, param0 - 27268, true);
          if (param0 != 27144) {
            return;
          }
          ParallaxMusicHelpers.field_b.updateLayers(82);
          while (LogoRenderHelpers.pollKeyEvent((byte) 5)) {
            ParallaxMusicHelpers.field_b.handleKeyInput(ResourceArchiveFactory.currentKeyCharacter, MeshAttributeRecord.currentKeyCode, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "qc.D(" + param0 + ')');
        }
    }

    GameplayAudioEvent(int eventCode) {
        this(eventCode, -1);
    }

    final static String decodeBase37Name(long value, byte obfuscationGuard) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = BrickABrac.field_J ? 1 : 0;
        if (0L >= value) {
          return null;
        }
        if (value >= 6582952005840035281L) {
          return null;
        }
        if (0L == value % 37L) {
          return null;
        }
        int var3 = 0;
        if (obfuscationGuard != 3) {
          GameplayAudioEvent.processUiLayerInput(21);
        }
        long var4 = value;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (value != 0L) {
          var7 = value;
          value = value / 37L;
          var9 = AchievementBrowserScreen.field_B[(int)(var7 - 37L * value)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    GameplayAudioEvent(int eventCode, int detailId) {
        this.detailId = detailId;
        this.eventCode = eventCode;
    }

    static {
        redrawRequested = true;
        pendingTableRequests = new NodeDeque();
    }
}
