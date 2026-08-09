/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le implements uj {
    static String field_b;
    static String field_c;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -9392) {
            le.a((byte) -55, 29);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            L0: {
              if (param0 < -95) {
                break L0;
              } else {
                le.a((byte) 52, -104);
                break L0;
              }
            }
            try {
              L1: {
                lk.a("resizing", bm.c(-117), 16715, new Object[]{new Integer(param1)});
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, sb param1, int param2, int param3, int param4) {
        param1.c(12, 25564);
        param1.b((byte) 121, 17);
        param1.b((byte) 122, param0);
        param1.b((byte) 121, param3);
        if (param4 >= -34) {
            return;
        }
        try {
            param1.c(param2, 25564);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "le.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(boolean param0) {
        bc.field_a = 0;
        tb.field_a = 2;
        if (param0) {
            field_b = (String) null;
        }
    }

    final static hf a(int param0, byte[] param1, int param2) {
        hf var3 = null;
        RuntimeException var3_ref = null;
        hf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new hf(param1);
              kk.field_a.a((byte) -92, var3);
              if (param0 == 0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            ag.a(var3, param2, param0 ^ -123);
            stackIn_3_0 = (hf) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("le.F(").append(param0).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        if (param0 != 8952) {
            field_b = (String) null;
        }
    }

    public final String a(byte param0) {
        int var2 = 100 / ((param0 - -33) / 62);
        return "Make Rock Empty";
    }

    static {
        field_c = "Ranking: Iceman";
        field_b = "Unpacking sound effects";
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
