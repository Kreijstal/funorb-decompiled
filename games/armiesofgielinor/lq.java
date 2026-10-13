/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static int field_e;
    static boolean hasLastQuickChat;
    static int field_b;
    static gu field_c;
    static String field_a;
    static String field_f;

    final static AntialiasedBitmapFont a(byte[] param0, int param1) {
        AntialiasedBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        AntialiasedBitmapFont stackIn_5_0 = null;
        AntialiasedBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new AntialiasedBitmapFont(param0, j.decodedSpriteOffsetXs, CampaignMenuButton.decodedSpriteOffsetYs, qm.decodedSpriteWidths, c.decodedSpriteHeights, MovementPresentation.decodedSpritePalette, AnimationPlayer.decodedSpriteIndices);
          if (param1 != 0) {
            stackIn_5_0 = (AntialiasedBitmapFont) null;
            return stackIn_5_0;
          }
          rj.releaseSpriteDecodeBuffers((byte) 117);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("lq.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int integerPower(int base, int exponent, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 1;
          while (exponent > 1) {
            if (0 != (1 & exponent)) {
              var3_int = var3_int * base;
            }
            base = base * base;
            exponent = exponent >> 1;
          }
          if (obfuscationGuard != 21) {
            lq.integerPower(-54, -42, (byte) -105);
          }
          if (exponent != 1) {
            return var3_int;
          }
          stackIn_13_0 = var3_int * base;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "lq.B(" + base + ',' + exponent + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -31320) {
          return;
        }
        field_a = null;
        field_f = null;
        field_c = null;
    }

    static {
        hasLastQuickChat = false;
        field_e = -1;
        field_b = 0;
        field_c = new gu();
        field_f = "Build cannon - The troop of engineers will build a single, powerful cannon on the tile they're on.";
        field_a = "SPEED";
    }
}
