/*
 * Decompiled by CFR-JS 0.4.0.
 */
class q {
    q field_h;
    static String field_i;
    long field_f;
    static ce field_c;
    static int field_g;
    q field_e;
    static int field_d;
    static int[] field_b;
    static cd field_a;

    final static void a(int param0, int param1, int param2, fj param3, int param4) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param3.b(90, 12);
              param3.a(17, 124);
              param3.a(param2, 120);
              param3.a(param4, 71);
              param3.b(90, param0);
              if (param1 > 94) {
                break L1;
              } else {
                var6 = null;
                q.a(-127, 58, -29, (fj) null, -68);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("q.GB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param4 + 41);
        }
    }

    final void f(int param0) {
        if (null != ((q) this).field_h) {
          if (param0 != 0) {
            ((q) this).field_e = null;
            ((q) this).field_h.field_e = ((q) this).field_e;
            ((q) this).field_e.field_h = ((q) this).field_h;
            ((q) this).field_h = null;
            ((q) this).field_e = null;
            return;
          } else {
            ((q) this).field_h.field_e = ((q) this).field_e;
            ((q) this).field_e.field_h = ((q) this).field_h;
            ((q) this).field_h = null;
            ((q) this).field_e = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean e(int param0) {
        if (((q) this).field_h == null) {
            return false;
        }
        if (param0 != 17) {
            return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_b = null;
        field_i = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<col=2>No animals were harmed in the making of this game.</col>";
        field_g = 0;
        field_d = 0;
        field_c = new ce();
        field_a = new cd();
    }
}
