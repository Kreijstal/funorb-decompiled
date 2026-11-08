/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordInputPainter extends TextInputPainter {
    static NameEntryPopup field_C;
    static Sprite field_z;
    static int field_D;
    static String tickerHintZoom;
    static String gameoptNeedrating;
    static String gameoptPlayerneedsratedgames;

    public static void releaseStatics(int param0) {
        field_z = null;
        tickerHintZoom = null;
        gameoptPlayerneedsratedgames = null;
        gameoptNeedrating = null;
        if (param0 != 2) {
          gameoptPlayerneedsratedgames = (String) null;
        }
        field_C = null;
    }

    private PasswordInputPainter(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    PasswordInputPainter(int param0) {
        this(ValidationIconWidget.field_O, param0);
    }

    final static boolean d(int param0) {
        int var1;
        int var2;
        int var3;
        int var1Lifetime1;
        var3 = Pool.field_O;
        if (param0 != -18791) {
          PasswordInputPainter.d(72);
        }
        if (!TextLineLayout.field_c[86]) {
          return false;
        }
        var1 = -1;
        var2 = IterableDualLinkDeque.field_a;
        if (var2 == 16) {
          var1Lifetime1 = 0;
        } else {
          if (var2 != 17) {
            if (var2 == 18) {
              var1Lifetime1 = 2;
            } else {
              if (19 == var2) {
                var1Lifetime1 = 3;
              } else {
                if (var2 == 20) {
                  var1Lifetime1 = 4;
                } else {
                  if (var2 != 21) {
                    if (22 != var2) {
                      if (var2 != 23) {
                        if (var2 == 24) {
                          var1Lifetime1 = 8;
                        } else {
                          if (25 != var2) {
                            return false;
                          }
                          var1Lifetime1 = 9;
                        }
                      } else {
                        var1Lifetime1 = 7;
                      }
                    } else {
                      var1Lifetime1 = 6;
                    }
                  } else {
                    var1Lifetime1 = 5;
                  }
                }
              }
            }
          } else {
            var1Lifetime1 = 1;
          }
        }
        if (TextLineLayout.field_c[81]) {
          var1Lifetime1 += 10;
        }
        if (TextLineLayout.field_c[82]) {
          var1Lifetime1 += 20;
        }
        LinkButtonPainter.field_i = LinkButtonPainter.field_i ^ 1L << var1Lifetime1;
        MusicCrossfadeStream.a(0, var1Lifetime1);
        return true;
    }

    final String getWidgetText(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = LimitedRandomAccessFile.a(param1.widgetText.length(), 0, '*');
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sm.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void bounceBallOffCushion(int param0, CushionSegment param1, int param2, Ball param3) {
        int fieldTemp$0 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_3;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        long var9 = 0L;
        long var9Lifetime1;
        try {
          if (param2 <= 111) {
            return;
          }
          param3.advanceTo(param0 - 1, 118);
          var4_int = -param1.startY + param1.endY >> 8;
          var5 = param1.startX - param1.endX >> 8;
          var6 = AccountDisplayNameSupport.sqrtScaled256(NameEntryPopup.multiplyFixed16(var4_int, false, var4_int) + NameEntryPopup.multiplyFixed16(var5, false, var5), -123);
          var4_int = ArchiveProvider.divideFixed16(var6, (byte) -101, (long)var4_int);
          var5 = ArchiveProvider.divideFixed16(var6, (byte) -61, (long)var5);
          var7 = param3.horizontalSpeedSquared(-14770);
          if (param1.endX != param1.startX) {
            if (param1.endY != param1.startY) {
              var9 = (long)(NameEntryPopup.multiplyFixed16(param3.velocityX, false, var4_int) + NameEntryPopup.multiplyFixed16(param3.velocityY, false, var5));
              param3.velocityX = (int)((long)param3.velocityX - (FullscreenFocusCanvas.multiplyFixedChecked((long)var4_int, var9, false) * (long)(256 + FullscreenDisplayMode.field_g) >> 8));
              param3.velocityY = (int)((long)param3.velocityY - (FullscreenFocusCanvas.multiplyFixedChecked((long)var5, var9, false) * (long)(256 + FullscreenDisplayMode.field_g) >> 8));
              param3.angularVelocityY = 0;
              param3.angularVelocityX = 0;
              if (Base37Support.field_b < BrowserCookieWriter.field_e.length) {
                BrowserCookieWriter.field_e[Base37Support.field_b][0] = -(524288 * var4_int) + param3.positionX;
                BrowserCookieWriter.field_e[Base37Support.field_b][1] = param3.positionY - var5 * 524288;
                BrowserCookieWriter.field_e[Base37Support.field_b][2] = -524288;
              }
            } else {
              param3.angularVelocityX = -(param3.angularVelocityX * MusicPatchEnvelope.field_m) >> 8;
              param3.angularVelocityY = param3.angularVelocityY * MusicPatchEnvelope.field_m >> 8;
              param3.velocityY = -(FullscreenDisplayMode.field_g * param3.velocityY) >> 8;
              if (Base37Support.field_b < BrowserCookieWriter.field_e.length) {
                BrowserCookieWriter.field_e[Base37Support.field_b][0] = param3.positionX;
                stackIn_12_0 = BrowserCookieWriter.field_e[Base37Support.field_b];
                stackIn_12_1 = 1;
                stackIn_12_2 = param3.positionY;
                if (param3.positionY > param1.startY) {
                  stackIn_13_3 = 524288;
                } else {
                  stackIn_13_3 = -524288;
                }
                stackIn_12_0[stackIn_12_1] = stackIn_12_2 + stackIn_13_3;
                BrowserCookieWriter.field_e[Base37Support.field_b][2] = -524288;
              }
            }
          } else {
            param3.angularVelocityX = param3.angularVelocityX * MusicPatchEnvelope.field_m >> 8;
            param3.velocityX = -(param3.velocityX * FullscreenDisplayMode.field_g) >> 8;
            param3.angularVelocityY = -(MusicPatchEnvelope.field_m * param3.angularVelocityY) >> 8;
            if (Base37Support.field_b < BrowserCookieWriter.field_e.length) {
              stackIn_6_0 = BrowserCookieWriter.field_e[Base37Support.field_b];
              stackIn_6_1 = 0;
              if (param3.positionX > param1.startX) {
                stackIn_7_2 = 524288;
              } else {
                stackIn_7_2 = -524288;
              }
              stackIn_6_0[stackIn_6_1] = stackIn_7_2 + param3.positionX;
              BrowserCookieWriter.field_e[Base37Support.field_b][1] = param3.positionY;
              BrowserCookieWriter.field_e[Base37Support.field_b][2] = -524288;
            }
          }
          param3.angularVelocityZ = MusicPatchEnvelope.field_m * param3.angularVelocityZ >> 8;
          param3.motionState = 1;
          var9Lifetime1 = param3.horizontalSpeedSquared(-14770);
          if (Base37Support.field_b < SoundCache.field_g.length) {
            fieldTemp$0 = Base37Support.field_b;
            Base37Support.field_b = Base37Support.field_b + 1;
            SoundCache.field_g[fieldTemp$0] = (int)(var7 - var9Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("sm.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static LoginResponse a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        LoginResponse stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -40 / ((param1 - 36) / 53);
          if (IntegerRecordProtocolSupport.field_e == TimeTrialSelectScreen.field_I) {
            stackIn_2_0 = null;
            return (LoginResponse) (stackIn_2_0);
          }
          if (Base37Support.field_f == TimeTrialSelectScreen.field_I &&
            param0.equals(ClientUiResourceState.field_c)) {
            TimeTrialSelectScreen.field_I = IntrusiveDequeCursor.field_c;
            stackIn_6_0 = PoolMatchController.field_gb;
            return stackIn_6_0;
          }
          ClientUiResourceState.field_c = param0;
          PoolMatchController.field_gb = null;
          TimeTrialSelectScreen.field_I = IntegerRecordProtocolSupport.field_e;
          stackIn_8_0 = null;
          return (LoginResponse) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("sm.FA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        tickerHintZoom = "Use the mouse wheel <img=1> or drag <img=11><img=0> to zoom in and out.";
        gameoptNeedrating = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        gameoptPlayerneedsratedgames = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
