/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static rd field_d;
    static String field_b;
    static String field_e;
    static String field_c;
    static String field_a;

    final static boolean a(byte param0, String param1) {
        int var2 = 5 / ((param0 - 42) / 39);
        return ck.a(true, param1) != null ? true : false;
    }

    final static void a(pf param0, int param1) {
        ad var2 = null;
        ad.a(param0.a("headers.packvorbis", "", (byte) -12));
        var2 = ad.a(param0, "jagex logo2.packvorbis", "");
        if (param1 != 23987) {
          return;
        } else {
          ud discarded$2 = var2.b();
          return;
        }
    }

    final static void a(pb param0, int param1) {
        kg.d(false);
        if (param1 != 1) {
            return;
        }
        ti.a(param0.field_z, param0.field_w, param0.field_x);
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        lh.field_d = lh.field_d + param1;
        lg.field_f = lg.field_f + ed.field_b * param1;
        var3 = param2 << param1;
        if ((var3 & sd.field_d) != 0) {
          return;
        } else {
          sd.field_d = sd.field_d | var3;
          tl.field_a = tl.field_a | var3;
          hf.field_i.b(-46, (gg) (Object) new jf(param1));
          if (!e.field_c) {
            if (!ah.a(-1)) {
              kl discarded$2 = vj.a(lh.field_d, ed.field_b, (byte) 15, hk.field_p, lg.field_f, param1, param0, 4);
              return;
            } else {
              ue.field_c.b(-47, (gg) (Object) new kl(param1, param0, hk.field_p, lg.field_f, lh.field_d, ed.field_b));
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        int var1 = 61 % ((66 - param0) / 55);
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new rd();
        field_c = "Collect the powerups shown below to improve your weapons and defences.";
        field_b = "From only <%0>/month";
        field_a = "Connection timed out. Please try using a different server.";
        field_e = "Create a free account to start using this feature";
    }
}
