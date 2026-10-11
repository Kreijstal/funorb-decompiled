/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String[] field_f;
    static ri[] field_b;
    static tf field_a;
    static int[] field_d;
    static int field_c;
    static int field_e;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
          field_a = (tf) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static wb[] a(int param0, ki param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        wb[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 19889) {
            field_d = (int[]) null;
          }
          if (k.a(param1, param2, param3, param0 - 42935)) {
            stackIn_6_0 = bw.b(-124);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (wb[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param2) {
          Sumoblitz.field_H = Sumoblitz.field_H + 1;
          rb.a(-129);
          if (param1 > -16) {
            kr.a(28);
            if (param0) {
              jj.field_d = jj.field_d + 1;
              o.a((byte) -56);
            }
            return;
          }
          if (param0) {
            jj.field_d = jj.field_d + 1;
            o.a((byte) -56);
          }
          return;
        }
        if (param1 <= -16) {
          if (param0) {
            jj.field_d = jj.field_d + 1;
            o.a((byte) -56);
          }
          return;
        }
        kr.a(28);
        if (param0) {
          jj.field_d = jj.field_d + 1;
          o.a((byte) -56);
        }
    }

    static {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new tf();
        field_e = 0;
        field_c = 256;
    }
}
