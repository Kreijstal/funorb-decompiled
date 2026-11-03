/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static volatile int field_j;
    static String field_f;
    IntrusiveNode field_a;
    static int field_c;
    long field_e;
    static int[] field_b;
    static String field_g;
    static String field_d;
    static String field_i;
    IntrusiveNode field_h;

    final static void a(String[] args, ResourceArchive param1, int[] param2, byte param3, Sprite[][] param4, int param5, byte[] param6, Sprite[][] param7, String[] param8, String[][] param9, String[][] param10, String[] param11, int param12, int param13, byte[] param14) {
        lo[] array$0 = null;
        lo[] array$1 = null;
        lo[] array$2 = null;
        int var19 = 0;
        SceneWidget stackIn_8_0;
        SceneWidget stackIn_8_1;
        long stackIn_8_2;
        SceneWidget stackIn_8_3;
        SceneWidget stackIn_9_0 = null;
        SceneWidget stackIn_9_1 = null;
        String stackIn_9_4 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        SceneWidget var16 = null;
        int var17_int = 0;
        SceneWidget var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        SceneWidget var23 = null;
        SceneWidget var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = Pixelate.field_H ? 1 : 0;
        try {
          dq.field_b = param9;
          vm.field_c = param11;
          jk.field_e = args;
          LinkButtonPainter.field_a = param2;
          rm.field_b = param8;
          ff.field_i = param5;
          PasswordValidator.field_s = param6;
          ig.field_a = param7;
          GameApplet.field_o = param13;
          bg.field_d = param14;
          bf.field_q = param10;
          dk.field_a = param4;
          DraggableWidget.field_P = SocketConnector.a("gameprivacy", "lobby", (byte) 47, param1);
          fd.field_c = SocketConnector.a("ratedgame", "lobby", (byte) 47, param1);
          EmailCredentials.field_h = SocketConnector.a("opentome", "lobby", (byte) 47, param1);
          so.field_d = SocketConnector.a("allowspectators", "lobby", (byte) 47, param1);
          rb.field_p = new String[5];
          rb.field_p[3] = il.field_c;
          rb.field_p[2] = cl.field_b;
          rb.field_p[4] = u.field_g;
          rb.field_p[0] = pc.field_t;
          rb.field_p[1] = IntrusiveDequeCursor.field_b;
          StripedProgressBar.field_O = new SceneWidget(0L, (SceneWidget) null);
          ho.field_g = new SceneWidget(0L, u.field_l, qn.field_m);
          l.field_s = new SceneWidget(0L, ni.field_s, rh.field_m);
          jm.field_b = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), ff.field_g, ug.field_s);
          StripedProgressBar.field_O.a(ho.field_g, (byte) 26);
          if (DialWidgetPainter.field_n) {
            StripedProgressBar.field_O.a(l.field_s, (byte) 26);
          }
          StripedProgressBar.field_O.a(jm.field_b, (byte) 26);
          jm.field_b.field_Ib.applyStyle(-27813, TextFieldValidator.field_h);
          var23 = jm.field_b.field_Ib;
          var24 = var23;
          jm.field_b.field_Ib.verticalAlignment = 1;
          var24.horizontalAlignment = 1;
          ValidatedTextWidget.field_lb = new SceneWidget(0L, TextFieldValidator.field_h);
          ValidatedTextWidget.field_lb.horizontalAlignment = 1;
          ValidatedTextWidget.field_cb = new SceneWidget(0L, be.field_R, AccountChoicePanel.field_K.toUpperCase());
          sd.field_P = new SceneWidget(0L, io.field_f, ul.field_n.toUpperCase());
          DiskCacheWorker.field_a = new SceneWidget(0L, ff.field_a);
          wc.field_n = new SceneWidget(0L, u.field_l, op.field_w);
          if (param3 < 108) {
            IntrusiveNode.d(41);
          }
          IsaacRandom.field_b = new SceneWidget(0L, AccountRequestDialog.field_mb, ViewportController.field_u);
          LoginDialog.field_pb = new SceneWidget(0L, AccountRequestDialog.field_mb, nk.field_c);
          be.field_P = new SceneWidget(0L, AccountRequestDialog.field_mb, MusicPatchPcmStream.field_q);
          PasswordValidator.field_o = new SceneWidget(0L, AccountRequestDialog.field_mb, MatchController.field_b);
          SocketJs5Transport.field_t = new SceneWidget(0L, ni.field_s, df.field_m);
          aj.field_k = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), ff.field_g, ug.field_s);
          lg.field_c = new SceneWidget(0L, bf.field_k, DualLinkNode.field_m.toUpperCase());
          lg.field_c.field_rb = DialWidgetPainter.field_n;
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = 0L;
          stackIn_8_3 = bf.field_k;
          if (DialWidgetPainter.field_n) {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = ci.field_r;
          } else {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = re.field_c;
          }
          MusicPatchNode.field_p = new SceneWidget(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_9_4).toUpperCase());
          MidiPcmStream.field_E = new SceneWidget(0L, (SceneWidget) null);
          MidiPcmStream.field_E.a(sd.field_P, (byte) 26);
          MidiPcmStream.field_E.a(DiskCacheWorker.field_a, (byte) 26);
          DiskCacheWorker.field_a.a(wc.field_n, (byte) 26);
          DiskCacheWorker.field_a.a(IsaacRandom.field_b, (byte) 26);
          DiskCacheWorker.field_a.a(LoginDialog.field_pb, (byte) 26);
          if (DialWidgetPainter.field_n) {
            DiskCacheWorker.field_a.a(be.field_P, (byte) 26);
          }
          DiskCacheWorker.field_a.a(PasswordValidator.field_o, (byte) 26);
          DiskCacheWorker.field_a.a(SocketJs5Transport.field_t, (byte) 26);
          DiskCacheWorker.field_a.a(aj.field_k, (byte) 26);
          if (DialWidgetPainter.field_n) {
            MidiPcmStream.field_E.a(lg.field_c, (byte) 26);
          }
          MidiPcmStream.field_E.a(MusicPatchNode.field_p, (byte) 26);
          jm.field_h = new SceneWidget(0L, TextFieldValidator.field_h);
          jm.field_h.verticalAlignment = 0;
          jm.field_h.horizontalAlignment = 1;
          DelegatingCanvas.field_h = new SceneWidget(0L, nk.field_f, ig.field_c.toUpperCase());
          nc.field_e = new SceneWidget(0L, cm.field_o);
          nc.field_e.a(jm.field_h, (byte) 26);
          nc.field_e.a(DelegatingCanvas.field_h, (byte) 26);
          an.field_a = new SceneWidget(0L, ff.field_g);
          an.field_a.applyStyle(-27813, TextFieldValidator.field_h);
          var16 = an.field_a;
          an.field_a.verticalAlignment = 1;
          var16.horizontalAlignment = 1;
          vd.field_a = new SceneWidget(0L, (SceneWidget) null);
          MatchingTextValidator.field_q = new SceneWidget(0L, TextFieldValidator.field_h);
          MatchingTextValidator.field_q.horizontalAlignment = 1;
          WeightedLruCache.field_h = new SceneWidget(0L, u.field_l, qn.field_m);
          wa.field_g = new SceneWidget(0L, ni.field_s, rh.field_m);
          ae.field_c = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), ff.field_g, ug.field_s);
          vd.field_a.a(MatchingTextValidator.field_q, (byte) 26);
          vd.field_a.a(WeightedLruCache.field_h, (byte) 26);
          if (DialWidgetPainter.field_n) {
            vd.field_a.a(wa.field_g, (byte) 26);
          }
          vd.field_a.a(ae.field_c, (byte) 26);
          ValidatedTextWidget.field_kb = new SceneWidget(0L, be.field_R, ra.field_f.toUpperCase());
          VerticalScrollbar.field_Qb = new SceneWidget(0L, io.field_f);
          dc.field_a = new SceneWidget(0L, ff.field_a);
          sm.field_m = new SceneWidget(0L, ff.field_j, og.field_n.toUpperCase());
          AccountTermsPanel.field_L = new lo[param12 + 4][];
          dh.field_b = new SceneWidget[param12 + 4];
          dh.field_b[0] = new SceneWidget(0L, qk.field_d, cd.field_f);
          AccountTermsPanel.field_L[0] = new lo[6];
          for (var17_int = 0; 5 > var17_int; var17_int++) {
            AccountTermsPanel.field_L[0][var17_int + 1] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, DraggableWidget.field_P[var17_int], rb.field_p[var17_int]);
          }
          if (LinkButtonPainter.field_a.length >= 2) {
            dh.field_b[1] = new SceneWidget(0L, qk.field_d, pk.field_e);
            array$0 = new lo[LinkButtonPainter.field_a.length + 1];
            AccountTermsPanel.field_L[1] = array$0;
            AccountTermsPanel.field_L[1][0] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) null, fg.field_a);
            for (var17_intLifetime1 = 0; LinkButtonPainter.field_a.length > var17_intLifetime1; var17_intLifetime1++) {
              AccountTermsPanel.field_L[1][var17_intLifetime1 + 1] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) null, Integer.toString(LinkButtonPainter.field_a[var17_intLifetime1]));
            }
          }
          dh.field_b[2] = new SceneWidget(0L, qk.field_d, LobbyGame.field_Xb);
          AccountTermsPanel.field_L[2] = new lo[]{new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) null, fg.field_a), new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, so.field_d[0], ValidatedTextWidget.field_eb), new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, so.field_d[1], ij.field_t)};
          if (ff.field_i > 1) {
            dh.field_b[3] = new SceneWidget(0L, qk.field_d, MatchController.field_c);
            array$1 = new lo[1 + ff.field_i];
            AccountTermsPanel.field_L[3] = array$1;
            AccountTermsPanel.field_L[3][0] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) null, fg.field_a);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < ff.field_i; var17_intLifetime2++) {
              AccountTermsPanel.field_L[3][var17_intLifetime2 + 1] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) null, rm.field_b[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param12 > var17_intLifetime3; var17_intLifetime3++) {
            dh.field_b[4 + var17_intLifetime3] = new SceneWidget(0L, qk.field_d, jk.field_e[var17_intLifetime3]);
            array$2 = new lo[1 + cm.a(255, (int) PasswordValidator.field_s[var17_intLifetime3])];
            AccountTermsPanel.field_L[4 + var17_intLifetime3] = array$2;
            AccountTermsPanel.field_L[var17_intLifetime3 + 4][0] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) null, fg.field_a);
            for (var18 = 0; (PasswordValidator.field_s[var17_intLifetime3] & 255) > var18; var18++) {
              if (null == dk.field_a) {
                var19_ref = null;
              } else {
                if (dk.field_a[var17_intLifetime3] != null) {
                  var19_ref = dk.field_a[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (bf.field_q == null) {
                var20 = null;
              } else {
                if (bf.field_q[var17_intLifetime3] != null) {
                  var20 = bf.field_q[var17_intLifetime3][var18];
                } else {
                  var20 = null;
                }
              }
              AccountTermsPanel.field_L[4 + var17_intLifetime3][1 + var18] = new lo(0L, EmailValidator.field_o, (SceneWidget) null, dn.field_c, (Sprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; 4 + param12 > var17_intLifetime4; var17_intLifetime4++) {
            if (null != dh.field_b[var17_intLifetime4]) {
              dh.field_b[var17_intLifetime4].field_mb = 11;
            }
            if (null != AccountTermsPanel.field_L[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; AccountTermsPanel.field_L[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (AccountTermsPanel.field_L[var17_intLifetime4][var18Lifetime1] != null &&
                  AccountTermsPanel.field_L[var17_intLifetime4][var18Lifetime1].field_Eb != null) {
                  AccountTermsPanel.field_L[var17_intLifetime4][var18Lifetime1].field_Eb.field_mb = 11;
                }
              }
            }
          }
          wm.field_d = new SceneWidget(0L, bf.field_k);
          ep.field_a = new SceneWidget(0L, bf.field_k);
          nk.field_e = new SceneWidget(0L, ArchiveIndex.field_l);
          nk.field_e.applyStyle(-27813, TextFieldValidator.field_h);
          nk.field_e.verticalAlignment = 1;
          var17 = nk.field_e;
          var17.horizontalAlignment = 1;
          ai.field_A = new SceneWidget(0L, (SceneWidget) null);
          ai.field_A.a(VerticalScrollbar.field_Qb, (byte) 26);
          ai.field_A.a(dc.field_a, (byte) 26);
          dc.field_a.a(sm.field_m, (byte) 26);
          for (var18Lifetime2 = 0; param12 + 4 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(LinkButtonPainter.field_a.length < 2)) && (3 != var18Lifetime2 ||
              !(ff.field_i <= 1))) {
              dc.field_a.a(dh.field_b[var18Lifetime2], (byte) 26);
              for (var19 = 0; AccountTermsPanel.field_L[var18Lifetime2].length > var19; var19++) {
                if (AccountTermsPanel.field_L[var18Lifetime2][var19] != null) {
                  dc.field_a.a(AccountTermsPanel.field_L[var18Lifetime2][var19], (byte) 26);
                }
              }
            }
          }
          ai.field_A.a(wm.field_d, (byte) 26);
          ai.field_A.a(ep.field_a, (byte) 26);
          ai.field_A.a(nk.field_e, (byte) 26);
          ih.field_g = new SceneWidget(0L, pj.field_i, WhirlpoolHasher.field_k.toUpperCase());
          ContentTransitionDialog.field_eb = new SceneWidget(0L, nk.field_f, NameAvailabilityValidator.field_o.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_79_0 = var15;
          stackIn_79_1 = new StringBuilder().append("fa.QC(");
          if (args == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param1 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param2 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param7 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param8 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param9 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param10 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param11 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_110_2 = "null";
          } else {
            stackIn_110_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        field_i = null;
        field_b = null;
        field_f = null;
        if (param0 != -3) {
          field_j = 48;
        }
    }

    final boolean b(int param0) {
        if (this.field_h == null) {
          return false;
        }
        if (param0 != 0) {
          field_i = (String) null;
          return true;
        }
        return true;
    }

    final void c(int param0) {
        if (this.field_h == null) {
          return;
        }
        this.field_h.field_a = this.field_a;
        if (param0 != 2779) {
          return;
        }
        this.field_a.field_h = this.field_h;
        this.field_a = null;
        this.field_h = null;
    }

    static {
        field_j = 0;
        field_g = "Open in popup window";
        field_d = "Drawn";
        field_c = 0;
        field_f = "Cancel";
    }
}
