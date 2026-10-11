/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int[] field_c;
    int field_b;
    int field_a;

    final static boolean a(int param0, int param1, boolean param2) {
        String var4 = null;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime3;
        if (!param2) {
          bi.a(-33);
        }
        int var3 = null != la.field_h ? 1 : 0;
        if (um.field_Gb == 9) {
          if (!oa.a(28977, ca.field_O, an.field_a, i.field_F, sh.field_ub)) {
            if (10 == um.field_Gb) {
              if (var3 != 0) {
                return false;
              }
              tf.a((byte) 86);
              return true;
            }
            if (um.field_Gb != 11) {
              return false;
            }
            if (!li.field_m) {
              return false;
            }
            if (ve.field_o == 2 &&
              !hm.a(hn.field_n, nd.field_c, -24236)) {
              return false;
            }
            if (2 != ve.field_o) {
              if (var3 != 0) {
                return false;
              }
              if (he.h(-120)) {
                var4 = (String) null;
                jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
              }
              return true;
            }
            if (he.h(-120)) {
              var4Lifetime3 = (String) null;
              jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
              return true;
            }
            return true;
          }
          if (i.field_F != 2 &&
            var3 != 0) {
            return false;
          }
          return ul.a(an.field_a, i.field_F, -22557, ca.field_O, sh.field_ub);
        }
        if (10 == um.field_Gb) {
          if (var3 != 0) {
            return false;
          }
          tf.a((byte) 86);
          return true;
        }
        if (um.field_Gb != 11) {
          return false;
        }
        if (!li.field_m) {
          return false;
        }
        if (ve.field_o == 2 &&
          !hm.a(hn.field_n, nd.field_c, -24236)) {
          return false;
        }
        if (2 != ve.field_o) {
          if (var3 == 0) {
            if (he.h(-120)) {
              var4Lifetime1 = (String) null;
              jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
              return true;
            }
            return true;
          }
          return false;
        }
        if (he.h(-120)) {
          var4Lifetime2 = (String) null;
          jl.a(ld.field_d, ve.field_o, hn.field_n, param0, (byte) 39, (String) null);
          return true;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 46) {
          field_c = (int[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    bi(int param0, int param1, int param2, int param3, int param4) {
        this.field_a = param0;
        this.field_b = param1;
    }

    static {
    }
}
