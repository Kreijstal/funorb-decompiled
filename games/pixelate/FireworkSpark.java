/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class FireworkSpark {
    static String field_f;
    static volatile boolean field_i;
    private double[] field_e;
    private double field_c;
    private int field_a;
    private double[] field_h;
    private double field_d;
    static boolean field_b;
    private int[] field_g;

    final void draw(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = this.field_a * 240 / 255;
        SoftwareRasterizer.fillRadialPaletteCircle((int)this.field_h[0] << 4, (int)this.field_e[0] << 4, 64, this.field_a, this.field_g);
        if (param0 >= -91) {
          field_f = (String) null;
        }
        for (var3 = 1; var3 < 20; var3++) {
          var2 = this.field_a * (-var3 + 20) * 12 / 255;
          SoftwareRasterizer.fillRadialPaletteCircle((int)this.field_h[var3] << 4, (int)this.field_e[var3] << 4, 32, var2, this.field_g);
          SoftwareRasterizer.fillRadialPaletteCircle((int)(this.field_h[var3] + this.field_h[-1 + var3]) << 3, (int)(this.field_e[var3 - 1] + this.field_e[var3]) << 3, 32, var2, this.field_g);
        }
    }

    final boolean isOffScreen(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_1 = 0;
        boolean stackIn_19_0 = false;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 >= -7) {
          FireworkSpark.constantOne(102);
        }
        var2 = 1;
        var3 = -1 + this.field_h.length;
        scanLoop1: while (true) {
          if (var3 >= 0) {
            stackIn_7_0 = var2;
            stackIn_7_1 = compareDoubles(0.0, this.field_h[var3]);
            if (stackIn_7_1 < 0 &&
              640.0 > this.field_h[var3] &&
              this.field_e[var3] > 0.0 &&
              this.field_e[var3] < 480.0) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var2 = stackIn_7_0 & stackIn_14_1;
            var3--;
            continue;
          }
          if (var2 == 0 &&
            this.field_a > 0) {
            stackIn_19_0 = false;
            break scanLoop1;
          }
          stackIn_19_0 = true;
          break;
        }
        return stackIn_19_0;
    }

    final static int constantOne(int param0) {
        if (param0 != 23062) {
          field_i = true;
          return 1;
        }
        return 1;
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        if (param0) {
          FireworkSpark.releaseStatics(false);
        }
    }

    final void advance(int param0, int param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        for (var3 = 19; 0 < var3; var3--) {
          this.field_h[var3] = this.field_h[-1 + var3];
          this.field_e[var3] = this.field_e[var3 - 1];
        }
        this.field_h[0] = this.field_h[0] + this.field_d;
        this.field_e[param0] = this.field_e[param0] + this.field_c;
        this.field_a = this.field_a - param1;
        this.field_c = this.field_c + UiComponent.field_s;
    }

    FireworkSpark(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        double[] var6 = null;
        int var7 = 0;
        double var5_double = 0.0;
        this.field_e = new double[20];
        this.field_h = new double[20];
        this.field_a = 249;
        try {
          this.field_h[0] = (double)param0;
          this.field_g = param3;
          this.field_e[0] = (double)param1;
          for (var5_int = 1; var5_int < 20; var5_int++) {
            var6 = this.field_h;
            var7 = var5_int;
            this.field_e[var5_int] = -1000.0;
            var6[var7] = -1000.0;
          }
          var5_double = (double)(JavaRandomHelpers.randomBelow(CredentialKind.field_b, -124, 10) + 15) / 10.0;
          this.field_d = var5_double * DialWidget.sineLookup(3.141592653589793 * (double)param2 / 512.0, false);
          this.field_c = var5_double * TwistedLogicCube.sine((double)param2 * 3.141592653589793 / 512.0, 6802);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = ",";
        field_i = false;
    }

    private static int compareDoubles(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
