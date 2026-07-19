/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends dl implements ae {
    static wk[] field_S;
    static String field_W;
    static wk[] field_R;
    private String field_P;
    private oa[] field_bb;
    private int field_V;
    static boolean field_Q;
    private int[] field_U;
    static wk[] field_Y;
    private k field_X;
    static wk[] field_Z;
    static long[] field_T;
    private mi field_ab;

    public static void a(byte param0) {
        field_Z = null;
        field_Y = null;
        field_S = null;
        field_W = null;
        field_R = null;
        int var1 = 24 / ((77 - param0) / 37);
        field_T = null;
    }

    bm(k param0, mi param1, String param2) {
        super(0, 0, 288, 0, (qk) null);
        int var4_int = 0;
        this.field_V = 0;
        try {
            this.field_P = param2;
            this.field_ab = param1;
            this.field_X = param0;
            var4_int = null != this.field_P ? this.field_ab.a(this.field_P, 260, this.field_ab.field_G) : 0;
            this.a(0, (byte) -93, 0, 288, var4_int + 22);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -123, param2, param3);
        if (param1 > -99) {
            this.a(-109, (byte) 96, 110, -22);
        }
        int discarded$0 = this.field_ab.a(this.field_P, this.field_o + (param2 + 14), this.field_z + param0 + 10, this.field_x + -28, this.field_E, 16777215, -1, 0, 0, this.field_ab.field_G);
    }

    final static wk[] b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        wk[] var7 = new wk[9];
        wk[] var4 = var7;
        if (param1 != -2) {
            bm.a((byte) 112);
        }
        var7[0] = bd.a(param0, param2, 248);
        for (var5 = 1; (var5 ^ -1) > -10; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = bd.a(param3, 64, 248);
        return var4;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = SteelSentinels.field_G;
        try {
            for (var6_int = 0; this.field_V > var6_int; var6_int++) {
                if (!(param3 != this.field_bb[var6_int])) {
                    var7 = this.field_U[var6_int];
                    if (0 != (var7 ^ -1)) {
                        hc.a(this.field_U[var6_int], 0);
                        break;
                    }
                    this.field_X.m(112);
                    break;
                }
            }
            var6_int = -76 / ((-85 - param1) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "bm.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        if (!(this.field_V < param0)) {
            return;
        }
        if (param1 < 71) {
            field_T = (long[]) null;
        }
        oa[] var7 = new oa[param0];
        oa[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; this.field_V > var5; var5++) {
            var7[var5] = this.field_bb[var5];
            var4[var5] = this.field_U[var5];
        }
        this.field_bb = var3;
        this.field_U = var4;
        this.field_V = param0;
    }

    final oa a(int param0, tn param1, String param2) {
        oa var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        oa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new oa(param2, param1);
              if (param0 <= -101) {
                break L1;
              } else {
                this.a(3, (byte) -77);
                break L1;
              }
            }
            var4.field_p = (qk) ((Object) new kh());
            var5 = -2 + this.field_E;
            this.a(0, (byte) -85, 0, this.field_x, 34 + this.field_E);
            var4.a(7, (byte) -123, var5, this.field_x - 14, 30);
            this.a(var4, -83);
            stackOut_2_0 = (oa) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("bm.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_V;
            this.a(var4_int + 1, (byte) 108);
            this.field_bb[var4_int] = this.a(-102, (tn) (this), param1);
            if (param2 < 67) {
                this.field_bb = (oa[]) null;
            }
            this.field_U[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "bm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_W = "Enter name of player to add to list";
        field_Q = false;
        field_T = new long[32];
    }
}
