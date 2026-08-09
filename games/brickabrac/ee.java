/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends vi {
    static jp field_p;
    static int field_q;
    static mh field_s;
    int field_t;
    static boolean[][] field_r;

    final static String b(boolean param0) {
        if (param0) {
            return (String) null;
        }
        if (!(jm.field_f != ik.field_g)) {
            return fj.field_Qb;
        }
        return dl.field_e;
    }

    private ee(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void c(int param0) {
        if (!(lg.a(9))) {
            return;
        }
        bq.a(false, param0, (byte) 104);
    }

    final static void d(byte param0) {
        ag.field_K = null;
        dl.field_d = null;
        if (param0 != 96) {
          field_p = (jp) null;
          cn.field_a = (byte[][]) null;
          jh.field_b = null;
          qp.field_c = null;
          gg.field_t = null;
          return;
        } else {
          cn.field_a = (byte[][]) null;
          jh.field_b = null;
          qp.field_c = null;
          gg.field_t = null;
          return;
        }
    }

    final void a(int param0, wq param1) {
        try {
            super.a(100, param1);
            this.field_t = param1.i(65280);
            if (param0 <= 89) {
                field_p = (jp) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ee.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        String var2;
        if (param0 >= -45) {
          field_s = (mh) null;
          var2 = (String) null;
          fr.a(true, (String) null, "");
          return;
        } else {
          var2 = (String) null;
          fr.a(true, (String) null, "");
          return;
        }
    }

    final int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                field_s = (mh) null;
                break L1;
              }
            }
            stackIn_3_0 = 1734820418 ^ super.a(99, param1) ^ 101 * this.field_t + 42148 << 2099020834;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ee.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        int var1 = -7 / ((param0 - 17) / 34);
        field_s = null;
        field_p = null;
        field_r = (boolean[][]) null;
    }

    ee() {
        this(0, 0, 0, 0, 0);
    }

    static {
        field_q = 1;
    }
}
