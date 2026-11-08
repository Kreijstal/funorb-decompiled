/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageDialogContent extends WidgetContainer implements ButtonActivationListener {
    private MessageDialog dialog;
    static String friendlistfull;
    static int field_P;
    private BitmapFont messageFont;
    static Sprite field_T;
    private ButtonWidget[] actionButtons;
    static UiComponent field_N;
    private int[] actionIds;
    private int actionButtonCount;
    private String messageText;

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        WidgetListener var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Pool.field_O;
        try {
          if (!param0) {
            var9 = (WidgetListener) null;
            this.addButton((String) null, 93, (WidgetListener) null);
          }
          for (var6_int = 0; var6_int < this.actionButtonCount; var6_int++) {
            if (this.actionButtons[var6_int] != param3) {
              continue;
            }
            var7 = this.actionIds[var6_int];
            if (var7 != -1) {
              LoginEncryptionSupport.setAccountDialogResult(this.actionIds[var6_int], (byte) 78);
            } else {
              this.dialog.dismissDialog(17);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("wk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        super.renderWidget(param0, (byte) 78, param2, param3);
        this.messageFont.drawParagraph(this.messageText, 14 + param2 + this.widgetX, this.widgetY + (param3 + 10), this.widgetWidth - 28, this.widgetHeight, 16777215, -1, 0, 0, this.messageFont.maxAscent);
        int var5 = 6 % ((-42 - param1) / 53);
    }

    final ButtonWidget addButton(String param0, int param1, WidgetListener param2) {
        ButtonWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ButtonWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ButtonWidget(param0, param2);
          var4.renderer = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var5 = -2 + this.widgetHeight;
          if (param1 > -77) {
            this.actionButtons = (ButtonWidget[]) null;
          }
          this.setWidgetBounds(this.widgetWidth, 0, 34 + this.widgetHeight, false, 0);
          var4.setWidgetBounds(this.widgetWidth - 14, 7, 30, false, var5);
          this.addChild(true, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("wk.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -85) {
          MessageDialogContent.a(true, -59, false, -90);
        }
        field_N = null;
        friendlistfull = null;
        field_T = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        try {
          TriangleRasterizer.useRasterClip();
          MenuScreen.field_i = 11;
          InputIdleSupport.field_d = new int[260];
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            InputIdleSupport.field_d[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          if (param0 != -257) {
            return;
          }
          var4 = 256;
          var1_intLifetime1 = var4;
          while (var4 < InputIdleSupport.field_d.length) {
            InputIdleSupport.field_d[var4] = 255;
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "wk.F(" + param0 + ')');
        }
    }

    MessageDialogContent(MessageDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int var4_int = 0;
        this.actionButtonCount = 0;
        try {
          this.messageFont = param1;
          this.dialog = param0;
          this.messageText = param2;
          var4_int = null == this.messageText ? 0 : this.messageFont.measureWrappedHeight(this.messageText, 260, this.messageFont.maxAscent);
          this.setWidgetBounds(288, 0, var4_int + 22, false, 0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void addActionButton(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.actionButtonCount;
          this.ensureButtonCapacity((byte) 122, var4_int + param2);
          this.actionButtons[var4_int] = this.addButton(param1, TutorialFactory.bitwiseXor(param2, -115), (WidgetListener) (this));
          this.actionIds[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        UiComponent stackIn_36_0 = null;
        String stackIn_37_1 = null;
        UiComponent stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        String stackIn_40_3 = null;
        UiComponent stackIn_68_0 = null;
        boolean stackIn_69_1 = false;
        UiComponent stackIn_73_0 = null;
        boolean stackIn_74_1 = false;
        UiComponent stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        RuntimeException decompiledCaughtException = null;
        UiComponent var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        UiComponent var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Pool.field_O;
        try {
          DelayedServerPacket.$cfr$intArgs$a$e9dea5688aa5(-100, PoolMatchController.field_z);
          if (null != LookupRetrySupport.field_e) {
            var4 = CanvasInputAttachmentSupport.field_b;
            CanvasInputAttachmentSupport.field_b.height = 0;
            var4.width = 0;
            var5 = MeshBoundsSupport.field_c;
            MeshBoundsSupport.field_c.height = 0;
            var5.width = 0;
            TextHotspotRegion.field_o.height = 0;
            var6 = TextHotspotRegion.field_o;
            var6.width = 0;
            ProxyConnectorSupport.field_e.text = ScrollPane.ratedGame.toUpperCase();
            var7 = (Bzip2DecoderState.field_f.width + 2) / 2;
            TextHotspotRegion.field_o.setBounds(Bzip2DecoderState.field_f.height - 40, 2147483647, 0, var7 - 2, 40);
            MeshBoundsSupport.field_c.setBounds(-40 + Bzip2DecoderState.field_f.height, 2147483647, var7, -var7 + Bzip2DecoderState.field_f.width, 40);
            if (DiskArchiveRequest.field_T.length == 1 &&
              DiskArchiveRequest.field_T[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (DiskArchiveRequest.field_T.length > var10) {
                  stackIn_11_0 = (0 == (RenderingInitializationSupport.field_c[var10 / 8] & 1 << (var10 & 7))) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    2 != DiskArchiveRequest.field_T[var10]) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            MeshBoundsSupport.field_c.enabled = true;
            if (!LobbyGame.field_Ac) {
              stackIn_36_0 = MeshBoundsSupport.field_c;
              if (var8 != 0) {
                stackIn_37_1 = TutorialController.findOpponentsPlural;
              } else {
                stackIn_37_1 = KeyHandler.findOpponentSingular;
              }
              stackIn_36_0.text = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = LimitedRandomAccessFile.field_j;
              stackIn_39_1 = new String[]{MeshBoundsSupport.field_c.text};
              stackIn_39_2 = -1;
              if (var8 != 0) {
                stackIn_40_3 = LabeledChildWidget.ratedGameTipsSetupPlural;
              } else {
                stackIn_40_3 = TutorialStep.ratedGameTipsSetupSingular;
              }
              stackIn_39_0.text = AccountWelcomePanel.substituteTemplateArguments(stackIn_39_1, stackIn_39_2, stackIn_40_3);
              TextHotspotRegion.field_o.text = ChatPanelSupport.waitingToStartHint;
              ContentTransitionDialog.field_ob.enabled = true;
              PoolUiText.field_b = true;
              if (ArchiveLoadStep.field_m != null) {
                if (null == GlowParticle.field_j) {
                  UsernameSuggestionSupport.field_b = new boolean[LogoFinalFrameLoader.field_c];
                  GlowParticle.field_j = new byte[LogoFinalFrameLoader.field_c];
                }
                PoolUiText.field_b = false;
                ModelOriginSupport.field_p = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (LogoFinalFrameLoader.field_c > var13) {
                  UsernameSuggestionSupport.field_b[var13] = false;
                  var13++;
                }
                OpacityWidget.a(0, LogoFinalFrameLoader.field_c, -1, false, LookupRetrySupport.field_e, -1, -1, true);
                if (!(2 > TutorialController.field_i) &&
                  TextLineLayout.field_c[12]) {
                  PoolUiText.field_b = true;
                }
              }
              if (!PoolUiText.field_b) {
                MeshBoundsSupport.field_c.enabled = false;
                if (MeshBoundsSupport.field_c.hovered) {
                  var9 = null;
                  if (ModelOriginSupport.field_p) {
                    var9 = "<col=A00000>" + ArchiveAvailabilitySupport.muOptionsPlayers + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < LogoFinalFrameLoader.field_c; var10Lifetime1++) {
                    if (UsernameSuggestionSupport.field_b[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ValidationMessageWidget.field_R[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  CacheEntry.field_B = "<col=A00000>" + LoginResponse.field_a + "<br>" + RatingTextState.gameoptPleasetrychanging + (String) (var9);
                }
              }
            } else {
              ContentTransitionDialog.field_ob.enabled = false;
              LimitedRandomAccessFile.field_j.text = CheckboxPainter.ratedGameTips;
              if (var8 != 0) {
                stackIn_25_0 = Cp1252CharacterSupport.searchingForOpponentsPlural;
              } else {
                stackIn_25_0 = BallEvent.searchingForOpponentSingular;
              }
              var14 = stackIn_25_0;
              var9 = var14;
              var9 = var14;
              var9 = var14;
              var10Lifetime1 = TextHotspotRegion.field_o.font.b(var14) + 3 * TextHotspotRegion.field_o.font.measureCharacterAdvance('.');
              if ((48 & MultiHandleSliderWidget.field_V) == 16) {
                var9 = var14 + ".";
              }
              TextHotspotRegion.field_o.horizontalAlignment = 0;
              TextHotspotRegion.field_o.textInset = (TextHotspotRegion.field_o.width - var10Lifetime1) / 2;
              if ((48 & MultiHandleSliderWidget.field_V) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & MultiHandleSliderWidget.field_V) == 48) {
                var9 = (String) (var9) + "...";
              }
              TextHotspotRegion.field_o.text = (String) (var9);
              MeshBoundsSupport.field_c.text = OptionsScreen.cancel.toUpperCase();
            }
          }
          stackIn_68_0 = SceneNode.field_k;
          stackIn_69_1 = (param2) && (!param0) && (!AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_68_0).updateRoot(stackIn_69_1, false);
          stackIn_73_0 = Bzip2DecoderState.field_f;
          stackIn_74_1 = (param2) && (!param0) && (!AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_73_0).updateRoot(stackIn_74_1, false);
          stackIn_78_0 = DebugTuningSupport.field_b;
          stackIn_79_1 = (param2) && (!param0) && (AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_78_0).updateRoot(stackIn_79_1, false);
          IntegerSyntaxSupport.field_e.field_i.processTabPresses(true);
          var4_int = -10 % ((-1 - param3) / 35);
          if (null != LookupRetrySupport.field_e) {
            if (ContentTransitionDialog.field_ob.pressedButton != 0) {
              ByteArrayNode.b(param1, -29);
            }
            if (0 != MeshBoundsSupport.field_c.pressedButton) {
              if (LobbyGame.field_Ac) {
                EmailAvailabilityValidator.b(-118, param1);
              } else {
                Js5ArchiveManager.a((byte) 81, param1);
              }
            }
            RankingsScreen.a(param1, LookupRetrySupport.field_e, 0, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4_ref), "wk.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(SocialListEntry param0, SocialListEntry param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.insertionIndex - param1.insertionIndex;
          if (param2 < 17) {
            field_N = (UiComponent) null;
          }
          if (param0.serverName != LocalGameSetupScreen.field_J) {
            if (null == param0.serverName) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1.serverName == LocalGameSetupScreen.field_J) {
            var3_int += 200;
          } else {
            if (param1.serverName == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("wk.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, BitmapFont param2, int param3, BitmapFont param4, int param5, int param6, NineSliceFrame param7, int param8, int param9, NineSliceFrame param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, NineSliceFrame param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          ScrollPaneWithFooter.configureSharedTextStyle((byte) -83, param0, param2, param4);
          ByteRecordSubmission.a(param12, true, param13, param5, param19);
          LogoMaterial.a(param8, param9, -128);
          if (param16 != 255) {
            field_P = 121;
          }
          ClassicBallSkin.a((byte) -91, param1, param10, param7, param3, param14);
          BitmapTextLayout.a(111, param15, param17, param18);
          GradientPaletteSupport.a((byte) -96, param11, param20, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("wk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    private final void ensureButtonCapacity(byte param0, int param1) {
        int var5 = 0;
        if (this.actionButtonCount >= param1) {
          return;
        }
        ButtonWidget[] var6 = new ButtonWidget[param1];
        ButtonWidget[] var7 = var6;
        ButtonWidget[] var3 = var7;
        int[] var4 = new int[param1];
        if (param0 < 117) {
          this.renderWidget(18, (byte) 47, -48, 114);
        }
        for (var5 = 0; var5 < this.actionButtonCount; var5++) {
          var6[var5] = this.actionButtons[var5];
          var4[var5] = this.actionIds[var5];
        }
        this.actionButtonCount = param1;
        this.actionButtons = var7;
        this.actionIds = var4;
    }

    static {
        friendlistfull = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
