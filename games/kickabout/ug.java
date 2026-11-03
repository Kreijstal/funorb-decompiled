/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static Sprite[] field_c;
    static java.applet.Applet field_a;
    static Sprite[][] field_b;
    static String field_d;
    static wd field_e;
    static boolean[] field_f;

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = (Sprite[][]) null;
        if (param0 != -1) {
          IntrusiveNode var2 = (IntrusiveNode) null;
          ug.a((IntrusiveNode) null, 81, (IntrusiveNode) null);
        }
    }

    final static int a(int param0, int param1) {
        if (ia.field_c) {
          param1 = -param1 + 896;
        }
        if (param0 != 0) {
          return -103;
        }
        return MySquadScreen.c(-23, param1);
    }

    final static void a(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        if (null != param2.field_b) {
          param2.c((byte) -109);
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
          throw nb.a((Throwable) ((Object) runtimeException), "ug.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
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
        gg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        uv var16 = null;
        uv var17 = null;
        var15 = Kickabout.field_G;
        try {
          stackIn_3_0 = TournamentChampionDialog.field_F.field_Cb;
          stackIn_3_1 = (3 * sh.field_c + 6) * param0;
          stackIn_4_2 = (TournamentChampionDialog.field_F.field_Cb == ig.field_f);
          var3_int = ((ScrollPane) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, param2, param1, false, 2 + sh.field_c) ? 1 : 0;
          var4 = TournamentChampionDialog.field_F.field_yb.field_jb;
          if (ts.field_d != 2 &&
            1 != ts.field_d) {
            TournamentChampionDialog.field_F.field_Cb.field_zb.field_E = CheckboxLabelWidget.field_yb;
            TournamentChampionDialog.field_F.field_lb = false;
            hl.a(true, TournamentChampionDialog.field_F.field_yb);
            return;
          }
          TournamentChampionDialog.field_F.field_lb = true;
          TournamentChampionDialog.field_F.field_Cb.field_zb.field_E = null;
          var5 = null;
          var6 = (gg) (var4.g(24009));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_jb) {
              var6.field_Bb = new UiLayoutNode(0L, mp.field_f);
              var6.addChild((byte) -109, var6.field_Bb);
              var6.field_Fb = new UiLayoutNode(0L, mp.field_f);
              var6.addChild((byte) -105, var6.field_Fb);
              var6.invalidateChildren(false);
              var7 = 1;
            }
            var6.field_q = TournamentChampionDialog.field_F.field_yb.field_q;
            var6.field_Bb.a(true, var6.field_q, 0, 0, sh.field_c);
            var8 = 0;
            if (null != var6.field_Eb &&
              !var6.field_Eb.equals("")) {
              var6.field_Fb.field_ub = 16737894;
              var6.field_Fb.field_N = ll.field_n;
              var6.field_Fb.a(true, 3 + ll.field_n.field_o, 0, 0, sh.field_c);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_q;
            if (var8 != 0) {
              var9 = ll.field_n.field_o + 3;
              var10 = var10 - var9;
            }
            stackIn_18_0 = var6.field_Bb;
            if (0 < var10) {
              stackIn_19_1 = BitmapFont.a(var6.field_Bb.field_X, var6.field_Gb, var10);
            } else {
              stackIn_19_1 = var6.field_Gb;
            }
            stackIn_18_0.field_E = stackIn_19_1;
            stackIn_22_0 = (var6.field_Bb.field_E.equals(var6.field_Gb)) ? 0 : 1;
            var11 = stackIn_22_0;
            var6.field_Bb.a(true, var10, var9, 0, sh.field_c);
            if (var3_int == 0) {
              var6.field_L = -var6.field_mb + sh.field_c;
            }
            if (var7 != 0) {
              TournamentChampionDialog.field_F.field_yb.a(true, 2, var6, (UiLayoutNode) (var5));
            }
            if (var6.field_Fb != null &&
              var6.field_Fb.field_gb) {
              sn.field_e = var6.field_Eb;
            } else {
              if (var6.field_Bb.field_gb &&
                var11 != 0) {
                sn.field_e = var6.field_Gb;
              }
            }
            if (var6.field_sb != 0) {
              BytePlusOneCommand.a(var6, false, TournamentChampionDialog.field_F.field_Cb, -1, var6.field_yb, (int[]) null, 0L, var6.field_Gb, -1);
              var16 = TextButton.field_v;
              var13_ref_String = IsSixCommand.field_D;
              var16.field_j.addItem(0, 7, var13_ref_String);
              var17 = TextButton.field_v;
              var13 = sm.field_q;
              var14 = ReceivedAuctionItem.field_y;
              var17.field_j.a(0, 0, var13, var14, 0);
            }
            var5 = var6;
            var6 = (gg) (var4.c(33));
          }
          if (TournamentChampionDialog.field_F.field_Eb.field_sb != 0) {
            k.field_m = new HoverTooltip(TournamentChampionDialog.field_F.field_Eb.field_F, TournamentChampionDialog.field_F.field_Eb.field_T, TournamentChampionDialog.field_F.field_Eb.field_q, TournamentChampionDialog.field_F.field_Eb.field_mb, ParticipantStatus.field_j, pn.field_u, ConsoleEvaluationException.field_e, ConsoleEvaluationException.field_e);
            fs.field_b = 2;
          }
          if (0 == TournamentChampionDialog.field_F.field_zb.field_sb) {
            return;
          }
          k.field_m = new HoverTooltip(TournamentChampionDialog.field_F.field_zb.field_F, TournamentChampionDialog.field_F.field_zb.field_T, TournamentChampionDialog.field_F.field_zb.field_q, TournamentChampionDialog.field_F.field_zb.field_mb, oo.field_d, pn.field_u, ConsoleEvaluationException.field_e, ConsoleEvaluationException.field_e);
          fs.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ug.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Inviting <%0>";
        field_e = null;
    }
}
