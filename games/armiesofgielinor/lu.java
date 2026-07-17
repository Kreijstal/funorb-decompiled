/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lu extends lk {
    static je field_u;
    static String field_v;

    lu(ka param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    public static void a(int param0) {
        field_v = null;
        field_u = null;
    }

    lu(int param0) {
        this(ArmiesOfGielinor.field_J, param0);
    }

    final static void a(int param0, int param1) {
        bv var2 = null;
        var2 = vl.field_n;
        var2.h(32161, param1);
        if (param0 >= -99) {
          field_u = null;
          var2.b(1, 1);
          var2.b(1, 1);
          return;
        } else {
          var2.b(1, 1);
          var2.b(1, 1);
          return;
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                qq.a(param0.field_l, param0.field_B + param1, param0.field_w, 94, param4 + param0.field_p);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, -120, param3, param4);
            if (param2 <= -79) {
              break L0;
            } else {
              lu.a(-66, -37);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("lu.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "<%0> / <%1> (+<%2>)";
    }
}
