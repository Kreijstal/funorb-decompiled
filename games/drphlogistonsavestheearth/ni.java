/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends ei {
    static cd field_s;
    static int field_x;
    static String field_u;
    static String[] field_r;
    static jb field_q;
    static int field_t;
    static boolean field_w;
    static int field_p;
    static int[] field_v;

    ni(kl param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(8192, param1) == u.field_b) {
            stackIn_2_0 = lf.field_d;
            return stackIn_2_0;
          }
          if (param0 < 47) {
            field_q = (jb) null;
          }
          stackIn_6_0 = fl.field_e;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ni.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 55 / ((-52 - param0) / 49);
        field_u = null;
        field_s = null;
        field_r = null;
        field_v = null;
    }

    final vh a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        vh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8192) {
            field_s = (cd) null;
          }
          stackIn_5_0 = (bc.a(param1, -3303) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return ce.field_e;
          }
          stackIn_8_0 = u.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ni.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_u = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_x = 0;
        field_s = new cd();
        field_r = new String[]{"All scores", "My scores", "Best each"};
        field_t = 5;
        field_w = false;
        field_v = new int[]{6, 50, 50, 56};
    }
}
