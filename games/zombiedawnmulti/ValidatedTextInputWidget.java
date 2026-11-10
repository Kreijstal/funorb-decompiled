/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextInputWidget extends TextInputWidget implements ValidationProviderSource {
    static MouseInputHandler field_Z;
    private ValidationProvider field_ab;
    static SpriteHotspot[] field_bb;
    private int field_Y;
    static String field_cb;

    final void updatePointerState(int param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointerState(param0 + 0, param1, param2, param3);
          if (param0 != -5407) {
            field_cb = (String) null;
          }
          this.field_Y = -this.field_y + MouseInputHandler.field_g - param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "on.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_bb = null;
        field_cb = null;
        field_Z = null;
        if (param0 != 29829) {
          ValidatedTextInputWidget.findLobbyGame(true, 18);
        }
    }

    final static LobbyGame findLobbyGame(boolean param0, int param1) {
        if (!param0) {
          return null == MeshMaterial.field_h ? null : (LobbyGame) (MeshMaterial.field_h.findByKey((long)param1, -22877));
        }
        ValidatedTextInputWidget.releaseStatics(47);
        return null == MeshMaterial.field_h ? null : (LobbyGame) (MeshMaterial.field_h.findByKey((long)param1, -22877));
    }

    final static String chooseClickPrompt(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        if (param0) {
          return PlayingSound.field_n[var4];
        }
        field_cb = (String) null;
        return PlayingSound.field_n[var4];
    }

    public final ValidationProvider getValidationProvider(byte param0) {
        int var2 = -13 / ((0 - param0) / 43);
        return this.field_ab;
    }

    ValidatedTextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final void setValidationProvider(byte param0, ValidationProvider param1) {
        try {
          this.field_ab = param1;
          if (param0 != -27) {
            this.getValidationProvider((byte) -17);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "on.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int sine(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param1 == -18924) {
          param0 = param0 & 8191;
          if (param0 >= 4096) {
            if (6144 <= param0) {
              stackIn_19_0 = -PortalView.field_K[8192 - param0];
            } else {
              stackIn_19_0 = -PortalView.field_K[-4096 + param0];
            }
            return stackIn_19_0;
          }
          if (param0 >= 2048) {
            stackIn_15_0 = PortalView.field_K[4096 - param0];
          } else {
            stackIn_15_0 = PortalView.field_K[param0];
          }
          return stackIn_15_0;
        }
        field_cb = (String) null;
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          if (6144 <= param0) {
            stackIn_9_0 = -PortalView.field_K[8192 - param0];
          } else {
            stackIn_9_0 = -PortalView.field_K[-4096 + param0];
          }
          return stackIn_9_0;
        }
        if (param0 >= 2048) {
          stackIn_5_0 = PortalView.field_K[4096 - param0];
        } else {
          stackIn_5_0 = PortalView.field_K[param0];
        }
        return stackIn_5_0;
    }

    final void notifyTextChanged(int param0) {
        super.notifyTextChanged(param0);
        if (null != this.field_ab) {
          this.field_ab.resetValidationDelay(-1306);
        }
    }

    final String getHoverText(byte param0) {
        if (!this.field_l) {
          return null;
        }
        if (this.field_x != null) {
          EffectResistedEvent.setTooltipAnchor(LoginMethod.field_d, MouseInputHandler.field_g - this.field_Y + this.field_n, (byte) -76);
          int var2 = 30 % ((param0 - 53) / 57);
          return this.field_x;
        }
        return null;
    }

    final static void dismissNoticeBar(byte param0) {
        DiskCacheWorker.field_b = -1;
        if (param0 > 43) {
          WidgetContainer.field_E = 0;
          WeightedLruCache.field_g = false;
          MusicCrossfadeStream.field_m = 0;
          return;
        }
        ValidatedTextInputWidget.chooseClickPrompt(true, true, false, true);
        WidgetContainer.field_E = 0;
        WeightedLruCache.field_g = false;
        MusicCrossfadeStream.field_m = 0;
    }

    static {
        field_Z = new MouseInputHandler();
        field_cb = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
