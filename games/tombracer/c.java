/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class c extends vg implements fo {
    static int[] field_g;
    static java.math.BigInteger field_f;
    static String field_h;

    int a(int param0, byte param1) {
        if (param1 != -39) {
          this.h(10);
          return param0;
        }
        return param0;
    }

    abstract boolean h(int param0);

    final static boolean[] a(int param0, boolean[] param1, byte param2, kh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        boolean[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param3.b((byte) 44, param0);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (boolean[]) (stackIn_3_0);
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new boolean[var4_int];
          }
          var5 = 0;
          var6 = 100 / ((16 - param2) / 40);
          while (var4_int > var5) {
            param1[var5] = uha.a(5907, param3);
            var5++;
          }
          stackIn_12_0 = (boolean[]) (param1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("c.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void a(uw param0, int param1);

    public static void m(int param0) {
        field_g = null;
        field_f = null;
        if (param0 <= 54) {
          return;
        }
        field_h = null;
    }

    abstract void a(int param0, byte param1, int param2, int param3);

    abstract void a(la param0, int param1);

    abstract void a(int param0, boolean param1);

    c() {
    }

    abstract c d(boolean param0);

    static {
        field_g = new int[1024];
        field_h = "Login: ";
        field_f = new java.math.BigInteger("65537");
    }
}
