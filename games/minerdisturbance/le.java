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
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
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
                Object discarded$1 = lk.a("resizing", bm.c(-117), 16715, new Object[1]);
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
        } else {
          param1.c(param2, 25564);
          return;
        }
    }

    public final void a(boolean param0) {
        bc.field_a = 0;
        tb.field_a = 2;
        if (param0) {
            field_b = null;
        }
    }

    final static hf a(int param0, byte[] param1, int param2) {
        hf var3 = null;
        var3 = new hf(param1);
        kk.field_a.a((byte) -92, (pi) (Object) var3);
        if (param0 != 0) {
          field_a = null;
          ag.a(var3, param2, param0 ^ -123);
          return var3;
        } else {
          ag.a(var3, param2, param0 ^ -123);
          return var3;
        }
    }

    final static void b(int param0) {
        if (param0 != 8952) {
            field_b = null;
        }
    }

    public final String a(byte param0) {
        int var2 = 100 / ((param0 - -33) / 62);
        return "Make Rock Empty";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Ranking: Iceman";
        field_b = "Unpacking sound effects";
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
