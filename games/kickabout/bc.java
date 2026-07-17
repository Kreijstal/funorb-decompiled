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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            ((bc) this).field_f = param0.j(17);
            ((bc) this).field_c = param0.j(17);
            ((bc) this).field_e = param0.i(-110);
            ((bc) this).field_h = param0.i(-89);
            ((bc) this).field_g = param0.i(-108);
            ((bc) this).field_j = param0.h((byte) -128);
            var3_int = param0.h((byte) -109);
            if (1 == (var3_int & 1)) {
              ((bc) this).field_i = true;
              break L0;
            } else {
              ((bc) this).field_i = false;
              break L0;
            }
          }
          L1: {
            if ((1 & var3_int >> 2) == 1) {
              ((bc) this).field_b = true;
              break L1;
            } else {
              ((bc) this).field_b = false;
              break L1;
            }
          }
          L2: {
            if (param1 >= 48) {
              break L2;
            } else {
              ((bc) this).field_h = -25;
              break L2;
            }
          }
          if ((3 & var3_int) >> 1 == 1) {
            ((bc) this).field_a = true;
            return;
          } else {
            ((bc) this).field_a = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("bc.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    final static void a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == -8) {
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("bc.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
    }
}
