/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasRenderSupport {
    static HighscoresScreen field_a;
    static DisplayNameForm field_b;
    static String field_c;

    final static void attachCanvasInput(java.awt.Canvas canvas, boolean includeMouse) {
        PointCloudEffect.attachKeyboardInput((byte) -38, (java.awt.Component) ((Object) canvas));
        if (!includeMouse) {
          return;
        }
        try {
          DualLinkDequeIterator.attachMouseInput((java.awt.Component) ((Object) canvas), (byte) 38);
          if (ArchiveFactorySupport.field_b != null) {
            ArchiveFactorySupport.field_b.attach((java.awt.Component) ((Object) canvas), true);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "rc.A(" + (canvas != null ? "{...}" : "null") + ',' + includeMouse + ')');
        }
    }

    final static void fillTriangle(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var9 = EscapeVector.obfuscationControl;
        if (param4) {
          if (param7 > param5) {
            if (param2 > param7) {
              LinkButtonPainter.fillSortedHalfBlendTriangle(param6, param7, param5, param1, param0, 41, param3, param2, SoftwareRasterizer.pixels);
              return;
            }
            if (param5 < param2) {
              LinkButtonPainter.fillSortedHalfBlendTriangle(param0, param2, param5, param1, param6, 38, param3, param7, SoftwareRasterizer.pixels);
              return;
            }
            LinkButtonPainter.fillSortedHalfBlendTriangle(param1, param5, param2, param0, param6, 127, param3, param7, SoftwareRasterizer.pixels);
            return;
          }
          if (param5 < param2) {
            LinkButtonPainter.fillSortedHalfBlendTriangle(param1, param5, param7, param6, param0, 42, param3, param2, SoftwareRasterizer.pixels);
            return;
          }
          if (param2 <= param7) {
            LinkButtonPainter.fillSortedHalfBlendTriangle(param6, param7, param2, param0, param1, 66, param3, param5, SoftwareRasterizer.pixels);
            return;
          }
          LinkButtonPainter.fillSortedHalfBlendTriangle(param0, param2, param7, param6, param1, 120, param3, param5, SoftwareRasterizer.pixels);
          return;
        }
        CanvasRenderSupport.releaseStatics(-25);
        if (param7 > param5) {
          if (param2 > param7) {
            LinkButtonPainter.fillSortedHalfBlendTriangle(param6, param7, param5, param1, param0, 41, param3, param2, SoftwareRasterizer.pixels);
            return;
          }
          if (param5 < param2) {
            LinkButtonPainter.fillSortedHalfBlendTriangle(param0, param2, param5, param1, param6, 38, param3, param7, SoftwareRasterizer.pixels);
            return;
          }
          LinkButtonPainter.fillSortedHalfBlendTriangle(param1, param5, param2, param0, param6, 127, param3, param7, SoftwareRasterizer.pixels);
          return;
        }
        if (param5 < param2) {
          LinkButtonPainter.fillSortedHalfBlendTriangle(param1, param5, param7, param6, param0, 42, param3, param2, SoftwareRasterizer.pixels);
          return;
        }
        if (param2 <= param7) {
          LinkButtonPainter.fillSortedHalfBlendTriangle(param6, param7, param2, param0, param1, 66, param3, param5, SoftwareRasterizer.pixels);
          return;
        }
        LinkButtonPainter.fillSortedHalfBlendTriangle(param0, param2, param7, param6, param1, 120, param3, param5, SoftwareRasterizer.pixels);
    }

    public static void releaseStatics(int guard) {
        if (guard == -49153) {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (DisplayNameForm) null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static SpriteOffset selectQuarterTurnOffset(int angle, byte guard, SpriteOffset first, SpriteOffset second) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          int var4_int = second.x;
          int var5 = second.y;
          if (angle == 16384) {
            var5 = first.x;
            var4_int = second.y;
          }
          if (angle == 32768) {
            var4_int = first.x;
            var5 = first.y;
          }
          if (angle == 49152) {
            var5 = second.x;
            var4_int = first.y;
          }
          if (guard <= 119) {
            field_b = (DisplayNameForm) null;
          }
          SpriteOffset stackIn_12_0 = new SpriteOffset(var4_int, var5);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("rc.B(").append(angle).append(',').append(guard).append(',');
          if (first == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (second == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_c = "Out of shield!";
    }
}
