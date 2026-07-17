/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_b;
    static k[] field_c;
    static int field_a;

    public static void a(byte param0) {
        if (param0 <= 82) {
            mc.a((byte) 110);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(dd param0, String param1, int param2) {
        try {
            pa.field_k = param1;
            cd.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "mc.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        var1 = -121 % ((-69 - param0) / 40);
        if (ib.field_k >= 20) {
          if (nl.a(99)) {
            if (0 < nb.field_h) {
              if (lk.a(95)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, byte param1) {
        return ~(-param0 & param0) == ~param0;
    }

    static {
    }
}
