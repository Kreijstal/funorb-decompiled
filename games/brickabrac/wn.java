/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static String field_a;
    static RgbSprite desertNearSprite;
    static ResourceArchive field_c;

    final static SocialListEntry a(boolean param0, int param1, int param2) {
        ScrollPane stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        boolean stackIn_4_5;
        boolean stackIn_5_6 = false;
        SocialListEntry stackIn_12_0 = null;
        UiComponent stackIn_33_0 = null;
        String stackIn_34_1 = null;
        UiComponent stackIn_37_0 = null;
        String stackIn_38_1 = null;
        int stackIn_42_0 = 0;
        Object stackIn_101_0 = null;
        RuntimeException decompiledCaughtException = null;
        SocialListEntry stackOut_11_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        SocialListEntry var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ContextActionController var17 = null;
        String var18 = null;
        int var19 = 0;
        ContextActionController var17Lifetime1;
        String var18Lifetime1;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_4_0 = GameScreen.field_f.scrollPane;
          stackIn_4_1 = 2;
          stackIn_4_2 = param1 * (6 + 3 * np.uiRowHeight);
          stackIn_4_3 = np.uiRowHeight + 2;
          stackIn_4_4 = 22676;
          stackIn_4_5 = param0;
          stackIn_5_6 = (GameScreen.field_f.scrollPane == o.field_b);
          var3_int = ((ScrollPane) (Object) stackIn_4_0).updateContentLayout(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_5_6) ? 1 : 0;
          if (param2 > -12) {
            wn.a((byte) 96);
          }
          boolean decompiledFrameCompleted0 = true;
          var4 = GameScreen.field_f.content.children;
          var5 = null;
          if (LevelMetadata.field_m == 2) {
            QuickChatPhraseRegistry.field_c.enabled = true;
            sj.field_d.text = rd.a(LevelDecoder.field_c, new String[]{AlignedIconLabel.currentSocialServer}, (byte) 103);
            GameScreen.field_f.scrollPane.viewport.text = null;
            var6 = null;
            var7 = (SocialListEntry) (var4.first(-76));
            while (var7 != null) {
              var8 = 0;
              stackOut_11_0 = var7;
              stackIn_101_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_12_0.children == null) {
                var7.nameLabel = new UiComponent(0L, TextFieldWidget.field_K);
                var7.addChild(var7.nameLabel, 0);
                var7.serverLabel = new UiComponent(0L, OptionsScreen.field_v);
                var7.addChild(var7.serverLabel, 0);
                var7.renameIndicator = new UiComponent(0L, TextFieldWidget.field_K);
                var7.addChild(var7.renameIndicator, 0);
                var7.serverLabel.horizontalAlignment = 2;
                var8 = 1;
                var7.markDescendantsToInheritVisualState(true);
              }
              var7.width = GameScreen.field_f.content.width;
              var9 = 0;
              if (var7.serverName == null) {
                var10 = 13369344;
                var11 = 16737894;
              } else if (var7.serverName != AlignedIconLabel.currentSocialServer) {
                var10 = 13421568;
                var11 = 16777062;
              } else {
                var11 = 6750054;
                var10 = 52224;
              }
              var12 = 0;
              if (null != var7.previousName &&
                !var7.previousName.equals("")) {
                var7.renameIndicator.sprite = ok.field_g;
                var7.renameIndicator.activeTextColor = var11;
                var7.renameIndicator.setBounds(np.uiRowHeight, var9, 0, 3 + ok.field_g.canvasWidth, (byte) 64);
                var12 = 1;
              }
              var7.serverLabel.capturedTextColor = var11;
              var7.nameLabel.capturedTextColor = var11;
              var7.serverLabel.selectedTextColor = var11;
              var7.nameLabel.selectedTextColor = var11;
              var7.serverLabel.activeTextColor = var11;
              var7.nameLabel.activeTextColor = var11;
              var7.serverLabel.textColor = var10;
              var7.nameLabel.textColor = var10;
              var13 = 0;
              var14 = -80 + (var7.width - 2);
              if (var12 != 0) {
                var13 = 3 + ok.field_g.canvasWidth;
                var14 = var14 - var13;
              }
              stackIn_33_0 = var7.nameLabel;
              if (var14 > 0) {
                stackIn_34_1 = TextFont.truncateText(var7.nameLabel.font, var7.name, var14);
              } else {
                stackIn_34_1 = var7.name;
              }
              stackIn_33_0.text = stackIn_34_1;
              var7.nameLabel.setBounds(np.uiRowHeight, var9, var13, var14, (byte) 64);
              stackIn_37_0 = var7.serverLabel;
              if (var7.serverName != null) {
                stackIn_38_1 = var7.serverName;
              } else {
                stackIn_38_1 = DialogMessagePanel.field_S;
              }
              stackIn_37_0.text = stackIn_38_1;
              var7.serverLabel.setBounds(np.uiRowHeight, var9, -80 + var7.width, 80, (byte) 64);
              stackIn_42_0 = (var7.nameLabel.text.equals(var7.name)) ? 0 : 1;
              var15 = stackIn_42_0;
              var9 = var9 + np.uiRowHeight;
              if (var3_int == 0) {
                var7.remainingHeight = var9 - var7.height;
              }
              if (var8 != 0) {
                GameScreen.field_f.content.placeBelow((UiComponent) (var6), 2, var7, 17290);
              }
              var6 = var7;
              if (null != var7.renameIndicator &&
                var7.renameIndicator.activeInside) {
                WidgetTextLayout.field_e = var7.previousName;
              } else if (0 == var7.pressedButton) {
                if (var7.nameLabel.activeInside &&
                  var15 != 0) {
                  WidgetTextLayout.field_e = var7.name;
                }
              } else {
                var16 = var7.name;
                SpriteGeometry.a(-1, var7, GameScreen.field_f.scrollPane, (int[]) null, var16, -1, (byte) -58, 0L, (String) null);
                if (null != var7.serverName &&
                  !m.a(13134, bm.contextActions.targetName) &&
                  !TextWidgetRenderer.field_e) {
                  if (!PlayerNameChooserPanel.field_I) {
                    var17 = bm.contextActions;
                    var18 = rd.a(ClientException.field_c, new String[]{var16}, (byte) 103);
                    var17.contextMenu.addAction(var18, 8, (byte) 84);
                  }
                  var17Lifetime1 = bm.contextActions;
                  var18Lifetime1 = rd.a(qm.field_b, new String[]{var16}, (byte) 103);
                  var17Lifetime1.contextMenu.addAction(var18Lifetime1, 18, (byte) 97);
                }
                var5 = var7;
              }
              var7 = (SocialListEntry) (var4.next((byte) 116));
            }
            if (decompiledFrameCompleted0) {
              if (GameScreen.field_f.leftFooter.pressedButton != 0) {
                MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(GameScreen.field_f.leftFooter.screenX, GameScreen.field_f.leftFooter.screenY, GameScreen.field_f.leftFooter.width, GameScreen.field_f.leftFooter.height, ArchiveNetworkClient.field_t, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
                GameUiController.field_d = 0;
              }
              if (0 != GameScreen.field_f.rightFooter.pressedButton) {
                MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(GameScreen.field_f.rightFooter.screenX, GameScreen.field_f.rightFooter.screenY, GameScreen.field_f.rightFooter.width, GameScreen.field_f.rightFooter.height, TableDataRequest.field_j, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
                GameUiController.field_d = 1;
              }
            }
          } else {
            sj.field_d.text = kd.field_a;
            QuickChatPhraseRegistry.field_c.enabled = false;
            if (LevelMetadata.field_m == 1) {
              GameScreen.field_f.scrollPane.viewport.text = LoginCredentialKind.field_f;
              if (var19 != 0) {
                GameScreen.field_f.scrollPane.viewport.text = AlternateNumericLoginCredentials.field_t;
              }
            } else {
              GameScreen.field_f.scrollPane.viewport.text = AlternateNumericLoginCredentials.field_t;
            }
            jh.a(true, GameScreen.field_f.content);
          }
          if (decompiledFrameCompleted0) {
            stackIn_101_0 = var5;
          }
          return (SocialListEntry) (stackIn_101_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "wn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void snapshotKeyboardInput(byte obfuscationGuard) {
        int keyIndex = 0;
        int clientBranchFlag = 0;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        Object keyboardMonitor = null;
        RuntimeException var1_ref = null;
        int keyChange;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          keyboardMonitor = DualLinkDeque.keyboardInput;
          synchronized (keyboardMonitor) {
            if (obfuscationGuard != -97) {
              wn.a(-86, (byte) 78);
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            IntrusiveHashTable.keyEventReadIndex = fm.keyEventFrameEnd;
            PowerUp.keyboardIdleTicks = PowerUp.keyboardIdleTicks + 1;
            if (pl.keyChangeWriteIndex < 0) {
              keyIndex = 0;
              while (true) {
                if (112 > keyIndex) {
                  IntArrayRequest.heldKeys[keyIndex] = false;
                  keyIndex++;
                  if (clientBranchFlag == 0) {
                    continue;
                  }
                } else {
                  pl.keyChangeWriteIndex = FullscreenFailureDialog.keyChangeReadIndex;
                }
                break;
              }
              decompiledFrameRemainder0 = (clientBranchFlag != 0);
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                if (~pl.keyChangeWriteIndex == ~FullscreenFailureDialog.keyChangeReadIndex) {
                  break;
                }
                keyChange = lo.keyChangeQueue[FullscreenFailureDialog.keyChangeReadIndex];
                FullscreenFailureDialog.keyChangeReadIndex = FullscreenFailureDialog.keyChangeReadIndex + 1 & 127;
                stackIn_27_0 = keyChange;
                if (clientBranchFlag != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_27_0 < 0) {
                  IntArrayRequest.heldKeys[~keyChange] = false;
                } else {
                  IntArrayRequest.heldKeys[keyChange] = true;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_27_0 = ResourceRequest.keyEventWriteIndex;
            }
            fm.keyEventFrameEnd = stackIn_27_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "wn.E(" + obfuscationGuard + ')');
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          ContentTransitionLayer.field_jb = param1;
          if (param2 != 0) {
            wn.applyChatFilters(79, -114);
          }
          BufferedFile.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wn.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        try {
          desertNearSprite = null;
          int var1_int = 98 / ((param0 - 73) / 36);
          field_c = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wn.F(" + param0 + ')');
        }
    }

    final static BinaryMaskFont loadBinaryMaskFont(int groupId, ResourceArchive metricsArchive, ResourceArchive spriteArchive, int fileId, byte obfuscationGuard) {
        int unusedGuardQuotient = 0;
        RuntimeException failure = null;
        Object unavailableFont = null;
        BinaryMaskFont font = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String metricsArchiveSummary = null;
        StringBuilder spriteContextBuilder = null;
        String spriteArchiveSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (!ln.decodeSpritesFromArchive(-123, fileId, spriteArchive, groupId)) {
            unavailableFont = null;
            return (BinaryMaskFont) (unavailableFont);
          }
          unusedGuardQuotient = 126 / ((obfuscationGuard + 35) / 45);
          font = rm.createBinaryMaskFont(12658477, metricsArchive.takeFile(fileId, groupId, 4));
          return font;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wn.D(").append(groupId).append(',');
          if (metricsArchive == null) {
            metricsArchiveSummary = "null";
          } else {
            metricsArchiveSummary = "{...}";
          }
          spriteContextBuilder = ((StringBuilder) (Object) contextBuilder).append(metricsArchiveSummary).append(',');
          if (spriteArchive == null) {
            spriteArchiveSummary = "null";
          } else {
            spriteArchiveSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) spriteContextBuilder).append(spriteArchiveSummary).append(',').append(fileId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -6) {
            stackIn_7_0 = ((-param0 & param0) == param0);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "wn.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void applyChatFilters(int maximumGameFilter, int packedFilters) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          InstructionsScreen.lobbyChatFilter = packedFilters >> 4 & 3;
          InstructionsScreen.gameChatFilter = (packedFilters & 12) >> 2;
          if (InstructionsScreen.lobbyChatFilter > 2) {
            InstructionsScreen.lobbyChatFilter = 2;
          }
          if (InstructionsScreen.gameChatFilter > maximumGameFilter) {
            InstructionsScreen.gameChatFilter = 2;
          }
          WeightedLruCache.privateChatFilter = 3 & packedFilters;
          if (WeightedLruCache.privateChatFilter > 2) {
            WeightedLruCache.privateChatFilter = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "wn.H(" + maximumGameFilter + ',' + packedFilters + ')');
        }
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -98) {
            desertNearSprite = (RgbSprite) null;
          }
          stackIn_4_0 = (int)(1000000000L / ResourceRequest.tickDurationNanos);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "wn.A(" + param0 + ')');
        }
    }

    static {
    }
}
