/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg {
    qfa field_b;
    static soa field_a;

    public static void c(int param0) {
        field_a = null;
        if (param0 != -15081) {
          field_a = (soa) null;
        }
    }

    abstract void a(int param0);

    abstract void a(boolean param0, boolean param1);

    abstract void a(boolean param0, int param1);

    final static int a(slb param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = 104;
            return stackIn_2_0;
          }
          if (param0 == qcb.field_q) {
            stackIn_14_0 = 5890;
            return stackIn_14_0;
          }
          if (param0 == tma.field_q) {
            stackIn_6_0 = 34167;
            return stackIn_6_0;
          }
          if (param0 == pja.field_l) {
            stackIn_9_0 = 34168;
            return stackIn_9_0;
          }
          if (param0 != pea.field_d) {
            throw new IllegalArgumentException();
          }
          stackIn_12_0 = 34166;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("qg.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract boolean b(int param0);

    qg(qfa param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, byte param1, pib param2);

    static {
        vja discarded$0 = new vja();
    }
}
