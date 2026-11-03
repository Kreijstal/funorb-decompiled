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

    final static void b(int param0) {
        String var2 = (String) null;
        rf.a((String) null, -125, "");
        if (param0 != 3) {
          field_f = (UiComponent) null;
        }
    }

    abstract void setBytes(byte[] param0, byte param1);

    abstract byte[] toByteArray(int param0);

    final static void d(int param0) {
        if (un.field_e != 0) {
          TextureCache.field_c.sprite = dq.createTextLabelSprite(2, 0, il.off);
          if (param0 > -97) {
            ByteStorage.b(111);
            return;
          }
          return;
        }
        TextureCache.field_c.sprite = dq.createTextLabelSprite(3, 0, jc.on);
        if (param0 > -97) {
          ByteStorage.b(111);
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
