/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqa extends ei {
    boolean field_j;
    boolean field_h;
    boolean field_f;
    boolean field_e;
    boolean field_k;
    boolean field_i;
    static String field_g;
    boolean field_d;

    public final String toString() {
        String[] var2 = new String[]{"Pure Java", "OpenGL", "SSE", "DirectX", "Pure Java (Z-Buffered)", "OpenGL+"};
        String[] var1 = var2;
        return var2[this.field_b];
    }

    final boolean a(ei param0, int param1) {
        lqa var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 55) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = (lqa) (param0);
          if (super.a(param0, 55)) {
            stackIn_7_0 = (var3.field_j) ? 0 : 1;
            if (stackIn_7_0 != (this.field_j ? 1 : 0) &&
              this.field_a == var3.field_a) {
              stackIn_12_0 = (var3.field_k) ? 0 : 1;
              if (stackIn_12_0 != (var3.field_k ? 1 : 0)) {
                stackIn_15_0 = true;
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_15_0 = false;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("lqa.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    lqa(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, boolean param10) {
        super(param0, param1);
        this.field_j = param2 ? true : false;
        this.field_i = param5 ? true : false;
        this.field_f = param10 ? true : false;
        this.field_k = param4 ? true : false;
        this.field_e = param7 ? true : false;
        this.field_d = param8 ? true : false;
        this.field_h = param9 ? true : false;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 102) {
          field_g = (String) null;
        }
    }

    static {
        field_g = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
