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
        int var1 = 0;
        var1 = -51 / ((param0 - -22) / 47);
        if (he.field_Xb != null) {
          if (!he.field_Xb.e((byte) 32)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -1) {
          field_g = 64;
          field_f = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_h = null;
          return;
        }
    }

    s() {
    }

    s(s param0) {
        ((s) this).field_j = param0.field_j;
        ((s) this).field_e = param0.field_e;
        ((s) this).field_i = param0.field_i;
        ((s) this).field_d = param0.field_d;
    }

    final static cb a(byte param0) {
        try {
            Throwable var1 = null;
            Object stackIn_2_0 = null;
            cb stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            cb stackOut_3_0 = null;
            try {
              if (param0 == -110) {
                return (cb) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              stackOut_3_0 = (cb) Class.forName("hb").newInstance();
              stackIn_4_0 = stackOut_3_0;
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
        field_h = "Exploiting a bug";
        field_g = -1;
        field_c = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
