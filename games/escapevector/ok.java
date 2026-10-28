/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static int field_a;
    static byte[][] field_d;
    static int field_c;
    static boolean[] field_b;

    final static void a(int param0, int param1, int param2) {
        int var7;
        int var7Lifetime1;
        int var8 = EscapeVector.obfuscationControl;
        if (0 > SocketConnector.field_d) {
          return;
        }
        int var3 = -135 + param1;
        int var4 = -35 + param0;
        int var5 = 256;
        if (SocketConnector.field_d < 75) {
          var5 = (SocketConnector.field_d << 8) / 75;
        }
        if (SocketConnector.field_d > 200) {
          var5 = (-SocketConnector.field_d + 250 << 8) / 50;
        }
        if (param2 != 20) {
          field_c = -87;
          TickClock.pushSpriteRaster(LaserGateSpan.field_l, (byte) -107);
          MeshRasterState.useRasterClip();
          SoftwareRasterizer.clearFramebuffer();
          IndexedSpriteState.a(-111);
          if (var5 < 256) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 256 - var5);
          }
          RasterRestoreSupport.popRasterState((byte) 116);
          if (SocketConnector.field_d >= 150) {
            cb.field_a.drawAlpha(15 + var3, var4 + 10, var5);
          } else {
            LaserGateSpan.field_l.drawHalfSize(var3, var4);
          }
        } else {
          TickClock.pushSpriteRaster(LaserGateSpan.field_l, (byte) -107);
          MeshRasterState.useRasterClip();
          SoftwareRasterizer.clearFramebuffer();
          IndexedSpriteState.a(-111);
          if (var5 < 256) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 256 - var5);
          }
          RasterRestoreSupport.popRasterState((byte) 116);
          if (SocketConnector.field_d >= 150) {
            cb.field_a.drawAlpha(15 + var3, var4 + 10, var5);
            int var6 = -125 + SocketConnector.field_d;
            if (var6 <= 0) {
              var6 = SocketConnector.field_d - 140;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                Js5NetworkRequest.field_G.drawAlpha(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
            } else if (var6 >= 50) {
              var6 = SocketConnector.field_d - 140;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                Js5NetworkRequest.field_G.drawAlpha(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
            } else if (var6 < 20) {
              var7 = var6 * 256 / 20;
              SlidingSpriteTransition.field_d.drawAdditive(var3, var4, var7);
              var6 = SocketConnector.field_d - 140;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                Js5NetworkRequest.field_G.drawAlpha(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
            } else if (30 > var6) {
              SlidingSpriteTransition.field_d.drawAdditive(var3, var4, 256);
              var6 = SocketConnector.field_d - 140;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                Js5NetworkRequest.field_G.drawAlpha(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
            } else {
              var7 = 256 * (50 - var6) / 20;
              SlidingSpriteTransition.field_d.drawAdditive(var3, var4, var7);
              var6 = SocketConnector.field_d - 140;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                Js5NetworkRequest.field_G.drawAlpha(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
            }
            return;
          }
          LaserGateSpan.field_l.drawHalfSize(var3, var4);
        }
        int var6Lifetime1 = -125 + SocketConnector.field_d;
        if (var6Lifetime1 > 0 &&
          var6Lifetime1 < 50) {
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
            SlidingSpriteTransition.field_d.drawAdditive(var3, var4, var7Lifetime1);
          } else if (30 > var6Lifetime1) {
            SlidingSpriteTransition.field_d.drawAdditive(var3, var4, 256);
          } else {
            var7Lifetime1 = 256 * (50 - var6Lifetime1) / 20;
            SlidingSpriteTransition.field_d.drawAdditive(var3, var4, var7Lifetime1);
          }
        }
        int var6Lifetime2 = SocketConnector.field_d - 140;
        if (0 < var6Lifetime2) {
          int var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = 256 * var6Lifetime2 / 20;
          }
          Js5NetworkRequest.field_G.drawAlpha(15 + var3, 10 + var4, var5 * var7Lifetime2 >> 8);
        }
        return;
    }

    final static String a(int param0, CharSequence param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 != 0) {
            field_d = (byte[][]) null;
          }
          String stackIn_3_0 = ResourceArchive.accountNameValidationMessage(true, false, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ok.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean guard) {
        field_d = (byte[][]) null;
        field_b = null;
        if (!guard) {
          field_c = 85;
        }
    }

    static {
        field_d = new byte[250][];
        field_c = 64;
        field_b = new boolean[]{true, true, true, true};
    }
}
