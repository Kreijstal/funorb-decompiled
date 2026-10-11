/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends rva implements tsa {
    int field_C;
    private int field_y;
    static String field_K;
    private boolean field_J;
    int field_O;
    private int field_B;
    private int field_I;
    static String field_E;
    private rj field_D;
    private rj field_F;
    private vp field_N;
    private rj field_z;
    private boolean field_P;
    private boolean field_x;
    private rj field_H;
    private int field_G;
    private rj field_L;
    int field_M;
    private int field_A;

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 <= 44) {
            this.field_J = true;
          }
          if (param3 == 1 &&
            this.field_x) {
            if (this.field_P &&
              param2 == this.field_F) {
              this.a(this.field_O - this.field_M, (byte) -91);
              return;
            }
            if (this.field_P &&
              param2 == this.field_H) {
              this.a(this.field_M + this.field_O, (byte) -94);
              return;
            }
            if (this.field_J &&
              this.field_L == param2) {
              this.b(13328, -this.field_A + this.field_C);
              return;
            }
            if (this.field_J) {
              if (this.field_z != param2) {
                return;
              }
              this.b(13328, this.field_A + this.field_C);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("jo.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_L == null) {
          this.field_D.field_i = 0;
        } else {
          this.field_L.field_i = 0;
          this.field_L.field_n = this.field_p - this.field_L.field_p >> 1;
          this.field_D.field_i = this.field_L.field_i + this.field_L.field_m;
        }
        if (this.field_z == null) {
          this.field_D.field_m = this.field_m - this.field_D.field_i;
        } else {
          this.field_z.field_i = this.field_m - this.field_z.field_m;
          this.field_z.field_n = -this.field_z.field_p + this.field_p >> 1;
          this.field_D.field_m = -this.field_z.field_m + (this.field_m - this.field_D.field_i);
        }
        this.h((byte) -125);
        if (this.field_F != null) {
          this.field_F.field_i = -this.field_F.field_m + this.field_m >> 1;
          this.field_F.field_n = 0;
          this.field_D.field_n = this.field_F.field_p + this.field_F.field_n;
        } else {
          this.field_D.field_n = 0;
        }
        if (param0 != 88) {
          return;
        }
        if (null != this.field_H) {
          this.field_H.field_n = -this.field_H.field_p + this.field_p;
          this.field_H.field_i = -this.field_H.field_m + this.field_m >> 1;
          this.field_D.field_p = -this.field_D.field_n + (this.field_p - this.field_H.field_p);
        } else {
          this.field_D.field_p = this.field_p - this.field_D.field_n;
        }
        this.e(param0 - 214);
        if (!this.field_P) {
          this.field_N.field_n = 0;
          this.field_N.field_p = this.field_D.field_p;
        }
        if (!this.field_J) {
          this.field_N.field_i = 0;
          this.field_N.field_m = this.field_D.field_m;
        }
        this.field_N.c((byte) 121);
    }

    private final void b(int param0, boolean param1) {
        rj stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        rj stackIn_11_0 = null;
        boolean stackIn_13_1 = false;
        rj stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        rj stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        stackIn_3_0 = this.field_D;
        stackIn_5_1 = (param1) || (this.field_P);
        stackIn_3_0.field_y = stackIn_5_1;
        if (param0 >= -80) {
          return;
        }
        if (this.field_N.field_x instanceof rj) {
          stackIn_11_0 = (rj) (this.field_N.field_x);
          stackIn_13_1 = (param1) || (this.field_P);
          stackIn_11_0.field_y = stackIn_13_1;
        }
        if (this.field_L != null) {
          stackIn_17_0 = this.field_L;
          stackIn_18_1 = (!param1) ? false : true;
          stackIn_17_0.field_y = stackIn_18_1;
        }
        if (this.field_z != null) {
          stackIn_23_0 = this.field_z;
          stackIn_24_1 = (!param1) ? false : true;
          stackIn_23_0.field_y = stackIn_24_1;
        }
    }

    private final void b(int param0, int param1) {
        this.a(param0 ^ 22876, param1);
        if (param0 != 13328) {
          return;
        }
        if (this.field_h instanceof tua) {
          ((tua) (this.field_h)).a(9776, this, this.field_C, this.field_O);
        }
    }

    public static void g(byte param0) {
        if (param0 >= -86) {
          return;
        }
        field_E = null;
        field_K = null;
    }

    private final void h(byte param0) {
        if (param0 > -30) {
          return;
        }
        int var2 = this.field_L == null ? this.field_D.field_i : this.field_L.field_m + this.field_L.field_i;
        int var3 = null != this.field_z ? -this.field_N.field_m + this.field_z.field_i : this.field_D.field_m + (this.field_D.field_i - this.field_N.field_m);
        this.field_N.field_i = var2 + ((var3 - var2) * this.field_C >> 16);
    }

    private final void a(int param0, byte param1) {
        this.c(16, param0);
        if (param1 >= -90) {
          this.field_A = 107;
        }
        if (this.field_h instanceof tua) {
          ((tua) (this.field_h)).a(9776, this, this.field_O, this.field_O);
        }
    }

    final static void a(jea param0, int param1, jea param2, jea param3, jea param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (null != oea.field_i) {
            return;
          }
          ni.field_c = false;
          if (!fua.field_g) {
            if (ok.field_s) {
              var5 = rsa.field_z;
            } else {
              var5 = wn.field_n;
            }
          } else {
            var5 = kia.field_a;
          }
          var7 = (String) null;
          dqa.a(var5, 0, (String) null, sva.field_d, 127);
          pq.field_g.field_N = sva.field_d - (sva.field_d >> 1 & 8355711) + ((bn.field_t.field_N & 16711422) >> 1);
          pq.field_g.field_ab = (8355711 & bn.field_t.field_ab >> 1) + (-((sva.field_d & 16711423) >> 1) + sva.field_d);
          pq.field_g.field_gb = ((16711423 & bn.field_t.field_gb) >> 1) + (sva.field_d - (sva.field_d >> 1 & 8355711));
          rma.field_b = mka.field_b;
          oea.field_i = pq.field_g;
          wi.field_s = new jea((long)param1, param4);
          lra.field_e = new jea(0L, param0);
          ep.field_r = new jea(0L, (jea) null);
          dh.field_e = new jea(0L, param3);
          pq.field_g = new jea(0L, param2);
          pq.field_g.field_H = lpa.field_s;
          dh.field_e.b(-123, pq.field_g);
          mka.field_b = new jea(0L, rma.field_b);
          dh.field_e.b(-128, mka.field_b);
          lra.field_d = new jea(0L, bn.field_t, fw.field_a);
          qpa.field_b = new jea(0L, bn.field_t);
          wi.field_s.b(param1 ^ -122, lra.field_e);
          wi.field_s.b(-123, ep.field_r);
          ep.field_r.b(-123, dh.field_e);
          ep.field_r.b(-126, lra.field_d);
          ep.field_r.b(-125, qpa.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("jo.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          super.a(param0, param1 ^ 0, param2, param3);
          if ((!(this.field_N.field_x instanceof rj) ||
            ((rj) (this.field_N.field_x)).field_y) && this.field_N.field_s == 1) {
            if (!this.field_J) {
              this.h((byte) -101);
            } else {
              var5_int = this.field_C;
              this.d(-66);
              if (this.field_C != var5_int &&
                this.field_h instanceof tua) {
                ((tua) (this.field_h)).a(this.field_C, this, true, this.field_C);
              }
            }
            if (!this.field_P) {
              this.e(-125);
            } else {
              var5_intLifetime2 = this.field_O;
              this.f(param1 - 2031616);
              if (this.field_O != var5_intLifetime2 &&
                this.field_h instanceof tua) {
                ((tua) (this.field_h)).a(this.field_C, this, true, this.field_O);
              }
            }
          }
          if (this.field_D.field_y &&
            this.field_D.field_x == 1) {
            if (this.field_P) {
              if (!this.field_J) {
                if (sta.field_B <= (this.field_N.field_p >> 1) + (this.field_N.field_n + param3)) {
                  this.a(this.field_O - this.field_B, (byte) -91);
                } else {
                  this.a(this.field_O + this.field_B, (byte) -109);
                }
              } else {
                var5_intLifetime1 = -(this.field_N.field_m >> 1) - (this.field_N.field_i + this.field_i - jba.field_j + param0);
                var6 = sta.field_B - param3 - this.field_n - ((this.field_N.field_p >> 1) + this.field_N.field_n);
                if (Math.abs(var6) <= Math.abs(var5_intLifetime1)) {
                  if (var5_intLifetime1 <= 0) {
                    this.b(13328, this.field_C - this.field_y);
                  } else {
                    this.b(13328, this.field_y + this.field_C);
                  }
                } else {
                  if (0 >= var6) {
                    this.a(-this.field_B + this.field_O, (byte) -113);
                  } else {
                    this.a(this.field_O + this.field_B, (byte) -102);
                  }
                }
              }
            } else {
              if (this.field_J) {
                if ((this.field_N.field_m >> 1) + param0 + this.field_N.field_i < jba.field_j) {
                  this.b(param1 ^ 2110480, this.field_y + this.field_C);
                } else {
                  this.b(param1 - 2083824, this.field_C - this.field_y);
                }
              }
            }
          }
          if (param1 != 2097152) {
            this.field_L = (rj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_43_0 = var5;
          stackIn_43_1 = new StringBuilder().append("jo.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    jo(int param0, int param1, int param2, int param3, isa param4, isa param5, isa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        vp dupTemp$0 = null;
        rj dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_O = 32768;
        this.field_y = 8192;
        this.field_I = 0;
        this.field_C = 32768;
        this.field_x = true;
        this.field_B = 8192;
        this.field_M = 1024;
        this.field_G = 0;
        this.field_A = 1024;
        try {
          this.field_w = new ae[6];
          dupTemp$0 = new vp(param0, param1, param7, param8, (isa) null, (qc) null, new rj(0, 0, param7, param8, param6, (qc) null), false, false);
          this.field_N = dupTemp$0;
          this.field_w[0] = (ae) ((Object) dupTemp$0);
          dupTemp$1 = new rj(param0, param1, param7, param8, param5, (qc) null);
          this.field_D = dupTemp$1;
          this.field_w[1] = (ae) ((Object) dupTemp$1);
          this.field_G = param10;
          stackIn_4_1 = (param12);
          this.field_P = stackIn_4_1;
          stackIn_7_1 = (param11);
          this.field_J = stackIn_7_1;
          this.field_I = param9;
          this.a(27980, param13);
          this.c(16, param14);
          this.a((byte) -31, param2, param3, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("jo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    private final void f(int param0) {
        if (param0 != 65536) {
          return;
        }
        int var2 = null != this.field_F ? this.field_F.field_n + this.field_F.field_p : this.field_D.field_n;
        int var3 = this.field_H != null ? this.field_H.field_n - this.field_N.field_p : -this.field_N.field_p + this.field_D.field_p + this.field_D.field_n;
        this.c(16, var2 >= var3 ? 0 : (-var2 + this.field_N.field_n << 16) / (var3 - var2));
    }

    private final void a(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 0) {
          this.field_C = 0;
        } else {
          if (param1 <= 65536) {
            this.field_C = param1;
          } else {
            this.field_C = 65536;
          }
        }
        this.h((byte) -110);
        if (param0 != 27980) {
          this.field_D = (rj) null;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_x) {
            if (!this.field_N.b((byte) -34)) {
              return false;
            }
            if (param2 == 98) {
              this.a(this.field_O - this.field_M, (byte) -123);
              return true;
            }
            if (param2 == 99) {
              this.a(this.field_O + this.field_M, (byte) -111);
              return true;
            }
            if (param2 == 96) {
              this.b(13328, this.field_C - this.field_A);
              return true;
            }
            if (97 == param2) {
              this.b(13328, this.field_C + this.field_A);
              return true;
            }
            if (104 == param2) {
              this.a(this.field_O - this.c(1553449360), (byte) -99);
              return true;
            }
            if (105 == param2) {
              this.a(this.field_O + this.c(1553449360), (byte) -127);
              return true;
            }
            if (102 == param2) {
              if (this.field_P &&
                oj.field_tb[82]) {
                this.a(0, (byte) -105);
                return true;
              }
              if (this.field_J) {
                this.b(13328, 0);
                return true;
              }
            } else {
              if (param2 == 103) {
                if (this.field_P &&
                  oj.field_tb[82]) {
                  this.a(65536, (byte) -123);
                  return true;
                }
                if (this.field_J) {
                  this.b(13328, 65536);
                  return true;
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("jo.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        if (param1 < param2) {
          var4 = param1 * this.field_D.field_m / param2;
          if (var4 < this.field_I) {
            var4 = this.field_I;
          }
          this.field_N.a((byte) -31, var4, this.field_N.field_p, this.field_N.field_i, this.field_N.field_n);
          this.b(-122, true);
        } else {
          this.field_N.a((byte) -31, this.field_D.field_m, this.field_N.field_p, this.field_N.field_i, this.field_N.field_n);
          this.b(-82, false);
        }
        if (param0 >= -81) {
          this.field_z = (rj) null;
        }
        this.h((byte) -110);
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != -1789710879) {
          this.c(-65, -82, -68);
        }
        if (param1 >= param0) {
          this.field_N.a((byte) -31, this.field_N.field_m, this.field_D.field_p, this.field_N.field_i, this.field_N.field_n);
          this.a(1, false);
        } else {
          var4 = param1 * this.field_D.field_p / param0;
          if (this.field_G > var4) {
            var4 = this.field_G;
          }
          this.field_N.a((byte) -31, this.field_N.field_m, var4, this.field_N.field_i, this.field_N.field_n);
          this.a(1, true);
        }
        this.e(param2 ^ 1789710944);
    }

    private final void a(int param0, boolean param1) {
        rj stackIn_5_0 = null;
        boolean stackIn_7_1 = false;
        rj stackIn_12_0 = null;
        boolean stackIn_14_1 = false;
        rj stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        rj stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        if (param0 != 1) {
          this.d(64);
        }
        stackIn_5_0 = this.field_D;
        stackIn_7_1 = (param1) || (this.field_J);
        stackIn_5_0.field_y = stackIn_7_1;
        if (this.field_N.field_x instanceof rj) {
          stackIn_12_0 = (rj) (this.field_N.field_x);
          stackIn_14_1 = (param1) || (this.field_J);
          stackIn_12_0.field_y = stackIn_14_1;
        }
        if (null != this.field_F) {
          stackIn_19_0 = this.field_F;
          stackIn_20_1 = (!param1) ? false : true;
          stackIn_19_0.field_y = stackIn_20_1;
        }
        if (this.field_H != null) {
          stackIn_24_0 = this.field_H;
          stackIn_25_1 = (!param1) ? false : true;
          stackIn_24_0.field_y = stackIn_25_1;
        }
    }

    private final void e(int param0) {
        int var2 = this.field_F != null ? this.field_F.field_n + this.field_F.field_p : this.field_D.field_n;
        if (param0 >= -122) {
          this.c(127, -127, -34);
        }
        int var3 = null != this.field_H ? -this.field_N.field_p + this.field_H.field_n : this.field_D.field_p + (this.field_D.field_n - this.field_N.field_p);
        this.field_N.field_n = ((var3 - var2) * this.field_O >> 16) + var2;
    }

    final static void a(boolean param0, boolean param1) {
        if (wqa.r((byte) -98)) {
          param1 = false;
        }
        sa.a(param1, (byte) 88);
        dla.b(23713);
        if (!param0) {
          jo.g((byte) 92);
        }
    }

    private final int c(int param0) {
        if (param0 != 1553449360) {
          return 79;
        }
        return (this.field_N.field_p << 16) / this.field_D.field_p;
    }

    final boolean a(ae param0, boolean param1) {
        vp var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (ae) null;
            this.a('\f', (ae) null, -82, true);
          }
          var3 = this.field_N;
          if (var3 != null &&
            ((ae) ((Object) var3)).a(param0, false)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jo.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var2 = this.field_L != null ? this.field_L.field_m + this.field_L.field_i : this.field_D.field_i;
        int var4 = 26 % ((param0 - 22) / 59);
        int var3 = null != this.field_z ? -this.field_N.field_m + this.field_z.field_i : -this.field_N.field_m + this.field_D.field_i + this.field_D.field_m;
        this.a(27980, var2 < var3 ? (-var2 + this.field_N.field_i << 16) / (var3 - var2) : 0);
    }

    final void c(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 0) {
          this.field_O = 0;
        } else {
          if (65536 < param1) {
            this.field_O = 65536;
          } else {
            this.field_O = param1;
          }
        }
        if (param0 != 16) {
          return;
        }
        this.e(param0 ^ -111);
    }

    final static an a(kh param0, boolean param1) {
        int var7 = 0;
        an stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param0.b((byte) 44, 8);
          if (0 < var2_int) {
            throw new IllegalStateException("" + var2_int);
          }
          if (!param1) {
            field_E = (String) null;
          }
          var3 = uha.a(5907, param0) ? 1 : 0;
          var4 = uha.a(5907, param0) ? 1 : 0;
          var5 = new an();
          var5.field_I = (short)param0.b((byte) 44, 16);
          var5.field_l = me.a((byte) 76, 16, param0, var5.field_l);
          var5.field_h = me.a((byte) 88, 16, param0, var5.field_h);
          var5.field_t = me.a((byte) 73, 16, param0, var5.field_t);
          var5.field_u = (short)param0.b((byte) 44, 16);
          var5.field_B = me.a((byte) 102, 16, param0, var5.field_B);
          var5.field_w = me.a((byte) 98, 16, param0, var5.field_w);
          var5.field_f = me.a((byte) 94, 16, param0, var5.field_f);
          if (var3 != 0) {
            var5.field_A = (short)param0.b((byte) 44, 16);
            var5.field_k = me.a((byte) 96, 16, param0, var5.field_k);
            var5.field_c = me.a((byte) 89, 16, param0, var5.field_c);
            var5.field_r = me.a((byte) 91, 16, param0, var5.field_r);
            var5.field_C = me.a((byte) 73, 16, param0, var5.field_C);
            var5.field_s = me.a((byte) 111, 16, param0, var5.field_s);
            var5.field_y = me.a((byte) 101, 16, param0, var5.field_y);
          }
          if (var4 != 0) {
            param0.b((byte) 44, 16);
            var5.field_H = me.a((byte) 76, 16, param0, var5.field_H);
            var5.field_e = me.a((byte) 73, 16, param0, var5.field_e);
            var5.field_d = me.a((byte) 105, 16, param0, var5.field_d);
            var5.field_N = me.a((byte) 101, 16, param0, var5.field_N);
            var5.field_D = me.a((byte) 100, 16, param0, var5.field_D);
          }
          if (uha.a(5907, param0)) {
            var5.field_M = me.a((byte) 74, 16, param0, var5.field_M);
          }
          if (uha.a(5907, param0)) {
            var5.field_q = goa.a(16, -4854, param0, var5.field_q);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_q.length; var7++) {
              if ((var5.field_q[var7] & 255) > var6) {
                var6 = var5.field_q[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_K = (byte)(1 + var6);
            } else {
              var5.field_q = null;
            }
          }
          stackIn_27_0 = var5;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("jo.O(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_K = "Account created successfully!";
    }
}
