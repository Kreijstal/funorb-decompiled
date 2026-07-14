/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends nl {
    private java.nio.ByteBuffer field_d;

    final static void a(byte param0, int param1) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = -95 % ((25 - param0) / 50);
        cg var3 = (cg) (Object) ca.field_n.a(true);
        while (var3 != null) {
            Lexicominos.a(-17800, var3, param1);
            var3 = (cg) (Object) ca.field_n.f(2);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            Object var3 = null;
            boolean discarded$0 = bh.a(true, (CharSequence) null, -76);
        }
        tg.a(param1, true, 114);
    }

    final void a(byte[] param0, boolean param1) {
        if (!param1) {
            ((bh) this).field_d = null;
        }
        ((bh) this).field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$0 = ((bh) this).field_d.position(0);
        java.nio.ByteBuffer discarded$1 = ((bh) this).field_d.put(param0);
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        nl.a(param1, 0, true, -123, rb.field_a, r.field_D, pf.field_o);
        if (param0 != 83) {
            return;
        }
        for (var2 = 0; var2 < pf.field_o; var2++) {
            ff.field_a[var2 - -param1] = var2;
        }
        nl.a(param1 + param1, param1, false, -93, l.field_G, ve.field_d, pf.field_o - -param1);
        if (!(param1 >= pf.field_o)) {
            pf.field_o = param1;
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param2 > -68) {
            return false;
        }
        if (!(bb.a(param1, param0, -1))) {
            return false;
        }
        for (var3 = 0; param1.length() > var3; var3++) {
            if (!(ee.a(-125, param1.charAt(var3)))) {
                return false;
            }
        }
        return true;
    }

    final byte[] a(byte param0) {
        byte[] var3 = new byte[((bh) this).field_d.capacity()];
        byte[] var2 = var3;
        if (param0 != -121) {
            return null;
        }
        java.nio.Buffer discarded$0 = ((bh) this).field_d.position(0);
        java.nio.ByteBuffer discarded$1 = ((bh) this).field_d.get(var3);
        return var3;
    }

    bh() {
    }

    static {
    }
}
