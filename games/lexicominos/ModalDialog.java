/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalDialog extends DequeWidgetContainer {
    static IntrusiveDeque field_C;
    private ModalDialogHost field_B;
    boolean field_D;
    private int field_E;
    static String field_G;
    static GzipDecompressor field_F;
    static PlatformTask field_H;

    private final int getTargetAlpha(int param0) {
        if (param0 < -70) {
          return this.field_D ? this == this.field_B.getTopOpenDialog(false) ? 256 : 0 : 0;
        }
        this.field_E = -87;
        return this.field_D ? this == this.field_B.getTopOpenDialog(false) ? 256 : 0 : 0;
    }

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        if (this.field_E == 0) {
          return;
        }
        if (256 <= this.field_E) {
          if (param3 != 0) {
            return;
          }
          this.drawDialogBackground(param1 + this.field_o, (byte) -99, this.field_t + param2);
          super.drawWidget((byte) -115, param1, param2, param3);
          return;
        }
        if (AccountRequestState.field_c == null) {
          AccountRequestState.field_c = new RgbSprite(this.field_j, this.field_v);
          de.a(AccountRequestState.field_c, param0 + 121);
          SoftwareRasterizer.clearRaster();
          this.drawDialogBackground(0, (byte) 115, 0);
          super.drawWidget(param0, -this.field_o - param1, -param2 - this.field_t, param3);
          pd.a(-22949);
          AccountRequestState.field_c.drawWithOpacity(param2 + this.field_t, this.field_o + param1, this.field_E);
          return;
        }
        if (AccountRequestState.field_c.field_p < this.field_j) {
          AccountRequestState.field_c = new RgbSprite(this.field_j, this.field_v);
          de.a(AccountRequestState.field_c, param0 + 121);
          SoftwareRasterizer.clearRaster();
          this.drawDialogBackground(0, (byte) 115, 0);
          super.drawWidget(param0, -this.field_o - param1, -param2 - this.field_t, param3);
          pd.a(-22949);
          AccountRequestState.field_c.drawWithOpacity(param2 + this.field_t, this.field_o + param1, this.field_E);
          return;
        }
        if (this.field_v <= AccountRequestState.field_c.field_u) {
          de.a(AccountRequestState.field_c, param0 + 121);
          SoftwareRasterizer.clearRaster();
          this.drawDialogBackground(0, (byte) 115, 0);
          super.drawWidget(param0, -this.field_o - param1, -param2 - this.field_t, param3);
          pd.a(-22949);
          AccountRequestState.field_c.drawWithOpacity(param2 + this.field_t, this.field_o + param1, this.field_E);
          return;
        }
        AccountRequestState.field_c = new RgbSprite(this.field_j, this.field_v);
        de.a(AccountRequestState.field_c, param0 + 121);
        SoftwareRasterizer.clearRaster();
        this.drawDialogBackground(0, (byte) 115, 0);
        super.drawWidget(param0, -this.field_o - param1, -param2 - this.field_t, param3);
        pd.a(-22949);
        AccountRequestState.field_c.drawWithOpacity(param2 + this.field_t, this.field_o + param1, this.field_E);
    }

    boolean snapDialogAnimation(byte param0) {
        if (param0 != 26) {
          this.drawDialogBackground(-114, (byte) -25, 68);
          this.field_E = this.getTargetAlpha(-101);
          if (0 != this.field_E) {
            return false;
          }
          if (!this.field_D) {
            return true;
          }
          return false;
        }
        this.field_E = this.getTargetAlpha(-101);
        if (0 != this.field_E) {
          return false;
        }
        if (!this.field_D) {
          return true;
        }
        return false;
    }

    ModalDialog(ModalDialogHost param0, int param1, int param2) {
        super(-param1 + ResizableModalDialog.field_O >> 1, RegistrationAgreementPane.field_C - param2 >> 1, param1, param2, (WidgetRenderer) null);
        try {
          this.field_D = false;
          this.field_E = 0;
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final UiWidget getFocusedChild(int param0) {
        UiWidget var2 = super.getFocusedChild(param0);
        if (var2 != null) {
          return var2;
        }
        return (UiWidget) (this);
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 <= 0) {
          return;
        }
        field_G = null;
        field_F = null;
        field_C = null;
        field_H = null;
    }

    boolean advanceDialogAnimation(byte param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_36_0 = false;
        int var2;
        int var3;
        var2 = this.getTargetAlpha(-111);
        var3 = -this.field_E + var2;
        if (var3 > 0) {
          this.field_E = this.field_E + (-1 + (var3 + 8)) / 8;
        }
        if (param0 > -21) {
          ModalDialog.e((byte) -102);
          if (0 <= var3) {
            if (this.field_E != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_11_0 = !(this.field_D);
            return stackIn_11_0;
          }
          this.field_E = this.field_E + (var3 - 16 + 1) / 16;
          if (this.field_E != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_21_0 = !(this.field_D);
          return stackIn_21_0;
        }
        if (0 <= var3) {
          stackIn_30_0 = (this.field_E == 0) && (var2 == 0) && (!this.field_D);
          return stackIn_30_0;
        }
        this.field_E = this.field_E + (var3 - 16 + 1) / 16;
        stackIn_36_0 = (this.field_E == 0) && (var2 == 0) && (!this.field_D);
        return stackIn_36_0;
    }

    abstract void drawDialogBackground(int param0, byte param1, int param2);

    final static void a(int param0, String param1, float param2) {
        try {
          pb.field_j = param1;
          tl.field_g = param2;
          if (param0 != 16) {
            ModalDialog.e((byte) 114);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "al.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setCenteredSize(int param0, int param1, int param2) {
        this.setBounds(param2, param0, true, -param2 + RegistrationAgreementPane.field_C >> 1, ResizableModalDialog.field_O - param0 >> 1);
        if (param1 >= -94) {
          field_H = (PlatformTask) null;
        }
    }

    final static Boolean e(byte param0) {
        if (param0 >= -109) {
          return (Boolean) null;
        }
        Boolean var1 = wh.field_d;
        wh.field_d = null;
        return var1;
    }

    static {
        field_G = "Create a free account to start using this feature";
        field_C = new IntrusiveDeque();
        field_F = new GzipDecompressor();
    }
}
