/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jv extends tia {
    static String field_m;
    static sna field_i;
    private int field_k;
    static int field_j;
    private eaa field_l;

    jv(gj param0, ad param1, int param2) {
        super(param0, param1);
        try {
            this.field_k = param2;
            this.field_g = 128;
            this.field_l = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_i = null;
        if (param0 != 79) {
            return;
        }
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 25415) {
            this.a(45, -62, -59);
        }
        lr.a(65280, param0, 10, this.field_l, param2, (byte) -4);
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lh var9 = null;
        int var10 = BachelorFridge.field_y;
        if (param0 > 0) {
            this.a(20);
        }
        int fieldTemp$0 = this.field_g - 2;
        this.field_g = this.field_g - 2;
        if (fieldTemp$0 < 0) {
            return false;
        }
        if (-31 > (this.field_g ^ -1)) {
            var2 = this.field_g;
            var2 += 16;
            for (var3 = 0; (var3 ^ -1) > -17; var3++) {
                var4 = -(3.141592653589793 * (double)(2 * (kla.a(50, this.field_f, -2147483648) + (this.field_k + -1) * 50)) / 200.0 - 1.5707963267948966);
                var6 = (int)((double)(-1600 + (this.field_g << 1868921603)) * Math.sin(var4)) << 1711787556;
                var7 = (int)((double)(-1600 + (this.field_g << 504146915)) * Math.cos(var4)) << 2129711204;
                var8 = (int)(100.0 * Math.sin((double)var2 * 300.0));
                var9 = new lh(var6, var8, var7);
                kla.a(20, this.field_f, -2147483648);
                var9.field_p = -kla.a(5000, this.field_f, -2147483648);
                var9.field_k = -kla.a(5000, this.field_f, -2147483648);
                var9.field_g = -kla.a(5000, this.field_f, -2147483648);
                var9.field_o = -30 + this.field_g;
                var9.field_m = -1;
                var9.field_r = var4;
                var9.field_l = 0;
                this.field_l.a(var9, true);
            }
        }
        rr.a(121, this.field_l, this.field_g, this.field_f);
        return true;
    }

    static {
        field_m = "Send private message to <%0>";
    }
}
