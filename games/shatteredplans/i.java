/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class i implements iq {
    private int field_j;
    private int field_h;
    private int field_m;
    static pf field_n;
    private nq field_d;
    private int field_i;
    private int field_k;
    static qr field_g;
    static Calendar field_e;
    private int field_l;
    static String field_f;
    static boolean field_c;
    private int field_b;
    static String field_a;

    final static boolean c(int param0) {
        if (param0 != 0) {
            return true;
        }
        return k.field_b;
    }

    final static void a(byte param0, String param1, long param2) {
        gi.field_a = param1;
        em.field_h = 2;
        CharSequence var5 = (CharSequence) (Object) param1;
        nd.field_k = ji.a(var5, true);
        hd.field_k = param2;
        bo.r(0);
        if (param0 < 15) {
            field_e = null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 1) {
            i.a(-46, -90, 61, -9, 124, 49);
        }
        return el.field_b;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((param2 ^ -1) > -1) {
            param1 = param1 + param2;
            param2 = 0;
        }
        if (param5 < 0) {
            param0 = param0 + param5;
            param5 = 0;
        }
        if (!(param2 + param1 <= gf.field_k)) {
            param1 = gf.field_k + -param2;
        }
        int var7 = -116 % ((-62 - param4) / 53);
        if (!(param5 - -param0 <= gf.field_b)) {
            param0 = gf.field_b - param5;
        }
        int var6 = param1 + param2;
        for (var8 = param2; var8 < var6; var8++) {
            var9 = var8 * gf.field_b - -param5;
            for (var10 = param0; var10 > 0; var10--) {
                param1 = gf.field_h[var9];
                var11 = 65793 * param3;
                param2 = param1 + var11;
                var11 = (16711935 & var11) - -(16711935 & param1);
                param1 = (65536 & -var11 + param2) + (16777472 & var11);
                var9++;
                gf.field_h[var9] = ee.a(-(param1 >>> 2010402984) + param1, param2 - param1);
            }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        field_n = null;
        if (param0 != 16711935) {
            field_f = null;
        }
        field_e = null;
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rp var14 = null;
        vg stackIn_3_0 = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof rp) {
            stackOut_2_0 = (vg) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (vg) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (rp) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          gf.d(param1 - -param0.field_m, param3 - -param0.field_q, param0.field_x, param0.field_n, ((i) this).field_b);
          var7 = param1 + (param0.field_m - -var14.field_M);
          var8 = var14.field_L + param0.field_q + param3;
          gf.g(var7, var8, var14.field_E, ((i) this).field_l);
          if (-1 != var14.field_D) {
            var9 = (double)var14.field_D * 3.141592653589793 * 2.0 / (double)var14.field_F;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_E);
            var12 = (int)(Math.cos(var9) * (double)var14.field_E);
            gf.g(var7 - -var11, var12 + var8, 1, ((i) this).field_m);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param4 == 12) {
            break L3;
          } else {
            boolean discarded$2 = i.a(-18);
            break L3;
          }
        }
        L4: {
          gf.g(var7, var8, 2, 1);
          var9 = 3.141592653589793 * (double)var14.field_H * 2.0 / (double)var14.field_F;
          var11 = (int)(-Math.sin(var9) * (double)var14.field_E);
          var12 = (int)(Math.cos(var9) * (double)var14.field_E);
          gf.g(var7, var8, var11 + var7, var12 + var8, 1);
          if (((i) this).field_d != null) {
            var13 = ((i) this).field_h + var14.field_E + var14.field_M;
            int discarded$3 = ((i) this).field_d.a(param0.field_s, var13 + param1 - -param0.field_m, param3 + (param0.field_q - -((i) this).field_j), -var13 - (((i) this).field_h - param0.field_x), -(((i) this).field_h << -653177503) + param0.field_n, ((i) this).field_i, ((i) this).field_k, 1, 1, 0);
            break L4;
          } else {
            break L4;
          }
        }
    }

    i(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((i) this).field_i = param3;
        ((i) this).field_j = param2;
        ((i) this).field_d = param0;
        ((i) this).field_l = param5;
        ((i) this).field_h = param1;
        ((i) this).field_k = param4;
        ((i) this).field_b = param7;
        ((i) this).field_m = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new pf();
        field_c = false;
        field_f = "Select a friendly system to anchor one end of the Tannhäuser wormhole, or right click to cancel this project.";
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
