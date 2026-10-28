/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_b;
    static String field_f;
    volatile boolean focusLost;
    static String field_g;
    static IndexedSprite[] field_a;
    java.awt.Frame frame;
    static int field_h;
    static Js5ArchiveManager field_e;

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLost = true;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "af.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void advanceSessionCounters(int guard) {
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.advanceCounters((byte) -118);
        }
        if (guard != 0) {
          FullscreenFocusCanvas.releaseStatics((byte) -8);
          return;
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard >= 37) {
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_a = (IndexedSprite[]) null;
        field_g = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void pumpEventQueue(byte guard, SystemTaskService taskService, Object source) {
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (taskService.eventQueue == null) {
            return;
          }
          if (guard != -61) {
            return;
          }
          for (int var3_int = 0; 50 > var3_int; var3_int++) {
            if (null != taskService.eventQueue.peekEvent()) {
              AchievementTracker.sleepMillis((byte) -15, 1L);
              continue;
            }
            break;
          }
          try {
            if (source == null) {
              return;
            }
            taskService.eventQueue.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(source, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_19_0 = var3_ref;
          StringBuilder stackIn_19_1 = new StringBuilder().append("af.B(").append(guard).append(',');
          if (taskService == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (source == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void exitFullscreen(SystemTaskService taskService, boolean guard) {
        try {
          FullscreenFocusCanvas.exitFullscreenAndDispose(taskService, this.frame, false);
          if (!guard) {
            field_e = (Js5ArchiveManager) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "af.E(" + (taskService != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    FullscreenFocusCanvas() {
    }

    final static void appendRatingRow(int guard, int firstCount, int secondCount, int thirdCount, int labelIndex, int value) {
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int var6;
        int var7;
        ChatHistorySupport.field_e[AccountTermsPanel.field_J] = labelIndex;
        LegacyStyleNode.field_q[AccountTermsPanel.field_J] = AccountTermsPanel.field_J;
        DualLinkNode.field_k[AccountTermsPanel.field_J] = value;
        if (value < TextLayoutLine.field_e) {
          TextLayout.field_d = value;
        }
        if (ArchiveRequest.field_t >= value) {
          ModeProgressSupport.field_c[AccountTermsPanel.field_J] = firstCount;
          if (guard == 1) {
            RasterSnapshot.field_k[AccountTermsPanel.field_J] = secondCount;
            AccountNoticeDialog.field_fb[AccountTermsPanel.field_J] = thirdCount;
            var6 = thirdCount + secondCount + firstCount;
            if (var6 != 0) {
              stackIn_48_0 = firstCount * 1000 / var6;
            } else {
              stackIn_48_0 = 0;
            }
            var7 = stackIn_48_0;
            Bzip2State.field_v[AccountTermsPanel.field_J] = var7;
            AccountTermsPanel.field_J = AccountTermsPanel.field_J + 1;
            if (var7 < TextLayout.field_d) {
              TextLayout.field_d = var7;
            }
            if (AlternateUsernameCredentials.field_r < var7) {
              AlternateUsernameCredentials.field_r = var7;
            }
            return;
          }
          FullscreenFocusCanvas.appendRatingRow(-7, 8, -13, 15, -127, 46);
          RasterSnapshot.field_k[AccountTermsPanel.field_J] = secondCount;
          AccountNoticeDialog.field_fb[AccountTermsPanel.field_J] = thirdCount;
          var6 = thirdCount + secondCount + firstCount;
          if (var6 != 0) {
            stackIn_35_0 = firstCount * 1000 / var6;
          } else {
            stackIn_35_0 = 0;
          }
          var7 = stackIn_35_0;
        } else {
          AlternateUsernameCredentials.field_r = value;
          ModeProgressSupport.field_c[AccountTermsPanel.field_J] = firstCount;
          if (guard == 1) {
            RasterSnapshot.field_k[AccountTermsPanel.field_J] = secondCount;
            AccountNoticeDialog.field_fb[AccountTermsPanel.field_J] = thirdCount;
            var6 = thirdCount + secondCount + firstCount;
            if (var6 != 0) {
              stackIn_8_0 = firstCount * 1000 / var6;
            } else {
              stackIn_8_0 = 0;
            }
            var7 = stackIn_8_0;
          } else {
            FullscreenFocusCanvas.appendRatingRow(-7, 8, -13, 15, -127, 46);
            RasterSnapshot.field_k[AccountTermsPanel.field_J] = secondCount;
            AccountNoticeDialog.field_fb[AccountTermsPanel.field_J] = thirdCount;
            var6 = thirdCount + secondCount + firstCount;
            if (var6 != 0) {
              stackIn_21_0 = firstCount * 1000 / var6;
            } else {
              stackIn_21_0 = 0;
            }
            var7 = stackIn_21_0;
          }
        }
        Bzip2State.field_v[AccountTermsPanel.field_J] = var7;
        AccountTermsPanel.field_J = AccountTermsPanel.field_J + 1;
        if (var7 < TextLayout.field_d) {
          TextLayout.field_d = var7;
        }
        if (AlternateUsernameCredentials.field_r < var7) {
          AlternateUsernameCredentials.field_r = var7;
        }
    }

    final static void exitFullscreenAndDispose(SystemTaskService taskService, java.awt.Frame frame, boolean visibleAfterExit) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          while (true) {
            SystemTask var3 = taskService.exitFullscreen((byte) 45, frame);
            while (var3.status == 0) {
              AchievementTracker.sleepMillis((byte) 93, 10L);
            }
            if (var3.status != 1) {
              AchievementTracker.sleepMillis((byte) -10, 100L);
              continue;
            }
            break;
          }
          frame.setVisible(visibleAfterExit);
          frame.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("af.C(");
          if (taskService == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (frame == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(visibleAfterExit).append(')').toString());
        }
    }

    static {
        field_b = "Crate location";
        field_f = "Rock busters: ";
        field_g = "Five rock busters";
        field_h = 20;
    }
}
