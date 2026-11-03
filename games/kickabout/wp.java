/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_h;
    static String field_a;
    String field_d;
    static String field_e;
    static int field_c;
    static boolean field_f;
    static String field_i;
    String field_b;
    boolean field_g;

    public static void b(int param0) {
        if (param0 != 0) {
          field_h = (String) null;
        }
        field_a = null;
        field_h = null;
        field_i = null;
        field_e = null;
    }

    final static void a(int[] param0, byte[] param1, int param2, String[] param3, int param4, int param5, String[][] param6, Sprite[][] param7, String[] param8, ResourceArchive param9, Sprite[][] param10, String[] param11, String[][] param12, byte param13, byte[] param14) {
        ContextMenuItem[] array$0 = null;
        ContextMenuItem[] array$1 = null;
        ContextMenuItem[] array$2 = null;
        int var19 = 0;
        UiLayoutNode stackIn_7_0;
        UiLayoutNode stackIn_7_1;
        long stackIn_7_2;
        UiLayoutNode stackIn_7_3;
        UiLayoutNode stackIn_8_0 = null;
        UiLayoutNode stackIn_8_1 = null;
        String stackIn_8_4 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        UiLayoutNode var16 = null;
        int var17_int = 0;
        UiLayoutNode var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        UiLayoutNode var23 = null;
        UiLayoutNode var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = Kickabout.field_G;
        try {
          ok.field_b = param11;
          MouseInputHandler.field_f = param2;
          ni.field_f = param10;
          fh.field_a = param7;
          ThreeCommand.field_D = param5;
          ReceivedAuctionItem.field_D = param8;
          ue.field_k = param1;
          LeagueWinnerDialog.field_J = param14;
          rn.field_d = param0;
          LoadingProgressDialog.field_Q = param12;
          oi.field_f = param3;
          ca.field_g = param6;
          TextFieldValidator.field_d = ModalStack.a(param9, 70, "lobby", "gameprivacy");
          CachedArchiveSource.field_m = ModalStack.a(param9, 86, "lobby", "ratedgame");
          nv.field_L = ModalStack.a(param9, -6, "lobby", "opentome");
          MessageDialog.field_E = ModalStack.a(param9, -119, "lobby", "allowspectators");
          WidgetContainer.field_w = new String[5];
          WidgetContainer.field_w[0] = ConsoleExpression.field_m;
          WidgetContainer.field_w[4] = TeamSelectionAgent.field_g;
          WidgetContainer.field_w[3] = bq.field_b;
          WidgetContainer.field_w[2] = bl.field_h;
          WidgetContainer.field_w[1] = mn.field_d;
          mc.field_d = new UiLayoutNode(0L, (UiLayoutNode) null);
          id.field_s = new UiLayoutNode(0L, TrinketIcon.field_zb, oh.field_h);
          ck.field_c = new UiLayoutNode(0L, SquadPickerDialog.field_P, mt.field_b);
          LineupView.field_u = new ScrollPane(0L, new UiLayoutNode(0L, (UiLayoutNode) null), rj.field_b, uk.field_b);
          mc.field_d.addChild((byte) -114, id.field_s);
          if (ui.field_t) {
            mc.field_d.addChild((byte) -107, ck.field_c);
          }
          mc.field_d.addChild((byte) -119, (UiLayoutNode) (LineupView.field_u));
          LineupView.field_u.field_zb.a(ConsoleEvaluationException.field_e, (byte) -128);
          var23 = LineupView.field_u.field_zb;
          var24 = var23;
          LineupView.field_u.field_zb.field_p = 1;
          var24.field_A = 1;
          ConsoleValue.field_a = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          ConsoleValue.field_a.field_A = 1;
          MouseWheelInput.field_a = new UiLayoutNode(0L, LongPlusOneCommand.field_D, ic.field_g.toUpperCase());
          AuctionItem.field_o = new UiLayoutNode(0L, LeaguesHelpScreen.field_H, ConsoleValue.field_f.toUpperCase());
          bt.field_b = new UiLayoutNode(0L, cp.field_g);
          PlayingView.field_w = new UiLayoutNode(0L, TrinketIcon.field_zb, NameSuggestionsPanel.field_B);
          LoginRequiredDialog.field_G = new UiLayoutNode(0L, gw.field_a, sn.field_j);
          if (param13 <= 23) {
            field_i = (String) null;
          }
          TextWidgetPainter.field_n = new UiLayoutNode(0L, gw.field_a, aj.field_c);
          AuctionsHelpScreen.field_G = new UiLayoutNode(0L, gw.field_a, UiLayoutNode.field_C);
          DateInputWidget.field_D = new UiLayoutNode(0L, gw.field_a, n.field_j);
          RegistrationRequestDialog.field_lb = new UiLayoutNode(0L, SquadPickerDialog.field_P, ig.field_h);
          ShopPlayerSlot.field_Jb = new ScrollPane(0L, new UiLayoutNode(0L, (UiLayoutNode) null), rj.field_b, uk.field_b);
          dr.field_d = new UiLayoutNode(0L, TextFieldNode.field_Qb, vp.field_n.toUpperCase());
          dr.field_d.field_lb = ui.field_t;
          stackIn_7_0 = null;
          stackIn_7_1 = null;
          stackIn_7_2 = 0L;
          stackIn_7_3 = TextFieldNode.field_Qb;
          if (ui.field_t) {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_4 = oo.field_g;
          } else {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_4 = wo.field_l;
          }
          LoginCredentials.field_b = new UiLayoutNode(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_8_4).toUpperCase());
          af.field_d = new UiLayoutNode(0L, (UiLayoutNode) null);
          af.field_d.addChild((byte) -115, AuctionItem.field_o);
          af.field_d.addChild((byte) -112, bt.field_b);
          bt.field_b.addChild((byte) -127, PlayingView.field_w);
          bt.field_b.addChild((byte) -118, LoginRequiredDialog.field_G);
          bt.field_b.addChild((byte) -113, TextWidgetPainter.field_n);
          if (ui.field_t) {
            bt.field_b.addChild((byte) -118, AuctionsHelpScreen.field_G);
          }
          bt.field_b.addChild((byte) -128, DateInputWidget.field_D);
          bt.field_b.addChild((byte) -122, RegistrationRequestDialog.field_lb);
          bt.field_b.addChild((byte) -118, (UiLayoutNode) (ShopPlayerSlot.field_Jb));
          if (ui.field_t) {
            af.field_d.addChild((byte) -109, dr.field_d);
          }
          af.field_d.addChild((byte) -112, LoginCredentials.field_b);
          CheckboxLabelWidget.field_Cb = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          CheckboxLabelWidget.field_Cb.field_p = 0;
          CheckboxLabelWidget.field_Cb.field_A = 1;
          RandomAccessCacheFile.field_a = new UiLayoutNode(0L, dc.field_a, MatchScreen.field_x.toUpperCase());
          kk.field_j = new UiLayoutNode(0L, tv.field_e);
          kk.field_j.addChild((byte) -112, CheckboxLabelWidget.field_Cb);
          kk.field_j.addChild((byte) -113, RandomAccessCacheFile.field_a);
          w.field_e = new UiLayoutNode(0L, rj.field_b);
          w.field_e.a(ConsoleEvaluationException.field_e, (byte) -110);
          w.field_e.field_p = 1;
          var16 = w.field_e;
          var16.field_A = 1;
          AchievementsScreen.field_C = new UiLayoutNode(0L, (UiLayoutNode) null);
          ka.field_c = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          ka.field_c.field_A = 1;
          BufferedSocket.field_u = new UiLayoutNode(0L, TrinketIcon.field_zb, oh.field_h);
          DoSomethingCommand.field_D = new UiLayoutNode(0L, SquadPickerDialog.field_P, mt.field_b);
          ClientException.field_c = new ScrollPane(0L, new UiLayoutNode(0L, (UiLayoutNode) null), rj.field_b, uk.field_b);
          AchievementsScreen.field_C.addChild((byte) -114, ka.field_c);
          AchievementsScreen.field_C.addChild((byte) -105, BufferedSocket.field_u);
          if (ui.field_t) {
            AchievementsScreen.field_C.addChild((byte) -123, DoSomethingCommand.field_D);
          }
          AchievementsScreen.field_C.addChild((byte) -122, (UiLayoutNode) (ClientException.field_c));
          ac.field_b = new UiLayoutNode(0L, LongPlusOneCommand.field_D, ns.field_b.toUpperCase());
          ci.field_h = new UiLayoutNode(0L, LeaguesHelpScreen.field_H);
          sg.field_a = new UiLayoutNode(0L, cp.field_g);
          MouseInputHandler.field_d = new UiLayoutNode(0L, oi.field_i, IntDoubleCommand.field_F.toUpperCase());
          rf.field_c = new ContextMenuItem[param4 + 4][];
          qr.field_b = new UiLayoutNode[4 + param4];
          qr.field_b[0] = new UiLayoutNode(0L, kr.field_b, mi.field_a);
          rf.field_c[0] = new ContextMenuItem[6];
          for (var17_int = 0; 5 > var17_int; var17_int++) {
            rf.field_c[0][var17_int + 1] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, TextFieldValidator.field_d[var17_int], WidgetContainer.field_w[var17_int]);
          }
          if (2 <= rn.field_d.length) {
            qr.field_b[1] = new UiLayoutNode(0L, kr.field_b, Checkbox.field_H);
            array$0 = new ContextMenuItem[rn.field_d.length + 1];
            rf.field_c[1] = array$0;
            rf.field_c[1][0] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) null, ia.field_b);
            for (var17_intLifetime1 = 0; rn.field_d.length > var17_intLifetime1; var17_intLifetime1++) {
              rf.field_c[1][1 + var17_intLifetime1] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) null, Integer.toString(rn.field_d[var17_intLifetime1]));
            }
          }
          qr.field_b[2] = new UiLayoutNode(0L, kr.field_b, rc.field_b);
          rf.field_c[2] = new ContextMenuItem[]{new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) null, ia.field_b), new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, MessageDialog.field_E[0], ScrollPane.field_Db), new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, MessageDialog.field_E[1], um.field_g)};
          if (MouseInputHandler.field_f > 1) {
            qr.field_b[3] = new UiLayoutNode(0L, kr.field_b, pc.field_b);
            array$1 = new ContextMenuItem[1 + MouseInputHandler.field_f];
            rf.field_c[3] = array$1;
            rf.field_c[3][0] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) null, ia.field_b);
            for (var17_intLifetime2 = 0; MouseInputHandler.field_f > var17_intLifetime2; var17_intLifetime2++) {
              rf.field_c[3][1 + var17_intLifetime2] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) null, ReceivedAuctionItem.field_D[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param4 > var17_intLifetime3; var17_intLifetime3++) {
            qr.field_b[4 + var17_intLifetime3] = new UiLayoutNode(0L, kr.field_b, ok.field_b[var17_intLifetime3]);
            array$2 = new ContextMenuItem[qj.b(255, (int) ue.field_k[var17_intLifetime3]) + 1];
            rf.field_c[var17_intLifetime3 + 4] = array$2;
            rf.field_c[4 + var17_intLifetime3][0] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) null, ia.field_b);
            for (var18 = 0; (255 & ue.field_k[var17_intLifetime3]) > var18; var18++) {
              if (ni.field_f != null) {
                if (null == ni.field_f[var17_intLifetime3]) {
                  var19_ref = null;
                } else {
                  var19_ref = ni.field_f[var17_intLifetime3][var18];
                }
              } else {
                var19_ref = null;
              }
              if (null != LoadingProgressDialog.field_Q) {
                if (null == LoadingProgressDialog.field_Q[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = LoadingProgressDialog.field_Q[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              rf.field_c[4 + var17_intLifetime3][var18 + 1] = new ContextMenuItem(0L, k.field_f, (UiLayoutNode) null, ul.field_c, (Sprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; 4 + param4 > var17_intLifetime4; var17_intLifetime4++) {
            if (qr.field_b[var17_intLifetime4] != null) {
              qr.field_b[var17_intLifetime4].field_xb = 11;
            }
            if (rf.field_c[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; var18Lifetime1 < rf.field_c[var17_intLifetime4].length; var18Lifetime1++) {
                if (rf.field_c[var17_intLifetime4][var18Lifetime1] != null &&
                  null != rf.field_c[var17_intLifetime4][var18Lifetime1].field_yb) {
                  rf.field_c[var17_intLifetime4][var18Lifetime1].field_yb.field_xb = 11;
                }
              }
            }
          }
          em.field_d = new UiLayoutNode(0L, TextFieldNode.field_Qb);
          GoalStateAgent.field_k = new UiLayoutNode(0L, TextFieldNode.field_Qb);
          nv.field_F = new UiLayoutNode(0L, ip.field_c);
          nv.field_F.a(ConsoleEvaluationException.field_e, (byte) -99);
          var17 = nv.field_F;
          nv.field_F.field_p = 1;
          var17.field_A = 1;
          AuctionItem.field_p = new UiLayoutNode(0L, (UiLayoutNode) null);
          AuctionItem.field_p.addChild((byte) -106, ci.field_h);
          AuctionItem.field_p.addChild((byte) -111, sg.field_a);
          sg.field_a.addChild((byte) -107, MouseInputHandler.field_d);
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param4; var18Lifetime2++) {
            if ((1 != var18Lifetime2 ||
              !(rn.field_d.length < 2)) && (var18Lifetime2 != 3 ||
              !(MouseInputHandler.field_f <= 1))) {
              sg.field_a.addChild((byte) -121, qr.field_b[var18Lifetime2]);
              for (var19 = 0; var19 < rf.field_c[var18Lifetime2].length; var19++) {
                if (rf.field_c[var18Lifetime2][var19] != null) {
                  sg.field_a.addChild((byte) -115, (UiLayoutNode) (rf.field_c[var18Lifetime2][var19]));
                }
              }
            }
          }
          AuctionItem.field_p.addChild((byte) -112, em.field_d);
          AuctionItem.field_p.addChild((byte) -124, GoalStateAgent.field_k);
          AuctionItem.field_p.addChild((byte) -108, nv.field_F);
          is.field_b = new UiLayoutNode(0L, AccountTermsPanel.field_H, po.field_b.toUpperCase());
          BlackFadeScreen.field_i = new UiLayoutNode(0L, dc.field_a, bk.field_d.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_74_0 = var15;
          stackIn_74_1 = new StringBuilder().append("wp.C(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param7 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',');
          if (param8 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param9 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',');
          if (param10 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',');
          if (param11 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
          if (param12 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final static Sprite[] a(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = Kickabout.field_G;
        var1 = new Sprite[MenuButton.field_l];
        for (var2 = 0; MenuButton.field_l > var2; var2++) {
          var3 = PasswordValidator.field_j[var2] * MouseInputHandler.field_c[var2];
          var21 = SquadPickerDialog.field_O[var2];
          if (!RankingsScreen.field_B[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = lt.field_a[qj.b((int) var21[var6], 255)];
            }
            var1[var2] = new Sprite(kw.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[var2], fc.field_g[var2], MouseInputHandler.field_c[var2], PasswordValidator.field_j[var2], var22);
          } else {
            var16 = RowRangeRequest.field_e[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = hf.a(lt.field_a[qj.b((int) var21[var7], 255)], qj.b(-16777216, var16[var7] << 24));
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(kw.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[var2], fc.field_g[var2], MouseInputHandler.field_c[var2], PasswordValidator.field_j[var2], var17));
          }
        }
        if (param0 >= -123) {
          return (Sprite[]) null;
        }
        ScrollContainer.h((byte) -79);
        return var1;
    }

    final static LoginCredentials a(int param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        byte[] var7 = null;
        CharSequence var8 = null;
        LoginCredentials stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -31) {
            var7 = (byte[]) null;
            wp.a((int[]) null, (byte[]) null, 68, (String[]) null, -103, -47, (String[][]) null, (Sprite[][]) null, (String[]) null, (ResourceArchive) null, (Sprite[][]) null, (String[]) null, (String[][]) null, (byte) 59, (byte[]) null);
          }
          var4_long = 0L;
          var6 = null;
          if (param3.indexOf('@') != -1) {
            var6 = param3;
          } else {
            var8 = (CharSequence) ((Object) param3);
            var4_long = LoggedPlayer.a(var8, false);
          }
          stackIn_6_0 = ti.a(param1, var4_long, (byte) 31, param2, (String) (var6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wp.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(double[][][] param0, int[][][] param1, int[][][] param2, int param3, int[][][] param4, int[][][] param5) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        double[] dupTemp$4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int var7Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var19 = new int[256];
          var18 = var19;
          var16 = var18;
          var6 = var16;
          for (var7 = 0; var7 < 256; var7++) {
            var16[var7] = var7 * var7;
          }
          var8 = 100 % ((61 - param3) / 53);
          var17 = 0;
          var7Lifetime1 = var17;
          while (var17 < FindingOpponentScreen.field_D) {
            var9 = 255 & EmailAvailabilityValidator.field_j[var17] >> 16;
            var10 = 255 & EmailAvailabilityValidator.field_j[var17] >> 8;
            var11 = 255 & EmailAvailabilityValidator.field_j[var17];
            var12 = (var9 >> 3) + 1;
            var13 = (var10 >> 3) + 1;
            var14 = 1 + (var11 >> 3);
            CascadingMenu.field_Mb[var17] = var14 + var12 + ((var12 << 6) + (var12 << 10) + ((var13 << 5) + var13));
            dupTemp$0 = param1[var12][var13];
            dupTemp$0[var14] = dupTemp$0[var14] + 1;
            dupTemp$1 = param2[var12][var13];
            dupTemp$1[var14] = dupTemp$1[var14] + var9;
            dupTemp$2 = param5[var12][var13];
            dupTemp$2[var14] = dupTemp$2[var14] + var10;
            dupTemp$3 = param4[var12][var13];
            dupTemp$3[var14] = dupTemp$3[var14] + var11;
            dupTemp$4 = param0[var12][var13];
            dupTemp$4[var14] = dupTemp$4[var14] + (double)(var19[var10] + (var19[var9] + var19[var11]));
            var17++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("wp.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, ii param1, int param2) {
        if (param2 <= 22) {
          return;
        }
        try {
          il.field_a.a(param1, 3);
          te.a(param0, param1, (byte) -112);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Send private message to <%0>";
        field_e = "Find opponent";
        field_f = false;
        field_i = "Remove <%0> from ignore list";
    }
}
