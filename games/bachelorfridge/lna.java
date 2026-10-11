/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lna {
    int field_b;
    private int field_d;
    private int field_B;
    private int field_t;
    private int field_g;
    boolean field_i;
    private int field_k;
    int field_s;
    private kv[] field_D;
    private int field_p;
    static sna field_C;
    private int field_m;
    private kv field_a;
    static String field_h;
    static boolean field_q;
    private int field_c;
    private int field_z;
    private boolean field_o;
    private int field_n;
    bba field_u;
    private kja[] field_j;
    boolean field_x;
    private int field_w;
    boolean field_v;
    private int field_e;
    private int[] field_l;
    boolean field_A;
    static boolean field_f;
    static String[][] field_y;
    private int field_r;

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var13 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        nla var12;
        int var14;
        int var15;
        var15 = BachelorFridge.field_y;
        bd.field_i.b();
        dg.d();
        var12 = this.field_u.a(-113);
        for (var13 = 0; 6 > var13; var13++) {
          if (cma.field_v[var13] != 11) {
            var10 = -this.field_D[vt.field_l[var13]].field_o + this.field_D[vt.field_l[var13]].field_p + var12.field_g[vt.field_l[var13]].field_l + (this.field_j[vt.field_l[var13]].field_b + (var12.field_g[vt.field_l[var13]].field_e >> 1));
            var7 = (int)((double)var12.field_g[vt.field_l[var13]].field_d * (4096.0 / (double)this.field_D[vt.field_l[var13]].field_n));
            var11 = 0;
            var9 = (var12.field_g[vt.field_l[var13]].field_d >> 1) + (var12.field_g[vt.field_l[var13]].field_h + this.field_j[vt.field_l[var13]].field_a + (-this.field_D[vt.field_l[var13]].field_n + this.field_D[vt.field_l[var13]].field_q));
            var8 = (int)((double)var12.field_g[vt.field_l[var13]].field_e * (4096.0 / (double)this.field_D[vt.field_l[var13]].field_o));
            if (this.field_l[8] == 0 &&
              0 == this.field_l[1] ||
              this.field_l[8] == 20 &&
              this.field_l[1] == 20 ||
              this.field_l[8] == 5 &&
              this.field_l[1] == 5) {
              var11 = var12.field_g[vt.field_l[var13]].field_j;
            }
            if (vt.field_l[var13] != 1 &&
              vt.field_l[var13] != 2) {
              var11 = var12.field_g[vt.field_l[var13]].field_j;
            }
            if (1 != vt.field_l[var13] &&
              vt.field_l[var13] != 2 &&
              3 != vt.field_l[var13]) {
              gna.a(var7, -101, var9 << 4, this.field_D[vt.field_l[var13]].field_o << 3, this.field_D[vt.field_l[var13]].field_n << 3, var10 << 4, this.field_D[vt.field_l[var13]], var11, var8);
            } else {
              vg.a(this.field_D[vt.field_l[var13]], var9 << 4, 22997, var11, var7, var10 << 4, var8, this.field_D[vt.field_l[var13]].field_o << 3, this.field_D[vt.field_l[var13]].field_n << 3);
            }
          } else {
            var8 = (int)((double)var12.field_g[8].field_e * (4096.0 / (double)this.field_D[vt.field_l[var13]].field_o));
            var7 = (int)(4096.0 / (double)this.field_D[vt.field_l[var13]].field_n * (double)var12.field_g[8].field_d);
            var8 += 256;
            var11 = 0;
            var9 = this.field_D[8].field_q - this.field_D[8].field_n + var12.field_g[8].field_h + (this.field_j[8].field_a + (var12.field_g[8].field_d >> 1));
            var10 = this.field_D[8].field_p + (-this.field_D[8].field_o + (var12.field_g[8].field_e >> 1) + (this.field_j[8].field_b + var12.field_g[8].field_l));
            var7 += 256;
            if (this.field_l[8] == 0 &&
              this.field_l[1] == 0 ||
              this.field_l[8] == 20 &&
              20 == this.field_l[1] ||
              this.field_l[8] == 5 &&
              this.field_l[1] == 5) {
              var11 = var12.field_g[8].field_j;
            }
            if (cma.field_v[var13] != 1 &&
              cma.field_v[var13] != 2) {
              var11 = var12.field_g[8].field_j;
            }
            gna.a(var7, -114, var9 << 4, this.field_D[8].field_o << 3, this.field_D[8].field_n << 3, var10 << 4, this.field_D[vt.field_l[var13]], var11, var8);
          }
        }
        var14 = 32 / ((-77 - param5) / 45);
        hga.field_U.a((byte) 123);
        this.a(param2, param0, param3, (byte) 121, param4, param1, 0);
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param4 == -1) {
          this.field_u = null;
          return;
        }
        this.field_u = new bba(aca.a((byte) -100, param1, param4), param0);
        this.field_u.field_c = param2;
        if (!param3) {
          this.field_l = (int[]) null;
        }
        if (0 == param4) {
          this.field_u.field_d = this.field_u.field_d + kla.a(100, m.field_a, -2147483648);
        }
    }

    final void a(int param0) {
        if (this.field_A) {
          return;
        }
        this.field_D = wj.a(-863, this.field_l);
        ek.a((byte) -25, this.field_l);
        this.field_A = true;
        if (param0 != 8) {
          this.a(-65);
        }
    }

    final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        boolean stackIn_11_1 = false;
        if (param7 <= dg.field_h &&
          param8 <= dg.field_k &&
          dg.field_f <= bd.field_i.field_q + param7 &&
          param8 + bd.field_i.field_p >= dg.field_j) {
          param4 = param4 & 65535;
          if (null == this.field_u) {
            this.a(param4, param2, param3, 0, param7, param6, param8, param1, param0);
          } else {
            stackIn_11_1 = (param0);
            this.field_x = stackIn_11_1;
            this.b(9);
            hga.field_U.a((byte) -105);
            if (this.field_x) {
              bd.field_i.e();
            }
            this.a(param4, param3, param2, (byte) 110, param1, param6, param8, param7);
            if (param5 >= -8) {
              this.field_g = 117;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        var13 = BachelorFridge.field_y;
        if (this.field_o) {
          this.a(param1, param4, 0, param2, 16632, param5, param0);
          return;
        }
        this.field_a = new kv(160, 140);
        if (param3 != 8) {
          this.b((byte) -93);
        }
        this.field_a.b();
        dg.d();
        for (var12 = 0; var12 < 6; var12++) {
          if (11 == cma.field_v[var12]) {
            var8 = (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_p) * this.field_j[vt.field_l[var12]].field_d;
            var7 = this.field_j[vt.field_l[var12]].field_c * (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_q);
            var7 += 128;
            var8 += 128;
            var10 = this.field_j[8].field_b + (this.field_D[8].field_o >> 1) - (this.field_D[8].field_o - this.field_D[8].field_p);
            var9 = -this.field_D[8].field_n + this.field_D[8].field_q + ((this.field_D[8].field_n >> 1) + this.field_j[8].field_a);
            var10 -= 20;
            var11 = 0;
            gna.a(var7, -117, var9 << 4, this.field_D[8].field_o << 3, this.field_D[8].field_n << 3, var10 << 4, this.field_D[vt.field_l[var12]], var11, var8);
          } else {
            var9 = (this.field_D[vt.field_l[var12]].field_n >> 1) + (this.field_j[vt.field_l[var12]].field_a - this.field_D[vt.field_l[var12]].field_n) + this.field_D[vt.field_l[var12]].field_q;
            var7 = this.field_j[vt.field_l[var12]].field_c * (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_q);
            var8 = this.field_j[vt.field_l[var12]].field_d * (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_p);
            var10 = (this.field_D[vt.field_l[var12]].field_o >> 1) + this.field_j[vt.field_l[var12]].field_b - this.field_D[vt.field_l[var12]].field_o + this.field_D[vt.field_l[var12]].field_p;
            var11 = 0;
            var10 -= 20;
            if (vt.field_l[var12] != 1 &&
              vt.field_l[var12] != 2 &&
              vt.field_l[var12] != 3) {
              gna.a(var7, param3 ^ -107, var9 << 4, this.field_D[vt.field_l[var12]].field_o << 3, this.field_D[vt.field_l[var12]].field_n << 3, var10 << 4, this.field_D[vt.field_l[var12]], var11, var8);
            } else {
              vg.a(this.field_D[vt.field_l[var12]], var9 << 4, param3 ^ 23005, var11, var7, var10 << 4, var8, this.field_D[vt.field_l[var12]].field_o << 3, this.field_D[vt.field_l[var12]].field_n << 3);
            }
          }
        }
        hga.field_U.a((byte) -8);
        this.field_o = true;
        this.a(param1, param4, 0, param2, param3 ^ 16624, param5, param0);
    }

    private final void b(byte param0) {
        int var3 = 0;
        kja dupTemp$0 = null;
        kja dupTemp$1 = null;
        kja dupTemp$2 = null;
        kja dupTemp$3 = null;
        int var2 = 0;
        int var4 = BachelorFridge.field_y;
        int var2Lifetime1;
        this.field_j = new kja[14];
        for (var2 = 0; var2 < 14; var2++) {
          this.field_j[var2] = new kja();
        }
        this.field_j[6].field_c = this.field_D[6].field_q;
        this.field_j[6].field_d = this.field_D[6].field_p;
        this.field_j[6].field_a = 200;
        this.field_j[6].field_b = 290;
        this.field_j[10].field_d = this.field_D[10].field_p;
        this.field_j[10].field_c = this.field_D[10].field_q;
        this.field_j[10].field_b = this.field_e + (190 + this.field_k);
        this.field_j[10].field_a = this.field_g + (this.field_w + 230);
        this.field_j[13].field_a = this.field_g + this.field_w + 230;
        this.field_j[13].field_c = this.field_D[13].field_q;
        this.field_j[13].field_d = this.field_D[13].field_p;
        this.field_j[13].field_b = this.field_k + (190 + this.field_e);
        this.field_j[9].field_a = this.field_g + 230;
        this.field_j[9].field_d = this.field_D[9].field_p;
        this.field_j[9].field_b = 190 + this.field_e;
        this.field_j[9].field_c = this.field_D[9].field_q;
        this.field_j[12].field_d = this.field_D[12].field_p;
        this.field_j[12].field_a = this.field_g + 230;
        this.field_j[12].field_b = this.field_e + 190;
        this.field_j[12].field_c = this.field_D[12].field_q;
        this.field_j[8].field_b = 190;
        this.field_j[8].field_a = 230;
        this.field_j[8].field_c = this.field_D[8].field_q;
        this.field_j[8].field_d = this.field_D[8].field_p;
        this.field_j[11].field_b = 190;
        this.field_j[11].field_c = this.field_D[11].field_q;
        this.field_j[11].field_d = this.field_D[11].field_p;
        this.field_j[11].field_a = 230;
        this.field_j[7].field_c = this.field_D[7].field_q;
        this.field_j[7].field_d = this.field_D[7].field_p;
        this.field_j[7].field_a = 260;
        this.field_j[7].field_b = 297;
        this.field_j[3].field_c = this.field_D[3].field_q;
        this.field_j[3].field_d = this.field_D[3].field_p;
        this.field_j[3].field_a = 230 + this.field_r;
        this.field_j[3].field_b = this.field_d + 190;
        this.field_j[5].field_d = this.field_D[5].field_p;
        this.field_j[5].field_a = 200;
        this.field_j[5].field_c = this.field_D[5].field_q;
        this.field_j[5].field_b = 235;
        this.field_j[4].field_a = 275;
        this.field_j[4].field_c = this.field_D[4].field_q;
        this.field_j[4].field_d = this.field_D[4].field_p;
        this.field_j[4].field_b = 235;
        this.field_j[1].field_c = this.field_D[1].field_q;
        this.field_j[1].field_a = this.field_c + 230;
        this.field_j[1].field_b = this.field_p + 190;
        this.field_j[1].field_d = this.field_D[1].field_p;
        this.field_j[2].field_b = 190 + this.field_z;
        this.field_j[2].field_c = this.field_D[2].field_q;
        this.field_j[2].field_d = this.field_D[2].field_p;
        var2Lifetime1 = -16 % ((param0 + 3) / 53);
        this.field_j[2].field_a = this.field_B + 230;
        this.field_j[0].field_d = this.field_D[0].field_p;
        this.field_j[0].field_b = this.field_n + 190;
        this.field_j[0].field_a = 230 + this.field_m;
        this.field_j[0].field_c = this.field_D[0].field_q;
        for (var3 = 0; 14 > var3; var3++) {
          dupTemp$0 = this.field_j[var3];
          dupTemp$0.field_a = dupTemp$0.field_a - (this.field_D[var3].field_q >> 1);
          dupTemp$1 = this.field_j[var3];
          dupTemp$1.field_a = dupTemp$1.field_a - 116;
          dupTemp$2 = this.field_j[var3];
          dupTemp$2.field_b = dupTemp$2.field_b - (this.field_D[var3].field_p >> 1);
          dupTemp$3 = this.field_j[var3];
          dupTemp$3.field_b = dupTemp$3.field_b - 50;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = param2 * bd.field_i.field_n / 4096;
        int var9 = bd.field_i.field_o * param5 / 4096;
        int var10 = 42 * param2 / 4096;
        int var11 = param5 / 4096;
        if (this.field_i) {
          bd.field_i.b(var10 + param0, var11 + param1, var8, var9, 7837199);
          param4 = 192;
        }
        int var12 = 26 % ((param3 - 35) / 56);
        if (this.field_v) {
          bd.field_i.b(var10 + param0, var11 + param1, var8, var9, 16736256);
          param4 = 192;
        }
        if (param4 < 256) {
          bd.field_i.c(var10 + param0, param1 + var11, var8, var9, param4);
        } else {
          bd.field_i.c(param0 + var10, var11 + param1, var8, var9);
        }
    }

    private final void b(int param0) {
        int var8 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        nla var10;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = BachelorFridge.field_y;
        bd.field_i.b();
        dg.d();
        var10 = this.field_u.a(param0 ^ -125);
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        if (param0 != 9) {
          return;
        }
        var7 = 0;
        for (var8 = 0; var8 < 14; var8++) {
          if (cma.field_v[var8] != 13) {
            if (12 == cma.field_v[var8]) {
              var4Lifetime1 = (int)((double)var10.field_g[9].field_e * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_o));
              var3Lifetime1 = (int)((double)var10.field_g[9].field_d * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_n));
              var6Lifetime1 = (var10.field_g[9].field_e >> 1) + (this.field_j[9].field_b - (-var10.field_g[9].field_l + this.field_D[9].field_o)) + this.field_D[9].field_p;
              var5Lifetime1 = -this.field_D[9].field_n + (this.field_D[9].field_q + ((var10.field_g[9].field_d >> 1) + this.field_j[9].field_a)) + var10.field_g[9].field_h;
              var3Lifetime1 += 256;
              var7Lifetime1 = 0;
              var4Lifetime1 += 256;
              if (0 == this.field_l[8] &&
                0 == this.field_l[1] ||
                this.field_l[8] == 20 &&
                this.field_l[1] == 20 ||
                this.field_l[8] == 5 &&
                this.field_l[1] == 5) {
                var7Lifetime1 = var10.field_g[9].field_j;
              }
              if (cma.field_v[var8] != 1 &&
                2 != cma.field_v[var8]) {
                var7Lifetime1 = var10.field_g[9].field_j;
              }
              gna.a(var3Lifetime1, -108, var5Lifetime1 << 4, this.field_D[9].field_o << 3, this.field_D[9].field_n << 3, var6Lifetime1 << 4, this.field_D[cma.field_v[var8]], var7Lifetime1, var4Lifetime1);
            } else {
              if (cma.field_v[var8] != 11) {
                var4Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var8]].field_o * (double)var10.field_g[cma.field_v[var8]].field_e);
                var3Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var8]].field_n * (double)var10.field_g[cma.field_v[var8]].field_d);
                var5Lifetime1 = this.field_D[cma.field_v[var8]].field_q - this.field_D[cma.field_v[var8]].field_n + this.field_j[cma.field_v[var8]].field_a - (-var10.field_g[cma.field_v[var8]].field_h - (var10.field_g[cma.field_v[var8]].field_d >> 1));
                var7Lifetime1 = 0;
                var6Lifetime1 = (var10.field_g[cma.field_v[var8]].field_e >> 1) + (var10.field_g[cma.field_v[var8]].field_l + this.field_j[cma.field_v[var8]].field_b - this.field_D[cma.field_v[var8]].field_o + this.field_D[cma.field_v[var8]].field_p);
                if (this.field_l[8] == 0 &&
                  this.field_l[1] == 0 ||
                  20 == this.field_l[8] &&
                  this.field_l[1] == 20 ||
                  5 == this.field_l[8] &&
                  this.field_l[1] == 5) {
                  var7Lifetime1 = var10.field_g[cma.field_v[var8]].field_j;
                }
                if (cma.field_v[var8] != 1 &&
                  cma.field_v[var8] != 2) {
                  var7Lifetime1 = var10.field_g[cma.field_v[var8]].field_j;
                }
                if (cma.field_v[var8] != 1 &&
                  2 != cma.field_v[var8] &&
                  cma.field_v[var8] != 3) {
                  gna.a(var3Lifetime1, param0 - 103, var5Lifetime1 << 4, this.field_D[cma.field_v[var8]].field_o << 3, this.field_D[cma.field_v[var8]].field_n << 3, var6Lifetime1 << 4, this.field_D[cma.field_v[var8]], var7Lifetime1, var4Lifetime1);
                } else {
                  vg.a(this.field_D[cma.field_v[var8]], var5Lifetime1 << 4, param0 + 22988, var7Lifetime1, var3Lifetime1, var6Lifetime1 << 4, var4Lifetime1, this.field_D[cma.field_v[var8]].field_o << 3, this.field_D[cma.field_v[var8]].field_n << 3);
                }
              } else {
                var3Lifetime1 = (int)((double)var10.field_g[8].field_d * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_n));
                var4Lifetime1 = (int)((double)var10.field_g[8].field_e * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_o));
                var7Lifetime1 = 0;
                var3Lifetime1 += 256;
                var6Lifetime1 = var10.field_g[8].field_l + (this.field_j[8].field_b + ((var10.field_g[8].field_e >> 1) + (-this.field_D[8].field_o + this.field_D[8].field_p)));
                var4Lifetime1 += 256;
                var5Lifetime1 = (var10.field_g[8].field_d >> 1) + (this.field_j[8].field_a - (-var10.field_g[8].field_h - (-this.field_D[8].field_n + this.field_D[8].field_q)));
                if (this.field_l[8] == 0 &&
                  this.field_l[1] == 0 ||
                  this.field_l[8] == 20 &&
                  this.field_l[1] == 20 ||
                  this.field_l[8] == 5 &&
                  this.field_l[1] == 5) {
                  var7Lifetime1 = var10.field_g[8].field_j;
                }
                if (cma.field_v[var8] != 1 &&
                  cma.field_v[var8] != 2) {
                  var7Lifetime1 = var10.field_g[8].field_j;
                }
                gna.a(var3Lifetime1, -101, var5Lifetime1 << 4, this.field_D[8].field_o << 3, this.field_D[8].field_n << 3, var6Lifetime1 << 4, this.field_D[cma.field_v[var8]], var7Lifetime1, var4Lifetime1);
              }
            }
          } else {
            var3Lifetime1 = (int)((double)var10.field_g[10].field_d * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_n));
            var4Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var8]].field_o * (double)var10.field_g[10].field_e);
            var4Lifetime1 += 256;
            var3Lifetime1 += 256;
            var5Lifetime1 = (var10.field_g[10].field_d >> 1) + (var10.field_g[10].field_h + (this.field_j[10].field_a + (-this.field_D[10].field_n + this.field_D[10].field_q)));
            var7Lifetime1 = 0;
            var6Lifetime1 = var10.field_g[10].field_l + (this.field_j[10].field_b + (var10.field_g[10].field_e >> 1)) + (-this.field_D[10].field_o + this.field_D[10].field_p);
            if (this.field_l[8] == 0 &&
              this.field_l[1] == 0 ||
              20 == this.field_l[8] &&
              this.field_l[1] == 20 ||
              5 == this.field_l[8] &&
              5 == this.field_l[1]) {
              var7Lifetime1 = var10.field_g[10].field_j;
            }
            if (cma.field_v[var8] != 1 &&
              cma.field_v[var8] != 2) {
              var7Lifetime1 = var10.field_g[10].field_j;
            }
            gna.a(var3Lifetime1, -97, var5Lifetime1 << 4, this.field_D[10].field_o << 3, this.field_D[10].field_n << 3, var6Lifetime1 << 4, this.field_D[cma.field_v[var8]], var7Lifetime1, var4Lifetime1);
          }
        }
        return;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int[] discarded$0 = null;
        if (param2 != 256) {
          kv var6 = (kv) null;
          discarded$0 = this.a(2, -126, (kv) null, -110, false, 51, 115, (kv) null);
        }
        bd.field_i.e(-50 + param3, param0 - 50);
    }

    private final void d(int param0) {
        int[] var15 = this.a(16777215, 16711680, this.field_D[0], 16777215, true, param0 + 34, 16711680, this.field_D[8]);
        int[] var9 = var15;
        int[] var3 = var9;
        int[] var2 = var3;
        this.field_m = var15[0];
        this.field_n = var15[1];
        int[] var16 = this.a(-1, 16776960, this.field_D[1], 16777215, true, param0 ^ 88, -256, this.field_D[8]);
        int[] var10 = var16;
        int[] var4 = var10;
        var2 = var4;
        this.field_c = var16[0];
        this.field_p = var16[1];
        int[] var17 = this.a(-1, 16776960, this.field_D[2], 16777215, false, 35, -256, this.field_D[8]);
        int[] var11 = var17;
        int[] var5 = var11;
        var2 = var5;
        this.field_z = var17[param0];
        this.field_B = var17[0];
        int[] var18 = this.a(-1, 61440, this.field_D[3], 15790320, false, param0 ^ 113, -16711936, this.field_D[8]);
        int[] var12 = var18;
        int[] var6 = var12;
        var2 = var6;
        this.field_r = var18[0];
        this.field_d = var18[1];
        int[] var19 = this.a(16777215, 65535, this.field_D[9], 16777215, false, 80, 65535, this.field_D[8]);
        int[] var13 = var19;
        int[] var7 = var13;
        var2 = var7;
        this.field_e = var19[1];
        this.field_g = var19[0];
        int[] var20 = this.a(16777215, 255, this.field_D[10], 16777215, false, 82, 255, this.field_D[9]);
        int[] var14 = var20;
        int[] var8 = var14;
        var2 = var8;
        this.field_w = var20[0];
        this.field_k = var20[1];
        this.b((byte) -128);
    }

    final void c(int param0) {
        if (param0 != 11) {
          this.a(-127, 96, -98, 71, 60, -114, 102, true, false);
        }
        if (this.field_u != null) {
          this.field_u.b(param0 ^ 1);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, boolean param4, int param5, int param6, int param7) {
        int var10;
        var10 = BachelorFridge.field_y;
        if (param3 <= 107) {
          this.a(4, 73, -8, (byte) 101, true, 21, -30, -80);
        }
        if (param0 == 0 &&
          param1 == 4096 &&
          param2 == 4096) {
          this.a(param6, false, 256, param7);
        } else {
          if (!param4) {
            this.a(param7, param6, param1, (byte) -24, param5, param2, param0);
          } else {
            this.a(param7, (byte) -23, param6);
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5;
        var5 = BachelorFridge.field_y;
        if (param0 < 5) {
          this.a(-81, true, 63, 27);
        }
        this.field_b = param1;
        this.field_t = param2;
        if (this.field_t == -1) {
          this.a(false, this.field_b, 1, true, -1);
        } else {
          if (this.field_t != 0) {
            if (1 != this.field_t) {
              if (3 != this.field_t) {
                if (2 == this.field_t) {
                  this.a(false, this.field_b, 1, true, 2);
                } else {
                  if (this.field_t == 4) {
                    this.a(false, this.field_b, 1, true, 4);
                  } else {
                    if (this.field_t != 13) {
                      if (this.field_t != 6) {
                        if (7 == this.field_t) {
                          this.a(false, this.field_b, 1, true, 3);
                        } else {
                          if (15 != this.field_t) {
                            if (this.field_t != 9) {
                              if (this.field_t == 8) {
                                this.a(false, this.field_b, 1, true, 7);
                              } else {
                                if (this.field_t != 10) {
                                  if (16 == this.field_t) {
                                    this.a(false, this.field_b, 2, true, 3);
                                  } else {
                                    if (17 != this.field_t) {
                                      if (this.field_t != 18) {
                                        if (19 != this.field_t) {
                                          if (this.field_t != 20) {
                                            if (this.field_t == 5) {
                                              this.a(false, this.field_b, 1, true, 6);
                                            }
                                          } else {
                                            this.a(false, 7, 1, true, 10);
                                          }
                                        } else {
                                          this.a(true, this.field_b, 1, true, 6);
                                        }
                                      } else {
                                        this.a(false, this.field_b, 1, true, 11);
                                      }
                                    } else {
                                      this.a(false, this.field_b, 1, true, 10);
                                    }
                                  }
                                } else {
                                  this.a(false, this.field_b, 1, true, 9);
                                }
                              }
                            } else {
                              this.a(false, this.field_b, 1, true, 8);
                            }
                          } else {
                            this.a(false, this.field_b, 1, true, 1);
                          }
                        }
                      } else {
                        this.a(false, this.field_b, 1, true, 5);
                      }
                    } else {
                      this.a(false, this.field_b, 1, true, 3);
                    }
                  }
                }
              } else {
                this.a(false, this.field_b, 2, true, 1);
              }
            } else {
              this.a(false, this.field_b, 2, true, 1);
            }
          } else {
            this.a(false, this.field_b, 1, true, 0);
          }
        }
    }

    final kv e(int param0) {
        this.b(9);
        int var2 = 29 % ((-16 - param0) / 42);
        return bd.field_i;
    }

    private final void a(int param0, byte param1, int param2) {
        vg.a(bd.field_i, param0 << 4, 22997, 0, 8192, param2 << 4, 8192, bd.field_i.field_o << 3, bd.field_i.field_n << 3);
        if (param1 != -23) {
          this.field_v = false;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, boolean param8) {
        int var10 = 0;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        boolean stackIn_9_1 = false;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var16 = BachelorFridge.field_y;
        if (param4 <= dg.field_h &&
          dg.field_k >= param6 &&
          bd.field_i.field_q + param4 >= dg.field_f &&
          param6 + bd.field_i.field_p >= dg.field_j) {
          stackIn_9_1 = (param8);
          this.field_x = stackIn_9_1;
          bd.field_i.b();
          dg.d();
          for (var10 = param3; var10 < 14; var10++) {
            var11 = 0;
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            if (cma.field_v[var10] == 13) {
              var11Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q) * this.field_j[cma.field_v[var10]].field_c;
              var12Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p) * this.field_j[cma.field_v[var10]].field_d;
              var11Lifetime1 += 128;
              var12Lifetime1 += 128;
              var14Lifetime1 = this.field_j[10].field_b - (-(this.field_D[10].field_o >> 1) - this.field_D[10].field_p + this.field_D[10].field_o);
              var15 = 0;
              var13Lifetime1 = (this.field_D[10].field_n >> 1) + this.field_j[10].field_a + (-this.field_D[10].field_n + this.field_D[10].field_q);
              gna.a(var11Lifetime1, param3 - 122, var13Lifetime1 << 4, this.field_D[10].field_o << 3, this.field_D[10].field_n << 3, var14Lifetime1 << 4, this.field_D[cma.field_v[var10]], var15, var12Lifetime1);
            } else {
              if (cma.field_v[var10] == 12) {
                var11Lifetime1 = this.field_j[cma.field_v[var10]].field_c * (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q);
                var12Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p) * this.field_j[cma.field_v[var10]].field_d;
                var14Lifetime1 = this.field_D[9].field_p - this.field_D[9].field_o + (this.field_j[9].field_b + (this.field_D[9].field_o >> 1));
                var13Lifetime1 = this.field_j[9].field_a + (this.field_D[9].field_n >> 1) - (this.field_D[9].field_n - this.field_D[9].field_q);
                var11Lifetime1 += 128;
                var12Lifetime1 += 128;
                gna.a(var11Lifetime1, -109, var13Lifetime1 << 4, this.field_D[9].field_o << 3, this.field_D[9].field_n << 3, var14Lifetime1 << 4, this.field_D[cma.field_v[var10]], var15, var12Lifetime1);
              } else {
                if (cma.field_v[var10] != 11) {
                  var15 = 0;
                  var11Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q) * this.field_j[cma.field_v[var10]].field_c;
                  var12Lifetime1 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p) * this.field_j[cma.field_v[var10]].field_d;
                  var13Lifetime1 = this.field_D[cma.field_v[var10]].field_q - this.field_D[cma.field_v[var10]].field_n + (this.field_j[cma.field_v[var10]].field_a + (this.field_D[cma.field_v[var10]].field_n >> 1));
                  var14Lifetime1 = this.field_D[cma.field_v[var10]].field_p - this.field_D[cma.field_v[var10]].field_o + this.field_j[cma.field_v[var10]].field_b + (this.field_D[cma.field_v[var10]].field_o >> 1);
                  if (cma.field_v[var10] != 1 &&
                    cma.field_v[var10] != 2 &&
                    cma.field_v[var10] != 3) {
                    gna.a(var11Lifetime1, param3 - 94, var13Lifetime1 << 4, this.field_D[cma.field_v[var10]].field_o << 3, this.field_D[cma.field_v[var10]].field_n << 3, var14Lifetime1 << 4, this.field_D[cma.field_v[var10]], var15, var12Lifetime1);
                  } else {
                    vg.a(this.field_D[cma.field_v[var10]], var13Lifetime1 << 4, 22997, var15, var11Lifetime1, var14Lifetime1 << 4, var12Lifetime1, this.field_D[cma.field_v[var10]].field_o << 3, this.field_D[cma.field_v[var10]].field_n << 3);
                  }
                } else {
                  var12Lifetime1 = this.field_j[cma.field_v[var10]].field_d * (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p);
                  var11Lifetime1 = this.field_j[cma.field_v[var10]].field_c * (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q);
                  var14Lifetime1 = (this.field_D[8].field_o >> 1) + (this.field_j[8].field_b + (this.field_D[8].field_p - this.field_D[8].field_o));
                  var13Lifetime1 = this.field_j[8].field_a - (-(this.field_D[8].field_n >> 1) + this.field_D[8].field_n - this.field_D[8].field_q);
                  var11Lifetime1 += 128;
                  var12Lifetime1 += 128;
                  var15 = 0;
                  gna.a(var11Lifetime1, -106, var13Lifetime1 << 4, this.field_D[8].field_o << 3, this.field_D[8].field_n << 3, var14Lifetime1 << 4, this.field_D[cma.field_v[var10]], var15, var12Lifetime1);
                }
              }
            }
          }
          hga.field_U.a((byte) 121);
          if (this.field_x) {
            bd.field_i.e();
          }
          if ((param0 == 0 ||
            param0 == 65536) &&
            4096 == param2) {
            this.a(param6, false, 256, param4);
            return;
          }
          if (param7) {
            this.a(param4, (byte) -23, param6);
          } else {
            this.a(param4, param6, param2, (byte) -73, param5, param1, param0);
          }
          return;
        }
    }

    private final int[] a(int param0, int param1, kv param2, int param3, boolean param4, int param5, int param6, kv param7) {
        int var17 = 0;
        int[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var9 = null;
        RuntimeException var9_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var16Lifetime1;
        var18 = BachelorFridge.field_y;
        try {
          var9 = new int[2];
          var26 = param2.field_v;
          var25 = param7.field_v;
          var12 = 0;
          var13 = 0;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          L1: while (true) {
            if (var16 < var25.length) {
              if (param1 == (var25[var16] & param3)) {
                var15 = var16 / param7.field_q;
                var14 = var16 % param7.field_q;
                if (param4) {
                  break L1;
                }
              }
              var16++;
              continue;
            }
            break;
          }
          var16Lifetime1 = -81 / ((param5 + 20) / 52);
          for (var17 = 0; var17 < var26.length; var17++) {
            if (param6 == (var26[var17] & param0)) {
              var13 = var17 / param2.field_q;
              var12 = var17 % param2.field_q;
            }
          }
          var9[0] = var14 - var12;
          var9[1] = -var13 + var15;
          stackIn_16_0 = var9;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_19_0 = var9_ref;
          stackIn_19_1 = new StringBuilder().append("lna.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = param1 * this.field_a.field_n / 4096;
        if (param4 != 16632) {
          return;
        }
        int var9 = param6 * this.field_a.field_o / 4096;
        int var10 = 40 * param1 / 4096;
        int var11 = 20 * param6 / 4096;
        if (param3 < 256) {
          this.field_a.c(var10 + param5, var11 + param0, var8, var9, param3);
        } else {
          this.field_a.c(var10 + param5, param0 + var11, var8, var9);
        }
    }

    public static void a(byte param0) {
        int var1 = -44 / ((-7 - param0) / 56);
        field_h = null;
        field_y = (String[][]) null;
        field_C = null;
    }

    lna(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        this.field_l = new int[14];
        this.field_l[6] = param6;
        this.field_l[7] = param7;
        this.field_l[10] = param10;
        this.field_l[8] = param8;
        this.field_l[5] = param5;
        this.field_l[9] = param9;
        this.field_l[2] = param2;
        this.field_l[3] = param3;
        this.field_l[4] = param4;
        this.field_l[13] = param10;
        this.field_l[12] = param9;
        this.field_l[1] = param1;
        this.field_l[0] = param0;
        this.field_l[11] = param8;
        while (!this.field_A) {
          this.a(8);
        }
        bd.field_i = new kv(220, 300);
        this.field_s = 0;
        this.d(1);
        this.b((byte) -69);
        jha.field_g.c("?", 0, jha.field_g.field_u, 16777215, 65793);
        hga.field_U.a((byte) 121);
        this.a(false, 0, 1, true, -1);
    }

    static {
        field_h = "Play the game without logging in just yet";
        field_q = true;
        field_y = new String[][]{new String[]{"120", "90", "60", "45", "30"}, new String[]{"Pizza", "Dessert", "Curry"}, new String[]{"3", "4", "5", "6"}, new String[]{"Annihilation", "Take the Grub", "Capture the fly"}, new String[]{"Short (10 turns)", "Medium (15 turns)", "Long (25 turns)", "Extra long (50 turns)"}};
    }
}
