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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                var5 = (fj) null;
                this.a((fj) null, 56, 26);
                break L1;
              }
            }
            var4_int = param2;
            if (var4_int == 0) {
              this.b(4080, param0.e((byte) 62));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("po.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public po() {
        this(0);
    }

    private final void b(int param0, int param1) {
        this.field_A = (param1 & 255) << 786159204;
        this.field_v = (param1 & 16711680) >> 324326572;
        this.field_s = param1 >> -1775937404 & param0;
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
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[][] var9 = null;
        var8 = Torquing.field_u;
        var9 = this.field_r.a(15142, param1);
        var3 = var9;
        if (param0 == -29116) {
          if (!this.field_r.field_b) {
            return var9;
          } else {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            var7 = 0;
            L0: while (true) {
              if (ci.field_c <= var7) {
                return var9;
              } else {
                var4[var7] = this.field_v;
                var5[var7] = this.field_s;
                var6[var7] = this.field_A;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return (int[][]) null;
        }
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
