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
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          this.field_f = param0.j(17);
          this.field_c = param0.j(17);
          this.field_e = param0.i(-110);
          this.field_h = param0.i(-89);
          this.field_g = param0.i(-108);
          this.field_j = param0.h((byte) -128);
          var3_int = param0.h((byte) -109);
          if (1 == (var3_int & 1)) {
            this.field_i = true;
          } else {
            this.field_i = false;
          }
          if ((1 & var3_int >> 2) == 1) {
            this.field_b = true;
          } else {
            this.field_b = false;
          }
          if (param1 < 48) {
            this.field_h = -25;
          }
          if ((3 & var3_int) >> 1 == 1) {
            this.field_a = true;
            return;
          }
          this.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("bc.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
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
