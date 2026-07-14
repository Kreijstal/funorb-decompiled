/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gh extends km {
    static String field_Kb;
    String field_Pb;
    int field_Nb;
    String field_Jb;
    km field_Eb;
    static nh field_Ib;
    km field_Mb;
    String field_Hb;
    String field_Ob;
    static String field_Fb;
    static String field_Lb;
    km field_Gb;

    final static String a(long param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wc.field_l.setTime(new Date(param0));
        var3 = wc.field_l.get(7);
        var4 = wc.field_l.get(5);
        var5 = wc.field_l.get(2);
        var6 = wc.field_l.get(1);
        if (param1 <= 74) {
          return null;
        } else {
          var7 = wc.field_l.get(11);
          var8 = wc.field_l.get(12);
          var9 = wc.field_l.get(13);
          return fn.field_b[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + pg.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    public static void d(boolean param0) {
        field_Lb = null;
        field_Fb = null;
        field_Ib = null;
        field_Kb = null;
        if (param0) {
            gh.d(true);
        }
    }

    gh() {
        super(0L, (km) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_Lb = "AI: <%0>";
    }
}
