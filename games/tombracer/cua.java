/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cua {
    static String[] field_b;
    private cka field_a;
    long field_c;

    public static void a() {
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        kh var4 = null;
        if (param1 != 3) {
            return;
        }
        if (rda.field_o == param0) {
            return;
        }
        ht var6 = (ht) (Object) jb.field_K.a(-115, (long)rda.field_o);
        ht var7 = var6;
        rda.field_o = param0;
        if (var7 != null) {
            var7.field_Cb = null;
        } else {
            var4 = ql.field_k;
            var4.k(param2, param1 ^ -2985);
            var4.i(3, param1 + -3);
            var4.i(11, 0);
            var4.f(-1477662136, param0);
            return;
        }
        var4 = ql.field_k;
        var4.k(param2, param1 ^ -2985);
        var4.i(3, param1 + -3);
        var4.i(11, 0);
        var4.f(-1477662136, param0);
    }

    final static void a(ht param0, byte param1) {
        RuntimeException runtimeException = null;
        ht var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.p(17);
            var2 = (ht) (Object) asa.field_j.f(-80);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param0, 71)) {
                    break L2;
                  } else {
                    var2 = (ht) (Object) asa.field_j.e(113);
                    continue L1;
                  }
                }
              }
              L3: {
                if (var2 == null) {
                  asa.field_j.b((byte) -59, (vg) (Object) param0);
                  break L3;
                } else {
                  ln.a((vg) (Object) var2, (vg) (Object) param0, (byte) -120);
                  break L3;
                }
              }
              var3 = 27 % ((-29 - param1) / 55);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("cua.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        cc.a(37, param1, "");
        if (param0 > -16) {
            return;
        }
        try {
            int discarded$0 = -1978;
            nt.a(param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cua.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    protected final void finalize() throws Throwable {
        ((cua) this).field_a.a((byte) -105, ((cua) this).field_c);
        super.finalize();
    }

    cua(cka param0, long param1, fca[] param2) {
        try {
            ((cua) this).field_c = param1;
            ((cua) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cua.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
