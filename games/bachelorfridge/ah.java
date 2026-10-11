/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ah extends tia {
    private double field_m;
    private int field_i;
    private eaa field_n;
    static int field_l;
    private int field_j;
    private double field_k;

    private final int[] b(int param0) {
        if (param0 <= 31) {
          field_l = -48;
        }
        int[] var3 = new int[2];
        int[] var2 = var3;
        var3[1] = (int)(this.field_m * (double)(128 - this.field_g * 2));
        var3[0] = (int)(this.field_k * (double)(128 - this.field_g * 2));
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 25415) {
          return;
        }
        lr.a(65280, param2, 100, this.field_n, param1 + 265923678, param0);
    }

    final boolean a(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int[] var13 = null;
        int var6 = 0;
        int var7 = 0;
        lh var8 = null;
        int var9 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if (fieldTemp$0 <= 0) {
          return false;
        }
        if (param0 > 0) {
          this.a(-70);
        }
        if (!(this.field_g <= 32)) {
          for (var2 = 0; var2 < 2; var2++) {
            var3 = -(3.141592653589793 * (double)((kla.a(50, this.field_f, -2147483648) + 50 * (-1 + this.field_j)) * 2) / 200.0 - 1.5707963267948966);
            var13 = this.b(64);
            var6 = var13[0] + (kla.a(30, this.field_f, -2147483648) - 15 >> 1);
            var7 = var13[1] + (kla.a(30, this.field_f, -2147483648) - 15 >> 1);
            var8 = new lh(var6 << 4, 0, var7 << 4);
            kla.a(30, this.field_f, -2147483648);
            var8.field_p = 4 - kla.a(8, this.field_f, -2147483648);
            var8.field_k = -kla.a(8, this.field_f, -2147483648) + 4;
            var8.field_g = 4 - kla.a(8, this.field_f, -2147483648);
            var8.field_m = -1;
            var8.field_o = 32;
            var8.field_l = 0;
            var8.field_r = var3;
            this.field_n.a(var8, true);
          }
        }
        gj.a((byte) 116, this.field_n, this.field_f, this.field_g);
        return true;
    }

    ah(gj param0, ad param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_i = param3;
          this.field_j = param2;
          Math.sqrt(20480.0);
          this.field_g = 64;
          this.field_n = new eaa();
          this.field_k = (double)(128 * this.field_i / 64);
          this.field_m = (double)(this.field_i * 64 / 64);
          if (this.field_j == 1) {
            this.field_m = this.field_m * -1.0;
          } else {
            if (this.field_j == 3) {
              this.field_k = this.field_k * -1.0;
            } else {
              if (this.field_j == 2) {
                this.field_m = this.field_m * -1.0;
                this.field_k = this.field_k * -1.0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ah.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(gs param0, byte param1) {
        String stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        Object var4 = null;
        String var4_ref = null;
        int var5 = 0;
        String var6 = null;
        Object var4Lifetime1;
        Object var4Lifetime1Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          var3 = -85 % ((param1 + 11) / 55);
          var2 = null;
          if (param0.field_e != null) {
            var6 = param0.field_e;
            var2 = var6;
            var4 = var2;
            var2 = var6;
            var2 = var6;
            if (param0.field_b == 1) {
              var2 = "<img=0>" + var6;
            }
            if (2 == param0.field_b) {
              var2 = "<img=1>" + (String) (var2);
              var4Lifetime1 = var2;
              var4Lifetime1Lifetime1 = var2;
            }
          }
          var4_ref = "";
          if (param0.field_p != 2) {
            if (param0.field_p == 0 &&
              am.field_O) {
              var4_ref = "[" + cja.field_r + "] ";
            }
            if (1 == param0.field_p) {
              var4_ref = "[" + lga.a(true, new String[]{param0.field_k}, fq.field_r) + "] ";
            }
            if (4 == param0.field_p &&
              jc.field_n != null) {
              var4_ref = "[" + jc.field_n + "] ";
            }
            if (param0.field_p == 3) {
              var4_ref = "[#" + param0.field_k + "] ";
            }
            if (!param0.field_i) {
              var4_ref = var4_ref + (String) (var2) + ": ";
            }
          } else {
            if (!param0.field_i) {
              if (param0.field_m == 0 &&
                param0.field_j == 0) {
                var4_ref = lga.a(true, new String[]{(String) (var2)}, iia.field_q);
              } else {
                var4_ref = lga.a(true, new String[]{(String) (var2)}, wla.field_n);
              }
            }
          }
          stackIn_32_0 = var4_ref;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("ah.E(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pe.a((Throwable) (stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        pf var2 = sja.field_fb;
        var2.c(param1, (byte) 118);
        var2.d(1, 0);
        var2.d(2, param0 ^ param0);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 71 / ((param1 - 52) / 45);
        uc.d(107);
        dg.c(param3, param2, param0, param4);
    }

    static {
    }
}
