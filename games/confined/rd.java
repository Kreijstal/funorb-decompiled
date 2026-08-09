/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends id {
    private u field_Pb;
    boolean field_Ob;
    static bi field_Hb;
    static String field_Jb;
    rd field_Tb;
    private int field_Sb;
    int field_Qb;
    static volatile int field_Nb;
    private int field_Mb;
    private int field_Fb;
    boolean field_Rb;
    private int field_Gb;
    static String field_Ib;
    private boolean[] field_Kb;
    private int field_Lb;

    final void a(double param0, double param1, int param2, int param3, double param4, double param5, int param6, double param7, double param8, double param9) {
        int var18;
        int var19;
        var19 = Confined.field_J ? 1 : 0;
        if (param3 != 0) {
          if ((param3 ^ -1) != -2) {
            if (2 != param3) {
              this.a(param8, param9, param7, param0, param5, (byte) 89, param1, this.field_A.field_x.a((byte) 78, this.field_C), param4);
              var18 = -15 % ((-3 - param6) / 32);
              return;
            } else {
              this.a(param5 * 6.283185307179586, 0.5 * param9, 2.0, this.field_A.field_x.a((byte) 78, this.field_C), (byte) -68);
              var18 = -15 % ((-3 - param6) / 32);
              return;
            }
          } else {
            this.a(this.field_A.field_x.a((byte) 78, this.field_C), param9, param5 * 6.283185307179586, (byte) 107);
            var18 = -15 % ((-3 - param6) / 32);
            return;
          }
        } else {
          this.a(this.field_A.field_x.a((byte) 78, this.field_C), param9, (byte) 99, 6.283185307179586 * param5);
          var18 = -15 % ((-3 - param6) / 32);
          return;
        }
    }

    private final void a(double param0, double param1, byte param2, double param3) {
        this.field_qb = param1;
        this.field_Db = 0.0;
        this.field_ub = 0.0;
        this.field_X = 0.0;
        this.field_hb = param3;
        this.field_R = 0.0;
        this.field_Z = param0;
        if (param2 <= 55) {
          field_Jb = (String) null;
          this.field_cb = 0.0;
          return;
        } else {
          this.field_cb = 0.0;
          return;
        }
    }

    private final void a(double param0, double param1, double param2, byte param3) {
        this.field_Z = 0.0;
        this.field_ub = param0;
        this.field_cb = 0.0;
        this.field_R = 0.0;
        this.field_qb = 0.0;
        this.field_hb = param2;
        if (param3 != 107) {
          this.field_Gb = -106;
          this.field_Db = param1;
          this.field_X = 1.5707963267948966;
          return;
        } else {
          this.field_Db = param1;
          this.field_X = 1.5707963267948966;
          return;
        }
    }

    final void a(vg param0, boolean param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int var18 = 0;
        sk var19 = null;
        var17 = null;
        var18 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_ab) {
                break L1;
              } else {
                if (this.field_xb * 2.0 <= -this.field_A.field_B.field_Lb.field_j + this.field_D) {
                  break L1;
                } else {
                  L2: {
                    var3_double = -param0.field_T + this.field_E;
                    var5 = this.field_t - param0.field_L;
                    var7 = -param0.field_O + this.field_D;
                    var9 = var7 * param0.field_M + (var5 * param0.field_ab + var3_double * param0.field_R);
                    var11 = param0.field_F * var7 + (var3_double * param0.field_V + param0.field_U * var5);
                    var13 = param0.field_N * var7 + (var3_double * param0.field_P + var5 * param0.field_H);
                    if (var9 < -var13 * 0.5) {
                      break L2;
                    } else {
                      if (var9 > 0.5 * var13) {
                        break L2;
                      } else {
                        if (var11 < 0.29375 * -var13) {
                          break L2;
                        } else {
                          if (var11 > 0.29375 * var13) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (-0.001 <= var9) {
                        break L4;
                      } else {
                        if (var11 <= var9 * 0.5416666666666666) {
                          break L4;
                        } else {
                          if (0.5416666666666666 * var9 >= -var11) {
                            break L4;
                          } else {
                            var11 = var11 * (-288.0 / var9);
                            var9 = -288.0;
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (var9 <= 0.001) {
                        break L5;
                      } else {
                        if (var11 >= var9 * 0.5416666666666666) {
                          break L5;
                        } else {
                          if (-var11 >= var9 * 0.5416666666666666) {
                            break L5;
                          } else {
                            var11 = var11 * (288.0 / var9);
                            var9 = 288.0;
                            break L3;
                          }
                        }
                      }
                    }
                    if (var11 < -0.001) {
                      var9 = var9 * (-156.0 / var11);
                      var11 = -156.0;
                      break L3;
                    } else {
                      if (var11 <= 0.001) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var9 = var9 * (156.0 / var11);
                        var11 = 156.0;
                        break L3;
                      }
                    }
                  }
                  var15 = 320 - -(int)Math.floor(var9 + 0.5);
                  var16 = 188 - -(int)Math.floor(0.5 + var11);
                  ti.a(var15, var16);
                  var19 = (sk) ((Object) jk.field_c[this.field_Sb].a(96, 455, 0, 0, 256));
                  jc.field_f[2] = (int)(8192.0 * this.field_C);
                  var19.a(tj.field_A, jc.field_f);
                  ti.a();
                  break L1;
                }
              }
            }
            L6: {
              if (!param1) {
                break L6;
              } else {
                this.f((byte) 63);
                break L6;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("rd.IC(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final pm i(byte param0) {
        double[] var2;
        double[] var3;
        double var4;
        double var6;
        double var8;
        double[] var10;
        double[] var11;
        double[] var12;
        L0: {
          var12 = new double[12];
          var11 = var12;
          var10 = var11;
          var2 = var10;
          this.field_Eb.a((byte) 20, var12);
          var3 = tl.field_a[this.field_Sb];
          if (param0 == 96) {
            break L0;
          } else {
            rd.n(-108);
            break L0;
          }
        }
        var4 = var3[this.field_Fb];
        var6 = var3[1 + this.field_Fb];
        var8 = var3[2 + this.field_Fb];
        this.field_Fb = (3 + this.field_Fb) % var3.length;
        if (-1 != (this.field_zb ^ -1)) {
          if ((this.field_zb ^ -1) == -2) {
            return (pm) ((Object) new gm(this.field_A, (ee) (this), var12, var4, var6, var8));
          } else {
            return (pm) ((Object) new ik(this.field_A, (ee) (this), var12, var4, var6, var8));
          }
        } else {
          return (pm) ((Object) new th(this.field_A, (ee) (this), var12, var4, var6, var8));
        }
    }

    private final void a(double param0, double param1, double param2, double param3, byte param4) {
        this.field_hb = param0;
        this.field_Db = param1 * param2;
        this.field_qb = param1;
        if (param4 > -58) {
          field_Jb = (String) null;
          this.field_ub = 0.0;
          this.field_Z = param3;
          this.field_cb = 0.0;
          this.field_R = param1;
          this.field_X = 0.0;
          return;
        } else {
          this.field_ub = 0.0;
          this.field_Z = param3;
          this.field_cb = 0.0;
          this.field_R = param1;
          this.field_X = 0.0;
          return;
        }
    }

    final static int a(String param0, int param1, int param2, String param3, boolean param4, String param5, int param6) {
        bn var7 = null;
        RuntimeException var7_ref = null;
        bn var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new bn(param0);
              var8 = new bn(param3);
              if (param2 == 28406) {
                break L1;
              } else {
                field_Jb = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = ai.a(param1, param5, var8, param4, param6, 125, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("rd.NC(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final void d(byte param0, int param1) {
        Object var3;
        rd var4_ref_rd;
        int var5;
        int var4;
        var5 = Confined.field_J ? 1 : 0;
        var3 = this;
        L0: while (true) {
          var4_ref_rd = ((rd) (var3)).field_Tb;
          if (var4_ref_rd != null) {
            ((rd) (var3)).field_ub = var4_ref_rd.field_ub;
            ((rd) (var3)).field_cb = var4_ref_rd.field_cb;
            ((rd) (var3)).field_Db = var4_ref_rd.field_Db;
            ((rd) (var3)).field_X = var4_ref_rd.field_X;
            ((rd) (var3)).field_qb = var4_ref_rd.field_qb;
            ((rd) (var3)).field_hb = var4_ref_rd.field_hb;
            ((rd) (var3)).field_R = var4_ref_rd.field_R;
            ((rd) (var3)).field_Z = var4_ref_rd.field_Z;
            var3 = var4_ref_rd;
            continue L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (this.field_Gb <= var4) {
                if (param0 != -123) {
                  this.h(-114);
                  return;
                } else {
                  return;
                }
              } else {
                ((rd) (var3)).m(12);
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(mn param0, byte param1) {
        int var3_int = 0;
        double[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -84);
              var3_int = -89 % ((-2 - param1) / 62);
              if ((this.field_ob ^ -1) > -257) {
                L2: {
                  if (-1 == (this.field_Sb ^ -1)) {
                    break L2;
                  } else {
                    if (-5 != (this.field_Sb ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = new double[12];
                this.field_Eb.a((byte) 110, var8);
                this.a(false, var8, 0, mc.field_b);
                this.field_ib.field_o = ud.field_o;
                this.field_ib.field_t = rn.field_c;
                this.field_ib.field_p = dh.field_sb;
                this.field_ib.field_m = -var8[6];
                this.field_ib.field_w = true;
                this.field_ib.field_v = -var8[8];
                this.field_ib.field_u = (double)(-this.field_ob + 256) * 0.390625;
                this.field_ib.field_x = -var8[7];
                param0.a((rk) (this.field_ib), (byte) 86);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("rd.OA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void h(int param0) {
        this.field_Lb = this.field_Lb + 1;
        if (param0 == 17086) {
            return;
        }
        this.field_Mb = -128;
    }

    private rd(hn param0, double param1, double param2, double param3, double param4, double param5, int param6, int param7, boolean param8, int param9, boolean param10, double param11, int param12, boolean param13, double param14, boolean param15, boolean param16, int param17, boolean param18, rd param19, int param20, u param21, boolean param22, boolean[] param23) {
        super(param0, param1, param2, param3, Math.random() * 0.4 - 0.2, -0.2 + Math.random() * 0.4, -0.2 + 0.4 * Math.random(), param4, param5, false, param9, param11, 0.005);
        gk discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        double stackIn_28_0 = 0.0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var32_double = 0.0;
        RuntimeException var32 = null;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        this.field_Fb = 0;
        try {
          L0: {
            L1: {
              this.field_wb = param12;
              this.field_Bb = param12;
              stackIn_3_0 = this;

              if (!param13) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((rd) (this)).field_db = stackIn_4_1 != 0;
              this.field_Qb = param6;
              if (param8) {
                break L2;
              } else {
                this.field_fb.field_d = 0;
                break L2;
              }
            }
            L3: {
              stackIn_8_0 = this;

              if (!param15) {
                stackIn_9_0 = this;
                stackIn_9_1 = 0;
                break L3;
              } else {
                stackIn_9_0 = this;
                stackIn_9_1 = 1;
                break L3;
              }
            }
            L4: {
              ((rd) (this)).field_kb = stackIn_9_1 != 0;
              this.field_S = false;
              this.field_Y = param14;
              stackIn_11_0 = this;

              if (!param10) {
                stackIn_12_0 = this;
                stackIn_12_1 = 0;
                break L4;
              } else {
                stackIn_12_0 = this;
                stackIn_12_1 = 1;
                break L4;
              }
            }
            L5: {
              ((rd) (this)).field_ab = stackIn_12_1 != 0;
              this.field_Ab = param17;
              stackIn_14_0 = this;

              if (!param16) {
                stackIn_15_0 = this;
                stackIn_15_1 = 0;
                break L5;
              } else {
                stackIn_15_0 = this;
                stackIn_15_1 = 1;
                break L5;
              }
            }
            L6: {
              ((rd) (this)).field_Ob = stackIn_15_1 != 0;
              this.field_Sb = param7;
              if (!param15) {
                break L6;
              } else {
                this.field_ob = 256;
                break L6;
              }
            }
            L7: {
              stackIn_19_0 = this;

              if (!param18) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L7;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L7;
              }
            }
            L8: {
              ((rd) (this)).field_vb = stackIn_20_1 != 0;
              if (!param18) {
                break L8;
              } else {
                this.l(22475);
                break L8;
              }
            }
            L9: {
              this.field_Tb = param19;
              this.field_Pb = param21;
              this.field_Gb = param20;
              if (param19 == null) {
                break L9;
              } else {
                param19.field_eb = (rd) (this);
                break L9;
              }
            }
            L10: {
              if (param21 == null) {
                break L10;
              } else {
                L11: {
                  var32_double = param21.field_E - param0.field_B.field_Lb.field_i;
                  var34 = param21.field_t - param0.field_B.field_Lb.field_f;
                  var36 = param21.field_D - param0.field_B.field_Lb.field_j;
                  var38 = Math.sqrt(var32_double * var32_double + var34 * var34 + var36 * var36);
                  if (var38 >= 0.01) {
                    stackIn_28_0 = 2.0 / var38;
                    break L11;
                  } else {
                    stackIn_28_0 = 200.0;
                    break L11;
                  }
                }
                var38 = stackIn_28_0;
                var38 = var38 * (param21.field_C + param4);
                var32_double = var32_double * var38;
                var36 = var36 * var38;
                var34 = var34 * var38;
                this.field_G = param21.field_G;
                this.field_L = param21.field_L;
                this.field_t = param21.field_t + var34;
                this.field_D = param21.field_D + var36;
                this.field_E = var32_double + param21.field_E;
                this.field_K = param21.field_K;
                break L10;
              }
            }
            L12: {
              this.field_Kb = param23;
              stackIn_31_0 = this;

              if (!param22) {
                stackIn_32_0 = this;
                stackIn_32_1 = 0;
                break L12;
              } else {
                stackIn_32_0 = this;
                stackIn_32_1 = 1;
                break L12;
              }
            }
            ((rd) (this)).field_Rb = stackIn_32_1 != 0;
            discarded$0 = new gk((pm) (this), tk.field_c[param7]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var32 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var32);

            stackIn_36_1 = new StringBuilder().append("rd.<init>(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L13;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');

            if (param19 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L14;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param20).append(',');

            if (param21 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L15;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param22).append(',');

            if (param23 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L16;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L16;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), stackIn_46_2 + ')');
        }
    }

    public static void n(int param0) {
        field_Hb = null;
        field_Jb = null;
        field_Ib = null;
        if (param0 <= -107) {
            return;
        }
        field_Jb = (String) null;
    }

    final void f(byte param0) {
        this.field_Lb = this.field_Lb - 1;
        if (param0 <= -112) {
            return;
        }
        this.field_Fb = 56;
    }

    final pm h(byte param0) {
        double[] var2;
        double[] var3;
        double var4;
        double var6;
        double var8;
        double[] var10;
        var10 = new double[12];
        var2 = var10;
        this.field_Eb.a((byte) 49, var10);
        if (param0 <= 15) {
          this.a(-0.20656177354580776, 0.5060040522939452, 0.05774250501221265, 0.8961713050329917, (byte) 20);
          var3 = tl.field_a[this.field_Sb];
          var4 = var3[this.field_Fb];
          var6 = var3[this.field_Fb + 1];
          var8 = var3[this.field_Fb + 2];
          this.field_Fb = (this.field_Fb + 3) % var3.length;
          return (pm) ((Object) new vm(this.field_A, (ee) (this), var10, var4, var6, var8, this.field_Y, this.field_db));
        } else {
          var3 = tl.field_a[this.field_Sb];
          var4 = var3[this.field_Fb];
          var6 = var3[this.field_Fb + 1];
          var8 = var3[this.field_Fb + 2];
          this.field_Fb = (this.field_Fb + 3) % var3.length;
          return (pm) ((Object) new vm(this.field_A, (ee) (this), var10, var4, var6, var8, this.field_Y, this.field_db));
        }
    }

    final boolean o(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 640) {
          if (!this.field_z) {
            if (this.field_S) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          this.h((byte) -101);
          if (this.field_z) {
            return true;
          } else {
            L0: {
              if (!this.field_S) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    rd(hn param0, double param1, double param2, double param3, boolean param4, int param5, int param6, rd param7, int param8, boolean param9, int param10, int param11, boolean param12, boolean param13, double param14, boolean param15, boolean param16, u param17, boolean param18, boolean[] param19, int param20) {
        this(null, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0, false, 0, false, 0.0, 0, false, 0.0, false, false, 0, false, param7, param8, param17, param18, param19);
        Object stackIn_2_0;
        hn stackIn_2_1;
        double stackIn_2_2;
        double stackIn_2_3;
        double stackIn_2_4;
        double stackIn_2_5;
        double stackIn_2_6;
        int stackIn_2_7;
        int stackIn_2_8;
        boolean stackIn_2_9;
        int stackIn_2_10;
        boolean stackIn_2_11;
        double stackIn_2_12;
        int stackIn_2_13;
        boolean stackIn_2_14;
        double stackIn_2_15;
        int stackIn_2_16;
        boolean stackIn_2_17;
        int stackIn_2_18;
        Object stackIn_3_0;
        Object stackIn_4_0;
        hn stackIn_4_1;
        double stackIn_4_2;
        double stackIn_4_3;
        double stackIn_4_4;
        double stackIn_4_5;
        double stackIn_4_6;
        int stackIn_4_7;
        int stackIn_4_8;
        boolean stackIn_4_9;
        int stackIn_4_10;
        boolean stackIn_4_11;
        double stackIn_4_12;
        int stackIn_4_13;
        boolean stackIn_4_14;
        double stackIn_4_15;
        int stackIn_4_16;
        boolean stackIn_4_17;
        int stackIn_4_18;
        int stackIn_4_19;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var26_int = 0;
        double var26_double = 0.0;
        RuntimeException var26 = null;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        L0: {
          L1: {
            var38 = Confined.field_J ? 1 : 0;
            stackIn_2_0 = this;

            stackIn_2_1 = (hn) (param0);

            stackIn_2_2 = param1;

            stackIn_2_3 = param2;

            stackIn_2_4 = param3;

            stackIn_2_5 = rf.field_a[param5];

            stackIn_2_6 = tg.field_R[param5];

            stackIn_2_7 = param5;

            stackIn_2_8 = param6;

            stackIn_2_9 = param9;

            stackIn_2_10 = param10;

            stackIn_2_11 = param12;

            stackIn_2_12 = sb.field_a[param5];

            stackIn_2_13 = cd.field_j[param5];

            stackIn_2_14 = param13;

            stackIn_2_15 = param14;

            stackIn_2_16 = 0;

            stackIn_2_17 = param15;

            stackIn_2_18 = param11;

            if (param16) {
              break L1;
            } else {
              stackIn_3_0 = this;
              stackIn_2_0 = stackIn_3_0;

              if (-3 != (param5 ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = (hn) ((Object) stackIn_2_1);
                stackIn_4_2 = stackIn_2_2;
                stackIn_4_3 = stackIn_2_3;
                stackIn_4_4 = stackIn_2_4;
                stackIn_4_5 = stackIn_2_5;
                stackIn_4_6 = stackIn_2_6;
                stackIn_4_7 = stackIn_2_7;
                stackIn_4_8 = stackIn_2_8;
                stackIn_4_9 = stackIn_2_9;
                stackIn_4_10 = stackIn_2_10;
                stackIn_4_11 = stackIn_2_11;
                stackIn_4_12 = stackIn_2_12;
                stackIn_4_13 = stackIn_2_13;
                stackIn_4_14 = stackIn_2_14;
                stackIn_4_15 = stackIn_2_15;
                stackIn_4_16 = stackIn_2_16;
                stackIn_4_17 = stackIn_2_17;
                stackIn_4_18 = stackIn_2_18;
                stackIn_4_19 = 0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (hn) ((Object) stackIn_2_1);
          stackIn_4_2 = stackIn_2_2;
          stackIn_4_3 = stackIn_2_3;
          stackIn_4_4 = stackIn_2_4;
          stackIn_4_5 = stackIn_2_5;
          stackIn_4_6 = stackIn_2_6;
          stackIn_4_7 = stackIn_2_7;
          stackIn_4_8 = stackIn_2_8;
          stackIn_4_9 = stackIn_2_9;
          stackIn_4_10 = stackIn_2_10;
          stackIn_4_11 = stackIn_2_11;
          stackIn_4_12 = stackIn_2_12;
          stackIn_4_13 = stackIn_2_13;
          stackIn_4_14 = stackIn_2_14;
          stackIn_4_15 = stackIn_2_15;
          stackIn_4_16 = stackIn_2_16;
          stackIn_4_17 = stackIn_2_17;
          stackIn_4_18 = stackIn_2_18;
          stackIn_4_19 = 1;
          break L0;
        }
        try {
          L2: {
            L3: {
              L4: {
                this.field_Mb = param20;
                var26_int = param6;
                if (-1 == (var26_int ^ -1)) {
                  break L4;
                } else {
                  if ((var26_int ^ -1) == -2) {
                    break L4;
                  } else {
                    L5: {
                      if (var26_int == 2) {
                        break L5;
                      } else {
                        if ((var26_int ^ -1) == -4) {
                          break L5;
                        } else {
                          L6: {
                            if (4 == var26_int) {
                              break L6;
                            } else {
                              if ((var26_int ^ -1) == -6) {
                                break L6;
                              } else {
                                if ((var26_int ^ -1) == -7) {
                                  break L6;
                                } else {
                                  if ((var26_int ^ -1) == -8) {
                                    break L6;
                                  } else {
                                    if (var26_int == 9) {
                                      break L6;
                                    } else {
                                      if (var26_int == 10) {
                                        break L6;
                                      } else {
                                        if ((var26_int ^ -1) == -12) {
                                          break L6;
                                        } else {
                                          if (-13 == (var26_int ^ -1)) {
                                            break L6;
                                          } else {
                                            if (-9 != (var26_int ^ -1)) {
                                              break L3;
                                            } else {
                                              var26_double = 1.998 * Math.random() - 0.999;
                                              var28 = Math.sqrt(1.0 - var26_double * var26_double);
                                              var30 = 2.0 * (Math.random() * 3.141592653589793);
                                              this.field_tb.a(Math.random() * 0.2, var26_double, var28 * Math.sin(var30), var28 * Math.cos(var30), 7);
                                              break L3;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_Bb = 1 + (int)(Math.random() * (double)this.field_wb);
                          if (!param4) {
                            this.field_yb = true;
                            break L3;
                          } else {
                            this.a(0.0, 1.0, false, 0.0);
                            break L3;
                          }
                        }
                      }
                    }
                    if (param4) {
                      this.b(0.0, true, 0.0, 1.0);
                      break L3;
                    } else {
                      this.field_gb = true;
                      break L3;
                    }
                  }
                }
              }
              L7: {
                var26_double = 1.998 * Math.random() - 0.999;
                var28 = Math.sqrt(1.0 - var26_double * var26_double);
                var30 = 6.283185307179586 * Math.random();
                var32 = var28 * Math.cos(var30);
                var34 = Math.sin(var30) * var28;
                this.field_tb.a(0.2, var26_double, var32, var34, 7);
                var36 = Math.sqrt(var32 * var32 + var26_double * var26_double);
                if (0.0001 > var36) {
                  var26_double = 0.0;
                  var32 = 1.0;
                  break L7;
                } else {
                  var26_double = var26_double / var36;
                  var32 = var32 / var36;
                  break L7;
                }
              }
              this.field_Eb.a(-Math.atan2(var36, var34), var32, -var26_double, 0.0, 7);
              break L3;
            }
            break L2;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var26 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var26);

            stackIn_33_1 = new StringBuilder().append("rd.<init>(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');

            if (param17 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param18).append(',');

            if (param19 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), stackIn_43_2 + ',' + param20 + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        oi var28 = null;
        try {
          L0: {
            if (!this.field_N) {
              L1: {
                this.a(this.field_ob, jk.field_c[this.field_Sb], 27902, this.field_Eb, 512, param4, param1, param3, param0);
                if (param2 < -5) {
                  break L1;
                } else {
                  var28 = (oi) null;
                  this.a((mn) null, 0.8438752622488864, -63, (vg) null, (oi) null);
                  break L1;
                }
              }
              L2: {
                this.field_fb.a(param3, param1, (byte) 125);
                if (-11 < (this.field_V ^ -1)) {
                  break L2;
                } else {
                  var7_double = this.field_E - this.field_A.field_B.field_E;
                  var9 = -this.field_A.field_B.field_t + this.field_t;
                  var11 = this.field_D - this.field_A.field_B.field_D;
                  if (400.0 > var11 * var11 + (var7_double * var7_double + var9 * var9)) {
                    var13 = -param3.field_T + this.field_E;
                    var15 = -param3.field_L + this.field_t;
                    var17 = -param3.field_O + this.field_D;
                    var19 = var17 * param3.field_M + (var15 * param3.field_ab + param3.field_R * var13);
                    var21 = var17 * param3.field_F + (var15 * param3.field_U + param3.field_V * var13);
                    var23 = var15 * param3.field_H + var13 * param3.field_P + param3.field_N * var17;
                    if (0.15 > var23) {
                      break L2;
                    } else {
                      L3: {
                        var25 = (int)(var19 / var23 * 640.0) + 320;
                        var26 = 188 - -(int)(640.0 * (var21 / var23));
                        var27 = (int)(this.field_C / var23 * 640.0);
                        if (-1 == (6 & this.field_V ^ -1)) {
                          break L3;
                        } else {
                          fn.g(var25 + -1, -1 + var26, var27, 16711680);
                          fn.g(var25, var26 - 1, var27, 16711680);
                          fn.g(-1 + var25, var26, var27, 16711680);
                          fn.g(var25, var26, var27, 16711680);
                          break L3;
                        }
                      }
                      pn.field_a.b(di.field_f, var25, -8 + var26 - var27, 16711680, -1);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7);

            stackIn_14_1 = new StringBuilder().append("rd.QA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final double j(int param0) {
        if (param0 != -7672) {
            field_Hb = (bi) null;
            return (double)(this.field_Lb << 1929766512);
        }
        return (double)(this.field_Lb << 1929766512);
    }

    final void g(int param0) {
        int var4;
        ka var6;
        int stackIn_17_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_105_0 = 0;
        int var3;
        ka var7;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 == 26402) {
          var7 = this.a((byte) -71, ic.field_c[this.field_Sb], 1.5);
          var7.field_M.field_w = this.field_C * 2.0;
          if (this.field_A.field_K == null) {
            L0: while (true) {
              if (null != this.field_Tb) {
                if (this.field_Tb.o(640)) {
                  this.field_Tb = this.field_Tb.field_Tb;
                  continue L0;
                } else {
                  L1: while (true) {
                    L2: {
                      if (this.field_eb == null) {
                        break L2;
                      } else {
                        if (!this.field_eb.o(640)) {
                          break L2;
                        } else {
                          this.field_eb = this.field_eb.field_eb;
                          continue L1;
                        }
                      }
                    }
                    L3: {
                      if (!pa.field_c) {
                        var3 = this.field_Kb[0] ? 1 : 0;
                        this.field_Kb[0] = false;
                        break L3;
                      } else {
                        L4: {
                          if (this.field_eb == null) {
                            if (null == this.field_Tb) {
                              stackIn_105_0 = 1;
                              break L4;
                            } else {
                              stackIn_105_0 = 0;
                              break L4;
                            }
                          } else {
                            stackIn_105_0 = 0;
                            break L4;
                          }
                        }
                        var3 = stackIn_105_0;
                        break L3;
                      }
                    }
                    L5: {
                      if (var3 == 0) {
                        break L5;
                      } else {
                        ri.a((rk) (this), 0, new cl(this.field_A, (rd) (this)));
                        break L5;
                      }
                    }
                    L6: {
                      if (!this.field_Rb) {
                        this.field_A.a((byte) 50, si.a(107, (rd) (this)));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if ((this.field_Mb ^ -1) < -3) {
                        break L7;
                      } else {
                        this.field_A.field_c = this.field_A.field_c - 1;
                        break L7;
                      }
                    }
                    L8: {
                      if (-2 <= (this.field_Mb ^ -1)) {
                        this.field_A.field_j = this.field_A.field_j - 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (this.field_Rb) {
                        this.field_A.field_o = this.field_A.field_o - 1;
                        if (this.field_A.field_o != 0) {
                          break L9;
                        } else {
                          if (null != this.field_A.field_Q) {
                            break L9;
                          } else {
                            if (this.field_A.field_J.field_o > 12) {
                              break L9;
                            } else {
                              di.a(param0 + -57269, 242, 13);
                              break L9;
                            }
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                }
              } else {
                L10: while (true) {
                  L11: {
                    if (this.field_eb == null) {
                      break L11;
                    } else {
                      if (!this.field_eb.o(640)) {
                        break L11;
                      } else {
                        this.field_eb = this.field_eb.field_eb;
                        continue L10;
                      }
                    }
                  }
                  L12: {
                    if (!pa.field_c) {
                      var3 = this.field_Kb[0] ? 1 : 0;
                      this.field_Kb[0] = false;
                      break L12;
                    } else {
                      L13: {
                        if (this.field_eb == null) {
                          if (null == this.field_Tb) {
                            stackIn_74_0 = 1;
                            break L13;
                          } else {
                            stackIn_74_0 = 0;
                            break L13;
                          }
                        } else {
                          stackIn_74_0 = 0;
                          break L13;
                        }
                      }
                      var3 = stackIn_74_0;
                      break L12;
                    }
                  }
                  L14: {
                    if (var3 == 0) {
                      break L14;
                    } else {
                      ri.a((rk) (this), 0, new cl(this.field_A, (rd) (this)));
                      break L14;
                    }
                  }
                  L15: {
                    if (!this.field_Rb) {
                      this.field_A.a((byte) 50, si.a(107, (rd) (this)));
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((this.field_Mb ^ -1) < -3) {
                      break L16;
                    } else {
                      this.field_A.field_c = this.field_A.field_c - 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (-2 <= (this.field_Mb ^ -1)) {
                      this.field_A.field_j = this.field_A.field_j - 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (this.field_Rb) {
                      this.field_A.field_o = this.field_A.field_o - 1;
                      if (this.field_A.field_o != 0) {
                        break L18;
                      } else {
                        if (null != this.field_A.field_Q) {
                          break L18;
                        } else {
                          if (this.field_A.field_J.field_o > 12) {
                            break L18;
                          } else {
                            di.a(param0 + -57269, 242, 13);
                            break L18;
                          }
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if ((this.field_Mb ^ -1) < -3) {
              L19: {
                if (-2 <= (this.field_Mb ^ -1)) {
                  this.field_A.field_j = this.field_A.field_j - 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              if (this.field_Rb) {
                this.field_A.field_o = this.field_A.field_o - 1;
                if (this.field_A.field_o == 0) {
                  if (null == this.field_A.field_Q) {
                    if (this.field_A.field_J.field_o <= 12) {
                      di.a(param0 + -57269, 242, 13);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L20: {
                this.field_A.field_c = this.field_A.field_c - 1;
                if (-2 <= (this.field_Mb ^ -1)) {
                  this.field_A.field_j = this.field_A.field_j - 1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (this.field_Rb) {
                  this.field_A.field_o = this.field_A.field_o - 1;
                  if (this.field_A.field_o != 0) {
                    break L21;
                  } else {
                    if (null != this.field_A.field_Q) {
                      break L21;
                    } else {
                      if (this.field_A.field_J.field_o > 12) {
                        break L21;
                      } else {
                        di.a(param0 + -57269, 242, 13);
                        break L21;
                      }
                    }
                  }
                } else {
                  break L21;
                }
              }
              return;
            }
          }
        } else {
          L22: {
            this.h((byte) -69);
            var6 = this.a((byte) -71, ic.field_c[this.field_Sb], 1.5);
            var6.field_M.field_w = this.field_C * 2.0;
            if (this.field_A.field_K == null) {
              L23: while (true) {
                L24: {
                  if (null == this.field_Tb) {
                    break L24;
                  } else {
                    if (!this.field_Tb.o(640)) {
                      break L24;
                    } else {
                      this.field_Tb = this.field_Tb.field_Tb;
                      continue L23;
                    }
                  }
                }
                L25: while (true) {
                  L26: {
                    if (this.field_eb == null) {
                      break L26;
                    } else {
                      if (!this.field_eb.o(640)) {
                        break L26;
                      } else {
                        this.field_eb = this.field_eb.field_eb;
                        continue L25;
                      }
                    }
                  }
                  L27: {
                    if (!pa.field_c) {
                      var3 = this.field_Kb[0] ? 1 : 0;
                      this.field_Kb[0] = false;
                      break L27;
                    } else {
                      L28: {
                        if (this.field_eb == null) {
                          if (null == this.field_Tb) {
                            stackIn_17_0 = 1;
                            break L28;
                          } else {
                            stackIn_17_0 = 0;
                            break L28;
                          }
                        } else {
                          stackIn_17_0 = 0;
                          break L28;
                        }
                      }
                      var3 = stackIn_17_0;
                      break L27;
                    }
                  }
                  L29: {
                    if (var3 == 0) {
                      break L29;
                    } else {
                      ri.a((rk) (this), 0, new cl(this.field_A, (rd) (this)));
                      break L29;
                    }
                  }
                  if (!this.field_Rb) {
                    this.field_A.a((byte) 50, si.a(107, (rd) (this)));
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
            } else {
              break L22;
            }
          }
          L30: {
            if ((this.field_Mb ^ -1) < -3) {
              break L30;
            } else {
              this.field_A.field_c = this.field_A.field_c - 1;
              break L30;
            }
          }
          L31: {
            if (-2 <= (this.field_Mb ^ -1)) {
              this.field_A.field_j = this.field_A.field_j - 1;
              break L31;
            } else {
              break L31;
            }
          }
          L32: {
            if (this.field_Rb) {
              this.field_A.field_o = this.field_A.field_o - 1;
              if (this.field_A.field_o != 0) {
                break L32;
              } else {
                if (null != this.field_A.field_Q) {
                  break L32;
                } else {
                  if (this.field_A.field_J.field_o > 12) {
                    break L32;
                  } else {
                    di.a(param0 + -57269, 242, 13);
                    break L32;
                  }
                }
              }
            } else {
              break L32;
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1) {
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        double stackIn_12_1 = 0.0;
        Object stackIn_13_0 = null;
        double stackIn_13_1 = 0.0;
        double stackIn_13_2 = 0.0;
        double stackIn_21_0 = 0.0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        double stackIn_36_1 = 0.0;
        Object stackIn_37_0 = null;
        double stackIn_37_1 = 0.0;
        double stackIn_37_2 = 0.0;
        double stackIn_43_0 = 0.0;
        double stackIn_62_0 = 0.0;
        double stackIn_73_0 = 0.0;
        double var3;
        double var5;
        double var7;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        double var19;
        double var21;
        int var23;
        var23 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          L1: {
            if (this.field_Tb == null) {
              break L1;
            } else {
              if (!this.field_Tb.o(640)) {
                break L1;
              } else {
                this.field_Gb = this.field_Gb + this.field_Tb.field_Gb;
                this.field_Tb = this.field_Tb.field_Tb;
                continue L0;
              }
            }
          }
          L2: {
            if (null == this.field_Pb) {
              break L2;
            } else {
              if (this.field_Pb.field_z) {
                this.field_Pb = null;
                this.a((byte) 125, param0);
                break L2;
              } else {
                L3: {
                  if (null != this.field_Tb) {
                    L4: {
                      var3 = this.field_Tb.field_D + (double)this.field_Gb * (this.field_Tb.field_C + this.field_C) * 0.2;
                      var5 = 0.1 * (var3 - this.field_D) + this.field_Tb.field_L;
                      var5 = var5 - this.field_L;
                      stackIn_12_0 = this;

                      stackIn_12_1 = this.field_L;

                      if (0.04 < var5) {
                        stackIn_13_0 = this;
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = 0.04;
                        break L4;
                      } else {
                        stackIn_11_0 = this;

                        if (var5 < -0.04) {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = -0.04;
                          break L4;
                        } else {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = var5;
                          break L4;
                        }
                      }
                    }
                    ((rd) (this)).field_L = stackIn_13_1 + stackIn_13_2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (!this.field_Rb) {
                    break L5;
                  } else {
                    if (null == this.field_A.field_Q) {
                      break L5;
                    } else {
                      this.field_L = this.field_L + this.field_A.field_Q.field_L * 0.01;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (this.field_Pb == null) {
                    this.b((byte) 108, param0);
                    break L6;
                  } else {
                    L7: {
                      var3 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
                      var5 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
                      var7 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
                      var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                      if (var9 >= 0.01) {
                        stackIn_21_0 = 2.0 / var9;
                        break L7;
                      } else {
                        stackIn_21_0 = 200.0;
                        break L7;
                      }
                    }
                    L8: {
                      var9 = stackIn_21_0;
                      var9 = var9 * (this.field_C + this.field_Pb.field_C);
                      var7 = var7 * var9;
                      var3 = var3 * var9;
                      var5 = var5 * var9;
                      var11 = this.field_Pb.field_E + var3;
                      var13 = var5 + this.field_Pb.field_t;
                      var15 = var7 + this.field_Pb.field_D;
                      var17 = this.field_Pb.field_K + (var11 - this.field_E) * 0.1;
                      var19 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13);
                      var17 = var17 - this.field_K;
                      var19 = var19 - this.field_G;
                      var21 = this.field_Pb.field_L + 0.1 * (var15 - this.field_D);
                      var21 = var21 - this.field_L;
                      var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                      if (var9 > 0.04) {
                        var9 = 0.04 / var9;
                        break L8;
                      } else {
                        var9 = 1.0;
                        break L8;
                      }
                    }
                    this.field_K = this.field_K + var9 * var17;
                    this.field_G = this.field_G + var9 * var19;
                    this.field_L = this.field_L + var9 * var21;
                    break L6;
                  }
                }
                L9: {
                  if (param1 >= 94) {
                    break L9;
                  } else {
                    this.j(-120);
                    break L9;
                  }
                }
                return;
              }
            }
          }
          L10: {
            if (null != this.field_Tb) {
              L11: {
                var3 = this.field_Tb.field_D + (double)this.field_Gb * (this.field_Tb.field_C + this.field_C) * 0.2;
                var5 = 0.1 * (var3 - this.field_D) + this.field_Tb.field_L;
                var5 = var5 - this.field_L;
                stackIn_36_0 = this;

                stackIn_36_1 = this.field_L;

                if (0.04 < var5) {
                  stackIn_37_0 = this;
                  stackIn_37_1 = stackIn_36_1;
                  stackIn_37_2 = 0.04;
                  break L11;
                } else {
                  stackIn_35_0 = this;

                  if (var5 < -0.04) {
                    stackIn_37_0 = this;
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = -0.04;
                    break L11;
                  } else {
                    stackIn_37_0 = this;
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = var5;
                    break L11;
                  }
                }
              }
              ((rd) (this)).field_L = stackIn_37_1 + stackIn_37_2;
              break L10;
            } else {
              break L10;
            }
          }
          if (this.field_Rb) {
            if (null != this.field_A.field_Q) {
              this.field_L = this.field_L + this.field_A.field_Q.field_L * 0.01;
              if (this.field_Pb == null) {
                this.b((byte) 108, param0);
                if (param1 >= 94) {
                  return;
                } else {
                  this.j(-120);
                  return;
                }
              } else {
                L12: {
                  var3 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
                  var5 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
                  var7 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
                  var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                  if (var9 >= 0.01) {
                    stackIn_73_0 = 2.0 / var9;
                    break L12;
                  } else {
                    stackIn_73_0 = 200.0;
                    break L12;
                  }
                }
                L13: {
                  var9 = stackIn_73_0;
                  var9 = var9 * (this.field_C + this.field_Pb.field_C);
                  var7 = var7 * var9;
                  var3 = var3 * var9;
                  var5 = var5 * var9;
                  var11 = this.field_Pb.field_E + var3;
                  var13 = var5 + this.field_Pb.field_t;
                  var15 = var7 + this.field_Pb.field_D;
                  var17 = this.field_Pb.field_K + (var11 - this.field_E) * 0.1;
                  var19 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13);
                  var17 = var17 - this.field_K;
                  var19 = var19 - this.field_G;
                  var21 = this.field_Pb.field_L + 0.1 * (var15 - this.field_D);
                  var21 = var21 - this.field_L;
                  var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                  if (var9 > 0.04) {
                    var9 = 0.04 / var9;
                    break L13;
                  } else {
                    var9 = 1.0;
                    break L13;
                  }
                }
                this.field_K = this.field_K + var9 * var17;
                this.field_G = this.field_G + var9 * var19;
                this.field_L = this.field_L + var9 * var21;
                if (param1 < 94) {
                  this.j(-120);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (this.field_Pb != null) {
                L14: {
                  var3 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
                  var5 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
                  var7 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
                  var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                  if (var9 >= 0.01) {
                    stackIn_62_0 = 2.0 / var9;
                    break L14;
                  } else {
                    stackIn_62_0 = 200.0;
                    break L14;
                  }
                }
                L15: {
                  var9 = stackIn_62_0;
                  var9 = var9 * (this.field_C + this.field_Pb.field_C);
                  var7 = var7 * var9;
                  var3 = var3 * var9;
                  var5 = var5 * var9;
                  var11 = this.field_Pb.field_E + var3;
                  var13 = var5 + this.field_Pb.field_t;
                  var15 = var7 + this.field_Pb.field_D;
                  var17 = this.field_Pb.field_K + (var11 - this.field_E) * 0.1;
                  var19 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13);
                  var17 = var17 - this.field_K;
                  var19 = var19 - this.field_G;
                  var21 = this.field_Pb.field_L + 0.1 * (var15 - this.field_D);
                  var21 = var21 - this.field_L;
                  var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                  if (var9 > 0.04) {
                    var9 = 0.04 / var9;
                    break L15;
                  } else {
                    var9 = 1.0;
                    break L15;
                  }
                }
                L16: {
                  this.field_K = this.field_K + var9 * var17;
                  this.field_G = this.field_G + var9 * var19;
                  this.field_L = this.field_L + var9 * var21;
                  if (param1 >= 94) {
                    break L16;
                  } else {
                    this.j(-120);
                    break L16;
                  }
                }
                return;
              } else {
                L17: {
                  this.b((byte) 108, param0);
                  if (param1 >= 94) {
                    break L17;
                  } else {
                    this.j(-120);
                    break L17;
                  }
                }
                return;
              }
            }
          } else {
            if (this.field_Pb == null) {
              L18: {
                this.b((byte) 108, param0);
                if (param1 >= 94) {
                  break L18;
                } else {
                  this.j(-120);
                  break L18;
                }
              }
              return;
            } else {
              L19: {
                var3 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
                var5 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
                var7 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
                var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                if (var9 >= 0.01) {
                  stackIn_43_0 = 2.0 / var9;
                  break L19;
                } else {
                  stackIn_43_0 = 200.0;
                  break L19;
                }
              }
              L20: {
                var9 = stackIn_43_0;
                var9 = var9 * (this.field_C + this.field_Pb.field_C);
                var7 = var7 * var9;
                var3 = var3 * var9;
                var5 = var5 * var9;
                var11 = this.field_Pb.field_E + var3;
                var13 = var5 + this.field_Pb.field_t;
                var15 = var7 + this.field_Pb.field_D;
                var17 = this.field_Pb.field_K + (var11 - this.field_E) * 0.1;
                var19 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13);
                var17 = var17 - this.field_K;
                var19 = var19 - this.field_G;
                var21 = this.field_Pb.field_L + 0.1 * (var15 - this.field_D);
                var21 = var21 - this.field_L;
                var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                if (var9 > 0.04) {
                  var9 = 0.04 / var9;
                  break L20;
                } else {
                  var9 = 1.0;
                  break L20;
                }
              }
              this.field_K = this.field_K + var9 * var17;
              this.field_G = this.field_G + var9 * var19;
              this.field_L = this.field_L + var9 * var21;
              if (param1 < 94) {
                this.j(-120);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (this.field_Ob) {
          if (-1 != (this.field_fb.field_d ^ -1)) {
            super.a(param0, param1);
            return;
          } else {
            this.field_S = true;
            super.a(param0, param1);
            return;
          }
        } else {
          super.a(param0, param1);
          return;
        }
    }

    static {
        field_Nb = -1;
        field_Ib = "<col=FFFFFF>Extra life:</col> gives you another chance if you die! Always look out for these, as you can stockpile as many as you want, and you may need them later in the game. You start with two.";
    }
}
