/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg {
    static int[] field_e;
    static boolean field_a;
    private java.util.zip.Inflater field_c;
    static int[] field_b;
    static volatile int field_d;

    public jg() {
        this(-1, 1000000, 1000000);
    }

    final static void b(int param0, int param1) {
        pl var2 = null;
        var2 = as.field_v;
        var2.g(param1, 8);
        var2.b((byte) 106, 1);
        if (param0 != 11044) {
          return;
        } else {
          var2.b((byte) 79, 0);
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(byte[] param0, byte param1, fs param2) {
        try {
            if (param2.field_n[param2.field_p] == 31) {
                // if_icmpne L47
            } else {
                throw new RuntimeException("");
            }
            if (null == ((jg) this).field_c) {
                ((jg) this).field_c = new java.util.zip.Inflater(true);
            }
            if (param1 != -104) {
                ((jg) this).field_c = null;
            }
            try {
                ((jg) this).field_c.setInput(param2.field_n, 10 + param2.field_p, param2.field_n.length + (-param2.field_p + -10 - 8));
                int discarded$0 = ((jg) this).field_c.inflate(param0);
            } catch (Exception exception) {
                ((jg) this).field_c.reset();
                throw new RuntimeException("");
            }
            ((jg) this).field_c.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private jg(int param0, int param1, int param2) {
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 < 2) {
            field_a = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1];
        field_a = false;
        field_d = 0;
    }
}
