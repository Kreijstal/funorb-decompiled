/*
 * Decompiled by CFR-JS 0.4.0.
 */
class iv extends DualLinkNode {
    static String field_n;
    static PlatformTask field_o;

    final static void a(CoverageBitmapFont param0, byte param1) {
        int var15_int = 0;
        int var20 = 0;
        int var2_int = 0;
        int var3 = 0;
        UiLayoutNode var4 = null;
        UiLayoutNode var5 = null;
        UiLayoutNode var6 = null;
        UiLayoutNode var7 = null;
        MenuButton[] var8 = null;
        int[][] var9 = null;
        int[][] var10 = null;
        boolean[] var15 = null;
        String[] var16 = null;
        String[] var17 = null;
        int var18 = 0;
        int var21 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var34 = null;
        int[][] var35 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var21 = Kickabout.field_G;
        try {
          var2_int = param0.a(MatchingTextValidator.field_o[16]);
          var3 = param0.a(MatchingTextValidator.field_o[17]);
          DraggableWidget.a(Math.max(var2_int, var3), param0, (byte) -46);
          var4 = new UiLayoutNode();
          var4.field_R = LeaguesScreen.field_B;
          var5 = new UiLayoutNode();
          var6 = new UiLayoutNode();
          var6.field_N = rk.field_g;
          var7 = new UiLayoutNode();
          var7.field_N = rk.field_g.copy();
          var7.field_N.a();
          ConsolePanel.field_q = new UiLayoutNode();
          ConsolePanel.field_q.field_y = 14540253;
          ConsolePanel.field_q.field_p = 1;
          ConsolePanel.field_q.field_A = 1;
          ConsolePanel.field_q.field_X = (BitmapFont) ((Object) un.field_d);
          rr.field_b = new ScrollBar("scrollbar", var6, var7, var5, var4, true);
          it.field_m = new ScrollBar("scrollbar", ConsolePanel.field_q, ConsolePanel.field_q, ConsolePanel.field_q, ConsolePanel.field_q, true);
          ug.field_b = new Sprite[2][2];
          ug.field_b[0][0] = nm.a(16679959, -87, ButtonMenuScreen.field_u);
          ug.field_b[0][1] = nm.a(16679959, -104, mg.field_g);
          ug.field_b[1][0] = nm.a(7126504, -119, ButtonMenuScreen.field_u);
          ug.field_b[1][1] = nm.a(7126504, -76, mg.field_g);
          var8 = new MenuButton[57];
          var8[0] = new MenuButton(-2, 7465472, 0);
          var8[1] = new MenuButton(-2, 15147554, 1);
          var8[2] = new MenuButton(-2, 7126504, 2);
          var8[3] = new MenuButton(-2, 7126504, 3);
          var8[4] = new MenuButton(-1, 7126504, 4);
          var8[29] = new MenuButton(291, 7126504, 4);
          var8[5] = new MenuButton(291, 7126504, 5);
          var8[6] = new MenuButton(-2, 16777215, 6);
          var8[7] = new MenuButton(-4, 7126504, 7);
          var8[8] = new MenuButton(291, 15147554, 8);
          var8[9] = new MenuButton(291, 7126504, 9);
          var8[10] = new MenuButton(291, 7126504, 10);
          var8[11] = new MenuButton(-2, 16777215, 11);
          var8[12] = new MenuButton(291, 15147554, 12);
          var8[55] = new MenuButton(291, 15147554, 55);
          var8[13] = new MenuButton(-4, 7126504, 13);
          var8[14] = new MenuButton(-4, 7126504, 14);
          var8[15] = new MenuButton(-1, 7126504, 15);
          var8[16] = new MenuButton(291, 7126504, 16);
          var8[17] = new MenuButton(291, 7126504, 17);
          var8[18] = new MenuButton(-2, 7126504, 18);
          var8[19] = new MenuButton(-4, 7126504, 19);
          var8[20] = new MenuButton(-2, 16777215, 20);
          var8[21] = new MenuButton(-1, 16777215, 21);
          var8[22] = new MenuButton(-1, 16777215, 22);
          var8[23] = new MenuButton(-2, 16679959, 23);
          var8[24] = new MenuButton(-1, 7126504, 24);
          var8[25] = new MenuButton(-2, 7126504, 25);
          var8[26] = new MenuButton(-2, 16679959, 26);
          var8[27] = new MenuButton(-1, 7126504, 27);
          var8[28] = new MenuButton(-2, 16679959, 28);
          var8[30] = new MenuButton(291, 7126504, 30);
          var8[31] = new MenuButton(291, 7126504, 24);
          var8[32] = new MenuButton(291, 7126504, 32);
          var8[49] = new MenuButton(291, 7126504, 49);
          var8[33] = new MenuButton(-2, 7126504, 33);
          var8[34] = new MenuButton(-2, 7126504, 34);
          var8[35] = new MenuButton(-2, 7126504, 35);
          var8[36] = new MenuButton(-2, 7126504, 36);
          var8[37] = new MenuButton(-5, 7126504, 37);
          var8[42] = new MenuButton(-4, 7126504, 42);
          var8[43] = new MenuButton(-4, 7126504, 43);
          var8[45] = new MenuButton(-2, 16679959, 45);
          var8[48] = new MenuButton(-2, 16679959, 48);
          var8[46] = new MenuButton(-2, 16679959, 46);
          un.field_b = new ButtonMenuScreen[27];
          un.field_b[0] = (ButtonMenuScreen) ((Object) new MainMenuScreen());
          un.field_b[17] = new ButtonMenuScreen();
          un.field_b[5] = new ButtonMenuScreen();
          un.field_b[6] = new ButtonMenuScreen();
          un.field_b[2] = new ButtonMenuScreen();
          un.field_b[3] = new ButtonMenuScreen();
          un.field_b[4] = new ButtonMenuScreen();
          un.field_b[1] = new ButtonMenuScreen();
          un.field_b[9] = (ButtonMenuScreen) ((Object) new AchievementsScreen());
          un.field_b[7] = (ButtonMenuScreen) ((Object) new RankingsScreen());
          un.field_b[13] = new ButtonMenuScreen();
          un.field_b[14] = (ButtonMenuScreen) ((Object) new MyPitchScreen());
          un.field_b[8] = new ButtonMenuScreen();
          un.field_b[19] = (ButtonMenuScreen) ((Object) new GameplayHelpScreen());
          un.field_b[20] = (ButtonMenuScreen) ((Object) new GameModesHelpScreen());
          un.field_b[21] = (ButtonMenuScreen) ((Object) new LeaguesHelpScreen());
          un.field_b[22] = (ButtonMenuScreen) ((Object) new AuctionsHelpScreen());
          un.field_b[12] = new ButtonMenuScreen();
          un.field_b[10] = (ButtonMenuScreen) ((Object) new ServerMessageScreen());
          un.field_b[11] = (ButtonMenuScreen) ((Object) new UnreadMessagesScreen());
          un.field_b[15] = (ButtonMenuScreen) ((Object) new LeaguesScreen());
          un.field_b[16] = (ButtonMenuScreen) ((Object) new AuctionsScreen());
          un.field_b[18] = (ButtonMenuScreen) ((Object) new MatchTransitionScreen());
          un.field_b[23] = (ButtonMenuScreen) ((Object) new PlayerShopScreen());
          un.field_b[24] = (ButtonMenuScreen) ((Object) new MyKitScreen());
          un.field_b[25] = (ButtonMenuScreen) ((Object) new MySquadScreen());
          un.field_b[26] = (ButtonMenuScreen) ((Object) new FindingOpponentScreen());
          var35 = new int[27][];
          var28 = var35;
          var9 = var28;
          var9[24] = new int[]{7, 37};
          var9[13] = new int[]{46, 48, 28, 45, 26, 7};
          var9[21] = new int[]{21, 42, 22};
          var9[23] = new int[]{42, 37};
          var9[4] = new int[]{2, 31, 29, 12};
          var9[2] = new int[]{2, 31, 29, 9, 10, 12};
          var9[8] = new int[]{33, 34, 36, 35, 7};
          var9[1] = new int[]{2, 31, 29, 8};
          var9[22] = new int[]{21, 42, 22};
          var9[10] = new int[]{7};
          var9[19] = new int[]{21, 42, 22};
          var9[15] = new int[]{7, 37};
          var9[25] = new int[]{42, 37};
          var9[17] = new int[]{25, 3, 18, 7};
          var9[20] = new int[]{21, 42, 22};
          var9[9] = new int[]{7};
          var9[0] = new int[]{0, 1, 23, 4, 27, 24, 15};
          var9[14] = new int[]{7, 37};
          var9[3] = new int[]{2, 31, 29, 10, 55, 12};
          var9[5] = new int[]{2, 31, 29, 12};
          var9[6] = new int[]{2, 31, 29, 55, 12};
          var9[7] = new int[]{13, 14, 7};
          var9[16] = new int[]{42, 37};
          var9[12] = new int[]{16, 17, 30, 32, 49, 5, 7};
          var34 = new int[27][];
          var27 = var34;
          var10 = var27;
          var10[15] = new int[]{19, 43, 37};
          var10[9] = new int[]{19, 43};
          var10[16] = new int[]{19, 43, 37};
          var10[7] = new int[]{19, 43};
          var41 = new int[27];
          var41[1] = 4;
          var41[4] = 4;
          var41[3] = 6;
          var41[13] = 5;
          var41[5] = 4;
          var41[8] = 4;
          var41[0] = 5;
          var41[2] = 6;
          var41[17] = 3;
          var41[6] = 5;
          var41[12] = 6;
          var42 = new int[27];
          var42[7] = 3;
          var43 = new int[27];
          var43[22] = 30;
          var43[7] = 30;
          var43[11] = 30;
          var43[16] = 40;
          var43[21] = 30;
          var43[12] = 30;
          var43[3] = 20;
          var43[13] = 20;
          var43[15] = 30;
          var43[26] = 20;
          var43[24] = 50;
          var43[8] = 25;
          var43[17] = 20;
          var43[9] = 30;
          var43[4] = 20;
          var43[1] = 20;
          var43[14] = 30;
          var43[25] = 50;
          var43[5] = 20;
          var43[23] = 50;
          var43[6] = 20;
          var43[20] = 30;
          var43[10] = 20;
          var43[19] = 30;
          var43[0] = 10;
          var43[2] = 20;
          var43[18] = 100;
          var44 = new int[27];
          for (var15_int = 0; var15_int < 27; var15_int++) {
            var44[var15_int] = -1;
          }
          var44[21] = 1;
          var44[15] = 1;
          var44[23] = 0;
          var44[14] = 0;
          var44[19] = 1;
          var44[7] = 1;
          var44[16] = 0;
          var44[24] = 0;
          var44[20] = 1;
          var44[9] = 1;
          var44[22] = 1;
          var44[25] = 0;
          var15 = new boolean[27];
          var15[13] = true;
          var15[23] = true;
          var15[7] = true;
          var15[8] = true;
          var15[25] = true;
          var15[9] = true;
          var15[16] = true;
          var15[24] = true;
          var15[12] = true;
          var15[19] = true;
          var15[17] = true;
          var15[15] = true;
          var15[21] = true;
          var15[20] = true;
          var15[22] = true;
          var15[14] = true;
          var15[10] = true;
          var16 = new String[27];
          var16[22] = uq.field_e;
          var16[25] = LobbyPlayerRow.field_Bb;
          var16[19] = uq.field_e;
          var16[9] = GameAppletShell.field_b;
          var16[7] = GameAppletShell.field_b;
          var18 = 101 % ((param1 + 68) / 52);
          var16[20] = uq.field_e;
          var16[24] = LobbyPlayerRow.field_Bb;
          var16[16] = LobbyPlayerRow.field_Bb;
          var16[15] = GameAppletShell.field_b;
          var16[14] = LobbyPlayerRow.field_Bb;
          var16[23] = LobbyPlayerRow.field_Bb;
          var16[21] = uq.field_e;
          var17 = new String[27];
          var17[23] = us.field_g.toLowerCase();
          var17[24] = ii.field_h.toLowerCase();
          var17[25] = oc.field_b.toLowerCase();
          var17[14] = pr.field_b.toLowerCase();
          var17[20] = ScrollPane.field_Gb;
          var17[9] = NotCommand.field_C;
          var17[22] = ar.field_e;
          var17[16] = ar.field_e;
          var17[7] = fc.field_b;
          var17[21] = ss.field_f;
          var17[15] = ss.field_f;
          var17[19] = wd.field_g;
          var45 = new int[27];
          var45[23] = 440;
          var45[7] = 390;
          var45[9] = 390;
          var45[19] = 630;
          var45[24] = 410;
          var45[14] = 390;
          var45[15] = 390;
          var45[21] = 630;
          var45[22] = 630;
          var45[16] = 430;
          var45[20] = 630;
          for (var20 = 0; var20 < 27; var20++) {
            if (un.field_b[var20] != null) {
              un.field_b[var20].configureMenu(var16[var20], var41[var20], var42[var20], -46, var17[var20], rr.a(var34[var20], var8, 0), rr.a(var35[var20], var8, 0), var45[var20], var15[var20], var44[var20], var20, var43[var20]);
              un.field_b[var20].buildWidgets(-38);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("iv.N(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        if (param0) {
          field_o = (PlatformTask) null;
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          if (param2 == null) {
            stackIn_4_0 = TeamSelectionView.field_m;
            return stackIn_4_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = MatchAgent.a(0, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ca.a(false, var4.charAt(0)) &&
                !ca.a(false, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (!ca.a(false, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_29_0 = TextHotspotWidget.field_N;
                    return stackIn_29_0;
                  }
                }
                if (var5 <= param0) {
                  return null;
                }
                stackIn_34_0 = tb.field_r;
                return stackIn_34_0;
              }
              stackIn_19_0 = tb.field_r;
              return stackIn_19_0;
            }
            stackIn_14_0 = TeamSelectionView.field_m;
            return stackIn_14_0;
          }
          stackIn_9_0 = TeamSelectionView.field_m;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("iv.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    iv() {
    }

    static {
        field_n = "Sandbox";
    }
}
