/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlCubeTexture extends OpenGlTexture {
    static Widget field_h;
    private int field_j;
    private int field_i;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 >= -37) {
          field_h = (Widget) null;
          if (GetBloomThresholdPercentage.field_p) {
            return PartitionZoneListFactory.field_b.dispatchKey(-9445, SetBombletSprayProjectileDamage.field_o, SetClientSideDragging.field_r);
          }
          if (uga.field_d) {
            return GetDetachmentMode.a(param3, -9307, param2);
          }
          if (SetPhysicsCollisionForceMultiplier.a(param3, 2, param2)) {
            return true;
          }
          if (hb.field_c) {
            return false;
          }
          return SetFighterRepairAmount.b(param0, param3, -85);
        }
        if (GetBloomThresholdPercentage.field_p) {
          return PartitionZoneListFactory.field_b.dispatchKey(-9445, SetBombletSprayProjectileDamage.field_o, SetClientSideDragging.field_r);
        }
        if (uga.field_d) {
          return GetDetachmentMode.a(param3, -9307, param2);
        }
        if (SetPhysicsCollisionForceMultiplier.a(param3, 2, param2)) {
          return true;
        }
        if (hb.field_c) {
          return false;
        }
        return SetFighterRepairAmount.b(param0, param3, -85);
    }

    public static void clearSharedReferences(byte param0) {
        field_h = null;
        if (param0 < 40) {
          field_h = (Widget) null;
        }
    }

    public final void detachFromFramebuffer(int param0) {
        if (param0 == 31294) {
          jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_i, this.field_j, 3553, 0, 0);
          this.field_i = -1;
          this.field_j = -1;
          return;
        }
    }

    OpenGlCubeTexture(OpenGlToolkit param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, 6 * (param2 * param2), param3);
        int var7_int = 0;
        this.field_j = -1;
        this.field_i = -1;
        try {
          this.toolkit.bindTexture(80, (OpenGlTexture) (this));
          for (var7_int = 0; 6 > var7_int; var7_int++) {
            jaggl.OpenGL.glTexImage2Dub(34069 + var7_int, 0, this.internalFormat, param2, param2, 0, param5, 5121, param4[var7_int], 0);
          }
          this.setLinearFiltering(87, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rtb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
    }
}
