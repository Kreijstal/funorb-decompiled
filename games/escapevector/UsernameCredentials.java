/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UsernameCredentials extends LoginCredentials {
    private String password;
    private long encodedUsername;
    static byte[][][] field_h;
    static String[] field_g;

    final void writeTo(PacketBuffer buffer, byte guard) {
        buffer.writeLong(this.encodedUsername, (byte) -23);
        if (guard > -15) {
          return;
        }
        try {
          buffer.writeBase38Password(this.password, (byte) 111);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ld.G(" + (buffer != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard != -71) {
          Sprite[] var2 = (Sprite[]) null;
          UsernameCredentials.drawNineSlice(9, (Sprite[]) null, 60, -23, 39, -65);
        }
        field_h = (byte[][][]) null;
        field_g = null;
    }

    final static void drawNineSlice(int height, Sprite[] sprites, int guard, int y, int x, int width) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        String stackIn_71_2 = null;
        int var22 = EscapeVector.obfuscationControl;
        try {
          if (sprites == null) {
            return;
          }
          if (0 < width &&
            0 < height) {
            if (null != sprites[3]) {
              stackIn_9_0 = sprites[3].fullWidth;
            } else {
              stackIn_9_0 = 0;
            }
            int var6_int = stackIn_9_0;
            if (null == sprites[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = sprites[5].fullWidth;
            }
            int var7 = stackIn_12_0;
            if (sprites[1] != null) {
              stackIn_15_0 = sprites[1].fullHeight;
            } else {
              stackIn_15_0 = 0;
            }
            int var8 = stackIn_15_0;
            if (sprites[7] == null) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = sprites[7].fullHeight;
            }
            int var9 = stackIn_18_0;
            int var10 = width + x;
            int var11 = height + y;
            int var12 = var6_int + x;
            int var13 = var10 - var7;
            int var14 = var8 + y;
            int var15 = var11 - var9;
            int var16 = var12;
            int var17 = var13;
            if (var16 > var17) {
              var17 = width * var6_int / (var6_int + var7) + x;
              var16 = width * var6_int / (var6_int + var7) + x;
            }
            int var18 = var14;
            int var19 = var15;
            if (var19 < var18) {
              var19 = height * var8 / (var9 + var8) + y;
              var18 = height * var8 / (var9 + var8) + y;
            }
            SoftwareRasterizer.saveClip(NameAvailabilityValidator.field_o);
            if (null != sprites[0]) {
              SoftwareRasterizer.intersectClip(x, y, var16, var18);
              sprites[0].drawTransparent(x, y);
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (sprites[2] != null) {
              SoftwareRasterizer.intersectClip(var17, y, var10, var18);
              sprites[2].drawTransparent(var13, y);
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (sprites[6] != null) {
              SoftwareRasterizer.intersectClip(x, var19, var16, var11);
              sprites[6].drawTransparent(x, var15);
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (null != sprites[8]) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              sprites[8].drawTransparent(var13, var15);
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (null != sprites[1] &&
              0 != sprites[1].fullWidth) {
              SoftwareRasterizer.intersectClip(var16, y, var17, var18);
              for (int var20 = var12; var20 < var13; var20 = var20 + sprites[1].fullWidth) {
                sprites[1].drawTransparent(var20, y);
              }
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (null != sprites[7] &&
              sprites[7].fullWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (int var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + sprites[7].fullWidth) {
                sprites[7].drawTransparent(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (null != sprites[3] &&
              sprites[3].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(x, var18, var16, var19);
              for (int var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + sprites[3].fullHeight) {
                sprites[3].drawTransparent(x, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (sprites[5] != null &&
              sprites[5].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (int var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + sprites[5].fullHeight) {
                sprites[5].drawTransparent(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
            }
            if (sprites[guard] != null &&
              0 != sprites[4].fullWidth &&
              sprites[4].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (int var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + sprites[4].fullHeight) {
                for (int var21 = var12; var21 < var13; var21 = var21 + sprites[4].fullWidth) {
                  sprites[4].drawTransparent(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(NameAvailabilityValidator.field_o);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_70_0 = var6;
          StringBuilder stackIn_70_1 = new StringBuilder().append("ld.H(").append(height).append(',');
          if (sprites == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(guard).append(',').append(y).append(',').append(x).append(',').append(width).append(')').toString());
        }
    }

    final static void cacheCompletionHook(int value, byte guard) {
        if (guard != -6) {
          UsernameCredentials.cacheCompletionHook(-16, (byte) 28);
        }
    }

    final static PcmStreamMixer sharedPcmMixer(byte guard) {
        if (guard <= 104) {
          Sprite[] var2 = (Sprite[]) null;
          UsernameCredentials.drawNineSlice(-62, (Sprite[]) null, -58, -40, -5, -81);
        }
        return AccountSessionSupport.field_f;
    }

    UsernameCredentials(long param0, String param1) {
        try {
          this.encodedUsername = param0;
          this.password = param1;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ld.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoginCredentialType type(byte guard) {
        if (guard != 32) {
          return (LoginCredentialType) null;
        }
        return DisplayModeInfo.field_a;
    }

    final static int findSubmittedScoreRow(ScoreSubmission submission, int column, int startRow, HighscoreQuery highscores) {
        String stackIn_27_2 = null;
        String stackIn_30_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (highscores != null &&
            highscores.intColumns != null &&
            submission != null &&
            highscores.boardId == submission.boardId) {
            int var4_int = submission.field_q.length;
            int var5 = highscores.intColumns[column].length / var4_int;
            for (int var6 = startRow; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~highscores.longColumns[column][var6] == ~submission.field_l &&
                SeekerMine.a(highscores.stringColumns[column][var6], (byte) 120)) {
                for (int var7 = 0; var7 < var4_int; var7++) {
                  if (submission.field_q[var7] != highscores.intColumns[column][var7 + var4_int * var6]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  int stackIn_20_0 = var6;
                  return stackIn_20_0;
                }
              }
            }
            int stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          int stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var4;
          StringBuilder stackIn_26_1 = new StringBuilder().append("ld.I(");
          if (submission == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          StringBuilder stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(column).append(',').append(startRow).append(',');
          if (highscores == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_g = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
