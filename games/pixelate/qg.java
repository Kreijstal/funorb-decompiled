/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_c;
    static String[] field_d;
    static String field_b;
    static IndexedSprite[] field_a;

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 124) {
          field_d = (String[]) null;
        }
    }

    final static void sendDeclineGameRequest(int param0, int param1, boolean param2) {
        CipherPacketBuffer var3 = null;
        CipherPacketBuffer var3Lifetime1;
        if (!param2) {
          var3 = ChatMessage.field_f;
          var3.writeOpcode(param1, 15514);
          var3.writeByte(160, 3);
          var3.writeByte(160, 9);
          var3.writeShort(1276387944, param0);
          return;
        }
        field_c = (String) null;
        var3Lifetime1 = ChatMessage.field_f;
        var3Lifetime1.writeOpcode(param1, 15514);
        var3Lifetime1.writeByte(160, 3);
        var3Lifetime1.writeByte(160, 9);
        var3Lifetime1.writeShort(1276387944, param0);
    }

    static {
        field_c = "Unable to delete friend - system busy";
        field_b = null;
        field_d = new String[]{"Points are awarded for <col=ffff00>pictures completed</col> and <col=ffff00>tiles landed correctly</col>.", "Try to get the best score you can. Good luck!"};
    }
}
