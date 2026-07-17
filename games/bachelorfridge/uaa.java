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
              var5 = (var4_ref.field_i >> 4) + param2;
              var6 = -(var4_ref.field_h >> 4) + (param0 - -(var4_ref.field_q >> 5));
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
              var5 = (var4_ref.field_i >> 4) + param2;
              var6 = -(var4_ref.field_h >> 4) + (param0 - -(var4_ref.field_q >> 5));
              mla.field_b[var4_ref.field_v].e(var5, var6);
              var4_ref = (bma) (Object) ((uaa) this).field_h.c(0);
              continue L1;
            }
          }
        }
    }

    uaa(gj param0, sl param1, aga param2) {
        super(param0, param1.field_i, param1.field_l);
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((uaa) this).field_h = new eaa();
            ((uaa) this).field_g = param1;
            ((uaa) this).field_j = param2;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 500) {
                break L0;
              } else {
                this.c(-22786);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("uaa.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final void c(int param0) {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        int var4 = var3 + var2;
        int var5 = var2 + -var3;
        int var6 = kla.a(1024, sma.field_I, -2147483648);
        bma var7 = new bma(var4, var6, var5, kla.a(mla.field_b.length, sma.field_I, -2147483648), 50 + kla.a(50, sma.field_I, -2147483648));
        var7.field_p = -64 + (var7.field_i >> 4);
        var7.field_g = (var7.field_q >> 4) + -32;
        var7.field_k = var7.field_h >> 4;
        var7.field_l = -8;
        ((uaa) this).field_h.a((bw) (Object) var7, true);
    }

    final static String d(byte param0) {
        if (!(cha.field_l != null)) {
            return "";
        }
        if (param0 >= -24) {
            int discarded$0 = 0;
            uaa.a();
            return cha.field_l;
        }
        return cha.field_l;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            field_f = null;
        }
    }

    public static void c() {
        field_i = null;
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

    final static void a() {
        sna var3 = mka.a(5222712, 9883516, 5222712, (byte) -121, (po) (Object) jha.field_g, 9883516, 16777215, 9883516);
        sna var4 = var3;
        var4.field_Y = 1;
        var4.field_N = 1;
        var4.field_eb = bga.field_j;
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
