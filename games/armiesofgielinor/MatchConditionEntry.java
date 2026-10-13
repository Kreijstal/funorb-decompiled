/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchConditionEntry extends IntrusiveNode {
    MatchCondition condition;
    static LoginMethod defaultLoginMethod;
    static int[][] field_o;
    static CombatViewTransition field_p;
    static IndexedSprite field_n;
    static int decodedChatChannel;

    final static int a(int param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 94) {
            MatchConditionEntry.a((byte) -104);
          }
          stackIn_4_0 = param0 + (so.field_b.field_g - se.field_a >> 1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "u.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void processSocialListUpdate(int obfuscationGuard) {
        int newIgnoreOrder = 0;
        int newFriendOrder = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_55_0;
        CipherPacketBuffer packet = null;
        RuntimeException var1_ref = null;
        int updateType = 0;
        Object initialLocation = null;
        int hasSeparateAccountName = 0;
        int chatFilterBits = 0;
        String ignoreDisplayName = null;
        String ignoreAccountName = null;
        SocialListEntry ignoreEntry = null;
        SocialListEntry nextFriend = null;
        String previousIgnoreName = null;
        String ignoreNameKey = null;
        int obfuscationControl = 0;
        Object friendLocation;
        String friendDisplayName;
        String previousFriendName;
        SocialListEntry friendEntry;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          packet = ByteStorage.incomingPacket;
          updateType = packet.readUnsignedByte(0);
          if (updateType == 0) {
            if (null == bk.ignoredAccountsByName) {
              bk.ignoredAccountsByName = new DualNodeHashTable(128);
              vg.ignoreCount = 0;
            }
            stackIn_12_0 = (1 != packet.readUnsignedByte(0)) ? 0 : 1;
            hasSeparateAccountName = stackIn_12_0;
            ignoreDisplayName = packet.readNullTerminatedString(1);
            if (hasSeparateAccountName == 0) {
              ignoreAccountName = ignoreDisplayName;
            }
            if (hasSeparateAccountName != 0 ||
              obfuscationControl != 0) {
              ignoreAccountName = packet.readNullTerminatedString(1);
            }
            ignoreEntry = db.findIgnoredAccount(ignoreDisplayName, -124);
            previousIgnoreName = packet.readNullTerminatedString(1);
            ignoreNameKey = AccountNameNormalizer.normalize((CharSequence) ((Object) ignoreDisplayName), false);
            if (null == ignoreNameKey) {
              ignoreNameKey = ignoreDisplayName;
            }
            if (null == ignoreEntry) {
              ignoreEntry = db.findIgnoredAccount(previousIgnoreName, obfuscationGuard - 47);
              if (null != ignoreEntry) {
                bk.ignoredAccountsByName.put(-1, (long)ignoreNameKey.hashCode(), ignoreEntry);
              }
            }
            if (null == ignoreEntry) {
              ignoreEntry = new SocialListEntry();
              bk.ignoredAccountsByName.put(-1, (long)ignoreNameKey.hashCode(), ignoreEntry);
              newIgnoreOrder = vg.ignoreCount;
              vg.ignoreCount = vg.ignoreCount + 1;
              ignoreEntry.orderIndex = newIgnoreOrder;
              FixInvisibleUnitsConsoleCommand.ignoreEntries.addLast((byte) -119, (IntrusiveNode) (ignoreEntry));
            }
            ignoreEntry.previousDisplayName = previousIgnoreName;
            ignoreEntry.accountName = ignoreAccountName;
            ignoreEntry.displayName = ignoreDisplayName;
            return;
          }
          if (updateType != 1) {
            if (updateType == 2) {
              if (th.socialListState == 1) {
                th.socialListState = 2;
              }
              return;
            }
            if (updateType == 3) {
              if (th.socialListState == 2) {
                th.socialListState = 1;
              }
              return;
            }
            if (obfuscationGuard != 1) {
              MatchConditionEntry.a((byte) -118);
            }
            if (updateType != 4) {
              af.a((Throwable) null, -66, "F1: " + CampaignProgress.b(false));
              dj.a((byte) -125);
              return;
            }
            th.socialListState = 1;
            initialLocation = packet.readNullTerminatedString(1);
            EmailValidator.currentLocationLabel = ((String) (initialLocation)).intern();
            chatFilterBits = packet.readUnsignedByte(0);
            ClientUiNode.b(chatFilterBits, obfuscationGuard - 27499);
            return;
          }
          if (DiskCacheRequest.friendsByName == null) {
            DiskCacheRequest.friendsByName = new DualNodeHashTable(128);
            dj.friendCount = 0;
          }
          friendLocation = packet.readNullTerminatedString(1);
          if (((String) (friendLocation)).equals("")) {
            friendLocation = null;
          }
          friendDisplayName = packet.readNullTerminatedString(1);
          previousFriendName = packet.readNullTerminatedString(1);
          friendEntry = lg.findFriend(friendDisplayName, (byte) -34);
          if (null == friendEntry) {
            friendEntry = lg.findFriend(previousFriendName, (byte) -34);
            if (null != friendEntry) {
              DiskCacheRequest.friendsByName.put(-1, (long)AccountNameNormalizer.normalize((CharSequence) ((Object) friendDisplayName), false).hashCode(), friendEntry);
            }
          }
          if (friendEntry == null) {
            friendEntry = new SocialListEntry();
            DiskCacheRequest.friendsByName.put(-1, (long)AccountNameNormalizer.normalize((CharSequence) ((Object) friendDisplayName), false).hashCode(), friendEntry);
            newFriendOrder = dj.friendCount;
            dj.friendCount = dj.friendCount + 1;
            friendEntry.orderIndex = newFriendOrder;
            wh.friendEntries.addLast((byte) -119, (IntrusiveNode) (friendEntry));
          }
          if (friendLocation != null) {
            friendLocation = ((String) (friendLocation)).intern();
          }
          friendEntry.locationLabel = (String) (friendLocation);
          friendEntry.previousDisplayName = previousFriendName;
          friendEntry.displayName = friendDisplayName;
          friendEntry.unlink(-124);
          nextFriend = (SocialListEntry) (wh.friendEntries.first((byte) 111));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != nextFriend) {
              stackOut_55_0 = AccountRequestResult.isFriendOrderedAfter(false, friendEntry, nextFriend);
              stackIn_63_0 = stackOut_55_0 ? 1 : 0;
              stackIn_56_0 = stackOut_55_0;
              decompiledFrameRemainder0 = (obfuscationControl == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_56_0)) {
                nextFriend = (SocialListEntry) (wh.friendEntries.next((byte) 123));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == nextFriend) {
                break scanLoop1;
              }
              stackIn_63_0 = -123;
            }
            ViewportManager.$cfr$intArgs$a$f94c566f195c(stackIn_63_0, friendEntry, nextFriend);
            if (obfuscationControl == 0) {
              return;
            }
            break;
          }
          wh.friendEntries.addLast((byte) -119, (IntrusiveNode) (friendEntry));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "u.B(" + obfuscationGuard + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -102) {
            MatchConditionEntry.a(62, (byte) -42);
          }
          field_n = null;
          field_p = null;
          defaultLoginMethod = null;
          field_o = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "u.A(" + param0 + ')');
        }
    }

    MatchConditionEntry(MatchCondition condition) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.condition = condition;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("u.<init>(");
          if (condition == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        defaultLoginMethod = new LoginMethod("");
        field_o = new int[][]{new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 180}, new int[]{0, 120}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}};
    }
}
