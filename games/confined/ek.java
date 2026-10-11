/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    boolean field_l;
    gk field_i;
    private int field_a;
    static String field_e;
    gk field_g;
    static String field_k;
    private boolean field_f;
    private ee field_n;
    private boolean field_h;
    private int field_o;
    private int field_c;
    private int field_m;
    int field_d;
    static df field_p;
    int field_b;
    private oi field_j;

    final void a(tf param0, int param1) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        var4 = Confined.field_J ? 1 : 0;
        try {
          this.field_o = this.field_o - (3 + this.field_o >> 2);
          this.field_m = this.field_m + 1;
          this.field_a = this.field_a - (this.field_a + param1 >> 2);
          if (this.field_d <= 0) {
            if (this.field_c > 0) {
              this.field_c = this.field_c - 1;
              this.field_o = 0;
            }
          } else {
            if (pa.field_c) {
              var3_int = 16;
            } else {
              stackIn_6_0 = (this.field_f) ? 32 : 0;
              var3_int = stackIn_6_0;
            }
            this.field_d = this.field_d + var3_int;
            if (65536 < this.field_d) {
              this.field_d = 65536;
            }
          }
          if (param0 != null &&
            0 != (this.field_o | this.field_a)) {
            param0.b(param1 ^ 117);
          }
          this.field_i.field_m = this.field_o >> 7;
          var3_intLifetime1 = this.field_a;
          if (this.field_l &&
            this.field_f) {
            var3_intLifetime1 += 96;
          }
          this.field_g.field_m = var3_intLifetime1 >> 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ek.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        gk var20 = null;
        int var18 = Confined.field_J ? 1 : 0;
        int var3 = (int)(1024.0 * this.field_n.field_C * this.field_n.field_C);
        kl var4 = new kl(this.field_n.field_A, this.field_n.field_E, this.field_n.field_t, this.field_n.field_D, 1.0, var3, this.field_f ? mm.field_gb : mm.field_cb, param0);
        for (var5 = 0; var3 > var5; var5++) {
          var6 = -0.999 + Math.random() * 0.998;
          var8 = Math.sqrt(1.0 - var6 * var6) * this.field_n.field_C;
          var10 = 6.283185307179586 * Math.random();
          var12 = Math.sin(var10) * var8;
          var14 = Math.cos(var10) * var8;
          var16 = Math.random() * 0.02;
          var4.field_Q[var5] = var12;
          var4.field_T[var5] = var14;
          var4.field_S[var5] = this.field_n.field_C * var6;
          var4.field_O[var5] = var16 * var12;
          var4.field_I[var5] = var16 * var14;
          var4.field_M[var5] = var6 * var16;
        }
        if (param1 == -39) {
          var20 = new gk(var4, this.field_f ? nn.field_o : an.field_q, 0);
          var20.field_w = 2.0 * this.field_n.field_C;
          var4.field_J = var20;
          ri.a(this.field_n, param1 ^ -39, var4);
          return;
        }
        this.a(false, (byte) 87);
        gk var19 = new gk(var4, this.field_f ? nn.field_o : an.field_q, 0);
        var19.field_w = 2.0 * this.field_n.field_C;
        var4.field_J = var19;
        ri.a(this.field_n, param1 ^ -39, var4);
    }

    final void a(int param0) {
        nf stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        int stackIn_8_5;
        nf stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_15_5;
        int stackIn_20_0 = 0;
        nf stackIn_25_0;
        int stackIn_25_1;
        int stackIn_25_2;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_26_5;
        nf stackIn_31_0;
        int stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_32_5;
        nf stackIn_37_0;
        int stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_37_4;
        int stackIn_38_5 = 0;
        nf stackIn_49_0;
        int stackIn_49_1;
        int stackIn_49_2;
        int stackIn_49_3;
        int stackIn_49_4;
        int stackIn_50_5;
        nf stackIn_55_0;
        int stackIn_55_1;
        int stackIn_55_2;
        int stackIn_55_3;
        int stackIn_55_4;
        int stackIn_56_5;
        nf stackIn_61_0;
        int stackIn_61_1;
        int stackIn_61_2;
        int stackIn_61_3;
        int stackIn_61_4;
        int stackIn_62_5;
        int stackIn_67_0 = 0;
        nf stackIn_72_0;
        int stackIn_72_1;
        int stackIn_72_2;
        int stackIn_72_3;
        int stackIn_72_4;
        int stackIn_73_5;
        nf stackIn_78_0;
        int stackIn_78_1;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        int stackIn_79_5;
        nf stackIn_84_0;
        int stackIn_84_1;
        int stackIn_84_2;
        int stackIn_84_3;
        int stackIn_84_4;
        int stackIn_85_5;
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (param0 > -46) {
          field_p = (df) null;
          var2 = this.field_o >> 4;
          var3 = this.field_a >> 6;
          if (!this.field_l) {
            var4 = 0;
            if ((var2 | var3 | var4) > 0) {
              if (var2 > 0) {
                stackIn_7_0 = gh.field_h[this.field_m >> 1 & 3];
                stackIn_7_1 = 0;
                stackIn_7_2 = 0;
                stackIn_7_3 = 640;
                stackIn_7_4 = 376;
                if (256 < var2) {
                  stackIn_8_5 = 256;
                } else {
                  stackIn_8_5 = var2;
                }
                ((nf) (Object) stackIn_7_0).d(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_8_5);
              }
              if (var4 > 0) {
                dl.field_d[(30 & this.field_m) >> 1].d(0, 0, 640, 376, var4);
              }
              if (var3 > 0) {
                stackIn_14_0 = ue.field_u[this.field_m >> 1 & 3];
                stackIn_14_1 = 0;
                stackIn_14_2 = 0;
                stackIn_14_3 = 640;
                stackIn_14_4 = 376;
                if (var3 <= 256) {
                  stackIn_15_5 = var3;
                } else {
                  stackIn_15_5 = 256;
                }
                ((nf) (Object) stackIn_14_0).d(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_15_5);
              }
            }
            return;
          }
          stackIn_20_0 = (this.field_f) ? 16 : 0;
          var4Lifetime3 = stackIn_20_0;
          if ((var2 | var3 | var4Lifetime3) <= 0) {
            return;
          }
          if (var2 > 0) {
            stackIn_25_0 = gh.field_h[this.field_m >> 1 & 3];
            stackIn_25_1 = 0;
            stackIn_25_2 = 0;
            stackIn_25_3 = 640;
            stackIn_25_4 = 376;
            if (256 < var2) {
              stackIn_26_5 = 256;
            } else {
              stackIn_26_5 = var2;
            }
            ((nf) (Object) stackIn_25_0).d(stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_26_5);
          }
          if (var4Lifetime3 <= 0) {
            if (var3 > 0) {
              stackIn_31_0 = ue.field_u[this.field_m >> 1 & 3];
              stackIn_31_1 = 0;
              stackIn_31_2 = 0;
              stackIn_31_3 = 640;
              stackIn_31_4 = 376;
              if (var3 <= 256) {
                stackIn_32_5 = var3;
              } else {
                stackIn_32_5 = 256;
              }
              ((nf) (Object) stackIn_31_0).d(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_32_5);
            }
            return;
          }
          dl.field_d[(30 & this.field_m) >> 1].d(0, 0, 640, 376, var4Lifetime3);
          if (var3 <= 0) {
            return;
          }
          stackIn_37_0 = ue.field_u[this.field_m >> 1 & 3];
          stackIn_37_1 = 0;
          stackIn_37_2 = 0;
          stackIn_37_3 = 640;
          stackIn_37_4 = 376;
          if (var3 <= 256) {
            stackIn_38_5 = var3;
          } else {
            stackIn_38_5 = 256;
          }
          ((nf) (Object) stackIn_37_0).d(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, stackIn_38_5);
          return;
        }
        var2Lifetime1 = this.field_o >> 4;
        var3Lifetime1 = this.field_a >> 6;
        if (!this.field_l) {
          stackIn_67_0 = 0;
        } else {
          if (!this.field_f) {
            var4Lifetime1 = 0;
            if ((var2Lifetime1 | var3Lifetime1 | var4Lifetime1) <= 0) {
              return;
            }
            if (var2Lifetime1 > 0) {
              stackIn_49_0 = gh.field_h[this.field_m >> 1 & 3];
              stackIn_49_1 = 0;
              stackIn_49_2 = 0;
              stackIn_49_3 = 640;
              stackIn_49_4 = 376;
              if (256 < var2Lifetime1) {
                stackIn_50_5 = 256;
              } else {
                stackIn_50_5 = var2Lifetime1;
              }
              ((nf) (Object) stackIn_49_0).d(stackIn_49_1, stackIn_49_2, stackIn_49_3, stackIn_49_4, stackIn_50_5);
            }
            if (var4Lifetime1 <= 0) {
              if (var3Lifetime1 > 0) {
                stackIn_55_0 = ue.field_u[this.field_m >> 1 & 3];
                stackIn_55_1 = 0;
                stackIn_55_2 = 0;
                stackIn_55_3 = 640;
                stackIn_55_4 = 376;
                if (var3Lifetime1 <= 256) {
                  stackIn_56_5 = var3Lifetime1;
                } else {
                  stackIn_56_5 = 256;
                }
                ((nf) (Object) stackIn_55_0).d(stackIn_55_1, stackIn_55_2, stackIn_55_3, stackIn_55_4, stackIn_56_5);
              }
            } else {
              dl.field_d[(30 & this.field_m) >> 1].d(0, 0, 640, 376, var4Lifetime1);
              if (var3Lifetime1 > 0) {
                stackIn_61_0 = ue.field_u[this.field_m >> 1 & 3];
                stackIn_61_1 = 0;
                stackIn_61_2 = 0;
                stackIn_61_3 = 640;
                stackIn_61_4 = 376;
                if (var3Lifetime1 <= 256) {
                  stackIn_62_5 = var3Lifetime1;
                } else {
                  stackIn_62_5 = 256;
                }
                ((nf) (Object) stackIn_61_0).d(stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_61_4, stackIn_62_5);
              }
            }
            return;
          }
          stackIn_67_0 = 16;
        }
        var4Lifetime2 = stackIn_67_0;
        if ((var2Lifetime1 | var3Lifetime1 | var4Lifetime2) <= 0) {
          return;
        }
        if (var2Lifetime1 > 0) {
          stackIn_72_0 = gh.field_h[this.field_m >> 1 & 3];
          stackIn_72_1 = 0;
          stackIn_72_2 = 0;
          stackIn_72_3 = 640;
          stackIn_72_4 = 376;
          if (256 < var2Lifetime1) {
            stackIn_73_5 = 256;
          } else {
            stackIn_73_5 = var2Lifetime1;
          }
          ((nf) (Object) stackIn_72_0).d(stackIn_72_1, stackIn_72_2, stackIn_72_3, stackIn_72_4, stackIn_73_5);
        }
        if (var4Lifetime2 <= 0) {
          if (var3Lifetime1 > 0) {
            stackIn_78_0 = ue.field_u[this.field_m >> 1 & 3];
            stackIn_78_1 = 0;
            stackIn_78_2 = 0;
            stackIn_78_3 = 640;
            stackIn_78_4 = 376;
            if (var3Lifetime1 <= 256) {
              stackIn_79_5 = var3Lifetime1;
            } else {
              stackIn_79_5 = 256;
            }
            ((nf) (Object) stackIn_78_0).d(stackIn_78_1, stackIn_78_2, stackIn_78_3, stackIn_78_4, stackIn_79_5);
          }
        } else {
          dl.field_d[(30 & this.field_m) >> 1].d(0, 0, 640, 376, var4Lifetime2);
          if (var3Lifetime1 > 0) {
            stackIn_84_0 = ue.field_u[this.field_m >> 1 & 3];
            stackIn_84_1 = 0;
            stackIn_84_2 = 0;
            stackIn_84_3 = 640;
            stackIn_84_4 = 376;
            if (var3Lifetime1 <= 256) {
              stackIn_85_5 = var3Lifetime1;
            } else {
              stackIn_85_5 = 256;
            }
            ((nf) (Object) stackIn_84_0).d(stackIn_84_1, stackIn_84_2, stackIn_84_3, stackIn_84_4, stackIn_85_5);
          }
        }
        return;
    }

    final double a(int param0, boolean param1, boolean param2, double param3) {
        if (this.field_d > 0) {
          return this.a(param0 + 1600765283, param1, param3, (int)(param3 * 4096.0), param2);
        }
        if (param0 == this.field_c) {
          this.field_n.d(param0 ^ 10797);
        }
        return param3;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        if (!param2) {
          if (ik.field_cb[param1] > ik.field_cb[param3]) {
            return true;
          }
          if (ik.field_cb[param3] > ik.field_cb[param1]) {
            return false;
          }
          if (an.field_n[param3] < an.field_n[param1]) {
            return true;
          }
          if (an.field_n[param3] > an.field_n[param1]) {
            return false;
          }
          if (param0 >= -77) {
            ek.c(-125);
          }
          var4 = oc.field_m[param3] + am.field_I[param3] + em.field_b[param3];
          var5 = em.field_b[param1] + (am.field_I[param1] + oc.field_m[param1]);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param3 >= param1);
        }
        if (an.field_n[param3] < an.field_n[param1]) {
          return true;
        }
        if (an.field_n[param1] < an.field_n[param3]) {
          return false;
        }
        if (ik.field_cb[param3] < ik.field_cb[param1]) {
          return true;
        }
        if (ik.field_cb[param3] > ik.field_cb[param1]) {
          return false;
        }
        if (param0 < -77) {
          var4Lifetime1 = oc.field_m[param3] + am.field_I[param3] + em.field_b[param3];
          var5Lifetime1 = em.field_b[param1] + (am.field_I[param1] + oc.field_m[param1]);
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param3 >= param1);
        }
        ek.c(-125);
        var4Lifetime2 = oc.field_m[param3] + am.field_I[param3] + em.field_b[param3];
        var5Lifetime2 = em.field_b[param1] + (am.field_I[param1] + oc.field_m[param1]);
        if (var4Lifetime2 < var5Lifetime2) {
          return true;
        }
        if (var4Lifetime2 > var5Lifetime2) {
          return false;
        }
        return !(param3 >= param1);
    }

    public static void a(byte param0) {
        if (param0 <= -12) {
          field_p = null;
          field_e = null;
          field_k = null;
          return;
        }
        field_p = (df) null;
        field_p = null;
        field_e = null;
        field_k = null;
    }

    final void a(vg param0, double param1, byte param2) {
        int stackIn_10_0 = 0;
        nf[] stackIn_19_0 = null;
        nf stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_22_5;
        nf[] stackIn_30_0 = null;
        nf stackIn_32_0;
        int stackIn_32_1;
        int stackIn_32_2;
        int stackIn_32_3;
        int stackIn_32_4;
        int stackIn_33_5;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var5_double = 0.0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        try {
          var5_double = 1.0 - (this.field_n.field_D - param0.field_O) / param1;
          var5_double = qn.field_v.a(var5_double, 0, this.field_n.field_D);
          if (0.0 >= var5_double) {
            return;
          }
          var7 = (int)((double)this.field_o * var5_double / 16.0);
          var8 = (int)((double)this.field_a * var5_double / 16.0);
          if (param2 != 125) {
            ek.a((byte) -7);
          }
          if (this.field_l &&
            this.field_f) {
            stackIn_10_0 = (int)(96.0 * var5_double);
          } else {
            stackIn_10_0 = 0;
          }
          var9 = stackIn_10_0;
          if ((var9 | (var7 | var8)) > 0) {
            var10 = this.field_n.field_E - param0.field_T;
            var12 = -param0.field_L + this.field_n.field_t;
            var14 = -param0.field_O + this.field_n.field_D;
            var16 = param0.field_M * var14 + (var12 * param0.field_ab + var10 * param0.field_R);
            var18 = var14 * param0.field_F + (var10 * param0.field_V + param0.field_U * var12);
            var20 = param0.field_N * var14 + (param0.field_P * var10 + var12 * param0.field_H);
            if (var20 >= 0.01) {
              var22 = (int)(640.0 * (var16 / var20)) + 320;
              var23 = (int)(var18 / var20 * 640.0) + 188;
              var24 = (int)(640.0 * (this.field_n.field_C / var20));
              if (var7 > 0) {
                if (!this.field_f) {
                  if (!this.field_h) {
                    stackIn_19_0 = uc.field_U;
                  } else {
                    stackIn_19_0 = pc.field_e;
                  }
                } else {
                  stackIn_19_0 = ei.field_mb;
                }
                stackIn_21_0 = stackIn_19_0[(7 & this.field_m) >> 1];
                stackIn_21_1 = var22 - var24;
                stackIn_21_2 = -var24 + var23;
                stackIn_21_3 = 2 * var24;
                stackIn_21_4 = var24 * 2;
                if (256 < var7) {
                  stackIn_22_5 = 256;
                } else {
                  stackIn_22_5 = var7;
                }
                ((nf) (Object) stackIn_21_0).d(stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_22_5);
              }
              if (var9 > 0) {
                pn.field_l[(30 & this.field_m) >> 1].d(var22 - var24, -var24 + var23, var24 * 2, 2 * var24, var9);
              }
              if (var8 <= 0) {
                return;
              }
              if (!this.field_h) {
                stackIn_30_0 = s.field_M;
              } else {
                stackIn_30_0 = qd.field_c;
              }
              stackIn_32_0 = stackIn_30_0[this.field_m >> 1 & 3];
              stackIn_32_1 = var22 - var24;
              stackIn_32_2 = var23 - var24;
              stackIn_32_3 = 2 * var24;
              stackIn_32_4 = var24 * 2;
              if (var8 <= 256) {
                stackIn_33_5 = var8;
              } else {
                stackIn_33_5 = 256;
              }
              ((nf) (Object) stackIn_32_0).d(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, stackIn_33_5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_37_0 = var5;
          stackIn_37_1 = new StringBuilder().append("ek.C(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, mn param1) {
        int var3_int = 0;
        int stackIn_8_0 = 0;
        oi stackIn_13_0 = null;
        double stackIn_13_1 = 0.0;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 > -83) {
            ek.c(-81);
          }
          if (this.field_l) {
            stackIn_8_0 = (this.field_f) ? 1 : 0;
          } else {
            stackIn_8_0 = 0;
          }
          var3_int = stackIn_8_0;
          if ((this.field_o | this.field_a) == 0 &&
            var3_int == 0) {
            return;
          }
          this.field_j.field_o = this.field_n.field_t;
          stackIn_13_0 = this.field_j;
          stackIn_13_1 = this.field_n.field_C;
          if (var3_int != 0) {
            stackIn_14_2 = 12;
          } else {
            stackIn_14_2 = 0;
          }
          stackIn_13_0.field_u = stackIn_13_1 * ((double)stackIn_14_2 + 0.0078125 * (double)(this.field_a + this.field_o)) * this.field_n.field_C;
          this.field_j.field_p = this.field_n.field_D;
          this.field_j.field_t = this.field_n.field_E;
          param1.a((rk) (this.field_j), (byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ek.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void b(int param0) {
        this.field_m = 0;
        this.field_a = 0;
        this.field_o = 0;
        if (param0 != -790952351) {
          field_e = (String) null;
        }
    }

    final static int[] c(int param0) {
        if (param0 != 16317) {
          field_e = (String) null;
          return new int[8];
        }
        return new int[8];
    }

    private final double a(int param0, boolean param1, double param2, int param3, boolean param4) {
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_29_1 = 0;
        int var7;
        tf var8;
        int var7Lifetime1;
        if (this.field_l) {
          stackIn_4_1 = this.field_a;
          if (this.field_h) {
            stackIn_5_2 = param3 >> 3;
          } else {
            stackIn_5_2 = param3;
          }
          this.field_a = stackIn_4_1 + stackIn_5_2;
          return 0.0;
        }
        if (param0 == 1600765283) {
          var7 = (int)(0.5 + Math.pow(0.5, (double)this.field_b / 4.0) * (double)param3);
          if (0 >= this.field_d) {
            return 0.0;
          }
          this.field_d = this.field_d - var7;
          if (this.field_d > 0) {
            stackIn_24_1 = this.field_o;
            if (!this.field_h) {
              stackIn_25_2 = param3;
            } else {
              stackIn_25_2 = param3 >> 3;
            }
            this.field_o = stackIn_24_1 + stackIn_25_2;
            return 0.0;
          }
          param2 = param2 * ((double)(-this.field_d) / (double)var7);
          this.field_d = 0;
          this.a(param1, (byte) -39);
          this.field_o = this.field_o + 4096;
          if (!param4) {
            stackIn_29_1 = 4;
          } else {
            stackIn_29_1 = 1;
          }
          this.field_c = stackIn_29_1;
          return param2;
        }
        var8 = (tf) null;
        this.a((tf) null, -72);
        var7Lifetime1 = (int)(0.5 + Math.pow(0.5, (double)this.field_b / 4.0) * (double)param3);
        if (0 >= this.field_d) {
          return 0.0;
        }
        this.field_d = this.field_d - var7Lifetime1;
        if (this.field_d > 0) {
          stackIn_12_1 = this.field_o;
          if (!this.field_h) {
            stackIn_13_2 = param3;
          } else {
            stackIn_13_2 = param3 >> 3;
          }
          this.field_o = stackIn_12_1 + stackIn_13_2;
          return 0.0;
        }
        param2 = param2 * ((double)(-this.field_d) / (double)var7Lifetime1);
        this.field_d = 0;
        this.a(param1, (byte) -39);
        this.field_o = this.field_o + 4096;
        if (!param4) {
          stackIn_17_1 = 4;
        } else {
          stackIn_17_1 = 1;
        }
        this.field_c = stackIn_17_1;
        return param2;
    }

    ek(ee param0, boolean param1, boolean param2, int param3) {
        this.field_l = false;
        this.field_d = 65536;
        this.field_o = 0;
        this.field_m = 0;
        this.field_a = 0;
        try {
          this.field_f = param1 ? true : false;
          this.field_n = param0;
          this.field_h = param2 ? true : false;
          this.field_b = param3;
          this.field_j = new oi(param0);
          this.field_i = new gk(param0, !param1 ? fh.field_b : tl.field_b);
          this.field_i.field_w = param0.field_C;
          this.field_i.field_m = 0;
          this.field_g = new gk(param0, hc.field_p);
          this.field_g.field_w = param0.field_C;
          this.field_g.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_e = "1 concussion missile";
        field_k = "Z";
    }
}
