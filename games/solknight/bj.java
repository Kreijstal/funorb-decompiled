/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static kb field_a;

    final static void a(int param0, int param1) {
        if (param0 != 50) {
          throw new IllegalArgumentException();
        }
        if (param1 > -116) {
          bj.clearStaticReferences(-36);
          return;
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 50) {
          field_a = (kb) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = new kb();
    }
}
