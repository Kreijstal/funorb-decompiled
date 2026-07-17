/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dla extends bf {
    static char field_j;
    nq field_n;
    static char[] field_i;
    static sna field_k;
    static String field_m;
    static hn field_l;

    final void a(int param0, lu param1) {
        try {
            er.a(((dla) this).field_n, 122, param1);
            int var3_int = 126 % ((param0 - -53) / 50);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dla.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(op param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -26281) {
                break L1;
              } else {
                var4 = null;
                ((dla) this).a(-110, (lu) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dla.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static void b(int param0) {
        Object var2 = null;
        rt.a(sc.field_n, (String) null, 9);
    }

    public static void a(int param0) {
        field_i = null;
        field_l = null;
        field_m = null;
        field_k = null;
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        try {
            for (var5_int = 0; wa.field_m.length > var5_int; var5_int++) {
                param4 = wa.field_m[var5_int];
                var6 = var5_int << 4;
                while (true) {
                    int incrementValue$0 = param4;
                    param4--;
                    if (incrementValue$0 == 0) {
                        break;
                    }
                    int incrementValue$1 = var6;
                    var6++;
                    param0 = ci.field_q[incrementValue$1];
                    param1[param3[param0]] = param1[param3[param0]] + 1;
                    ci.field_q[param1[param3[param0]]] = param0;
                }
                var5_int++;
            }
            var6 = -20 / ((8 - param2) / 33);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dla.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    dla(nq param0) {
        try {
            ((dla) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dla.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    dla(lu param0) {
        try {
            ((dla) this).field_n = qi.a(param0, (byte) 81);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dla.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new char[128];
        field_m = "Account created successfully!";
    }
}
