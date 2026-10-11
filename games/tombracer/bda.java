/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var8 = this.field_i.a((byte) 66, param1);
        int[] var3 = var8;
        if (this.field_i.field_d) {
          var4 = sj.field_b[param1];
          for (var5 = 0; var5 < ns.field_g; var5++) {
            var8[var5] = this.d(param0 + 1876, ht.field_Fb[var5], var4) % 4096;
          }
        }
        if (param0 != 1) {
          kh var7 = (kh) null;
          bda.a(true, (byte) 12, (la) null, (kh) null);
        }
        return var3;
    }

    final static nv a(boolean param0, byte param1, la param2, kh param3) {
        fra stackIn_51_0 = null;
        hi stackIn_53_0 = null;
        rea stackIn_55_0 = null;
        ana stackIn_57_0 = null;
        ov stackIn_59_0 = null;
        eia stackIn_61_0 = null;
        rl stackIn_63_0 = null;
        ef stackIn_65_0 = null;
        ok stackIn_67_0 = null;
        rb stackIn_69_0 = null;
        mo stackIn_71_0 = null;
        lpa stackIn_73_0 = null;
        sg stackIn_76_0 = null;
        eq stackIn_78_0 = null;
        dja stackIn_80_0 = null;
        vd stackIn_82_0 = null;
        eq stackIn_84_0 = null;
        wn stackIn_86_0 = null;
        sea stackIn_88_0 = null;
        wma stackIn_90_0 = null;
        rh stackIn_92_0 = null;
        ska stackIn_94_0 = null;
        tl stackIn_96_0 = null;
        kj stackIn_98_0 = null;
        oh stackIn_100_0 = null;
        cu stackIn_102_0 = null;
        ue stackIn_104_0 = null;
        th stackIn_106_0 = null;
        bn stackIn_108_0 = null;
        im stackIn_110_0 = null;
        mc stackIn_112_0 = null;
        wh stackIn_114_0 = null;
        ula stackIn_116_0 = null;
        sm stackIn_118_0 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_123_2 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        eq var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param3.b((byte) 44, 6);
          var5 = 81 / ((-38 - param1) / 57);
          var6_int = var4_int;
          if (var6_int == 0) {
            stackIn_51_0 = new fra(param2, param3, param0);
            return (nv) ((Object) stackIn_51_0);
          }
          if (var6_int == 1) {
            stackIn_53_0 = new hi(param2, param3, param0);
            return (nv) ((Object) stackIn_53_0);
          }
          if (var6_int == 2) {
            stackIn_55_0 = new rea(param2, param3, param0);
            return (nv) ((Object) stackIn_55_0);
          }
          if (var6_int == 3) {
            stackIn_57_0 = new ana(param2, param3, param0);
            return (nv) ((Object) stackIn_57_0);
          }
          if (var6_int == 4) {
            stackIn_59_0 = new ov(param2, param3, param0);
            return (nv) ((Object) stackIn_59_0);
          }
          if (var6_int == 18) {
            stackIn_61_0 = new eia(param2, param3, param0);
            return (nv) ((Object) stackIn_61_0);
          }
          if (var6_int == 7) {
            stackIn_63_0 = new rl(param2, param3, param0);
            return (nv) ((Object) stackIn_63_0);
          }
          if (var6_int == 5) {
            stackIn_65_0 = new ef(param2, param3, param0);
            return (nv) ((Object) stackIn_65_0);
          }
          if (var6_int == 6) {
            stackIn_67_0 = new ok(param2, param3, param0);
            return (nv) ((Object) stackIn_67_0);
          }
          if (var6_int == 13) {
            stackIn_69_0 = new rb(param2, param3, param0);
            return (nv) ((Object) stackIn_69_0);
          }
          if (var6_int == 8) {
            stackIn_71_0 = new mo(param2, param3, param0);
            return (nv) ((Object) stackIn_71_0);
          }
          if (var6_int == 9) {
            stackIn_73_0 = new lpa(param2, param3, param0);
            return (nv) ((Object) stackIn_73_0);
          }
          if (var6_int == 10) {
            if (7 <= param2.field_E) {
              stackIn_76_0 = new sg(param2, param3, param0);
              return (nv) ((Object) stackIn_76_0);
            }
            var6 = new eq(param2, param0);
            stackIn_78_0 = var6;
            return (nv) ((Object) stackIn_78_0);
          }
          if (var6_int == 17) {
            stackIn_80_0 = new dja(param2, param3, param0);
            return (nv) ((Object) stackIn_80_0);
          }
          if (11 == var6_int) {
            stackIn_82_0 = new vd(param2, param3, param0);
            return (nv) ((Object) stackIn_82_0);
          }
          if (var6_int == 12) {
            stackIn_84_0 = new eq(param2, param3, param0);
            return (nv) ((Object) stackIn_84_0);
          }
          if (var6_int == 14) {
            stackIn_86_0 = new wn(param2, param3, param0);
            return (nv) ((Object) stackIn_86_0);
          }
          if (var6_int == 15) {
            stackIn_88_0 = new sea(param2, param3, param0);
            return (nv) ((Object) stackIn_88_0);
          }
          if (var6_int == 16) {
            stackIn_90_0 = new wma(param2, param3, param0);
            return (nv) ((Object) stackIn_90_0);
          }
          if (var6_int == 19) {
            stackIn_92_0 = new rh(param2, param3, param0);
            return (nv) ((Object) stackIn_92_0);
          }
          if (var6_int == 20) {
            stackIn_94_0 = new ska(param2, param3, param0);
            return (nv) ((Object) stackIn_94_0);
          }
          if (21 == var6_int) {
            stackIn_96_0 = new tl(param2, param3, param0);
            return (nv) ((Object) stackIn_96_0);
          }
          if (var6_int == 22) {
            stackIn_98_0 = new kj(param2, param3, param0);
            return (nv) ((Object) stackIn_98_0);
          }
          if (23 == var6_int) {
            stackIn_100_0 = new oh(param2, param3, param0);
            return (nv) ((Object) stackIn_100_0);
          }
          if (var6_int == 24) {
            stackIn_102_0 = new cu(param2, param3, param0);
            return (nv) ((Object) stackIn_102_0);
          }
          if (var6_int == 25) {
            stackIn_104_0 = new ue(param2, param3, param0);
            return (nv) ((Object) stackIn_104_0);
          }
          if (var6_int == 26) {
            stackIn_106_0 = new th(param2, param3, param0);
            return (nv) ((Object) stackIn_106_0);
          }
          if (27 == var6_int) {
            stackIn_108_0 = new bn(param2, param3, param0);
            return (nv) ((Object) stackIn_108_0);
          }
          if (var6_int == 28) {
            stackIn_110_0 = new im(param2, param3, param0);
            return (nv) ((Object) stackIn_110_0);
          }
          if (var6_int == 29) {
            stackIn_112_0 = new mc(param2, param3, param0);
            return (nv) ((Object) stackIn_112_0);
          }
          if (var6_int == 30) {
            stackIn_114_0 = new wh(param2, param3, param0);
            return (nv) ((Object) stackIn_114_0);
          }
          if (var6_int == 31) {
            stackIn_116_0 = new ula(param2, param3, param0);
            return (nv) ((Object) stackIn_116_0);
          }
          if (32 != var6_int) {
            throw new IllegalStateException("Unrecognised behaviour type: " + var4_int);
          }
          stackIn_118_0 = new sm(param2, param3, param0);
          return (nv) ((Object) stackIn_118_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_122_0 = var4;
          stackIn_122_1 = new StringBuilder().append("bda.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_123_2 = "null";
          } else {
            stackIn_123_2 = "{...}";
          }
          stackIn_125_1 = ((StringBuilder) (Object) stackIn_122_1).append(stackIn_123_2).append(',');
          if (param3 == null) {
            stackIn_126_2 = "null";
          } else {
            stackIn_126_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_122_0), ((StringBuilder) (Object) stackIn_125_1).append(stackIn_126_2).append(')').toString());
        }
    }

    public bda() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        if (param0 != 1877) {
          field_m = -3;
        }
        int var4 = param1 + param2 * 57;
        var4 = var4 << 1 ^ var4;
        return 4096 - (2147483647 & 1376312589 + (var4 * (var4 * 15731) + 789221) * var4) / 262144;
    }

    static {
        field_m = 50;
    }
}
