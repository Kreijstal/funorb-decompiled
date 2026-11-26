/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static int field_d;
    static ji field_b;
    static RgbSprite field_a;
    static long field_c;
    static PacketBuffer field_f;
    static ji field_e;

    final static String b(byte param0) {
        if (param0 != 99) {
          bb.clearStaticReferences((byte) 82);
          return sc.field_g.o(32);
        }
        return sc.field_g.o(32);
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 <= -59) {
          field_e = null;
          field_b = null;
          field_f = null;
          field_a = null;
          return;
        }
        field_e = (ji) null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
    }

    static {
        field_d = 0;
    }
}
