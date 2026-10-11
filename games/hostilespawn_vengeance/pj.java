/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ql {
    static int field_e;
    private oc[] field_m;
    private boolean[] field_A;
    private v field_y;
    private oj[] field_h;
    private boolean field_u;
    private v field_s;
    private v field_i;
    private boolean field_o;
    private boolean field_w;
    private v field_r;
    private oc field_j;
    private v field_k;
    private oc field_f;
    static int field_v;
    private we[] field_p;
    static bd field_l;
    private boolean field_B;
    private boolean field_n;
    private v[] field_x;
    private oc[] field_g;
    private oj field_z;
    private boolean field_q;
    private oj[] field_t;
    private int field_d;

    final void b(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_u &&
            !this.field_y.a((byte) -52)) {
            this.field_u = false;
            this.field_y.field_l = -1;
          }
          if (this.field_w &&
            !this.field_s.a((byte) -82)) {
            this.field_w = false;
            this.field_s.field_l = -1;
          }
          if (this.field_B &&
            !this.field_r.a((byte) -75)) {
            this.field_r.field_l = -1;
            this.field_B = false;
          }
          var2_int = 125 / ((param0 + 48) / 38);
          if (this.field_o) {
            for (var3 = 0; 2 > var3; var3++) {
              if (this.field_x[var3].field_l >= 0 &&
                !this.field_x[var3].a((byte) -74)) {
                this.field_o = false;
                this.field_x[var3].field_l = -1;
              }
            }
          }
          if (this.field_n) {
            if (0 == r.field_a &&
              !this.field_k.a((byte) -125)) {
              this.field_n = false;
              this.field_k.field_l = 0;
            }
            this.field_i.e(-125);
          } else {
            this.field_i.e(-125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.H(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int var5_int = 0;
        oj[] var5 = null;
        oj var7 = null;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        int var3Lifetime1;
        int var5_intLifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (0 <= this.field_y.field_l &&
            kh.field_Q[4]) {
            this.field_u = true;
          }
          if (this.field_r.field_l >= 0 &&
            !this.field_B &&
            this.field_z.field_n) {
            this.field_B = true;
          }
          var10 = mm.field_m[0].field_j;
          if (this.field_s.field_l >= 0 &&
            kh.field_Q[5]) {
            this.field_w = true;
          }
          if (param0 >= ~this.field_x[0].field_l &&
            !this.field_o &&
            r.field_a != 0) {
            for (var3 = 0; 2 > var3; var3++) {
              if (this.field_o) {
                break;
              }
              if (ih.a(this.field_g[var3], (byte) -106, var10) <= 2) {
                this.field_o = true;
                this.field_x[1 - var3].field_l = -1;
              }
            }
          }
          var3Lifetime1 = 0;
          var4 = null;
          for (var5_int = 0; var5_int < this.field_t.length; var5_int++) {
            if (this.field_t[var5_int].field_i == 126) {
              var3Lifetime1++;
              if (!this.field_A[var5_int]) {
                var4 = this.field_t[var5_int];
                this.field_A[var5_int] = true;
              }
            }
          }
          if (r.field_a == 0 &&
            !this.field_q) {
            var9 = 0;
            var5_intLifetime1 = var9;
            while (var9 < 2) {
              if (!this.field_A[var9] &&
                ih.a(var10, (byte) -93, this.field_m[var9]) < 2) {
                if (1 == var9) {
                  ca.a((double)this.field_m[var9].field_e + 1.5, 1, 1.0 + (double)this.field_m[var9].field_g, true, 192);
                } else {
                  ca.a(1.5 + (double)this.field_m[var9].field_e, 1, (double)(this.field_m[var9].field_g + 1), true, 192);
                }
                this.field_q = true;
              }
              var9++;
            }
          }
          if (r.field_a == 0 &&
            this.field_q &&
            of.field_d != dn.field_i) {
            r.field_a = 1;
            this.field_q = false;
            kd.a(0, 1);
            nh.field_E.a((byte) 46, this.field_j);
          }
          if (var3Lifetime1 > this.field_d) {
            this.field_d = var3Lifetime1;
            if (this.field_A[2]) {
              r.field_a = 0;
              kd.a(4, param0 ^ -2);
              nh.field_E.a(-1, 8360, -1);
              if (var3Lifetime1 == 3) {
                le.field_D = 5;
              }
              var5 = this.field_h;
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6];
                if (var7 != null) {
                  var7.field_I = 0;
                }
              }
            } else {
              r.field_a = 1;
            }
            if (ln.field_a.field_g[((oj) (var4)).field_j.b(-4)] > 0 &&
              ln.field_a.field_g[((oj) (var4)).field_j.b(-4)] == ln.field_a.field_g[this.field_z.field_j.b(-4)]) {
              if (this.field_z.field_i == 27) {
                this.field_z.c((byte) 45);
              }
              this.field_r.field_l = -1;
              this.field_B = false;
            }
            if (var3Lifetime1 == 2) {
              if (var10.field_g >= 40) {
                if (var10.field_e >= 48) {
                  this.field_i.field_l = 1776;
                  this.field_i.field_d = 2136;
                } else {
                  this.field_i.field_d = 1536;
                  this.field_i.field_l = 360;
                }
              } else {
                this.field_i.field_d = 552;
                this.field_i.field_l = 1968;
              }
              this.field_i.field_a = 1;
            }
          }
          if (3 > var3Lifetime1) {
            le.field_D = 0;
          }
          if (!this.field_n &&
            0 <= this.field_k.field_l &&
            ha.field_t == 4 &&
            ih.a(var10, (byte) -93, this.field_j) <= 2) {
            this.field_n = true;
          }
          if (0 == (ng.field_u & 15)) {
            this.a(this.field_f, param0 ^ 0);
          }
          super.d(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.C(" + param0 + ')');
        }
    }

    final static int a(s param0, s param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 29280) {
            pj.c((byte) 120);
          }
          var4 = (String) null;
          stackIn_3_0 = lb.a(0, (byte) 125, param1, false, param0, (String) null, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pj.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        try {
          field_l = null;
          if (param0 <= 34) {
            field_v = -116;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "pj.B(" + param0 + ')');
        }
    }

    final void e(int param0) {
        int incrementValue$1 = 0;
        int var6_int = 0;
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        int var5_int = 0;
        oj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var15 = null;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var12 = ln.field_a.field_v;
          var10 = var12;
          var9 = var10;
          var15 = var9;
          kd.a(0, param0 + 1);
          this.field_j = new oc(var12[2], var12[3]);
          nh.field_E.a((byte) 46, this.field_j);
          this.field_y = new v(m.field_k, var12[4] * 24 - 100, 24 * (-5 + var12[5]) - 30, 200);
          if (kh.field_Q[4]) {
            this.field_y.field_l = -1;
          }
          this.field_s = new v(bn.field_n, 0, var12[7] * 24, 200);
          this.field_s.field_l = 24 * (3 + var12[6]);
          if (kh.field_Q[5]) {
            this.field_s.field_l = -1;
          }
          this.field_r = new v(jj.field_f, 0, 24 * (1 + var12[9]), 200);
          this.field_r.field_l = var12[8] * 24 + 48;
          for (var3 = 0; var3 < 2; var3++) {
            this.field_g[var3] = new oc(var9[2 * var3 + 10], var9[11 + var3 * 2]);
            this.field_x[var3] = new v(bc.field_k, 0, this.field_g[var3].field_g * 24, 200);
            this.field_x[var3].field_l = this.field_g[var3].field_e * 24 + 48;
          }
          this.field_f = new oc();
          var3Lifetime1 = param0;
          while (ll.field_a > var3Lifetime1) {
            if (wh.field_b[var3Lifetime1].field_i == 0 &&
              wh.field_b[var3Lifetime1].field_h == 4) {
              this.field_f.a((byte) 46, wh.field_b[var3Lifetime1].field_j);
            } else {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          var3Lifetime2 = 0;
          for (var4 = 0; var4 < el.field_j; var4++) {
            if (mm.field_m[var4].field_i == 125) {
              incrementValue$1 = var3Lifetime2;
              var3Lifetime2++;
              this.field_t[incrementValue$1] = mm.field_m[var4];
            } else {
              if (mm.field_m[var4].field_i == 27) {
                this.field_z = mm.field_m[var4];
              }
            }
          }
          this.field_m[0] = new oc(var15[14], var15[15]);
          this.field_m[1] = new oc(var15[16], var15[17]);
          this.field_p[0] = new we(this.field_m[0]);
          this.field_p[1] = new we(this.field_m[1]);
          for (var3Lifetime3 = 0; 2 > var3Lifetime3; var3Lifetime3++) {
            var4Lifetime1 = 1000;
            var5_int = -1;
            for (var6_int = var3Lifetime3; var6_int < 3; var6_int++) {
              var7 = ih.a(this.field_m[var3Lifetime3], (byte) -76, this.field_t[var6_int].field_j);
              if (var7 < var4Lifetime1) {
                var5_int = var6_int;
                var4Lifetime1 = var7;
              }
            }
            if (var5_int != var3Lifetime3) {
              var6 = this.field_t[var3Lifetime3];
              this.field_t[var3Lifetime3] = this.field_t[var5_int];
              this.field_t[var5_int] = var6;
            }
          }
          var3Lifetime4 = 0;
          for (var4Lifetime2 = 0; var4Lifetime2 < el.field_j; var4Lifetime2++) {
            var5 = mm.field_m[var4Lifetime2];
            if (20 == var5.field_i) {
              incrementValue$0 = var3Lifetime4;
              var3Lifetime4++;
              this.field_h[incrementValue$0] = var5;
            }
          }
          this.field_i = new v(e.field_k, 0, 0);
          this.field_k = new v(vf.field_I, 24 * this.field_j.field_e, 24 * (-4 + this.field_j.field_g), 200);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.G(" + param0 + ')');
        }
    }

    final String a(boolean param0) {
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            pj.c((byte) 57);
          }
          if (4 == ha.field_t) {
            stackIn_6_0 = q.field_l;
            return stackIn_6_0;
          }
          stackIn_8_0 = tc.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.D(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (ha.field_t != 4) {
            var2_int = -72 / ((param0 - 38) / 53);
            return true;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < this.field_m.length; var2_intLifetime1++) {
            if (126 != this.field_t[var2_intLifetime1].field_i) {
              this.field_p[var2_intLifetime1].a((byte) -46);
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "pj.E(" + param0 + ')');
        }
    }

    public pj() {
        this.field_h = new oj[4];
        this.field_A = new boolean[3];
        this.field_m = new oc[2];
        this.field_p = new we[2];
        this.field_g = new oc[2];
        this.field_x = new v[2];
        this.field_t = new oj[3];
        this.field_d = 0;
    }

    static {
    }
}
