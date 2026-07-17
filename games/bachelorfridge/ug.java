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

    final static Object a(boolean param0, byte[] param1, int param2) {
        gla var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        gla stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        gla stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1.length > 136) {
                var3 = new gla();
                ((nu) (Object) var3).a((byte) 43, param1);
                stackOut_5_0 = (gla) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                if (param0) {
                  stackOut_10_0 = gs.a((byte) 119, param1);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = (byte[]) param1;
                  stackIn_9_0 = stackOut_8_0;
                  return (Object) (Object) stackIn_9_0;
                }
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
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("ug.H(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -19524 + 41);
        }
        return (Object) (Object) stackIn_11_0;
    }

    private final void b(int param0) {
    }

    private final int c(int param0) {
        return Math.abs(((ug) this).field_j) * 100 / 56 >> 1;
    }

    private final int d(int param0) {
        return (int)((double)((ug) this).field_g * ((ug) this).field_p) - -((ug) this).field_n;
    }

    final boolean b(boolean param0) {
        int fieldTemp$1 = ((ug) this).field_g + 1;
        ((ug) this).field_g = ((ug) this).field_g + 1;
        if (fieldTemp$1 <= this.c(-137)) {
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
              ((ug) this).field_f.field_n = this.d(-27656);
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
              ((ug) this).field_f.field_n = this.d(-27656);
              return false;
            }
          } else {
            this.b(1);
            return true;
          }
        } else {
          this.b(1);
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

    public static void c(byte param0) {
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
