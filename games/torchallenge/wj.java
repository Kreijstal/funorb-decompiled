/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static int[][] field_c;
    static sl field_b;
    static int field_e;
    static int field_a;
    static String field_d;

    public static void a(int param0) {
        if (param0 == 23801) {
          field_d = null;
          field_b = null;
          field_c = (int[][]) null;
          return;
        }
        field_b = (sl) null;
        field_d = null;
        field_b = null;
        field_c = (int[][]) null;
    }

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        tc var4_ref_tc = null;
        bk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        pa var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 260) {
            return;
          }
          var10 = id.field_b;
          var2 = var10.j(-123);
          var3 = var10.j(param0 ^ -361);
          if (0 == var2) {
            var4_ref_tc = (tc) (gf.field_q.c((byte) -79));
            if (var4_ref_tc == null) {
              ob.b(-100);
              return;
            }
            var5_int = bb.field_i - var10.field_q;
            var12 = var4_ref_tc.field_n;
            var11 = var12;
            var6 = var11;
            if (var5_int > var12.length << 2) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.j(-103) << jh.a(var7 << 8, 768));
            }
            var4_ref_tc.field_i = true;
            var4_ref_tc.a(true);
            return;
          }
          if (1 != var2) {
            td.a("LR1: " + ck.a(-13299), (Throwable) null, (byte) -80);
            ob.b(param0 ^ -363);
            return;
          }
          var4 = var10.e((byte) -92);
          var5 = (bk) (na.field_d.c((byte) -68));
          while (var5 != null) {
            if (~var3 != ~var5.field_v ||
              var4 != var5.field_o) {
              var5 = (bk) (na.field_d.c(-270));
              continue;
            }
            break;
          }
          if (var5 == null) {
            ob.b(param0 ^ -357);
            return;
          }
          var5.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "wj.B(" + param0 + ')');
        }
    }

    static {
        field_c = new int[][]{null, null, null, null, null, null, null, null, null, new int[]{1, 59, 579, 424, 464, 40, 0, 260, 40, 5, 5, 11, 9, 8, 7, 20, 4, 3, -1, 0, 8}, null, null, null, null, null, null};
        field_b = new sl();
        field_e = 0;
        field_d = "Help text missing from post: ";
    }
}
