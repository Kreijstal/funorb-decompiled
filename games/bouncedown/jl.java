/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static bc field_f;
    static Bounce field_h;
    static String field_e;
    static int[] field_b;
    static long field_g;
    static int field_a;
    static e field_d;
    static tg field_c;

    public static void a(int param0) {
        if (param0 <= 68) {
          field_a = -28;
          field_d = null;
          field_f = null;
          field_h = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_h = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static ng a(String param0, boolean param1, int param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        var4 = 0L;
        var6 = null;
        if (param2 != 7117) {
          return null;
        } else {
          L0: {
            L1: {
              if (param3.indexOf('@') != -1) {
                break L1;
              } else {
                var7 = (CharSequence) (Object) param3;
                var4 = ma.a((byte) 82, var7);
                if (Bounce.field_N == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L0;
          }
          return ck.a(param0, (String) var6, var4, 112, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new bc();
        field_e = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
