/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_b;
    static String field_c;
    static boolean field_e;
    static String field_d;
    static int[] field_h;
    static ResourceArchive field_a;
    static int field_f;
    static String field_g;

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        ResourceArchive var5;
        if (param3 < 0) {
          return false;
        }
        if (param3 > 11) {
          return false;
        }
        if (param2 >= 1 &&
          ArticulatedPart.b(-14487, param3, param0) >= param2) {
          if (!param1) {
            var5 = (ResourceArchive) null;
            oh.a(-54, (int[]) null, (String[]) null, (String[][]) null, (String[]) null, 77, (String[][]) null, -51, (RgbSprite[][]) null, (RgbSprite[][]) null, 31, (String[]) null, (byte[]) null, (byte[]) null, (ResourceArchive) null);
          }
          return true;
        }
        return false;
    }

    final static void a(int param0, int[] param1, String[] param2, String[][] param3, String[] param4, int param5, String[][] param6, int param7, RgbSprite[][] param8, RgbSprite[][] param9, int param10, String[] param11, byte[] param12, byte[] param13, ResourceArchive param14) {
        IconTextComponent[] array$0 = null;
        IconTextComponent[] array$1 = null;
        IconTextComponent[] array$2 = null;
        int var19 = 0;
        SceneWidget stackIn_5_0;
        SceneWidget stackIn_5_1;
        long stackIn_5_2;
        SceneWidget stackIn_5_3;
        SceneWidget stackIn_6_0 = null;
        SceneWidget stackIn_6_1 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        var21 = SteelSentinels.obfuscationControl;
        try {
          LinkButtonPainter.field_h = param3;
          e.field_g = param4;
          PasswordFieldPainter.field_D = param8;
          dc.field_b = param9;
          ok.field_a = param7;
          TickClock.field_a = param2;
          IntrusiveNode.field_b = param11;
          tc.field_z = param0;
          eh.field_e = param12;
          fj.field_b = param6;
          SoundCache.field_f = param13;
          ViewportController.field_l = param1;
          hg.field_i = cf.a("gameprivacy", "lobby", (byte) -19, param14);
          DateInputWidget.field_Q = cf.a("ratedgame", "lobby", (byte) -98, param14);
          jn.field_d = cf.a("opentome", "lobby", (byte) -57, param14);
          AccountMessagePanel.field_Z = cf.a("allowspectators", "lobby", (byte) -51, param14);
          HuffmanDecoder.field_j = new String[5];
          HuffmanDecoder.field_j[3] = GrowableIntList.field_a;
          HuffmanDecoder.field_j[2] = dm.field_d;
          HuffmanDecoder.field_j[4] = fm.field_g;
          HuffmanDecoder.field_j[0] = NameAvailabilityValidator.field_x;
          HuffmanDecoder.field_j[1] = DateOfBirthValidator.field_l;
          TeamColourTinter.field_c = new SceneWidget(0L, (SceneWidget) null);
          PacketBuffer.field_o = new SceneWidget(0L, MusicCrossfadeStream.field_J, uj.field_g);
          uj.field_j = new SceneWidget((long)param5, kb.field_b, sf.field_l);
          TabbedPanel.field_Sb = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), IntKeyLookup.field_h, NodeHashTable.field_j);
          TeamColourTinter.field_c.a(PacketBuffer.field_o, 119);
          if (MenuInputState.field_p) {
            TeamColourTinter.field_c.a(uj.field_j, 122);
          }
          TeamColourTinter.field_c.a(TabbedPanel.field_Sb, 123);
          TabbedPanel.field_Sb.field_Tb.b(bd.field_f, 6402);
          TabbedPanel.field_Sb.field_Tb.field_Fb = 1;
          var23 = TabbedPanel.field_Sb.field_Tb;
          var24 = var23;
          var24.field_Kb = 1;
          Explosion.field_C = new SceneWidget(0L, bd.field_f);
          Explosion.field_C.field_Kb = 1;
          BufferedSocket.field_i = new SceneWidget(0L, gm.field_c, NodeIterator.field_i.toUpperCase());
          qi.field_c = new SceneWidget(0L, ParticleEffect.field_E, ProxySocketConnector.field_q.toUpperCase());
          IterableNodeHashTable.field_d = new SceneWidget(0L, ce.field_o);
          ReportAbuseDialog.field_bc = new SceneWidget(0L, MusicCrossfadeStream.field_J, cf.field_p);
          dj.field_d = new SceneWidget(0L, im.field_f, field_c);
          BattleTerrain.field_q = new SceneWidget(0L, im.field_f, vf.field_f);
          pe.field_v = new SceneWidget(0L, im.field_f, NameSuggestionsPanel.field_Q);
          SocialListPanel.field_Vb = new SceneWidget(0L, im.field_f, StrongCacheEntry.field_B);
          cf.field_w = new SceneWidget(0L, kb.field_b, LoginDialog.field_Bb);
          rn.field_y = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), IntKeyLookup.field_h, NodeHashTable.field_j);
          qm.field_b = new SceneWidget(0L, MenuInputState.field_j, fc.field_f.toUpperCase());
          qm.field_b.field_T = MenuInputState.field_p;
          stackIn_5_0 = null;
          stackIn_5_1 = null;
          stackIn_5_2 = 0L;
          stackIn_5_3 = MenuInputState.field_j;
          if (MenuInputState.field_p) {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = IterableNodeHashTable.field_c;
          } else {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = DelayedServerPacket.field_C;
          }
          uc.field_j = new SceneWidget(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_6_4).toUpperCase());
          pc.field_q = new SceneWidget(0L, (SceneWidget) null);
          pc.field_q.a(qi.field_c, 118);
          pc.field_q.a(IterableNodeHashTable.field_d, 119);
          IterableNodeHashTable.field_d.a(ReportAbuseDialog.field_bc, 120);
          IterableNodeHashTable.field_d.a(dj.field_d, param5 ^ 124);
          IterableNodeHashTable.field_d.a(BattleTerrain.field_q, param5 ^ 120);
          if (MenuInputState.field_p) {
            IterableNodeHashTable.field_d.a(pe.field_v, 120);
          }
          IterableNodeHashTable.field_d.a(SocialListPanel.field_Vb, 126);
          IterableNodeHashTable.field_d.a(cf.field_w, 121);
          IterableNodeHashTable.field_d.a(rn.field_y, param5 + 124);
          if (MenuInputState.field_p) {
            pc.field_q.a(qm.field_b, 122);
          }
          pc.field_q.a(uc.field_j, param5 + 121);
          MusicCrossfadeStream.field_z = new SceneWidget(0L, bd.field_f);
          MusicCrossfadeStream.field_z.field_Kb = 1;
          MusicCrossfadeStream.field_z.field_Fb = 0;
          LoginForm.field_gb = new SceneWidget(0L, DialWidgetPainter.field_e, Sentinel.field_D.toUpperCase());
          TeamColourTinter.field_b = new SceneWidget(0L, AudioService.field_a);
          TeamColourTinter.field_b.a(MusicCrossfadeStream.field_z, 122);
          TeamColourTinter.field_b.a(LoginForm.field_gb, 122);
          Projectile.field_J = new SceneWidget(0L, IntKeyLookup.field_h);
          Projectile.field_J.b(bd.field_f, param5 ^ 6402);
          var16 = Projectile.field_J;
          Projectile.field_J.field_Fb = 1;
          var16.field_Kb = 1;
          HuffmanDecoder.field_i = new SceneWidget(0L, (SceneWidget) null);
          uj.field_e = new SceneWidget(0L, bd.field_f);
          uj.field_e.field_Kb = 1;
          NanoTickClock.field_u = new SceneWidget(0L, MusicCrossfadeStream.field_J, uj.field_g);
          NameAvailabilityValidator.field_p = new SceneWidget(0L, kb.field_b, sf.field_l);
          NanoTickClock.field_t = new ScrollContainer(0L, new SceneWidget(0L, (SceneWidget) null), IntKeyLookup.field_h, NodeHashTable.field_j);
          HuffmanDecoder.field_i.a(uj.field_e, 120);
          HuffmanDecoder.field_i.a(NanoTickClock.field_u, 127);
          if (MenuInputState.field_p) {
            HuffmanDecoder.field_i.a(NameAvailabilityValidator.field_p, param5 + 118);
          }
          HuffmanDecoder.field_i.a(NanoTickClock.field_t, 124);
          QuickChatCategory.field_E = new SceneWidget(0L, gm.field_c, bi.field_c.toUpperCase());
          EmailAvailabilityValidator.field_q = new SceneWidget(0L, ParticleEffect.field_E);
          Js5NetworkRequest.field_L = new SceneWidget(0L, ce.field_o);
          MusicPatchEnvelope.field_d = new SceneWidget(0L, c.field_p, ak.field_b.toUpperCase());
          un.field_h = new IconTextComponent[4 + param10][];
          sl.field_k = new SceneWidget[4 + param10];
          sl.field_k[0] = new SceneWidget(0L, dj.field_b, tm.field_c);
          un.field_h[0] = new IconTextComponent[6];
          for (var17_int = 0; 5 > var17_int; var17_int++) {
            un.field_h[0][var17_int + 1] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, hg.field_i[var17_int], HuffmanDecoder.field_j[var17_int]);
          }
          if (ViewportController.field_l.length >= 2) {
            sl.field_k[1] = new SceneWidget(0L, dj.field_b, rb.field_d);
            array$0 = new IconTextComponent[ViewportController.field_l.length + 1];
            un.field_h[1] = array$0;
            un.field_h[1][0] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e);
            for (var17_intLifetime1 = 0; ViewportController.field_l.length > var17_intLifetime1; var17_intLifetime1++) {
              un.field_h[1][1 + var17_intLifetime1] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, Integer.toString(ViewportController.field_l[var17_intLifetime1]));
            }
          }
          sl.field_k[2] = new SceneWidget(0L, dj.field_b, SteelSentinels.field_H);
          un.field_h[2] = new IconTextComponent[]{new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e), new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, AccountMessagePanel.field_Z[0], IconLabelControl.field_Sb), new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, AccountMessagePanel.field_Z[1], HuffmanDecoder.field_g)};
          if (tc.field_z > 1) {
            sl.field_k[3] = new SceneWidget(0L, dj.field_b, pc.field_o);
            array$1 = new IconTextComponent[1 + tc.field_z];
            un.field_h[3] = array$1;
            un.field_h[3][0] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e);
            for (var17_intLifetime2 = 0; tc.field_z > var17_intLifetime2; var17_intLifetime2++) {
              un.field_h[3][var17_intLifetime2 + 1] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, IntrusiveNode.field_b[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param10 > var17_intLifetime3; var17_intLifetime3++) {
            sl.field_k[var17_intLifetime3 + 4] = new SceneWidget(0L, dj.field_b, TickClock.field_a[var17_intLifetime3]);
            array$2 = new IconTextComponent[ec.a((int) SoundCache.field_f[var17_intLifetime3], 255) + 1];
            un.field_h[var17_intLifetime3 + 4] = array$2;
            un.field_h[4 + var17_intLifetime3][0] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) null, DiskCacheWorker.field_e);
            for (var18 = 0; (255 & SoundCache.field_f[var17_intLifetime3]) > var18; var18++) {
              if (null != dc.field_b) {
                if (dc.field_b[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = dc.field_b[var17_intLifetime3][var18];
                }
              } else {
                var19_ref = null;
              }
              if (LinkButtonPainter.field_h == null) {
                var20 = null;
              } else {
                if (null == LinkButtonPainter.field_h[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = LinkButtonPainter.field_h[var17_intLifetime3][var18];
                }
              }
              un.field_h[4 + var17_intLifetime3][1 + var18] = new IconTextComponent(0L, LoginDialog.field_Ab, (SceneWidget) null, ParticleEffect.field_K, (RgbSprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; param10 + 4 > var17_intLifetime4; var17_intLifetime4++) {
            if (sl.field_k[var17_intLifetime4] != null) {
              sl.field_k[var17_intLifetime4].field_Ib = 11;
            }
            if (null != un.field_h[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < un.field_h[var17_intLifetime4].length; var18Lifetime1++) {
                if (un.field_h[var17_intLifetime4][var18Lifetime1] != null &&
                  un.field_h[var17_intLifetime4][var18Lifetime1].field_Tb != null) {
                  un.field_h[var17_intLifetime4][var18Lifetime1].field_Tb.field_Ib = 11;
                }
              }
            }
          }
          rn.field_C = new SceneWidget(0L, MenuInputState.field_j);
          BoundedUrlRequest.field_q = new SceneWidget(0L, MenuInputState.field_j);
          rh.field_w = new SceneWidget(0L, SceneWidget.field_ib);
          rh.field_w.b(bd.field_f, 6402);
          var17 = rh.field_w;
          rh.field_w.field_Fb = 1;
          var17.field_Kb = 1;
          NanoTickClock.field_y = new SceneWidget(0L, (SceneWidget) null);
          NanoTickClock.field_y.a(EmailAvailabilityValidator.field_q, 127);
          NanoTickClock.field_y.a(Js5NetworkRequest.field_L, 125);
          Js5NetworkRequest.field_L.a(MusicPatchEnvelope.field_d, 118);
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param10; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(2 > ViewportController.field_l.length)) && (3 != var18Lifetime2 ||
              !(tc.field_z <= 1))) {
              Js5NetworkRequest.field_L.a(sl.field_k[var18Lifetime2], 122);
              for (var19 = 0; un.field_h[var18Lifetime2].length > var19; var19++) {
                if (null != un.field_h[var18Lifetime2][var19]) {
                  Js5NetworkRequest.field_L.a(un.field_h[var18Lifetime2][var19], 122);
                }
              }
            }
          }
          NanoTickClock.field_y.a(rn.field_C, 123);
          NanoTickClock.field_y.a(BoundedUrlRequest.field_q, 120);
          NanoTickClock.field_y.a(rh.field_w, 120);
          tf.field_a = new SceneWidget(0L, ClientException.field_g, RasterBuffer.field_j.toUpperCase());
          Js5ArchiveManager.field_i = new SceneWidget(0L, DialWidgetPainter.field_e, NodeHashTable.field_f.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_73_0 = var15;
          stackIn_73_1 = new StringBuilder().append("oh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param4 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param9 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param12 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param13 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param14 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11, int param12, int param13) {
        UiTheme.field_i = null;
        GameplayController.b((byte) 108);
        param10 = NodeDeque.a(11, param1, param12, param6, param10, param3, param4);
        DropTargetWidget.a(param10, param1, param7, param0, param13, param2, param8, (byte) -6, param11, param9);
        if (param5 > -121) {
          java.applet.Applet var15 = (java.applet.Applet) null;
          oh.a((java.applet.Applet) null, (byte) -9);
        }
        PartInstruction.a(param7, (byte) 70, param11);
        SingleChildContainer.a(-1, param10, param6, param7);
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 1) {
          ResourceArchive var2 = (ResourceArchive) null;
          oh.a((int[]) null, false, (ResourceArchive) null, (IndexedSprite[]) null, (ResourceArchive) null);
        }
    }

    final static void a(int[] param0, boolean param1, ResourceArchive param2, IndexedSprite[] param3, ResourceArchive param4) {
        RgbSprite[] dupTemp$0 = null;
        RgbSprite[] dupTemp$1 = null;
        RgbSprite[] dupTemp$2 = null;
        RgbSprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        SceneWidget var10 = null;
        SceneWidget var11 = null;
        RgbSprite[] var12 = null;
        RgbSprite[] var13 = null;
        RgbSprite[] var14 = null;
        SceneWidget var15 = null;
        RgbSprite[] var16 = null;
        RgbSprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = SteelSentinels.obfuscationControl;
        try {
          var20 = cj.a(-115, "lobby", param2, "crowns");
          var5 = var20;
          uc.field_l = var20.length;
          if (param3 != null) {
            var6 = new IndexedSprite[param3.length + uc.field_l];
            for (var7_int = 0; var7_int < uc.field_l; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; param3.length > var7_intLifetime3; var7_intLifetime3++) {
              var6[uc.field_l + var7_intLifetime3] = param3[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; uc.field_l > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param3 != null) {
            if (param0 != null) {
              for (var7_intLifetime2 = 0; param3.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + uc.field_l] = param0[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; param3.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[uc.field_l + var7_intLifetime2] = param3[var7_intLifetime2].field_d;
              }
            }
          }
          te.field_b = 2;
          SocketConnector.field_b = 15;
          va.field_e = 2;
          TextLayout.field_g = 4;
          km.field_g = 11;
          var7 = vd.a(param4, "lobby", param2, -1, "largefont");
          ContentTransitionDialog.field_kb = vd.a(param4, "lobby", param2, -1, "generalfont");
          Bzip2State.field_d = vd.a(param4, "lobby", param2, -1, "chatfont");
          var7.a(var5, var24);
          ContentTransitionDialog.field_kb.a(var5, var24);
          Bzip2State.field_d.a(var5, var24);
          var8 = new SceneWidget(0L, (SceneWidget) null);
          var8.field_Ib = SocketConnector.field_b;
          var8.field_nb = 16777215;
          var8.field_L = (BitmapFont) ((Object) var7);
          var9 = var8;
          var8.field_Fb = 1;
          var9.field_Kb = 1;
          var10 = new SceneWidget(0L, (SceneWidget) null);
          var10.field_Ib = SocketConnector.field_b;
          var10.field_nb = 16777215;
          var10.field_L = (BitmapFont) ((Object) ContentTransitionDialog.field_kb);
          var10.field_Fb = 1;
          var11 = var10;
          var11.field_Kb = 1;
          ParticleEffect.field_E = new SceneWidget(0L, var8);
          ParticleEffect.field_E.field_I = NameAvailabilityValidator.a(0, cf.a("heading", "lobby", (byte) -30, param2));
          CipherPacketBuffer.field_H = new SceneWidget(0L, (SceneWidget) null);
          CipherPacketBuffer.field_H.field_I = DialWidget.a(param1, 8421504, false, -22, 120, 4210752);
          WeightedLruCache.field_n = new SceneWidget(0L, (SceneWidget) null);
          WeightedLruCache.field_n.field_I = se.a(3, 1, 6316128, 114, 6316128, 13574);
          kf.field_y = new SceneWidget(0L, (SceneWidget) null);
          kf.field_y.field_I = NameAvailabilityValidator.a(0, cf.a("popup", "lobby", (byte) -94, param2));
          var12 = NameAvailabilityValidator.a(0, cf.a("popup_mouseover", "lobby", (byte) -110, param2));
          var13 = cf.a("button", "lobby", (byte) -97, param2);
          var14 = NameAvailabilityValidator.a(0, cf.a("tab_active", "lobby", (byte) -125, param2));
          ClientException.field_g = new SceneWidget(0L, var8);
          ClientException.field_g.field_I = var14;
          hg.field_e = new SceneWidget(0L, (SceneWidget) null);
          hg.field_e.field_Pb = rl.a(param2, "lobby", "closebutton", false);
          hg.field_e.field_db = rl.a(param2, "lobby", "closebutton_mouseover", param1);
          c.field_p = new SceneWidget(0L, var8);
          c.field_p.field_I = DialWidget.a(true, 3815994, true, -100, 40, 2039583);
          MusicCrossfadeStream.field_J = new SceneWidget(0L, var10);
          MusicCrossfadeStream.field_J.field_ub = 2;
          MusicCrossfadeStream.field_J.field_I = DialWidget.a(true, 3815994, false, -15, 30, 2039583);
          im.field_f = new SceneWidget(0L, var10);
          im.field_f.field_ub = 2;
          im.field_f.field_I = DialWidget.a(false, 3815994, false, -52, 30, 2039583);
          kb.field_b = new SceneWidget(0L, var10);
          kb.field_b.field_ub = 2;
          kb.field_b.field_I = DialWidget.a(false, 3815994, true, -47, 30, 2039583);
          bd.field_f = new SceneWidget(0L, (SceneWidget) null);
          bd.field_f.field_L = (BitmapFont) ((Object) ContentTransitionDialog.field_kb);
          bd.field_f.field_nb = 13421772;
          bd.field_f.field_Fb = 1;
          bd.field_f.field_Ib = SocketConnector.field_b;
          ParticleEffect.field_K = new SceneWidget(0L, bd.field_f);
          ParticleEffect.field_K.field_xb = 16777215;
          ParticleEffect.field_K.field_Mb = 16777215;
          ParticleEffect.field_K.field_nb = 16764006;
          ParticleEffect.field_K.field_rb = 16777215;
          ParticleEffect.field_K.field_yb = 8421504;
          var15 = new SceneWidget(0L, ParticleEffect.field_K);
          var15.field_Ib = SocketConnector.field_b;
          var15.field_L = (BitmapFont) ((Object) var7);
          var15.field_nb = 16777215;
          SceneWidget.field_ib = new SceneWidget(0L, bd.field_f);
          SceneWidget.field_ib.field_I = DialWidget.a(false, 2236962, false, -54, 16, 2236962);
          SceneWidget.field_ib.field_ub = 2;
          dj.field_b = new SceneWidget(0L, bd.field_f);
          dj.field_b.field_I = DialWidget.a(false, 1513239, false, -75, 16, 1513239);
          dj.field_b.field_ub = 2;
          SteelSentinels.field_J = new SceneWidget(0L, SceneWidget.field_ib);
          SteelSentinels.field_J.b(ParticleEffect.field_K, 6402);
          ModalPanel.field_W = new SceneWidget(0L, dj.field_b);
          ModalPanel.field_W.b(ParticleEffect.field_K, 6402);
          var16 = cf.a("button_mouseover", "lobby", (byte) -114, param2);
          jn.field_h = new dn(kf.field_y, var12, bd.field_f, ParticleEffect.field_K, 3, 2, va.field_e, 3, SocketConnector.field_b);
          TeamColourTinter.field_e = new SceneWidget(0L, ParticleEffect.field_K);
          TeamColourTinter.field_e.field_I = var13;
          TeamColourTinter.field_e.field_Qb = 1;
          TeamColourTinter.field_e.field_Z = 1;
          TeamColourTinter.field_e.field_ob = 1;
          TeamColourTinter.field_e.field_Ab = var16;
          TeamColourTinter.field_e.field_ab = 1;
          TeamColourTinter.field_e.field_mb = cf.a("button_mouseheld", "lobby", (byte) -51, param2);
          TeamColourTinter.field_e.field_bb = cf.a("button_active", "lobby", (byte) -107, param2);
          TeamColourTinter.field_e.field_H = cf.a("button_disabled", "lobby", (byte) -104, param2);
          TeamColourTinter.field_e.field_Kb = 1;
          ModalStack.field_U = new SceneWidget(0L, ParticleEffect.field_K);
          ModalStack.field_U.field_Kb = 1;
          ModalStack.field_U.field_I = NameAvailabilityValidator.a(0, cf.a("tab_inactive", "lobby", (byte) -115, param2));
          ModalStack.field_U.field_Ab = NameAvailabilityValidator.a(0, cf.a("tab_mouseover", "lobby", (byte) -29, param2));
          ModalStack.field_U.field_bb = var14;
          be.field_c = new SceneWidget(0L, (SceneWidget) null);
          be.field_c.field_I = se.a(3, -1, 1856141, 206, 1127256, 13574);
          ce.field_o = new SceneWidget(0L, (SceneWidget) null);
          ce.field_o.field_I = se.a(3, -1, 11579568, 290, 6052956, 13574);
          MenuInputState.field_j = new SceneWidget(0L, var15);
          MenuInputState.field_j.field_Kb = 1;
          MenuInputState.field_j.field_Qb = 1;
          MenuInputState.field_j.field_Z = 1;
          MenuInputState.field_j.field_ab = 1;
          MenuInputState.field_j.field_ob = 1;
          DialWidgetPainter.field_e = new SceneWidget(0L, MenuInputState.field_j);
          ContentTransitionDialog.field_wb = new SceneWidget(0L, ParticleEffect.field_K);
          ContentTransitionDialog.field_wb.field_Z = 1;
          ContentTransitionDialog.field_wb.field_Kb = 1;
          ContentTransitionDialog.field_wb.field_ob = 1;
          ContentTransitionDialog.field_wb.field_Qb = 1;
          ContentTransitionDialog.field_wb.field_ab = 1;
          ArchiveProvider.field_f = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          QuickChatCategoryCache.field_c = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          gm.field_c = new SceneWidget(0L, MenuInputState.field_j);
          NameAvailabilityValidator.field_o = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          ArchiveIndex.field_s = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          LoginDialog.field_Ab = new SceneWidget(0L, ContentTransitionDialog.field_wb);
          ContentTransitionDialog.field_wb.field_I = NameAvailabilityValidator.a(0, cf.a("smallbutton", "lobby", (byte) -39, param2));
          ContentTransitionDialog.field_wb.field_Ab = NameAvailabilityValidator.a(0, cf.a("smallbutton_mouseover", "lobby", (byte) -72, param2));
          dupTemp$0 = NameAvailabilityValidator.a(0, cf.a("smallbutton_active", "lobby", (byte) -79, param2));
          ContentTransitionDialog.field_wb.field_bb = dupTemp$0;
          ContentTransitionDialog.field_wb.field_mb = dupTemp$0;
          ContentTransitionDialog.field_wb.field_H = NameAvailabilityValidator.a(0, cf.a("smallbutton_disabled", "lobby", (byte) -95, param2));
          DialWidgetPainter.field_e.field_I = NameAvailabilityValidator.a(0, cf.a("mediumbutton", "lobby", (byte) -84, param2));
          DialWidgetPainter.field_e.field_Ab = NameAvailabilityValidator.a(0, cf.a("mediumbutton_mouseover", "lobby", (byte) -30, param2));
          DialWidgetPainter.field_e.field_mb = NameAvailabilityValidator.a(0, cf.a("mediumbutton_mouseheld", "lobby", (byte) -92, param2));
          MenuInputState.field_j.field_I = NameAvailabilityValidator.a(0, cf.a("bigbutton", "lobby", (byte) -68, param2));
          MenuInputState.field_j.field_Ab = NameAvailabilityValidator.a(0, cf.a("bigbutton_mouseover", "lobby", (byte) -23, param2));
          MenuInputState.field_j.field_mb = NameAvailabilityValidator.a(0, cf.a("bigbutton_mouseheld", "lobby", (byte) -66, param2));
          MenuInputState.field_j.field_H = NameAvailabilityValidator.a(0, cf.a("bigbutton_disabled", "lobby", (byte) -71, param2));
          ArchiveProvider.field_f.field_I = NameAvailabilityValidator.a(0, cf.a("greenbutton", "lobby", (byte) -84, param2));
          ArchiveProvider.field_f.field_Ab = NameAvailabilityValidator.a(0, cf.a("greenbutton_mouseover", "lobby", (byte) -50, param2));
          ArchiveProvider.field_f.field_mb = NameAvailabilityValidator.a(0, cf.a("greenbutton_mouseheld", "lobby", (byte) -68, param2));
          QuickChatCategoryCache.field_c.field_I = NameAvailabilityValidator.a(0, cf.a("redbutton", "lobby", (byte) -105, param2));
          QuickChatCategoryCache.field_c.field_Ab = NameAvailabilityValidator.a(0, cf.a("redbutton_mouseover", "lobby", (byte) -24, param2));
          QuickChatCategoryCache.field_c.field_mb = NameAvailabilityValidator.a(0, cf.a("redbutton_mouseheld", "lobby", (byte) -99, param2));
          gm.field_c.field_I = NameAvailabilityValidator.a(0, cf.a("backbutton", "lobby", (byte) -109, param2));
          gm.field_c.field_Ab = NameAvailabilityValidator.a(0, cf.a("backbutton_mouseover", "lobby", (byte) -31, param2));
          gm.field_c.field_mb = NameAvailabilityValidator.a(0, cf.a("backbutton_mouseheld", "lobby", (byte) -62, param2));
          gm.field_c.field_H = NameAvailabilityValidator.a(0, cf.a("backbutton_disabled", "lobby", (byte) -53, param2));
          LoginDialog.field_Ab.field_I = NameAvailabilityValidator.a(0, cf.a("gameoptionbutton", "lobby", (byte) -58, param2));
          LoginDialog.field_Ab.field_Ab = NameAvailabilityValidator.a(0, cf.a("gameoptionbutton_mouseover", "lobby", (byte) -53, param2));
          dupTemp$1 = NameAvailabilityValidator.a(0, cf.a("gameoptionbutton_active", "lobby", (byte) -52, param2));
          LoginDialog.field_Ab.field_bb = dupTemp$1;
          LoginDialog.field_Ab.field_mb = dupTemp$1;
          LoginDialog.field_Ab.field_H = NameAvailabilityValidator.a(0, cf.a("gameoptionbutton_disabled", "lobby", (byte) -127, param2));
          NameAvailabilityValidator.field_o.field_I = NameAvailabilityValidator.a(0, cf.a("chatbutton", "lobby", (byte) -110, param2));
          NameAvailabilityValidator.field_o.field_Ab = NameAvailabilityValidator.a(0, cf.a("chatbutton_mouseover", "lobby", (byte) -42, param2));
          dupTemp$2 = NameAvailabilityValidator.a(0, cf.a("chatbutton_active", "lobby", (byte) -107, param2));
          NameAvailabilityValidator.field_o.field_bb = dupTemp$2;
          NameAvailabilityValidator.field_o.field_mb = dupTemp$2;
          ArchiveIndex.field_s.field_I = NameAvailabilityValidator.a(0, cf.a("chatfilterbutton", "lobby", (byte) -101, param2));
          ArchiveIndex.field_s.field_Ab = NameAvailabilityValidator.a(0, cf.a("chatfilterbutton_mouseover", "lobby", (byte) -61, param2));
          dupTemp$3 = NameAvailabilityValidator.a(0, cf.a("chatfilterbutton_active", "lobby", (byte) -64, param2));
          ArchiveIndex.field_s.field_bb = dupTemp$3;
          ArchiveIndex.field_s.field_mb = dupTemp$3;
          var17 = cf.a("checkbox", "lobby", (byte) -92, param2);
          QuickChatHelpDialog.field_Tb = new IconLabelControl(0L, var17[1], var17[0], 1, ParticleEffect.field_K, (String) null);
          HuffmanDecoder.field_d = new SceneWidget(0L, (SceneWidget) null);
          HuffmanDecoder.field_d.field_I = MusicPatchNode.a((byte) 26, rl.a(param2, "lobby", "slideregion", param1));
          HuffmanDecoder.field_d.field_Ab = MusicPatchNode.a((byte) 26, rl.a(param2, "lobby", "slideregion_mouseover", false));
          HuffmanDecoder.field_d.field_mb = MusicPatchNode.a((byte) 26, rl.a(param2, "lobby", "slideregion_mouseheld", false));
          HuffmanDecoder.field_d.field_H = MusicPatchNode.a((byte) 26, rl.a(param2, "lobby", "slideregion_disabled", false));
          TabbedPanel.field_Zb = new SceneWidget(0L, (SceneWidget) null);
          TabbedPanel.field_Zb.field_I = NameAvailabilityValidator.a(0, cf.a("dragbar", "lobby", (byte) -108, param2));
          TabbedPanel.field_Zb.field_Ab = NameAvailabilityValidator.a(0, cf.a("dragbar_mouseover", "lobby", (byte) -126, param2));
          TabbedPanel.field_Zb.field_mb = NameAvailabilityValidator.a(0, cf.a("dragbar_mouseheld", "lobby", (byte) -78, param2));
          TabbedPanel.field_Zb.field_H = NameAvailabilityValidator.a(0, cf.a("dragbar_disabled", "lobby", (byte) -14, param2));
          ue.field_f = new SceneWidget(0L, (SceneWidget) null);
          ue.field_f.field_Pb = rl.a(param2, "lobby", "upbutton", param1);
          ue.field_f.field_db = rl.a(param2, "lobby", "upbutton_mouseover", false);
          ue.field_f.field_fb = rl.a(param2, "lobby", "upbutton_mouseheld", false);
          ue.field_f.field_Ob = rl.a(param2, "lobby", "upbutton_disabled", false);
          ResourceArchive.field_h = new SceneWidget(0L, (SceneWidget) null);
          ResourceArchive.field_h.field_Pb = rl.a(param2, "lobby", "downbutton", param1);
          ResourceArchive.field_h.field_db = rl.a(param2, "lobby", "downbutton_mouseover", false);
          ResourceArchive.field_h.field_fb = rl.a(param2, "lobby", "downbutton_mouseheld", false);
          ResourceArchive.field_h.field_Ob = rl.a(param2, "lobby", "downbutton_disabled", false);
          NodeHashTable.field_j = new VerticalScrollbar(0L, ue.field_f, ResourceArchive.field_h, HuffmanDecoder.field_d, TabbedPanel.field_Zb);
          NodeHashTableIterator.field_e = new SocialListPanel(0L, (SceneWidget) null, IntKeyLookup.field_h, NodeHashTable.field_j, ContentTransitionDialog.field_wb, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("oh.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = DirectByteStorage.a(0, var4, param0).getFile();
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"home", var3 + "home.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"gamelist", var3 + "togamelist.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              if (param1 <= 115) {
                field_a = (ResourceArchive) null;
              }
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"options", var3 + "options.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"terms", var3 + "terms.ws"});
              JavaScriptBridge.callWindowFunctionWithArguments("updatelinks", (byte) -41, param0, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("oh.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = new int[]{92, 106, 48, 24, 24, 24, 95, 24, 24, 24, 24, 93, 37, 37, 37, 52, 9, 14, 27, 20, 34, 4, -1, -1};
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_d = "Buying or selling an account";
        field_c = "Owner";
        field_g = "Please check if address is correct";
        field_f = 0;
    }
}
