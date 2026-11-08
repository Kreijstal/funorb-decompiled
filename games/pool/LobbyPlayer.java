/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayer extends UiComponent {
    String accountName;
    int field_Rb;
    static DualLinkNodeHashTable field_Qb;
    boolean field_Pb;
    static QuickChatMenu field_Ub;
    static int field_fc;
    long playerId;
    int field_Nb;
    boolean field_Yb;
    String displayName;
    static int field_Wb;
    int field_Xb;
    static boolean[] field_cc;
    static Sprite field_Lb;
    int field_hc;
    long field_Mb;
    static String youCanAskToJoin;
    UiComponent field_ac;
    int field_gc;
    static String[] rulesetNames;
    UiComponent field_Zb;
    static Sprite field_Vb;
    int field_bc;
    boolean field_mc;
    UiComponent field_lc;
    UiComponent field_kc;
    UiComponent field_Tb;
    static int field_ec;

    LobbyPlayer(String param0, String param1, long param2) {
        super(0L, (UiComponent) null);
        CharSequence var6 = null;
        try {
          this.displayName = param1;
          this.accountName = param0;
          this.playerId = param2;
          var6 = (CharSequence) ((Object) this.accountName);
          TutorialController.normalizeDisplayName(103, var6);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static Sprite[] loadSpriteSheet(int groupId, int fileId, int obfuscationGuard, ResourceArchive archive) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite[] stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!TextLineLayout.a(groupId, archive, fileId, (byte) 121)) {
            stackIn_2_0 = null;
            return (Sprite[]) (stackIn_2_0);
          }
          if (obfuscationGuard == 0) {
            stackIn_7_0 = ContentTransitionDialog.createDecodedSprites((byte) 65);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("im.C(").append(groupId).append(',').append(fileId).append(',').append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static UiComponent getNamePopupContent(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          LobbyPlayer.releaseStatics((byte) 20);
          return NameEntryPopup.field_Mb.content;
        }
        return NameEntryPopup.field_Mb.content;
    }

    final void updateNames(String param0, byte param1, String param2) {
        CharSequence var6 = null;
        try {
          this.accountName = param0;
          if (param1 != 1) {
            LobbyPlayer var5 = (LobbyPlayer) null;
            this.comesBeforePlayer((LobbyPlayer) null, (byte) -8);
          }
          this.displayName = param2;
          var6 = (CharSequence) ((Object) this.accountName);
          TutorialController.normalizeDisplayName(param1 + 100, var6);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "im.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean comesBeforePlayer(LobbyPlayer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param0.field_Yb) ? 0 : 1;
          if (stackIn_3_0 == (this.field_Yb ? 1 : 0)) {
            stackIn_6_0 = this.field_Yb;
            return stackIn_6_0;
          }
          var3_int = -1 / ((4 - param1) / 38);
          if (param0.field_mc == this.field_mc) {
            stackIn_13_0 = !(this.field_Mb >= param0.field_Mb);
            return stackIn_13_0;
          }
          stackIn_9_0 = this.field_mc;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("im.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_Vb = null;
        field_Ub = null;
        field_cc = null;
        field_Lb = null;
        rulesetNames = null;
        field_Qb = null;
        youCanAskToJoin = null;
        if (param0 != -48) {
          String var2 = (String) null;
          LobbyPlayer.writeCompressedChatText((PacketBuffer) null, (byte) 100, (String) null);
        }
    }

    static long bitwiseXor(long param0, long param1) {
        return param0 ^ param1;
    }

    final boolean isUnindexed(boolean param0) {
        if (param0) {
          return !this.d(59) ? true : false;
        }
        this.field_bc = -108;
        return !this.d(59) ? true : false;
    }

    final static int writeCompressedChatText(PacketBuffer packet, byte obfuscationGuard, String text) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 75) {
            stackIn_2_0 = -12;
            return stackIn_2_0;
          }
          var3_int = packet.position;
          var5 = (CharSequence) ((Object) text);
          var4 = DirectByteStorage.encodeWindows1252(-66, var5);
          packet.writeUnsignedSmart((byte) -49, var4.length);
          packet.position = packet.position + Pool.field_J.compress(0, var4.length, packet.payload, packet.position, var4, true);
          stackIn_4_0 = -var3_int + packet.position;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("im.D(");
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        youCanAskToJoin = "You can ask to join this game";
        rulesetNames = new String[]{"Eight-ball", "Nine-ball", "Killer", "Free play"};
    }
}
