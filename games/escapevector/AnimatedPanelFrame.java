/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AnimatedPanelFrame {
    int x;
    private int targetAccentWidth;
    int y;
    private int darkColor;
    static NineSliceFrame field_e;
    int height;
    private int accentColor;
    private int openDurationTicks;
    private int lightColor;
    private int frameId;
    static DraggableWidget field_b;
    static int field_a;
    int width;
    private boolean hasAccent;

    private final int remainingOpenTicks(int guard) {
        int var2 = LoginHandshakeSupport.field_d >= this.openDurationTicks ? 0 : -LoginHandshakeSupport.field_d + this.openDurationTicks;
        if (guard < -40) {
          return var2;
        }
        return 14;
    }

    final static int handleAccountConnectionFailure(byte guard, int responseCode) {
        int var3 = EscapeVector.obfuscationControl;
        ArchiveLoadTask.field_g = null;
        NameSuggestionsPanel.field_I = null;
        LegacyMenuFontSupport.field_b = 0;
        int var2 = AgeValidator.field_n;
        AgeValidator.field_n = SeekerPulseStream.field_l;
        SeekerPulseStream.field_l = var2;
        if (guard != -78) {
          String var4 = (String) null;
          AnimatedPanelFrame.findContactByName((String) null, (byte) 43);
          SelfDestructEffects.field_j.failureCount = SelfDestructEffects.field_j.failureCount + 1;
          if (responseCode == 51) {
            SelfDestructEffects.field_j.lastErrorCode = 2;
            if (SelfDestructEffects.field_j.failureCount < 2) {
              if (SelfDestructEffects.field_j.failureCount >= 2 &&
                responseCode == 50) {
                return 5;
              }
              if (SelfDestructEffects.field_j.failureCount < 4) {
                return -1;
              }
              return 1;
            }
            if (responseCode == 51) {
              return 2;
            }
            if (SelfDestructEffects.field_j.failureCount >= 2 &&
              responseCode == 50) {
              return 5;
            }
            if (SelfDestructEffects.field_j.failureCount < 4) {
              return -1;
            }
            return 1;
          }
          if (responseCode == 50) {
            SelfDestructEffects.field_j.lastErrorCode = 5;
            if (SelfDestructEffects.field_j.failureCount < 2) {
              if (SelfDestructEffects.field_j.failureCount >= 2 &&
                responseCode == 50) {
                return 5;
              }
              if (SelfDestructEffects.field_j.failureCount < 4) {
                return -1;
              }
              return 1;
            }
            if (responseCode == 51) {
              return 2;
            }
            if (SelfDestructEffects.field_j.failureCount >= 2 &&
              responseCode == 50) {
              return 5;
            }
            if (SelfDestructEffects.field_j.failureCount < 4) {
              return -1;
            }
            return 1;
          }
          SelfDestructEffects.field_j.lastErrorCode = 1;
          if (SelfDestructEffects.field_j.failureCount < 2) {
            if (SelfDestructEffects.field_j.failureCount >= 2 &&
              responseCode == 50) {
              return 5;
            }
            if (SelfDestructEffects.field_j.failureCount >= 4) {
              return 1;
            }
            return -1;
          }
          if (responseCode == 51) {
            return 2;
          }
          if (SelfDestructEffects.field_j.failureCount >= 2 &&
            responseCode == 50) {
            return 5;
          }
          if (SelfDestructEffects.field_j.failureCount < 4) {
            return -1;
          }
          return 1;
        }
        SelfDestructEffects.field_j.failureCount = SelfDestructEffects.field_j.failureCount + 1;
        if (responseCode == 51) {
          SelfDestructEffects.field_j.lastErrorCode = 2;
          if (SelfDestructEffects.field_j.failureCount >= 2 &&
            responseCode == 51) {
            return 2;
          }
          if (SelfDestructEffects.field_j.failureCount >= 2) {
            if (responseCode != 50) {
              if (SelfDestructEffects.field_j.failureCount >= 4) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (SelfDestructEffects.field_j.failureCount >= 4) {
            return 1;
          }
          return -1;
        }
        if (responseCode == 50) {
          SelfDestructEffects.field_j.lastErrorCode = 5;
          if (SelfDestructEffects.field_j.failureCount >= 2 &&
            responseCode == 51) {
            return 2;
          }
          if (SelfDestructEffects.field_j.failureCount >= 2) {
            if (responseCode != 50) {
              if (SelfDestructEffects.field_j.failureCount >= 4) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (SelfDestructEffects.field_j.failureCount >= 4) {
            return 1;
          }
          return -1;
        }
        SelfDestructEffects.field_j.lastErrorCode = 1;
        if (SelfDestructEffects.field_j.failureCount >= 2 &&
          responseCode == 51) {
          return 2;
        }
        if (SelfDestructEffects.field_j.failureCount >= 2) {
          if (responseCode != 50) {
            if (SelfDestructEffects.field_j.failureCount >= 4) {
              return 1;
            }
            return -1;
          }
          return 5;
        }
        if (SelfDestructEffects.field_j.failureCount >= 4) {
          return 1;
        }
        return -1;
    }

    final void configureFrame(int guard, int lightColor, int frameId, int darkColor) {
        this.darkColor = darkColor;
        if (guard == 15135) {
          this.lightColor = lightColor;
          this.frameId = frameId;
          return;
        }
        this.y = 79;
        this.lightColor = lightColor;
        this.frameId = frameId;
    }

    private final int accentWidth(byte guard) {
        int var2 = this.remainingOpenTicks(-73);
        if (guard == -57) {
          int var3 = this.openDurationTicks > var2 ? (-var2 + this.openDurationTicks) * this.targetAccentWidth / this.openDurationTicks : 0;
          return var3;
        }
        this.targetAccentWidth = 59;
        int var3Lifetime1 = this.openDurationTicks > var2 ? (-var2 + this.openDurationTicks) * this.targetAccentWidth / this.openDurationTicks : 0;
        return var3Lifetime1;
    }

    final void configureAccent(int darkColor, int accentColor, int frameId, int width, int lightColor, byte guard) {
        if (guard <= -127) {
          this.configureFrame(15135, lightColor, frameId, darkColor);
          this.targetAccentWidth = width;
          this.accentColor = accentColor;
          this.hasAccent = true;
          return;
        }
        this.configureAccent(98, -122, -22, -60, -56, (byte) -128);
        this.configureFrame(15135, lightColor, frameId, darkColor);
        this.targetAccentWidth = width;
        this.accentColor = accentColor;
        this.hasAccent = true;
    }

    final static ContactEntry findContactByName(String name, byte guard) {
        String stackIn_21_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (null == TrackerMusicLoader.field_a) {
            Object stackIn_3_0 = null;
            return (ContactEntry) (stackIn_3_0);
          }
          CharSequence var6 = (CharSequence) ((Object) name);
          String var2 = SessionCounterState.normalizeAccountName(-104, var6);
          if (var2 == null) {
            var2 = name;
          }
          ContactEntry var3 = (ContactEntry) (TrackerMusicLoader.field_a.get(-82, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              int var4 = -98 / ((guard + 63) / 57);
              Object stackIn_17_0 = null;
              return (ContactEntry) (stackIn_17_0);
            }
            CharSequence var7 = (CharSequence) ((Object) var3.displayName);
            String var4_ref_String = SessionCounterState.normalizeAccountName(-75, var7);
            if (var4_ref_String == null) {
              var4_ref_String = var3.displayName;
            }
            if (!var4_ref_String.equals(var2)) {
              var3 = (ContactEntry) (TrackerMusicLoader.field_a.nextMatch((byte) -36));
              continue;
            }
            break;
          }
          ContactEntry stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var2_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("gf.F(");
          if (name == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(guard).append(')').toString());
        }
    }

    final void draw(int guard) {
        int var2 = this.width + this.x;
        if (guard < 32) {
          this.accentColor = -56;
          int var3 = this.height + this.y;
          int var4 = this.remainingOpenTicks(-41);
          if (!this.hasAccent) {
            AccountNoticeKind.drawAnimatedPanelFrame(var4, this.x, var2, var3, true, 29788, false, this.lightColor, this.darkColor, this.frameId, this.y, true);
            return;
          }
          int var5 = this.accentWidth((byte) -57);
          GameAppletShell.drawFadingPanelFrame(var5, this.x, this.y, this.darkColor, this.frameId, var3, -3, var2, this.lightColor, this.accentColor, var4);
          return;
        }
        int var3Lifetime1 = this.height + this.y;
        int var4Lifetime1 = this.remainingOpenTicks(-41);
        if (!this.hasAccent) {
          AccountNoticeKind.drawAnimatedPanelFrame(var4Lifetime1, this.x, var2, var3Lifetime1, true, 29788, false, this.lightColor, this.darkColor, this.frameId, this.y, true);
          return;
        }
        int var5Lifetime1 = this.accentWidth((byte) -57);
        GameAppletShell.drawFadingPanelFrame(var5Lifetime1, this.x, this.y, this.darkColor, this.frameId, var3Lifetime1, -3, var2, this.lightColor, this.accentColor, var4Lifetime1);
    }

    public static void releaseStatics(int guard) {
        field_e = null;
        if (guard != 12474) {
          field_a = -26;
          field_b = null;
          return;
        }
        field_b = null;
    }

    AnimatedPanelFrame(int x, int y, int width, int height, int openDurationTicks) {
        this.y = y;
        this.x = x;
        this.openDurationTicks = openDurationTicks;
        this.width = width;
        this.height = height;
    }

    static {
    }
}
