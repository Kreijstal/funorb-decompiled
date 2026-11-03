/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Kickabout extends GameLoopApplet {
    private boolean field_L;
    static ResourceArchive field_J;
    static String field_I;
    static UiLayoutNode field_H;
    static String field_F;
    public static int field_G;

    public final void a(int param0, boolean param1) {
        boolean stackIn_3_1 = false;
        boolean stackIn_17_0 = false;
        AppScreen stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        boolean stackIn_31_2 = false;
        boolean stackIn_59_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        AuctionListing var8;
        AuctionListing var9;
        boolean stackIn_59_0Lifetime1;
        boolean stackIn_59_0Lifetime2;
        var7 = field_G;
        stackIn_3_1 = (param1);
        boolean decompiledFrameRemainder0 = true;
        this.field_L = stackIn_3_1;
        ColourSwatchTile.b(17702);
        if (ByteStorage.field_c &&
          this.field_L && ((null != SplashScreen.field_m ||
          vb.field_k) &&
          (GameModesHelpScreen.field_G != null &&
          um.field_e == GameModesHelpScreen.field_G ||
          AuctionLogEntry.field_h == um.field_e &&
          null == GameModesHelpScreen.field_G)) && um.field_e.f((byte) 29)) {
          stackIn_17_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_17_0 = false;
        }
        kw.b(stackIn_17_0, (byte) -116);
        re.b(param0 ^ -105);
        ((GameResourceLoader) (NetworkGameClient.field_t)).pollMessageOfTheDay(0);
        if (um.field_e == null &&
          !FadingSoundPlayer.field_q &&
          !od.field_n ||
          null != um.field_e &&
          MyKitScreen.field_O) {
          MenuButton.a(2);
        }
        if (param0 != -25) {
          this.onShutdown((byte) -89);
        }
        stackIn_30_0 = AuctionLogEntry.field_h;
        stackIn_30_1 = -96;
        stackIn_31_2 = (this.field_L) && (null == GameModesHelpScreen.field_G);
        ((AppScreen) (Object) stackIn_30_0).updateScreen((byte) stackIn_30_1, stackIn_31_2);
        if (GameModesHelpScreen.field_G == null) {
          if (um.field_e != null &&
            AuctionLogEntry.field_h != um.field_e) {
            um.field_e.updateScreen((byte) 119, false);
          } else {
            if (null != SortCriterion.field_l &&
              SortCriterion.field_l != AuctionLogEntry.field_h) {
              SortCriterion.field_l.updateScreen((byte) -116, false);
            }
          }
        } else {
          var3 = (BuyPlayerDialog.field_I << 8) / 24;
          AuctionLogEntry.field_h.setTransitionProgress(var3, false, -53, GameModesHelpScreen.field_G);
          GameModesHelpScreen.field_G.setTransitionProgress(var3, true, -100, AuctionLogEntry.field_h);
          GameModesHelpScreen.field_G.updateScreen((byte) -51, false);
          if (!ka.field_b) {
            BuyPlayerDialog.field_I = BuyPlayerDialog.field_I + 1;
          }
          var4 = -BuyPlayerDialog.field_I + 24;
          var5 = (var4 * var4 << 8) / 576;
          var6 = -var5 + 256;
          FormationAgent.field_f = var5 * po.a(AuctionLogEntry.field_h, -4) + po.a(GameModesHelpScreen.field_G, -4) * var6 >> 8;
          if (BuyPlayerDialog.field_I == 24) {
            cv.a((byte) 105);
          }
        }
        ImageProducerRasterBuffer.b(true);
        if (this.field_L) {
          var9 = (AuctionListing) (GameLoopApplet.field_E.auctionListings.g(24009));
          while (true) {
            if (var9 != null) {
              var9.c((byte) -109);
              stackIn_59_0 = ColourSwatchTile.a(param0 ^ -149, var9);
              if (stackIn_59_0) {
                ContextMenu.a((byte) -25, var9, true);
              }
              var9 = (AuctionListing) (GameLoopApplet.field_E.auctionListings.c(33));
              continue;
            }
            break;
          }
          var8 = (AuctionListing) (vd.field_a.g(param0 + 24034));
          while (var8 != null) {
            var8.c((byte) -109);
            stackIn_59_0Lifetime1 = ColourSwatchTile.a(140, var8);
            if (stackIn_59_0Lifetime1) {
              ContextMenu.a((byte) -25, var8, false);
            }
            var8 = (AuctionListing) (vd.field_a.c(33));
          }
          stackIn_59_0Lifetime2 = GameLoopApplet.field_E.field_m;
          if (stackIn_59_0Lifetime2) {
            gw.c(0);
            GameLoopApplet.field_E.field_m = false;
          }
          this.updateLogoHover(param0 ^ 23294);
        }
        if (PlayArea.a(100) &&
          ws.field_f) {
          ql.a(31663);
          ws.field_f = false;
        }
    }

    private final void updateLogoHover(int param0) {
        if (param0 != -23271) {
          return;
        }
        if (IntKeyLookup.field_b == null ||
          "" == IntKeyLookup.field_b) {
          return;
        }
        if (ak.a(AuctionLogEntry.field_h, param0 + 23275) == 0) {
          return;
        }
        ArgbSprite var2 = DelayedServerPacket.field_g == null ? (ArgbSprite) (MainMenuScreen.field_C) : DelayedServerPacket.field_g;
        int var3 = -var2.field_o + 640 >> 1;
        if (BytePlusOneCommand.field_A >= var3 && var2.field_o + var3 >= BytePlusOneCommand.field_A && 10 <= ArchiveManager.field_m &&
          !(ArchiveManager.field_m > (10 + var2.field_v))) {
          IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, IntKeyLookup.field_b);
        }
    }

    final void onConnectionResult(int param0, byte param1) {
        int var3;
        int var4;
        var4 = field_G;
        LobbyGameRecord.a(4, -120);
        SquadGridWidget.a(7, (byte) -97);
        if (AuctionLogEntry.field_h instanceof FindingOpponentScreen) {
          DelayedServerPacket.a(0, false, -2);
        }
        var3 = -37 % ((-39 - param1) / 32);
        if (param0 == 1) {
          QuickChatPhraseCache.field_d = true;
          LoginText.field_e = true;
        } else {
          if (od.field_n) {
            TextButton.field_B = true;
            al.field_Db = true;
            k.field_k = true;
            if (null != um.field_e) {
              if (!um.field_e.isSpectator(-2)) {
                ka.a(2, IntTripleCommand.field_B);
                ng.a(10, 113);
              } else {
                ng.a(0, 104);
              }
              DelayedServerPacket.a(18, false, -2);
            } else {
              if (SortCriterion.field_l == null) {
                DelayedServerPacket.a(0, false, -2);
              } else {
                ka.a(2, IntTripleCommand.field_B);
                ng.a(10, 112);
                DelayedServerPacket.a(18, false, -2);
              }
            }
            od.field_n = false;
            vr.b(1);
          }
          LoginText.field_e = false;
          QuickChatPhraseCache.field_d = false;
        }
    }

    public static void releaseStatics(byte param0) {
        field_H = null;
        field_I = null;
        field_F = null;
        field_J = null;
        if (param0 >= -35) {
          Kickabout.releaseStatics((byte) -40);
        }
    }

    private final void drawLogoBanner(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        ArgbSprite var7;
        Object stackIn_5_0 = null;
        if (param0 < 95) {
          return;
        }
        if (null != DelayedServerPacket.field_g) {
          stackIn_5_0 = DelayedServerPacket.field_g;
        } else {
          stackIn_5_0 = MainMenuScreen.field_C;
        }
        var7 = (ArgbSprite) (stackIn_5_0);
        var3 = 640 - var7.field_o >> 1;
        var4 = ak.a(AuctionLogEntry.field_h, 4);
        if (GameModesHelpScreen.field_G != null) {
          var5 = ak.a(GameModesHelpScreen.field_G, 4);
          if (var4 > var5) {
            var6 = Math.min(256, (BuyPlayerDialog.field_I << 9) / 24);
            var4 = var4 + ((-var4 + var5) * var6 >> 8);
          } else {
            if (var5 > var4) {
              var6 = Math.max(0, -256 + 2 * ((BuyPlayerDialog.field_I << 8) / 24));
              var4 = var4 + ((-var4 + var5) * var6 >> 8);
            }
          }
        }
        if (256 == var4) {
          var7.c(var3, 10);
        }
        if (0 != var4) {
          var7.b(var3, 10, var4);
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        int var8 = 0;
        int var7 = 0;
        int fieldTemp$0 = 0;
        boolean stackIn_38_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_49_0 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_60_0 = false;
        boolean stackIn_75_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_86_0 = false;
        boolean stackIn_92_0 = false;
        boolean stackIn_97_0 = false;
        boolean stackIn_109_0 = false;
        boolean stackIn_115_0 = false;
        boolean stackIn_120_0 = false;
        boolean stackIn_126_0 = false;
        boolean stackIn_131_0 = false;
        boolean stackIn_140_0 = false;
        int stackIn_146_0 = 0;
        boolean stackIn_151_0 = false;
        boolean stackIn_156_0 = false;
        boolean stackIn_163_0 = false;
        boolean stackIn_168_0 = false;
        boolean stackIn_174_0 = false;
        boolean stackIn_183_0 = false;
        boolean stackIn_192_0 = false;
        boolean stackIn_240_0 = false;
        boolean stackOut_139_0;
        int var4;
        int var5;
        int var6_int;
        AppScreen var6;
        String[] var7_ref_String__;
        int var9;
        String[] var10;
        String var11;
        ManagerAction var12;
        int var6_intLifetime1;
        int stackIn_146_0Lifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        var9 = field_G;
        var4 = GameplayHelpScreen.field_G[82] ? 1 : 0;
        var5 = GameplayHelpScreen.field_G[86] ? 1 : 0;
        if (ka.field_b &&
          83 == param1) {
          BuyPlayerDialog.field_I = BuyPlayerDialog.field_I + 1;
          return true;
        }
        if (param1 == 103 &&
          tb.field_v == 1) {
          tb.field_v = 0;
        }
        if (102 == param1 &&
          tb.field_v == 0) {
          tb.field_v = 1;
        }
        if (AchievementsScreen.a(false)) {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder0 = true;
          if (var4 != 0 &&
            var5 != 0) {
            if ((param1 != 51) &&
              (decompiledFrameRemainder0 = (param2 != 96))) {
              ListingRowCache.field_a = false;
              return true;
            }
            if (decompiledFrameRemainder0) {
              var11 = "The quick brown fox jumped over the lazy rabbit. Also this sentence is getting quite long with some long words that might not fit at end of a sentence/line but we shall see. Oooh double-barrel-ness, see how it deals with that.";
              var10 = RasterBuffer.a(var11, 100, (byte) -69);
              var7_ref_String__ = var10;
              if (var7_ref_String__ == null) {
                return true;
              }
              for (var8 = 0; var10.length > var8; var8++) {
                System.out.println(var10[var8]);
              }
              return true;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param2 == 96) {
              r.field_d = new DebugConsole(EmailSyntaxValidator.d((byte) 26), IsSixCommand.field_C, oo.field_c);
              oa.registerOverlay(false, r.field_d);
              return r.field_d.a(11516, param1, param2);
            }
            if (param1 == 89) {
              System.gc();
              return true;
            }
            decompiledFrameRemainder2 = (var4 != 0);
            if ((decompiledFrameRemainder2) &&
              (var5 != 0)) {
              if (param1 == 1) {
                AnimationClip.a(RankingsScreen.field_C, param0 - 11592, false, ih.field_c);
                gs.a(0);
                return true;
              }
              if (2 == param1) {
                AnimationClip.a(RankingsScreen.field_C, -76, true, ih.field_c);
                gs.a(0);
                return true;
              }
              if (16 == param1) {
                stackIn_75_0 = !(ListingRowCache.field_a);
                ListingRowCache.field_a = stackIn_75_0;
                return true;
              }
              if (param1 == 17) {
                stackIn_81_0 = !(hr.field_k);
                hr.field_k = stackIn_81_0;
                return true;
              }
              if (param1 == 18) {
                stackIn_86_0 = !(LineupAgent.field_o);
                LineupAgent.field_o = stackIn_86_0;
                return true;
              }
              if (param1 == 19) {
                stackIn_92_0 = !(th.field_d);
                th.field_d = stackIn_92_0;
                return true;
              }
              if (param1 == 20) {
                stackIn_97_0 = !(LineupAgent.field_g);
                LineupAgent.field_g = stackIn_97_0;
                return true;
              }
              decompiledFrameRemainder1 = (param1 == 21);
              if (decompiledFrameRemainder1) {
                for (var6_int = 0; GameLoopApplet.field_E.field_J.length > var6_int; var6_int++) {
                  GameLoopApplet.field_E.field_J[var6_int] = true;
                }
                decompiledFrameRemainder3 = false;
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (16 == param1) {
              stackIn_38_0 = !(ListingRowCache.field_a);
              ListingRowCache.field_a = stackIn_38_0;
              return true;
            }
            if (param1 == 17) {
              stackIn_44_0 = !(hr.field_k);
              hr.field_k = stackIn_44_0;
              return true;
            }
            if (param1 == 18) {
              stackIn_49_0 = !(LineupAgent.field_o);
              LineupAgent.field_o = stackIn_49_0;
              return true;
            }
            if (param1 == 19) {
              stackIn_55_0 = !(th.field_d);
              th.field_d = stackIn_55_0;
              return true;
            }
            if (param1 == 20) {
              stackIn_60_0 = !(LineupAgent.field_g);
              LineupAgent.field_g = stackIn_60_0;
              return true;
            }
            decompiledFrameRemainder1 = (param1 == 21);
            if (decompiledFrameRemainder1) {
              for (var6_intLifetime3 = 0; GameLoopApplet.field_E.field_J.length > var6_intLifetime3; var6_intLifetime3++) {
                GameLoopApplet.field_E.field_J[var6_intLifetime3] = true;
              }
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (!PlayArea.a(100))) {
            var6_intLifetime2 = 0;
            for (var7 = 0; var7 < GameLoopApplet.field_E.field_J.length; var7++) {
              stackOut_139_0 = GameLoopApplet.field_E.field_J[var7];
              stackIn_146_0 = stackOut_139_0 ? 1 : 0;
              stackIn_140_0 = stackOut_139_0;
              if (stackIn_140_0) {
                var6_intLifetime2 = var6_intLifetime2 | 1 << var7;
              }
            }
            or.field_d.b(69, (byte) -54);
            or.field_d.writeInt(-88, var6_intLifetime2);
          }
          if (decompiledFrameRemainder2) {
            stackIn_146_0Lifetime1 = -23;
            if (stackIn_146_0Lifetime1 == ~param1) {
              stackIn_151_0 = !(gk.field_e);
              gk.field_e = stackIn_151_0;
              return true;
            }
            if (param1 == 23) {
              stackIn_156_0 = !(wp.field_f);
              wp.field_f = stackIn_156_0;
              if (null == um.field_e) {
                return true;
              }
              um.field_e.a(-109);
              return true;
            }
            if (param1 == 24) {
              stackIn_163_0 = !(SquadPickerDialog.field_K);
              SquadPickerDialog.field_K = stackIn_163_0;
              return true;
            }
            if (param1 == 25) {
              stackIn_168_0 = !(ka.field_b);
              ka.field_b = stackIn_168_0;
              return true;
            }
            if (26 == param1) {
              stackIn_174_0 = !(gs.field_g);
              gs.field_g = stackIn_174_0;
              return true;
            }
            if (27 == param1) {
              fieldTemp$0 = fa.field_j + 1;
              fa.field_j = fa.field_j + 1;
              fa.field_j = fieldTemp$0 & 3;
              return true;
            }
            if (85 == param1) {
              stackIn_183_0 = !(IsSixCommand.field_B);
              IsSixCommand.field_B = stackIn_183_0;
              return true;
            }
            if (35 == param1) {
              FormationView.b((byte) -116);
            }
            if (param1 == 39) {
              stackIn_192_0 = !(pc.field_e);
              pc.field_e = stackIn_192_0;
              return true;
            }
            if (param1 == 40 &&
              !PlayArea.a(param0 ^ 11416)) {
              or.field_d.b(85, (byte) 112);
              return true;
            }
            if (param1 == 41 &&
              !PlayArea.a(100)) {
              or.field_d.b(80, (byte) 114);
              return true;
            }
            if (param1 == 56 &&
              !PlayArea.a(100)) {
              or.field_d.b(81, (byte) 107);
              or.field_d.field_n = or.field_d.field_n + 2;
              var6_intLifetime1 = or.field_d.field_n;
              or.field_d.writeByte(113, 1);
              var12 = new ManagerAction(3, new int[]{0, 0});
              var12.writeToPacket(1, or.field_d);
              or.field_d.backpatchShortLength(or.field_d.field_n - var6_intLifetime1, 62);
              return true;
            }
            if (param1 == 1) {
              AnimationClip.a(0, param0 - 11592, NanoTickClock.field_n, ih.field_c);
              gs.a(0);
              return true;
            }
            if (param1 == 2) {
              AnimationClip.a(1, -76, NanoTickClock.field_n, ih.field_c);
              gs.a(param0 - 11516);
              return true;
            }
            if (param1 == 3) {
              AnimationClip.a(2, -76, NanoTickClock.field_n, ih.field_c);
              gs.a(0);
              return true;
            }
            if (param1 == 4) {
              AnimationClip.a(3, param0 ^ -11448, NanoTickClock.field_n, ih.field_c);
              gs.a(0);
              return true;
            }
          }
          if (var5 != 0) {
            if (param1 == 1) {
              AnimationClip.a(RankingsScreen.field_C, -76, NanoTickClock.field_n, 0);
              gs.a(param0 ^ 11516);
              return true;
            }
            if (param1 == 2) {
              AnimationClip.a(RankingsScreen.field_C, -76, NanoTickClock.field_n, 1);
              gs.a(0);
              return true;
            }
            if (param1 == 3) {
              AnimationClip.a(RankingsScreen.field_C, param0 ^ -11448, NanoTickClock.field_n, 2);
              gs.a(0);
              return true;
            }
          }
          if (87 == param1) {
            SquadPickerDialog.field_J = (SquadPickerDialog.field_J + 1) % 10;
            return true;
          }
          if (param1 == 88) {
            SquadPickerDialog.field_J = (9 + SquadPickerDialog.field_J) % 10;
            return true;
          }
        }
        var6 = AuctionLogEntry.field_h;
        if (param0 != 11516) {
          return true;
        }
        if (null != GameModesHelpScreen.field_G) {
          var6 = GameModesHelpScreen.field_G;
        }
        if (var6 == null) {
          stackIn_240_0 = false;
        } else {
          stackIn_240_0 = var6.handleKey(param1, -17, param2);
        }
        return stackIn_240_0;
    }

    private final void drawLoadingBar(int param0) {
        SoftwareRasterizer.a(0, 300, 640, 87, 0, 190);
        int var2 = (int)(250.0f * TextInputWidget.field_R / 100.0f);
        int var3 = var2 + 196;
        un.field_d.d(LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TickClock.field_e, new String[]{h.field_b[ih.field_c][RankingsScreen.field_C].toUpperCase()}), 320, 332, 16777215, 0);
        SoftwareRasterizer.f(193, 348, 254, 19, 8, 268435455);
        if (param0 != 81) {
          return;
        }
        if (var2 <= 16) {
          AuctionListing.a((var2 >> 1) + 195, -22914, 0, 480, 0);
          SoftwareRasterizer.i(195, 350, 250, 15, 6, 268435455);
          TeamManagementScreen.e(117);
          AuctionListing.a(640, -22914, (var2 >> 1) + 195, 480, 0);
          SoftwareRasterizer.i(-250 + (var2 + 195), 350, 250, 15, 6, 268435455);
          TeamManagementScreen.e(122);
        } else {
          SoftwareRasterizer.i(195, 350, var2, 15, 6, 268435455);
        }
        AuctionListing.a(640, -22914, var3, 480, 0);
        ConsoleTokenCursor.field_d.d(SquadGridWidget.field_Db, 320, 362, 16777215, -1);
        TeamManagementScreen.e(126);
        AuctionListing.a(var3, -22914, 0, 480, 0);
        ConsoleTokenCursor.field_d.d(SquadGridWidget.field_Db, 320, 362, 65793, -1);
        TeamManagementScreen.e(param0 ^ 39);
    }

    public Kickabout() {
        CharSequence var2 = (CharSequence) ((Object) gw.field_b);
        GameLoopApplet.field_E = new ClubState(LoggedPlayer.a(var2, false));
        AnimationClip.field_g = this;
    }

    final static void t(int param0) {
        int var3_int = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ArgbSprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ArgbSprite var11 = null;
        int stackIn_11_0Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = field_G;
        try {
          var11 = AccountChoicePanel.field_B;
          if (param0 != -826875391) {
            Kickabout.releaseStatics((byte) -117);
          }
          var2 = 0;
          for (var3_int = 0; var3_int < var11.field_v; var3_int++) {
            var4 = 70 * var3_int / var11.field_v;
            for (var5 = 0; var11.field_o > var5; var5++) {
              var11.field_y[var2] = TextLayoutLine.b(var11.field_y[var2], -16777216);
              var11.field_y[var2] = PainterStyle.a(var11.field_y[var2], PainterStyle.a(PainterStyle.a(var4 << 16, var4 << 8), var4));
              var2++;
            }
          }
          var3 = AccountChoicePanel.field_B;
          FullscreenFocusCanvas.field_d = new Sprite(((Sprite) ((Object) var3)).field_o, ((Sprite) ((Object) var3)).field_v);
          var10 = 0;
          var4Lifetime1 = var10;
          var5Lifetime1 = 0;
          while (true) {
            stackIn_11_0 = ~((Sprite) ((Object) var3)).field_v;
            if (stackIn_11_0 >= ~var5Lifetime1) {
              po.field_h = new Sprite(((Sprite) ((Object) var3)).field_o, ((Sprite) ((Object) var3)).field_v);
              return;
            }
            var6 = 0;
            var7 = 0;
            for (var8 = 0; var8 < ((Sprite) ((Object) var3)).field_o; var8++) {
              stackIn_11_0Lifetime1 = var6;
              if (stackIn_11_0Lifetime1 == 0 &&
                (((Sprite) ((Object) var3)).field_y[var10] & -16777216) != 0) {
                incrementValue$0 = var7;
                var7++;
                if (5 < incrementValue$0) {
                  var6 = 1;
                }
              }
              incrementValue$1 = var10;
              var10++;
              stackIn_21_0 = FullscreenFocusCanvas.field_d.field_y;
              stackIn_21_1 = incrementValue$1;
              if (var6 != 0) {
                stackIn_22_2 = -1;
              } else {
                stackIn_22_2 = 0;
              }
              stackIn_21_0[stackIn_21_1] = stackIn_22_2;
            }
            var5Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "Kickabout.HA(" + param0 + ')');
        }
    }

    final void onShutdown(byte param0) {
        ph.a(4);
        if (param0 != -24) {
          return;
        }
        r.a(true);
    }

    final void onStartup(byte param0) {
        if (param0 >= -23) {
          this.onStartup((byte) 116);
        }
        this.initialiseClient(1, 69, 0, 2, 18, (byte) -4, 4, true);
        this.startWithLoader(107, new GameResourceLoader());
        FullscreenFocusCanvas.a(oo.field_c, (byte) 23, (java.awt.Component) ((Object) ic.field_d));
        ListingRow.a((byte) -8, IntTripleCommand.field_A);
    }

    final void applyPendingNavigation(int param0) {
        if (2147483647 == op.field_v) {
        } else {
          if (op.field_v != -3) {
            DelayedServerPacket.a(op.field_v, false, -2);
          } else {
            MouseWheelInput.a(-1822);
          }
        }
        RenderedFootballer.i(0);
        if (param0 < 50) {
          field_I = (String) null;
        }
    }

    final boolean isConnectionBusy(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -70) {
          return true;
        }
        stackIn_8_0 = (od.field_n) || (LoginText.field_e) || (QuickChatPhraseCache.field_d);
        return stackIn_8_0;
    }

    final boolean handlePacket(int param0, CipherPacketBuffer param1, int param2) {
        boolean stackIn_9_0 = false;
        boolean stackIn_10_1 = false;
        int stackIn_29_0 = 0;
        CipherPacketBuffer stackIn_29_1 = null;
        boolean stackIn_30_2 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_37_1 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_1 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_56_1 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_91_0 = false;
        boolean stackIn_93_0 = false;
        boolean stackIn_94_1 = false;
        int stackIn_160_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        MatchScreen stackIn_192_0 = null;
        boolean stackIn_193_1 = false;
        int stackIn_242_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_254_1 = 0;
        boolean stackIn_257_0 = false;
        int stackIn_272_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_278_0 = 0;
        RuntimeException stackIn_306_0 = null;
        StringBuilder stackIn_306_1 = null;
        String stackIn_307_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        String[] var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ReceivedAuctionItem[] var5_ref_vc__ = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        ReceivedAuctionItem[] var7_ref_vc__ = null;
        int var7 = 0;
        int var8_int = 0;
        ChatMessage var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        ReceivedAuctionItem[] var30 = null;
        ReceivedAuctionItem[] var31 = null;
        String[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        String var40 = null;
        PlayerStats[] var41 = null;
        ng var42 = null;
        String var43 = null;
        String[] var44 = null;
        String var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        ReceivedAuctionItem[] var5_ref_vc__Lifetime1;
        int[] var5_ref_int__Lifetime1;
        int[] var5_ref_int__Lifetime2;
        int[] var6_ref_int__Lifetime1;
        int[] var6_ref_int__Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8_intLifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        int var4_intLifetime5;
        int var4_intLifetime6;
        int var4_intLifetime7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime3;
        int var7Lifetime4;
        int var5Lifetime2Lifetime1;
        int var5Lifetime4Lifetime1;
        int var5Lifetime4Lifetime2;
        int var4_intLifetime6Lifetime1;
        int var4_intLifetime6Lifetime2;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        var22 = field_G;
        try {
          if (param2 != 1) {
            this.isConnectionBusy((byte) -8);
          }
          if (param0 == 90) {
            ((GameResourceLoader) (NetworkGameClient.field_t)).requestMessageOfTheDay((byte) 115);
            return true;
          }
          if (param0 == 86) {
            stackIn_9_0 = false;
            stackIn_10_1 = (param1.readUnsignedByte((byte) -122) == 1);
            fj.a(stackIn_9_0, stackIn_10_1);
            return true;
          }
          if (85 == param0) {
            ds.field_g = true;
            return true;
          }
          if (param0 == 84) {
            rr.field_f = true;
            return true;
          }
          if (param0 == 81) {
            vd.field_a.a(new AuctionListing(un.field_e), param2 ^ 2);
            return true;
          }
          if (71 != param0 &&
            83 != param0) {
            if (73 == param0) {
              ds.field_g = false;
              param1.p(-127);
              stackIn_36_0 = false;
              stackIn_37_1 = (param1.l(1, 59) == 1);
              fj.a(stackIn_36_0, stackIn_37_1);
              param1.l((byte) 103);
              var4_int = un.field_e.readUnsignedMedium(param2 ^ -97);
              var5 = un.field_e.readSignedMedium(param2 ^ 65281);
              var6 = un.field_e.readUnsignedByte((byte) -119);
              var7_ref_vc__ = new ReceivedAuctionItem[var6];
              for (var8_int = 0; var8_int < var6; var8_int++) {
                var7_ref_vc__[var8_int] = ReceivedAuctionItem.readAuctionItem(param2 - 21833, un.field_e);
              }
              ((AuctionsScreen) (rn.a(param2 - 120, 16))).updateAuctionRows(true, var7_ref_vc__, var4_int, var5);
              return true;
            }
            if (param0 == 76) {
              ds.field_g = false;
              param1.p(-104);
              stackIn_45_0 = false;
              stackIn_46_1 = (param1.l(1, param2 ^ 58) == 1);
              fj.a(stackIn_45_0, stackIn_46_1);
              param1.l((byte) -84);
              var4_intLifetime1 = un.field_e.readUnsignedByte((byte) -125);
              var30 = new ReceivedAuctionItem[var4_intLifetime1];
              var5_ref_vc__ = var30;
              for (var6Lifetime1 = 0; var6Lifetime1 < var4_intLifetime1; var6Lifetime1++) {
                var5_ref_vc__[var6Lifetime1] = ReceivedAuctionItem.readAuctionItem(-21832, un.field_e);
              }
              FadingSoundPlayer.linkAuctionItemsToLog((byte) 99, var30);
              return true;
            }
            if (param0 == 80) {
              ds.field_g = false;
              param1.p(-100);
              stackIn_55_0 = false;
              stackIn_56_1 = (param1.l(1, param2 + 58) == 1);
              fj.a(stackIn_55_0, stackIn_56_1);
              param1.l((byte) 112);
              var4_intLifetime2 = un.field_e.readUnsignedByte((byte) -125);
              var31 = new ReceivedAuctionItem[var4_intLifetime2];
              var5_ref_vc__Lifetime1 = var31;
              for (var6Lifetime2 = 0; var6Lifetime2 < var4_intLifetime2; var6Lifetime2++) {
                var5_ref_vc__Lifetime1[var6Lifetime2] = ReceivedAuctionItem.readAuctionItem(TrinketShopDialog.b(param2, -21831), un.field_e);
              }
              ((AuctionsScreen) (rn.a(-53, 16))).setAuctionList(true, var31);
              return true;
            }
            if (param0 == 77) {
              var4_intLifetime3 = un.field_e.readUnsignedByte((byte) -115);
              k.a(true, var4_intLifetime3);
              BufferedSocket.field_k = var4_intLifetime3;
              if (AuctionLogEntry.field_h instanceof PlayerShopScreen) {
                if (null != GameModesHelpScreen.field_G) {
                  return true;
                }
                ((ButtonMenuScreen) (AuctionLogEntry.field_h)).enterScreen(param2 ^ 1, 0, true);
                tb.a((byte) 126, 28);
              }
              return true;
            }
            if (param0 == 78) {
              var32 = new String[param1.a((byte) 81)];
              var4 = var32;
              for (var5Lifetime1 = 0; var32.length > var5Lifetime1; var5Lifetime1++) {
                var4[var5Lifetime1] = param1.readString(TrinketShopDialog.b(param2, -112));
              }
              gg.a(var32, (byte) 88);
              return true;
            }
            if (70 == param0) {
              ui.field_y = true;
              GameLoopApplet.field_E.readFromPacket(85, param1, 4);
              ByteStorage.field_c = GameLoopApplet.field_E.field_d;
              if (GameLoopApplet.field_E.field_L) {
                tb.field_v = 1;
              } else {
                tb.field_v = 0;
              }
              ei.field_n = GameLoopApplet.field_E.field_A;
              if (!CachedListingRow.field_h) {
                ConsoleValue.a(GameLoopApplet.field_E.field_p, (byte) 33);
                pe.a(GameLoopApplet.field_E.field_F, (byte) -116);
              }
              if (AuctionLogEntry.field_h instanceof TeamManagementScreen &&
                GameModesHelpScreen.field_G == null) {
                ((ButtonMenuScreen) (AuctionLogEntry.field_h)).enterScreen(0, 0, true);
                tb.a((byte) 126, 28);
              }
              param1.p(param2 ^ -105);
              stackIn_88_0 = (param1.l(1, 59) == 1);
              c.field_g = stackIn_88_0;
              stackIn_91_0 = (1 == param1.l(1, 59));
              f.field_c = stackIn_91_0;
              stackIn_93_0 = false;
              stackIn_94_1 = (param1.l(1, 59) == 1);
              fj.a(stackIn_93_0, stackIn_94_1);
              param1.l((byte) 108);
              return true;
            }
            if (param0 == 74) {
              var4_intLifetime4 = param1.readInt(param2 + 3);
              if (um.field_e != null) {
                um.field_e.a(-21573, param1);
              }
              or.field_d.b(57, (byte) -80);
              or.field_d.writeInt(param2 ^ -30, var4_intLifetime4);
              return true;
            }
            if (param0 == 9) {
              cv.a((byte) 87);
              LoginText.field_e = false;
              DelayedServerPacket.a(10, false, -2);
              ka.a(2, param1.readString(param2 - 98));
              return true;
            }
            if (param0 == 14) {
              cv.a((byte) 81);
              ConsoleTokenCursor.a(NetworkGameClient.f(param2 ^ 1), 120, ig.a((byte) 6, 1250), ig.a((byte) 6, 16), AnimationPlayer.b(-116), UrlRequest.field_c, dr.a(param2 ^ 1), 150, ArchiveSource.field_c.length, 1024);
              DropTargetWidget.a(64, LoginRequiredDialog.h((byte) -64), ButtonMenuScreen.f((byte) -63));
              LoginText.field_e = false;
              od.field_n = true;
              if (!QuickChatPhraseCache.field_d) {
                DelayedServerPacket.a(-3, false, -2);
              }
              return true;
            }
            if (param0 == 15) {
              if (od.field_n) {
                ReceivedAuctionItem.f((byte) 119);
                ContextMenuItem.b(122);
                DelayedServerPacket.a(0, false, -2);
                TextButton.field_B = true;
                k.field_k = true;
                od.field_n = false;
                al.field_Db = true;
                vr.b(1);
              }
              QuickChatPhraseCache.field_d = false;
              LoginText.field_e = false;
              return true;
            }
            if (10 == param0 &&
              od.field_n) {
              VerticalScrollbar.i(14);
              return true;
            }
            if (param0 == 67) {
              var23 = new int[8];
              var48 = var23;
              var35 = var48;
              var4_array = var35;
              for (var5Lifetime2 = 0; 2 >= var5Lifetime2; var5Lifetime2++) {
                var23[var5Lifetime2] = param1.readInt(TrinketShopDialog.b(param2, 5));
              }
              var46 = var4_array;
              var33 = var46;
              var24 = var33;
              var5_ref_int__ = var24;
              var47 = BufferedSocket.field_f;
              var34 = var47;
              var25 = var34;
              var6_ref_int__ = var25;
              for (var7 = 0; var7 < 8; var7++) {
                var24[var7] = TextLayoutLine.b(var46[var7], ~var47[var7]);
              }
              for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < 73; var5Lifetime2Lifetime1++) {
                if (c.a(var5Lifetime2Lifetime1, 0, var48)) {
                  LoginText.field_f.a(new IntValueNode(var5Lifetime2Lifetime1), 3);
                  ok.field_a.a(new IntValueNode(var5Lifetime2Lifetime1), 3);
                }
              }
              var49 = BufferedSocket.field_f;
              var36 = var49;
              var26 = var36;
              var5_ref_int__Lifetime1 = var26;
              var50 = var4_array;
              var37 = var50;
              var27 = var37;
              var6_ref_int__Lifetime1 = var27;
              for (var7Lifetime3 = 0; var7Lifetime3 < 8; var7Lifetime3++) {
                var26[var7Lifetime3] = PainterStyle.a(var49[var7Lifetime3], var50[var7Lifetime3]);
              }
              var51 = WelcomeDialog.field_F;
              var38 = var51;
              var28 = var38;
              var5_ref_int__Lifetime2 = var28;
              var52 = var4_array;
              var39 = var52;
              var29 = var39;
              var6_ref_int__Lifetime2 = var29;
              for (var7Lifetime4 = 0; var7Lifetime4 < 8; var7Lifetime4++) {
                var28[var7Lifetime4] = PainterStyle.a(var51[var7Lifetime4], var52[var7Lifetime4]);
              }
              if (ResourceArchive.field_g) {
                RasterBuffer.a(20164);
              }
              return true;
            }
            if (param0 == 75) {
              var4_intLifetime5 = param1.readUnsignedByte((byte) -114);
              for (var5Lifetime3 = 0; var5Lifetime3 < var4_intLifetime5; var5Lifetime3++) {
                var40 = param1.readString(80);
                r.field_d.a("  <col=99ccff># " + var40 + "</col", (byte) 94);
              }
              return true;
            }
            if (param0 != 64 &&
              param0 != 65) {
              if (param0 == 66) {
                if (null != SortCriterion.field_l) {
                  TextButton.field_B = true;
                  DelayedServerPacket.a(-3, false, -2);
                  vr.b(1);
                }
                if (null != um.field_e &&
                  um.field_e.isOnlineMatch) {
                  um.field_e.leaveMatch(false, param2 ^ 19);
                  al.field_Db = true;
                  TextButton.field_B = true;
                  DelayedServerPacket.a(-3, false, -2);
                  vr.b(param2 ^ 0);
                }
                QuickChatPhraseCache.field_d = false;
                return true;
              }
              if (82 == param0) {
                tb.a((byte) 126, 38);
                return true;
              }
              if (um.field_e != null &&
                um.field_e.isOnlineMatch) {
                if (69 == param0) {
                  um.field_e.readMatchState((byte) -17, param1);
                  return true;
                }
                if (68 == param0) {
                  var4_intLifetime6 = param1.readUnsignedByte((byte) -105);
                  for (var5Lifetime4 = 0; var5Lifetime4 < var4_intLifetime6; var5Lifetime4++) {
                    um.field_e.field_m.tick(4);
                  }
                  var5Lifetime4 = param1.readInt(4);
                  um.field_e.field_m.a(param1, -5);
                  var6Lifetime3 = um.field_e.field_m.computeChecksum(-98);
                  if (var5Lifetime4 != -1 &&
                    ~var6Lifetime3 != ~var5Lifetime4 &&
                    um.field_e.field_g) {
                    UnreadMessagesScreen.a("ChecksumError: server=" + Integer.toHexString(var5Lifetime4) + " client=" + Integer.toHexString(var6Lifetime3), (Throwable) ((Object) new IllegalStateException(um.field_e.field_m.toString())), 1);
                    um.field_e.field_g = false;
                  }
                  um.field_e.field_i.copyStateFrom(um.field_e.field_m, (byte) 119);
                  return true;
                }
              }
              if (param0 == 87) {
                if (um.field_e != null) {
                  al.field_Db = true;
                }
                var6Lifetime3Lifetime1 = 0;
                param1.p(-114);
                var5Lifetime4Lifetime1 = 0;
                var4_intLifetime6Lifetime1 = 0;
                stackIn_242_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var4_intLifetime6Lifetime1 = stackIn_242_0;
                stackIn_245_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var5Lifetime4Lifetime1 = stackIn_245_0;
                stackIn_248_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var6Lifetime3Lifetime1 = stackIn_248_0;
                param1.l((byte) -50);
                stackIn_251_0 = (var6Lifetime3Lifetime1 != 0) ? 0 : 1;
                if (var5Lifetime4Lifetime1 == var4_intLifetime6Lifetime1) {
                  stackIn_254_1 = 0;
                } else {
                  stackIn_254_1 = 1;
                }
                stackIn_257_0 = (stackIn_251_0 == stackIn_254_1);
                if (!stackIn_257_0) {
                  throw new RuntimeException("Tried to init a lobby without the full state being sent [" + (var4_intLifetime6Lifetime1 != 0) + "," + (var5Lifetime4Lifetime1 != 0) + "," + (var6Lifetime3Lifetime1 != 0) + "]");
                }
                SortCriterion.field_l = new TournamentLobbyScreen(param1);
                MusicPatchNode.a(-88);
                if (null == GameModesHelpScreen.field_G ||
                  GameModesHelpScreen.field_G.screenId != 18) {
                  if (AuctionLogEntry.field_h.screenId == -2) {
                    AuctionLogEntry.field_h = (AppScreen) ((Object) SortCriterion.field_l);
                  } else {
                    al.field_Db = true;
                    ng.a(-2, param2 ^ 71);
                    DelayedServerPacket.a(18, false, param2 - 3);
                  }
                }
                QuickChatPhraseCache.field_d = false;
                return true;
              }
              if (null != SortCriterion.field_l &&
                param0 == 88) {
                param1.p(-112);
                var6Lifetime3Lifetime2 = 0;
                var4_intLifetime6Lifetime2 = 0;
                var5Lifetime4Lifetime2 = 0;
                stackIn_272_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var4_intLifetime6Lifetime2 = stackIn_272_0;
                stackIn_275_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var5Lifetime4Lifetime2 = stackIn_275_0;
                stackIn_278_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var6Lifetime3Lifetime2 = stackIn_278_0;
                param1.l((byte) 103);
                if (var4_intLifetime6Lifetime2 != 0) {
                  SortCriterion.field_l.readPlayerNames(param1, false);
                }
                if (var5Lifetime4Lifetime2 != 0) {
                  SortCriterion.field_l.a(param2 + 8, param1);
                }
                if (var6Lifetime3Lifetime2 != 0) {
                  SortCriterion.field_l.a(param1, (byte) 110);
                }
                return true;
              }
              if (param0 == 89) {
                var42 = new ng();
                var42.a(param1, param2 ^ -20364);
                var43 = var42.a((byte) 51);
                var44 = RasterBuffer.a(var43, 80, (byte) 123);
                for (var7Lifetime1 = 0; var7Lifetime1 < var44.length; var7Lifetime1++) {
                  var8 = new ChatMessage(2, "", 0, "", var44[var7Lifetime1]);
                  SectorCacheStore.a((byte) 94, var8);
                }
                return true;
              }
              if (param0 != 91) {
                return false;
              }
              var45 = param1.readString(param2 - 108);
              if (um.field_e != null &&
                um.field_e.field_A ||
                SortCriterion.field_l != null) {
                ConsoleValue.a(2009, var45);
              }
              return true;
            }
            ok.field_a.b(22997);
            if (SortCriterion.field_l != null) {
              TextButton.field_B = true;
            }
            var4_intLifetime7 = param1.field_n;
            cv.a((byte) 72);
            stackIn_160_0 = (0 == param1.readUnsignedByte((byte) -106)) ? 0 : 1;
            var5Lifetime5 = stackIn_160_0;
            stackIn_163_0 = (0 == param1.readUnsignedByte((byte) -116)) ? 0 : 1;
            var6Lifetime4 = stackIn_163_0;
            var7Lifetime2 = param1.readUnsignedByte((byte) -117);
            var8_intLifetime1 = param1.readUnsignedByte((byte) -126);
            stackIn_166_0 = (param1.readUnsignedByte((byte) -123) == 0) ? 0 : 1;
            var9 = stackIn_166_0;
            stackIn_169_0 = (0 == param1.readUnsignedByte((byte) -113)) ? 0 : 1;
            var10 = stackIn_169_0;
            var11 = param1.readUnsignedByte((byte) -111);
            var12 = new String[var11];
            for (var13 = 0; var12.length > var13; var13++) {
              var12[var13] = param1.readString(-111);
            }
            var13Lifetime1 = param1.readByte((byte) -64);
            var14 = null;
            if (var10 != 0 &&
              var13Lifetime1 >= 0) {
              var41 = new PlayerStats[9];
              var14 = var41;
              for (var15 = 0; 9 > var15; var15++) {
                ((Object[]) (var14))[var15] = new PlayerStats();
                var41[var15].readFromPacket(39, param1);
              }
            }
            vs.field_g = null;
            var15Lifetime1 = param1.readUnsignedByte((byte) -128);
            stackIn_181_0 = (0 == (var15Lifetime1 & 1)) ? 0 : 1;
            var16 = stackIn_181_0;
            stackIn_184_0 = ((var15Lifetime1 & 2) == 0) ? 0 : 1;
            var17 = stackIn_184_0;
            stackIn_187_0 = ((var15Lifetime1 & 4) == 0) ? 0 : 1;
            var18 = stackIn_187_0;
            stackIn_190_0 = ((var15Lifetime1 & 8) == 0) ? 0 : 1;
            var19 = stackIn_190_0;
            var20 = param1.readByte((byte) -87);
            um.field_e = new MatchScreen(true, (PlayerStats[]) (var14), var12, var13Lifetime1, var5Lifetime5 != 0, var6Lifetime4 != 0, var7Lifetime2, var8_intLifetime1, var9 != 0, var10 != 0, var16 != 0, var17 != 0, var18 != 0, var20, (ClubState) null);
            stackIn_192_0 = um.field_e;
            stackIn_193_1 = (var19 != 0);
            stackIn_192_0.field_v = stackIn_193_1;
            MusicPatchNode.a(-76);
            if (GameModesHelpScreen.field_G == null ||
              GameModesHelpScreen.field_G.screenId != 18) {
              if (AuctionLogEntry.field_h.screenId == -1) {
                AuctionLogEntry.field_h = (AppScreen) ((Object) um.field_e);
              } else {
                TextButton.field_B = true;
                ng.a(-1, param2 ^ 85);
                DelayedServerPacket.a(18, false, -2);
              }
            }
            QuickChatPhraseCache.field_d = false;
            var21 = param1.field_n - var4_intLifetime7;
            if (var21 != ms.field_b) {
              throw new RuntimeException("");
            }
            return true;
          }
          rr.field_f = false;
          stackIn_29_0 = -105;
          stackIn_29_1 = (CipherPacketBuffer) (param1);
          stackIn_30_2 = (83 == so.field_b);
          SquadGridWidget.$cfr$intArgs$a$fbddc791f0bf(stackIn_29_0, stackIn_29_1, stackIn_30_2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_306_0 = var4_ref;
          stackIn_306_1 = new StringBuilder().append("Kickabout.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_307_2 = "null";
          } else {
            stackIn_307_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_306_0), ((StringBuilder) (Object) stackIn_306_1).append(stackIn_307_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0) {
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        TournamentLobbyScreen stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean stackIn_45_2 = false;
        MatchScreen stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        boolean stackIn_54_2 = false;
        AppScreen stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_64_2 = false;
        ButtonMenuScreen stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        AppScreen stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        boolean decompiledFrameRemainder1 = true;
        var6 = field_G;
        var2 = 97 % ((param0 - 50) / 45);
        var3 = 0;
        if (0 < FormationAgent.field_f) {
          stackIn_4_0 = (po.a(AuctionLogEntry.field_h, -4) < 640) ? 0 : 1;
          var4 = stackIn_4_0;
          if ((var4 == 0 ||
            GameModesHelpScreen.field_G != null) && 0 != tb.field_v) {
            var3 = 240;
            if ((GameModesHelpScreen.field_G != null)) {
              stackIn_14_0 = (po.a(GameModesHelpScreen.field_G, -4) < 640) ? 0 : 1;
              var5 = stackIn_14_0;
              if (var4 != 0 &&
                var5 != 0) {
                var3 = 256;
              }
              if (var4 == 0 &&
                var5 != 0) {
                var3 = var3 + (BuyPlayerDialog.field_I << 3);
              }
              if (var4 != 0 &&
                var5 == 0) {
                var3 = var3 + (24 - BuyPlayerDialog.field_I << 3);
              }
              if (!(var3 <= 256)) {
                var3 = 256;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            var3 = 256;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (AuctionLogEntry.field_h.screenId == -3 && (null == GameModesHelpScreen.field_G ||
          18 == GameModesHelpScreen.field_G.screenId)) {
          var4Lifetime1 = 0;
          for (var5Lifetime1 = -SoftwareRasterizer.field_a.length; var5Lifetime1 < 0; var5Lifetime1++) {
            incrementValue$0 = var4Lifetime1;
            var4Lifetime1++;
            SoftwareRasterizer.field_a[incrementValue$0] = 65793;
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (FormationAgent.field_f < 680) {
            hr.a((byte) -48);
          }
          if (SortCriterion.field_l != null &&
            AuctionLogEntry.field_h.screenId != 0 &&
            AuctionLogEntry.field_h.screenId != -1 &&
            6 != AuctionLogEntry.field_h.screenId) {
            stackIn_44_0 = SortCriterion.field_l;
            stackIn_44_1 = -5;
            stackIn_45_2 = (this.field_L) && (SortCriterion.field_l == AuctionLogEntry.field_h) && (GameModesHelpScreen.field_G == null);
            ((TournamentLobbyScreen) (Object) stackIn_44_0).drawScreen(stackIn_44_1, stackIn_45_2);
          }
          if (um.field_e != null &&
            AuctionLogEntry.field_h.screenId != 0 &&
            -2 != AuctionLogEntry.field_h.screenId) {
            stackIn_53_0 = um.field_e;
            stackIn_53_1 = -5;
            stackIn_54_2 = (this.field_L) && (um.field_e == AuctionLogEntry.field_h) && (null == GameModesHelpScreen.field_G);
            ((MatchScreen) (Object) stackIn_53_0).drawScreen(stackIn_53_1, stackIn_54_2);
          }
        }
        AuctionListing.a(FormationAgent.field_f, -22914, 0, 480, 0);
        var4Lifetime2 = -AccountChoicePanel.field_B.field_o + FormationAgent.field_f;
        if (var3 > 0) {
          eo.a(po.field_h, FullscreenFocusCanvas.field_d, var4Lifetime2);
          eo.drawSpriteClipped(mk.field_a, 0, 0, FormationAgent.field_f, 480, var3, 0);
          AuctionLogEntry.field_j.drawAdditive(-36, 50, 64);
        }
        if (AuctionLogEntry.field_h instanceof ButtonMenuScreen) {
          stackIn_63_0 = AuctionLogEntry.field_h;
          stackIn_63_1 = -5;
          stackIn_64_2 = (this.field_L) && (null == GameModesHelpScreen.field_G);
          ((AppScreen) (Object) stackIn_63_0).drawScreen(stackIn_63_1, stackIn_64_2);
        }
        if (GameModesHelpScreen.field_G instanceof ButtonMenuScreen) {
          GameModesHelpScreen.field_G.drawScreen(-5, false);
        }
        if (FormationAgent.field_f > 0) {
          po.field_h.c(var4Lifetime2, 0);
          AccountChoicePanel.field_B.c(var4Lifetime2, 0);
        }
        TeamManagementScreen.e(118);
        if (AuctionLogEntry.field_h instanceof ButtonMenuScreen) {
          stackIn_74_0 = (ButtonMenuScreen) (AuctionLogEntry.field_h);
          stackIn_75_1 = (this.field_L) && (GameModesHelpScreen.field_G == null);
          ((ButtonMenuScreen) (Object) stackIn_74_0).drawOverlay(stackIn_75_1, 117);
        }
        if (GameModesHelpScreen.field_G instanceof ButtonMenuScreen) {
          ((ButtonMenuScreen) (GameModesHelpScreen.field_G)).drawOverlay(false, 119);
        }
        if (!(AuctionLogEntry.field_h instanceof ButtonMenuScreen) &&
          AuctionLogEntry.field_h != um.field_e &&
          AuctionLogEntry.field_h != SortCriterion.field_l) {
          stackIn_85_0 = AuctionLogEntry.field_h;
          stackIn_85_1 = -5;
          stackIn_86_2 = (this.field_L) && (GameModesHelpScreen.field_G == null);
          ((AppScreen) (Object) stackIn_85_0).drawScreen(stackIn_85_1, stackIn_86_2);
        }
        if (GameModesHelpScreen.field_G != null &&
          !(GameModesHelpScreen.field_G instanceof ButtonMenuScreen) &&
          um.field_e != GameModesHelpScreen.field_G &&
          SortCriterion.field_l != GameModesHelpScreen.field_G) {
          GameModesHelpScreen.field_G.drawScreen(-5, false);
        }
        this.drawLogoBanner(102);
        if (IsSixCommand.field_B) {
          FindingOpponentScreen.g((byte) -119);
        }
        if (ka.field_b) {
          var5Lifetime2 = -BuyPlayerDialog.field_I + 24 << 4;
          if (BuyPlayerDialog.field_I < 12) {
            var5Lifetime2 = BuyPlayerDialog.field_I << 4;
          }
          ConsoleTokenCursor.field_d.d("Transition: " + BuyPlayerDialog.field_I + " : " + var5Lifetime2, 320, 100, 16777215, 0);
        }
        if (FadingSoundPlayer.field_q &&
          AuctionLogEntry.field_h.screenId != -4) {
          this.drawLoadingBar(81);
        }
        wq.a((byte) 71);
        gs.a((byte) -106);
    }

    final void releaseStatics(int param0) {
        Kickabout.releaseStatics((byte) -99);
        bw.a(false);
        uq.releaseStatics(-91);
        ug.releaseStatics(-1);
        et.releaseStatics(121);
        DialogOverlay.releaseStatics(23);
        ng.releaseStatics(param0 ^ 126);
        PlayerStats.releaseStatics(112);
        ManagerAction.releaseStatics((byte) 122);
        AuctionListing.releaseStatics((byte) 9);
        su.releaseStatics((byte) -115);
        ClubState.releaseStatics((byte) 0);
        AuctionItem.a(-23834);
        wk.releaseStatics((byte) -67);
        pc.b(-13827);
        nd.releaseStatics((byte) 115);
        oo.releaseStatics(param0 ^ -18184);
        pl.releaseStatics(20177);
        pr.releaseStatics(0);
        IntValueNode.a(false);
        IntrusiveDeque.releaseStatics(param0 - 133);
        SoftwareRasterizer.c();
        jl.releaseStatics(param0 ^ 8198);
        CipherPacketBuffer.m(0);
        gs.releaseStatics((byte) -117);
        mi.releaseStatics(param0 - 6);
        nc.releaseStatics((byte) 72);
        ss.releaseStatics((byte) -90);
        GameLoopApplet.q(30907);
        GameKeyHandler.a(param0 + 3896);
        gw.releaseStatics(param0 + 92);
        qr.a(false);
        NetworkGameClient.d(true);
        ClientException.releaseStatics((byte) -95);
        GameAppletShell.c(1);
        JaggrabDownloader.releaseStatics(param0 - 8);
        MouseInputHandler.releaseStatics(param0 - 7);
        MouseWheelInput.releaseStatics((byte) 66);
        ResourceArchive.releaseStatics(param0 ^ -122);
        fc.releaseStatics(29136);
        TrinketCatalog.a(false);
        PacketBuffer.releaseStatics((byte) 88);
        nj.releaseStatics((byte) -64);
        fh.releaseStatics((byte) 122);
        fs.releaseStatics(-81);
        ms.releaseStatics((byte) 53);
        tn.a(false);
        cu.releaseStatics(param0 ^ 6);
        oa.releaseStatics(param0 - 6);
        ChatMessage.releaseStatics(2);
        hp.a(0);
        ns.releaseStatics((byte) 60);
        TickClock.releaseStatics((byte) -116);
        ArchivePreloader.a(true);
        FullscreenFocusCanvas.releaseStatics((byte) 25);
        kh.releaseStatics(param0 - 1712);
        sd.releaseStatics(-1);
        MatchScreen.a(true);
        TournamentLobbyScreen.a(true);
        AppScreen.a((byte) 125);
        DebugConsole.releaseStatics(-1);
        SpriteState.releaseStatics((byte) -28);
        DualLinkNode.e(13421568);
        IntrusiveNode.d(126);
        BlankScreen.releaseStatics(param0 + 50);
        GameModeDefinition.a(true);
        ds.releaseStatics(-49);
        AuctionLogEntry.b(110);
        GameResourceLoader.releaseStatics(1);
        ig.releaseStatics((byte) -13);
        vb.a(0);
        Trinket.q(140);
        MatchPhaseView.b(104);
        il.releaseStatics((byte) 101);
        PopupDialog.c(false);
        ar.releaseStatics((byte) -73);
        RenderedFootballer.i((byte) 14);
        ak.a(17);
        vr.releaseStatics((byte) -118);
        ca.releaseStatics((byte) -72);
        ws.releaseStatics(-25514);
        fj.b(true);
        c.releaseStatics((byte) 114);
        UrlRequest.releaseStatics(-1316);
        NamedValueContainer.releaseStatics((byte) -126);
        nh.releaseStatics();
        aj.releaseStatics(-9097);
        le.a(false);
        bq.releaseStatics((byte) -127);
        dg.a((byte) -90);
        TriangleRasterizer.releaseStatics();
        ep.releaseStatics(0);
        ck.a(false);
        SoundCache.releaseStatics((byte) -116);
        HuffmanCodec.releaseStatics(0);
        PcmPlayerService.releaseStatics();
        MusicTrackMixer.releaseStatics((byte) -99);
        ButtonMenuScreen.c((byte) -107);
        fv.releaseStatics((byte) 108);
        mt.releaseStatics(param0 ^ 7);
        ScrollBar.a(-123);
        UiLayoutNode.g(-14457);
        MenuButton.releaseStatics((byte) -6);
        MenuSelection.releaseStatics((byte) -22);
        BufferedCacheFile.releaseStatics(81);
        te.a(true);
        LoginText.releaseStatics(0);
        we.releaseStatics((byte) -43);
        kr.releaseStatics(param0 ^ -121);
        kj.releaseStatics((byte) -118);
        LoginCredentials.b(-27680);
        BufferedSocket.releaseStatics(param0 ^ -109);
        BlackFadeScreen.releaseStatics(125);
        SplashScreen.a(-1);
        TeamManagementScreen.g((byte) 91);
        ShopPlayerSlot.j(param0 - 246);
        PitchOptionTile.releaseStatics((byte) -17);
        in.releaseStatics(param0 ^ 31347);
        MatchTransitionScreen.releaseStatics(14513);
        ParticipantStatus.a(true);
        LoggedGoal.releaseStatics((byte) 119);
        qn.releaseStatics((byte) -124);
        BitmapFont.releaseStatics();
        CommonGame.a(true);
        IsaacRandom.releaseStatics(1);
        vj.releaseStatics((byte) 111);
        VorbisSample.releaseStatics();
        FadingSoundPlayer.a(0);
        UnreadMessagesScreen.releaseStatics(param0 ^ -54);
        gk.releaseStatics((byte) -127);
        RankingsScreen.f(-71);
        uf.releaseStatics(param0 ^ 3547);
        GameplayHelpScreen.g(29250);
        cb.releaseStatics((byte) -100);
        RenderedBall.i(127);
        PlayArea.releaseStatics((byte) -124);
        BallAgent.f(0);
        FootballerAgent.e((byte) -108);
        is.b(116);
        mj.a(param0 ^ 6);
        IconLabel.b(0);
        VerticalScrollbar.a(param0 ^ 116);
        iv.a(false);
        ContextMenu.releaseStatics((byte) 38);
        al.a(1);
        PlayerContextMenu.releaseStatics(123);
        ScrollPane.releaseStatics((byte) -122);
        TextPromptDialog.c(true);
        LobbyPlayerRow.b(240);
        GameSetupPanel.a(-7);
        DualLinkHashTable.releaseStatics((byte) 36);
        sk.releaseStatics(-5514);
        ph.releaseStatics(1114366657);
        ad.releaseStatics(param0 - 6);
        LeaguesScreen.releaseStatics(-38);
        so.releaseStatics((byte) -113);
        jq.a(true);
        LobbyGameRecord.releaseStatics((byte) 101);
        vk.releaseStatics(50);
        pi.releaseStatics((byte) -116);
        h.a(false);
        LoggedPlayer.releaseStatics(48);
        LoggedPossession.releaseStatics(320);
        it.c(92);
        TeamSelectionAgent.releaseStatics((byte) -90);
        FormationAgent.a(true);
        GoalStateAgent.releaseStatics((byte) -30);
        PlayerInputEvent.a(0);
        MatchAgent.a(-3);
        po.releaseStatics(0);
        FindingOpponentScreen.releaseStatics(130);
        ServerMessageScreen.a(true);
        dc.releaseStatics(-89);
        bo.a(param0 ^ 78);
        tt.a(false);
        ModelMesh.releaseStatics();
        sh.releaseStatics(320);
        ul.releaseStatics(param0 ^ 125);
        DualLinkDeque.d(1603);
        ConsolePanel.releaseStatics((byte) -53);
        TextLine.a(-64);
        ts.releaseStatics((byte) 123);
        TextFieldNode.m(param0 + 90);
        IndexedSpriteState.a(-75);
        rk.releaseStatics(0);
        PlayerModelPreview.releaseStatics((byte) 126);
        dr.releaseStatics((byte) -127);
        AchievementsScreen.g((byte) 81);
        eo.releaseStatics();
        ScrollContainer.i((byte) -69);
        AuctionsScreen.h((byte) -53);
        CheckboxLabelWidget.a(0);
        AuctionTableWidget.releaseStatics((byte) 68);
        jr.i(-25734);
        IntrusiveNodeHashTable.releaseStatics((byte) -111);
        MySquadScreen.releaseStatics(-2010043359);
        SquadGridWidget.releaseStatics((byte) -127);
        TrinketSlot.releaseStatics((byte) -108);
        PlayerShopScreen.h((byte) -111);
        ColumnTableWidget.c(false);
        SquadSlotWidget.releaseStatics((byte) -123);
        ContextMenuItem.a(-15410);
        rf.releaseStatics(-97);
        TabStrip.c(true);
        HoverTooltip.releaseStatics((byte) 39);
        TrinketUnlockNotice.releaseStatics((byte) 16);
        wa.releaseStatics((byte) 116);
        rr.releaseStatics(param0 - 121);
        MidiPcmStream.releaseStatics((byte) -32);
        ArchiveIndex.releaseStatics(param0 ^ 6);
        GzipDecoder.releaseStatics(113);
        ArchiveSource.a(false);
        VorbisFloor.releaseStatics();
        AudioService.releaseStatics((byte) 60);
        MyPitchScreen.releaseStatics(-107);
        MessageDialog.f((byte) 90);
        HelpTipDialog.g((byte) -111);
        SaveChangesDialog.g(13);
        LoginRequiredDialog.g(param0 + 2350);
        TutorialChoiceDialog.h((byte) -117);
        WelcomeDialog.g(100);
        PromotionDialog.h(22100);
        TournamentChampionDialog.h(0);
        LeagueWinnerDialog.g((byte) -93);
        SquadPickerDialog.g(-14948);
        AuctionSettingsDialog.g(-8332);
        ColourSwatchTile.h(-31922);
        AuctionBidDialog.g(0);
        StatChoiceDialog.g(param0 ^ 25994);
        SellPlayerDialog.h(24342);
        TrinketShopDialog.d(false);
        TrinketPickerDialog.g(2);
        BuyPitchDialog.g((byte) -45);
        BuyPlayerDialog.g(30);
        AuctionListingDialog.d(false);
        lt.releaseStatics(-122);
        of.a(false);
        ih.releaseStatics(66049);
        d.releaseStatics(0);
        ModalStack.m(-1);
        RegistrationRequestDialog.releaseStatics(248);
        LoadingProgressDialog.j((byte) 110);
        LoginDialog.j((byte) 53);
        AccountRequestDialog.j((byte) -108);
        AccountRegistrationPanel.a((byte) -94);
        AccountChoicePanel.k(2);
        LoginForm.k(param0 ^ -11205);
        DisplayNameForm.a((byte) -94);
        wc.releaseStatics(10);
        ee.releaseStatics((byte) -100);
        th.a(false);
        ve.j((byte) 77);
        cd.releaseStatics((byte) -98);
        ResizableModalPanel.o(1);
        TextWidgetPainter.a(true);
        TextButton.a(79);
        UiWidget.g((byte) 88);
        ModalPanel.a((byte) -103);
        WidgetContainer.i(param0 ^ -336184830);
        IntrusiveDequeCursor.releaseStatics((byte) -65);
        TextLayout.b(0);
        SingleChildContainer.j(31068);
        pg.releaseStatics(127);
        ArchiveNetworkClient.releaseStatics(param0 - 6);
        DiskCacheWorker.a(2);
        ArchiveManager.releaseStatics(-2147483648);
        gf.releaseStatics(64);
        TriangleMesh.releaseStatics((byte) 94);
        pe.releaseStatics((byte) 7);
        wq.releaseStatics(-109);
        f.a((byte) -88);
        tl.releaseStatics(0);
        RandomAccessCacheFile.releaseStatics(113);
        DelegatingCanvas.releaseStatics((byte) 125);
        di.releaseStatics(-10);
        IntKeyLookup.releaseStatics((byte) 94);
        ByteStorage.a((byte) 98);
        Bzip2Decoder.releaseStatics();
        Bzip2State.b(3);
        ReflectionCheck.a(0);
        un.releaseStatics((byte) 106);
        re.releaseStatics((byte) 109);
        StatefulTextPainter.releaseStatics(-116);
        ei.a(-19485);
        du.releaseStatics(-24229);
        ql.releaseStatics(7);
        mv.a(true);
        ka.releaseStatics(19044);
        sg.a(false);
        CascadingMenu.b(111);
        bt.a(true);
        QuickChatPhraseCache.a(30297);
        QuickChatPhraseDefinition.a(71);
        WeightedLruCache.releaseStatics((byte) -32);
        SocketConnector.releaseStatics(99);
        ProxyAuthenticationRequiredException.releaseStatics((byte) -125);
        NanoTickClock.releaseStatics(125);
        ImageProducerRasterBuffer.releaseStatics((byte) -29);
        hq.releaseStatics(param0 + 55);
        cl.releaseStatics(-1);
        tr.a(false);
        GameOverView.g(-39);
        PlayingView.releaseStatics((byte) -40);
        TeamSelectionView.g(param0 - 119);
        WaitForPlayersView.f(1);
        FormationView.f(param0 - 15646);
        LineupView.releaseStatics((byte) -113);
        DateOfBirthPanel.a(param0 + 905215451);
        cv.releaseStatics((byte) -39);
        ia.a((byte) 107);
        rn.releaseStatics(-66);
        AnimationSkeleton.a(-1);
        ok.releaseStatics(param0 + 121);
        ef.releaseStatics((byte) -31);
        AnimationFrame.releaseStatics();
        mk.releaseStatics(17437);
        uk.releaseStatics((byte) -128);
        AnimationClip.releaseStatics(256);
        g.a(true);
        us.releaseStatics((byte) 40);
        ip.releaseStatics(-123);
        vp.b((byte) 125);
        MusicPatchNode.releaseStatics((byte) -80);
        MidiFileReader.releaseStatics();
        MusicPatchPcmStream.a(false);
        PagedHelpScreen.e(param0 - 29110);
        tb.releaseStatics((byte) -115);
        ui.a(true);
        SectorCacheStore.releaseStatics(-1);
        DiskCacheRequest.g(-26236);
        CachedArchiveSource.releaseStatics((byte) -119);
        or.releaseStatics((byte) 69);
        vv.releaseStatics((byte) 18);
        af.releaseStatics((byte) 105);
        cg.k(115);
        ValidatedTextWidget.n((byte) 74);
        TextInputWidget.l(param0 - 6);
        ContentTransitionDialog.p(12);
        NameSuggestionsPanel.a(param0 - 6);
        TextHotspotWidget.i(param0 + 9568);
        ValidationIndicator.a((byte) 38);
        ValidationHelpWidget.h((byte) -120);
        Checkbox.a((byte) 108);
        TextFieldValidator.b((byte) -124);
        br.a(true);
        AccountTermsPanel.l(0);
        bk.releaseStatics(-79);
        SynthesizedSoundInstrument.releaseSynthesisBuffers();
        InstrumentNoteMask.a(96);
        MainMenuScreen.releaseStatics(90);
        GameModesHelpScreen.g(128);
        LeaguesHelpScreen.g(60);
        AuctionsHelpScreen.c(false);
        MyKitScreen.releaseStatics(8);
        um.releaseStatics(123);
        RowRangeRequest.releaseStatics((byte) -49);
        hl.f(param0 ^ -5);
        NumericDateInputWidget.n(-23192);
        ArrayWidgetContainer.b(false);
        go.releaseStatics(99);
        mg.releaseStatics(param0 ^ 136);
        hv.releaseStatics(23);
        MusicPatch.releaseStatics((byte) -37);
        gl.releaseStatics(93);
        WhirlpoolHasher.releaseStatics(0);
        s.i(-1);
        nv.j(696);
        CachedTextLayout.releaseStatics((byte) -103);
        DraggableWidget.h((byte) -112);
        DropTargetWidget.k(31235);
        DirectByteStorage.b((byte) -56);
        GrowableIntList.a(true);
        IterableNodeHashTable.a(false);
        IterableDualLinkDeque.releaseStatics(18);
        WeightedCacheEntry.releaseStatics((byte) -46);
        ff.releaseStatics((byte) 101);
        StrongCacheEntry.b(-1);
        ProxySocketConnector.a(false);
        OffscreenPlayerArrow.releaseStatics(43);
        DateInputWidget.a(param0 ^ -104);
        vt.releaseStatics(-73);
        SoundFilter.releaseStatics();
        KitStyleTile.i(4476);
        NodeHashTableIterator.releaseStatics(1);
        DualLinkDequeIterator.releaseStatics(-119);
        GameSoundEffect.a(true);
        ag.releaseStatics((byte) 100);
        ReceivedAuctionItem.releaseStatics((byte) -126);
        wd.releaseStatics((byte) 122);
        ni.a(-1859);
        sm.a(0);
        wp.releaseStatics(param0 ^ 6);
        op.releaseStatics(-1842526431);
        cr.releaseStatics(param0 + 18080);
        ri.b(true);
        rp.releaseStatics(102);
        mn.releaseStatics((byte) 106);
        AlphaContainer.h((byte) 115);
        oc.releaseStatics((byte) -116);
        dk.a(7571);
        ii.a(84);
        bl.releaseStatics((byte) -104);
        ConsoleExpression.a(param0 - 6);
        ConsoleValue.releaseStatics((byte) -126);
        ConsoleCommand.a(15);
        ConsoleParseException.releaseStatics((byte) 121);
        ConsoleEvaluationException.releaseStatics(param0 ^ 6);
        StringCursor.releaseStatics(-127);
        ConsoleTokenCursor.releaseStatics(-84);
        en.b((byte) 38);
        rl.releaseStatics(20);
        ba.c((byte) -35);
        od.releaseStatics(param0 - 6);
        qi.b((byte) 85);
        SortCriterion.a((byte) 121);
        nk.a(-15207);
        pa.c((byte) 125);
        CheatCodeListener.releaseStatics(param0 ^ 32312);
        fa.a(param0 - 121);
        kw.releaseStatics((byte) -122);
        r.releaseStatics(param0 ^ -94);
        DelayedServerPacket.a(104);
        vd.a(-5);
        wn.releaseStatics(param0 ^ param0);
        NamedValueEntry.a(92);
        j.a(true);
        LoginMethod.releaseStatics(120);
        KeyedLoginCredentials.releaseStatics((byte) -104);
        wo.a(false);
        PasswordLoginCredentials.c(85);
        oh.releaseStatics((byte) -47);
        vs.releaseStatics(0);
        RankingRowNode.a(-13);
        CachedListingRow.releaseStatics((byte) -123);
        ListingRowCache.releaseStatics(22897);
        SumIntegersCommand.g(10040319);
        WriteIntegersCommand.g(1);
        DemoIntegersCommand.g(param0 - 6);
        DoSomethingCommand.g(param0 + 121);
        ThreeCommand.a(false);
        IsSixCommand.g(50);
        NotCommand.g(115);
        IntDoubleCommand.g(param0 ^ -107);
        IntTripleCommand.g(220);
        LongPlusOneCommand.g(1);
        BytePlusOneCommand.g((byte) 52);
        SetLagCommand.a(false);
        BroadcastServerCommand.releaseStatics((byte) 96);
        SelectableTrinketIcon.releaseStatics((byte) 118);
        im.a(-18523);
        TrinketTile.releaseStatics((byte) -117);
        TrinketIcon.c(true);
        AccountMessagePanel.a(14);
        hh.releaseStatics((byte) 121);
        TextLayoutLine.releaseStatics((byte) -125);
        dl.releaseStatics((byte) -61);
        hr.a(2);
        k.a(-77);
        mp.a(1);
        PainterStyle.a(true);
        v.releaseStatics(0);
        AccountNameAvailabilityValidator.g(-70);
        PasswordValidator.c((byte) -96);
        EmailSyntaxValidator.f((byte) -126);
        EmailAvailabilityValidator.g(-29635);
        AgeValidator.c((byte) 92);
        MatchingTextValidator.c((byte) 76);
        ic.releaseStatics((byte) 68);
        er.releaseStatics((byte) -94);
        ValidationState.releaseStatics(-89);
        DebouncedValidationProvider.d(param0 ^ 344);
        ea.releaseStatics(param0 ^ -110);
        ld.releaseStatics((byte) 112);
        this.field_z = null;
    }

    public final void init() {
        this.a("Kickabout", 19, (byte) -60);
    }

    static {
        field_I = "Name is available";
        field_F = "Duration";
    }
}
