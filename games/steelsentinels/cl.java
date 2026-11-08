/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_h;
    static int[][] field_f;
    static String field_e;
    static String field_a;
    static String field_c;
    static int field_b;
    static String field_g;
    static String field_i;
    static String field_d;

    final static int a(int param0, int param1) {
        int var2 = 12 % ((-72 - param1) / 35);
        return 256;
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_d = null;
        field_a = null;
        field_i = null;
        if (param0 != 5) {
          return;
        }
        field_g = null;
        field_e = null;
        field_f = (int[][]) null;
        field_c = null;
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          DelayedServerPacket.field_A = false;
          rg.field_e = false;
          if (param2 != 1) {
            return;
          }
          if (ch.field_O != null) {
            if (!ch.field_O.field_Q) {
              return;
            }
            if (param1 == 8) {
              param1 = 2;
              if (LoginMethod.field_d) {
                param0 = TextFieldValidator.field_h;
              } else {
                param0 = SectorCacheStore.field_k;
              }
              AccountNoticeDialog.field_kb.a(cc.field_Xb, -45);
            }
            var3_int = 1;
            if (param1 == 10) {
              qm.a(20272);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (rg.field_e) {
                param0 = SocketConnector.a(GameplayController.field_T, -58, new String[]{param0});
              }
              if (EmailAvailabilityValidator.field_p) {
                param0 = ph.field_c;
              }
              ch.field_O.a(param0, (byte) -97, param1);
            }
            if (256 != param1) {
              if (param1 == 10) {
                return;
              }
              if (!LoginMethod.field_d) {
                AccountNoticeDialog.field_kb.j(param2 + 62);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("cl.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String stackIn_45_2 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        boolean stackIn_87_2 = false;
        int stackIn_110_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var10 = SteelSentinels.obfuscationControl;
        try {
          in.field_a = param2;
          TextHotspotRegion.field_r = true;
          if (in.field_a == 0) {
            var3_int = tc.a(ud.field_C, pa.field_k, 75, uj.field_c, TextButton.field_J);
            var4 = var3_int + 3;
            LinkButtonPainter.field_m = new int[var4];
            ProxySocketConnector.field_j = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              LinkButtonPainter.field_m[var5] = -1;
            }
            oc.field_b = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              ProxySocketConnector.field_j[var5] = TextButton.field_J[var5];
            }
            ProxySocketConnector.field_j[-3 + var4] = "";
            ProxySocketConnector.field_j[-2 + var4] = dg.field_f;
            LinkButtonPainter.field_m[var4 - 2] = 0;
            oc.field_b[0] = 4;
            ProxySocketConnector.field_j[-1 + var4] = EditableTextWidget.field_cb;
            LinkButtonPainter.field_m[-1 + var4] = 1;
            oc.field_b[1] = 5;
          } else if (in.field_a == 1) {
            var3_int = tc.a(ud.field_C, pa.field_k, 75, uj.field_c, TextButton.field_J);
            var4 = var3_int + 2;
            ProxySocketConnector.field_j = new String[var4];
            LinkButtonPainter.field_m = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              LinkButtonPainter.field_m[var5] = -1;
            }
            oc.field_b = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              ProxySocketConnector.field_j[var5] = TextButton.field_J[var5];
            }
            ProxySocketConnector.field_j[var4 - 2] = "";
            ProxySocketConnector.field_j[-1 + var4] = EditableTextWidget.field_cb;
            LinkButtonPainter.field_m[-1 + var4] = 0;
            oc.field_b[0] = 5;
          } else if (2 != in.field_a) {
            if (in.field_a == 3) {
              if (!IterableDualNodeDeque.field_i.field_x) {
                var3_int = tc.a(ud.field_C, pa.field_k, 75, ProxySocketConnector.field_p, TextButton.field_J);
              } else {
                var3_int = tc.a(ud.field_C, pa.field_k, 75, kk.field_e, TextButton.field_J);
              }
              var4 = 2 + var3_int;
              ProxySocketConnector.field_j = new String[var4];
              LinkButtonPainter.field_m = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                LinkButtonPainter.field_m[var5] = -1;
              }
              oc.field_b = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ProxySocketConnector.field_j[var5] = TextButton.field_J[var5];
              }
              ProxySocketConnector.field_j[-2 + var4] = "";
              ProxySocketConnector.field_j[var4 - 1] = EditableTextWidget.field_cb;
              LinkButtonPainter.field_m[-1 + var4] = 0;
              oc.field_b[0] = 5;
            } else if (in.field_a == 4) {
              var3_int = tc.a(ud.field_C, pa.field_k, 75, ValidationHelpWidget.field_gb, TextButton.field_J);
              var4 = 2 + var3_int;
              ProxySocketConnector.field_j = new String[var4];
              LinkButtonPainter.field_m = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                LinkButtonPainter.field_m[var5] = -1;
              }
              oc.field_b = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ProxySocketConnector.field_j[var5] = TextButton.field_J[var5];
              }
              ProxySocketConnector.field_j[-2 + var4] = "";
              ProxySocketConnector.field_j[-1 + var4] = EditableTextWidget.field_cb;
              LinkButtonPainter.field_m[-1 + var4] = 0;
              oc.field_b[0] = 5;
            } else {
              if (in.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = tc.a(ud.field_C, pa.field_k, 75, sl.field_q, TextButton.field_J);
              var4 = 3 + var3_int;
              ProxySocketConnector.field_j = new String[var4];
              LinkButtonPainter.field_m = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                LinkButtonPainter.field_m[var5] = -1;
              }
              oc.field_b = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                ProxySocketConnector.field_j[var5] = TextButton.field_J[var5];
              }
              ProxySocketConnector.field_j[-3 + var4] = "";
              ProxySocketConnector.field_j[var4 - 2] = ec.field_d;
              LinkButtonPainter.field_m[var4 - 2] = 0;
              oc.field_b[0] = 3;
              ProxySocketConnector.field_j[var4 - 1] = EditableTextWidget.field_cb;
              LinkButtonPainter.field_m[-1 + var4] = 1;
              oc.field_b[1] = 5;
            }
          } else {
            var3_int = tc.a(ud.field_C, pa.field_k, 75, SocketConnector.a(AlternateUsernameCredentials.field_t, -25, new String[]{"<br><%0><br>"}), TextButton.field_J);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(TextButton.field_J[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            EmailAvailabilityValidator.field_n = new String[var4];
            ArraySupport.copy(TextButton.field_J, 0, EmailAvailabilityValidator.field_n, 0, var4);
            dj.field_j = new String[-1 + (var3_int - var4)];
            ArraySupport.copy(TextButton.field_J, 1 + var4, dj.field_j, 0, -1 + (-var4 + var3_int));
            var3_int = tc.a(ud.field_C, pa.field_k, 75, SocketConnector.a(IterableNodeHashTable.field_k, -89, new String[]{"<br><%0><br>"}), TextButton.field_J);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(TextButton.field_J[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            oc.field_d = new String[var4];
            ArraySupport.copy(TextButton.field_J, 0, oc.field_d, 0, var4);
            MouseWheelInput.field_g = new String[var3_int - var4 - 1];
            ArraySupport.copy(TextButton.field_J, 1 + var4, MouseWheelInput.field_g, 0, -1 + (var3_int - var4));
            if (EmailAvailabilityValidator.field_n.length >= oc.field_d.length) {
              stackIn_28_0 = EmailAvailabilityValidator.field_n.length;
            } else {
              stackIn_28_0 = oc.field_d.length;
            }
            var5 = stackIn_28_0;
            if (dj.field_j.length >= MouseWheelInput.field_g.length) {
              stackIn_31_0 = dj.field_j.length;
            } else {
              stackIn_31_0 = MouseWheelInput.field_g.length;
            }
            var6 = stackIn_31_0;
            var7 = var6 + (var5 + 7);
            ProxySocketConnector.field_j = new String[var7];
            LinkButtonPainter.field_m = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              LinkButtonPainter.field_m[var8] = -1;
            }
            ProxySocketConnector.field_j[1] = CachedArchiveProvider.field_s;
            LinkButtonPainter.field_m[1] = 0;
            oc.field_b = new int[2];
            ProxySocketConnector.field_j[0] = LoadingProgressDialog.field_kb;
            ProxySocketConnector.field_j[4] = cd.field_d;
            oc.field_b[0] = 5;
            oc.field_b[1] = 2;
            LinkButtonPainter.field_m[3] = 1;
            ProxySocketConnector.field_j[5] = "";
            ProxySocketConnector.field_j[3] = qf.field_g;
            ProxySocketConnector.field_j[2] = sf.field_i;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_38_0 = ProxySocketConnector.field_j;
              stackIn_38_1 = 6 + var8Lifetime2;
              if (oc.field_d.length + var8Lifetime2 - var5 < 0) {
                stackIn_39_2 = "";
              } else {
                stackIn_39_2 = oc.field_d[-var5 + var8Lifetime2 + oc.field_d.length];
              }
              stackIn_38_0[stackIn_38_1] = stackIn_39_2;
            }
            ProxySocketConnector.field_j[6 + var5] = null;
            LinkButtonPainter.field_m[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_44_0 = ProxySocketConnector.field_j;
              stackIn_44_1 = 7 - (-var5 - var8Lifetime3);
              if (var8Lifetime3 < MouseWheelInput.field_g.length) {
                stackIn_45_2 = MouseWheelInput.field_g[var8Lifetime3];
              } else {
                stackIn_45_2 = "";
              }
              stackIn_44_0[stackIn_44_1] = stackIn_45_2;
            }
            rb.field_c = mm.a(76);
          }
          DualNodeDeque.field_f.field_m = oc.field_b.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; ProxySocketConnector.field_j.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_86_0 = ProxySocketConnector.field_j[var4Lifetime1];
            stackIn_86_1 = 52;
            stackIn_87_2 = !(0 > LinkButtonPainter.field_m[var4Lifetime1]);
            var5Lifetime1 = wd.$cfr$intArgs$a$1694234bddb3(stackIn_86_0, stackIn_86_1, stackIn_87_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (in.field_a == 2) {
            var11 = EmailAvailabilityValidator.field_n;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var5Lifetime2 < var11.length; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = wd.$cfr$intArgs$a$1694234bddb3(var12, 52, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = dj.field_j;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = wd.$cfr$intArgs$a$1694234bddb3(var13, 52, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ce.field_r = -(var3_intLifetime1 >> 1) + (QuickChatMenu.field_kc + var3_intLifetime1);
          TickClock.field_d = (SectorCacheStore.field_j + MembershipPromotionScreen.field_m << 1) * DualNodeDeque.field_f.field_m;
          MusicPatchPcmStream.field_D = QuickChatMenu.field_kc - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; ProxySocketConnector.field_j.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_110_0 = TickClock.field_d;
            if (LinkButtonPainter.field_m[var4Lifetime2] >= 0) {
              stackIn_111_1 = rn.field_q;
            } else {
              stackIn_111_1 = ih.field_r;
            }
            TickClock.field_d = stackIn_110_0 + stackIn_111_1;
          }
          SingleChildContainer.field_Q = -(TickClock.field_d >> 1) + kb.field_a;
          var4Lifetime3 = -12 / ((param0 - 44) / 61);
          TextLayoutLine.field_c = new int[ProxySocketConnector.field_j.length][];
          var5Lifetime3 = 0;
          var6Lifetime1 = SingleChildContainer.field_Q;
          while (ProxySocketConnector.field_j.length > var5Lifetime3) {
            var7Lifetime2 = LinkButtonPainter.field_m[var5Lifetime3];
            if (0 > var7Lifetime2) {
              var6Lifetime1 = var6Lifetime1 + ih.field_r;
            } else {
              var8Lifetime1 = wd.$cfr$intArgs$a$1694234bddb3(ProxySocketConnector.field_j[var5Lifetime3], 52, true);
              var9 = QuickChatMenu.field_kc - (var8Lifetime1 >> 1);
              var6Lifetime1 = var6Lifetime1 + MembershipPromotionScreen.field_m;
              TextLayoutLine.field_c[var5Lifetime3] = new int[4];
              TextLayoutLine.field_c[var5Lifetime3][0] = var9 - ud.field_y;
              TextLayoutLine.field_c[var5Lifetime3][1] = var6Lifetime1;
              TextLayoutLine.field_c[var5Lifetime3][2] = (ud.field_y << 1) + var8Lifetime1;
              TextLayoutLine.field_c[var5Lifetime3][3] = rn.field_q + (SectorCacheStore.field_j << 1);
              var6Lifetime1 = var6Lifetime1 + ((SectorCacheStore.field_j << 1) - (-MembershipPromotionScreen.field_m - rn.field_q));
            }
            var5Lifetime3++;
          }
          if (in.field_a == 2) {
            DualNodeDeque.field_f.a(param1, -1, 0, -1);
          } else {
            DualNodeDeque.field_f.a(param1, 0, 0, GameApplet.a(5, DelegatingCanvas.field_c, oh.field_f));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "cl.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Spectate";
        field_c = "Reload game";
        field_g = "A";
        field_h = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_i = "Offer unrated rematch";
        field_a = "Join <%0>'s game";
        field_d = "FROM ONLY";
    }
}
