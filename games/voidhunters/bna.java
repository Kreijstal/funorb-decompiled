/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends is {
    static String field_m;
    private java.lang.ref.SoftReference field_l;

    final static void e(int param0) {
        ff.field_o.field_g = 0;
        ff.field_o.field_k = 0;
    }

    final Object a(int param0) {
        if (param0 < 85) {
            field_m = null;
            return ((bna) this).field_l.get();
        }
        return ((bna) this).field_l.get();
    }

    bna(Object param0, int param1) {
        super(param1);
        try {
            try {
                ((bna) this).field_l = new java.lang.ref.SoftReference(param0);
            } catch (RuntimeException runtimeException) {
                throw rta.a((Throwable) (Object) runtimeException, "bna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean e(byte param0) {
        if (param0 <= 29) {
            Object discarded$0 = ((bna) this).a(-10);
            return true;
        }
        return true;
    }

    public static void a(boolean param0) {
        if (!param0) {
            bna.a(false);
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Asking to join <%0>'s game...";
    }
}
