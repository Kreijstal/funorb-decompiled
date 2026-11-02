/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static IntrusiveDeque field_d;
    static String field_b;
    static int[] field_e;
    static int field_a;
    static int field_c;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_c = -99;
          field_d = null;
          field_b = null;
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static ClientException a(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_b = var2.field_b + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    final static void a(byte param0) {
        ee.field_a = new IntrusiveDeque();
        if (param0 != 38) {
          String var2 = (String) null;
          sd.a((Throwable) null, (String) null);
        }
    }

    static {
        field_d = new IntrusiveDeque();
        field_c = 0;
    }
}
