/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoadLayerMaskRenderer extends RoadFillRenderer {
    private byte layerMask;
    private IndexedSprite maskSprite;

    final static void stopAllEntitySounds(byte param0) {
        EntitySound var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = HoldTheLine.field_D;
        try {
          var1 = (EntitySound) (FadingDialog.field_J.first((byte) 105));
          while (null != var1) {
            NanoTickClock.removeEntitySound(true, var1);
            var1.unlink(0);
            var1 = (EntitySound) (FadingDialog.field_J.next((byte) -48));
            if (var2 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "rk.B(" + param0 + ')');
        }
    }

    final static String decodeCp1252(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -128 % ((9 - param0) / 35);
          stackIn_1_0 = sm.decodeCp1252(param1.length, 0, -129, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("rk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void loadGameText(byte param0, ResourceArchive param1) {
        RuntimeException stackIn_709_0 = null;
        StringBuilder stackIn_709_1 = null;
        String stackIn_710_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        byte[] var2Lifetime178;
        byte[] var2Lifetime179;
        byte[] var2Lifetime180;
        byte[] var2Lifetime181;
        byte[] var2Lifetime182;
        byte[] var2Lifetime183;
        byte[] var2Lifetime184;
        byte[] var2Lifetime185;
        byte[] var2Lifetime186;
        byte[] var2Lifetime187;
        byte[] var2Lifetime188;
        byte[] var2Lifetime189;
        byte[] var2Lifetime190;
        byte[] var2Lifetime191;
        byte[] var2Lifetime192;
        byte[] var2Lifetime193;
        byte[] var2Lifetime194;
        byte[] var2Lifetime195;
        byte[] var2Lifetime196;
        byte[] var2Lifetime197;
        byte[] var2Lifetime198;
        var3 = HoldTheLine.field_D;
        try {
          PasswordFieldRenderer.field_w = param1;
          var2 = DualLinkNode.a("TEXT_GAME_NAME", 0);
          if (var2 != null) {
            SpriteState.field_w = RoadLayerMaskRenderer.decodeCp1252((byte) -97, var2);
          }
          var2Lifetime1 = DualLinkNode.a("TEXT_LOADING", 0);
          if (null != var2Lifetime1) {
            CheckboxRenderer.field_q = RoadLayerMaskRenderer.decodeCp1252((byte) 48, var2Lifetime1);
          }
          var2Lifetime2 = DualLinkNode.a("TEXT_POSITION,0", 0);
          if (null != var2Lifetime2) {
            FullscreenErrorDialog.field_Y[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 47, var2Lifetime2);
          }
          var2Lifetime3 = DualLinkNode.a("TEXT_POSITION,1", 0);
          if (var2Lifetime3 != null) {
            FullscreenErrorDialog.field_Y[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 107, var2Lifetime3);
          }
          var2Lifetime4 = DualLinkNode.a("TEXT_POSITION,2", 0);
          if (null != var2Lifetime4) {
            FullscreenErrorDialog.field_Y[2] = RoadLayerMaskRenderer.decodeCp1252((byte) 86, var2Lifetime4);
          }
          var2Lifetime5 = DualLinkNode.a("TEXT_POSITION,3", 0);
          if (var2Lifetime5 != null) {
            FullscreenErrorDialog.field_Y[3] = RoadLayerMaskRenderer.decodeCp1252((byte) -124, var2Lifetime5);
          }
          var2Lifetime6 = DualLinkNode.a("TEXT_STANDINGS_DID_NOT_FINISH", 0);
          if (var2Lifetime6 != null) {
            DualLinkNode.field_m = RoadLayerMaskRenderer.decodeCp1252((byte) 91, var2Lifetime6);
          }
          var2Lifetime7 = DualLinkNode.a("TEXT_STANDINGS_PTS", 0);
          if (var2Lifetime7 != null) {
            ij.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -39, var2Lifetime7);
          }
          var2Lifetime8 = DualLinkNode.a("TEXT_STANDINGS_1PT", 0);
          if (var2Lifetime8 != null) {
            DirectByteStorage.field_h = RoadLayerMaskRenderer.decodeCp1252((byte) 45, var2Lifetime8);
          }
          var2Lifetime9 = DualLinkNode.a("TEXT_STANDINGS_LEADERBOARD", 0);
          if (null != var2Lifetime9) {
            qh.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) -117, var2Lifetime9);
          }
          var2Lifetime10 = DualLinkNode.a("TEXT_SELECT_VEHICLE", 0);
          if (var2Lifetime10 != null) {
            jc.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -38, var2Lifetime10);
          }
          var2Lifetime11 = DualLinkNode.a("TEXT_NEXT_COURSE", 0);
          if (null != var2Lifetime11) {
            ue.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) 68, var2Lifetime11);
          }
          var2Lifetime12 = DualLinkNode.a("TEXT_RACE_PRESTART", 0);
          if (null != var2Lifetime12) {
            MusicPatchEnvelope.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) -121, var2Lifetime12);
          }
          var2Lifetime13 = DualLinkNode.a("TEXT_NAVIGATE_BACK", 0);
          if (var2Lifetime13 != null) {
            IntrusiveNode.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) -84, var2Lifetime13);
          }
          var2Lifetime14 = DualLinkNode.a("TEXT_RESUME", 0);
          if (null != var2Lifetime14) {
            IsaacPacketBuffer.field_s = RoadLayerMaskRenderer.decodeCp1252((byte) 91, var2Lifetime14);
          }
          var2Lifetime15 = DualLinkNode.a("TEXT_LOGIN_REGISTER", 0);
          if (null != var2Lifetime15) {
            SoundCache.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) -58, var2Lifetime15);
          }
          var2Lifetime16 = DualLinkNode.a("TEXT_STANDINGS", 0);
          if (var2Lifetime16 != null) {
            SpriteSheetAsset.field_h = RoadLayerMaskRenderer.decodeCp1252((byte) 124, var2Lifetime16);
          }
          var2Lifetime17 = DualLinkNode.a("TEXT_SAVE_PROGRESS", 0);
          if (null != var2Lifetime17) {
            lj.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) 53, var2Lifetime17);
          }
          var2Lifetime18 = DualLinkNode.a("TEXT_AI_RACERS", 0);
          if (var2Lifetime18 != null) {
            gk.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) -26, var2Lifetime18);
          }
          var2Lifetime19 = DualLinkNode.a("TEXT_MODE", 0);
          if (var2Lifetime19 != null) {
            sa.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 96, var2Lifetime19);
          }
          var2Lifetime20 = DualLinkNode.a("TEXT_PLAY_TUTORIAL", 0);
          if (null != var2Lifetime20) {
            PathWaypoint.field_p = RoadLayerMaskRenderer.decodeCp1252((byte) 116, var2Lifetime20);
          }
          var2Lifetime21 = DualLinkNode.a("TEXT_ACHIEVEMENTS_THISGAME", 0);
          if (var2Lifetime21 != null) {
            MarkerSliderRenderer.field_i = RoadLayerMaskRenderer.decodeCp1252((byte) -46, var2Lifetime21);
          }
          var2Lifetime22 = DualLinkNode.a("TEXT_RETRY", 0);
          if (var2Lifetime22 != null) {
            DialogLayer.field_J = RoadLayerMaskRenderer.decodeCp1252((byte) -103, var2Lifetime22);
          }
          var2Lifetime23 = DualLinkNode.a("TEXT_RETRIES_REMAINING_ZERO", 0);
          if (null != var2Lifetime23) {
            h.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -51, var2Lifetime23);
          }
          var2Lifetime24 = DualLinkNode.a("TEXT_RETRIES_REMAINING_ONE", 0);
          if (var2Lifetime24 != null) {
            SpriteSheetAsset.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) 89, var2Lifetime24);
          }
          var2Lifetime25 = DualLinkNode.a("TEXT_RETRIES_REMAINING_MULTIPLE", 0);
          if (null != var2Lifetime25) {
            sh.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) -41, var2Lifetime25);
          }
          var2Lifetime26 = DualLinkNode.a("TEXT_CONTINUE", 0);
          if (null != var2Lifetime26) {
            hk.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) -56, var2Lifetime26);
          }
          var2Lifetime27 = DualLinkNode.a("TEXT_BACK_TO_MENU", 0);
          if (var2Lifetime27 != null) {
            RoadLayerMaskRenderer.decodeCp1252((byte) -72, var2Lifetime27);
          }
          var2Lifetime28 = DualLinkNode.a("TEXT_KILLS", 0);
          if (null != var2Lifetime28) {
            ZombiePedestrian.field_u = RoadLayerMaskRenderer.decodeCp1252((byte) 118, var2Lifetime28);
          }
          var2Lifetime29 = DualLinkNode.a("TEXT_DEATHS", 0);
          if (null != var2Lifetime29) {
            MusicPatchPcmStream.field_o = RoadLayerMaskRenderer.decodeCp1252((byte) -103, var2Lifetime29);
          }
          var2Lifetime30 = DualLinkNode.a("TEXT_UNLOCKED", 0);
          if (var2Lifetime30 != null) {
            SolidRoadStripRenderer.field_n = RoadLayerMaskRenderer.decodeCp1252((byte) -65, var2Lifetime30);
          }
          var2Lifetime31 = DualLinkNode.a("TEXT_ENDOFFREE", 0);
          if (var2Lifetime31 != null) {
            SingleChildWidget.field_E = RoadLayerMaskRenderer.decodeCp1252((byte) -100, var2Lifetime31);
          }
          var2Lifetime32 = DualLinkNode.a("TEXT_JUSTPLAY_TEXT", 0);
          if (null != var2Lifetime32) {
            ko.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 125, var2Lifetime32);
          }
          var2Lifetime33 = DualLinkNode.a("TEXT_JUSTPLAY_TITLE", 0);
          if (null != var2Lifetime33) {
            NodeHashTableIterator.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) 87, var2Lifetime33);
          }
          var2Lifetime34 = DualLinkNode.a("TEXT_HS_FETCHING", 0);
          if (var2Lifetime34 != null) {
            fm.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) -86, var2Lifetime34);
          }
          var2Lifetime35 = DualLinkNode.a("TEXT_HS_TOTAL", 0);
          if (null != var2Lifetime35) {
            IntHashTable.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 49, var2Lifetime35);
          }
          var2Lifetime36 = DualLinkNode.a("TEXT_JUSTPLAY2", 0);
          if (null != var2Lifetime36) {
            ue.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) -113, var2Lifetime36);
          }
          var2Lifetime37 = DualLinkNode.a("TEXT_JUSTPLAY1", 0);
          if (var2Lifetime37 != null) {
            EditableTextField.field_M = RoadLayerMaskRenderer.decodeCp1252((byte) -108, var2Lifetime37);
          }
          var2Lifetime38 = DualLinkNode.a("keycode_multi2_left", 0);
          if (null != var2Lifetime38) {
            FadingDialog.field_I = var2Lifetime38[0] & 255;
          }
          var2Lifetime39 = DualLinkNode.a("keycode_multi2_right", 0);
          if (var2Lifetime39 != null) {
            MarkerSlider.field_G = var2Lifetime39[0] & 255;
          }
          var2Lifetime40 = DualLinkNode.a("keycode_multi2_accel", 0);
          if (var2Lifetime40 != null) {
            MusicPatchEnvelope.field_a = 255 & var2Lifetime40[0];
          }
          var2Lifetime41 = DualLinkNode.a("keycode_multi2_brake", 0);
          if (null != var2Lifetime41) {
            TextLineLayout.field_g = 255 & var2Lifetime41[0];
          }
          var2Lifetime42 = DualLinkNode.a("TEXT_MEMBER_BENEFITS,0", 0);
          if (var2Lifetime42 != null) {
            co.field_a[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 107, var2Lifetime42);
          }
          var2Lifetime43 = DualLinkNode.a("TEXT_MEMBER_BENEFITS,1", 0);
          if (var2Lifetime43 != null) {
            co.field_a[1] = RoadLayerMaskRenderer.decodeCp1252((byte) -96, var2Lifetime43);
          }
          var2Lifetime44 = DualLinkNode.a("TEXT_MEMBER_BENEFITS,2", 0);
          if (null != var2Lifetime44) {
            co.field_a[2] = RoadLayerMaskRenderer.decodeCp1252((byte) 58, var2Lifetime44);
          }
          var2Lifetime45 = DualLinkNode.a("TEXT_MEMBER_BENEFITS,3", 0);
          if (null != var2Lifetime45) {
            co.field_a[3] = RoadLayerMaskRenderer.decodeCp1252((byte) 55, var2Lifetime45);
          }
          var2Lifetime46 = DualLinkNode.a("TEXT_MEMBER_BENEFITS,4", 0);
          if (null != var2Lifetime46) {
            co.field_a[4] = RoadLayerMaskRenderer.decodeCp1252((byte) 94, var2Lifetime46);
          }
          var2Lifetime47 = DualLinkNode.a("TEXT_MEMBER_BENEFITS,5", 0);
          if (null != var2Lifetime47) {
            co.field_a[5] = RoadLayerMaskRenderer.decodeCp1252((byte) -112, var2Lifetime47);
          }
          var2Lifetime48 = DualLinkNode.a("ACV_NAMES,0", 0);
          if (null != var2Lifetime48) {
            ae.field_c[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 96, var2Lifetime48);
          }
          var2Lifetime49 = DualLinkNode.a("ACV_NAMES,1", 0);
          if (var2Lifetime49 != null) {
            ae.field_c[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 117, var2Lifetime49);
          }
          var2Lifetime50 = DualLinkNode.a("ACV_NAMES,2", 0);
          if (null != var2Lifetime50) {
            ae.field_c[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -85, var2Lifetime50);
          }
          var2Lifetime51 = DualLinkNode.a("ACV_NAMES,3", 0);
          if (var2Lifetime51 != null) {
            ae.field_c[3] = RoadLayerMaskRenderer.decodeCp1252((byte) -84, var2Lifetime51);
          }
          var2Lifetime52 = DualLinkNode.a("ACV_NAMES,4", 0);
          if (null != var2Lifetime52) {
            ae.field_c[4] = RoadLayerMaskRenderer.decodeCp1252((byte) 69, var2Lifetime52);
          }
          var2Lifetime53 = DualLinkNode.a("ACV_NAMES,5", 0);
          if (null != var2Lifetime53) {
            ae.field_c[5] = RoadLayerMaskRenderer.decodeCp1252((byte) 49, var2Lifetime53);
          }
          var2Lifetime54 = DualLinkNode.a("ACV_NAMES,6", 0);
          if (var2Lifetime54 != null) {
            ae.field_c[6] = RoadLayerMaskRenderer.decodeCp1252((byte) -123, var2Lifetime54);
          }
          var2Lifetime55 = DualLinkNode.a("ACV_NAMES,7", 0);
          if (var2Lifetime55 != null) {
            ae.field_c[7] = RoadLayerMaskRenderer.decodeCp1252((byte) 103, var2Lifetime55);
          }
          var2Lifetime56 = DualLinkNode.a("ACV_NAMES,8", 0);
          if (var2Lifetime56 != null) {
            ae.field_c[8] = RoadLayerMaskRenderer.decodeCp1252((byte) 114, var2Lifetime56);
          }
          var2Lifetime57 = DualLinkNode.a("ACV_NAMES,9", 0);
          if (null != var2Lifetime57) {
            ae.field_c[9] = RoadLayerMaskRenderer.decodeCp1252((byte) -59, var2Lifetime57);
          }
          var2Lifetime58 = DualLinkNode.a("ACV_NAMES,10", 0);
          if (null != var2Lifetime58) {
            ae.field_c[10] = RoadLayerMaskRenderer.decodeCp1252((byte) 124, var2Lifetime58);
          }
          var2Lifetime59 = DualLinkNode.a("ACV_NAMES,11", 0);
          if (null != var2Lifetime59) {
            ae.field_c[11] = RoadLayerMaskRenderer.decodeCp1252((byte) 101, var2Lifetime59);
          }
          var2Lifetime60 = DualLinkNode.a("ACV_NAMES,12", 0);
          if (var2Lifetime60 != null) {
            ae.field_c[12] = RoadLayerMaskRenderer.decodeCp1252((byte) 73, var2Lifetime60);
          }
          var2Lifetime61 = DualLinkNode.a("ACV_NAMES,13", 0);
          if (var2Lifetime61 != null) {
            ae.field_c[13] = RoadLayerMaskRenderer.decodeCp1252((byte) 82, var2Lifetime61);
          }
          var2Lifetime62 = DualLinkNode.a("ACV_NAMES,14", 0);
          if (var2Lifetime62 != null) {
            ae.field_c[14] = RoadLayerMaskRenderer.decodeCp1252((byte) 71, var2Lifetime62);
          }
          var2Lifetime63 = DualLinkNode.a("ACV_NAMES,15", 0);
          if (null != var2Lifetime63) {
            ae.field_c[15] = RoadLayerMaskRenderer.decodeCp1252((byte) 105, var2Lifetime63);
          }
          var2Lifetime64 = DualLinkNode.a("ACV_CRITERIA,0", 0);
          if (null != var2Lifetime64) {
            TextLineLayout.field_j[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 90, var2Lifetime64);
          }
          var2Lifetime65 = DualLinkNode.a("ACV_CRITERIA,1", 0);
          if (null != var2Lifetime65) {
            TextLineLayout.field_j[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 105, var2Lifetime65);
          }
          var2Lifetime66 = DualLinkNode.a("ACV_CRITERIA,2", 0);
          if (var2Lifetime66 != null) {
            TextLineLayout.field_j[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -83, var2Lifetime66);
          }
          var2Lifetime67 = DualLinkNode.a("ACV_CRITERIA,3", 0);
          if (var2Lifetime67 != null) {
            TextLineLayout.field_j[3] = RoadLayerMaskRenderer.decodeCp1252((byte) -82, var2Lifetime67);
          }
          var2Lifetime68 = DualLinkNode.a("ACV_CRITERIA,4", 0);
          if (null != var2Lifetime68) {
            TextLineLayout.field_j[4] = RoadLayerMaskRenderer.decodeCp1252((byte) -67, var2Lifetime68);
          }
          var2Lifetime69 = DualLinkNode.a("ACV_CRITERIA,5", 0);
          if (var2Lifetime69 != null) {
            TextLineLayout.field_j[5] = RoadLayerMaskRenderer.decodeCp1252((byte) 119, var2Lifetime69);
          }
          var2Lifetime70 = DualLinkNode.a("ACV_CRITERIA,6", 0);
          if (var2Lifetime70 != null) {
            TextLineLayout.field_j[6] = RoadLayerMaskRenderer.decodeCp1252((byte) 94, var2Lifetime70);
          }
          var2Lifetime71 = DualLinkNode.a("ACV_CRITERIA,7", 0);
          if (null != var2Lifetime71) {
            TextLineLayout.field_j[7] = RoadLayerMaskRenderer.decodeCp1252((byte) -36, var2Lifetime71);
          }
          var2Lifetime72 = DualLinkNode.a("ACV_CRITERIA,8", 0);
          if (null != var2Lifetime72) {
            TextLineLayout.field_j[8] = RoadLayerMaskRenderer.decodeCp1252((byte) -49, var2Lifetime72);
          }
          var2Lifetime73 = DualLinkNode.a("ACV_CRITERIA,9", 0);
          if (var2Lifetime73 != null) {
            TextLineLayout.field_j[9] = RoadLayerMaskRenderer.decodeCp1252((byte) -93, var2Lifetime73);
          }
          var2Lifetime74 = DualLinkNode.a("ACV_CRITERIA,10", 0);
          if (var2Lifetime74 != null) {
            TextLineLayout.field_j[10] = RoadLayerMaskRenderer.decodeCp1252((byte) -105, var2Lifetime74);
          }
          var2Lifetime75 = DualLinkNode.a("ACV_CRITERIA,11", 0);
          if (var2Lifetime75 != null) {
            TextLineLayout.field_j[11] = RoadLayerMaskRenderer.decodeCp1252((byte) 87, var2Lifetime75);
          }
          var2Lifetime76 = DualLinkNode.a("ACV_CRITERIA,12", 0);
          if (null != var2Lifetime76) {
            TextLineLayout.field_j[12] = RoadLayerMaskRenderer.decodeCp1252((byte) -112, var2Lifetime76);
          }
          var2Lifetime77 = DualLinkNode.a("ACV_CRITERIA,13", 0);
          if (null != var2Lifetime77) {
            TextLineLayout.field_j[13] = RoadLayerMaskRenderer.decodeCp1252((byte) -40, var2Lifetime77);
          }
          var2Lifetime78 = DualLinkNode.a("ACV_CRITERIA,14", 0);
          if (var2Lifetime78 != null) {
            TextLineLayout.field_j[14] = RoadLayerMaskRenderer.decodeCp1252((byte) 123, var2Lifetime78);
          }
          var2Lifetime79 = DualLinkNode.a("ACV_CRITERIA,15", 0);
          if (var2Lifetime79 != null) {
            TextLineLayout.field_j[15] = RoadLayerMaskRenderer.decodeCp1252((byte) 122, var2Lifetime79);
          }
          var2Lifetime80 = DualLinkNode.a("TEXT_HIGHSCORES_ALL", 0);
          if (null != var2Lifetime80) {
            jc.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) -71, var2Lifetime80);
          }
          var2Lifetime81 = DualLinkNode.a("TEXT_HIGHSCORES_MINE", 0);
          if (null != var2Lifetime81) {
            b.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) 123, var2Lifetime81);
          }
          var2Lifetime82 = DualLinkNode.a("TEXT_HIGHSCORES_BEST", 0);
          if (var2Lifetime82 != null) {
            o.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) 67, var2Lifetime82);
          }
          var2Lifetime83 = DualLinkNode.a("HIGHSCORE_TOOLTIPS,0", 0);
          if (null != var2Lifetime83) {
            UiTheme.field_k[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 94, var2Lifetime83);
          }
          var2Lifetime84 = DualLinkNode.a("HIGHSCORE_TOOLTIPS,1", 0);
          if (var2Lifetime84 != null) {
            UiTheme.field_k[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 100, var2Lifetime84);
          }
          var2Lifetime85 = DualLinkNode.a("HIGHSCORE_TOOLTIPS,2", 0);
          if (null != var2Lifetime85) {
            UiTheme.field_k[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -126, var2Lifetime85);
          }
          var2Lifetime86 = DualLinkNode.a("HIGHSCORE_TOOLTIPS,3", 0);
          if (var2Lifetime86 != null) {
            UiTheme.field_k[3] = RoadLayerMaskRenderer.decodeCp1252((byte) -30, var2Lifetime86);
          }
          var2Lifetime87 = DualLinkNode.a("TEXT_INSTRUCTIONS1", 0);
          if (var2Lifetime87 != null) {
            DiskCacheStore.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) 67, var2Lifetime87);
          }
          var2Lifetime88 = DualLinkNode.a("TEXT_INSTRUCTIONS2", 0);
          if (var2Lifetime88 != null) {
            LoginForm.field_L = RoadLayerMaskRenderer.decodeCp1252((byte) -103, var2Lifetime88);
          }
          var2Lifetime89 = DualLinkNode.a("TEXT_INSTRUCTIONS3", 0);
          if (null != var2Lifetime89) {
            ImageProducerRasterBuffer.field_k = RoadLayerMaskRenderer.decodeCp1252((byte) -39, var2Lifetime89);
          }
          var2Lifetime90 = DualLinkNode.a("TEXT_INSTRUCTIONS4_1", 0);
          if (var2Lifetime90 != null) {
            MusicPatchEnvelope.field_k = RoadLayerMaskRenderer.decodeCp1252((byte) -76, var2Lifetime90);
          }
          var2Lifetime91 = DualLinkNode.a("TEXT_INSTRUCTIONS4_2", 0);
          if (var2Lifetime91 != null) {
            NanoTickClock.field_o = RoadLayerMaskRenderer.decodeCp1252((byte) -110, var2Lifetime91);
          }
          var2Lifetime92 = DualLinkNode.a("TEXT_INSTRUCTIONS5_1", 0);
          if (null != var2Lifetime92) {
            DelayedServerPacket.field_p = RoadLayerMaskRenderer.decodeCp1252((byte) 120, var2Lifetime92);
          }
          var2Lifetime93 = DualLinkNode.a("TEXT_INSTRUCTIONS5_2", 0);
          if (null != var2Lifetime93) {
            IntrusiveNode.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) 55, var2Lifetime93);
          }
          var2Lifetime94 = DualLinkNode.a("TEXT_INSTRUCTIONS5_3", 0);
          if (null != var2Lifetime94) {
            Vector2i.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) -41, var2Lifetime94);
          }
          var2Lifetime95 = DualLinkNode.a("TEXT_INSTRUCTIONS5_4", 0);
          if (var2Lifetime95 != null) {
            SingleChildWidget.field_D = RoadLayerMaskRenderer.decodeCp1252((byte) 80, var2Lifetime95);
          }
          var2Lifetime96 = DualLinkNode.a("TEXT_INSTRUCTIONS6", 0);
          if (null != var2Lifetime96) {
            TutorialPage.field_n = RoadLayerMaskRenderer.decodeCp1252((byte) 88, var2Lifetime96);
          }
          var2Lifetime97 = DualLinkNode.a("TEXT_INSTRUCTIONS7", 0);
          if (var2Lifetime97 != null) {
            AccountFormText.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) 75, var2Lifetime97);
          }
          var2Lifetime98 = DualLinkNode.a("INSTR_PAGES,0", 0);
          if (null != var2Lifetime98) {
            TextHotspotRange.field_i[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 66, var2Lifetime98);
          }
          var2Lifetime99 = DualLinkNode.a("INSTR_PAGES,1", 0);
          if (var2Lifetime99 != null) {
            TextHotspotRange.field_i[1] = RoadLayerMaskRenderer.decodeCp1252((byte) -89, var2Lifetime99);
          }
          var2Lifetime100 = DualLinkNode.a("INSTR_PAGES,2", 0);
          if (var2Lifetime100 != null) {
            TextHotspotRange.field_i[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -40, var2Lifetime100);
          }
          var2Lifetime101 = DualLinkNode.a("INSTR_PAGES,3", 0);
          if (null != var2Lifetime101) {
            TextHotspotRange.field_i[3] = RoadLayerMaskRenderer.decodeCp1252((byte) -102, var2Lifetime101);
          }
          var2Lifetime102 = DualLinkNode.a("INSTR_PAGES,4", 0);
          if (null != var2Lifetime102) {
            TextHotspotRange.field_i[4] = RoadLayerMaskRenderer.decodeCp1252((byte) -66, var2Lifetime102);
          }
          var2Lifetime103 = DualLinkNode.a("INSTR_PAGES,5", 0);
          if (var2Lifetime103 != null) {
            TextHotspotRange.field_i[5] = RoadLayerMaskRenderer.decodeCp1252((byte) -69, var2Lifetime103);
          }
          var2Lifetime104 = DualLinkNode.a("INSTR_PAGES,6", 0);
          if (null != var2Lifetime104) {
            TextHotspotRange.field_i[6] = RoadLayerMaskRenderer.decodeCp1252((byte) -62, var2Lifetime104);
          }
          var2Lifetime105 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS3", 0);
          if (null != var2Lifetime105) {
            ArcTrackBoundary.field_v = RoadLayerMaskRenderer.decodeCp1252((byte) -67, var2Lifetime105);
          }
          var2Lifetime106 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS2", 0);
          if (var2Lifetime106 != null) {
            LoginCredentialType.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) -36, var2Lifetime106);
          }
          var2Lifetime107 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS1", 0);
          if (null != var2Lifetime107) {
            wl.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) -106, var2Lifetime107);
          }
          var2Lifetime108 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SPEED3", 0);
          if (null != var2Lifetime108) {
            RaceWorld.field_K = RoadLayerMaskRenderer.decodeCp1252((byte) -110, var2Lifetime108);
          }
          var2Lifetime109 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SPEED2", 0);
          if (null != var2Lifetime109) {
            UiTheme.field_h = RoadLayerMaskRenderer.decodeCp1252((byte) 94, var2Lifetime109);
          }
          var2Lifetime110 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SPEED1", 0);
          if (null != var2Lifetime110) {
            uk.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) 111, var2Lifetime110);
          }
          var2Lifetime111 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS3", 0);
          if (null != var2Lifetime111) {
            NamedSoundEffect.field_o = RoadLayerMaskRenderer.decodeCp1252((byte) 107, var2Lifetime111);
          }
          var2Lifetime112 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS2", 0);
          if (null != var2Lifetime112) {
            LoginForm.field_K = RoadLayerMaskRenderer.decodeCp1252((byte) -113, var2Lifetime112);
          }
          var2Lifetime113 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS1", 0);
          if (var2Lifetime113 != null) {
            AccountTermsPanel.field_J = RoadLayerMaskRenderer.decodeCp1252((byte) 102, var2Lifetime113);
          }
          var2Lifetime114 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_NONE", 0);
          if (null != var2Lifetime114) {
            HoldTheLine.field_B = RoadLayerMaskRenderer.decodeCp1252((byte) -126, var2Lifetime114);
          }
          var2Lifetime115 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS", 0);
          if (null != var2Lifetime115) {
            AudioServiceThread.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 44, var2Lifetime115);
          }
          var2Lifetime116 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_SPEED", 0);
          if (var2Lifetime116 != null) {
            ResourceArchive.field_h = RoadLayerMaskRenderer.decodeCp1252((byte) 109, var2Lifetime116);
          }
          var2Lifetime117 = DualLinkNode.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS", 0);
          if (var2Lifetime117 != null) {
            IsaacRandom.field_k = RoadLayerMaskRenderer.decodeCp1252((byte) -59, var2Lifetime117);
          }
          var2Lifetime118 = DualLinkNode.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI2", 0);
          if (null != var2Lifetime118) {
            o.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 80, var2Lifetime118);
          }
          var2Lifetime119 = DualLinkNode.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI2_COLOUR", 0);
          if (var2Lifetime119 != null) {
            IterableNodeHashTable.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) 91, var2Lifetime119);
          }
          var2Lifetime120 = DualLinkNode.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI1", 0);
          if (null != var2Lifetime120) {
            hc.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -122, var2Lifetime120);
          }
          var2Lifetime121 = DualLinkNode.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI1_COLOUR", 0);
          if (var2Lifetime121 != null) {
            IconToggleRenderer.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -32, var2Lifetime121);
          }
          var2Lifetime122 = DualLinkNode.a("TEXT_INSTRUCTIONS_CONTROLS_ACTION", 0);
          if (null != var2Lifetime122) {
            m.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) 117, var2Lifetime122);
          }
          var2Lifetime123 = DualLinkNode.a("TEXT_INSTRUCTIONS_CONTROLS_SINGLE", 0);
          if (var2Lifetime123 != null) {
            LinkWidgetRenderer.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) 107, var2Lifetime123);
          }
          var2Lifetime124 = DualLinkNode.a("TEXT_INSTRUCTIONS_ACTIVATE", 0);
          if (null != var2Lifetime124) {
            kc.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) 65, var2Lifetime124);
          }
          var2Lifetime125 = DualLinkNode.a("TEXT_INSTRUCTIONS_RIGHT", 0);
          if (null != var2Lifetime125) {
            StrongCacheEntry.field_t = RoadLayerMaskRenderer.decodeCp1252((byte) -117, var2Lifetime125);
          }
          var2Lifetime126 = DualLinkNode.a("TEXT_INSTRUCTIONS_LEFT", 0);
          if (var2Lifetime126 != null) {
            NameSuggestionsPanel.field_H = RoadLayerMaskRenderer.decodeCp1252((byte) -43, var2Lifetime126);
          }
          var2Lifetime127 = DualLinkNode.a("TEXT_INSTRUCTIONS_BRAKE", 0);
          if (var2Lifetime127 != null) {
            WhirlpoolHasher.field_i = RoadLayerMaskRenderer.decodeCp1252((byte) 91, var2Lifetime127);
          }
          var2Lifetime128 = DualLinkNode.a("TEXT_INSTRUCTIONS_ACCELERATE", 0);
          if (null != var2Lifetime128) {
            b.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 76, var2Lifetime128);
          }
          var2Lifetime129 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_ENTER", 0);
          if (var2Lifetime129 != null) {
            NetworkArchiveRequest.field_A = RoadLayerMaskRenderer.decodeCp1252((byte) -106, var2Lifetime129);
          }
          var2Lifetime130 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_SPACE_CTRL", 0);
          if (null != var2Lifetime130) {
            NameCheckProgressDialog.field_xb = RoadLayerMaskRenderer.decodeCp1252((byte) 78, var2Lifetime130);
          }
          var2Lifetime131 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_RIGHT", 0);
          if (null != var2Lifetime131) {
            GameKeyHandler.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) -27, var2Lifetime131);
          }
          var2Lifetime132 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_LEFT", 0);
          if (null != var2Lifetime132) {
            fk.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 64, var2Lifetime132);
          }
          var2Lifetime133 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_DOWN", 0);
          if (var2Lifetime133 != null) {
            LoadProgressDialog.field_fb = RoadLayerMaskRenderer.decodeCp1252((byte) -122, var2Lifetime133);
          }
          var2Lifetime134 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_UP", 0);
          if (null != var2Lifetime134) {
            Point2i.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 62, var2Lifetime134);
          }
          var2Lifetime135 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_ALT_CONTROL_TAB", 0);
          if (var2Lifetime135 != null) {
            jh.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) -107, var2Lifetime135);
          }
          var2Lifetime136 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_C", 0);
          if (var2Lifetime136 != null) {
            ka.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 72, var2Lifetime136);
          }
          var2Lifetime137 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_X", 0);
          if (null != var2Lifetime137) {
            RoadFillRenderer.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) -30, var2Lifetime137);
          }
          var2Lifetime138 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_A", 0);
          if (null != var2Lifetime138) {
            IndexedSpriteState.field_f = RoadLayerMaskRenderer.decodeCp1252((byte) -107, var2Lifetime138);
          }
          var2Lifetime139 = DualLinkNode.a("TEXT_INSTRUCTIONS_KEY_Q", 0);
          if (var2Lifetime139 != null) {
            LabeledField.field_H = RoadLayerMaskRenderer.decodeCp1252((byte) -119, var2Lifetime139);
          }
          var2Lifetime140 = DualLinkNode.a("GAMETYPE_NAME_RACE", 0);
          if (var2Lifetime140 != null) {
            bo.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) 84, var2Lifetime140);
          }
          var2Lifetime141 = DualLinkNode.a("GAMETYPE_NAME_TT", 0);
          if (var2Lifetime141 != null) {
            TextHotspotWidget.field_M = RoadLayerMaskRenderer.decodeCp1252((byte) -58, var2Lifetime141);
          }
          var2Lifetime142 = DualLinkNode.a("GAMETYPE_NAME_DEMOLITION", 0);
          if (var2Lifetime142 != null) {
            Point2i.field_g = RoadLayerMaskRenderer.decodeCp1252((byte) 96, var2Lifetime142);
          }
          var2Lifetime143 = DualLinkNode.a("GAMETYPE_NAME_CHAMPIONSHIP", 0);
          if (var2Lifetime143 != null) {
            DropTargetWidget.field_H = RoadLayerMaskRenderer.decodeCp1252((byte) 100, var2Lifetime143);
          }
          var2Lifetime144 = DualLinkNode.a("GAMETYPE_PLAYERS1", 0);
          if (null != var2Lifetime144) {
            MusicCrossfadeStream.field_r = RoadLayerMaskRenderer.decodeCp1252((byte) 68, var2Lifetime144);
          }
          var2Lifetime145 = DualLinkNode.a("GAMETYPE_PLAYERS2", 0);
          if (var2Lifetime145 != null) {
            h.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) -87, var2Lifetime145);
          }
          var2Lifetime146 = DualLinkNode.a("GAMETYPE_TOOLTIPS,0", 0);
          if (null != var2Lifetime146) {
            NetworkArchiveRequest.field_C[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 63, var2Lifetime146);
          }
          var2Lifetime147 = DualLinkNode.a("GAMETYPE_TOOLTIPS,1", 0);
          if (var2Lifetime147 != null) {
            NetworkArchiveRequest.field_C[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 59, var2Lifetime147);
          }
          var2Lifetime148 = DualLinkNode.a("GAMETYPE_TOOLTIPS,2", 0);
          if (null != var2Lifetime148) {
            NetworkArchiveRequest.field_C[2] = RoadLayerMaskRenderer.decodeCp1252((byte) 121, var2Lifetime148);
          }
          var2Lifetime149 = DualLinkNode.a("GAMETYPE_TOOLTIPS,7", 0);
          if (null != var2Lifetime149) {
            NetworkArchiveRequest.field_C[7] = RoadLayerMaskRenderer.decodeCp1252((byte) -56, var2Lifetime149);
          }
          var2Lifetime150 = DualLinkNode.a("AI_TOOLTIP", 0);
          if (var2Lifetime150 != null) {
            cd.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) 94, var2Lifetime150);
          }
          var2Lifetime151 = DualLinkNode.a("TOOLTIP_COURSE", 0);
          if (var2Lifetime151 != null) {
            NodeHashTableIterator.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -77, var2Lifetime151);
          }
          var2Lifetime152 = DualLinkNode.a("TOOLTIP_VEHICLE", 0);
          if (var2Lifetime152 != null) {
            SoundPlayback.field_m = RoadLayerMaskRenderer.decodeCp1252((byte) -97, var2Lifetime152);
          }
          var2Lifetime153 = DualLinkNode.a("TOOLTIP_PLAYER1", 0);
          if (null != var2Lifetime153) {
            ArchiveLoadProgress.field_g = RoadLayerMaskRenderer.decodeCp1252((byte) -86, var2Lifetime153);
          }
          var2Lifetime154 = DualLinkNode.a("TOOLTIP_PLAYER2", 0);
          if (null != var2Lifetime154) {
            SocketConnector.field_e = RoadLayerMaskRenderer.decodeCp1252((byte) -30, var2Lifetime154);
          }
          var2Lifetime155 = DualLinkNode.a("TOOLTIP_COURSE_TYPE", 0);
          if (null != var2Lifetime155) {
            vb.field_c = RoadLayerMaskRenderer.decodeCp1252((byte) -65, var2Lifetime155);
          }
          var2Lifetime156 = DualLinkNode.a("PROFILE_NOT_ATTEMPTED", 0);
          if (null != var2Lifetime156) {
            sm.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) -45, var2Lifetime156);
          }
          var2Lifetime157 = DualLinkNode.a("PROFILE_NA", 0);
          if (null != var2Lifetime157) {
            QuickChatPhraseDefinition.field_p = RoadLayerMaskRenderer.decodeCp1252((byte) 120, var2Lifetime157);
          }
          var2Lifetime158 = DualLinkNode.a("PROFILE_LAP_TIME", 0);
          if (var2Lifetime158 != null) {
            NameCheckProgressDialog.field_zb = RoadLayerMaskRenderer.decodeCp1252((byte) -97, var2Lifetime158);
          }
          var2Lifetime159 = DualLinkNode.a("TOOLTIP_CHAMPIONSHIP", 0);
          if (null != var2Lifetime159) {
            TutorialCondition.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -104, var2Lifetime159);
          }
          var2Lifetime160 = DualLinkNode.a("PROFILE_NOT_COMPLETE", 0);
          if (null != var2Lifetime160) {
            NameCheckProgressDialog.field_tb = RoadLayerMaskRenderer.decodeCp1252((byte) 107, var2Lifetime160);
          }
          var2Lifetime161 = DualLinkNode.a("PROFILE_BEST_TIME", 0);
          if (var2Lifetime161 != null) {
            AccountTermsPanel.field_I = RoadLayerMaskRenderer.decodeCp1252((byte) 53, var2Lifetime161);
          }
          var2Lifetime162 = DualLinkNode.a("ALERT_READY", 0);
          if (null != var2Lifetime162) {
            TextHotspotWidget.field_L = RoadLayerMaskRenderer.decodeCp1252((byte) -128, var2Lifetime162);
          }
          var2Lifetime163 = DualLinkNode.a("ALERT_SET", 0);
          if (null != var2Lifetime163) {
            AccountFormText.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -42, var2Lifetime163);
          }
          var2Lifetime164 = DualLinkNode.a("ALERT_GO", 0);
          if (var2Lifetime164 != null) {
            il.field_b = RoadLayerMaskRenderer.decodeCp1252((byte) -50, var2Lifetime164);
          }
          var2Lifetime165 = DualLinkNode.a("ALERT_ZOMBIES", 0);
          if (var2Lifetime165 != null) {
            BoundaryCurve.field_n = RoadLayerMaskRenderer.decodeCp1252((byte) 111, var2Lifetime165);
          }
          var2Lifetime166 = DualLinkNode.a("ALERT_FINISH", 0);
          if (var2Lifetime166 != null) {
            MovingEntity.field_o = RoadLayerMaskRenderer.decodeCp1252((byte) -105, var2Lifetime166);
          }
          var2Lifetime167 = DualLinkNode.a("ALERT_FINAL_LAP", 0);
          if (null != var2Lifetime167) {
            hc.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) 77, var2Lifetime167);
          }
          var2Lifetime168 = DualLinkNode.a("ALERT_ONE_KILL", 0);
          if (var2Lifetime168 != null) {
            UsernameLoginCredentials.field_g = RoadLayerMaskRenderer.decodeCp1252((byte) 104, var2Lifetime168);
          }
          var2Lifetime169 = DualLinkNode.a("ALERT_TWO_KILLS", 0);
          if (null != var2Lifetime169) {
            ij.field_n = RoadLayerMaskRenderer.decodeCp1252((byte) -74, var2Lifetime169);
          }
          var2Lifetime170 = DualLinkNode.a("ALERT_X_KILLS", 0);
          if (var2Lifetime170 != null) {
            SocketJs5Transport.field_p = RoadLayerMaskRenderer.decodeCp1252((byte) 114, var2Lifetime170);
          }
          var2Lifetime171 = DualLinkNode.a("SETTING_NAMES,0", 0);
          if (null != var2Lifetime171) {
            ViewportSizingController.field_t[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 67, var2Lifetime171);
          }
          var2Lifetime172 = DualLinkNode.a("SETTING_NAMES,1", 0);
          if (null != var2Lifetime172) {
            ViewportSizingController.field_t[1] = RoadLayerMaskRenderer.decodeCp1252((byte) -33, var2Lifetime172);
          }
          var2Lifetime173 = DualLinkNode.a("SETTING_NAMES,2", 0);
          if (var2Lifetime173 != null) {
            ViewportSizingController.field_t[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -68, var2Lifetime173);
          }
          var2Lifetime174 = DualLinkNode.a("SETTING_NAMES,3", 0);
          if (null != var2Lifetime174) {
            ViewportSizingController.field_t[3] = RoadLayerMaskRenderer.decodeCp1252((byte) 116, var2Lifetime174);
          }
          if (param0 < 102) {
            return;
          }
          var2Lifetime175 = DualLinkNode.a("SETTING_DESCRIPTIONS,0", 0);
          if (null != var2Lifetime175) {
            sa.field_d[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 69, var2Lifetime175);
          }
          var2Lifetime176 = DualLinkNode.a("SETTING_DESCRIPTIONS,1", 0);
          if (var2Lifetime176 != null) {
            sa.field_d[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 53, var2Lifetime176);
          }
          var2Lifetime177 = DualLinkNode.a("SETTING_DESCRIPTIONS,2", 0);
          if (var2Lifetime177 != null) {
            sa.field_d[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -30, var2Lifetime177);
          }
          var2Lifetime178 = DualLinkNode.a("SETTING_DESCRIPTIONS,3", 0);
          if (null != var2Lifetime178) {
            sa.field_d[3] = RoadLayerMaskRenderer.decodeCp1252((byte) 115, var2Lifetime178);
          }
          var2Lifetime179 = DualLinkNode.a("SETTING_CH_NOT_QUALIFIED,1", 0);
          if (var2Lifetime179 != null) {
            ArchiveLoadProgress.field_a[1] = RoadLayerMaskRenderer.decodeCp1252((byte) -106, var2Lifetime179);
          }
          var2Lifetime180 = DualLinkNode.a("SETTING_CH_NOT_QUALIFIED,2", 0);
          if (var2Lifetime180 != null) {
            ArchiveLoadProgress.field_a[2] = RoadLayerMaskRenderer.decodeCp1252((byte) -125, var2Lifetime180);
          }
          var2Lifetime181 = DualLinkNode.a("SETTING_CH_NOT_QUALIFIED,3", 0);
          if (null != var2Lifetime181) {
            ArchiveLoadProgress.field_a[3] = RoadLayerMaskRenderer.decodeCp1252((byte) 101, var2Lifetime181);
          }
          var2Lifetime182 = DualLinkNode.a("SETTING_NOT_REACHED,1", 0);
          if (var2Lifetime182 != null) {
            TextLineLayout.field_f[1] = RoadLayerMaskRenderer.decodeCp1252((byte) -80, var2Lifetime182);
          }
          var2Lifetime183 = DualLinkNode.a("SETTING_NOT_REACHED,2", 0);
          if (var2Lifetime183 != null) {
            TextLineLayout.field_f[2] = RoadLayerMaskRenderer.decodeCp1252((byte) 108, var2Lifetime183);
          }
          var2Lifetime184 = DualLinkNode.a("SETTING_NOT_REACHED,3", 0);
          if (var2Lifetime184 != null) {
            TextLineLayout.field_f[3] = RoadLayerMaskRenderer.decodeCp1252((byte) -29, var2Lifetime184);
          }
          var2Lifetime185 = DualLinkNode.a("COURSE_NOT_REACHED,0", 0);
          if (null != var2Lifetime185) {
            HoldTheLine.field_G[0] = RoadLayerMaskRenderer.decodeCp1252((byte) 108, var2Lifetime185);
          }
          var2Lifetime186 = DualLinkNode.a("COURSE_NOT_REACHED,1", 0);
          if (null != var2Lifetime186) {
            HoldTheLine.field_G[1] = RoadLayerMaskRenderer.decodeCp1252((byte) 92, var2Lifetime186);
          }
          var2Lifetime187 = DualLinkNode.a("COURSE_NOT_REACHED,2", 0);
          if (var2Lifetime187 != null) {
            HoldTheLine.field_G[2] = RoadLayerMaskRenderer.decodeCp1252((byte) 74, var2Lifetime187);
          }
          var2Lifetime188 = DualLinkNode.a("COURSE_NOT_REACHED,3", 0);
          if (null != var2Lifetime188) {
            HoldTheLine.field_G[3] = RoadLayerMaskRenderer.decodeCp1252((byte) 82, var2Lifetime188);
          }
          var2Lifetime189 = DualLinkNode.a("SETTING_SUBSCRIBER_ONLY", 0);
          if (var2Lifetime189 != null) {
            MarkerSliderRenderer.field_m = RoadLayerMaskRenderer.decodeCp1252((byte) 62, var2Lifetime189);
          }
          var2Lifetime190 = DualLinkNode.a("CARNAME_F1", 0);
          if (null != var2Lifetime190) {
            DelegatingCanvas.field_h = RoadLayerMaskRenderer.decodeCp1252((byte) -57, var2Lifetime190);
          }
          var2Lifetime191 = DualLinkNode.a("CARNAME_TOURER", 0);
          if (null != var2Lifetime191) {
            qh.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -103, var2Lifetime191);
          }
          var2Lifetime192 = DualLinkNode.a("CARNAME_SNOWCAT", 0);
          if (var2Lifetime192 != null) {
            fj.field_p = RoadLayerMaskRenderer.decodeCp1252((byte) -35, var2Lifetime192);
          }
          var2Lifetime193 = DualLinkNode.a("CARNAME_SNOWMOBILE", 0);
          if (var2Lifetime193 != null) {
            UiTheme.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -75, var2Lifetime193);
          }
          var2Lifetime194 = DualLinkNode.a("CARNAME_DRAGSTER", 0);
          if (null != var2Lifetime194) {
            ResizableDialog.field_Q = RoadLayerMaskRenderer.decodeCp1252((byte) 117, var2Lifetime194);
          }
          var2Lifetime195 = DualLinkNode.a("CARNAME_DUNEBUGGY", 0);
          if (var2Lifetime195 != null) {
            TextLineLayout.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) -34, var2Lifetime195);
          }
          var2Lifetime196 = DualLinkNode.a("CARNAME_HATCHBACK", 0);
          if (var2Lifetime196 != null) {
            DualNodeHashTable.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) 68, var2Lifetime196);
          }
          var2Lifetime197 = DualLinkNode.a("CARNAME_SUV", 0);
          if (var2Lifetime197 != null) {
            fe.field_a = RoadLayerMaskRenderer.decodeCp1252((byte) -113, var2Lifetime197);
          }
          var2Lifetime198 = DualLinkNode.a("CARTIP_FORMAT", 0);
          if (null != var2Lifetime198) {
            pe.field_d = RoadLayerMaskRenderer.decodeCp1252((byte) -79, var2Lifetime198);
          }
          PasswordFieldRenderer.field_w = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_709_0 = var2_ref;
          stackIn_709_1 = new StringBuilder().append("rk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_710_2 = "null";
          } else {
            stackIn_710_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_709_0), ((StringBuilder) (Object) stackIn_709_1).append(stackIn_710_2).append(')').toString());
        }
        if (GameAppletShell.field_h) {
          var3++;
          HoldTheLine.field_D = var3;
        }
    }

    final void drawRoadFill(float param0, int[] param1, int param2, int[] param3, byte param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var6 = new int[param3.length + param1.length];
          if (param4 != 49) {
            this.maskSprite = (IndexedSprite) null;
          }
          var7 = 0;
          do {
            if (param3.length <= var7) {
              var7 = 0;
              break;
            }
            var6[var7] = param3[var7];
            var7++;
          } while (var9 == 0);
          while ((param1.length / 2) > var7) {
            var6[param3.length + 2 * var7] = param1[-(var7 * 2) + param1.length - 2];
            var6[1 + (param3.length + var7 * 2)] = param1[-1 + (param1.length - 2 * var7)];
            var7++;
            if (var9 == 0) {
              continue;
            }
            break;
          }
          var8 = this.layerMask;
          if (param2 == 0) {
            var8 = (byte)(var8 << 2);
          }
          if (param2 >= 1) {
            var8 = (byte)(var8 << 4);
          }
          tk.orPolygonMask(var6, (byte) -92, (byte) var8, this.maskSprite);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("rk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    RoadLayerMaskRenderer(IndexedSprite param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.maskSprite = param0;
          this.layerMask = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rk.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
