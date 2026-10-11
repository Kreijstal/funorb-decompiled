/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends k {
    static kv field_k;

    final static void d(int param0) {
        if (bka.field_h) {
          return;
        }
        ln.e(-116);
        hp.field_c = -3;
        if (!af.field_a) {
          rs.a(true);
          sia.field_h = false;
          lg.a(true, -4, true);
          if (param0 >= 115) {
            uca.a(18, (byte) 117);
            return;
          }
          return;
        }
        uq.h(-28716);
        if (param0 >= 115) {
          uca.a(18, (byte) 117);
          return;
        }
    }

    final int[] a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (param1 != 0) {
          return (int[]) null;
        }
        int[] var7 = this.field_j.a(param0, -1);
        int[] var3 = var7;
        if (this.field_j.field_m) {
          var4 = tj.field_f[param0];
          for (var5 = 0; hh.field_d > var5; var5++) {
            var7[var5] = this.a(false, jq.field_k[var5], var4) % 4096;
          }
          return var3;
        }
        return var3;
    }

    public static void b(boolean param0) {
        if (param0) {
          qa.d(42);
          field_k = null;
          return;
        }
        field_k = null;
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4 = param1 + 57 * param2;
        if (!param0) {
          var4 = var4 ^ var4 << 1;
          return -((var4 * (789221 + var4 * (var4 * 15731)) + 1376312589 & 2147483647) / 262144) + 4096;
        }
        return -81;
    }

    public qa() {
        super(0, true);
    }

    static {
    }
}
