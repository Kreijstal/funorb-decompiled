/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static AnimatedPanel field_a;
    static int field_e;
    static String field_d;
    static String field_b;
    static String field_g;
    static String field_f;
    static String field_c;

    final static void a(Archive param0, java.applet.Applet param1, Archive param2, Archive param3, Archive param4, Archive param5, byte param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9_int = 0;
        Sprite var19 = null;
        Sprite var20 = null;
        Sprite[] var9 = null;
        Sprite[] var21 = null;
        Sprite[] var22 = null;
        Sprite var23_ref = null;
        Sprite var24_ref = null;
        Sprite var25_ref = null;
        Sprite var26_ref = null;
        Sprite var27 = null;
        Sprite var28 = null;
        Sprite var29 = null;
        String var13 = null;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var13_int = 0;
        int var15_int = 0;
        Sprite var15 = null;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        Object var26 = null;
        int var18 = ShatteredPlansClient.field_F ? 1 : 0;
        Sprite var15Lifetime1;
        Sprite var15Lifetime2;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var13_intLifetime3;
        int var13_intLifetime4;
        int var13_intLifetime5;
        int var13_intLifetime6;
        int var13_intLifetime7;
        int var15_intLifetime1;
        int var15_intLifetime2;
        try {
          mp.field_b = ri.a("font", "", param0, param4, (byte) 89);
          rs.field_Cb = ri.a("smallfont", "", param0, param4, (byte) 111);
          SecondaryNodeHashTable.field_f = MessageKind.a(true, param0, "", "logo");
          var7_int = 3 * SecondaryNodeHashTable.field_f.field_o / 4;
          var8 = SecondaryNodeHashTable.field_f.field_p * 3 / 4;
          RandomAccessCacheFile.a(-110);
          jf.field_a = new Sprite(var7_int, var8);
          jf.field_a.bindAsRenderTarget();
          SoftwareRasterizer.fillRect(0, 0, var7_int, var8, 16777215);
          SecondaryNodeHashTable.field_f.drawSilhouette(0, 0, 0);
          SoftwareRasterizer.b(3, 3, 0, 0, var7_int, var8);
          SecondaryNodeHashTable.field_f.drawSilhouette(0, 0, 255);
          cg.i(param6 + 8);
          HuffmanCodec.field_d = ae.a(101, "", param0, "edge_orbs");
          IsaacRandom.field_b = new Sprite[4];
          RandomAccessCacheFile.a(param6 ^ 108);
          for (var9_int = 0; 4 > var9_int; var9_int++) {
            var19 = HuffmanCodec.field_d[var9_int];
            var20 = new Sprite(var19.field_z + 32, 32 + var19.field_w);
            var20.bindAsRenderTarget();
            var19.drawSilhouette(16 - var19.field_t, 16 - var19.field_x, 16777215);
            SoftwareRasterizer.b(8, 8, 0, 0, var20.field_z, var20.field_w);
            var19.drawSilhouette(16 - var19.field_t, 16 - var19.field_x, 0);
            IsaacRandom.field_b[var9_int] = var20;
          }
          cg.i(0);
          IntList.field_c = MessageKind.a(true, param0, "", "menu_hex");
          jm.field_r = id.a(2, param0, "", "instr_mainview");
          NodeSequence.field_d = id.a(param6 ^ -6, param0, "", "instr_starframe");
          ae.a(-100, "", param0, "zoomicons");
          var9 = va.a("hud_icons", 0, "", param0);
          TurnEventLog.field_d = var9[3];
          MusicCrossfadeStream.field_F = var9[2];
          HuffmanCodec.field_e = var9[0];
          wl.field_d = var9[4];
          tm.field_r = var9[1];
          var21 = va.a("hud_icons_red", param6 + 8, "", param0);
          bd.field_D = var21[0];
          Wormhole.field_h = var21[3];
          DiskArchiveRequest.field_x = var21[2];
          je.field_b = var21[1];
          StarAbandonedEvent.field_k = var21[4];
          var22 = va.a("hud_icons_nobase", 0, "", param0);
          NodeHashTableIterator.field_b = var22[0];
          je.field_f = var22[4];
          us.field_a = var22[3];
          GameKeyHandler.field_b = var22[1];
          ArchiveIndex.field_p = var22[2];
          Player.field_a = va.a("icon_circles", param6 + 8, "", param0);
          ObjectList.field_d = va.a("production_icons", 0, "", param0);
          aq.field_i = MessageKind.a(true, param0, "", "production_button");
          hq.field_a = MessageKind.a(true, param0, "", "production_button_down");
          d.field_b = va.a("project_icons", 0, "", param0);
          IntrusiveDeque.field_a = va.a("faction_icons", 0, "", param0);
          NodeSequence.field_b = va.a("faction_icons_large", 0, "", param0);
          var23_ref = IntrusiveDeque.field_a[1];
          IntrusiveDeque.field_a[1] = IntrusiveDeque.field_a[5];
          IntrusiveDeque.field_a[5] = var23_ref;
          var24_ref = IntrusiveDeque.field_a[2];
          IntrusiveDeque.field_a[2] = IntrusiveDeque.field_a[4];
          IntrusiveDeque.field_a[4] = var24_ref;
          var25_ref = NodeSequence.field_b[1];
          NodeSequence.field_b[1] = NodeSequence.field_b[5];
          NodeSequence.field_b[5] = var25_ref;
          var26_ref = NodeSequence.field_b[2];
          NodeSequence.field_b[2] = NodeSequence.field_b[4];
          NodeSequence.field_b[4] = var26_ref;
          rk.field_j = MessageKind.a(true, param0, "", "ready_button");
          ei.field_a = MessageKind.a(true, param0, "", "ready_button_down");
          jl.field_W = MessageKind.a(true, param0, "", "shine_left");
          DerelictMapReader.field_g = MessageKind.a(true, param0, "", "shine_right");
          VictoryChecker.field_h = MessageKind.a(true, param0, "", "shine_mid");
          SpriteState.field_q = MessageKind.a(true, param0, "", "combat_hex_white");
          RandomAccessCacheFile.a(-116);
          SpriteState.field_q.bindAsRenderTarget();
          SpriteState.field_q.drawColourised(0, 0, 2105376);
          cg.i(0);
          NameSuggestionsPanel.field_H = MessageKind.a(true, param0, "", "planet_burnt");
          qe.field_j = MessageKind.a(true, param0, "", "planet_scorchedearth");
          NetworkArchiveRequest.field_x = MessageKind.a(true, param0, "", "planet_earthlike");
          ta.field_a = MessageKind.a(true, param0, "", "planet_exotic");
          BytePayloadNode.field_k = MessageKind.a(true, param0, "", "planet_gas");
          rl.field_c = MessageKind.a(true, param0, "", "planet_ringed");
          kr.field_d = MessageKind.a(true, param0, "", "planet_rock");
          rk.field_k = MessageKind.a(true, param0, "", "alien_miner");
          IntrusiveNodeHashTable.field_h = MessageKind.a(true, param0, "", "alien_ship");
          CanvasResizeController.field_t = MessageKind.a(true, param0, "", "alien_base");
          kb.field_y = id.a(2, param0, "", "ship");
          wo.field_b = id.a(2, param0, "", "shield");
          oo.field_a = id.a(param6 ^ -6, param0, "", "defensegrid");
          AccountValidationText.field_e = id.a(2, param0, "", "chevron");
          TextFieldWidget.field_L = MessageKind.a(true, param0, "", "warning");
          bd.field_G = id.a(2, param0, "", "hammer");
          AccountFieldValue.field_e = id.a(param6 ^ -6, param0, "", "beaker");
          UiWidget.field_t = MessageKind.a(true, param0, "", "factionring");
          SpriteState.field_y = MessageKind.a(true, param0, "", "factionringtag");
          ArrayWidgetGroup.field_z = MessageKind.a(true, param0, "", "factionringcentre");
          MatchingTextValidator.field_p = MessageKind.a(true, param0, "", "arrowship");
          ReflectionCheck.field_o = MessageKind.a(true, param0, "", "arrowshipdamaged");
          cf.field_F = MessageKind.a(true, param0, "", "fleetsarrowship");
          FleetTrailPoint.field_i = va.a("fleetbuttons", 0, "", param0);
          StarAbandonedEvent.field_r = va.a("anim_icons", 0, "", param0);
          GarrisonTask.field_s = new ArgbSprite(6, 6);
          GarrisonTask.field_s.field_B[33] = 469762047;
          GarrisonTask.field_s.field_B[28] = -14671840;
          GarrisonTask.field_s.field_B[24] = 0;
          GarrisonTask.field_s.field_B[35] = 0;
          GarrisonTask.field_s.field_B[17] = 1140850688;
          GarrisonTask.field_s.field_B[5] = 0;
          GarrisonTask.field_s.field_B[31] = 0;
          GarrisonTask.field_s.field_B[2] = 872415231;
          GarrisonTask.field_s.field_B[12] = 268435456;
          GarrisonTask.field_s.field_B[13] = -5658199;
          GarrisonTask.field_s.field_B[10] = -11250604;
          GarrisonTask.field_s.field_B[25] = -13487566;
          GarrisonTask.field_s.field_B[20] = -7303024;
          GarrisonTask.field_s.field_B[3] = 587202559;
          GarrisonTask.field_s.field_B[0] = 0;
          mj.field_Nb = (Sprite[]) ((Object) new ArgbSprite[6]);
          GarrisonTask.field_s.field_B[6] = 0;
          GarrisonTask.field_s.field_B[22] = -14013910;
          GarrisonTask.field_s.field_B[29] = 0;
          GarrisonTask.field_s.field_B[19] = -9408400;
          GarrisonTask.field_s.field_B[14] = -3815995;
          GarrisonTask.field_s.field_B[7] = -6118750;
          GarrisonTask.field_s.field_B[11] = 0;
          GarrisonTask.field_s.field_B[34] = 0;
          GarrisonTask.field_s.field_B[26] = -13948117;
          GarrisonTask.field_s.field_B[30] = 0;
          GarrisonTask.field_s.field_B[27] = -14869219;
          GarrisonTask.field_s.field_B[15] = -5066062;
          GarrisonTask.field_s.field_B[32] = 503316480;
          GarrisonTask.field_s.field_B[4] = 0;
          GarrisonTask.field_s.field_B[18] = 536870912;
          GarrisonTask.field_s.field_B[8] = -3684409;
          GarrisonTask.field_s.field_B[9] = -5329234;
          GarrisonTask.field_s.field_B[1] = 0;
          TextHotspotWidget.field_L = (Sprite[]) ((Object) new ArgbSprite[6]);
          GarrisonTask.field_s.field_B[16] = -10658467;
          GarrisonTask.field_s.field_B[23] = 1207959552;
          GarrisonTask.field_s.field_B[21] = -10066330;
          for (var13_int = 0; mj.field_Nb.length > var13_int; var13_int++) {
            mj.field_Nb[var13_int] = MessageKind.a(true, param0, "", "res_side_" + var13_int);
            TextHotspotWidget.field_L[var13_int] = MessageKind.a(true, param0, "", "res_low_" + var13_int);
          }
          MenuLabel.field_y = va.a("defnet_anim_small", 0, "", param0);
          for (var13_intLifetime1 = 0; var13_intLifetime1 < MenuLabel.field_y[0].field_B.length; var13_intLifetime1++) {
            if (MenuLabel.field_y[0].field_B[var13_intLifetime1] != 0) {
              MenuLabel.field_y[0].field_B[var13_intLifetime1] = ((MenuLabel.field_y[0].field_B[var13_intLifetime1] >>> 24) / 4 << 24) + 6006988;
            }
          }
          for (var13_intLifetime2 = 1; 13 > var13_intLifetime2; var13_intLifetime2++) {
            var27 = MenuLabel.field_y[var13_intLifetime2];
            for (var15_int = 0; var27.field_B.length > var15_int; var15_int++) {
              if ((var27.field_B[var15_int] & -16777216) == 0) {
                var27.field_B[var15_int] = 0;
              }
            }
          }
          PlacementOrder.field_p = va.a("defnet_anim_mid", 0, "", param0);
          for (var13_intLifetime3 = 0; PlacementOrder.field_p[0].field_B.length > var13_intLifetime3; var13_intLifetime3++) {
            if (0 != PlacementOrder.field_p[0].field_B[var13_intLifetime3]) {
              PlacementOrder.field_p[0].field_B[var13_intLifetime3] = 6006988 + ((PlacementOrder.field_p[0].field_B[var13_intLifetime3] >>> 24) / 4 << 24);
            }
          }
          for (var13_intLifetime4 = 1; var13_intLifetime4 < 13; var13_intLifetime4++) {
            var28 = PlacementOrder.field_p[var13_intLifetime4];
            for (var15_intLifetime1 = 0; var15_intLifetime1 < var28.field_B.length; var15_intLifetime1++) {
              if ((-16777216 & var28.field_B[var15_intLifetime1]) == 0) {
                var28.field_B[var15_intLifetime1] = 0;
              }
            }
          }
          ImageProducerRasterBuffer.field_k = va.a("defnet_anim_large", param6 ^ -8, "", param0);
          for (var13_intLifetime5 = 0; ImageProducerRasterBuffer.field_k[0].field_B.length > var13_intLifetime5; var13_intLifetime5++) {
            if (ImageProducerRasterBuffer.field_k[0].field_B[var13_intLifetime5] != 0) {
              ImageProducerRasterBuffer.field_k[0].field_B[var13_intLifetime5] = ((ImageProducerRasterBuffer.field_k[0].field_B[var13_intLifetime5] >>> 24) / 4 << 24) + 6006988;
            }
          }
          for (var13_intLifetime6 = 1; var13_intLifetime6 < 13; var13_intLifetime6++) {
            var29 = ImageProducerRasterBuffer.field_k[var13_intLifetime6];
            var15 = var29;
            var15Lifetime2 = var29;
            for (var15_intLifetime2 = 0; var29.field_B.length > var15_intLifetime2; var15_intLifetime2++) {
              if (0 == (-16777216 & var29.field_B[var15_intLifetime2])) {
                var29.field_B[var15_intLifetime2] = 0;
              }
            }
          }
          AllianceExpiredEvent.field_k = new Sprite(16, 10);
          pr.field_a = new Sprite(18, 12);
          bs.a(AllianceExpiredEvent.field_k, 98);
          kb.field_y.drawHalfSize(0, 0);
          pr.field_a.bindAsRenderTarget();
          AllianceExpiredEvent.field_k.drawColourised(1, 1, 8421504);
          HuffmanCodec.field_b = new Sprite(10, 12);
          HuffmanCodec.field_b.bindAsRenderTarget();
          wo.field_b.drawColourised(1, 1, 8421504);
          ef.field_f = new Sprite(12, 12);
          ef.field_f.bindAsRenderTarget();
          oo.field_a.drawColourised(1, 1, 8421504);
          mj.field_Kb = new Sprite(12, 12);
          mj.field_Kb.bindAsRenderTarget();
          AccountValidationText.field_e.drawColourised(1, 1, 8421504);
          wa.field_b = new Sprite(128, 128);
          wa.field_b.bindAsRenderTarget();
          TextFieldWidget.field_L.draw(0, 0);
          for (var13_intLifetime7 = 0; var13_intLifetime7 < wa.field_b.field_B.length; var13_intLifetime7++) {
            if (wa.field_b.field_B[var13_intLifetime7] != 0) {
              SoftwareRasterizer.blendPixel(var13_intLifetime7 % wa.field_b.field_z, var13_intLifetime7 / wa.field_b.field_z, 16777215, 128);
              wa.field_b.field_B[var13_intLifetime7] = PrivateChatMessage.intOr(wa.field_b.field_B[var13_intLifetime7], -16777216);
            }
          }
          fb.field_Vb = new Sprite(18, 12);
          fb.field_Vb.bindAsRenderTarget();
          bd.field_G.drawColourised(1, 1, 8421504);
          cg.i(0);
          pr.field_a.addOutline(16777215);
          HuffmanCodec.field_b.addOutline(16777215);
          if (param6 != -8) {
            ck.clearStatics(-23);
          }
          ef.field_f.addOutline(16777215);
          mj.field_Kb.addOutline(16777215);
          fb.field_Vb.addOutline(16777215);
          kj.field_f = ValidationIndicator.a((byte) 111, 80);
          DerelictVictoryChecker.field_n = param0;
          DerelictMapReader.field_i = IsaacBackedRandom.a(5592405, (byte) 41, 13882323, 10);
          IntHashIndex.field_b = id.a(param6 + 10, param2, "basic", "orbcoin");
          var13 = StarAnnotation.field_m > 0 ? "unachieved" : "locked";
          ArchiveRequest.a(14, id.a(param6 ^ -6, param2, "basic", var13));
          CellVertex.field_j = ae.a(param6 + 70, "", param0, "achievements");
          var14 = CellVertex.field_j.length;
          ql.field_o = new Sprite[var14];
          MapView.field_sb = new Sprite[var14];
          vh.field_a = new Sprite[var14];
          bd.field_C = new Sprite[var14];
          GarrisonTask.field_p = va.a("system_icons", 0, "", param0);
          PlayerEliminatedEvent.a(param1, param2, param3, param5, true, param0);
          GameScreen.field_R = new Sprite(15, 15);
          bs.a(GameScreen.field_R, 78);
          SoftwareRasterizer.fillCircle(15, 15, 15, 65793);
          SoftwareRasterizer.fillCircle(15, 15, 5, 0);
          ByteArrayStorage.field_d = new Sprite(15, 20);
          ByteArrayStorage.field_d.bindAsRenderTarget();
          SoftwareRasterizer.fillRect(0, 0, 15, 20, 65793);
          SoftwareRasterizer.fillCircle(0, -1, 5, 0);
          SoftwareRasterizer.fillCircle(0, 20, 5, 0);
          var15Lifetime1 = id.a(2, param0, "", "menu_pip");
          GameKeyHandler.field_e = new Sprite(2 + var15Lifetime1.field_z, 2 + var15Lifetime1.field_w);
          GameKeyHandler.field_e.bindAsRenderTarget();
          var15Lifetime1.drawSilhouette(1, 1, 65793);
          LoginMethodPreference.field_a = new Sprite(21, 22);
          LoginMethodPreference.field_a.bindAsRenderTarget();
          for (var16 = 0; var16 < 20; var16++) {
            var17 = var16 > 10 ? 20 - var16 : 3;
            SoftwareRasterizer.drawHorizontalLine(11 - var17, 1 + var16, 2 * var17, 65793);
          }
          cg.i(0);
          GameKeyHandler.field_e.addOutline(2458760);
          LoginMethodPreference.field_a.addOutline(2458760);
          WidgetTheme.field_k = LoginMethodPreference.field_a.copy();
          WidgetTheme.field_k.flipVertical();
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ck.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static kj a(String param0, int param1, int param2) {
        kj var3 = null;
        RuntimeException var3_ref = null;
        kj stackIn_2_0 = null;
        kj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new kj(false);
          var3.field_c = param1;
          var3.field_g = param0;
          if (param2 <= -13) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (kj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ck.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
        try {
          int var7 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var8 = 0;
          int var9 = 0;
          String var10 = null;
          String stackIn_7_0 = null;
          String stackIn_13_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            try {
              var10 = param1.getParameter("cookieprefix");
              var3 = var10 + "settings";
              var6 = -67 / ((-84 - param0) / 42);
              var4 = (String) (ll.callJavaScript("getcookies", param1, (byte) 53));
              var5 = so.a(var4, ';', 111);
              for (var7 = 0; var5.length > var7; var7++) {
                var8 = var5[var7].indexOf('=');
                if (var8 >= 0 &&
                  var5[var7].substring(0, var8).trim().equals(var3)) {
                  stackIn_7_0 = var5[var7].substring(var8 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (TutorialAi.field_u == null) {
              stackIn_15_0 = param1.getParameter("settings");
              return stackIn_15_0;
            }
            stackIn_13_0 = TutorialAi.field_u;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("ck.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        Archive var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          ArrayOperations.copyBytes(param0, 0, var3, 0, var2_int);
          if (param1) {
            var4 = (Archive) null;
            ck.a((Archive) null, (java.applet.Applet) null, (Archive) null, (Archive) null, (Archive) null, (Archive) null, (byte) 57);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ck.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        field_c = null;
        field_a = null;
        if (param0 <= 83) {
          return;
        }
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
    }

    static {
        field_f = "Name is available";
        field_g = "<%glossary>FLEET</col> - A collection of ships<br><br><%glossary>SYSTEM</col> - A star and its related planets. <%glossary>Systems</col> are always controlled by a single player and only that player can have <%glossary>fleets</col> stationed there. If another player's fleet enters the system, the two fleets engage in combat until one remains.<br><br><%glossary>NEUTRAL</col> - A <%glossary>system</col> not under the control of any player. <%glossary>Neutral</col> systems never attack and do not produce fleets.<br><br><%glossary>WORMHOLE</col> - <%glossary>Systems</col> are connected by <%glossary>wormholes</col>, which fleets use to move between systems. Fleets can jump along a single wormhole link per turn in <%glossary>neutral</col> or hostile systems, but can chain jumps together in systems you control.<br><br><%glossary>RESOURCE</col> - There are four types of <%glossary>resource</col> in <%highlight>Shattered Plans</col>: <%resource0>, <%resource1>, <%resource2> and <%resource3>, and they are used to construct fleets and <%highlight>projects</col>.<br><br>";
        field_c = "OK";
        field_b = "Account created successfully!";
        field_d = "Successful attacks";
    }
}
