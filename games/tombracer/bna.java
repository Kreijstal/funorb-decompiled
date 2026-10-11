/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends vg {
    boolean field_g;
    int[] field_f;

    final static void a(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2, uia param3, uia param4) {
        try {
          uu.a(param4.field_h, (byte) -81, param4.field_g, param2, param3, param0, 0);
          if (param1) {
            bna.a((byte) 109);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bna.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        pha var1 = null;
        ht var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        pha var1Lifetime1;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          var1 = (pha) (uma.field_b.f(-80));
          while (var1 != null) {
            if (var1.field_xb > 0) {
              var1.field_xb = var1.field_xb - 1;
              if (var1.field_xb == 0) {
                var1.field_Lb = 0;
                if (var1.f(param0 ^ 168)) {
                  var1.p(19);
                }
              }
            }
            var1 = (pha) (uma.field_b.e(122));
          }
          if (param0 != 10) {
            return;
          }
          var1_ref = (ht) (asa.field_j.f(-80));
          while (var1_ref != null) {
            if (var1_ref.field_zb > 0) {
              var1_ref.field_zb = var1_ref.field_zb - 1;
              if (var1_ref.field_zb == 0) {
                var1_ref.field_Ib = 0;
                if (var1_ref.g(0)) {
                  var1_ref.p(59);
                }
              }
            }
            var1_ref = (ht) (asa.field_j.e(120));
          }
          var1Lifetime1 = (pha) (qha.field_g.f(param0 ^ -70));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_xb > 0) {
              var1Lifetime1.field_xb = var1Lifetime1.field_xb - 1;
              if (var1Lifetime1.field_xb != 0) {
                var1Lifetime1 = (pha) (qha.field_g.e(param0 + 101));
                continue;
              }
              var1Lifetime1.field_Lb = 0;
              if (var1Lifetime1.f(162)) {
                var1Lifetime1.p(72);
              }
            }
            var1Lifetime1 = (pha) (qha.field_g.e(param0 + 101));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref2), "bna.A(" + param0 + ')');
        }
    }

    bna() {
        this.field_g = false;
    }

    static {
    }
}
