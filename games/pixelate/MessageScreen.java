/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MessageScreen extends MenuScreen {
    static CredentialKind field_r;
    static SceneWidget field_s;
    static String field_u;
    static String field_t;
    static ScrollContainer field_p;
    static SceneWidget field_q;
    static String field_o;

    MessageScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        field_r = null;
        if (param0 == 2219) {
          field_u = null;
          field_p = null;
          field_o = null;
          field_s = null;
          field_q = null;
          return;
        }
        MessageScreen.releaseStatics(8);
        field_u = null;
        field_p = null;
        field_o = null;
        field_s = null;
        field_q = null;
    }

    final static void drawLobbyOverlays(int param0, boolean param1) {
        if (param0 != 19854) {
          PlatformTaskDispatcher var3 = (PlatformTaskDispatcher) null;
          MessageScreen.initialisePacketBuffers(false, -75, -15, true, 99, -28L, (String) null, -112, -64, true, 118, -87, 71, (PlatformTaskDispatcher) null);
          if (MarkerSlider.isOverlayOpen((byte) 127)) {
            param1 = false;
          }
          Js5ArchiveManager.drawFrontEndOverlays((byte) 29, param1);
          if (NineSliceFrameHelpers.field_b) {
            SoftwareRasterizer.darkenRectangle(HowToPlayDemoHelpers.field_b.field_g.field_D, HowToPlayDemoHelpers.field_b.field_g.field_S, HowToPlayDemoHelpers.field_b.field_g.field_K, HowToPlayDemoHelpers.field_b.field_g.height);
            HowToPlayDemoHelpers.field_b.field_g.drawFullScreen(param1, 0);
            CachedTextLayout.drawLobbyRoot(param1, (byte) 34);
            return;
          }
          CachedTextLayout.drawLobbyRoot(param1, (byte) 34);
          return;
        }
        if (MarkerSlider.isOverlayOpen((byte) 127)) {
          param1 = false;
        }
        Js5ArchiveManager.drawFrontEndOverlays((byte) 29, param1);
        if (!NineSliceFrameHelpers.field_b) {
          CachedTextLayout.drawLobbyRoot(param1, (byte) 34);
          return;
        }
        SoftwareRasterizer.darkenRectangle(HowToPlayDemoHelpers.field_b.field_g.field_D, HowToPlayDemoHelpers.field_b.field_g.field_S, HowToPlayDemoHelpers.field_b.field_g.field_K, HowToPlayDemoHelpers.field_b.field_g.height);
        HowToPlayDemoHelpers.field_b.field_g.drawFullScreen(param1, 0);
        CachedTextLayout.drawLobbyRoot(param1, (byte) 34);
    }

    final void drawRow(byte param0, boolean param1, int param2) {
        if (param0 >= -116) {
          MessageScreen.drawLobbyOverlays(116, true);
          if (param2 == 0) {
            this.drawMenuButton(param1, true);
            return;
          }
          return;
        }
        if (param2 != 0) {
          return;
        }
        this.drawMenuButton(param1, true);
    }

    final void onCancel(byte param0) {
        ScreenChangeHelpers.changeScreen(TickClock.field_a, TickClock.field_a, false, -25528);
        if (param0 > -13) {
          MessageScreen.releaseStatics(-78);
        }
    }

    final static void initialisePacketBuffers(boolean param0, int param1, int param2, boolean param3, int param4, long param5, String param6, int param7, int param8, boolean param9, int param10, int param11, int param12, PlatformTaskDispatcher param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          PlatformTaskDispatcher var16 = null;
          try {
            MusicCrossfadeStream.field_o = new CipherPacketBuffer(param8);
            ChatMessage.field_f = new CipherPacketBuffer(param2);
            ChallengePuzzleHelpers.field_a = param1;
            AchievementRecord.field_n = param7;
            OptionsScreen.field_p = param13;
            LobbyGameLookupHelpers.field_d = param9;
            AchievementRecord.field_t = param5;
            LobbyPlayer.field_Lb = param3;
            LoginMethodGlobals.field_b = param11;
            CipherPacketBuffer.field_q = param12;
            NineSliceSpriteFactory.field_c = param4;
            MatchController.field_B = param6;
            MainScreenWidgetGlobals.field_g = param10;
            if (param0) {
              var16 = (PlatformTaskDispatcher) null;
              MessageScreen.initialisePacketBuffers(false, 22, 99, false, -71, -71L, (String) null, 37, -83, false, -70, -34, 80, (PlatformTaskDispatcher) null);
            }
            if (null == OptionsScreen.field_p.field_e) {
              return;
            }
            try {
              MusicCrossfadeStream.field_p = new BufferedRandomAccessFile(OptionsScreen.field_p.field_e, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("l.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void animateLobbySlide(boolean param0) {
        if (MatchingTextValidator.field_o != ClientException.field_f.field_i) {
          SpriteBuildHelpers.field_i = SpriteBuildHelpers.field_i + (ClientException.field_f.field_i - MatchingTextValidator.field_o);
          MatchingTextValidator.field_o = ClientException.field_f.field_i;
          if (!(HuffmanCodec.field_b <= 0)) {
            HuffmanCodec.field_b = HuffmanCodec.field_b - 1;
          }
          if (param0) {
            if (!(HuffmanCodec.field_b <= 0)) {
              LobbySlideHelpers.layoutSlidingLobbyPanel(-96);
            }
            return;
          }
          return;
        }
        if (!(HuffmanCodec.field_b <= 0)) {
          HuffmanCodec.field_b = HuffmanCodec.field_b - 1;
        }
        if (param0) {
          if (!(HuffmanCodec.field_b <= 0)) {
            LobbySlideHelpers.layoutSlidingLobbyPanel(-96);
          }
          return;
        }
    }

    final void draw(int param0) {
        BinaryBitmapFont var2 = null;
        int var3 = 0;
        BinaryBitmapFont var2Lifetime1;
        int var3Lifetime1;
        this.drawDefaultBackdrop((byte) -65);
        this.drawRows((byte) -71);
        if (param0 == 11) {
          var2 = PrivateChatHelpers.field_e;
          var3 = 1 + (var2.maxAscent + var2.maxDescent);
          var2.drawParagraph(SingleChildContainer.field_F, 50, 160, 540, 200, 16777215, 0, 1, 1, var3);
          return;
        }
        this.drawRow((byte) 119, false, 7);
        var2Lifetime1 = PrivateChatHelpers.field_e;
        var3Lifetime1 = 1 + (var2Lifetime1.maxAscent + var2Lifetime1.maxDescent);
        var2Lifetime1.drawParagraph(SingleChildContainer.field_F, 50, 160, 540, 200, 16777215, 0, 1, 1, var3Lifetime1);
    }

    static {
        field_r = new CredentialKind(3);
        field_t = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_u = "Waiting for sound effects";
        field_o = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
