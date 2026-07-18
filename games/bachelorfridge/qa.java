/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends k {
    static kv field_k;

    final static void d(int param0) {
        if (bka.field_h) {
          return;
        } else {
          ln.e(-116);
          hp.field_c = -3;
          if (!af.field_a) {
            rs.a(true);
            sia.field_h = false;
            lg.a(true, -4, true);
            return;
          } else {
            uq.h(-28716);
            return;
          }
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = BachelorFridge.field_y;
        if (param1 == 0) {
          var7 = ((qa) this).field_j.a(param0, -1);
          var3 = var7;
          if (!((qa) this).field_j.field_m) {
            return var3;
          } else {
            var4 = tj.field_f[param0];
            var5 = 0;
            L0: while (true) {
              if (hh.field_d <= var5) {
                return var3;
              } else {
                var7[var5] = this.a(false, jq.field_k[var5], var4) % 4096;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        field_k = null;
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4 = param1 + 57 * param2;
        var4 = var4 ^ var4 << 1;
        return -((var4 * (789221 + var4 * (var4 * 15731)) - -1376312589 & 2147483647) / 262144) + 4096;
    }

    public qa() {
        super(0, true);
    }

    static {
    }
}
