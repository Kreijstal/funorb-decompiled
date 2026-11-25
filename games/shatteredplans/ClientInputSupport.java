/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientInputSupport {
    static String field_a;
    static java.awt.Color field_h;
    static String field_g;
    static String field_e;
    static AnimatedPanel field_d;
    static String field_c;
    static int field_b;
    static int field_f;

    final static int getMouseIdleTicks(int param0) {
        int var1 = -92 % ((56 - param0) / 58);
        return TextHotspotRegion.field_q;
    }

    public static void clearStatics(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = 43 / ((param0 - 18) / 42);
        field_d = null;
        field_h = null;
        field_e = null;
        field_g = null;
    }

    final static void resetChatChannel(int param0) {
        ProductionContent.field_h = 0;
        int var1 = 42 % ((param0 - 4) / 47);
        MeshData.field_h = true;
    }

    static {
        field_a = "Systems";
        field_g = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_h = new java.awt.Color(10040319);
        field_c = "This is your RuneScape clan if you have one.";
        field_f = 1;
        field_e = "This password contains your Player Name, and would be easy to guess";
    }
}
