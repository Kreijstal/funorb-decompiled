/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oia implements gs {
    kva field_c;
    int field_a;
    static String field_e;
    private static String[] field_d;
    int field_b;

    public final boolean d(byte param0) {
        if (param0 != 48) {
            oia.b(true);
            return ((oia) this).field_c.d((byte) 48);
        }
        return ((oia) this).field_c.d((byte) 48);
    }

    public final boolean a(boolean param0, uh param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oia.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
          ((oia) this).field_a = -18;
          return ((oia) this).field_c.c((byte) 103) - -((oia) this).field_b;
        } else {
          return ((oia) this).field_c.c((byte) 103) - -((oia) this).field_b;
        }
    }

    public final void a(int param0, iq param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        gr var3 = ((oia) this).field_c.c(-100);
        if (var3 != null) {
            if (!(var3.a(-101))) {
                return;
            }
        }
        if (param0 < 103) {
            Object var8 = null;
            oia.a(9, (sda) null, 48);
        }
        ka var4 = ((oia) this).field_c.a((byte) 9, (oia) this);
        if (var4 == null) {
            return;
        }
        try {
            var5 = ((oia) this).b((byte) 69);
            var6 = ((oia) this).c((byte) 102);
            var7 = ((oia) this).e((byte) -114);
            gqa.a(0, -83584144, var6, var5, var4, var7);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oia.DB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
            field_d = null;
        }
    }

    public final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return true;
    }

    final static void a(int param0, sda param1, int param2) {
        kh var6 = null;
        int var4 = 0;
        try {
            var6 = ql.field_k;
            kh var3 = var6;
            var6.k(param0, -2988);
            var6.field_h = var6.field_h + 1;
            var4 = var6.field_h;
            var6.i(1, 0);
            if (null != param1.field_j) {
                var6.i(param1.field_j.length, 0);
                var6.a(0, param1.field_j, param1.field_j.length, 105);
            } else {
                var6.i(0, 0);
            }
            int var5 = 72 / ((30 - param2) / 34);
            int discarded$0 = var6.g(var4, 64);
            var6.field_h = var6.field_h - 4;
            param1.field_l = var6.e(115);
            var6.d(-var4 + var6.field_h, (byte) -110);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oia.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            int discarded$0 = ((oia) this).b((byte) -5);
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          ((oia) this).field_a = 113;
          return ((oia) this).field_c.e((byte) -119) - 17825792;
        } else {
          return ((oia) this).field_c.e((byte) -119) - 17825792;
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 - -23) / 53);
        return ((oia) this).field_c.b((byte) 103) + ((oia) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[2];
        field_d[0] = "Default";
        field_d[1] = "Other";
        field_e = "Next";
    }
}
