/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static int[] field_c;
    static fn field_a;
    static String field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(-1 == (7 & param0 ^ -1))) {
            var2 = -(param0 & 7) + 8;
        }
        int var4 = 94 % ((51 - param1) / 33);
        int var3 = var2 + param0;
        return var3;
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 == -2) {
          if (224 > gn.field_a) {
            var1 = gn.field_a % 32;
            rt.b(-var1 + (32 + gn.field_a), (byte) -116);
            return;
          } else {
            rt.b(256, (byte) -106);
            return;
          }
        } else {
          field_b = (String) null;
          if (224 > gn.field_a) {
            var1 = gn.field_a % 32;
            rt.b(-var1 + (32 + gn.field_a), (byte) -116);
            return;
          } else {
            rt.b(256, (byte) -106);
            return;
          }
        }
    }

    final static fr a(int param0, int param1, String param2) {
        fr var3 = null;
        if (param1 != 32) {
          dq.a((byte) 54);
          var3 = new fr(false);
          var3.field_a = param0;
          var3.field_f = param2;
          return var3;
        } else {
          var3 = new fr(false);
          var3.field_a = param0;
          var3.field_f = param2;
          return var3;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 < 119) {
            String var2 = (String) null;
            fr discarded$0 = dq.a(-37, 70, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_c = new int[8192];
    }
}
