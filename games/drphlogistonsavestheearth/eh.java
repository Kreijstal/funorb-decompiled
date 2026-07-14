/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static he[] field_b;
    static volatile boolean field_a;

    public static void a(byte param0) {
        int var1 = 77 % ((param0 - -13) / 44);
        field_b = null;
    }

    final static boolean a(int param0) {
        if (param0 != -875) {
            field_a = true;
            return bb.a((byte) -103);
        }
        return bb.a((byte) -103);
    }

    final static he a(String param0, byte param1, vj param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param1 >= -21) {
          var6 = null;
          he discarded$2 = eh.a((String) null, (byte) 119, (vj) null, (String) null);
          var4 = param2.a(param0, (byte) -104);
          var5 = param2.a((byte) -109, param3, var4);
          return cc.a(var4, -9671, param2, var5);
        } else {
          var4 = param2.a(param0, (byte) -104);
          var5 = param2.a((byte) -109, param3, var4);
          return cc.a(var4, -9671, param2, var5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
