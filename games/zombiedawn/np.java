/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends an {
    static Sprite field_E;
    static ij field_H;
    private int field_F;
    private vc field_G;

    final String d(int param0) {
        if (this.field_l) {
          return this.field_G.b((byte) -109);
        }
        int var2 = -31 / ((10 - param0) / 58);
        return null;
    }

    final void a(UiWidget param0, byte param1, int param2, int param3) {
        try {
          this.field_F = this.field_F + 1;
          super.a(param0, (byte) -110, param2, param3);
          int var5_int = -62 / ((param1 - 46) / 42);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "np.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Sprite var15 = null;
        Sprite var16 = null;
        Sprite var14 = null;
        Sprite var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = ZombieDawn.field_J;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3 + param3);
        if (param1 != 0) {
          return;
        }
        int var5 = param2 + this.field_k + (this.field_i >> 1);
        int var6 = this.field_j + (param0 + (this.field_n >> 1));
        rh var8 = this.field_G.a((byte) -76);
        if (var8 == se.field_l) {
          var15 = Js5Archive.field_k[0];
          var9 = var15.field_r << 1;
          var10 = var15.field_q << 1;
          if (tm.field_m == null) {
            tm.field_m = new Sprite(var9, var10);
            ki.a((byte) -94, tm.field_m);
            var15.drawRotatedAboutPivot(112, 144, var15.field_r << 4, var15.field_q << 4, -this.field_F << 10, 4096);
            pa.a(-21189);
            tm.field_m.drawAdditive(-var15.field_r + var5, -var15.field_q + var6, 256);
            return;
          }
          if (tm.field_m.field_w < var9) {
            tm.field_m = new Sprite(var9, var10);
            ki.a((byte) -94, tm.field_m);
            var15.drawRotatedAboutPivot(112, 144, var15.field_r << 4, var15.field_q << 4, -this.field_F << 10, 4096);
            pa.a(-21189);
            tm.field_m.drawAdditive(-var15.field_r + var5, -var15.field_q + var6, 256);
            return;
          }
          if (var10 <= tm.field_m.field_t) {
            ki.a((byte) -86, tm.field_m);
            Rasterizer.clear();
            var15.drawRotatedAboutPivot(112, 144, var15.field_r << 4, var15.field_q << 4, -this.field_F << 10, 4096);
            pa.a(-21189);
            tm.field_m.drawAdditive(-var15.field_r + var5, -var15.field_q + var6, 256);
            return;
          }
          tm.field_m = new Sprite(var9, var10);
          ki.a((byte) -94, tm.field_m);
          var15.drawRotatedAboutPivot(112, 144, var15.field_r << 4, var15.field_q << 4, -this.field_F << 10, 4096);
          pa.a(-21189);
          tm.field_m.drawAdditive(-var15.field_r + var5, -var15.field_q + var6, 256);
          return;
        }
        if (gj.field_v == var8) {
          var16 = Js5Archive.field_k[0];
          var9Lifetime1 = var16.field_r << 1;
          var10Lifetime1 = var16.field_q << 1;
          if (tm.field_m == null) {
            tm.field_m = new Sprite(var9Lifetime1, var10Lifetime1);
            ki.a((byte) -94, tm.field_m);
            var16.drawRotatedAboutPivot(112, 144, var16.field_r << 4, var16.field_q << 4, -this.field_F << 10, 4096);
            pa.a(-21189);
            tm.field_m.drawAdditive(-var16.field_r + var5, -var16.field_q + var6, 256);
            return;
          }
          if (tm.field_m.field_w < var9Lifetime1) {
            tm.field_m = new Sprite(var9Lifetime1, var10Lifetime1);
            ki.a((byte) -94, tm.field_m);
            var16.drawRotatedAboutPivot(112, 144, var16.field_r << 4, var16.field_q << 4, -this.field_F << 10, 4096);
            pa.a(-21189);
            tm.field_m.drawAdditive(-var16.field_r + var5, -var16.field_q + var6, 256);
            return;
          }
          if (var10Lifetime1 <= tm.field_m.field_t) {
            ki.a((byte) -86, tm.field_m);
            Rasterizer.clear();
            var16.drawRotatedAboutPivot(112, 144, var16.field_r << 4, var16.field_q << 4, -this.field_F << 10, 4096);
            pa.a(-21189);
            tm.field_m.drawAdditive(-var16.field_r + var5, -var16.field_q + var6, 256);
            return;
          }
          tm.field_m = new Sprite(var9Lifetime1, var10Lifetime1);
          ki.a((byte) -94, tm.field_m);
          var16.drawRotatedAboutPivot(112, 144, var16.field_r << 4, var16.field_q << 4, -this.field_F << 10, 4096);
          pa.a(-21189);
          tm.field_m.drawAdditive(-var16.field_r + var5, -var16.field_q + var6, 256);
          return;
        }
        if (var8 == MouseWheelInput.field_b) {
          var14 = Js5Archive.field_k[2];
          var14.drawAdditive(-(var14.field_w >> 1) + var5, -(var14.field_t >> 1) + var6, 256);
          return;
        }
        if (mc.field_g == var8) {
          var13 = Js5Archive.field_k[1];
          var13.drawAdditive(var5 - (var13.field_w >> 1), -(var13.field_t >> 1) + var6, 256);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1569045130) {
          field_H = (ij) null;
          field_E = null;
          field_H = null;
          return;
        }
        field_E = null;
        field_H = null;
    }

    final static void a(byte param0, int param1) {
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
          var5 = new int[1 + ln.field_c.length];
          var2 = var5;
          for (var3 = 0; ln.field_c.length > var3; var3++) {
            var5[var3] = ln.field_c[var3];
          }
          var2[var2.length - 1] = param1;
          if (param0 != 9) {
            field_H = (ij) null;
          }
          ln.field_c = var2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "np.F(" + param0 + ',' + param1 + ')');
        }
    }

    np(vc param0) {
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "np.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean focusNext(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 67) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("np.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
