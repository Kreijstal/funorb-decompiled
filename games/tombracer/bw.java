/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw {
    static int[] field_b;
    static iu field_a;

    final static Object a(int param0, byte[] param1, boolean param2) {
        ie var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ie stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 270) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return stackIn_5_0;
          }
          if (param1.length > 136) {
            var3 = new ie();
            ((qu) ((Object) var3)).a(true, param1);
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          if (!param2) {
            stackIn_14_0 = (byte[]) (param1);
            return stackIn_14_0;
          }
          stackIn_12_0 = lh.a(param1, 6711);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("bw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 108) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new int[8192];
        field_a = new iu(270, 70);
    }
}
