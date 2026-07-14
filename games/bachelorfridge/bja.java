/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bja extends jm {
    static String field_m;
    static String field_n;
    static byte[] field_o;
    static String field_p;

    public static void a(int param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 != -10744) {
            field_m = null;
        }
    }

    public bja() {
        ((bja) this).field_j = 6;
    }

    final void a(boolean param0, op param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        op stackIn_1_0 = null;
        op stackIn_2_0 = null;
        op stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        op stackOut_0_0 = null;
        op stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        op stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          stackOut_0_0 = (op) param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (op) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (op) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((op) (Object) stackIn_3_0).field_l = stackIn_3_1 != 0;
        var3 = 0;
        L1: while (true) {
          if (param1.field_z <= var3) {
            return;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= param1.field_B) {
                var3++;
                continue L1;
              } else {
                if (param1.field_L.field_o[var3][var4].field_n == 1) {
                  param1.field_a[var3][var4].field_i = true;
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(ub param0, int param1) {
        param0.a(27799, (at) (Object) new mi(param0.field_o, (bja) this));
        if (param1 >= -2) {
            Object var4 = null;
            bja.a((kv) null, 59, 82);
        }
    }

    bja(lu param0) {
        ((bja) this).field_j = 6;
    }

    final static void a(kv param0, int param1, int param2) {
        kv[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var16 = null;
        int var10 = 0;
        int var11 = BachelorFridge.field_y;
        ee var12 = ch.a(wha.field_a, param1 ^ -7, "basic", "fridge_rust");
        kv var4 = wfa.a("fridge_drips", wha.field_a, "basic", (byte) -107);
        kv var5 = wfa.a("fridge_muck", wha.field_a, "basic", (byte) -107);
        ld.a(gla.field_j, var4, var5, var12, param2, param0, (byte) 27);
        if (param1 != 6) {
            return;
        }
        if (300 <= ep.field_m) {
            kaa.field_l = gw.a("basic", "freezer_dirty", wha.field_a, -49);
        } else {
            kaa.field_l = gw.a("basic", "freezer_clean", wha.field_a, param1 ^ -108);
            var6 = gw.a("basic", "freezer_dirty", wha.field_a, param1 + -68);
            var7 = dg.field_i;
            var8 = dg.field_c;
            var16 = dg.field_e;
            for (var10 = 0; kaa.field_l.length > var10; var10++) {
                kaa.field_l[var10].g();
                kaa.field_l[var10].b();
                var6[var10].a(0, 0, ep.field_m * 255 / 300);
                kaa.field_l[var10].d();
            }
            dg.a(var16, var7, var8);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "***Resist!***";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = "You cannot join this game - it is in progress";
    }
}
