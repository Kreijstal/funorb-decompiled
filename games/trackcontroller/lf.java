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
            this.field_S = -param1 + -this.field_p + kf.field_b;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "lf.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, eh param1) {
        if (param0 != 1) {
            return;
        }
        try {
            this.field_V = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "lf.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final eh a(byte param0) {
        if (param0 >= -56) {
            this.a((byte) 21);
            return this.field_V;
        }
        return this.field_V;
    }

    final static int a(int param0, int param1, byte param2, boolean param3) {
        if (param2 != 95) {
            return 57;
        }
        return ia.b(false);
    }

    final void b(boolean param0) {
        super.b(param0);
        if (!(this.field_V == null)) {
            this.field_V.a(-97);
        }
    }

    public static void f(byte param0) {
        field_X = null;
        field_W = null;
        field_U = null;
        field_T = null;
        if (param0 > -33) {
          lf.a(68, 38, (byte) -50, true);
          field_Y = null;
          return;
        } else {
          field_Y = null;
          return;
        }
    }

    final static boolean a(byte param0, la param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -68) {
              L1: {
                if (param1.d(0, 1) != 1) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("lf.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final String e(int param0) {
        if (this.field_q) {
          if (null != this.field_n) {
            if (param0 != 0) {
              lf.a(34, 125, (byte) -88, true);
              cj.a(true, this.field_x + -this.field_S + kf.field_b, fg.field_a);
              return this.field_n;
            } else {
              cj.a(true, this.field_x + -this.field_S + kf.field_b, fg.field_a);
              return this.field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        field_U = "Accept";
        field_X = new int[8192];
        field_W = "Waiting for levels";
    }
}
