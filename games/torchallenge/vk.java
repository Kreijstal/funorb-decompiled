/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    boolean field_e;
    static long field_f;
    static String field_c;
    String field_g;
    static ka field_d;
    static boolean field_b;
    String field_a;
    static int field_h;
    static qe field_i;
    static int field_k;
    static int field_j;

    final static void a(int param0, byte param1) {
        e var2 = null;
        int var3 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        e var2Lifetime1;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          sh.field_r = param0;
          if (param1 < 66) {
            return;
          }
          var2 = (e) (tj.field_e.c((byte) 107));
          while (var2 != null) {
            if (var2.field_k.b(11163)) {
              var2.field_n.f(128 + sh.field_r * var2.field_l >> 8);
            } else {
              var2.a(true);
            }
            var2 = (e) (tj.field_e.c(-270));
          }
          if (null == TorChallenge.field_I) {
            return;
          }
          var2Lifetime1 = (e) (TorChallenge.field_I.c((byte) 119));
          while (var2Lifetime1 != null) {
            stackIn_15_0 = var2Lifetime1.field_k.b(11163);
            if (stackIn_15_0) {
              var2Lifetime1.field_n.f(128 + sh.field_r * var2Lifetime1.field_l >> 8);
            } else {
              var2Lifetime1.a(true);
            }
            var2Lifetime1 = (e) (TorChallenge.field_I.c(-270));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "vk.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 111 % ((-3 - param0) / 47);
        field_d = null;
        field_i = null;
        field_c = null;
    }

    static {
        field_c = "Play the game without logging in just yet";
        field_b = false;
    }
}
