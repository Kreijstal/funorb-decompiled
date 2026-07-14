/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk implements Runnable {
    static oi field_d;
    vh field_c;
    static vd field_a;
    volatile boolean field_e;
    volatile boolean field_g;
    static o field_b;
    volatile c[] field_f;

    public final void run() {
        int var1_int = 0;
        c var2 = null;
        int var4 = wizardrun.field_H;
        ((bk) this).field_e = true;
        try {
            while (!((bk) this).field_g) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = ((bk) this).field_f[var1_int];
                    if (var2 != null) {
                        var2.e();
                    }
                }
                tg.a(10L, false);
                Object var5 = null;
                bi.a(((bk) this).field_c, (byte) -105, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            rg.a((Throwable) (Object) exception, (String) null, -562);
        } finally {
            ((bk) this).field_e = false;
        }
    }

    final static void a(byte[] param0, int param1, boolean param2, File param3) throws IOException {
        FileOutputStream var4 = new FileOutputStream(param3);
        var4.write(param0, 0, param1);
        var4.close();
        if (!param2) {
            field_d = null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 2) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    bk() {
        ((bk) this).field_f = new c[2];
        ((bk) this).field_g = false;
        ((bk) this).field_e = false;
    }

    final static void b(int param0) {
        vf var1 = (vf) (Object) r.field_d.b((byte) 72);
        if (var1 == null) {
            ql.a(-82);
            return;
        }
        mg var2 = nk.field_N;
        int discarded$0 = var2.i(255);
        int var3 = -11 % ((param0 - 84) / 40);
        int discarded$1 = var2.i(255);
        int discarded$2 = var2.i(255);
        int discarded$3 = var2.i(255);
        var1.a(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new oi();
    }
}
