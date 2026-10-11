/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static int field_c;
    static int[] field_b;
    static String field_a;

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (param1) {
          if (i.field_t[param2] < i.field_t[param3]) {
            return true;
          }
          if (i.field_t[param2] > i.field_t[param3]) {
            return false;
          }
          if (ci.field_n[param2] < ci.field_n[param3]) {
            return true;
          }
          if (ci.field_n[param3] < ci.field_n[param2]) {
            return false;
          }
          if (param0 == 2) {
            var4 = tc.field_w[param2] + mf.field_d[param2] + wa.field_m[param2];
            var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
            if (var5 > var4) {
              return true;
            }
            if (var4 > var5) {
              return false;
            }
            return !(param2 >= param3);
          }
          r.a((byte) -57, 96);
          var4Lifetime3 = tc.field_w[param2] + mf.field_d[param2] + wa.field_m[param2];
          var5Lifetime3 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
          if (var5Lifetime3 > var4Lifetime3) {
            return true;
          }
          if (var4Lifetime3 > var5Lifetime3) {
            return false;
          }
          return !(param2 >= param3);
        }
        if (ci.field_n[param2] < ci.field_n[param3]) {
          return true;
        }
        if (ci.field_n[param2] > ci.field_n[param3]) {
          return false;
        }
        if (i.field_t[param2] < i.field_t[param3]) {
          return true;
        }
        if (i.field_t[param2] > i.field_t[param3]) {
          return false;
        }
        if (param0 == 2) {
          var4Lifetime1 = tc.field_w[param2] + mf.field_d[param2] + wa.field_m[param2];
          var5Lifetime1 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param2 >= param3);
        }
        r.a((byte) -57, 96);
        var4Lifetime2 = tc.field_w[param2] + mf.field_d[param2] + wa.field_m[param2];
        var5Lifetime2 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
        if (var5Lifetime2 > var4Lifetime2) {
          return true;
        }
        if (var4Lifetime2 > var5Lifetime2) {
          return false;
        }
        if (param2 >= param3) {
          return false;
        }
        return true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1) {
        lm.field_k = (param1 & 54) >> 4;
        mp.field_d = (12 & param1) >> 2;
        if (param0 >= -58) {
          field_a = (String) null;
        }
        if (2 < lm.field_k) {
          lm.field_k = 2;
        }
        uk.field_c = param1 & 3;
        if (2 < mp.field_d) {
          mp.field_d = 2;
        }
        if (2 < uk.field_c) {
          uk.field_c = 2;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -79) {
          field_c = -80;
        }
    }

    static {
        field_c = 4;
        field_a = "EXIT";
    }
}
