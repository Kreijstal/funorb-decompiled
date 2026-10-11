/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static sl field_d;
    static int[][][] field_b;
    static qe[] field_e;
    static String field_c;
    static String field_g;
    static ka[][] field_f;
    static sf field_a;

    final static void b(byte param0) {
        kd var1 = (kd) (rf.field_db.d((byte) -112));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        qg.a(var1.field_j, var1.field_p, var1.field_s);
        qg.f(var1.field_l, var1.field_i, var1.field_n, var1.field_q);
        if (param0 != -9) {
          field_c = (String) null;
        }
        var1.field_j = null;
        mc.field_k.a(var1, param0 - 26);
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = (int[][][]) null;
        field_e = null;
        field_g = null;
        field_f = (ka[][]) null;
        field_c = null;
        if (param0 != 33) {
          ie.a((byte) 0, 'K');
        }
        field_d = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (ea.a(param1, -124)) {
            return true;
          }
          var6 = eb.field_r;
          var2 = var6;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (~var4 == ~param1) {
              return true;
            }
          }
          var2Lifetime1 = ne.field_a;
          var3Lifetime1 = 0;
          if (param0 != 82) {
            ie.a((byte) 53, '￈');
          }
          while (true) {
            if (var3Lifetime1 >= var2Lifetime1.length) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 != var4Lifetime1) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "ie.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new int[][][]{new int[][]{new int[]{-7, 5, 5, 5, -7, -7}, new int[]{0}, new int[]{0}, new int[]{5, 3, 1, 3, 5, -7}, new int[]{0}, new int[]{0}, new int[]{0}}, new int[][]{new int[]{-7, 3, 5, 3, 1, -7}, new int[]{-7, 3, 5, 3, 5}, new int[]{3, -7, -7, -7}, new int[]{0}, new int[]{0}, new int[]{-7, -7, -7, -7, -7, -7, -7}, new int[]{0}}, new int[][]{new int[]{2, 2, 0, 0, 2, 2}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{5, 5, 5, 5, 5, 5}, new int[]{0}, new int[]{-7, -7, -7, 1, 3, -7}}};
        field_g = null;
        field_c = "Loading sound effects";
        field_e = new qe[5];
    }
}
