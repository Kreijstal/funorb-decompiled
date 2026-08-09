/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class t {
    private java.util.zip.Inflater field_d;
    static wh field_c;
    static java.awt.Font field_e;
    static int[] field_a;
    static long field_b;

    public t() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        if (param0 <= 121) {
            field_e = (java.awt.Font) null;
        }
    }

    private t(int param0, int param1, int param2) {
    }

    final void a(dh param0, int param1, byte[] param2) {
        try {
            try {
                if ((param0.field_i[param0.field_k] ^ -1) != -32 || (param0.field_i[1 + param0.field_k] ^ -1) != 116) {
                    throw new RuntimeException("");
                }
                if (!(null != this.field_d)) {
                    this.field_d = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_d.setInput(param0.field_i, param0.field_k + param1, -param0.field_k + (-18 + param0.field_i.length));
                    this.field_d.inflate(param2);
                } catch (Exception exception) {
                    this.field_d.reset();
                    throw new RuntimeException("");
                }
                this.field_d.reset();
            } catch (RuntimeException runtimeException) {
                throw qk.a((Throwable) ((Object) runtimeException), "t.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new int[8192];
    }
}
