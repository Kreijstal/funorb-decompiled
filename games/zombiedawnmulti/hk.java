/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int[] field_f;
    int[] field_b;
    int[] field_d;
    static boolean field_a;
    static String field_g;
    int[] field_c;
    static int field_e;

    final void a(int param0, k param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 != 7054) {
            this.field_d = (int[]) null;
          }
          while (this.field_b.length > var3_int) {
            this.field_b[var3_int] = param1.d((byte) 69);
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    hk() {
        this.field_b = new int[5];
        bl.a((byte) 49);
        this.field_c = new int[3];
        this.field_d = new int[5];
        this.field_f = new int[5];
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 == 39) {
          return;
        }
        hk.a((byte) -21);
    }

    static {
        field_g = "Service unavailable";
    }
}
