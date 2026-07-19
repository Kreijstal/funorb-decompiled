/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    int field_k;
    int field_i;
    int field_G;
    float field_f;
    float field_M;
    float field_q;
    float field_n;
    float field_C;
    float field_j;
    static int field_D;
    int field_d;
    float field_w;
    float field_s;
    float field_m;
    float field_a;
    float field_H;
    int field_K;
    go field_z;
    private float field_N;
    float field_I;
    float field_J;
    float field_e;
    oa field_u;
    mg field_v;
    go field_b;
    float field_A;
    float field_F;
    float field_y;
    float field_x;
    mg field_h;
    float field_E;
    float field_B;
    float field_r;
    oa field_L;
    float field_g;
    float field_p;
    static int field_t;
    boolean field_o;
    float field_l;
    float field_c;

    final static void a(fb param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        da var7 = null;
        da var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var7 = da.field_p;
            var8 = var7;
            var8.c((byte) 33, param1);
            var8.field_l = var8.field_l + 1;
            if (param2 > 94) {
              var4 = var8.field_l;
              var8.f(111, 1);
              var8.b(-652561784, param0.field_u);
              var8.b(-652561784, param0.field_j);
              var8.b(-652561784, param0.field_t);
              var8.a((byte) -58, param0.field_q);
              var8.a((byte) -58, param0.field_p);
              var8.a((byte) -58, param0.field_o);
              var8.a((byte) -58, param0.field_k);
              var8.f(111, param0.field_r.length);
              var5 = 0;
              L1: while (true) {
                if (var5 >= param0.field_r.length) {
                  discarded$1 = var8.a(var4, (byte) 110);
                  var8.a(-268435456, var8.field_l + -var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7.a((byte) -58, param0.field_r[var5]);
                  var5++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("dn.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    dn(int param0) {
        int var2 = 0;
        L0: {
          var2 = param0;
          if (-2 == (var2 ^ -1)) {
            this.field_G = 0;
            this.field_K = 12;
            this.field_l = 1500.0f;
            this.field_k = 6;
            this.field_g = (float)this.field_K * 2.0f / 3.5f;
            this.field_N = (float)this.field_k * 2.0f / 3.5f;
            this.field_j = this.field_g / 2.0f;
            this.field_C = -this.field_j + this.field_g;
            this.field_F = 0.5f;
            this.field_M = 0.10000000149011612f;
            this.field_z = al.field_a[1];
            this.field_w = 6.0f;
            this.field_B = 0.0f;
            this.field_A = 15.0f;
            this.field_J = 13.0f;
            this.field_L = qj.field_G.field_d;
            this.field_a = (this.field_g * this.field_g + this.field_N * this.field_N) * this.field_l / 12.0f;
            this.field_x = 0.5f;
            this.field_E = 0.5f;
            this.field_b = al.field_a[0];
            this.field_r = 1.0f;
            this.field_o = false;
            this.field_e = 0.0f;
            this.field_s = 4800.0f;
            this.field_y = 12.0f / this.field_F;
            this.field_u = qj.field_G.field_e;
            this.field_n = 0.5f;
            this.field_I = 6.0f;
            this.field_H = 0.0f;
            this.field_f = 0.5f;
            this.field_m = 4.0f;
            this.field_c = -16.0f;
            this.field_d = 15;
            this.field_q = 0.5f;
            this.field_p = 3.0f;
            break L0;
          } else {
            if (-1 == (var2 ^ -1)) {
              this.field_l = 1450.0f;
              this.field_K = 12;
              this.field_k = 6;
              this.field_G = 0;
              this.field_g = (float)this.field_K * 2.0f / 3.5f;
              this.field_N = 2.0f * (float)this.field_k / 3.5f;
              this.field_j = this.field_g / 2.0f;
              this.field_M = 0.10000000149011612f;
              this.field_F = 0.5f;
              this.field_C = -this.field_j + this.field_g;
              this.field_H = 0.0f;
              this.field_q = 0.5f;
              this.field_a = (this.field_N * this.field_N + this.field_g * this.field_g) * this.field_l / 12.0f;
              this.field_c = -9.0f;
              this.field_L = kn.field_r.field_d;
              this.field_J = 13.0f;
              this.field_B = 0.0f;
              this.field_r = 1.0f;
              this.field_n = 0.5f;
              this.field_b = lk.field_c[0];
              this.field_x = 0.5f;
              this.field_p = 3.0f;
              this.field_s = 5000.0f;
              this.field_I = 6.0f;
              this.field_E = 0.5f;
              this.field_f = 0.5f;
              this.field_y = 12.0f / this.field_F;
              this.field_o = false;
              this.field_w = 6.0f;
              this.field_A = 10.0f;
              this.field_z = lk.field_c[1];
              this.field_d = 15;
              this.field_u = kn.field_r.field_e;
              this.field_e = 0.0f;
              this.field_m = 4.0f;
              break L0;
            } else {
              if ((var2 ^ -1) == -4) {
                this.field_K = 12;
                this.field_k = 6;
                this.field_l = 2000.0f;
                this.field_G = 0;
                this.field_g = (float)this.field_K * 2.0f / 3.5f;
                this.field_N = 2.0f * (float)this.field_k / 3.5f;
                this.field_j = this.field_g / 2.0f;
                this.field_C = -this.field_j + this.field_g;
                this.field_M = 0.10000000149011612f;
                this.field_F = 0.4000000059604645f;
                this.field_E = 0.5f;
                this.field_b = jg.field_o[0];
                this.field_o = false;
                this.field_d = 15;
                this.field_e = 0.0f;
                this.field_f = 0.20000000298023224f;
                this.field_c = -8.0f;
                this.field_a = this.field_l * (this.field_N * this.field_N + this.field_g * this.field_g) / 12.0f;
                this.field_r = 0.699999988079071f;
                this.field_n = 1.0f;
                this.field_m = 0.5f;
                this.field_A = 10.0f;
                this.field_s = 6000.0f;
                this.field_u = te.field_c.field_e;
                this.field_J = 5.0f;
                this.field_I = 4.0f;
                this.field_L = te.field_c.field_d;
                this.field_w = 10.0f;
                this.field_p = 3.0f;
                this.field_B = 40.0f;
                this.field_x = 0.6000000238418579f;
                this.field_z = jg.field_o[1];
                this.field_q = 0.8999999761581421f;
                this.field_H = 0.0f;
                this.field_y = 12.0f / this.field_F;
                break L0;
              } else {
                if ((var2 ^ -1) == -3) {
                  this.field_l = 1000.0f;
                  this.field_k = 6;
                  this.field_K = 12;
                  this.field_G = 0;
                  this.field_N = 2.0f * (float)this.field_k / 3.5f;
                  this.field_g = (float)this.field_K * 2.0f / 3.5f;
                  this.field_j = this.field_g / 2.0f;
                  this.field_M = 0.10000000149011612f;
                  this.field_C = -this.field_j + this.field_g;
                  this.field_F = 0.30000001192092896f;
                  this.field_E = 0.5f;
                  this.field_p = 3.0f;
                  this.field_u = hm.field_a.field_e;
                  this.field_q = 0.5f;
                  this.field_f = 0.30000001192092896f;
                  this.field_A = 5.0f;
                  this.field_s = 8000.0f;
                  this.field_m = 0.5f;
                  this.field_H = 0.0f;
                  this.field_b = rl.field_K[0];
                  this.field_B = 40.0f;
                  this.field_c = -16.0f;
                  this.field_z = rl.field_K[1];
                  this.field_w = 5.0f;
                  this.field_e = 0.0f;
                  this.field_n = 1.0f;
                  this.field_d = 15;
                  this.field_o = true;
                  this.field_I = 4.0f;
                  this.field_y = 12.0f / this.field_F;
                  this.field_a = (this.field_g * this.field_g + this.field_N * this.field_N) * this.field_l / 12.0f;
                  this.field_L = hm.field_a.field_d;
                  this.field_x = 0.6000000238418579f;
                  this.field_J = 3.0f;
                  this.field_r = 0.4000000059604645f;
                  break L0;
                } else {
                  if (-5 == (var2 ^ -1)) {
                    this.field_k = 6;
                    this.field_G = 2;
                    this.field_K = 12;
                    this.field_l = 800.0f;
                    this.field_g = (float)this.field_K * 2.0f / 3.5f;
                    this.field_N = (float)this.field_k * 2.0f / 3.5f;
                    this.field_p = 3.0f;
                    this.field_B = 50.0f;
                    this.field_s = 4750.0f;
                    this.field_x = 0.75f;
                    this.field_A = 50.0f;
                    this.field_d = 15;
                    this.field_a = this.field_l * (this.field_g * this.field_g + this.field_N * this.field_N) / 12.0f;
                    this.field_n = 0.5f;
                    this.field_m = 0.5f;
                    this.field_o = true;
                    this.field_E = 1.0f;
                    this.field_M = 0.10000000149011612f;
                    this.field_C = 0.25f * this.field_g;
                    this.field_b = ei.field_a[0];
                    this.field_f = 0.30000001192092896f;
                    this.field_L = gg.field_H.field_d;
                    this.field_r = 1.0f;
                    this.field_w = 15.0f;
                    this.field_u = gg.field_H.field_e;
                    this.field_y = 80.0f;
                    this.field_I = 4.0f;
                    this.field_e = 15.0f;
                    this.field_z = ei.field_a[1];
                    this.field_H = 0.0f;
                    this.field_c = -16.0f;
                    this.field_j = 0.5f * this.field_g;
                    this.field_q = 0.5f;
                    this.field_F = 0.75f;
                    this.field_J = 4.0f;
                    break L0;
                  } else {
                    if (5 == var2) {
                      this.field_G = 1;
                      this.field_k = 12;
                      this.field_l = 5500.0f;
                      this.field_K = 12;
                      this.field_N = 2.0f * (float)this.field_k / 3.5f;
                      this.field_g = 2.0f * (float)this.field_K / 3.5f;
                      this.field_j = this.field_g / 2.0f;
                      this.field_y = 80.0f;
                      this.field_C = -this.field_j + this.field_g;
                      this.field_M = 0.10000000149011612f;
                      this.field_F = 0.5f;
                      this.field_B = 0.0f;
                      this.field_J = 2.0f;
                      this.field_z = md.field_j[1];
                      this.field_q = 0.5f;
                      this.field_b = md.field_j[0];
                      this.field_u = he.field_G.field_e;
                      this.field_L = he.field_G.field_d;
                      this.field_e = 10.0f;
                      this.field_o = false;
                      this.field_p = 3.0f;
                      this.field_x = this.field_F;
                      this.field_f = this.field_F;
                      this.field_a = (this.field_g * this.field_g + this.field_N * this.field_N) * this.field_l / 12.0f;
                      this.field_c = -12.0f;
                      this.field_H = 0.0f;
                      this.field_w = 10.0f;
                      this.field_d = 15;
                      this.field_n = 0.5f;
                      this.field_E = 1.0f;
                      this.field_m = 0.5f;
                      this.field_A = 10.0f;
                      this.field_I = 2.0f;
                      this.field_r = 0.800000011920929f;
                      this.field_s = 18500.0f;
                      break L0;
                    } else {
                      if (-7 == (var2 ^ -1)) {
                        this.field_K = 12;
                        this.field_l = 1500.0f;
                        this.field_G = 0;
                        this.field_k = 6;
                        this.field_N = (float)this.field_k * 2.0f / 3.5f;
                        this.field_g = 2.0f * (float)this.field_K / 3.5f;
                        this.field_j = this.field_g / 2.0f;
                        this.field_C = this.field_g - this.field_j;
                        this.field_M = 0.10000000149011612f;
                        this.field_F = 0.5f;
                        this.field_r = 0.5f;
                        this.field_o = false;
                        this.field_a = (this.field_g * this.field_g + this.field_N * this.field_N) * this.field_l / 12.0f;
                        this.field_H = 0.0f;
                        this.field_w = 5.5f;
                        this.field_q = 0.5f;
                        this.field_m = 4.0f;
                        this.field_c = 12.0f;
                        this.field_d = 15;
                        this.field_z = am.field_b[1];
                        this.field_p = 3.0f;
                        this.field_f = 0.5f;
                        this.field_I = 6.0f;
                        this.field_A = 10.0f;
                        this.field_x = 0.5f;
                        this.field_n = 0.5f;
                        this.field_e = 0.0f;
                        this.field_b = am.field_b[0];
                        this.field_u = ec.field_s.field_e;
                        this.field_y = 12.0f / this.field_F;
                        this.field_s = 10000.0f;
                        this.field_B = 0.0f;
                        this.field_E = 0.5f;
                        this.field_J = 13.0f;
                        this.field_L = ec.field_s.field_d;
                        break L0;
                      } else {
                        if ((var2 ^ -1) == -8) {
                          this.field_k = 6;
                          this.field_G = 0;
                          this.field_l = 1800.0f;
                          this.field_K = 12;
                          this.field_N = 2.0f * (float)this.field_k / 3.5f;
                          this.field_g = (float)this.field_K * 2.0f / 3.5f;
                          this.field_j = this.field_g / 2.0f;
                          this.field_F = 0.5f;
                          this.field_M = 0.10000000149011612f;
                          this.field_C = -this.field_j + this.field_g;
                          this.field_o = false;
                          this.field_B = 0.0f;
                          this.field_m = 4.0f;
                          this.field_L = ch.field_n.field_d;
                          this.field_I = 6.0f;
                          this.field_z = ud.field_h[1];
                          this.field_a = this.field_l * (this.field_g * this.field_g + this.field_N * this.field_N) / 12.0f;
                          this.field_r = 0.75f;
                          this.field_u = ch.field_n.field_e;
                          this.field_A = 10.0f;
                          this.field_J = 13.0f;
                          this.field_n = 0.5f;
                          this.field_p = 3.0f;
                          this.field_d = 15;
                          this.field_e = 0.0f;
                          this.field_s = 8000.0f;
                          this.field_y = 12.0f / this.field_F;
                          this.field_c = 14.0f;
                          this.field_f = 0.5f;
                          this.field_q = 0.5f;
                          this.field_E = 0.5f;
                          this.field_w = 7.5f;
                          this.field_b = ud.field_h[0];
                          this.field_H = 0.0f;
                          this.field_x = 0.5f;
                          break L0;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.field_i = 5000;
    }

    static {
        field_D = 20;
    }
}
