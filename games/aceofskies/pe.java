/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pe implements Iterator {
    static gl[] field_b;
    private lc field_e;
    private wf field_f;
    private wf field_d;
    private int field_a;
    static String field_c;
    static long field_g;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        if (param1 != 1) {
            return (Class) null;
        }
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (param0.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param0.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    private final void a(boolean param0) {
        ((pe) this).field_d = ((pe) this).field_e.field_a[0].field_a;
        ((pe) this).field_a = 1;
        if (!param0) {
            return;
        }
        ((pe) this).field_f = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        if (((pe) this).field_d != ((pe) this).field_e.field_a[-1 + ((pe) this).field_a]) {
          return true;
        } else {
          L0: while (true) {
            if (((pe) this).field_a >= ((pe) this).field_e.field_c) {
              return false;
            } else {
              ((pe) this).field_a = ((pe) this).field_a + 1;
              if (((pe) this).field_e.field_a[((pe) this).field_a].field_a != ((pe) this).field_e.field_a[((pe) this).field_a + -1]) {
                ((pe) this).field_d = ((pe) this).field_e.field_a[((pe) this).field_a + -1].field_a;
                return true;
              } else {
                ((pe) this).field_d = ((pe) this).field_e.field_a[((pe) this).field_a - 1];
                continue L0;
              }
            }
          }
        }
    }

    final static void a(gk param0, byte param1, gk param2, gk param3) {
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        oo.field_ab = new vd[2];
        for (var4 = 0; oo.field_ab.length > var4; var4++) {
            oo.field_ab[var4] = vd.b(param3, "aceofskies", "background" + var4);
        }
        jd.field_d = new vd[8][];
        for (var4 = 0; (var4 ^ -1) > -9; var4++) {
            jd.field_d[var4] = vd.a(param3, "aceofskies", "plane" + var4);
        }
        if (param1 <= 22) {
            field_c = (String) null;
        }
        na.field_c = new vd[1];
        for (var4 = 0; -2 < (var4 ^ -1); var4++) {
            na.field_c[var4] = vd.b(param3, "aceofskies", "cloud" + var4);
        }
        l.field_a = vd.b(param3, "aceofskies", "bullet");
        tq.field_h = vd.a(param3, "aceofskies", "smoke");
        ud.field_f = vd.a(param3, "aceofskies", "explosion");
        gn.field_b = vd.a(param3, "aceofskies", "scorch");
        fs.field_e = vd.b(param3, "", "titleimage");
        ps.field_f = new vd[3][];
        ps.field_f[0] = vd.a(param3, "aceofskies", "oilgauge");
        ps.field_f[1] = vd.a(param3, "aceofskies", "heatgauge");
        ps.field_f[2] = vd.a(param3, "aceofskies", "supergauge");
        qq.field_e = vd.a(param3, "aceofskies", "upgrades");
        o.field_a = vd.a(param3, "aceofskies", "radar");
        eb.field_c = new vd[2];
        eb.field_c[0] = vd.b(param3, "aceofskies", "scorecounter");
        eb.field_c[1] = vd.b(param3, "aceofskies", "multiplier");
        kb.field_D = vd.a(param3, "aceofskies", "scorenumbers");
        hq.field_a = vd.a(param3, "aceofskies", "levelring");
        qa.field_a = vd.a(param3, "", "keys");
        dl.field_m = vd.a(param3, "", "fontalpha");
        hi.field_v = tg.a(param0, 8191, "", "font");
        q.field_o = vd.a(param3, "", "bigfontalpha");
        kn.field_b = tg.a(param0, 8191, "", "bigfont");
        nc.field_a = vd.a(param3, "", "titlefontalpha");
        dp.field_h = tg.a(param0, 8191, "", "titlefont");
        lt.field_v = vd.b(param3, "", "woodentile");
        gu.field_a = vd.a(param3, "", "brassframe");
        vl.field_b = vd.a(param3, "", "brassbutton");
        qk.field_a = vd.a(param3, "", "brassslider");
        ol.field_e = vd.a(param3, "aceofskies", "powerchutes");
        nu.field_b = vd.a(param3, "aceofskies", "powericons");
        tt.field_c = new vd[2];
        tt.field_c[0] = vd.b(param3, "aceofskies", "glassbulb");
        tt.field_c[1] = vd.b(param3, "aceofskies", "bulblight");
        la.field_g = vd.a(param3, "", "achievements");
        af.field_c = vd.a(param3, "", "medals");
        vl.field_c = vd.b(param2, "basic", "orbcoin");
        es.field_i = vd.b(param2, "basic", "locked");
        uc.field_g = vd.b(param2, "basic", "unachieved");
    }

    public final void remove() {
        if (!(null != ((pe) this).field_f)) {
            throw new IllegalStateException();
        }
        ((pe) this).field_f.c(-123);
        ((pe) this).field_f = null;
    }

    public final Object next() {
        wf var1 = null;
        int var2 = AceOfSkies.field_G ? 1 : 0;
        if (!(((pe) this).field_d == ((pe) this).field_e.field_a[-1 + ((pe) this).field_a])) {
            var1 = ((pe) this).field_d;
            ((pe) this).field_f = var1;
            ((pe) this).field_d = ((wf) var1).field_a;
            return (Object) (Object) var1;
        }
        do {
            if (((pe) this).field_a >= ((pe) this).field_e.field_c) {
                return null;
            }
            ((pe) this).field_a = ((pe) this).field_a + 1;
            var1 = ((pe) this).field_e.field_a[((pe) this).field_a].field_a;
        } while (((pe) this).field_e.field_a[-1 + ((pe) this).field_a] == var1);
        ((pe) this).field_f = var1;
        ((pe) this).field_d = ((wf) var1).field_a;
        return (Object) (Object) var1;
    }

    pe(lc param0) {
        ((pe) this).field_f = null;
        ((pe) this).field_e = param0;
        this.a(true);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 19592) {
            return;
        }
        field_c = null;
    }

    final static qm a(byte param0) {
        int var1 = 33 / ((14 - param0) / 58);
        if (!(ij.field_j != null)) {
            ij.field_j = new qm(oi.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, oi.field_c.field_I, -1, 2147483647, true);
        }
        return ij.field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new gl[255];
        for (var0 = 0; field_b.length > var0; var0++) {
            field_b[var0] = new gl();
        }
        field_c = "This is a hidden Achievement";
    }
}
