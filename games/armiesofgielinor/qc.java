/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc {
    static ro field_a;
    static String field_b;
    static dl field_d;
    static qc field_h;
    static String field_i;
    static int field_j;
    static je field_e;
    static je field_c;
    static String field_f;
    static at field_g;

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_f = null;
    }

    final static wk a(int param0, int param1) {
        co var2 = null;
        if (vc.field_m != null) {
          if (param0 >= 0) {
            if (mc.field_d.length <= param0) {
              return null;
            } else {
              var2 = mc.field_d[param0];
              return var2.c((byte) -116);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract int a(long param0, int param1);

    final int a(int param0, long param1) {
        long var4 = 0L;
        if (param0 >= -124) {
          return -53;
        } else {
          L0: {
            var4 = ((qc) this).b((byte) -103);
            if (var4 > 0L) {
              nu.a(var4, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return ((qc) this).a(param1, 0);
        }
    }

    abstract long b(byte param0);

    abstract void a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Solicitation";
        field_i = "Items";
        field_f = "This unit's passive effect expands 3 tiles in all directions.";
    }
}
