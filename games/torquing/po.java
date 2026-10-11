/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends am {
    private int field_A;
    static int field_z;
    static String[] field_t;
    static int field_u;
    private int field_v;
    private int field_s;
    static volatile int field_w;
    static String field_y;
    static int[] field_x;

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fj var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 35) {
            var5 = (fj) null;
            this.a((fj) null, 56, 26);
          }
          var4_int = param2;
          if (var4_int != 0) {
            return;
          }
          this.b(4080, param0.e((byte) 62));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("po.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public po() {
        this(0);
    }

    private final void b(int param0, int param1) {
        this.field_A = (param1 & 255) << 4;
        this.field_v = (param1 & 16711680) >> 12;
        this.field_s = param1 >> 4 & param0;
    }

    public static void g(byte param0) {
        field_x = null;
        int var1 = 100 % ((49 - param0) / 48);
        field_y = null;
        field_t = null;
    }

    private po(int param0) {
        super(0, false);
        this.b(4080, param0);
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = Torquing.field_u;
        int[][] var9 = this.field_r.a(15142, param1);
        int[][] var3 = var9;
        if (param0 != -29116) {
          return (int[][]) null;
        }
        if (this.field_r.field_b) {
          var4 = var9[0];
          var5 = var9[1];
          var6 = var9[2];
          for (var7 = 0; ci.field_c > var7; var7++) {
            var4[var7] = this.field_v;
            var5[var7] = this.field_s;
            var6[var7] = this.field_A;
          }
          return var9;
        }
        return var9;
    }

    static {
        field_t = new String[3];
        field_u = -1;
        field_w = 0;
        field_z = -1;
        field_y = "Creating your account";
        field_x = new int[3];
    }
}
