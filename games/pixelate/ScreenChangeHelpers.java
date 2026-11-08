/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenChangeHelpers {
    static int[] field_a;
    static int field_b;
    static byte[] field_c;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 4) {
          field_c = (byte[]) null;
        }
    }

    final static void readGameOptionsPacket(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        AchievementRecord var12 = null;
        CipherPacketBuffer var13 = null;
        int[] var14 = null;
        AchievementMaskRequest var15 = null;
        Object var16 = null;
        AchievementMaskRequest var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var13 = MusicCrossfadeStream.field_o;
          if (param0 < 120) {
            field_a = (int[]) null;
          }
          var2 = var13.readUnsignedByte(255);
          if (var2 == 0) {
            var11 = PicturePreview.createEightInts(false);
            var17 = var11;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(255);
            for (var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((PacketBuffer) ((Object) var5)).readInt(0);
            }
            var15 = (AchievementMaskRequest) (StrongCacheReference.field_z.first(1504642273));
            if (var15 == null) {
              GameSocketHelpers.closeGameSocket(true);
              return;
            }
            var15.field_p = true;
            var15.field_s = var17[0];
            var15.field_l = var3;
            var15.unlink(2779);
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              CheckboxPainter.reportClientError(1, "A1: " + Cloud.describePacketHistory(-79), (Throwable) null);
              GameSocketHelpers.closeGameSocket(true);
            } else {
              var16_ref = (AchievementMaskRequest) (StrongCacheReference.field_z.first(1504642273));
              if (var16_ref == null) {
                GameSocketHelpers.closeGameSocket(true);
                return;
              }
              var16_ref.field_l = PicturePreview.createEightInts(false);
              var16_ref.field_p = true;
              var16_ref.field_s = var16_ref.field_l[0];
              var16_ref.unlink(2779);
            }
          } else {
            var12 = (AchievementRecord) (DisplayNameHelpers.field_a.first(1504642273));
            if (var12 == null) {
              GameSocketHelpers.closeGameSocket(true);
              return;
            }
            var12.unlink(2779);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "la.I(" + param0 + ')');
        }
    }

    final static String normalizeAccountName(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 != 10) {
            field_a = (int[]) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + var5 - 65);
            } else if ((var5 < 97 ||
              122 < var5) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("la.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean openUrlWithShell(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          try {
            if (!PlatformTaskDispatcher.field_p.startsWith("win")) {
              return false;
            }
            if (param1 != -31451) {
              field_c = (byte[]) null;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("la.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static SceneWidget getGameListContent(byte param0) {
        if (param0 > -84) {
          ScreenChangeHelpers.getLegacyMenuWidth((byte) -93);
        }
        return ReflectionCheckRequest.field_k.content;
    }

    final static void layoutLobbyGameRows(int param0, int param1, ScrollContainer param2, int param3, boolean param4) {
        int var27_int = 0;
        ScrollContainer stackIn_45_0 = null;
        boolean stackIn_45_1 = false;
        boolean stackIn_46_2 = false;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        SceneWidget stackIn_97_0;
        int stackIn_97_1;
        int stackIn_97_2;
        int stackIn_97_3;
        int stackIn_97_4;
        int stackIn_98_5 = 0;
        RuntimeException stackIn_223_0 = null;
        StringBuilder stackIn_223_1 = null;
        String stackIn_224_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        IntrusiveDeque var10 = null;
        int var11_int = 0;
        Object var11 = null;
        LobbyPlayer var12 = null;
        int var13 = 0;
        SceneWidget var14 = null;
        SceneWidget var15 = null;
        SceneWidget var16 = null;
        SceneWidget var17 = null;
        SceneWidget var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != LoginMethod.field_c && (null != Cloud.field_r ||
            null != StatefulTextPainter.field_z ||
            null != RequestResultFactory.field_a ||
            AchievementIconGlobals.field_e != null)) {
            for (var9 = 0; MouseInputGlobals.field_b > var9; var9++) {
              var10_int = LoginMethod.field_c.field_Eb[var9] & 255;
              if (Cloud.field_r != null &&
                Cloud.field_r[var9] != null &&
                Cloud.field_r[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != StatefulTextPainter.field_z &&
                null != StatefulTextPainter.field_z[var9]) {
                var11_int = StatefulTextPainter.field_z[var9][var10_int];
                if (0 != var11_int &&
                  !PendingFlagGlobals.field_a) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (AchievementIconGlobals.field_e != null &&
                AchievementIconGlobals.field_e[var9] != null) {
                var8 = var8 | AchievementIconGlobals.field_e[var9][var10_int];
              }
              if (RequestResultFactory.field_a != null &&
                RequestResultFactory.field_a[var9] != null) {
                var11_intLifetime1 = RequestResultFactory.field_a[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !PendingFlagGlobals.field_a) {
                  var5_int = 1;
                }
              }
            }
          }
          stackIn_45_0 = (ScrollContainer) (param2);
          stackIn_45_1 = param4;
          stackIn_46_2 = (ChallengePuzzleHelpers.field_d == param2);
          stackIn_49_0 = (!((ScrollContainer) (Object) stackIn_45_0).updateScrolling(stackIn_45_1, stackIn_46_2, 2, (RankingSummaryScreen.field_q * 4 + 8) * param3, 0, 2 * RankingSummaryScreen.field_q + 4)) ? 0 : 1;
          var9Lifetime1 = stackIn_49_0;
          var10 = param2.content.children;
          var11 = null;
          var12 = (LobbyPlayer) (var10.first(1504642273));
          while (var12 != null) {
            var13 = 0;
            if (var12.children == null) {
              var12.field_Hb = new SceneWidget(0L, SceneWidget.field_T);
              var12.addChild(var12.field_Hb, (byte) 26);
              var12.field_Gb = new SceneWidget(0L, TextDecodeHelpers.field_i);
              if (DialWidgetPainter.field_n) {
                var12.addChild(var12.field_Gb, (byte) 26);
              }
              var12.field_Gb.horizontalAlignment = 2;
              var12.field_Sb = new SceneWidget(0L, TextFieldValidator.field_h);
              var12.addChild(var12.field_Sb, (byte) 26);
              var12.markTreeDirty(-257);
              var12.field_Zb = new SceneWidget(0L, TimerBar.field_p);
              var12.addChild(var12.field_Zb, (byte) 26);
              var12.field_Mb = new SceneWidget(0L, RequestState.field_h);
              var12.addChild(var12.field_Mb, (byte) 26);
              var13 = 1;
            }
            var12.field_Hb.field_cb = null;
            var14 = var12.field_Hb;
            var12.field_Hb.height = 0;
            var14.field_K = 0;
            var12.field_Gb.field_cb = null;
            var15 = var12.field_Gb;
            var12.field_Gb.height = 0;
            var15.field_K = 0;
            var12.field_Zb.field_cb = null;
            var12.field_Zb.height = 0;
            var16 = var12.field_Zb;
            var12.field_Mb.field_cb = null;
            var16.field_K = 0;
            var12.field_Mb.height = 0;
            var17 = var12.field_Mb;
            var17.field_K = 0;
            var12.field_Sb.field_cb = null;
            var12.field_Sb.height = 0;
            var18 = var12.field_Sb;
            var18.field_K = 0;
            var12.field_K = param2.content.field_K;
            var19 = 0;
            var32 = var12.field_Fb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (Cloud.field_b == param2) {
              var21 += 42;
            }
            var33 = BitmapFont.truncateWithEllipsis(var12.field_Hb.font, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_61_0 = (var33.equals(var12.field_Fb)) ? 0 : 1;
            var22 = stackIn_61_0;
            if (4 <= var12.field_Qb) {
              var20 = "<img=" + (-4 + var12.field_Qb + BoardView.field_s) + ">" + var33;
            } else {
              if (var12.field_Qb > 0) {
                var20 = "<img=" + (var12.field_Qb - 1) + ">" + var33;
              }
            }
            var12.field_Hb.field_cb = var20;
            if (!var12.isUnlisted((byte) -114)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Xb ||
                (!(var6 <= var12.field_Rb) ||
                !(var12.field_Yb >= var7) ||
                !((~var12.field_Ib & var8) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_Zb.field_N = var23_int;
              var12.field_Gb.field_N = var23_int;
              var12.field_Hb.field_N = var23_int;
              var12.field_Hb.field_Cb = var24_int;
              var12.field_Hb.field_pb = var24_int;
              var12.field_Hb.field_y = var24_int;
              var12.field_Gb.field_Cb = var24_int;
              var12.field_Gb.field_pb = var24_int;
              var12.field_Gb.field_y = var24_int;
              var12.field_Zb.field_Cb = var24_int;
              var12.field_Zb.field_pb = var24_int;
              var12.field_Zb.field_y = var24_int;
              if (param2 == Vector3.field_c) {
                if (!LoginMethod.field_c.field_dc) {
                  var12.field_Mb.field_cb = MenuInputState.field_m;
                }
              } else {
                if (var12.field_Vb) {
                  var12.field_Hb.field_cb = AlphaContainer.formatTemplate(ByteStorage.field_e, 111, new String[]{var20});
                  var12.field_Mb.field_cb = IntrusiveNode.field_f;
                } else {
                  if (var12.field_Jb) {
                    var12.field_Hb.field_cb = AlphaContainer.formatTemplate(ModalPanel.field_O, 58, new String[]{var20});
                    var12.field_Zb.field_cb = DisplayNameForm.field_M;
                    var12.field_Mb.field_cb = QuickChatPhraseCache.field_e;
                  } else {
                    var12.field_Zb.field_cb = TutorialTickHelpers.field_b;
                  }
                }
              }
              var25_int = 0;
              if (LoginMethod.field_c != null &&
                AccountRegistrationPanel.isLocalPlayerGameHost(99) &&
                DebouncedValidator.field_f != var12.field_Nb) {
                if (null != var12.field_Zb.field_cb) {
                  var26 = var12.field_Zb.getContentWidth(0) + MouseWheelHandler.field_c * 2;
                  var12.field_Zb.setBounds(var19, RankingSummaryScreen.field_q, var25_int, 256, var26);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Mb.field_cb) {
                  if (param2 == Vector3.field_c) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Mb.getContentWidth(0) + 2 * MouseWheelHandler.field_c;
                  }
                  var12.field_Mb.setBounds(var19, RankingSummaryScreen.field_q, var25_int, 256, var26Lifetime2);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_97_0 = var12.field_Hb;
              stackIn_97_1 = var19;
              stackIn_97_2 = RankingSummaryScreen.field_q;
              stackIn_97_3 = var25_int;
              stackIn_97_4 = 256;
              if (!DialWidgetPainter.field_n) {
                stackIn_98_5 = 0;
              } else {
                stackIn_98_5 = 42;
              }
              ((SceneWidget) (Object) stackIn_97_0).setBounds(stackIn_97_1, stackIn_97_2, stackIn_97_3, stackIn_97_4, -stackIn_98_5 + var12.field_K - var25_int);
              var12.field_Gb.field_cb = Integer.toString(var12.field_Rb);
              var12.field_Gb.setBounds(var19, RankingSummaryScreen.field_q, var12.field_K - 40, 256, 40);
              if (var12.field_Hb.field_W &&
                var22 != 0) {
                PuzzleThumbnail.field_o = var12.field_Fb;
                if (HighscoreNameEntry.field_d != null &&
                  HighscoreNameEntry.field_d[var12.field_Qb] != null) {
                  PuzzleThumbnail.field_o = PuzzleThumbnail.field_o + " - " + HighscoreNameEntry.field_d[var12.field_Qb];
                }
              } else {
                if (var12.field_Hb.field_W &&
                  null != HighscoreNameEntry.field_d &&
                  HighscoreNameEntry.field_d[var12.field_Qb] != null) {
                  PuzzleThumbnail.field_o = HighscoreNameEntry.field_d[var12.field_Qb];
                }
              }
              var19 = var19 + RankingSummaryScreen.field_q;
            }
            var23 = LoginDialog.formatPlayerRemovalMessage(var12.field_Eb, var20, -17279);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Sb.font.wrappedLineCount(var23, -MouseWheelHandler.field_c + (var12.field_K - MouseWheelHandler.field_c));
              var12.field_Sb.field_cb = var23;
              var12.field_Sb.textOpacity = var12.field_Tb * 256 / QuickChatOpenHelpers.field_b;
              var12.field_Sb.setBounds(var19, RankingSummaryScreen.field_q * var24_intLifetime1, MouseWheelHandler.field_c, 256, var12.field_K - MouseWheelHandler.field_c * 2);
              var19 = var19 + var24_intLifetime1 * RankingSummaryScreen.field_q;
            }
            if (var9Lifetime1 == 0) {
              var12.pendingHeightDelta = -var12.height + var19;
            }
            if (var13 != 0) {
              param2.content.positionAfter(var12, 2, -1, (SceneWidget) (var11));
            }
            if (var12.field_P != 0 &&
              !var12.isUnlisted((byte) -89)) {
              if (var12.field_Zb.field_P == 0) {
                if (0 == var12.field_Mb.field_P) {
                  RegistrationHelpers.openPlayerContextMenu(BufferedRandomAccessFile.field_a, 0, FriendCaptionGlobals.field_c, (byte) -110, var12, 0, param2);
                } else {
                  PlayerActionHelpers.sendPlayerAction(7, param1, var12.field_Nb);
                }
              } else {
                StatusBar.sendNameRequest(var12.field_Nb, param1, -26231);
              }
            }
            var11 = var12;
            if (var12.field_R &&
              !var12.isUnlisted((byte) -110)) {
              var24Lifetime2 = null;
              if (~DebouncedValidator.field_f != ~var12.field_Nb) {
                if (var5_int != 0 &&
                  !var12.field_Xb) {
                  var24Lifetime2 = AlphaContainer.formatTemplate(HighscoreSubmission.field_w, 46, new String[]{var20});
                } else {
                  if (var7 <= var12.field_Yb) {
                    if (var6 <= var12.field_Rb) {
                      if ((var8 & ~var12.field_Ib) != 0) {
                        var25_int = Cp1252EncodingHelpers.highestOneBit((byte) -101, var8 & ~var12.field_Ib);
                        var24Lifetime2 = AlphaContainer.formatTemplate(MarkerSliderPainter.field_i, 27, new String[]{var20});
                        if (var25_int > 0 &&
                          null != RankingQuery.field_l &&
                          var25_int <= RankingQuery.field_l.length &&
                          RankingQuery.field_l[var25_int - 1] != null) {
                          var24Lifetime2 = AlphaContainer.formatTemplate(RankingQuery.field_l[var25_int - 1][2], 62, new String[]{var20});
                          var30Lifetime1 = var24Lifetime2;
                          var25 = var30Lifetime1;
                          var24Lifetime2 = var25;
                          var30Lifetime1Lifetime1 = var24Lifetime2;
                          var25 = var30Lifetime1Lifetime1;
                        }
                      }
                    } else {
                      var24Lifetime2 = AlphaContainer.formatTemplate(BackgroundScene.field_e, 40, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_Yb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = AlphaContainer.formatTemplate(Cloud.field_k, 22, new String[]{var20});
                    }
                    var24Lifetime2 = AlphaContainer.formatTemplate(UiTheme.field_l, 62, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Xb) {
                  var24Lifetime2 = JaggrabDownloader.field_g;
                } else {
                  if (var7 > var12.field_Yb) {
                    var25_int = -var12.field_Yb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = ReportAbuseDialog.field_Mb;
                    }
                    var24Lifetime2 = AlphaContainer.formatTemplate(JaggrabDownloader.field_f, 95, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var6 <= var12.field_Rb) {
                      if (0 != (var8 & ~var12.field_Ib)) {
                        var25_int = Cp1252EncodingHelpers.highestOneBit((byte) -100, var8 & ~var12.field_Ib);
                        var24Lifetime2 = ArchiveProvider.field_d;
                        if (var25_int > 0 &&
                          null != RankingQuery.field_l &&
                          RankingQuery.field_l.length >= var25_int &&
                          RankingQuery.field_l[var25_int - 1] != null) {
                          var24Lifetime2 = RankingQuery.field_l[-1 + var25_int][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = AlphaContainer.formatTemplate(TwistedLogicCube.field_m, 63, new String[]{null, Integer.toString(var6)});
                    }
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; MouseInputGlobals.field_b > var27_int; var27_int++) {
                  var28 = 255 & LoginMethod.field_c.field_Eb[var27_int];
                  var29 = 0;
                  if (Cloud.field_r != null &&
                    null != Cloud.field_r[var27_int] &&
                    Cloud.field_r[var27_int][var28] &&
                    !var12.field_Xb) {
                    var29 = 1;
                  }
                  if (StatefulTextPainter.field_z != null &&
                    null != StatefulTextPainter.field_z[var27_int]) {
                    var30_int = StatefulTextPainter.field_z[var27_int][var28];
                    if (var30_int != 0 &&
                      !PendingFlagGlobals.field_a &&
                      !var12.field_Xb) {
                      var29 = 1;
                    }
                    if (var12.field_Rb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (RequestResultFactory.field_a != null &&
                    null != RequestResultFactory.field_a[var27_int]) {
                    var30_intLifetime1 = RequestResultFactory.field_a[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !PendingFlagGlobals.field_a &&
                      !var12.field_Xb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Yb) {
                      var29 = 1;
                    }
                  }
                  if (AchievementIconGlobals.field_e != null &&
                    null != AchievementIconGlobals.field_e[var27_int] &&
                    0 != (AchievementIconGlobals.field_e[var27_int][var28] & ~var12.field_Ib)) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + MeshColourEntry.field_e[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                      var26Lifetime1 = 1;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (param2 == Vector3.field_c &&
                  AccountRegistrationPanel.isLocalPlayerGameHost(99)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + AlphaContainer.formatTemplate(BoardParticle.field_q, 96, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + WeightedLruCache.field_i + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + AlphaContainer.formatTemplate(PacketBuffer.field_l, 102, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + DirectByteStorage.field_i + (String) (var25);
                  }
                }
                if (param2 == Vector3.field_c &&
                  !AccountRegistrationPanel.isLocalPlayerGameHost(99)) {
                  var27 = LoginMethod.field_c.field_pc;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + AlphaContainer.formatTemplate(SpriteLoadHelpers.field_c, 93, new String[]{var27});
                }
                PuzzleThumbnail.field_o = (String) (var24Lifetime2);
              }
            }
            var12 = (LobbyPlayer) (var10.next(1504642273));
          }
          if (param0 < 19) {
            field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_223_0 = var5;
          stackIn_223_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_224_2 = "null";
          } else {
            stackIn_224_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_223_0), ((StringBuilder) (Object) stackIn_223_1).append(stackIn_224_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void changeScreen(int param0, int param1, boolean param2, int param3) {
        int var4;
        NameAvailabilityValidator.field_t = 0;
        TickClock.field_a = param0;
        MidiPcmStream.field_t = param1;
        if (MidiPcmStream.field_t == -4 ||
          MidiPcmStream.field_t == -2 ||
          MidiPcmStream.field_t == -5 ||
          MidiPcmStream.field_t == 0 ||
          MidiPcmStream.field_t == 12 ||
          MidiPcmStream.field_t == 17) {
          QuickChatSendHelpers.playMenuMusic(0, (byte) -91);
        }
        if (BoardParticle.isNonNegative((byte) -104, MidiPcmStream.field_t)) {
          var4 = 0;
          if (MidiPcmStream.field_t == 12) {
            var4 = -1;
          }
          SocialPanel.getScreen(-92, MidiPcmStream.field_t).enterScreen(2, var4, param2);
          if (MidiPcmStream.field_t == 12) {
            AccountRequestReply.startSlideshow(param2, (byte) 110);
          }
        }
        if (param3 != -25528) {
          field_c = (byte[]) null;
        }
    }

    final static int getLegacyMenuWidth(byte param0) {
        if (param0 != -59) {
          field_a = (int[]) null;
        }
        return GridSize.field_g - LoadingProgressDialog.field_cb;
    }

    final static byte[] decompressContainer(byte[] param0, int param1) {
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param0);
          var3 = var9.readUnsignedByte(param1 ^ 255);
          var4 = var9.readInt(0);
          if (var4 >= param1 && (PuzzleThumbnail.field_j == 0 ||
            !(PuzzleThumbnail.field_j < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.readBytes(var13, 0, -80, var4);
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5_int = var9.readInt(0);
            if (0 <= var5_int && (PuzzleThumbnail.field_j == 0 ||
              !(var5_int > PuzzleThumbnail.field_j))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (1 == var3) {
                Bzip2Decoder.decompress(var12, var5_int, param0, var4, 9);
              } else {
                var7 = ByteArrayPool.field_b;
                synchronized (var7) {
                  ByteArrayPool.field_b.decompress(param1 ^ -8, var12, var9);
                }
              }
              stackIn_19_0 = var6;
              return stackIn_19_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("la.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new int[]{10, 20, 32, 50};
        field_c = new byte[]{(byte) 1, (byte) 1};
    }
}
