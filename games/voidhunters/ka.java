/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    abstract int HA();

    abstract int V();

    final static void a(int param0, int param1) {
        jia.field_o = param0;
        if (param1 != -19266) {
          return;
        }
    }

    abstract int G();

    final static ana a(int param0, fga param1) {
        ana var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ana stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ana(param1, param1);
          cg.field_p.b(-10258, var2);
          var3 = 119 / ((param0 - 18) / 37);
          kpb.field_q.b(param1);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("ka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    abstract void H(int param0, int param1, int param2);

    abstract int RA();

    abstract void O(int param0, int param1, int param2);

    static {
    }
}
