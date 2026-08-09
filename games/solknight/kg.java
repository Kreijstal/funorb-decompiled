/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kg {
    static mg field_a;
    static ff field_f;
    private java.util.zip.Inflater field_d;
    static String field_b;
    static int field_e;
    static int field_c;

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        if (param0) {
            field_f = (ff) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != -15617) {
            field_c = 24;
        }
    }

    public kg() {
        this(-1, 1000000, 1000000);
    }

    private kg(int param0, int param1, int param2) {
    }

    final void a(byte param0, gb param1, byte[] param2) {
        try {
            try {
                if (param1.field_l[param1.field_m] != 31 || -117 != param1.field_l[param1.field_m + 1]) {
                    throw new RuntimeException("");
                }
                if (null == this.field_d) {
                    this.field_d = new java.util.zip.Inflater(true);
                }
                if (param0 != 97) {
                    byte[] var5 = (byte[]) null;
                    this.a((byte) 118, (gb) null, (byte[]) null);
                }
                try {
                    this.field_d.setInput(param1.field_l, 10 + param1.field_m, -param1.field_m + (-10 + (-8 + param1.field_l.length)));
                    this.field_d.inflate(param2);
                } catch (Exception exception) {
                    this.field_d.reset();
                    throw new RuntimeException("");
                }
                this.field_d.reset();
            } catch (RuntimeException runtimeException) {
                throw fc.a((Throwable) ((Object) runtimeException), "kg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Mouse over an icon for details";
        field_e = 50;
        field_f = new ff(13, 0, 1, 0);
    }
}
