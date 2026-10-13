/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String field_d;
    static mh field_c;
    static boolean field_f;
    static String field_e;
    static jp field_a;
    static eg field_g;
    static n field_b;

    final static void a(int param0, long param1, boolean param2) {
        BitPacketBuffer var4 = k.field_h;
        var4.writeCipheredOpcode(-13413, param0);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(96, 7);
        var4.writeLong(-23054, param1);
        var4.backfillByteLength((byte) 113, -var5 + var4.position);
        if (param2) {
          return;
        }
        rf.a((byte) 102);
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_d = null;
        if (param0 != 98) {
          return;
        }
        field_a = null;
        field_e = null;
        field_b = null;
    }

    static {
        field_d = "Your email address is used to identify this account";
        field_g = null;
        field_e = "to keep fullscreen or";
    }
}
