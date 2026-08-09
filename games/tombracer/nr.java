/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr implements bo {
    private int field_b;
    static mla field_d;
    private int field_c;
    static sla field_a;

    public final void a(kh param0, byte param1) {
        RuntimeException var3 = null;
        kh var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.h((byte) -37);
              this.field_b = param0.b((byte) 44, 3);
              if (-2 != (param0.b((byte) 44, 1) ^ -1)) {
                this.field_c = param0.b((byte) 44, 2);
                break L1;
              } else {
                this.field_c = -1;
                break L1;
              }
            }
            param0.i((byte) 98);
            if (param1 == -19) {
              break L0;
            } else {
              var4 = (kh) null;
              this.a((kh) null, (byte) -120);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("nr.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            nr.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(int param0, kh param1) {
        try {
            param1.i(8);
            param1.a((byte) 89, this.field_b, 3);
            if (param0 != 200) {
                nr.a(false);
            }
            if ((this.field_c ^ -1) == 0) {
                param1.a((byte) -127, 1, 1);
            } else {
                param1.a((byte) 121, 0, 1);
                param1.a((byte) 53, this.field_c, 2);
            }
            param1.k(param0 + -1826190886);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nr.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, qh param1, v param2) {
        try {
            param1.a((byte) 113, this.field_b, this.field_c);
            if (param0 != -78) {
                nr.a(false);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nr.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new mla();
        field_a = new sla();
    }
}
