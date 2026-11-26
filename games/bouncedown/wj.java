/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static be field_c;
    static RgbSprite[] field_d;
    static String field_b;
    static int field_e;
    static AccountRequestState field_a;

    public static void a(int param0) {
        if (param0 == 0) {
          field_b = null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
        field_e = 48;
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static RgbSprite[] a(byte param0, int param1) {
        RgbSprite[] var3 = new RgbSprite[9];
        RgbSprite[] var2 = var3;
        if (param0 <= -53) {
          var3[4] = hc.a(64, param1, (byte) -123);
          return var2;
        }
        field_b = (String) null;
        var3[4] = hc.a(64, param1, (byte) -123);
        return var2;
    }

    static {
        field_e = 0;
        field_b = "Login: ";
        field_a = new AccountRequestState();
    }
}
