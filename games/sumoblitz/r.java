/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends DualLinkNode {
    static int[] field_r;

    final static ChatMessage readChatMessage(boolean quickChat, byte guard) {
        boolean stackIn_3_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        IsaacPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        QuickChatPhrase var9 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = ig.field_a;
        var2 = var8;
        var3 = var8.readUnsignedByte(-31302);
        UsernameCredentials.field_h = 127 & var3;
        stackIn_3_0 = (0 != (var3 & 128));
        QuickChatPhraseProvider.field_a = stackIn_3_0;
        wn.field_a = var8.readUnsignedByte(-31302);
        ReassignUpgradesScreen.field_j = var8.readLong((byte) 113);
        if (2 == UsernameCredentials.field_h) {
          eh.field_c = var8.readUnsignedShort(255);
          CacheReferenceNode.field_w = var8.readUnsignedMedium((byte) 126);
        } else {
          CacheReferenceNode.field_w = 0;
          eh.field_c = 0;
        }
        if (guard >= -51) {
          field_r = (int[]) null;
        }
        stackIn_11_0 = (var8.readUnsignedByte(-31302) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        ConfirmedEmailValidator.field_f = var8.readCp1252String(-1);
        if (var4 == 0) {
          MarkerTrackWidget.field_E = ConfirmedEmailValidator.field_f;
        } else {
          MarkerTrackWidget.field_E = var8.readCp1252String(-1);
        }
        if (UsernameCredentials.field_h == 1) {
          var8.readUnsignedShort(255);
          var8.readCp1252String(-1);
        } else {
          if (4 == UsernameCredentials.field_h) {
            var8.readUnsignedShort(255);
            var8.readCp1252String(-1);
          }
        }
        if (!quickChat) {
          oi.field_c = UsernameCredentials.readHuffmanText(var8, 80, -14832);
          EmptyWidgetRenderer.field_c = null;
          return new ChatMessage(quickChat);
        }
        var5 = var8.readUnsignedShort(255);
        try {
          var9 = LegacyOpenGlBuffer.field_c.getPhrase(var5, -32769);
          oi.field_c = var9.previewText(1118);
          if (!MarkerTrackWidget.field_E.equals(qv.field_o)) {
            stackIn_24_0 = var9.responseIds;
          } else {
            stackIn_24_0 = null;
          }
          EmptyWidgetRenderer.field_c = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          IntrusiveNode.reportClientError("CC1", (Throwable) ((Object) var6), 0);
          EmptyWidgetRenderer.field_c = null;
          oi.field_c = null;
          return new ChatMessage(quickChat);
        }
        return new ChatMessage(quickChat);
    }

    public static void releaseStatics(int param0) {
        int var1 = -113 % ((param0 + 31) / 47);
        field_r = null;
    }

    protected r() {
    }

    static {
        field_r = new int[8192];
    }
}
