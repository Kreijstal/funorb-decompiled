/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends pv {
    private int field_j;
    private int field_n;
    static wl field_q;
    private double field_p;
    static String field_m;
    static int[][] field_l;
    static String field_k;
    static kv field_o;

    final static Object a(boolean param0, byte[] param1) {
        gla var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        gla stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        gla stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1.length > 136) {
                var3 = new gla();
                ((nu) (Object) var3).a((byte) 43, param1);
                stackOut_5_0 = (gla) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) param1;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ug.H(").append(0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + -19524 + 41);
        }
        return (Object) (Object) stackIn_6_0;
    }

    private final void b() {
    }

    private final int c(int param0) {
        return Math.abs(((ug) this).field_j) * 100 / 56 >> 1;
    }

    private final int d() {
        return (int)((double)((ug) this).field_g * ((ug) this).field_p) - -((ug) this).field_n;
    }

    final boolean b(boolean param0) {
        int fieldTemp$5 = ((ug) this).field_g + 1;
        ((ug) this).field_g = ((ug) this).field_g + 1;
        if (fieldTemp$5 <= this.c(-137)) {
          if (((ug) this).field_j != 0) {
            if (!param0) {
              L0: {
                field_k = null;
                if (((ug) this).field_g == 1) {
                  ((ug) this).field_f.field_u = ((ug) this).field_f.field_u + ((ug) this).field_j / 56;
                  ((ug) this).field_f.field_v.a((byte) 13, ((ug) this).field_f.field_g.field_o.field_b, 1);
                  break L0;
                } else {
                  break L0;
                }
              }
              int discarded$6 = -27656;
              ((ug) this).field_f.field_n = this.d();
              return false;
            } else {
              L1: {
                if (((ug) this).field_g == 1) {
                  ((ug) this).field_f.field_u = ((ug) this).field_f.field_u + ((ug) this).field_j / 56;
                  ((ug) this).field_f.field_v.a((byte) 13, ((ug) this).field_f.field_g.field_o.field_b, 1);
                  break L1;
                } else {
                  break L1;
                }
              }
              int discarded$7 = -27656;
              ((ug) this).field_f.field_n = this.d();
              return false;
            }
          } else {
            int discarded$8 = 1;
            this.b();
            return true;
          }
        } else {
          int discarded$9 = 1;
          this.b();
          return true;
        }
    }

    ug(jfa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          ((ug) this).field_j = param1;
          ((ug) this).field_f = param0;
          ((ug) this).field_n = ((ug) this).field_f.field_n;
          ((ug) this).field_p = (double)((ug) this).field_j / (double)this.c(-137);
          if (0 <= ((ug) this).field_j) {
            ((ug) this).field_f.field_s = true;
            return;
          } else {
            ((ug) this).field_f.field_s = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ug.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    public static void c() {
        field_l = null;
        field_m = null;
        field_k = null;
        field_o = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Passwords must be between 5 and 20 letters and numbers";
        field_k = "Please enter your age in years";
        field_l = new int[][]{new int[12], new int[11], new int[11], new int[11], new int[11]};
    }
}
