/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga implements Runnable {
    le field_a;
    volatile gd[] field_e;
    volatile boolean field_d;
    volatile boolean field_c;
    static ha[] field_b;

    final static void a(boolean param0, int param1) {
        sd.field_c.a(0, (byte) -124, 0);
        if (param1 < 35) {
            field_b = null;
        }
    }

    public static void b() {
        field_b = null;
    }

    final static oh a(int param0, wb[] param1, byte[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        oh stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Main.field_T;
        try {
          L0: {
            if (256 != param1.length) {
              throw new IllegalArgumentException();
            } else {
              var3_int = 0;
              var26 = new int[256];
              var21 = var26;
              var16 = var21;
              var11 = var16;
              var4 = var11;
              var27 = new int[256];
              var22 = var27;
              var17 = var22;
              var12 = var17;
              var5 = var12;
              var28 = new int[256];
              var23 = var28;
              var18 = var23;
              var13 = var18;
              var6 = var13;
              var29 = new int[256];
              var24 = var29;
              var19 = var24;
              var14 = var19;
              var7 = var14;
              var30 = new byte[256][];
              var25 = var30;
              var20 = var25;
              var15 = var20;
              var8 = var15;
              var9 = 0;
              L1: while (true) {
                if (256 <= var9) {
                  stackOut_7_0 = new oh(param2, var26, var27, var28, var29, var30);
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var4[var9] = param1[var9].field_h;
                  var5[var9] = param1[var9].field_c;
                  var6[var9] = param1[var9].field_g;
                  var7[var9] = param1[var9].field_b;
                  var8[var9] = param1[var9].field_i;
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ga.B(").append(121).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(boolean param0) {
        if (!param0) {
            field_b = null;
        }
        if (gj.field_a == null) {
            return;
        }
        bg.a((java.awt.Canvas) (Object) gj.field_a, (byte) -111);
        gj.field_a.a((byte) -81, jk.field_a);
        gj.field_a = null;
        if (!(null == wc.field_A)) {
            wc.field_A.a((byte) 10);
        }
        tb.field_c.requestFocus();
    }

    public final void run() {
        int var1_int = 0;
        gd var2 = null;
        int var4 = Main.field_T;
        ((ga) this).field_c = true;
        try {
            while (!((ga) this).field_d) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ga) this).field_e[var1_int];
                    if (var2 != null) {
                        var2.f();
                    }
                }
                wk.a((byte) -123, 10L);
                Main.a((Object) null, ((ga) this).field_a, (byte) 109);
            }
        } catch (Exception exception) {
            Object var5 = null;
            k.a((Throwable) (Object) exception, (byte) -96, (String) null);
        } finally {
            ((ga) this).field_c = false;
        }
    }

    ga() {
        ((ga) this).field_e = new gd[2];
        ((ga) this).field_d = false;
        ((ga) this).field_c = false;
    }

    static {
    }
}
