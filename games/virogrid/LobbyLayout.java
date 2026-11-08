/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyLayout {
    static String field_a;
    TabbedPanel field_c;
    static SpriteWidget field_b;
    static String field_d;

    final void layoutLobbyPanels(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_c.setBoundsAndLayout(var6, param3, param4, param0 - 22397, var7, param1, param2);
        GuestPlayHelpers.field_e.setGeometry(0, LobbySortHelpers.field_e, StripedProgressBar.field_E.field_K, (byte) -90, 0);
        LobbyJoinTextGlobals.field_c.setGeometry(0, 18, StripedProgressBar.field_E.field_K + (-PendingScoreQuery.field_k - 2 - 82), (byte) -65, LobbySortHelpers.field_e + 2);
        if (param0 != 36) {
          LobbyLayout.shouldRunGameScreen((byte) 30);
        }
        DualLinkNode.field_m.setGeometry(-80 - PendingScoreQuery.field_k + (StripedProgressBar.field_E.field_K - 2), 18, PendingScoreQuery.field_k + 82, (byte) -45, 2 + LobbySortHelpers.field_e);
        EmailValidator.field_q.setBoundsAndLayout(StripedProgressBar.field_E.field_K, 0, 2, -20 + (-2 - LobbySortHelpers.field_e + StripedProgressBar.field_E.field_ub), PendingScoreQuery.field_k, 20 + (2 + LobbySortHelpers.field_e), 20, 0);
        SharedTextGlobals.field_a.layoutPaneFooter(PendingScoreQuery.field_k, 2, 20, 0);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    final static LogoAndLoginHelpers validateDigitsOnly(boolean param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        LogoAndLoginHelpers stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (!param0) {
            field_a = (String) null;
          }
          stackIn_13_0 = WidgetStyleLayer.field_f;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("jm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void setViewportOrigin(int param0, int param1, int param2) {
        if (param2 != -2) {
          field_b = (SpriteWidget) null;
        }
        NodeHashTableIterator.field_b = param0;
        CameraProjectionMath.field_a = param0;
        QueuedListRequest.field_g = param1;
        CameraProjectionMath.field_b = param1;
        TriangleRasterizer.setProjectionCenter(param0, param1);
    }

    final static void setLobbyPanelX(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 != -102) {
          field_b = (SpriteWidget) null;
        }
        EmailDomainValidationHelpers.field_c = param0;
        if (Bzip2State.field_D != EmailValidator.field_t) {
          var2 = EmailValidator.field_t * EmailValidator.field_t;
          var3 = -(Bzip2State.field_D * Bzip2State.field_D) + var2;
          param0 = param0 + (-param0 + IntrusiveDeque.field_h) * var3 / var2;
        }
        ClientEnvironmentHelpers.field_c.setGeometry(BitwiseHelpers.field_f, 120, 640, (byte) -120, param0);
        DialWidgetPainter.layoutQuickChatRoot((byte) 117, 5, 640, PopupMenuDrawHelpers.field_d, 0, -24 + IntrusiveDeque.field_h, ConnectionStage.field_b);
    }

    final static boolean isIntegerInRadix(int param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (2 <= param0 &&
            36 >= param0) {
            var4_int = 0;
            if (param1 <= 85) {
              LobbyLayout.releaseStatics(88);
            }
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param2))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param0 * var6 + var9;
                if (var6 != var10 / param0) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("jm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    LobbyLayout(String param0, SpriteWidget param1) {
        String[] var3 = null;
        SpriteWidget[] var4 = null;
        try {
          var3 = new String[]{param0, ValidationMessageWidget.field_Y, DirectByteStorage.field_k};
          var4 = new SpriteWidget[]{param1, StripedProgressBar.field_E, (SpriteWidget) ((Object) SharedTextGlobals.field_a)};
          this.field_c = new TabbedPanel(0L, EmailValidator.field_w, var3, WeightedLruCache.field_h, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean shouldRunGameScreen(byte param0) {
        int var1;
        boolean stackIn_5_0 = false;
        var1 = -125 / ((58 - param0) / 50);
        stackIn_5_0 = (TextMeasureHelpers.field_b) || (VerticalScrollbar.isGuestSession(20));
        return stackIn_5_0;
    }

    final static void blendHalfSpan(int param0, int[] param1, int param2, boolean param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (param0 < 0) {
              if (!param3) {
                field_a = (String) null;
              }
              return;
            }
            var9 = param1;
            var5 = var9;
            var6 = param2;
            var7 = param4;
            var9[var6] = var7 + WidgetFactoryHelpers.bitAnd(8355711, var9[var6] >> 1);
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("jm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = "Connection lost - attempting to reconnect";
        field_d = "Quit";
    }
}
