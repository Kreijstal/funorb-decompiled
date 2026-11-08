/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrinketShopDialog extends MessageDialog {
    private int field_I;
    private TrinketTile field_H;
    private int field_J;
    private ScrollContainer field_L;
    private int field_K;
    static String field_M;
    private int field_F;
    static int field_G;

    static int bitwiseXor(int param0, int param1) {
        return param0 ^ param1;
    }

    private final UiLayoutNode createShopList(byte param0) {
        int var4 = 0;
        int var3;
        Trinket var5;
        int var7;
        UiLayoutNode var8;
        TrinketTile var6;
        var7 = Kickabout.field_G;
        var8 = new UiLayoutNode();
        var3 = 0;
        if (param0 > -46) {
          return (UiLayoutNode) null;
        }
        for (var4 = 0; var4 < GeneratedPanelPainter.field_g.length; var4++) {
          var5 = GeneratedPanelPainter.field_g[var4];
          if (this.field_J == var5.field_k &&
            0 != var5.field_h && ((72 != var5.field_h ||
            (1 & RegistrationRequestState.field_h.field_n >> 0) == 1) &&
            (var5.field_h != 73 ||
            LoginMethod.b(0)))) {
            var6 = new TrinketTile(var4);
            var6.field_s = 5;
            var6.field_J = var3;
            var3 = var3 + var6.field_mb;
            var8.addChild((byte) -114, (UiLayoutNode) (var6));
          }
        }
        var8.setBounds(true, 270, 0, 0, var3);
        return var8;
    }

    final static WorldDrawEntry createGroundMarker(boolean param0, int param1, int param2) {
        WorldDrawEntry var3 = new WorldDrawEntry(0);
        var3.field_k = param1;
        if (!param0) {
          return (WorldDrawEntry) null;
        }
        var3.field_e = (4 & (param2 ^ param1)) != 0 ? CheckboxPainter.field_o : AccountChoicePanel.field_K;
        var3.field_g = param2 - 4;
        return var3;
    }

    final int dialogWidth(int param0) {
        if (param0 != -1379118556) {
          field_M = (String) null;
        }
        return 500;
    }

    final void drawBody(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Kickabout.field_G;
        super.drawBody((byte) -25, param1, param2);
        ScrollContainer var11 = this.field_L;
        this.field_L.setBounds(true, 210, param1 + 250, param2 + 55, 240);
        this.field_L.updateInput(0, true);
        SoftwareRasterizer.fillRoundedRectangleBlended(-4 + var11.field_F, var11.field_T - 5, 8 + var11.field_q, var11.field_mb, 8, 65793, 96);
        if (param0 >= -11) {
          return;
        }
        if (var11.field_Eb.isLinked((byte) -113)) {
          SoftwareRasterizer.darkenRectangle(var11.field_Eb.field_F + 3, var11.field_Eb.field_T, -6 + var11.field_Eb.field_q, var11.field_Eb.field_mb);
        }
        AuctionListing.pushRasterClip(-2 + (var11.field_F - (-var11.field_q + 15)), -22914, 0, -2 + (var11.field_mb + var11.field_T) - 15, var11.field_T);
        Object var5 = null;
        TrinketTile var6_ref_at = (TrinketTile) (this.field_L.field_Db.field_jb.first(24009));
        while (var6_ref_at != null) {
          if (this.field_H == var6_ref_at) {
            SoftwareRasterizer.fillRoundedRectangleBlended(var6_ref_at.field_F, var6_ref_at.field_T, var6_ref_at.field_q, var6_ref_at.field_mb, 8, 65793, 128);
            SoftwareRasterizer.drawRoundedRectangle(var6_ref_at.field_F, var6_ref_at.field_T, var6_ref_at.field_q, var6_ref_at.field_mb, 8, 10066329);
          } else {
            if (var6_ref_at.field_gb) {
              SoftwareRasterizer.drawRoundedRectangle(var6_ref_at.field_F, var6_ref_at.field_T, var6_ref_at.field_q, var6_ref_at.field_mb, 8, 4473924);
            }
          }
          var6_ref_at.drawTileText((byte) -76);
          var6_ref_at = (TrinketTile) (this.field_L.field_Db.field_jb.next(33));
        }
        if (this.field_t != var5) {
          this.setMessageContent(this.field_v, (PopupCard) (var5), (Sprite) null, -94, this.field_u);
        }
        TeamManagementScreen.popRasterState(123);
        if (null != this.field_H) {
          var6 = 130 + param1;
          var7 = 160 + param2;
          var8 = this.field_H.field_Cb.getWidth(0);
          var9 = this.field_H.field_Cb.getHeight(15);
          SoftwareRasterizer.fillRoundedRectangleBlended(-(var8 >> 1) + var6 - 10, -(var9 >> 1) + (var7 - 10), 20 + var8, var9 + 40, 10, 65793, 128);
          this.field_H.field_Cb.drawCentered(var7, 23, var6);
          IsSixCommand.field_C.drawCentered(this.field_H.field_Eb, var6, 20 + ((var9 >> 1) + var7), this.field_H.getPriceTextColor(true), -1);
          if (!(this.field_H.field_Db <= RegistrationRequestState.field_h.field_x)) {
            IsSixCommand.field_C.drawCentered(AnimationFrameset.field_n, var6, 62 + ((var9 >> 1) + var7), 16777215, -1);
          }
        }
        this.field_L.draw(117, false);
        IsSixCommand.field_C.drawCentered(CheckboxLabelWidget.field_Bb, (this.dialogWidth(-1379118556) >> 1) + param1, 312 + param2, 13421772, -1);
    }

    final static void enqueueTrinketPickerDialog(int param0) {
        ScrollPane.field_Jb.addLast(new TrinketPickerDialog(), 3);
        if (param0 != -29315) {
          TrinketShopDialog.createGroundMarker(true, -105, 126);
        }
    }

    final void onUpdate(int param0, boolean param1) {
        UiLayoutNode stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        int var3;
        TrinketTile var4;
        int var5;
        var5 = Kickabout.field_G;
        if (this.field_K > 0) {
          this.field_K = this.field_K - 1;
        }
        var3 = this.field_L.field_Db.field_J;
        this.field_L.updateInput(0, param1);
        this.field_L.advanceScroll(StatefulTextPainter.field_v * 32, true, (byte) -78, 32);
        if (var3 < this.field_L.field_Db.field_J &&
          this.field_K == 0) {
          ShopPlayerSlot.playDefaultFadingSound(59, 52);
          this.field_K = 10;
        }
        if (this.field_L.field_Db.field_J < var3 &&
          this.field_K == 0) {
          ShopPlayerSlot.playDefaultFadingSound(60, -119);
          this.field_K = 10;
        }
        if (param0 != 3) {
          this.drawBody((byte) 5, 15, 25);
        }
        var4 = (TrinketTile) (this.field_L.field_Db.field_jb.first(param0 + 24006));
        while (var4 != null) {
          if (1 == var4.field_sb) {
            LoginKind.playSelectionSound((byte) -98);
            if (this.field_H != var4) {
              this.field_H = var4;
            } else {
              this.field_H = null;
            }
          }
          var4 = (TrinketTile) (this.field_L.field_Db.field_jb.next(param0 + 30));
        }
        stackIn_23_0 = this.field_i[0];
        stackIn_24_1 = (this.field_H != null) && (this.field_H.field_Db <= RegistrationRequestState.field_h.field_x);
        stackIn_23_0.field_lb = stackIn_24_1;
    }

    TrinketShopDialog(int param0, int param1, int param2) {
        super(24);
        this.field_J = param0;
        this.field_F = param2;
        this.field_K = 0;
        this.field_I = param1;
        CharSequence var5 = (CharSequence) ((Object) "trinkets");
        this.field_L = new ScrollContainer(PitchDecorationSupport.hashString31(0, var5), this.createShopList((byte) -119), ConsolePanel.field_q, TextEntrySupport.field_b, ParticipantAgent.field_m);
        this.field_L.setLayout(15, 0, 2, (byte) 2, 240, 210, 0);
        this.field_i[0].field_lb = false;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_G = 36;
        }
        field_M = null;
    }

    final int dialogHeight(byte param0) {
        UiLayoutNode discarded$0 = null;
        if (param0 <= 75) {
          discarded$0 = this.createShopList((byte) 21);
        }
        return 380;
    }

    final void handleResult(int param0, int param1) {
        int var3;
        if (param0 < 60) {
          return;
        }
        if (param1 == 0 &&
          null != this.field_H) {
          var3 = this.field_H.field_yb;
          MatchingTextValidator.queueTrinketChange(var3, this.field_I, (byte) 123, this.field_F);
          ShopPlayerSlot.playDefaultFadingSound(50, -110);
        } else {
          AchievementSubmission.playUiClickSound((byte) -120);
        }
    }

    static {
        field_M = null;
    }
}
