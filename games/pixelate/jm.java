/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jm {
    double field_m;
    static int field_j;
    int field_n;
    double field_e;
    int field_a;
    static volatile int field_o;
    int field_c;
    static String field_k;
    static ck[] field_d;
    int field_l;
    static gp field_b;
    int field_f;
    static bd field_q;
    static tf[] field_i;
    static ak field_h;
    static int[] field_g;
    static String field_s;
    static String field_p;
    int field_t;
    static boolean[][] field_r;

    final void a(byte param0) {
        this.field_c = -60 + ok.a(ea.field_b, -126, 480);
        this.field_l = ok.a(ea.field_b, -126, 50);
        this.field_e = (double)this.field_l / 100.0 + 0.3;
        int var2 = -112 / ((-40 - param0) / 47);
        this.field_t = (int)(this.field_e * 256.0);
        this.field_a = (int)(200.0 * (0.2 + this.field_e));
        this.field_f = (int)((this.field_e + 0.2) * 120.0);
        this.field_n = ok.a(ea.field_b, -108, 2);
        if (ok.a(ea.field_b, -126, 2) != 1) {
            this.field_m = (double)(-this.field_a);
        } else {
            this.field_e = -this.field_e;
            this.field_m = 640.0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        field_k = null;
        field_s = null;
        field_h = null;
        if (param0 != -1345) {
            return;
        }
        field_d = null;
        field_r = (boolean[][]) null;
        field_g = null;
        field_q = null;
        field_p = null;
    }

    final static String b(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        String discarded$0 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        String var6 = "(" + oj.field_G + " " + gb.field_d + " " + tm.field_U + ") " + mn.field_e;
        String var1 = var6;
        if (0 >= jj.field_b) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < jj.field_b; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & vi.field_o.field_k[var2];
                var4 = var3 >> -1773592156;
                if (10 > var4) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                if (-11 >= (var3 ^ -1)) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        if (param0 >= -4) {
            discarded$0 = jm.b(-28);
        }
        return var1;
    }

    jm() {
        this.a((byte) -107);
        this.field_m = (double)(ok.a(ea.field_b, -114, 640) + -100);
    }

    static {
        field_k = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = new ck[24];
        field_o = 0;
        field_q = new bd();
        field_p = "From only <%0>/month";
        field_s = "Challenge Mode";
    }
}
