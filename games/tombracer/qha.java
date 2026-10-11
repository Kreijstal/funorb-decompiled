/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qha extends ou {
    static int field_f;
    static vna field_g;

    qha(int param0) {
        super(-1 + aq.a(-5640) + aq.a(-5640), param0);
    }

    public static void c(byte param0) {
        if (param0 >= -84) {
          field_g = (vna) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final wea a(byte param0) {
        int stackIn_15_0 = 0;
        int stackIn_31_0 = 0;
        wea var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        g var13;
        g var14;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        var2 = new wea(this.field_a);
        var3 = aq.a(-5640);
        var4 = ml.a(57);
        var5 = 0;
        var6 = 0;
        var7 = 1;
        if (param0 == 58) {
          for (var8 = 0; this.field_a > var8; var8++) {
            if (var7 == 0) {
              var9 = hn.b(param0 - 58, var6).field_f;
            } else {
              var10 = ak.a(var5, (byte) 127);
              var14 = ta.d(var10, false);
              var9 = var14.field_f;
            }
            var2.a(var8, var9, this.b((byte) -56), (byte) -63);
            if (var7 != 0) {
              var5++;
              if (var5 >= var3) {
                var5 = 0;
              }
            } else {
              var6++;
              if (var6 >= var4) {
                var6 = 0;
              }
            }
            stackIn_15_0 = (var7 != 0) ? 0 : 1;
            var7 = stackIn_15_0;
          }
          return var2;
        }
        field_f = -112;
        for (var8Lifetime1 = 0; this.field_a > var8Lifetime1; var8Lifetime1++) {
          if (var7 == 0) {
            var9Lifetime1 = hn.b(param0 - 58, var6).field_f;
          } else {
            var10Lifetime1 = ak.a(var5, (byte) 127);
            var13 = ta.d(var10Lifetime1, false);
            var9Lifetime1 = var13.field_f;
          }
          var2.a(var8Lifetime1, var9Lifetime1, this.b((byte) -56), (byte) -63);
          if (var7 != 0) {
            var5++;
            if (var5 >= var3) {
              var5 = 0;
            }
          } else {
            var6++;
            if (var6 >= var4) {
              var6 = 0;
            }
          }
          stackIn_31_0 = (var7 != 0) ? 0 : 1;
          var7 = stackIn_31_0;
        }
        return var2;
    }

    final static void a(int param0, boolean param1) {
        if (wqa.r((byte) -73)) {
          param1 = false;
        }
        upa.a(param1, param0);
        if (!bs.field_g) {
          ea.a(param1, -16838);
          return;
        }
        bea.d(rm.field_e.field_a.field_qb, rm.field_e.field_a.field_T, rm.field_e.field_a.field_G, rm.field_e.field_a.field_t);
        rm.field_e.field_a.b(121, param1);
        ea.a(param1, -16838);
    }

    static {
        field_f = 10;
    }
}
