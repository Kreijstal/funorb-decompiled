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
        aj[] var8 = this.field_n;
        aj[] var2 = var8;
        int var3 = -71 % ((param0 - 71) / 47);
        for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            var6 = new mw(this.field_o, var5.field_c, var5.field_a);
            ((kj) ((Object) var6)).a(0);
            this.field_o.field_h.field_a[var5.field_c][var5.field_a].field_j = 2;
        }
        return true;
    }

    public static void d(byte param0) {
        if (param0 != -47) {
            field_l = (int[]) null;
        }
        field_l = null;
        field_m = null;
    }

    lv(gj param0, aj[] param1) {
        aj[] var3 = null;
        int var4 = 0;
        aj var5 = null;
        aga var6 = null;
        aj[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            this.field_o = param0;
            this.field_n = param1;
            var8 = this.field_n;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var8.length) {
                break L0;
              } else {
                L2: {
                  var5 = var8[var4];
                  var6 = this.field_o.field_h.field_a[var5.field_c][var5.field_a].field_l;
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.g(-76, 40);
                    this.a(27799, new ek(this.field_o, this.field_o.b(var6, -23990), 40));
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
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("lv.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_l = vv.a((byte) 126);
        int[] var13 = field_l;
        int[] var1 = var13;
        int[] var0 = var1;
        var0[0] = mp.a(var13[0], 4);
        int[] var14 = field_l;
        int[] var2 = var14;
        var0 = var2;
        var0[0] = mp.a(var14[0], 4096);
        int[] var15 = field_l;
        int[] var3 = var15;
        var0 = var3;
        var0[0] = mp.a(var15[0], 8192);
        int[] var16 = field_l;
        int[] var4 = var16;
        var0 = var4;
        var0[0] = mp.a(var16[0], 16384);
        int[] var17 = field_l;
        int[] var5 = var17;
        var0 = var5;
        var0[0] = mp.a(var17[0], 131072);
        int[] var18 = field_l;
        int[] var6 = var18;
        var0 = var6;
        var0[0] = mp.a(var18[0], 262144);
        int[] var19 = field_l;
        int[] var7 = var19;
        var0 = var7;
        var0[1] = mp.a(var19[1], 8);
        int[] var20 = field_l;
        int[] var8 = var20;
        var0 = var8;
        var0[1] = mp.a(var20[1], 512);
        int[] var21 = field_l;
        int[] var9 = var21;
        var0 = var9;
        var0[1] = mp.a(var21[1], 2048);
        int[] var22 = field_l;
        int[] var10 = var22;
        var0 = var10;
        var0[1] = mp.a(var22[1], 4096);
        int[] var23 = field_l;
        int[] var11 = var23;
        var0 = var11;
        var0[1] = mp.a(var23[1], 8192);
        int[] var24 = field_l;
        int[] var12 = var24;
        var0 = var12;
        var0[1] = mp.a(var24[1], 65536);
        field_m = new Object[1];
    }
}
