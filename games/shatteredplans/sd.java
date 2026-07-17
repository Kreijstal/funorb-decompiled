/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sd extends df {
    int field_x;
    private pf field_s;
    static int field_p;
    fs field_o;
    int[] field_w;
    int field_r;
    ln field_q;
    int[] field_u;
    static boolean field_v;
    static String field_t;
    static String field_y;

    void a(int param0, ln param1) {
        if (param0 != -21771) {
            return;
        }
        try {
            ((sd) this).field_s.a((byte) -113, (oh) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sd.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ln h(int param0) {
        if (param0 != -23410) {
          boolean discarded$2 = ((sd) this).e(126);
          return (ln) (Object) ((sd) this).field_s.a((byte) -71);
        } else {
          return (ln) (Object) ((sd) this).field_s.a((byte) -71);
        }
    }

    ln i(int param0) {
        if (param0 > -16) {
            return null;
        }
        return (ln) (Object) ((sd) this).field_s.h(43);
    }

    public static void f() {
        field_y = null;
        field_t = null;
    }

    boolean e(int param0) {
        if (param0 != 27650) {
            ((sd) this).field_u = null;
            return ((sd) this).field_s.g(27);
        }
        return ((sd) this).field_s.g(27);
    }

    void a(pf param0, int param1) {
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
              ((sd) this).field_s = param0;
              if (param1 == -9332) {
                break L1;
              } else {
                ln discarded$2 = ((sd) this).i(-14);
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
            stackOut_3_1 = new StringBuilder().append("sd.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    int g(int param0) {
        int var2 = -77 / ((param0 - 5) / 51);
        return ((sd) this).field_s.e(0);
    }

    ln j(int param0) {
        if (param0 != 18229) {
          int discarded$2 = ((sd) this).g(-119);
          return (ln) (Object) ((sd) this).field_s.d(0);
        } else {
          return (ln) (Object) ((sd) this).field_s.d(0);
        }
    }

    sd(fs param0, ln param1) {
        try {
            ((sd) this).field_q = param1;
            ((sd) this).field_o = param0;
            ((sd) this).field_s = new pf();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = false;
        field_y = "The following settings need to be changed:  ";
    }
}
