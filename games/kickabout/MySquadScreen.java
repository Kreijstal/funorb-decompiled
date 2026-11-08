/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MySquadScreen extends TeamManagementScreen {
    private SquadGridWidget field_L;
    private UiLayoutNode field_X;
    private UiLayoutNode field_W;
    private TrinketSlot[] field_T;
    private UiLayoutNode field_R;
    static String field_F;
    private UiLayoutNode field_P;
    private int field_S;
    static String field_O;
    static Sprite[] field_U;
    private UiLayoutNode[] field_K;
    static UiLayoutNode field_N;
    private UiLayoutNode field_Q;
    static String field_M;
    private UiLayoutNode field_V;
    private UiLayoutNode field_Y;
    static String field_J;
    private UiLayoutNode field_I;
    static ResourceArchive field_H;
    private UiLayoutNode field_G;

    final void enterScreen(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        super.enterScreen(param0, param1, param2);
        this.field_V.field_jb = new IntrusiveDeque();
        this.field_L = new SquadGridWidget(RegistrationRequestState.field_h);
        this.field_V.addChild((byte) -113, (UiLayoutNode) (this.field_L));
        this.field_V.setBounds(true, 12 + this.field_L.field_q, 3, 60, 12 + this.field_L.field_mb + 30);
        this.field_L.field_J = 36;
        this.field_L.field_s = 6;
        for (var4 = 0; var4 < 9; var4++) {
          MessageDialog.field_A[var4] = null;
        }
        ValidationIndicator.field_F = false;
        if (PlayArea.isGuestSession(100)) {
        } else {
          if (!RegistrationRequestState.field_h.hasActiveAuctionEntries(-4)) {
            ValidationIndicator.field_F = true;
          } else {
            FootballerAiOverlaySupport.field_d.writeIsaacByte(63, (byte) -86);
          }
        }
        this.rebuildPlayerPanel(param0 - 46);
        this.field_L.field_Fb = -1;
    }

    final void drawOverlay(boolean param0, int param1) {
        if (param1 < 99) {
          this.field_S = 96;
        }
        MatchHudSupport.drawNumericRewardPanel(this.slideOffsetX, -12452);
    }

    final void refreshSelectedPlayer(byte param0) {
        this.field_L.update(param0 - 36);
        if (param0 != 84) {
          this.field_R = (UiLayoutNode) null;
        }
        if (this.field_L.field_Fb != -1 &&
          this.field_L.getSelectedSlot((byte) 21).field_Eb.isEmpty(-2)) {
          this.field_L.field_Fb = -1;
        }
        this.rebuildPlayerPanel(-111);
    }

    final static int worldToScreenX(int param0, int param1) {
        if (param0 >= -15) {
          field_N = (UiLayoutNode) null;
        }
        return ((int)((double)InstrumentNoteMask.field_i * (-UiLayoutNode.field_K + (double)param1)) >> 8) + 320;
    }

    public static void releaseStatics(int param0) {
        field_O = null;
        field_F = null;
        field_M = null;
        if (param0 != -2010043359) {
          return;
        }
        field_U = null;
        field_H = null;
        field_N = null;
        field_J = null;
    }

    final void updateScreen(byte param0, boolean param1) {
        int var6_int = 0;
        int var5 = 0;
        SquadSlotWidget var3;
        PlayerStats var4_ref_up;
        int var4;
        TrinketSlot[] var5_ref_pu__;
        Trinket var6;
        TrinketSlot var7;
        int var8;
        var8 = Kickabout.field_G;
        super.updateScreen((byte) -55, param1);
        this.field_R.field_s = this.slideOffsetX;
        this.field_L.update(48);
        this.field_R.updateInput(0, param1);
        if (this.field_S != this.field_L.field_Fb) {
          this.field_S = this.field_L.field_Fb;
          this.rebuildPlayerPanel(-49);
        }
        var3 = this.field_L.getSelectedSlot((byte) 21);
        if (var3 != null) {
          var4_ref_up = this.field_L.getSelectedSlot((byte) 21).field_Eb;
          var5_ref_pu__ = this.field_T;
          for (var6_int = 0; var6_int < var5_ref_pu__.length; var6_int++) {
            var7 = var5_ref_pu__[var6_int];
            var7.h((byte) 30);
          }
          if (this.field_Q.field_sb == 1) {
            NineSlicePanelPainter.a((byte) -120, -1, RegistrationRequestState.field_h.field_q[this.field_L.field_Fb], var4_ref_up);
          }
          for (var5 = 0; this.field_K.length > var5; var5++) {
            if (1 == this.field_K[var5].field_sb) {
              var6 = GeneratedPanelPainter.field_g[var4_ref_up.trinketIds[var5]];
              RotaryDialWidget.c(-1, RegistrationRequestState.field_h.field_q[this.field_L.field_Fb], var5, var6.field_k);
            }
          }
        }
        var4 = -47 / ((param0 - 38) / 60);
    }

    MySquadScreen() {
        this.field_S = -1;
    }

    final void drawScreen(int param0, boolean param1) {
        int var17_int = 0;
        PlayerStats stackIn_6_0;
        int stackIn_6_1;
        PlayerStats stackIn_6_2;
        int stackIn_6_3;
        boolean stackIn_7_4 = false;
        boolean stackIn_11_2 = false;
        String stackIn_22_0 = null;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        UiLayoutNode var3;
        SquadSlotWidget var4;
        BinaryBitmapFont var5;
        String var6;
        ArgbSprite var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15_int;
        TrinketSlot[] var15;
        ReceivedAuctionItem var15_ref;
        int var16;
        String var17;
        int var18;
        int var19;
        String var20;
        int var21;
        int var22;
        TrinketSlot[] var23;
        TrinketSlot var24;
        UiLayoutNode var25;
        PlayerStats var26;
        TrinketSlot var27;
        ReceivedAuctionItem var28;
        int var11Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var18Lifetime1;
        String var17Lifetime1;
        var22 = Kickabout.field_G;
        super.drawScreen(param0, param1);
        var25 = this.field_Y;
        SoftwareRasterizer.fillRectangleAlpha(var25.field_F, var25.field_T, var25.field_q, var25.field_mb, 65793, 96);
        var3 = (UiLayoutNode) (this.field_Y.field_jb.first(24009));
        while (var3 != null) {
          SoftwareRasterizer.fillRoundedRectangleBlended(var3.field_F, var3.field_T, var3.field_q, var3.field_mb, 10, 65793, 96);
          ByteArrayPool.field_d.drawText(var3.field_E, var3.field_F + 10, var3.field_T + 20, 16777215, -1);
          var3 = (UiLayoutNode) (this.field_Y.field_jb.next(33));
        }
        boolean decompiledFrameRemainder0 = true;
        SoftwareRasterizer.darkenRectangle(this.field_V.field_F, this.field_V.field_T, this.field_V.field_q, this.field_V.field_mb);
        ByteArrayPool.field_d.drawText(ArchivePreloadEntry.field_b, 14 + this.field_V.field_F, 25 + this.field_V.field_T, 16777215, -1);
        this.field_L.drawSquadSlots((byte) -109);
        var4 = this.field_L.getSelectedSlot((byte) 21);
        var5 = IsSixCommand.field_C;
        if (var4 == null) {
          var5.drawParagraph(ContextMenu.field_Db, 20 + this.field_I.field_F, this.field_I.field_T + 10, this.field_I.field_q - 40, -10 + this.field_I.field_mb, 14540253, -1, 1, 1, 16);
        } else {
          var26 = this.field_L.getSelectedSlot((byte) 21).field_Eb;
          stackIn_6_0 = var26;
          stackIn_6_1 = 0;
          stackIn_6_2 = var26;
          stackIn_6_3 = -107;
          stackIn_7_4 = !(TextFieldValidator.areAccountTrinketsDisabled(param0 ^ 4));
          stackIn_11_2 = (((PlayerStats) (Object) stackIn_6_2).hasActiveHorrorCostume((byte) stackIn_6_3, stackIn_7_4)) && (AccountRegistrationResponse.isHalloweenAppearanceEnabled((byte) 47));
          var7 = TriangleMesh.getPlayerPortraitWithClubDefaults(stackIn_6_0, stackIn_6_1, stackIn_11_2);
          var8 = -36 + this.field_I.field_F + this.field_I.field_q;
          var9 = this.field_I.field_T + 40;
          if (var7 != null) {
            ((Sprite) ((Object) var7)).draw(var8 - (((Sprite) ((Object) var7)).field_o >> 1), -(((Sprite) ((Object) var7)).field_v >> 1) + var9);
          } else {
            ReceivedAuctionItemRow.a(var8, param0 - 94, var9);
          }
          var10 = 60 + this.field_I.field_F;
          var11 = 44 + this.field_I.field_T;
          var12 = 10;
          var5.drawRightAligned(field_O, var10, var11, 268435455, -1);
          var5.drawText(var26.getDisplayName(100), var10 + var12, var11, 268435455, -1);
          var11 += 22;
          var5.drawRightAligned(PromotionDialog.field_H, var10, var11, 268435455, -1);
          var5.drawText(RegistrationUiSupport.field_e[var26.archetype], var10 + var12, var11, 268435455, -1);
          var11Lifetime1 = -10 + (this.field_I.field_T + this.field_I.field_mb);
          var13 = this.field_W.field_F + (-100 + this.field_W.field_q >> 1);
          var14 = this.field_W.field_T + 32;
          SoftwareDrawingSupport.drawStatBar(var13, var14, var26.power, 0, true, var26.trinketPowerBonus(true, IntValueNode.b(param0 - 73)));
          var14 += 18;
          SoftwareDrawingSupport.drawStatBar(var13, var14, var26.speed, 1, true, var26.trinketSpeedBonus(param0 + 5210, IntValueNode.b(-89)));
          var14 += 18;
          SoftwareDrawingSupport.drawStatBar(var13, var14, var26.tackle, 2, true, var26.trinketTackleBonus((byte) 108, IntValueNode.b(param0 ^ 95)));
          if (var26.power == 100 &&
            100 == var26.tackle &&
            var26.speed == 100) {
            var5.drawParagraph(AccountRegistrationPanel.field_M, this.field_P.field_F + 10, this.field_P.field_T + 31, -20 + this.field_P.field_q, -60 + this.field_P.field_mb, 11184810, -1, 0, 1, 16);
          } else {
            var15_int = this.field_P.field_F + (-100 + this.field_P.field_q >> 1);
            var16 = 36 + this.field_P.field_T;
            SoftwareDrawingSupport.drawStatBar(var15_int, var16, var26.experience, 3, true, 0);
            if (!this.field_Q.isLinked((byte) -113)) {
              if (!this.field_L.getSelectedSlot((byte) 21).field_Gb) {
                stackIn_22_0 = SessionUrlSupport.field_a;
              } else {
                stackIn_22_0 = TournamentChampionDialog.field_H;
              }
              var17 = stackIn_22_0;
              var5.drawParagraph(var17, this.field_P.field_F + 10, 51 + this.field_P.field_T, -20 + this.field_P.field_q, this.field_P.field_mb - 60, 11184810, -1, 0, 1, 16);
            }
          }
          var14 += 18;
          if (var26.trinketIds.length == 0 &&
            !TextFieldValidator.areAccountTrinketsDisabled(param0 + 4)) {
            var5.drawParagraph(MenuButton.field_o, this.field_X.field_F, this.field_X.field_T, this.field_X.field_q, this.field_X.field_mb, 16777215, -1, 1, 1, 0);
          } else {
            var23 = this.field_T;
            var15 = var23;
            for (var16Lifetime1 = 0; var23.length > var16Lifetime1; var16Lifetime1++) {
              var24 = var23[var16Lifetime1];
              var27 = var24;
              ConsoleTokenCursor.field_d.drawCentered(ValidationState.field_b[var24.field_Bb.field_h], var27.field_F + (var27.field_q >> 1), var27.field_mb + var27.field_T + 14, 16777215, -1);
            }
          }
          var28 = MessageDialog.field_A[RegistrationRequestState.field_h.field_q[this.field_L.field_Fb]];
          var15_ref = var28;
          if (!ModelMaterialDecoder.field_g) {
            if (var15_ref != null &&
              !PlayArea.isGuestSession(param0 + 105)) {
              if (!ValidationIndicator.field_F) {
                ReceivedAuctionItemRow.a(this.field_G.field_F + (this.field_G.field_q >> 1), -32, (this.field_G.field_mb >> 1) + this.field_G.field_T);
              } else {
                var16Lifetime2 = var28.field_v;
                for (var17_int = 0; 3 > var17_int; var17_int++) {
                  var18 = this.field_G.field_F + (this.field_G.field_q >> 1);
                  var19 = 46 + this.field_G.field_T + var17_int * 18;
                  var21 = 16777215;
                  if (var17_int == 0) {
                    if (var16Lifetime2 == -1) {
                      var20 = ListingRowCache.field_d;
                      var21 = 13421772;
                    } else {
                      var20 = LocalizedTextLoader.formatCurrencyAmount(var16Lifetime2, param0 ^ -26297);
                    }
                  } else {
                    if (var17_int != 1) {
                      var20 = MatchHudRoutingSupport.field_c[var28.field_s];
                    } else {
                      if (var28.field_r) {
                        var20 = LocalizedTextLoader.formatCurrencyAmount(var28.field_t, 26300);
                      } else {
                        var21 = 13421772;
                        var20 = ShopPlayerSlot.field_Rb;
                      }
                    }
                  }
                  var5.drawRightAligned(WaitForPlayersView.field_j[var17_int], -7 + var18, var19, var21, -1);
                  var5.drawText(var20, var18, var19, 16777215, -1);
                }
                var17Lifetime1 = SquadSlotWidget.field_Bb;
                var18Lifetime1 = 65280;
                if (RegistrationRequestState.field_h.hasOwnEntry(1, var28.field_a)) {
                  var18Lifetime1 = 16711680;
                  var17Lifetime1 = ClientException.field_b;
                }
                var5.drawParagraph(var17Lifetime1, 10 + this.field_G.field_F, 75 + this.field_G.field_T, -20 + this.field_G.field_q, 50, var18Lifetime1, -1, 1, 1, 0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var5.drawParagraph(VerticalScrollbar.field_Eb, 10 + this.field_G.field_F, this.field_G.field_T, -20 + this.field_G.field_q, this.field_G.field_mb, 11184810, -1, 1, 1, 16);
            }
          } else {
            var5.drawParagraph(BufferedCacheFile.field_d, this.field_G.field_F + 10, this.field_G.field_T, -20 + this.field_G.field_q, this.field_G.field_mb, 11184810, -1, 1, 1, 16);
          }
        }
        this.field_R.draw(param0 + 129, false);
        if (var4 != null) {
          if (TextFieldValidator.areAccountTrinketsDisabled(-1)) {
            stackIn_61_0 = -1;
            stackIn_61_1 = ~this.field_L.getSelectedSlot((byte) 21).field_Eb.trinketIds.length;
            if (stackIn_61_0 > stackIn_61_1) {
              SoftwareDrawingSupport.darkenRectangle(this.field_X.field_F, this.field_X.field_T, this.field_X.field_q, this.field_X.field_mb);
            }
            var6 = AuctionsScreen.field_M;
            var5.drawRightAligned(var6, this.field_X.field_q + this.field_X.field_F - 20, 22 + this.field_X.field_T, 16777215, -1);
          } else {
            if (var4.field_Gb) {
              var6 = OffscreenPlayerArrow.field_e;
              var5.drawCentered(var6, (this.field_X.field_q >> 1) + this.field_X.field_F, 109 + this.field_X.field_T, 11184810, -1);
            }
          }
        }
    }

    private final void rebuildPlayerPanel(int param0) {
        int var7 = 0;
        UiLayoutNode stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        String stackIn_15_0 = null;
        int var3;
        PlayerStats var4;
        PlayerStats var5;
        int var6;
        Trinket var8;
        TrinketSlot var9;
        String var10;
        int var11;
        int var12;
        SquadSlotWidget var13;
        var12 = Kickabout.field_G;
        var13 = this.field_L.getSelectedSlot((byte) 21);
        this.field_Q.unlink((byte) -109);
        this.field_X.field_jb = new IntrusiveDeque();
        var3 = -36 / ((param0 - 11) / 33);
        if (var13 != null) {
          var4 = var13.field_Eb;
          if (var4.experience >= 100 && (!(100 <= var4.power) ||
            !(var4.speed >= 100) ||
            !(100 <= var4.tackle))) {
            stackIn_8_0 = this.field_Q;
            stackIn_9_1 = !(var13.field_Gb);
            stackIn_8_0.field_lb = stackIn_9_1;
            this.field_P.addChild((byte) -106, this.field_Q);
          }
          var5 = var13.field_Eb;
          this.field_K = new UiLayoutNode[var5.trinketIds.length];
          this.field_T = new TrinketSlot[var5.trinketIds.length];
          var6 = this.field_X.field_q - 150 * (-1 + var5.trinketIds.length) >> 1;
          for (var7 = 0; var7 < this.field_K.length; var7++) {
            var8 = GeneratedPanelPainter.field_g[var5.trinketIds[var7]];
            var9 = new TrinketSlot(var8, false);
            if (var8.isEmpty(256)) {
              stackIn_15_0 = TickClock.field_f;
            } else {
              stackIn_15_0 = DateInputWidget.field_E;
            }
            var10 = stackIn_15_0;
            this.field_K[var7] = SoftwareDrawingSupport.createTextButton(var10, 7126504);
            var11 = var6 + var7 * 150;
            var9.field_s = var11 - (var9.field_q >> 1);
            var9.field_J = 36;
            this.field_X.addChild((byte) -113, (UiLayoutNode) (var9));
            this.field_K[var7].field_s = -(this.field_K[var7].field_q >> 1) + var11;
            this.field_K[var7].field_J = 90;
            this.field_T[var7] = var9;
            this.field_X.addChild((byte) -117, (UiLayoutNode) (this.field_T[var7]));
            if (!var13.field_Gb &&
              !TextFieldValidator.areAccountTrinketsDisabled(-1)) {
              this.field_X.addChild((byte) -108, this.field_K[var7]);
            }
          }
        }
        this.field_R.updateInput(0, false);
    }

    final void buildWidgets(int param0) {
        this.field_V = new UiLayoutNode();
        this.field_Y = new UiLayoutNode();
        this.field_Y.setBounds(true, 452, 180, 60, 358);
        this.field_I = new UiLayoutNode();
        this.field_I.setBounds(true, 234, 6, 6, 84);
        this.field_G = new UiLayoutNode();
        this.field_G.setBounds(true, 234, 6, 96, 124);
        this.field_W = new UiLayoutNode();
        this.field_W.setBounds(true, 200, 246, 6, 100);
        this.field_P = new UiLayoutNode();
        this.field_P.setBounds(true, 200, 246, 112, 108);
        this.field_X = new UiLayoutNode();
        this.field_X.setBounds(true, 440, 6, 226, 126);
        if (param0 != -38) {
          this.field_L = (SquadGridWidget) null;
        }
        this.field_I.field_E = ClientUiOverlay.field_g.toLowerCase();
        this.field_W.field_E = ConsoleTokenCursor.field_f.toLowerCase();
        this.field_P.field_E = ConsoleParseException.field_d.toLowerCase();
        this.field_G.field_E = GradientRasterSupport.field_d.toLowerCase();
        this.field_X.field_E = BlobSubmission.field_k.toLowerCase();
        this.field_Q = SoftwareDrawingSupport.createTextButton(NodeHashTableIterator.field_c, 7126504);
        this.field_K = new UiLayoutNode[]{};
        this.field_T = new TrinketSlot[]{};
        this.field_Q.field_s = -this.field_Q.field_q + this.field_P.field_q >> 1;
        this.field_Q.field_J = 66;
        this.field_Y.addChild((byte) -115, this.field_X);
        this.field_Y.addChild((byte) -109, this.field_I);
        this.field_Y.addChild((byte) -126, this.field_W);
        this.field_Y.addChild((byte) -115, this.field_P);
        this.field_Y.addChild((byte) -104, this.field_G);
        this.field_R = new UiLayoutNode();
        this.field_R.setBounds(true, 640, 640, 0, 480);
        this.field_R.addChild((byte) -125, this.field_V);
        this.field_R.addChild((byte) -109, this.field_Y);
    }

    final int buttonCenterX(int param0, int param1) {
        if (param1 != -22667) {
          this.field_V = (UiLayoutNode) null;
        }
        return param0 != 1 ? 320 : 600;
    }

    static {
        field_F = "To <%0>: ";
        field_O = "Name: ";
        field_M = "Passwords must be between 5 and 20 characters long";
        field_J = "Use the buttons to choose your formation. Click OK when ready.";
    }
}
