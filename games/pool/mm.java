/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_o;
    double field_a;
    static vh field_g;
    double field_f;
    double field_d;
    static int field_i;
    static String field_l;
    static String field_e;
    double field_m;
    static String[] field_n;
    static dd field_c;
    double field_h;
    static int field_b;
    static dd field_j;
    double field_k;

    final void a(int[] param0, boolean param1) {
        double[] discarded$1 = null;
        RuntimeException var3 = null;
        double var4 = 0.0;
        double[] var6 = null;
        double[] var8 = null;
        double[] var9 = null;
        double[] var16 = null;
        double[] var17 = null;
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
        try {
          L0: {
            param0[0] = cr.a(4885, this.field_d);
            param0[1] = cr.a(4885, this.field_a);
            param0[2] = cr.a(4885, this.field_h);
            var8 = new double[]{-this.field_d + this.field_f, this.field_m - this.field_a, -this.field_h + this.field_k};
            var4 = Math.atan2(Math.sqrt(var8[1] * var8[1] + var8[0] * var8[0]), var8[2]);
            if (param1) {
              L1: {
                discarded$1 = n.a(-126, var8);
                var9 = new double[]{-this.field_f + this.field_d, -this.field_m + this.field_a, 0.0};
                var6 = var9;
                if (var4 < 0.04908738521234052) {
                  var6[1] = 1.0;
                  var6[0] = 0.0;
                  break L1;
                } else {
                  if (var4 >= 0.7853981633974483) {
                    break L1;
                  } else {
                    var4 = (-Math.cos((var4 - 0.04908738521234052) * 3.141592653589793 / 0.7363107781851077) + 1.0) / 2.0;
                    var6[0] = var4 * var9[0];
                    var6[1] = 1.0 - var4 + var9[1] * var4;
                    break L1;
                  }
                }
              }
              var16 = n.a(-128, lf.a(2, var8, var9));
              var17 = n.a(-126, lf.a(2, var16, var8));
              param0[3] = mf.a(16, var16[0]);
              param0[4] = mf.a(16, var16[1]);
              param0[5] = mf.a(16, var16[2]);
              param0[6] = mf.a(16, var17[0]);
              param0[7] = mf.a(16, var17[1]);
              param0[8] = mf.a(16, var17[2]);
              param0[9] = mf.a(16, var8[0]);
              param0[10] = mf.a(16, var8[1]);
              param0[11] = mf.a(16, var8[2]);
              decompiledRegionSelector0 = 1;
              break L0;
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
            stackOut_8_1 = new StringBuilder().append("mm.L(");
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_o = null;
        field_l = null;
        field_c = null;
        field_g = null;
        if (param0 != -13569) {
            field_b = -71;
        }
        field_n = null;
        field_e = null;
    }

    final void a(double param0, int param1, double param2) {
        this.b(param2, param0, this.d(8), -6861);
        if (param1 != 1) {
            this.field_d = -1.1479346614663757;
        }
    }

    final double a(boolean param0) {
        L0: {
          if (param0) {
            break L0;
          } else {
            this.b(-0.5323192695781033, 0.018279809852695228, -0.753102219435801, -80);
            break L0;
          }
        }
        L1: {
          if (0.0 != this.field_a - this.field_m) {
            break L1;
          } else {
            if (this.field_f == this.field_d) {
              return 1.5707963267948966;
            } else {
              break L1;
            }
          }
        }
        return Math.atan2(this.field_a - this.field_m, this.field_d - this.field_f);
    }

    final void c(byte param0) {
        kh.field_gc.a(false, (mm) (this));
        if (param0 != -40) {
            mm.c(26);
        }
    }

    final int b(int param0) {
        if (param0 > -126) {
            mm.c(46);
        }
        double var2 = this.a((byte) 103) - Math.atan(0.625);
        return (int)((-var2 + 1.5707963267948966) / (Math.atan(0.625) * 2.0) * 480.0);
    }

    private final void d(byte param0) {
        if (Double.isNaN(this.field_d)) {
            this.field_d = 0.0;
        }
        if (!(!Double.isNaN(this.field_a))) {
            this.field_a = 0.0;
        }
        if (param0 <= 81) {
            field_n = (String[]) null;
        }
        if (Double.isNaN(this.field_h)) {
            this.field_h = 0.0;
        }
        if (Double.isNaN(this.field_f)) {
            this.field_f = 0.0;
        }
        if (Double.isNaN(this.field_m)) {
            this.field_m = 0.0;
        }
        if (!(!Double.isNaN(this.field_k))) {
            this.field_k = 0.0;
        }
    }

    final double d(int param0) {
        double var2 = this.field_d - this.field_f;
        if (param0 != 8) {
            return 0.04953626904890074;
        }
        double var4 = this.field_a - this.field_m;
        double var6 = -this.field_k + this.field_h;
        return Math.sqrt(var6 * var6 + (var4 * var4 + var2 * var2));
    }

    final void a(int param0) {
        this.field_k = -8.0;
        this.field_m = 144.0;
        int var2 = 114 % ((param0 - -5) / 47);
        this.field_f = 288.0;
    }

    final void a(uf param0, int param1) {
        try {
            this.field_f = (double)pf.b(126, param0.field_I.field_l[0].field_g);
            if (param1 != 1) {
                field_j = (dd) null;
            }
            this.field_m = (double)pf.b(param1 ^ 126, param0.field_I.field_l[0].field_k);
            this.b(3.141592653589793 * (double)param0.field_G.field_h / 1024.0, 3.141592653589793 * (double)(param0.field_G.field_k - -32) / 1024.0, 192.0, -6861);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "mm.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final double a(byte param0) {
        double var2 = this.field_d - this.field_f;
        if (param0 <= 77) {
            return -2.6664810522364304;
        }
        double var4 = -this.field_m + this.field_a;
        double var6 = Math.sqrt(var2 * var2 + var4 * var4);
        return Math.atan2(var6, this.field_h - this.field_k);
    }

    final static ie a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ie var5 = null;
        ie stackIn_4_0 = null;
        ie stackIn_8_0 = null;
        ie stackIn_11_0 = null;
        ie stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ie stackOut_7_0 = null;
        ie stackOut_12_0 = null;
        ie stackOut_10_0 = null;
        ie stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() == 0) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if (param0 == var2_int) {
                    stackOut_7_0 = uj.field_e;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(var2_int - -1);
                    var5 = vl.a(7, var3);
                    if (var5 == null) {
                      stackOut_12_0 = jj.a(102, var4);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_10_0 = (ie) (var5);
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = hl.field_a;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("mm.R(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final void a(int param0, mm param1) {
        try {
            this.field_h = param1.field_h;
            if (param0 != 144) {
                field_n = (String[]) null;
            }
            this.field_f = param1.field_f;
            this.field_k = param1.field_k;
            this.field_m = param1.field_m;
            this.field_d = param1.field_d;
            this.field_a = param1.field_a;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "mm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(double[] param0, byte param1) {
        try {
            this.field_m = param0[4];
            this.field_a = param0[1];
            this.field_k = param0[5];
            this.field_d = param0[0];
            if (param1 > -33) {
                mm var4 = (mm) null;
                this.a(-110, (mm) null);
            }
            this.field_h = param0[2];
            this.field_f = param0[3];
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "mm.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, double param1) {
        double var4 = -this.field_f + this.field_d;
        double var6 = this.field_a - this.field_m;
        double var8 = -this.field_k + this.field_h;
        if (!param0) {
            return;
        }
        double var10 = Math.sqrt(var8 * var8 + (var6 * var6 + var4 * var4));
        this.field_d = this.field_f + param1 * var4 / var10;
        this.field_a = this.field_m + param1 * var6 / var10;
        this.field_h = this.field_k + var8 * param1 / var10;
        this.c((byte) -40);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        e.field_a.b(param2, 2147483647, param4, param3, param1);
        if (im.field_Ub != null) {
            im.field_Ub.a(param0, param6, -gj.field_G + param6, (byte) 127, param1, param1);
        }
        if (param5 < 69) {
            mm.c(49);
        }
    }

    private final void a(double param0, double param1, double param2, int param3) {
        if (param3 != 144) {
            return;
        }
        if (!(2.945243112740431 >= param1)) {
            param1 = 2.945243112740431;
        }
        if (1.6689710972195777 > param1) {
            param1 = 1.6689710972195777;
        }
        double var8 = Math.sin(param1) * -param2;
        this.field_d = this.field_f - Math.cos(param0) * var8;
        this.field_a = this.field_m - Math.sin(param0) * var8;
        this.field_h = this.field_k + Math.cos(param1) * param2;
    }

    final void b(double param0, double param1, double param2, int param3) {
        if (param3 != -6861) {
            field_c = (dd) null;
        }
        this.a(param0, param1, param2, 144);
        this.c((byte) -40);
    }

    final boolean a(mm param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        double var3_double = 0.0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              var5 = 0;
              if (this.field_d == param0.field_d) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var3_double = -this.field_d + param0.field_d;
                    if (0.5 <= var3_double) {
                      break L3;
                    } else {
                      if (var3_double <= -0.5) {
                        break L3;
                      } else {
                        this.field_d = param0.field_d;
                        break L2;
                      }
                    }
                  }
                  this.field_d = this.field_d + var3_double / 8.0;
                  break L2;
                }
                var5 = 1;
                break L1;
              }
            }
            L4: {
              if (param0.field_a == this.field_a) {
                break L4;
              } else {
                L5: {
                  var3_double = param0.field_a - this.field_a;
                  var5 = 1;
                  if (0.5 <= var3_double) {
                    break L5;
                  } else {
                    if (var3_double <= -0.5) {
                      break L5;
                    } else {
                      this.field_a = param0.field_a;
                      break L4;
                    }
                  }
                }
                this.field_a = this.field_a + var3_double / 8.0;
                break L4;
              }
            }
            L6: {
              if (this.field_h != param0.field_h) {
                L7: {
                  var3_double = param0.field_h - this.field_h;
                  var5 = 1;
                  if (var3_double >= 0.5) {
                    break L7;
                  } else {
                    if (-0.5 >= var3_double) {
                      break L7;
                    } else {
                      this.field_h = param0.field_h;
                      break L6;
                    }
                  }
                }
                this.field_h = this.field_h + var3_double / 8.0;
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (this.field_f != param0.field_f) {
                L9: {
                  var3_double = -this.field_f + param0.field_f;
                  var5 = 1;
                  if (0.5 <= var3_double) {
                    break L9;
                  } else {
                    if (-0.5 >= var3_double) {
                      break L9;
                    } else {
                      this.field_f = param0.field_f;
                      break L8;
                    }
                  }
                }
                this.field_f = this.field_f + var3_double / 8.0;
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              if (this.field_m != param0.field_m) {
                L11: {
                  L12: {
                    var3_double = -this.field_m + param0.field_m;
                    if (var3_double >= 0.5) {
                      break L12;
                    } else {
                      if (var3_double > -0.5) {
                        this.field_m = param0.field_m;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_m = this.field_m + var3_double / 8.0;
                  break L11;
                }
                var5 = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L13: {
              if (param1 == -78) {
                break L13;
              } else {
                discarded$1 = this.b(-34);
                break L13;
              }
            }
            L14: {
              if (param0.field_k != this.field_k) {
                L15: {
                  var3_double = -this.field_k + param0.field_k;
                  var5 = 1;
                  if (var3_double >= 0.5) {
                    break L15;
                  } else {
                    if (var3_double > -0.5) {
                      this.field_k = param0.field_k;
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                this.field_k = this.field_k + var3_double / 8.0;
                break L14;
              } else {
                break L14;
              }
            }
            this.d((byte) 108);
            this.c((byte) -40);
            stackOut_41_0 = var5;
            stackIn_42_0 = stackOut_41_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var3);
            stackOut_43_1 = new StringBuilder().append("mm.G(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L16;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L16;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        return stackIn_42_0 != 0;
    }

    final int a(int param0, double[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        double var4 = 0.0;
        int var6 = 0;
        double[] var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3_int = 0;
            var4 = -1.0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param1.length) {
                L2: {
                  if (param0 == -11024) {
                    break L2;
                  } else {
                    this.c((byte) -115);
                    break L2;
                  }
                }
                this.a(param1[var3_int], (byte) -86);
                stackOut_12_0 = var3_int;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  var7 = param1[var6];
                  var8 = -this.field_d + var7[0];
                  var10 = var7[1] - this.field_a;
                  var12 = -this.field_h + var7[2];
                  var14 = -this.field_f + this.field_d;
                  var16 = -this.field_m + this.field_a;
                  var18 = -this.field_k + this.field_h;
                  if (var8 * var14 + var10 * var16 + var12 * var18 >= 0.0) {
                    L4: {
                      var20 = var12 * var12 + (var10 * var10 + var8 * var8);
                      if (0.0 > var4) {
                        break L4;
                      } else {
                        if (var4 > var20) {
                          break L4;
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                    var3_int = var6;
                    var4 = var20;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("mm.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final void b(byte param0) {
        this.field_f = 288.0;
        this.field_m = 144.0;
        this.field_d = 288.0;
        this.field_h = -512.0;
        this.field_a = 144.0;
        this.field_k = -8.0;
        if (param0 != -24) {
            mm var3 = (mm) null;
            this.a(13, (mm) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, lr param4, int param5, int param6, int param7, int param8, int param9, nm param10, int param11, int param12, nm param13, lr param14, int param15, int param16, int param17, int param18, nm param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            qp.field_ec = param14;
            qa.field_t = param4;
            el.b(84, param1, param7, param6, param12);
            mp.a(param18, param0, param13, -92);
            if (param16 == 2) {
              ci.a(param17, 26790, param10, param3, param5, param19);
              w.a(param9, -17, param2);
              qo.a((byte) -82, param11, param8, param15);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var20);
            stackOut_4_1 = new StringBuilder().append("mm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param10 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param13 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param14 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param19 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    mm() {
        this.b((byte) -24);
    }

    static {
        field_e = "No players";
        field_l = "Game";
        field_o = "Loading music";
        field_n = new String[]{"By rating", "By win percentage"};
    }
}
