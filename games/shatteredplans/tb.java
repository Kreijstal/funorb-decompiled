/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_b;
    static String field_c;
    static qr[] field_a;

    final static void a(int param0, int[] param1, String[][] param2, String[][] param3, Archive param4, String[] param5, String[] param6, Sprite[][] param7, int param8, Sprite[][] param9, int param10, String[] param11, byte[] param12, int param13, byte[] param14) {
        sg[] array$0 = null;
        sg[] array$1 = null;
        sg[] array$2 = null;
        int var19 = 0;
        qr stackIn_6_0;
        qr stackIn_6_1;
        long stackIn_6_2;
        qr stackIn_6_3;
        qr stackIn_7_0 = null;
        qr stackIn_7_1 = null;
        String stackIn_7_4 = null;
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
        qr var16 = null;
        int var17_int = 0;
        qr var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        qr var23 = null;
        qr var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          si.field_o = param5;
          mk.field_d = param14;
          gm.field_l = param11;
          qk.field_x = param10;
          wa.field_d = param3;
          Star.field_O = param9;
          ei.field_f = param2;
          nl.field_a = param1;
          UsernameAvailabilityValidator.field_v = param6;
          so.field_r = param12;
          nb.field_d = param7;
          FleetMove.field_A = param8;
          uk.field_b = ae.a(62, "lobby", param4, "gameprivacy");
          CheckboxPainter.field_l = ae.a(83, "lobby", param4, "ratedgame");
          ji.field_E = ae.a(-88, "lobby", param4, "opentome");
          LegacyAi.field_s = ae.a(71, "lobby", param4, "allowspectators");
          mk.field_e = new String[5];
          mk.field_e[0] = mm.field_p;
          mk.field_e[4] = si.field_q;
          mk.field_e[3] = ls.field_b;
          mk.field_e[1] = id.field_a;
          mk.field_e[2] = MouseWheelInput.field_e;
          lp.field_v = new qr(0L, (qr) null);
          gm.field_m = new qr(0L, SliderWidget.field_N, gd.field_c);
          sf.field_f = new qr(0L, vm.field_Cb, mk.field_b);
          ls.field_a = new ub(0L, new qr(0L, (qr) null), VictoryChecker.field_d, AchievementProgress.field_m);
          lp.field_v.a(param13 ^ -7962, gm.field_m);
          if (ns.field_pb) {
            lp.field_v.a(4, sf.field_f);
          }
          lp.field_v.a(4, ls.field_a);
          ls.field_a.field_zb.a(SpriteState.field_u, false);
          ls.field_a.field_zb.field_G = 1;
          var23 = ls.field_a.field_zb;
          var24 = var23;
          var24.field_y = 1;
          nm.field_c = new qr(0L, SpriteState.field_u);
          nm.field_c.field_y = 1;
          vm.field_Ab = new qr(0L, bd.field_E, v.field_a.toUpperCase());
          sg.field_zb = new qr(0L, gg.field_d, uc.field_z.toUpperCase());
          qf.field_e = new qr(0L, rs.field_Eb);
          BattleSnapshot.field_y = new qr(0L, SliderWidget.field_N, sm.field_c);
          GameSession.field_e = new qr(0L, jr.field_h, di.field_j);
          WeightedCacheEntry.field_t = new qr(0L, jr.field_h, vm.field_Lb);
          ta.field_d = new qr(0L, jr.field_h, fa.field_T);
          IsaacBackedRandom.field_c = new qr(0L, jr.field_h, WidgetContainer.field_z);
          hq.field_b = new qr(0L, vm.field_Cb, DerelictMapGenerator.field_o);
          SingleChildWidget.field_y = new ub(0L, new qr(0L, (qr) null), VictoryChecker.field_d, AchievementProgress.field_m);
          gb.field_m = new qr(0L, IsaacBackedRandom.field_a, GameApplet.field_a.toUpperCase());
          gb.field_m.field_s = ns.field_pb;
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = 0L;
          stackIn_6_3 = IsaacBackedRandom.field_a;
          if (ns.field_pb) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = DisplayModeInfo.field_a;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = rh.field_a;
          }
          LinkPainter.field_b = new qr(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_7_4).toUpperCase());
          AchievementProgress.field_i = new qr(0L, (qr) null);
          AchievementProgress.field_i.a(param13 ^ -7962, sg.field_zb);
          AchievementProgress.field_i.a(4, qf.field_e);
          qf.field_e.a(4, BattleSnapshot.field_y);
          qf.field_e.a(4, GameSession.field_e);
          qf.field_e.a(param13 ^ -7962, WeightedCacheEntry.field_t);
          if (ns.field_pb) {
            qf.field_e.a(4, ta.field_d);
          }
          qf.field_e.a(4, IsaacBackedRandom.field_c);
          qf.field_e.a(4, hq.field_b);
          qf.field_e.a(4, SingleChildWidget.field_y);
          if (ns.field_pb) {
            AchievementProgress.field_i.a(4, gb.field_m);
          }
          AchievementProgress.field_i.a(4, LinkPainter.field_b);
          SoundCache.field_c = new qr(0L, SpriteState.field_u);
          SoundCache.field_c.field_G = 0;
          SoundCache.field_c.field_y = 1;
          SocketConnector.field_d = new qr(0L, DelegatingCanvas.field_f, ck.field_c.toUpperCase());
          so.field_v = new qr(0L, ho.field_j);
          so.field_v.a(4, SoundCache.field_c);
          so.field_v.a(4, SocketConnector.field_d);
          IntrusiveNode.field_c = new qr(0L, VictoryChecker.field_d);
          IntrusiveNode.field_c.a(SpriteState.field_u, false);
          var16 = IntrusiveNode.field_c;
          IntrusiveNode.field_c.field_G = 1;
          var16.field_y = 1;
          so.field_t = new qr(0L, (qr) null);
          DefendTask.field_x = new qr(0L, SpriteState.field_u);
          DefendTask.field_x.field_y = 1;
          lr.field_a = new qr(0L, SliderWidget.field_N, gd.field_c);
          vd.field_q = new qr(0L, vm.field_Cb, mk.field_b);
          ro.field_a = new ub(0L, new qr(0L, (qr) null), VictoryChecker.field_d, AchievementProgress.field_m);
          so.field_t.a(4, DefendTask.field_x);
          so.field_t.a(4, lr.field_a);
          if (ns.field_pb) {
            so.field_t.a(4, vd.field_q);
          }
          so.field_t.a(param13 + 7970, ro.field_a);
          DialPainter.field_g = new qr(0L, bd.field_E, tm.field_o.toUpperCase());
          ArchiveSourceManager.field_f = new qr(0L, gg.field_d);
          bj.field_D = new qr(0L, rs.field_Eb);
          StarAnnotation.field_l = new qr(0L, nl.field_b, ds.field_e.toUpperCase());
          re.field_g = new qr[4 + param0];
          ByteArrayNode.field_p = new sg[4 + param0][];
          re.field_g[0] = new qr(0L, ObjectList.field_h, am.field_Ab);
          ByteArrayNode.field_p[0] = new sg[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            ByteArrayNode.field_p[0][1 + var17_int] = new sg(0L, an.field_d, (qr) null, gn.field_w, uk.field_b[var17_int], mk.field_e[var17_int]);
          }
          if (param13 != -7966) {
            tb.a(-52);
          }
          if (nl.field_a.length >= 2) {
            re.field_g[1] = new qr(0L, ObjectList.field_h, wl.field_b);
            array$0 = new sg[1 + nl.field_a.length];
            ByteArrayNode.field_p[1] = array$0;
            ByteArrayNode.field_p[1][0] = new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) null, DefendTask.field_r);
            for (var17_intLifetime1 = 0; nl.field_a.length > var17_intLifetime1; var17_intLifetime1++) {
              ByteArrayNode.field_p[1][1 + var17_intLifetime1] = new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) null, Integer.toString(nl.field_a[var17_intLifetime1]));
            }
          }
          re.field_g[2] = new qr(0L, ObjectList.field_h, sq.field_s);
          ByteArrayNode.field_p[2] = new sg[]{new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) null, DefendTask.field_r), new sg(0L, an.field_d, (qr) null, gn.field_w, LegacyAi.field_s[0], mi.field_c), new sg(0L, an.field_d, (qr) null, gn.field_w, LegacyAi.field_s[1], he.field_j)};
          if (FleetMove.field_A > 1) {
            re.field_g[3] = new qr(0L, ObjectList.field_h, jo.field_e);
            array$1 = new sg[1 + FleetMove.field_A];
            ByteArrayNode.field_p[3] = array$1;
            ByteArrayNode.field_p[3][0] = new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) null, DefendTask.field_r);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < FleetMove.field_A; var17_intLifetime2++) {
              ByteArrayNode.field_p[3][var17_intLifetime2 + 1] = new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) null, si.field_o[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param0 > var17_intLifetime3; var17_intLifetime3++) {
            re.field_g[4 + var17_intLifetime3] = new qr(0L, ObjectList.field_h, gm.field_l[var17_intLifetime3]);
            array$2 = new sg[1 + we.a(255, (int) so.field_r[var17_intLifetime3])];
            ByteArrayNode.field_p[var17_intLifetime3 + 4] = array$2;
            ByteArrayNode.field_p[4 + var17_intLifetime3][0] = new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) null, DefendTask.field_r);
            for (var18 = 0; var18 < (255 & so.field_r[var17_intLifetime3]); var18++) {
              if (null == nb.field_d) {
                var19_ref = null;
              } else {
                if (null == nb.field_d[var17_intLifetime3]) {
                  var19_ref = null;
                } else {
                  var19_ref = nb.field_d[var17_intLifetime3][var18];
                }
              }
              if (null != wa.field_d) {
                if (wa.field_d[var17_intLifetime3] != null) {
                  var20 = wa.field_d[var17_intLifetime3][var18];
                } else {
                  var20 = null;
                }
              } else {
                var20 = null;
              }
              ByteArrayNode.field_p[4 + var17_intLifetime3][var18 + 1] = new sg(0L, an.field_d, (qr) null, gn.field_w, (Sprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < 4 + param0; var17_intLifetime4++) {
            if (re.field_g[var17_intLifetime4] != null) {
              re.field_g[var17_intLifetime4].field_Y = 11;
            }
            if (null != ByteArrayNode.field_p[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < ByteArrayNode.field_p[var17_intLifetime4].length; var18Lifetime1++) {
                if (ByteArrayNode.field_p[var17_intLifetime4][var18Lifetime1] != null &&
                  null != ByteArrayNode.field_p[var17_intLifetime4][var18Lifetime1].field_Bb) {
                  ByteArrayNode.field_p[var17_intLifetime4][var18Lifetime1].field_Bb.field_Y = 11;
                }
              }
            }
          }
          TextFieldWidget.field_I = new qr(0L, IsaacBackedRandom.field_a);
          aq.field_j = new qr(0L, IsaacBackedRandom.field_a);
          dn.field_f = new qr(0L, fg.field_b);
          dn.field_f.a(SpriteState.field_u, false);
          var17 = dn.field_f;
          dn.field_f.field_G = 1;
          var17.field_y = 1;
          IntrusiveDeque.field_g = new qr(0L, (qr) null);
          IntrusiveDeque.field_g.a(param13 + 7970, ArchiveSourceManager.field_f);
          IntrusiveDeque.field_g.a(4, bj.field_D);
          bj.field_D.a(4, StarAnnotation.field_l);
          for (var18Lifetime2 = 0; 4 + param0 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(nl.field_a.length < 2)) && (var18Lifetime2 != 3 ||
              !(FleetMove.field_A <= 1))) {
              bj.field_D.a(4, re.field_g[var18Lifetime2]);
              for (var19 = 0; var19 < ByteArrayNode.field_p[var18Lifetime2].length; var19++) {
                if (null != ByteArrayNode.field_p[var18Lifetime2][var19]) {
                  bj.field_D.a(4, ByteArrayNode.field_p[var18Lifetime2][var19]);
                }
              }
            }
          }
          IntrusiveDeque.field_g.a(4, TextFieldWidget.field_I);
          IntrusiveDeque.field_g.a(param13 + 7970, aq.field_j);
          IntrusiveDeque.field_g.a(4, dn.field_f);
          ValidationIndicator.field_K = new qr(0L, un.field_g, ph.field_c.toUpperCase());
          oo.field_c = new qr(0L, DelegatingCanvas.field_f, uq.field_n.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_79_0 = var15;
          stackIn_79_1 = new StringBuilder().append("tb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param2 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param3 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param4 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param5 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param6 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param7 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param12 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_110_2 = "null";
          } else {
            stackIn_110_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        int var1 = -49 % ((-66 - param0) / 53);
    }

    static {
        field_c = "Loading...";
        field_b = "Fleets fleeing combat or collapsing system<br><col=2F5FBF>(Damaged arrowhead)</col>";
    }
}
