/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pc extends hs {
    static String field_o;
    static String field_p;
    static int field_q;
    static String field_r;
    static bi field_n;
    static int field_m;

    final static void c(int param0) {
        lg.field_e = null;
        int var1 = 119 % ((param0 + 40) / 34);
    }

    pc(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        this.field_e = this.field_a;
    }

    public final l a(byte param0) throws jn {
        int var7_int = 0;
        int var9 = 0;
        int var11 = 0;
        int var3;
        ln var4;
        int var5;
        int var6;
        ln[] var7;
        ln[] var8;
        ln var10;
        int var12;
        l var13;
        int stackIn_9_0 = 0;
        jd[] stackIn_11_0;
        int stackIn_11_1;
        jd stackIn_11_2;
        jd stackIn_11_3;
        ln stackIn_11_4;
        ln[] stackIn_11_5;
        int stackIn_11_6;
        jd stackIn_12_2 = null;
        jd stackIn_12_3 = null;
        int stackIn_12_7 = 0;
        jd[] stackIn_14_0;
        int stackIn_14_1;
        jd stackIn_14_2;
        jd stackIn_14_3;
        ln stackIn_14_4;
        ln[] stackIn_14_5;
        int stackIn_14_6;
        int stackIn_14_7;
        jd stackIn_15_2 = null;
        jd stackIn_15_3 = null;
        int stackIn_15_8 = 0;
        jd[] stackIn_17_0;
        int stackIn_17_1;
        jd stackIn_17_2;
        jd stackIn_17_3;
        ln stackIn_17_4;
        ln[] stackIn_17_5;
        int stackIn_17_6;
        int stackIn_17_7;
        jd stackIn_18_2 = null;
        jd stackIn_18_3 = null;
        int stackIn_18_8 = 0;
        jd[] stackIn_20_0;
        int stackIn_20_1;
        jd stackIn_20_2;
        jd stackIn_20_3;
        ln stackIn_20_4;
        ln[] stackIn_20_5;
        int stackIn_20_6;
        int stackIn_20_7;
        jd stackIn_21_2;
        jd stackIn_21_3;
        int stackIn_21_8;
        ln stackIn_37_0 = null;
        int stackIn_38_1 = 0;
        int var5Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        var13 = super.a((byte) 119);
        var3 = this.field_c * this.field_b / 2;
        if (0 == this.field_b * this.field_c % 2) {
          var3 = var3 - this.field_c / 2;
        }
        var4 = this.a(var3, this.field_c, this.field_b, -120, var13.field_e.length);
        var4.field_L = 2;
        for (var5 = 0; var5 < 4; var5++) {
          var4.field_G[var5] = -5;
        }
        var4.field_I = ks.field_c + " " + String.valueOf((char)(65 + qf.a((byte) 114, 26, var13.field_j))) + String.valueOf((char)(65 + qf.a((byte) 30, 26, var13.field_j))) + String.valueOf((char)(65 + qf.a((byte) 24, 26, var13.field_j))) + "-" + 5;
        var4.field_x = 30;
        var4.field_B = 8;
        var4.field_u = true;
        var6 = 68 % ((-67 - param0) / 44);
        var4.field_r = new jd[6];
        stackIn_9_0 = (var3 / this.field_c % 2 != 0) ? 0 : 1;
        var5Lifetime1 = stackIn_9_0;
        stackIn_11_0 = var4.field_r;
        stackIn_11_1 = 0;
        stackIn_11_2 = null;
        stackIn_11_3 = null;
        stackIn_11_4 = var4;
        stackIn_11_5 = this.field_f;
        stackIn_11_6 = var3 - this.field_c;
        if (var5Lifetime1 == 0) {
          stackIn_12_2 = null;
          stackIn_12_3 = null;
          stackIn_12_7 = 0;
        } else {
          stackIn_12_2 = null;
          stackIn_12_3 = null;
          stackIn_12_7 = 1;
        }
        stackIn_11_0[stackIn_11_1] = new jd(stackIn_11_4, stackIn_11_5[stackIn_11_6 - stackIn_12_7], (ln) null, var4.field_A, (int)((double)var4.field_S - rh.field_d * 200.0 * 0.5), 0);
        stackIn_14_0 = var4.field_r;
        stackIn_14_1 = 1;
        stackIn_14_2 = null;
        stackIn_14_3 = null;
        stackIn_14_4 = var4;
        stackIn_14_5 = this.field_f;
        stackIn_14_6 = var3;
        stackIn_14_7 = this.field_c;
        if (var5Lifetime1 != 0) {
          stackIn_15_2 = null;
          stackIn_15_3 = null;
          stackIn_15_8 = 0;
        } else {
          stackIn_15_2 = null;
          stackIn_15_3 = null;
          stackIn_15_8 = 1;
        }
        stackIn_14_0[stackIn_14_1] = new jd(stackIn_14_4, stackIn_14_5[stackIn_14_6 - (stackIn_14_7 - stackIn_15_8)], (ln) null, 100 + var4.field_A, (int)((double)var4.field_S - 0.25 * (200.0 * rh.field_d)), 0);
        var4.field_r[2] = new jd(var4, this.field_f[var3 + 1], (ln) null, 100 + var4.field_A, (int)((double)var4.field_S + 0.25 * (rh.field_d * 200.0)), 0);
        stackIn_17_0 = var4.field_r;
        stackIn_17_1 = 3;
        stackIn_17_2 = null;
        stackIn_17_3 = null;
        stackIn_17_4 = var4;
        stackIn_17_5 = this.field_f;
        stackIn_17_6 = -this.field_c;
        stackIn_17_7 = var3;
        if (var5Lifetime1 == 0) {
          stackIn_18_2 = null;
          stackIn_18_3 = null;
          stackIn_18_8 = 1;
        } else {
          stackIn_18_2 = null;
          stackIn_18_3 = null;
          stackIn_18_8 = 0;
        }
        stackIn_17_0[stackIn_17_1] = new jd(stackIn_17_4, stackIn_17_5[stackIn_17_6 + (stackIn_17_7 + stackIn_18_8)], (ln) null, var4.field_A, (int)(rh.field_d * 200.0 * 0.5 + (double)var4.field_S), 0);
        stackIn_20_0 = var4.field_r;
        stackIn_20_1 = 4;
        stackIn_20_2 = null;
        stackIn_20_3 = null;
        stackIn_20_4 = var4;
        stackIn_20_5 = this.field_f;
        stackIn_20_6 = var3;
        stackIn_20_7 = this.field_c;
        if (var5Lifetime1 == 0) {
          stackIn_21_2 = null;
          stackIn_21_3 = null;
          stackIn_21_8 = 0;
        } else {
          stackIn_21_2 = null;
          stackIn_21_3 = null;
          stackIn_21_8 = 1;
        }
        stackIn_20_0[stackIn_20_1] = new jd(stackIn_20_4, stackIn_20_5[stackIn_20_6 - (stackIn_20_7 + stackIn_21_8)], (ln) null, -100 + var4.field_A, (int)(0.25 * (200.0 * rh.field_d) + (double)var4.field_S), 0);
        var4.field_r[5] = new jd(var4, this.field_f[-1 + var3], (ln) null, -100 + var4.field_A, (int)((double)var4.field_S - 0.25 * (200.0 * rh.field_d)), 0);
        for (var7_int = 0; var7_int < 6; var7_int++) {
          var4.field_r[var7_int].field_g = (int)(0.5 * (200.0 * rh.field_d));
        }
        var4.field_D = new ln[]{};
        var7 = new ln[var13.field_e.length + 1];
        ps.a(var13.field_e, 0, var7, 0, var13.field_e.length);
        var7[var13.field_e.length] = var4;
        var13.field_e = var7;
        var13.a(26253);
        var13.b((byte) 80);
        var8 = var13.field_e;
        for (var9 = 0; var9 < var8.length; var9++) {
          var10 = var8[var9];
          if (2 == var10.field_L &&
            var10 != var4) {
            for (var11 = 0; 4 > var11; var11++) {
              var10.field_G[var11] = -2;
            }
            stackIn_37_0 = var10;
            if (var10.field_p % 2 != 0) {
              stackIn_38_1 = 7;
            } else {
              stackIn_38_1 = 6;
            }
            stackIn_37_0.field_B = stackIn_38_1;
            var10.field_I = ks.field_c + " " + String.valueOf((char)(qf.a((byte) 46, 26, var13.field_j) + 65)) + String.valueOf((char)(qf.a((byte) 20, 26, var13.field_j) + 65)) + String.valueOf((char)(65 + qf.a((byte) 5, 26, var13.field_j))) + "-" + 2;
            var10.field_x = 15;
          }
        }
        return var13;
    }

    final static int a(boolean param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0) {
            var6 = (CharSequence) null;
            pc.a(false, (CharSequence) null);
          }
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = q.a((byte) -123, param1.charAt(var4)) + (var3 << 5) - var3;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(boolean param0) {
        if (param0) {
          CharSequence var2 = (CharSequence) null;
          pc.a(false, (CharSequence) null);
        }
        return sa.field_a.e(-1);
    }

    final void a(boolean param0, l param1) throws jn {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          this.field_f = new ln[this.field_c * this.field_b];
          var3_int = this.field_f.length / 2;
          if (this.field_c * this.field_b % 2 == 0) {
            var3_int = var3_int - this.field_c / 2;
          }
          this.field_f[var3_int] = li.field_b;
          this.field_f[var3_int - 1] = li.field_b;
          this.field_f[1 + var3_int] = li.field_b;
          this.field_f[this.field_c + var3_int] = li.field_b;
          this.field_f[var3_int - this.field_c] = li.field_b;
          stackIn_5_0 = (var3_int / this.field_c % 2 != 0) ? 0 : 1;
          var4 = stackIn_5_0;
          if (var4 != 0) {
            this.field_f[-1 + (-this.field_c + var3_int)] = li.field_b;
            this.field_f[-1 + (this.field_c + var3_int)] = li.field_b;
          } else {
            this.field_f[1 + (-this.field_c + var3_int)] = li.field_b;
            this.field_f[var3_int + this.field_c + 1] = li.field_b;
          }
          super.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pc.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 <= 57) {
          field_r = (String) null;
        }
        field_n = null;
        field_o = null;
        field_p = null;
    }

    static {
        field_o = "Elapsed time";
        field_p = "Type your age in years";
        field_m = 480;
    }
}
