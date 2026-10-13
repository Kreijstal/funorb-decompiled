/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    static String field_b;
    static String field_a;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = -78 % ((-51 - param0) / 33);
        int var8 = CampaignMenuEntry.field_u[param6];
        if (9 != var8) {
          return;
        }
        oo.a(param4, param2, param5, param7, param3, param1, (byte) -103);
        ac.activeTerrainSprites[FullscreenDisplayMode.a(CombatViewTransition.a(1 + param7, param1 - 1, 2, (byte) -108), 1, CombatViewTransition.a(param7, -1 + param1, 2, (byte) -109), CombatViewTransition.a(param7 + 1, param1, 2, (byte) -94), -57) + 180].b(param3, param2, param4, param5);
        ac.activeTerrainSprites[FullscreenDisplayMode.a(CombatViewTransition.a(-1 + param7, param1 - 1, 2, (byte) -113), 1, CombatViewTransition.a(param7, param1 - 1, 2, (byte) -116), CombatViewTransition.a(param7 - 1, param1, 2, (byte) -126), -63) + 181].b(param3, param2, param4, param5);
        ac.activeTerrainSprites[182 + FullscreenDisplayMode.a(CombatViewTransition.a(param7 + 1, 1 + param1, 2, (byte) -124), 1, CombatViewTransition.a(param7, param1 + 1, 2, (byte) -127), CombatViewTransition.a(param7 + 1, param1, 2, (byte) -122), -94)].b(param3, param2, param4, param5);
        ac.activeTerrainSprites[183 + FullscreenDisplayMode.a(CombatViewTransition.a(param7 - 1, param1 + 1, 2, (byte) -122), 1, CombatViewTransition.a(param7, param1 + 1, 2, (byte) -116), CombatViewTransition.a(-1 + param7, param1, 2, (byte) -114), -118)].b(param3, param2, param4, param5);
    }

    final static TaggedMapData readLengthPrefixedMap(CipherPacketBuffer packet, int obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        TaggedMapData var3 = null;
        TaggedMapData stackIn_2_0 = null;
        TaggedMapData stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -23920) {
            stackIn_2_0 = (TaggedMapData) null;
            return stackIn_2_0;
          }
          var2_int = packet.readInt(1);
          packet.beginBitReading(45);
          var3 = ut.readTaggedMap(packet, (byte) -85, var2_int);
          packet.endBitReading(-2);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("po.C(");
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean handleQuickChatShortcuts(int packetOpcode, int obfuscationGuard, int unusedParameter2) {
        int stackIn_3_0 = 0;
        int var3;
        String var4;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime3;
        String var4Lifetime4;
        String var4Lifetime1Lifetime1;
        stackIn_3_0 = (null == NumericDateInputWidget.roomSetup) ? 0 : 1;
        var3 = stackIn_3_0;
        if (rs.keyCode != 9) {
          if (obfuscationGuard != 6150) {
            field_a = (String) null;
            if (10 == rs.keyCode) {
              if (var3 != 0) {
                return false;
              }
              ContextActionMenu.openPublicQuickChat(obfuscationGuard ^ 6217);
              return true;
            }
            if (11 != rs.keyCode) {
              return false;
            }
            if (!lq.hasLastQuickChat) {
              return false;
            }
            if (SpriteControlNode.lastQuickChatChannel == 2 &&
              !FixedQuaternion.isOnlineFriendOrRoomMember(RevivalEvent.lastQuickChatRecipientAccountId, AdaptiveMidiPcmStream.lastQuickChatRecipientName, (byte) 78)) {
              return false;
            }
            if (SpriteControlNode.lastQuickChatChannel != 2 &&
              var3 != 0) {
              return false;
            }
          } else {
            if (10 == rs.keyCode) {
              if (var3 != 0) {
                return false;
              }
              ContextActionMenu.openPublicQuickChat(obfuscationGuard ^ 6217);
              return true;
            }
            if (11 != rs.keyCode) {
              return false;
            }
            if (!lq.hasLastQuickChat) {
              return false;
            }
            if (SpriteControlNode.lastQuickChatChannel != 2) {
              if (SpriteControlNode.lastQuickChatChannel == 2) {
                if (!BestScoreStrategy.a(true)) {
                  return true;
                }
                var4 = (String) null;
                it.writeChatMessage(vi.lastQuickChatPhraseId, -82, SpriteControlNode.lastQuickChatChannel, AdaptiveMidiPcmStream.lastQuickChatRecipientName, packetOpcode, (String) null);
                return true;
              }
              if (var3 != 0) {
                return false;
              }
            } else {
              if (!FixedQuaternion.isOnlineFriendOrRoomMember(RevivalEvent.lastQuickChatRecipientAccountId, AdaptiveMidiPcmStream.lastQuickChatRecipientName, (byte) 78)) {
                return false;
              }
              if (SpriteControlNode.lastQuickChatChannel != 2 &&
                var3 != 0) {
                return false;
              }
            }
          }
          if (BestScoreStrategy.a(true)) {
            var4Lifetime4 = (String) null;
            it.writeChatMessage(vi.lastQuickChatPhraseId, -82, SpriteControlNode.lastQuickChatChannel, AdaptiveMidiPcmStream.lastQuickChatRecipientName, packetOpcode, (String) null);
          }
          return true;
        }
        if (DebouncedValidator.canOpenQuickChatResponses(ValidatedTextWidget.responseTargetAccountId, WeightedScoreStrategy.responseTargetAccountName, -17231, NumericDateInputWidget.responseTargetChannel, rv.responsePhraseIds)) {
          if (2 == NumericDateInputWidget.responseTargetChannel) {
            return QuickChatCommandDefinition.openQuickChatResponses(obfuscationGuard ^ 6251, WeightedScoreStrategy.responseTargetAccountName, rv.responsePhraseIds, ValidatedTextWidget.responseTargetAccountId, NumericDateInputWidget.responseTargetChannel);
          }
          if (var3 != 0) {
            return false;
          }
          return QuickChatCommandDefinition.openQuickChatResponses(obfuscationGuard ^ 6251, WeightedScoreStrategy.responseTargetAccountName, rv.responsePhraseIds, ValidatedTextWidget.responseTargetAccountId, NumericDateInputWidget.responseTargetChannel);
        }
        if (obfuscationGuard != 6150) {
          field_a = (String) null;
          if (10 == rs.keyCode) {
            if (var3 != 0) {
              return false;
            }
            ContextActionMenu.openPublicQuickChat(obfuscationGuard ^ 6217);
            return true;
          }
          if (11 != rs.keyCode) {
            return false;
          }
          if (!lq.hasLastQuickChat) {
            return false;
          }
          if (SpriteControlNode.lastQuickChatChannel != 2) {
            if (SpriteControlNode.lastQuickChatChannel == 2) {
              if (!BestScoreStrategy.a(true)) {
                return true;
              }
              var4Lifetime1 = (String) null;
              it.writeChatMessage(vi.lastQuickChatPhraseId, -82, SpriteControlNode.lastQuickChatChannel, AdaptiveMidiPcmStream.lastQuickChatRecipientName, packetOpcode, (String) null);
              return true;
            }
            if (var3 != 0) {
              return false;
            }
          } else {
            if (!FixedQuaternion.isOnlineFriendOrRoomMember(RevivalEvent.lastQuickChatRecipientAccountId, AdaptiveMidiPcmStream.lastQuickChatRecipientName, (byte) 78)) {
              return false;
            }
            if (SpriteControlNode.lastQuickChatChannel != 2 &&
              var3 != 0) {
              return false;
            }
          }
          if (BestScoreStrategy.a(true)) {
            var4Lifetime1Lifetime1 = (String) null;
            it.writeChatMessage(vi.lastQuickChatPhraseId, -82, SpriteControlNode.lastQuickChatChannel, AdaptiveMidiPcmStream.lastQuickChatRecipientName, packetOpcode, (String) null);
          }
          return true;
        }
        if (10 == rs.keyCode) {
          if (var3 != 0) {
            return false;
          }
          ContextActionMenu.openPublicQuickChat(obfuscationGuard ^ 6217);
          return true;
        }
        if (11 != rs.keyCode) {
          return false;
        }
        if (!lq.hasLastQuickChat) {
          return false;
        }
        if (SpriteControlNode.lastQuickChatChannel != 2) {
          if (SpriteControlNode.lastQuickChatChannel == 2) {
            if (!BestScoreStrategy.a(true)) {
              return true;
            }
            var4Lifetime2 = (String) null;
            it.writeChatMessage(vi.lastQuickChatPhraseId, -82, SpriteControlNode.lastQuickChatChannel, AdaptiveMidiPcmStream.lastQuickChatRecipientName, packetOpcode, (String) null);
            return true;
          }
          if (var3 != 0) {
            return false;
          }
        } else {
          if (!FixedQuaternion.isOnlineFriendOrRoomMember(RevivalEvent.lastQuickChatRecipientAccountId, AdaptiveMidiPcmStream.lastQuickChatRecipientName, (byte) 78)) {
            return false;
          }
          if (SpriteControlNode.lastQuickChatChannel != 2 &&
            var3 != 0) {
            return false;
          }
        }
        if (!BestScoreStrategy.a(true)) {
          return true;
        }
        var4Lifetime3 = (String) null;
        it.writeChatMessage(vi.lastQuickChatPhraseId, -82, SpriteControlNode.lastQuickChatChannel, AdaptiveMidiPcmStream.lastQuickChatRecipientName, packetOpcode, (String) null);
        return true;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Yes";
        field_a = "This unit has already used a trinket this turn.";
    }
}
