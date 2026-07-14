/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lkb {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != 199) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 >= -100) {
          lkb.a(92);
          var2 = (-640 + gp.field_p) / 2;
          var3 = ldb.field_o * ldb.field_o;
          var4 = var3 + -(param0 * param0);
          rga.field_g.a(var2 + -(199 * var4 / var3), 122, 199, 90, -94 + (-120 + dma.field_j));
          vva.field_r.a(var2 + 202 + 438 * var4 / var3, 26, 438, 0, -124 + dma.field_j);
          return;
        } else {
          var2 = (-640 + gp.field_p) / 2;
          var3 = ldb.field_o * ldb.field_o;
          var4 = var3 + -(param0 * param0);
          rga.field_g.a(var2 + -(199 * var4 / var3), 122, 199, 90, -94 + (-120 + dma.field_j));
          vva.field_r.a(var2 + 202 + 438 * var4 / var3, 26, 438, 0, -124 + dma.field_j);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static lkb a(String param0, byte param1) {
        int var2 = 0;
        String var4 = null;
        lkb var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var4 = param0;
        if (param1 <= -68) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if (-1 == var2) {
                return br.field_f;
              } else {
                var8 = param0.substring(0, var2);
                var9 = param0.substring(var2 + 1);
                var5 = hca.a((byte) 108, var8);
                if (var5 != null) {
                  return var5;
                } else {
                  return ofb.a(0, var9);
                }
              }
            } else {
              return gca.field_r;
            }
          } else {
            return gca.field_r;
          }
        } else {
          field_a = null;
          if (param0 != null) {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if (-1 == var2) {
                return br.field_f;
              } else {
                var6 = param0.substring(0, var2);
                var7 = param0.substring(var2 + 1);
                var4 = var7;
                var5 = hca.a((byte) 108, var6);
                if (var5 != null) {
                  return var5;
                } else {
                  return ofb.a(0, var7);
                }
              }
            } else {
              return gca.field_r;
            }
          } else {
            return gca.field_r;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[1];
    }
}
