/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends wf {
    static ej field_g;
    static String field_e;
    private int field_i;
    private int field_j;
    private int field_h;
    private int field_l;
    private int field_f;
    private String field_k;

    public static void a() {
        field_e = null;
        int var1 = -1;
        field_g = null;
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 47) {
          L0: {
            ((tb) this).field_j = -72;
            if (((tb) this).field_i >= ((tb) this).field_h + (kn.field_b.field_e - ((tb) this).field_f)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((tb) this).field_i >= ((tb) this).field_h + (kn.field_b.field_e - ((tb) this).field_f)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(int param0) {
        int var2 = -39 / ((param0 - -45) / 55);
        int fieldTemp$0 = ((tb) this).field_i + 1;
        ((tb) this).field_i = ((tb) this).field_i + 1;
        return ((tb) this).field_l + (((tb) this).field_h + ((tb) this).field_f) < fieldTemp$0 ? true : false;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((tb) this).field_f <= ((tb) this).field_i) {
          if (((tb) this).field_i < ((tb) this).field_f + ((tb) this).field_h) {
            rb.field_j.a(102, ((tb) this).field_j | -16777216, -1, gp.field_w + -50, 320, ((tb) this).field_k);
            return;
          } else {
            var2 = ((tb) this).field_i - ((tb) this).field_f - ((tb) this).field_h;
            var3 = (((tb) this).field_l + -var2 << 8) / ((tb) this).field_l;
            if (var3 <= 0) {
              return;
            } else {
              var4 = 80 * var2 / ((tb) this).field_l;
              rb.field_j.a(99, ((tb) this).field_j | var3 << 24, -1, param0 + (gp.field_w - var4), sh.field_u >> 1, ((tb) this).field_k);
              return;
            }
          }
        } else {
          var2 = (((tb) this).field_i << 8) / ((tb) this).field_f;
          var3 = (-((tb) this).field_i + ((tb) this).field_f) * 80 / ((tb) this).field_f;
          rb.field_j.a(122, var2 << 24 | ((tb) this).field_j, -1, var3 + (-50 + gp.field_w), 320, ((tb) this).field_k);
          return;
        }
    }

    tb(String param0, int param1) {
        try {
            ((tb) this).field_f = 20;
            ((tb) this).field_j = param1;
            ((tb) this).field_k = param0;
            ((tb) this).field_l = 80;
            ((tb) this).field_i = 0;
            ((tb) this).field_h = 150;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    tb(String param0, int param1, int param2) {
        try {
            ((tb) this).field_f = 20;
            ((tb) this).field_h = param2;
            ((tb) this).field_i = 0;
            ((tb) this).field_j = param1;
            ((tb) this).field_k = param0;
            ((tb) this).field_l = 80;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ej(7, 0, 1, 1);
        field_e = "That name is not available";
    }
}
