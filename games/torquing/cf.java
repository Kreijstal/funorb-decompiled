/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static int[] field_a;
    private ta field_b;
    static boolean field_f;
    static volatile boolean field_c;
    static int field_e;
    static int field_g;
    private eb field_h;
    private int field_i;
    private gb field_d;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = Torquing.field_u;
        df.field_q.b(30752);
        for (var1_int = 0; 32 > var1_int; var1_int++) {
            ui.field_l[var1_int] = 0L;
        }
        for (var1_int = 0; var1_int < 32; var1_int++) {
            jl.field_V[var1_int] = 0L;
        }
        if (param0 != 6639) {
            return;
        }
        try {
            oi.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "cf.C(" + param0 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            cf.b(-90);
        }
        field_a = null;
    }

    final void a(long param0, ta param1, int param2) {
        RuntimeException runtimeException = null;
        ta var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (((cf) this).field_i != param2) {
                ((cf) this).field_i = ((cf) this).field_i - 1;
                break L1;
              } else {
                var5 = ((cf) this).field_d.a(param2 ^ 7);
                var5.f(param2);
                var5.h(0);
                if (((cf) this).field_b != var5) {
                  break L1;
                } else {
                  var5 = ((cf) this).field_d.a(-45);
                  var5.f(0);
                  var5.h(param2);
                  break L1;
                }
              }
            }
            ((cf) this).field_h.a(false, param0, (q) (Object) param1);
            ((cf) this).field_d.a((byte) 122, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("cf.D(").append(param0).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    final ta a(long param0, int param1) {
        if (param1 != 4604) {
            ((cf) this).field_h = null;
        }
        ta var4 = (ta) (Object) ((cf) this).field_h.a(param0, (byte) 89);
        if (var4 != null) {
            ((cf) this).field_d.a((byte) 118, var4);
        }
        return var4;
    }

    cf(int param0) {
        ((cf) this).field_b = new ta();
        ((cf) this).field_d = new gb();
        ((cf) this).field_i = param0;
        int var2 = 1;
        while (var2 - -var2 < param0) {
            var2 = var2 + var2;
        }
        ((cf) this).field_h = new eb(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
            field_a[var0] = cm.a(45, var0);
        }
        field_e = 250;
        field_c = true;
        field_g = 0;
    }
}
