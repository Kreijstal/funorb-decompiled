/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DebugTuningSlider {
    private int field_q;
    private int field_j;
    static int field_f;
    private int field_e;
    static int field_k;
    static int field_i;
    static int[] field_s;
    private int field_l;
    static int[][] field_d;
    private int field_g;
    static String ignorelistfull;
    static ScrollPane field_c;
    private int field_n;
    private int field_r;
    private int field_o;
    private int field_b;
    static String unableToSendMessagePasswordB;
    static Sprite field_h;
    static int[] field_p;

    final boolean updateFromMouse(byte param0) {
        if (ReflectionReplySupport.field_i < this.field_j) {
          if (param0 <= -79) {
            return false;
          }
          field_k = 111;
          return false;
        }
        if (ReflectionReplySupport.field_i > this.field_l) {
          if (param0 <= -79) {
            return false;
          }
          field_k = 111;
          return false;
        }
        if (DebouncedValidationProvider.field_f >= this.field_e) {
          if (this.field_q >= DebouncedValidationProvider.field_f) {
            this.adjustValue(-CompressedContainerSupport.field_d, false);
            return true;
          }
          if (param0 <= -79) {
            return false;
          }
          field_k = 111;
          return false;
        }
        if (param0 <= -79) {
          return false;
        }
        field_k = 111;
        return false;
    }

    final void draw(int param0) {
        int var2 = 0;
        CollisionContact.field_h.drawString(this.settingLabel((byte) 36) + ": " + Integer.toString(this.getValue(-195801560), 16), this.field_r, this.field_g, 15658734, -1);
        if (param0 == 3) {
          SoftwareRasterizer.fillRectangle(this.field_j, this.field_e, 16, 80, 3381555);
          var2 = this.field_q - (this.getValue(param0 ^ -195801557) - this.field_b) * 80 / (this.field_o - this.field_b);
          SoftwareRasterizer.drawLine(this.field_j, var2, this.field_l, var2, 16764006);
          return;
        }
    }

    private final void applyValue(boolean param0, int param1) {
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        int stackIn_43_0 = 0;
        boolean stackIn_44_1 = false;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (param0) {
          var3 = this.field_n;
          if (var3 == 0) {
            RankingsScreen.field_K = param1 >> 8;
            return;
          }
          if (var3 == 1) {
            TextPairLoginPayload.field_l = param1 >> 8;
            return;
          }
          if (var3 == 2) {
            FullscreenDisplayMode.field_g = param1 >> 8;
            return;
          }
          if (var3 == 3) {
            MusicPatchEnvelope.field_m = param1 >> 8;
            return;
          }
          if (var3 == 4) {
            LogoFinalFrameLoader.field_b = param1;
            stackIn_43_0 = 6429081;
            stackIn_44_1 = (param0) ? false : true;
            LogoFinalFrameLoader.field_f = NameEntryPopup.multiplyFixed16(stackIn_43_0, stackIn_44_1, LogoFinalFrameLoader.field_b);
            return;
          }
          if (var3 == 5) {
            ClientUiResourceState.field_e = param1;
            ClientUiResourceState.field_g = NameEntryPopup.multiplyFixed16(6429081, false, ClientUiResourceState.field_e);
            return;
          }
          if (var3 == 6) {
            WireframeQuad.field_g = param1;
            return;
          }
          if (var3 == 7) {
            PasswordValidator.field_q = param1;
            PasswordValidator.field_w = PasswordValidator.field_q * 128 / 5;
            return;
          }
          if (var3 == 8) {
            ReflectionReplySupport.field_l = param1;
            return;
          }
          if (var3 == 9) {
            CueAim.field_f = param1;
            return;
          }
          if (var3 != 10) {
            return;
          }
          MusicVoice.field_l = param1;
          return;
        }
        this.field_e = 58;
        var3Lifetime1 = this.field_n;
        if (var3Lifetime1 == 0) {
          RankingsScreen.field_K = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 1) {
          TextPairLoginPayload.field_l = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 2) {
          FullscreenDisplayMode.field_g = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 3) {
          MusicPatchEnvelope.field_m = param1 >> 8;
          return;
        }
        if (var3Lifetime1 == 4) {
          LogoFinalFrameLoader.field_b = param1;
          stackIn_12_0 = 6429081;
          stackIn_13_1 = (param0) ? false : true;
          LogoFinalFrameLoader.field_f = NameEntryPopup.multiplyFixed16(stackIn_12_0, stackIn_13_1, LogoFinalFrameLoader.field_b);
          return;
        }
        if (var3Lifetime1 == 5) {
          ClientUiResourceState.field_e = param1;
          ClientUiResourceState.field_g = NameEntryPopup.multiplyFixed16(6429081, false, ClientUiResourceState.field_e);
          return;
        }
        if (var3Lifetime1 == 6) {
          WireframeQuad.field_g = param1;
          return;
        }
        if (var3Lifetime1 == 7) {
          PasswordValidator.field_q = param1;
          PasswordValidator.field_w = PasswordValidator.field_q * 128 / 5;
          return;
        }
        if (var3Lifetime1 == 8) {
          ReflectionReplySupport.field_l = param1;
          return;
        }
        if (var3Lifetime1 == 9) {
          CueAim.field_f = param1;
          return;
        }
        if (var3Lifetime1 != 10) {
          return;
        }
        MusicVoice.field_l = param1;
    }

    final static void showAccountProgressDialog(byte obfuscationGuard) {
        TabbedPane.field_Ub.hideAllDialogs(-22216);
        if (ScrollPane.field_Nb == null) {
          ScrollPane.field_Nb = new ProgressDialog(TabbedPane.field_Ub, ClientException.field_d);
        }
        if (obfuscationGuard <= -108) {
          TabbedPane.field_Ub.showDialog(ScrollPane.field_Nb, 30000);
          return;
        }
        String var2 = (String) null;
        DebugTuningSlider.setAccountStatusMessage((String) null, -115);
        TabbedPane.field_Ub.showDialog(ScrollPane.field_Nb, 30000);
    }

    final static void setAccountStatusMessage(String message, int obfuscationGuard) {
        ChatInputSupport.field_g = message;
        if (obfuscationGuard >= -126) {
          return;
        }
        try {
          LoginEncryptionSupport.setAccountDialogResult(12, (byte) 102);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ci.G(" + (message != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean handleSliderPointer(int obfuscationGuard) {
        String discarded$0 = null;
        if (obfuscationGuard == 59) {
          if (ClientInputResetSupport.field_b == 0) {
            return false;
          }
          if (ReflectionReplySupport.field_i < this.field_j) {
            return false;
          }
          if (ReflectionReplySupport.field_i > this.field_l) {
            return false;
          }
          if (DebouncedValidationProvider.field_f < this.field_e) {
            return false;
          }
          if (this.field_q < DebouncedValidationProvider.field_f) {
            return false;
          }
          this.applyValue(true, this.field_b + (-this.field_b + this.field_o) * (-DebouncedValidationProvider.field_f + this.field_q) / 80);
          return true;
        }
        discarded$0 = this.settingLabel((byte) 118);
        if (ClientInputResetSupport.field_b == 0) {
          return false;
        }
        if (ReflectionReplySupport.field_i < this.field_j) {
          return false;
        }
        if (ReflectionReplySupport.field_i > this.field_l) {
          return false;
        }
        if (DebouncedValidationProvider.field_f < this.field_e) {
          return false;
        }
        if (this.field_q < DebouncedValidationProvider.field_f) {
          return false;
        }
        this.applyValue(true, this.field_b + (-this.field_b + this.field_o) * (-DebouncedValidationProvider.field_f + this.field_q) / 80);
        return true;
    }

    final static void configureTextFrameStyle(int param0, int param1, NineSliceFrame param2, int param3, int param4, NineSliceFrame param5) {
        try {
          TriangleMesh.field_B = param4;
          IntrusiveNodeHashTable.field_d = param2;
          MeshSymmetrySupport.field_e = param5;
          LookupQuery.field_m = param0;
          IterableDualLinkDeque.field_g = param3;
          if (param1 != 26790) {
            String var7 = (String) null;
            DebugTuningSlider.setAccountStatusMessage((String) null, 118);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ci.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void configureSlider(int minimum, int maximum, int settingIndex, int obfuscationGuard) {
        this.field_o = minimum;
        this.field_b = maximum;
        this.field_n = settingIndex;
        int var5 = CollisionContact.field_h.maxAscent + (18 + CollisionContact.field_h.maxDescent);
        if (obfuscationGuard == -6) {
          this.field_g = 472;
          this.field_r = var5 * this.field_n + CollisionContact.field_h.maxAscent;
          this.field_j = CollisionContact.field_h.maxDescent + (this.field_r + 2);
          this.field_l = this.field_j + 16;
          this.field_e = 392;
          this.field_q = 80 + this.field_e;
          return;
        }
    }

    private final int getValue(int obfuscationGuard) {
        int var2;
        if (obfuscationGuard != -195801560) {
          return 37;
        }
        var2 = this.field_n;
        if (0 == var2) {
          return RankingsScreen.field_K << 8;
        }
        if (var2 == 1) {
          return TextPairLoginPayload.field_l << 8;
        }
        if (var2 == 2) {
          return FullscreenDisplayMode.field_g << 8;
        }
        if (var2 == 3) {
          return MusicPatchEnvelope.field_m << 8;
        }
        if (var2 == 4) {
          return LogoFinalFrameLoader.field_b;
        }
        if (5 == var2) {
          return ClientUiResourceState.field_e;
        }
        if (var2 == 6) {
          return WireframeQuad.field_g;
        }
        if (7 == var2) {
          return PasswordValidator.field_q;
        }
        if (var2 == 8) {
          return ReflectionReplySupport.field_l;
        }
        if (var2 == 9) {
          return CueAim.field_f;
        }
        if (var2 == 10) {
          return MusicVoice.field_l;
        }
        return -1;
    }

    public static void releaseStatics(byte param0) {
        ignorelistfull = null;
        if (param0 == 8) {
          field_s = null;
          field_p = null;
          field_h = null;
          unableToSendMessagePasswordB = null;
          field_c = null;
          field_d = (int[][]) null;
          return;
        }
        DebugTuningSlider.showAccountProgressDialog((byte) -32);
        field_s = null;
        field_p = null;
        field_h = null;
        unableToSendMessagePasswordB = null;
        field_c = null;
        field_d = (int[][]) null;
    }

    DebugTuningSlider(float param0, float param1, int param2) {
        this.configureSlider(HighscoresScreen.a(param1, -4), HighscoresScreen.a(param0, -4), param2, -6);
    }

    private final void adjustValue(int delta, boolean obfuscationGuard) {
        boolean stackIn_4_1 = false;
        boolean stackIn_12_1 = false;
        boolean stackIn_20_1 = false;
        boolean stackIn_28_1 = false;
        int var3;
        NineSliceFrame var4;
        NineSliceFrame var4Lifetime1;
        var3 = this.field_n;
        if (var3 == 0) {
          stackIn_4_1 = !(obfuscationGuard);
          this.applyValue(stackIn_4_1, delta * 256 + this.getValue(-195801560));
        } else {
          if (var3 == 1) {
            stackIn_12_1 = !(obfuscationGuard);
            this.applyValue(stackIn_12_1, delta * 256 + this.getValue(-195801560));
          } else {
            if (var3 == 2) {
              stackIn_20_1 = !(obfuscationGuard);
              this.applyValue(stackIn_20_1, delta * 256 + this.getValue(-195801560));
            } else {
              if (3 != var3) {
                this.applyValue(true, delta + this.getValue(-195801560));
                if (!obfuscationGuard) {
                  return;
                }
                var4 = (NineSliceFrame) null;
                DebugTuningSlider.configureTextFrameStyle(-37, 7, (NineSliceFrame) null, 78, 67, (NineSliceFrame) null);
                return;
              }
              stackIn_28_1 = !(obfuscationGuard);
              this.applyValue(stackIn_28_1, delta * 256 + this.getValue(-195801560));
            }
          }
        }
        if (!obfuscationGuard) {
          return;
        }
        var4Lifetime1 = (NineSliceFrame) null;
        DebugTuningSlider.configureTextFrameStyle(-37, 7, (NineSliceFrame) null, 78, 67, (NineSliceFrame) null);
    }

    private final String settingLabel(byte obfuscationGuard) {
        int discarded$0 = 0;
        int var2;
        if (obfuscationGuard != 36) {
          discarded$0 = this.getValue(11);
        }
        var2 = this.field_n;
        if (var2 == 0) {
          return "Ball-ball";
        }
        if (1 == var2) {
          return "Ball-ball ang";
        }
        if (2 == var2) {
          return "Ball-cush";
        }
        if (var2 == 3) {
          return "Ball-cush ang";
        }
        if (var2 == 4) {
          return "Slid Coef";
        }
        if (var2 == 5) {
          return "Roll coef";
        }
        if (var2 == 6) {
          return "Overspin";
        }
        if (var2 == 7) {
          return "Ball mass";
        }
        if (var2 == 8) {
          return "Z spin fric";
        }
        if (9 == var2) {
          return "Cue force";
        }
        if (var2 != 10) {
          return "Banana in disk drive error.";
        }
        return "Side spin";
    }

    static {
        field_s = new int[]{8, 8};
        field_f = 0;
        field_i = -1;
        ignorelistfull = "Your ignore list is full. Max of 100 hit.";
        unableToSendMessagePasswordB = "If you are not, please change your password to something more obscure!";
        field_h = new Sprite(270, 70);
    }
}
