/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheEntry extends WeightedCacheEntry {
    static int[][] field_w;
    static gq field_A;
    static Archive field_z;
    static int[] field_x;
    static String field_v;
    private Object field_y;

    final Object e(byte param0) {
        if (param0 >= -106) {
          field_v = (String) null;
        }
        return this.field_y;
    }

    final static boolean f(byte param0) {
        Archive var2;
        boolean stackIn_9_0 = false;
        if (param0 < 111) {
          var2 = (Archive) null;
          StrongCacheEntry.a((byte) -50, (int[]) null, (Archive) null, (IndexedSprite[]) null, (Archive) null);
        }
        stackIn_9_0 = ((IsolationistAi.field_r &&
          MusicCrossfadeStream.field_q) ||
          Dialog.d(true));
        return stackIn_9_0;
    }

    public static void clearStatics(int param0) {
        field_A = null;
        field_z = null;
        if (param0 >= -107) {
          field_w = (int[][]) null;
        }
        field_v = null;
        field_w = (int[][]) null;
        field_x = null;
    }

    final boolean e(boolean param0) {
        if (param0) {
          return false;
        }
        return false;
    }

    final static void a(byte param0, Player[] param1, PacketBuffer param2, int param3, IntrusiveDeque param4, int param5, VictoryChecker param6, Player param7, GalaxyMap param8, boolean param9) {
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Wormhole var12 = null;
        Territory var12_ref = null;
        int var13 = 0;
        lo var13_ref_lo = null;
        int var14 = 0;
        Star var14_ref_ln = null;
        Star var15 = null;
        int var16 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param9) {
            param8.a((byte) -87, param1, param2);
          } else {
            param8.a(param2, param1, 127);
          }
          param8.a(10529, param2, param1);
          var10_int = 0;
          for (var11 = 0; var11 < param1.length; var11++) {
            var10_int = var10_int + param1[var11].field_i.size(0);
          }
          param2.writeByte(var10_int, (byte) -89);
          if (param0 > -57) {
            field_v = (String) null;
          }
          for (var11Lifetime1 = 0; param1.length > var11Lifetime1; var11Lifetime1++) {
            var12_ref = (Territory) (param1[var11Lifetime1].field_i.startForward(0));
            while (var12_ref != null) {
              im.writePlayer(var12_ref.field_o, param2, 9555);
              FleetTrailPoint.writeStar(var12_ref.field_q, false, param2);
              var13 = var12_ref.starCount(89);
              param2.writeByte(var13, (byte) -112);
              var14_ref_ln = var12_ref.firstStar(18229);
              while (var14_ref_ln != null) {
                if (var14_ref_ln != var12_ref.field_q) {
                  FleetTrailPoint.writeStar(var14_ref_ln, false, param2);
                }
                var14_ref_ln = var12_ref.nextStar(-23410);
              }
              var12_ref = (Territory) (param1[var11Lifetime1].field_i.nextForward((byte) -71));
            }
          }
          var11Lifetime2 = 0;
          for (var12_int = 0; param1.length > var12_int; var12_int++) {
            if (param1[var12_int].field_m != null &&
              param1[var12_int].field_m.starCount(-68) > 0) {
              var11Lifetime2++;
            }
          }
          param2.writeByte(var11Lifetime2, (byte) -118);
          for (var12_intLifetime1 = 0; var12_intLifetime1 < param1.length; var12_intLifetime1++) {
            var13_ref_lo = param1[var12_intLifetime1].field_m;
            if (var13_ref_lo != null &&
              var13_ref_lo.starCount(122) > 0) {
              im.writePlayer(param1[var12_intLifetime1], param2, 9555);
              FleetTrailPoint.writeStar(var13_ref_lo.field_q, false, param2);
              var14 = var13_ref_lo.starCount(-127);
              param2.writeByte(var14, (byte) -69);
              var15 = var13_ref_lo.firstStar(18229);
              while (var15 != null) {
                if (var15 != var13_ref_lo.field_q) {
                  FleetTrailPoint.writeStar(var15, false, param2);
                }
                var15 = var13_ref_lo.nextStar(-23410);
              }
            }
          }
          for (var12_intLifetime2 = 0; var12_intLifetime2 < param1.length; var12_intLifetime2++) {
            for (var13Lifetime1 = var12_intLifetime2 + 1; var13Lifetime1 < param1.length; var13Lifetime1++) {
              if (param1[var12_intLifetime2].field_h[var13Lifetime1]) {
                param2.writeByte(param1[var12_intLifetime2].field_f[var13Lifetime1], (byte) -55);
              } else {
                param2.writeByte(127, (byte) -88);
              }
            }
          }
          if (param7 != null) {
            param2.writeByte(param7.field_w, (byte) -127);
          }
          for (var12_intLifetime3 = 0; param1.length > var12_intLifetime3; var12_intLifetime3++) {
            for (var13Lifetime2 = 0; var13Lifetime2 < 4; var13Lifetime2++) {
              param2.writeByte(param1[var12_intLifetime3].field_u[var13Lifetime2], (byte) -94);
            }
          }
          param2.writeByte(param4.size(0), (byte) -67);
          var12 = (Wormhole) (param4.startForward(0));
          while (var12 != null) {
            FleetTrailPoint.writeStar(var12.field_n, false, param2);
            FleetTrailPoint.writeStar(var12.field_k, false, param2);
            param2.writeByte(var12.field_m, (byte) -82);
            var12 = (Wormhole) (param4.nextForward((byte) -71));
          }
          param6.writeScores(-3, param2);
          param2.writeByte(param5, (byte) -125);
          param2.writeByte(param3, (byte) -90);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_63_0 = var10;
          stackIn_63_1 = new StringBuilder().append("m.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param2 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param7 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',');
          if (param8 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param9).append(')').toString());
        }
    }

    StrongCacheEntry(Object param0, int param1) {
        super(param1);
        try {
          this.field_y = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int[] param1, Archive param2, IndexedSprite[] param3, Archive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        AnimatedPanel var8 = null;
        AnimatedPanel var9 = null;
        AnimatedPanel var10 = null;
        AnimatedPanel var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        AnimatedPanel var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var20 = SliderPainter.a("lobby", param4, "crowns", (byte) -118);
          var5 = var20;
          ClientException.field_d = var20.length;
          if (param3 != null) {
            var6 = new IndexedSprite[param3.length + ClientException.field_d];
            for (var7_int = 0; ClientException.field_d > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            var5 = var6;
            for (var7_intLifetime3 = 0; param3.length > var7_intLifetime3; var7_intLifetime3++) {
              var6[var7_intLifetime3 + ClientException.field_d] = param3[var7_intLifetime3];
            }
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; var7_intLifetime1 < ClientException.field_d; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param3 != null) {
            if (param1 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param3.length; var7_intLifetime2++) {
                var6_array[ClientException.field_d + var7_intLifetime2] = param1[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; param3.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[ClientException.field_d + var7_intLifetime2] = param3[var7_intLifetime2].field_c;
              }
            }
          }
          MusicVoiceMixer.field_l = 2;
          GzipInflater.field_i = 11;
          tg.field_a = 4;
          cr.field_c = 15;
          TextLayout.field_b = 2;
          var7 = TextFieldWidget.a(115, "largefont", param4, param2, "lobby");
          ImageProducerRasterBuffer.field_p = TextFieldWidget.a(117, "generalfont", param4, param2, "lobby");
          ul.field_xb = TextFieldWidget.a(123, "chatfont", param4, param2, "lobby");
          var7.a(var5, var24);
          ImageProducerRasterBuffer.field_p.a(var5, var24);
          ul.field_xb.a(var5, var24);
          var8 = new AnimatedPanel(0L, (AnimatedPanel) null);
          var8.field_nb = (BitmapFont) ((Object) var7);
          var8.field_x = 16777215;
          var8.field_Y = cr.field_c;
          var8.field_G = 1;
          var9 = var8;
          var9.field_y = 1;
          var10 = new AnimatedPanel(0L, (AnimatedPanel) null);
          var10.field_x = 16777215;
          var10.field_Y = cr.field_c;
          var10.field_nb = (BitmapFont) ((Object) ImageProducerRasterBuffer.field_p);
          var10.field_G = 1;
          var11 = var10;
          var11.field_y = 1;
          gg.field_d = new AnimatedPanel(0L, var8);
          gg.field_d.field_F = QuickChatCategoryRegistry.a(ae.a(-82, "lobby", param4, "heading"), 123);
          IntrusiveNode.field_a = new AnimatedPanel(0L, (AnimatedPanel) null);
          IntrusiveNode.field_a.field_F = ArchiveSourceManager.a(false, 4210752, false, 120, 8421504, (byte) -63);
          GalaxyMap.field_a = new AnimatedPanel(0L, (AnimatedPanel) null);
          GalaxyMap.field_a.field_F = Wormhole.a(16, 3, 114, 6316128, 6316128, 1);
          MusicCrossfadeStream.field_v = new AnimatedPanel(0L, (AnimatedPanel) null);
          MusicCrossfadeStream.field_v.field_F = QuickChatCategoryRegistry.a(ae.a(-113, "lobby", param4, "popup"), 122);
          var12 = QuickChatCategoryRegistry.a(ae.a(124, "lobby", param4, "popup_mouseover"), 117);
          var13 = ae.a(32, "lobby", param4, "button");
          var14 = QuickChatCategoryRegistry.a(ae.a(-97, "lobby", param4, "tab_active"), 82);
          IntrusiveDequeSequence.field_g = new AnimatedPanel(0L, var8);
          IntrusiveDequeSequence.field_g.field_F = var14;
          po.field_d = new AnimatedPanel(0L, (AnimatedPanel) null);
          po.field_d.field_pb = id.a(2, param4, "lobby", "closebutton");
          po.field_d.field_fb = id.a(2, param4, "lobby", "closebutton_mouseover");
          nl.field_b = new AnimatedPanel(0L, var8);
          nl.field_b.field_F = ArchiveSourceManager.a(true, 2039583, true, 40, 3815994, (byte) -47);
          SliderWidget.field_N = new AnimatedPanel(0L, var10);
          SliderWidget.field_N.field_kb = 2;
          SliderWidget.field_N.field_F = ArchiveSourceManager.a(true, 2039583, false, 30, 3815994, (byte) -111);
          jr.field_h = new AnimatedPanel(0L, var10);
          jr.field_h.field_kb = 2;
          jr.field_h.field_F = ArchiveSourceManager.a(false, 2039583, false, 30, 3815994, (byte) -35);
          QuickChatMenu.field_Cb = new AnimatedPanel(0L, var10);
          QuickChatMenu.field_Cb.field_kb = 2;
          QuickChatMenu.field_Cb.field_F = ArchiveSourceManager.a(false, 2039583, true, 30, 3815994, (byte) -64);
          SpriteState.field_u = new AnimatedPanel(0L, (AnimatedPanel) null);
          SpriteState.field_u.field_x = 13421772;
          SpriteState.field_u.field_Y = cr.field_c;
          SpriteState.field_u.field_G = 1;
          SpriteState.field_u.field_nb = (BitmapFont) ((Object) ImageProducerRasterBuffer.field_p);
          gn.field_w = new AnimatedPanel(0L, SpriteState.field_u);
          gn.field_w.field_ab = 16777215;
          gn.field_w.field_W = 8421504;
          gn.field_w.field_jb = 16777215;
          gn.field_w.field_x = 16764006;
          gn.field_w.field_qb = 16777215;
          var15 = new AnimatedPanel(0L, gn.field_w);
          var15.field_x = 16777215;
          var15.field_Y = cr.field_c;
          var15.field_nb = (BitmapFont) ((Object) var7);
          fg.field_b = new AnimatedPanel(0L, SpriteState.field_u);
          fg.field_b.field_F = ArchiveSourceManager.a(false, 2236962, false, 16, 2236962, (byte) -40);
          fg.field_b.field_kb = 2;
          ObjectList.field_h = new AnimatedPanel(0L, SpriteState.field_u);
          ObjectList.field_h.field_F = ArchiveSourceManager.a(false, 1513239, false, 16, 1513239, (byte) -36);
          ObjectList.field_h.field_kb = 2;
          oj.field_zb = new AnimatedPanel(0L, fg.field_b);
          oj.field_zb.copyFrom(gn.field_w, false);
          ArrayWidgetGroup.field_E = new AnimatedPanel(0L, ObjectList.field_h);
          ArrayWidgetGroup.field_E.copyFrom(gn.field_w, false);
          var16 = ae.a(-82, "lobby", param4, "button_mouseover");
          hd.field_t = new ul(MusicCrossfadeStream.field_v, var12, SpriteState.field_u, gn.field_w, 3, 2, TextLayout.field_b, 3, cr.field_c);
          StandardMapReader.field_h = new AnimatedPanel(0L, gn.field_w);
          StandardMapReader.field_h.field_lb = var16;
          StandardMapReader.field_h.field_T = 1;
          StandardMapReader.field_h.field_t = 1;
          StandardMapReader.field_h.field_V = 1;
          StandardMapReader.field_h.field_J = 1;
          if (param0 >= -25) {
            return;
          }
          StandardMapReader.field_h.field_F = var13;
          StandardMapReader.field_h.field_vb = ae.a(-112, "lobby", param4, "button_mouseheld");
          StandardMapReader.field_h.field_sb = ae.a(62, "lobby", param4, "button_active");
          StandardMapReader.field_h.field_wb = ae.a(-104, "lobby", param4, "button_disabled");
          StandardMapReader.field_h.field_y = 1;
          QuickChatCategoryRegistry.field_h = new AnimatedPanel(0L, gn.field_w);
          QuickChatCategoryRegistry.field_h.field_y = 1;
          QuickChatCategoryRegistry.field_h.field_F = QuickChatCategoryRegistry.a(ae.a(73, "lobby", param4, "tab_inactive"), 127);
          QuickChatCategoryRegistry.field_h.field_lb = QuickChatCategoryRegistry.a(ae.a(100, "lobby", param4, "tab_mouseover"), 85);
          QuickChatCategoryRegistry.field_h.field_sb = var14;
          tm.field_t = new AnimatedPanel(0L, (AnimatedPanel) null);
          tm.field_t.field_F = Wormhole.a(16, 3, 206, 1856141, 1127256, -1);
          rs.field_Eb = new AnimatedPanel(0L, (AnimatedPanel) null);
          rs.field_Eb.field_F = Wormhole.a(16, 3, 290, 11579568, 6052956, -1);
          IsaacBackedRandom.field_a = new AnimatedPanel(0L, var15);
          IsaacBackedRandom.field_a.field_T = 1;
          IsaacBackedRandom.field_a.field_y = 1;
          IsaacBackedRandom.field_a.field_J = 1;
          IsaacBackedRandom.field_a.field_t = 1;
          IsaacBackedRandom.field_a.field_V = 1;
          DelegatingCanvas.field_f = new AnimatedPanel(0L, IsaacBackedRandom.field_a);
          jf.field_b = new AnimatedPanel(0L, gn.field_w);
          jf.field_b.field_V = 1;
          jf.field_b.field_t = 1;
          jf.field_b.field_y = 1;
          jf.field_b.field_T = 1;
          jf.field_b.field_J = 1;
          GameScreen.field_h = new AnimatedPanel(0L, jf.field_b);
          AllianceExpiredEvent.field_l = new AnimatedPanel(0L, jf.field_b);
          bd.field_E = new AnimatedPanel(0L, IsaacBackedRandom.field_a);
          n.field_o = new AnimatedPanel(0L, jf.field_b);
          WeightedCacheEntry.field_o = new AnimatedPanel(0L, jf.field_b);
          an.field_d = new AnimatedPanel(0L, jf.field_b);
          jf.field_b.field_F = QuickChatCategoryRegistry.a(ae.a(106, "lobby", param4, "smallbutton"), 47);
          jf.field_b.field_lb = QuickChatCategoryRegistry.a(ae.a(-79, "lobby", param4, "smallbutton_mouseover"), 103);
          dupTemp$0 = QuickChatCategoryRegistry.a(ae.a(-114, "lobby", param4, "smallbutton_active"), 51);
          jf.field_b.field_sb = dupTemp$0;
          jf.field_b.field_vb = dupTemp$0;
          jf.field_b.field_wb = QuickChatCategoryRegistry.a(ae.a(109, "lobby", param4, "smallbutton_disabled"), 65);
          DelegatingCanvas.field_f.field_F = QuickChatCategoryRegistry.a(ae.a(-99, "lobby", param4, "mediumbutton"), 41);
          DelegatingCanvas.field_f.field_lb = QuickChatCategoryRegistry.a(ae.a(80, "lobby", param4, "mediumbutton_mouseover"), 126);
          DelegatingCanvas.field_f.field_vb = QuickChatCategoryRegistry.a(ae.a(113, "lobby", param4, "mediumbutton_mouseheld"), 95);
          IsaacBackedRandom.field_a.field_F = QuickChatCategoryRegistry.a(ae.a(-121, "lobby", param4, "bigbutton"), 53);
          IsaacBackedRandom.field_a.field_lb = QuickChatCategoryRegistry.a(ae.a(92, "lobby", param4, "bigbutton_mouseover"), 76);
          IsaacBackedRandom.field_a.field_vb = QuickChatCategoryRegistry.a(ae.a(-108, "lobby", param4, "bigbutton_mouseheld"), 127);
          IsaacBackedRandom.field_a.field_wb = QuickChatCategoryRegistry.a(ae.a(-98, "lobby", param4, "bigbutton_disabled"), 122);
          GameScreen.field_h.field_F = QuickChatCategoryRegistry.a(ae.a(-86, "lobby", param4, "greenbutton"), 76);
          GameScreen.field_h.field_lb = QuickChatCategoryRegistry.a(ae.a(-78, "lobby", param4, "greenbutton_mouseover"), 91);
          GameScreen.field_h.field_vb = QuickChatCategoryRegistry.a(ae.a(-98, "lobby", param4, "greenbutton_mouseheld"), 39);
          AllianceExpiredEvent.field_l.field_F = QuickChatCategoryRegistry.a(ae.a(-126, "lobby", param4, "redbutton"), 56);
          AllianceExpiredEvent.field_l.field_lb = QuickChatCategoryRegistry.a(ae.a(120, "lobby", param4, "redbutton_mouseover"), 55);
          AllianceExpiredEvent.field_l.field_vb = QuickChatCategoryRegistry.a(ae.a(126, "lobby", param4, "redbutton_mouseheld"), 103);
          bd.field_E.field_F = QuickChatCategoryRegistry.a(ae.a(-101, "lobby", param4, "backbutton"), 48);
          bd.field_E.field_lb = QuickChatCategoryRegistry.a(ae.a(-103, "lobby", param4, "backbutton_mouseover"), 60);
          bd.field_E.field_vb = QuickChatCategoryRegistry.a(ae.a(-104, "lobby", param4, "backbutton_mouseheld"), 123);
          bd.field_E.field_wb = QuickChatCategoryRegistry.a(ae.a(53, "lobby", param4, "backbutton_disabled"), 40);
          an.field_d.field_F = QuickChatCategoryRegistry.a(ae.a(115, "lobby", param4, "gameoptionbutton"), 57);
          an.field_d.field_lb = QuickChatCategoryRegistry.a(ae.a(54, "lobby", param4, "gameoptionbutton_mouseover"), 117);
          dupTemp$1 = QuickChatCategoryRegistry.a(ae.a(77, "lobby", param4, "gameoptionbutton_active"), 52);
          an.field_d.field_sb = dupTemp$1;
          an.field_d.field_vb = dupTemp$1;
          an.field_d.field_wb = QuickChatCategoryRegistry.a(ae.a(-114, "lobby", param4, "gameoptionbutton_disabled"), 121);
          n.field_o.field_F = QuickChatCategoryRegistry.a(ae.a(-117, "lobby", param4, "chatbutton"), 75);
          n.field_o.field_lb = QuickChatCategoryRegistry.a(ae.a(84, "lobby", param4, "chatbutton_mouseover"), 122);
          dupTemp$2 = QuickChatCategoryRegistry.a(ae.a(124, "lobby", param4, "chatbutton_active"), 53);
          n.field_o.field_sb = dupTemp$2;
          n.field_o.field_vb = dupTemp$2;
          WeightedCacheEntry.field_o.field_F = QuickChatCategoryRegistry.a(ae.a(74, "lobby", param4, "chatfilterbutton"), 104);
          WeightedCacheEntry.field_o.field_lb = QuickChatCategoryRegistry.a(ae.a(-95, "lobby", param4, "chatfilterbutton_mouseover"), 101);
          dupTemp$3 = QuickChatCategoryRegistry.a(ae.a(91, "lobby", param4, "chatfilterbutton_active"), 77);
          WeightedCacheEntry.field_o.field_sb = dupTemp$3;
          WeightedCacheEntry.field_o.field_vb = dupTemp$3;
          var17 = ae.a(-118, "lobby", param4, "checkbox");
          ByteArrayNode.field_i = new rs(0L, var17[1], var17[0], 1, gn.field_w, (String) null);
          sj.field_c = new AnimatedPanel(0L, (AnimatedPanel) null);
          sj.field_c.field_F = cg.a(-15338, id.a(2, param4, "lobby", "slideregion"));
          sj.field_c.field_lb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_mouseover"));
          sj.field_c.field_vb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_mouseheld"));
          sj.field_c.field_wb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_disabled"));
          TextFieldValidator.field_l = new AnimatedPanel(0L, (AnimatedPanel) null);
          TextFieldValidator.field_l.field_F = QuickChatCategoryRegistry.a(ae.a(126, "lobby", param4, "dragbar"), 33);
          TextFieldValidator.field_l.field_lb = QuickChatCategoryRegistry.a(ae.a(-109, "lobby", param4, "dragbar_mouseover"), 118);
          TextFieldValidator.field_l.field_vb = QuickChatCategoryRegistry.a(ae.a(-77, "lobby", param4, "dragbar_mouseheld"), 67);
          TextFieldValidator.field_l.field_wb = QuickChatCategoryRegistry.a(ae.a(57, "lobby", param4, "dragbar_disabled"), 126);
          sk.field_k = new AnimatedPanel(0L, (AnimatedPanel) null);
          sk.field_k.field_pb = id.a(2, param4, "lobby", "upbutton");
          sk.field_k.field_fb = id.a(2, param4, "lobby", "upbutton_mouseover");
          sk.field_k.field_U = id.a(2, param4, "lobby", "upbutton_mouseheld");
          sk.field_k.field_ob = id.a(2, param4, "lobby", "upbutton_disabled");
          BattleEvent.field_u = new AnimatedPanel(0L, (AnimatedPanel) null);
          BattleEvent.field_u.field_pb = id.a(2, param4, "lobby", "downbutton");
          BattleEvent.field_u.field_fb = id.a(2, param4, "lobby", "downbutton_mouseover");
          BattleEvent.field_u.field_U = id.a(2, param4, "lobby", "downbutton_mouseheld");
          BattleEvent.field_u.field_ob = id.a(2, param4, "lobby", "downbutton_disabled");
          AchievementProgress.field_m = new ScrollBar(0L, sk.field_k, BattleEvent.field_u, sj.field_c, TextFieldValidator.field_l);
          ih.field_g = new am(0L, (AnimatedPanel) null, VictoryChecker.field_d, AchievementProgress.field_m, jf.field_b, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("m.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, Sprite[] param5, int param6, int param7, Sprite[] param8, int param9, BitmapFont param10, BitmapFont param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, Sprite[] param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        Sprite[] var22 = null;
        try {
          AgeValidator.a(param2, param16, param9, 0, param12, param13, param20, param7, param6, param0, param4, param10, param17, param3, new v(param8), new v(param19), param18, param11, param14, new v(param5), param15);
          if (param1 != 13421772) {
            var22 = (Sprite[]) null;
            StrongCacheEntry.a(48, 114, -92, -17, -81, (Sprite[]) null, 87, -77, (Sprite[]) null, 10, (BitmapFont) null, (BitmapFont) null, -117, -102, 14, -52, -97, -21, 46, (Sprite[]) null, 33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("m.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param11 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param20).append(')').toString());
        }
    }

    static {
        field_A = new gq(12, 0, 1, 0);
        field_x = new int[128];
        field_v = "PEACE DECLARED!";
    }
}
