/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends dc {
    static String field_mb;
    private double field_lb;
    private int field_fb;
    static int field_nb;
    private double field_kb;
    private double field_hb;
    static int field_qb;
    private double[] field_jb;
    static bi field_pb;
    static String field_W;
    private double field_ub;
    static String field_gb;
    static String field_ib;
    private double[] field_ob;
    static String field_rb;
    private double field_sb;
    private int field_tb;

    private final void a(int param0, int param1, int param2, double param3) {
        int var6;
        L0: {
          if (param1 >= 2 + param2) {
            var6 = param2 + param1 >> -310752095;
            this.field_jb[var6] = 0.5 * (this.field_jb[param2] + this.field_jb[param1]) + (-0.5 + Math.random()) * param3;
            this.field_ob[var6] = 0.5 * (this.field_ob[param2] + this.field_ob[param1]) + (Math.random() - 0.5) * param3;
            param3 = param3 * 0.5;
            this.a(param0 + 0, var6, param2, param3);
            this.a(1440745296, param1, var6, param3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1440745296) {
          return;
        } else {
          this.a((hm[]) null, false, -0.7761785437438811);
          return;
        }
    }

    final void c(int param0) {
        double var2;
        double var4;
        double var6;
        int var8;
        double[] var9;
        double[] var10;
        double[] var11;
        int var12;
        L0: {
          var2 = -this.field_bb + this.field_Y;
          var4 = -this.field_ab + this.field_D;
          var6 = this.field_A - this.field_C;
          this.field_ub = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
          var8 = an.a(-484803804, (int)(this.field_ub * 10.0));
          if (1 <= var8) {
            break L0;
          } else {
            var8 = 1;
            break L0;
          }
        }
        this.field_tb = var8;
        if (null != this.field_jb) {
          if (this.field_jb.length < 1 + var8) {
            this.field_ob = new double[1 + var8];
            this.field_jb = new double[var8 - -1];
            var9 = this.field_jb;
            var10 = this.field_ob;
            var11 = this.field_jb;
            var12 = var8;
            this.field_ob[var8] = 0.0;
            var11[var12] = 0.0;
            var10[0] = 0.0;
            var9[0] = 0.0;
            this.a(param0 + 1440747000, var8, 0, 0.1 * this.field_ub);
            this.field_kb = this.field_Y;
            this.field_hb = this.field_D;
            this.field_lb = this.field_ab;
            this.field_sb = this.field_bb;
            this.field_ab = this.field_lb + this.field_ob[1] * (double)var8;
            this.field_bb = this.field_jb[1] * (double)var8 + this.field_sb;
            super.c(param0);
            this.field_fb = 0;
            return;
          } else {
            var9 = this.field_jb;
            var10 = this.field_ob;
            var11 = this.field_jb;
            var12 = var8;
            this.field_ob[var8] = 0.0;
            var11[var12] = 0.0;
            var10[0] = 0.0;
            var9[0] = 0.0;
            this.a(param0 + 1440747000, var8, 0, 0.1 * this.field_ub);
            this.field_kb = this.field_Y;
            this.field_hb = this.field_D;
            this.field_lb = this.field_ab;
            this.field_sb = this.field_bb;
            this.field_ab = this.field_lb + this.field_ob[1] * (double)var8;
            this.field_bb = this.field_jb[1] * (double)var8 + this.field_sb;
            super.c(param0);
            this.field_fb = 0;
            return;
          }
        } else {
          this.field_ob = new double[1 + var8];
          this.field_jb = new double[var8 - -1];
          var9 = this.field_jb;
          var10 = this.field_ob;
          var11 = this.field_jb;
          var12 = var8;
          this.field_ob[var8] = 0.0;
          var11[var12] = 0.0;
          var10[0] = 0.0;
          var9[0] = 0.0;
          this.a(param0 + 1440747000, var8, 0, 0.1 * this.field_ub);
          this.field_kb = this.field_Y;
          this.field_hb = this.field_D;
          this.field_lb = this.field_ab;
          this.field_sb = this.field_bb;
          this.field_ab = this.field_lb + this.field_ob[1] * (double)var8;
          this.field_bb = this.field_jb[1] * (double)var8 + this.field_sb;
          super.c(param0);
          this.field_fb = 0;
          return;
        }
    }

    private final double a(pm param0, double param1, hm[] param2, byte param3) {
        double stackIn_4_0 = 0.0;
        double stackIn_14_0 = 0.0;
        double stackIn_18_0 = 0.0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var6_double = 0.0;
        RuntimeException var6 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        int var15 = 0;
        var15 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0.a(this.field_T, (byte) 72)) {
              stackIn_4_0 = param1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var6_double = param0.field_E - this.field_T.field_E;
                var8 = -this.field_T.field_t + param0.field_t;
                var10 = param0.field_D - this.field_T.field_D;
                var12 = Math.sqrt(var10 * var10 + (var8 * var8 + var6_double * var6_double)) - param0.field_C - this.field_T.field_C;
                if (param2 == null) {
                  break L1;
                } else {
                  var14 = 0;
                  L2: while (true) {
                    if (param2[var14] == this) {
                      break L1;
                    } else {
                      L3: {
                        if (param0 != param2[var14].field_S) {
                          break L3;
                        } else {
                          var12 = var12 + 3.0;
                          break L3;
                        }
                      }
                      var14++;
                      continue L2;
                    }
                  }
                }
              }
              if (param1 > var12) {
                this.field_S = param0;
                stackIn_14_0 = var12;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (param3 == 119) {
                    break L4;
                  } else {
                    field_W = (String) null;
                    break L4;
                  }
                }
                stackIn_18_0 = param1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("hm.P(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var7 = 0;
        int var14 = Confined.field_J ? 1 : 0;
        int var5 = param1 * this.field_tb >> 1440745296;
        int var6 = this.field_tb * param3 >> -1704730736;
        if (this.field_tb <= var6) {
            var6 = -1 + this.field_tb;
        }
        while (var6 > var5) {
            var5++;
            var7 = (var5 << 22062608) / this.field_tb;
            var8 = super.a(var7, (byte) -63);
            super.a(param0, this.field_fb, -14936, var8);
            var9 = -this.field_jb[var5] + this.field_jb[1 + var5];
            var11 = -this.field_ob[var5] + this.field_ob[var5 - -1];
            this.field_Y = -((double)var5 * var9) + (this.field_jb[var5] + this.field_kb);
            var13 = this.field_tb - var5;
            this.field_D = -(var11 * (double)var5) + (this.field_hb + this.field_ob[var5]);
            this.field_bb = this.field_jb[var5] + this.field_sb + (double)var13 * var9;
            this.field_ab = this.field_ob[var5] + this.field_lb + (double)var13 * var11;
            super.c(-1704);
            this.field_fb = super.a(var7, (byte) -63);
        }
        var7 = super.a(param3, (byte) -63);
        super.a(param0, this.field_fb, param2, var7);
        this.field_fb = var7;
    }

    final boolean a(hm[] param0, boolean param1, double param2) {
        int stackIn_24_0 = 0;
        pm stackIn_27_0 = null;
        Object stackIn_27_1 = null;
        pm stackIn_28_0 = null;
        Object stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        Object var6 = null;
        Object var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        vb var17 = null;
        Object var18 = null;
        pm var18_ref = null;
        Object var19 = null;
        pm var19_ref = null;
        Object var20 = null;
        pm var20_ref = null;
        Object var21 = null;
        pm var21_ref = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var16 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_S = null;
              var17 = this.field_T.field_A.field_N;
              var17.a(this.field_T, 0);
              var18_ref = (pm) ((Object) var17.a(0));
              var6 = var18_ref;
              var17.b(this.field_T, 6);
              var19_ref = (pm) ((Object) var17.b(52));
              var7 = var19_ref;
              if (var18_ref == null) {
                break L1;
              } else {
                if (-var18_ref.field_C + (-this.field_T.field_C + (this.field_T.field_D - var18_ref.field_D)) > param2) {
                  var6 = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var19_ref == null) {
                break L2;
              } else {
                if (-var19_ref.field_C + (var19_ref.field_D - this.field_T.field_D - this.field_T.field_C) <= param2) {
                  break L2;
                } else {
                  var7 = null;
                  break L2;
                }
              }
            }
            L3: while (true) {
              L4: {
                if (var6 != null) {
                  break L4;
                } else {
                  if (var7 == null) {
                    L5: {
                      if (!param1) {
                        break L5;
                      } else {
                        this.a(-101, -5, -107, -126);
                        break L5;
                      }
                    }
                    if (this.field_S != null) {
                      L6: {
                        stackIn_27_0 = this.field_S;

                        stackIn_27_1 = this;

                        if (param1) {
                          stackIn_28_0 = (pm) ((Object) stackIn_27_0);
                          stackIn_28_1 = this;
                          stackIn_28_2 = 0;
                          break L6;
                        } else {
                          stackIn_28_0 = (pm) ((Object) stackIn_27_0);
                          stackIn_28_1 = this;
                          stackIn_28_2 = 1;
                          break L6;
                        }
                      }
                      ((pm) (Object) stackIn_28_0).a((hm) (this), stackIn_28_2 != 0);
                      var8 = this.field_S.field_E - this.field_T.field_E;
                      var10 = this.field_S.field_t - this.field_T.field_t;
                      var12 = -this.field_T.field_D + this.field_S.field_D;
                      var14 = Math.sqrt(var10 * var10 + var8 * var8 + var12 * var12);
                      if (0.01 > var14) {
                        stackIn_31_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var10 = var10 / var14;
                        var12 = var12 / var14;
                        var8 = var8 / var14;
                        this.field_cb = this.field_T.field_E + this.field_T.field_C * var8;
                        this.field_L = var10 * this.field_T.field_C + this.field_T.field_t;
                        this.field_X = var12 * this.field_T.field_C + this.field_T.field_D;
                        this.field_x = var8;
                        this.field_y = -this.field_S.field_C + var14 - this.field_T.field_C;
                        this.field_P = var10;
                        this.field_K = var12;
                        this.field_s = var10 * this.field_y + this.field_L;
                        this.field_eb = var12 * this.field_y + this.field_X;
                        this.field_R = this.field_y * var8 + this.field_cb;
                        stackIn_33_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      stackIn_24_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (var6 == null) {
                  break L7;
                } else {
                  L8: {
                    if (var7 == null) {
                      break L8;
                    } else {
                      if (-this.field_T.field_D + (-((pm) (var7)).field_C + ((pm) (var7)).field_D) <= -((pm) (var6)).field_C + (this.field_T.field_D - ((pm) (var6)).field_D)) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param2 = this.a((pm) (var6), param2, param0, (byte) 119);
                  var17.a((rk) (var6), 0);
                  var20_ref = (pm) ((Object) var17.a(0));
                  if (var20_ref == null) {
                    continue L3;
                  } else {
                    if (param2 >= -this.field_T.field_C + (-var20_ref.field_D + this.field_T.field_D) - var20_ref.field_C) {
                      continue L3;
                    } else {
                      var6 = null;
                      continue L3;
                    }
                  }
                }
              }
              param2 = this.a((pm) (var7), param2, param0, (byte) 119);
              var17.b((rk) (var7), 6);
              var21_ref = (pm) ((Object) var17.b(-125));
              if (var21_ref == null) {
                continue L3;
              } else {
                if (param2 >= -var21_ref.field_C + (var21_ref.field_D - this.field_T.field_D - this.field_T.field_C)) {
                  continue L3;
                } else {
                  var7 = null;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var5);

            stackIn_36_1 = new StringBuilder().append("hm.Q(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            return stackIn_33_0 != 0;
          }
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -63) {
            this.a(2.0157586964429397, (byte) -23);
            return param0;
        }
        return param0;
    }

    public static void d(boolean param0) {
        field_ib = null;
        field_gb = null;
        field_mb = null;
        field_pb = null;
        field_W = null;
        field_rb = null;
        if (param0) {
          return;
        } else {
          field_ib = (String) null;
          return;
        }
    }

    final double a(double param0, byte param1) {
        double var4;
        hm[] var6;
        var4 = (-param0 + 1.0) * (0.4 * this.field_ub * param0);
        if (param1 >= -2) {
          var6 = (hm[]) null;
          return var4 * (-0.5 + Math.random());
        } else {
          return var4 * (-0.5 + Math.random());
        }
    }

    final void a(int param0, int param1, double param2, double param3) {
        this.field_u = param3;
        this.field_H = param0;
        this.field_B = param2;
        if (param1 == 0) {
            return;
        }
        this.field_ob = (double[]) null;
    }

    final static boolean f(byte param0) {
        if (param0 >= 3) {
          if (null != ie.field_b) {
            if (ie.field_b.h(0) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_qb = -48;
          if (null != ie.field_b) {
            if (ie.field_b.h(0) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    hm(pm param0, bi param1) {
        super(param0, param1, 0);
    }

    static {
        field_mb = "to keep fullscreen or";
        field_nb = 250;
        field_ib = "<col=FFFFFF>Shield:</col> depleted when you get hit. Recharges automatically over time, unless it runs out!";
        field_qb = 0;
        field_W = "Please wait...";
        field_rb = "<col=FFFFFF>Wing pods:</col> awarded every four levels, or if you've lost or missed one.";
    }
}
