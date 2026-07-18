/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static eh field_a;
    int field_j;
    static String field_h;
    static String field_c;
    int field_e;
    int field_d;
    static km field_b;
    static int field_g;
    int field_i;
    static km field_f;

    final static boolean b(byte param0) {
        int var1 = 51;
        if (he.field_Xb == null) {
            return false;
        }
        if (!he.field_Xb.e((byte) 32)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_h = null;
    }

    s() {
    }

    s(s param0) {
        try {
            ((s) this).field_j = param0.field_j;
            ((s) this).field_e = param0.field_e;
            ((s) this).field_i = param0.field_i;
            ((s) this).field_d = param0.field_d;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static cb a(byte param0) {
        try {
            Throwable var1 = null;
            cb stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            cb stackOut_2_0 = null;
            try {
              L0: {
                stackOut_2_0 = (cb) Class.forName("hb").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Exploiting a bug";
        field_g = -1;
        field_c = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
