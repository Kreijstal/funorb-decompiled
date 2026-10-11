/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ii {
    String field_bb;
    static int field_cb;
    static int field_eb;
    static int[] field_fb;
    String field_db;
    int field_gb;
    static String[] field_hb;

    final static int c(byte param0) {
        if (param0 < 5) {
          rb.h(-39);
        }
        if (mc.field_a < 2) {
          return 0;
        }
        if (fe.field_h != 0) {
          if (ec.field_a != null) {
            if (!ec.field_a.a(-58)) {
              return 14;
            }
            if (!ec.field_a.b("", (byte) -102)) {
              return 29;
            }
            if (!ec.field_a.a(0, "")) {
              return 29;
            }
          }
          if (!fj.field_B.a(93)) {
            return 43;
          }
          if (!fj.field_B.a(0, "commonui")) {
            return 57;
          }
          if (!hf.field_a.a(-90)) {
            return 71;
          }
          if (!hf.field_a.a(0, "commonui")) {
            return 80;
          }
          if (!ii.field_m.a(-47)) {
            return 82;
          }
          if (!ii.field_m.b(0)) {
            return 86;
          }
        } else {
          if (!fj.field_B.a(-46)) {
            return 20;
          }
          if (!fj.field_B.a(0, "commonui")) {
            return 40;
          }
          if (!hf.field_a.a(-59)) {
            return 50;
          }
          if (!hf.field_a.a(0, "commonui")) {
            return 60;
          }
          if (!ii.field_m.a(107)) {
            return 70;
          }
          if (!ii.field_m.b(0)) {
            return 80;
          }
        }
        return 100;
    }

    final static void a(int param0, byte param1) {
        int var6_int = 0;
        int[] array$1 = null;
        int var15 = 0;
        int[] array$0 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        gk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki var9_ref_ki = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        Object var19 = null;
        ki var19_ref = null;
        int[] var20 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var19 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var22 = wc.field_d.a("level" + param0, "", param1 + 49);
          var18 = var22;
          var17 = var18;
          var2 = var17;
          if (var17 == null) {
            return;
          }
          var3 = new gk(var22);
          stackIn_6_0 = (var3.a((byte) 114) != el.field_a) ? 0 : 1;
          var4 = stackIn_6_0;
          el.a(true, var3.a((byte) 114));
          var5 = var3.j(17277);
          if (var4 != 0) {
            for (var6_int = 0; var5 > var6_int; var6_int++) {
              var19_ref = (ki) (ri.field_b.d(param1 + 4069));
              var19_ref.a((byte) 126, var3);
              ri.field_b.a(-8212, var19_ref);
            }
            var5 = var3.j(17277);
          }
          var23 = new int[var5];
          var20 = var23;
          var6 = var20;
          gb.field_o = 0;
          var24 = new int[var5];
          var21 = var24;
          var7 = var21;
          for (var8 = 0; var5 > var8; var8++) {
            var9_ref_ki = (ki) (ri.field_b.d(4011));
            var9_ref_ki.a((byte) 116, var3);
            if (var9_ref_ki.field_w == 2) {
              h.a(3, true);
            } else {
              if (3 != var9_ref_ki.field_w) {
                if (5 == var9_ref_ki.field_w) {
                  h.a(2, true);
                }
              } else {
                h.a(4, true);
              }
            }
            var9_ref_ki.c((byte) -113);
            var6[var8] = (int)var9_ref_ki.field_B;
            var7[var8] = (int)var9_ref_ki.field_q;
            if (var9_ref_ki.field_w == 0) {
              gb.field_o = gb.field_o + 1;
            }
            ok.field_a.a(-8212, var9_ref_ki);
          }
          if (param1 != -58) {
            field_hb = (String[]) null;
          }
          for (var8Lifetime1 = 1; var5 > var8Lifetime1; var8Lifetime1++) {
            var9 = var8Lifetime1 - 1;
            var10 = var23[var8Lifetime1];
            var11 = var24[var8Lifetime1];
            while (var9 >= 0) {
              if (var10 < var23[var9]) {
                var6[var9 + 1] = var23[var9];
                var7[1 + var9] = var24[var9];
                var9--;
                continue;
              }
              break;
            }
            var6[1 + var9] = var10;
            var7[1 + var9] = var11;
          }
          var8Lifetime2 = 15;
          var9Lifetime1 = var23[0];
          var10Lifetime1 = var23[0];
          pd.field_f = new int[32];
          ib.field_c = 0;
          mc.field_e = new int[32][4];
          var11Lifetime1 = var24[0];
          var12 = 0;
          for (var13 = 1; var13 < var5; var13++) {
            if (var8Lifetime2 < var23[var13] - var9Lifetime1) {
              pd.field_f[var12] = (var9Lifetime1 + var10Lifetime1) / 2;
              var14 = var11Lifetime1 / dj.field_a[0].field_n + 1;
              array$1 = new int[var14];
              mc.field_e[var12] = array$1;
              for (var15 = 0; var14 > var15; var15++) {
                mc.field_e[var12][var15] = pf.a((byte) -128, 16);
              }
              var11Lifetime1 = var24[var13];
              var12++;
              var9Lifetime1 = var23[var13];
            }
            if (var11Lifetime1 < var24[var13]) {
              var11Lifetime1 = var24[var13];
            }
            var10Lifetime1 = var23[var13];
          }
          pd.field_f[var12] = (var10Lifetime1 + var9Lifetime1) / 2;
          var13Lifetime1 = var11Lifetime1 / dj.field_a[0].field_n + 1;
          array$0 = new int[var13Lifetime1];
          mc.field_e[var12] = array$0;
          for (var14Lifetime1 = 0; var14Lifetime1 < var13Lifetime1; var14Lifetime1++) {
            mc.field_e[var12][var14Lifetime1] = pf.a((byte) 92, 16);
          }
          var12++;
          ib.field_c = var12;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "rb.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void i(int param0) {
        field_fb = null;
        field_hb = null;
        if (param0 > -114) {
          field_eb = -20;
        }
    }

    final static void h(int param0) {
        vh.a(ba.field_f, (byte) -125);
        if (param0 != 3591) {
          field_eb = -116;
        }
        ba.field_f.a((byte) -107, rc.field_k);
        ie.field_e.requestFocus();
        ba.field_f = null;
    }

    rb() {
        super(0L, (ii) null);
    }

    static {
        field_hb = new String[]{"Explorer in the Mist", "King of the Jungle", "Nut Cracker", "See No Monkey", "Hear No Monkey", "Speak No Monkey", "Monkeying Around", "Bad Monkey", "Naughty Monkey", "Cheeky Monkey"};
    }
}
