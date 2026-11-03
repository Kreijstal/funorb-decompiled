/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ri extends TextWidgetPainter {
    static int field_t;
    static String field_s;
    static SortCriterion field_u;
    static String field_v;
    static int field_r;

    final static void updateIdleMovement(byte param0, int param1, CommonGame param2, int param3) {
        FootballerAgent stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        FootballerAgent var16 = null;
        var15 = Kickabout.field_G;
        try {
          var16 = param2.field_P[param3][param1];
          if (var16.action != 0) {
            return;
          }
          var5 = 255 & 19 * ((1 + param3) * (1 + param1)) + param2.aiTick;
          if (param0 != -93) {
            ri.a(113, false, true, 5);
          }
          var6 = var16.pixelX(param0 - 7);
          var7 = var16.pixelY(true);
          var8 = param2.field_V.pixelX(true);
          var9 = param2.field_V.pixelY(879306160);
          if ((var5 & (1 << var16.aiWait) - 1) != 0) {
            if ((1 & var16.directionMask) != 0 &&
              88080384 <= var16.positionY) {
              var16.directionMask = var16.directionMask & -2;
              var16.directionMask = var16.directionMask | 4;
            }
            if ((4 & var16.directionMask) != 0 &&
              var16.positionY <= 0) {
              var16.directionMask = var16.directionMask & -5;
              var16.directionMask = var16.directionMask | 1;
            }
            if (0 != (8 & var16.directionMask) &&
              58720256 <= var16.positionX) {
              var16.directionMask = var16.directionMask & -9;
              var16.directionMask = var16.directionMask | 2;
            }
            if ((var16.directionMask & 2) != 0 &&
              var16.positionX <= 0) {
              var16.directionMask = var16.directionMask & -3;
              var16.directionMask = var16.directionMask | 8;
            }
          } else {
            ParticipantStatus.a(param1, param3, (byte) 103, param2.field_r[param3]);
            var10 = var6 - MatchingTextValidator.field_m[0];
            var11 = -MatchingTextValidator.field_m[1] + var7;
            var12 = 24;
            var13 = 24;
            if ((10 & var16.directionMask) == 0) {
              var12 = var12 << 1;
            }
            if ((5 & var16.directionMask) == 0) {
              var13 = var13 << 1;
            }
            if (Math.abs(var10) <= var12 &&
              Math.abs(var11) <= var13) {
              stackIn_17_0 = var16;
              if (var16.directionMask == 0) {
                stackIn_18_1 = 5;
              } else {
                stackIn_18_1 = 7;
              }
              stackIn_17_0.aiWait = stackIn_18_1;
              var16.directionMask = 0;
            } else {
              var14 = 0;
              if (var12 < var10) {
                var14 = var14 | 2;
              }
              if (var10 < -var12) {
                var14 = var14 | 8;
              }
              if (var13 < var11) {
                var14 = var14 | 4;
              }
              if (-var13 > var11) {
                var14 = var14 | 1;
              }
              if (var16.directionMask != var14) {
                var16.aiWait = 1;
              } else {
                if (var16.aiWait < 4 &&
                  var16.directionMask == var14) {
                  var16.aiWait = var16.aiWait + 1;
                }
              }
              var16.directionMask = var14;
            }
          }
          if (var16.directionMask == 0 &&
            0 == var16.action &&
            var5 % 10 == 0) {
            var16.setDirectionFromMask(PlayerContextMenu.a(true, -var7 + var9, -var6 + var8), 26214);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_59_0 = var4;
          stackIn_59_1 = new StringBuilder().append("ri.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, int[] param1, int param2, IndexedSprite[] param3, ResourceArchive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        int[] var6 = null;
        IndexedSprite[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var20 = null;
        IndexedSprite[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        UiLayoutNode var8 = null;
        UiLayoutNode var9 = null;
        UiLayoutNode var10 = null;
        UiLayoutNode var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        UiLayoutNode var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        CommonGame var19 = null;
        int var7_intLifetime1;
        var18 = Kickabout.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          var21 = DemoIntegersCommand.a(param4, 17369, "lobby", "crowns");
          var5 = var21;
          bk.field_e = var21.length;
          if (param3 != null) {
            var6_array = new IndexedSprite[param3.length + bk.field_e];
            for (var7_int = 0; var7_int < bk.field_e; var7_int++) {
              var6_array[var7_int] = var21[var7_int];
            }
            var5 = var6_array;
            for (var7_int = 0; param3.length > var7_int; var7_int++) {
              var6_array[var7_int + bk.field_e] = param3[var7_int];
            }
            var24 = new int[var5.length];
            var22 = var24;
            var20 = var22;
            var25 = var20;
            var23 = var25;
            var6 = var23;
            var7_int = 0;
          } else {
            var24 = new int[var5.length];
            var22 = var24;
            var20 = var22;
            var25 = var20;
            var23 = var25;
            var6 = var23;
            var7_int = 0;
            decompiledFrameRemainder0 = !(bk.field_e <= var7_int);
            if (decompiledFrameRemainder0) {
              var24[var7_int] = 10;
              var7_int++;
            }
          }
          if (decompiledFrameRemainder0) {
            while (bk.field_e > var7_int) {
              var24[var7_int] = 10;
              var7_int++;
            }
          }
          if (param3 != null) {
            if (param1 != null) {
              for (var7_intLifetime1 = 0; param3.length > var7_intLifetime1; var7_intLifetime1++) {
                var6[var7_intLifetime1 + bk.field_e] = param1[var7_intLifetime1];
              }
            } else {
              for (var7_intLifetime1 = 0; var7_intLifetime1 < param3.length; var7_intLifetime1++) {
                var6[var7_intLifetime1 + bk.field_e] = param3[var7_intLifetime1].field_a;
              }
            }
          }
          sh.field_c = 15;
          DiskCacheWorker.field_b = 4;
          ig.field_c = 11;
          BytePlusOneCommand.field_I = 2;
          mj.field_b = 2;
          var7 = Checkbox.a("largefont", param0, 75, "lobby", param4);
          ServerMessageScreen.field_E = Checkbox.a("generalfont", param0, 87, "lobby", param4);
          CheckboxLabelWidget.field_Ab = Checkbox.a("chatfont", param0, 112, "lobby", param4);
          var7.setInlineImages(var5, var25);
          ServerMessageScreen.field_E.setInlineImages(var5, var25);
          CheckboxLabelWidget.field_Ab.setInlineImages(var5, var25);
          var8 = new UiLayoutNode(0L, (UiLayoutNode) null);
          var8.field_y = 16777215;
          var8.field_X = (BitmapFont) ((Object) var7);
          var8.field_xb = sh.field_c;
          var8.field_p = 1;
          var9 = var8;
          var9.field_A = 1;
          var10 = new UiLayoutNode(0L, (UiLayoutNode) null);
          var10.field_y = 16777215;
          if (param2 > -51) {
            var19 = (CommonGame) null;
            ri.updateIdleMovement((byte) -76, -14, (CommonGame) null, 71);
          }
          var10.field_X = (BitmapFont) ((Object) ServerMessageScreen.field_E);
          var10.field_xb = sh.field_c;
          var10.field_p = 1;
          var11 = var10;
          var11.field_A = 1;
          LeaguesHelpScreen.field_H = new UiLayoutNode(0L, var8);
          LeaguesHelpScreen.field_H.field_R = ClientException.a(ModalStack.a(param4, -22, "lobby", "heading"), (byte) 86);
          DoSomethingCommand.field_B = new UiLayoutNode(0L, (UiLayoutNode) null);
          DoSomethingCommand.field_B.field_R = NotCommand.a(120, false, 8421504, 4210752, false, (byte) -46);
          r.field_c = new UiLayoutNode(0L, (UiLayoutNode) null);
          r.field_c.field_R = fs.a(114, 3, 1, 6316128, 6316128, (byte) 92);
          StrongCacheEntry.field_u = new UiLayoutNode(0L, (UiLayoutNode) null);
          StrongCacheEntry.field_u.field_R = ClientException.a(ModalStack.a(param4, 81, "lobby", "popup"), (byte) 63);
          var12 = ClientException.a(ModalStack.a(param4, -125, "lobby", "popup_mouseover"), (byte) -4);
          var13 = ModalStack.a(param4, -122, "lobby", "button");
          var14 = ClientException.a(ModalStack.a(param4, -122, "lobby", "tab_active"), (byte) 61);
          AccountTermsPanel.field_H = new UiLayoutNode(0L, var8);
          AccountTermsPanel.field_H.field_R = var14;
          hl.field_f = new UiLayoutNode(0L, (UiLayoutNode) null);
          hl.field_f.field_N = wa.a((byte) 127, "lobby", param4, "closebutton");
          hl.field_f.field_vb = wa.a((byte) 114, "lobby", param4, "closebutton_mouseover");
          IntValueNode.field_i = new UiLayoutNode(0L, var8);
          IntValueNode.field_i.field_R = NotCommand.a(40, true, 3815994, 2039583, true, (byte) -46);
          TrinketIcon.field_zb = new UiLayoutNode(0L, var10);
          TrinketIcon.field_zb.field_kb = 2;
          TrinketIcon.field_zb.field_R = NotCommand.a(30, false, 3815994, 2039583, true, (byte) -46);
          gw.field_a = new UiLayoutNode(0L, var10);
          gw.field_a.field_kb = 2;
          gw.field_a.field_R = NotCommand.a(30, false, 3815994, 2039583, false, (byte) -46);
          SquadPickerDialog.field_P = new UiLayoutNode(0L, var10);
          SquadPickerDialog.field_P.field_kb = 2;
          SquadPickerDialog.field_P.field_R = NotCommand.a(30, true, 3815994, 2039583, false, (byte) -46);
          ConsoleEvaluationException.field_e = new UiLayoutNode(0L, (UiLayoutNode) null);
          ConsoleEvaluationException.field_e.field_X = (BitmapFont) ((Object) ServerMessageScreen.field_E);
          ConsoleEvaluationException.field_e.field_y = 13421772;
          ConsoleEvaluationException.field_e.field_xb = sh.field_c;
          ConsoleEvaluationException.field_e.field_p = 1;
          ul.field_c = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          ul.field_c.field_hb = 8421504;
          ul.field_c.field_H = 16777215;
          ul.field_c.field_ab = 16777215;
          ul.field_c.field_ub = 16777215;
          ul.field_c.field_y = 16764006;
          var15 = new UiLayoutNode(0L, ul.field_c);
          var15.field_y = 16777215;
          var15.field_X = (BitmapFont) ((Object) var7);
          var15.field_xb = sh.field_c;
          ip.field_c = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          ip.field_c.field_R = NotCommand.a(16, false, 2236962, 2236962, false, (byte) -46);
          ip.field_c.field_kb = 2;
          kr.field_b = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          kr.field_b.field_R = NotCommand.a(16, false, 1513239, 1513239, false, (byte) -46);
          kr.field_b.field_kb = 2;
          AuctionSettingsDialog.field_J = new UiLayoutNode(0L, ip.field_c);
          AuctionSettingsDialog.field_J.applyStyle(ul.field_c, (byte) -100);
          mp.field_f = new UiLayoutNode(0L, kr.field_b);
          mp.field_f.applyStyle(ul.field_c, (byte) -85);
          var16 = ModalStack.a(param4, 108, "lobby", "button_mouseover");
          su.field_b = new ContextMenu(StrongCacheEntry.field_u, var12, ConsoleEvaluationException.field_e, ul.field_c, 3, 2, mj.field_b, 3, sh.field_c);
          MouseWheelInput.field_e = new UiLayoutNode(0L, ul.field_c);
          MouseWheelInput.field_e.field_R = var13;
          MouseWheelInput.field_e.field_eb = 1;
          MouseWheelInput.field_e.field_S = var16;
          MouseWheelInput.field_e.field_O = 1;
          MouseWheelInput.field_e.field_cb = 1;
          MouseWheelInput.field_e.field_x = 1;
          MouseWheelInput.field_e.field_rb = ModalStack.a(param4, 7, "lobby", "button_mouseheld");
          MouseWheelInput.field_e.field_u = ModalStack.a(param4, -119, "lobby", "button_active");
          MouseWheelInput.field_e.field_tb = ModalStack.a(param4, -119, "lobby", "button_disabled");
          MouseWheelInput.field_e.field_A = 1;
          MatchingTextValidator.field_n = new UiLayoutNode(0L, ul.field_c);
          MatchingTextValidator.field_n.field_A = 1;
          MatchingTextValidator.field_n.field_R = ClientException.a(ModalStack.a(param4, 6, "lobby", "tab_inactive"), (byte) 49);
          MatchingTextValidator.field_n.field_S = ClientException.a(ModalStack.a(param4, -125, "lobby", "tab_mouseover"), (byte) 37);
          MatchingTextValidator.field_n.field_u = var14;
          MouseInputHandler.field_b = new UiLayoutNode(0L, (UiLayoutNode) null);
          MouseInputHandler.field_b.field_R = fs.a(206, 3, -1, 1856141, 1127256, (byte) 91);
          AudioService.field_g = new UiLayoutNode(0L, (UiLayoutNode) null);
          AudioService.field_g.field_R = fs.a(290, 3, -1, 11579568, 6052956, (byte) 118);
          TextFieldNode.field_Qb = new UiLayoutNode(0L, var15);
          TextFieldNode.field_Qb.field_A = 1;
          TextFieldNode.field_Qb.field_eb = 1;
          TextFieldNode.field_Qb.field_cb = 1;
          TextFieldNode.field_Qb.field_x = 1;
          TextFieldNode.field_Qb.field_O = 1;
          dc.field_a = new UiLayoutNode(0L, TextFieldNode.field_Qb);
          um.field_d = new UiLayoutNode(0L, ul.field_c);
          um.field_d.field_cb = 1;
          um.field_d.field_O = 1;
          um.field_d.field_A = 1;
          um.field_d.field_x = 1;
          um.field_d.field_eb = 1;
          LoggedPlayer.field_r = new UiLayoutNode(0L, um.field_d);
          DisplayNameForm.field_F = new UiLayoutNode(0L, um.field_d);
          LongPlusOneCommand.field_D = new UiLayoutNode(0L, TextFieldNode.field_Qb);
          TrinketPickerDialog.field_F = new UiLayoutNode(0L, um.field_d);
          nj.field_d = new UiLayoutNode(0L, um.field_d);
          k.field_f = new UiLayoutNode(0L, um.field_d);
          um.field_d.field_R = ClientException.a(ModalStack.a(param4, 81, "lobby", "smallbutton"), (byte) 47);
          um.field_d.field_S = ClientException.a(ModalStack.a(param4, -4, "lobby", "smallbutton_mouseover"), (byte) 68);
          dupTemp$0 = ClientException.a(ModalStack.a(param4, -128, "lobby", "smallbutton_active"), (byte) -124);
          um.field_d.field_u = dupTemp$0;
          um.field_d.field_rb = dupTemp$0;
          um.field_d.field_tb = ClientException.a(ModalStack.a(param4, 89, "lobby", "smallbutton_disabled"), (byte) 12);
          dc.field_a.field_R = ClientException.a(ModalStack.a(param4, -31, "lobby", "mediumbutton"), (byte) -25);
          dc.field_a.field_S = ClientException.a(ModalStack.a(param4, -122, "lobby", "mediumbutton_mouseover"), (byte) 52);
          dc.field_a.field_rb = ClientException.a(ModalStack.a(param4, 62, "lobby", "mediumbutton_mouseheld"), (byte) 87);
          TextFieldNode.field_Qb.field_R = ClientException.a(ModalStack.a(param4, 87, "lobby", "bigbutton"), (byte) 7);
          TextFieldNode.field_Qb.field_S = ClientException.a(ModalStack.a(param4, 46, "lobby", "bigbutton_mouseover"), (byte) -127);
          TextFieldNode.field_Qb.field_rb = ClientException.a(ModalStack.a(param4, 29, "lobby", "bigbutton_mouseheld"), (byte) -103);
          TextFieldNode.field_Qb.field_tb = ClientException.a(ModalStack.a(param4, -123, "lobby", "bigbutton_disabled"), (byte) 126);
          LoggedPlayer.field_r.field_R = ClientException.a(ModalStack.a(param4, -10, "lobby", "greenbutton"), (byte) 25);
          LoggedPlayer.field_r.field_S = ClientException.a(ModalStack.a(param4, 92, "lobby", "greenbutton_mouseover"), (byte) -112);
          LoggedPlayer.field_r.field_rb = ClientException.a(ModalStack.a(param4, -39, "lobby", "greenbutton_mouseheld"), (byte) -26);
          DisplayNameForm.field_F.field_R = ClientException.a(ModalStack.a(param4, -123, "lobby", "redbutton"), (byte) 93);
          DisplayNameForm.field_F.field_S = ClientException.a(ModalStack.a(param4, -124, "lobby", "redbutton_mouseover"), (byte) -121);
          DisplayNameForm.field_F.field_rb = ClientException.a(ModalStack.a(param4, -37, "lobby", "redbutton_mouseheld"), (byte) -101);
          LongPlusOneCommand.field_D.field_R = ClientException.a(ModalStack.a(param4, -127, "lobby", "backbutton"), (byte) -116);
          LongPlusOneCommand.field_D.field_S = ClientException.a(ModalStack.a(param4, -119, "lobby", "backbutton_mouseover"), (byte) -110);
          LongPlusOneCommand.field_D.field_rb = ClientException.a(ModalStack.a(param4, 25, "lobby", "backbutton_mouseheld"), (byte) -3);
          LongPlusOneCommand.field_D.field_tb = ClientException.a(ModalStack.a(param4, 0, "lobby", "backbutton_disabled"), (byte) -99);
          k.field_f.field_R = ClientException.a(ModalStack.a(param4, 8, "lobby", "gameoptionbutton"), (byte) -20);
          k.field_f.field_S = ClientException.a(ModalStack.a(param4, 53, "lobby", "gameoptionbutton_mouseover"), (byte) -5);
          dupTemp$1 = ClientException.a(ModalStack.a(param4, -124, "lobby", "gameoptionbutton_active"), (byte) -121);
          k.field_f.field_u = dupTemp$1;
          k.field_f.field_rb = dupTemp$1;
          k.field_f.field_tb = ClientException.a(ModalStack.a(param4, 63, "lobby", "gameoptionbutton_disabled"), (byte) -109);
          TrinketPickerDialog.field_F.field_R = ClientException.a(ModalStack.a(param4, 31, "lobby", "chatbutton"), (byte) -113);
          TrinketPickerDialog.field_F.field_S = ClientException.a(ModalStack.a(param4, -127, "lobby", "chatbutton_mouseover"), (byte) 74);
          dupTemp$2 = ClientException.a(ModalStack.a(param4, 11, "lobby", "chatbutton_active"), (byte) -124);
          TrinketPickerDialog.field_F.field_u = dupTemp$2;
          TrinketPickerDialog.field_F.field_rb = dupTemp$2;
          nj.field_d.field_R = ClientException.a(ModalStack.a(param4, -123, "lobby", "chatfilterbutton"), (byte) 9);
          nj.field_d.field_S = ClientException.a(ModalStack.a(param4, -127, "lobby", "chatfilterbutton_mouseover"), (byte) 33);
          dupTemp$3 = ClientException.a(ModalStack.a(param4, -123, "lobby", "chatfilterbutton_active"), (byte) -121);
          nj.field_d.field_u = dupTemp$3;
          nj.field_d.field_rb = dupTemp$3;
          var17 = ModalStack.a(param4, -121, "lobby", "checkbox");
          MatchPhaseView.field_d = new IconLabel(0L, var17[1], var17[0], 1, ul.field_c, (String) null);
          ScrollPane.field_Hb = new UiLayoutNode(0L, (UiLayoutNode) null);
          ScrollPane.field_Hb.field_R = kh.a((byte) -83, wa.a((byte) 98, "lobby", param4, "slideregion"));
          ScrollPane.field_Hb.field_S = kh.a((byte) -96, wa.a((byte) 113, "lobby", param4, "slideregion_mouseover"));
          ScrollPane.field_Hb.field_rb = kh.a((byte) -86, wa.a((byte) 116, "lobby", param4, "slideregion_mouseheld"));
          ScrollPane.field_Hb.field_tb = kh.a((byte) -108, wa.a((byte) 127, "lobby", param4, "slideregion_disabled"));
          ts.field_a = new UiLayoutNode(0L, (UiLayoutNode) null);
          ts.field_a.field_R = ClientException.a(ModalStack.a(param4, 108, "lobby", "dragbar"), (byte) 8);
          ts.field_a.field_S = ClientException.a(ModalStack.a(param4, 46, "lobby", "dragbar_mouseover"), (byte) -24);
          ts.field_a.field_rb = ClientException.a(ModalStack.a(param4, -119, "lobby", "dragbar_mouseheld"), (byte) -123);
          ts.field_a.field_tb = ClientException.a(ModalStack.a(param4, -27, "lobby", "dragbar_disabled"), (byte) -127);
          sd.field_a = new UiLayoutNode(0L, (UiLayoutNode) null);
          sd.field_a.field_N = wa.a((byte) 110, "lobby", param4, "upbutton");
          sd.field_a.field_vb = wa.a((byte) 116, "lobby", param4, "upbutton_mouseover");
          sd.field_a.field_r = wa.a((byte) 117, "lobby", param4, "upbutton_mouseheld");
          sd.field_a.field_t = wa.a((byte) 99, "lobby", param4, "upbutton_disabled");
          IterableDualLinkDeque.field_b = new UiLayoutNode(0L, (UiLayoutNode) null);
          IterableDualLinkDeque.field_b.field_N = wa.a((byte) 108, "lobby", param4, "downbutton");
          IterableDualLinkDeque.field_b.field_vb = wa.a((byte) 108, "lobby", param4, "downbutton_mouseover");
          IterableDualLinkDeque.field_b.field_r = wa.a((byte) 115, "lobby", param4, "downbutton_mouseheld");
          IterableDualLinkDeque.field_b.field_t = wa.a((byte) 119, "lobby", param4, "downbutton_disabled");
          uk.field_b = new VerticalScrollbar(0L, sd.field_a, IterableDualLinkDeque.field_b, ScrollPane.field_Hb, ts.field_a);
          BroadcastServerCommand.field_D = new FriendsListPanel(0L, (UiLayoutNode) null, SoundCache.field_b, uk.field_b, um.field_d, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("ri.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static ArgbSprite a(ArgbSprite param0, boolean param1) {
        int var3_int = 0;
        ArgbSprite stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ArgbSprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        Sprite var10 = null;
        int var11 = 0;
        Sprite var12 = null;
        int var4Lifetime1;
        var8 = Kickabout.field_G;
        try {
          var10 = new Sprite(param0.field_o, param0.field_v);
          var12 = var10;
          for (var3_int = 0; var3_int < var12.field_y.length; var3_int++) {
            if (param0.field_y[var3_int] >>> 24 > 170) {
              var10.field_y[var3_int] = 8947848;
            }
          }
          var3 = new ArgbSprite(param0.field_o, param0.field_v);
          PacketBuffer.a(-54, var3);
          SoftwareRasterizer.fillRect(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, 6710886);
          for (var4 = 2; 10 > var4; var4++) {
            var5 = (-var4 + 12 << 7) / 13;
            var6 = param0.field_o - var4;
            var7 = var4 / 4 + var4;
            var12.c(var7, var4 / 5 + var7, var6, var6, 65793 * var5);
          }
          TeamManagementScreen.e(125);
          if (!param1) {
            var9 = (CharSequence) null;
            ri.a((CharSequence) null, (byte) 122);
          }
          var11 = 0;
          var4Lifetime1 = var11;
          while (var3.field_y.length > var11) {
            var3.field_y[var11] = PainterStyle.a(TextLayoutLine.b(var3.field_y[var11], 16777215), TextLayoutLine.b(param0.field_y[var11], -16777216));
            var11++;
          }
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ri.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        try {
          if (param1) {
            kj.a(12105912, param2 + param3.field_g, param3.field_t + param4, param3.field_i, param3.field_n);
          }
          super.drawWidget(-21, param1, param2, param3, param4);
          int var6_int = 92 % ((59 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ri.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    ri(int param0) {
        this(gf.field_a, param0);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        UiLayoutNode stackIn_23_0 = null;
        String stackIn_24_1 = null;
        UiLayoutNode stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        String stackIn_27_2 = null;
        String stackIn_54_0 = null;
        UiLayoutNode stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        UiLayoutNode stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        boolean stackIn_71_2 = false;
        UiLayoutNode stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        boolean stackIn_76_2 = false;
        int stackIn_78_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        UiLayoutNode var5 = null;
        UiLayoutNode var6 = null;
        UiLayoutNode var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        String var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var12Lifetime1;
        int var10_intLifetime1;
        int var11Lifetime1;
        var13 = Kickabout.field_G;
        try {
          var4_int = -109 / ((-55 - param0) / 60);
          ConsoleEvaluationException.a(127, fj.field_a);
          if (null != ArchiveSource.field_b) {
            var5 = DualLinkHashTable.field_d;
            DualLinkHashTable.field_d.field_mb = 0;
            var5.field_q = 0;
            GoalStateAgent.field_k.field_mb = 0;
            var6 = GoalStateAgent.field_k;
            var6.field_q = 0;
            nv.field_F.field_mb = 0;
            var7 = nv.field_F;
            var7.field_q = 0;
            IterableDualLinkDeque.field_h.field_E = qn.field_d.toUpperCase();
            var8 = (2 + AuctionItem.field_p.field_q) / 2;
            nv.field_F.setBounds(true, -2 + var8, 0, -40 + AuctionItem.field_p.field_mb, 40);
            GoalStateAgent.field_k.setBounds(true, -var8 + AuctionItem.field_p.field_q, var8, -40 + AuctionItem.field_p.field_mb, 40);
            if (rn.field_d.length == 1 &&
              rn.field_d[0] == 2) {
              var9 = 0;
            } else {
              var9 = 0;
              var10_int = 0;
              var11 = 0;
              while (true) {
                if (var11 < rn.field_d.length) {
                  stackIn_10_0 = ((er.field_h[var11 / 8] & 1 << (var11 & 7)) == 0) ? 0 : 1;
                  var12_int = stackIn_10_0;
                  if (var12_int != 0) {
                    var10_int++;
                  }
                  if (var12_int != 0 &&
                    rn.field_d[var11] != 2) {
                    var9 = 1;
                  } else {
                    var11++;
                    continue;
                  }
                }
                if (var10_int != 0) {
                  break;
                }
                var9 = 1;
                break;
              }
            }
            GoalStateAgent.field_k.field_lb = true;
            if (InstrumentNoteMask.field_k) {
              TrinketUnlockNotice.field_b.field_lb = false;
              DialogOverlay.field_e.field_E = qr.field_c;
              if (var9 == 0) {
                stackIn_54_0 = ea.field_g;
              } else {
                stackIn_54_0 = rl.field_s;
              }
              var15 = stackIn_54_0;
              var10 = var15;
              var10 = var15;
              var10 = var15;
              var11Lifetime1 = nv.field_F.field_X.a(var15) + nv.field_F.field_X.charWidth('.') * 3;
              if (16 == (GameKeyHandler.field_c & 48)) {
                var10 = var15 + ".";
              }
              nv.field_F.field_A = 0;
              nv.field_F.field_kb = (nv.field_F.field_q - var11Lifetime1) / 2;
              if ((GameKeyHandler.field_c & 48) == 32) {
                var10 = (String) (var10) + "..";
              }
              if (48 == (48 & GameKeyHandler.field_c)) {
                var10 = (String) (var10) + "...";
              }
              nv.field_F.field_E = (String) (var10);
              GoalStateAgent.field_k.field_E = vt.field_a.toUpperCase();
            } else {
              stackIn_23_0 = GoalStateAgent.field_k;
              if (var9 != 0) {
                stackIn_24_1 = AuctionListingDialog.field_F;
              } else {
                stackIn_24_1 = wp.field_e;
              }
              stackIn_23_0.field_E = ((String) (Object) stackIn_24_1).toUpperCase();
              stackIn_26_0 = DialogOverlay.field_e;
              stackIn_26_1 = -18;
              if (var9 != 0) {
                stackIn_27_2 = MenuSelection.field_j;
              } else {
                stackIn_27_2 = vr.field_b;
              }
              stackIn_26_0.field_E = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(stackIn_26_1, stackIn_27_2, new String[]{GoalStateAgent.field_k.field_E});
              nv.field_F.field_E = CheckboxLabelWidget.field_Db;
              TrinketUnlockNotice.field_b.field_lb = true;
              tt.field_c = true;
              if (null != PlayArea.field_k) {
                ee.field_e = false;
                tt.field_c = false;
                if (SumIntegersCommand.field_G == null) {
                  WhirlpoolHasher.field_f = new boolean[ss.field_j];
                  SumIntegersCommand.field_G = new byte[ss.field_j];
                }
                var14 = 0;
                var10_intLifetime1 = var14;
                while (var14 < ss.field_j) {
                  WhirlpoolHasher.field_f[var14] = false;
                  var14++;
                }
                pl.a(0, ss.field_j, ArchiveSource.field_b, -1, (byte) -121, -1, -1, true);
                if (!(2 > ScrollContainer.field_Ib) &&
                  GameplayHelpScreen.field_G[12]) {
                  tt.field_c = true;
                }
              }
              if (!tt.field_c) {
                GoalStateAgent.field_k.field_lb = false;
                if (GoalStateAgent.field_k.field_Q) {
                  var10 = null;
                  if (ee.field_e) {
                    var10 = "<col=A00000>" + Checkbox.field_H + "</col>";
                    var12 = var10;
                    var10 = var12;
                    var12Lifetime1 = var10;
                    var10 = var12Lifetime1;
                  }
                  for (var11Lifetime1 = 0; var11Lifetime1 < ss.field_j; var11Lifetime1++) {
                    if (WhirlpoolHasher.field_f[var11Lifetime1]) {
                      var12_ref = "<col=A00000>" + ok.field_b[var11Lifetime1] + "</col>";
                      var10 = var12_ref;
                      var10 = var12_ref;
                      if (var10 != null) {
                        var10 = (String) (var10) + ", " + var12_ref;
                      } else {
                        var10 = var12_ref;
                      }
                    }
                  }
                  UrlRequest.field_e = "<col=A00000>" + op.field_t + "<br>" + DirectByteStorage.field_h + (String) (var10);
                }
              }
            }
          }
          stackIn_65_0 = TrinketIcon.field_Cb;
          stackIn_65_1 = 0;
          stackIn_66_2 = (param2) && (!param1) && (!TrinketCatalog.field_b);
          ((UiLayoutNode) (Object) stackIn_65_0).updateInput(stackIn_65_1, stackIn_66_2);
          stackIn_70_0 = AuctionItem.field_p;
          stackIn_70_1 = 0;
          stackIn_71_2 = (param2) && (!param1) && (!TrinketCatalog.field_b);
          ((UiLayoutNode) (Object) stackIn_70_0).updateInput(stackIn_70_1, stackIn_71_2);
          stackIn_75_0 = tn.field_f;
          stackIn_75_1 = 0;
          stackIn_76_2 = (param2) && (!param1) && (TrinketCatalog.field_b);
          ((UiLayoutNode) (Object) stackIn_75_0).updateInput(stackIn_75_1, stackIn_76_2);
          ni.field_l.field_b.h((byte) 118);
          if (null != ArchiveSource.field_b) {
            stackIn_78_0 = 0;
            if (stackIn_78_0 != TrinketUnlockNotice.field_b.field_sb) {
              nv.a(param3, 32361);
            }
            if (GoalStateAgent.field_k.field_sb != 0) {
              if (InstrumentNoteMask.field_k) {
                mp.a(param3, (byte) 79);
              } else {
                PlayerStats.a(param3, 0);
              }
            }
            NetworkGameClient.a(param3, (byte) -127, ArchiveSource.field_b, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var4), "ri.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ri(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static String a(CharSequence param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_5_0 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1 != -100) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ri.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        if (!param0) {
          field_s = (String) null;
        }
        field_s = null;
        field_v = null;
    }

    static {
        field_s = "Pending";
        field_v = "to go straight into a multiplayer Exhibition Game with a preset team";
        field_r = 200;
        field_u = (SortCriterion) ((Object) new TrinketCountSortCriterion());
    }
}
