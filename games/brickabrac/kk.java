/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static int[] bitMasks;
    static String field_a;
    static UiComponent field_b;
    static int[] field_e;
    static String field_c;
    static String field_d;
    static String field_f;

    final static IndexedSprite[] buildIndexedSprites(byte obfuscationGuard) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        IndexedSprite[] var1 = new IndexedSprite[nl.decodedSpriteCount];
        for (var2 = 0; nl.decodedSpriteCount > var2; var2++) {
          var1[var2] = new IndexedSprite(cf.decodedCanvasWidth, ek.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[var2], dl.decodedSpriteOffsetY[var2], jh.decodedSpriteWidths[var2], TextHotspotRegion.decodedSpriteHeights[var2], cn.decodedSpriteIndices[var2], qp.decodedSpritePalette);
        }
        if (obfuscationGuard == -2) {
          MotionWaypoint.clearDecodedSpriteData((byte) 96);
          return var1;
        }
        kk.a(-77);
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var1;
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
          return;
        }
        field_e = null;
        bitMasks = null;
    }

    final static void setMessageText(boolean obfuscationGuard, String text) {
        try {
          if (!obfuscationGuard) {
            field_a = (String) null;
          }
          qn.messageText = text;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kk.A(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] createIndexOrder(boolean obfuscationGuard, int count, IsaacGenerator random) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var6 = new int[count];
          var3 = var6;
          for (var4 = 0; count > var4; var4++) {
            var6[var4] = var4;
          }
          if (random == null) {
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (obfuscationGuard) {
            field_e = (int[]) null;
          }
          AppletGameShell.shuffleFivePasses(var3, (byte) 39, random);
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("kk.C(").append(obfuscationGuard).append(',').append(count).append(',');
          if (random == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        bitMasks = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_e = new int[12];
        field_d = "Accept invitation to <%0>'s game";
        field_c = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_a = "Rematch";
        field_f = "Year";
    }
}
