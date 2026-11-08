/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidgetPainter implements WidgetPainter {
    static UiComponent field_j;
    private int field_l;
    private int field_c;
    private int field_k;
    static int field_f;
    private int field_h;
    private int field_i;
    private BitmapFont field_g;
    private int field_b;
    static Sprite field_a;
    private int field_d;
    static String field_e;

    final static String normalizeDisplayName(CharSequence param0, byte param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (NameSeparatorHelpers.isNameSeparator((byte) 81, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (NameSeparatorHelpers.isNameSeparator((byte) 81, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param0.charAt(var6);
            if (AccountServerResult.isAllowedNameCharacter(3010, (char) var7)) {
              var8 = BackgroundSparkle.normalizeNameCharacter((char) var7, -122);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (param1 < 94) {
            DialWidgetPainter.nextPowerOfTwo(86, (byte) -28);
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("cc.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static short[] readBitPackedShorts(short[] param0, BitPacketBuffer param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TetraLink.field_J;
        try {
          var4_int = param1.readBits(param2, (byte) -112);
          if (0 == var4_int) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new short[var4_int];
          }
          var5 = param1.readBits(4, (byte) -112);
          var6 = (short)param1.readBits(16, (byte) -112);
          if (param3 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)(var6 + param1.readBits(var5, (byte) -112));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_16_0 = (short[]) (param0);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("cc.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void beginReconnectLogin(int param0) {
        SettingsCookieHelpers.resetLoginState(param0 - 17958);
        if (param0 != 17896) {
          return;
        }
        QuickChatCategory.field_v = true;
        ByteStorage.field_a = true;
        InsetTextPainter.field_s.hideAllLayers(0);
        LoginProgressHelpers.openLoginProgress(TriangleMesh.field_n, false, false);
    }

    final static int countSetBits(byte param0, int param1) {
        param1 = (param1 & 1431655765) + ((param1 & -1431655765) >>> 1);
        param1 = (param1 >>> 2 & -1288490189) + (858993459 & param1);
        param1 = (param1 >>> 4) + param1 & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (param0 != 71) {
          return -19;
        }
        return 255 & param1;
    }

    public final void drawWidget(UiWidget param0, int param1, int param2, boolean param3, boolean param4) {
        DialWidget var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = !(param0 instanceof DialWidget) ? null : (DialWidget) (param0);
          SoftwareRasterizer.fillRectangle(param0.field_t + param1, param2 + param0.field_w, param0.field_F, param0.field_u, this.field_b);
          if (var14 == null) {
          }
          var7 = param1 + (param0.field_t + var14.field_V);
          var8 = param2 - (-param0.field_w - var14.field_Z);
          SoftwareRasterizer.fillCircle(var7, var8, var14.field_bb, this.field_h);
          if (!param3) {
            this.field_b = 42;
          }
          if (-1 != var14.field_U) {
            var9 = (double)var14.field_U * 3.141592653589793 * 2.0 / (double)var14.field_R;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_bb);
            var12 = (int)(Math.cos(var9) * (double)var14.field_bb);
            SoftwareRasterizer.fillCircle(var7 + var11, var12 + var8, 1, this.field_l);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_R;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_bb);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_bb);
          SoftwareRasterizer.drawLine(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (this.field_g != null) {
            var13 = var14.field_V + var14.field_bb + this.field_k;
            this.field_g.drawParagraph(param0.field_A, param0.field_t + (param1 + var13), this.field_d + (param2 + param0.field_w), -var13 + (-this.field_k + param0.field_F), param0.field_u - (this.field_k << 1), this.field_i, this.field_c, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "cc.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static QuickChatCommandType[] getQuickChatCommandTypes(int param0) {
        if (param0 <= 36) {
          return (QuickChatCommandType[]) null;
        }
        return new QuickChatCommandType[]{FlaggedTextValue.field_f, NineSliceFrameHelpers.field_c, PieceDropAnimation.field_r, Js5ArchiveManager.field_h, IndexedSpriteHelpers.field_e, SocialTabsPanel.field_c, TwoColumnListPanel.field_Qb, DirectByteStorage.field_i, NodeHashTable.field_g, StartupFlagsHelpers.field_d, TextMetricsGlobals.field_b, WidgetNode.field_t, IntrusiveDeque.field_d, RasterBuffer.field_e};
    }

    final static boolean isPrivateChatTarget(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -80) {
            field_j = (UiComponent) null;
          }
          if (!MenuScreen.field_e) {
            return false;
          }
          if (SecondaryNodeDequeIterator.field_d == 2 &&
            null != NineSliceFrameHelpers.field_a) {
            var3 = (CharSequence) ((Object) param0);
            if (NineSliceFrameHelpers.field_a.equals(DialWidgetPainter.normalizeDisplayName(var3, (byte) 95))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("cc.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_j = null;
        field_e = null;
        int var1 = 57 / ((param0 + 40) / 56);
    }

    DialWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_i = param3;
          this.field_d = param2;
          this.field_c = param4;
          this.field_l = param6;
          this.field_b = param7;
          this.field_h = param5;
          this.field_k = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void drawLobbyOverlays(boolean param0, boolean param1) {
        if (PacketFlushHelpers.hasBlockingPopup(3058)) {
          param1 = false;
        }
        LobbyOverlayHelpers.drawLobbyOverlays(param0, param1);
        MarkerSlider.drawQuickChatMenuOverlay(-1);
    }

    final static int nextPowerOfTwo(int param0, byte param1) {
        param0--;
        if (param1 > -47) {
          field_e = (String) null;
        }
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    final static void layoutLobbyComponents(boolean param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        UiComponent stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_32_0 = null;
        IconLabelItem stackIn_32_1 = null;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        UiComponent var7 = null;
        int var7_int = 0;
        int var8 = 0;
        UiComponent var8_ref_hl = null;
        IconLabelItem var9 = null;
        int var9_int = 0;
        IconLabelItem var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var13 = TetraLink.field_J;
        try {
          PendingStatQuery.field_n = SoftwareRasterizer.field_f;
          TextLayoutLine.field_c = SoftwareRasterizer.field_e;
          if (!param0) {
            stackIn_4_0 = MiscTextGlobals.field_f;
          } else {
            stackIn_4_0 = MusicPatch.field_t;
          }
          ResizableDialog.layoutSlidingLobbyPanels(stackIn_4_0, (byte) 1);
          CachedTextLayout.field_e.layoutPanel(0, 0, -40 + LoginPanel.field_P.field_R - 2, 66, LoginPanel.field_P.field_Hb);
          IndexedSpriteHelpers.field_d.setBounds((byte) -92, DialWidget.field_Q.field_Hb, 0, GameKeyHandler.field_d, 0);
          stackIn_6_0 = TextButton.field_J;
          stackIn_6_1 = -92;
          stackIn_6_2 = DialWidget.field_Q.field_Hb;
          if (!IntroFinalFrameHelpers.field_b) {
            stackIn_7_3 = 0;
          } else {
            stackIn_7_3 = 2 + MouseInputHandler.field_e + 42;
          }
          ((UiComponent) (Object) stackIn_6_0).setBounds((byte) stackIn_6_1, stackIn_6_2 - stackIn_7_3, GameKeyHandler.field_d + 2, 18, 0);
          EmailSyntaxValidator.field_q.setBounds((byte) -97, MouseInputHandler.field_e + 42, GameKeyHandler.field_d + 2, 18, DialWidget.field_Q.field_Hb - MouseInputHandler.field_e - 42);
          QueuedListRequest.field_x.setBoundsAndLayout(DialWidget.field_Q.field_Hb, MouseInputHandler.field_e, -GameKeyHandler.field_d + (DialWidget.field_Q.field_R - 22), param1, 20 + (GameKeyHandler.field_d + 2), 0, 2);
          SparkParticle.field_n.setBounds((byte) -100, LoginPanel.field_P.field_Hb, -40 + LoginPanel.field_P.field_R, 40, 0);
          CommonUiHelpers.field_d.setBounds((byte) -95, HotspotTextWidget.field_V.field_Hb, 0, 30, 0);
          VerticalScrollbar.field_Qb.setBounds((byte) -94, HotspotTextWidget.field_V.field_Hb, 30, -30 + HotspotTextWidget.field_V.field_R - 40 - 2, 0);
          var2_int = 3 + GameOptionControls.field_k;
          if (MenuScreen.field_f.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = -2 + (-10 + (-5 + VerticalScrollbar.field_Qb.field_R - 5 + 2 + (var2_int + 1) / 2)) / (1 + var2_int);
          if (30 < var3) {
            var3 = 30;
          }
          var4 = -5 + VerticalScrollbar.field_Qb.field_R - (5 + (2 + var3) * var2_int);
          if (var4 > 40) {
            var4 = 40;
          }
          AnimationFrameSet.field_x.setBounds((byte) -93, -5 + VerticalScrollbar.field_Qb.field_Hb - 5, 5, var4, 5);
          var5 = var4 + 5 + 2;
          for (var6 = 0; GameOptionControls.field_k + 4 > var6; var6++) {
            if ((var6 != 1 ||
              !(MenuScreen.field_f.length < 2)) && (3 != var6 ||
              !(SocialTabsPanel.field_e <= 1))) {
              if (!param0 &&
                3 == var6) {
                var7 = GameBoard.field_m[var6];
                GameBoard.field_m[var6].field_R = 0;
                var7.field_Hb = 0;
                for (var8 = 0; var8 < ClientException.field_e[var6].length; var8++) {
                  if (null != ClientException.field_e[var6][var8]) {
                    var9 = ClientException.field_e[var6][var8];
                    ClientException.field_e[var6][var8].field_R = 0;
                    var9.field_Hb = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var7 = GameBoard.field_m[var6];
                GameBoard.field_m[var6].field_R = 0;
                var7.field_Hb = 0;
                for (var8 = 0; var8 < ClientException.field_e[var6].length; var8++) {
                  stackIn_32_0 = null;
                  stackIn_32_1 = ClientException.field_e[var6][var8];
                  if (stackIn_32_0 != stackIn_32_1) {
                    var9 = ClientException.field_e[var6][var8];
                    ClientException.field_e[var6][var8].field_R = 0;
                    var9.field_Hb = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (NineSliceFrame.field_d != null) {
                      stackIn_47_0 = (NineSliceFrame.field_d[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_47_0 = 0;
                    }
                  } else {
                    stackIn_47_0 = 0;
                  }
                } else {
                  stackIn_47_0 = 0;
                }
                var7_int = stackIn_47_0;
                if (var7_int != 0) {
                  var8_ref_hl = GameBoard.field_m[var6];
                  GameBoard.field_m[var6].field_R = 0;
                  var8_ref_hl.field_Hb = 0;
                  var14 = 0;
                  var9_int = var14;
                  while (var14 < ClientException.field_e[var6].length) {
                    if (null != ClientException.field_e[var6][var14]) {
                      var10 = ClientException.field_e[var6][var14];
                      ClientException.field_e[var6][var14].field_R = 0;
                      var10.field_Hb = 0;
                    }
                    var14++;
                  }
                } else {
                  GameBoard.field_m[var6].setBounds((byte) -101, 103, var5, var3, 5);
                  var8 = 110;
                  if (param0) {
                    ClientException.field_e[var6][0].setBoundsAndLayout(0, 38, var5, QueuedStatSubmission.field_w, var8, 2, var3);
                    var8 += 40;
                  } else {
                    if (null != ClientException.field_e[var6][0]) {
                      var9 = ClientException.field_e[var6][0];
                      ClientException.field_e[var6][0].field_R = 0;
                      var9.field_Hb = 0;
                    }
                  }
                  var9_int = -var8 - 5 + HotspotTextWidget.field_V.field_Hb + 2;
                  var10_int = -1 + ClientException.field_e[var6].length;
                  for (var11 = 0; var11 < var10_int; var11++) {
                    var12 = var11 * var9_int / var10_int;
                    ClientException.field_e[var6][var11 + 1].setBoundsAndLayout(0, (var11 + 1) * var9_int / var10_int - (2 + var12), var5, QueuedStatSubmission.field_w, var12 + var8, 2, var3);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          ChatMessage.field_b.setBounds((byte) -127, 360, 10, -130 + SoftwareRasterizer.field_e - 4 - 10, -360 + SoftwareRasterizer.field_f >> 1);
          MarkerSliderPainter.field_l.setBounds((byte) -102, ChatMessage.field_b.field_Hb, 0, 24, 0);
          DelegatingCanvas.field_e.setBounds((byte) -79, ChatMessage.field_b.field_Hb, 24, ChatMessage.field_b.field_R - 24, 0);
          DelegatingCanvas.field_e.field_Eb = Archive.buildNineSliceSprites(1, 3, 8421504, 16, 11579568, DelegatingCanvas.field_e.field_R);
          TextMetricsGlobals.field_c.setBounds((byte) -105, DelegatingCanvas.field_e.field_Hb - 10, 5, -12 + (DelegatingCanvas.field_e.field_R - 24), 5);
          GraphicsSettings.field_b.setBounds((byte) -118, 80, -29 + DelegatingCanvas.field_e.field_R, 24, (DelegatingCanvas.field_e.field_Hb - 80) / 2);
          MidiPcmStream.layoutLobbyPanels(1753);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "cc.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new Sprite(128, 128);
        field_e = "Players: ";
    }
}
