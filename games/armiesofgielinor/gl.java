/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    private String field_a;
    static BitmapFont field_e;
    private boolean field_d;
    static int field_c;
    static boolean field_b;

    final String a(int param0) {
        int var2 = 87 % ((param0 - 53) / 55);
        return this.field_a;
    }

    final boolean a(byte param0) {
        int var2 = -118 / ((param0 - 29) / 41);
        return this.field_d;
    }

    final static void a(int param0, int param1) {
        if (param0 < 119) {
          return;
        }
        OctaveNoiseMap.field_r = param1;
    }

    gl(String param0) {
        this(param0, false);
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          gl.a(-75, -111);
        }
    }

    gl(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          stackIn_4_1 = (param1);
          this.field_d = stackIn_4_1;
          if (null == this.field_a) {
            this.field_a = "";
          }
          if (0 != this.field_a.length()) {
            return;
          }
          this.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gl.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = false;
    }
}
