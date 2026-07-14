/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static java.awt.Font field_b;
    long field_a;
    static java.util.zip.CRC32 field_d;
    private wl field_c;

    final static void b(int param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ll var1 = new ll(param0, 140);
        cm.a(var1, param0 + -15032);
        re.a();
        vp.a();
        it.field_c = 0;
        wj.e((byte) -128);
        ll var2 = var1.d();
        for (var3 = 0; -16 < (var3 ^ -1); var3++) {
            var2.c(-2, -2, 16777215);
            vp.a(4, 4, 0, 0, 540, 140);
        }
        oo.field_W.b();
        var1.d(0, 0);
        sl.c(2765);
    }

    protected final void finalize() throws Throwable {
        ((aq) this).field_c.a(((aq) this).field_a, 3);
        this.finalize();
    }

    public static void a(int param0) {
        if (param0 != 32683) {
            aq.a(-86);
        }
        field_b = null;
        field_d = null;
    }

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4 = param3.length();
        param3.setLength(param2);
        if (param1 != -2) {
            StringBuilder var6 = (StringBuilder) null;
            StringBuilder discarded$0 = aq.a('.', 9, -96, (StringBuilder) null);
        }
        for (var5 = var4; var5 < param2; var5++) {
            param3.setCharAt(var5, param0);
        }
        return param3;
    }

    aq(wl param0, long param1, int param2) {
        ((aq) this).field_a = param1;
        ((aq) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new java.util.zip.CRC32();
    }
}
