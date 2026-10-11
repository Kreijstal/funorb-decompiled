/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends jc {
    static String field_A;
    static String field_H;
    static int[] field_J;
    static long field_I;
    static int[] field_K;

    private hj(int param0, int param1, int param2, int param3, cj param4, sc param5, gl param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_F = param6;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        param1 = (-715827883 & param1 >>> 1) + (1431655765 & param1);
        param1 = (858993459 & param1) + (1932735283 & param1 >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        if (param0) {
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        hj.g(-63);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    final static void g(int param0) {
        if (param0 != -7958) {
          field_A = (String) null;
        }
    }

    public static void g(byte param0) {
        field_J = null;
        field_H = null;
        if (param0 < -102) {
          field_K = null;
          field_A = null;
          return;
        }
        field_K = (int[]) null;
        field_K = null;
        field_A = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        super.a(59, param1, param2, param3, param4, param5);
        cb var7 = oj.field_w;
        if (param0 <= 36) {
          return;
        }
        try {
          if (var7 != null) {
            if (!this.a(param3, param2, false, param4, param1)) {
              return;
            }
            if (this.field_r instanceof fe) {
              ((fe) (this.field_r)).a(this, var7, 121);
              oj.field_w = null;
              return;
            }
            if (var7.field_r instanceof fe) {
              ((fe) (var7.field_r)).a(this, var7, 118);
              oj.field_w = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hj.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_A = "Not enough time";
        field_J = new int[8192];
        field_H = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
