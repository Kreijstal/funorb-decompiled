/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends q {
    rc[] field_u;
    int[] field_q;
    byte[][][] field_o;
    rc[] field_n;
    int field_l;
    static int[] field_s;
    static String field_p;
    static long field_r;
    static sm[] field_m;
    int[] field_k;
    int[] field_t;
    int field_j;

    final static void a(kh param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        short[] var11 = null;
        short[] var12 = null;
        mp var13 = null;
        byte[] var14 = null;
        short[] var15 = null;
        rm var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        short[] var22 = null;
        short[] var23 = null;
        byte[] var24 = null;
        short[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        short[] var31 = null;
        short[] var32 = null;
        byte[] var33 = null;
        short[] var34 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var16 = param0.field_l;
            if (param1 == -27226) {
              L1: {
                if (param2 + var16.field_g <= var16.field_o.length) {
                  break L1;
                } else {
                  var4 = var16.field_g;
                  var5 = 3 * (param2 + var4) / 2;
                  var26 = new int[var5];
                  var17 = var26;
                  var6 = var17;
                  var27 = new int[var5];
                  var18 = var27;
                  var7 = var18;
                  var28 = new int[var5];
                  var19 = var28;
                  var8 = var19;
                  var29 = new byte[var5];
                  var20 = var29;
                  var9 = var20;
                  var30 = new byte[var5];
                  var21 = var30;
                  var10 = var21;
                  var31 = new short[var5];
                  var22 = var31;
                  var11 = var22;
                  dk.a(var16.field_o, 0, var26, 0, var4);
                  var32 = new short[var5];
                  var23 = var32;
                  var12 = var23;
                  dk.a(var16.field_y, 0, var27, 0, var4);
                  dk.a(var16.field_q, 0, var28, 0, var4);
                  dk.a(var16.field_j, 0, var29, 0, var4);
                  dk.a(var16.field_D, 0, var30, 0, var4);
                  dk.a(var16.field_m, 0, var31, 0, var4);
                  dk.a(var16.field_A, 0, var32, 0, var4);
                  var16.field_q = var8;
                  var16.field_y = var7;
                  var16.field_m = var11;
                  var16.field_j = var9;
                  var16.field_D = var10;
                  var16.field_o = var6;
                  var16.field_A = var12;
                  var13 = param0.field_q;
                  if (var13.field_u == null) {
                    break L1;
                  } else {
                    var33 = new byte[var5];
                    var24 = var33;
                    var14 = var24;
                    var34 = new short[var5];
                    var25 = var34;
                    var15 = var25;
                    dk.a(var13.field_u, 0, var33, 0, var4);
                    dk.a(var13.field_q, 0, var34, 0, var4);
                    var13.field_u = var14;
                    var13.field_q = var15;
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("pm.B(");
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
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (param0 < 73) {
            return;
        }
        oh.a((byte) 84);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_p = null;
        field_s = null;
        field_m = null;
    }

    pm() {
    }

    static {
        field_p = "Please wait...";
        field_s = new int[8192];
    }
}
