/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AuctionSettingsDialog extends MessageDialog {
    static Sprite field_H;
    static ScrollPane field_G;
    private boolean field_F;
    static UiLayoutNode field_J;
    private boolean field_I;

    final void handleResult(int param0, int param1) {
        int var3;
        CipherPacketBuffer stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        boolean decompiledFrameRemainder0 = true;
        super.handleResult(69, param1);
        if (!PlayArea.isGuestSession(100)) {
          if (!NineSlicePanelPainter.field_e &&
            !ModelMaterialDecoder.field_g) {
            if (param0 <= 60) {
              return;
            }
            if ((param1 == 0) &&
              (decompiledFrameRemainder0 = !(LocalizedTextLoader.field_f < QuickChatPhraseCache.field_c))) {
              if (IndexedSpriteState.field_g < LocalizedTextLoader.field_f) {
                return;
              }
              if (ServerTextTemplate.field_e) {
                if (LocalizedTextLoader.field_f > AuctionBidDialog.field_L) {
                  return;
                }
                if (!(QuickChatPhraseCache.field_c <= AuctionBidDialog.field_L) ||
                  !(AuctionBidDialog.field_L <= IndexedSpriteState.field_g)) {
                  return;
                }
              }
              var3 = 0;
              if (0 < LocalizedTextLoader.field_f) {
                var3 = var3 | 1;
              }
              if (ServerTextTemplate.field_e &&
                AuctionBidDialog.field_L > 0) {
                var3 = var3 | 4;
              }
              FootballerAiOverlaySupport.field_d.writeIsaacByte(51, (byte) 127);
              FootballerAiOverlaySupport.field_d.writeByte(105, ArchiveNetworkClient.field_m);
              FootballerAiOverlaySupport.field_d.writeByte(126, GameMediaSupport.field_d);
              FootballerAiOverlaySupport.field_d.writeByte(109, var3);
              FootballerAiOverlaySupport.field_d.writeInt(-95, LocalizedTextLoader.field_f);
              stackIn_27_0 = FootballerAiOverlaySupport.field_d;
              stackIn_27_1 = -75;
              if (!ServerTextTemplate.field_e) {
                stackIn_28_2 = 0;
              } else {
                stackIn_28_2 = AuctionBidDialog.field_L;
              }
              ((CipherPacketBuffer) (Object) stackIn_27_0).writeInt(stackIn_27_1, stackIn_28_2);
              ((AuctionsScreen) (AuctionLogEntry.field_h)).enterScreen(0, 0, true);
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            return;
          }
        }

    }

    final boolean handleKey(int param0, byte param1, char param2) {
        boolean discarded$0 = false;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int var4;
        int var6;
        String var7;
        String var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        stackIn_2_0 = GameplayHelpScreen.field_G[81];
        stackIn_3_1 = (101 != param0) ? 0 : 1;
        stackIn_6_2 = (85 != param0) ? 0 : 1;
        stackIn_8_1 = stackIn_3_1 | stackIn_6_2;
        stackIn_9_2 = (param0 != 96) ? 0 : 1;
        stackIn_11_1 = stackIn_8_1 | stackIn_9_2;
        stackIn_12_2 = (97 != param0) ? 0 : 1;
        var4 = stackIn_2_0 | (stackIn_11_1 | stackIn_12_2) != 0 ? 1 : 0;
        stackIn_15_0 = var4;
        if (GameplayHelpScreen.field_G[82] &&
          FixedQuaternion.field_e == 66) {
          stackIn_16_1 = 1;
        } else {
          stackIn_16_1 = 0;
        }
        if (GameplayHelpScreen.field_G[82] &&
          param0 == 67) {
          stackIn_20_2 = 1;
        } else {
          stackIn_20_2 = 0;
        }
        boolean decompiledFrameRemainder1 = true;
        var4Lifetime1 = stackIn_15_0 | (stackIn_16_1 | stackIn_20_2);
        stackIn_28_0 = var4Lifetime1;
        if (this.b(-111, param2) && (this.field_F &&
          UnreadMessagesScreen.field_A.getText((byte) -16).length() < BlackFadeScreen.field_l ||
          this.field_I &&
          !(StatChoiceDialog.field_F.getText((byte) -16).length() >= BlackFadeScreen.field_l))) {
          stackIn_29_1 = 1;
          decompiledFrameRemainder1 = false;
        }
        else {
          stackIn_29_1 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var4Lifetime2 = stackIn_28_0 | stackIn_29_1;
        stackIn_39_0 = var4Lifetime2;
        if (this.b(-118, param2) && (this.field_F &&
          UnreadMessagesScreen.field_A.getText((byte) -16).length() == BlackFadeScreen.field_l &&
          UnreadMessagesScreen.field_A.getSelectedText((byte) 35).length() > 0 ||
          this.field_I &&
          StatChoiceDialog.field_F.getText((byte) -16).length() == BlackFadeScreen.field_l &&
          !(StatChoiceDialog.field_F.getSelectedText((byte) 35).length() <= 0))) {
          stackIn_40_1 = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_40_1 = 0;
        }
        var4Lifetime3 = stackIn_39_0 | stackIn_40_1;
        if (var4Lifetime3 == 0) {
          if (!this.field_F &&
            !this.field_I) {
            discarded$0 = super.handleKey(param0, param1, param2);
            return false;
          }
          return true;
        }
        if (this.field_F) {
          if (param2 == 48 &&
            UnreadMessagesScreen.field_A.getText((byte) -16).length() == 0) {
            return true;
          }
          UnreadMessagesScreen.field_A.handleKey(param0, param2, 875);
          var8 = UnreadMessagesScreen.field_A.getText((byte) -16);
          if (var8 != null &&
            var8.length() > 0) {
            stackIn_62_0 = Integer.parseInt(var8);
          } else {
            stackIn_62_0 = 0;
          }
          var6 = stackIn_62_0;
          LocalizedTextLoader.field_f = var6;
        } else {
          if (!this.field_I) {
            return true;
          }
          if (48 == param2 &&
            0 == StatChoiceDialog.field_F.getText((byte) -16).length()) {
            return true;
          }
          StatChoiceDialog.field_F.handleKey(param0, param2, param1 + 896);
          var7 = StatChoiceDialog.field_F.getText((byte) -16);
          if (var7 != null &&
            0 < var7.length()) {
            stackIn_53_0 = Integer.parseInt(var7);
          } else {
            stackIn_53_0 = 0;
          }
          var6 = stackIn_53_0;
          AuctionBidDialog.field_L = var6;
        }
        return true;
    }

    final int dialogWidth(int param0) {
        if (param0 != -1379118556) {
          return 96;
        }
        return 545;
    }

    final int dialogHeight(byte param0) {
        if (param0 <= 75) {
          this.drawBody((byte) 120, 52, 33);
        }
        return 400;
    }

    final void drawBody(byte param0, int param1, int param2) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        var12 = Kickabout.field_G;
        super.drawBody((byte) -124, param1, param2);
        ClubStateFactory.field_c.drawCentered(150 + param2, 23, param1 + 98);
        IsSixCommand.field_C.drawParagraph(LeaguesHelpScreen.field_G, 25 + param1, param2 + 270, 150, 40, 16729156, -1, 1, 1, 0);
        if (param0 > -11) {
          field_J = (UiLayoutNode) null;
        }
        var4 = 220 + param1;
        var5 = 50 + var4;
        var6 = param2 + 55;
        var7 = var4 + 50;
        var8 = 6 + (var6 + 75);
        var9 = 75 + var8 + 6;
        SoftwareRasterizer.fillRoundedRectangleBlended(-47 + var4, var6, 90, 75, 10, 65793, 128);
        SoftwareRasterizer.fillRoundedRectangleBlended(160 + var5 + 7, var6, 90, 75, 10, 65793, 128);
        ByteArrayPool.field_d.drawCentered(LoadingProgressDialog.field_T.toLowerCase(), var4 - 2, var6 + 30, 16777215, -1);
        IsSixCommand.field_C.drawCentered(LocalizedTextLoader.formatCurrencyAmount(QuickChatPhraseCache.field_c, 26300), var4 - 2, var6 + 54, 16777215, -1);
        ByteArrayPool.field_d.drawCentered(GameLoopApplet.field_D.toLowerCase(), 52 + (160 + var5), var6 + 30, 16777215, -1);
        IsSixCommand.field_C.drawCentered(LocalizedTextLoader.formatCurrencyAmount(IndexedSpriteState.field_g, 26300), 52 + (160 + var5), 54 + var6, 16777215, -1);
        SoftwareRasterizer.fillRoundedRectangleBlended(var5, var6, 160, 75, 10, 65793, 128);
        SoftwareRasterizer.fillRoundedRectangleBlended(var7, var8, 160, 75, 10, 65793, 128);
        SoftwareRasterizer.fillRoundedRectangleBlended(var4, var9, 260, 120, 10, 65793, 128);
        ByteArrayPool.field_d.drawCentered(InstrumentEnvelope.field_f.toLowerCase(), 130 + var4, 21 + var6, 16777215, -1);
        ByteArrayPool.field_d.drawCentered(Kickabout.field_F.toLowerCase(), var4 + 130, var9 + 21, 16777215, -1);
        if (StrongCacheEntry.hasGameFocus(2368)) {
          stackIn_8_0 = (MonotonicClock.monotonicMillis(-51) % 500L < 250L) ? 1 : 0;
        } else {
          stackIn_8_0 = 0;
        }
        var10 = stackIn_8_0;
        ChatInputState.field_b.field_s = var4 + 10;
        ChatInputState.field_b.field_J = 27 + var6;
        SoftwareRasterizer.fillRectangleAlpha(ChatInputState.field_b.field_s + 85, ChatInputState.field_b.field_J + 6, UnreadMessagesScreen.field_A.field_q + 4, -4 + UnreadMessagesScreen.field_A.field_mb, 7829367, 128);
        IsSixCommand.field_C.drawCenteredCharacter('£', 91 + ChatInputState.field_b.field_s, ChatInputState.field_b.field_J + 19, 16777215);
        ChatInputState.field_b.draw(110, var10 != 0 & this.field_F);
        OverlayLayerSupport.field_b.field_J = 5 + (var8 - 13);
        OverlayLayerSupport.field_b.field_s = var4 + 10;
        SoftwareRasterizer.fillRectangleAlpha(OverlayLayerSupport.field_b.field_s + 85, 40 + OverlayLayerSupport.field_b.field_J, StatChoiceDialog.field_F.field_q + 4, -4 + StatChoiceDialog.field_F.field_mb, 7829367, 128);
        if (ServerTextTemplate.field_e) {
          IsSixCommand.field_C.drawCenteredCharacter('£', OverlayLayerSupport.field_b.field_s + 91, 53 + OverlayLayerSupport.field_b.field_J, 16777215);
        }
        OverlayLayerSupport.field_b.draw(94, var10 != 0 & this.field_I);
        DisplayModeSupport.field_a.a(false, (byte) 46);
        if (LocalizedTextLoader.field_f < QuickChatPhraseCache.field_c) {
          IsSixCommand.field_C.drawCentered(IntDoubleCommand.field_E, var4 + 130, 75 + var6 - 8, 16711680, -1);
        } else {
          if (IndexedSpriteState.field_g >= LocalizedTextLoader.field_f) {
            if (ServerTextTemplate.field_e &&
              LocalizedTextLoader.field_f > AuctionBidDialog.field_L) {
              IsSixCommand.field_C.drawCentered(CheckboxLabelWidget.field_Eb, var4 + 130, -8 + var6 + 75, 16711680, -1);
            }
          } else {
            IsSixCommand.field_C.drawCentered(TextEntrySupport.field_d, 130 + var4, 75 + var6 - 8, 16711680, -1);
          }
        }
        if (ServerTextTemplate.field_e) {
          if (AuctionBidDialog.field_L < QuickChatPhraseCache.field_c) {
            IsSixCommand.field_C.drawCentered(IntDoubleCommand.field_E, 130 + var4, 75 + var8 - 8, 16711680, -1);
          } else {
            if (AuctionBidDialog.field_L <= IndexedSpriteState.field_g) {
              if (AuctionBidDialog.field_L < LocalizedTextLoader.field_f) {
                IsSixCommand.field_C.drawCentered(SpriteNumberPainter.field_b, 130 + var4, 67 + var8, 16711680, -1);
              }
            } else {
              IsSixCommand.field_C.drawCentered(TextEntrySupport.field_d, 130 + var4, var8 + 67, 16711680, -1);
            }
          }
        } else {
          IsSixCommand.field_C.drawCentered(MachineTokenStorageSupport.field_f, var4 + 130, var8 + 67, 16711680, -1);
        }
        for (var11 = 0; var11 < 5; var11++) {
          FriendRemovalSupport.field_d[var11].setBounds(true, FriendRemovalSupport.field_d[var11].field_q, var4 + 10, 26 + (var9 + var11 * 18), FriendRemovalSupport.field_d[var11].field_mb);
          if (FriendRemovalSupport.field_d[var11].field_gb) {
            SoftwareRasterizer.fillRoundedRectangleBlended(FriendRemovalSupport.field_d[var11].field_F, FriendRemovalSupport.field_d[var11].field_T, FriendRemovalSupport.field_d[var11].field_q, FriendRemovalSupport.field_d[var11].field_mb - 2, 6, 16777215, 140);
          }
          if (GameMediaSupport.field_d == var11) {
            WidgetStyleFactory.field_a.draw(10 + (var4 + 74), 26 + var9 - (-(var11 * 18) - 2));
          }
          FriendRemovalSupport.field_d[var11].draw(112, false);
        }
    }

    private final boolean b(int param0, char param1) {
        int var4 = Kickabout.field_G;
        int var3 = 0;
        if (param0 >= -109) {
          return true;
        }
        while (var3 < FaceNormal.field_e.length) {
          if (FaceNormal.field_e[var3] == param1) {
            return true;
          }
          var3++;
        }
        return false;
    }

    AuctionSettingsDialog(int param0) {
        super(18);
        int var3_int = 0;
        UiLayoutNode var7 = null;
        UiLayoutNode var8 = null;
        ArchiveNetworkClient.field_m = param0;
        ServerTextTemplate.field_e = true;
        ClubStateFactory.field_c = GameLoopApplet.field_E.squad[ArchiveNetworkClient.field_m];
        QuickChatPhraseCache.field_c = WidgetStyleFactory.getReducedPlayerValue((byte) -107, ClubStateFactory.field_c);
        IndexedSpriteState.field_g = AuctionPriceLimits.maximumAuctionPrice(ClubStateFactory.field_c, -31);
        LocalizedTextLoader.field_f = QuickChatPhraseCache.field_c;
        BlackFadeScreen.field_l = 8;
        AuctionBidDialog.field_L = PasswordLoginCredentials.calculatePlayerValue(ClubStateFactory.field_c, -576054046) <= 0 ? 1 : PasswordLoginCredentials.calculatePlayerValue(ClubStateFactory.field_c, -576054046);
        UiLayoutNode var9 = new UiLayoutNode();
        FriendRemovalSupport.field_d = new UiLayoutNode[5];
        var9.field_y = 16777215;
        var9.field_ub = 65793;
        var9.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
        var9.field_D = 95;
        for (var3_int = 0; var3_int < 5; var3_int++) {
          FriendRemovalSupport.field_d[var3_int] = new UiLayoutNode();
          var7 = FriendRemovalSupport.field_d[var3_int];
          var8 = var7;
          var8.applyStyle(var9, (byte) -77);
          var7.updateInput(0, true);
          var7.field_E = HighScoreQuery.field_k[var3_int];
          var8.field_mb = 18;
          var8.field_q = 240;
        }
        ChatInputState.field_b = new UiLayoutNode();
        ChatInputState.field_b.field_y = 16777215;
        ChatInputState.field_b.field_B = 5;
        ChatInputState.field_b.field_A = 1;
        ChatInputState.field_b.field_mb = 24;
        ChatInputState.field_b.field_q = 240;
        ChatInputState.field_b.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
        OverlayLayerSupport.field_b = new UiLayoutNode();
        OverlayLayerSupport.field_b.field_B = 40;
        OverlayLayerSupport.field_b.field_mb = 60;
        OverlayLayerSupport.field_b.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
        OverlayLayerSupport.field_b.field_A = 1;
        OverlayLayerSupport.field_b.field_q = 240;
        OverlayLayerSupport.field_b.field_y = 16777215;
        UiLayoutNode var3 = new UiLayoutNode();
        var3.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
        var3.field_p = 1;
        var3.field_A = 1;
        var3.field_y = 16777215;
        UiLayoutNode var10 = new UiLayoutNode(0L, (UiLayoutNode) null);
        var10.field_R = ShopPlayerSlot.createSolidNineSliceSprites((byte) 26, 8947956);
        UiLayoutNode var5 = new UiLayoutNode();
        var5.field_B = 2;
        var5.field_y = 16777215;
        var5.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
        var5.field_D = 5;
        UnreadMessagesScreen.field_A = new TextFieldNode(0L, var3, var10, var5, 20);
        UnreadMessagesScreen.field_A.field_R = null;
        UnreadMessagesScreen.field_A.layoutTextField(-630, 5 + (ChatInputState.field_b.field_q >> 1) - 33, (ChatInputState.field_b.field_mb >> 2) - 2, 4 + (IsSixCommand.field_C.field_G + IsSixCommand.field_C.field_p), 67);
        ChatInputState.field_b.addChild((byte) -113, (UiLayoutNode) (UnreadMessagesScreen.field_A));
        StatChoiceDialog.field_F = new TextFieldNode(0L, var3, var10, var5, 20);
        StatChoiceDialog.field_F.field_R = null;
        StatChoiceDialog.field_F.layoutTextField(-630, 5 + (-33 + (OverlayLayerSupport.field_b.field_q >> 1)), 8 + (OverlayLayerSupport.field_b.field_mb >> 1), 4 + (IsSixCommand.field_C.field_G + IsSixCommand.field_C.field_p), 67);
        OverlayLayerSupport.field_b.addChild((byte) -121, (UiLayoutNode) (StatChoiceDialog.field_F));
        DisplayModeSupport.field_a = new CheckboxLabelWidget(LoggedPlayer.field_k.toLowerCase(), ByteArrayPool.field_d);
        DisplayModeSupport.field_a.field_J = 5;
        DisplayModeSupport.field_a.field_s = 5 + (OverlayLayerSupport.field_b.field_q - DisplayModeSupport.field_a.field_q >> 1);
        AuctionBidDialog.field_I = SoftwareDrawingSupport.createButtonNode(false, 0);
        AccountMessagePanel.field_L = SoftwareDrawingSupport.createButtonNode(true, 0);
        ClientInteractionSupport.field_c = SoftwareDrawingSupport.createButtonNode(false, 0);
        Trinket.field_a = SoftwareDrawingSupport.createButtonNode(true, 0);
        AccountMessagePanel.field_L.field_s = (ChatInputState.field_b.field_q >> 1) + ((AccountMessagePanel.field_L.field_q >> 1) + AccountMessagePanel.field_L.field_q);
        Trinket.field_a.field_s = Trinket.field_a.field_q - (-(Trinket.field_a.field_q >> 1) - (OverlayLayerSupport.field_b.field_q >> 1));
        AuctionBidDialog.field_I.field_s = -(AuctionBidDialog.field_I.field_q >> 1) + (-(AuctionBidDialog.field_I.field_q * 2) + (ChatInputState.field_b.field_q >> 1));
        ClientInteractionSupport.field_c.field_s = (OverlayLayerSupport.field_b.field_q >> 1) + (-(2 * ClientInteractionSupport.field_c.field_q) - (ClientInteractionSupport.field_c.field_q >> 1));
        Trinket.field_a.field_J = 35;
        ClientInteractionSupport.field_c.field_J = 35;
        ChatInputState.field_b.addChild((byte) -108, AuctionBidDialog.field_I);
        ChatInputState.field_b.addChild((byte) -125, AccountMessagePanel.field_L);
        OverlayLayerSupport.field_b.addChild((byte) -117, ClientInteractionSupport.field_c);
        OverlayLayerSupport.field_b.addChild((byte) -115, Trinket.field_a);
        OverlayLayerSupport.field_b.addChild((byte) -113, (UiLayoutNode) (DisplayModeSupport.field_a));
        UnreadMessagesScreen.field_A.setText(Integer.toString(LocalizedTextLoader.field_f), -23174);
        StatChoiceDialog.field_F.setText(Integer.toString(AuctionBidDialog.field_L), -23174);
        this.field_F = true;
        this.field_I = false;
    }

    public static void releaseStatics(int param0) {
        field_J = null;
        if (param0 != -8332) {
          field_H = (Sprite) null;
        }
        field_G = null;
        field_H = null;
    }

    final void onUpdate(int param0, boolean param1) {
        UiLayoutNode stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_44_2 = 0;
        boolean stackIn_47_1 = false;
        UiLayoutNode stackIn_49_0 = null;
        boolean stackIn_50_1 = false;
        UiLayoutNode stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        UiLayoutNode stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        int stackIn_60_0 = 0;
        String stackIn_61_1 = null;
        boolean stackIn_66_0 = false;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_135_0 = 0;
        TextFieldNode stackIn_138_0 = null;
        String stackIn_139_1 = null;
        int stackIn_145_0 = 0;
        TextFieldNode stackIn_149_0 = null;
        String stackIn_150_1 = null;
        int stackIn_163_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_186_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_194_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_200_0 = 0;
        int stackIn_201_1 = 0;
        UiLayoutNode stackIn_204_0 = null;
        boolean stackIn_205_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        String var6_ref_String;
        int var7;
        String var8;
        int var9;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        var9 = Kickabout.field_G;
        for (var3 = 0; var3 < FriendRemovalSupport.field_d.length; var3++) {
          FriendRemovalSupport.field_d[var3].updateInput(0, param1);
        }
        ChatInputState.field_b.updateInput(0, param1);
        OverlayLayerSupport.field_b.updateInput(0, param1);
        UnreadMessagesScreen.field_A.updatePointer(param0 + 11567);
        StatChoiceDialog.field_F.updatePointer(11570);
        for (var3 = 0; var3 < 5; var3++) {
          if (FriendRemovalSupport.field_d[var3].field_gb) {
            if (var3 == GameMediaSupport.field_d) {
              IndexedSpriteState.showTextTooltip(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, AuctionTableWidget.field_Jb, new String[]{HighScoreQuery.field_k[var3]}));
            } else {
              IndexedSpriteState.showTextTooltip(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TrinketPickerDialog.field_H, new String[]{HighScoreQuery.field_k[var3]}));
            }
          }
        }
        if (AccountMessagePanel.field_L.field_Q) {
          if (LocalizedTextLoader.field_f == IndexedSpriteState.field_g) {
            IndexedSpriteState.showTextTooltip(-67, BuyPitchDialog.field_H);
          } else {
            if (ServerTextTemplate.field_e &&
              LocalizedTextLoader.field_f == AuctionBidDialog.field_L) {
              IndexedSpriteState.showTextTooltip(-67, LocalizedTextLoader.field_a);
            } else {
              IndexedSpriteState.showTextTooltip(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, WeightedCacheEntry.field_q, new String[]{LocalizedTextLoader.formatCurrencyAmount(1, 26300)}));
            }
          }
        }
        if (AuctionBidDialog.field_I.field_Q) {
          if (QuickChatPhraseCache.field_c != LocalizedTextLoader.field_f) {
            IndexedSpriteState.showTextTooltip(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ScrollPane.field_Ib, new String[]{LocalizedTextLoader.formatCurrencyAmount(1, 26300)}));
          } else {
            IndexedSpriteState.showTextTooltip(-67, UiWidget.field_j);
          }
        }
        if (Trinket.field_a.field_Q) {
          if (ServerTextTemplate.field_e) {
            if (AuctionBidDialog.field_L == IndexedSpriteState.field_g) {
              IndexedSpriteState.showTextTooltip(-67, SumIntegersCommand.field_E);
            } else {
              IndexedSpriteState.showTextTooltip(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, IntrusiveDequeCursor.field_c, new String[]{LocalizedTextLoader.formatCurrencyAmount(1, param0 ^ 26303)}));
            }
          } else {
            IndexedSpriteState.showTextTooltip(-67, ListRow.field_zb);
          }
        }
        if (ClientInteractionSupport.field_c.field_Q) {
          if (ServerTextTemplate.field_e) {
            if (QuickChatPhraseCache.field_c != AuctionBidDialog.field_L) {
              if (LocalizedTextLoader.field_f == AuctionBidDialog.field_L) {
                IndexedSpriteState.showTextTooltip(-67, SpriteBackgroundSupport.field_e);
              } else {
                IndexedSpriteState.showTextTooltip(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, PlayerStats.field_d, new String[]{LocalizedTextLoader.formatCurrencyAmount(1, 26300)}));
              }
            } else {
              IndexedSpriteState.showTextTooltip(-67, LeaguesScreen.field_C);
            }
          } else {
            IndexedSpriteState.showTextTooltip(-67, ListRow.field_zb);
          }
        }
        stackIn_43_0 = AccountMessagePanel.field_L;
        stackIn_43_1 = LocalizedTextLoader.field_f;
        if (ServerTextTemplate.field_e) {
          stackIn_44_2 = AuctionBidDialog.field_L;
        } else {
          stackIn_44_2 = IndexedSpriteState.field_g;
        }
        stackIn_47_1 = (stackIn_43_1 >= stackIn_44_2) ? false : true;
        stackIn_43_0.field_lb = stackIn_47_1;
        stackIn_49_0 = AuctionBidDialog.field_I;
        stackIn_50_1 = (LocalizedTextLoader.field_f <= QuickChatPhraseCache.field_c) ? false : true;
        stackIn_49_0.field_lb = stackIn_50_1;
        stackIn_52_0 = Trinket.field_a;
        stackIn_53_1 = (IndexedSpriteState.field_g <= AuctionBidDialog.field_L) ? false : true;
        stackIn_52_0.field_lb = stackIn_53_1 & ServerTextTemplate.field_e;
        stackIn_55_0 = ClientInteractionSupport.field_c;
        stackIn_56_1 = (AuctionBidDialog.field_L <= LocalizedTextLoader.field_f) ? false : true;
        stackIn_55_0.field_lb = stackIn_56_1 & ServerTextTemplate.field_e;
        if (DisplayModeSupport.field_a.field_gb) {
          stackIn_60_0 = -67;
          if (ServerTextTemplate.field_e) {
            stackIn_61_1 = GeneratedPanelPainter.field_i;
          } else {
            stackIn_61_1 = FullscreenFailureReason.field_c;
          }
          IndexedSpriteState.showTextTooltip(stackIn_60_0, stackIn_61_1);
        }
        if (DisplayModeSupport.field_a.field_sb == 1) {
          stackIn_66_0 = !(ServerTextTemplate.field_e);
          ServerTextTemplate.field_e = stackIn_66_0;
          ShopPlayerSlot.playDefaultFadingSound(61, -17);
          if (ServerTextTemplate.field_e) {
            StatChoiceDialog.field_F.setText(Integer.toString(AuctionBidDialog.field_L), -23174);
          } else {
            StatChoiceDialog.field_F.setText("", -23174);
          }
        }
        DisplayModeSupport.field_a.field_Gb = ServerTextTemplate.field_e;
        if (UnreadMessagesScreen.field_A.field_sb == 1) {
          this.field_I = false;
          this.field_F = true;
        }
        if (StatChoiceDialog.field_F.field_sb == 1) {
          this.field_F = false;
          this.field_I = true;
        }
        if (!ServerTextTemplate.field_e) {
          this.field_I = false;
        }
        var3 = 0;
        var4 = 0;
        var5 = 5;
        for (var6 = 0; var6 < 3; var6++) {
          if (AccountMessagePanel.field_L.field_qb == 1) {
            if (AlternateKeyedLoginCredentials.field_o % var5 == 0) {
              if (!ServerTextTemplate.field_e) {
                stackIn_85_0 = IndexedSpriteState.field_g;
              } else {
                stackIn_85_0 = AuctionBidDialog.field_L;
              }
              if (stackIn_85_0 > LocalizedTextLoader.field_f) {
                LocalizedTextLoader.field_f = LocalizedTextLoader.field_f + 1;
                if (ServerTextTemplate.field_e) {
                  stackIn_89_0 = AuctionBidDialog.field_L;
                } else {
                  stackIn_89_0 = IndexedSpriteState.field_g;
                }
                if (stackIn_89_0 < LocalizedTextLoader.field_f) {
                  if (ServerTextTemplate.field_e) {
                    stackIn_93_0 = AuctionBidDialog.field_L;
                  } else {
                    stackIn_93_0 = IndexedSpriteState.field_g;
                  }
                  LocalizedTextLoader.field_f = stackIn_93_0;
                }
                ShopPlayerSlot.playDefaultFadingSound(60, param0 ^ -17);
                var4 = 1;
              }
            }
            var3 = 1;
          }
          if (1 == AuctionBidDialog.field_I.field_qb) {
            if (AlternateKeyedLoginCredentials.field_o % var5 == 0 &&
              QuickChatPhraseCache.field_c < LocalizedTextLoader.field_f) {
              LocalizedTextLoader.field_f = LocalizedTextLoader.field_f - 1;
              if (LocalizedTextLoader.field_f < QuickChatPhraseCache.field_c) {
                LocalizedTextLoader.field_f = QuickChatPhraseCache.field_c;
              }
              ShopPlayerSlot.playDefaultFadingSound(59, -94);
              var4 = 1;
            }
            var3 = 1;
          }
          if (Trinket.field_a.field_qb == 1) {
            if (0 == AlternateKeyedLoginCredentials.field_o % var5 &&
              AuctionBidDialog.field_L < IndexedSpriteState.field_g) {
              AuctionBidDialog.field_L = AuctionBidDialog.field_L + 1;
              if (AuctionBidDialog.field_L > IndexedSpriteState.field_g) {
                AuctionBidDialog.field_L = IndexedSpriteState.field_g;
              }
              ShopPlayerSlot.playDefaultFadingSound(60, param0 - 125);
              var4 = 1;
            }
            var3 = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          if (1 == ClientInteractionSupport.field_c.field_qb) {
            if (AlternateKeyedLoginCredentials.field_o % var5 == 0) {
              if (LocalizedTextLoader.field_f >= AuctionBidDialog.field_L) {
                var3 = 1;
                decompiledFrameRemainder1 = false;
              }
              else {
                AuctionBidDialog.field_L = AuctionBidDialog.field_L - 1;
                if (AuctionBidDialog.field_L < LocalizedTextLoader.field_f) {
                  AuctionBidDialog.field_L = LocalizedTextLoader.field_f;
                }
                ShopPlayerSlot.playDefaultFadingSound(59, 88);
                var4 = 1;
              }
            }
            if (decompiledFrameRemainder1) {
              var3 = 1;
            }
          }
        }
        if (var3 == 0) {
          AlternateKeyedLoginCredentials.field_o = 0;
        } else {
          AlternateKeyedLoginCredentials.field_o = AlternateKeyedLoginCredentials.field_o + 1;
        }
        if (var4 != 0) {
          this.field_F = false;
          this.field_I = false;
          var6_ref_String = UnreadMessagesScreen.field_A.getText((byte) -16);
          if (var6_ref_String != null &&
            var6_ref_String.length() > 0) {
            stackIn_135_0 = Integer.parseInt(var6_ref_String);
          } else {
            stackIn_135_0 = 0;
          }
          var7 = stackIn_135_0;
          if (var7 != LocalizedTextLoader.field_f) {
            stackIn_138_0 = UnreadMessagesScreen.field_A;
            if (LocalizedTextLoader.field_f > 0) {
              stackIn_139_1 = Integer.toString(LocalizedTextLoader.field_f);
            } else {
              stackIn_139_1 = "";
            }
            ((TextFieldNode) (Object) stackIn_138_0).setText(stackIn_139_1, -23174);
          }
          if (ServerTextTemplate.field_e) {
            var8 = StatChoiceDialog.field_F.getText((byte) -16);
            if (var8 != null &&
              var8.length() > 0) {
              stackIn_145_0 = Integer.parseInt(var8);
            } else {
              stackIn_145_0 = 0;
            }
            var7Lifetime5 = stackIn_145_0;
            if (var7Lifetime5 != AuctionBidDialog.field_L) {
              stackIn_149_0 = StatChoiceDialog.field_F;
              if (AuctionBidDialog.field_L <= 0) {
                stackIn_150_1 = "";
              } else {
                stackIn_150_1 = Integer.toString(AuctionBidDialog.field_L);
              }
              ((TextFieldNode) (Object) stackIn_149_0).setText(stackIn_150_1, -23174);
            }
          }
        }
        for (var6Lifetime1 = 0; FriendRemovalSupport.field_d.length > var6Lifetime1; var6Lifetime1++) {
          if (FriendRemovalSupport.field_d[var6Lifetime1].field_sb == 1) {
            GameMediaSupport.field_d = var6Lifetime1;
            ShopPlayerSlot.playDefaultFadingSound(61, 14);
            this.field_I = false;
            this.field_F = false;
          }
        }
        if (UnreadMessagesScreen.field_A.getText((byte) -16) != null &&
          UnreadMessagesScreen.field_A.getText((byte) -16).length() > 0) {
          stackIn_163_0 = Integer.parseInt(UnreadMessagesScreen.field_A.getText((byte) -16));
        } else {
          stackIn_163_0 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var6Lifetime2 = stackIn_163_0;
        if (var6Lifetime2 >= QuickChatPhraseCache.field_c &&
          IndexedSpriteState.field_g >= var6Lifetime2 && (!ServerTextTemplate.field_e ||
          !(var6Lifetime2 > AuctionBidDialog.field_L))) {
          UnreadMessagesScreen.field_A.setTextColour(16777215, (byte) 120);
          decompiledFrameRemainder0 = false;
        }
        else {
          UnreadMessagesScreen.field_A.setTextColour(16711680, (byte) 125);
        }
        if (ServerTextTemplate.field_e) {
          if (StatChoiceDialog.field_F.getText((byte) -16) != null &&
            StatChoiceDialog.field_F.getText((byte) -16).length() > 0) {
            stackIn_176_0 = Integer.parseInt(StatChoiceDialog.field_F.getText((byte) -16));
          } else {
            stackIn_176_0 = 0;
          }
          var7Lifetime1 = stackIn_176_0;
          if (QuickChatPhraseCache.field_c <= var7Lifetime1 &&
            var7Lifetime1 <= IndexedSpriteState.field_g &&
            LocalizedTextLoader.field_f <= var7Lifetime1) {
            StatChoiceDialog.field_F.setTextColour(16777215, (byte) 126);
          } else {
            StatChoiceDialog.field_F.setTextColour(16711680, (byte) -127);
          }
        }
        var7Lifetime2 = 1;
        stackIn_183_0 = var7Lifetime2;
        stackIn_184_1 = (IndexedSpriteState.field_g < LocalizedTextLoader.field_f) ? 0 : 1;
        var7Lifetime3 = stackIn_183_0 & stackIn_184_1;
        stackIn_186_0 = var7Lifetime3;
        stackIn_187_1 = (QuickChatPhraseCache.field_c > LocalizedTextLoader.field_f) ? 0 : 1;
        var7Lifetime4 = stackIn_186_0 & stackIn_187_1;
        if (ServerTextTemplate.field_e) {
          stackIn_191_0 = var7Lifetime4;
          stackIn_192_1 = (AuctionBidDialog.field_L < LocalizedTextLoader.field_f) ? 0 : 1;
          var7Lifetime4 = stackIn_191_0 & stackIn_192_1;
          stackIn_194_0 = var7Lifetime4;
          stackIn_195_1 = (AuctionBidDialog.field_L < LocalizedTextLoader.field_f) ? 0 : 1;
          var7Lifetime4 = stackIn_194_0 & stackIn_195_1;
          stackIn_197_0 = var7Lifetime4;
          stackIn_198_1 = (AuctionBidDialog.field_L > IndexedSpriteState.field_g) ? 0 : 1;
          var7Lifetime4 = stackIn_197_0 & stackIn_198_1;
          stackIn_200_0 = var7Lifetime4;
          stackIn_201_1 = (AuctionBidDialog.field_L < QuickChatPhraseCache.field_c) ? 0 : 1;
          var7Lifetime4 = stackIn_200_0 & stackIn_201_1;
        }
        stackIn_204_0 = this.field_i[0];
        stackIn_205_1 = (var7Lifetime4 == 0) ? false : true;
        stackIn_204_0.field_lb = stackIn_205_1;
        if (param0 != 3) {
          this.handleKey(-126, (byte) 75, '￺');
        }
    }

    static {
    }
}
