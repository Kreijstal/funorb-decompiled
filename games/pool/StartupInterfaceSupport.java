/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StartupInterfaceSupport {
    static Sprite field_c;
    static String next;
    static IntrusiveDeque field_b;
    static int field_a;
    static int field_e;

    final static void a(byte param0, String param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          PauseMenuScreen.field_J = PauseMenuScreen.field_J + 1;
          if (param0 != 70) {
            StartupInterfaceSupport.a((byte) 11);
          }
          if (DebugTuningSlider.field_i == -1 &&
            -1 == DebouncedValidationProvider.field_g) {
            DebouncedValidationProvider.field_g = DebouncedValidationProvider.field_f;
            DebugTuningSlider.field_i = ReflectionReplySupport.field_i;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (MessageScreen.field_I == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(MessageScreen.field_I));
          }
          if (decompiledFrameRemainder0) {
            if (!BrowserCookieWriter.field_d) {
              if (CompressedContainerSupport.field_c <= PauseMenuScreen.field_J) {
                stackIn_18_0 = (PauseMenuScreen.field_J < ParticleTrail.field_d + CompressedContainerSupport.field_c) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_18_0;
            if (param1 != null) {
              if (BrowserCookieWriter.field_d) {
                PauseMenuScreen.field_J = CompressedContainerSupport.field_c;
                decompiledFrameRemainder1 = false;
              }
              else {
                if (var2_int != 0) {
                  PauseMenuScreen.field_J = CompressedContainerSupport.field_c;
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              PauseMenuScreen.field_J = 0;
            }
            if (param1 == null) {
              if (var2_int != 0) {
                BrowserCookieWriter.field_d = true;
              }
            } else {
              BrowserCookieWriter.field_d = false;
            }
            MouseWheelInput.field_b = DebugTuningSlider.field_i;
            MatchingTextValidator.field_n = DebouncedValidationProvider.field_g;
          }
          MessageScreen.field_I = param1;
          if (!BrowserCookieWriter.field_d &&
            PauseMenuScreen.field_J < CompressedContainerSupport.field_c &&
            LoginPayload.field_c) {
            MatchingTextValidator.field_n = DebouncedValidationProvider.field_g;
            MouseWheelInput.field_b = DebugTuningSlider.field_i;
            PauseMenuScreen.field_J = 0;
          }
          if (BrowserCookieWriter.field_d &&
            ChatPanelSupport.field_e == PauseMenuScreen.field_J) {
            BrowserCookieWriter.field_d = false;
            PauseMenuScreen.field_J = 0;
          }
          DebugTuningSlider.field_i = -1;
          DebouncedValidationProvider.field_g = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ue.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (TabbedPane.field_Ub != null) {
          TabbedPane.field_Ub.settleDialogAnimations(11741);
        }
        if (null != ScrollPane.field_Nb) {
          ScrollPane.field_Nb.stopNormalAnimation(0);
          ByteArrayPool.resetTooltipState(param0);
          return;
        }
        ByteArrayPool.resetTooltipState(param0);
    }

    final static boolean a(int param0) {
        if (param0 == 11) {
          LoginPayloadFactory.field_f = true;
          MenuSelection.field_k = MonotonicClock.monotonicTimeMillis((byte) -110) + 15000L;
          return 11 == PlasmaTableScene.field_ab ? true : false;
        }
        return false;
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        next = null;
        field_b = null;
        if (param0) {
          String var2 = (String) null;
          StartupInterfaceSupport.a((byte) 106, (String) null);
        }
    }

    final static boolean a(byte param0) {
        if (param0 > -70) {
          field_e = -55;
          if (QuickChatCategoryDefinition.field_y < 20) {
            return true;
          }
          if (!DebouncedValidationProvider.isAccountFlowReady(true)) {
            return true;
          }
          if (0 >= Js5Transport.field_l) {
            return false;
          }
          if (!RasterStateSupport.acceptsClientGuard(-128)) {
            return true;
          }
          return false;
        }
        if (QuickChatCategoryDefinition.field_y < 20) {
          return true;
        }
        if (!DebouncedValidationProvider.isAccountFlowReady(true)) {
          return true;
        }
        if (0 >= Js5Transport.field_l) {
          return false;
        }
        if (!RasterStateSupport.acceptsClientGuard(-128)) {
          return true;
        }
        return false;
    }

    static {
        next = "Next";
        field_e = 2048;
        field_b = new IntrusiveDeque();
    }
}
