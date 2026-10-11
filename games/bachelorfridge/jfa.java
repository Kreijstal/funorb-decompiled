/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jfa extends bw {
    lna field_v;
    int field_y;
    int field_n;
    static int field_w;
    int field_z;
    eaa field_i;
    int field_x;
    int field_p;
    private Random field_r;
    boolean field_s;
    int field_l;
    lga field_o;
    wda[][] field_m;
    int field_u;
    int field_k;
    private kv field_j;
    private int field_h;
    static qc[] field_q;
    rk field_g;
    static sna field_f;
    private boolean field_t;

    public static void c(boolean param0) {
        field_q = null;
        field_f = null;
        if (param0) {
          field_q = (qc[]) null;
        }
    }

    private final int b(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        pd var7;
        int var7_int;
        int var8;
        int var9;
        int var4Lifetime1;
        int var6Lifetime1;
        var8 = BachelorFridge.field_y;
        stackIn_3_0 = (dm.field_f > 0) ? 0 : 1;
        var2 = stackIn_3_0;
        var3 = -117 % ((param0 - 6) / 37);
        stackIn_6_0 = (var2 == 0) ? 5 : 2;
        var4 = stackIn_6_0;
        var5 = 2;
        if (this.field_g.field_o.field_k.field_b == 7) {
          var5 = 4;
        } else {
          if (this.field_g.field_o.field_k.field_b == 6) {
            var5 = 3;
          }
        }
        var6 = 1;
        while (var6 < var4) {
          if (this.field_g.field_g[-2 + var6 * 3]) {
            var6++;
            continue;
          }
          var7_int = this.field_g.field_o.field_c[-2 + 3 * var6];
          if (var6 >= 5 - var5) {
            return fw.field_h[var7_int].field_g.field_b;
          }
          return var7_int;
        }
        stackIn_21_0 = (var2 == 0) ? 15 : 6;
        var4Lifetime1 = stackIn_21_0;
        var9 = 2;
        var6Lifetime1 = var9;
        while (var9 < var4Lifetime1) {
          if (!this.field_g.field_g[-2 + var9]) {
            var7 = fw.field_h[this.field_g.field_o.field_c[-2 + var9]];
            return var7.field_g.field_b;
          }
          var9++;
        }
        return -1;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param2 > 12 + this.field_n && param2 < this.field_n - (-12 - (bd.field_i.field_q >> 2)) && param0 > 10 + (-38 + this.field_k) &&
          !(param0 >= -38 + this.field_k - (-10 - (bd.field_i.field_p >> 2)))) {
          return true;
        }
        if (param1 <= 115) {
          this.field_j = (kv) null;
          return false;
        }
        return false;
    }

    final int c(byte param0) {
        if (param0 >= -113) {
          return 37;
        }
        return 10 + 56 * this.field_u;
    }

    final void d(int param0) {
        boolean discarded$1 = false;
        pv var2_ref_pv;
        int var2;
        if (this.field_i.e(12917)) {
          discarded$1 = this.f(-4);
        } else {
          var2_ref_pv = (pv) (this.field_i.b((byte) 90));
          if (var2_ref_pv.b(true)) {
            var2_ref_pv.a(false);
          }
        }
        this.field_v.c(11);
        var2 = 84 / ((57 - param0) / 36);
    }

    final static kv[] a(vr param0, int param1, String param2) {
        int var4 = 0;
        int var6 = 0;
        kv[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv[] var3 = null;
        RuntimeException var3_ref = null;
        Object var5 = null;
        kv[] var5_array = null;
        int var7 = 0;
        String var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          var3 = new kv[50];
          if (param1 != 4) {
            var8 = (String) null;
            jfa.a((vr) null, -103, (String) null);
          }
          for (var4 = 0; var4 < 5; var4++) {
            var5 = null;
            if (!param2.equals("left_eye") &&
              !param2.equals("right_eye") &&
              !param2.equals("mouth")) {
              var5_array = gw.a("bacteria_components", param2 + "_0" + var4, param0, param1 - 51);
            } else {
              var5_array = pi.a(param0, -8845, "bacteria_components", param2 + "_0" + var4);
            }
            for (var6 = 0; var6 < var5_array.length; var6++) {
              var3[10 * var4 + var6] = var5_array[var6];
            }
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("jfa.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final boolean f(int param0) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (!this.field_t) {
          this.c(-1681546622);
        }
        if (this.field_t &&
          null == this.field_o) {
          this.field_o = new lga(this);
          this.field_o.a((byte) 86);
          this.field_o.a(8);
          return false;
        }
        if (this.field_o != null &&
          !this.field_o.field_e.e(12917)) {
          this.field_o.b((byte) 82);
          return true;
        }
        if (this.field_o != null && (this.field_o == null ||
          !this.field_o.field_e.e(12917))) {
          if (param0 != -4) {
            jfa.a(false, 33);
          }
          return false;
        }
        this.field_t = false;
        if (this.field_o != null &&
          this.field_o.field_e.e(12917) &&
          null != this.field_m[this.field_u][this.field_l].field_f &&
          this.field_m[this.field_u][this.field_l].field_f.field_a &&
          this.field_g.a((byte) 77, this.field_m[this.field_u][this.field_l].field_f.field_d, dm.field_f)) {
          this.field_i.a(new vma(this, this.field_m[this.field_u][this.field_l].field_f), true);
          this.field_i.a(new vu(this, true), true);
          this.field_y = -1;
          jba.a(this.field_m[this.field_u][this.field_l].field_f, this, 89);
          this.field_v = this.field_g.e((byte) -108);
          this.field_m[this.field_u][this.field_l].field_f.field_a = false;
        }
        this.field_z = -1;
        this.field_x = -1;
        this.field_o = null;
        var2 = kla.a(1500, this.field_r, param0 ^ 2147483644);
        if (-1 + this.field_m[0].length > this.field_l &&
          this.field_m[this.field_u][this.field_l].field_e == 0) {
          if (this.field_l < -1 + this.field_m[0].length) {
            this.field_i.a(new laa(this, 39), true);
            if (0 != this.field_m[this.field_u][1 + this.field_l].field_e) {
              this.field_i.a(new ni(this), true);
            }
          }
          return true;
        }
        if (this.field_m[0].length - 1 > this.field_l &&
          this.field_m[this.field_u][this.field_l].field_e == 2 &&
          var2 < 200) {
          if (this.field_l < -1 + this.field_m[0].length) {
            this.field_i.a(new laa(this, 39), true);
          }
          if (0 != this.field_m[this.field_u][this.field_l + 1].field_e) {
            this.field_i.a(new ni(this), true);
          }
          return true;
        }
        if (this.field_m[this.field_u][this.field_l].field_e == 3 &&
          var2 < 300) {
          if (var2 < 250) {
            if (this.field_l > 2 &&
              this.field_m[this.field_u][-1 + this.field_l].field_e == 3) {
              this.field_i.a(new qd(this, -78), true);
            }
          } else {
            if (this.field_l < this.field_m[0].length - 2 &&
              3 == this.field_m[this.field_u][1 + this.field_l].field_e) {
              this.field_i.a(new qd(this, 78), true);
            }
          }
          return true;
        }
        if (this.field_u > 0 &&
          var2 < 550) {
          if (0 != this.field_m[this.field_u - 1][this.field_l].field_e) {
            this.field_i.a(new aja(this, -56), true);
          }
          return true;
        }
        if (this.field_u < -1 + this.field_m.length &&
          800 > var2) {
          if (0 != this.field_m[this.field_u + 1][this.field_l].field_e) {
            this.field_i.a(new aja(this, 56), true);
          }
          return true;
        }
        if (var2 >= 1200) {
          this.a(102);
          if (this.field_g.field_f != -1) {
            this.field_i.a(new vu(this, false), true);
          }
          return false;
        }
        if (var2 < 1000) {
          this.field_i.a(new ia(this), true);
        } else {
          this.field_i.a(new uc(this), true);
        }
        if (var2 < 1020) {
          this.field_y = this.b(124);
        }
        if (this.field_g.field_f == -1) {
          return true;
        }
        this.field_i.a(new vu(this, false), true);
        return true;
    }

    private final void c(int param0) {
        int var4 = 0;
        int var6 = 0;
        int var2;
        int var3;
        int var5;
        int var7;
        var7 = BachelorFridge.field_y;
        var2 = 4;
        var3 = 0;
        for (var4 = -3; var4 <= 3; var4++) {
          var5 = -Math.abs(var4) + 3;
          for (var6 = -var5; var6 <= var5; var6++) {
            if (var4 + this.field_u >= 0 &&
              -1 + this.field_m.length >= var4 + this.field_u &&
              this.field_l + var6 >= 0 &&
              this.field_m[0].length - 1 >= this.field_l + var6 &&
              this.field_m[var4 + this.field_u][this.field_l + var6].field_f != null &&
              this.field_m[var4 + this.field_u][this.field_l + var6].field_f.field_a &&
              Math.abs(var4) + Math.abs(var6) < var2 && (this.field_g.field_o.a(this.field_m[this.field_u + var4][this.field_l + var6].field_f.field_d, 0, this.field_g.field_g) != -1 ||
              -1 != this.field_g.field_o.a(119, this.field_m[this.field_u + var4][var6 + this.field_l].field_f.field_d, this.field_g.field_g))) {
              var2 = Math.abs(var4) + Math.abs(var6);
              var3 = 1;
              this.field_x = var4 + this.field_u;
              this.field_z = this.field_l + var6;
              this.field_t = true;
            }
          }
        }
        if (param0 != -1681546622) {
          this.field_h = 12;
        }
        if (var3 == 0 ||
          0 == this.field_m[this.field_u][this.field_l].field_e &&
          this.field_l < -2 + this.field_m[0].length) {
          this.field_t = false;
          this.field_z = -1;
          this.field_x = -1;
        }
    }

    private final void a(int param0) {
        this.field_t = true;
        this.field_x = kla.a(6, this.field_r, -2147483648);
        this.field_z = kla.a(10, this.field_r, -2147483648);
        if (this.field_m[this.field_x][this.field_z].field_e == 3) {
          this.field_t = false;
          this.field_z = -1;
          this.field_x = -1;
        }
        int var2 = 115 % ((param0 - 22) / 59);
    }

    final static int e(int param0) {
        if (param0 >= -39) {
          field_f = (sna) null;
        }
        return tf.field_n;
    }

    final int b(boolean param0) {
        if (!param0) {
          this.field_o = (lga) null;
        }
        return 84 + this.field_l * 39;
    }

    final void g(int param0) {
        this.field_i = new eaa();
        this.field_o = null;
        this.field_x = -1;
        this.field_z = -1;
        this.field_t = false;
        if (param0 != 0) {
          this.field_m = (wda[][]) null;
        }
    }

    final static int a(boolean param0, int param1) {
        String var2 = lka.field_E[param1][18];
        var2 = var2.trim();
        if (param0) {
          jfa.a(true, -76);
        }
        var2 = var2.toLowerCase();
        if (var2.equals("")) {
          return -1;
        }
        return ((ji) (eu.field_b.a(true, (long)var2.hashCode()))).field_h;
    }

    final void a(byte param0, int param1) {
        int var4 = 0;
        int var5;
        vu var6;
        vu var7;
        var5 = BachelorFridge.field_y;
        if (param0 <= 39) {
          return;
        }
        if (this.field_g.field_f != -1) {
          this.field_j.e(15 + this.field_n + param1, -13 + this.field_k, 39, 48, 128);
        }
        this.field_v.a(this.field_s, false, this.field_p >> 1, this.field_h >> 1, 0, -15, 256, this.field_n + param1, this.field_k - 33);
        if (this.field_y != -1 &&
          this.field_g.field_f == -1) {
          bna.field_v.e(param1 + this.field_n + 10, this.field_k - 44);
          mq.field_b[this.field_y].e(this.field_n + 23 + param1, this.field_k - 38);
        }
        if (this.field_i.b((byte) 90) instanceof vu) {
          var6 = (vu) (this.field_i.b((byte) 90));
          var7 = var6;
          for (var4 = 0; var4 < var7.field_m.length; var4++) {
            if (var6.field_m[var4][2] <= 0) {
              return;
            }
            iq.field_l.c(param1 + (30 - var6.field_m[var4][0]) + this.field_n, -var6.field_m[var4][1] + this.field_k, var6.field_m[var4][3], var6.field_m[var4][3]);
          }
        }
    }

    jfa(rk param0, int param1, int param2, wda[][] param3) {
        int[] var5 = null;
        int[] var8 = null;
        int[] var7 = null;
        int[] var6 = null;
        int[] var5Lifetime1;
        this.field_x = -1;
        this.field_p = 2048;
        this.field_h = 2048;
        this.field_y = -1;
        this.field_z = -1;
        try {
          this.field_l = param2;
          this.field_g = param0;
          this.field_u = param1;
          this.field_n = this.c((byte) -120);
          this.field_k = this.b(true);
          this.field_m = param3;
          this.field_v = this.field_g.e((byte) -127);
          this.field_i = new eaa();
          this.field_r = new Random();
          this.field_j = new kv(39, 39);
          var5 = new int[256];
          var8 = a.a(0, 256, 16763049, 4552212);
          var7 = var8;
          var6 = var7;
          var5Lifetime1 = var6;
          this.field_j.b();
          dg.a(320, 320, 304, 255, var8);
          hga.field_U.a((byte) -53);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jfa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new qc[9];
    }
}
