/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AuctionsScreen extends ButtonMenuScreen {
    private UiLayoutNode field_P;
    private CheckboxLabelWidget[] field_E;
    static int field_Q;
    private ReceivedAuctionItemRow[] field_B;
    static String field_M;
    static int field_A;
    private UiLayoutNode field_K;
    static String field_I;
    private AuctionTableWidget field_G;
    private UiLayoutNode field_R;
    private IntrusiveDeque field_T;
    private UiLayoutNode field_L;
    static int field_O;
    private boolean field_N;
    private long field_J;
    private int field_V;
    private int field_S;
    private int field_F;
    private int field_U;
    private int field_D;
    long field_H;
    private int field_C;

    final void buildWidgets(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4;
        SortCriterion[] var5;
        SortCriterion[] var6;
        var4 = Kickabout.field_G;
        this.field_L = new UiLayoutNode();
        this.field_L.setBounds(true, 640, 0, 0, 480);
        if (param0 != -38) {
          this.field_B = (ReceivedAuctionItemRow[]) null;
        }
        this.field_R = SoftwareDrawingSupport.createRenderedButton(ThreeCommand.field_B, 7126504, ByteArrayPool.field_d, 162, true);
        this.field_P = SoftwareDrawingSupport.createRenderedButton(AccountNameCheckState.field_b, 16679959, ByteArrayPool.field_d, 162, true);
        this.field_R.field_s = 10;
        this.field_R.field_J = 56;
        this.field_P.field_J = 86;
        this.field_P.field_s = 10;
        this.field_K = new UiLayoutNode();
        this.field_K.field_E = ArchiveNetworkClient.field_a.toLowerCase();
        this.field_K.setBounds(true, 420, 195, 51, 66);
        this.field_E = new CheckboxLabelWidget[4];
        for (var2 = 0; 4 > var2; var2++) {
          this.field_E[var2] = new CheckboxLabelWidget(RegistrationUiSupport.field_e[var2], IsSixCommand.field_C, 90);
          this.field_E[var2].field_s = var2 * 100 + 15;
          this.field_E[var2].field_J = 27;
          this.field_E[var2].field_Gb = true;
          this.field_K.addChild((byte) -117, (UiLayoutNode) (this.field_E[var2]));
        }
        var5 = new SortCriterion[ClubState.field_l.length];
        var6 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
          var5[var3] = GameModesHelpScreen.field_H;
          if (var3 == 2) {
            var5[var3] = ClientException.field_a;
          }
        }
        this.field_G = new AuctionTableWidget(ChatComposeSupport.field_f, ClubState.field_l, var6, 50);
        this.field_G.layoutTableViewport(300, (byte) -116, 122, 7);
        this.field_B = new ReceivedAuctionItemRow[]{};
        this.field_G.setRows(this.field_B, 0);
        this.field_L.addChild((byte) -123, this.field_P);
        this.field_L.addChild((byte) -106, this.field_R);
        this.field_L.addChild((byte) -124, this.field_K);
        this.field_L.addChild((byte) -115, (UiLayoutNode) (this.field_G));
    }

    final static void a(int param0, int param1, IndexedSprite param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (256 == InstrumentNoteMask.field_i) {
            param2.a(param1, param3);
          } else {
            param2.drawScaled(param1, param3, InstrumentNoteMask.field_i * param2.field_i >> 8, InstrumentNoteMask.field_i * param2.field_a >> 8);
          }
          if (param0 != -840618968) {
            field_A = 99;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wf.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_M = null;
        if (param0 >= -50) {
          field_M = (String) null;
        }
        field_I = null;
    }

    final static void sendAuctionAction(int param0, int param1, byte param2) {
        CipherPacketBuffer var3 = FootballerAiOverlaySupport.field_d;
        var3.writeIsaacByte(param1, (byte) 127);
        var3.writeByte(123, 3);
        int var4 = 127 / ((57 - param2) / 58);
        var3.writeByte(112, 8);
        var3.writeShort(-1207444472, param0);
    }

    final void updateScreen(byte param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int var3;
        long var4_long;
        int var4;
        int var5;
        int var6;
        int var7;
        super.updateScreen((byte) 124, param1);
        if (this.field_V > 0) {
          this.field_V = this.field_V - 1;
        }
        var3 = this.field_G.getScrollOffset((byte) 123);
        stackIn_5_0 = param1;
        stackIn_6_1 = (ModelMaterialDecoder.field_g) ? 0 : 1;
        stackIn_9_2 = (NineSlicePanelPainter.field_e) ? 0 : 1;
        stackIn_11_1 = stackIn_6_1 & stackIn_9_2;
        stackIn_12_2 = (PlayArea.isGuestSession(100)) ? 0 : 1;
        param1 = stackIn_5_0 & (stackIn_11_1 & stackIn_12_2) != 0;
        this.field_G.updateTableInput(param1, false);
        this.field_L.field_s = this.slideOffsetX;
        this.field_L.updateInput(0, param1);
        if (param1) {
          var4_long = MonotonicClock.monotonicMillis(73);
          if (var4_long >= (this.field_H + 10000L)) {
            this.requestAuctionPage(true, (byte) -127);
          }
        }
        this.handleButtons(false, param1);
        var4 = this.field_G.getFirstVisibleRow((byte) -124) - this.headerRowCount((byte) 63);
        var5 = this.field_G.getSortColumnIndex(64);
        var6 = this.field_G.getSortDirection((byte) 34);
        if (-1 == var5) {
          var5 = 4;
        }
        if (param1 && (this.field_S != this.field_U ||
          var5 != this.field_F ||
          var6 != this.field_C ||
          var4 < -4 + this.field_D ||
          var4 > 4 + this.field_D)) {
          this.field_J = -1L;
          this.field_C = var6;
          this.field_D = var4;
          this.field_F = var5;
          this.requestAuctionPage(false, (byte) -126);
        }
        this.field_S = this.field_U;
        var7 = -68 % ((38 - param0) / 60);
        if (var3 < this.field_G.getScrollOffset((byte) -25) &&
          this.field_V == 0) {
          ShopPlayerSlot.c(59, 42);
          this.field_V = 10;
        }
        if (var3 > this.field_G.getScrollOffset((byte) -126) &&
          this.field_V == 0) {
          ShopPlayerSlot.c(60, -101);
          this.field_V = 10;
        }
    }

    final int buttonCenterX(int param0, int param1) {
        int var3;
        int stackIn_14_0 = 0;
        if (PlayArea.isGuestSession(100)) {
          var3 = 320;
          if (param0 == 1) {
            return var3 - (this.buttons[1].width + this.buttons[0].width >> 1);
          }
          if (param0 == 0) {
            return 24 + (var3 - ((this.buttons[1].width + this.buttons[0].width >> 1) - this.buttons[1].width * 2));
          }
          if (param0 == 2) {
            return 600;
          }
        }
        if (param1 != -22667) {
          return 15;
        }
        stackIn_14_0 = (param0 == 1) ? 600 : 320;
        return stackIn_14_0;
    }

    final static Sprite[][][] a(int param0, Sprite param1) {
        int var4_int = 0;
        int var6_int = 0;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        Sprite[][][] stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Sprite var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        Sprite[] var6 = null;
        Sprite[][][] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Sprite var13 = null;
        String var14 = null;
        int var15 = 0;
        int[] var16 = null;
        var15 = Kickabout.field_G;
        try {
          var16 = new int[]{PlayerContextMenu.field_e, IsSixCommand.field_A, TextPromptDialog.field_Kb, ArchivePreloadEntry.field_e};
          var3 = new Sprite(32, 32);
          PacketBuffer.a(-111, var3);
          for (var4_int = 15; var4_int < 19; var4_int++) {
            SoftwareRasterizer.drawHorizontalLine(4, var4_int, 26, 592137);
          }
          var4 = 1.0f;
          var5 = 0.4000000059604645f;
          for (var6_int = 2; 20 > var6_int; var6_int++) {
            SoftwareRasterizer.drawVerticalLine(var6_int, -(int)var4 + 17, (int)(2.0f * var4), 65793);
            var4 = var4 + var5;
          }
          TeamManagementScreen.e(117);
          var6 = new Sprite[4];
          for (var7_int = 0; 4 > var7_int; var7_int++) {
            var6[var7_int] = var3.copy();
          }
          var6[1].flipHorizontalInPlace();
          var6[2].rotateClockwise();
          var6[param0].c();
          var7 = new Sprite[2][4][2];
          for (var8 = 0; var8 < 16; var8++) {
            stackIn_15_0 = ((8 & var8) != 0) ? 0 : 1;
            var9 = stackIn_15_0;
            var10 = 3 & var8 >> 1;
            stackIn_18_0 = ((var8 & 1) == 0) ? 0 : 1;
            var11 = stackIn_18_0;
            stackIn_21_0 = (var11 != 0) ? 1 : 0;
            var12 = stackIn_21_0;
            var13 = new Sprite(param1.field_o, param1.field_v);
            PacketBuffer.a(-96, var13);
            param1.d(0, 0);
            if (var11 == 0) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f);
            }
            if (var9 == 0) {
              var6[var10].drawHalfSize(-7 + (SoftwareRasterizer.field_g >> 1), var12 + 5);
            } else {
              var14 = TutorialScenerySupport.field_b[var16[var10]].toLowerCase();
              ByteArrayPool.field_d.drawCentered(var14, (SoftwareRasterizer.field_g >> 1) + var12, 18 + var12, 65793, -1);
            }
            TeamManagementScreen.e(120);
            SpriteBackgroundSupport.fillTransparentBackground(var13, (byte) -51);
            var7[var8 >> 3][TextLayoutLine.bitwiseAnd(3, var8 >> 1)][TextLayoutLine.bitwiseAnd(var8, 1)] = var13;
          }
          stackIn_28_0 = var7;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("wf.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final int headerRowCount(byte param0) {
        int var2 = -70 % ((param0 - 8) / 47);
        return this.field_T.a(false) > 0 ? 2 + this.field_T.a(false) : 0;
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        super.enterScreen(param0 ^ 0, param1, param2);
        IntrusiveNodeHashTable.a(GameLoopApplet.field_E.field_x, param0 + 415422632);
        this.field_N = true;
        this.field_B = new ReceivedAuctionItemRow[param0];
        this.field_G.installRows(0, (byte) -47, this.field_B, 5);
        this.field_G.field_Db = -1;
        this.field_G.cycleColumnSort(4, 113);
        this.field_U = 15;
        this.field_F = 4;
        this.field_S = this.field_U;
        this.field_C = 0;
        this.field_D = 0;
        if (!NineSlicePanelPainter.field_e) {
          if (ModelMaterialDecoder.field_g) {
            return;
          }
          this.requestAuctionRefresh(30353);
          this.requestAuctionPage(true, (byte) -126);
          return;
        }
    }

    private final void replaceAuctionEntry(ReceivedAuctionItem param0, int param1) {
        ReceivedAuctionItem var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Kickabout.field_G;
        try {
          var3 = (ReceivedAuctionItem) (this.field_T.g(24009));
          if (param1 != 640) {
            this.field_B = (ReceivedAuctionItemRow[]) null;
          }
          while (var3 != null) {
            if (var3.field_a == param0.field_a) {
              var3 = param0;
            }
            var3 = (ReceivedAuctionItem) (this.field_T.c(param1 ^ 673));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("wf.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void drawOverlay(boolean param0, int param1) {
        MatchHudSupport.drawNumericRewardPanel(this.slideOffsetX, -12452);
        if (param1 < 99) {
          this.field_F = -63;
        }
    }

    final void drawScreen(int param0, boolean param1) {
        int var3_int = 0;
        String stackIn_8_0 = null;
        String var3;
        int var4;
        var4 = Kickabout.field_G;
        super.drawScreen(param0, param1);
        SoftwareRasterizer.fillRectangleAlpha(this.field_K.field_F, this.field_K.field_T, this.field_K.field_q, this.field_K.field_mb, 65793, 96);
        SoftwareRasterizer.fillRoundedRectangleBlended(this.field_K.field_F + 8, 23 + this.field_K.field_T, this.field_K.field_q - 16, -30 + this.field_K.field_mb, 10, 65793, 96);
        ByteArrayPool.field_d.drawText(this.field_K.field_E, 13 + this.field_K.field_F, 17 + this.field_K.field_T, 16777215, -1);
        for (var3_int = 0; 4 > var3_int; var3_int++) {
          this.field_E[var3_int].a(false, (byte) 46);
        }
        this.field_G.drawTable(-82);
        this.field_L.draw(63, false);
        if (this.field_N) {
          if (this.field_U == 0) {
            stackIn_8_0 = KeyedLoginCredentials.field_h;
          } else {
            stackIn_8_0 = BufferedSocket.field_t;
          }
          var3 = stackIn_8_0;
          IsSixCommand.field_C.drawCentered(var3, this.field_G.field_F + (this.field_G.field_q >> 1), (this.field_G.field_mb >> 1) + this.field_G.field_T, 16777215, -1);
        }
        if (PlayArea.isGuestSession(param0 ^ -97)) {
          SoftwareRasterizer.fillRectangleAlpha(this.slideOffsetX, 48, 640, 383, 0, 196);
        }
        if (ModelMaterialDecoder.field_g ||
          NineSlicePanelPainter.field_e) {
          SoftwareRasterizer.fillRectangleAlpha(this.slideOffsetX, 48, 640, 383, 0, 196);
          IsSixCommand.field_C.drawParagraph(BufferedCacheFile.field_d, this.slideOffsetX, 0, 640, 480, 16777215, -1, 1, 1, 0);
        }
    }

    private final boolean containsAuction(ReceivedAuctionItem param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ReceivedAuctionItem var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          var3_int = 4 / ((40 - param1) / 37);
          var4 = (ReceivedAuctionItem) (this.field_T.g(24009));
          while (var4 != null) {
            if (param0.field_a == var4.field_a) {
              return true;
            }
            var4 = (ReceivedAuctionItem) (this.field_T.c(33));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wf.GA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updateAuctionRows(boolean param0, ReceivedAuctionItem[] param1, int param2, int param3) {
        AuctionTableWidget stackIn_47_0 = null;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ReceivedAuctionItemRow var9_ref_jr = null;
        int var9 = 0;
        ReceivedAuctionItemRow var10_ref_jr = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ReceivedAuctionItemRow var12_ref_jr = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        IntrusiveDeque var17 = null;
        ReceivedAuctionItem var18 = null;
        ReceivedAuctionItemRow var10_ref_jrLifetime1;
        ReceivedAuctionItemRow var10_ref_jrLifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var9Lifetime1;
        var16 = null;
        var15 = Kickabout.field_G;
        try {
          NetworkArchiveRequest.field_w = param1;
          var17 = new IntrusiveDeque();
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (this.field_T.a(false) > param3) {
            var18 = (ReceivedAuctionItem) (this.field_T.g(24009));
            while (var18 != null) {
              if (var7 >= param3) {
                if (var7 == 0) {
                  var10_ref_jr = new ReceivedAuctionItemRow(LoginPacketSupport.field_b);
                  var10_ref_jr.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
                  var10_ref_jr.field_mb = 50;
                  var10_ref_jr.field_y = 16777215;
                  var17.addLast(var10_ref_jr, 3);
                  var8++;
                }
                var10_ref_jrLifetime2 = new ReceivedAuctionItemRow(var18, ChatComposeSupport.field_f);
                var10_ref_jrLifetime2.field_y = 16777215;
                var10_ref_jrLifetime2.field_mb = 50;
                var10_ref_jrLifetime2.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
                var8++;
                var17.addLast(var10_ref_jrLifetime2, 3);
              }
              var7++;
              var18 = (ReceivedAuctionItem) (this.field_T.c(33));
            }
          }
          if (var7 > 0) {
            var9_ref_jr = new ReceivedAuctionItemRow(MenuSelection.field_k);
            var9_ref_jr.field_mb = 50;
            var9_ref_jr.field_y = 16777215;
            var9_ref_jr.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
            var8++;
            var17.addLast(var9_ref_jr, 3);
          }
          if (!param0) {
            AuctionsScreen.h((byte) 106);
          }
          for (var9 = 0; var9 < NetworkArchiveRequest.field_w.length; var9++) {
            if (this.containsAuction(NetworkArchiveRequest.field_w[var9], (byte) 117)) {
              this.replaceAuctionEntry(NetworkArchiveRequest.field_w[var9], 640);
            }
            var10_ref_jrLifetime1 = new ReceivedAuctionItemRow(NetworkArchiveRequest.field_w[var9], ChatComposeSupport.field_f);
            var10_ref_jrLifetime1.field_mb = 50;
            var10_ref_jrLifetime1.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
            var10_ref_jrLifetime1.field_y = 16777215;
            var6++;
            var17.addLast(var10_ref_jrLifetime1, 3);
          }
          var9Lifetime1 = param3;
          if (var9Lifetime1 > 5) {
            var9Lifetime1 = 5;
          }
          if (0 > var9Lifetime1) {
            var9Lifetime1 = 0;
          }
          var10 = -var6 - (param3 + var8 - param2);
          if (param3 < 0) {
            var10 = -var6 + param2;
          }
          if (var10 > 5) {
            var10 = 5;
          }
          if (var10 < 0) {
            var10 = 0;
          }
          this.field_B = new ReceivedAuctionItemRow[var9Lifetime1 + (var6 - (-var8 - var10))];
          var11 = var9Lifetime1;
          for (var12 = 0; var11 > var12; var12++) {
            this.field_B[var12] = new ReceivedAuctionItemRow(ChatComposeSupport.field_f);
            this.field_B[var12].field_mb = 50;
            this.field_B[var12].field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
            this.field_B[var12].field_y = 16777215;
          }
          var12_ref_jr = (ReceivedAuctionItemRow) (var17.g(24009));
          while (var12_ref_jr != null) {
            this.field_B[var11] = var12_ref_jr;
            var12_ref_jr = (ReceivedAuctionItemRow) (var17.c(33));
            var11++;
          }
          for (var12Lifetime1 = var11; var12Lifetime1 < this.field_B.length; var12Lifetime1++) {
            this.field_B[var12Lifetime1] = new ReceivedAuctionItemRow(ChatComposeSupport.field_f);
            this.field_B[var12Lifetime1].field_mb = 50;
            this.field_B[var12Lifetime1].field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
            this.field_B[var12Lifetime1].field_y = 16777215;
          }
          if (this.field_T.a(false) + var6 == 0) {
            this.field_N = true;
          } else {
            this.field_N = false;
          }
          var12Lifetime2 = this.field_G.getScrollOffset((byte) 127);
          var13 = this.headerRowCount((byte) 84) - var8;
          var14 = this.headerRowCount((byte) -110);
          stackIn_47_0 = this.field_G;
          if (0 <= param3) {
            stackIn_48_1 = -var9Lifetime1 + (param3 + var13);
          } else {
            stackIn_48_1 = 0;
          }
          ((AuctionTableWidget) (Object) stackIn_47_0).installRows(stackIn_48_1, (byte) -47, this.field_B, param2 + var14);
          this.field_G.setScrollOffset(param0, var12Lifetime2);
          this.field_G.updateInput(0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_52_0 = var5;
          stackIn_52_1 = new StringBuilder().append("wf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void requestAuctionRefresh(int param0) {
        long var2 = 0L;
        if (!PlayArea.isGuestSession(100)) {
          if (NineSlicePanelPainter.field_e ||
            ModelMaterialDecoder.field_g) {
            return;
          }
          FootballerAiOverlaySupport.field_d.writeIsaacByte(84, (byte) 112);
          var2 = MonotonicClock.monotonicMillis(-79);
          if (param0 != 30353) {
            this.field_J = -31L;
          }
          this.field_H = var2;
          this.field_P.field_lb = true;
          return;
        }
    }

    private final void handleButtons(boolean param0, boolean param1) {
        UiLayoutNode stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        CheckboxLabelWidget stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        int var3;
        int var4;
        int var5;
        var4 = Kickabout.field_G;
        stackIn_2_0 = this.field_R;
        stackIn_3_1 = (NineSlicePanelPainter.field_e) ? 0 : 1;
        stackIn_6_2 = (ModelMaterialDecoder.field_g) ? 0 : 1;
        stackIn_2_0.field_lb = (stackIn_3_1 & stackIn_6_2) != 0;
        if (this.field_R.field_gb) {
          IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, QuickChatPhraseDefinition.field_v);
        }
        if ((3000L + this.field_J) >= MonotonicClock.monotonicMillis(23)) {
          this.field_P.field_lb = false;
        } else {
          this.field_P.field_lb = true;
        }
        for (var3 = 0; var3 < this.field_E.length; var3++) {
          if (this.field_E[var3].field_gb) {
            IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, FullscreenFocusCanvas.field_e, new String[]{RegistrationUiSupport.field_e[var3]}));
          }
        }
        if (this.field_R.field_sb == 1) {
          if (GameLoopApplet.field_E.canStartAuction(-3)) {
            if (GameLoopApplet.field_E.a((byte) -97)) {
              RankingsScreen.queueNewAuctionDialog(25);
              ShopPlayerSlot.c(49, 55);
            } else {
              SocketArchiveNetworkClient.enqueueMessageDialog((byte) 126, 33);
              ShopPlayerSlot.c(53, -126);
            }
          } else {
            SocketArchiveNetworkClient.enqueueMessageDialog((byte) 126, 6);
            ShopPlayerSlot.c(53, -120);
          }
        }
        var5 = 0;
        var3 = var5;
        while (var5 < this.field_E.length) {
          if (this.field_E[var5].field_sb == 1) {
            this.field_U = this.field_U ^ 1 << var5;
            ShopPlayerSlot.c(61, -118);
          }
          stackIn_32_0 = this.field_E[var5];
          stackIn_33_1 = (0 != (this.field_U & 1 << var5));
          stackIn_32_0.field_Gb = stackIn_33_1;
          var5++;
        }
        if (param0) {
          this.requestAuctionRefresh(48);
        }
        if (this.field_P.field_sb == 1) {
          this.field_J = MonotonicClock.monotonicMillis(-72);
          this.requestAuctionPage(false, (byte) -126);
          LoginKind.a((byte) 24);
        }
        QuickChatCategory.a(GameLoopApplet.field_E.field_x, 5464);
    }

    final static void startComputerMatch(int param0, boolean param1) {
        String var9 = null;
        String[] var3 = null;
        ClubState var4 = null;
        ClubState var5 = null;
        ClubState var10 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        try {
          PlayerPortraitCacheEntry.field_g = null;
          var9 = DiagnosticsOverlaySupport.field_d == 0L ? HuffmanTextSupport.field_b : ArchiveSource.field_e;
          String var2 = var9;
          var3 = new String[]{var9, PasswordFieldPainter.field_D};
          if (param0 != 10) {
            field_A = -58;
          }
          var4 = ClubStateFactory.createLocalClub(true, true);
          var4.field_k = 15;
          var4.field_w = 0;
          var4.field_R = 15;
          var5 = GameLoopApplet.field_E;
          if (param1) {
            var10 = ClubStateFactory.createLocalClub(false, true);
            var5 = var10;
            var10.field_o = 2;
            var10.field_K = 0;
            var10.field_k = 16;
            var10.field_w = 4;
            var10.field_R = 31;
          }
          var6 = WeightedLruCache.field_d > 0 ? 3 : 2;
          MachineTokenStorageSupport.field_e = new MatchScreen(false, (PlayerStats[]) null, var3, 0, false, false, 3, var6, false, false, false, false, false, -1, var4);
          for (var7 = 0; var7 < 2; var7++) {
            MachineTokenStorageSupport.field_e.matchState.field_g[var7].team = var7;
          }
          MachineTokenStorageSupport.field_e.matchState.surface = var5.field_K;
          MachineTokenStorageSupport.field_e.matchState.tier = var5.field_o;
          MachineTokenStorageSupport.field_e.matchState.field_H[0] = var5.field_w;
          MachineTokenStorageSupport.field_e.matchState.field_d[0] = var5.field_k;
          MachineTokenStorageSupport.field_e.matchState.field_Q[0] = var5.field_R;
          MachineTokenStorageSupport.field_e.matchState.field_H[1] = var4.field_w;
          MachineTokenStorageSupport.field_e.matchState.field_d[1] = var4.field_k;
          MachineTokenStorageSupport.field_e.matchState.field_Q[1] = var4.field_R;
          if (param1) {
            MachineTokenStorageSupport.field_e.matchState.field_b[0][0] = var5.squad[2];
            MachineTokenStorageSupport.field_e.matchState.field_b[0][1] = var5.squad[0];
            MachineTokenStorageSupport.field_e.matchState.field_b[0][2] = var5.squad[1];
            MachineTokenStorageSupport.field_e.matchState.field_b[0][3] = var5.squad[3];
            MachineTokenStorageSupport.field_e.matchState.field_b[1][0] = var4.squad[0];
            MachineTokenStorageSupport.field_e.matchState.field_b[1][1] = var4.squad[1];
            MachineTokenStorageSupport.field_e.matchState.field_b[1][2] = var4.squad[2];
            MachineTokenStorageSupport.field_e.matchState.disableLocal = true;
            MachineTokenStorageSupport.field_e.matchState.field_b[1][3] = var4.squad[3];
            MachineTokenStorageSupport.field_e.beginPhase(param0 + 26405, 4);
            PlayArea.a(MachineTokenStorageSupport.field_e.matchState, 0);
          } else {
            MachineTokenStorageSupport.field_e.beginPhase(26415, 2);
            RenderedFootballer.a(GameKeyHandler.field_a, true, (byte) -117);
          }
          StringCursor.a(false, (byte) -122, MachineTokenStorageSupport.field_e.matchState.tier, MachineTokenStorageSupport.field_e.matchState.surface);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wf.IA(" + param0 + ',' + param1 + ')');
        }
    }

    final void setAuctionList(boolean param0, ReceivedAuctionItem[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          this.field_T = new IntrusiveDeque();
          for (var3_int = 0; var3_int < param1.length; var3_int++) {
            this.field_T.addLast(param1[var3_int], 3);
          }
          if (!param0) {
            this.drawScreen(68, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void requestAuctionPage(boolean param0, byte param1) {
        long var3 = 0L;
        if (param1 > -125) {
          return;
        }
        if (!PlayArea.isGuestSession(100)) {
          if (NineSlicePanelPainter.field_e ||
            ModelMaterialDecoder.field_g) {
            return;
          }
          if (this.field_D - 5 <= this.field_T.a(false)) {
            this.requestAuctionRefresh(30353);
          }
          FootballerAiOverlaySupport.field_d.writeIsaacByte(param0 ? 83 : 55, (byte) -91);
          FootballerAiOverlaySupport.field_d.beginBitWrite(-115);
          FootballerAiOverlaySupport.field_d.writeBits(4, 79, this.field_U);
          FootballerAiOverlaySupport.field_d.writeBits(3, 93, this.field_F);
          FootballerAiOverlaySupport.field_d.writeBits(3, 79, this.field_C);
          FootballerAiOverlaySupport.field_d.finishBitWrite(false);
          FootballerAiOverlaySupport.field_d.writeMedium(-5 + this.field_D, (byte) 109);
          var3 = MonotonicClock.monotonicMillis(-111);
          this.field_P.field_lb = true;
          this.field_H = var3;
          return;
        }
    }

    AuctionsScreen() {
        this.field_T = new IntrusiveDeque();
        this.field_N = true;
        this.field_F = 4;
        this.field_V = 0;
        this.field_J = -1L;
        this.field_D = 0;
        this.field_H = -1L;
        this.field_C = 0;
    }

    static {
        field_M = "Become a member to use the Trinkets Expansion.";
        field_A = 0;
        field_I = null;
    }
}
