/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uaa extends kj {
    private aga field_j;
    static iga field_f;
    static sna field_i;
    private eaa field_h;
    private sl field_g;

    final void a(int param0, boolean param1, int param2) {
        Object var4 = null;
        bma var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = null;
        var7 = BachelorFridge.field_y;
        if (param1) {
          var4_ref = (bma) (Object) ((uaa) this).field_h.b((byte) 90);
          L0: while (true) {
            if (var4_ref == null) {
              return;
            } else {
              var5 = (var4_ref.field_i >> 1145143940) + param2;
              var6 = -(var4_ref.field_h >> -1326635548) + (param0 - -(var4_ref.field_q >> 2101345925));
              mla.field_b[var4_ref.field_v].e(var5, var6);
              var4_ref = (bma) (Object) ((uaa) this).field_h.c(0);
              continue L0;
            }
          }
        } else {
          String discarded$1 = uaa.d((byte) -65);
          var4_ref = (bma) (Object) ((uaa) this).field_h.b((byte) 90);
          L1: while (true) {
            if (var4_ref == null) {
              return;
            } else {
              var5 = (var4_ref.field_i >> 1145143940) + param2;
              var6 = -(var4_ref.field_h >> -1326635548) + (param0 - -(var4_ref.field_q >> 2101345925));
              mla.field_b[var4_ref.field_v].e(var5, var6);
              var4_ref = (bma) (Object) ((uaa) this).field_h.c(0);
              continue L1;
            }
          }
        }
    }

    uaa(gj param0, sl param1, aga param2) {
        super(param0, param1.field_i, param1.field_l);
        int var4 = 0;
        ((uaa) this).field_h = new eaa();
        ((uaa) this).field_g = param1;
        ((uaa) this).field_j = param2;
        for (var4 = 0; var4 < 500; var4++) {
            this.c(-22786);
        }
    }

    private final void c(int param0) {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        if (param0 != -22786) {
            return;
        }
        int var4 = var3 + var2;
        int var5 = var2 + -var3;
        int var6 = kla.a(1024, sma.field_I, -2147483648);
        bma var7 = new bma(var4, var6, var5, kla.a(mla.field_b.length, sma.field_I, param0 + -2147460862), 50 + kla.a(50, sma.field_I, param0 ^ 2147460862));
        var7.field_p = -64 + (var7.field_i >> 924775524);
        var7.field_g = (var7.field_q >> -1727847548) + -32;
        var7.field_k = var7.field_h >> -466803612;
        var7.field_l = -8;
        ((uaa) this).field_h.a((bw) (Object) var7, true);
    }

    final static String d(byte param0) {
        if (!(cha.field_l != null)) {
            return "";
        }
        if (param0 >= -24) {
            uaa.a(false);
            return cha.field_l;
        }
        return cha.field_l;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            field_f = null;
        }
    }

    public static void c(byte param0) {
        field_i = null;
        if (param0 != -126) {
            return;
        }
        field_f = null;
    }

    final boolean b(int param0) {
        bma var2_ref = null;
        Object var2 = null;
        int var3 = BachelorFridge.field_y;
        if (null != ((uaa) this).field_g) {
            ((uaa) this).field_g.a(((uaa) this).field_j, ((uaa) this).field_e.field_h, 12);
            if (param0 <= 21) {
                return true;
            }
            var2_ref = (bma) (Object) ((uaa) this).field_h.b((byte) 90);
            while (var2_ref != null) {
                boolean discarded$8 = var2_ref.b(true);
                if (!(var2_ref.field_h >= 0)) {
                    var2_ref.a(false);
                }
                var2_ref = (bma) (Object) ((uaa) this).field_h.c(0);
            }
            return ((uaa) this).field_h.e(12917);
        }
        if (param0 <= 21) {
            return true;
        }
        var2_ref = (bma) (Object) ((uaa) this).field_h.b((byte) 90);
        while (var2_ref != null) {
            boolean discarded$17 = var2_ref.b(true);
            if (!(var2_ref.field_h >= 0)) {
                var2_ref.a(false);
            }
            var2_ref = (bma) (Object) ((uaa) this).field_h.c(0);
        }
        return ((uaa) this).field_h.e(12917);
    }

    final static void a(boolean param0) {
        sna var3 = null;
        sna var4 = null;
        L0: {
          var3 = mka.a(5222712, 9883516, 5222712, (byte) -121, (po) (Object) jha.field_g, 9883516, 16777215, 9883516);
          var4 = var3;
          var4.field_Y = 1;
          var4.field_N = 1;
          var4.field_eb = bga.field_j;
          if (!param0) {
            break L0;
          } else {
            String discarded$1 = uaa.d((byte) -72);
            break L0;
          }
        }
        vu.field_p.field_Y = 1;
        bw.field_a = new sna("checkout", vu.field_p, 444, 324, 167, 38, "");
        lfa.field_l = new sna("back", vu.field_p, 440, 428, 177, 28, "");
        rv.field_l = new sna("up", vu.field_p, 440, 137, 140, 16, "");
        hk.field_c = new sna("down", vu.field_p, 440, 328, 140, 16, "");
        se.field_s = new sna[8];
        mg.field_l = new sna("bakery", vu.field_p, 14, 90, 73, 34, "Bakery");
        qba.field_l = new sna("meat", vu.field_p, 91, 90, 73, 34, "Meat");
        dt.field_b = new sna("fish", vu.field_p, 168, 90, 73, 34, "Fish");
        bea.field_u = new sna("dairy", vu.field_p, 245, 90, 73, 34, "Dairy");
        sea.field_k = new sna("fruitnveg", vu.field_p, 322, 90, 73, 34, "Fruit & Veg");
        mk.field_h = new sna("drinks", vu.field_p, 399, 90, 73, 34, "Drinks");
        mja.field_q = new sna("readymeal", vu.field_p, 476, 90, 73, 34, "Ready Meal");
        rfa.field_b = new sna("misc", vu.field_p, 553, 90, 73, 34, "Misc.");
        se.field_s[3] = bea.field_u;
        se.field_s[0] = mg.field_l;
        se.field_s[4] = sea.field_k;
        se.field_s[6] = mja.field_q;
        se.field_s[7] = rfa.field_b;
        se.field_s[2] = dt.field_b;
        se.field_s[1] = qba.field_l;
        se.field_s[5] = mk.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
    }
}
