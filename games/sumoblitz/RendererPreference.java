/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RendererPreference {
    static er field_a;
    boolean enabled;
    int backend;
    static int[] field_d;
    static String endGameText;
    int options;
    static int field_b;

    public static void releaseStatics(byte param0) {
        int var1 = 5 / ((13 - param0) / 51);
        field_a = null;
        endGameText = null;
        field_d = null;
    }

    final boolean acceptsSession(RendererSession session, byte guard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -74 % ((guard + 86) / 33);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("nj.C(");
          if (session == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean sameBackend(RendererPreference other, byte guard) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 95) {
            stackIn_6_0 = (this.backend == other.backend);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nj.A(");
          if (other == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    public final String toString() {
        return super.toString();
    }

    RendererPreference(int backendId, int backendOptions) {
        this.enabled = true;
        this.options = backendOptions;
        this.backend = backendId;
    }

    static {
        field_a = new er(1);
        endGameText = "End Game";
        field_d = new int[13];
    }
}
