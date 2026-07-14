/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rc {
    static int field_d;
    static String field_b;
    private java.util.zip.Inflater field_a;
    static int field_f;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 <= 112) {
            field_e = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public rc() {
        this(-1, 1000000, 1000000);
    }

    final void a(int param0, iw param1, byte[] param2) {
        try {
            if (-32 == param1.field_f[param1.field_n]) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (null == ((rc) this).field_a) {
                ((rc) this).field_a = new java.util.zip.Inflater(true);
            }
            try {
                ((rc) this).field_a.setInput(param1.field_f, 10 + param1.field_n, param1.field_f.length + (-10 + (-param1.field_n + -8)));
                if (param0 != -4019) {
                    rc.a(51);
                }
                int discarded$0 = ((rc) this).field_a.inflate(param2);
            } catch (Exception exception) {
                ((rc) this).field_a.reset();
                throw new RuntimeException("");
            }
            ((rc) this).field_a.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private rc(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_c = "<%0> cannot join; the game is full.";
        field_b = "Allow spectators?";
        field_e = "You have declined the invitation.";
    }
}
