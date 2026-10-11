/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String field_g;
    static boolean field_a;
    static int field_b;
    static String field_e;
    static ci field_f;
    static String field_d;
    static String[] field_c;

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        f var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (!param0) {
              stackIn_9_0 = var3;
              return stackIn_9_0;
            }
            stackIn_7_0 = tj.a(-117, var3);
            return stackIn_7_0;
          }
          if (param1) {
            stackIn_12_0 = (byte[]) null;
            return stackIn_12_0;
          }
          if (!(param2 instanceof f)) {
            throw new IllegalArgumentException();
          }
          var4 = (f) (param2);
          stackIn_15_0 = var4.b(438);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("jf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        field_c = null;
        int var1 = 48 / ((-57 - param0) / 38);
        field_d = null;
    }

    static {
        field_a = false;
        field_e = "Hotseat multiplayer game";
        field_d = "Tips";
        field_g = "This game has started.";
        field_c = new String[]{"", "", "N", "B", "R", "Q", "K"};
    }
}
