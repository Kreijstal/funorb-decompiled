/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AllianceExpiredEvent extends IntrusiveNode {
    static Sprite field_h;
    static String field_m;
    static Sprite field_k;
    static int field_n;
    static volatile int field_i;
    static wq[] field_j;
    static qr field_l;

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = js.field_f;
        var2.h(param0, 255);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(2, (byte) -99);
        var2.writeBytes(0, id.field_c.length, id.field_c, 22186);
        var2.writeByte(qj.field_b, (byte) -114);
        if (param1 <= 64) {
          return;
        }
        var2.writeByte(RecklessAi.field_q, (byte) -58);
        var2.writeBytes(0, qj.field_f.length, qj.field_f, 22186);
        var2.patchLengthByte(var2.position - var3, (byte) 126);
    }

    AllianceExpiredEvent(Player param0, Player param1) {
    }

    public static void clearStatics(boolean param0) {
        field_m = null;
        field_l = null;
        if (!param0) {
          return;
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    static {
        int var0 = 0;
        field_n = 0;
        field_m = "Player names can be up to 12 letters, numbers and underscores";
        field_i = -1;
        field_h = new Sprite(270, 70);
        field_j = new wq[255];
        for (var0 = 0; var0 < field_j.length; var0++) {
          field_j[var0] = new wq();
        }
    }
}
