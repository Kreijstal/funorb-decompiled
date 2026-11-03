/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalPanel extends WidgetContainer {
    private int field_F;
    static int field_B;
    static IndexedSprite[] field_G;
    static int field_E;
    boolean field_C;
    private ModalStack field_H;
    static UiLayoutNode field_D;

    final static IndexedSprite h(byte param0) {
        IndexedSprite var1 = new IndexedSprite(kw.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[0], fc.field_g[0], MouseInputHandler.field_c[0], PasswordValidator.field_j[0], SquadPickerDialog.field_O[0], lt.field_a);
        int var2 = 103 / ((param0 + 65) / 46);
        ScrollContainer.h((byte) -98);
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_F == 0) {
          return;
        }
        if (this.field_F >= 256) {
          if (param0 != 0) {
            return;
          }
          this.a(this.field_t + param2, (byte) 64, param3 + this.field_g);
          super.a(param0, 65, param2, param3);
          return;
        }
        if (null == d.field_a) {
          d.field_a = new Sprite(this.field_n, this.field_i);
          PacketBuffer.a(param1 - 190, d.field_a);
          SoftwareRasterizer.b();
          this.a(0, (byte) 125, 0);
          super.a(param0, (int) (char)param1, -param2 - this.field_t, -this.field_g - param3);
          TeamManagementScreen.e(127);
          d.field_a.b(this.field_t + param2, this.field_g + param3, this.field_F);
          return;
        }
        if (d.field_a.field_q < this.field_n) {
          d.field_a = new Sprite(this.field_n, this.field_i);
          PacketBuffer.a(param1 - 190, d.field_a);
          SoftwareRasterizer.b();
          this.a(0, (byte) 125, 0);
          super.a(param0, (int) (char)param1, -param2 - this.field_t, -this.field_g - param3);
          TeamManagementScreen.e(127);
          d.field_a.b(this.field_t + param2, this.field_g + param3, this.field_F);
          return;
        }
        if (this.field_i > d.field_a.field_w) {
          d.field_a = new Sprite(this.field_n, this.field_i);
          PacketBuffer.a(param1 - 190, d.field_a);
          SoftwareRasterizer.b();
          this.a(0, (byte) 125, 0);
          super.a(param0, (int) (char)param1, -param2 - this.field_t, -this.field_g - param3);
          TeamManagementScreen.e(127);
          d.field_a.b(this.field_t + param2, this.field_g + param3, this.field_F);
          return;
        }
        PacketBuffer.a(param1 - 190, d.field_a);
        SoftwareRasterizer.b();
        this.a(0, (byte) 125, 0);
        super.a(param0, (int) (char)param1, -param2 - this.field_t, -this.field_g - param3);
        TeamManagementScreen.e(127);
        d.field_a.b(this.field_t + param2, this.field_g + param3, this.field_F);
    }

    final static Sprite[] i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        Sprite[] var1 = new Sprite[MenuButton.field_l];
        if (param0 == 78) {
          for (var2 = 0; MenuButton.field_l > var2; var2++) {
            var3 = MouseInputHandler.field_c[var2] * PasswordValidator.field_j[var2];
            var4 = SquadPickerDialog.field_O[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
              var5[var6] = lt.field_a[qj.b((int) var4[var6], 255)];
            }
            var1[var2] = new Sprite(kw.field_i, AccountTermsPanel.field_J, IsaacRandom.field_f[var2], fc.field_g[var2], MouseInputHandler.field_c[var2], PasswordValidator.field_j[var2], var5);
          }
          ScrollContainer.h((byte) -70);
          return var1;
        }
        return (Sprite[]) null;
    }

    final static void a(int param0, byte param1) {
        ManagerAction var2 = null;
        int var3 = Kickabout.field_G;
        ManagerAction var2Lifetime1;
        try {
          if (param1 >= -23) {
            field_G = (IndexedSprite[]) null;
          }
          var2 = (ManagerAction) (MusicPatchNode.field_h.g(24009));
          while (var2 != null) {
            if (var2.actionType == 4) {
              var2.c((byte) -109);
            }
            var2 = (ManagerAction) (MusicPatchNode.field_h.c(33));
          }
          var2Lifetime1 = new ManagerAction(4, new int[]{param0});
          ii.a(var2Lifetime1, 102);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ub.BC(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_G = null;
        int var1 = 0 / ((45 - param0) / 43);
        field_D = null;
    }

    private final int b(boolean param0) {
        if (param0) {
          return !this.field_C ? 0 : this == this.field_H.h((byte) 18) ? 256 : 0;
        }
        this.field_F = -20;
        return !this.field_C ? 0 : this == this.field_H.h((byte) 18) ? 256 : 0;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 >= 90) {
          this.a(param1, 1, il.field_b - param2 >> 1, param2, -param1 + im.field_Ab >> 1);
          return;
        }
    }

    final UiWidget findFocusedChild(boolean param0) {
        UiWidget var2 = super.findFocusedChild(param0);
        if (var2 != null) {
          return var2;
        }
        return (UiWidget) (this);
    }

    boolean k(int param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_22_0 = false;
        int var2;
        int var3;
        var2 = this.b(true);
        var3 = -this.field_F + var2;
        if (var3 <= 0) {
          if (param0 < ~var3) {
            this.field_F = this.field_F + (1 + (var3 - 16)) / 16;
          }
          if (0 != this.field_F) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_22_0 = !(this.field_C);
          return stackIn_22_0;
        }
        this.field_F = this.field_F + (var3 + 8 - 1) / 8;
        if (param0 < ~var3) {
          this.field_F = this.field_F + (1 + (var3 - 16)) / 16;
        }
        if (0 != this.field_F) {
          return false;
        }
        if (var2 != 0) {
          return false;
        }
        stackIn_10_0 = !(this.field_C);
        return stackIn_10_0;
    }

    ModalPanel(ModalStack param0, int param1, int param2) {
        super(il.field_b - param1 >> 1, -param2 + im.field_Ab >> 1, param1, param2, (WidgetPainter) null);
        try {
          this.field_F = 0;
          this.field_H = param0;
          this.field_C = false;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(int param0, byte param1, int param2);

    boolean a(int param0) {
        this.field_F = this.b(true);
        if (param0 >= -11) {
          return false;
        }
        if (this.field_F != 0) {
          return false;
        }
        if (!this.field_C) {
          return true;
        }
        return false;
    }

    final static long a(int param0, byte param1, long param2) {
        int var4 = 32 % ((-15 - param1) / 62);
        return param2 << param0 | param2 >>> -param0;
    }

    static {
        field_B = 0;
    }
}
