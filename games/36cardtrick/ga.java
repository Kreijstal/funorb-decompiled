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
            field_b = (ha[]) null;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
            byte[] var2 = (byte[]) null;
            ga.a(-5, (wb[]) null, (byte[]) null);
        }
    }

    final static oh a(int param0, wb[] param1, byte[] param2) {
        oh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var10 = Main.field_T;
        try {
          L0: {
            if (256 != param1.length) {
              throw new IllegalArgumentException();
            } else {
              var3_int = 81 % ((56 - param0) / 43);
              var16 = new int[256];
              var11 = var16;
              var4 = var11;
              var17 = new int[256];
              var12 = var17;
              var5 = var12;
              var18 = new int[256];
              var13 = var18;
              var6 = var13;
              var19 = new int[256];
              var14 = var19;
              var7 = var14;
              var20 = new byte[256][];
              var15 = var20;
              var8 = var15;
              var9 = 0;
              L1: while (true) {
                if (256 <= var9) {
                  stackIn_8_0 = new oh(param2, var16, var17, var18, var19, var20);
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
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ga.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(boolean param0) {
        if (!param0) {
            field_b = (ha[]) null;
        }
        if (gj.field_a == null) {
            return;
        }
        bg.a(gj.field_a, (byte) -111);
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
        this.field_c = true;
        try {
            while (!this.field_d) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_e[var1_int];
                    if (var2 != null) {
                        var2.f();
                    }
                }
                wk.a((byte) -123, 10L);
                Main.a((Object) null, this.field_a, (byte) 109);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            k.a((Throwable) ((Object) exception), (byte) -96, (String) null);
        } finally {
            this.field_c = false;
        }
    }

    ga() {
        this.field_e = new gd[2];
        this.field_d = false;
        this.field_c = false;
    }

    static {
    }
}
