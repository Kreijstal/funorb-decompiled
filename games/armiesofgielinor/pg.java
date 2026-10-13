/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    static int field_f;
    static bq[] field_a;
    static int field_e;
    static PlayerProfile playerProfile;
    static RgbSprite field_c;
    static String[] field_b;

    final static boolean isPowerOfTwoBits(int value, int obfuscationGuard) {
        if (obfuscationGuard != -10) {
          return false;
        }
        return (value & -value) == value ? true : false;
    }

    final static AnimationSequence selectUnitAnimation(int animationIndex, int obfuscationGuard, boolean allowDefaultFallback, int unitType) {
        int variantOrdinal = 0;
        int variant = 0;
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (animationIndex < 0 ||
          animationIndex >= 9) {
          animationIndex = 0;
        }
        int[] variants = BestScoreStrategy.unitAnimationVariants[unitType][animationIndex];
        int[] variantsAlias = variants;
        int[] variantChoices = variantsAlias;
        int[] slotVariants = variantChoices;
        int selectedVariant = variantChoices[AttackEvent.nextBoundedInt(false, variants.length, PrintVictoryConditionsConsoleCommand.animationRandom)];
        if (selectedVariant >= 0) {
          return ck.animationSequencesByGroup[sf.unitAnimationGroups[unitType]][selectedVariant];
        }
        if (obfuscationGuard != 176) {
          return (AnimationSequence) null;
        }
        int[] fallbackChoices = slotVariants;
        for (variantOrdinal = 0; variantOrdinal < fallbackChoices.length; variantOrdinal++) {
          variant = fallbackChoices[variantOrdinal];
          if (0 <= variant) {
            return ck.animationSequencesByGroup[sf.unitAnimationGroups[unitType]][variant];
          }
        }
        if (!allowDefaultFallback) {
          return null;
        }
        return ck.animationSequencesByGroup[sf.unitAnimationGroups[unitType]][BestScoreStrategy.unitAnimationVariants[unitType][0][0]];
    }

    final static void a(boolean param0) {
        ck.b(-111);
        if (IndexedSpriteBase.field_b != null) {
          dt.a(IndexedSpriteBase.field_b, 23678);
        }
        BufferedSocket.disableKeyboard((byte) 41);
        pf.a(-15291);
        DequeWidgetContainer.j(-118);
        if (fh.b((byte) -88)) {
          vl.outgoingPacket.writeCipheredOpcode(32161, 1);
          hb.$cfr$intArgs$a$e9dea5688aa5(124, 0);
        }
        dj.a((byte) -126);
        if (param0) {
          playerProfile = (PlayerProfile) null;
        }
    }

    final static void openChatMessageContextMenu(int obfuscationGuard, ChatMessage message) {
        Object stackIn_2_0;
        ClientUiComponent stackIn_2_1;
        Object stackIn_2_2;
        String stackIn_2_3;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ClientContextMenu var5 = null;
        String var6 = null;
        ClientContextMenu var7 = null;
        String var8 = null;
        ClientContextMenu var9 = null;
        String var10 = null;
        ClientContextMenu var11 = null;
        String var12 = null;
        ClientContextMenu var13 = null;
        try {
          stackIn_2_0 = null;
          stackIn_2_1 = message.rowComponent;
          stackIn_2_2 = null;
          stackIn_2_3 = message.displayName;
          if (message.channelId == 1) {
            stackIn_3_4 = message.contextId;
          } else {
            stackIn_3_4 = 0;
          }
          ng.openClientContextMenu((ScrollContainer) (stackIn_2_0), stackIn_2_1, (int[]) (stackIn_2_2), stackIn_2_3, stackIn_3_4, 1, message.channelId, message.accountName, message.accountId);
          if (message.channelId == 0 &&
            !bn.a(false) &&
            null == vu.currentRoom &&
            no.roomSetup == null) {
            if (!vi.field_d) {
              var5 = tn.activeContextMenu;
              var6 = wh.field_b;
              var5.menu.addTextAction(14, var6, (byte) -128);
            }
            var7 = tn.activeContextMenu;
            var8 = FixedQuaternion.field_g;
            var7.menu.addTextAction(20, var8, (byte) -115);
          }
          if (1 == message.channelId &&
            !bn.a(false) &&
            vu.currentRoom != null &&
            message.contextId == vu.currentRoom.getRoomId((byte) -88)) {
            if (!vi.field_d) {
              var9 = tn.activeContextMenu;
              var10 = CampaignMenu.field_q;
              var9.menu.addTextAction(14, var10, (byte) -108);
            }
            var11 = tn.activeContextMenu;
            var12 = CampaignMenuEntry.field_E;
            var11.menu.addTextAction(20, var12, (byte) -117);
          }
          tn.activeContextMenu.addRoomAdmissionActions((byte) 68);
          tn.activeContextMenu.addPlayerAdmissionActions(obfuscationGuard + 23899, false);
          tn.activeContextMenu.addSocialActions(message.responsePhraseIds, 7, message.channelId);
          tn.activeContextMenu.addReportAction((byte) 92);
          tn.activeContextMenu.addChatFilterActions(message, 0);
          var13 = tn.activeContextMenu;
          var3 = BattleTutorial.pointerPressX;
          var4 = TeleportAction.pointerPressY;
          var13.menu.layoutPopup(0, var4, obfuscationGuard, (byte) -118, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("pg.E(").append(obfuscationGuard).append(',');
          if (message == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 20) {
          return;
        }
        field_b = null;
        field_c = null;
        playerProfile = null;
        field_a = null;
    }

    static {
        field_e = 0;
        field_f = field_e;
        field_b = new String[]{"melee", "ranged", "magic", "fire", "aerial"};
    }
}
