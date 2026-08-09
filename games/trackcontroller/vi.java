/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vi {
    private java.util.zip.Inflater field_b;
    static cd field_f;
    static int field_c;
    static String field_a;
    static String field_e;
    static int field_d;

    private vi(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        if (param0 != -25590) {
          field_f = (cd) null;
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final void a(byte param0, byte[] param1, be param2) {
        try {
            if (param2.field_j[param2.field_k] != 31 || 116 != (param2.field_j[param2.field_k + 1] ^ -1)) {
                throw new RuntimeException("");
            }
            if (!(this.field_b != null)) {
                this.field_b = new java.util.zip.Inflater(true);
            }
            try {
                this.field_b.setInput(param2.field_j, 10 + param2.field_k, -10 - (param2.field_k + (8 - param2.field_j.length)));
                this.field_b.inflate(param1);
            } catch (Exception exception) {
                this.field_b.reset();
                throw new RuntimeException("");
            }
            if (param0 < 4) {
                return;
            }
            try {
                this.field_b.reset();
            } catch (RuntimeException runtimeException) {
                throw sl.a((Throwable) ((Object) runtimeException), "vi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public vi() {
        this(-1, 1000000, 1000000);
    }

    static {
        field_f = new cd(1);
        field_e = "Invalid password.";
    }
}
