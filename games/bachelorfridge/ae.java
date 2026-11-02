/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static UiComponent field_a;

    final static UiComponent a(boolean param0) {
        if (!param0) {
          ae.a(false);
          return qba.field_m.field_vb;
        }
        return qba.field_m.field_vb;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 30317) {
          field_a = (UiComponent) null;
        }
    }

    static {
    }
}
