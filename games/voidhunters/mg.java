/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends rqa {
    static phb[][] field_o;

    public static void e(int param0) {
        int var1 = -101 % ((-37 - param0) / 42);
        field_o = (phb[][]) null;
    }

    final static int f(int param0) {
        if (param0 != 255) {
          mg.f(-9);
          return 255 * pob.field_b / 32;
        }
        return 255 * pob.field_b / 32;
    }

    mg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        jk var1 = null;
        mm var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        jk var1Lifetime1;
        var2 = VoidHunters.field_G;
        try {
          var1 = (jk) (cta.field_q.d(0));
          while (var1 != null) {
            if (var1.field_yb > 0) {
              var1.field_yb = var1.field_yb - 1;
              if (var1.field_yb == 0) {
                var1.field_Db = 0;
                if (var1.i(param0 ^ -124)) {
                  var1.b(param0 ^ -3846);
                }
              }
            }
            var1 = (jk) (cta.field_q.a((byte) 62));
          }
          var1_ref = (mm) (kja.field_E.d(0));
          while (var1_ref != null) {
            if (var1_ref.field_Db > 0) {
              var1_ref.field_Db = var1_ref.field_Db - 1;
              if (var1_ref.field_Db == 0) {
                var1_ref.field_ec = 0;
                if (var1_ref.e((byte) 74)) {
                  var1_ref.b(-3846);
                }
              }
            }
            var1_ref = (mm) (kja.field_E.a((byte) 118));
          }
          var1Lifetime1 = (jk) (mea.field_e.d(param0));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_yb > 0) {
              var1Lifetime1.field_yb = var1Lifetime1.field_yb - 1;
              if (0 != var1Lifetime1.field_yb) {
                var1Lifetime1 = (jk) (mea.field_e.a((byte) 11));
                continue;
              }
              var1Lifetime1.field_Db = 0;
              if (var1Lifetime1.i(param0 - 128)) {
                var1Lifetime1.b(-3846);
              }
            }
            var1Lifetime1 = (jk) (mea.field_e.a((byte) 11));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref2), "mg.B(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(216, 62, param0[0].a(71));
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mg.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
