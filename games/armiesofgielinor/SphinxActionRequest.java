/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SphinxActionRequest extends ActionRequest {
    private int sphinxY;
    static int[] keyStateEvents;
    private int sphinxX;
    static ClientUiComponent field_A;
    private ActionRequest delegatedRequest;
    static ModalDialogHost field_v;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        bj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (bj) (ArchiveIndex.field_o.first((byte) 121));
          while (var4 != null) {
            SoundPlaybackHandle.a(param0, var4, -17006);
            var4 = (bj) (ArchiveIndex.field_o.next((byte) 123));
          }
          if (param1 <= 33) {
            field_v = (ModalDialogHost) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ee.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(IndexedSprite[] param0, ResourceArchive param1, int param2, int[] param3, ResourceArchive param4) {
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
        ClientUiComponent var8 = null;
        ClientUiComponent var9 = null;
        ClientUiComponent var10 = null;
        ClientUiComponent var11 = null;
        RgbSprite[] var12 = null;
        RgbSprite[] var13 = null;
        RgbSprite[] var14 = null;
        ClientUiComponent var15 = null;
        RgbSprite[] var16 = null;
        RgbSprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var20 = MapLayout.loadIndexedSpritesByName("crowns", -28106, "lobby", param1);
          var5 = var20;
          PacketBuffer.field_n = var20.length;
          if (param0 != null) {
            var6 = new IndexedSprite[param0.length + PacketBuffer.field_n];
            for (var7_int = 0; var7_int < PacketBuffer.field_n; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param0.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + PacketBuffer.field_n] = param0[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; PacketBuffer.field_n > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param0 != null) {
            if (param3 != null) {
              for (var7_intLifetime2 = 0; param0.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[PacketBuffer.field_n + var7_intLifetime2] = param3[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param0.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + PacketBuffer.field_n] = param0[var7_intLifetime2].canvasHeight;
              }
            }
          }
          gl.field_c = 2;
          is.field_b = 11;
          MusicPatchNode.field_l = 4;
          MusicPatch.field_n = 2;
          jn.field_d = 15;
          var7 = DropdownArrowPainter.a("lobby", param1, param4, (byte) -53, "largefont");
          t.field_a = DropdownArrowPainter.a("lobby", param1, param4, (byte) -53, "generalfont");
          LeaderEscortCondition.field_f = DropdownArrowPainter.a("lobby", param1, param4, (byte) -53, "chatfont");
          var7.setInlineSprites(var5, var24);
          t.field_a.setInlineSprites(var5, var24);
          LeaderEscortCondition.field_f.setInlineSprites(var5, var24);
          var8 = new ClientUiComponent(0L, (ClientUiComponent) null);
          var8.font = (BitmapFont) ((Object) var7);
          var8.textColour = 16777215;
          var8.textLineSpacing = jn.field_d;
          var8.verticalAlignment = 1;
          var9 = var8;
          var9.horizontalAlignment = 1;
          var10 = new ClientUiComponent(0L, (ClientUiComponent) null);
          var10.textColour = 16777215;
          var10.font = (BitmapFont) ((Object) t.field_a);
          var10.textLineSpacing = jn.field_d;
          var10.verticalAlignment = 1;
          var11 = var10;
          var11.horizontalAlignment = 1;
          SummonAction.field_y = new ClientUiComponent(0L, var8);
          SummonAction.field_y.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("heading", (byte) -126, param1, "lobby"));
          ClientUiNode.field_x = new ClientUiComponent(0L, (ClientUiComponent) null);
          ClientUiNode.field_x.skinSprites = SetCoatConsoleCommand.a(false, 4210752, -20600, 120, false, 8421504);
          qc.field_e = new ClientUiComponent(0L, (ClientUiComponent) null);
          qc.field_e.skinSprites = tq.a(6316128, false, 114, 1, 3, 6316128);
          kq.field_N = new ClientUiComponent(0L, (ClientUiComponent) null);
          kq.field_N.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("popup", (byte) -127, param1, "lobby"));
          var12 = wj.a(-12310, fk.loadRgbSpritesByName("popup_mouseover", (byte) -124, param1, "lobby"));
          var13 = fk.loadRgbSpritesByName("button", (byte) -125, param1, "lobby");
          var14 = wj.a(-12310, fk.loadRgbSpritesByName("tab_active", (byte) -124, param1, "lobby"));
          UnitModelPreview.field_m = new ClientUiComponent(0L, var8);
          UnitModelPreview.field_m.skinSprites = var14;
          uc.field_b = new ClientUiComponent(0L, (ClientUiComponent) null);
          uc.field_b.sprite = GameplayController.a("closebutton", (byte) 51, "lobby", param1);
          uc.field_b.matchedButtonSprite = GameplayController.a("closebutton_mouseover", (byte) 51, "lobby", param1);
          rn.field_a = new ClientUiComponent(0L, var8);
          rn.field_a.skinSprites = SetCoatConsoleCommand.a(true, 2039583, -20600, 40, true, 3815994);
          SoundPlaybackHandle.field_p = new ClientUiComponent(0L, var10);
          SoundPlaybackHandle.field_p.textHorizontalPadding = 2;
          SoundPlaybackHandle.field_p.skinSprites = SetCoatConsoleCommand.a(true, 2039583, -20600, 30, false, 3815994);
          CampaignResult.field_a = new ClientUiComponent(0L, var10);
          CampaignResult.field_a.textHorizontalPadding = 2;
          CampaignResult.field_a.skinSprites = SetCoatConsoleCommand.a(false, 2039583, -20600, 30, false, 3815994);
          br.field_e = new ClientUiComponent(0L, var10);
          br.field_e.textHorizontalPadding = 2;
          br.field_e.skinSprites = SetCoatConsoleCommand.a(false, 2039583, -20600, 30, true, 3815994);
          eq.field_h = new ClientUiComponent(0L, (ClientUiComponent) null);
          eq.field_h.font = (BitmapFont) ((Object) t.field_a);
          eq.field_h.textLineSpacing = jn.field_d;
          eq.field_h.verticalAlignment = 1;
          eq.field_h.textColour = 13421772;
          DualLinkedNode.field_k = new ClientUiComponent(0L, eq.field_h);
          DualLinkedNode.field_k.selectedTextColour = 16777215;
          DualLinkedNode.field_k.disabledTextColour = 8421504;
          DualLinkedNode.field_k.textColour = 16764006;
          DualLinkedNode.field_k.heldPressTextColour = 16777215;
          if (param2 >= -38) {
            field_v = (ModalDialogHost) null;
          }
          DualLinkedNode.field_k.matchedButtonTextColour = 16777215;
          var15 = new ClientUiComponent(0L, DualLinkedNode.field_k);
          var15.textLineSpacing = jn.field_d;
          var15.textColour = 16777215;
          var15.font = (BitmapFont) ((Object) var7);
          ke.field_e = new ClientUiComponent(0L, eq.field_h);
          ke.field_e.skinSprites = SetCoatConsoleCommand.a(false, 2236962, -20600, 16, false, 2236962);
          ke.field_e.textHorizontalPadding = 2;
          IconLabelControl.field_Lb = new ClientUiComponent(0L, eq.field_h);
          IconLabelControl.field_Lb.skinSprites = SetCoatConsoleCommand.a(false, 1513239, -20600, 16, false, 1513239);
          IconLabelControl.field_Lb.textHorizontalPadding = 2;
          ws.field_P = new ClientUiComponent(0L, ke.field_e);
          ws.field_P.applyStyle(0, DualLinkedNode.field_k);
          IsaacRandom.field_i = new ClientUiComponent(0L, IconLabelControl.field_Lb);
          IsaacRandom.field_i.applyStyle(0, DualLinkedNode.field_k);
          var16 = fk.loadRgbSpritesByName("button_mouseover", (byte) -128, param1, "lobby");
          AnimationSequence.field_h = new ContextActionMenu(kq.field_N, var12, eq.field_h, DualLinkedNode.field_k, 3, 2, MusicPatch.field_n, 3, jn.field_d);
          lu.field_u = new ClientUiComponent(0L, DualLinkedNode.field_k);
          lu.field_u.skinSprites = var13;
          lu.field_u.heldPressOffsetX = 1;
          lu.field_u.selectedOffsetY = 1;
          lu.field_u.selectedOffsetX = 1;
          lu.field_u.heldPressOffsetY = 1;
          lu.field_u.matchedButtonSkinSprites = var16;
          lu.field_u.heldPressSkinSprites = fk.loadRgbSpritesByName("button_mouseheld", (byte) -127, param1, "lobby");
          lu.field_u.selectedSkinSprites = fk.loadRgbSpritesByName("button_active", (byte) -124, param1, "lobby");
          lu.field_u.disabledSkinSprites = fk.loadRgbSpritesByName("button_disabled", (byte) -126, param1, "lobby");
          lu.field_u.horizontalAlignment = 1;
          h.field_d = new ClientUiComponent(0L, DualLinkedNode.field_k);
          h.field_d.horizontalAlignment = 1;
          h.field_d.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("tab_inactive", (byte) -127, param1, "lobby"));
          h.field_d.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("tab_mouseover", (byte) -124, param1, "lobby"));
          h.field_d.selectedSkinSprites = var14;
          wm.field_c = new ClientUiComponent(0L, (ClientUiComponent) null);
          wm.field_c.skinSprites = tq.a(1856141, false, 206, -1, 3, 1127256);
          sh.field_m = new ClientUiComponent(0L, (ClientUiComponent) null);
          sh.field_m.skinSprites = tq.a(11579568, false, 290, -1, 3, 6052956);
          ConsoleValue.field_a = new ClientUiComponent(0L, var15);
          ConsoleValue.field_a.horizontalAlignment = 1;
          ConsoleValue.field_a.heldPressOffsetX = 1;
          ConsoleValue.field_a.selectedOffsetX = 1;
          ConsoleValue.field_a.heldPressOffsetY = 1;
          ConsoleValue.field_a.selectedOffsetY = 1;
          bw.field_h = new ClientUiComponent(0L, ConsoleValue.field_a);
          ClientUiComponent.field_Q = new ClientUiComponent(0L, DualLinkedNode.field_k);
          ClientUiComponent.field_Q.heldPressOffsetY = 1;
          ClientUiComponent.field_Q.heldPressOffsetX = 1;
          ClientUiComponent.field_Q.selectedOffsetY = 1;
          ClientUiComponent.field_Q.selectedOffsetX = 1;
          ClientUiComponent.field_Q.horizontalAlignment = 1;
          QuickChatPhraseRepository.field_d = new ClientUiComponent(0L, ClientUiComponent.field_Q);
          ContentTransitionDialog.field_X = new ClientUiComponent(0L, ClientUiComponent.field_Q);
          kd.field_M = new ClientUiComponent(0L, ConsoleValue.field_a);
          rd.field_e = new ClientUiComponent(0L, ClientUiComponent.field_Q);
          PreparedAction.field_o = new ClientUiComponent(0L, ClientUiComponent.field_Q);
          eb.field_a = new ClientUiComponent(0L, ClientUiComponent.field_Q);
          ClientUiComponent.field_Q.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("smallbutton", (byte) -128, param1, "lobby"));
          ClientUiComponent.field_Q.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("smallbutton_mouseover", (byte) -125, param1, "lobby"));
          dupTemp$0 = wj.a(-12310, fk.loadRgbSpritesByName("smallbutton_active", (byte) -124, param1, "lobby"));
          ClientUiComponent.field_Q.selectedSkinSprites = dupTemp$0;
          ClientUiComponent.field_Q.heldPressSkinSprites = dupTemp$0;
          ClientUiComponent.field_Q.disabledSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("smallbutton_disabled", (byte) -127, param1, "lobby"));
          bw.field_h.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("mediumbutton", (byte) -125, param1, "lobby"));
          bw.field_h.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("mediumbutton_mouseover", (byte) -125, param1, "lobby"));
          bw.field_h.heldPressSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("mediumbutton_mouseheld", (byte) -124, param1, "lobby"));
          ConsoleValue.field_a.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("bigbutton", (byte) -128, param1, "lobby"));
          ConsoleValue.field_a.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("bigbutton_mouseover", (byte) -124, param1, "lobby"));
          ConsoleValue.field_a.heldPressSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("bigbutton_mouseheld", (byte) -124, param1, "lobby"));
          ConsoleValue.field_a.disabledSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("bigbutton_disabled", (byte) -126, param1, "lobby"));
          QuickChatPhraseRepository.field_d.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("greenbutton", (byte) -124, param1, "lobby"));
          QuickChatPhraseRepository.field_d.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("greenbutton_mouseover", (byte) -126, param1, "lobby"));
          QuickChatPhraseRepository.field_d.heldPressSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("greenbutton_mouseheld", (byte) -127, param1, "lobby"));
          ContentTransitionDialog.field_X.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("redbutton", (byte) -128, param1, "lobby"));
          ContentTransitionDialog.field_X.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("redbutton_mouseover", (byte) -127, param1, "lobby"));
          ContentTransitionDialog.field_X.heldPressSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("redbutton_mouseheld", (byte) -126, param1, "lobby"));
          kd.field_M.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("backbutton", (byte) -124, param1, "lobby"));
          kd.field_M.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("backbutton_mouseover", (byte) -124, param1, "lobby"));
          kd.field_M.heldPressSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("backbutton_mouseheld", (byte) -128, param1, "lobby"));
          kd.field_M.disabledSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("backbutton_disabled", (byte) -124, param1, "lobby"));
          eb.field_a.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("gameoptionbutton", (byte) -128, param1, "lobby"));
          eb.field_a.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("gameoptionbutton_mouseover", (byte) -126, param1, "lobby"));
          dupTemp$1 = wj.a(-12310, fk.loadRgbSpritesByName("gameoptionbutton_active", (byte) -128, param1, "lobby"));
          eb.field_a.selectedSkinSprites = dupTemp$1;
          eb.field_a.heldPressSkinSprites = dupTemp$1;
          eb.field_a.disabledSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("gameoptionbutton_disabled", (byte) -124, param1, "lobby"));
          rd.field_e.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("chatbutton", (byte) -125, param1, "lobby"));
          rd.field_e.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("chatbutton_mouseover", (byte) -127, param1, "lobby"));
          dupTemp$2 = wj.a(-12310, fk.loadRgbSpritesByName("chatbutton_active", (byte) -124, param1, "lobby"));
          rd.field_e.selectedSkinSprites = dupTemp$2;
          rd.field_e.heldPressSkinSprites = dupTemp$2;
          PreparedAction.field_o.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("chatfilterbutton", (byte) -127, param1, "lobby"));
          PreparedAction.field_o.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("chatfilterbutton_mouseover", (byte) -127, param1, "lobby"));
          dupTemp$3 = wj.a(-12310, fk.loadRgbSpritesByName("chatfilterbutton_active", (byte) -124, param1, "lobby"));
          PreparedAction.field_o.selectedSkinSprites = dupTemp$3;
          PreparedAction.field_o.heldPressSkinSprites = dupTemp$3;
          var17 = fk.loadRgbSpritesByName("checkbox", (byte) -124, param1, "lobby");
          ArrayWidgetContainer.field_H = new IconLabelControl(0L, var17[1], var17[0], 1, DualLinkedNode.field_k, (String) null);
          oe.field_Cb = new ClientUiComponent(0L, (ClientUiComponent) null);
          oe.field_Cb.skinSprites = it.a(17, GameplayController.a("slideregion", (byte) 51, "lobby", param1));
          oe.field_Cb.matchedButtonSkinSprites = it.a(17, GameplayController.a("slideregion_mouseover", (byte) 51, "lobby", param1));
          oe.field_Cb.heldPressSkinSprites = it.a(17, GameplayController.a("slideregion_mouseheld", (byte) 51, "lobby", param1));
          oe.field_Cb.disabledSkinSprites = it.a(17, GameplayController.a("slideregion_disabled", (byte) 51, "lobby", param1));
          ke.field_c = new ClientUiComponent(0L, (ClientUiComponent) null);
          ke.field_c.skinSprites = wj.a(-12310, fk.loadRgbSpritesByName("dragbar", (byte) -126, param1, "lobby"));
          ke.field_c.matchedButtonSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("dragbar_mouseover", (byte) -127, param1, "lobby"));
          ke.field_c.heldPressSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("dragbar_mouseheld", (byte) -127, param1, "lobby"));
          ke.field_c.disabledSkinSprites = wj.a(-12310, fk.loadRgbSpritesByName("dragbar_disabled", (byte) -125, param1, "lobby"));
          no.field_M = new ClientUiComponent(0L, (ClientUiComponent) null);
          no.field_M.sprite = GameplayController.a("upbutton", (byte) 51, "lobby", param1);
          no.field_M.matchedButtonSprite = GameplayController.a("upbutton_mouseover", (byte) 51, "lobby", param1);
          no.field_M.heldPressSprite = GameplayController.a("upbutton_mouseheld", (byte) 51, "lobby", param1);
          no.field_M.disabledSprite = GameplayController.a("upbutton_disabled", (byte) 51, "lobby", param1);
          wh.field_g = new ClientUiComponent(0L, (ClientUiComponent) null);
          wh.field_g.sprite = GameplayController.a("downbutton", (byte) 51, "lobby", param1);
          wh.field_g.matchedButtonSprite = GameplayController.a("downbutton_mouseover", (byte) 51, "lobby", param1);
          wh.field_g.heldPressSprite = GameplayController.a("downbutton_mouseheld", (byte) 51, "lobby", param1);
          wh.field_g.disabledSprite = GameplayController.a("downbutton_disabled", (byte) 51, "lobby", param1);
          WeightedLruCache.field_b = new VerticalScrollbar(0L, no.field_M, wh.field_g, oe.field_Cb, ke.field_c);
          br.field_g = new SocialListPanel(0L, (ClientUiComponent) null, ConsoleEvaluationException.field_c, WeightedLruCache.field_b, ClientUiComponent.field_Q, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("ee.E(");
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final String formatMindControlRejection(String[] messageParts, int obfuscationGuard) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 30536) {
            stackIn_4_0 = this.formatIllegalMove(12, messageParts, "mind control");
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ee.F(");
          if (messageParts == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_v = null;
        field_A = null;
        if (param0 != -27538) {
          return;
        }
        keyStateEvents = null;
    }

    final static void e(int param0) {
        TurnEffectEvent.field_z.c((byte) -115);
        if (param0 != 0) {
          SphinxActionRequest.f(64);
          return;
        }
    }

    final PreparedAction prepareAction(int obfuscationGuard, Battlefield battlefield) {
        String discarded$0 = null;
        String discarded$2 = null;
        String discarded$1 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        PreparedAction stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ResourceArchive var4 = null;
        Unit var5 = null;
        try {
          this.unlink(44);
          if (obfuscationGuard <= 31) {
            var4 = (ResourceArchive) null;
            SphinxActionRequest.a((IndexedSprite[]) null, (ResourceArchive) null, 4, (int[]) null, (ResourceArchive) null);
          }
          var5 = battlefield.getUnitAt(this.sphinxY, true, this.sphinxX);
          if (var5 == null) {
            discarded$0 = this.formatMindControlRejection(new String[]{"no unit at ", TutorialController.formatCoordinatePair(this.sphinxX, 0, this.sphinxY)}, 30536);
            stackIn_5_0 = null;
            return (PreparedAction) (stackIn_5_0);
          }
          if (var5.attacksRemaining == 0) {
            discarded$2 = this.formatMindControlRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.sphinxX, 0, this.sphinxY), " has attacked"}, 30536);
            stackIn_8_0 = null;
            return (PreparedAction) (stackIn_8_0);
          }
          if (72 == var5.unitType) {
            stackIn_13_0 = this.delegatedRequest.prepareAction(100, battlefield);
            return stackIn_13_0;
          }
          discarded$1 = this.formatMindControlRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.sphinxX, 0, this.sphinxY), " is not TYPE_SPHINX"}, 30536);
          stackIn_11_0 = null;
          return (PreparedAction) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ee.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    SphinxActionRequest(int actingPlayer, int sphinxX, int sphinxY, ActionRequest delegatedRequest) {
        try {
          this.delegatedRequest = delegatedRequest;
          this.delegatedRequest.allowOtherPlayer = true;
          this.actingPlayer = actingPlayer;
          this.sphinxX = sphinxX;
          this.sphinxY = sphinxY;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ee.<init>(" + actingPlayer + ',' + sphinxX + ',' + sphinxY + ',' + (delegatedRequest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        keyStateEvents = new int[128];
    }
}
