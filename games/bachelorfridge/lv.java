/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lv extends iha {
    private aj[] field_n;
    static int[] field_l;
    static Object[] field_m;
    private gj field_o;

    final boolean c(byte param0) {
        int var4 = 0;
        aj var5 = null;
        mw var6 = null;
        int var7 = BachelorFridge.field_y;
        qm.a(37, 7758);
        aj[] var8 = ((lv) this).field_n;
        aj[] var2 = var8;
        int var3 = -71 % ((param0 - 71) / 47);
        for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            var6 = new mw(((lv) this).field_o, var5.field_c, var5.field_a);
            ((kj) (Object) var6).a(0);
            ((lv) this).field_o.field_h.field_a[var5.field_c][var5.field_a].field_j = 2;
        }
        return true;
    }

    public static void d(byte param0) {
        field_l = null;
        field_m = null;
    }

    lv(gj param0, aj[] param1) {
        aj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        aj var5 = null;
        aga var6 = null;
        aj[] var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            ((lv) this).field_o = param0;
            ((lv) this).field_n = param1;
            var8 = ((lv) this).field_n;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var8.length) {
                break L0;
              } else {
                L2: {
                  var5 = var8[var4];
                  var6 = ((lv) this).field_o.field_h.field_a[var5.field_c][var5.field_a].field_l;
                  if (var6 == null) {
                    break L2;
                  } else {
                    boolean discarded$6 = var6.g(-76, 40);
                    ((lv) this).a(27799, (at) (Object) new ek(((lv) this).field_o, ((lv) this).field_o.b(var6, -23990), 40));
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("lv.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = vv.a((byte) 126);
        int[] var37 = field_l;
        int[] var25 = var37;
        int[] var13 = var25;
        int[] var1 = var13;
        int[] var0 = var1;
        var0[0] = mp.a(var37[0], 4);
        int[] var38 = field_l;
        int[] var26 = var38;
        int[] var14 = var26;
        int[] var2 = var14;
        var0 = var2;
        var0[0] = mp.a(var38[0], 4096);
        int[] var39 = field_l;
        int[] var27 = var39;
        int[] var15 = var27;
        int[] var3 = var15;
        var0 = var3;
        var0[0] = mp.a(var39[0], 8192);
        int[] var40 = field_l;
        int[] var28 = var40;
        int[] var16 = var28;
        int[] var4 = var16;
        var0 = var4;
        var0[0] = mp.a(var40[0], 16384);
        int[] var41 = field_l;
        int[] var29 = var41;
        int[] var17 = var29;
        int[] var5 = var17;
        var0 = var5;
        var0[0] = mp.a(var41[0], 131072);
        int[] var42 = field_l;
        int[] var30 = var42;
        int[] var18 = var30;
        int[] var6 = var18;
        var0 = var6;
        var0[0] = mp.a(var42[0], 262144);
        int[] var43 = field_l;
        int[] var31 = var43;
        int[] var19 = var31;
        int[] var7 = var19;
        var0 = var7;
        var0[1] = mp.a(var43[1], 8);
        int[] var44 = field_l;
        int[] var32 = var44;
        int[] var20 = var32;
        int[] var8 = var20;
        var0 = var8;
        var0[1] = mp.a(var44[1], 512);
        int[] var45 = field_l;
        int[] var33 = var45;
        int[] var21 = var33;
        int[] var9 = var21;
        var0 = var9;
        var0[1] = mp.a(var45[1], 2048);
        int[] var46 = field_l;
        int[] var34 = var46;
        int[] var22 = var34;
        int[] var10 = var22;
        var0 = var10;
        var0[1] = mp.a(var46[1], 4096);
        int[] var47 = field_l;
        int[] var35 = var47;
        int[] var23 = var35;
        int[] var11 = var23;
        var0 = var11;
        var0[1] = mp.a(var47[1], 8192);
        int[] var48 = field_l;
        int[] var36 = var48;
        int[] var24 = var36;
        int[] var12 = var24;
        var0 = var12;
        var0[1] = mp.a(var48[1], 65536);
        field_m = new Object[1];
    }
}
