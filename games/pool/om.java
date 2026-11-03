/*
 * Decompiled by CFR-JS 0.4.0.
 */
class om extends TextWidgetPainter {
    static Sprite field_u;
    static String field_y;
    static int field_w;
    static int field_x;
    static int field_v;
    static String tutorialShotModeLeave;
    static int[] field_s;
    static int[] field_r;

    om(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.maxAscent, -1, 2147483647, false);
    }

    final static double[] a(int param0, double[] param1) {
        RuntimeException var2 = null;
        double[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1[5] = param1[5] * 512.0;
          param1[1] = param1[1] * 288.0;
          param1[0] = param1[0] * 576.0;
          param1[4] = param1[4] * 288.0;
          param1[2] = param1[2] * 512.0;
          param1[3] = param1[3] * 576.0;
          if (param0 > -19) {
            om.a(-59, false);
          }
          param1[5] = param1[5] - 8.0;
          stackIn_3_0 = (double[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("om.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    om(int param0) {
        this(ValidationIconWidget.field_O, param0);
    }

    public final void paintWidget(boolean param0, int param1, byte param2, int param3, UiWidget param4) {
        try {
          if (param0) {
            HotspotTextWidget.a(param4.widgetX + param1, param4.widgetY + param3, param4.widgetHeight, param4.widgetWidth, false);
          }
          int var6_int = 5 / ((2 - param2) / 41);
          super.paintWidget(param0, param1, (byte) -73, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "om.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        int var4;
        int var4Lifetime1;
        if (param1 == 0) {
          if (~param0 == ~BallDebugOverlay.field_i) {
            var4 = 101 % ((59 - param3) / 59);
            if (param1 != 1) {
              if (2 == param1) {
                if (~ResourceArchive.field_e == ~param0) {
                  return;
                }
                lf.field_c = true;
                ResourceArchive.field_e = param0;
                mj.a(param2, 27712);
              }
              return;
            }
            if (param0 != ol.field_e) {
              ol.field_e = param0;
              lf.field_c = true;
              mj.a(param2, 27712);
            }
            if (2 != param1) {
              return;
            }
            if (~ResourceArchive.field_e != ~param0) {
              lf.field_c = true;
              ResourceArchive.field_e = param0;
              mj.a(param2, 27712);
            }
            return;
          }
          lf.field_c = true;
          BallDebugOverlay.field_i = param0;
          mj.a(param2, 27712);
        }
        var4Lifetime1 = 101 % ((59 - param3) / 59);
        if (param1 == 1 &&
          param0 != ol.field_e) {
          ol.field_e = param0;
          lf.field_c = true;
          mj.a(param2, 27712);
        }
        if (2 == param1) {
          if (~ResourceArchive.field_e == ~param0) {
            return;
          }
          lf.field_c = true;
          ResourceArchive.field_e = param0;
          mj.a(param2, 27712);
        }
    }

    public static void releaseStatics(byte param0) {
        tutorialShotModeLeave = null;
        int var1 = 111 / ((param0 - 40) / 61);
        field_y = null;
        field_u = null;
        field_s = null;
        field_r = null;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        boolean stackIn_26_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_51_0 = false;
        boolean stackIn_76_0 = false;
        boolean stackIn_100_0 = false;
        boolean stackIn_127_0 = false;
        int stackIn_141_0 = 0;
        boolean stackIn_146_0 = false;
        boolean stackIn_158_0 = false;
        if (null != AccountContentDialog.field_ub) {
          AccountContentDialog.field_ub.a(param1, -29423);
        }
        var2 = 36 / ((param0 - 1) / 45);
        if (TextWidgetPainter.field_e == null) {
          if (TranslatedUiText.field_d &&
            jc.field_c) {
            if (MidiNoteMixer.field_v &&
              DualLinkNode.field_p) {
              stackIn_141_0 = 1;
            } else {
              stackIn_141_0 = 0;
            }
            var3 = stackIn_141_0;
            stackIn_146_0 = (param1) && (cp.a((byte) 82)) && (var3 == 0);
            ViewportController.a(stackIn_146_0, (byte) 50);
            if (var3 != 0) {
              stackIn_158_0 = (param1) && (cp.a((byte) 98));
              FadingDialog.a(stackIn_158_0, 1);
            }
          }
          if (null != AccountContentDialog.field_ub) {
            AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
          }
        } else {
          TextWidgetPainter.field_e.a(param1, -29423);
          if (!TranslatedUiText.field_d) {
            if (null == AccountContentDialog.field_ub) {
              if (null == TextWidgetPainter.field_e) {
                return;
              }
              TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
              return;
            }
            AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
            if (null != TextWidgetPainter.field_e) {
              TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
            }
            return;
          }
          if (!jc.field_c) {
            if (null == AccountContentDialog.field_ub) {
              if (null == TextWidgetPainter.field_e) {
                return;
              }
              TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
              return;
            }
            AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
            if (null != TextWidgetPainter.field_e) {
              TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
            }
            return;
          }
          if (!MidiNoteMixer.field_v) {
            var3 = 0;
            stackIn_26_0 = (param1) && (cp.a((byte) 82)) && (var3 == 0);
            ViewportController.a(stackIn_26_0, (byte) 50);
            if (var3 != 0) {
              stackIn_32_0 = (param1) && (cp.a((byte) 98));
              FadingDialog.a(stackIn_32_0, 1);
            }
            if (null != AccountContentDialog.field_ub) {
              AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
            }
          } else {
            if (!DualLinkNode.field_p) {
              var3 = 0;
              stackIn_45_0 = (param1) && (cp.a((byte) 82)) && (var3 == 0);
              ViewportController.a(stackIn_45_0, (byte) 50);
              if (var3 != 0) {
                stackIn_51_0 = (param1) && (cp.a((byte) 98));
                FadingDialog.a(stackIn_51_0, 1);
              }
              if (null == AccountContentDialog.field_ub) {
                if (null == TextWidgetPainter.field_e) {
                  return;
                }
                TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
                return;
              }
              AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
              if (null != TextWidgetPainter.field_e) {
                TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
              }
              return;
            }
            var3 = 1;
            if (!param1) {
              ViewportController.a(false, (byte) 50);
              if (var3 == 0) {
                if (null != AccountContentDialog.field_ub) {
                  AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
                  if (null != TextWidgetPainter.field_e) {
                    TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
                  }
                  return;
                }
              } else {
                stackIn_76_0 = (param1) && (cp.a((byte) 98));
                FadingDialog.a(stackIn_76_0, 1);
                if (null != AccountContentDialog.field_ub) {
                  AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
                }
              }
            } else {
              if (!cp.a((byte) 82)) {
                ViewportController.a(false, (byte) 50);
                if (var3 == 0) {
                  if (null != AccountContentDialog.field_ub) {
                    AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
                    if (null != TextWidgetPainter.field_e) {
                      TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
                    }
                    return;
                  }
                } else {
                  stackIn_100_0 = (param1) && (cp.a((byte) 98));
                  FadingDialog.a(stackIn_100_0, 1);
                  if (null != AccountContentDialog.field_ub) {
                    AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
                  }
                }
              } else {
                ViewportController.a((var3 == 0), (byte) 50);
                if (var3 != 0) {
                  stackIn_127_0 = (param1) && (cp.a((byte) 98));
                  FadingDialog.a(stackIn_127_0, 1);
                }
                if (null != AccountContentDialog.field_ub) {
                  AccountContentDialog.field_ub.drawDebugOverlay(300, param1);
                }
              }
            }
          }
        }
        if (null == TextWidgetPainter.field_e) {
          return;
        }
        TextWidgetPainter.field_e.drawDebugOverlay(300, param1);
    }

    static {
        tutorialShotModeLeave = "To <u=ffffff>leave shot mode</u>, press <img=4> <col=99ff99>'SPACE'</col>, or <img=0> click away from the cue ball.";
    }
}
