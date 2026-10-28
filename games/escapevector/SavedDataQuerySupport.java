/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedDataQuerySupport {
    static PcmSample field_c;
    static int[] field_g;
    static boolean field_e;
    static int[] spriteHeights;
    static int[] field_f;
    static IntrusiveDeque field_b;
    static boolean field_d;

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          return;
        }
        field_c = null;
        spriteHeights = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static SavedDataQuery requestSavedData(int opcode, int guard) {
        SavedDataQuery var2 = new SavedDataQuery();
        SpriteState.field_w.addLast(-12328, var2);
        if (guard > 61) {
          MarkerSlider.writeSavedDataQuery(opcode, (byte) -71);
          return var2;
        }
        return (SavedDataQuery) null;
    }

    static {
        field_g = new int[]{0, 1, 1, 1};
        field_f = new int[16384];
        field_b = new IntrusiveDeque();
    }
}
