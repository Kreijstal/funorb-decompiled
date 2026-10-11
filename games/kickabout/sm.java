/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends gn {
    int[] field_r;
    int field_h;
    int field_g;
    int field_f;
    static int field_q;
    int field_i;
    int field_n;
    int field_k;
    static String field_p;
    static int[][] field_l;
    static boolean field_m;
    static String field_j;
    static int[][] field_o;
    int field_e;

    public static void a(int param0) {
        field_l = (int[][]) null;
        field_p = null;
        field_j = null;
        field_o = (int[][]) null;
        if (param0 != 0) {
          field_l = (int[][]) null;
        }
    }

    final static void a(byte param0) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        ml var2 = null;
        int var3 = 0;
        int var4 = 0;
        dl var5 = null;
        int var5_int = 0;
        int var6 = 0;
        hr var6_ref_hr = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var9 = Kickabout.field_G;
        try {
          var1_int = -114 % ((32 - param0) / 47);
          var2 = un.field_e;
          var3 = var2.h((byte) -123);
          var4 = var2.h((byte) -112);
          if (0 == var3) {
            var5 = (dl) (ru.field_M.g(24009));
            if (var5 == null) {
              lr.b((byte) -116);
              return;
            }
            var6 = -var2.field_n + ms.field_b;
            var12 = var5.field_f;
            var11 = var12;
            var7 = var11;
            if (var12.length << 2 < var6) {
              var6 = var12.length << 2;
            }
            for (var8 = 0; var6 > var8; var8++) {
              var7[var8 >> 2] = var7[var8 >> 2] + (var2.h((byte) -118) << (qj.b(3, var8) << 8));
            }
            var5.c((byte) -109);
            return;
          }
          if (var3 != 1) {
            bd.a("LR1: " + tr.b(0), (Throwable) null, 1);
            lr.b((byte) -116);
            return;
          }
          var5_int = var2.e(85);
          var6_ref_hr = (hr) (ti.field_c.g(24009));
          while (var6_ref_hr != null) {
            if (var6_ref_hr.field_j != var4 ||
              var6_ref_hr.field_i != var5_int) {
              var6_ref_hr = (hr) (ti.field_c.c(33));
              continue;
            }
            break;
          }
          if (var6_ref_hr != null) {
            var6_ref_hr.c((byte) -109);
            return;
          }
          lr.b((byte) -116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "sm.B(" + param0 + ')');
        }
    }

    private sm() throws Throwable {
        throw new Error();
    }

    static {
        field_q = 0;
        field_p = "Drag a player from the grid to fill slot <%0> on the pitch.<br>Click ready when done.";
        field_m = true;
        field_o = new int[][]{new int[]{58, 26, 89}, new int[]{61, 26, 86}};
        field_j = "Loading HUDs";
    }
}
