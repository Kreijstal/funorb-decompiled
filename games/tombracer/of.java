/*
 * Decompiled by CFR-JS 0.4.0.
 */
class of {
    static String field_a;

    final static cn a(boolean param0, int param1) {
        if (param0) {
          return (cn) null;
        }
        if (ck.field_a != null) {
          return ck.field_a;
        }
        if (param1 != -1) {
          return nt.a(param1, 1, 5200, false, true, true);
        }
        return ck.field_a;
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 27 % ((34 - param0) / 50);
    }

    final static String a(int param0) {
        if (kda.field_pd) {
          if (param0 != 1) {
            of.a(97);
            return null;
          }
          return null;
        }
        if (bda.field_m > fr.field_c) {
          if (param0 != 1) {
            of.a(97);
            return null;
          }
          return null;
        }
        if (fr.field_c < bda.field_m + gaa.field_p) {
          return hn.field_F;
        }
        if (param0 != 1) {
          of.a(97);
          return null;
        }
        return null;
    }

    static {
        field_a = "Ignore";
    }
}
