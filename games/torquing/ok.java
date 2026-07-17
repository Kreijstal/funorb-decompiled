/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends lg {
    static int[] field_D;
    static int field_E;
    static int[] field_C;

    final static vn a(sm[] param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        byte[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        vn stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            if (param0.length == 256) {
              L1: {
                if (param1 == 256) {
                  break L1;
                } else {
                  var10 = null;
                  ok.a((fj) null, (java.math.BigInteger) null, (fj) null, (java.math.BigInteger) null, -16);
                  break L1;
                }
              }
              var27 = new int[256];
              var22 = var27;
              var17 = var22;
              var12 = var17;
              var11 = var12;
              var3_array = var11;
              var28 = new int[256];
              var23 = var28;
              var18 = var23;
              var13 = var18;
              var4 = var13;
              var29 = new int[256];
              var24 = var29;
              var19 = var24;
              var14 = var19;
              var5 = var14;
              var30 = new int[256];
              var25 = var30;
              var20 = var25;
              var15 = var20;
              var6 = var15;
              var31 = new byte[256][];
              var26 = var31;
              var21 = var26;
              var16 = var21;
              var7 = var16;
              var8 = 0;
              L2: while (true) {
                if (var8 >= 256) {
                  stackOut_8_0 = new vn(param2, var27, var28, var29, var30, var31);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  var11[var8] = param0[var8].field_a;
                  var4[var8] = param0[var8].field_g;
                  var5[var8] = param0[var8].field_c;
                  var6[var8] = param0[var8].field_d;
                  var7[var8] = param0[var8].field_l;
                  var8++;
                  continue L2;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ok.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_C = null;
        int var1 = -2 % ((-58 - param0) / 38);
        field_D = null;
    }

    private ok(String param0, el param1, ca param2) {
        super(param0, param1, param2);
        try {
            ((ok) this).field_q = ah.field_c.field_i;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ok.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        if (sn.field_i == 3) {
            de.field_c[4] = de.field_c[4] - 5;
        }
    }

    final static void a(fj param0, java.math.BigInteger param1, fj param2, java.math.BigInteger param3, int param4) {
        try {
            if (param4 != -4) {
                ok.a(-30);
            }
            op.a((byte) 20, param2, param3, param1, param0.field_n, param0.field_j, 0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ok.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    ok(String param0, ca param1, boolean param2) {
        this(param0, param1);
        try {
            ((ok) this).field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ok.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((ok) this).field_A = !((ok) this).field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private ok(String param0, ca param1) {
        this(param0, ah.field_c.field_k, param1);
        try {
            ((ok) this).field_q = ah.field_c.field_i;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ok.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 0;
        field_C = new int[]{157, 187, 393, 92, 10, 0, 388, 214, 388, 361, 413, 413};
        field_D = new int[8192];
    }
}
