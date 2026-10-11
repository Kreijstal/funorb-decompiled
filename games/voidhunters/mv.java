/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv extends ksa {
    int field_d;
    int[] field_h;
    int field_i;
    int[] field_j;
    mob[] field_e;
    byte[][][] field_f;
    mob[] field_g;
    int[] field_k;

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(gha.field_q);
          param1.addFocusListener(gha.field_q);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("mv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    mv() {
    }

    static {
    }
}
