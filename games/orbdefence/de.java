/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static String field_b;
    static v field_a;
    static String field_c;

    final static u a(ki param0, int param1, boolean param2, int param3, ki param4) {
        if (param2) {
          if (!pk.a(107, param1, param0, param3)) {
            return null;
          } else {
            return ok.a(-3362, param4.b(param1, false, param3));
          }
        } else {
          pe discarded$6 = de.a((byte) -108);
          if (!pk.a(107, param1, param0, param3)) {
            return null;
          } else {
            return ok.a(-3362, param4.b(param1, false, param3));
          }
        }
    }

    final static void a(int param0, hj param1) {
        h.k(125);
        ul.a(param1.field_v, param1.field_s, param1.field_t);
        if (param0 >= -120) {
            de.a(-128);
        }
    }

    public static void a(int param0) {
        if (param0 != -2079) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static pe a(byte param0) {
        try {
            Throwable var1 = null;
            pe stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            pe stackOut_2_0 = null;
            if (param0 == -112) {
              try {
                stackOut_2_0 = (pe) Class.forName("ma").newInstance();
                stackIn_3_0 = stackOut_2_0;
              } catch (java.lang.Throwable decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_3_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "LIGHTNING BOLT";
    }
}
