/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends am {
    static int[] field_v;
    static vh field_t;
    static double field_s;
    static int[] field_w;
    private int field_u;

    final int[] a(byte param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0 > 86) {
          var4 = this.field_l.a(param1, 25657);
          var3 = var4;
          if (this.field_l.field_b) {
            dk.a(var4, 0, ci.field_c, this.field_u);
          }
          return var4;
        }
        this.a((byte) 80, 91);
        var4Lifetime1 = this.field_l.a(param1, 25657);
        var3Lifetime1 = var4Lifetime1;
        if (this.field_l.field_b) {
          dk.a(var4Lifetime1, 0, ci.field_c, this.field_u);
        }
        return var4Lifetime1;
    }

    final static int[] a(int param0, int[] param1, int param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 32681) {
            stackIn_2_0 = (int[]) null;
            return stackIn_2_0;
          }
          var4 = new int[param2];
          var3 = var4;
          dk.a(param1, 0, var4, 0, param2);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("u.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.field_u = (param0.i((byte) -101) << 12) / 255;
          }
          if (param1 == 35) {
            return;
          }
          this.a((byte) -38, 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("u.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public u() {
        this(4096);
    }

    private u(int param0) {
        super(0, true);
        this.field_u = 4096;
        this.field_u = param0;
    }

    public static void g(byte param0) {
        if (param0 <= -41) {
          field_v = null;
          field_t = null;
          field_w = null;
          return;
        }
        field_w = (int[]) null;
        field_v = null;
        field_t = null;
        field_w = null;
    }

    static {
        field_v = new int[1024];
        field_s = 0.0;
        field_w = new int[8192];
    }
}
