/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends pm {
    static String field_Q;
    da field_W;
    static ce field_I;
    double field_O;
    static be field_G;
    da field_X;
    static String field_K;
    double field_T;
    double field_L;
    static sh field_Z;
    static mn field_J;
    private da field_S;
    double field_H;
    double field_N;
    double field_U;
    double field_ab;
    double field_V;
    double field_R;
    double field_F;
    double field_Y;
    double field_P;
    double field_M;

    private final void a(byte param0, pm param1) {
        double var3 = ((vg) this).field_E - param1.field_E;
        double var5 = ((vg) this).field_t - param1.field_t;
        if (param0 < 69) {
            Object var11 = null;
            vg.a((String) null, true, -97, (java.awt.Color) null, false);
        }
        double var7 = -param1.field_D + ((vg) this).field_D;
        double var9 = var7 * var7 + (var3 * var3 + var5 * var5);
        if (0.0001 > var9) {
            ((vg) this).field_D = ((vg) this).field_C + (param1.field_C + param1.field_D);
        } else {
            var9 = (((vg) this).field_C + param1.field_C) / Math.sqrt(var9);
            if (!(var9 > 1.0)) {
                return;
            }
            ((vg) this).field_D = var7 * var9 + param1.field_D;
            ((vg) this).field_t = var9 * var5 + param1.field_t;
            ((vg) this).field_E = var9 * var3 + param1.field_E;
        }
    }

    final boolean g(byte param0) {
        if (param0 < 64) {
            ((vg) this).field_U = -0.11064266696157023;
            return true;
        }
        return true;
    }

    final static void a(int param0, int param1, om param2) {
        hb var6 = vh.field_a;
        var6.b(true, param1);
        var6.field_n = var6.field_n + 1;
        int var4 = var6.field_n;
        var6.f(param0 + -7830, 1);
        var6.f(113, param2.field_n);
        var6.a(false, param2.field_v);
        var6.d(-126, param2.field_r);
        var6.d(-100, param2.field_t);
        var6.d(param0 ^ -7846, param2.field_u);
        if (param0 != 7932) {
            Object var5 = null;
            vg.a((String) null, true, 52, (java.awt.Color) null, true);
        }
        var6.d(-105, param2.field_m);
        int discarded$0 = var6.e(26199, var4);
        var6.a(25859, var6.field_n - var4);
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            return false;
        }
        return false;
    }

    final void a(int param0, hf param1) {
        if (param0 > -29) {
            ((vg) this).m(18);
        }
    }

    final void a(int param0, mb param1) {
        if (param0 != -23154) {
            ((vg) this).field_N = -1.1636230847772295;
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 > -5) {
            ((vg) this).field_R = 2.2622491296623233;
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        ((vg) this).field_E = param3 + param2 * ((vg) this).field_C;
        ((vg) this).field_t = param4 * ((vg) this).field_C + param1;
        ((vg) this).field_D = ((vg) this).field_C * param6 + param5;
        if (param0 != 256) {
            Object var15 = null;
            ((vg) this).a((mn) null, 0.17170823466232027, -123, (vg) null, (oi) null);
        }
    }

    final static void a(String param0, boolean param1, int param2, java.awt.Color param3, boolean param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = fb.field_b.getGraphics();
                        if (null == gh.field_f) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gh.field_f = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, wm.field_ab, im.field_b);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param3 = new java.awt.Color(140, 17, 17);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param4) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (null == qm.field_z) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        qm.field_z = fb.field_b.createImage(304, 34);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = qm.field_z.getGraphics();
                        var10.setColor(param3);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param2, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(param2 * 3 + 2, 2, -(param2 * 3) + 300, 30);
                        var10.setFont(gh.field_f);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
                        boolean discarded$1 = var9.drawImage(qm.field_z, wm.field_ab / 2 + -152, -18 + im.field_b / 2, (java.awt.image.ImageObserver) null);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + wm.field_ab / 2;
                        var8 = im.field_b / 2 - 18;
                        var9.setColor(param3);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 + 2, param2 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(1 + var7, var8 - -1, 301, 31);
                        var9.fillRect(3 * param2 + (2 + var7), 2 + var8, 300 - param2 * 3, 30);
                        var9.setFont(gh.field_f);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param0, var7 - -((304 - param0.length() * 6) / 2), var8 - -22);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (eb.field_b == null) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9.setFont(gh.field_f);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(eb.field_b, wm.field_ab / 2 - eb.field_b.length() * 6 / 2, -26 + im.field_b / 2);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var5 = (Exception) (Object) caughtException;
                    fb.field_b.repaint();
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        ((vg) this).field_L = ((vg) this).field_L - param3;
        ((vg) this).field_T = ((vg) this).field_T - param0;
        ((vg) this).field_O = ((vg) this).field_O - param2;
    }

    final void m(int param0) {
        if (param0 != 10959) {
            ((vg) this).field_M = -0.7009354851461643;
        }
        if (!md.a(param0 ^ -10939)) {
            ((vg) this).field_O = ((vg) this).field_D;
            ((vg) this).field_L = ((vg) this).field_t;
            ((vg) this).field_T = ((vg) this).field_E;
            ((vg) this).field_W = ((vg) this).field_X;
        } else {
            ((vg) this).field_L = ((vg) this).field_A.field_B.field_t + ((vg) this).field_ab * jg.field_b[0] + jg.field_b[1] * ((vg) this).field_U + jg.field_b[2] * ((vg) this).field_H;
            ((vg) this).field_W = ((vg) this).field_A.field_B.field_jb;
            ((vg) this).field_O = ((vg) this).field_F * jg.field_b[1] + (((vg) this).field_A.field_B.field_D + ((vg) this).field_M * jg.field_b[0]) + ((vg) this).field_N * jg.field_b[2];
            ((vg) this).field_T = ((vg) this).field_P * jg.field_b[2] + (((vg) this).field_A.field_B.field_E + ((vg) this).field_R * jg.field_b[0] + jg.field_b[1] * ((vg) this).field_V);
        }
    }

    final void a(hm param0, boolean param1) {
        if (!param1) {
            ((vg) this).field_L = 0.011069630776745578;
        }
    }

    final void a(pm param0, int param1) {
        if (param1 >= -81) {
            field_G = null;
        }
        param0.a(-1, (vg) this);
    }

    final void a(boolean param0, ee param1) {
        if (!(param1 instanceof wc)) {
            param1.field_N = true;
        } else {
            this.a((byte) 124, (pm) (Object) param1);
        }
        if (!param0) {
            Object var4 = null;
            this.a((byte) 15, (pm) null);
        }
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            Object var4 = null;
            ((vg) this).a(55, (hf) null);
        }
        return false;
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            return;
        }
        param1.field_N = true;
    }

    final boolean f(int param0) {
        if (param0 > -54) {
            return false;
        }
        return false;
    }

    final void k(int param0) {
        dj var3 = null;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        double var24 = 0.0;
        int var26 = 0;
        lc var27 = null;
        lc var28 = null;
        double[] var32 = null;
        L0: {
          var26 = Confined.field_J ? 1 : 0;
          var27 = ((vg) this).field_A.field_x;
          var28 = var27;
          var3 = ((vg) this).field_A.field_B;
          var32 = new double[12];
          if (var28.field_a >= 2) {
            ((vg) this).field_X.a((byte) 116, var3.field_jb, 0.05);
            break L0;
          } else {
            L1: {
              ((vg) this).field_X.a((byte) 80, var32);
              var5_int = 0;
              var6 = 0;
              if (da.field_e == null) {
                L2: {
                  if (mc.field_e[96]) {
                    var5_int--;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!mc.field_e[97]) {
                    break L3;
                  } else {
                    var5_int++;
                    break L3;
                  }
                }
                L4: {
                  if (mc.field_e[98]) {
                    var6--;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (!mc.field_e[99]) {
                  break L1;
                } else {
                  var6++;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (var5_int != 0) {
                hd.field_e.a((double)var5_int * -0.002, var32[8], var32[6], var32[7], 7);
                ((vg) this).field_S.a(-98, hd.field_e);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 != (var6 ^ -1)) {
                hd.field_e.a(0.002 * (double)var6, var32[5], var32[3], var32[4], param0 ^ 3225);
                ((vg) this).field_S.a(param0 + -3255, hd.field_e);
                break L6;
              } else {
                break L6;
              }
            }
            ((vg) this).field_S.a(0.95, (byte) -65);
            ((vg) this).field_X.a(-83, ((vg) this).field_S);
            break L0;
          }
        }
        ((vg) this).field_X.a((byte) 20, var32);
        var5 = var32[3];
        var7 = var32[4];
        var9 = var32[5];
        var11 = var32[6];
        var13 = var32[7];
        var15 = var32[8];
        var17 = var32[9];
        var19 = var32[10];
        var21 = var32[11];
        var23 = 1;
        L7: while (true) {
          L8: {
            if (var23 >= -1 + var28.field_a) {
              break L8;
            } else {
              if (var3.field_D <= var27.field_r[var23]) {
                break L8;
              } else {
                var23++;
                continue L7;
              }
            }
          }
          L9: {
            if (var28.field_D < var23) {
              var24 = var28.field_i;
              break L9;
            } else {
              if (var28.field_D <= var23) {
                var24 = var28.field_H + (var3.field_D - var28.field_r[-1 + var23]) * (-var28.field_H + var28.field_i) / (-var28.field_r[-1 + var23] + var28.field_r[var23]);
                break L9;
              } else {
                var24 = var28.field_H;
                break L9;
              }
            }
          }
          L10: {
            var24 = var24 * 0.5;
            ((vg) this).field_E = ((vg) this).field_E + (-(var24 * var17) + var3.field_E - ((vg) this).field_E) * ((vg) this).field_Y;
            ((vg) this).field_D = ((vg) this).field_D + (-((vg) this).field_D + (var3.field_D - var24 * var21)) * ((vg) this).field_Y;
            ((vg) this).field_t = ((vg) this).field_t + (-((vg) this).field_t + (-(var24 * var19) + var3.field_t)) * ((vg) this).field_Y;
            if (param0 == 3230) {
              break L10;
            } else {
              boolean discarded$1 = ((vg) this).g((byte) 61);
              break L10;
            }
          }
          L11: {
            if (md.a(-111)) {
              ((vg) this).field_A.field_B.field_jb.a((byte) 107, var32);
              ((vg) this).field_N = var32[11];
              ((vg) this).field_V = var32[6];
              ((vg) this).field_F = var32[8];
              ((vg) this).field_H = var32[10];
              ((vg) this).field_R = var32[3];
              ((vg) this).field_P = var32[9];
              ((vg) this).field_ab = var32[4];
              ((vg) this).field_M = var32[5];
              ((vg) this).field_U = var32[7];
              break L11;
            } else {
              ((vg) this).field_M = var9;
              ((vg) this).field_V = var11;
              ((vg) this).field_U = var13;
              ((vg) this).field_N = var21;
              ((vg) this).field_P = var17;
              ((vg) this).field_H = var19;
              ((vg) this).field_F = var15;
              ((vg) this).field_ab = var7;
              ((vg) this).field_R = var5;
              break L11;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, oc param1) {
        int var2 = 0;
        oc var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (!param0) {
          if (param1.field_c == null) {
            return;
          } else {
            L0: {
              L1: {
                if (param1.field_d != 0) {
                  break L1;
                } else {
                  if (param1.field_i != 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= en.field_a) {
                  break L0;
                } else {
                  var3 = kl.field_R[var2];
                  if (var3.field_a == 2) {
                    if (var3.field_d == param1.field_d) {
                      if (param1.field_i == var3.field_i) {
                        return;
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param1.field_h != null) {
                break L3;
              } else {
                break L3;
              }
            }
            hh.a(param1, -101);
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            field_Q = null;
            return false;
        }
        return false;
    }

    final void a(boolean param0, il param1) {
        if (param0) {
            Object var4 = null;
            ((vg) this).a((pm) null, 81);
        }
    }

    final void a(kh param0, int param1) {
        if (param1 < 122) {
            Object var4 = null;
            vg.a(true, (oc) null);
        }
    }

    final void a(int param0, vg param1) {
        if (param0 != -1) {
            Object var4 = null;
            ((vg) this).a((hm) null, true);
        }
    }

    final void a(cl param0, byte param1) {
        int var3 = 111 / ((-35 - param1) / 60);
    }

    public static void l(int param0) {
        field_G = null;
        field_Z = null;
        field_J = null;
        field_I = null;
        field_Q = null;
        field_K = null;
        if (param0 <= 67) {
            Object var2 = null;
            vg.a((String) null, false, 1, (java.awt.Color) null, false);
        }
    }

    final boolean i(int param0) {
        if (param0 != 8) {
            ((vg) this).field_H = 1.1121338314193603;
            return true;
        }
        return true;
    }

    final int[] a(int param0, boolean param1) {
        if (param1) {
            ((vg) this).k(25);
        }
        double var3 = (double)param0;
        double var5 = 81920.0;
        return new int[]{(int)(var3 * ((vg) this).field_T), (int)(((vg) this).field_L * var3), (int)(((vg) this).field_O * (double)param0), (int)(((vg) this).field_R * var5), (int)(((vg) this).field_ab * var5), (int)(var5 * ((vg) this).field_M), (int)(var5 * ((vg) this).field_V), (int)(((vg) this).field_U * var5), (int)(((vg) this).field_F * var5), (int)(((vg) this).field_P * 65536.0), (int)(65536.0 * ((vg) this).field_H), (int)(((vg) this).field_N * 65536.0)};
    }

    vg(hn param0, double param1, double param2, double param3) {
        super(param0, param1, param2, param3, 0.2);
        ((vg) this).field_X = new da();
        ((vg) this).field_S = new da();
        ((vg) this).field_U = 1.0;
        ((vg) this).field_V = 0.0;
        ((vg) this).field_ab = 0.0;
        ((vg) this).field_H = 0.0;
        ((vg) this).field_N = 1.0;
        ((vg) this).field_Y = 0.1;
        ((vg) this).field_P = 0.0;
        ((vg) this).field_F = 0.0;
        ((vg) this).field_R = 1.0;
        ((vg) this).field_M = 0.0;
    }

    final void a(int param0, ah param1) {
        param1.field_N = true;
        int var3 = -30 % ((14 - param0) / 53);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "You already have the disruption cannon";
        field_K = "Hold <%0> to blast nearby enemies with lightning";
    }
}
