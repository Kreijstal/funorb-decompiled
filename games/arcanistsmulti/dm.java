/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends wn {
    int field_K;
    static String field_I;
    static String field_J;
    static int field_H;
    static int[] field_G;
    static kc field_E;
    static String field_F;

    final static void g() {
        eh.field_e = null;
        int var1 = 115;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        qb var7 = null;
        qb var8 = null;
        if (0 != param2) {
          return;
        } else {
          if (null != ((dm) this).field_B) {
            if (0 == ((dm) this).field_K) {
              return;
            } else {
              if (((dm) this).field_K == 256) {
                ((dm) this).field_B.a((byte) -66, param1 + ((dm) this).field_n, param2, ((dm) this).field_j + param3);
                return;
              } else {
                if (param0 >= -52) {
                  boolean discarded$1 = dm.h((byte) -53);
                  var7 = new qb(((dm) this).field_B.field_v, ((dm) this).field_B.field_k);
                  fk.a(var7, -23095);
                  ((dm) this).field_B.a((byte) -128, 0, param2, 0);
                  oo.c(-15405);
                  var7.c(param1 - -((dm) this).field_n, ((dm) this).field_j + param3, ((dm) this).field_K);
                  return;
                } else {
                  var8 = new qb(((dm) this).field_B.field_v, ((dm) this).field_B.field_k);
                  fk.a(var8, -23095);
                  ((dm) this).field_B.a((byte) -128, 0, param2, 0);
                  oo.c(-15405);
                  var8.c(param1 - -((dm) this).field_n, ((dm) this).field_j + param3, ((dm) this).field_K);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean h(byte param0) {
        rb var1 = null;
        int var2 = 0;
        var1 = (rb) (Object) pb.field_m.b(12623);
        if (var1 != null) {
          if (var1.field_i) {
            if (75 < var1.field_h) {
              return false;
            } else {
              var2 = 31 % ((param0 - 40) / 56);
              return true;
            }
          } else {
            var2 = 31 % ((param0 - 40) / 56);
            return true;
          }
        } else {
          var2 = 31 % ((param0 - 40) / 56);
          return true;
        }
    }

    public static void c() {
        field_E = null;
        field_J = null;
        field_F = null;
        field_G = null;
        field_I = null;
    }

    final static Boolean f() {
        Boolean var1 = kj.field_e;
        kj.field_e = null;
        return var1;
    }

    public dm() {
        super(0, 0, 0, 0, (pf) null, (wc) null);
        ((dm) this).field_K = 256;
    }

    dm(qm param0) {
        super(param0.field_n, param0.field_j, param0.field_v, param0.field_k, (pf) null, (wc) null);
        try {
            param0.a(((dm) this).field_k, 0, ((dm) this).field_v, 0, -81);
            ((dm) this).field_B = param0;
            ((dm) this).field_K = 256;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[]{0, 1, 2};
        field_J = "Hide game chat";
        field_I = "Add name";
        field_F = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
