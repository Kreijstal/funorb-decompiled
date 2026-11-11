/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static String field_c;
    int field_a;
    int field_e;
    int field_d;
    int field_b;

    final static int b(byte param0) {
        if (param0 <= 110) {
          pa.b((byte) 37);
          return PitSnakeModel.field_b;
        }
        return PitSnakeModel.field_b;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 != 117) {
          pa.b((byte) -106);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        tga.field_a.b(param1, -11185, param0, SoundEvent.withFullAlpha(param4, param2), param3);
    }

    static {
        field_c = "Full screen";
    }
}
