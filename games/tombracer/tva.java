/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tva extends qe {
    static String field_c;
    static sq field_d;

    tva(cka param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        if (param2 < 117) {
            field_c = null;
        }
    }

    final void a(boolean param0) {
        ((tva) this).field_a.d(-109, param0);
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 > -103) {
            dk discarded$0 = tva.a(114, -12, 14, -11);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static dk a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == -2) {
          var4 = param3;
          if (var4 != 0) {
            if (var4 != 1) {
              if (3 == var4) {
                return jf.field_p[param1];
              } else {
                throw new IllegalArgumentException("Animation category not recognised");
              }
            } else {
              return qja.field_f[param1];
            }
          } else {
            return wl.field_f[param2][param1];
          }
        } else {
          return null;
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 <= 77) {
            Object var4 = null;
            ((tva) this).a(-105, 43, (kl) null);
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            ((tva) this).b(false, 31);
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, kl param2) {
        try {
            if (param1 != 32221) {
                tva.c(66);
            }
            ((tva) this).field_a.a(true, param2);
            ((tva) this).field_a.d(1, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tva.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 73 / ((param1 - 56) / 48);
        ((tva) this).field_a.d(-55, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Hide private chat and appear offline to friends";
    }
}
