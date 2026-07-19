/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static char field_d;
    static boolean field_b;
    static long field_a;
    static kb field_e;
    static String[] field_c;

    final static int a(byte param0) {
        int var1 = 124 / ((43 - param0) / 37);
        return uh.field_d;
    }

    final static void a(byte param0, int param1) {
        if (param0 < 9) {
            return;
        }
        int discarded$0 = cj.a(-104);
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -28 % ((57 - param0) / 48);
            ri.a(be.field_I, param1, true, kg.field_c, (byte) -81, bb.field_G, 0);
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (kg.field_c <= var3) {
                    break L3;
                  } else {
                    pd.field_e[param1 + var3] = var3;
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ri.a(dc.field_o, param1 + param1, false, param1 + kg.field_c, (byte) -81, bi.field_e, param1);
                break L2;
              }
              if (param1 >= kg.field_c) {
                break L0;
              } else {
                kg.field_c = param1;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "ta.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, o[] param2, int param3, int param4, mg param5, int param6, int param7, int param8, o[] param9, int param10, int param11, mg param12, int param13, boolean param14) {
        try {
            o[] var16 = (o[]) null;
            pk.a(param1, 0, param4, param12, param7, rj.field_c, 480, pb.field_b, param13, param9, param3, (byte) -111, (o[]) null, hc.field_d, param8, param11, param6, param5, 0, param10, param2);
            if (param0) {
                ta.b((byte) 72);
            }
            ck.a(param14, (byte) 66);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ta.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    public static void b(byte param0) {
        int discarded$0 = 0;
        if (param0 != 14) {
            discarded$0 = ta.a((byte) -21);
            field_e = null;
            field_c = null;
            return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_a = 20000000L;
        field_e = new kb();
    }
}
