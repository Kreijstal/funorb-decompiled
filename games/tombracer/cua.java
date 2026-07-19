/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cua {
    static String[] field_b;
    private cka field_a;
    long field_c;

    public static void a(int param0) {
        if (param0 != 3) {
            return;
        }
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
        ht var6 = (ht) ((Object) jb.field_K.a(-115, (long)rda.field_o));
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
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.p(17);
            var2 = (ht) ((Object) asa.field_j.f(-80));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2.a(param0, 71);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var2 = (ht) ((Object) asa.field_j.e(113));
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var2 == null) {
                      break L5;
                    } else {
                      ln.a(var2, param0, (byte) -120);
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  asa.field_j.b((byte) -59, param0);
                  break L4;
                }
                stackOut_10_0 = 27 % ((-29 - param1) / 55);
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              var3 = stackIn_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("cua.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        cc.a(37, param1, "");
        if (param0 > -16) {
            return;
        }
        try {
            nt.a(param1, -1978);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cua.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_a.a((byte) -105, this.field_c);
        super.finalize();
    }

    cua(cka param0, long param1, fca[] param2) {
        try {
            this.field_c = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
