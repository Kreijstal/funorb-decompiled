/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pi {
    static String field_r;
    pi field_p;
    int field_q;
    static ln[][] field_t;
    static volatile int field_o;
    rc field_n;
    static boolean field_u;
    static int field_s;

    final static int a(int param0, int param1) {
        if (param1 == 2) {
          param0 = (-715827883 & param0 >>> 1) + (param0 & 1431655765);
          param0 = (858993459 & param0) + ((-858993460 & param0) >>> 2);
          param0 = param0 + (param0 >>> 4) & 252645135;
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
        return 49;
    }

    public static void a(int param0) {
        if (param0 < 33) {
          return;
        }
        field_t = (ln[][]) null;
        field_r = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var4 = MinerDisturbance.field_ab;
        try {
          if (param2 != 0) {
            field_r = (String) null;
          }
          if (param0 > param1) {
            var3_int = param1;
            param1 = param0;
            param0 = var3_int;
          }
          while (0 != param0) {
            var3_intLifetime1 = param1 % param0;
            param1 = param0;
            param0 = var3_intLifetime1;
          }
          stackIn_8_0 = param1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "sa.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sa(rc param0, pi param1) {
        try {
          this.field_n = param0;
          this.field_q = param0.i();
          this.field_p = param1;
          this.field_n.f(128 + this.field_q * oc.field_f >> 8);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Dangerous new foe";
        field_o = -1;
        field_t = new ln[2][10];
        field_s = 200;
    }
}
