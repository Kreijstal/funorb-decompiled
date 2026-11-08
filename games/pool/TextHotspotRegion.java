/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRegion extends IntrusiveNode {
    static UiComponent field_o;
    int field_r;
    int field_p;
    int field_l;
    int field_q;
    TextHotspotRegion next;
    static String createUsernameUnavailable;
    int field_m;
    static int field_t;

    final static int bitLengthWithOffset(int value, int offset) {
        int var2 = offset;
        if (value < 0 ||
          65536 <= value) {
          value = value >>> 16;
          var2 += 16;
        }
        if (value >= 256) {
          value = value >>> 8;
          var2 += 8;
        }
        if (16 <= value) {
          var2 += 4;
          value = value >>> 4;
        }
        if (value >= 4) {
          var2 += 2;
          value = value >>> 2;
        }
        if (value >= 1) {
          value = value >>> 1;
          var2++;
        }
        return value + var2;
    }

    final void drawOutline(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var7 = this.field_q + param5;
        int var8 = param1 + this.field_m;
        SoftwareRasterizer.drawHorizontalLineAlpha(var8 - 1, var7, this.field_l + 1, param0, param2);
        SoftwareRasterizer.drawHorizontalLineAlpha(var8 - 1, param3 + var7 + this.field_r, 1 + this.field_l, param0, param2);
        if (param4) {
          SoftwareRasterizer.drawVerticalLineAlpha(var8 - 2, var7, this.field_r, param0, param2);
        }
        if (this.next == null) {
          SoftwareRasterizer.drawVerticalLineAlpha(this.field_l + var8, var7, this.field_r, param0, param2);
        } else {
          this.next.drawOutline(param0, param1, param2, -1, false, param5);
        }
    }

    final static void drawIntroMeshes(int obfuscationGuard) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        TriangleMesh var4_ref_oc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        TriangleMesh var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        try {
          HighScoreRequest.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ShotRecord.field_S.length;
          var20 = new int[var1_int];
          var19 = var20;
          var2 = var19;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_oc = ShotRecord.field_S[var3];
            var4_ref_oc.updateBounds((byte) 87);
            ShotRecord.b(0, var3);
            var5 = var4_ref_oc.minX + var4_ref_oc.maxX >> 1;
            var6 = var4_ref_oc.maxY + var4_ref_oc.minY >> 1;
            var7 = var4_ref_oc.minZ + var4_ref_oc.maxZ >> 1;
            var8 = HighScoreRequest.field_p[9] >> 2;
            var9 = HighScoreRequest.field_p[10] >> 2;
            var10_int = HighScoreRequest.field_p[11] >> 2;
            var11 = var10_int * IsaacCipher.field_b[5] + (var8 * IsaacCipher.field_b[3] + var9 * IsaacCipher.field_b[4]) >> 14;
            var12 = IsaacCipher.field_b[8] * var10_int + IsaacCipher.field_b[6] * var8 + var9 * IsaacCipher.field_b[7] >> 14;
            var13 = IsaacCipher.field_b[10] * var9 + (IsaacCipher.field_b[9] * var8 + IsaacCipher.field_b[11] * var10_int) >> 14;
            var2[var3] = var7 * var13 + (var11 * var5 + var12 * var6) >> 16;
          }
          var3Lifetime1 = HighScoreRequest.field_p[9] >> 8;
          var4 = HighScoreRequest.field_p[10] >> 8;
          var5Lifetime1 = HighScoreRequest.field_p[11] >> 8;
          var6Lifetime1 = LobbyPlayer.field_fc << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = EightBallRules.sineLookup((byte) -123, var6Lifetime1) >> 8;
          var9Lifetime1 = UiComponentNode.sineFixed(var6Lifetime1, (byte) 83) >> 8;
          if (ReflectionReplySupport.field_i != -1 &&
            DebouncedValidationProvider.field_f != -1) {
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + ReflectionReplySupport.field_i;
            var8Lifetime1 = -DebouncedValidationProvider.field_f + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          if (obfuscationGuard != -21818) {
            return;
          }
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; ShotRecord.field_S.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ShotRecord.field_S.length; var17_int++) {
              if (var20[var17_int] > var20[var16]) {
                var16 = var17_int;
              }
            }
            var20[var16] = -2147483648;
            var17 = ShotRecord.field_S[var16];
            ShotRecord.b(0, var16);
            for (var18 = 0; var18 < 3; var18++) {
              IsaacCipher.field_b[var18] = IsaacCipher.field_b[var18] + QuickChatMenu.field_gc[var15][var18];
            }
            BitmapTextLayout.a(obfuscationGuard + 21815, false, HighScoreRequest.field_p, false, true, IsaacCipher.field_b, var17);
            CueAim.drawLitMeshFaces(var14, 8355711, var17, var8Lifetime1, var13Lifetime1, var9Lifetime1, var12Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "gi.A(" + obfuscationGuard + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        createUsernameUnavailable = null;
        if (!param0) {
          field_o = (UiComponent) null;
        }
        field_o = null;
    }

    final static AnimatedNotification enqueueNotificationIfAbsent(boolean obfuscationGuard, int notificationId, String firstLine, String secondLine) {
        AnimatedNotification var4 = null;
        RuntimeException var4_ref = null;
        AnimatedNotification stackIn_3_0 = null;
        AnimatedNotification stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (EmailAvailabilityValidator.findNotification(-2, notificationId) == null) {
            var4 = new AnimatedNotification(notificationId);
            var4.renderNotificationText(firstLine, (byte) 120, secondLine);
            MarkerSliderPainter.field_i.addFirst((byte) -20, var4);
            stackIn_3_0 = var4;
            return stackIn_3_0;
          }
          if (obfuscationGuard) {
            return null;
          }
          stackIn_7_0 = (AnimatedNotification) null;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("gi.E(").append(obfuscationGuard).append(',').append(notificationId).append(',');
          if (firstLine == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (secondLine == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    TextHotspotRegion(int param0) {
        this.next = null;
        this.field_p = param0;
    }

    static {
        createUsernameUnavailable = "That name is not available";
    }
}
