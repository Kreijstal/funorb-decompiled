/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private ue field_b;
    private gd field_f;
    static String field_a;
    static String field_c;
    static String field_d;
    static int field_e;
    private ue field_h;
    static String field_g;

    public static void a() {
        field_a = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    private ta() throws Throwable {
        throw new Error();
    }

    final ff a(int param0, int param1) {
        ff var3 = null;
        byte[] var4 = null;
        var3 = (ff) ((ta) this).field_f.a((long)param0, 106);
        if (var3 == null) {
          L0: {
            if (param1 >= ~param0) {
              var4 = ((ta) this).field_h.a(1, true, 32767 & param0);
              break L0;
            } else {
              var4 = ((ta) this).field_b.a(1, true, param0);
              break L0;
            }
          }
          var3 = new ff();
          if (var4 != null) {
            L1: {
              var3.a(new rb(var4), 125);
              if (param0 >= 32768) {
                var3.d(-73);
                break L1;
              } else {
                break L1;
              }
            }
            ((ta) this).field_f.a((Object) (Object) var3, 1, (long)param0);
            return var3;
          } else {
            L2: {
              if (param0 >= 32768) {
                var3.d(-73);
                break L2;
              } else {
                break L2;
              }
            }
            ((ta) this).field_f.a((Object) (Object) var3, 1, (long)param0);
            return var3;
          }
        } else {
          return var3;
        }
    }

    final static void a(hl param0, int param1) {
        try {
            ja.field_e = param0;
            int var2_int = -12 / ((-36 - param1) / 50);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ta.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player";
        field_d = "Cancel";
        field_a = "EASY";
        field_g = "Music: ";
    }
}
