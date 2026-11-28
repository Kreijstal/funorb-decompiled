/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    int field_e;
    int field_d;
    static IntrusiveDeque field_i;
    int field_k;
    int field_j;
    static RgbSprite field_a;
    static IndexedSprite[] field_b;
    static int field_f;
    static int[] field_c;
    static String field_g;
    static IndexedSprite[] field_h;

    final static void a(boolean param0, String param1, String param2) {
        try {
          if (null != AccountServiceResult.field_d) {
            AccountServiceResult.field_d.g((byte) -122);
          }
          ib.field_e = new LoginPanel(param2, param1, param0, true, true);
          ke.field_s.b(ib.field_e, (byte) 110);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "ak.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_g = null;
        field_h = null;
        field_b = null;
        field_i = null;
        if (param0 != -15673) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_i = new IntrusiveDeque();
        field_f = 0;
        field_c = new int[]{5, 17, 18};
        field_g = "Email is valid";
    }
}
