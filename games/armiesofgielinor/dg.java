/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static String field_b;
    static String field_a;
    static int field_c;
    private kl field_d;

    final static void b() {
        int var1 = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        if (kd.field_X >= 0) {
          L0: {
            var1 = 352;
            stackOut_2_0 = bc.field_j[kd.field_X].length;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (od.field_c[kd.field_X]) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          var2 = stackIn_5_0 - -stackIn_5_1;
          var2 = (var2 / 2 - -(var2 % 2)) * 80;
          if (-80 + (var1 - -8) >= var2) {
            uk.field_q = -1;
            return;
          } else {
            uk.field_q = 8 + (var2 + -var1 - -80);
            return;
          }
        } else {
          uk.field_q = -1;
          return;
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (null != np.field_Qb) {
            var1 = np.field_Qb.m(-15056);
        }
        if (!(var1.length() != 0)) {
            int discarded$0 = 1;
            var1 = rn.b();
        }
        if (!(var1.length() != 0)) {
            var1 = ko.field_a;
        }
        return var1;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final void a(int param0, int param1) {
        co var3 = null;
        co var4 = null;
        co var5 = null;
        if (param0 == mk.field_e) {
          return;
        } else {
          L0: {
            if (param1 <= mk.field_e) {
              var4 = mc.field_d[mk.field_e];
              var3 = var4;
              var4.a(0);
              break L0;
            } else {
              break L0;
            }
          }
          var5 = mc.field_d[param0];
          var3 = var5;
          var3.b((byte) -118);
          ac.field_k = var3.field_w;
          tn.field_eb = var3.field_u;
          nr.field_c = var3.field_m;
          mk.field_e = param0;
          l.field_b = var3.field_g;
          oq.field_l = var5.field_b;
          dd.field_k = ac.field_k[1].a();
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        of.field_Mb = lo.a("cantmove", -28106, "basic", ((dg) this).field_d);
        bk.field_d = lo.a("attacktargets", -28106, "basic", ((dg) this).field_d);
        hq.field_a = lo.a("surround_tiles", -28106, "basic", ((dg) this).field_d);
        vf.field_j = fk.a("smoke", (byte) -124, ((dg) this).field_d, "basic");
        jq.field_G = fk.a("kalphites", (byte) -124, ((dg) this).field_d, "basic");
        for (var2 = param0; jq.field_G.length > var2; var2++) {
            jq.field_G[var2].i();
        }
        es.field_d = lo.a("bones", param0 + -28106, "basic", ((dg) this).field_d);
        wf.field_B = fk.a("boneshadows", (byte) -124, ((dg) this).field_d, "basic");
        int discarded$0 = 0;
        go.field_g = nh.a("player_ring", "basic", ((dg) this).field_d);
        wl.field_N = fk.a("shadows", (byte) -128, ((dg) this).field_d, "basic")[0];
    }

    dg(kl param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((dg) this).field_d = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("dg.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Temple";
        field_c = 0;
    }
}
