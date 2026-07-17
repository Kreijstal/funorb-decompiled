/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nra implements bo {
    static int[][] field_g;
    private long field_l;
    private int field_f;
    private long field_e;
    private int field_k;
    private int field_m;
    private int field_i;
    private long field_b;
    static jea field_c;
    static jea field_a;
    private long field_n;
    private int field_d;
    private int field_h;
    private long field_j;

    public final void a(int param0, kh param1) {
        param1.a(1736565456, ((nra) this).field_j);
        param1.f(param0 ^ -1477662080, ((nra) this).field_m);
        param1.i(((nra) this).field_f, 0);
        param1.a(((nra) this).field_h, (byte) -84);
        param1.a(((nra) this).field_d, (byte) -117);
        param1.a(((nra) this).field_i, (byte) -109);
        param1.a(((nra) this).field_k, (byte) 4);
        param1.a(1736565456, ((nra) this).field_e);
        param1.a(1736565456, ((nra) this).field_n);
        param1.a(param0 ^ 1736565272, ((nra) this).field_b);
        if (param0 != 200) {
            return;
        }
        try {
            param1.a(param0 ^ 1736565272, ((nra) this).field_l);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nra.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(kh param0, byte param1) {
        ((nra) this).field_j = param0.b(290646880);
        ((nra) this).field_m = param0.d(122);
        ((nra) this).field_f = param0.h(param1 + 274);
        if (param1 != -19) {
            return;
        }
        try {
            ((nra) this).field_h = param0.e(-126);
            ((nra) this).field_d = param0.e(-51);
            ((nra) this).field_i = param0.e(-25);
            ((nra) this).field_k = param0.e(100);
            ((nra) this).field_e = param0.b(290646880);
            ((nra) this).field_n = param0.b(param1 + 290646899);
            ((nra) this).field_b = param0.b(param1 ^ -290646899);
            ((nra) this).field_l = param0.b(290646880);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nra.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_g = null;
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param4--;
            param2--;
            var5_int = param2 + -7;
            L1: while (true) {
              if (param4 >= var5_int) {
                L2: while (true) {
                  if (param4 >= param2) {
                    break L0;
                  } else {
                    param4++;
                    param3[param4] = param1;
                    continue L2;
                  }
                }
              } else {
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                param4++;
                param3[param4] = param1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("nra.F(").append(-55).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
    }

    final void a(int param0, long param1) {
        ((nra) this).field_j = param1;
        if (param0 == -7) {
            return;
        }
        ((nra) this).field_k = -64;
    }

    final void a(long param0, long param1, boolean param2, long param3, long param4) {
        Object var11 = null;
        ((nra) this).field_e = param3;
        ((nra) this).field_l = param0;
        if (param2) {
          var11 = null;
          ((nra) this).a((kh) null, (byte) -83);
          ((nra) this).field_n = param1;
          ((nra) this).field_b = param4;
          return;
        } else {
          ((nra) this).field_n = param1;
          ((nra) this).field_b = param4;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((nra) this).field_i = param2;
        ((nra) this).field_h = param0;
        ((nra) this).field_d = param3;
        ((nra) this).field_k = param1;
        int var6 = -68 % ((-66 - param4) / 36);
    }

    final void b(int param0, int param1) {
        int var3 = -109 % ((87 - param0) / 38);
        ((nra) this).field_f = param1;
    }

    final void a(int param0, int param1) {
        if (param1 > -69) {
            ((nra) this).field_e = 126L;
            ((nra) this).field_m = param0;
            return;
        }
        ((nra) this).field_m = param0;
    }

    static {
    }
}
