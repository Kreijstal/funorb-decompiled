/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListLayoutSupport {
    static Sprite[] field_c;
    static java.applet.Applet field_a;
    static Sprite[][] field_b;
    static String field_d;
    static RankingsRequest field_e;
    static boolean[] field_f;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = (Sprite[][]) null;
        if (param0 != -1) {
          IntrusiveNode var2 = (IntrusiveNode) null;
          SocialListLayoutSupport.insertNodeBefore((IntrusiveNode) null, 81, (IntrusiveNode) null);
        }
    }

    final static int worldToScreenX(int param0, int param1) {
        if (FaceNormal.field_c) {
          param1 = -param1 + 896;
        }
        if (param0 != 0) {
          return -103;
        }
        return MySquadScreen.worldToScreenX(-23, param1);
    }

    final static void insertNodeBefore(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        if (null != param2.field_b) {
          param2.unlink((byte) -109);
        }
        param2.field_b = param0.field_b;
        param2.field_d = param0;
        if (param1 != 16737894) {
          return;
        }
        try {
          param2.field_b.field_d = param2;
          param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ug.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void layoutSocialRows(int param0, int param1, boolean param2) {
        ScrollPane stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        UiLayoutNode stackIn_18_0 = null;
        String stackIn_19_1 = null;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        SocialPlayerRow var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PlayerContextMenu var16 = null;
        PlayerContextMenu var17 = null;
        var15 = Kickabout.field_G;
        try {
          stackIn_3_0 = TournamentChampionDialog.field_F.field_Cb;
          stackIn_3_1 = (3 * LineupPositionSupport.field_c + 6) * param0;
          stackIn_4_2 = (TournamentChampionDialog.field_F.field_Cb == MatchHudSupport.field_f);
          var3_int = ((ScrollPane) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, param2, param1, false, 2 + LineupPositionSupport.field_c) ? 1 : 0;
          var4 = TournamentChampionDialog.field_F.field_yb.field_jb;
          if (PitchCoordinateSupport.field_d != 2 &&
            1 != PitchCoordinateSupport.field_d) {
            TournamentChampionDialog.field_F.field_Cb.field_zb.field_E = CheckboxLabelWidget.field_yb;
            TournamentChampionDialog.field_F.field_lb = false;
            DateInputValidator.a(true, TournamentChampionDialog.field_F.field_yb);
            return;
          }
          TournamentChampionDialog.field_F.field_lb = true;
          TournamentChampionDialog.field_F.field_Cb.field_zb.field_E = null;
          var5 = null;
          var6 = (SocialPlayerRow) (var4.first(24009));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_jb) {
              var6.field_Bb = new UiLayoutNode(0L, BlobSubmission.field_f);
              var6.addChild((byte) -109, var6.field_Bb);
              var6.field_Fb = new UiLayoutNode(0L, BlobSubmission.field_f);
              var6.addChild((byte) -105, var6.field_Fb);
              var6.invalidateChildren(false);
              var7 = 1;
            }
            var6.field_q = TournamentChampionDialog.field_F.field_yb.field_q;
            var6.field_Bb.setBounds(true, var6.field_q, 0, 0, LineupPositionSupport.field_c);
            var8 = 0;
            if (null != var6.field_Eb &&
              !var6.field_Eb.equals("")) {
              var6.field_Fb.field_ub = 16737894;
              var6.field_Fb.field_N = DirectByteStorage.field_n;
              var6.field_Fb.setBounds(true, 3 + DirectByteStorage.field_n.field_o, 0, 0, LineupPositionSupport.field_c);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_q;
            if (var8 != 0) {
              var9 = DirectByteStorage.field_n.field_o + 3;
              var10 = var10 - var9;
            }
            stackIn_18_0 = var6.field_Bb;
            if (0 < var10) {
              stackIn_19_1 = BitmapFont.truncateWithEllipsis(var6.field_Bb.field_X, var6.name, var10);
            } else {
              stackIn_19_1 = var6.name;
            }
            stackIn_18_0.field_E = stackIn_19_1;
            stackIn_22_0 = (var6.field_Bb.field_E.equals(var6.name)) ? 0 : 1;
            var11 = stackIn_22_0;
            var6.field_Bb.setBounds(true, var10, var9, 0, LineupPositionSupport.field_c);
            if (var3_int == 0) {
              var6.field_L = -var6.field_mb + LineupPositionSupport.field_c;
            }
            if (var7 != 0) {
              TournamentChampionDialog.field_F.field_yb.positionAfter(true, 2, var6, (UiLayoutNode) (var5));
            }
            if (var6.field_Fb != null &&
              var6.field_Fb.field_gb) {
              UrlRequest.field_e = var6.field_Eb;
            } else {
              if (var6.field_Bb.field_gb &&
                var11 != 0) {
                UrlRequest.field_e = var6.name;
              }
            }
            if (var6.field_sb != 0) {
              BytePlusOneCommand.createPlayerContextMenu(var6, false, TournamentChampionDialog.field_F.field_Cb, -1, var6.field_yb, (int[]) null, 0L, var6.name, -1);
              var16 = TextButton.field_v;
              var13_ref_String = IsSixCommand.field_D;
              var16.field_j.addItem(0, 7, var13_ref_String);
              var17 = TextButton.field_v;
              var13 = HighScoreSubmission.field_q;
              var14 = ReceivedAuctionItem.field_y;
              var17.field_j.layoutItems(0, 0, var13, var14, 0);
            }
            var5 = var6;
            var6 = (SocialPlayerRow) (var4.next(33));
          }
          if (TournamentChampionDialog.field_F.field_Eb.field_sb != 0) {
            StreetSceneryLoader.field_m = new HoverTooltip(TournamentChampionDialog.field_F.field_Eb.field_F, TournamentChampionDialog.field_F.field_Eb.field_T, TournamentChampionDialog.field_F.field_Eb.field_q, TournamentChampionDialog.field_F.field_Eb.field_mb, ParticipantStatus.field_j, StrongCacheEntry.field_u, ConsoleEvaluationException.field_e, ConsoleEvaluationException.field_e);
            PanelSpriteFactory.field_b = 2;
          }
          if (0 == TournamentChampionDialog.field_F.field_zb.field_sb) {
            return;
          }
          StreetSceneryLoader.field_m = new HoverTooltip(TournamentChampionDialog.field_F.field_zb.field_F, TournamentChampionDialog.field_F.field_zb.field_T, TournamentChampionDialog.field_F.field_zb.field_q, TournamentChampionDialog.field_F.field_zb.field_mb, PlatformTaskState.field_d, StrongCacheEntry.field_u, ConsoleEvaluationException.field_e, ConsoleEvaluationException.field_e);
          PanelSpriteFactory.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3), "ug.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Inviting <%0>";
        field_e = null;
    }
}
