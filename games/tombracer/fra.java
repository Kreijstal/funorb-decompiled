/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fra extends nv {
    static nh field_q;
    static float field_p;
    static char[] field_n;
    private up field_r;
    int field_o;

    final void k(int param0) {
        ((fra) this).field_o = ((fra) this).b(true).a(125, ((fra) this).field_g.e(9648), ((fra) this).field_r, ((fra) this).field_g.a((byte) 55), ((fra) this).field_g.c(-111), ((fra) this).field_g.d(param0 + -5415));
        if (param0 != 5418) {
            ((fra) this).k(-67);
        }
    }

    fra(la param0, boolean param1) {
        super(param0, param1);
        ((fra) this).field_o = 0;
        try {
            ((fra) this).field_r = new up(1, 50);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fra.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    fra(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((fra) this).field_o = 0;
        try {
            ((fra) this).field_r = ad.a((byte) 87, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fra.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(boolean param0, up param1) {
        RuntimeException runtimeException = null;
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
              ((fra) this).field_r = param1;
              if (param0) {
                break L1;
              } else {
                field_q = null;
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
            stackOut_3_1 = new StringBuilder().append("fra.L(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            return 23;
        }
        return param0;
    }

    public static void b() {
        field_q = null;
        field_n = null;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            ((fra) this).field_r.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fra.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            ((fra) this).field_r.a((gma) (Object) ((fra) this).e(6), 2348);
            param1.b((byte) -103, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fra.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((fra) this).a(false);
            return 0;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1.0f;
        field_n = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
