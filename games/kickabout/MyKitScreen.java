/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MyKitScreen extends TeamManagementScreen {
    static boolean[] field_Z;
    private UiLayoutNode field_K;
    static String field_L;
    private int field_V;
    static Sprite field_S;
    private UiLayoutNode field_ab;
    private int field_U;
    private UiLayoutNode field_X;
    private AnimationPlayer field_cb;
    private int field_Q;
    private UiLayoutNode field_G;
    private UiLayoutNode field_Y;
    private String field_T;
    private UiLayoutNode field_F;
    private MeshData field_db;
    private int field_R;
    private UiLayoutNode[] field_J;
    private UiLayoutNode field_H;
    static String field_W;
    private int field_bb;
    static String field_M;
    private UiLayoutNode field_eb;
    private UiLayoutNode field_P;
    static boolean field_O;
    private int field_N;
    static String field_I;

    final void updateScreen(byte param0, boolean param1) {
        int stackIn_28_0 = 0;
        int stackIn_29_1 = 0;
        int var3;
        KitStyleTile var4_ref_nt;
        int var4;
        IntrusiveDeque var5;
        ColourSwatchTile var6;
        int var7;
        int var4Lifetime1;
        var7 = Kickabout.field_G;
        super.updateScreen((byte) -40, param1);
        this.field_P.field_s = this.slideOffsetX + 16;
        this.field_P.updateInput(0, param1);
        this.field_ab.field_s = this.slideOffsetX;
        this.field_ab.updateInput(0, param1);
        var3 = 44 / ((38 - param0) / 60);
        this.handleScrollButtons(0);
        var4_ref_nt = (KitStyleTile) (this.field_F.field_jb.first(24009));
        while (var4_ref_nt != null) {
          var4_ref_nt.c(-1, param1);
          if (var4_ref_nt.field_Jb.field_sb == 0) {
            var4_ref_nt = (KitStyleTile) (this.field_F.field_jb.next(33));
            continue;
          }
          if (!var4_ref_nt.field_Ib &&
            !var4_ref_nt.field_Kb) {
            ModalPanel.a(var4_ref_nt.field_Cb.styleId, (byte) -38);
          }
          var4_ref_nt = (KitStyleTile) (this.field_F.field_jb.next(33));
        }
        for (var4 = 0; 2 > var4; var4++) {
          var5 = this.field_J[var4].field_jb;
          var6 = (ColourSwatchTile) (var5.first(24009));
          while (var6 != null) {
            if (0 != var6.field_sb) {
              if (var4 != 0) {
                ValidatedTextWidget.a((byte) 74, var6.field_yb);
              } else {
                AvailabilityCheckRequest.a(123, var6.field_yb);
              }
              LoginKind.a((byte) -117);
            }
            var6 = (ColourSwatchTile) (var5.next(33));
          }
        }
        var4Lifetime1 = 0;
        if (this.field_Y.field_sb == 1) {
          var4Lifetime1--;
          LoginKind.a((byte) -99);
        }
        if (this.field_K.field_sb == 1) {
          var4Lifetime1++;
          LoginKind.a((byte) -116);
        }
        if (FormationAgent.field_f < ArrayWidgetContainer.field_x &&
          StatefulTextPainter.field_v != 0) {
          stackIn_28_0 = var4Lifetime1;
          stackIn_29_1 = (StatefulTextPainter.field_v >= 0) ? 1 : -1;
          var4Lifetime1 = stackIn_28_0 + stackIn_29_1;
        }
        if (var4Lifetime1 != 0) {
          this.stepSelection(-75, var4Lifetime1);
        }
        if (this.field_bb != RegistrationRequestState.field_h.field_w ||
          this.field_N != RegistrationRequestState.field_h.field_k ||
          RegistrationRequestState.field_h.field_R != this.field_Q) {
          this.refreshPlayerPreview(-3);
        }
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        int var6_int = 0;
        int var7 = 0;
        KitStyleDefinition[] var5_ref_rd__;
        int var5;
        UiLayoutNode var6;
        PlayerStats[] var6_array;
        KitStyleDefinition var7_ref_rd;
        PlayerStats var8;
        int var9;
        PlayerStats[] var10;
        IntrusiveDeque var11;
        var9 = Kickabout.field_G;
        super.enterScreen(0, param1, param2);
        this.field_P.field_s = 656;
        this.field_P.updateInput(0, false);
        this.field_ab.field_s = 640;
        this.field_ab.updateInput(param0 ^ 0, false);
        var11 = new IntrusiveDeque();
        var5_ref_rd__ = AnimationSkeleton.field_f;
        for (var6_int = 0; var5_ref_rd__.length > var6_int; var6_int++) {
          var7_ref_rd = var5_ref_rd__[var6_int];
          if (var7_ref_rd.matchesAccessRequirements(RegistrationRequestState.field_h.field_e, param0 + 109, ScrollContainer.field_Ib)) {
            var11.addLast(new KitStyleTile(RegistrationRequestState.field_h, var7_ref_rd), 3);
          }
        }
        this.field_F.field_jb = var11;
        var5 = 5;
        var6 = (UiLayoutNode) (this.field_F.field_jb.first(24009));
        while (var6 != null) {
          var6.field_mb = this.field_F.field_mb;
          var6.field_s = var5;
          var6.field_J = 0;
          var5 = var5 + (12 + var6.field_q);
          var6 = (UiLayoutNode) (this.field_F.field_jb.next(33));
        }
        this.field_F.field_s = 0;
        this.field_V = param0;
        this.field_F.field_q = var5 - 12 + 10;
        var10 = RegistrationRequestState.field_h.squad;
        var6_array = RegistrationRequestState.field_h.squad;
        for (var7 = 0; var7 < var10.length; var7++) {
          var8 = var10[var7];
          if (!var8.isEmpty(-2)) {
            this.field_V = this.field_V + 1;
          }
        }
        this.field_U = 0;
        this.refreshPlayerPreview(-3);
    }

    private final void handleScrollButtons(int param0) {
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        UiLayoutNode stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        UiLayoutNode stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        if (CaptionedContainer.field_D > 0) {
          CaptionedContainer.field_D = CaptionedContainer.field_D - 1;
        }
        var2 = 0;
        if (1 == this.field_eb.field_qb) {
          if (0 == this.field_R % 2) {
            this.field_F.field_fb = this.field_F.field_fb + 16;
            var2 = 1;
          }
          if (CaptionedContainer.field_D == 0) {
            ShopPlayerSlot.c(59, 119);
            CaptionedContainer.field_D = 8;
          }
          this.field_R = this.field_R + 1;
        }
        if (this.field_H.field_qb == 1) {
          if (this.field_R % 2 == 0) {
            this.field_F.field_fb = this.field_F.field_fb - 16;
            var2 = 1;
          }
          if (CaptionedContainer.field_D == 0) {
            ShopPlayerSlot.c(60, 33);
            CaptionedContainer.field_D = 8;
          }
          this.field_R = this.field_R + 1;
        }
        var3 = StatefulTextPainter.field_v;
        if (0 != var3 &&
          this.field_X.field_gb) {
          this.field_F.field_fb = this.field_F.field_fb - 16 * var3;
          var2 = 1;
          if (0 == CaptionedContainer.field_D) {
            stackIn_25_0 = (var3 > 0) ? 60 : 59;
            ShopPlayerSlot.c(stackIn_25_0, -125);
            CaptionedContainer.field_D = 8;
          }
        }
        stackIn_29_0 = (-(this.field_F.field_fb + this.field_F.field_s) > 0) ? 0 : 1;
        var4 = stackIn_29_0;
        stackIn_32_0 = (this.field_F.field_G + (this.field_F.field_q - this.field_G.field_q) > -(this.field_F.field_s + this.field_F.field_fb)) ? 0 : 1;
        var5 = stackIn_32_0;
        stackIn_34_0 = this.field_eb;
        stackIn_35_1 = (var4 != 0) ? false : true;
        stackIn_34_0.field_lb = stackIn_35_1;
        if (this.field_eb.field_qb == param0 &&
          0 == this.field_H.field_qb) {
          this.field_R = 0;
        }
        stackIn_41_0 = this.field_H;
        stackIn_42_1 = (var5 != 0) ? false : true;
        stackIn_41_0.field_lb = stackIn_42_1;
        if (var2 != 0) {
          if (var4 != 0) {
            this.field_F.field_fb = -this.field_F.field_s;
          }
          if (var5 != 0) {
            this.field_F.field_fb = -this.field_F.field_s - (-this.field_G.field_q + (this.field_F.field_G + this.field_F.field_q));
          }
        }
    }

    private final void stepSelection(int param0, int param1) {
        int var3 = this.field_U;
        this.field_U = this.field_U + param1;
        if (param0 >= -7) {
          this.field_X = (UiLayoutNode) null;
        }
        if (this.field_U < 0) {
          this.field_U = this.field_V - 1;
        }
        if (this.field_V <= this.field_U) {
          this.field_U = 0;
        }
        if (this.field_U != var3) {
          this.refreshPlayerPreview(-3);
        }
    }

    final boolean handleKey(int param0, int param1, char param2) {
        if (param0 == 96) {
          this.stepSelection(-22, -1);
        }
        if (param0 == 97) {
          this.stepSelection(-87, 1);
        }
        if (param1 > -5) {
          this.drawScreen(78, true);
        }
        return super.handleKey(param0, -100, param2);
    }

    final void drawScreen(int param0, boolean param1) {
        UiLayoutNode var3_ref_hd;
        int var3;
        Object var4;
        ColourSwatchTile var5;
        int var6;
        KitStyleTile var7;
        int var3Lifetime1;
        var6 = Kickabout.field_G;
        super.drawScreen(param0, param1);
        SoftwareRasterizer.fillRectangleAlpha(this.field_P.field_F - 8, -8 + this.field_P.field_T, this.field_P.field_q + 16, this.field_P.field_mb + 16, 65793, 96);
        var3_ref_hd = (UiLayoutNode) (this.field_P.field_jb.first(param0 + 24014));
        while (var3_ref_hd != null) {
          SoftwareRasterizer.fillRoundedRectangleBlended(var3_ref_hd.field_F, var3_ref_hd.field_T, var3_ref_hd.field_q, var3_ref_hd.field_mb, 10, 65793, 96);
          var3_ref_hd = (UiLayoutNode) (this.field_P.field_jb.next(33));
        }
        ByteArrayPool.field_d.drawText(ExceptionTextSupport.field_c, -26 + this.field_G.field_F, this.field_G.field_T - 16, 16777215, -1);
        for (var3 = 0; var3 < 2; var3++) {
          ByteArrayPool.field_d.drawText(ImageProducerRasterBuffer.field_j[var3], 6 + this.field_J[var3].field_F, -8 + this.field_J[var3].field_T, 16777215, -1);
        }
        this.field_P.draw(114, false);
        AuctionListing.pushRasterClip(this.field_G.field_F + this.field_G.field_q, -22914, this.field_G.field_F, this.field_G.field_mb + this.field_G.field_T, this.field_G.field_T);
        var7 = (KitStyleTile) (this.field_F.field_jb.first(24009));
        while (var7 != null) {
          var7.h(-24508);
          var7 = (KitStyleTile) (this.field_F.field_jb.next(33));
        }
        TeamManagementScreen.e(124);
        for (var3Lifetime1 = 0; var3Lifetime1 < 2; var3Lifetime1++) {
          var4 = null;
          var5 = (ColourSwatchTile) (this.field_J[var3Lifetime1].field_jb.first(24009));
          while (var5 != null) {
            if (!var5.isSelectedColor(false)) {
              var5.a(param0 ^ -8);
            } else {
              var4 = var5;
            }
            var5 = (ColourSwatchTile) (this.field_J[var3Lifetime1].field_jb.next(33));
          }
          if (var4 != null) {
            ((ColourSwatchTile) (var4)).a(param0 + 8);
          }
        }
    }

    final void buildWidgets(int param0) {
        int var4_int = 0;
        ColourSwatchTile var5 = null;
        int var3 = 0;
        int var6 = Kickabout.field_G;
        int var3Lifetime1;
        this.field_P = new UiLayoutNode();
        this.field_X = new UiLayoutNode();
        UiLayoutNode var7 = new UiLayoutNode();
        this.field_P.setBounds(true, 370, 16, 80, 330);
        this.field_X.setBounds(true, 370, 0, 0, 130);
        var7.setBounds(true, 370, 0, 140, 190);
        this.field_P.addChild((byte) -115, this.field_X);
        this.field_P.addChild((byte) -113, var7);
        this.field_F = new UiLayoutNode();
        this.field_G = new UiLayoutNode();
        this.field_eb = SoftwareDrawingSupport.createDefaultButtonNode(false);
        this.field_H = SoftwareDrawingSupport.createDefaultButtonNode(true);
        this.field_eb.field_s = 5;
        this.field_H.field_s = this.field_X.field_q - (this.field_H.field_q + 5);
        this.field_H.field_J = -this.field_eb.field_mb + this.field_X.field_mb >> 1;
        this.field_eb.field_J = -this.field_eb.field_mb + this.field_X.field_mb >> 1;
        this.field_G.addChild((byte) -114, this.field_F);
        this.field_G.setBounds(true, 290, 40, 38, 84);
        this.field_F.field_mb = this.field_G.field_mb;
        this.field_X.addChild((byte) -105, this.field_G);
        this.field_X.addChild((byte) -115, this.field_eb);
        this.field_X.addChild((byte) -122, this.field_H);
        this.field_J = new UiLayoutNode[2];
        for (var3 = 0; var3 < 2; var3++) {
          this.field_J[var3] = new UiLayoutNode();
          for (var4_int = 0; var4_int < 32; var4_int++) {
            var5 = new ColourSwatchTile(RegistrationRequestState.field_h, var3, var4_int);
            var5.setBounds(true, 22, 22 * (var4_int % 16), var4_int / 16 * 22, 22);
            this.field_J[var3].addChild((byte) -110, (UiLayoutNode) (var5));
          }
          this.field_J[var3].setBounds(true, 354, 8, 40, 58);
          var7.addChild((byte) -123, this.field_J[var3]);
        }
        UiLayoutNode dupTemp$0 = this.field_J[1];
        dupTemp$0.field_J = dupTemp$0.field_J + ((var7.field_mb >> 1) - 6);
        this.field_Y = SoftwareDrawingSupport.createDefaultButtonNode(false);
        this.field_K = SoftwareDrawingSupport.createDefaultButtonNode(true);
        var3Lifetime1 = 5;
        this.field_Y.field_s = -this.field_Y.field_q + (-var3Lifetime1 + 532);
        this.field_K.field_s = 532 + var3Lifetime1;
        UiLayoutNode var4 = this.field_Y;
        this.field_K.field_J = 436;
        var4.field_J = 436;
        this.field_ab = new UiLayoutNode();
        this.field_ab.addChild((byte) -106, this.field_Y);
        this.field_ab.addChild((byte) -105, this.field_K);
        this.field_ab.setBounds(true, 640, 0, 0, 480);
        if (param0 != -38) {
          this.field_R = -25;
        }
        this.field_cb = new AnimationPlayer(1);
    }

    private final void refreshPlayerPreview(int param0) {
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        Object stackIn_15_4;
        int stackIn_15_5;
        Object stackIn_15_6;
        int stackIn_15_7;
        boolean stackIn_16_8 = false;
        Object stackIn_19_0;
        boolean stackIn_20_6 = false;
        int var2;
        Object var3;
        int var4;
        PlayerStats var5;
        int var6;
        Object stackIn_19_0Lifetime1;
        var6 = Kickabout.field_G;
        if (param0 != -3) {
          field_Z = (boolean[]) null;
        }
        var2 = this.field_U;
        var3 = null;
        var4 = 0;
        scanLoop1: while (true) {
          if (var4 < 9) {
            var5 = RegistrationRequestState.field_h.squad[RegistrationRequestState.field_h.field_q[var4]];
            if (!var5.isEmpty(param0 ^ 3)) {
              if (var2 == 0) {
                var3 = var5;
                break scanLoop1;
              }
              var2--;
            }
            var4++;
            continue;
          }
          break;
        }
        if (var3 == null) {
          this.field_db = null;
        } else {
          stackIn_15_0 = this;
          stackIn_15_1 = 109;
          stackIn_15_2 = RegistrationRequestState.field_h.field_R;
          stackIn_15_3 = RegistrationRequestState.field_h.field_k;
          stackIn_15_4 = var3;
          stackIn_15_5 = RegistrationRequestState.field_h.field_w;
          stackIn_15_6 = var3;
          stackIn_15_7 = -107;
          stackIn_16_8 = !(TextFieldValidator.areAccountTrinketsDisabled(-1));
          boolean decompiledFrameRemainder0 = true;
          stackIn_19_0 = this;
          if (((PlayerStats) stackIn_15_6).hasActiveHorrorCostume((byte) stackIn_15_7, stackIn_16_8)) {
            stackIn_19_0Lifetime1 = this;
            if (AccountRegistrationResponse.isHalloweenAppearanceEnabled((byte) 110)) {
              stackIn_20_6 = true;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_20_6 = false;
          }
          this.field_db = PlayerMeshFactory.createPlayerMesh(stackIn_15_1, stackIn_15_2, stackIn_15_3, (PlayerStats) (stackIn_15_4), stackIn_15_5, stackIn_20_6);
          this.field_T = 1 + this.field_U + ": " + ((PlayerStats) (var3)).getDisplayName(100);
          this.field_N = RegistrationRequestState.field_h.field_k;
          this.field_bb = RegistrationRequestState.field_h.field_w;
          this.field_Q = RegistrationRequestState.field_h.field_R;
          this.field_cb.setClip(HelpTipDialog.field_I[((PlayerStats) (var3)).archetype][3], (byte) -107);
          this.field_cb.setFrame(30, -81);
          if (((PlayerStats) (var3)).archetype == 2) {
            this.field_cb.setFrame(10, param0 - 36);
          }
        }
        return;
    }

    final void drawOverlay(boolean param0, int param1) {
        int var3 = 0;
        int[] var12 = null;
        int var5 = 0;
        int var6 = 0;
        ModelMesh var7 = null;
        int var8 = 0;
        if (param1 < 99) {
          this.field_U = -111;
        }
        if (this.field_db != null) {
          var3 = ((int)(MonotonicClock.monotonicMillis(75) % 5000L) << 11) / 5000;
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(532 + this.slideOffsetX, 410);
          var12 = OffscreenPlayerArrow.field_f;
          var5 = TriangleRasterizer.field_o[var3] * var12[0] >> 16;
          var6 = var12[0] * TriangleRasterizer.field_f[var3] >> 16;
          var7 = (ModelMesh) (this.field_cb.applyCurrentFrame(this.field_db.createModelMesh(var12[2], var12[3], var5, var12[1], var6), false, true, true));
          var7.a(0, var3, 0, 0, 0, 0, 0, 540);
          var8 = Math.max(120, IsSixCommand.field_C.stringWidth(this.field_T) + 30);
          SoftwareRasterizer.fillRoundedRectangleBlended(this.slideOffsetX + (532 - (var8 >> 1)), 412, var8, 56, 12, 65793, 128);
          IsSixCommand.field_C.drawCentered(this.field_T, 532 + this.slideOffsetX, 430, 16777215, -1);
          this.field_ab.draw(123, false);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 8) {
          field_S = (Sprite) null;
        }
        field_W = null;
        field_I = null;
        field_S = null;
        field_Z = null;
        field_M = null;
        field_L = null;
    }

    final static boolean ensureSoundLoaded(int param0, int param1) {
        if (SoundCache.field_a[param1]) {
          return true;
        }
        if (param0 <= 100) {
          MyKitScreen.ensureSoundLoaded(98, 120);
        }
        if (!LoadingProgressSupport.field_d.field_k[0].prepareTrackSamples(1, 176400, MatchTextInputOverlay.field_j, MatchUiLayoutSupport.field_a, LocalizedTextLoader.field_d[param1])) {
          AnimationPlayer.a((byte) 113);
          return false;
        }
        SoundCache.field_a[param1] = true;
        return true;
    }

    MyKitScreen() {
        this.field_R = 0;
    }

    static {
        field_Z = new boolean[]{false, true, true, true};
        field_L = "The rating threshold for the <%0> is <%1>.<br>Your rating is<nbsp><%2>; league points won are reduced.";
        field_W = "You must have unlocked a Hidden Achievement to wear this kit.";
        field_M = "Sell";
        field_I = "my current pitch";
    }
}
