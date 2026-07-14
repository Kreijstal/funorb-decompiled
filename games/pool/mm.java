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
        double var4 = 0.0;
        double[] var6 = null;
        double[] var8 = null;
        double[] var9 = null;
        double[] var16 = null;
        double[] var17 = null;
        param0[0] = cr.a(4885, ((mm) this).field_d);
        param0[1] = cr.a(4885, ((mm) this).field_a);
        param0[2] = cr.a(4885, ((mm) this).field_h);
        var8 = new double[]{-((mm) this).field_d + ((mm) this).field_f, ((mm) this).field_m - ((mm) this).field_a, -((mm) this).field_h + ((mm) this).field_k};
        var4 = Math.atan2(Math.sqrt(var8[1] * var8[1] + var8[0] * var8[0]), var8[2]);
        if (param1) {
          L0: {
            double[] discarded$1 = n.a(-126, var8);
            var9 = new double[]{-((mm) this).field_f + ((mm) this).field_d, -((mm) this).field_m + ((mm) this).field_a, 0.0};
            var6 = var9;
            if (var4 < 0.04908738521234052) {
              var6[1] = 1.0;
              var6[0] = 0.0;
              break L0;
            } else {
              if (var4 >= 0.7853981633974483) {
                break L0;
              } else {
                var4 = (-Math.cos((var4 - 0.04908738521234052) * 3.141592653589793 / 0.7363107781851077) + 1.0) / 2.0;
                var6[0] = var4 * var9[0];
                var6[1] = 1.0 - var4 + var9[1] * var4;
                break L0;
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
        ((mm) this).b(param2, param0, ((mm) this).d(8), -6861);
        if (param1 != 1) {
            ((mm) this).field_d = -1.1479346614663757;
        }
    }

    final double a(boolean param0) {
        L0: {
          if (param0) {
            break L0;
          } else {
            ((mm) this).b(-0.5323192695781033, 0.018279809852695228, -0.753102219435801, -80);
            break L0;
          }
        }
        L1: {
          if (0.0 != ((mm) this).field_a - ((mm) this).field_m) {
            break L1;
          } else {
            if (((mm) this).field_f == ((mm) this).field_d) {
              return 1.5707963267948966;
            } else {
              break L1;
            }
          }
        }
        return Math.atan2(((mm) this).field_a - ((mm) this).field_m, ((mm) this).field_d - ((mm) this).field_f);
    }

    final void c(byte param0) {
        kh.field_gc.a(false, (mm) this);
        if (param0 != -40) {
            mm.c(26);
        }
    }

    final int b(int param0) {
        if (param0 > -126) {
            mm.c(46);
        }
        double var2 = ((mm) this).a((byte) 103) - Math.atan(0.625);
        return (int)((-var2 + 1.5707963267948966) / (Math.atan(0.625) * 2.0) * 480.0);
    }

    private final void d(byte param0) {
        if (Double.isNaN(((mm) this).field_d)) {
            ((mm) this).field_d = 0.0;
        }
        if (!(!Double.isNaN(((mm) this).field_a))) {
            ((mm) this).field_a = 0.0;
        }
        if (param0 <= 81) {
            field_n = null;
        }
        if (Double.isNaN(((mm) this).field_h)) {
            ((mm) this).field_h = 0.0;
        }
        if (Double.isNaN(((mm) this).field_f)) {
            ((mm) this).field_f = 0.0;
        }
        if (Double.isNaN(((mm) this).field_m)) {
            ((mm) this).field_m = 0.0;
        }
        if (!(!Double.isNaN(((mm) this).field_k))) {
            ((mm) this).field_k = 0.0;
        }
    }

    final double d(int param0) {
        double var2 = ((mm) this).field_d - ((mm) this).field_f;
        if (param0 != 8) {
            return 0.04953626904890074;
        }
        double var4 = ((mm) this).field_a - ((mm) this).field_m;
        double var6 = -((mm) this).field_k + ((mm) this).field_h;
        return Math.sqrt(var6 * var6 + (var4 * var4 + var2 * var2));
    }

    final void a(int param0) {
        ((mm) this).field_k = -8.0;
        ((mm) this).field_m = 144.0;
        int var2 = 114 % ((param0 - -5) / 47);
        ((mm) this).field_f = 288.0;
    }

    final void a(uf param0, int param1) {
        ((mm) this).field_f = (double)pf.b(126, param0.field_I.field_l[0].field_g);
        if (param1 != 1) {
            field_j = null;
        }
        ((mm) this).field_m = (double)pf.b(param1 ^ 126, param0.field_I.field_l[0].field_k);
        ((mm) this).b(3.141592653589793 * (double)param0.field_G.field_h / 1024.0, 3.141592653589793 * (double)(param0.field_G.field_k - -32) / 1024.0, 192.0, -6861);
    }

    final double a(byte param0) {
        double var2 = ((mm) this).field_d - ((mm) this).field_f;
        if (param0 <= 77) {
            return -2.6664810522364304;
        }
        double var4 = -((mm) this).field_m + ((mm) this).field_a;
        double var6 = Math.sqrt(var2 * var2 + var4 * var4);
        return Math.atan2(var6, ((mm) this).field_h - ((mm) this).field_k);
    }

    final static ie a(int param0, String param1) {
        if (param1 != null) {
            // ifeq L14
        } else {
            return hl.field_a;
        }
        int var2 = param1.indexOf('@');
        if (!(param0 != var2)) {
            return uj.field_e;
        }
        String var3 = param1.substring(0, var2);
        String var4 = param1.substring(var2 - -1);
        ie var5 = vl.a(7, var3);
        if (var5 != null) {
            return var5;
        }
        return jj.a(102, var4);
    }

    final void a(int param0, mm param1) {
        ((mm) this).field_h = param1.field_h;
        if (param0 != 144) {
            field_n = null;
        }
        ((mm) this).field_f = param1.field_f;
        ((mm) this).field_k = param1.field_k;
        ((mm) this).field_m = param1.field_m;
        ((mm) this).field_d = param1.field_d;
        ((mm) this).field_a = param1.field_a;
    }

    final void a(double[] param0, byte param1) {
        ((mm) this).field_m = param0[4];
        ((mm) this).field_a = param0[1];
        ((mm) this).field_k = param0[5];
        ((mm) this).field_d = param0[0];
        if (param1 > -33) {
            Object var4 = null;
            ((mm) this).a(-110, (mm) null);
        }
        ((mm) this).field_h = param0[2];
        ((mm) this).field_f = param0[3];
    }

    final void a(boolean param0, double param1) {
        double var4 = -((mm) this).field_f + ((mm) this).field_d;
        double var6 = ((mm) this).field_a - ((mm) this).field_m;
        double var8 = -((mm) this).field_k + ((mm) this).field_h;
        if (!param0) {
            return;
        }
        double var10 = Math.sqrt(var8 * var8 + (var6 * var6 + var4 * var4));
        ((mm) this).field_d = ((mm) this).field_f + param1 * var4 / var10;
        ((mm) this).field_a = ((mm) this).field_m + param1 * var6 / var10;
        ((mm) this).field_h = ((mm) this).field_k + var8 * param1 / var10;
        ((mm) this).c((byte) -40);
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
        ((mm) this).field_d = ((mm) this).field_f - Math.cos(param0) * var8;
        ((mm) this).field_a = ((mm) this).field_m - Math.sin(param0) * var8;
        ((mm) this).field_h = ((mm) this).field_k + Math.cos(param1) * param2;
    }

    final void b(double param0, double param1, double param2, int param3) {
        if (param3 != -6861) {
            field_c = null;
        }
        this.a(param0, param1, param2, 144);
        ((mm) this).c((byte) -40);
    }

    final boolean a(mm param0, byte param1) {
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pool.field_O;
          var5 = 0;
          if (((mm) this).field_d == param0.field_d) {
            break L0;
          } else {
            L1: {
              L2: {
                var3 = -((mm) this).field_d + param0.field_d;
                if (0.5 <= var3) {
                  break L2;
                } else {
                  if (var3 <= -0.5) {
                    break L2;
                  } else {
                    ((mm) this).field_d = param0.field_d;
                    break L1;
                  }
                }
              }
              ((mm) this).field_d = ((mm) this).field_d + var3 / 8.0;
              break L1;
            }
            var5 = 1;
            break L0;
          }
        }
        L3: {
          if (param0.field_a == ((mm) this).field_a) {
            break L3;
          } else {
            L4: {
              var3 = param0.field_a - ((mm) this).field_a;
              var5 = 1;
              if (0.5 <= var3) {
                break L4;
              } else {
                if (var3 <= -0.5) {
                  break L4;
                } else {
                  ((mm) this).field_a = param0.field_a;
                  break L3;
                }
              }
            }
            ((mm) this).field_a = ((mm) this).field_a + var3 / 8.0;
            break L3;
          }
        }
        L5: {
          if (((mm) this).field_h != param0.field_h) {
            L6: {
              var3 = param0.field_h - ((mm) this).field_h;
              var5 = 1;
              if (var3 >= 0.5) {
                break L6;
              } else {
                if (-0.5 >= var3) {
                  break L6;
                } else {
                  ((mm) this).field_h = param0.field_h;
                  break L5;
                }
              }
            }
            ((mm) this).field_h = ((mm) this).field_h + var3 / 8.0;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          if (((mm) this).field_f != param0.field_f) {
            L8: {
              var3 = -((mm) this).field_f + param0.field_f;
              var5 = 1;
              if (0.5 <= var3) {
                break L8;
              } else {
                if (-0.5 >= var3) {
                  break L8;
                } else {
                  ((mm) this).field_f = param0.field_f;
                  break L7;
                }
              }
            }
            ((mm) this).field_f = ((mm) this).field_f + var3 / 8.0;
            break L7;
          } else {
            break L7;
          }
        }
        L9: {
          if (((mm) this).field_m != param0.field_m) {
            L10: {
              L11: {
                var3 = -((mm) this).field_m + param0.field_m;
                if (var3 >= 0.5) {
                  break L11;
                } else {
                  if (var3 > -0.5) {
                    ((mm) this).field_m = param0.field_m;
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              ((mm) this).field_m = ((mm) this).field_m + var3 / 8.0;
              break L10;
            }
            var5 = 1;
            break L9;
          } else {
            break L9;
          }
        }
        L12: {
          if (param1 == -78) {
            break L12;
          } else {
            int discarded$1 = ((mm) this).b(-34);
            break L12;
          }
        }
        L13: {
          if (param0.field_k != ((mm) this).field_k) {
            L14: {
              var3 = -((mm) this).field_k + param0.field_k;
              var5 = 1;
              if (var3 >= 0.5) {
                break L14;
              } else {
                if (var3 > -0.5) {
                  ((mm) this).field_k = param0.field_k;
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            ((mm) this).field_k = ((mm) this).field_k + var3 / 8.0;
            break L13;
          } else {
            break L13;
          }
        }
        this.d((byte) 108);
        ((mm) this).c((byte) -40);
        return var5 != 0;
    }

    final int a(int param0, double[][] param1) {
        int var3 = 0;
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
        var3 = 0;
        var4 = -1.0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param1.length) {
            L1: {
              if (param0 == -11024) {
                break L1;
              } else {
                ((mm) this).c((byte) -115);
                break L1;
              }
            }
            ((mm) this).a(param1[var3], (byte) -86);
            return var3;
          } else {
            var7 = param1[var6];
            var8 = -((mm) this).field_d + var7[0];
            var10 = var7[1] - ((mm) this).field_a;
            var12 = -((mm) this).field_h + var7[2];
            var14 = -((mm) this).field_f + ((mm) this).field_d;
            var16 = -((mm) this).field_m + ((mm) this).field_a;
            var18 = -((mm) this).field_k + ((mm) this).field_h;
            if (var8 * var14 + var10 * var16 + var12 * var18 >= 0.0) {
              L2: {
                var20 = var12 * var12 + (var10 * var10 + var8 * var8);
                if (0.0 > var4) {
                  break L2;
                } else {
                  if (var4 > var20) {
                    break L2;
                  } else {
                    var6++;
                    continue L0;
                  }
                }
              }
              var3 = var6;
              var4 = var20;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    private final void b(byte param0) {
        ((mm) this).field_f = 288.0;
        ((mm) this).field_m = 144.0;
        ((mm) this).field_d = 288.0;
        ((mm) this).field_h = -512.0;
        ((mm) this).field_a = 144.0;
        ((mm) this).field_k = -8.0;
        if (param0 != -24) {
            Object var3 = null;
            ((mm) this).a(13, (mm) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, lr param4, int param5, int param6, int param7, int param8, int param9, nm param10, int param11, int param12, nm param13, lr param14, int param15, int param16, int param17, int param18, nm param19) {
        qp.field_ec = param14;
        qa.field_t = param4;
        el.b(84, param1, param7, param6, param12);
        mp.a(param18, param0, param13, -92);
        if (param16 != 2) {
            return;
        }
        ci.a(param17, 26790, param10, param3, param5, param19);
        w.a(param9, -17, param2);
        qo.a((byte) -82, param11, param8, param15);
    }

    mm() {
        this.b((byte) -24);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "No players";
        field_l = "Game";
        field_o = "Loading music";
        field_n = new String[]{"By rating", "By win percentage"};
    }
}
