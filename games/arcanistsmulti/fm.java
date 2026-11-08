/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static String field_e;
    static String field_a;
    String[] field_b;
    long field_f;
    static UiTheme field_c;
    long field_d;

    final static void a(int param0, boolean param1) {
        CipherPacketBuffer var5 = null;
        int var3 = 0;
        int var3Lifetime1;
        if (param1) {
          var5 = he.field_e;
          var5.writeOpcode((byte) -57, param0);
          var5.position = var5.position + 1;
          var3 = var5.position;
          var5.writeByte(2, (byte) -12);
          var5.writeBytes(MidiPcmStream.field_E, 0, (byte) -86, MidiPcmStream.field_E.length);
          var5.writeByte(q.field_L, (byte) -14);
          var5.writeByte(q.field_N, (byte) -3);
          var5.writeBytes(ng.field_D, 0, (byte) -86, ng.field_D.length);
          var5.writeByteLengthAtMark(var5.position - var3, (byte) 43);
          return;
        }
        fm.a(48, false);
        CipherPacketBuffer var4 = he.field_e;
        var4.writeOpcode((byte) -57, param0);
        var4.position = var4.position + 1;
        var3Lifetime1 = var4.position;
        var4.writeByte(2, (byte) -12);
        var4.writeBytes(MidiPcmStream.field_E, 0, (byte) -86, MidiPcmStream.field_E.length);
        var4.writeByte(q.field_L, (byte) -14);
        var4.writeByte(q.field_N, (byte) -3);
        var4.writeBytes(ng.field_D, 0, (byte) -86, ng.field_D.length);
        var4.writeByteLengthAtMark(var4.position - var3Lifetime1, (byte) 43);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    private fm() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Match by...";
        field_a = "You have entered another game.";
    }
}
