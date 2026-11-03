/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameplayHelpScreen extends PagedHelpScreen {
    static String field_J;
    static boolean[] field_G;
    static String field_H;
    static String field_L;
    static IntrusiveDeque field_I;
    private ScrollContainer field_E;
    private PlayerStats[] field_F;
    private SquadSlotWidget[] field_K;

    final static UiLayoutNode j(byte param0) {
        int var4 = 0;
        int var8 = 0;
        SelectableTrinketIcon stackIn_30_0;
        boolean stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        int stackIn_31_4;
        int var2;
        int var3;
        UiLayoutNode var5;
        int var6;
        int var7;
        int var9;
        SelectableTrinketIcon var10;
        int var11;
        UiLayoutNode var12;
        int var7Lifetime1;
        var11 = Kickabout.field_G;
        var12 = new UiLayoutNode();
        if (param0 != 15) {
          GameplayHelpScreen.j((byte) 80);
        }
        var2 = 0;
        var3 = ca.field_f.length;
        if (!LoginMethod.b(param0 - 15) ||
          !wn.a((byte) 50) &&
          !c.a(QuickChatKeysHelpPanel.field_Ab[32], 0, BufferedSocket.field_f)) {
          var3--;
        }
        for (var4 = 0; var4 < var3; var4++) {
          var5 = new UiLayoutNode();
          var5.a(true, Trinket.field_d.field_q, 20, 44 + var4 * 44 - 10, Trinket.field_d.field_w);
          var5.field_N = (Sprite) ((Object) Trinket.field_d);
          var12.addChild((byte) -121, var5);
          var6 = ca.field_f[var4];
          for (var7 = 0; var7 < ca.field_f[var4]; var7++) {
            if (hv.field_a[QuickChatKeysHelpPanel.field_Ab[var2 + var7]] &&
              !c.a(QuickChatKeysHelpPanel.field_Ab[var7 + var2], 0, BufferedSocket.field_f)) {
              var6--;
            }
          }
          var7Lifetime1 = 0;
          for (var8 = 0; var8 < ca.field_f[var4]; var8++) {
            var9 = 0;
            if (hv.field_a[QuickChatKeysHelpPanel.field_Ab[var2]] &&
              !c.a(QuickChatKeysHelpPanel.field_Ab[var2], 0, BufferedSocket.field_f)) {
              var9 = 1;
            }
            if (var9 == 0) {
              var10 = new SelectableTrinketIcon(QuickChatKeysHelpPanel.field_Ab[var2]);
              stackIn_30_0 = var10;
              stackIn_30_1 = true;
              stackIn_30_2 = 32;
              stackIn_30_3 = -((var6 >> 1) * 50) + 120;
              if (var6 % 2 == 0) {
                stackIn_31_4 = 25;
              } else {
                stackIn_31_4 = 0;
              }
              ((SelectableTrinketIcon) (Object) stackIn_30_0).a(stackIn_30_1, stackIn_30_2, stackIn_30_3 + (stackIn_31_4 + var7Lifetime1 * 50), 10 + 44 * var4, 32);
              var2++;
              var7Lifetime1++;
              var12.addChild((byte) -121, (UiLayoutNode) (var10));
            } else {
              var2++;
            }
          }
        }
        var12.a(true, 300, 0, 0, 48 * (var3 - 1) + 40);
        return var12;
    }

    final void updateScreen(byte param0, boolean param1) {
        RenderedFootballer dupTemp$0 = null;
        RenderedFootballer dupTemp$1 = null;
        RenderedFootballer dupTemp$2 = null;
        RenderedFootballer dupTemp$3 = null;
        RenderedFootballer dupTemp$4 = null;
        RenderedFootballer dupTemp$5 = null;
        RenderedFootballer dupTemp$6 = null;
        RenderedFootballer dupTemp$7 = null;
        RenderedFootballer var3_ref_gm;
        int var3;
        int var4;
        RenderedFootballer var5_ref_gm;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        RenderedFootballer var10;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        RenderedFootballer var5_ref_gmLifetime1;
        RenderedFootballer var5_ref_gmLifetime2;
        var9 = Kickabout.field_G;
        super.updateScreen((byte) -106, param1);
        if (this.pageIndex == 0) {
          bk.field_a[1].directionMask = 0;
          var10 = bk.field_a[0];
          var5_ref_gm = var10;
          var5_ref_gmLifetime1 = var10;
          var3_ref_gm = var10;
          var10.directionMask = 0;
          if (field_G[TextPromptDialog.field_Kb]) {
            dupTemp$0 = bk.field_a[0];
            dupTemp$0.directionMask = dupTemp$0.directionMask | 4;
          }
          if (field_G[PlayerContextMenu.field_e]) {
            dupTemp$1 = bk.field_a[0];
            dupTemp$1.directionMask = dupTemp$1.directionMask | 2;
          }
          if (field_G[oc.field_e]) {
            dupTemp$2 = bk.field_a[0];
            dupTemp$2.directionMask = dupTemp$2.directionMask | 1;
          }
          if (field_G[IsSixCommand.field_A]) {
            dupTemp$3 = bk.field_a[0];
            dupTemp$3.directionMask = dupTemp$3.directionMask | 8;
          }
          if (field_G[98]) {
            dupTemp$4 = bk.field_a[1];
            dupTemp$4.directionMask = dupTemp$4.directionMask | 4;
          }
          if (field_G[96]) {
            dupTemp$5 = bk.field_a[1];
            dupTemp$5.directionMask = dupTemp$5.directionMask | 2;
          }
          if (field_G[99]) {
            dupTemp$6 = bk.field_a[1];
            dupTemp$6.directionMask = dupTemp$6.directionMask | 1;
          }
          if (field_G[97]) {
            dupTemp$7 = bk.field_a[1];
            dupTemp$7.directionMask = dupTemp$7.directionMask | 8;
          }
          for (var4 = 0; var4 < 2; var4++) {
            var5_ref_gmLifetime2 = bk.field_a[var4];
            var5_ref_gmLifetime2.stepMovement(2, (PlayArea[]) null, false, false);
            var5_ref_gmLifetime2.resetPose((byte) 126);
            if (var5_ref_gmLifetime2.action != 0 &&
              0 >= var5_ref_gmLifetime2.actionTime) {
              var5_ref_gmLifetime2.setAction((byte) -31, 0);
            }
          }
        }
        ArchiveManager.field_d = -1;
        var3 = 2147483647;
        var4Lifetime1 = -13 / ((38 - param0) / 60);
        if (this.pageIndex == 2) {
          for (var5 = 0; ip.field_b.length > var5; var5++) {
            var6 = -ChatMessage.field_f[var5][0] + ArrayWidgetContainer.field_x;
            var7 = us.field_j - ChatMessage.field_f[var5][1];
            var8 = var7 * var7 + var6 * var6;
            if (var3 > var8) {
              var3 = var8;
              ArchiveManager.field_d = var5;
            }
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < ip.field_b.length; var5Lifetime2++) {
            ip.field_b[var5Lifetime2].resetPose((byte) 125);
          }
        }
        if (ArrayWidgetContainer.field_x == -1 ||
          us.field_j == -1 ||
          4900 < var3) {
          ArchiveManager.field_d = -1;
        }
        if (this.pageIndex == 3) {
          for (var5Lifetime1 = 0; var5Lifetime1 < 9; var5Lifetime1++) {
            this.field_K[var5Lifetime1].b(0, param1);
            this.field_K[var5Lifetime1].a(31, 11, (byte) 126, 16, this.field_F[var5Lifetime1]);
          }
          this.field_E.field_s = this.slideOffsetX + 220;
          this.field_E.b(0, param1);
          this.field_E.advanceScroll(32 * StatefulTextPainter.field_v, true, (byte) -115, 32);
        }
    }

    final void drawScreen(int param0, boolean param1) {
        int var4;
        var4 = Kickabout.field_G;
        super.drawScreen(param0, param1);
        if (this.pageIndex == 0) {
          this.drawMovePage((byte) 96);
        } else {
          if (this.pageIndex != 1) {
            if (2 == this.pageIndex) {
              this.drawPlayersPage(param0 + 335);
            } else {
              if (this.pageIndex == 3) {
                this.drawPlayerStatsPage(param0 ^ 8489);
              } else {
                if (4 != this.pageIndex) {
                  if (this.pageIndex == 5) {
                    this.drawKeyFactsPage(param0 ^ -123);
                  }
                } else {
                  this.drawTrinketsPage(140);
                }
              }
            }
          } else {
            this.drawFeetPage((byte) -128);
          }
        }
    }

    private final void drawPlayersPage(int param0) {
        int var2 = 0;
        int stackIn_9_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Kickabout.field_G;
        if (param0 != 330) {
          return;
        }
        for (var2 = 0; ip.field_b.length > var2; var2++) {
          PacketBuffer.a(73, UrlRequest.field_k);
          SoftwareRasterizer.clearFramebuffer();
          if (var2 != 3 &&
            var2 != 4) {
            stackIn_9_0 = 700;
          } else {
            stackIn_9_0 = 600;
          }
          var3 = stackIn_9_0;
          var4 = SoftwareRasterizer.field_g >> 1;
          var5 = SoftwareRasterizer.field_f - 15;
          ip.field_b[var2].renderModel(var3, 128, var4, var5, (byte) -87);
          TeamManagementScreen.e(param0 - 204);
          var6 = ChatMessage.field_f[var2][0] + this.slideOffsetX;
          var7 = ChatMessage.field_f[var2][1];
          if (var2 == ArchiveManager.field_d) {
            eo.a(UrlRequest.field_k, 65793);
            eo.a(UrlRequest.field_k, 11184810);
            eo.a(UrlRequest.field_k, 12303291);
            eo.a(UrlRequest.field_k, 8947848);
            eo.a(UrlRequest.field_k, 4473924);
          }
          UrlRequest.field_k.drawHalfSize(-(UrlRequest.field_k.field_o >> 2) + var6, var7 - (UrlRequest.field_k.field_v >> 2));
        }
        if (ArchiveManager.field_d < 0) {
          ic.a(280, QuickChatPhraseDefinition.field_q, false, (String) null, 240, false, true, 330 + this.slideOffsetX);
        } else {
          ic.a(280, dr.field_c[ArchiveManager.field_d], false, dk.field_h[ArchiveManager.field_d], 240, false, true, this.slideOffsetX + 330);
        }
        return;
    }

    private final void drawKeyFactsPage(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        int var9;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        String var7;
        int var8;
        var9 = Kickabout.field_G;
        if (param0 != 126) {
          this.drawTrinketsPage(81);
        }
        var2 = 0;
        for (var3 = 0; var3 < 2; var3++) {
          stackIn_7_0 = (var3 != 1) ? 0 : 1;
          var4 = stackIn_7_0;
          stackIn_10_0 = (var4 != 0) ? 345 : 50;
          var5 = stackIn_10_0;
          var5 = var5 + this.slideOffsetX;
          var6 = 146;
          SoftwareRasterizer.a(-10 + var5, 126, 265, 270, 10, 65793, 140);
          while (s.field_M.length > var2) {
            var7 = s.field_M[var2];
            var8 = IsSixCommand.field_C.paragraphHeight(var7, 245, 16);
            if (var8 + var6 <= 396) {
              var2++;
              var6 = var6 + (20 + IsSixCommand.field_C.a(var7, var5, var6, 245, 999, 16777215, -1, 0, 0, 16) * 16);
              continue;
            }
            break;
          }
        }
    }

    private final void drawFeetPage(byte param0) {
        int stackIn_3_0 = 0;
        Sprite stackIn_12_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        Sprite var8;
        int var9;
        int var10;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var9 = Kickabout.field_G;
        stackIn_3_0 = (AccountRegistrationPanel.field_C == null) ? 0 : 1;
        var2 = stackIn_3_0;
        if (var2 != 0) {
          DirectByteStorage.field_g.c(this.slideOffsetX + 490, 112);
        }
        IsSixCommand.field_C.a(ListingRowCache.field_g, this.slideOffsetX + 60, 136, 16777215, -1);
        var3 = 40 + this.slideOffsetX;
        for (var4 = 0; var4 < 2; var4++) {
          SoftwareRasterizer.a(var3, 150, 210, 200, 10, 65793, 140);
          un.field_d.a(LoginRequiredDialog.field_L[var4].toUpperCase(), 20 + var3, 175, 16777215, -1);
          for (var5 = 0; var5 < 2; var5++) {
            var6 = var5 * 120 + (var3 + 20);
            IsSixCommand.field_C.a(JaggrabDownloader.field_e[var4][var5], 90 + (var3 - 80 * var5), 84 * var5 + 185, 110, 70, 16777215, -1, var5 << 1, 1, 16);
            var7 = 186 + 74 * var5;
            if (var5 == 0) {
              stackIn_12_0 = RegistrationRequestDialog.field_qb;
            } else {
              stackIn_12_0 = PlayerInputEvent.field_q;
            }
            var8 = stackIn_12_0;
            if (var8 != null) {
              var8.c(var6, var7);
            }
          }
          var3 += 220;
        }
        SoftwareRasterizer.a(40 + this.slideOffsetX, 360, 430, 43, 10, 65793, 140);
        if (ak.field_f != null) {
          ak.field_f.c(120 + this.slideOffsetX, 363);
        }
        if (param0 != -128) {
          GameplayHelpScreen.j((byte) 0);
        }
        IsSixCommand.field_C.a(gf.field_d, 150 + this.slideOffsetX, 360, 300, 43, 16777215, -1, 0, 1, 16);
        if (var2 != 0) {
          var10 = 0;
          var4Lifetime1 = var10;
          while (2 > var10) {
            var5Lifetime1 = this.slideOffsetX + (50 + var10 * 14);
            var6Lifetime1 = var10 * 12 + 361;
            lt.field_d[var10].c(var5Lifetime1, var6Lifetime1);
            var10++;
          }
        }
    }

    final void buildWidgets(int param0) {
        int var2 = 0;
        int var3_int = 0;
        int var5 = Kickabout.field_G;
        int var3_intLifetime1;
        int var3_intLifetime2;
        ip.field_b = new RenderedFootballer[5];
        for (var2 = 0; var2 < ip.field_b.length; var2++) {
          var3_int = 0;
          if (var2 == 1) {
            var3_int = 4;
          }
          if (2 == var2) {
            var3_int = 3;
          }
          if (3 == var2) {
            var3_int = 1;
          }
          if (var2 == 4) {
            var3_int = 2;
          }
          ip.field_b[var2] = new RenderedFootballer(AuctionItem.a(11, 16, 0, var3_int, 0, 0, 31, false, false, false), var3_int, true);
          ip.field_b[var2].archetype = var3_int;
          ip.field_b[var2].resetPose((byte) 127);
          ip.field_b[var2].field_mb.a(ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(79, ip.field_b[var2].field_mb.a(true), new Random()), -61);
        }
        bk.field_a = new RenderedFootballer[2];
        PlayerStats var6 = new PlayerStats();
        var6.archetype = 0;
        var6.speed = 100;
        for (var3_intLifetime1 = 0; var3_intLifetime1 < 2; var3_intLifetime1++) {
          bk.field_a[var3_intLifetime1] = new RenderedFootballer(AuctionItem.a(4, 16, var3_intLifetime1, 0, var3_intLifetime1, var3_intLifetime1, 31, false, false, false), 0, true);
          bk.field_a[var3_intLifetime1].applyPlayerStats(true, var6, 3);
        }
        UrlRequest.field_k = new Sprite(200, 300);
        for (var3_intLifetime2 = 0; 9 > var3_intLifetime2; var3_intLifetime2++) {
          this.field_F[var3_intLifetime2] = new PlayerStats();
          this.field_K[var3_intLifetime2] = new SquadSlotWidget();
          this.field_K[var3_intLifetime2].field_s = 45 + var3_intLifetime2 % 3 * 52;
          this.field_K[var3_intLifetime2].field_J = var3_intLifetime2 / 3 * 75 + 178;
        }
        PlayerStats var3 = this.field_F[1];
        var3.power = 8;
        var3.speed = 27;
        var3.surnameIndex = 12;
        var3.tackle = 25;
        var3.initialIndex = 10;
        var3.archetype = 3;
        var3.experience = 24;
        var3 = this.field_F[2];
        var3.archetype = 0;
        var3.experience = 14;
        var3.power = 21;
        var3.speed = 12;
        var3.tackle = 62;
        var3.initialIndex = 90;
        var3.surnameIndex = 11;
        var3 = this.field_F[3];
        var3.power = 11;
        var3.appearance = 512;
        if (param0 != -38) {
          this.field_K = (SquadSlotWidget[]) null;
        }
        var3.archetype = 0;
        var3.initialIndex = 30;
        var3.speed = 7;
        var3.tackle = 35;
        var3.surnameIndex = 13;
        var3.experience = 36;
        var3 = this.field_F[5];
        var3.initialIndex = 50;
        var3.surnameIndex = 14;
        var3.power = 82;
        var3.tackle = 12;
        var3.archetype = 1;
        var3.experience = 98;
        var3.speed = 35;
        UiLayoutNode var4 = new UiLayoutNode();
        var4.a(true, 350, 0, 0, 350);
        this.field_E = new ScrollContainer(0L, var4, new UiLayoutNode(), rr.field_b);
        this.field_E.setLayout(15, 220 + this.slideOffsetX, 0, (byte) 6, 220, this.field_E.field_Db.field_q + 15, 180);
    }

    public static void g(int param0) {
        field_J = null;
        field_G = null;
        if (param0 != 29250) {
          return;
        }
        field_I = null;
        field_H = null;
        field_L = null;
    }

    private final void drawMovePage(byte param0) {
        int var4 = 0;
        boolean[] array$0 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        boolean[] stackIn_12_0 = null;
        boolean[] stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        boolean stackIn_13_3 = false;
        int stackIn_15_2 = 0;
        boolean stackIn_16_3 = false;
        int stackIn_18_2 = 0;
        boolean stackIn_19_3 = false;
        int stackIn_21_2 = 0;
        boolean stackIn_22_3 = false;
        Sprite[] stackIn_27_0 = null;
        int stackIn_28_1 = 0;
        BinaryBitmapFont stackIn_31_0 = null;
        String stackIn_31_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_38_0 = 0;
        Sprite[] stackIn_42_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_46_0 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        boolean[] var7;
        int[] var8;
        int[] var9;
        int var10;
        int var12;
        int var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        int var10Lifetime1;
        var13 = Kickabout.field_G;
        stackIn_3_0 = (null == AccountRegistrationPanel.field_C) ? 0 : 1;
        var2 = stackIn_3_0;
        IsSixCommand.field_C.a(ReceivedAuctionItemRow.field_Fb, 60 + this.slideOffsetX, 136, 16777215, -1);
        var3 = this.slideOffsetX + 40;
        if (param0 != 96) {
          this.field_F = (PlayerStats[]) null;
        }
        for (var4 = 0; 2 > var4; var4++) {
          SoftwareRasterizer.a(var3, 150, 275, 250, 10, 65793, 140);
          stackIn_9_0 = 137 + var3;
          if (var4 == 0) {
            stackIn_10_1 = -60;
          } else {
            stackIn_10_1 = 60;
          }
          var5 = stackIn_9_0 + stackIn_10_1;
          un.field_d.a(DelegatingCanvas.field_d[var4].toUpperCase(), var3 + 20, 180, 16777215, -1);
          PacketBuffer.a(param0 ^ -19, UrlRequest.field_k);
          SoftwareRasterizer.clearFramebuffer();
          bk.field_a[var4].renderModel(950, 300, SoftwareRasterizer.field_g >> 1, (SoftwareRasterizer.field_f >> 1) + 60, (byte) -71);
          TeamManagementScreen.e(param0 ^ 24);
          var6 = bk.field_a[var4].directionMask;
          array$0 = new boolean[4];
          stackIn_12_0 = array$0;
          stackIn_12_1 = array$0;
          stackIn_12_2 = 0;
          stackIn_13_3 = ((var6 & 2) != 0);
          stackIn_12_1[stackIn_12_2] = stackIn_13_3;
          stackIn_15_2 = 1;
          stackIn_16_3 = ((8 & var6) != 0);
          stackIn_12_0[stackIn_15_2] = stackIn_16_3;
          stackIn_18_2 = 2;
          stackIn_19_3 = (0 != (var6 & 4));
          stackIn_12_0[stackIn_18_2] = stackIn_19_3;
          stackIn_21_2 = 3;
          stackIn_22_3 = ((1 & var6) != 0);
          stackIn_12_0[stackIn_21_2] = stackIn_22_3;
          var7 = stackIn_12_0;
          var8 = new int[]{var5 - 50, var5 + 50, var5, var5};
          var9 = new int[]{280, 280, 230, 330};
          if (var2 != 0) {
            for (var10 = 0; var10 < 4; var10++) {
              stackIn_27_0 = AccountRegistrationPanel.field_C[var4][var10];
              if (var7[var10]) {
                stackIn_28_1 = 1;
              } else {
                stackIn_28_1 = 0;
              }
              var14 = stackIn_27_0[stackIn_28_1];
              var15 = var14;
              var14.c(var8[var10] - (var15.field_o >> 1), var9[var10] - (var15.field_v >> 1));
            }
          }
          UrlRequest.field_k.drawHalfSize(var5 - (UrlRequest.field_k.field_o >> 2), -(UrlRequest.field_k.field_v >> 2) + 280);
          stackIn_31_0 = IsSixCommand.field_C;
          stackIn_31_1 = cu.field_d[var4];
          if (0 == var4) {
            stackIn_32_2 = 85;
          } else {
            stackIn_32_2 = 0;
          }
          ((BinaryBitmapFont) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_32_2 + 10 + var3, 185, 160, 70, 16777215, -1, 1, 1, 16);
          if (bk.field_a[var4].action == 4) {
            stackIn_38_0 = (bk.field_a[var4].actionTime > BuyPitchDialog.field_I[4] - 13) ? 1 : 0;
          } else {
            stackIn_38_0 = 0;
          }
          var10Lifetime1 = stackIn_38_0;
          IsSixCommand.field_C.d(DelegatingCanvas.field_c[var4], var3 + 137, 382, 16777215, -1);
          if (var2 != 0) {
            stackIn_42_0 = DebugConsole.field_y[var4];
            if (var10Lifetime1 == 0) {
              stackIn_43_1 = 0;
            } else {
              stackIn_43_1 = 1;
            }
            var16 = stackIn_42_0[stackIn_43_1];
            stackIn_46_0 = (var4 == 0) ? 138 : 60;
            var12 = stackIn_46_0;
            var16.c(var12 + var3, 324);
          }
          var3 += 285;
        }
    }

    final boolean handleKey(int param0, int param1, char param2) {
        if (param1 >= -5) {
          GameplayHelpScreen.k((byte) 83);
        }
        boolean decompiledFrameRemainder0 = true;
        if (0 == this.pageIndex) {
          if (param0 != 98 &&
            99 != param0 &&
            param0 != 96) {
            if (97 == param0) {
              return true;
            }
            if (param0 == 83) {
              if (bk.field_a[0].action == 0) {
                bk.field_a[0].setAction((byte) -31, 4);
              }
              return true;
            }
            decompiledFrameRemainder0 = (param0 == 82);
            if (decompiledFrameRemainder0) {
              if (0 == bk.field_a[1].action) {
                bk.field_a[1].setAction((byte) -31, 4);
              }
              return true;
            }
          }
          if (decompiledFrameRemainder0) {
            return true;
          }
        }
        return super.handleKey(param0, -78, param2);
    }

    private final void drawTrinketsPage(int param0) {
        int var4 = 0;
        int var6 = 0;
        int var5 = 0;
        int var7 = Kickabout.field_G;
        int var5Lifetime1;
        SoftwareRasterizer.a(40 + this.slideOffsetX, 121, 560, 60, 10, 65793, param0);
        IsSixCommand.field_C.a(ReceivedAuctionItem.field_H, this.slideOffsetX + 55, 131, 530, 40, 16777215, -1, 0, 1, 16);
        int var2 = 40 + this.slideOffsetX;
        int[][] var3 = new int[][]{new int[]{0, 1, 2, 3}, new int[]{4, 36, 80, 87}};
        for (var4 = 0; var4 < 2; var4++) {
          SoftwareRasterizer.a(var2, 190, 275, 208, 10, 65793, 140);
          un.field_d.a(gf.field_e[var4].toLowerCase(), var2 + 10, 212, 16777215, -1);
          for (var5 = 0; var5 < 4; var5++) {
            pa.field_g[var3[var4][var5]].d(false).c(110 + (var2 + var5 * 40), 200);
          }
          var5Lifetime1 = 242;
          for (var6 = 0; var6 < hv.field_c[var4].length; var6++) {
            var5Lifetime1 = var5Lifetime1 + (10 + 16 * IsSixCommand.field_C.a(hv.field_c[var4][var6], 10 + var2, var5Lifetime1, 255, 1000, 16777215, -1, 0, 0, 16));
          }
          var2 += 285;
        }
    }

    final static boolean k(byte param0) {
        if (param0 > -22) {
          GameplayHelpScreen.g(124);
        }
        return k.field_m != null ? true : false;
    }

    private final void drawPlayerStatsPage(int param0) {
        int var2;
        int var3;
        int var7;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var6Lifetime1;
        var7 = Kickabout.field_G;
        var2 = -1;
        if (param0 != -8494) {
          this.handleKey(65, 78, '￩');
        }
        for (var3 = 0; 9 > var3; var3++) {
          if (this.field_K[var3].field_gb &&
            !this.field_K[var3].field_Eb.isEmpty(-2)) {
            var2 = var3;
          }
        }
        ListingRowCache.a(-1, 178, 45 + this.slideOffsetX, (byte) -96, var2);
        for (var3Lifetime1 = 0; var3Lifetime1 < 9; var3Lifetime1++) {
          this.field_K[var3Lifetime1].field_s = this.slideOffsetX + 45 + var3Lifetime1 % 3 * 52;
          this.field_K[var3Lifetime1].b(0, false);
          this.field_K[var3Lifetime1].h((byte) -122);
        }
        SoftwareRasterizer.a(this.slideOffsetX + 40, 120, 560, 50, 10, 65793, 140);
        IsSixCommand.field_C.a(sh.field_e, 70 + this.slideOffsetX, 126, 500, 40, 16777215, -1, 0, 1, 16);
        SoftwareRasterizer.a(this.slideOffsetX + 210, 178, 390, 225, 10, 65793, 140);
        this.field_E.a(94, false);
        AuctionListing.a(this.field_E.field_Gb.field_q + this.field_E.field_F, -22914, this.field_E.field_F, this.field_E.field_T + this.field_E.field_Gb.field_mb, this.field_E.field_T);
        var3Lifetime2 = this.field_E.field_F + 10;
        var4 = 30 + this.field_E.field_Db.field_T;
        var5 = var4;
        for (var6 = 0; var6 < 4; var6++) {
          un.field_d.a(bl.field_d[var6].toLowerCase(), var3Lifetime2 - 6, var5, 16777215, -1);
          eo.a(200 + var3Lifetime2, -12 + var5, 10 + 17 * ((1 + var6) % 4) % 30, var6, true, 0);
          var5 += 6;
          var5 = var5 + IsSixCommand.field_C.a(ng.field_k[var6], var3Lifetime2 - 5, var5, 340, 1000, 14540253, -1, 0, 0, 17) * 17;
          var5 += 50;
        }
        var6Lifetime1 = -10 - var4 + var5;
        if (var6Lifetime1 != this.field_E.field_Db.field_mb) {
          this.field_E.field_Db.field_mb = var6Lifetime1;
          this.field_E.layoutScrollbars(15, 0, 0);
        }
        TeamManagementScreen.e(param0 + 8617);
    }

    GameplayHelpScreen() {
        this.field_F = new PlayerStats[9];
        this.field_K = new SquadSlotWidget[9];
    }

    static {
        field_J = "Login: ";
        field_L = "(MAX)";
        field_H = "Ask to join <%0>'s game";
        field_G = new boolean[112];
    }
}
