/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ug {
    static int field_g;
    int field_o;
    int field_h;
    int field_j;
    static cd field_k;
    int field_m;
    int field_e;
    static int[] field_f;
    static String field_p;
    static boolean field_i;
    int[] field_l;
    int field_n;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        ki var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = param0;
            var2 = (ki) ((Object) ok.field_a.a((byte) -117));
            L1: while (true) {
              if (var2 == null) {
                stackIn_7_0 = var1_int;
                break L0;
              } else {
                L2: {
                  if (var2.field_q - (float)var2.field_y <= (float)var1_int) {
                    break L2;
                  } else {
                    var1_int = (int)((float)(-var2.field_y) + var2.field_q);
                    break L2;
                  }
                }
                var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "jf.B(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
            this.field_l = param7;
            this.field_e = param5;
            this.field_o = param1;
            this.field_j = param6;
            this.field_m = param3;
            this.field_n = param4;
            this.field_h = param0;
            if (param2 <= 103) {
                int[] var10 = (int[]) null;
                this.a(67, 55, 21, -107, -21, 22, 114, (int[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "jf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    jf() {
    }

    public static void e(int param0) {
        field_p = null;
        field_f = null;
        field_k = null;
        if (param0 > -15) {
            jf.a(-105);
        }
    }

    static {
        field_g = 0;
        field_k = new cd("");
        field_f = new int[10];
        field_p = "Accept";
    }
}
