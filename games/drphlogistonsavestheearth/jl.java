/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends gi {
    static String field_i;
    int field_j;
    static sb field_k;
    static he field_h;

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (!param3) {
          field_i = (String) null;
        }
        if (param2) {
          var4 += 2;
        }
        if (param1) {
          var4++;
        }
        return kk.field_d[var4];
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (65535 < param1) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            param1 = param1 >> 8;
            var2 += 8;
          }
          if (param1 > 15) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (3 < param1) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (-65536 > param1) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (-256 > param1) {
          param1 = param1 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 < 3) {
          return -108;
        }
        if (-16 > param1) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < -4) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          param1 = param1 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    public static void d(int param0) {
        if (param0 == 65535) {
          field_k = null;
          field_i = null;
          field_h = null;
          return;
        }
        jl.a(false, true, false, false);
        field_k = null;
        field_i = null;
        field_h = null;
    }

    private jl() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "(Including <%0>)";
    }
}
