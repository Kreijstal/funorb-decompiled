/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends wi {
    static ak field_w;
    private bi field_r;
    int field_z;
    private String field_q;
    int field_y;
    private bi field_v;
    boolean field_t;
    static int field_s;
    static int[] field_u;
    fa field_x;

    final static int e() {
        return ng.field_c;
    }

    public static void d() {
        field_w = null;
        field_u = null;
    }

    final void c(int param0) {
        if (param0 <= 8) {
            Object var3 = null;
            String discarded$0 = rk.a((String) null, 32);
        }
        if (!(((rk) this).field_k)) {
            ((rk) this).field_c = false;
            return;
        }
        if (!((rk) this).a((byte) 122)) {
            return;
        }
        if (!((rk) this).field_c) {
            if (kc.field_f == 1) {
                ((rk) this).field_t = !((rk) this).field_t ? true : false;
            }
        }
        ((rk) this).field_c = kc.field_f == 1 ? true : false;
    }

    final void b(byte param0) {
        gb.a(ia.field_q);
        gb.a(((rk) this).field_l, ((rk) this).field_a, ((rk) this).field_n + ((rk) this).field_l, ((rk) this).field_a - -((rk) this).field_d);
        bi var2 = ((rk) this).field_t ? ((rk) this).field_r : ((rk) this).field_v;
        var2.a(((rk) this).field_l, ((rk) this).field_a);
        if (param0 >= -17) {
            Object var3 = null;
            String discarded$0 = rk.a((String) null, -66);
        }
        if (null != ((rk) this).field_x) {
            ((rk) this).field_x.c(((rk) this).field_q, ((rk) this).field_l + var2.field_c - -5, ((rk) this).field_x.field_N / 2 + (((rk) this).field_a + var2.field_a / 2), ((rk) this).field_y, ((rk) this).field_z);
        }
        gb.b(ia.field_q);
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param1 == 5) {
                    break L2;
                  } else {
                    field_w = null;
                    break L2;
                  }
                }
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-var4 + (-1 + var2_int)] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("rk.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    rk(int param0, int param1, bi param2, bi param3, String param4, fa param5) {
        ((rk) this).field_t = false;
        try {
            ((rk) this).field_q = param4;
            ((rk) this).field_x = param5;
            ((rk) this).field_r = param3;
            ((rk) this).field_l = param0;
            ((rk) this).field_v = param2;
            ((rk) this).field_a = param1;
            ((rk) this).field_n = ((rk) this).field_r.field_c + 5 - -((rk) this).field_x.b(((rk) this).field_q);
            ((rk) this).field_d = ((rk) this).field_r.field_a;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rk.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new ak();
        field_u = new int[5];
    }
}
