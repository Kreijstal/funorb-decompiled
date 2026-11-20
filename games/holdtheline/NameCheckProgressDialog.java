/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameCheckProgressDialog extends AccountProgressDialog implements ButtonActionListener {
    private boolean field_wb;
    static String field_zb;
    private AccountCreationForm field_sb;
    private boolean field_yb;
    static Sprite[] field_Ab;
    static String field_ub;
    static String field_xb;
    static int field_Bb;
    static String field_tb;
    static Sprite field_vb;

    final boolean updateAnimation(byte param0) {
        if (!this.visible) {
          if (param0 == 39) {
            return super.updateAnimation((byte) 39);
          }
          return false;
        }
        if (this.field_wb) {
          if (param0 == 39) {
            return super.updateAnimation((byte) 39);
          }
          return false;
        }
        NameAvailabilityResult var2 = PacketBuffer.pollNameAvailabilityResult((byte) -67);
        if (var2 == null) {
          if (param0 == 39) {
            return super.updateAnimation((byte) 39);
          }
          return false;
        }
        this.showNameCheckResult((byte) 100, false, var2);
        if (param0 == 39) {
          return super.updateAnimation((byte) 39);
        }
        return false;
    }

    private final void showNameCheckResult(byte param0, boolean param1, NameAvailabilityResult param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        MessagePanel var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          this.field_wb = true;
          var6 = 74 / ((7 - param0) / 34);
          if (!param2.field_f) {
            if (null != param2.field_j) {
              var4 = BufferedRandomAccessFile.field_j;
              if (this.field_sb != null) {
                this.field_sb.onMoreSuggestionsRequested((byte) 125);
              }
            } else {
              var4 = param2.field_d;
              if (param2.field_b == 248) {
                if (!param1) {
                  MatchingTextValidator.persistLegacySession(true);
                }
                var4 = NineSlicePanel.field_e;
                this.field_yb = true;
              }
            }
          } else {
            var4 = MessagePanel.field_H;
          }
          var5 = new MessagePanel((AccountProgressDialog) (this), DisplayNameForm.field_I, var4);
          if (param2.field_f) {
            if (param2.field_i) {
              this.setContent((UiWidget) (new AccountTermsPanel(this)), (byte) 126);
              return;
            }
            var5.addButton(112, (WidgetListener) (this), ImageProducerRasterBuffer.field_j);
          } else {
            if (this.field_yb) {
              var5.addButton(81, (WidgetListener) (this), ImageProducerRasterBuffer.field_j);
            } else {
              if (param2.field_b == 5) {
                var5.addActionButton(11, NineSlicePanel.field_b, (byte) 66);
                var5.addActionButton(17, UrlPacketDownloader.field_n, (byte) 120);
              } else {
                var5.addActionButton(-1, ArchiveIndex.field_i, (byte) 108);
              }
            }
            if (param2.field_b == 3) {
              var5.addActionButton(7, CheckboxRenderer.field_u, (byte) 61);
            } else {
              if (param2.field_b == 6) {
                var5.addActionButton(9, Bzip2State.field_d, (byte) 77);
              }
            }
          }
          this.setContent((UiWidget) (var5), (byte) 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("vm.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_Ab = null;
        if (param0 == -7) {
          field_xb = null;
          field_ub = null;
          field_tb = null;
          field_zb = null;
          field_vb = null;
          return;
        }
        field_ub = (String) null;
        field_xb = null;
        field_ub = null;
        field_tb = null;
        field_zb = null;
        field_vb = null;
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        NameAvailabilityResult var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_yb) {
            TutorialAction.showLoginForm((byte) -93, true, false);
            return;
          }
          RoadControlPathBuilder.beginStoredLogin(true);
          if (param2 != -4) {
            var7 = (NameAvailabilityResult) null;
            this.showNameCheckResult((byte) 98, true, (NameAvailabilityResult) null);
            this.closeProgressDialog((byte) -72);
          } else {
            this.closeProgressDialog((byte) -72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("vm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void completeIneligibleAccount(int param0) {
        if (param0 > -113) {
          return;
        }
        this.showNameCheckResult((byte) -39, true, ChatMessage.createNameAvailabilityResult(NineSlicePanel.field_e, 256, 248));
    }

    NameCheckProgressDialog(DialogLayer param0, AccountCreationForm param1) {
        super(param0, DisplayNameForm.field_I, PointLight.field_o, false, false);
        try {
          this.field_sb = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_zb = "<br>Lap: ";
        field_ub = "Unable to connect to the data server. Please check any firewall you are using.";
        field_Bb = 0;
        field_tb = "<col=2>Not complete</col>";
        field_xb = "<img=0>, <img=7>";
    }
}
