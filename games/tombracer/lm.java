/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends ci {
    private int field_n;
    private int field_q;
    static int[] field_r;
    static nh field_m;
    static String field_o;
    private int field_s;
    static jpa[] field_p;

    public lm() {
        this(0);
    }

    private lm(int param0) {
        super(0, false);
        this.a(param0, (byte) -55);
    }

    public static void c(int param0) {
        field_m = null;
        field_r = null;
        field_p = null;
        field_o = null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
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
              var4_int = param2;
              if (var4_int == 0) {
                this.a(param1.a(param0 ^ -32661), (byte) -55);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                var5 = null;
                ((lm) this).a((byte) -48, (uia) null, 9);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("lm.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    final int[][] b(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        int[][] var9 = ((lm) this).field_h.a(param0, (byte) 100);
        int[][] var3 = var9;
        if (!(!((lm) this).field_h.field_f)) {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            for (var7 = 0; var7 < ns.field_g; var7++) {
                var4[var7] = ((lm) this).field_n;
                var5[var7] = ((lm) this).field_q;
                var6[var7] = ((lm) this).field_s;
            }
        }
        if (param1 != -1) {
            this.a(84, (byte) -17);
        }
        return var3;
    }

    private final void a(int param0, byte param1) {
        ((lm) this).field_n = (param0 & 16711680) >> 12;
        if (param1 != -55) {
            Object var4 = null;
            ((lm) this).a((byte) 12, (uia) null, 20);
        }
        ((lm) this).field_s = 4080 & param0 << 4;
        ((lm) this).field_q = (65280 & param0) >> 4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Spectate <%0>'s game";
    }
}
