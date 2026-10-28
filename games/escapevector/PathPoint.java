/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PathPoint {
    int x;
    int y;
    static LoginMethod field_g;
    static String field_d;
    static int field_c;
    static java.awt.Frame field_f;
    static PacketBuffer field_a;
    static java.awt.Frame field_i;
    static String field_e;

    final static void drawPhotoTransition(int guard, int tick, int top, int centerX, Sprite photo, int centerY, int phase, int left) {
        String stackIn_47_2 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var19 = EscapeVector.obfuscationControl;
        try {
          if (phase > 0) {
            if (20 >= phase) {
              var8_int = 0;
              var9 = phase;
              if (var9 > 20) {
                var9 = 20;
              }
              if (var9 <= 10) {
                var8_int = 0;
              } else {
                var8_int = -10 + var9;
                var8_int = 224 * (var8_int * var8_int) / 100;
                var9 = 20 * var9 / (var8_int + 20);
              }
              var10 = var9 * var9;
              for (var11 = centerY - var9; centerY + var9 > var11; var11++) {
                var12 = centerX + (-var8_int + var11 * 640);
                var13 = (-centerY + var11) * (1 + (var11 - centerY));
                for (var14 = -var9; var14 < 0; var14++) {
                  int var15 = var13 + var14 * (1 + var14);
                  if (var15 < var10) {
                    int var16 = -(var15 * 255 / var10) + 255;
                    SoftwareRasterizer.pixels[var14 + var12] = var16 * 65793;
                  }
                }
                var14 = -(255 * var13 / var10) + 255;
                for (int var15Lifetime1 = -var8_int; var15Lifetime1 < var8_int; var15Lifetime1++) {
                  int incrementValue$0 = var12;
                  var12++;
                  SoftwareRasterizer.pixels[incrementValue$0] = var14 * 65793;
                }
                for (var14 = 0; var14 < var9; var14++) {
                  int var15Lifetime2 = var13 + var14 * (var14 + 1);
                  if (var15Lifetime2 < var10) {
                    int var16Lifetime1 = -(255 * var15Lifetime2 / var10) + 255;
                    SoftwareRasterizer.pixels[var14 + var12] = var16Lifetime1 * 65793;
                  }
                }
              }
            } else if (phase < 30) {
              var8_int = phase - 20;
              var8_int = photo.fullHeight / 2 * (var8_int * var8_int) / 100;
              if (0 < var8_int) {
                var9 = photo.fullHeight / 2 * 65536 / var8_int;
                var10 = var9 >> 1;
                for (var11 = 0; var11 < var8_int + var8_int; var11++) {
                  var12 = var10 >> 16;
                  var10 = var10 + var9;
                  if (var12 >= photo.offsetY &&
                    var12 < photo.offsetY + photo.height) {
                    var13 = photo.width * var12;
                    var14 = (var11 - var8_int + centerY) * 640 + left + photo.offsetX;
                    double var15_double = 8.0 * Math.sin((double)tick + (double)((tick & 7) + 8) * ((double)var12 * 0.001));
                    var15_double = var15_double + Math.sin((double)(tick + var12) * 0.002 * (double)((5 * tick & 31) + 16)) * 4.0;
                    var14 = var14 + (int)Math.floor(var15_double + 0.5);
                    for (int var17 = 0; photo.width > var17; var17++) {
                      int incrementValue$1 = var13;
                      var13++;
                      int var18 = photo.pixels[incrementValue$1];
                      int incrementValue$2 = var14;
                      var14++;
                      SoftwareRasterizer.pixels[incrementValue$2] = var18 - SpriteCheckboxPainter.bitwiseAnd(4144959, var18 >> 2);
                    }
                  }
                }
              }
            } else {
              photo.drawTransparent(left, top);
            }
          }
          if (guard != -1276284702) {
            field_a = (PacketBuffer) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_46_0 = var8;
          StringBuilder stackIn_46_1 = new StringBuilder().append("qj.D(").append(guard).append(',').append(tick).append(',').append(top).append(',').append(centerX).append(',');
          if (photo == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(centerY).append(',').append(phase).append(',').append(left).append(')').toString());
        }
    }

    final static void refreshScreenForAccountState(int guard) {
        regionExit1: {
          int var2 = EscapeVector.obfuscationControl;
          boolean var1 = (UiComponent.field_o.input.pointerDriven);
          if (!UiContainer.hasMembership((byte) -32) ||
            UiComponent.field_o.accountStateIndex == 2) {
            if (AccountSessionSupport.isGuestSession(-119)) {
              if (UiComponent.field_o.accountStateIndex == 0) {
                if (UiContainer.hasMembership((byte) -122)) {
                  break regionExit1;
                }
                if (AccountSessionSupport.isGuestSession(-126)) {
                  break regionExit1;
                }
                if (1 == UiComponent.field_o.accountStateIndex) {
                  break regionExit1;
                }
              }
              UiComponent.field_o = new GameModeSelectScreen((var1));
              break regionExit1;
            }
            if (!UiContainer.hasMembership((byte) -122) &&
              !AccountSessionSupport.isGuestSession(-126) &&
              1 != UiComponent.field_o.accountStateIndex) {
              UiComponent.field_o = new GameModeSelectScreen((var1));
            }
          } else {
            UiComponent.field_o = new GameModeSelectScreen((var1));
          }
        }
        if (guard != -883) {
          Sprite var3 = (Sprite) null;
          PathPoint.drawPhotoTransition(-40, 111, 116, 104, (Sprite) null, -68, -42, 107);
        }
    }

    final static int powerupScore(byte guard, int objectType, int gameMode) {
        if (guard != -38) {
          PathPoint.releaseStatics(69);
        }
        return DraggableWidget.a(gameMode, objectType, false, TerrainMaskSupport.field_d);
    }

    PathPoint(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public static void releaseStatics(int guard) {
        field_i = null;
        field_g = null;
        field_e = null;
        if (guard != -10497) {
          field_c = -87;
        }
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_g = new LoginMethod("");
        field_d = "Ship";
        field_c = 0;
        field_a = new PacketBuffer(256);
        field_e = " - shoot";
    }
}
