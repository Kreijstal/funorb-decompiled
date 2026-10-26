/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    static String field_c;
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 == 8192) {
          field_c = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        ur.a(-26, -63, -63, (ResourceArchive) null);
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 > -10) {
          ur.a(119);
          return true;
        }
        return true;
    }

    final static wp[] a(int param0, int param1, int param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        wp[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tn.a(param3, (byte) -127, param2, param1)) {
            stackIn_2_0 = null;
            return (wp[]) (stackIn_2_0);
          }
          var4_int = -91 / ((34 - param0) / 38);
          stackIn_4_0 = kn.a(-125);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ur.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new int[8192];
    }
}
