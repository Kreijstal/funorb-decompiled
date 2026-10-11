/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends n {
    static int[] field_pb;
    static int field_sb;
    static ka field_qb;
    static int field_tb;
    static boolean field_rb;
    static String[][] field_ob;

    final void c(int param0, ee param1) {
        try {
          super.c(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "jf.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jf(si param0, ee param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void n(int param0) {
        field_pb = null;
        int var1 = -110 / ((param0 + 30) / 55);
        field_ob = (String[][]) null;
        field_qb = null;
    }

    final static void m(int param0) {
        int var10 = 0;
        double var1_double = 0.0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 <= 88) {
            return;
          }
          var7 = 1024.0;
          pa.field_z = new int[512];
          var9 = -1;
          for (var10 = 0; 512 > var10; var10++) {
            if (var9 < 0) {
              var3 = (double)var10;
              var1_double = var3 / var7;
              var5 = Math.tan(var1_double * 3.141592653589793);
              if (0.0 > var5) {
                var5 = -var5;
              }
              if (2048.0 <= var5 * 64.0 + var3 &&
                var9 < 0) {
                var9 = var10;
              }
            } else {
              var5 = 0.0;
            }
            var5 = 65536.0 * var5;
            pa.field_z[var10] = (int)var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "jf.R(" + param0 + ')');
        }
    }

    static {
        field_tb = -1;
        field_pb = new int[]{34, 34, 36};
        field_rb = false;
        field_ob = new String[][]{new String[]{"Move left and right"}, new String[]{"Jump"}, new String[]{"Hold to attack"}, new String[]{"Hold while not attacking to duck", "Hold while not attacking to block"}};
        field_qb = new ka(0, 0);
    }
}
