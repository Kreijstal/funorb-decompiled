/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    final static mb a(boolean param0) {
        String var1 = null;
        if (!param0) {
          return (mb) null;
        } else {
          L0: {
            var1 = rg.a(0);
            if (var1 == null) {
              break L0;
            } else {
              if ((var1.indexOf('@') ^ -1) > -1) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new mb(rg.a(0), hj.a(true));
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (param0 != 20753) {
                java.awt.Canvas var3 = (java.awt.Canvas) null;
                ih.a(-65, (java.awt.Canvas) null);
            }
            if (!(fj.field_i != 11)) {
                wg.a((byte) -128);
            }
            uj.a(jl.field_e, pe.field_m, ib.field_o, (byte) -77);
            uf.a((byte) 99, 0, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ih.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
