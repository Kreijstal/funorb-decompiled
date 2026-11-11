/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareAnimatedWaterEffect extends ShaderEffect {
    static int[] field_f;
    private float field_e;
    private hk field_d;

    final static void a(int param0, long param1, int param2) {
        BitPacketBuffer var4 = ql.field_k;
        var4.writeCipheredOpcode(param0, -2988);
        var4.position = var4.position + 1;
        int var6 = -78 % ((-78 - param2) / 40);
        int var5 = var4.position;
        var4.writeByte(7, 0);
        var4.writeLong(1736565456, param1);
        var4.backpatchByteLength(var4.position - var5, (byte) 11);
    }

    HardwareAnimatedWaterEffect(HardwareGraphicsToolkit param0, hk param1) {
        super(param0);
        this.field_e = 0.0f;
        try {
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setParameters(byte param0, int param1, int param2) {
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != 55) {
          this.isSupported(66);
        }
        this.owner.e(1, false);
        if ((param1 & 128) != 0) {
          this.owner.bindTexture(true, (GpuTexture) null);
        } else {
          if ((1 & param2) != 1) {
            if (this.field_d.field_g) {
              this.owner.bindTexture(true, this.field_d.field_c);
            } else {
              this.owner.bindTexture(true, this.field_d.field_d[0]);
            }
          } else {
            if (this.field_d.field_g) {
              this.field_e = (float)(this.owner.field_Dc % 4000) / 4000.0f;
              this.owner.bindTexture(true, this.field_d.field_c);
            } else {
              var4 = this.owner.field_Dc % 4000 * 16 / 4000;
              this.owner.bindTexture(true, this.field_d.field_d[var4]);
            }
          }
        }
        this.owner.e(0, false);
    }

    final void disable(int param0) {
        if (param0 <= -4) {
          this.owner.e(1, false);
          this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
          this.owner.a(ej.field_c, 0, -55);
          this.owner.a(0, false, ej.field_c);
          this.owner.a(1, (byte) 58);
          this.owner.bindTexture(true, (GpuTexture) null);
          this.owner.e(0, false);
          this.owner.a(0, false, ej.field_c);
          return;
        }
        field_f = (int[]) null;
        this.owner.e(1, false);
        this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
        this.owner.a(ej.field_c, 0, -55);
        this.owner.a(0, false, ej.field_c);
        this.owner.a(1, (byte) 58);
        this.owner.bindTexture(true, (GpuTexture) null);
        this.owner.e(0, false);
        this.owner.a(0, false, ej.field_c);
    }

    final void c(boolean param0) {
        AffineTransform3D var2 = null;
        AffineTransform3D var3 = null;
        if (param0) {
          if (0 == this.owner.o((byte) 122)) {
            var2 = this.owner.textureTransform((byte) 80);
            this.owner.e(1, !param0 ? true : false);
            var3 = this.owner.C(0);
            var3.copyStateFrom(var2, 1);
            var3.scale(11403, 1.0f, 0.125f, 0.125f);
            var3.translate(0.0f, -120, 0.0f, this.field_e);
            this.owner.a(cva.field_b, false);
            this.owner.e(0, false);
          }
          return;
        }
    }

    final boolean isSupported(int param0) {
        if (param0 != 1185) {
          return false;
        }
        return this.field_d.c(param0 - 31819);
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 == 5744) {
          this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, iw.field_c);
          return;
        }
        this.field_e = 1.964166283607483f;
        this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, iw.field_c);
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        try {
          this.owner.bindTexture(true, param1);
          if (param2 != 24595) {
            this.field_e = -1.8459935188293457f;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 != -16973) {
          field_f = (int[]) null;
        }
    }

    final void enable(int param0, boolean param1) {
        this.owner.e(1, false);
        this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, NormalMapOperator.field_m);
        this.owner.a(ej.field_c, 0, -6219, true, false);
        this.owner.a(0, false, PlayerContextMenu.field_j);
        this.owner.a(0, (byte) 77);
        this.owner.e(0, false);
        this.owner.g(3625, -16777216);
        this.owner.a(0, false, pea.field_c);
        this.c(true);
        int var3 = -101 % ((41 - param0) / 62);
    }

    static {
        field_f = new int[]{16777215, 16777215, 16711680};
    }
}
