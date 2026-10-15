/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static RgbSprite[] countdownSprites;
    static String field_c;
    static boolean field_d;
    static int[] field_f;
    static String field_a;
    static int[] projectedVertexY;

    final static void a(int param0, int param1) {
        IntrusiveHashTable.field_k.drawFullBackground(true, MouseInput.field_b, 0, param1, param0);
        if (IntrusiveHashTable.field_k.sceneId == 7) {
          SaveResultsPromptScreen.advanceAndDrawFireworks(true, true, param0);
        }
    }

    final static void a(boolean param0, ResourceArchive param1, ResourceArchive param2, byte param3) {
        try {
          ParisBackground.a(AccountMessageDialog.field_Ab, ScorePopup.field_m, f.field_a, Paddle.field_C, GzipInflater.field_d, ProxySocketConnector.field_n, DualLinkNode.field_t, CappedUrlRequest.field_l, (byte) 61, param0, ic.field_c, OptionsScreen.field_u);
          if (param3 < 74) {
            ed.unsignedBitLength(2, -57);
          }
          ProxyAuthenticationRequiredException.field_b = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param1, "chatfilter", 2);
          rh.field_e[0] = mc.field_a;
          rh.field_e[2] = TableRowSubmission.field_s;
          rh.field_e[1] = AchievementSubmission.friendsTabLabel;
          LoginPanel.a(rd.field_e, (byte) 90, param2);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ed.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int unsignedBitLength(int obfuscationGuard, int value) {
        int shiftCount = 0;
        if (obfuscationGuard != 9) {
          ed.unsignedBitLength(-83, -74);
        }
        if (value < 0) {
          shiftCount += 16;
          value = value >>> 16;
          if (256 <= value) {
            value = value >>> 8;
            shiftCount += 8;
          }
          if (16 <= value) {
            value = value >>> 4;
            shiftCount += 4;
          }
          if (4 <= value) {
            value = value >>> 2;
            shiftCount += 2;
          }
          if (value >= 1) {
            value = value >>> 1;
            shiftCount++;
          }
          return shiftCount + value;
        }
        if (value < 65536) {
          if (256 <= value) {
            value = value >>> 8;
            shiftCount += 8;
          }
          if (16 <= value) {
            value = value >>> 4;
            shiftCount += 4;
          }
          if (4 <= value) {
            value = value >>> 2;
            shiftCount += 2;
          }
          if (value >= 1) {
            value = value >>> 1;
            shiftCount++;
          }
          return shiftCount + value;
        }
        shiftCount += 16;
        value = value >>> 16;
        if (256 <= value) {
          value = value >>> 8;
          shiftCount += 8;
        }
        if (16 <= value) {
          value = value >>> 4;
          shiftCount += 4;
        }
        if (4 <= value) {
          value = value >>> 2;
          shiftCount += 2;
        }
        if (value >= 1) {
          value = value >>> 1;
          shiftCount++;
        }
        return shiftCount + value;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 > -61) {
          return;
        }
        field_c = null;
        projectedVertexY = null;
        countdownSprites = null;
    }

    static {
        field_a = "Asking for or providing contact information";
        projectedVertexY = new int[8192];
        field_f = new int[]{0, 1, 2, 10, 25, -1, -1, -1, -1, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, 5, 6, 7, 8, -1, -1, -1, -1, -1, -1, 9, 10, 11, 12, 13, -1, -1, -1, -1, -1, 14, -1};
        field_c = "You have <%0> unread messages!";
    }
}
