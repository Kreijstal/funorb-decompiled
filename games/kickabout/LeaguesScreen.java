/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LeaguesScreen extends ButtonMenuScreen {
    static String field_C;
    static Sprite[] field_E;
    private int field_D;
    static Sprite[] field_B;
    static int field_A;
    static Sprite field_G;
    static String[] field_F;

    final int buttonCenterX(int param0, int param1) {
        if (PlayArea.isGuestSession(100)) {
          if (param0 == 0) {
            return 25 + (this.buttons[0].width >> 1);
          }
          if (param0 == 1) {
            return -(this.buttons[1].width >> 1) + 340;
          }
        }
        if (param1 != -22667) {
          return -84;
        }
        return super.buttonCenterX(param0, -22667);
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        super.enterScreen(param0, param1, param2);
        SquadGridWidget.field_Gb = -1;
        AnimationSkeleton.field_k = GameLoopApplet.field_E.field_t;
        PlayerContextMenu.field_f = false;
        LineupView.field_y.clear(72);
        TournamentChampionDialog.b(AnimationSkeleton.field_k, 500);
    }

    final static String charToString(char param0, byte param1) {
        if (param1 != -83) {
          LeaguesScreen.releaseStatics(77);
        }
        return String.valueOf(param0);
    }

    final void setTransitionProgress(int param0, boolean param1, int param2, AppScreen param3) {
        try {
          super.setTransitionProgress(param0, param1, -116, param3);
          if (param2 >= -28) {
            field_F = (String[]) null;
          }
          MenuButton.field_e.setBounds(true, 640, this.slideOffsetX, 0, 480);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "bn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateScreen(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_1 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_42_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Kickabout.field_G;
        super.updateScreen((byte) -71, param1);
        stackIn_2_0 = param1;
        stackIn_3_1 = (PlayArea.isGuestSession(100)) ? false : true;
        param1 = stackIn_2_0 & stackIn_3_1;
        stackIn_5_0 = param1;
        stackIn_6_1 = (TextEntrySupport.field_f) ? false : true;
        param1 = stackIn_5_0 & stackIn_6_1;
        if (this.field_D > 0) {
          this.field_D = this.field_D - 1;
        }
        var3 = AuctionTableWidget.field_Hb.field_Db.field_J;
        MenuButton.field_e.updateInput(0, param1);
        DialogOverlay.field_b.updatePointer(11570);
        var4 = -32 % ((38 - param0) / 60);
        if (FadingSoundPlayer.field_w > 0) {
          FadingSoundPlayer.field_w = FadingSoundPlayer.field_w - 1;
        }
        var5 = AnimationSkeleton.field_k;
        if (SpriteBackgroundSupport.field_b + ByteArrayPool.field_d.stringWidth(ContextMenu.field_Jb) >= 20) {
          SpriteBackgroundSupport.field_b = SpriteBackgroundSupport.field_b - 1;
        } else {
          SpriteBackgroundSupport.field_b = 370;
        }
        var6 = 0;
        for (var7 = 0; var7 < WelcomeDialog.field_H.length; var7++) {
          if (WelcomeDialog.field_H[var7].field_sb == 1) {
            TournamentChampionDialog.b(var7, 500);
            AnimationSkeleton.field_k = var7;
            SquadGridWidget.field_Gb = 0;
            var5 = var7;
            AuctionTableWidget.field_Hb.field_Db.field_J = 0;
            LoginKind.a((byte) 80);
            var6 = 1;
          }
        }
        if (1 == ScrollPane.field_Cb.field_sb &&
          DialogOverlay.field_b.getText((byte) -16).length() > 0) {
          ShopPlayerSlot.a(DialogOverlay.field_b.getText((byte) -16), (byte) 74);
          DialogOverlay.field_b.setText("", -23174);
          LoginKind.a((byte) -105);
        }
        boolean decompiledFrameRemainder0 = true;
        if (PlayerContextMenu.field_f) {
          fieldTemp$0 = BeveledTextPainter.field_t - 1;
          BeveledTextPainter.field_t = BeveledTextPainter.field_t - 1;
          if (fieldTemp$0 > 0) {
            stackIn_29_0 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_29_0 = false;
        }
        PlayerContextMenu.field_f = stackIn_29_0;
        AuctionTableWidget.field_Hb.updateInput(0, param1);
        AuctionTableWidget.field_Hb.advanceScroll(32 * StatefulTextPainter.field_v, false, (byte) -111, 32);
        if (var6 == 0) {
          var7 = ReceivedAuctionItem.a(18, -(AuctionTableWidget.field_Hb.field_Db.field_J + 5), (byte) -72);
          LineupView.field_y.evictExpired(30 + var7, -20 + var7, -108);
          CheckboxPainter.a((byte) 125, -10 + var7, var7 + 20, var5);
          if (SquadGridWidget.field_Gb != var7 ||
            AnimationSkeleton.field_k != var5) {
            AnimationSkeleton.field_k = var5;
            SquadGridWidget.field_Gb = var7;
            SectorCacheStore.a(89);
          }
        }
        if (DialogOverlay.field_b.field_gb) {
          IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, IterableNodeHashTable.field_a);
        }
        var7 = 0;
        while (var7 < WelcomeDialog.field_H.length) {
          stackIn_42_0 = WelcomeDialog.field_H[var7].field_gb;
          if (stackIn_42_0) {
            IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, GrowableIntList.field_f, new String[]{ConsoleTokenCursor.field_h[var7]}));
          }
          var7++;
        }
        if (AuctionTableWidget.field_Hb.field_Db.field_J > var3 &&
          this.field_D == 0) {
          ShopPlayerSlot.c(59, 76);
          this.field_D = 5;
        }
        if (AuctionTableWidget.field_Hb.field_Db.field_J < var3 &&
          0 == this.field_D) {
          ShopPlayerSlot.c(60, -118);
          this.field_D = 5;
        }
        return;
    }

    final void buildWidgets(int param0) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (ContextMenu.field_Jb == null) {
          ContextMenu.field_Jb = IconLabel.field_zb;
          if (PlayArea.isGuestSession(100)) {
            ContextMenu.field_Jb = SectorCacheStore.field_g;
          }
        }
        MenuButton.field_e = new UiLayoutNode();
        MenuButton.field_e.setBounds(true, 640, 0, 0, 480);
        UiLayoutNode var8 = new UiLayoutNode();
        var8.field_A = 1;
        var8.field_p = 1;
        var8.field_y = 16777215;
        var8.field_X = (BitmapFont) ((Object) ConsoleTokenCursor.field_d);
        UiLayoutNode var3 = new UiLayoutNode();
        var3.setBounds(true, 317, 5, 5, 18);
        AuctionTableWidget.field_Hb = new ScrollContainer(0L, var3, var8, TextEntrySupport.field_b);
        AuctionTableWidget.field_Hb.setLayout(15, 20, 2, (byte) 37, 230, 344, 175);
        AuctionTableWidget.field_Hb.field_A = 1;
        AuctionTableWidget.field_Hb.field_y = 16777215;
        AuctionTableWidget.field_Hb.field_p = 1;
        AuctionTableWidget.field_Hb.field_X = (BitmapFont) ((Object) ConsoleTokenCursor.field_d);
        UiLayoutNode var4 = SoundStreamHandle.createSpriteBackedWidget(16006912, param0 ^ param0);
        UiLayoutNode var5 = new UiLayoutNode();
        var5.field_y = 16777215;
        var5.field_B = 2;
        var5.field_X = (BitmapFont) ((Object) ConsoleTokenCursor.field_d);
        var5.field_D = 5;
        DialogOverlay.field_b = new TextFieldNode(0L, var8, var4, var5, 20);
        DialogOverlay.field_b.layoutTextField(param0 - 592, 145, 64, 4 + (ConsoleTokenCursor.field_d.field_G + ConsoleTokenCursor.field_d.field_p), 160);
        var8.field_X = (BitmapFont) ((Object) ConsoleTokenCursor.field_d);
        DialogOverlay.field_b.field_R = null;
        ScrollPane.field_Cb = SoftwareDrawingSupport.createTextButton(RegistrationRequestState.field_j, 7126504);
        ScrollPane.field_Cb.setBounds(true, ScrollPane.field_Cb.field_q, 310, 61, ScrollPane.field_Cb.field_mb);
        WelcomeDialog.field_H = new UiLayoutNode[7];
        for (var6 = 6; var6 >= 0; var6--) {
          WelcomeDialog.field_H[var6] = new UiLayoutNode();
          WelcomeDialog.field_H[var6].setBounds(true, 48, 20 + 50 * var6, 96, 48);
          MenuButton.field_e.addChild((byte) -127, WelcomeDialog.field_H[var6]);
        }
        MenuButton.field_e.addChild((byte) -126, (UiLayoutNode) (AuctionTableWidget.field_Hb));
        MenuButton.field_e.addChild((byte) -106, (UiLayoutNode) (DialogOverlay.field_b));
        MenuButton.field_e.addChild((byte) -112, ScrollPane.field_Cb);
        if (!PlayArea.isGuestSession(100)) {
          ShopPlayerSlot.a(ArchiveSource.field_e, (byte) 74);
        }
    }

    public static void releaseStatics(int param0) {
        field_E = null;
        field_G = null;
        if (param0 > -31) {
          field_B = (Sprite[]) null;
        }
        field_B = null;
        field_C = null;
        field_F = null;
    }

    final boolean handleKey(int param0, int param1, char param2) {
        String var4 = null;
        if (param1 > -5) {
          LeaguesScreen.charToString('c', (byte) -84);
        }
        boolean discarded$3 = super.handleKey(param0, -11, param2);
        if (!PlayArea.isGuestSession(100) &&
          DialogOverlay.field_b.handleKey(param0, param2, 875)) {
          return true;
        }
        if (!PlayArea.isGuestSession(100) &&
          param0 == 84) {
          var4 = DialogOverlay.field_b.getText((byte) -16);
          if (var4.length() > 0) {
            ShopPlayerSlot.a(DialogOverlay.field_b.getText((byte) -16), (byte) 74);
            DialogOverlay.field_b.setText("", -23174);
            LoginKind.a((byte) -115);
          }
        }
        return true;
    }

    final void drawScreen(int param0, boolean param1) {
        int var3_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        UiLayoutNode stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackIn_27_2 = false;
        ScrollBar var3;
        String var3_ref;
        int var4;
        int var5;
        int var6;
        RankingRowNode var7;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        SoftwareRasterizer.fillRectangleAlpha(AuctionTableWidget.field_Hb.field_F + this.slideOffsetX, -4 + AuctionTableWidget.field_Hb.field_T, AuctionTableWidget.field_Hb.field_q + 4, AuctionTableWidget.field_Hb.field_mb + 6, 0, 128);
        SoftwareRasterizer.fillRoundedRectangleBlended(this.slideOffsetX + 20, 60, 134 + DialogOverlay.field_b.field_q + ScrollPane.field_Cb.field_q, 29, 10, 0, 128);
        ConsoleTokenCursor.field_d.drawRightAligned(ArchiveNetworkClient.field_e.toUpperCase(), DialogOverlay.field_b.field_F, DialogOverlay.field_b.field_T + 15, 16777215, -1);
        SoftwareRasterizer.fillRectangleAlpha(DialogOverlay.field_b.field_F, DialogOverlay.field_b.field_T + 4, DialogOverlay.field_b.field_q, DialogOverlay.field_b.field_mb - 5, 7829367, 128);
        if (AuctionTableWidget.field_Hb.field_Eb.isLinked((byte) -113)) {
          var3 = AuctionTableWidget.field_Hb.field_Eb;
          SoftwareRasterizer.darkenRectangle(3 + (((UiLayoutNode) ((Object) var3)).field_F + this.slideOffsetX), ((UiLayoutNode) ((Object) var3)).field_T, ((UiLayoutNode) ((Object) var3)).field_q - 6, ((UiLayoutNode) ((Object) var3)).field_mb);
        }
        AuctionListing.pushRasterClip(640, -22914, 0, 135, 60);
        for (var3_int = 0; WelcomeDialog.field_H.length > var3_int; var3_int++) {
          stackIn_7_0 = (~AnimationSkeleton.field_k != ~var3_int) ? 0 : 1;
          var4 = stackIn_7_0;
          stackIn_10_0 = (var4 != 0) ? 256 : 128;
          var5 = stackIn_10_0;
          SoftwareRasterizer.fillRoundedRectangleBlended(WelcomeDialog.field_H[var3_int].field_F, WelcomeDialog.field_H[var3_int].field_T, WelcomeDialog.field_H[var3_int].field_q, WelcomeDialog.field_H[var3_int].field_mb, 10, 0, var5);
          if (var4 == 0) {
            DelayedServerPacket.field_i[var3_int].drawAlpha(WelcomeDialog.field_H[var3_int].field_F + 4, WelcomeDialog.field_H[var3_int].field_T - 2, 48);
          } else {
            WriteIntegersCommand.field_E[var3_int].draw(WelcomeDialog.field_H[var3_int].field_F + 4, WelcomeDialog.field_H[var3_int].field_T - 2);
          }
        }
        TeamManagementScreen.e(param0 ^ -122);
        SoftwareRasterizer.fillRect(20 + AnimationSkeleton.field_k * 50 + this.slideOffsetX, 135, 48, 2, 0);
        SoftwareRasterizer.fillRect(20 + this.slideOffsetX, 137, 348, 26, 0);
        var3_ref = BroadcastServerCommand.field_C;
        if (AnimationSkeleton.field_k > 0 &&
          AnimationSkeleton.field_k < ConsoleTokenCursor.field_h.length) {
          var3_ref = ConsoleTokenCursor.field_h[AnimationSkeleton.field_k];
        }
        ByteArrayPool.field_d.drawCentered(var3_ref.toLowerCase(), this.slideOffsetX + 194, 156, 16679959, -1);
        var4Lifetime1 = ByteArrayPool.field_d.stringWidth(var3_ref.toLowerCase());
        if (SoftwareDrawingSupport.field_f != null) {
          SoftwareDrawingSupport.field_f[AnimationSkeleton.field_k].a(194 + this.slideOffsetX - (var4Lifetime1 >> 1) - 28, 146);
          SoftwareDrawingSupport.field_f[AnimationSkeleton.field_k].a(14 + ((var4Lifetime1 >> 1) + this.slideOffsetX) + 194, 146);
        }
        stackIn_26_0 = MenuButton.field_e;
        stackIn_26_1 = 85;
        stackIn_27_2 = (StrongCacheEntry.hasGameFocus(2368)) && (MonotonicClock.monotonicMillis(127) % 500L < 250L);
        ((UiLayoutNode) (Object) stackIn_26_0).draw(stackIn_26_1, stackIn_27_2);
        if (AuctionTableWidget.field_Hb.field_Db.field_jb != null) {
          AuctionListing.pushRasterClip(-2 + AuctionTableWidget.field_Hb.field_q + (AuctionTableWidget.field_Hb.field_F - 15), -22914, AuctionTableWidget.field_Hb.field_F, 12 + (AuctionTableWidget.field_Hb.field_T - (-AuctionTableWidget.field_Hb.field_mb + 15)), AuctionTableWidget.field_Hb.field_T);
          var7 = (RankingRowNode) (AuctionTableWidget.field_Hb.field_Db.field_jb.first(24009));
          while (var7 != null) {
            var7.b(-104);
            var7 = (RankingRowNode) (AuctionTableWidget.field_Hb.field_Db.field_jb.next(param0 ^ -38));
          }
          TeamManagementScreen.e(118);
        }
        if (AuctionTableWidget.field_Hb.field_Db.field_jb == null ||
          AuctionTableWidget.field_Hb.field_Db.field_jb.size(false) == 0) {
          if (!PlayArea.isGuestSession(100)) {
            if (!PlayerContextMenu.field_f) {
              ByteArrayPool.field_d.drawCentered(PasswordValidator.field_k.toLowerCase(), 194 + this.slideOffsetX, 290, 16777215, -1);
            } else {
              ReceivedAuctionItemRow.a(this.slideOffsetX + 194, -65, 290);
            }
          } else {
            IsSixCommand.field_C.drawCentered(LineupPositionSupport.field_b, this.slideOffsetX + 194, 290, 16777215, -1);
          }
        }
        SoftwareRasterizer.fillRectangleAlpha(AuctionTableWidget.field_Hb.field_F, 4 + (AuctionTableWidget.field_Hb.field_mb + AuctionTableWidget.field_Hb.field_T), 4 + AuctionTableWidget.field_Hb.field_q, 24, 0, 196);
        AuctionListing.pushRasterClip(AuctionTableWidget.field_Hb.field_F + (AuctionTableWidget.field_Hb.field_q + 2), -22914, 1 + AuctionTableWidget.field_Hb.field_F, AuctionTableWidget.field_Hb.field_T + (AuctionTableWidget.field_Hb.field_mb + 4) + 24, 4 + (AuctionTableWidget.field_Hb.field_mb + AuctionTableWidget.field_Hb.field_T));
        if (FadingSoundPlayer.field_w > 0) {
          ByteArrayPool.field_d.drawCentered(SectorCacheStore.field_e.toLowerCase(), (AuctionTableWidget.field_Hb.field_q >> 1) + AuctionTableWidget.field_Hb.field_F, 423, 16679959, -1);
        } else {
          ByteArrayPool.field_d.drawText(ContextMenu.field_Jb.toLowerCase(), SpriteBackgroundSupport.field_b + this.slideOffsetX, 423, 16679959, -1);
        }
        TeamManagementScreen.e(param0 + 128);
        if (PlayArea.isGuestSession(100) ||
          TextEntrySupport.field_f) {
          SoftwareRasterizer.darkenRectangle(this.slideOffsetX, 48, 450, 382);
          if (TextEntrySupport.field_f) {
            IsSixCommand.field_C.drawParagraph(PlayerMeshFactory.field_d, this.slideOffsetX, 48, 450, 382, 16777215, -1, 1, 1, 0);
          }
        }
        super.drawScreen(param0, param1);
    }

    final void drawOverlay(boolean param0, int param1) {
        super.drawOverlay(param0, 121);
        if (param1 < 99) {
          field_E = (Sprite[]) null;
        }
    }

    LeaguesScreen() {
        this.field_D = 0;
    }

    final int buttonCenterY(int param0, int param1) {
        int var3 = 33 / ((-49 - param0) / 52);
        return super.buttonCenterY(-111, param1);
    }

    static {
        field_C = "buyout at min";
        field_A = 3;
        field_G = null;
        field_F = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
