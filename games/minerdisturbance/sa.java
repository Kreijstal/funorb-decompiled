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
        if (param1 != 2) {
          return 49;
        } else {
          param0 = (-715827883 & param0 >>> 422520545) + (param0 & 1431655765);
          param0 = (858993459 & param0) + ((-858993460 & param0) >>> -65190590);
          param0 = param0 - -(param0 >>> 11786052) & 252645135;
          param0 = param0 + (param0 >>> 1609586632);
          param0 = param0 + (param0 >>> -1859175504);
          return 255 & param0;
        }
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
        int stackOut_7_0 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            L2: {
              if (param0 <= param1) {
                break L2;
              } else {
                var3_int = param1;
                param1 = param0;
                param0 = var3_int;
                break L2;
              }
            }
            L3: while (true) {
              if (0 == param0) {
                stackOut_7_0 = param1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var3_int = param1 % param0;
                param1 = param0;
                param0 = var3_int;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "sa.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    sa(rc param0, pi param1) {
        try {
            this.field_n = param0;
            this.field_q = param0.i();
            this.field_p = param1;
            this.field_n.f(128 + this.field_q * oc.field_f >> -994431608);
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
