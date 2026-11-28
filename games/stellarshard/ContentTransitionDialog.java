/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalDialog {
    private AlphaWidgetContainer field_Q;
    private int field_bb;
    static boolean field_ab;
    static volatile int field_R;
    private rd field_X;
    private int field_U;
    private int field_V;
    private int field_Z;
    private UiWidget field_Y;
    static String field_W;
    private int field_S;
    static String field_T;
    static int[] field_P;

    boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_Q == null) {
            return false;
          }
          if (param1 == 98) {
            this.field_Q.takeFocus(-2147483648, param3);
          }
          if (param1 == 99) {
            this.field_Q.takeFocus(param0 ^ -2147453991, param3);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wl.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void finishResize(int param0) {
        if (this.field_X != null) {
          if (this.field_X != cj.field_b) {
            this.setCenteredSize(12 + this.field_Y.field_p, (byte) -68, 12 + (this.field_Z + this.field_Y.field_t));
            this.installContent(9, this.field_Y);
          }
          this.field_X = null;
          this.field_Q.field_A = 256;
        }
        super.finishResize(param0);
    }

    final static void l(int param0) {
        o.field_g = null;
        RichTextLayout.field_g = null;
        PcmResampler.field_g = false;
        if (param0 == -12128) {
          bb.field_k = null;
          ArchiveNetworkClient.field_e = null;
          return;
        }
        field_ab = false;
        bb.field_k = null;
        ArchiveNetworkClient.field_e = null;
    }

    final void resizeCompleted(int param0) {
        if (this.field_X == hj.field_d) {
          return;
        }
        this.field_U = 0;
        this.field_X = cj.field_b;
        if (param0 == -21) {
          this.installContent(-94, this.field_Y);
          this.field_Q.field_A = 0;
          this.field_Y = null;
          return;
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        try {
          SpriteState.field_r = false;
          ProgressMessageDialog.field_db = false;
          if (param1 != -8440) {
            String var4 = (String) null;
            ContentTransitionDialog.a(-111, -58, (String) null);
          }
          if (ModalDialogHost.field_G != null &&
            ModalDialogHost.field_G.field_G) {
            var3_int = 1;
            if (8 != param0) {
            } else {
              if (SoundCache.field_a) {
                param2 = ce.field_g;
              } else {
                param2 = dd.field_f;
              }
              param0 = 2;
              af.field_r.setAccountAndClearPassword(FullscreenFocusCanvas.field_a, 15);
            }
            if (param0 == 10) {
              var3_int = 0;
              Quaternion.a(false);
            }
            if (var3_int != 0) {
              if (SpriteState.field_r) {
                param2 = h.a(AlphaWidgetContainer.field_F, 0, new String[]{param2});
              }
              if (ak.field_a) {
                param2 = RegistrationAgreementPane.field_E;
              }
              ModalDialogHost.field_G.showResult(param2, param0, param1 + 8517);
            }
            if (param0 != 256 &&
              param0 != 10) {
              if (SoundCache.field_a) {
                return;
              }
              af.field_r.clearCredentials((byte) 41);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wl.EB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    boolean advanceDialogAnimation(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = stellarshard.field_B;
        if (param0) {
          if (this.field_X == null) {
            return super.advanceDialogAnimation(true);
          }
          if (hj.field_d != this.field_X) {
            if (cj.field_b != this.field_X) {
              return super.advanceDialogAnimation(true);
            }
            fieldTemp$0 = this.field_U + 1;
            this.field_U = this.field_U + 1;
            if (this.field_bb != fieldTemp$0) {
              this.field_Q.field_A = (this.field_U << 8) / this.field_bb;
              return super.advanceDialogAnimation(true);
            }
            this.field_Q.field_A = 256;
            this.field_X = null;
            return super.advanceDialogAnimation(true);
          }
          fieldTemp$1 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (this.field_V != fieldTemp$1) {
            this.field_Q.field_A = -((this.field_U << 8) / this.field_V) + 256;
            return super.advanceDialogAnimation(true);
          }
          this.field_X = fj.field_i;
          this.resizeDialog(this.field_S, 12 + this.field_Y.field_p, (byte) -97, this.field_Z + 12 + this.field_Y.field_t);
          this.field_Q.field_A = 0;
          this.field_U = 0;
          return super.advanceDialogAnimation(true);
        }
        this.finishResize(-92);
        if (this.field_X == null) {
          return super.advanceDialogAnimation(true);
        }
        if (hj.field_d != this.field_X) {
          if (cj.field_b != this.field_X) {
            return super.advanceDialogAnimation(true);
          }
          fieldTemp$2 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (this.field_bb != fieldTemp$2) {
            this.field_Q.field_A = (this.field_U << 8) / this.field_bb;
            return super.advanceDialogAnimation(true);
          }
          this.field_Q.field_A = 256;
          this.field_X = null;
          return super.advanceDialogAnimation(true);
        }
        int fieldTemp$3 = this.field_U + 1;
        this.field_U = this.field_U + 1;
        if (this.field_V != fieldTemp$3) {
          this.field_Q.field_A = -((this.field_U << 8) / this.field_V) + 256;
          return super.advanceDialogAnimation(true);
        }
        this.field_X = fj.field_i;
        this.resizeDialog(this.field_S, 12 + this.field_Y.field_p, (byte) -97, this.field_Z + 12 + this.field_Y.field_t);
        this.field_Q.field_A = 0;
        this.field_U = 0;
        return super.advanceDialogAnimation(true);
    }

    public static void clearStaticReferences(int param0) {
        int var1 = -94 / ((-26 - param0) / 49);
        field_W = null;
        field_T = null;
        field_P = null;
    }

    void replaceContent(UiWidget param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        try {
          this.field_Y = param0;
          if (fj.field_i == this.field_X) {
            this.resizeDialog(this.field_S, this.field_Y.field_p + 12, (byte) -97, this.field_Z + (12 + this.field_Y.field_t));
            this.field_U = 0;
          } else {
            if (hj.field_d != this.field_X) {
              this.field_U = 0;
              this.field_X = hj.field_d;
            }
          }
          if (param1 == 23143) {
            return;
          }
          var4 = (UiWidget) null;
          this.replaceContent((UiWidget) null, 17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wl.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    ContentTransitionDialog(ModalDialogHost param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, 12 + param2 + param1.field_t);
        try {
          this.field_S = param4;
          this.field_bb = param3;
          this.field_V = param3;
          this.field_Z = param2;
          this.installContent(16, param1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean snapDialogAnimation(int param0) {
        this.finishResize(3642);
        if (param0 < 98) {
          this.field_Q = (AlphaWidgetContainer) null;
          return super.snapDialogAnimation(106);
        }
        return super.snapDialogAnimation(106);
    }

    private final void installContent(int param0, UiWidget param1) {
        try {
          int var3_int = -55 % ((param0 + 47) / 47);
          if (this.field_Q != null) {
            this.field_Q.unlink(20);
          }
          if (param1 == null) {
            this.field_Q = new AlphaWidgetContainer();
          } else {
            param1.setBounds(param1.field_p, 6, 6 + this.field_Z, param1.field_t, 23987);
            this.field_Q = new AlphaWidgetContainer(param1);
          }
          this.addChild(4, this.field_Q);
          this.field_Y = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wl.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ResourceArchive a(int param0, int param1) {
        if (param0 != 1) {
          return (ResourceArchive) null;
        }
        return IsaacRandom.a(1, 255, param1, false, false, true);
    }

    static {
        field_R = 0;
        field_ab = false;
        field_W = "Please wait...";
        field_T = "Log in / Create account";
        field_P = new int[8192];
    }
}
