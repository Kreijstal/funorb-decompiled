/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static String muGamelistOwner;
    static int[] field_b;
    static int field_e;
    static UiComponent field_f;
    static int keycodeDefaultLeft2;
    static String no;
    static int[] field_c;

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 == 4) {
          muGamelistOwner = null;
          no = null;
          field_b = null;
          field_f = null;
          return;
        }
        field_f = (UiComponent) null;
        muGamelistOwner = null;
        no = null;
        field_b = null;
        field_f = null;
    }

    final static void showEmptyLoginForm(int obfuscationGuard) {
        String var2 = (String) null;
        AccountDisplayNameSupport.showLoginForm((String) null, -125, "");
        if (obfuscationGuard != 3) {
          field_f = (UiComponent) null;
        }
    }

    abstract void setBytes(byte[] param0, byte param1);

    abstract byte[] toByteArray(int param0);

    final static void d(int param0) {
        if (LookupProtocolSupport.field_e != 0) {
          TextureCache.field_c.sprite = TransformRotationSupport.createTextLabelSprite(2, 0, BeveledFrameSpriteFactory.off);
          if (param0 > -97) {
            ByteStorage.showEmptyLoginForm(111);
            return;
          }
          return;
        }
        TextureCache.field_c.sprite = TransformRotationSupport.createTextLabelSprite(3, 0, AppletUrlSupport.on);
        if (param0 > -97) {
          ByteStorage.showEmptyLoginForm(111);
          return;
        }
    }

    static {
        field_b = new int[4];
        muGamelistOwner = "Owner";
        keycodeDefaultLeft2 = 96;
        no = "No";
    }
}
