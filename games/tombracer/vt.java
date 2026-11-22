/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt {
    static IntrusiveDeque field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 <= 51) {
          vt.releaseStatics((byte) -125);
        }
    }

    public vt() {
        TooltipVisibility discarded$0 = new TooltipVisibility();
    }

    static {
        field_z = "vt.A(";
        field_a = new IntrusiveDeque();
    }
}
