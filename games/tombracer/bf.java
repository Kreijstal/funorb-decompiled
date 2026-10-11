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
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 instanceof raa) {
            var6 = (raa) (param1);
            this.field_g = var6.field_E;
            this.field_d = var6.field_f;
            this.field_c = var6.field_a;
          } else {
            if (!(param1 instanceof vqa)) {
              throw new RuntimeException();
            }
            var5 = (vqa) (param1);
            this.field_c = var5.field_a;
            this.field_d = var5.field_f;
            this.field_g = var5.field_E;
          }
          if (param2 != null) {
            this.field_h = param2;
            if (this.field_c == this.field_h.field_d &&
              this.field_d == this.field_h.field_b) {
              this.field_e = this.field_h.field_h;
              return;
            }
            throw new RuntimeException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("bf.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_a = -1;
        field_f = "Water Spray";
    }
}
