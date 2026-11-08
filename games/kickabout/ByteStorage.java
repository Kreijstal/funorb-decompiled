/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static ArgbSprite field_b;
    static String field_a;
    static r field_e;
    static int[] field_d;
    static boolean field_c;

    abstract byte[] a(int param0);

    abstract void setBytes(byte[] param0, int param1);

    final static void writeLookupQuery(int param0, LookupQuery param1, byte param2) {
        CipherPacketBuffer var4 = null;
        try {
          int var3_int = -84 / ((param2 + 50) / 61);
          var4 = or.field_d;
          var4.b(param0, (byte) -80);
          var4.writeByte(125, 2);
          var4.writeByte(119, 0);
          var4.writeByte(108, param1.tableId);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 > 90) {
          field_d = null;
          field_b = null;
          return;
        }
        field_a = (String) null;
        field_d = null;
        field_b = null;
    }

    final static void a(PacketBuffer param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        if (param1 != 542439655) {
          return;
        }
        try {
          pl.field_d = param0.readUnsignedShort((byte) 81) << 5;
          var2_int = param0.readUnsignedByte((byte) -125);
          pl.field_d = pl.field_d + (var2_int >> 3);
          AuctionsHelpScreen.field_E = 1835008 & var2_int << 18;
          AuctionsHelpScreen.field_E = AuctionsHelpScreen.field_E + (param0.readUnsignedShort((byte) 81) << 2);
          var2_intLifetime1 = param0.readUnsignedByte((byte) -126);
          MenuButton.field_j = 2064384 & var2_intLifetime1 << 15;
          AuctionsHelpScreen.field_E = AuctionsHelpScreen.field_E + (var2_intLifetime1 >> 6);
          MenuButton.field_j = MenuButton.field_j + (param0.readUnsignedByte((byte) -106) << 7);
          var2_intLifetime2 = param0.readUnsignedByte((byte) -105);
          MenuButton.field_j = MenuButton.field_j + (var2_intLifetime2 >> 1);
          FormationView.field_r = (var2_intLifetime2 & 1) << 16;
          FormationView.field_r = FormationView.field_r + param0.readUnsignedShort((byte) 81);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "<%0> and <%1> have equal game stats. <%2> wins the tournament by a random 50/50 chance.";
        field_e = new r();
        field_c = true;
    }
}
