/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FriendsListState {
    boolean field_d;
    static QuickChatDynamicCommand field_a;
    static int field_e;
    int field_b;
    boolean field_f;
    static char[] field_c;

    final static void readSocialListUpdate(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_52_0;
        IsaacPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        FriendEntry var5 = null;
        String var5_ref = null;
        String var6 = null;
        FriendEntry var6_ref = null;
        String var7 = null;
        FriendEntry var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = wizardrun.field_H;
        try {
          if (!param0) {
            return;
          }
          var1 = AccountCreationForm.field_N;
          var2 = var1.readUnsignedByte(255);
          if (0 == var2) {
            if (IntrusiveNode.field_f == null) {
              IntrusiveNode.field_f = new DualLinkNodeHashTable(128);
              IndexedSpriteArrayFactory.field_e = 0;
            }
            stackIn_14_0 = (var1.readUnsignedByte(255) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.readCp1252String(0);
            if (var3_int != 0) {
              var1.readCp1252String(0);
            }
            var5 = IterableNodeHashTable.findIgnoredPlayer(var4_ref_String, -30782);
            var6 = var1.readCp1252String(0);
            var7 = MouseWheelInput.normalizePlayerName(-127, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = IterableNodeHashTable.findIgnoredPlayer(var6, -30782);
              if (null != var5) {
                IntrusiveNode.field_f.put(var5, (long)var7.hashCode(), 122);
              }
            }
            if (null == var5) {
              var5 = new FriendEntry();
              IntrusiveNode.field_f.put(var5, (long)var7.hashCode(), 112);
              fieldTemp$0 = IndexedSpriteArrayFactory.field_e;
              IndexedSpriteArrayFactory.field_e = IndexedSpriteArrayFactory.field_e + 1;
              var5.insertionOrder = fieldTemp$0;
              ExceptionSupport.field_a.addLast(var5, false);
            }
            var5.displayName = var4_ref_String;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (DisplayNameValidator.field_k == 1) {
                DisplayNameValidator.field_k = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (DisplayNameValidator.field_k == 2) {
                DisplayNameValidator.field_k = 1;
              }
              return;
            }
            if (var2 != 4) {
              ResizableDialog.reportClientError((Throwable) null, "F1: " + LevelDecodingHelpers.describeAccountPacket(6), -562);
              HuffmanDecoder.closeAccountConnection(-91);
              return;
            }
            DisplayNameValidator.field_k = 1;
            var3 = var1.readCp1252String(0);
            LoadingMessageHelpers.field_d = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(255);
            FramedButtonPainter.decodeSocialFilterModes((byte) 52, var4);
            return;
          }
          if (null == FriendLookupState.field_f) {
            FriendLookupState.field_f = new DualLinkNodeHashTable(128);
            DirectByteStorage.field_h = 0;
          }
          var3Lifetime1 = var1.readCp1252String(0);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readCp1252String(0);
          var5_ref = var1.readCp1252String(0);
          var6_ref = IterableNodeHashTable.findFriend((byte) -116, var4_ref_StringLifetime1);
          if (var6_ref == null) {
            var6_ref = IterableNodeHashTable.findFriend((byte) -116, var5_ref);
            if (var6_ref != null) {
              FriendLookupState.field_f.put(var6_ref, (long)MouseWheelInput.normalizePlayerName(-78, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), 125);
            }
          }
          if (null == var6_ref) {
            var6_ref = new FriendEntry();
            FriendLookupState.field_f.put(var6_ref, (long)MouseWheelInput.normalizePlayerName(-57, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), 107);
            fieldTemp$1 = DirectByteStorage.field_h;
            DirectByteStorage.field_h = DirectByteStorage.field_h + 1;
            var6_ref.insertionOrder = fieldTemp$1;
            WhirlpoolHasher.field_g.addLast(var6_ref, false);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.serverName = (String) (var3Lifetime1);
          var6_ref.displayName = var4_ref_StringLifetime1;
          var6_ref.unlink(false);
          var7_ref = (FriendEntry) (WhirlpoolHasher.field_g.first((byte) 80));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackOut_52_0 = FriendOrderingHelpers.isFriendOrderedAfter(var6_ref, var7_ref, -1);
              stackIn_60_0 = stackOut_52_0 ? 1 : 0;
              stackIn_53_0 = stackOut_52_0;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_53_0)) {
                var7_ref = (FriendEntry) (WhirlpoolHasher.field_g.next(8192));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break scanLoop1;
              }
              stackIn_60_0 = 74;
            }
            GameShell.insertNodeBeforeWithIntGuard(stackIn_60_0, var7_ref, var6_ref);
            if (var8 == 0) {
              return;
            }
            break;
          }
          WhirlpoolHasher.field_g.addLast(var6_ref, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1_ref), "jk.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_c = null;
          field_a = null;
          int var1_int = 5 / ((-70 - param0) / 36);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "jk.A(" + param0 + ')');
        }
    }

    FriendsListState() {
        try {
          this.field_d = false;
          this.field_f = false;
          this.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "jk.<init>()");
        }
    }

    static {
        field_a = new QuickChatDynamicCommand(4, 1, 1, 1);
        field_c = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
