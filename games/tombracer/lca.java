/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lca implements Renderable {
    private static String[] field_g;
    int field_b;
    int field_c;
    SnakePitModel field_a;
    int field_f;
    int field_e;
    int field_d;

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.getRenderZ((byte) 127);
          return this.field_a.isRenderExpired((byte) 48);
        }
        return this.field_a.isRenderExpired((byte) 48);
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.field_a = (SnakePitModel) null;
        }
    }

    public final int getRenderZ(byte param0) {
        if (param0 > -86) {
          this.field_d = -90;
          return this.field_a.getRenderZ((byte) -121);
        }
        return this.field_a.getRenderZ((byte) -121);
    }

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          return -97;
        }
        return this.field_a.getRenderY((byte) 117) + this.field_d;
    }

    public final int getRenderX(byte param0) {
        int var2 = 1 % ((-23 - param0) / 53);
        return this.field_a.getRenderX((byte) -79) + this.field_b;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          lca.releaseStatics(-63);
          if (null == ModelFactory.field_a) {
            return false;
          }
          if (ModelFactory.field_a.a((byte) 119) != null) {
            return true;
          }
          return false;
        }
        if (null == ModelFactory.field_a) {
          return false;
        }
        if (ModelFactory.field_a.a((byte) 119) != null) {
          return true;
        }
        return false;
    }

    public final void render(int param0, iq param1) {
        if (param0 <= 103) {
          return;
        }
        TrapPart var3 = this.field_a.getPart(-114);
        if (var3 != null &&
          !var3.isEnabled(-50)) {
          return;
        }
        try {
          gqa.a(GameScreen.positiveModulo(this.field_e, 2048, -108), -83584144, this.getRenderY((byte) 97), this.getRenderX((byte) -92), this.field_a.a(false, this), this.getRenderZ((byte) -110));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lca.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -22593) {
          field_g = (String[]) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    static {
        field_g = new String[8];
        field_g[3] = "Rolling Boulder";
        field_g[7] = "Key";
        field_g[2] = "Pushable Block";
        field_g[4] = "Rotating Flamer";
        field_g[6] = "Damocles Block";
        field_g[1] = "Solid Block";
        field_g[5] = "Tracking Beam";
        field_g[0] = "Pit";
    }
}
