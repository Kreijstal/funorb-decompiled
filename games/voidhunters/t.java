/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_e;
    private int[] field_d;
    private int[] field_b;
    private int field_a;
    private int field_f;
    private long field_c;

    final void b(int param0, bra param1) {
        GraphicsToolkit var4 = null;
        GraphicsToolkit var3 = null;
        try {
          var4 = param1.field_g;
          var3 = var4;
          var4.setClip(this.field_b[0], this.field_b[1], this.field_b[2], this.field_b[3]);
          var4.setProjectionParameters(this.field_d[0], this.field_d[param0], this.field_d[2], this.field_d[3]);
          var3.setDepthRange(this.field_f, this.field_a);
          param1.field_e = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "t.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, bra param1) {
        GraphicsToolkit var3 = null;
        if (param0 != 4) {
          return;
        }
        try {
          var3 = param1.field_g;
          var3.getClip(this.field_b);
          this.field_d = var3.getProjectionParameters();
          this.field_f = var3.getNearPlane();
          this.field_a = var3.getFarPlane();
          this.field_c = param1.field_e;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "t.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Ship a(int param0, byte param1) {
        if (param1 < 34) {
          return (Ship) null;
        }
        return OpenGlFramebuffer.a(param0, 0, true);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          t.clearSharedReferences(57);
          field_e = null;
          return;
        }
        field_e = null;
    }

    t() {
        this.field_b = new int[4];
    }

    static {
        field_e = "Withdraw request to join <%0>'s game";
    }
}
