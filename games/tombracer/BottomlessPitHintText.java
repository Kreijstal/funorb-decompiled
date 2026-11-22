/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BottomlessPitHintText {
    static String text;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        text = null;
        if (param0 >= -29) {
          BottomlessPitHintText.releaseStatics((byte) 76);
        }
    }

    static {
        field_z = "bpa.A(";
        text = "Down down, deeper and down. Tread with care near bottomless pits; a tumble means instant death.";
    }
}
