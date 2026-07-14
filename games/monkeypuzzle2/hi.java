/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private java.util.zip.Inflater field_d;
    static wh field_a;
    static int field_c;
    static dk field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -32) {
            field_b = null;
        }
    }

    private hi(int param0, int param1, int param2) {
    }

    final void a(int param0, byte[] param1, gk param2) {
        try {
            if ((param2.field_g[param2.field_h] ^ -1) == -32) {
                // if_icmpne L47
            } else {
                throw new RuntimeException("");
            }
            if (null == ((hi) this).field_d) {
                ((hi) this).field_d = new java.util.zip.Inflater(true);
            }
            try {
                if (param0 < 30) {
                    hi.a(80);
                }
                ((hi) this).field_d.setInput(param2.field_g, param2.field_h + 10, -param2.field_h - 10 - 8 + param2.field_g.length);
                int discarded$0 = ((hi) this).field_d.inflate(param1);
            } catch (Exception exception) {
                ((hi) this).field_d.reset();
                throw new RuntimeException("");
            }
            ((hi) this).field_d.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public hi() {
        this(-1, 1000000, 1000000);
    }

    static {
    }
}
