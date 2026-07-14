/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends ms {
    int field_k;
    int[] field_q;
    int field_n;
    long field_s;
    int field_p;
    int field_o;
    int field_l;
    static String field_m;
    int field_t;
    int field_r;

    public static void c(boolean param0) {
        field_m = null;
        if (param0) {
            field_m = null;
        }
    }

    final static ce a(int param0, int param1, java.awt.Canvas param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ce var5 = null;
            li var5_ref = null;
            ce stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ce stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("jw");
                if (param3 <= -83) {
                  break L0;
                } else {
                  field_m = null;
                  break L0;
                }
              }
              var5 = (ce) var4.newInstance();
              var5.a(param2, param1, param0, 122);
              stackOut_2_0 = (ce) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    id(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((id) this).field_n = param2;
        ((id) this).field_q = param6;
        ld.field_D = ld.field_D + 1;
        ((id) this).field_r = 65535 & ld.field_D;
        ((id) this).field_t = param1;
        ((id) this).field_p = param4;
        ((id) this).field_o = param3;
        ((id) this).field_k = param5;
        ((id) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Return to game";
    }
}
