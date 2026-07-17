/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static dl[] field_b;
    private dl[] field_a;

    public static void a(int param0) {
        field_b = null;
    }

    hj(dl[] param0) {
        try {
            ((hj) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "hj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 2) {
          field_b = null;
          oc.a(((hj) this).field_a, param3, param2, param0, param4, param1 ^ -73);
          return;
        } else {
          oc.a(((hj) this).field_a, param3, param2, param0, param4, param1 ^ -73);
          return;
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = param1;
        if (!param0) {
          if (!param3) {
            if (param2) {
              var4++;
              return f.field_h[var4];
            } else {
              return f.field_h[var4];
            }
          } else {
            var4 += 2;
            if (param2) {
              var4++;
              return f.field_h[var4];
            } else {
              return f.field_h[var4];
            }
          }
        } else {
          var4 += 4;
          if (param3) {
            var4 += 2;
            if (!param2) {
              return f.field_h[var4];
            } else {
              var4++;
              return f.field_h[var4];
            }
          } else {
            if (param2) {
              var4++;
              return f.field_h[var4];
            } else {
              return f.field_h[var4];
            }
          }
        }
    }

    static {
    }
}
