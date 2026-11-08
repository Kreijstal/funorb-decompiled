/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatAndIgnoreHelpers {
    static Js5Archive field_a;
    static MenuInputState field_b;
    static boolean field_c;
    static String field_d;

    final static void openPublicChatInput(int param0) {
        if (param0 != 13984) {
          field_c = false;
          ArchiveLoadSequence.field_h = true;
          ChatFilterHelpers.field_e = 0;
          return;
        }
        ArchiveLoadSequence.field_h = true;
        ChatFilterHelpers.field_e = 0;
    }

    final static void setDefaultQuickChatShortcut(byte param0, QuickChatCategory param1) {
        if (param0 < 60) {
          return;
        }
        try {
          param1.field_w = new int[]{-1};
          param1.field_r = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "g.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 > -18) {
          QuickChatCategory var2 = (QuickChatCategory) null;
          ChatAndIgnoreHelpers.setDefaultQuickChatShortcut((byte) 15, (QuickChatCategory) null);
        }
    }

    final static void selectLoginBack(byte param0) {
        DualLinkHashTable.setLoginResultCode(4, -1);
        if (param0 != -33) {
          ChatAndIgnoreHelpers.releaseStatics((byte) 71);
        }
    }

    final static String requestAddIgnore(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!CacheReference.isValidAccountName(var6, -1478)) {
            stackIn_2_0 = StatSubmission.field_l;
            return stackIn_2_0;
          }
          if (param1 > -127) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (PacketBuffer.isLocalPlayerName(param0, true)) {
            stackIn_9_0 = DialWidgetPainter.field_k;
            return stackIn_9_0;
          }
          if (CachedArchiveSource.field_q != 2) {
            stackIn_12_0 = StatSubmission.field_p;
            return stackIn_12_0;
          }
          if (WhirlpoolDigest.isFriend(param0, -1369854352)) {
            stackIn_15_0 = MenuScreen.formatIndexedText(new String[]{param0}, TypeCode.field_d, 2);
            return stackIn_15_0;
          }
          if (StrongCacheReference.field_z >= 100) {
            stackIn_18_0 = LogoIntroHelpers.field_a;
            return stackIn_18_0;
          }
          if (DisplayModeInfo.isKnownPlayer(param0, (byte) -73)) {
            stackIn_21_0 = MenuScreen.formatIndexedText(new String[]{param0}, RequestResendSupport.field_c, 2);
            return stackIn_21_0;
          }
          var5 = IterableNodeHashTable.field_g;
          var5.writeCipheredOpcode(param2, 8);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(2, 76);
          var5.writeString(param0, (byte) -96);
          var5.backpatchByteLength(var5.position - var4, -1);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("g.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new MenuInputState(1);
        field_d = "This game option is not available in rated games.";
        field_c = false;
    }
}
