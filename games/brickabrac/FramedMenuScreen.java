/*
 * Decompiled by CFR-JS 0.4.0.
 */
class FramedMenuScreen extends MenuScreen {
    static String field_r;
    static String field_t;
    static PlatformServices field_s;

    FramedMenuScreen(int screenId, int buttonLeft, int buttonRight, int buttonTop, int buttonSpacing, int[] actionIds) {
        super(screenId, buttonLeft, buttonRight, buttonTop, buttonSpacing, actionIds);
    }

    public static void f(byte param0) {
        field_t = null;
        if (param0 >= -64) {
          FramedMenuScreen.f(72);
          field_s = null;
          field_r = null;
          return;
        }
        field_s = null;
        field_r = null;
    }

    final void drawMenuFrame(int obfuscationGuard) {
        MenuButton var5 = null;
        MenuButton var2 = this.buttons[0];
        if (obfuscationGuard > 34) {
          var5 = this.buttons[this.selection.itemCount - 1];
          GzipInflater.a(30 + (-this.buttonLeft + this.buttonRight), 0, -var2.y + var5.height + (var5.y + 30), 0, -15 + var2.y, (byte) -88, -15 + this.buttonLeft);
          return;
        }
        field_t = (String) null;
        MenuButton var4 = this.buttons[this.selection.itemCount - 1];
        GzipInflater.a(30 + (-this.buttonLeft + this.buttonRight), 0, -var2.y + var4.height + (var4.y + 30), 0, -15 + var2.y, (byte) -88, -15 + this.buttonLeft);
    }

    final static UiComponent f(int param0) {
        if (param0 <= 94) {
          field_t = (String) null;
          return f.ignoreListPane.content;
        }
        return f.ignoreListPane.content;
    }

    final static java.net.URL rewriteAppletPath(String settingsOverride, byte obfuscationGuard, String sessionOverride, int languageOverride, java.net.URL url) {
        try {
          StringBuilder unusedRetainedPrefixAppend = null;
          StringBuilder unusedLanguageKeyAppend = null;
          StringBuilder unusedLanguageValueAppend = null;
          StringBuilder unusedSettingsKeyAppend = null;
          StringBuilder unusedSettingsValueAppend = null;
          StringBuilder unusedSessionKeyAppend = null;
          StringBuilder unusedSessionValueAppend = null;
          StringBuilder unusedTrailingSlashAppend = null;
          StringBuilder unusedSuffixAppend = null;
          java.net.URL rewrittenUrl = null;
          java.net.URL originalUrlFallback = null;
          RuntimeException failureContext = null;
          StringBuilder contextBuilder = null;
          String settingsSummary = null;
          StringBuilder sessionContextBuilder = null;
          String sessionSummary = null;
          StringBuilder urlContextBuilder = null;
          String urlSummary = null;
          Throwable caughtFailure = null;
          String filePath = null;
          RuntimeException rewriteFailure = null;
          int prefixEnd = 0;
          int languageSegmentEnd = 0;
          StringBuilder rewrittenPath = null;
          Exception invalidUrlFailure = null;
          int unusedGameFlag = 0;
          int affiliateSegmentEnd;
          int settingsSegmentEnd;
          int sessionSegmentEnd;
          unusedGameFlag = BrickABrac.field_J ? 1 : 0;
          try {
            filePath = url.getFile();
            prefixEnd = 0;
            if (obfuscationGuard != 60) {
              FramedMenuScreen.f((byte) 78);
            }
            while (true) {
              if (filePath.regionMatches(prefixEnd, "/l=", 0, 3)) {
                languageSegmentEnd = filePath.indexOf('/', 1 + prefixEnd);
                if (languageSegmentEnd >= 0) {
                  if (0 <= languageOverride) {
                    filePath = filePath.substring(0, prefixEnd) + filePath.substring(languageSegmentEnd);
                    continue;
                  }
                  prefixEnd = languageSegmentEnd;
                  continue;
                }
              }
              if (filePath.regionMatches(prefixEnd, "/a=", 0, 3)) {
                affiliateSegmentEnd = filePath.indexOf('/', prefixEnd + 1);
                if (affiliateSegmentEnd >= 0) {
                  prefixEnd = affiliateSegmentEnd;
                  continue;
                }
              }
              if (filePath.regionMatches(prefixEnd, "/p=", 0, 3)) {
                settingsSegmentEnd = filePath.indexOf('/', prefixEnd + 1);
                if (0 <= settingsSegmentEnd) {
                  if (settingsOverride != null) {
                    filePath = filePath.substring(0, prefixEnd) + filePath.substring(settingsSegmentEnd);
                    continue;
                  }
                  prefixEnd = settingsSegmentEnd;
                  continue;
                }
              }
              if (filePath.regionMatches(prefixEnd, "/s=", 0, 3) ||
                filePath.regionMatches(prefixEnd, "/c=", 0, 3)) {
                sessionSegmentEnd = filePath.indexOf('/', 1 + prefixEnd);
                if (sessionSegmentEnd >= 0) {
                  if (sessionOverride == null) {
                    prefixEnd = sessionSegmentEnd;
                    continue;
                  }
                  filePath = filePath.substring(0, prefixEnd) + filePath.substring(sessionSegmentEnd);
                  continue;
                }
              }
              break;
            }
            rewrittenPath = new StringBuilder(prefixEnd);
            unusedRetainedPrefixAppend = rewrittenPath.append(filePath.substring(0, prefixEnd));
            if (0 < languageOverride) {
              unusedLanguageKeyAppend = rewrittenPath.append("/l=");
              unusedLanguageValueAppend = rewrittenPath.append(Integer.toString(languageOverride));
            }
            if (settingsOverride != null &&
              settingsOverride.length() > 0) {
              unusedSettingsKeyAppend = rewrittenPath.append("/p=");
              unusedSettingsValueAppend = rewrittenPath.append(settingsOverride);
            }
            if (sessionOverride != null &&
              sessionOverride.length() > 0) {
              unusedSessionKeyAppend = rewrittenPath.append("/s=");
              unusedSessionValueAppend = rewrittenPath.append(sessionOverride);
            }
            if (prefixEnd >= filePath.length()) {
              unusedTrailingSlashAppend = rewrittenPath.append('/');
            } else {
              unusedSuffixAppend = rewrittenPath.append(filePath.substring(prefixEnd, filePath.length()));
            }
            try {
              rewrittenUrl = new java.net.URL(url, rewrittenPath.toString());
              return rewrittenUrl;
            } catch (java.lang.Exception caughtUrlFailure) {
              caughtFailure = caughtUrlFailure;
              invalidUrlFailure = (Exception) (Object) caughtFailure;
              invalidUrlFailure.printStackTrace();
              originalUrlFallback = (java.net.URL) (url);
              return originalUrlFallback;
            }
          } catch (java.lang.RuntimeException caughtRewriteFailure) {
            caughtFailure = caughtRewriteFailure;
            rewriteFailure = (RuntimeException) (Object) caughtFailure;
            failureContext = rewriteFailure;
            contextBuilder = new StringBuilder().append("lh.KA(");
            if (settingsOverride == null) {
              settingsSummary = "null";
            } else {
              settingsSummary = "{...}";
            }
            sessionContextBuilder = ((StringBuilder) (Object) contextBuilder).append(settingsSummary).append(',').append(obfuscationGuard).append(',');
            if (sessionOverride == null) {
              sessionSummary = "null";
            } else {
              sessionSummary = "{...}";
            }
            urlContextBuilder = ((StringBuilder) (Object) sessionContextBuilder).append(sessionSummary).append(',').append(languageOverride).append(',');
            if (url == null) {
              urlSummary = "null";
            } else {
              urlSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) urlContextBuilder).append(urlSummary).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    int getButtonTop(int buttonIndex, int obfuscationGuard) {
        int var3 = super.getButtonTop(buttonIndex, obfuscationGuard);
        if (buttonIndex == -1 + this.selection.itemCount) {
          var3 = var3 + this.buttonSpacing / 2;
        }
        return var3;
    }

    final static int g(byte param0) {
        if (param0 != -44) {
          return 92;
        }
        return BackgroundScene.masterSoundGain;
    }

    static {
        field_r = "Account created successfully!";
        field_t = "Level <%0>";
    }
}
