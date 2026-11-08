/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static ck field_b;
    static String warningIfYouQuitText;

    final static void a(byte param0) {
        ce.field_o = new js();
        if (param0 >= 35) {
          vi.field_y.b((byte) -119, ce.field_o);
          return;
        }
        warningIfYouQuitText = (String) null;
        vi.field_y.b((byte) -119, ce.field_o);
    }

    public static void releaseStatics(boolean param0) {
        warningIfYouQuitText = null;
        if (!param0) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = new ck();
        warningIfYouQuitText = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
