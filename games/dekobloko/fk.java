/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends a {
    static int field_H;
    private int field_F;
    static pi[][] field_G;
    static int[] field_I;
    private int field_D;
    private int field_B;
    private ck[] field_C;

    public static void c(int param0) {
        if (param0 != 8) {
          field_I = (int[]) null;
          field_G = (pi[][]) null;
          field_I = null;
          return;
        }
        field_G = (pi[][]) null;
        field_I = null;
    }

    public fk() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param3 >= -60) {
            fk.c(-101);
          }
          if (!param4.field_q) {
            stackIn_8_0 = (param4.a(true)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param4 instanceof ek) {
            param0 = param0 & ((ek) (param4)).field_I;
          }
          if (!param0) {
            stackIn_15_0 = this.field_F;
          } else {
            if (var6_int != 0) {
              stackIn_15_0 = this.field_B;
            } else {
              stackIn_15_0 = this.field_D;
            }
          }
          var7 = stackIn_15_0;
          stackIn_18_0 = (param0) ? 16777215 : 7105644;
          var8 = stackIn_18_0;
          rm.a(param2 - (-param4.field_D - (param4.field_y - this.field_C[0].field_C >> 1)), this.field_C, param4.field_u + param1, param4.field_t, var7, -121);
          this.field_z.a(param4.field_E, param4.field_u + param1, -2 + (param4.field_D + param2), param4.field_t, param4.field_y, var8, -1, 1, 1, this.field_z.field_R);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("fk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private fk(int param0, int param1, int param2) {
        this.field_D = param0;
        this.field_z = ec.field_p;
        this.field_C = rm.field_a;
        this.field_F = param2;
        this.field_B = param1;
    }

    static {
        field_G = new pi[8][];
        field_I = new int[2];
    }
}
