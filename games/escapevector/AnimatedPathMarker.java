/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimatedPathMarker {
    private int textColor;
    private int[] outlineColors;
    PathPoint markerPosition;
    private PathPoint[] waypoints;
    static byte[][] spriteIndices;
    int markerIndex;
    private int[] fillColors;
    private int textShadowColor;
    int startTick;
    private int radius;

    private final void updatePathSound(boolean finished, byte guard) {
        int var5 = 0;
        PcmSampleStream[] var8 = ValidatedTextWidget.field_K;
        PcmSampleStream[] var3 = var8;
        if (0 > this.markerIndex ||
          var8.length <= this.markerIndex) {
          return;
        }
        if (guard >= -20) {
          return;
        }
        PcmSampleStream var4 = var8[this.markerIndex];
        if (var4 == null) {
          return;
        }
        if (finished) {
          var5 = 256;
          var4.fadeOut(var5);
          var8[this.markerIndex] = null;
        } else {
          var5 = 256;
          int var6 = IterableNodeHashTable.field_c * 6144 / 64;
          int var7 = 16384 * this.markerPosition.x / 640;
          var4.rampVolumeAndPanQ6(var5, var6, var7);
        }
    }

    private final int segmentTicks(PathPoint left, PathPoint right, byte guard) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          double var4_double = this.distance(84, left, right);
          int var6 = 99 % ((guard + 53) / 62);
          int var7 = (int)(var4_double * 0.2 + 0.5);
          int stackIn_1_0 = var7;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4;
          StringBuilder stackIn_4_1 = new StringBuilder().append("qe.F(");
          if (left == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (right == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void loadWaypoints(int[] coordinates, byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        int var3_int = coordinates.length / 2;
        this.waypoints = new PathPoint[var3_int];
        for (int var4 = 0; var4 < var3_int; var4++) {
          int var5 = coordinates[var4 * 2];
          int var6 = coordinates[var4 * 2 + 1];
          this.waypoints[var4] = new PathPoint(var5, var6);
        }
        if (guard <= 15) {
          return;
        }
        try {
          this.markerPosition = this.waypoints[0];
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "qe.M(" + (coordinates != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void drawThreeSliceTinted(int guard, int y, int width, Sprite[] sprites, int tint, int x) {
        int var12 = EscapeVector.obfuscationControl;
        if (sprites == null ||
          width <= 0) {
          return;
        }
        try {
          int var6_int = sprites[0].fullWidth;
          int var7 = sprites[2].fullWidth;
          int var8 = sprites[1].fullWidth;
          sprites[0].drawShadedTint(x, y, tint);
          sprites[2].drawShadedTint(-var7 + (width + x), y, tint);
          SoftwareRasterizer.saveClip(sf.field_m);
          SoftwareRasterizer.intersectClip(var6_int + x, y, -var7 + width + x, sprites[1].fullHeight + y);
          int var9 = x + var6_int;
          int var10 = x + (width - var7);
          x = var9;
          int var11 = -59 / ((11 - guard) / 32);
          while (x < var10) {
            sprites[1].drawShadedTint(x, y, tint);
            x = x + var8;
          }
          SoftwareRasterizer.restoreClip(sf.field_m);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "qe.A(" + guard + ',' + y + ',' + width + ',' + (sprites != null ? "{...}" : "null") + ',' + tint + ',' + x + ')');
        }
    }

    private final void drawMarker(int style, byte guard) {
        int var3 = this.fillColors[style];
        SoftwareRasterizer.fillCircle(this.markerPosition.x, this.markerPosition.y, this.radius, var3);
        var3 = this.outlineColors[style];
        SoftwareRasterizer.drawCircle(this.markerPosition.x, this.markerPosition.y, this.radius, var3);
        if (guard != -92) {
          this.outlineColors = (int[]) null;
        }
        String var4 = Integer.toString(this.markerIndex + 1);
        ByteStorage.gameFont.drawCentered(var4, 1 + (this.markerPosition.x - 1), -2 + this.markerPosition.y + this.radius, this.textShadowColor, -1);
        ByteStorage.gameFont.drawCentered(var4, 1 + this.markerPosition.x + 1, -2 + (this.markerPosition.y + this.radius), this.textShadowColor, -1);
        ByteStorage.gameFont.drawCentered(var4, this.markerPosition.x + 1, -1 + this.radius + (this.markerPosition.y - 2), this.textShadowColor, -1);
        ByteStorage.gameFont.drawCentered(var4, 1 + this.markerPosition.x, -1 + (this.radius + this.markerPosition.y), this.textShadowColor, -1);
        ByteStorage.gameFont.drawCentered(var4, 1 + this.markerPosition.x, -2 + (this.radius + this.markerPosition.y), this.textColor, -1);
    }

    private final int drawPathPrefix(boolean guard, int style, int elapsedTicks) {
        int var10 = EscapeVector.obfuscationControl;
        int var4 = this.waypoints.length;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        if (!guard) {
          this.radius = 83;
        }
        int var8 = this.fillColors[style];
        while (0 < elapsedTicks) {
          if (var4 > (1 + var5)) {
            PathPoint var12 = this.waypoints[var5 + 1];
            PathPoint var11 = this.waypoints[var5];
            int var9 = this.segmentTicks(var11, var12, (byte) -128);
            PathPoint var13 = this.interpolatePoint(var12, true, elapsedTicks, var11, var9);
            elapsedTicks = elapsedTicks - var9;
            SoftwareRasterizer.drawLine(var11.x, var11.y, var13.x, var13.y, var8);
            if (elapsedTicks > 0) {
              var5++;
              continue;
            }
          }
          break;
        }
        boolean stackIn_13_0 = (elapsedTicks > 0);
        boolean var9Lifetime1 = stackIn_13_0;
        if (var9Lifetime1) {
          PathPoint var14 = this.waypoints[var4 - 1];
          SoftwareRasterizer.fillRectangle(-1 + var14.x, -1 + var14.y, 3, 3, var8);
        }
        this.updatePathSound((var9Lifetime1), (byte) -66);
        return elapsedTicks;
    }

    private final PathPoint interpolatePoint(PathPoint end, boolean guard, int elapsedTicks, PathPoint start, int durationTicks) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (durationTicks > elapsedTicks) {
            bn.field_a.y = elapsedTicks * (-start.y + end.y) / durationTicks + start.y;
            bn.field_a.x = elapsedTicks * (-start.x + end.x) / durationTicks + start.x;
          } else {
            bn.field_a.x = end.x;
            bn.field_a.y = end.y;
          }
          if (!guard) {
            PathPoint var7 = (PathPoint) null;
          }
          PathPoint stackIn_6_0 = bn.field_a;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6;
          StringBuilder stackIn_9_1 = new StringBuilder().append("qe.H(");
          if (end == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(elapsedTicks).append(',');
          if (start == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(durationTicks).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          spriteIndices = (byte[][]) null;
        }
        spriteIndices = (byte[][]) null;
    }

    final static int appendInts(int[] destination, int offset, boolean guard, int[] source) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          if (!guard) {
            Sprite[] var5 = (Sprite[]) null;
            AnimatedPathMarker.drawThreeSliceTinted(107, 78, 55, (Sprite[]) null, 95, 113);
          }
          ArraySupport.copy(source, 0, destination, offset, source.length);
          offset = offset + source.length;
          int stackIn_3_0 = offset;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qe.B(");
          if (destination == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(offset).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void draw(boolean alternateStyle, int guard) {
        int var3 = !alternateStyle ? kh.field_b : Checkbox.field_E;
        int var4 = mj.field_d;
        if (this.startTick > var4) {
          return;
        }
        if (guard != -1) {
          this.markerIndex = 26;
        }
        var4 = -this.startTick + var4;
        var4 = this.drawPathPrefix(true, var3, var4);
        this.drawMarker(var3, (byte) -92);
    }

    final static int commonUiLoadProgress(int guard) {
        if (AccountNoticeKind.frameworkLoadingStage < 2) {
          return 0;
        }
        if (QuickChatPhraseCache.field_h != 0) {
          if (null != PasswordValidator.field_p) {
            if (!PasswordValidator.field_p.ensureIndex(0)) {
              return 14;
            }
            if (!PasswordValidator.field_p.hasGroupName("", (byte) -111)) {
              return 29;
            }
            if (!PasswordValidator.field_p.tryLoadNamedGroup(0, "")) {
              return 29;
            }
          }
          if (!ii.field_a.ensureIndex(0)) {
            return 43;
          }
          if (!ii.field_a.tryLoadNamedGroup(0, "commonui")) {
            return 57;
          }
          if (!LoadingProgressDialog.field_ab.ensureIndex(0)) {
            return 71;
          }
          if (!LoadingProgressDialog.field_ab.tryLoadNamedGroup(0, "commonui")) {
            return 80;
          }
          if (!AlternateUsernameCredentials.field_j.ensureIndex(0)) {
            return 82;
          }
          if (!AlternateUsernameCredentials.field_j.tryLoadAllGroups((byte) -119)) {
            return 86;
          }
        } else {
          if (!ii.field_a.ensureIndex(0)) {
            return 20;
          }
          if (!ii.field_a.tryLoadNamedGroup(0, "commonui")) {
            return 40;
          }
          if (!LoadingProgressDialog.field_ab.ensureIndex(0)) {
            return 50;
          }
          if (!LoadingProgressDialog.field_ab.tryLoadNamedGroup(0, "commonui")) {
            return 60;
          }
          if (!AlternateUsernameCredentials.field_j.ensureIndex(0)) {
            return 70;
          }
          if (!AlternateUsernameCredentials.field_j.tryLoadAllGroups((byte) -119)) {
            return 80;
          }
        }
        if (guard < -8) {
          return 100;
        }
        return -98;
    }

    final boolean hitMarker(int y, int x, int padding) {
        int var4 = -this.markerPosition.x + x;
        int var5 = -this.markerPosition.y + y;
        int var6 = var4 * var4 + var5 * var5;
        int var7 = (padding + this.radius) * this.radius;
        boolean var8 = (var6 <= var7);
        return (var8);
    }

    private final double distance(int guard, PathPoint left, PathPoint right) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          if (guard <= 75) {
            double stackIn_2_0 = 0.7839713364957465;
            return stackIn_2_0;
          }
          int var4_int = right.x - left.x;
          int var5 = -left.y + right.y;
          int var6 = var4_int * var4_int + var5 * var5;
          double stackIn_4_0 = Math.sqrt((double)var6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("qe.J(").append(guard).append(',');
          if (left == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (right == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void showAccountChoice(boolean guard) {
        if (!guard) {
          spriteIndices = (byte[][]) null;
        }
        rd.field_c.transitionToContent(new AccountChoicePanel(), 30);
    }

    AnimatedPathMarker(int markerIndex, int[] coordinates, int radius, int[] fillColors, int[] outlineColors, int textColor, int textShadowColor, BinaryBitmapFont unusedFont) {
        try {
          this.markerIndex = markerIndex;
          this.loadWaypoints(coordinates, (byte) 121);
          this.startTick = 5 * (this.markerIndex + 1);
          this.outlineColors = outlineColors;
          this.radius = radius;
          this.textColor = textColor;
          this.textShadowColor = textShadowColor;
          this.fillColors = fillColors;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "qe.<init>(" + markerIndex + ',' + (coordinates != null ? "{...}" : "null") + ',' + radius + ',' + (fillColors != null ? "{...}" : "null") + ',' + (outlineColors != null ? "{...}" : "null") + ',' + textColor + ',' + textShadowColor + ',' + (unusedFont != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
