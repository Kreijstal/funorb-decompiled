/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerBitLengthHelpers {
    static RgbSprite[] countdownSprites;
    static String unreadMessagesFormat;
    static boolean field_d;
    static int[] achievementBitIndices;
    static String contactInformationReportReason;
    static int[] projectedVertexY;

    final static void drawMenuBackground(int destinationX, int colorIndex) {
        IntrusiveHashTable.field_k.drawFullBackground(true, MouseInput.field_b, 0, colorIndex, destinationX);
        if (IntrusiveHashTable.field_k.sceneId == 7) {
          SaveResultsPromptScreen.advanceAndDrawFireworks(true, true, destinationX);
        }
    }

    final static void a(boolean param0, ResourceArchive param1, ResourceArchive param2, byte param3) {
        try {
          ParisBackground.a(AccountMessageDialog.field_Ab, ScorePopup.field_m, TableResponseHelpers.field_a, Paddle.field_C, GzipInflater.field_d, ProxySocketConnector.field_n, DualLinkNode.field_t, CappedUrlRequest.field_l, (byte) 61, param0, LobbyInputHelpers.field_c, OptionsScreen.field_u);
          if (param3 < 74) {
            IntegerBitLengthHelpers.unsignedBitLength(2, -57);
          }
          ProxyAuthenticationRequiredException.field_b = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param1, "chatfilter", 2);
          CalendarMatchmakingState.field_e[0] = UiCleanupHelpers.field_a;
          CalendarMatchmakingState.field_e[2] = TableRowSubmission.field_s;
          CalendarMatchmakingState.field_e[1] = AchievementSubmission.friendsTabLabel;
          LoginPanel.a(GamePresentationHelpers.field_e, (byte) 90, param2);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ed.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int unsignedBitLength(int obfuscationGuard, int value) {
        int shiftCount = 0;
        if (obfuscationGuard != 9) {
          IntegerBitLengthHelpers.unsignedBitLength(-83, -74);
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

    public static void clearSharedReferences(int obfuscationGuard) {
        contactInformationReportReason = null;
        achievementBitIndices = null;
        if (obfuscationGuard > -61) {
          return;
        }
        unreadMessagesFormat = null;
        projectedVertexY = null;
        countdownSprites = null;
    }

    static {
        contactInformationReportReason = "Asking for or providing contact information";
        projectedVertexY = new int[8192];
        achievementBitIndices = new int[]{0, 1, 2, 10, 25, -1, -1, -1, -1, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, 5, 6, 7, 8, -1, -1, -1, -1, -1, -1, 9, 10, 11, 12, 13, -1, -1, -1, -1, -1, 14, -1};
        unreadMessagesFormat = "You have <%0> unread messages!";
    }
}
