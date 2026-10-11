/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik extends q {
    private int field_q;
    int[] field_s;
    int field_r;
    private int[] field_m;
    int field_l;
    int field_p;
    static String[] field_k;
    private int[] field_o;
    t field_j;
    int field_n;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Torquing.field_u;
        try {
          if (param1 != -46) {
            field_k = (String[]) null;
          }
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (wa.a(param0, (byte) 34)) {
            return true;
          }
          var8 = ra.field_d;
          var7 = var8;
          var6 = var7;
          var2 = var6;
          for (var3 = 0; var8.length > var3; var3++) {
            var4 = var8[var3];
            if (var4 == param0) {
              return true;
            }
          }
          var2Lifetime1 = qe.field_b;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "ik.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var7 = 0;
        int var11 = 0;
        int stackIn_23_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int var9;
        int var10;
        int var12;
        int[] var16;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = Torquing.field_u;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = 2147483647;
        var6 = -2147483648;
        for (var7 = 0; this.field_s.length > var7; var7++) {
          var8 = this.field_o[var7];
          var9 = this.field_s[var7];
          if ((var8 + var9) > var4) {
            var4 = var9 + var8;
          }
          if (var9 - var8 < var3) {
            var3 = var9 - var8;
          }
          var10 = this.field_m[var7];
          if (var8 + var10 > var6) {
            var6 = var10 + var8;
          }
          if (var5 > var10 - var8) {
            var5 = -var8 + var10;
          }
        }
        this.field_j = new t(1 + var4 - var3, -var5 + 1 + var6);
        this.field_j.field_r = var5 + this.field_n;
        this.field_j.field_v = var3;
        if (-1 == this.field_p) {
          if (this.field_q > 0) {
            this.field_j.field_v = -this.field_j.field_s;
          } else {
            this.field_j.field_v = 640;
          }
        }
        var16 = ph.field_e;
        var8Lifetime1 = ph.field_j;
        var9Lifetime1 = ph.field_d;
        this.field_j.e();
        stackIn_23_0 = (param0 != 6) ? 16777215 : 1;
        var10Lifetime1 = stackIn_23_0;
        for (var11 = 0; this.field_s.length > var11; var11++) {
          ph.d(-var3 + this.field_s[var11], -var5 + this.field_m[var11], this.field_o[var11], var10Lifetime1);
        }
        this.field_p = param0;
        if (param1) {
          ik.a((byte) 45);
        }
        ph.a(var16, var8Lifetime1, var9Lifetime1);
    }

    final void a(int param0) {
        int var2;
        this.field_l = this.field_l + this.field_q;
        var2 = this.field_l >> 2;
        if (param0 != -2857) {
          return;
        }
        if (this.field_j != null) {
          if (this.field_q < 0 &&
            var2 + this.field_j.field_v + this.field_j.field_s < 0) {
            this.f(param0 + 2857);
          } else {
            if (0 < this.field_q &&
              var2 + this.field_j.field_v > 640) {
              this.f(0);
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 59) {
          field_k = (String[]) null;
        }
        field_k = null;
    }

    ik(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var7 = 0;
        this.field_p = -1;
        int var3 = 5 + va.a(6, (byte) 122, hg.field_e);
        this.field_o = new int[var3];
        this.field_m = new int[var3];
        this.field_s = new int[var3];
        this.field_o[0] = va.a(25, (byte) 125, hg.field_e) + 25;
        boolean[] var4 = new boolean[var3];
        for (var5 = 1; var5 < var3; var5++) {
          var6 = -1 + var5 >> 1;
          if (var5 == 1) {
            var7 = 1;
          } else {
            if (var5 != 2) {
              var7 = var4[var6] ? 1 : 0;
            } else {
              var7 = 0;
            }
          }
          var4[var5] = var7 != 0;
          var8 = this.field_o[var6];
          this.field_o[var5] = (var8 >> 1) + va.a(var8 - (var8 >> 1), (byte) 127, hg.field_e);
          if (this.field_o[var5] < 2) {
            this.field_o[var5] = 2;
          }
          var9 = this.field_o[var5];
          var10 = var8 + (-var9 + va.a((var9 >> 1) + var9, (byte) 125, hg.field_e));
          var11 = va.a(512, (byte) 125, hg.field_e);
          if (var7 != 0) {
            var11 += 256;
          } else {
            var11 += 1280;
          }
          var12 = var10 * be.field_l[var11] >> 16;
          var13 = var10 * be.field_o[var11] >> 16;
          this.field_s[var5] = var12 + this.field_s[var6];
          this.field_m[var5] = var13 + this.field_m[var6];
        }
        this.field_q = param0 + va.a(param1 - param0, (byte) 123, hg.field_e);
        if (va.a(2, (byte) 120, hg.field_e) == 0) {
          this.field_q = -this.field_q;
        }
        this.field_r = va.a(128, (byte) 120, hg.field_e) + 128;
        this.field_n = (int)Math.sqrt((double)va.a(230400, (byte) 121, hg.field_e));
    }

    static {
    }
}
