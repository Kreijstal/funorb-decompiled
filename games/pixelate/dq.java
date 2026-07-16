/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_c;
    static String field_d;
    static String field_a;
    static String[][] field_b;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (-1 < (param1 ^ -1)) {
            return false;
        }
        if ((param1 ^ -1) < -12) {
            return false;
        }
        if (param2 < (param0 ^ -1)) {
            return false;
        }
        if ((bo.a((byte) -57, param3, param1) ^ -1) > (param0 ^ -1)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, og param2) {
        pc var3 = null;
        int var4 = 0;
        pc var6 = null;
        pc var7 = null;
        if (param1 == -18989) {
          var7 = aa.field_f;
          var3 = var7;
          var7.g(param0, 15514);
          var7.field_m = var7.field_m + 1;
          var4 = var7.field_m;
          var7.e(160, 1);
          if (param2.field_k != null) {
            var7.e(160, param2.field_k.length);
            var7.a(param2.field_k.length, 0, param1 + 15496, param2.field_k);
            int discarded$8 = var7.b(var4, (byte) 48);
            var7.field_m = var7.field_m - 4;
            param2.field_m = var7.k(param1 + 18989);
            var7.f(var7.field_m + -var4, param1 + 18988);
            return;
          } else {
            var7.e(160, 0);
            int discarded$9 = var7.b(var4, (byte) 48);
            var7.field_m = var7.field_m - 4;
            param2.field_m = var7.k(param1 + 18989);
            var7.f(var7.field_m + -var4, param1 + 18988);
            return;
          }
        } else {
          field_c = null;
          var6 = aa.field_f;
          var3 = var6;
          var6.g(param0, 15514);
          var6.field_m = var6.field_m + 1;
          var4 = var6.field_m;
          var6.e(160, 1);
          if (param2.field_k != null) {
            var6.e(160, param2.field_k.length);
            var6.a(param2.field_k.length, 0, param1 + 15496, param2.field_k);
            int discarded$10 = var6.b(var4, (byte) 48);
            var6.field_m = var6.field_m - 4;
            param2.field_m = var6.k(param1 + 18989);
            var6.f(var6.field_m + -var4, param1 + 18988);
            return;
          } else {
            var6.e(160, 0);
            int discarded$11 = var6.b(var4, (byte) 48);
            var6.field_m = var6.field_m - 4;
            param2.field_m = var6.k(param1 + 18989);
            var6.f(var6.field_m + -var4, param1 + 18988);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        int var1 = -55 % ((param0 - -67) / 53);
    }

    final static hh a(byte param0, String param1, String param2, fm param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 31) {
          return null;
        } else {
          var4 = param3.a(117, param2);
          var5 = param3.a((byte) -125, param1, var4);
          return lh.a(var4, param3, var5, 119);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Offer rematch";
        field_d = "Scamming";
        field_a = "The requirements for this Achievement are hidden.";
    }
}
