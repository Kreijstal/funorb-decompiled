/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wka extends eta {
    static float field_b;
    static BufferedCacheFile field_c;
    static boolean field_d;

    wka() {
    }

    final static void patchJavaKeyCodeMap(int param0) {
        RoomVariant.field_c[59] = 57;
        RoomVariant.field_c[45] = 26;
        RoomVariant.field_c[61] = 27;
        RoomVariant.field_c[46] = 72;
        RoomVariant.field_c[47] = 73;
        RoomVariant.field_c[44] = 71;
        RoomVariant.field_c[92] = 74;
        RoomVariant.field_c[93] = 43;
        RoomVariant.field_c[91] = 42;
        RoomVariant.field_c[192] = 28;
        RoomVariant.field_c[222] = 58;
        RoomVariant.field_c[param0] = 59;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != -31068) {
          field_b = 0.14074614644050598f;
        }
    }

    static {
    }
}
