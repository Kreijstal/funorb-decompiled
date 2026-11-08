/*
 * Decompiled by CFR-JS 0.4.0.
 */
class GradientOutlineTextPainter extends TextWidgetPainter {
    static RgbSprite[] field_o;
    static int field_u;
    static String field_t;
    static int[] field_r;
    static int field_s;
    static ModalStack field_p;
    static int field_q;

    GradientOutlineTextPainter(int param0) {
        this(HighscoreSubmissionFactory.field_e, param0);
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        field_o = null;
        if (param0 != 9) {
          return;
        }
        field_p = null;
        field_r = null;
    }

    public final void drawWidget(int param0, UiComponent param1, byte param2, boolean param3, int param4) {
        try {
          if (param3) {
            DualNodeDeque.drawInsetBorder(param1.field_z + param4, param1.field_x, param1.field_E, param1.field_o + param0, (byte) 116);
          }
          super.drawWidget(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ag.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String chooseClickPrompt(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (!param1) {
          field_q = -53;
        }
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (!param3) {
          return ChatHistoryHelpers.field_d[var4];
        }
        var4++;
        return ChatHistoryHelpers.field_d[var4];
    }

    final static void requestFullscreen(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (SpriteLoadingHelpers.field_b <= 0) {
          if (ByteArrayPoolHelpers.isAccountCreationMode(89)) {
            var2 = 0;
          } else {
            var2 = 1;
          }
        } else {
          if (null == AssetDecoders.field_a) {
            RewardValueHelpers.field_c = LabeledField.openFullscreenCanvas(0, IterableDualNodeDeque.field_i, 0, 480, 0, 640);
            if (null == RewardValueHelpers.field_c) {
              var2 = 3;
            } else {
              var2 = 2;
              HighscoreColumnHeader.attachCanvasInput((byte) -93, RewardValueHelpers.field_c);
            }
          } else {
            RewardValueHelpers.field_c = AssetDecoders.field_a.enterFullscreen(param0 ^ -32476);
            LobbyGameDecoding.notifyBrowserResize(2, (byte) -31);
            if (null == RewardValueHelpers.field_c) {
              var2 = 3;
            } else {
              var2 = 2;
              HighscoreColumnHeader.attachCanvasInput((byte) -93, RewardValueHelpers.field_c);
            }
          }
        }
        if (param0 != -4) {
          field_t = (String) null;
        }
        if (null != AssetDecoders.field_a) {
          return;
        }
        if (!ValidationHelpWidget.field_fb) {
          return;
        }
        LoginResultHelpers.buildPopupMenu(113, param1, var2);
    }

    GradientOutlineTextPainter(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static int offsetInFiveToNineRange(int param0, int param1) {
        if (param1 < 5) {
          return 0;
        }
        if (param1 > 9) {
          return 0;
        }
        if (param0 > 15) {
          return -4 + param1;
        }
        field_u = -95;
        return -4 + param1;
    }

    static {
        field_u = 0;
        field_t = "Team Battle";
        field_r = new int[5];
    }
}
