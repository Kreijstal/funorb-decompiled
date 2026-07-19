/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static String field_b;

    final static String a(byte param0) {
        int var1 = 0;
        if (cb.field_v == wi.field_f) {
          return oa.field_o;
        } else {
          if (!uc.field_c.a(-117)) {
            return uc.field_c.c(-16955);
          } else {
            var1 = 76 % ((param0 - -86) / 33);
            if (wi.field_f == ui.field_kb) {
              return uc.field_c.c(-16955);
            } else {
              return aa.field_s;
            }
          }
        }
    }

    final static boolean b(int param0) {
        String discarded$0 = null;
        if (param0 != 10618) {
            discarded$0 = ti.a((byte) -1);
            return ma.a(-120, rl.a((byte) -77));
        }
        return ma.a(-120, rl.a((byte) -77));
    }

    public static void a(int param0) {
        if (param0 != -23740) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_a = "<shad=808080>";
        field_b = "<%0>Barriers:<%1> Acts like a normal wall, but can be removed by triggering a blue switch.";
    }
}
