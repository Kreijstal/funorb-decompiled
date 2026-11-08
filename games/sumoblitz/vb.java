/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends InteractiveWidget {
    int field_F;
    static int field_I;
    int field_G;
    int field_K;
    static ResourceArchive field_J;
    static boolean field_E;
    int field_M;
    int field_L;
    int field_H;

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_E = false;
          field_J = null;
          return;
        }
        field_J = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 104 / ((param0 - 78) / 36);
        kt.b((byte) 108);
    }

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!super.onPointerPressed(root, -47, pointerY, button, parentX, pointerX, parentY)) {
            if (guard > -42) {
              vb.a((byte) 68, false);
            }
            return false;
          }
          var8_int = pointerX + (-parentX + (-this.x - this.field_G));
          var9 = -this.field_K - this.y + (-parentY + pointerY);
          if (this.field_F * this.field_F > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - s.field_m;
            if (!(var10 < 0.0)) {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_L;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_L;
            }
            this.field_H = (int)((double)this.field_L * var10 / 6.283185307179586);
            while (this.field_L <= this.field_H) {
              this.field_H = this.field_H - this.field_L;
            }
            while (this.field_H < 0) {
              this.field_H = this.field_H + this.field_L;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("vb.R(");
          if (root == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        field_I = -1;
    }
}
