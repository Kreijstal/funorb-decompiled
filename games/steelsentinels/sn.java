/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sn {
    private long field_m;
    static ul field_r;
    private long field_c;
    private RandomAccessFile field_e;
    static ml field_p;
    static String field_h;
    static String field_a;
    static int field_b;
    static boolean field_d;
    static String field_s;
    static boolean field_n;
    static kg field_j;
    static boolean field_l;
    static String field_k;
    static byte[][] field_g;
    static String field_o;
    static String[] field_i;
    static uf field_f;
    static int field_q;

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        int var1 = ck.field_c[param0];
        for (var2 = 1; var2 < ck.field_c.length; var2++) {
            var3 = ck.field_c[var2];
            ii.a(um.field_bb, var2 << 1432201316, um.field_bb, var1, var3);
            var1 = var1 + var3;
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            ((sn) this).field_e = null;
            if (!(null == ((sn) this).field_e)) {
                ((sn) this).field_e.close();
                ((sn) this).field_e = null;
            }
            return;
        }
        if (!(null == ((sn) this).field_e)) {
            ((sn) this).field_e.close();
            ((sn) this).field_e = null;
        }
    }

    final static fh a(byte[] param0, int param1) {
        int var2 = -113 / ((-47 - param1) / 35);
        if (param0 == null) {
            return null;
        }
        fh var3 = new fh(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, dl.field_L);
        uh.a(9324);
        return var3;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if ((((sn) this).field_m ^ -1L) > (((sn) this).field_c + (long)param0 ^ -1L)) {
            ((sn) this).field_e.seek(((sn) this).field_m);
            ((sn) this).field_e.write(1);
            throw new EOFException();
        }
        ((sn) this).field_e.write(param2, param3, param0);
        ((sn) this).field_c = ((sn) this).field_c + (long)param0;
        if (param1 != 1) {
            field_s = null;
            return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        ((sn) this).field_e.seek(param0);
        ((sn) this).field_c = param0;
        if (param1 != -1) {
            sn.a(-104);
            return;
        }
    }

    protected final void finalize() throws Throwable {
        if (null != ((sn) this).field_e) {
            System.out.println("");
            ((sn) this).a(true);
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_i = null;
        field_r = null;
        field_s = null;
        field_p = null;
        field_o = null;
        field_j = null;
        field_k = null;
        field_h = null;
    }

    final long d(int param0) throws IOException {
        if (param0 != 0) {
            sn.a(-66);
            return ((sn) this).field_e.length();
        }
        return ((sn) this).field_e.length();
    }

    final int a(byte[] param0, int param1, int param2, boolean param3) throws IOException {
        int var5 = ((sn) this).field_e.read(param0, param1, param2);
        if (param3) {
            sn.a(-122);
            if (var5 <= 0) {
                return var5;
            }
            ((sn) this).field_c = ((sn) this).field_c + (long)var5;
            return var5;
        }
        if (var5 > 0) {
            ((sn) this).field_c = ((sn) this).field_c + (long)var5;
            return var5;
        }
        return var5;
    }

    sn(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((sn) this).field_e = new RandomAccessFile(param0, param1);
        ((sn) this).field_c = 0L;
        ((sn) this).field_m = param2;
        int var5 = ((sn) this).field_e.read();
        if (var5 != -1) {
            // ifne L106
            ((sn) this).field_e.seek(0L);
            ((sn) this).field_e.write(var5);
        } else {
            ((sn) this).field_e.seek(0L);
            ((sn) this).field_e.seek(0L);
        }
        ((sn) this).field_e.seek(0L);
    }

    final static void c(int param0) {
        int var2 = SteelSentinels.field_G;
        if (!(oc.a((byte) 84))) {
            if (wb.field_c != null) {
                if (!wb.field_c.field_b) {
                    return;
                }
                ub.c(0);
                dl.field_J.a((lh) (Object) new jd(dl.field_J, wh.field_b), 116);
            }
            return;
        }
        boolean discarded$7 = dl.field_J.a((byte) 40, true, km.field_l, ml.field_e);
        if (param0 >= -13) {
            return;
        }
        dl.field_J.h((byte) -4);
        while (dl.f(22759)) {
            boolean discarded$8 = dl.field_J.a(true, ei.field_q, de.field_c);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ul();
        field_p = new ml();
        field_b = 1;
        field_s = "<%0> is already on your ignore list.";
        field_h = "Discard";
        field_k = "Respawns: <col=ffffff><%0></col>";
        field_n = false;
        field_o = "X";
        field_a = "ALT";
        field_i = new String[]{"CHASSIS", "HEAD", "ARM", "WING", "<img=8> LIGHT WEAPONS", "<img=9> HEAVY WEAPONS", "<img=10> ORDNANCE WEAPONS", "<img=11> SMALL ROCKETS AND MISSILES", "<img=12> LARGE ROCKETS AND MISSILES", "<img=18> NUKE - GOLEM CHASSIS ONLY", "REAR ARM", "BIG ARM"};
        field_q = -1;
    }
}
