/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static o[][] field_b;
    static volatile int field_a;
    static o[] field_c;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 76 % ((param0 - 36) / 48);
    }

    final static ua a(kl param0, String param1, String param2, int param3, kl param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 < 36) {
          oc.a((byte) -8);
          var5 = param0.b(-1, param1);
          var6 = param0.a(var5, param2, -11986);
          return n.a(var5, param0, param4, -124, var6);
        } else {
          var5 = param0.b(-1, param1);
          var6 = param0.a(var5, param2, -11986);
          return n.a(var5, param0, param4, -124, var6);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
