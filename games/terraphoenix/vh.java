/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends uf {
    static String field_n;
    static bg[] field_k;
    static int[][] field_j;
    long field_m;
    vh field_i;
    static String field_l;
    vh field_o;
    static String field_h;

    final static boolean a(int param0, int param1, fa param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = param2.b(param0, -106, param1);
              var4 = var5;
              if (param3) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            if (var5 == null) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              b.a(var5, (byte) -110);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("vh.VA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(String param0, byte param1, float param2) {
        try {
            ad.field_e = param0;
            int var3_int = -44 % ((-15 - param1) / 53);
            ed.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "vh.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        if (this.field_i != null) {
          this.field_i.field_o = this.field_o;
          this.field_o.field_i = this.field_i;
          this.field_i = null;
          if (param0 != 13) {
            this.field_m = 69L;
            this.field_o = null;
            return;
          } else {
            this.field_o = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != 7229) {
          field_h = (String) null;
          field_j = (int[][]) null;
          field_k = null;
          field_l = null;
          field_h = null;
          return;
        } else {
          field_j = (int[][]) null;
          field_k = null;
          field_l = null;
          field_h = null;
          return;
        }
    }

    protected vh() {
    }

    static {
        field_n = "Soldier";
        field_h = "    Low Walls";
    }
}
