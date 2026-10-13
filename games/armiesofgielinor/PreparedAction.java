/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PreparedAction extends IntrusiveNode {
    static int[] field_q;
    static int field_r;
    static ClientUiComponent field_o;
    int[] playerFlags;
    static String field_k;
    static String field_l;
    int actingPlayer;
    static RgbSprite field_p;

    final static void a(String[][] param0, String[] param1, int param2, int param3) {
        int var5 = 0;
        int[] array$1 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 != 2378077) {
            return;
          }
          var4_int = fd.field_n[0].length;
          for (var5 = 0; var5 < var4_int; var5++) {
            var6 = param0[var5].length;
            array$1 = new int[var6];
            BestScoreStrategy.unitAnimationVariants[param2][var5] = array$1;
            da.a(var5, 0, param0, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bd.J(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 28038) {
          return;
        }
        field_p = null;
        field_o = null;
        field_l = null;
        field_q = null;
    }

    final static void a(int param0, boolean param1, int param2, RgbSprite[] param3, int param4, int param5) {
        try {
          param3[0].drawWithOpacity(param2, param5, param0);
          param3[1].drawScaledWithOpacity(param2 + param3[1].pixelWidth, param5, param4 - (param3[2].pixelWidth << 1), param3[2].pixelHeight, param0);
          param3[2].drawWithOpacity(param4 + (param2 - param3[2].pixelWidth), param5, param0);
          if (!param1) {
            field_p = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "bd.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, ViewportManager param1) {
        int stackIn_4_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ActionSpell.viewportManager = param1;
          if (ActionSpell.viewportManager != null &&
            ActionSpell.viewportManager.resizeEnabled) {
            stackIn_4_0 = 1;
          } else {
            stackIn_4_0 = 0;
          }
          ds.a(stackIn_4_0, 115);
          if (param0 < 65) {
            field_r = -94;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("bd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    protected PreparedAction() {
    }

    abstract void applyToBattlefield(int obfuscationGuard, Battlefield battlefield);

    static {
        field_k = "End Game";
        field_l = "Searching for an opponent";
        field_q = new int[]{8421504, 4868682, 6117412, 10061107, 13676848, 6111780, 6109220, 7022375, 10510689, 10526049, 10911834, 8429665, 6398112, 6389920, 7823776, 10510752, 5070116, 3104036, 2383197, 2378077, 2832496, 4270960, 6433648, 6104138, 13833236, 13355829, 13201949, 7252004, 4700601, 3047635, 8210361, 12991150};
    }
}
