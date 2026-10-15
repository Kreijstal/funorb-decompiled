/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ButtonWidgetRenderer extends TextWidgetRenderer {
    private int normalTint;
    static NodeDeque rasterStack;
    static int[] textChoiceResultCodes;
    private int hoverTint;
    private int disabledTint;
    static IsaacGenerator field_w;
    private RgbSprite[] buttonSprites;

    final static boolean a(boolean param0, int param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        boolean stackIn_41_0 = false;
        boolean stackIn_103_0 = false;
        boolean stackIn_160_0 = false;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        Object var22;
        Object var23;
        CharSequence var24;
        CharSequence var25;
        CharSequence var26;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var5Lifetime4;
        int var5Lifetime1Lifetime1;
        String var4_ref_StringLifetime1;
        String var4_ref_StringLifetime2;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        String var7Lifetime7;
        String var7Lifetime8;
        String var7Lifetime9;
        String var8Lifetime1;
        String var8Lifetime2;
        String var12Lifetime1;
        String var12Lifetime2;
        String var13Lifetime1;
        String var13Lifetime2;
        String var14Lifetime1;
        String var14Lifetime2;
        String var15Lifetime1;
        String var15Lifetime2;
        String var17Lifetime1;
        String var17Lifetime2;
        String var18Lifetime1;
        String var18Lifetime2;
        String var19Lifetime1;
        String var19Lifetime2;
        String var20Lifetime1;
        String var20Lifetime2;
        String var7Lifetime10;
        String var7Lifetime11;
        String var7Lifetime12;
        String var7Lifetime13;
        String var7Lifetime14;
        String var7Lifetime15;
        String var7Lifetime1Lifetime1;
        String var7Lifetime1Lifetime2;
        String var7Lifetime1Lifetime3;
        String var7Lifetime1Lifetime4;
        String var7Lifetime1Lifetime5;
        String var7Lifetime1Lifetime6;
        String var7Lifetime2Lifetime1;
        String var20Lifetime2Lifetime1;
        String var20Lifetime2Lifetime2;
        String var20Lifetime2Lifetime3;
        String var20Lifetime2Lifetime4;
        var21 = null;
        var22 = null;
        var23 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        var3 = 1;
        if (!nd.chatPinnedToBottom &&
          null == SoundCache.field_k) {
          var3 = 0;
        }
        if (param0) {
          rasterStack = (NodeDeque) null;
          if (ScreenNavigationHelpers.quickChatChannel == 0 &&
            null != nl.pendingLobbyGame) {
            var3 = 0;
          }
          if (ScreenNavigationHelpers.quickChatChannel == 2 &&
            !FileCacheStore.b(-21835160)) {
            var3 = 0;
          }
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (var3 == 0) {
              if (ScreenNavigationHelpers.quickChatChannel != 0) {
                UsernameAvailabilityValidator.b(!param0);
              }
            } else {
              if (OptionsScreen.field_A.length() > 0) {
                var4_ref_String = OptionsScreen.field_A.toString();
                if (ScrollPane.a(var4_ref_String, (byte) -128)) {
                  var13 = (String) null;
                  var12 = (String) null;
                  SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, DiagnosticTextLine.field_j, (String) null, 2);
                  var15 = (String) null;
                  var14 = (String) null;
                  SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, ScreenshotViewer.field_m, (String) null, 2);
                } else {
                  var5 = ScreenNavigationHelpers.quickChatChannel;
                  if (var5 == 0 &&
                    null != ClientResourceHelpers.currentLobbyGame) {
                    var5 = 1;
                  }
                  if (tm.getChatFilter(var5, (byte) 18) == 2) {
                    DirectByteStorage.updateChatFilter(0, param2, 1, var5);
                  }
                  GrowableIntList.writeChatMessage(-1, DualLinkNode.quickChatRecipient, (byte) -106, ScreenNavigationHelpers.quickChatChannel, param1, var4_ref_String);
                }
              }
              UsernameAvailabilityValidator.b(true);
            }
            return true;
          }
          if (85 == MeshAttributeRecord.currentKeyCode) {
            if (var3 != 0 &&
              OptionsScreen.field_A.length() > 0) {
              MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          var4 = ResourceArchiveFactory.currentKeyCharacter;
          stackIn_41_0 = !param0;
          if (!RasterSnapshot.a(stackIn_41_0, (char) var4)) {
            return false;
          }
          if (var3 == 0) {
            return true;
          }
          if (OptionsScreen.field_A.length() >= 80) {
            return true;
          }
          discarded$2 = OptionsScreen.field_A.append((char) var4);
          var5Lifetime4 = 485;
          var17 = LoadingProgressDialog.field_cb;
          var7 = var17;
          var7Lifetime10 = var17;
          var16 = TextFieldRenderer.a((byte) 104, var17);
          var7Lifetime11 = var16;
          var7Lifetime12 = var16;
          var19 = var16;
          var7Lifetime13 = var19;
          var7Lifetime14 = var19;
          if (ScreenNavigationHelpers.quickChatChannel != 2) {
            var7Lifetime15 = "";
            if (ScreenNavigationHelpers.quickChatChannel == 0) {
              if (ClientResourceHelpers.currentLobbyGame == null &&
                QuickChatParameterType.field_d) {
                var7Lifetime15 = "[" + ArcticBackground.field_u + "] ";
              }
              if (null != ClientResourceHelpers.currentLobbyGame) {
                if (PowerUp.field_v &&
                  null != jd.field_b) {
                  var7Lifetime15 = "[" + jd.field_b + "] ";
                } else {
                  var7Lifetime15 = "[" + GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{ClientResourceHelpers.currentLobbyGame.displayName}, (byte) 103) + "] ";
                }
              }
            }
            var20 = var7Lifetime15 + var19 + ": ";
            var5Lifetime4 = var5Lifetime4 - CachedArchiveSource.chatFont.measureText(var20);
          } else {
            var24 = (CharSequence) ((Object) DualLinkNode.quickChatRecipient);
            var18 = GamePresentationHelpers.formatIndexedText(SaveResultsPromptScreen.field_x, new String[]{ap.a(true, var24)}, (byte) 103);
            var7Lifetime15 = var18;
            var7Lifetime15 = var18;
            var8 = GamePresentationHelpers.formatIndexedText(FullscreenFailureDialog.field_fb, new String[]{var16}, (byte) 103);
            var7Lifetime15 = var8;
            var7Lifetime15 = var8;
            var9 = CachedArchiveSource.chatFont.measureText(var18);
            var10 = CachedArchiveSource.chatFont.measureText(var8);
            if (var9 > var10) {
              var5Lifetime4 = var5Lifetime4 - var9;
            } else {
              var5Lifetime4 = var5Lifetime4 - var10;
            }
          }
          if (var5Lifetime4 >= CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
            return true;
          }
          MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
          return true;
        }
        if (ScreenNavigationHelpers.quickChatChannel == 0) {
          if (null == nl.pendingLobbyGame) {
            if (ScreenNavigationHelpers.quickChatChannel == 2 &&
              !FileCacheStore.b(-21835160)) {
              var3 = 0;
            }
            if (MeshAttributeRecord.currentKeyCode == 84) {
              if (var3 == 0) {
                if (ScreenNavigationHelpers.quickChatChannel != 0) {
                  UsernameAvailabilityValidator.b(!param0);
                }
              } else {
                if (OptionsScreen.field_A.length() > 0) {
                  var4_ref_StringLifetime1 = OptionsScreen.field_A.toString();
                  if (ScrollPane.a(var4_ref_StringLifetime1, (byte) -128)) {
                    var13Lifetime1 = (String) null;
                    var12Lifetime1 = (String) null;
                    SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, DiagnosticTextLine.field_j, (String) null, 2);
                    var15Lifetime1 = (String) null;
                    var14Lifetime1 = (String) null;
                    SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, ScreenshotViewer.field_m, (String) null, 2);
                    UsernameAvailabilityValidator.b(true);
                  } else {
                    var5Lifetime1 = ScreenNavigationHelpers.quickChatChannel;
                    if (var5Lifetime1 == 0 &&
                      null != ClientResourceHelpers.currentLobbyGame) {
                      var5Lifetime1 = 1;
                    }
                    if (tm.getChatFilter(var5Lifetime1, (byte) 18) == 2) {
                      DirectByteStorage.updateChatFilter(0, param2, 1, var5Lifetime1);
                    }
                    GrowableIntList.writeChatMessage(-1, DualLinkNode.quickChatRecipient, (byte) -106, ScreenNavigationHelpers.quickChatChannel, param1, var4_ref_StringLifetime1);
                    UsernameAvailabilityValidator.b(true);
                  }
                } else {
                  UsernameAvailabilityValidator.b(true);
                }
              }
              return true;
            }
            if (85 == MeshAttributeRecord.currentKeyCode) {
              if (var3 != 0 &&
                OptionsScreen.field_A.length() > 0) {
                MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
              }
              return true;
            }
            var4Lifetime1 = ResourceArchiveFactory.currentKeyCharacter;
            stackIn_103_0 = !param0;
            if (!RasterSnapshot.a(stackIn_103_0, (char) var4Lifetime1)) {
              return false;
            }
            if (var3 != 0 &&
              OptionsScreen.field_A.length() < 80) {
              discarded$0 = OptionsScreen.field_A.append((char) var4Lifetime1);
              var5Lifetime1Lifetime1 = 485;
              var17Lifetime1 = LoadingProgressDialog.field_cb;
              var7Lifetime1 = var17Lifetime1;
              var7Lifetime1Lifetime1 = var17Lifetime1;
              var16 = TextFieldRenderer.a((byte) 104, var17Lifetime1);
              var7Lifetime1Lifetime2 = var16;
              var7Lifetime1Lifetime3 = var16;
              var19Lifetime1 = var16;
              var7Lifetime1Lifetime4 = var19Lifetime1;
              var7Lifetime1Lifetime5 = var19Lifetime1;
              if (ScreenNavigationHelpers.quickChatChannel != 2) {
                var7Lifetime1Lifetime6 = "";
                if (ScreenNavigationHelpers.quickChatChannel == 0) {
                  if (ClientResourceHelpers.currentLobbyGame == null &&
                    QuickChatParameterType.field_d) {
                    var7Lifetime1Lifetime6 = "[" + ArcticBackground.field_u + "] ";
                  }
                  if (null != ClientResourceHelpers.currentLobbyGame) {
                    if (PowerUp.field_v &&
                      null != jd.field_b) {
                      var7Lifetime1Lifetime6 = "[" + jd.field_b + "] ";
                    } else {
                      var7Lifetime1Lifetime6 = "[" + GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{ClientResourceHelpers.currentLobbyGame.displayName}, (byte) 103) + "] ";
                    }
                  }
                }
                var20Lifetime1 = var7Lifetime1Lifetime6 + var19Lifetime1 + ": ";
                var7Lifetime1Lifetime6 = var20Lifetime1;
                var7Lifetime1Lifetime6 = var20Lifetime1;
                var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - CachedArchiveSource.chatFont.measureText(var20Lifetime1);
              } else {
                var25 = (CharSequence) ((Object) DualLinkNode.quickChatRecipient);
                var18Lifetime1 = GamePresentationHelpers.formatIndexedText(SaveResultsPromptScreen.field_x, new String[]{ap.a(true, var25)}, (byte) 103);
                var7Lifetime1Lifetime6 = var18Lifetime1;
                var7Lifetime1Lifetime6 = var18Lifetime1;
                var8Lifetime1 = GamePresentationHelpers.formatIndexedText(FullscreenFailureDialog.field_fb, new String[]{var16}, (byte) 103);
                var7Lifetime1Lifetime6 = var8Lifetime1;
                var7Lifetime1Lifetime6 = var8Lifetime1;
                var9Lifetime1 = CachedArchiveSource.chatFont.measureText(var18Lifetime1);
                var10Lifetime1 = CachedArchiveSource.chatFont.measureText(var8Lifetime1);
                if (var9Lifetime1 > var10Lifetime1) {
                  var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - var9Lifetime1;
                } else {
                  var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - var10Lifetime1;
                }
              }
              if (var5Lifetime1Lifetime1 < CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
                MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
              }
            }
            return true;
          }
          var3 = 0;
        }
        if (ScreenNavigationHelpers.quickChatChannel == 2 &&
          !FileCacheStore.b(-21835160)) {
          var3 = 0;
        }
        if (MeshAttributeRecord.currentKeyCode == 84) {
          if (var3 == 0) {
            if (ScreenNavigationHelpers.quickChatChannel != 0) {
              UsernameAvailabilityValidator.b(!param0);
            }
          } else {
            if (OptionsScreen.field_A.length() > 0) {
              var4_ref_StringLifetime2 = OptionsScreen.field_A.toString();
              var7Lifetime2 = var4_ref_StringLifetime2;
              var7Lifetime2Lifetime1 = var4_ref_StringLifetime2;
              if (ScrollPane.a(var4_ref_StringLifetime2, (byte) -128)) {
                var13Lifetime2 = (String) null;
                var12Lifetime2 = (String) null;
                SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, DiagnosticTextLine.field_j, (String) null, 2);
                var15Lifetime2 = (String) null;
                var14Lifetime2 = (String) null;
                SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, ScreenshotViewer.field_m, (String) null, 2);
              } else {
                var5Lifetime2 = ScreenNavigationHelpers.quickChatChannel;
                if (var5Lifetime2 == 0 &&
                  null != ClientResourceHelpers.currentLobbyGame) {
                  var5Lifetime2 = 1;
                }
                if (tm.getChatFilter(var5Lifetime2, (byte) 18) == 2) {
                  DirectByteStorage.updateChatFilter(0, param2, 1, var5Lifetime2);
                }
                GrowableIntList.writeChatMessage(-1, DualLinkNode.quickChatRecipient, (byte) -106, ScreenNavigationHelpers.quickChatChannel, param1, var4_ref_StringLifetime2);
              }
            }
            UsernameAvailabilityValidator.b(true);
          }
          return true;
        }
        if (85 == MeshAttributeRecord.currentKeyCode) {
          if (var3 == 0) {
            return true;
          }
          if (OptionsScreen.field_A.length() <= 0) {
            return true;
          }
          MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
          return true;
        }
        var4Lifetime2 = ResourceArchiveFactory.currentKeyCharacter;
        stackIn_160_0 = !param0;
        if (!RasterSnapshot.a(stackIn_160_0, (char) var4Lifetime2)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (OptionsScreen.field_A.length() >= 80) {
          return true;
        }
        discarded$1 = OptionsScreen.field_A.append((char) var4Lifetime2);
        var5Lifetime3 = 485;
        var17Lifetime2 = LoadingProgressDialog.field_cb;
        var7Lifetime3 = var17Lifetime2;
        var7Lifetime4 = var17Lifetime2;
        var16 = TextFieldRenderer.a((byte) 104, var17Lifetime2);
        var7Lifetime5 = var16;
        var7Lifetime6 = var16;
        var19Lifetime2 = var16;
        var7Lifetime7 = var19Lifetime2;
        var7Lifetime8 = var19Lifetime2;
        if (ScreenNavigationHelpers.quickChatChannel != 2) {
          var7Lifetime9 = "";
          if (ScreenNavigationHelpers.quickChatChannel != 0) {
            var20Lifetime2 = var7Lifetime9 + var19Lifetime2 + ": ";
            var7Lifetime9 = var20Lifetime2;
            var7Lifetime9 = var20Lifetime2;
            var5Lifetime3 = var5Lifetime3 - CachedArchiveSource.chatFont.measureText(var20Lifetime2);
            if (var5Lifetime3 < CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          if (ClientResourceHelpers.currentLobbyGame == null &&
            QuickChatParameterType.field_d) {
            var7Lifetime9 = "[" + ArcticBackground.field_u + "] ";
          }
          if (null == ClientResourceHelpers.currentLobbyGame) {
            var20Lifetime2Lifetime1 = var7Lifetime9 + var19Lifetime2 + ": ";
            var5Lifetime3 = var5Lifetime3 - CachedArchiveSource.chatFont.measureText(var20Lifetime2Lifetime1);
            if (var5Lifetime3 < CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          if (!PowerUp.field_v) {
            var7Lifetime9 = "[" + GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{ClientResourceHelpers.currentLobbyGame.displayName}, (byte) 103) + "] ";
            var20Lifetime2Lifetime2 = var7Lifetime9 + var19Lifetime2 + ": ";
            var5Lifetime3 = var5Lifetime3 - CachedArchiveSource.chatFont.measureText(var20Lifetime2Lifetime2);
            if (var5Lifetime3 < CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          if (null == jd.field_b) {
            var7Lifetime9 = "[" + GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{ClientResourceHelpers.currentLobbyGame.displayName}, (byte) 103) + "] ";
            var20Lifetime2Lifetime3 = var7Lifetime9 + var19Lifetime2 + ": ";
            var5Lifetime3 = var5Lifetime3 - CachedArchiveSource.chatFont.measureText(var20Lifetime2Lifetime3);
            if (var5Lifetime3 < CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          var7Lifetime9 = "[" + jd.field_b + "] ";
          var20Lifetime2Lifetime4 = var7Lifetime9 + var19Lifetime2 + ": ";
          var5Lifetime3 = var5Lifetime3 - CachedArchiveSource.chatFont.measureText(var20Lifetime2Lifetime4);
        } else {
          var26 = (CharSequence) ((Object) DualLinkNode.quickChatRecipient);
          var18Lifetime2 = GamePresentationHelpers.formatIndexedText(SaveResultsPromptScreen.field_x, new String[]{ap.a(true, var26)}, (byte) 103);
          var7Lifetime9 = var18Lifetime2;
          var7Lifetime9 = var18Lifetime2;
          var8Lifetime2 = GamePresentationHelpers.formatIndexedText(FullscreenFailureDialog.field_fb, new String[]{var16}, (byte) 103);
          var7Lifetime9 = var8Lifetime2;
          var7Lifetime9 = var8Lifetime2;
          var9Lifetime2 = CachedArchiveSource.chatFont.measureText(var18Lifetime2);
          var10Lifetime2 = CachedArchiveSource.chatFont.measureText(var8Lifetime2);
          if (var9Lifetime2 > var10Lifetime2) {
            var5Lifetime3 = var5Lifetime3 - var9Lifetime2;
          } else {
            var5Lifetime3 = var5Lifetime3 - var10Lifetime2;
          }
        }
        if (var5Lifetime3 >= CachedArchiveSource.chatFont.measureText(OptionsScreen.field_A.toString())) {
          return true;
        }
        MessageScreen.resizeAndFillTextBuffer(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
        return true;
    }

    public final void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!widget.mouseOver) {
            stackIn_6_0 = (widget.isFocused(-71)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (widget instanceof FocusableWidget) {
            obfuscationGuard = obfuscationGuard & ((FocusableWidget) (widget)).enabled;
          }
          if (!obfuscationGuard) {
            stackIn_14_0 = this.disabledTint;
          } else {
            if (var6_int != 0) {
              stackIn_14_0 = this.hoverTint;
            } else {
              stackIn_14_0 = this.normalTint;
            }
          }
          var7 = stackIn_14_0;
          EmailAvailabilityRequest.a(this.buttonSprites, widget.y + parentY + (widget.height - this.buttonSprites[0].canvasHeight >> 1), widget.x + parentX, widget.width, var7, (byte) 122);
          stackIn_17_0 = (!obfuscationGuard) ? 7105644 : 16777215;
          var8 = stackIn_17_0;
          if (callbackGuard != -20618) {
            textChoiceResultCodes = (int[]) null;
          }
          this.font.drawParagraph(widget.text, widget.x + parentX, parentY + widget.y - 2, widget.width, widget.height, var8, -1, 1, 1, this.font.ascent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("hi.AA(").append(obfuscationGuard).append(',').append(callbackGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(parentY).append(')').toString());
        }
    }

    public ButtonWidgetRenderer() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != 85) {
            textChoiceResultCodes = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hi.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        rasterStack = null;
        field_w = null;
        textChoiceResultCodes = null;
        if (param0 > -82) {
          textChoiceResultCodes = (int[]) null;
        }
    }

    private ButtonWidgetRenderer(int normalTint, int hoverTint, int disabledTint) {
        this.disabledTint = disabledTint;
        this.hoverTint = hoverTint;
        this.normalTint = normalTint;
        this.font = wm.field_a;
        this.buttonSprites = ValidatedTextFieldWidget.field_U;
    }

    static {
        rasterStack = new NodeDeque();
    }
}
