/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static RgbSprite field_a;

    public static void clearStaticReferences(int param0) {
        field_a = null;
        if (param0 != 12307) {
          t.clearStaticReferences(-10);
        }
    }

    final static DefaultTextWidgetRenderer b(int param0) {
        if (ProgressMessageDialog.field_kb == null) {
          ProgressMessageDialog.field_kb = new DefaultTextWidgetRenderer(ValidatedTextField.field_T, 20, 0, 0, 0, 11579568, -1, 0, 0, ValidatedTextField.field_T.field_E, -1, 2147483647, true);
        }
        int var1 = 28 % ((param0 - 69) / 52);
        return ProgressMessageDialog.field_kb;
    }

    static {
        field_a = new RgbSprite(270, 70);
    }
}
