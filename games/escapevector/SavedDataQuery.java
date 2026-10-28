/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedDataQuery extends IntrusiveNode {
    static byte[][] field_l;
    static int field_j;
    static String field_n;
    static String field_k;
    boolean complete;
    static ResourceArchive field_m;
    byte[] payload;
    static boolean field_i;

    final static boolean browserSessionMarkerSet(int guard) {
        if (guard == 1000) {
          return TextButton.hasBrowserSessionMarker(false, PointCloudEffect.activeApplet((byte) -110));
        }
        String var2 = (String) null;
        SavedDataQuery.createCredentials(10, true, 83L, (String) null, (String) null);
        return TextButton.hasBrowserSessionMarker(false, PointCloudEffect.activeApplet((byte) -110));
    }

    final static int scaleScoreForMode(int guard, int value, int mode) {
        if (guard != 0) {
          field_n = (String) null;
          return EditableTextWidget.scaleScoreForMode(value, mode, 96);
        }
        return EditableTextWidget.scaleScoreForMode(value, mode, 96);
    }

    final static void fillHalfBlendGouraudTriangle(int xB, int yA, int xA, int greenC, int redB, int yC, int redC, int xC, int yB, int guard, int blueC, int blueA, int redA, int blueB, int greenA, int greenB) {
        int var17 = EscapeVector.obfuscationControl;
        if (guard == -15733) {
          if (yA < yB) {
            if (yC > yB) {
              SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redC, redB, blueA, blueB, SoftwareRasterizer.pixels, xB, greenB, xA, yA, yB, yC, true, redA, xC, greenA, greenC, blueC);
              return;
            }
            if (yC > yA) {
              SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redB, redC, blueA, blueC, SoftwareRasterizer.pixels, xC, greenC, xA, yA, yC, yB, true, redA, xB, greenA, greenB, blueB);
              return;
            }
            SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redB, redA, blueC, blueA, SoftwareRasterizer.pixels, xA, greenA, xC, yC, yA, yB, true, redC, xB, greenC, greenB, blueB);
            return;
          }
          if (yA < yC) {
            SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redC, redA, blueB, blueA, SoftwareRasterizer.pixels, xA, greenA, xB, yB, yA, yC, true, redB, xC, greenB, greenC, blueC);
            return;
          }
          if (yB >= yC) {
            SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redA, redB, blueC, blueB, SoftwareRasterizer.pixels, xB, greenB, xC, yC, yB, yA, true, redC, xA, greenC, greenA, blueA);
            return;
          }
          SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redA, redC, blueB, blueC, SoftwareRasterizer.pixels, xC, greenC, xB, yB, yC, yA, true, redB, xA, greenB, greenA, blueA);
          return;
        }
        field_n = (String) null;
        if (yA < yB) {
          if (yC > yB) {
            SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redC, redB, blueA, blueB, SoftwareRasterizer.pixels, xB, greenB, xA, yA, yB, yC, true, redA, xC, greenA, greenC, blueC);
            return;
          }
          if (yC > yA) {
            SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redB, redC, blueA, blueC, SoftwareRasterizer.pixels, xC, greenC, xA, yA, yC, yB, true, redA, xB, greenA, greenB, blueB);
            return;
          }
          SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redB, redA, blueC, blueA, SoftwareRasterizer.pixels, xA, greenA, xC, yC, yA, yB, true, redC, xB, greenC, greenB, blueB);
          return;
        }
        if (yA < yC) {
          SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redC, redA, blueB, blueA, SoftwareRasterizer.pixels, xA, greenA, xB, yB, yA, yC, true, redB, xC, greenB, greenC, blueC);
          return;
        }
        if (yB >= yC) {
          SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redA, redB, blueC, blueB, SoftwareRasterizer.pixels, xB, greenB, xC, yC, yB, yA, true, redC, xA, greenC, greenA, blueA);
          return;
        }
        SecondaryIntrusiveDeque.fillSortedHalfBlendGouraudTriangle(redA, redC, blueB, blueC, SoftwareRasterizer.pixels, xC, greenC, xB, yB, yC, yA, true, redB, xA, greenB, greenA, blueA);
    }

    final static LoginCredentials createCredentials(int emailUsernameSentinel, boolean alternateType, long encodedUsername, String email, String password) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if ((long)emailUsernameSentinel == encodedUsername &&
            email != null) {
            EmailCredentials stackIn_7_0 = new EmailCredentials(email, password);
            return (LoginCredentials) ((Object) stackIn_7_0);
          }
          if (!alternateType) {
            UsernameCredentials stackIn_9_0 = new UsernameCredentials(encodedUsername, password);
            return (LoginCredentials) ((Object) stackIn_9_0);
          }
          AlternateUsernameCredentials stackIn_5_0 = new AlternateUsernameCredentials(encodedUsername, password);
          return (LoginCredentials) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var6;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ei.D(").append(emailUsernameSentinel).append(',').append(alternateType).append(',').append(encodedUsername).append(',');
          if (email == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (password == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_m = null;
        field_k = null;
        if (guard >= -44) {
          return;
        }
        field_l = (byte[][]) null;
        field_n = null;
    }

    SavedDataQuery() {
    }

    static {
        field_l = new byte[1000][];
        field_n = "Use this alternative as your account name";
        field_k = "Play free version";
        field_j = 0;
        field_i = false;
    }
}
