/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo {
    int field_e;
    static eq field_d;
    int field_f;
    int field_a;
    static sna field_b;
    static String field_c;

    abstract void a(int param0, int param1, int param2);

    abstract void a(byte param0, int param1, int param2);

    public static void a(byte param0) {
        pp discarded$2 = null;
        lu var2 = null;
        field_d = null;
        field_b = null;
        if (param0 > -121) {
          var2 = (lu) null;
          discarded$2 = vo.a(-98, (lu) null);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static pp a(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        lia stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        lia stackOut_2_0 = null;
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
            L1: {
              var2 = qi.a(param1, (byte) 96);
              var3 = param1.c((byte) -85);
              if (param0 <= -37) {
                break L1;
              } else {
                vo.a((byte) 104);
                break L1;
              }
            }
            var4 = param1.b(true);
            stackOut_2_0 = new lia(var2, var3, var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("vo.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
    }

    vo(int param0, int param1, int param2) {
        this.field_e = param2;
        this.field_f = param1;
        this.field_a = param0;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_c = "Please enter a year between <%0> and <%1>";
    }
}
