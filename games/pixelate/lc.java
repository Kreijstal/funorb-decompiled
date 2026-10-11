/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends fa {
    int field_p;
    boolean field_u;
    static boolean[] field_t;
    int field_s;
    int[][] field_r;
    int field_v;
    int field_m;
    static ak field_q;
    int field_n;
    int field_k;
    String[][] field_o;
    static String[][] field_l;

    public static void a(byte param0) {
        if (param0 == 90) {
          field_t = null;
          field_l = (String[][]) null;
          field_q = null;
          return;
        }
        aa var2 = (aa) null;
        lc.a((aa) null, false);
        field_t = null;
        field_l = (String[][]) null;
        field_q = null;
    }

    final static int a(aa param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = vp.field_Ib;
          if (2 == param0.field_j) {
            if (!param0.field_a) {
              if (0 == param0.field_d &&
                0 == param0.field_e) {
                var2_intLifetime1 = ib.field_i[param0.field_j];
              } else {
                var2_intLifetime1 = qp.field_P[param0.field_j];
              }
            } else {
              var2_intLifetime1 = vp.field_Ib;
            }
          } else {
            if (param0.field_j == 4) {
              var2_intLifetime1 = qp.field_P[param0.field_j];
            } else {
              if (~param0.field_k == ~hn.field_f) {
                var2_intLifetime1 = ib.field_i[param0.field_j];
              } else {
                var2_intLifetime1 = qp.field_P[param0.field_j];
              }
            }
          }
          if (param1) {
            field_l = (String[][]) null;
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("lc.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    lc() {
    }

    static {
    }
}
