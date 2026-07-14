/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg {
    static f field_a;
    private java.util.zip.Inflater field_c;
    static int field_e;
    static mf field_b;
    static int field_d;

    public mg() {
        this(-1, 1000000, 1000000);
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 10) {
            mg.a(109);
            return fb.b(-122);
        }
        return fb.b(-122);
    }

    final static void a(int param0) {
        nf.field_M = mi.c((byte) 105);
        nb.field_a = new f();
        wa.a(true, true, 30);
        if (param0 >= -53) {
            int discarded$0 = mg.a(true, 123, -100, 21);
        }
    }

    private mg(int param0, int param1, int param2) {
    }

    final void a(byte param0, byte[] param1, ni param2) {
        try {
            if (param2.field_k[param2.field_i] == 31) {
                // if_icmpne L47
            } else {
                throw new RuntimeException("");
            }
            if (!(((mg) this).field_c != null)) {
                ((mg) this).field_c = new java.util.zip.Inflater(true);
            }
            int var4 = 84 % ((-67 - param0) / 59);
            try {
                ((mg) this).field_c.setInput(param2.field_k, param2.field_i + 10, param2.field_k.length + -param2.field_i - 10 - 8);
                int discarded$0 = ((mg) this).field_c.inflate(param1);
            } catch (Exception exception) {
                ((mg) this).field_c.reset();
                throw new RuntimeException("");
            }
            ((mg) this).field_c.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
    }
}
