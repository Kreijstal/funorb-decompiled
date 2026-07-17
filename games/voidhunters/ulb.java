/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ulb implements dja {
    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            if (!er.field_o) {
              return;
            } else {
              L1: {
                na.field_p = new ka[hsb.field_a.length];
                if (param0 == 100) {
                  break L1;
                } else {
                  ulb.a(-114);
                  break L1;
                }
              }
              var1_int = 0;
              L2: while (true) {
                if (var1_int >= na.field_p.length) {
                  dm.field_b = true;
                  nkb.a(false, "Finished building models");
                  break L0;
                } else {
                  L3: {
                    if (hsb.field_a[var1_int] == null) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var1_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "ulb.C(" + param0 + 41);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new jsb[param1];
    }

    public final tv a(byte param0) {
        int var2 = 34 % ((param0 - -64) / 50);
        return (tv) (Object) new jsb();
    }

    static {
    }
}
