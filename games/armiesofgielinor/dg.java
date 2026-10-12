/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static String field_b;
    static String field_a;
    static int field_c;
    private kl field_d;

    final static void b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int var1;
        int var2;
        int var1Lifetime1;
        int var2Lifetime1;
        if (kd.field_X < 0) {
          uk.field_q = -1;
          return;
        }
        if (param0 == -61) {
          var1 = 352;
          stackIn_12_0 = bc.field_j[kd.field_X].length;
          stackIn_13_1 = (od.field_c[kd.field_X]) ? 1 : 0;
          var2 = stackIn_12_0 + stackIn_13_1;
          var2 = (var2 / 2 + var2 % 2) * 80;
          if (-80 + (var1 + 8) >= var2) {
            uk.field_q = -1;
          } else {
            uk.field_q = 8 + (var2 - var1 + 80);
          }
          return;
        }
        dg.a(38);
        var1Lifetime1 = 352;
        stackIn_5_0 = bc.field_j[kd.field_X].length;
        stackIn_6_1 = (od.field_c[kd.field_X]) ? 1 : 0;
        var2Lifetime1 = stackIn_5_0 + stackIn_6_1;
        var2Lifetime1 = (var2Lifetime1 / 2 + var2Lifetime1 % 2) * 80;
        if (-80 + (var1Lifetime1 + 8) >= var2Lifetime1) {
          uk.field_q = -1;
        } else {
          uk.field_q = 8 + (var2Lifetime1 - var1Lifetime1 + 80);
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (param0 <= -69) {
          if (null != np.field_Qb) {
            var1 = np.field_Qb.m(-15056);
          }
          if (var1.length() == 0) {
            var1 = rn.b(true);
          }
          if (var1.length() == 0) {
            var1 = ko.field_a;
          }
          return var1;
        }
        field_a = (String) null;
        if (null != np.field_Qb) {
          var1 = np.field_Qb.m(-15056);
        }
        if (var1.length() == 0) {
          var1 = rn.b(true);
        }
        if (var1.length() == 0) {
          var1 = ko.field_a;
        }
        return var1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -12) {
          field_a = (String) null;
        }
    }

    final void a(int param0, int param1) {
        co var4 = null;
        co var5 = null;
        co var3 = null;
        co var3Lifetime1;
        if (param0 != mk.field_e) {
          if (!(param1 > mk.field_e)) {
            var4 = UnitLossCondition.field_d[mk.field_e];
            var3 = var4;
            var4.a(0);
          }
          var5 = UnitLossCondition.field_d[param0];
          var3Lifetime1 = var5;
          var3Lifetime1.b((byte) -118);
          ac.field_k = var3Lifetime1.field_w;
          tn.field_eb = var3Lifetime1.field_u;
          nr.field_c = var3Lifetime1.field_m;
          mk.field_e = param0;
          l.field_b = var3Lifetime1.field_g;
          oq.field_l = var5.field_b;
          dd.field_k = ac.field_k[1].a();
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        of.field_Mb = MapLayout.a("cantmove", -28106, "basic", this.field_d);
        bk.field_d = MapLayout.a("attacktargets", -28106, "basic", this.field_d);
        hq.field_a = MapLayout.a("surround_tiles", -28106, "basic", this.field_d);
        vf.field_j = fk.a("smoke", (byte) -124, this.field_d, "basic");
        jq.field_G = fk.a("kalphites", (byte) -124, this.field_d, "basic");
        for (var2 = param0; jq.field_G.length > var2; var2++) {
          jq.field_G[var2].i();
        }
        es.field_d = MapLayout.a("bones", param0 - 28106, "basic", this.field_d);
        wf.field_B = fk.a("boneshadows", (byte) -124, this.field_d, "basic");
        TeamRoster.field_g = nh.a("player_ring", "basic", this.field_d, false);
        wl.field_N = fk.a("shadows", (byte) -128, this.field_d, "basic")[0];
    }

    dg(kl param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("dg.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_a = "Temple";
        field_c = 0;
    }
}
