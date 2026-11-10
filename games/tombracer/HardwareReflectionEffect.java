/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareReflectionEffect extends ShaderEffect {
    private boolean field_f;
    static String[] field_h;
    static int[] field_e;
    static String field_d;
    static String field_g;

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_h = null;
        field_g = null;
    }

    final void refreshState(boolean param0, int param1) {
        this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, iw.field_c);
        if (param1 != 5744) {
          field_g = (String) null;
        }
    }

    final boolean isSupported(int param0) {
        if (param0 != 1185) {
          this.refreshState(false, 60);
          return true;
        }
        return true;
    }

    final void disable(int param0) {
        if (param0 >= -4) {
          return;
        }
        if (!this.field_f) {
          this.owner.a(0, false, ej.field_c);
        } else {
          this.owner.e(1, false);
          this.owner.applyTexCoordGeneration(ItemModel.field_o, (byte) 0);
          this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
          this.owner.a(pea.field_c, 2, -21);
          this.owner.a(0, false, ej.field_c);
          this.owner.p((byte) -87);
          this.owner.bindTexture(true, (GpuTexture) null);
          this.owner.e(0, false);
          this.field_f = false;
        }
        this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
    }

    HardwareReflectionEffect(HardwareGraphicsToolkit param0) {
        super(param0);
        this.field_f = false;
    }

    final void enable(int param0, boolean param1) {
        int var4 = 0;
        na var3 = this.owner.n(-79);
        int var4Lifetime1;
        int var4Lifetime2;
        if (var3 == null) {
          this.owner.a(0, false, tla.field_c);
          var4 = 19 % ((param0 - 41) / 62);
          return;
        }
        if (!param1) {
          this.owner.a(0, false, tla.field_c);
          var4Lifetime1 = 19 % ((param0 - 41) / 62);
          return;
        }
        this.owner.e(1, false);
        this.owner.bindTexture(true, var3);
        this.owner.applyTexCoordGeneration(FunOrbConsole.field_u, (byte) 0);
        this.owner.e(1, false);
        this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, r.field_m);
        this.owner.a(PlayerContextMenu.field_j, 2, -6219, true, false);
        this.owner.a(0, false, tla.field_c);
        AffineTransform3D var4_ref_asa = this.owner.C(0);
        var4_ref_asa.copyStateFrom(1217, this.owner.c(true));
        this.owner.a(cva.field_b, false);
        this.owner.e(0, false);
        this.field_f = true;
        var4Lifetime2 = 19 % ((param0 - 41) / 62);
    }

    final void setParameters(byte param0, int param1, int param2) {
        if (param0 != 55) {
          HardwareReflectionEffect.releaseStatics(125);
        }
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        try {
          this.owner.bindTexture(true, param1);
          if (param2 != 24595) {
            this.refreshState(false, -34);
          }
          this.owner.a((byte) -48, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_h = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_e = new int[64];
        field_d = "Flamethrower";
        field_g = "Set up new game";
        for (var0 = 0; field_e.length > var0; var0++) {
          field_e[var0] = 255 * var0 / 64;
        }
    }
}
