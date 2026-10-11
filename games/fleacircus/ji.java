/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji {
    static int field_a;
    private int[] field_d;
    static String field_b;
    private double[] field_e;
    private double[] field_g;
    private double field_h;
    private int field_c;
    static int field_i;
    static dd[] field_f;
    private double field_j;

    final boolean a(boolean param0) {
        int var3 = 0;
        int var2;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_1 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = param0 ? 1 : 0;
        for (var3 = -1 + this.field_e.length; var3 >= 0; var3--) {
          stackIn_7_0 = var2;
          stackIn_7_1 = $cfr$dcmpg(0.0, this.field_e[var3]);
          if (stackIn_7_1 < 0 &&
            this.field_e[var3] < 640.0 &&
            this.field_g[var3] > 0.0 &&
            480.0 > this.field_g[var3]) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          var2 = stackIn_7_0 & stackIn_14_1;
        }
        if (var2 != 0) {
          return true;
        }
        if (this.field_c <= 0) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 104 % ((-63 - param0) / 59);
        field_f = null;
    }

    final void b(boolean param0) {
        rh var5 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var2Lifetime3;
        if (!param0) {
          var5 = (rh) null;
          ji.a((rh) null, 11, 87, -10);
        } else {
          var2 = this.field_c * 240 / 255;
          gb.a((int)this.field_e[0] << 4, (int)this.field_g[0] << 4, 64, this.field_c, this.field_d);
          for (var3 = 1; 20 > var3; var3++) {
            var2Lifetime3 = (-var3 + 20) * (this.field_c * 12) / 255;
            gb.a((int)this.field_e[var3] << 4, (int)this.field_g[var3] << 4, 32, var2Lifetime3, this.field_d);
            gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << 3, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << 3, 32, var2Lifetime3, this.field_d);
          }
          return;
        }
        var2Lifetime1 = this.field_c * 240 / 255;
        gb.a((int)this.field_e[0] << 4, (int)this.field_g[0] << 4, 64, this.field_c, this.field_d);
        for (var3Lifetime1 = 1; 20 > var3Lifetime1; var3Lifetime1++) {
          var2Lifetime2 = (-var3Lifetime1 + 20) * (this.field_c * 12) / 255;
          gb.a((int)this.field_e[var3Lifetime1] << 4, (int)this.field_g[var3Lifetime1] << 4, 32, var2Lifetime2, this.field_d);
          gb.a((int)(this.field_e[-1 + var3Lifetime1] + this.field_e[var3Lifetime1]) << 3, (int)(this.field_g[var3Lifetime1] + this.field_g[var3Lifetime1 - 1]) << 3, 32, var2Lifetime2, this.field_d);
        }
    }

    final static void a(byte param0) {
        if (param0 >= -57) {
          ji.a(77);
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        for (var3 = 19; 0 < var3; var3--) {
          this.field_e[var3] = this.field_e[-1 + var3];
          this.field_g[var3] = this.field_g[-1 + var3];
        }
        if (param1 <= -37) {
          this.field_e[0] = this.field_e[0] + this.field_j;
          this.field_g[0] = this.field_g[0] + this.field_h;
          this.field_h = this.field_h + bc.field_Y;
          this.field_c = this.field_c - param0;
          return;
        }
        this.a(false);
        this.field_e[0] = this.field_e[0] + this.field_j;
        this.field_g[0] = this.field_g[0] + this.field_h;
        this.field_h = this.field_h + bc.field_Y;
        this.field_c = this.field_c - param0;
    }

    final static bi a(rh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -21460) {
            stackIn_2_0 = (bi) null;
            return stackIn_2_0;
          }
          if (ha.a(param0, param2 ^ 11872, param1, param3)) {
            stackIn_7_0 = kl.a(-88);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (bi) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ji.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ji(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        double[] var6 = null;
        int var7 = 0;
        double var5_double = 0.0;
        this.field_g = new double[20];
        this.field_e = new double[20];
        this.field_c = 249;
        try {
          this.field_e[0] = (double)param0;
          this.field_g[0] = (double)param1;
          this.field_d = param3;
          for (var5_int = 1; 20 > var5_int; var5_int++) {
            var6 = this.field_e;
            this.field_g[var5_int] = -1000.0;
            var7 = var5_int;
            var6[var7] = -1000.0;
          }
          var5_double = (double)(db.a((byte) -115, na.field_c, 10) + 15) / 10.0;
          this.field_j = ma.a((double)param2 * 3.141592653589793 / 512.0, 70) * var5_double;
          this.field_h = nb.a(3.141592653589793 * (double)param2 / 512.0, -127) * var5_double;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Instructions";
        field_i = 1;
    }

    private static int $cfr$dcmpg(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
