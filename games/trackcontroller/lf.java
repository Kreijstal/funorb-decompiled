/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends lb implements wk {
    static String field_U;
    static int[] field_Y;
    static String field_T;
    private eh field_V;
    static int[] field_X;
    private int field_S;
    static String field_W;

    lf(String param0, tg param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, byte param2, al param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((lf) this).field_S = -param1 + -((lf) this).field_p + kf.field_b;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "lf.EA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, eh param1) {
        if (param0 != 1) {
            return;
        }
        try {
            ((lf) this).field_V = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "lf.AA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final eh a(byte param0) {
        if (param0 >= -56) {
            eh discarded$0 = ((lf) this).a((byte) 21);
            return ((lf) this).field_V;
        }
        return ((lf) this).field_V;
    }

    final static int a(int param0, int param1, byte param2, boolean param3) {
        if (param2 != 95) {
            return 57;
        }
        int discarded$0 = 0;
        return ia.b();
    }

    final void b(boolean param0) {
        super.b(param0);
        if (!(((lf) this).field_V == null)) {
            ((lf) this).field_V.a(-97);
        }
    }

    public static void f() {
        field_X = null;
        field_W = null;
        field_U = null;
        field_T = null;
        field_Y = null;
    }

    final static boolean a(byte param0, la param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1.d(0, 1) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("lf.W(").append(-68).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final String e(int param0) {
        if (((lf) this).field_q) {
          if (null != ((lf) this).field_n) {
            if (param0 != 0) {
              int discarded$2 = lf.a(34, 125, (byte) -88, true);
              cj.a(true, ((lf) this).field_x + -((lf) this).field_S + kf.field_b, fg.field_a);
              return ((lf) this).field_n;
            } else {
              cj.a(true, ((lf) this).field_x + -((lf) this).field_S + kf.field_b, fg.field_a);
              return ((lf) this).field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Accept";
        field_X = new int[8192];
        field_W = "Waiting for levels";
    }
}
