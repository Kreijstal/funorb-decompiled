/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends MessageDialog implements ButtonActivationListener {
    private qh field_tb;
    private boolean field_vb;
    static String field_sb;
    private boolean field_wb;
    static int avatarTintStartColor;

    public static void r(int param0) {
        int var1 = -70 / ((param0 - 27) / 48);
        field_sb = null;
    }

    final static void a(String param0, byte param1, boolean param2, String param3) {
        try {
            b.field_a = param0;
            hg.field_d = param3;
            int var4_int = -62 % ((13 - param1) / 62);
            fa.showMessageDialog(rj.loggingInText, 480, param2);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, sl param1, byte param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ni var5 = null;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          this.field_wb = true;
          if (param2 > -21) {
            field_sb = (String) null;
          }
          if (!param1.field_g) {
            if (null == param1.field_a) {
              var4 = param1.field_e;
              if (param1.field_j == 248) {
                if (!param0) {
                  cf.h(-65);
                }
                this.field_vb = true;
                var4 = hi.createIneligibleText;
              }
            } else {
              var4 = ResourceArchive.createUsernameUnavailableText;
              if (null != this.field_tb) {
                this.field_tb.a((byte) 83);
              }
            }
          } else {
            var4 = lh.createAccountSuccessText;
          }
          var5 = new ni((MessageDialog) (this), hh.field_c, var4);
          if (param1.field_g) {
            if (param1.field_d) {
              this.replaceContent(new s((r) (this)), -111);
              return;
            }
            var5.a(-2, cl.continueText, (WidgetListener) (this));
          } else {
            if (!this.field_vb) {
              if (param1.field_j == 5) {
                var5.a(TriangleMesh.reloadGameText, 1, 11);
                var5.a(rj.quitToWebsiteText, 1, 17);
              } else {
                var5.a(ll.backText, 1, -1);
              }
            } else {
              var5.a(-2, cl.continueText, (WidgetListener) (this));
            }
            if (param1.field_j == 3) {
              var5.a(WidgetContainer.toServerListText, 1, 7);
            } else {
              if (6 == param1.field_j) {
                var5.a(jc.toCustomerSupportText, 1, 9);
              }
            }
          }
          this.replaceContent(var5, -36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("r.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    r(DialogLayer param0, qh param1) {
        super(param0, hh.field_c, se.creatingYourAccountText, false, false);
        try {
            this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static nd a(String param0, boolean param1) {
        nd stackIn_4_0 = null;
        nd stackIn_8_0 = null;
        nd stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        nd stackIn_27_0 = null;
        nd stackIn_41_0 = null;
        nd stackIn_46_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = InstrumentNoteMask.field_f;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = ButtonWidget.field_x;
            return stackIn_8_0;
          }
          if (34 == param0.charAt(0)) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_13_0 = ii.field_h;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if ((var5 == 34) &&
                    (var3 == 0)) {
                  stackIn_27_0 = ii.field_h;
                  return stackIn_27_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            L1: {
              var5 = param0.charAt(var4);
              if (var5 == 46) {
                if ((0 != var4) &&
                    (var4 != -1 + var2_int) &&
                    (var3 == 0)) {
                  var3 = 1;
                  break L1;
                }
                stackIn_41_0 = ii.field_h;
                return stackIn_41_0;
              }
              if (rd.field_w.indexOf(var5) == -1) {
                stackIn_46_0 = ii.field_h;
                return stackIn_46_0;
              }
              var3 = 0;
            }
          }
          if (param1) {
            return null;
          }
          field_sb = (String) null;
          stackIn_52_0 = null;
          return (nd) (stackIn_52_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("r.B(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final void q(int param0) {
        this.a(true, ig.a(hi.createIneligibleText, 248, false), (byte) -57);
        if (param0 != 12086) {
            this.field_wb = false;
        }
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        if (!(!this.field_vb)) {
            b.a(true, false, false);
            return;
        }
        if (param1 != -20) {
            return;
        }
        try {
            ki.a(-112);
            this.dismissDialog((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        sl var2 = null;
        if (param0 != -1) {
            field_sb = (String) null;
        }
        if ((this.dialogVisible) &&
            (!(this.field_wb))) {
            var2 = MatchingTextValidator.d((byte) 93);
            if (!(var2 == null)) {
                this.a(false, var2, (byte) -69);
            }
        }
        return super.advanceDialogAnimation(-1);
    }

    static {
        field_sb = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
