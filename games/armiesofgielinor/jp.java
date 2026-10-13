/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    private int field_f;
    String field_b;
    static boolean field_a;
    private int field_h;
    private we[] field_c;
    float field_d;
    static int[] field_g;
    private int field_e;

    final boolean a(int param0) {
        int var3;
        we var4;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 2189) {
          this.field_b = (String) null;
        }
        while (this.field_f > this.field_e) {
          var4 = this.field_c[this.field_e];
          if (!var4.field_c.ensureIndex((byte) 82)) {
            this.a(0, var4, (byte) -126);
            return false;
          }
          if (var4.field_d >= 0 &&
            !var4.field_c.ensureGroupAvailable(11894, var4.field_d)) {
            this.a(var4.field_c.getGroupProgress(var4.field_d, (byte) 73), var4, (byte) -89);
            return false;
          }
          if (var4.field_b != null &&
            !var4.field_c.ensureGroupAvailableByName(28979, var4.field_b)) {
            this.a(var4.field_c.getGroupProgressByName(var4.field_b, (byte) -126), var4, (byte) -75);
            return false;
          }
          if (var4.field_d < 0 &&
            null == var4.field_b &&
            var4.field_j != null &&
            !var4.field_c.ensureAllGroupsAvailable(-27927)) {
            this.a(var4.field_c.getOverallProgress(0), var4, (byte) -88);
            return false;
          }
          this.field_e = this.field_e + 1;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, RgbSprite[] param3, int param4, int param5) {
        try {
          if (param5 != -8991) {
            field_g = (int[]) null;
          }
          param3[0].drawWithBrightness(param0, param1, param4);
          param3[1].drawScaledWithBrightness(param3[1].pixelWidth + param0, param1, -(param3[2].pixelWidth << 1) + param2, param3[2].pixelHeight, param4);
          param3[2].drawWithBrightness(-param3[2].pixelWidth + (param2 + param0), param1, param4);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(PacketBuffer param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          la.field_d = param0.readUnsignedShort((byte) -104) << 5;
          var2_int = param0.readUnsignedByte(0);
          RevivalEvent.field_D = (var2_int & 7) << 18;
          la.field_d = la.field_d + (var2_int >> 3);
          RevivalEvent.field_D = RevivalEvent.field_D + (param0.readUnsignedShort((byte) -104) << 2);
          var2_intLifetime1 = param0.readUnsignedByte(0);
          nk.field_m = 2064384 & var2_intLifetime1 << 15;
          RevivalEvent.field_D = RevivalEvent.field_D + (var2_intLifetime1 >> 6);
          nk.field_m = nk.field_m + (param0.readUnsignedByte(0) << 7);
          int var3 = 16 % ((param1 + 45) / 34);
          var2_intLifetime2 = param0.readUnsignedByte(0);
          ov.field_e = (1 & var2_intLifetime2) << 16;
          nk.field_m = nk.field_m + (var2_intLifetime2 >> 1);
          ov.field_e = ov.field_e + param0.readUnsignedShort((byte) -104);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, we param1, byte param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)(this.field_e + 1) + (float)param0 / 100.0f;
          if (param0 != 0) {
            this.field_b = param1.field_j + " - " + param0 + "%";
          } else {
            this.field_b = param1.field_e;
          }
          if (param2 > -64) {
            this.a(8);
          }
          this.field_d = (float)this.field_h * var4_float / (float)(1 + this.field_f);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (SoftwareRaster.width >= param2 + param0) {
          return param0;
        }
        if (~(param0 + param1 - param2) <= param3) {
          return -param2 + (param1 + param0);
        }
        return -param2 + SoftwareRaster.width;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 < -74) {
          return;
        }
        jp.a((byte) 0);
    }

    private jp() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new int[128];
    }
}
