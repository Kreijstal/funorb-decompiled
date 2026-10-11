/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends ae {
    private int field_j;
    private int field_i;

    final void a(int param0, boolean param1, int param2, int param3) {
        wb var5 = null;
        gm var5_ref = null;
        try {
          var5 = op.field_m.a(this.field_i, false);
          ah.field_e.c(Integer.toString(this.field_f - param3), var5.g(-41) - param2, -param0 + var5.h(76), 4, -1);
        } catch (Exception exception) {
        }
        try {
          if (!param1) {
            this.field_j = -25;
          }
          var5_ref = op.field_m.a(this.field_i, 105);
          ah.field_e.c(Integer.toString(this.field_f - param3), var5_ref.g(81) - param2, -param0 + var5_ref.h(87), 4, -1);
        } catch (Exception exception) {
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 83) {
            stackIn_4_0 = mk.field_b.a("", param0, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pc.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(0, param3);
        this.field_j = param1;
        if (param2) {
          return;
        }
        this.field_i = param0;
    }

    final void a(int param0, qd param1) {
        try {
          param1.c((byte) 118, this.field_j, this.field_i);
          if (param0 != 0) {
            this.field_j = -79;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "pc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        if (param0 < -47) {
          super.a((byte) -86);
          a.field_c.a((br) (this), false);
          return;
        }
        this.field_j = -37;
        super.a((byte) -86);
        a.field_c.a((br) (this), false);
    }

    pc() {
    }

    static {
    }
}
