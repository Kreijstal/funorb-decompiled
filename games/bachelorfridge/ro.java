/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends pp {
    static int field_j;
    private int field_i;
    private int field_l;
    static String field_k;

    final void a(aga param0, op param1, int param2) {
        wia var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param1.field_a[this.field_i][this.field_l];
            var4.field_d = false;
            if (param2 == 12) {
              break L0;
            } else {
              this.field_l = -114;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4_ref);

            stackIn_5_1 = new StringBuilder().append("ro.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        int var1 = -57 / ((-39 - param0) / 35);
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) 101);
            int var3_int = 57 / ((34 - param1) / 58);
            param0.d(this.field_i, 0);
            param0.d(this.field_l, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ro.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ro(int param0, int param1) {
        this.field_i = param0;
        this.field_l = param1;
    }

    static {
        field_k = "ESC - cancel this line";
    }
}
