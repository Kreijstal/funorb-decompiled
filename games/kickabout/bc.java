/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    int field_j;
    boolean field_i;
    boolean field_b;
    boolean field_a;
    int field_g;
    String field_c;
    int field_e;
    static int field_d;
    String field_f;
    int field_h;

    final void a(iw param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            this.field_f = param0.j(17);
            this.field_c = param0.j(17);
            this.field_e = param0.i(-110);
            this.field_h = param0.i(-89);
            this.field_g = param0.i(-108);
            this.field_j = param0.h((byte) -128);
            var3_int = param0.h((byte) -109);
            if (1 == (var3_int & 1)) {
              this.field_i = true;
              break L0;
            } else {
              this.field_i = false;
              break L0;
            }
          }
          L1: {
            if ((1 & var3_int >> 1413083330) == 1) {
              this.field_b = true;
              break L1;
            } else {
              this.field_b = false;
              break L1;
            }
          }
          L2: {
            if (param1 >= 48) {
              break L2;
            } else {
              this.field_h = -25;
              break L2;
            }
          }
          if (-2 == ((3 & var3_int) >> -287630591 ^ -1)) {
            this.field_a = true;
            return;
          } else {
            this.field_a = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("bc.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int[] param1) {
        if (param0 != -8) {
            return;
        }
        try {
            param1[76] = -2;
            param1[90] = 0;
            param1[75] = -1;
            param1[68] = -1;
            param1[86] = 1;
            param1[85] = 0;
            param1[78] = -2;
            param1[84] = 0;
            param1[82] = 0;
            param1[77] = 1;
            param1[65] = -2;
            param1[66] = 0;
            param1[80] = -2;
            param1[83] = -2;
            param1[72] = -2;
            param1[67] = 12;
            param1[71] = -2;
            param1[73] = -2;
            param1[81] = 27;
            param1[89] = -2;
            param1[69] = -2;
            param1[74] = -1;
            param1[88] = -2;
            param1[91] = -2;
            param1[87] = -2;
            param1[70] = -2;
            param1[64] = -2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "bc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
