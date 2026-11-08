/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStyleLayer {
    static String field_d;
    static DualLinkNodeHashTable field_g;
    static String field_m;
    private int field_i;
    private int field_f;
    private int field_b;
    private boolean field_a;
    static float field_j;
    Sprite[] field_k;
    private int field_c;
    static int field_e;
    static String field_l;
    private int field_h;
    Sprite field_n;

    final static boolean isMessagePopupOpen(int param0) {
        int var1 = -62 % ((param0 + 11) / 57);
        return AnimationPlayer.field_g;
    }

    public static void releaseStatics(int param0) {
        if (param0 != -5549) {
          return;
        }
        field_g = null;
        field_l = null;
        field_d = null;
        field_m = null;
    }

    final WidgetStyleLayer setFrameSprites(Sprite[] param0, boolean param1) {
        RuntimeException var3 = null;
        Sprite[] var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = param0;
          if (!param1) {
            var4 = (Sprite[]) null;
            this.setFrameSprites((Sprite[]) null, true);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dg.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void paint(int param0, int param1, int param2, StatefulWidgetRenderer param3, UiWidget param4) {
        BitmapFont stackIn_17_0;
        String stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_18_4 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        UiWidget var8 = null;
        try {
          NineSliceFrameHelpers.drawNineSliceFrame(param4.field_F, (byte) -36, this.field_k, param2 + param4.field_t, param4.field_u, param1 + param4.field_w);
          if (this.field_n != null) {
            var6_int = param4.field_t + param2 + this.field_b;
            if (param3.field_k == 1) {
              var6_int = var6_int + (param4.field_F - this.field_n.field_t) / 2;
            }
            var7 = param4.field_w + (param1 + this.field_f);
            if (1 == param3.field_d) {
              var7 = var7 + (-this.field_n.field_F + param4.field_u) / 2;
            }
            if (param3.field_k == 2) {
              var6_int = var6_int + (param4.field_F - this.field_n.field_t);
            }
            if (2 == param3.field_d) {
              var7 = var7 + (-this.field_n.field_F + param4.field_u);
            }
            this.field_n.drawTransparent(var6_int, var7);
          }
          var6 = param3.getDisplayText(param4, 4373);
          if (param0 != 46) {
            var8 = (UiWidget) null;
            this.paint(-111, 99, -82, (StatefulWidgetRenderer) null, (UiWidget) null);
          }
          if (var6 != null &&
            null != param3.field_b &&
            this.field_i >= 0) {
            stackIn_17_0 = param3.field_b;
            stackIn_17_1 = var6;
            stackIn_17_2 = param3.field_f + param2;
            stackIn_17_3 = -param4.field_t;
            if (this.field_b == -2147483648) {
              stackIn_18_4 = 0;
            } else {
              stackIn_18_4 = this.field_b;
            }
            stackIn_20_2 = stackIn_17_2 - (stackIn_17_3 - stackIn_18_4);
            if (this.field_f != -2147483648) {
              stackIn_21_3 = this.field_f;
            } else {
              stackIn_21_3 = 0;
            }
            stackIn_23_3 = stackIn_21_3 + (param1 + param4.field_w + param3.field_j);
            stackIn_23_4 = -param3.field_g + param4.field_F - param3.field_f;
            stackIn_23_5 = -param3.field_h + (-param3.field_j + param4.field_u);
            stackIn_23_6 = this.field_i;
            stackIn_23_7 = this.field_c;
            if (this.field_h == -2147483648) {
              stackIn_24_8 = 256;
            } else {
              stackIn_24_8 = this.field_h;
            }
            ((BitmapFont) (Object) stackIn_17_0).drawParagraphAlpha(stackIn_17_1, stackIn_20_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, stackIn_24_8, param3.field_k, param3.field_d, param3.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_28_0 = var6_ref;
          stackIn_28_1 = new StringBuilder().append("dg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final WidgetStyleLayer setTextShadowColor(int param0, int param1) {
        if (param1 != 2) {
          this.setFlushBeforeOverlay((byte) 106, false);
        }
        this.field_c = param0;
        return this;
    }

    final WidgetStyleLayer setTextColor(int param0, int param1) {
        if (param0 != 2) {
          field_l = (String) null;
        }
        this.field_i = param1;
        return this;
    }

    final static void handleAchievementResponse(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        BitPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        QueuedStatSubmission var11 = null;
        BitPacketBuffer var12 = null;
        int[] var13 = null;
        PendingStatQuery var14 = null;
        PendingStatQuery var15 = null;
        int[] var16 = null;
        var8 = TetraLink.field_J;
        try {
          var12 = BackgroundSparkle.field_q;
          var2 = var12.readUnsignedByte((byte) -99);
          if (param0 == ~var2) {
            var10 = EmailSyntaxValidator.createEightIntBuffer(-7990);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte((byte) -99);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(122);
            }
            var14 = (PendingStatQuery) (SecondaryNodeDequeIterator.field_a.first(false));
            if (var14 == null) {
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            var14.field_u = var3;
            var14.field_s = true;
            var14.field_t = var16[0];
            var14.unlink(false);
            return;
          }
          if (var2 != 1) {
            if (2 != var2) {
              HotspotTextWidget.reportClientError(-93, (Throwable) null, "A1: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
              SocialTabsPanel.closeGameSocket(false);
            } else {
              var15 = (PendingStatQuery) (SecondaryNodeDequeIterator.field_a.first(false));
              if (var15 == null) {
                SocialTabsPanel.closeGameSocket(false);
                return;
              }
              var15.field_u = EmailSyntaxValidator.createEightIntBuffer(param0 - 7989);
              var15.field_t = var15.field_u[0];
              var15.field_s = true;
              var15.unlink(false);
            }
          } else {
            var11 = (QueuedStatSubmission) (StatefulWidgetRenderer.field_t.first(false));
            if (var11 == null) {
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            var11.unlink(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "dg.E(" + param0 + ')');
        }
    }

    final WidgetStyleLayer setOffsetX(byte param0, int param1) {
        this.field_b = param1;
        if (param0 != -128) {
          return (WidgetStyleLayer) null;
        }
        return this;
    }

    final void applyTo(int param0, UiWidget param1, WidgetStyleLayer param2, boolean param3, int param4, StatefulWidgetRenderer param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        PcmSample var8 = null;
        try {
          if (this.field_a) {
            param2.paint(46, param0, param4, param5, param1);
            param2.reset(30033);
          }
          if (this.field_c >= -1) {
            param2.field_c = this.field_c;
          }
          if (this.field_f != -2147483648) {
            param2.field_f = this.field_f;
          }
          if (null != this.field_k) {
            param2.field_k = this.field_k;
          }
          if (-1 <= this.field_i) {
            param2.field_i = this.field_i;
          }
          if (-2147483648 != this.field_h) {
            param2.field_h = this.field_h;
          }
          if (null != this.field_n) {
            param2.field_n = this.field_n;
          }
          if (!param3) {
            var8 = (PcmSample) null;
            WidgetStyleLayer.createPlayingSound(-102, (byte) 68, (PcmSample) null);
          }
          if (this.field_b != -2147483648) {
            param2.field_b = this.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("dg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void reset(int param0) {
        this.field_h = 256;
        if (param0 != 30033) {
          this.setTextShadowColor(6, -45);
        }
        this.field_b = 0;
        this.field_n = null;
        this.field_i = 0;
        this.field_k = null;
        this.field_f = 0;
        this.field_c = -1;
    }

    final static void drawLobbyAndChatPanels(boolean param0, byte param1) {
        if (PacketFlushHelpers.hasBlockingPopup(3058)) {
          param0 = false;
        }
        GrowableIntList.drawLobbyScreen(param0, 0);
        if (GameOptionTextTables.field_d) {
          SoftwareRasterizer.darkenRectangle(CachedTextLayout.field_e.field_g.field_M, CachedTextLayout.field_e.field_g.field_yb, CachedTextLayout.field_e.field_g.field_Hb, CachedTextLayout.field_e.field_g.field_R);
          CachedTextLayout.field_e.field_g.drawFullScreen(param0, param1 + 344);
        }
        if (param1 != -88) {
          WidgetStyleLayer.isMessagePopupOpen(-86);
        }
        ChatPanelHelpers.updateChatPanel((byte) -89, param0);
    }

    final WidgetStyleLayer setFlushBeforeOverlay(byte param0, boolean param1) {
        if (param0 != -77) {
          Sprite[] var4 = (Sprite[]) null;
          this.setFrameSprites((Sprite[]) null, true);
        }
        this.field_a = param1 ? true : false;
        return this;
    }

    final void copyTo(WidgetStyleLayer param0, int param1) {
        try {
          param0.field_c = this.field_c;
          param0.field_a = this.field_a;
          param0.field_f = this.field_f;
          param0.field_b = this.field_b;
          param0.field_i = this.field_i;
          param0.field_n = this.field_n;
          param0.field_k = this.field_k;
          int var3_int = -14 / ((param1 - 6) / 54);
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "dg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void updateGameSetupPanel(boolean param0, boolean param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        UiComponent stackIn_24_0 = null;
        String stackIn_25_1 = null;
        UiComponent stackIn_27_0 = null;
        String[] stackIn_27_1 = null;
        String stackIn_28_2 = null;
        String stackIn_57_0 = null;
        UiComponent stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        boolean stackIn_72_2 = false;
        UiComponent stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        boolean stackIn_77_2 = false;
        UiComponent stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        boolean stackIn_82_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
        UiComponent var15 = null;
        String var16 = null;
        UiComponent var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = TetraLink.field_J;
        try {
          ResizableDialog.layoutSlidingLobbyPanels(MusicPatch.field_t, (byte) 89);
          if (null != GameKeyHandler.field_a) {
            var15 = ReflectionCheck.field_n;
            var17 = var15;
            ReflectionCheck.field_n.field_R = 0;
            var17.field_Hb = 0;
            var5 = LoadingResourceHelpers.field_c;
            LoadingResourceHelpers.field_c.field_R = 0;
            var5.field_Hb = 0;
            ServerConnectionHelpers.field_a.field_R = 0;
            var6 = ServerConnectionHelpers.field_a;
            var6.field_Hb = 0;
            CommonUiHelpers.field_d.field_jb = EmailSyntaxValidator.field_u.toUpperCase();
            var7 = (2 + HotspotTextWidget.field_V.field_Hb) / 2;
            ServerConnectionHelpers.field_a.setBounds((byte) -99, var7 - 2, HotspotTextWidget.field_V.field_R - 40, 40, 0);
            LoadingResourceHelpers.field_c.setBounds((byte) -124, HotspotTextWidget.field_V.field_Hb - var7, -40 + HotspotTextWidget.field_V.field_R, 40, var7);
            if (MenuScreen.field_f.length == 1 &&
              2 == MenuScreen.field_f[0]) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (MenuScreen.field_f.length > var10) {
                  stackIn_11_0 = ((PendingSubmission.field_o[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    MenuScreen.field_f[var10] != 2) {
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
            LoadingResourceHelpers.field_c.field_S = true;
            if (FullscreenFocusCanvas.field_a) {
              QueuedStatSubmission.field_q.field_jb = MarkerSlider.field_R;
              SparkParticle.field_n.field_S = false;
              if (var8 != 0) {
                stackIn_57_0 = SpriteState.field_I;
              } else {
                stackIn_57_0 = Js5ArchiveManager.field_i;
              }
              var16 = stackIn_57_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = ServerConnectionHelpers.field_a.field_Ib.textWidth(var16) + 3 * ServerConnectionHelpers.field_a.field_Ib.measureCharacterAdvance('.');
              ServerConnectionHelpers.field_a.field_V = (ServerConnectionHelpers.field_a.field_Hb - var10Lifetime1) / 2;
              if ((MatchingTextValidator.field_u & 48) == 16) {
                var9 = var16 + ".";
              }
              ServerConnectionHelpers.field_a.field_xb = 0;
              if (32 == (48 & MatchingTextValidator.field_u)) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & MatchingTextValidator.field_u) == 48) {
                var9 = (String) (var9) + "...";
              }
              ServerConnectionHelpers.field_a.field_jb = (String) (var9);
              LoadingResourceHelpers.field_c.field_jb = FlaggedTextValue.field_c.toUpperCase();
            } else {
              stackIn_24_0 = LoadingResourceHelpers.field_c;
              if (var8 == 0) {
                stackIn_25_1 = LobbyGame.field_Ob;
              } else {
                stackIn_25_1 = MatchingTextValidator.field_q;
              }
              stackIn_24_0.field_jb = ((String) (Object) stackIn_25_1).toUpperCase();
              stackIn_27_0 = QueuedStatSubmission.field_q;
              stackIn_27_1 = new String[]{LoadingResourceHelpers.field_c.field_jb};
              if (var8 == 0) {
                stackIn_28_2 = ConnectionTimingHelpers.field_c;
              } else {
                stackIn_28_2 = ContentTransitionDialog.field_cb;
              }
              stackIn_27_0.field_jb = SectorCacheStore.formatTemplate(stackIn_27_1, stackIn_28_2, 122);
              EditableTextWidget.field_R = true;
              ServerConnectionHelpers.field_a.field_jb = GameSession.field_o;
              SparkParticle.field_n.field_S = true;
              if (null != ThreeSliceButtonPainter.field_s) {
                if (ArrayWidgetContainer.field_K == null) {
                  NetworkArchiveRequest.field_G = new boolean[GameOptionControls.field_k];
                  ArrayWidgetContainer.field_K = new byte[GameOptionControls.field_k];
                }
                EditableTextWidget.field_R = false;
                NameSuggestionsPanel.field_P = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (GameOptionControls.field_k > var13) {
                  NetworkArchiveRequest.field_G[var13] = false;
                  var13++;
                }
                ProgressMessageDialog.findValidSettingCombination(true, (byte) -119, -1, GameKeyHandler.field_a, 0, -1, GameOptionControls.field_k, -1);
                if (!(SettingsCookieHelpers.field_c < 2) &&
                  ErrorPrintHelpers.field_a[12]) {
                  EditableTextWidget.field_R = true;
                }
              }
              if (!EditableTextWidget.field_R) {
                LoadingResourceHelpers.field_c.field_S = false;
                if (LoadingResourceHelpers.field_c.field_rb) {
                  var9 = null;
                  if (NameSuggestionsPanel.field_P) {
                    var9 = "<col=A00000>" + AccountCreationDialog.field_zb + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; GameOptionControls.field_k > var10Lifetime1; var10Lifetime1++) {
                    if (NetworkArchiveRequest.field_G[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ArchiveRequest.field_y[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  CheckboxWidget.field_P = "<col=A00000>" + NameEntryPopup.field_Nb + "<br>" + CanvasAndErrorHelpers.field_a + (String) (var9);
                }
              }
            }
          }
          if (param1) {
            field_e = -1;
          }
          stackIn_71_0 = LoginPanel.field_P;
          stackIn_71_1 = 0;
          stackIn_72_2 = (param0) && (!param2) && (!StripedProgressBar.field_S);
          ((UiComponent) (Object) stackIn_71_0).updateInput(stackIn_71_1, stackIn_72_2);
          stackIn_76_0 = HotspotTextWidget.field_V;
          stackIn_76_1 = 0;
          stackIn_77_2 = (param0) && (!param2) && (!StripedProgressBar.field_S);
          ((UiComponent) (Object) stackIn_76_0).updateInput(stackIn_76_1, stackIn_77_2);
          stackIn_81_0 = ChatMessage.field_b;
          stackIn_81_1 = 0;
          stackIn_82_2 = (param0) && (!param2) && (StripedProgressBar.field_S);
          ((UiComponent) (Object) stackIn_81_0).updateInput(stackIn_81_1, stackIn_82_2);
          CachedTextLayout.field_e.field_g.processTabPresses(true);
          if (GameKeyHandler.field_a != null) {
            if (SparkParticle.field_n.field_F != 0) {
              AnimationSequence.sendFlagRequest(param3, -15289);
            }
            if (LoadingResourceHelpers.field_c.field_F != 0) {
              if (!FullscreenFocusCanvas.field_a) {
                BoardAnimator.sendGameOptionSelection(0, param3);
              } else {
                IndexedSpriteState.sendGameRoomActionRequest((byte) 126, param3);
              }
            }
            GameOptionControls.updateGameOptionControls(param3, GameKeyHandler.field_a, 30544, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var4), "dg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    WidgetStyleLayer() {
        this.field_b = -2147483648;
        this.field_f = -2147483648;
        this.field_a = false;
        this.field_i = -2;
        this.field_k = null;
        this.field_h = -2147483648;
        this.field_n = null;
        this.field_c = -2;
    }

    final static PlayingSound createPlayingSound(int param0, byte param1, PcmSample param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        PlayingSound stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -58 / ((param1 - 71) / 52);
          stackIn_1_0 = CachedTextLayout.playSoundEffect(-11040, PcmSampleStream.createAtRatePercent(param2, 100, param0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final WidgetStyleLayer setOffsetY(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 12) {
          field_m = (String) null;
        }
        return this;
    }

    static {
        field_m = "Please wait...";
        field_d = "<%0> has resigned and is offering a rematch.";
        field_l = "Chat is currently disabled.";
    }
}
