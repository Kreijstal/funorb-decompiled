/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int field_e;
    static hb field_c;
    static od field_a;
    static String field_d;
    int field_b;

    final static void a(mn param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dc var3 = null;
        dc var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        dc var3Lifetime1;
        dc var4Lifetime1;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2_int = 34 / ((-84 - param1) / 37);
          do {
            var3 = (dc) (param0.a(false));
            if (var3 == null) {
              return;
            }
            var4 = (dc) (param0.a((byte) 82));
            var5 = 1;
            while (var4 != null) {
              if (var4.field_I > var3.field_I) {
                var5 = 0;
                ri.a(var4, 0, var3);
              } else {
                var3 = var4;
              }
              var4 = (dc) (param0.a((byte) -52));
            }
            if (var5 != 0) {
              return;
            }
            var4Lifetime1 = (dc) (param0.a(60));
            var5 = 1;
            var3Lifetime1 = (dc) (param0.d(2123));
            while (var3Lifetime1 != null) {
              if (var4Lifetime1.field_I > var3Lifetime1.field_I) {
                ri.a(var4Lifetime1, 0, var3Lifetime1);
                var5 = 0;
              } else {
                var4Lifetime1 = var3Lifetime1;
              }
              var3Lifetime1 = (dc) (param0.d(2123));
            }
          } while (var5 == 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("e.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 52) {
          e.a(26);
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    e(int param0, int param1, int param2, int param3) {
        this.field_b = param3;
        this.field_e = param0;
    }

    static {
        field_d = "Score";
    }
}
