/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalDialog extends DequeWidgetContainer {
    private ModalDialogHost field_L;
    static String field_O;
    static ej field_U;
    private int field_V;
    static int field_W;
    static String field_T;
    boolean field_H;
    static String field_X;
    static String field_S;
    static e field_R;
    static boolean field_P;
    static AccountRequestState field_Q;

    abstract void b(int param0, byte param1, int param2);

    boolean snapDialogAnimation(int param0) {
        this.field_V = this.getTargetAlpha(false);
        if (param0 > -35) {
          this.field_V = -126;
          if (this.field_V != 0) {
            return false;
          }
          if (!this.field_H) {
            return true;
          }
          return false;
        }
        if (this.field_V != 0) {
          return false;
        }
        if (!this.field_H) {
          return true;
        }
        return false;
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_X = null;
        field_Q = null;
        field_S = null;
        if (param0 == -1) {
          field_U = null;
          field_O = null;
          field_T = null;
          field_R = null;
          return;
        }
        ModalDialog.releaseDeclaredStaticReferences(76);
        field_U = null;
        field_O = null;
        field_T = null;
        field_R = null;
    }

    private final int getTargetAlpha(boolean param0) {
        if (!param0) {
          return !this.field_H ? 0 : this.field_L.getTopOpenDialog(0) == this ? 256 : 0;
        }
        ModalDialog.releaseDeclaredStaticReferences(-60);
        return !this.field_H ? 0 : this.field_L.getTopOpenDialog(0) == this ? 256 : 0;
    }

    final void setCenteredSize(int param0, int param1, int param2) {
        if (param0 <= -30) {
          this.setBounds(-127, param2, qk.field_c - param1 >> 1, param1, tg.field_L - param2 >> 1);
          return;
        }
        field_P = false;
        this.setBounds(-127, param2, qk.field_c - param1 >> 1, param1, tg.field_L - param2 >> 1);
    }

    ModalDialog(ModalDialogHost param0, int param1, int param2) {
        super(tg.field_L - param1 >> 1, qk.field_c - param2 >> 1, param1, param2, (WidgetRenderer) null);
        try {
          this.field_V = 0;
          this.field_H = false;
          this.field_L = param0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean advanceDialogAnimation(int param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_41_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != -6) {
          field_Q = (AccountRequestState) null;
          var2 = this.getTargetAlpha(false);
          var3 = var2 - this.field_V;
          if (var3 <= 0) {
            if (0 > var3) {
              this.field_V = this.field_V + (var3 - 15) / 16;
            }
            if (this.field_V != 0) {
              return false;
            }
            if (0 != var2) {
              return false;
            }
            stackIn_20_0 = !(this.field_H);
            return stackIn_20_0;
          }
          this.field_V = this.field_V + (8 + (var3 - 1)) / 8;
          if (0 > var3) {
            this.field_V = this.field_V + (var3 - 15) / 16;
          }
          stackIn_10_0 = (this.field_V == 0) && (0 == var2) && (!this.field_H);
          return stackIn_10_0;
        }
        var2Lifetime1 = this.getTargetAlpha(false);
        var3Lifetime1 = var2Lifetime1 - this.field_V;
        if (var3Lifetime1 <= 0) {
          if (0 > var3Lifetime1) {
            this.field_V = this.field_V + (var3Lifetime1 - 15) / 16;
          }
          stackIn_32_0 = (this.field_V == 0) && (0 == var2Lifetime1) && (!this.field_H);
          return stackIn_32_0;
        }
        this.field_V = this.field_V + (8 + (var3Lifetime1 - 1)) / 8;
        if (0 > var3Lifetime1) {
          this.field_V = this.field_V + (var3Lifetime1 - 15) / 16;
        }
        stackIn_41_0 = (this.field_V == 0) && (0 == var2Lifetime1) && (!this.field_H);
        return stackIn_41_0;
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        if (this.field_V == 0) {
          return;
        }
        if (256 <= this.field_V) {
          if (0 != param1) {
            return;
          }
          this.b(this.field_q + param3, (byte) -126, this.field_m + param0);
          super.drawWidget(param0, param1, (byte) 102, param3);
          return;
        }
        if (param2 < 36) {
          field_O = (String) null;
          if (DequeWidgetContainer.field_K == null) {
            DequeWidgetContainer.field_K = new RgbSprite(this.field_F, this.field_z);
            vm.a(DequeWidgetContainer.field_K, -8409);
            SoftwareRasterizer.clearRaster();
            this.b(0, (byte) -90, 0);
            super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
            ib.b(false);
            DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
            return;
          }
          if (this.field_F > DequeWidgetContainer.field_K.field_u) {
            DequeWidgetContainer.field_K = new RgbSprite(this.field_F, this.field_z);
            vm.a(DequeWidgetContainer.field_K, -8409);
            SoftwareRasterizer.clearRaster();
            this.b(0, (byte) -90, 0);
            super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
            ib.b(false);
            DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
            return;
          }
          if (DequeWidgetContainer.field_K.field_w >= this.field_z) {
            vm.a(DequeWidgetContainer.field_K, -8409);
            SoftwareRasterizer.clearRaster();
            this.b(0, (byte) -90, 0);
            super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
            ib.b(false);
            DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
            return;
          }
          DequeWidgetContainer.field_K = new RgbSprite(this.field_F, this.field_z);
          vm.a(DequeWidgetContainer.field_K, -8409);
          SoftwareRasterizer.clearRaster();
          this.b(0, (byte) -90, 0);
          super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
          ib.b(false);
          DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
          return;
        }
        if (DequeWidgetContainer.field_K == null) {
          DequeWidgetContainer.field_K = new RgbSprite(this.field_F, this.field_z);
          vm.a(DequeWidgetContainer.field_K, -8409);
          SoftwareRasterizer.clearRaster();
          this.b(0, (byte) -90, 0);
          super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
          ib.b(false);
          DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
          return;
        }
        if (this.field_F > DequeWidgetContainer.field_K.field_u) {
          DequeWidgetContainer.field_K = new RgbSprite(this.field_F, this.field_z);
          vm.a(DequeWidgetContainer.field_K, -8409);
          SoftwareRasterizer.clearRaster();
          this.b(0, (byte) -90, 0);
          super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
          ib.b(false);
          DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
          return;
        }
        if (DequeWidgetContainer.field_K.field_w >= this.field_z) {
          vm.a(DequeWidgetContainer.field_K, -8409);
          SoftwareRasterizer.clearRaster();
          this.b(0, (byte) -90, 0);
          super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
          ib.b(false);
          DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
          return;
        }
        DequeWidgetContainer.field_K = new RgbSprite(this.field_F, this.field_z);
        vm.a(DequeWidgetContainer.field_K, -8409);
        SoftwareRasterizer.clearRaster();
        this.b(0, (byte) -90, 0);
        super.drawWidget(-this.field_m - param0, param1, (byte) 120, -param3 - this.field_q);
        ib.b(false);
        DequeWidgetContainer.field_K.drawWithOpacity(param3 + this.field_q, this.field_m + param0, this.field_V);
    }

    final UiWidget getFocusedChild(int param0) {
        if (param0 != -1) {
          return (UiWidget) null;
        }
        UiWidget var2 = super.getFocusedChild(param0 + 0);
        if (var2 != null) {
          return var2;
        }
        return (UiWidget) (this);
    }

    static {
        field_O = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_T = "Passwords can only contain letters and numbers";
        field_W = 0;
        field_U = new ej();
        field_S = "Owing to your splendid heroism,#the human race is set to become#the most powerful force in the galaxy.";
        field_P = false;
        field_X = "Next power-up attractor: Level <%0>";
        field_R = new e(15, 0, 1, 0);
    }
}
