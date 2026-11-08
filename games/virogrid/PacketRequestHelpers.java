/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PacketRequestHelpers implements QuickChatPhraseHook {
    static int field_e;
    static double field_b;
    static String field_a;
    static SpriteWidget field_c;
    static String field_f;
    static SpriteWidget field_d;

    final static void sendByteRequest(int param0, int param1) {
        CipherPacketBuffer var2 = IterableNodeHashTable.field_g;
        var2.writeCipheredOpcode(param1, 8);
        var2.writeByte(1, param0 ^ 96);
        var2.writeByte(param0, 125);
    }

    final static void sendBytesPacket(byte param0, int param1, byte[] param2, int param3, boolean param4, int param5) {
        CipherPacketBuffer var6 = null;
        int var8 = 0;
        int var9 = 0;
        try {
          int var7 = 12 % ((param0 + 41) / 56);
          var6 = IterableNodeHashTable.field_g;
          var6.writeCipheredOpcode(param3, 8);
          var6.position = var6.position + 1;
          var8 = var6.position;
          var6.writeByte(4, -66);
          var6.writeByte(param5, 72);
          var9 = param1;
          if (param4) {
            var9 += 128;
          }
          var6.writeByte(var9, -95);
          var6.writeBytes(param2, param2.length, 0, (byte) 81);
          var6.backpatchByteLength(var6.position - var8, -1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 == 8342) {
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        }
        PacketRequestHelpers.releaseStatics(-64);
        field_d = null;
        field_f = null;
        field_c = null;
    }

    static {
        field_a = "You do not have a suitable number of players for the current options.";
        field_b = 0.0;
        field_f = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
