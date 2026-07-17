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
        int var6 = 0;
        L0: {
          if (param1 >= 2 + param2) {
            var6 = param2 + param1 >> 1;
            ((hm) this).field_jb[var6] = 0.5 * (((hm) this).field_jb[param2] + ((hm) this).field_jb[param1]) + (-0.5 + Math.random()) * param3;
            ((hm) this).field_ob[var6] = 0.5 * (((hm) this).field_ob[param2] + ((hm) this).field_ob[param1]) + (Math.random() - 0.5) * param3;
            param3 = param3 * 0.5;
            this.a(param0, var6, param2, param3);
            this.a(1440745296, param1, var6, param3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1440745296) {
          return;
        } else {
          boolean discarded$2 = ((hm) this).a((hm[]) null, false, -0.7761785437438811);
          return;
        }
    }

    final void c(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        double[] var9 = null;
        double[] var10 = null;
        double[] var11 = null;
        int var12 = 0;
        L0: {
          var2 = -((hm) this).field_bb + ((hm) this).field_Y;
          var4 = -((hm) this).field_ab + ((hm) this).field_D;
          var6 = ((hm) this).field_A - ((hm) this).field_C;
          ((hm) this).field_ub = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
          var8 = an.a(-484803804, (int)(((hm) this).field_ub * 10.0));
          if (1 <= var8) {
            break L0;
          } else {
            var8 = 1;
            break L0;
          }
        }
        ((hm) this).field_tb = var8;
        if (null != ((hm) this).field_jb) {
          if (((hm) this).field_jb.length < 1 + var8) {
            ((hm) this).field_ob = new double[1 + var8];
            ((hm) this).field_jb = new double[var8 - -1];
            var9 = ((hm) this).field_jb;
            var10 = ((hm) this).field_ob;
            var11 = ((hm) this).field_jb;
            var12 = var8;
            ((hm) this).field_ob[var8] = 0.0;
            var11[var12] = 0.0;
            var10[0] = 0.0;
            var9[0] = 0.0;
            this.a(param0 + 1440747000, var8, 0, 0.1 * ((hm) this).field_ub);
            ((hm) this).field_kb = ((hm) this).field_Y;
            ((hm) this).field_hb = ((hm) this).field_D;
            ((hm) this).field_lb = ((hm) this).field_ab;
            ((hm) this).field_sb = ((hm) this).field_bb;
            ((hm) this).field_ab = ((hm) this).field_lb + ((hm) this).field_ob[1] * (double)var8;
            ((hm) this).field_bb = ((hm) this).field_jb[1] * (double)var8 + ((hm) this).field_sb;
            super.c(param0);
            ((hm) this).field_fb = 0;
            return;
          } else {
            var9 = ((hm) this).field_jb;
            var10 = ((hm) this).field_ob;
            var11 = ((hm) this).field_jb;
            var12 = var8;
            ((hm) this).field_ob[var8] = 0.0;
            var11[var12] = 0.0;
            var10[0] = 0.0;
            var9[0] = 0.0;
            this.a(param0 + 1440747000, var8, 0, 0.1 * ((hm) this).field_ub);
            ((hm) this).field_kb = ((hm) this).field_Y;
            ((hm) this).field_hb = ((hm) this).field_D;
            ((hm) this).field_lb = ((hm) this).field_ab;
            ((hm) this).field_sb = ((hm) this).field_bb;
            ((hm) this).field_ab = ((hm) this).field_lb + ((hm) this).field_ob[1] * (double)var8;
            ((hm) this).field_bb = ((hm) this).field_jb[1] * (double)var8 + ((hm) this).field_sb;
            super.c(param0);
            ((hm) this).field_fb = 0;
            return;
          }
        } else {
          ((hm) this).field_ob = new double[1 + var8];
          ((hm) this).field_jb = new double[var8 - -1];
          var9 = ((hm) this).field_jb;
          var10 = ((hm) this).field_ob;
          var11 = ((hm) this).field_jb;
          var12 = var8;
          ((hm) this).field_ob[var8] = 0.0;
          var11[var12] = 0.0;
          var10[0] = 0.0;
          var9[0] = 0.0;
          this.a(param0 + 1440747000, var8, 0, 0.1 * ((hm) this).field_ub);
          ((hm) this).field_kb = ((hm) this).field_Y;
          ((hm) this).field_hb = ((hm) this).field_D;
          ((hm) this).field_lb = ((hm) this).field_ab;
          ((hm) this).field_sb = ((hm) this).field_bb;
          ((hm) this).field_ab = ((hm) this).field_lb + ((hm) this).field_ob[1] * (double)var8;
          ((hm) this).field_bb = ((hm) this).field_jb[1] * (double)var8 + ((hm) this).field_sb;
          super.c(param0);
          ((hm) this).field_fb = 0;
          return;
        }
    }

    private final double a(pm param0, double param1, hm[] param2, byte param3) {
        RuntimeException var6 = null;
        double var6_double = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        int var15 = 0;
        double stackIn_4_0 = 0.0;
        double stackIn_16_0 = 0.0;
        double stackIn_20_0 = 0.0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_3_0 = 0.0;
        double stackOut_19_0 = 0.0;
        double stackOut_15_0 = 0.0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var15 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0.a(((hm) this).field_T, (byte) 72)) {
              stackOut_3_0 = param1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                L2: {
                  var6_double = param0.field_E - ((hm) this).field_T.field_E;
                  var8 = -((hm) this).field_T.field_t + param0.field_t;
                  var10 = param0.field_D - ((hm) this).field_T.field_D;
                  var12 = Math.sqrt(var10 * var10 + (var8 * var8 + var6_double * var6_double)) - param0.field_C - ((hm) this).field_T.field_C;
                  if (param2 == null) {
                    break L2;
                  } else {
                    var14 = 0;
                    L3: while (true) {
                      if ((Object) (Object) param2[var14] == this) {
                        break L2;
                      } else {
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (param0 != param2[var14].field_S) {
                              break L4;
                            } else {
                              var12 = var12 + 3.0;
                              break L4;
                            }
                          }
                          var14++;
                          if (var15 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                if (param1 > var12) {
                  ((hm) this).field_S = param0;
                  break L1;
                } else {
                  L5: {
                    if (param3 == 119) {
                      break L5;
                    } else {
                      field_W = null;
                      break L5;
                    }
                  }
                  stackOut_19_0 = param1;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                }
              }
              stackOut_15_0 = var12;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("hm.P(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = Confined.field_J ? 1 : 0;
          var5 = param1 * ((hm) this).field_tb >> 16;
          var6 = ((hm) this).field_tb * param3 >> 16;
          if (((hm) this).field_tb > var6) {
            break L0;
          } else {
            var6 = -1 + ((hm) this).field_tb;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 > var5) {
            var5++;
            var7 = (var5 << 16) / ((hm) this).field_tb;
            var8 = super.a(var7, (byte) -63);
            super.a(param0, ((hm) this).field_fb, -14936, var8);
            var9 = -((hm) this).field_jb[var5] + ((hm) this).field_jb[1 + var5];
            var11 = -((hm) this).field_ob[var5] + ((hm) this).field_ob[var5 - -1];
            ((hm) this).field_Y = -((double)var5 * var9) + (((hm) this).field_jb[var5] + ((hm) this).field_kb);
            var13 = ((hm) this).field_tb - var5;
            ((hm) this).field_D = -(var11 * (double)var5) + (((hm) this).field_hb + ((hm) this).field_ob[var5]);
            ((hm) this).field_bb = ((hm) this).field_jb[var5] + ((hm) this).field_sb + (double)var13 * var9;
            ((hm) this).field_ab = ((hm) this).field_ob[var5] + ((hm) this).field_lb + (double)var13 * var11;
            super.c(-1704);
            ((hm) this).field_fb = super.a(var7, (byte) -63);
            if (var14 == 0) {
              continue L1;
            } else {
              return;
            }
          } else {
            var7 = super.a(param3, (byte) -63);
            super.a(param0, ((hm) this).field_fb, param2, var7);
            ((hm) this).field_fb = var7;
            return;
          }
        }
    }

    final boolean a(hm[] param0, boolean param1, double param2) {
        RuntimeException var5 = null;
        vb var5_ref = null;
        pm var6 = null;
        pm var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        pm stackIn_28_0 = null;
        Object stackIn_28_1 = null;
        pm stackIn_29_0 = null;
        Object stackIn_29_1 = null;
        pm stackIn_30_0 = null;
        Object stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_21_0 = false;
        int stackOut_18_0 = 0;
        pm stackOut_27_0 = null;
        Object stackOut_27_1 = null;
        pm stackOut_29_0 = null;
        Object stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        pm stackOut_28_0 = null;
        Object stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var16 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((hm) this).field_S = null;
              var5_ref = ((hm) this).field_T.field_A.field_N;
              rk discarded$4 = var5_ref.a((rk) (Object) ((hm) this).field_T, 0);
              var6 = (pm) (Object) var5_ref.a(0);
              rk discarded$5 = var5_ref.b((rk) (Object) ((hm) this).field_T, 6);
              var7 = (pm) (Object) var5_ref.b(52);
              if (var6 == null) {
                break L1;
              } else {
                if (-var6.field_C + (-((hm) this).field_T.field_C + (((hm) this).field_T.field_D - var6.field_D)) > param2) {
                  var6 = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                if (-var7.field_C + (var7.field_D - ((hm) this).field_T.field_D - ((hm) this).field_T.field_C) <= param2) {
                  break L2;
                } else {
                  var7 = null;
                  break L2;
                }
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (var6 != null) {
                    break L5;
                  } else {
                    if (var7 == null) {
                      stackOut_21_0 = param1;
                      stackIn_22_0 = stackOut_21_0 ? 1 : 0;
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var6 == null) {
                    break L6;
                  } else {
                    L7: {
                      if (var7 == null) {
                        break L7;
                      } else {
                        if (-((hm) this).field_T.field_D + (-var7.field_C + var7.field_D) <= -var6.field_C + (((hm) this).field_T.field_D - var6.field_D)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    param2 = this.a(var6, param2, param0, (byte) 119);
                    rk discarded$6 = var5_ref.a((rk) (Object) var6, 0);
                    var6 = (pm) (Object) var5_ref.a(0);
                    if (var6 == null) {
                      continue L3;
                    } else {
                      if (param2 >= -((hm) this).field_T.field_C + (-var6.field_D + ((hm) this).field_T.field_D) - var6.field_C) {
                        continue L3;
                      } else {
                        var6 = null;
                        continue L3;
                      }
                    }
                  }
                }
                param2 = this.a(var7, param2, param0, (byte) 119);
                rk discarded$7 = var5_ref.b((rk) (Object) var7, 6);
                var7 = (pm) (Object) var5_ref.b(-125);
                if (var7 == null) {
                  continue L3;
                } else {
                  stackOut_18_0 = (param2 < -var7.field_C + (var7.field_D - ((hm) this).field_T.field_D - ((hm) this).field_T.field_C) ? -1 : (param2 == -var7.field_C + (var7.field_D - ((hm) this).field_T.field_D - ((hm) this).field_T.field_C) ? 0 : 1));
                  stackIn_22_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var16 != 0) {
                    break L4;
                  } else {
                    if (stackIn_19_0 >= 0) {
                      continue L3;
                    } else {
                      var7 = null;
                      continue L3;
                    }
                  }
                }
              }
              L8: {
                if (stackIn_22_0 == 0) {
                  break L8;
                } else {
                  ((hm) this).a(-101, -5, -107, -126);
                  break L8;
                }
              }
              if (((hm) this).field_S != null) {
                L9: {
                  stackOut_27_0 = ((hm) this).field_S;
                  stackOut_27_1 = this;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (param1) {
                    stackOut_29_0 = (pm) (Object) stackIn_29_0;
                    stackOut_29_1 = this;
                    stackOut_29_2 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    break L9;
                  } else {
                    stackOut_28_0 = (pm) (Object) stackIn_28_0;
                    stackOut_28_1 = this;
                    stackOut_28_2 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    break L9;
                  }
                }
                ((pm) (Object) stackIn_30_0).a((hm) this, stackIn_30_2 != 0);
                var8 = ((hm) this).field_S.field_E - ((hm) this).field_T.field_E;
                var10 = ((hm) this).field_S.field_t - ((hm) this).field_T.field_t;
                var12 = -((hm) this).field_T.field_D + ((hm) this).field_S.field_D;
                var14 = Math.sqrt(var10 * var10 + var8 * var8 + var12 * var12);
                if (0.01 > var14) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  return stackIn_33_0 != 0;
                } else {
                  var10 = var10 / var14;
                  var12 = var12 / var14;
                  var8 = var8 / var14;
                  ((hm) this).field_cb = ((hm) this).field_T.field_E + ((hm) this).field_T.field_C * var8;
                  ((hm) this).field_L = var10 * ((hm) this).field_T.field_C + ((hm) this).field_T.field_t;
                  ((hm) this).field_X = var12 * ((hm) this).field_T.field_C + ((hm) this).field_T.field_D;
                  ((hm) this).field_x = var8;
                  ((hm) this).field_y = -((hm) this).field_S.field_C + var14 - ((hm) this).field_T.field_C;
                  ((hm) this).field_P = var10;
                  ((hm) this).field_K = var12;
                  ((hm) this).field_s = var10 * ((hm) this).field_y + ((hm) this).field_L;
                  ((hm) this).field_eb = var12 * ((hm) this).field_y + ((hm) this).field_X;
                  ((hm) this).field_R = ((hm) this).field_y * var8 + ((hm) this).field_cb;
                  stackOut_34_0 = 1;
                  stackIn_35_0 = stackOut_34_0;
                  break L0;
                }
              } else {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                return stackIn_26_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("hm.Q(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_35_0 != 0;
    }

    final int a(int param0, byte param1) {
        if (param1 != -63) {
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
          field_ib = null;
          return;
        }
    }

    final double a(double param0, byte param1) {
        double var4 = 0.0;
        Object var6 = null;
        var4 = (-param0 + 1.0) * (0.4 * ((hm) this).field_ub * param0);
        if (param1 >= -2) {
          var6 = null;
          return var4 * (-0.5 + Math.random());
        } else {
          return var4 * (-0.5 + Math.random());
        }
    }

    final void a(int param0, int param1, double param2, double param3) {
        ((hm) this).field_u = param3;
        ((hm) this).field_H = param0;
        ((hm) this).field_B = param2;
        if (param1 == 0) {
            return;
        }
        ((hm) this).field_ob = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = "to keep fullscreen or";
        field_nb = 250;
        field_ib = "<col=FFFFFF>Shield:</col> depleted when you get hit. Recharges automatically over time, unless it runs out!";
        field_qb = 0;
        field_W = "Please wait...";
        field_rb = "<col=FFFFFF>Wing pods:</col> awarded every four levels, or if you've lost or missed one.";
    }
}
