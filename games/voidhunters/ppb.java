/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ppb {
    static ri field_c;
    static String field_d;
    static asb field_a;
    static cda field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -52 / ((param0 - -64) / 39);
        field_b = null;
        field_d = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2, int param3) {
        byte[] var4 = null;
        ps var5 = null;
        if (param0 == null) {
            return null;
        }
        if (!(!(param0 instanceof byte[]))) {
            var4 = (byte[]) param0;
            return qcb.a(param3, var4, param1, 31783);
        }
        if (!param2) {
            return null;
        }
        if (!(!(param0 instanceof ps))) {
            var5 = (ps) param0;
            return var5.a(param3, -106, param1);
        }
        throw new IllegalArgumentException();
    }

    final static rb a(String param0, int param1, byte param2) {
        aqb var3 = null;
        Object var4 = null;
        if (param2 >= -55) {
          var4 = null;
          rb discarded$2 = ppb.a((String) null, 112, (byte) 96);
          var3 = new aqb();
          ((rb) (Object) var3).field_b = param1;
          ((rb) (Object) var3).field_a = param0;
          return (rb) (Object) var3;
        } else {
          var3 = new aqb();
          ((rb) (Object) var3).field_b = param1;
          ((rb) (Object) var3).field_a = param0;
          return (rb) (Object) var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invisible";
        field_c = new ri(11, 0, 1, 2);
    }
}
