/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static BinaryBitmapFont field_e;
    static boolean field_b;
    static int[] field_a;
    static long field_d;
    static String field_c;

    final static void openPrivateChat(String param0, long param1, byte param2) {
        CharSequence var5 = null;
        CheckboxPainter.field_k = param0;
        if (param2 != 8) {
          return;
        }
        try {
          ce.field_d = 2;
          var5 = (CharSequence) ((Object) param0);
          fp.field_d = dh.normalizeDisplayName(var5, (byte) 74);
          fp.field_e = param1;
          ib.openRootQuickChatMenu(param2 ^ 20550);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "qj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void sendLeaveGameRequest(boolean param0, int param1, int param2) {
        CipherPacketBuffer var3 = null;
        CipherPacketBuffer var3Lifetime1;
        if (!param0) {
          var3 = ChatMessage.field_f;
          var3.writeOpcode(param2, 15514);
          var3.writeByte(160, 3);
          var3.writeByte(160, 10);
          var3.writeShort(1276387944, param1);
          return;
        }
        qj.releaseStaticReferences(false);
        var3Lifetime1 = ChatMessage.field_f;
        var3Lifetime1.writeOpcode(param2, 15514);
        var3Lifetime1.writeByte(160, 3);
        var3Lifetime1.writeByte(160, 10);
        var3Lifetime1.writeShort(1276387944, param1);
    }

    public static void releaseStaticReferences(boolean param0) {
        field_c = null;
        field_e = null;
        field_a = null;
        if (param0) {
          field_e = (BinaryBitmapFont) null;
        }
    }

    static {
        field_c = "Puzzle Failed!";
    }
}
