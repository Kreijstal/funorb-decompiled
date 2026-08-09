/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf implements jca {
    int[] field_g;
    static tv[][] field_b;
    float[] field_e;
    static String field_f;
    int field_c;
    static int field_a;
    private ita field_h;
    int field_d;

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            return;
        }
        field_b = (tv[][]) null;
    }

    bf(sfa param0, nh param1, ita param2) {
        RuntimeException runtimeException = null;
        vqa var5 = null;
        raa var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof raa) {
                var6 = (raa) ((Object) param1);
                this.field_g = var6.field_E;
                this.field_d = var6.field_f;
                this.field_c = var6.field_a;
                break L1;
              } else {
                if (!(param1 instanceof vqa)) {
                  throw new RuntimeException();
                } else {
                  var5 = (vqa) ((Object) param1);
                  this.field_c = var5.field_a;
                  this.field_d = var5.field_f;
                  this.field_g = var5.field_E;
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                L3: {
                  this.field_h = param2;
                  if (this.field_c != this.field_h.field_d) {
                    break L3;
                  } else {
                    if (this.field_d == this.field_h.field_b) {
                      this.field_e = this.field_h.field_h;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                throw new RuntimeException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("bf.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_a = -1;
        field_f = "Water Spray";
    }
}
