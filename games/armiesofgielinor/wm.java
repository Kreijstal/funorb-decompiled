/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static ClientUiComponent field_c;
    static String field_d;
    static String chatRecipientNameKey;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 == -10743) {
          field_a = null;
          field_d = null;
          chatRecipientNameKey = null;
          return;
        }
        chatRecipientNameKey = (String) null;
        field_a = null;
        field_d = null;
        chatRecipientNameKey = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, nr param6, int param7, byte param8, int param9, int param10, int param11, nr param12, int param13, BitmapFont param14, int param15, int param16, BitmapFont param17, int param18, int param19, nr param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          br.a(param14, param9, 333, param17);
          if (param8 <= 80) {
            return;
          }
          uc.a(param11, param19, param5, false, param4);
          pt.c(param0, param2, 56);
          qf.a(param6, param10, param7, param12, param15, -125);
          ConsoleCommand.a(param16, (byte) 96, param13, param20);
          ek.a(param1, param3, -118, param18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("wm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param18).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static ChatMessage a(int param0, int param1, byte param2, int param3) {
        Object var4;
        int var5;
        int var6;
        int var7;
        ChatMessage var8_ref_mo;
        int var9;
        int var10_int;
        int var13;
        boolean stackIn_45_0 = false;
        boolean stackIn_51_0 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_66_0 = false;
        boolean stackIn_70_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_81_0 = false;
        ChatMessage var4_ref;
        int var8;
        ChatMessage var9_ref_mo;
        String var10;
        String var11;
        int var12;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        vq.field_a.content.children.clear(108);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + lk.chatHistorySize; var7 >= 0; var7--) {
          var8_ref_mo = an.chatHistory[var7];
          var9 = 0;
          if (!NodeIterator.field_a &&
            AnimationPlayer.chatHistoryCategoryLimit > var5) {
            var10_int = kp.getChatFilter(var8_ref_mo.channelId, -125);
            if (var8_ref_mo.getFilterPriority(true) >= var10_int && (var8_ref_mo.systemMessage ||
              !IndexedSpriteBase.isIgnoredAccount(var8_ref_mo.accountName, -3404))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (null == var8_ref_mo.rowComponent ||
              MoveEvent.field_J) {
              if (null == var8_ref_mo.rowComponent) {
                s.field_d = s.field_d + 1;
              }
              var10 = af.formatChatPrefix(var8_ref_mo, (byte) 103);
              var11 = var10 + BitmapFont.c(var8_ref_mo.text);
              var12 = PlayerProfile.a(var8_ref_mo, -5);
              var8_ref_mo.rowComponent = new ClientUiComponent(0L, SpellConfirmationDialog.field_i, var11);
              var8_ref_mo.rowComponent.heldPressTextColour = (SpellConfirmationDialog.field_i.heldPressTextColour >> 1 & 8355711) + (var12 - ((var12 & 16711423) >> 1));
              var8_ref_mo.rowComponent.font = IntrusiveNode.field_e;
              var8_ref_mo.rowComponent.matchedButtonTextColour = (SpellConfirmationDialog.field_i.matchedButtonTextColour >> 1 & 8355711) + var12 - (8355711 & var12 >> 1);
              var6 = var6 + param0;
              var8_ref_mo.rowComponent.textColour = var12;
            }
            var5++;
          } else {
            var8_ref_mo.rowComponent = null;
          }
        }
        var7Lifetime1 = 0;
        var8 = 0;
        if (param2 <= 126) {
          wm.a(44);
        }
        while (lk.chatHistorySize > var8) {
          var9_ref_mo = an.chatHistory[var8];
          if (null != var9_ref_mo.rowComponent) {
            vq.field_a.content.addChild(var9_ref_mo.rowComponent, 65);
            var9_ref_mo.rowComponent.setBounds(param0, -20500, var9_ref_mo.rowComponent.getPreferredWidth(-49), var7Lifetime1, param1);
            if (0 != var9_ref_mo.rowComponent.pressedButton) {
              var4_ref = var9_ref_mo;
            }
            var7Lifetime1 = var7Lifetime1 + param0;
          }
          var8++;
        }
        var8Lifetime1 = -var7Lifetime1 + (var6 + (vq.field_a.content.height + vq.field_a.content.pendingHeightDelta));
        vq.field_a.content.height = vq.field_a.content.height - var8Lifetime1;
        vq.field_a.content.y = vq.field_a.content.y + var8Lifetime1;
        if (MoveEvent.field_J) {
          vq.field_a.content.height = var7Lifetime1;
          vq.field_a.content.pendingHeightDelta = -vq.field_a.content.height + var7Lifetime1;
          if (MoveEvent.field_J) {
            vq.field_a.content.y = vq.field_a.viewport.height - vq.field_a.content.height;
            vq.field_a.content.pendingYDelta = 0;
            MoveEvent.field_J = false;
            cu.field_c = true;
          }
          if (hf.textChatActive) {
            if (null == UnitCycler.field_g) {
              var9Lifetime1 = -vq.field_a.content.pendingHeightDelta - (vq.field_a.content.height - vq.field_a.viewport.height);
              if (cu.field_c) {
                vq.field_a.content.pendingYDelta = var9Lifetime1 - vq.field_a.content.y;
              }
              vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
              stackIn_45_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime1);
              cu.field_c = stackIn_45_0;
              return (ChatMessage) (var4);
            }
            cu.field_c = true;
          }
          var9Lifetime1Lifetime1 = -vq.field_a.content.pendingHeightDelta - (vq.field_a.content.height - vq.field_a.viewport.height);
          if (!cu.field_c) {
            vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
            stackIn_51_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime1Lifetime1);
            cu.field_c = stackIn_51_0;
          } else {
            vq.field_a.content.pendingYDelta = var9Lifetime1Lifetime1 - vq.field_a.content.y;
            vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
            stackIn_55_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime1Lifetime1);
            cu.field_c = stackIn_55_0;
          }
          return (ChatMessage) (var4);
        }
        vq.field_a.content.pendingHeightDelta = -vq.field_a.content.height + var7Lifetime1;
        if (MoveEvent.field_J) {
          vq.field_a.content.y = vq.field_a.viewport.height - vq.field_a.content.height;
          vq.field_a.content.pendingYDelta = 0;
          MoveEvent.field_J = false;
          cu.field_c = true;
        }
        if (hf.textChatActive) {
          if (null == UnitCycler.field_g) {
            var9Lifetime2 = -vq.field_a.content.pendingHeightDelta - (vq.field_a.content.height - vq.field_a.viewport.height);
            if (!cu.field_c) {
              vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
              stackIn_66_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime2);
              cu.field_c = stackIn_66_0;
            } else {
              vq.field_a.content.pendingYDelta = var9Lifetime2 - vq.field_a.content.y;
              vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
              stackIn_70_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime2);
              cu.field_c = stackIn_70_0;
            }
            return (ChatMessage) (var4);
          }
          cu.field_c = true;
        }
        var9Lifetime3 = -vq.field_a.content.pendingHeightDelta - (vq.field_a.content.height - vq.field_a.viewport.height);
        if (!cu.field_c) {
          vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
          stackIn_77_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime3);
          cu.field_c = stackIn_77_0;
        } else {
          vq.field_a.content.pendingYDelta = var9Lifetime3 - vq.field_a.content.y;
          vq.field_a.advanceScroll(param0, true, 2 * param0 * param3, false);
          stackIn_81_0 = (vq.field_a.content.pendingYDelta + vq.field_a.content.y == var9Lifetime3);
          cu.field_c = stackIn_81_0;
        }
        return (ChatMessage) (var4);
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param0 != 0) {
          wm.a(-77, -115, (byte) -120, -123);
          if (null == Spell.field_b) {
            return;
          }
          var3 = Spell.field_b.pollOffence(param2, (byte) -112);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = Spell.field_b.isMuteSelected(0) ? 1 : 0;
              CampaignRewardPreview.writeAbuseReport(Spell.field_b.getTargetName(1), var3, Spell.field_b.accountId, 29231, var4 != 0, param1);
            }
            Spell.field_b = null;
            ot.g(76);
            return;
          }
          return;
        }
        if (null == Spell.field_b) {
          return;
        }
        var3Lifetime1 = Spell.field_b.pollOffence(param2, (byte) -112);
        if (var3Lifetime1 != -2) {
          if (var3Lifetime1 != -1) {
            var4Lifetime1 = Spell.field_b.isMuteSelected(0) ? 1 : 0;
            CampaignRewardPreview.writeAbuseReport(Spell.field_b.getTargetName(1), var3Lifetime1, Spell.field_b.accountId, 29231, var4Lifetime1 != 0, param1);
          }
          Spell.field_b = null;
          ot.g(76);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_d = "Creating your account";
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
