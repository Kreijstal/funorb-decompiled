/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ua {
    static dn field_b;
    static java.math.BigInteger field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -6) {
          ua.a(false);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(boolean param0) {
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          var1_int = param0 ? 1 : 0;
          var2 = 0;
          while (np.a((byte) -13)) {
            kb.field_g.a(0);
            if (kb.field_g.f((byte) -60)) {
              var1_int = 1;
            }
            if (e.field_f != 13) {
              continue;
            }
            var2 = 1;
          }
          kb.field_g.a(true, qd.a(16452, n.field_t, k.field_e), qd.a(16452, wh.field_s, re.field_c));
          if (kb.field_g.f((byte) -60)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            0 <= kb.field_g.field_g) {
            var3 = di.field_e[kb.field_g.field_g];
            if (var3 == 2) {
              qo.g((byte) -68);
            } else if (var3 == 5) {
              qo.g((byte) -68);
            }
          } else {
            if (var2 != 0 &&
              go.field_x != 2) {
              qo.g((byte) -68);
            }
          }
          if (0 == var3 &&
            go.field_x == 2) {
            var4 = km.b(-1) - dc.field_c;
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              ka.a(5, true, (byte) -115);
              var3 = 2;
            }
          }
          stackIn_25_0 = var3;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "ua.B(" + param0 + ')');
        }
    }

    static {
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
