/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends AnimatedPanel {
    static int[] field_yb;
    private AnimatedPanel field_xb;

    final static va g(int param0) {
        va var1 = new va();
        var1.field_k = false;
        var1.field_a = param0;
        var1.field_h = 1;
        var1.field_f = true;
        var1.field_c = 1;
        return var1;
    }

    public static void clearStatics(byte param0) {
        field_yb = null;
        int var1 = -29 / ((12 - param0) / 44);
    }

    final boolean c(boolean param0, int param1) {
        boolean stackIn_9_0 = false;
        this.a(true, -20429);
        if (param1 != -1) {
          return true;
        }
        stackIn_9_0 = ((je.field_d != 0 &&
          this.field_rb == 0) ||
          this.field_xb.field_rb != 0);
        return stackIn_9_0;
    }

    dg(AnimatedPanel param0, AnimatedPanel param1, AnimatedPanel param2, AnimatedPanel param3, AnimatedPanel param4, AnimatedPanel param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        AnimatedPanel var8 = null;
        AnimatedPanel var9 = null;
        int var10 = 0;
        int var11 = 0;
        AnimatedPanel var13 = null;
        AnimatedPanel var14 = null;
        int var15 = 0;
        AnimatedPanel var17 = null;
        int var10Lifetime1;
        try {
          var17 = new AnimatedPanel(0L, param1, MenuWindow.field_u.toUpperCase());
          var17.field_y = 1;
          this.field_xb = new AnimatedPanel(0L, param2);
          var8 = new AnimatedPanel(0L, param3);
          var9 = new AnimatedPanel(0L, param3, DiskCacheWorker.field_g);
          var9.field_y = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; var12 < CheckboxPainter.field_c.length; var12++) {
            var13 = new AnimatedPanel(0L, param3, LoginMethodPreference.field_d[var12]);
            var14 = new AnimatedPanel(0L, param3, CheckboxPainter.field_c[var12]);
            var15 = param3.field_nb.stringWidth(CheckboxPainter.field_c[var12]);
            var13.setTarget(65, 15, (byte) 69, var10, 20);
            if (var15 > var11) {
              var11 = var15;
            }
            var14.setTarget(640, 15, (byte) 122, var10, 90);
            var8.addChild(4, var13);
            var8.addChild(4, var14);
            var10 += 30;
          }
          var10 += 15;
          var17.setTarget(20 + var11 + 90, 24, (byte) 113, 0, 0);
          this.setTarget(var17.field_K, var10 + var17.field_mb, (byte) 83, 100, 100);
          this.field_xb.setTarget(15, 15, (byte) 126, 5, -20 + var17.field_K);
          var8.setTarget(this.field_K, -var17.field_mb + this.field_mb, (byte) 79, var17.field_mb, 0);
          var9.setTarget(this.field_K, 15, (byte) 75, 20, 0);
          var8.field_F = Wormhole.a(16, 3, var8.field_mb, 11579568, 8421504, 2105376);
          var17.addChild(4, this.field_xb);
          var8.addChild(4, var9);
          this.addChild(4, var17);
          this.addChild(4, var8);
          this.field_hb = 320 - (this.field_K >> 1);
          var10Lifetime1 = -(this.field_mb >> 1) + 240;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("dg.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_yb = new int[8192];
    }
}
