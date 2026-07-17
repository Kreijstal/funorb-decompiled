/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs {
    sna field_h;
    int field_b;
    boolean field_i;
    int field_m;
    int field_p;
    static eaa field_l;
    int field_j;
    String field_k;
    String field_g;
    String field_n;
    static saa field_f;
    int field_d;
    long field_a;
    static int[] field_c;
    int[] field_o;
    String field_e;

    public static void a() {
        field_c = null;
        field_f = null;
        field_l = null;
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            bl.a(param1, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gs.B(").append(120).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final int a(byte param0) {
        if (((gs) this).field_i) {
            return 2;
        }
        if (((gs) this).field_p == 2) {
            if (((gs) this).field_b > 0) {
                return 2;
            }
            if (!(~((gs) this).field_a != ~ge.field_F)) {
                return 1;
            }
            if (um.field_c == 2) {
                if (!gl.a(3, ((gs) this).field_g)) {
                    if (param0 < 117) {
                        ((gs) this).field_h = null;
                        return 0;
                    }
                    return 0;
                }
                return 1;
            }
            if (param0 < 117) {
                ((gs) this).field_h = null;
                return 0;
            }
            return 0;
        }
        if (!(~((gs) this).field_a != ~ge.field_F)) {
            return 1;
        }
        if (um.field_c == 2) {
            if (!gl.a(3, ((gs) this).field_g)) {
                if (param0 < 117) {
                    ((gs) this).field_h = null;
                    return 0;
                }
                return 0;
            }
            return 1;
        }
        if (param0 < 117) {
            ((gs) this).field_h = null;
            return 0;
        }
        return 0;
    }

    gs(boolean param0) {
        ((gs) this).field_m = ad.field_g;
        ((gs) this).field_i = gq.field_x;
        ((gs) this).field_e = gba.field_yb;
        ((gs) this).field_b = vv.field_d;
        ((gs) this).field_k = to.field_a;
        ((gs) this).field_d = laa.field_m;
        ((gs) this).field_g = qia.field_b;
        ((gs) this).field_n = qk.field_n;
        ((gs) this).field_p = wka.field_a;
        ((gs) this).field_j = bna.field_w;
        if (param0) {
            ((gs) this).field_o = hv.field_a;
        } else {
            ((gs) this).field_o = null;
        }
        ((gs) this).field_a = sr.field_a;
    }

    gs(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((gs) this).field_k = param3;
            ((gs) this).field_i = true;
            ((gs) this).field_e = param1;
            ((gs) this).field_b = 0;
            ((gs) this).field_a = 0L;
            ((gs) this).field_j = 0;
            ((gs) this).field_o = null;
            ((gs) this).field_d = param2;
            ((gs) this).field_n = param4;
            ((gs) this).field_m = 0;
            ((gs) this).field_g = param1;
            ((gs) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gs.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static pp a(boolean param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        o stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2_int = param1.e((byte) 113);
            stackOut_2_0 = new o(var2_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gs.A(").append(1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (pp) (Object) stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new eaa();
        field_c = new int[24];
    }
}
