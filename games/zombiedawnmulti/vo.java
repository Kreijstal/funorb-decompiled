/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends MenuScreen {
    static Sprite field_r;
    static String field_n;
    private int field_t;
    static UiComponent field_m;
    static String field_s;
    static boolean field_q;
    static Sprite field_p;
    static PlatformTask field_o;
    static ip field_l;

    private final void a(String param0, int param1, int param2, int param3) {
        try {
          ClientException.field_e.bindAsRenderTarget();
          SoftwareRasterizer.clear();
          if (param1 != -5) {
            this.h(-39);
          }
          TranslatedUiText.field_e.drawParagraph(param0, 60, param3, 520, 200, 4, 0, 1, 0, param2);
          g.a(16777215);
          g.a(16777215);
          g.a(16777215);
          g.a(16777215);
          SoftwareRasterizer.blurRectangle(5, 5, 0, 0, 640, 480);
          TranslatedUiText.field_e.drawParagraph(param0, 60, param3, 520, 200, 5, 0, 1, 0, param2);
          SocketConnector.field_h.b((byte) 100);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vo.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static AntialiasedBitmapFont a(byte param0, String param1, String param2, ResourceArchive param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        AntialiasedBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param1, (byte) -97);
          var6 = param4.a(param2, var5_int, -1);
          if (param0 != -46) {
            field_q = false;
          }
          stackIn_3_0 = ZombieDawnMulti.loadAntialiasedFont(var5_int, (byte) -19, param3, param4, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vo.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void updateScreen(int param0) {
        int var2;
        int var4;
        int stackIn_3_0 = 0;
        int var3;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_t = this.field_t + 1;
        stackIn_3_0 = (kd.field_b != 1) ? 0 : 1;
        var2 = stackIn_3_0;
        while (MusicPatchPcmStream.pollKeyEvent(-1)) {
          if (InfectionEvent.field_p != 13) {
            continue;
          }
          var2 = 1;
        }
        if (this.field_t >= 2152) {
          var2 = 1;
        }
        if (var2 != 0 &&
          100 < this.field_t) {
          this.h(-115);
        }
        if (1896 < this.field_t &&
          this.field_t < 2152) {
          var3 = -this.field_t + 2152;
          if (var3 < 0) {
            var3 = 0;
          }
        }
        if (param0 != 0) {
          field_l = (ip) null;
        }
    }

    final void onExit(byte param0) {
        if (param0 != 69) {
          field_o = (PlatformTask) null;
        }
        bl.field_g = null;
        MessageDialogContent.field_P = null;
        jo.field_d = null;
        eq.field_c = null;
    }

    vo(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_t = 0;
    }

    private final void h(int param0) {
        if (param0 > -59) {
          field_o = (PlatformTask) null;
        }
        LevelActorSpawner.requestMenuScreen(true, 1, 127, sp.field_g);
    }

    private final void b(int param0, int param1, int param2) {
        jo.field_d.drawTransparent(param0, param1);
        SecondaryNodeDeque.field_e.centerX = param2 - param0;
        SecondaryNodeDeque.field_e.centerY = param1 - 80;
        kk.field_w.draw(param2 - 10021, SecondaryNodeDeque.field_e);
        eq.field_c.draw(param0 + 150, param1 + 50);
    }

    final void drawScreen(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param0) {
          field_m = (UiComponent) null;
        }
        boolean decompiledFrameRemainder0 = true;
        SoftwareRasterizer.clear();
        if (260 <= this.field_t) {
          if (this.field_t >= 388) {
            if (508 > this.field_t) {
              this.b(0, 0, -115);
              MessageDialogContent.field_P.draw(0, 480 - MessageDialogContent.field_P.field_a);
            } else {
              if (this.field_t >= 1564) {
                if (1724 > this.field_t) {
                  this.b(-264, 0, -115);
                  var2 = 924;
                  bl.field_g.draw(-var2 + 622, 0);
                } else {
                  if (this.field_t < 1852) {
                    var2 = 924;
                    this.b(-264, 0, -115);
                    bl.field_g.draw(622 - var2, 0);
                    SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, 2 * (-1724 + this.field_t));
                  } else {
                    if (this.field_t < 2152) {
                      this.g(520);
                      if ((!(this.field_t <= 120)) &&
                        (!(this.field_t >= 388))) {
                        pb.field_e.drawCentered(QuickChatHelpDialog.field_Fb, 320, 460, 16777215, 0);
                      }
                      decompiledFrameRemainder0 = false;
                    }
                  }
                }
              } else {
                var2 = -508 + this.field_t;
                this.b(-(var2 >> 2), 0, -115);
                var3 = var2 * 7 >> 3;
                var4 = 9 * var2 >> 4;
                MessageDialogContent.field_P.draw(-var4, -MessageDialogContent.field_P.field_a + 480);
                bl.field_g.draw(-var3 + 622, 0);
              }
            }
          } else {
            this.b(0, 0, -115);
            MessageDialogContent.field_P.draw(0, -MessageDialogContent.field_P.field_a + 480);
            SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, 256 - (-520 + 2 * this.field_t));
          }
          if (decompiledFrameRemainder0) {
            this.g(520);
            if (this.field_t > 120 &&
              this.field_t < 388) {
              pb.field_e.drawCentered(QuickChatHelpDialog.field_Fb, 320, 460, 16777215, 0);
            }
          }
        } else {
          this.g(520);
          if (this.field_t > 120 &&
            this.field_t < 388) {
            pb.field_e.drawCentered(QuickChatHelpDialog.field_Fb, 320, 460, 16777215, 0);
          }
        }

    }

    public static void releaseStatics(int param0) {
        field_l = null;
        field_n = null;
        field_r = null;
        if (param0 != -14680) {
          field_s = (String) null;
        }
        field_m = null;
        field_o = null;
        field_p = null;
        field_s = null;
    }

    private final void g(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4 = 50;
        var5 = 0;
        if (param0 != 520) {
          vo.e(108);
        }
        while (var5 < TranslatedUiText.field_c.length) {
          var6 = -TranslatedUiText.field_c[var5] + this.field_t;
          if (var6 > 0 &&
            50 + (10 + ui.field_f[var5]) > var6) {
            var3 = 256;
            if (10 > var6) {
              var3 = (var6 << 8) / 10;
            }
            if (ui.field_f[var5] + 10 < var6) {
              var3 = 256 - (-ui.field_f[var5] + var6 - 10 << 8) / 50;
            }
            var2 = DisplayNamePanel.field_R[var5];
          }
          var5++;
        }
        if (var2 != null) {
          stackIn_18_0 = TranslatedUiText.field_e.maxAscent + TranslatedUiText.field_e.maxDescent;
          stackIn_18_1 = -5;
          var5Lifetime1 = stackIn_18_0 + stackIn_18_1;
          stackIn_21_0 = (var2 != DisplayNamePanel.field_R[5]) ? 0 : 1;
          var6Lifetime1 = stackIn_21_0;
          if (var6Lifetime1 != 0 ||
            DisplayNamePanel.field_R[5] == var2) {
            var4 = 180;
          }
          if (var6Lifetime1 != 0) {
            TranslatedUiText.field_e.drawParagraph(DisplayNamePanel.field_R[5], 60, var4, 520, 200, 1, 0, 1, 0, var5Lifetime1);
          }
          if (ml.field_Ob == null ||
            ml.field_Ob != var2) {
            this.a((String) (var2), -5, var5Lifetime1, var4);
          }
          if (var3 < 256) {
            TranslatedUiText.field_e.drawParagraphAlpha((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5Lifetime1);
            if (var6Lifetime1 == 0) {
              g.a(ClientException.field_e, 0, 0, var3);
            }
          } else {
            TranslatedUiText.field_e.drawParagraph((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5Lifetime1);
            if (var6Lifetime1 == 0) {
              g.a(ClientException.field_e, 0, 0);
            }
          }
        }
        ml.field_Ob = (String) (var2);
    }

    final static boolean e(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          field_r = (Sprite) null;
        }
        stackIn_6_0 = (null != ki.field_h) && (pi.field_a == field_l);
        return stackIn_6_0;
    }

    static {
        field_s = "Open";
        field_n = "Researched!";
    }
}
