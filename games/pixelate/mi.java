/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends MenuScreen {
    static boolean field_o;

    final void onCancel(byte param0) {
        if (param0 >= -13) {
          mi.tickAchievementBanner(-14);
        }
    }

    final void draw(int param0) {
        this.drawRows((byte) -71);
        int var2 = EmailCredentials.field_k != 0 ? 1 : 0;
        int var3 = null != HighscoresScreen.field_p ? 1 : 0;
        String var7 = EmailValidator.field_p;
        if (param0 != 11) {
          mi.layoutLobbyPanels(false);
        }
        String var8 = var7 + " " + ub.replaceCharacter(AlphaContainer.a(PicturePreview.getUnsavedDataWarning(param0 - 99, false, var3 != 0, var2 != 0), param0 ^ 50, new String[]{ScoreMarkerDemo.field_i}), param0 - 11, "<br><br>", '#');
        BinaryBitmapFont var5 = qj.field_e;
        int var6 = 1 + var5.maxDescent + var5.maxAscent;
        var5.drawParagraph(var8, 50, 150, 540, 10 * var6, 16777215, 0, 1, 0, var6);
    }

    final static void tickAchievementBanner(int param0) {
        int var1;
        int var2;
        ph var3;
        var2 = Pixelate.field_H ? 1 : 0;
        if (0 == ki.field_f) {
          if (MatchController.field_q != -1) {
            MatchController.field_q = -1;
          }
          var3 = (ph) (AccountRegistrationPanel.field_Y.removeFirst(-28918));
          if (var3 != null) {
            MatchController.field_q = var3.field_k;
            ki.field_f = 300;
            MatchHud.field_a = qj.field_e.textWidth(GameApplet.field_n[MatchController.field_q]) + 56;
            ValidatedTextWidget.field_bb = 50 + MatchHud.field_a;
          }
        } else {
          ki.field_f = ki.field_f - 1;
          if (ki.field_f < 16) {
            var1 = 16 - ki.field_f;
            ValidatedTextWidget.field_bb = var1 * (var1 * (50 + MatchHud.field_a)) >> 8;
          } else {
            if (284 < ki.field_f) {
              var1 = ki.field_f - 284;
              ValidatedTextWidget.field_bb = var1 * (MatchHud.field_a + 50) * var1 >> 8;
            }
          }
        }
        if (param0 >= -121) {
          mi.pickRandomPictures(71, 124, 48, -115);
        }
    }

    final static IndexedSprite[] pickRandomPictures(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        IndexedSprite[] var4;
        int var5;
        boolean[] var6;
        IndexedSprite[] var7;
        int var9;
        int var10;
        IndexedSprite[] var11;
        var10 = Pixelate.field_H ? 1 : 0;
        var11 = FallingPieceView.field_c[param2][param0];
        var4 = var11;
        if (var4 == null) {
          return null;
        }
        var5 = var11.length;
        var6 = new boolean[var5];
        var7 = new IndexedSprite[param1];
        for (var8 = 0; var7.length > var8; var8++) {
          var9 = JavaRandomHelpers.a(UiTheme.field_f, param3 ^ -118, var5);
          while (var6[var9]) {
            var9++;
            if (var5 > var9) {
              continue;
            }
            var9 = 0;
          }
          var6[var9] = true;
          var7[var8] = var11[var9];
        }
        if (param3 != 20) {
          mi.layoutLobbyPanels(true);
        }
        return var7;
    }

    final static int fixedSine(int param0, int param1) {
        if (param0 != -4096) {
          mi.legacyMenuOptionAt(126, 19, (byte) -117);
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return param1 >= 6144 ? -NanoTickClock.field_i[-param1 + 8192] : -NanoTickClock.field_i[param1 - 4096];
        }
        return param1 < 2048 ? NanoTickClock.field_i[param1] : NanoTickClock.field_i[-param1 + 4096];
    }

    mi(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static int performLoginRequest(boolean param0, byte param1, String param2, int param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_30_0 = 0;
          boolean stackIn_40_0 = false;
          boolean stackIn_44_0 = false;
          boolean stackIn_47_0 = false;
          boolean stackIn_50_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_100_0 = 0;
          int stackIn_103_0 = 0;
          RuntimeException stackIn_106_0 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
          StringBuilder stackIn_109_1 = null;
          String stackIn_110_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Pixelate.field_H ? 1 : 0;
          try {
            if (null == NodeHashTableIterator.field_e &&
              !MouseInputHandler.pollGameSocketConnection(0, param4)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (ij.field_o == GameModeSelectScreen.field_s) {
              if (param4) {
                var10 = (String) null;
                li.field_g = FloatingSquare.createLoginCredentials(param2, (String) null, false, RisingBubble.field_b, 83);
              } else {
                li.field_g = NanoTickClock.createLoginCredentials(param2, false, -61, param5);
              }
              aa.field_f.position = 0;
              aa.field_f.writeByte(160, 14);
              aa.field_f.writeByte(160, li.field_g.getCredentialKind(-27096).field_a);
              SecondaryNodeHashTable.flushOutgoingPackets(-1, 10000);
              GameModeSelectScreen.field_s = cn.field_a;
            }
            if (GameModeSelectScreen.field_s == cn.field_a &&
              QueuedInput.fillIncomingBuffer(1, false)) {
              var6_int = MusicCrossfadeStream.field_o.readUnsignedByte(255);
              MusicCrossfadeStream.field_o.position = 0;
              if (var6_int != 0) {
                TextLayoutLine.field_e = var6_int;
                GameModeSelectScreen.field_s = IndexedSpriteState.field_b;
                BackgroundScene.field_b = -1;
              } else {
                GameModeSelectScreen.field_s = ke.field_b;
              }
            }
            if (GameModeSelectScreen.field_s == ke.field_b &&
              QueuedInput.fillIncomingBuffer(8, false)) {
              NumericDateInputWidget.field_P = MusicCrossfadeStream.field_o.readLong(false);
              MusicCrossfadeStream.field_o.position = 0;
              LoginMethod.writeLoginPacket(param4, -67, li.field_g, param3, param0);
              GameModeSelectScreen.field_s = BoardView.field_b;
            }
            boolean decompiledFrameRemainder0 = true;
            if (BoardView.field_b == GameModeSelectScreen.field_s &&
              QueuedInput.fillIncomingBuffer(1, false)) {
              var6_intLifetime1 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
              ConditionalTextValue.field_a = null;
              MusicCrossfadeStream.field_o.position = 0;
              TextLayoutLine.field_e = var6_intLifetime1;
              if (0 != var6_intLifetime1 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  GameModeSelectScreen.field_s = IndexedSpriteState.field_b;
                  BackgroundScene.field_b = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  na.a(true);
                  qj.field_b = false;
                  stackIn_30_0 = var6_intLifetime1;
                  return stackIn_30_0;
                }
              }
              if (decompiledFrameRemainder0) {
                BackgroundScene.field_b = -1;
                GameModeSelectScreen.field_s = e.field_d;
              }
            }
            if (e.field_d == GameModeSelectScreen.field_s &&
              MusicPatchNode.e(-18481)) {
              RisingBubble.field_b = MusicCrossfadeStream.field_o.readLong(false);
              GameResultsScreen.field_t = param2;
              wo.field_h = MusicCrossfadeStream.field_o.readUnsignedByte(255);
              Js5NetworkRequest.field_I = MusicCrossfadeStream.field_o.readUnsignedByte(255);
              BufferedRandomAccessFile.field_j = MusicCrossfadeStream.field_o.readUnsignedShort((byte) -116);
              var6 = MusicCrossfadeStream.field_o.readOptionalString((byte) 79);
              var7 = MusicCrossfadeStream.field_o.readUnsignedByte(255);
              if ((var7 & 1) != 0) {
                MarkerSlider.storeIncomingPacketBlock((byte) -51);
              }
              stackIn_40_0 = ((16 & var7) != 0);
              TextFieldValidator.field_l = stackIn_40_0;
              if (!param4) {
                stackIn_44_0 = (0 != (var7 & 2));
                IsaacRandom.field_g = stackIn_44_0;
                stackIn_47_0 = ((8 & var7) != 0);
                ln.field_q = stackIn_47_0;
                stackIn_50_0 = ((4 & var7) != 0);
                Matrix3.field_a = stackIn_50_0;
                if (ln.field_q) {
                  IsaacRandom.field_g = true;
                }
              }
              if (vm.field_d) {
                MusicCrossfadeStream.field_o.readUnsignedByte(255);
                MusicCrossfadeStream.field_o.readUnsignedByte(255);
                MusicCrossfadeStream.field_o.readInt(0);
                BufferedSocket.field_k = MusicCrossfadeStream.field_o.readUnsignedShort((byte) -115);
                dc.field_b = new byte[BufferedSocket.field_k];
                for (var8 = 0; BufferedSocket.field_k > var8; var8++) {
                  dc.field_b[var8] = MusicCrossfadeStream.field_o.readByte(0);
                }
              }
              ModalStack.field_J = MusicCrossfadeStream.field_o.readString(5);
              var11 = (CharSequence) ((Object) ModalStack.field_J);
              LobbyGame.field_Hb = dh.a(var11, (byte) 54);
              ra.field_g = MusicCrossfadeStream.field_o.readUnsignedByte(255);
              GameModeSelectScreen.field_s = Pixelate.field_G;
              if (li.field_g.getCredentialKind(-27096) == l.field_r) {
                ig.field_e.saveAsLastLoginMethod(AudioService.a(13867), -80419032);
              } else {
                if (li.field_g.getCredentialKind(-27096) == QuickChatMenu.field_Nb) {
                  vm.field_a.saveAsLastLoginMethod(AudioService.a(13867), -80419032);
                }
              }
              qj.field_b = false;
              if (var6 != null) {
                QueuedInput.writeSettingsCookie(var6, 126, AudioService.a(13867));
              }
              if (BufferedRandomAccessFile.field_j <= 0 &&
                !Matrix3.field_a) {
                try {
                  JavaScriptBridge.callWindowFunction("unzap", (byte) -56, AudioService.a(13867));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.a(AudioService.a(13867), (byte) -37, new Object[]{PacketBuffer.decodeBase37Name(RisingBubble.field_b, -7067)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (BufferedRandomAccessFile.field_j > 0) {
                LobbyPlayer.field_Lb = true;
              }
              aa.field_f.initCipher(0, ModalPanel.field_L);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                ModalPanel.field_L[var8Lifetime1] = ModalPanel.field_L[var8Lifetime1] + 50;
              }
              MusicCrossfadeStream.field_o.initCipher(0, ModalPanel.field_L);
              stackIn_79_0 = TextLayoutLine.field_e;
              return stackIn_79_0;
            }
            if (IndexedSpriteState.field_b == GameModeSelectScreen.field_s &&
              MusicPatchNode.e(-18481)) {
              na.a(true);
              if (TextLayoutLine.field_e == 7 &&
                !qj.field_b) {
                qj.field_b = true;
                stackIn_92_0 = -1;
                return stackIn_92_0;
              }
              if (TextLayoutLine.field_e == 7) {
                TextLayoutLine.field_e = 3;
              }
              gi.field_b = MusicCrossfadeStream.field_o.readString(5);
              qj.field_b = false;
              stackIn_90_0 = TextLayoutLine.field_e;
              return stackIn_90_0;
            }
            var6_intLifetime2 = 51 % ((-18 - param1) / 46);
            if (null == NodeHashTableIterator.field_e) {
              if (qj.field_b) {
                if (CachedTextLayout.millisSinceLastPacket(8) <= 30000L) {
                  gi.field_b = TextTableInitializer.field_b;
                } else {
                  gi.field_b = ValidationIndicator.field_N;
                }
                qj.field_b = false;
                stackIn_100_0 = 3;
                return stackIn_100_0;
              }
              var7 = gd.field_g;
              gd.field_g = cd.field_b;
              cd.field_b = var7;
              qj.field_b = true;
            }
            stackIn_103_0 = -1;
            return stackIn_103_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_106_0 = var6_ref;
            stackIn_106_1 = new StringBuilder().append("mi.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_110_2 = "null";
            } else {
              stackIn_110_2 = "{...}";
            }
            throw aa.addExceptionContext((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void showLoadingProgress(boolean param0, float param1, int param2, String param3) {
        try {
          if (cn.field_b == null) {
            cn.field_b = new LoadingProgressDialog(wa.field_c, wp.field_a);
            wa.field_c.showPanel(-6183, cn.field_b);
          }
          if (param2 != -1) {
            field_o = false;
          }
          cn.field_b.setProgress(param3, param1, 7595, param0);
          SoftwareRasterizer.clear();
          Js5NetworkRequest.drawAccountLayers(94, true);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "mi.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int legacyMenuOptionAt(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = 0;
          var4 = MenuScreen.field_h;
          if (param2 > -72) {
            field_o = true;
          }
          while (var3_int < vm.field_e.length) {
            var5 = fo.field_a[var3_int];
            if (var5 >= 0) {
              var6 = sb.a(3, vm.field_e[var3_int], true);
              var4 = var4 + LoadingProgressDialog.field_fb;
              var7 = -(var6 >> 1) + QuickChatCategory.field_u;
              if (TextLayoutLine.containsPoint(param0, var4, 9, ValidatedTextWidget.field_fb + (bd.field_c << 1), var7 - AccountTermsPanel.field_J, param1, (AccountTermsPanel.field_J << 1) + var6)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (ValidatedTextWidget.field_fb + LoadingProgressDialog.field_fb + (bd.field_c << 1));
            } else {
              var4 = var4 + GameResultsScreen.field_r;
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var3), "mi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void layoutLobbyPanels(boolean param0) {
        TextTableInitializer.field_g.setBounds(0, 18, 0, 256, -(!DialWidgetPainter.field_n ? 0 : 40 + DelegatingCanvas.field_b + 4) + StripedProgressBar.field_O.field_K);
        if (param0) {
          field_o = false;
        }
        l.field_s.setBounds(0, 18, -40 + (-DelegatingCanvas.field_b + (StripedProgressBar.field_O.field_K - 2)), 256, 42 + DelegatingCanvas.field_b);
        jm.field_b.setBoundsAndLayout(0, 2, (byte) 102, StripedProgressBar.field_O.field_K, 20, StripedProgressBar.field_O.height - 20, DelegatingCanvas.field_b);
    }

    static {
    }
}
