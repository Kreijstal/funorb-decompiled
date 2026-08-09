/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln {
    static Vector field_d;
    static int field_b;
    static int field_c;
    private java.util.zip.Inflater field_a;

    public ln() {
        this(-1, 1000000, 1000000);
    }

    private ln(int param0, int param1, int param2) {
    }

    final void a(boolean param0, byte[] param1, kg param2) {
        try {
            try {
                if (31 != param2.field_m[param2.field_n] || -117 != param2.field_m[1 + param2.field_n]) {
                    throw new RuntimeException("");
                }
                if (param0) {
                    ln.a(50);
                }
                if (this.field_a == null) {
                    this.field_a = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_a.setInput(param2.field_m, param2.field_n + 10, -8 + (-param2.field_n + -10) + param2.field_m.length);
                    this.field_a.inflate(param1);
                } catch (Exception exception) {
                    this.field_a.reset();
                    throw new RuntimeException("");
                }
                this.field_a.reset();
            } catch (RuntimeException runtimeException) {
                throw sd.a((Throwable) ((Object) runtimeException), "ln.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -46) {
            ln.a(-12);
        }
    }

    static {
        field_b = 66;
        field_d = new Vector();
    }
}
