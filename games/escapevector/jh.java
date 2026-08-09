/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends hg {
    boolean field_h;
    boolean field_g;
    static hh field_k;
    static String field_j;
    int[] field_i;

    public static void a(boolean param0) {
        if (param0) {
            jh.d(71);
            field_k = null;
            field_j = null;
            return;
        }
        field_k = null;
        field_j = null;
    }

    final static boolean d(int param0) {
        if (param0 != -4292) {
            String var2 = (String) null;
            jh.a(false, (String) null, true, (String) null);
            return hf.field_a;
        }
        return hf.field_a;
    }

    final static void a(boolean param0, String param1, boolean param2, String param3) {
        RuntimeException runtimeException = null;
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
            L1: {
              bm.field_g = param3;
              vk.field_v = param1;
              uf.a((byte) 71, mm.field_a, param0);
              if (!param2) {
                break L1;
              } else {
                jh.a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    jh() {
        this.field_h = false;
        this.field_g = true;
    }

    static {
        field_j = "Accept";
    }
}
