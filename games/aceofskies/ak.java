/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends RuntimeException {
    static ad field_d;
    Throwable field_c;
    static int[] field_b;
    String field_a;
    static boolean field_e;
    static int[] field_f;

    public static void a(boolean param0) {
        int[] var2;
        field_d = null;
        field_b = null;
        if (param0) {
          var2 = (int[]) null;
          ak.a(-20, (wp) null, (int[]) null);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(ga param0, boolean param1, int param2) {
        try {
            tq.field_d.a(84, param0);
            ac.a(0, param2, param0);
            if (!param1) {
                field_e = false;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ak.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static wp a(int param0, wp param1, int[] param2) {
        wp var3 = null;
        RuntimeException var3_ref = null;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new wp(0, 0, 0);
            var3.field_c = param1.field_c;
            var3.field_i = param2;
            var3.field_h = param1.field_h;
            var3.field_j = param1.field_j;
            var3.field_a = param1.field_a;
            if (param0 == 15810) {
              var3.field_b = param1.field_b;
              var3.field_d = param1.field_d;
              var3.field_e = param1.field_e;
              stackIn_4_0 = (wp) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("ak.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    ak(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    static {
        field_b = new int[1];
        field_e = false;
        field_f = new int[8];
    }
}
