/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class apa {
    static long field_a;
    static String field_b;
    private iu[] field_d;
    static ada field_c;

    public static void a(byte param0) {
        field_c = null;
        int var1 = 71 / ((param0 - -26) / 32);
        field_b = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param0 != 57) {
          var7 = null;
          int discarded$2 = apa.a((byte) -51, true, (String) null);
          rsa.a(param4, ((apa) this).field_d, param2, -119, param1, param3);
          return;
        } else {
          rsa.a(param4, ((apa) this).field_d, param2, -119, param1, param3);
          return;
        }
    }

    private apa() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0, boolean param1, String param2) {
        if (param0 == -50) {
          if (!param1) {
            return kl.field_b.b(param2);
          } else {
            return bta.field_d.b(param2);
          }
        } else {
          field_b = null;
          if (!param1) {
            return kl.field_b.b(param2);
          } else {
            return bta.field_d.b(param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Walk into a key to pocket it, then walk into a lock to open it. You can hold only one key or other object at once. ";
    }
}
