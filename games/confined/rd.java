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
        int var18 = 0;
        int var19 = 0;
        var19 = Confined.field_J ? 1 : 0;
        if (param3 != 0) {
          if ((param3 ^ -1) != -2) {
            if (2 != param3) {
              ((rd) this).a(param8, param9, param7, param0, param5, (byte) 89, param1, ((rd) this).field_A.field_x.a((byte) 78, ((rd) this).field_C), param4);
              var18 = -15 % ((-3 - param6) / 32);
              return;
            } else {
              this.a(param5 * 6.283185307179586, 0.5 * param9, 2.0, ((rd) this).field_A.field_x.a((byte) 78, ((rd) this).field_C), (byte) -68);
              var18 = -15 % ((-3 - param6) / 32);
              return;
            }
          } else {
            this.a(((rd) this).field_A.field_x.a((byte) 78, ((rd) this).field_C), param9, param5 * 6.283185307179586, (byte) 107);
            var18 = -15 % ((-3 - param6) / 32);
            return;
          }
        } else {
          this.a(((rd) this).field_A.field_x.a((byte) 78, ((rd) this).field_C), param9, (byte) 99, 6.283185307179586 * param5);
          var18 = -15 % ((-3 - param6) / 32);
          return;
        }
    }

    private final void a(double param0, double param1, byte param2, double param3) {
        ((rd) this).field_qb = param1;
        ((rd) this).field_Db = 0.0;
        ((rd) this).field_ub = 0.0;
        ((rd) this).field_X = 0.0;
        ((rd) this).field_hb = param3;
        ((rd) this).field_R = 0.0;
        ((rd) this).field_Z = param0;
        if (param2 <= 55) {
          field_Jb = null;
          ((rd) this).field_cb = 0.0;
          return;
        } else {
          ((rd) this).field_cb = 0.0;
          return;
        }
    }

    private final void a(double param0, double param1, double param2, byte param3) {
        ((rd) this).field_Z = 0.0;
        ((rd) this).field_ub = param0;
        ((rd) this).field_cb = 0.0;
        ((rd) this).field_R = 0.0;
        ((rd) this).field_qb = 0.0;
        ((rd) this).field_hb = param2;
        if (param3 != 107) {
          ((rd) this).field_Gb = -106;
          ((rd) this).field_Db = param1;
          ((rd) this).field_X = 1.5707963267948966;
          return;
        } else {
          ((rd) this).field_Db = param1;
          ((rd) this).field_X = 1.5707963267948966;
          return;
        }
    }

    final void a(vg param0, boolean param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        Object var19 = null;
        sk var19_ref = null;
        Object var20 = null;
        sk var20_ref = null;
        Object var21 = null;
        sk var21_ref = null;
        Object var22 = null;
        sk var22_ref = null;
        Object var23 = null;
        sk var23_ref = null;
        Object var24 = null;
        sk var24_ref = null;
        Object var25 = null;
        sk var25_ref = null;
        Object var26 = null;
        sk var26_ref = null;
        Object var27 = null;
        sk var27_ref = null;
        Object var28 = null;
        sk var28_ref = null;
        Object var29 = null;
        sk var29_ref = null;
        Object var30 = null;
        sk var30_ref = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var24 = null;
        var25 = null;
        var26 = null;
        var27 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        var18 = Confined.field_J ? 1 : 0;
        if (((rd) this).field_ab) {
          if (((rd) this).field_xb * 2.0 > -((rd) this).field_A.field_B.field_Lb.field_j + ((rd) this).field_D) {
            var3 = -param0.field_T + ((rd) this).field_E;
            var5 = ((rd) this).field_t - param0.field_L;
            var7 = -param0.field_O + ((rd) this).field_D;
            var9 = var7 * param0.field_M + (var5 * param0.field_ab + var3 * param0.field_R);
            var11 = param0.field_F * var7 + (var3 * param0.field_V + param0.field_U * var5);
            var13 = param0.field_N * var7 + (var3 * param0.field_P + var5 * param0.field_H);
            if (var9 >= -var13 * 0.5) {
              if (var9 <= 0.5 * var13) {
                L0: {
                  if (var11 < 0.29375 * -var13) {
                    break L0;
                  } else {
                    if (var11 > 0.29375 * var13) {
                      break L0;
                    } else {
                      if (param1) {
                        ((rd) this).f((byte) 63);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L1: {
                  if (-0.001 <= var9) {
                    break L1;
                  } else {
                    if (var11 <= var9 * 0.5416666666666666) {
                      break L1;
                    } else {
                      if (0.5416666666666666 * var9 >= -var11) {
                        break L1;
                      } else {
                        var11 = var11 * (-288.0 / var9);
                        var9 = -288.0;
                        var15 = 320 - -(int)Math.floor(var9 + 0.5);
                        var16 = 188 - -(int)Math.floor(0.5 + var11);
                        ti.a(var15, var16);
                        var27_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                        jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                        var27_ref.a(tj.field_A, jc.field_f);
                        ti.a();
                        if (param1) {
                          ((rd) this).f((byte) 63);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                L2: {
                  if (var9 <= 0.001) {
                    break L2;
                  } else {
                    if (var11 >= var9 * 0.5416666666666666) {
                      break L2;
                    } else {
                      if (-var11 >= var9 * 0.5416666666666666) {
                        break L2;
                      } else {
                        var11 = var11 * (288.0 / var9);
                        var9 = 288.0;
                        var15 = 320 - -(int)Math.floor(var9 + 0.5);
                        var16 = 188 - -(int)Math.floor(0.5 + var11);
                        ti.a(var15, var16);
                        var28_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                        jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                        var28_ref.a(tj.field_A, jc.field_f);
                        ti.a();
                        if (param1) {
                          ((rd) this).f((byte) 63);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                if (var11 < -0.001) {
                  var9 = var9 * (-156.0 / var11);
                  var11 = -156.0;
                  var15 = 320 - -(int)Math.floor(var9 + 0.5);
                  var16 = 188 - -(int)Math.floor(0.5 + var11);
                  ti.a(var15, var16);
                  var30_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                  jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                  var30_ref.a(tj.field_A, jc.field_f);
                  ti.a();
                  if (param1) {
                    ((rd) this).f((byte) 63);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var11 <= 0.001) {
                    return;
                  } else {
                    var9 = var9 * (156.0 / var11);
                    var11 = 156.0;
                    var15 = 320 - -(int)Math.floor(var9 + 0.5);
                    var16 = 188 - -(int)Math.floor(0.5 + var11);
                    ti.a(var15, var16);
                    var29_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                    jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                    var29_ref.a(tj.field_A, jc.field_f);
                    ti.a();
                    if (param1) {
                      ((rd) this).f((byte) 63);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L3: {
                  if (-0.001 <= var9) {
                    break L3;
                  } else {
                    if (var11 <= var9 * 0.5416666666666666) {
                      break L3;
                    } else {
                      if (0.5416666666666666 * var9 >= -var11) {
                        break L3;
                      } else {
                        var11 = var11 * (-288.0 / var9);
                        var9 = -288.0;
                        var15 = 320 - -(int)Math.floor(var9 + 0.5);
                        var16 = 188 - -(int)Math.floor(0.5 + var11);
                        ti.a(var15, var16);
                        var23_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                        jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                        var23_ref.a(tj.field_A, jc.field_f);
                        ti.a();
                        if (!param1) {
                          return;
                        } else {
                          ((rd) this).f((byte) 63);
                          return;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (var9 <= 0.001) {
                    break L4;
                  } else {
                    if (var11 >= var9 * 0.5416666666666666) {
                      break L4;
                    } else {
                      if (-var11 >= var9 * 0.5416666666666666) {
                        break L4;
                      } else {
                        var11 = var11 * (288.0 / var9);
                        var9 = 288.0;
                        var15 = 320 - -(int)Math.floor(var9 + 0.5);
                        var16 = 188 - -(int)Math.floor(0.5 + var11);
                        ti.a(var15, var16);
                        var24_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                        jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                        var24_ref.a(tj.field_A, jc.field_f);
                        ti.a();
                        if (param1) {
                          ((rd) this).f((byte) 63);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                if (var11 < -0.001) {
                  var9 = var9 * (-156.0 / var11);
                  var11 = -156.0;
                  var15 = 320 - -(int)Math.floor(var9 + 0.5);
                  var16 = 188 - -(int)Math.floor(0.5 + var11);
                  ti.a(var15, var16);
                  var26_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                  jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                  var26_ref.a(tj.field_A, jc.field_f);
                  ti.a();
                  if (param1) {
                    ((rd) this).f((byte) 63);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var11 <= 0.001) {
                    return;
                  } else {
                    var9 = var9 * (156.0 / var11);
                    var11 = 156.0;
                    var15 = 320 - -(int)Math.floor(var9 + 0.5);
                    var16 = 188 - -(int)Math.floor(0.5 + var11);
                    ti.a(var15, var16);
                    var25_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                    jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                    var25_ref.a(tj.field_A, jc.field_f);
                    ti.a();
                    if (param1) {
                      ((rd) this).f((byte) 63);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              L5: {
                if (-0.001 <= var9) {
                  break L5;
                } else {
                  if (var11 <= var9 * 0.5416666666666666) {
                    break L5;
                  } else {
                    if (0.5416666666666666 * var9 >= -var11) {
                      break L5;
                    } else {
                      var11 = var11 * (-288.0 / var9);
                      var9 = -288.0;
                      var15 = 320 - -(int)Math.floor(var9 + 0.5);
                      var16 = 188 - -(int)Math.floor(0.5 + var11);
                      ti.a(var15, var16);
                      var19_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                      jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                      var19_ref.a(tj.field_A, jc.field_f);
                      ti.a();
                      if (!param1) {
                        return;
                      } else {
                        ((rd) this).f((byte) 63);
                        return;
                      }
                    }
                  }
                }
              }
              L6: {
                if (var9 <= 0.001) {
                  break L6;
                } else {
                  if (var11 >= var9 * 0.5416666666666666) {
                    break L6;
                  } else {
                    if (-var11 >= var9 * 0.5416666666666666) {
                      break L6;
                    } else {
                      var11 = var11 * (288.0 / var9);
                      var9 = 288.0;
                      var15 = 320 - -(int)Math.floor(var9 + 0.5);
                      var16 = 188 - -(int)Math.floor(0.5 + var11);
                      ti.a(var15, var16);
                      var20_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                      jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                      var20_ref.a(tj.field_A, jc.field_f);
                      ti.a();
                      if (!param1) {
                        return;
                      } else {
                        ((rd) this).f((byte) 63);
                        return;
                      }
                    }
                  }
                }
              }
              if (var11 < -0.001) {
                var9 = var9 * (-156.0 / var11);
                var11 = -156.0;
                var15 = 320 - -(int)Math.floor(var9 + 0.5);
                var16 = 188 - -(int)Math.floor(0.5 + var11);
                ti.a(var15, var16);
                var22_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                var22_ref.a(tj.field_A, jc.field_f);
                ti.a();
                if (!param1) {
                  return;
                } else {
                  ((rd) this).f((byte) 63);
                  return;
                }
              } else {
                if (var11 > 0.001) {
                  var9 = var9 * (156.0 / var11);
                  var11 = 156.0;
                  var15 = 320 - -(int)Math.floor(var9 + 0.5);
                  var16 = 188 - -(int)Math.floor(0.5 + var11);
                  ti.a(var15, var16);
                  var21_ref = (sk) (Object) jk.field_c[((rd) this).field_Sb].a(96, 455, 0, 0, 256);
                  jc.field_f[2] = (int)(8192.0 * ((rd) this).field_C);
                  var21_ref.a(tj.field_A, jc.field_f);
                  ti.a();
                  if (!param1) {
                    return;
                  } else {
                    ((rd) this).f((byte) 63);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (!param1) {
              return;
            } else {
              ((rd) this).f((byte) 63);
              return;
            }
          }
        } else {
          if (!param1) {
            return;
          } else {
            ((rd) this).f((byte) 63);
            return;
          }
        }
    }

    final pm i(byte param0) {
        double[] var2 = null;
        double[] var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double[] var10 = null;
        double[] var11 = null;
        double[] var12 = null;
        double[] var13 = null;
        double[] var14 = null;
        L0: {
          var14 = new double[12];
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var2 = var10;
          ((rd) this).field_Eb.a((byte) 20, var14);
          var3 = tl.field_a[((rd) this).field_Sb];
          if (param0 == 96) {
            break L0;
          } else {
            rd.n(-108);
            break L0;
          }
        }
        var4 = var3[((rd) this).field_Fb];
        var6 = var3[1 + ((rd) this).field_Fb];
        var8 = var3[2 + ((rd) this).field_Fb];
        ((rd) this).field_Fb = (3 + ((rd) this).field_Fb) % var3.length;
        if (-1 != (((rd) this).field_zb ^ -1)) {
          if ((((rd) this).field_zb ^ -1) == -2) {
            return (pm) (Object) new gm(((rd) this).field_A, (ee) this, var14, var4, var6, var8);
          } else {
            return (pm) (Object) new ik(((rd) this).field_A, (ee) this, var14, var4, var6, var8);
          }
        } else {
          return (pm) (Object) new th(((rd) this).field_A, (ee) this, var14, var4, var6, var8);
        }
    }

    private final void a(double param0, double param1, double param2, double param3, byte param4) {
        ((rd) this).field_hb = param0;
        ((rd) this).field_Db = param1 * param2;
        ((rd) this).field_qb = param1;
        if (param4 > -58) {
          field_Jb = null;
          ((rd) this).field_ub = 0.0;
          ((rd) this).field_Z = param3;
          ((rd) this).field_cb = 0.0;
          ((rd) this).field_R = param1;
          ((rd) this).field_X = 0.0;
          return;
        } else {
          ((rd) this).field_ub = 0.0;
          ((rd) this).field_Z = param3;
          ((rd) this).field_cb = 0.0;
          ((rd) this).field_R = param1;
          ((rd) this).field_X = 0.0;
          return;
        }
    }

    final static int a(String param0, int param1, int param2, String param3, boolean param4, String param5, int param6) {
        bn var7 = new bn(param0);
        bn var8 = new bn(param3);
        if (param2 != 28406) {
            field_Jb = null;
        }
        return ai.a(param1, param5, var8, param4, param6, 125, var7);
    }

    final void d(byte param0, int param1) {
        Object var3 = null;
        rd var3_ref = null;
        rd var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        var3 = this;
        L0: while (true) {
          var4_ref = ((rd) var3).field_Tb;
          if (var4_ref != null) {
            ((rd) var3).field_ub = var4_ref.field_ub;
            ((rd) var3).field_cb = var4_ref.field_cb;
            ((rd) var3).field_Db = var4_ref.field_Db;
            ((rd) var3).field_X = var4_ref.field_X;
            ((rd) var3).field_qb = var4_ref.field_qb;
            ((rd) var3).field_hb = var4_ref.field_hb;
            ((rd) var3).field_R = var4_ref.field_R;
            ((rd) var3).field_Z = var4_ref.field_Z;
            var3_ref = var4_ref;
            continue L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (((rd) this).field_Gb <= var4) {
                if (param0 != -123) {
                  ((rd) this).h(-114);
                  return;
                } else {
                  return;
                }
              } else {
                var3_ref.m(12);
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(mn param0, byte param1) {
        int var3 = 0;
        double[] var9 = null;
        double[] var10 = null;
        super.a(param0, (byte) -84);
        var3 = -89 % ((-2 - param1) / 62);
        if (((rd) this).field_ob > -257) {
          if (-1 != ((rd) this).field_Sb) {
            if (-5 == (((rd) this).field_Sb ^ -1)) {
              var10 = new double[12];
              ((rd) this).field_Eb.a((byte) 110, var10);
              ((rd) this).a(false, var10, 0, mc.field_b);
              ((rd) this).field_ib.field_o = ud.field_o;
              ((rd) this).field_ib.field_t = rn.field_c;
              ((rd) this).field_ib.field_p = dh.field_sb;
              ((rd) this).field_ib.field_m = -var10[6];
              ((rd) this).field_ib.field_w = true;
              ((rd) this).field_ib.field_v = -var10[8];
              ((rd) this).field_ib.field_u = (double)(-((rd) this).field_ob + 256) * 0.390625;
              ((rd) this).field_ib.field_x = -var10[7];
              param0.a((rk) (Object) ((rd) this).field_ib, (byte) 86);
              return;
            } else {
              return;
            }
          } else {
            var9 = new double[12];
            ((rd) this).field_Eb.a((byte) 110, var9);
            ((rd) this).a(false, var9, 0, mc.field_b);
            ((rd) this).field_ib.field_o = ud.field_o;
            ((rd) this).field_ib.field_t = rn.field_c;
            ((rd) this).field_ib.field_p = dh.field_sb;
            ((rd) this).field_ib.field_m = -var9[6];
            ((rd) this).field_ib.field_w = true;
            ((rd) this).field_ib.field_v = -var9[8];
            ((rd) this).field_ib.field_u = (double)(-((rd) this).field_ob + 256) * 0.390625;
            ((rd) this).field_ib.field_x = -var9[7];
            param0.a((rk) (Object) ((rd) this).field_ib, (byte) 86);
            return;
          }
        } else {
          return;
        }
    }

    final void h(int param0) {
        ((rd) this).field_Lb = ((rd) this).field_Lb + 1;
        if (param0 == 17086) {
            return;
        }
        ((rd) this).field_Mb = -128;
    }

    private rd(hn param0, double param1, double param2, double param3, double param4, double param5, int param6, int param7, boolean param8, int param9, boolean param10, double param11, int param12, boolean param13, double param14, boolean param15, boolean param16, int param17, boolean param18, rd param19, int param20, u param21, boolean param22, boolean[] param23) {
        super(param0, param1, param2, param3, Math.random() * 0.4 - 0.2, -0.2 + Math.random() * 0.4, -0.2 + 0.4 * Math.random(), param4, param5, false, param9, param11, 0.005);
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        double stackIn_27_0 = 0.0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        double stackOut_26_0 = 0.0;
        double stackOut_25_0 = 0.0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        L0: {
          ((rd) this).field_Fb = 0;
          ((rd) this).field_wb = param12;
          ((rd) this).field_Bb = param12;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param13) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((rd) this).field_db = stackIn_3_1 != 0;
          ((rd) this).field_Qb = param6;
          if (param8) {
            break L1;
          } else {
            ((rd) this).field_fb.field_d = 0;
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = this;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (!param15) {
            stackOut_7_0 = this;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = this;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          ((rd) this).field_kb = stackIn_8_1 != 0;
          ((rd) this).field_S = false;
          ((rd) this).field_Y = param14;
          stackOut_8_0 = this;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (!param10) {
            stackOut_10_0 = this;
            stackOut_10_1 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = this;
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          ((rd) this).field_ab = stackIn_11_1 != 0;
          ((rd) this).field_Ab = param17;
          stackOut_11_0 = this;
          stackIn_13_0 = stackOut_11_0;
          stackIn_12_0 = stackOut_11_0;
          if (!param16) {
            stackOut_13_0 = this;
            stackOut_13_1 = 0;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            break L4;
          } else {
            stackOut_12_0 = this;
            stackOut_12_1 = 1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            break L4;
          }
        }
        L5: {
          ((rd) this).field_Ob = stackIn_14_1 != 0;
          ((rd) this).field_Sb = param7;
          if (!param15) {
            break L5;
          } else {
            ((rd) this).field_ob = 256;
            break L5;
          }
        }
        L6: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param18) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L6;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L6;
          }
        }
        L7: {
          ((rd) this).field_vb = stackIn_19_1 != 0;
          if (!param18) {
            break L7;
          } else {
            ((rd) this).l(22475);
            break L7;
          }
        }
        L8: {
          ((rd) this).field_Tb = param19;
          ((rd) this).field_Pb = param21;
          ((rd) this).field_Gb = param20;
          if (param19 == null) {
            break L8;
          } else {
            param19.field_eb = (rd) this;
            break L8;
          }
        }
        L9: {
          if (param21 == null) {
            break L9;
          } else {
            L10: {
              var32 = param21.field_E - param0.field_B.field_Lb.field_i;
              var34 = param21.field_t - param0.field_B.field_Lb.field_f;
              var36 = param21.field_D - param0.field_B.field_Lb.field_j;
              var38 = Math.sqrt(var32 * var32 + var34 * var34 + var36 * var36);
              if (var38 >= 0.01) {
                stackOut_26_0 = 2.0 / var38;
                stackIn_27_0 = stackOut_26_0;
                break L10;
              } else {
                stackOut_25_0 = 200.0;
                stackIn_27_0 = stackOut_25_0;
                break L10;
              }
            }
            var38 = stackIn_27_0;
            var38 = var38 * (param21.field_C + param4);
            var32 = var32 * var38;
            var36 = var36 * var38;
            var34 = var34 * var38;
            ((rd) this).field_G = param21.field_G;
            ((rd) this).field_L = param21.field_L;
            ((rd) this).field_t = param21.field_t + var34;
            ((rd) this).field_D = param21.field_D + var36;
            ((rd) this).field_E = var32 + param21.field_E;
            ((rd) this).field_K = param21.field_K;
            break L9;
          }
        }
        L11: {
          ((rd) this).field_Kb = param23;
          stackOut_28_0 = this;
          stackIn_30_0 = stackOut_28_0;
          stackIn_29_0 = stackOut_28_0;
          if (!param22) {
            stackOut_30_0 = this;
            stackOut_30_1 = 0;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            break L11;
          } else {
            stackOut_29_0 = this;
            stackOut_29_1 = 1;
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            break L11;
          }
        }
        ((rd) this).field_Rb = stackIn_31_1 != 0;
        gk discarded$1 = new gk((pm) this, tk.field_c[param7]);
    }

    public static void n(int param0) {
        field_Hb = null;
        field_Jb = null;
        field_Ib = null;
        if (param0 <= -107) {
            return;
        }
        field_Jb = null;
    }

    final void f(byte param0) {
        ((rd) this).field_Lb = ((rd) this).field_Lb - 1;
        if (param0 <= -112) {
            return;
        }
        ((rd) this).field_Fb = 56;
    }

    final pm h(byte param0) {
        double[] var2 = null;
        double[] var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double[] var10 = null;
        double[] var11 = null;
        double[] var12 = null;
        double[] var13 = null;
        double[] var14 = null;
        var14 = new double[12];
        var11 = var14;
        var10 = var11;
        var2 = var10;
        ((rd) this).field_Eb.a((byte) 49, var14);
        if (param0 <= 15) {
          this.a(-0.20656177354580776, 0.5060040522939452, 0.05774250501221265, 0.8961713050329917, (byte) 20);
          var12 = tl.field_a[((rd) this).field_Sb];
          var3 = var12;
          var4 = var3[((rd) this).field_Fb];
          var6 = var3[((rd) this).field_Fb + 1];
          var8 = var3[((rd) this).field_Fb + 2];
          ((rd) this).field_Fb = (((rd) this).field_Fb + 3) % var12.length;
          return (pm) (Object) new vm(((rd) this).field_A, (ee) this, var14, var4, var6, var8, ((rd) this).field_Y, ((rd) this).field_db);
        } else {
          var13 = tl.field_a[((rd) this).field_Sb];
          var3 = var13;
          var4 = var3[((rd) this).field_Fb];
          var6 = var3[((rd) this).field_Fb + 1];
          var8 = var3[((rd) this).field_Fb + 2];
          ((rd) this).field_Fb = (((rd) this).field_Fb + 3) % var13.length;
          return (pm) (Object) new vm(((rd) this).field_A, (ee) this, var14, var4, var6, var8, ((rd) this).field_Y, ((rd) this).field_db);
        }
    }

    final boolean o(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 640) {
          if (!((rd) this).field_z) {
            if (((rd) this).field_S) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          pm discarded$6 = ((rd) this).h((byte) -101);
          if (((rd) this).field_z) {
            return true;
          } else {
            L0: {
              if (!((rd) this).field_S) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    rd(hn param0, double param1, double param2, double param3, boolean param4, int param5, int param6, rd param7, int param8, boolean param9, int param10, int param11, boolean param12, boolean param13, double param14, boolean param15, boolean param16, u param17, boolean param18, boolean[] param19, int param20) {
        this(param0, param1, param2, param3, rf.field_a[param5], tg.field_R[param5], param5, param6, param9, param10, param12, sb.field_a[param5], cd.field_j[param5], param13, param14, false, param15, param11, true, param7, param8, param17, param18, param19);
        int var26_int = 0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        Object stackIn_1_0 = null;
        hn stackIn_1_1 = null;
        double stackIn_1_2 = 0.0;
        double stackIn_1_3 = 0.0;
        double stackIn_1_4 = 0.0;
        double stackIn_1_5 = 0.0;
        double stackIn_1_6 = 0.0;
        int stackIn_1_7 = 0;
        int stackIn_1_8 = 0;
        boolean stackIn_1_9 = false;
        int stackIn_1_10 = 0;
        boolean stackIn_1_11 = false;
        double stackIn_1_12 = 0.0;
        int stackIn_1_13 = 0;
        boolean stackIn_1_14 = false;
        double stackIn_1_15 = 0.0;
        int stackIn_1_16 = 0;
        boolean stackIn_1_17 = false;
        int stackIn_1_18 = 0;
        Object stackIn_2_0 = null;
        hn stackIn_2_1 = null;
        double stackIn_2_2 = 0.0;
        double stackIn_2_3 = 0.0;
        double stackIn_2_4 = 0.0;
        double stackIn_2_5 = 0.0;
        double stackIn_2_6 = 0.0;
        int stackIn_2_7 = 0;
        int stackIn_2_8 = 0;
        boolean stackIn_2_9 = false;
        int stackIn_2_10 = 0;
        boolean stackIn_2_11 = false;
        double stackIn_2_12 = 0.0;
        int stackIn_2_13 = 0;
        boolean stackIn_2_14 = false;
        double stackIn_2_15 = 0.0;
        int stackIn_2_16 = 0;
        boolean stackIn_2_17 = false;
        int stackIn_2_18 = 0;
        Object stackIn_3_0 = null;
        hn stackIn_3_1 = null;
        double stackIn_3_2 = 0.0;
        double stackIn_3_3 = 0.0;
        double stackIn_3_4 = 0.0;
        double stackIn_3_5 = 0.0;
        double stackIn_3_6 = 0.0;
        int stackIn_3_7 = 0;
        int stackIn_3_8 = 0;
        boolean stackIn_3_9 = false;
        int stackIn_3_10 = 0;
        boolean stackIn_3_11 = false;
        double stackIn_3_12 = 0.0;
        int stackIn_3_13 = 0;
        boolean stackIn_3_14 = false;
        double stackIn_3_15 = 0.0;
        int stackIn_3_16 = 0;
        boolean stackIn_3_17 = false;
        int stackIn_3_18 = 0;
        Object stackIn_4_0 = null;
        hn stackIn_4_1 = null;
        double stackIn_4_2 = 0.0;
        double stackIn_4_3 = 0.0;
        double stackIn_4_4 = 0.0;
        double stackIn_4_5 = 0.0;
        double stackIn_4_6 = 0.0;
        int stackIn_4_7 = 0;
        int stackIn_4_8 = 0;
        boolean stackIn_4_9 = false;
        int stackIn_4_10 = 0;
        boolean stackIn_4_11 = false;
        double stackIn_4_12 = 0.0;
        int stackIn_4_13 = 0;
        boolean stackIn_4_14 = false;
        double stackIn_4_15 = 0.0;
        int stackIn_4_16 = 0;
        boolean stackIn_4_17 = false;
        int stackIn_4_18 = 0;
        int stackIn_4_19 = 0;
        Object stackOut_0_0 = null;
        hn stackOut_0_1 = null;
        double stackOut_0_2 = 0.0;
        double stackOut_0_3 = 0.0;
        double stackOut_0_4 = 0.0;
        double stackOut_0_5 = 0.0;
        double stackOut_0_6 = 0.0;
        int stackOut_0_7 = 0;
        int stackOut_0_8 = 0;
        boolean stackOut_0_9 = false;
        int stackOut_0_10 = 0;
        boolean stackOut_0_11 = false;
        double stackOut_0_12 = 0.0;
        int stackOut_0_13 = 0;
        boolean stackOut_0_14 = false;
        double stackOut_0_15 = 0.0;
        int stackOut_0_16 = 0;
        boolean stackOut_0_17 = false;
        int stackOut_0_18 = 0;
        Object stackOut_1_0 = null;
        hn stackOut_1_1 = null;
        double stackOut_1_2 = 0.0;
        double stackOut_1_3 = 0.0;
        double stackOut_1_4 = 0.0;
        double stackOut_1_5 = 0.0;
        double stackOut_1_6 = 0.0;
        int stackOut_1_7 = 0;
        int stackOut_1_8 = 0;
        boolean stackOut_1_9 = false;
        int stackOut_1_10 = 0;
        boolean stackOut_1_11 = false;
        double stackOut_1_12 = 0.0;
        int stackOut_1_13 = 0;
        boolean stackOut_1_14 = false;
        double stackOut_1_15 = 0.0;
        int stackOut_1_16 = 0;
        boolean stackOut_1_17 = false;
        int stackOut_1_18 = 0;
        Object stackOut_3_0 = null;
        hn stackOut_3_1 = null;
        double stackOut_3_2 = 0.0;
        double stackOut_3_3 = 0.0;
        double stackOut_3_4 = 0.0;
        double stackOut_3_5 = 0.0;
        double stackOut_3_6 = 0.0;
        int stackOut_3_7 = 0;
        int stackOut_3_8 = 0;
        boolean stackOut_3_9 = false;
        int stackOut_3_10 = 0;
        boolean stackOut_3_11 = false;
        double stackOut_3_12 = 0.0;
        int stackOut_3_13 = 0;
        boolean stackOut_3_14 = false;
        double stackOut_3_15 = 0.0;
        int stackOut_3_16 = 0;
        boolean stackOut_3_17 = false;
        int stackOut_3_18 = 0;
        int stackOut_3_19 = 0;
        Object stackOut_2_0 = null;
        hn stackOut_2_1 = null;
        double stackOut_2_2 = 0.0;
        double stackOut_2_3 = 0.0;
        double stackOut_2_4 = 0.0;
        double stackOut_2_5 = 0.0;
        double stackOut_2_6 = 0.0;
        int stackOut_2_7 = 0;
        int stackOut_2_8 = 0;
        boolean stackOut_2_9 = false;
        int stackOut_2_10 = 0;
        boolean stackOut_2_11 = false;
        double stackOut_2_12 = 0.0;
        int stackOut_2_13 = 0;
        boolean stackOut_2_14 = false;
        double stackOut_2_15 = 0.0;
        int stackOut_2_16 = 0;
        boolean stackOut_2_17 = false;
        int stackOut_2_18 = 0;
        int stackOut_2_19 = 0;
        L0: {
          L1: {
            var38 = Confined.field_J ? 1 : 0;
            stackOut_0_0 = this;
            stackOut_0_1 = (hn) param0;
            stackOut_0_2 = param1;
            stackOut_0_3 = param2;
            stackOut_0_4 = param3;
            stackOut_0_5 = rf.field_a[param5];
            stackOut_0_6 = tg.field_R[param5];
            stackOut_0_7 = param5;
            stackOut_0_8 = param6;
            stackOut_0_9 = param9;
            stackOut_0_10 = param10;
            stackOut_0_11 = param12;
            stackOut_0_12 = sb.field_a[param5];
            stackOut_0_13 = cd.field_j[param5];
            stackOut_0_14 = param13;
            stackOut_0_15 = param14;
            stackOut_0_16 = 0;
            stackOut_0_17 = param15;
            stackOut_0_18 = param11;
            stackIn_2_0 = stackOut_0_0;
            stackIn_2_1 = stackOut_0_1;
            stackIn_2_2 = stackOut_0_2;
            stackIn_2_3 = stackOut_0_3;
            stackIn_2_4 = stackOut_0_4;
            stackIn_2_5 = stackOut_0_5;
            stackIn_2_6 = stackOut_0_6;
            stackIn_2_7 = stackOut_0_7;
            stackIn_2_8 = stackOut_0_8;
            stackIn_2_9 = stackOut_0_9;
            stackIn_2_10 = stackOut_0_10;
            stackIn_2_11 = stackOut_0_11;
            stackIn_2_12 = stackOut_0_12;
            stackIn_2_13 = stackOut_0_13;
            stackIn_2_14 = stackOut_0_14;
            stackIn_2_15 = stackOut_0_15;
            stackIn_2_16 = stackOut_0_16;
            stackIn_2_17 = stackOut_0_17;
            stackIn_2_18 = stackOut_0_18;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            stackIn_1_3 = stackOut_0_3;
            stackIn_1_4 = stackOut_0_4;
            stackIn_1_5 = stackOut_0_5;
            stackIn_1_6 = stackOut_0_6;
            stackIn_1_7 = stackOut_0_7;
            stackIn_1_8 = stackOut_0_8;
            stackIn_1_9 = stackOut_0_9;
            stackIn_1_10 = stackOut_0_10;
            stackIn_1_11 = stackOut_0_11;
            stackIn_1_12 = stackOut_0_12;
            stackIn_1_13 = stackOut_0_13;
            stackIn_1_14 = stackOut_0_14;
            stackIn_1_15 = stackOut_0_15;
            stackIn_1_16 = stackOut_0_16;
            stackIn_1_17 = stackOut_0_17;
            stackIn_1_18 = stackOut_0_18;
            if (param16) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackOut_1_1 = (hn) (Object) stackIn_1_1;
              stackOut_1_2 = stackIn_1_2;
              stackOut_1_3 = stackIn_1_3;
              stackOut_1_4 = stackIn_1_4;
              stackOut_1_5 = stackIn_1_5;
              stackOut_1_6 = stackIn_1_6;
              stackOut_1_7 = stackIn_1_7;
              stackOut_1_8 = stackIn_1_8;
              stackOut_1_9 = stackIn_1_9;
              stackOut_1_10 = stackIn_1_10;
              stackOut_1_11 = stackIn_1_11;
              stackOut_1_12 = stackIn_1_12;
              stackOut_1_13 = stackIn_1_13;
              stackOut_1_14 = stackIn_1_14;
              stackOut_1_15 = stackIn_1_15;
              stackOut_1_16 = stackIn_1_16;
              stackOut_1_17 = stackIn_1_17;
              stackOut_1_18 = stackIn_1_18;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_3_5 = stackOut_1_5;
              stackIn_3_6 = stackOut_1_6;
              stackIn_3_7 = stackOut_1_7;
              stackIn_3_8 = stackOut_1_8;
              stackIn_3_9 = stackOut_1_9;
              stackIn_3_10 = stackOut_1_10;
              stackIn_3_11 = stackOut_1_11;
              stackIn_3_12 = stackOut_1_12;
              stackIn_3_13 = stackOut_1_13;
              stackIn_3_14 = stackOut_1_14;
              stackIn_3_15 = stackOut_1_15;
              stackIn_3_16 = stackOut_1_16;
              stackIn_3_17 = stackOut_1_17;
              stackIn_3_18 = stackOut_1_18;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              stackIn_2_5 = stackOut_1_5;
              stackIn_2_6 = stackOut_1_6;
              stackIn_2_7 = stackOut_1_7;
              stackIn_2_8 = stackOut_1_8;
              stackIn_2_9 = stackOut_1_9;
              stackIn_2_10 = stackOut_1_10;
              stackIn_2_11 = stackOut_1_11;
              stackIn_2_12 = stackOut_1_12;
              stackIn_2_13 = stackOut_1_13;
              stackIn_2_14 = stackOut_1_14;
              stackIn_2_15 = stackOut_1_15;
              stackIn_2_16 = stackOut_1_16;
              stackIn_2_17 = stackOut_1_17;
              stackIn_2_18 = stackOut_1_18;
              if (-3 != param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = (hn) (Object) stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = stackIn_3_5;
                stackOut_3_6 = stackIn_3_6;
                stackOut_3_7 = stackIn_3_7;
                stackOut_3_8 = stackIn_3_8;
                stackOut_3_9 = stackIn_3_9;
                stackOut_3_10 = stackIn_3_10;
                stackOut_3_11 = stackIn_3_11;
                stackOut_3_12 = stackIn_3_12;
                stackOut_3_13 = stackIn_3_13;
                stackOut_3_14 = stackIn_3_14;
                stackOut_3_15 = stackIn_3_15;
                stackOut_3_16 = stackIn_3_16;
                stackOut_3_17 = stackIn_3_17;
                stackOut_3_18 = stackIn_3_18;
                stackOut_3_19 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                stackIn_4_6 = stackOut_3_6;
                stackIn_4_7 = stackOut_3_7;
                stackIn_4_8 = stackOut_3_8;
                stackIn_4_9 = stackOut_3_9;
                stackIn_4_10 = stackOut_3_10;
                stackIn_4_11 = stackOut_3_11;
                stackIn_4_12 = stackOut_3_12;
                stackIn_4_13 = stackOut_3_13;
                stackIn_4_14 = stackOut_3_14;
                stackIn_4_15 = stackOut_3_15;
                stackIn_4_16 = stackOut_3_16;
                stackIn_4_17 = stackOut_3_17;
                stackIn_4_18 = stackOut_3_18;
                stackIn_4_19 = stackOut_3_19;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_2_0 = this;
          stackOut_2_1 = (hn) (Object) stackIn_2_1;
          stackOut_2_2 = stackIn_2_2;
          stackOut_2_3 = stackIn_2_3;
          stackOut_2_4 = stackIn_2_4;
          stackOut_2_5 = stackIn_2_5;
          stackOut_2_6 = stackIn_2_6;
          stackOut_2_7 = stackIn_2_7;
          stackOut_2_8 = stackIn_2_8;
          stackOut_2_9 = stackIn_2_9;
          stackOut_2_10 = stackIn_2_10;
          stackOut_2_11 = stackIn_2_11;
          stackOut_2_12 = stackIn_2_12;
          stackOut_2_13 = stackIn_2_13;
          stackOut_2_14 = stackIn_2_14;
          stackOut_2_15 = stackIn_2_15;
          stackOut_2_16 = stackIn_2_16;
          stackOut_2_17 = stackIn_2_17;
          stackOut_2_18 = stackIn_2_18;
          stackOut_2_19 = 1;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_4_4 = stackOut_2_4;
          stackIn_4_5 = stackOut_2_5;
          stackIn_4_6 = stackOut_2_6;
          stackIn_4_7 = stackOut_2_7;
          stackIn_4_8 = stackOut_2_8;
          stackIn_4_9 = stackOut_2_9;
          stackIn_4_10 = stackOut_2_10;
          stackIn_4_11 = stackOut_2_11;
          stackIn_4_12 = stackOut_2_12;
          stackIn_4_13 = stackOut_2_13;
          stackIn_4_14 = stackOut_2_14;
          stackIn_4_15 = stackOut_2_15;
          stackIn_4_16 = stackOut_2_16;
          stackIn_4_17 = stackOut_2_17;
          stackIn_4_18 = stackOut_2_18;
          stackIn_4_19 = stackOut_2_19;
          break L0;
        }
        L2: {
          L3: {
            ((rd) this).field_Mb = param20;
            var26_int = param6;
            if (-1 == var26_int) {
              break L3;
            } else {
              if ((var26_int ^ -1) == -2) {
                break L3;
              } else {
                L4: {
                  if (var26_int == 2) {
                    break L4;
                  } else {
                    if ((var26_int ^ -1) == -4) {
                      break L4;
                    } else {
                      L5: {
                        if (4 == var26_int) {
                          break L5;
                        } else {
                          if ((var26_int ^ -1) == -6) {
                            break L5;
                          } else {
                            if ((var26_int ^ -1) == -7) {
                              break L5;
                            } else {
                              if (var26_int == -8) {
                                break L5;
                              } else {
                                if (var26_int == 9) {
                                  break L5;
                                } else {
                                  if (var26_int == 10) {
                                    break L5;
                                  } else {
                                    if (var26_int == -12) {
                                      break L5;
                                    } else {
                                      if (-13 == var26_int) {
                                        break L5;
                                      } else {
                                        if (-9 == var26_int) {
                                          var26 = 1.998 * Math.random() - 0.999;
                                          var28 = Math.sqrt(1.0 - var26 * var26);
                                          var30 = 2.0 * (Math.random() * 3.141592653589793);
                                          ((rd) this).field_tb.a(Math.random() * 0.2, var26, var28 * Math.sin(var30), var28 * Math.cos(var30), 7);
                                          break L2;
                                        } else {
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
                      ((rd) this).field_Bb = 1 + (int)(Math.random() * (double)((rd) this).field_wb);
                      if (!param4) {
                        ((rd) this).field_yb = true;
                        break L2;
                      } else {
                        ((rd) this).a(0.0, 1.0, false, 0.0);
                        break L2;
                      }
                    }
                  }
                }
                if (param4) {
                  ((rd) this).b(0.0, true, 0.0, 1.0);
                  break L2;
                } else {
                  ((rd) this).field_gb = true;
                  break L2;
                }
              }
            }
          }
          L6: {
            var26 = 1.998 * Math.random() - 0.999;
            var28 = Math.sqrt(1.0 - var26 * var26);
            var30 = 6.283185307179586 * Math.random();
            var32 = var28 * Math.cos(var30);
            var34 = Math.sin(var30) * var28;
            ((rd) this).field_tb.a(0.2, var26, var32, var34, 7);
            var36 = Math.sqrt(var32 * var32 + var26 * var26);
            if (0.0001 > var36) {
              var26 = 0.0;
              var32 = 1.0;
              break L6;
            } else {
              var26 = var26 / var36;
              var32 = var32 / var36;
              break L6;
            }
          }
          ((rd) this).field_Eb.a(-Math.atan2(var36, var34), var32, -var26, 0.0, 7);
          break L2;
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double var7 = 0.0;
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
        Object var28 = null;
        if (!((rd) this).field_N) {
          L0: {
            ((rd) this).a(((rd) this).field_ob, jk.field_c[((rd) this).field_Sb], 27902, ((rd) this).field_Eb, 512, param4, param1, param3, param0);
            if (param2 < -5) {
              break L0;
            } else {
              var28 = null;
              ((rd) this).a((mn) null, 0.8438752622488864, -63, (vg) null, (oi) null);
              break L0;
            }
          }
          ((rd) this).field_fb.a(param3, param1, (byte) 125);
          if (-11 < (((rd) this).field_V ^ -1)) {
            return;
          } else {
            L1: {
              var7 = ((rd) this).field_E - ((rd) this).field_A.field_B.field_E;
              var9 = -((rd) this).field_A.field_B.field_t + ((rd) this).field_t;
              var11 = ((rd) this).field_D - ((rd) this).field_A.field_B.field_D;
              if (400.0 > var11 * var11 + (var7 * var7 + var9 * var9)) {
                var13 = -param3.field_T + ((rd) this).field_E;
                var15 = -param3.field_L + ((rd) this).field_t;
                var17 = -param3.field_O + ((rd) this).field_D;
                var19 = var17 * param3.field_M + (var15 * param3.field_ab + param3.field_R * var13);
                var21 = var17 * param3.field_F + (var15 * param3.field_U + param3.field_V * var13);
                var23 = var15 * param3.field_H + var13 * param3.field_P + param3.field_N * var17;
                if (0.15 > var23) {
                  break L1;
                } else {
                  var25 = (int)(var19 / var23 * 640.0) + 320;
                  var26 = 188 - -(int)(640.0 * (var21 / var23));
                  var27 = (int)(((rd) this).field_C / var23 * 640.0);
                  if (-1 == (6 & ((rd) this).field_V ^ -1)) {
                    pn.field_a.b(di.field_f, var25, -8 + var26 - var27, 16711680, -1);
                    break L1;
                  } else {
                    fn.g(var25 + -1, -1 + var26, var27, 16711680);
                    fn.g(var25, var26 - 1, var27, 16711680);
                    fn.g(-1 + var25, var26, var27, 16711680);
                    fn.g(var25, var26, var27, 16711680);
                    pn.field_a.b(di.field_f, var25, -8 + var26 - var27, 16711680, -1);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final double j(int param0) {
        if (param0 != -7672) {
            field_Hb = null;
            return (double)(((rd) this).field_Lb << 1929766512);
        }
        return (double)(((rd) this).field_Lb << 1929766512);
    }

    final void g(int param0) {
        int var3 = 0;
        int var4 = 0;
        ka var6 = null;
        ka var7 = null;
        int stackIn_17_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 == 26402) {
          var7 = ((rd) this).a((byte) -71, ic.field_c[((rd) this).field_Sb], 1.5);
          var7.field_M.field_w = ((rd) this).field_C * 2.0;
          if (((rd) this).field_A.field_K == null) {
            L0: while (true) {
              if (null != ((rd) this).field_Tb) {
                if (((rd) this).field_Tb.o(640)) {
                  ((rd) this).field_Tb = ((rd) this).field_Tb.field_Tb;
                  continue L0;
                } else {
                  L1: while (true) {
                    L2: {
                      if (((rd) this).field_eb == null) {
                        break L2;
                      } else {
                        if (!((rd) this).field_eb.o(640)) {
                          break L2;
                        } else {
                          ((rd) this).field_eb = ((rd) this).field_eb.field_eb;
                          continue L1;
                        }
                      }
                    }
                    L3: {
                      if (!pa.field_c) {
                        var3 = ((rd) this).field_Kb[0] ? 1 : 0;
                        ((rd) this).field_Kb[0] = false;
                        break L3;
                      } else {
                        L4: {
                          if (((rd) this).field_eb == null) {
                            if (null == ((rd) this).field_Tb) {
                              stackOut_103_0 = 1;
                              stackIn_105_0 = stackOut_103_0;
                              break L4;
                            } else {
                              stackOut_102_0 = 0;
                              stackIn_105_0 = stackOut_102_0;
                              break L4;
                            }
                          } else {
                            stackOut_100_0 = 0;
                            stackIn_105_0 = stackOut_100_0;
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
                        ri.a((rk) this, 0, (rk) (Object) new cl(((rd) this).field_A, (rd) this));
                        break L5;
                      }
                    }
                    L6: {
                      if (!((rd) this).field_Rb) {
                        ((rd) this).field_A.a((byte) 50, si.a(107, (rd) this));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((rd) this).field_Mb < -3) {
                        break L7;
                      } else {
                        ((rd) this).field_A.field_c = ((rd) this).field_A.field_c - 1;
                        break L7;
                      }
                    }
                    L8: {
                      if (-2 >= ((rd) this).field_Mb) {
                        ((rd) this).field_A.field_j = ((rd) this).field_A.field_j - 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (((rd) this).field_Rb) {
                        ((rd) this).field_A.field_o = ((rd) this).field_A.field_o - 1;
                        if (((rd) this).field_A.field_o != 0) {
                          break L9;
                        } else {
                          if (null != ((rd) this).field_A.field_Q) {
                            break L9;
                          } else {
                            if (((rd) this).field_A.field_J.field_o > 12) {
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
                    if (((rd) this).field_eb == null) {
                      break L11;
                    } else {
                      if (!((rd) this).field_eb.o(640)) {
                        break L11;
                      } else {
                        ((rd) this).field_eb = ((rd) this).field_eb.field_eb;
                        continue L10;
                      }
                    }
                  }
                  L12: {
                    if (!pa.field_c) {
                      var3 = ((rd) this).field_Kb[0] ? 1 : 0;
                      ((rd) this).field_Kb[0] = false;
                      break L12;
                    } else {
                      L13: {
                        if (((rd) this).field_eb == null) {
                          if (null == ((rd) this).field_Tb) {
                            stackOut_72_0 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            break L13;
                          } else {
                            stackOut_71_0 = 0;
                            stackIn_74_0 = stackOut_71_0;
                            break L13;
                          }
                        } else {
                          stackOut_69_0 = 0;
                          stackIn_74_0 = stackOut_69_0;
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
                      ri.a((rk) this, 0, (rk) (Object) new cl(((rd) this).field_A, (rd) this));
                      break L14;
                    }
                  }
                  L15: {
                    if (!((rd) this).field_Rb) {
                      ((rd) this).field_A.a((byte) 50, si.a(107, (rd) this));
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (((rd) this).field_Mb < -3) {
                      break L16;
                    } else {
                      ((rd) this).field_A.field_c = ((rd) this).field_A.field_c - 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (-2 >= ((rd) this).field_Mb) {
                      ((rd) this).field_A.field_j = ((rd) this).field_A.field_j - 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (((rd) this).field_Rb) {
                      ((rd) this).field_A.field_o = ((rd) this).field_A.field_o - 1;
                      if (((rd) this).field_A.field_o != 0) {
                        break L18;
                      } else {
                        if (null != ((rd) this).field_A.field_Q) {
                          break L18;
                        } else {
                          if (((rd) this).field_A.field_J.field_o > 12) {
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
            if (((rd) this).field_Mb < -3) {
              L19: {
                if (-2 <= (((rd) this).field_Mb ^ -1)) {
                  ((rd) this).field_A.field_j = ((rd) this).field_A.field_j - 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              if (((rd) this).field_Rb) {
                ((rd) this).field_A.field_o = ((rd) this).field_A.field_o - 1;
                if (((rd) this).field_A.field_o == 0) {
                  if (null == ((rd) this).field_A.field_Q) {
                    if (((rd) this).field_A.field_J.field_o <= 12) {
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
                ((rd) this).field_A.field_c = ((rd) this).field_A.field_c - 1;
                if (-2 >= ((rd) this).field_Mb) {
                  ((rd) this).field_A.field_j = ((rd) this).field_A.field_j - 1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (((rd) this).field_Rb) {
                  ((rd) this).field_A.field_o = ((rd) this).field_A.field_o - 1;
                  if (((rd) this).field_A.field_o != 0) {
                    break L21;
                  } else {
                    if (null != ((rd) this).field_A.field_Q) {
                      break L21;
                    } else {
                      if (((rd) this).field_A.field_J.field_o > 12) {
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
            pm discarded$1 = ((rd) this).h((byte) -69);
            var6 = ((rd) this).a((byte) -71, ic.field_c[((rd) this).field_Sb], 1.5);
            var6.field_M.field_w = ((rd) this).field_C * 2.0;
            if (((rd) this).field_A.field_K == null) {
              L23: while (true) {
                L24: {
                  if (null == ((rd) this).field_Tb) {
                    break L24;
                  } else {
                    if (!((rd) this).field_Tb.o(640)) {
                      break L24;
                    } else {
                      ((rd) this).field_Tb = ((rd) this).field_Tb.field_Tb;
                      continue L23;
                    }
                  }
                }
                L25: while (true) {
                  L26: {
                    if (((rd) this).field_eb == null) {
                      break L26;
                    } else {
                      if (!((rd) this).field_eb.o(640)) {
                        break L26;
                      } else {
                        ((rd) this).field_eb = ((rd) this).field_eb.field_eb;
                        continue L25;
                      }
                    }
                  }
                  L27: {
                    if (!pa.field_c) {
                      var3 = ((rd) this).field_Kb[0] ? 1 : 0;
                      ((rd) this).field_Kb[0] = false;
                      break L27;
                    } else {
                      L28: {
                        if (((rd) this).field_eb == null) {
                          if (null == ((rd) this).field_Tb) {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            break L28;
                          } else {
                            stackOut_14_0 = 0;
                            stackIn_17_0 = stackOut_14_0;
                            break L28;
                          }
                        } else {
                          stackOut_12_0 = 0;
                          stackIn_17_0 = stackOut_12_0;
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
                      ri.a((rk) this, 0, (rk) (Object) new cl(((rd) this).field_A, (rd) this));
                      break L29;
                    }
                  }
                  if (!((rd) this).field_Rb) {
                    ((rd) this).field_A.a((byte) 50, si.a(107, (rd) this));
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
            if (((rd) this).field_Mb < -3) {
              break L30;
            } else {
              ((rd) this).field_A.field_c = ((rd) this).field_A.field_c - 1;
              break L30;
            }
          }
          L31: {
            if (-2 >= ((rd) this).field_Mb) {
              ((rd) this).field_A.field_j = ((rd) this).field_A.field_j - 1;
              break L31;
            } else {
              break L31;
            }
          }
          L32: {
            if (((rd) this).field_Rb) {
              ((rd) this).field_A.field_o = ((rd) this).field_A.field_o - 1;
              if (((rd) this).field_A.field_o != 0) {
                break L32;
              } else {
                if (null != ((rd) this).field_A.field_Q) {
                  break L32;
                } else {
                  if (((rd) this).field_A.field_J.field_o > 12) {
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
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        Object stackIn_9_0 = null;
        double stackIn_9_1 = 0.0;
        Object stackIn_10_0 = null;
        double stackIn_10_1 = 0.0;
        Object stackIn_11_0 = null;
        double stackIn_11_1 = 0.0;
        Object stackIn_12_0 = null;
        double stackIn_12_1 = 0.0;
        Object stackIn_13_0 = null;
        double stackIn_13_1 = 0.0;
        double stackIn_13_2 = 0.0;
        double stackIn_21_0 = 0.0;
        Object stackIn_33_0 = null;
        double stackIn_33_1 = 0.0;
        Object stackIn_34_0 = null;
        double stackIn_34_1 = 0.0;
        Object stackIn_35_0 = null;
        double stackIn_35_1 = 0.0;
        Object stackIn_36_0 = null;
        double stackIn_36_1 = 0.0;
        Object stackIn_37_0 = null;
        double stackIn_37_1 = 0.0;
        double stackIn_37_2 = 0.0;
        double stackIn_43_0 = 0.0;
        double stackIn_62_0 = 0.0;
        double stackIn_73_0 = 0.0;
        Object stackOut_8_0 = null;
        double stackOut_8_1 = 0.0;
        Object stackOut_12_0 = null;
        double stackOut_12_1 = 0.0;
        double stackOut_12_2 = 0.0;
        Object stackOut_9_0 = null;
        double stackOut_9_1 = 0.0;
        Object stackOut_11_0 = null;
        double stackOut_11_1 = 0.0;
        double stackOut_11_2 = 0.0;
        Object stackOut_10_0 = null;
        double stackOut_10_1 = 0.0;
        double stackOut_10_2 = 0.0;
        double stackOut_20_0 = 0.0;
        double stackOut_19_0 = 0.0;
        Object stackOut_32_0 = null;
        double stackOut_32_1 = 0.0;
        Object stackOut_36_0 = null;
        double stackOut_36_1 = 0.0;
        double stackOut_36_2 = 0.0;
        Object stackOut_33_0 = null;
        double stackOut_33_1 = 0.0;
        Object stackOut_35_0 = null;
        double stackOut_35_1 = 0.0;
        double stackOut_35_2 = 0.0;
        Object stackOut_34_0 = null;
        double stackOut_34_1 = 0.0;
        double stackOut_34_2 = 0.0;
        double stackOut_72_0 = 0.0;
        double stackOut_71_0 = 0.0;
        double stackOut_61_0 = 0.0;
        double stackOut_60_0 = 0.0;
        double stackOut_42_0 = 0.0;
        double stackOut_41_0 = 0.0;
        var23 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          L1: {
            if (((rd) this).field_Tb == null) {
              break L1;
            } else {
              if (!((rd) this).field_Tb.o(640)) {
                break L1;
              } else {
                ((rd) this).field_Gb = ((rd) this).field_Gb + ((rd) this).field_Tb.field_Gb;
                ((rd) this).field_Tb = ((rd) this).field_Tb.field_Tb;
                continue L0;
              }
            }
          }
          L2: {
            if (null == ((rd) this).field_Pb) {
              break L2;
            } else {
              if (((rd) this).field_Pb.field_z) {
                ((rd) this).field_Pb = null;
                ((rd) this).a((byte) 125, param0);
                break L2;
              } else {
                L3: {
                  if (null != ((rd) this).field_Tb) {
                    L4: {
                      var3 = ((rd) this).field_Tb.field_D + (double)((rd) this).field_Gb * (((rd) this).field_Tb.field_C + ((rd) this).field_C) * 0.2;
                      var5 = 0.1 * (var3 - ((rd) this).field_D) + ((rd) this).field_Tb.field_L;
                      var5 = var5 - ((rd) this).field_L;
                      stackOut_8_0 = this;
                      stackOut_8_1 = ((rd) this).field_L;
                      stackIn_12_0 = stackOut_8_0;
                      stackIn_12_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (0.04 < var5) {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 0.04;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L4;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var5 < -0.04) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = -0.04;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L4;
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = var5;
                          stackIn_13_0 = stackOut_10_0;
                          stackIn_13_1 = stackOut_10_1;
                          stackIn_13_2 = stackOut_10_2;
                          break L4;
                        }
                      }
                    }
                    ((rd) this).field_L = stackIn_13_1 + stackIn_13_2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (!((rd) this).field_Rb) {
                    break L5;
                  } else {
                    if (null == ((rd) this).field_A.field_Q) {
                      break L5;
                    } else {
                      ((rd) this).field_L = ((rd) this).field_L + ((rd) this).field_A.field_Q.field_L * 0.01;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (((rd) this).field_Pb == null) {
                    ((rd) this).b((byte) 108, param0);
                    break L6;
                  } else {
                    L7: {
                      var3 = ((rd) this).field_Pb.field_E - ((rd) this).field_A.field_B.field_Lb.field_i;
                      var5 = -((rd) this).field_A.field_B.field_Lb.field_f + ((rd) this).field_Pb.field_t;
                      var7 = ((rd) this).field_Pb.field_D - ((rd) this).field_A.field_B.field_Lb.field_j;
                      var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                      if (var9 >= 0.01) {
                        stackOut_20_0 = 2.0 / var9;
                        stackIn_21_0 = stackOut_20_0;
                        break L7;
                      } else {
                        stackOut_19_0 = 200.0;
                        stackIn_21_0 = stackOut_19_0;
                        break L7;
                      }
                    }
                    L8: {
                      var9 = stackIn_21_0;
                      var9 = var9 * (((rd) this).field_C + ((rd) this).field_Pb.field_C);
                      var7 = var7 * var9;
                      var3 = var3 * var9;
                      var5 = var5 * var9;
                      var11 = ((rd) this).field_Pb.field_E + var3;
                      var13 = var5 + ((rd) this).field_Pb.field_t;
                      var15 = var7 + ((rd) this).field_Pb.field_D;
                      var17 = ((rd) this).field_Pb.field_K + (var11 - ((rd) this).field_E) * 0.1;
                      var19 = ((rd) this).field_Pb.field_G + 0.1 * (-((rd) this).field_t + var13);
                      var17 = var17 - ((rd) this).field_K;
                      var19 = var19 - ((rd) this).field_G;
                      var21 = ((rd) this).field_Pb.field_L + 0.1 * (var15 - ((rd) this).field_D);
                      var21 = var21 - ((rd) this).field_L;
                      var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                      if (var9 > 0.04) {
                        var9 = 0.04 / var9;
                        break L8;
                      } else {
                        var9 = 1.0;
                        break L8;
                      }
                    }
                    ((rd) this).field_K = ((rd) this).field_K + var9 * var17;
                    ((rd) this).field_G = ((rd) this).field_G + var9 * var19;
                    ((rd) this).field_L = ((rd) this).field_L + var9 * var21;
                    break L6;
                  }
                }
                L9: {
                  if (param1 >= 94) {
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            }
          }
          L10: {
            if (null != ((rd) this).field_Tb) {
              L11: {
                var3 = ((rd) this).field_Tb.field_D + (double)((rd) this).field_Gb * (((rd) this).field_Tb.field_C + ((rd) this).field_C) * 0.2;
                var5 = 0.1 * (var3 - ((rd) this).field_D) + ((rd) this).field_Tb.field_L;
                var5 = var5 - ((rd) this).field_L;
                stackOut_32_0 = this;
                stackOut_32_1 = ((rd) this).field_L;
                stackIn_36_0 = stackOut_32_0;
                stackIn_36_1 = stackOut_32_1;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                if (0.04 < var5) {
                  stackOut_36_0 = this;
                  stackOut_36_1 = stackIn_36_1;
                  stackOut_36_2 = 0.04;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L11;
                } else {
                  stackOut_33_0 = this;
                  stackOut_33_1 = stackIn_33_1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  if (var5 < -0.04) {
                    stackOut_35_0 = this;
                    stackOut_35_1 = stackIn_35_1;
                    stackOut_35_2 = -0.04;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    break L11;
                  } else {
                    stackOut_34_0 = this;
                    stackOut_34_1 = stackIn_34_1;
                    stackOut_34_2 = var5;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    stackIn_37_2 = stackOut_34_2;
                    break L11;
                  }
                }
              }
              ((rd) this).field_L = stackIn_37_1 + stackIn_37_2;
              break L10;
            } else {
              break L10;
            }
          }
          if (((rd) this).field_Rb) {
            if (null != ((rd) this).field_A.field_Q) {
              ((rd) this).field_L = ((rd) this).field_L + ((rd) this).field_A.field_Q.field_L * 0.01;
              if (((rd) this).field_Pb == null) {
                ((rd) this).b((byte) 108, param0);
                if (param1 >= 94) {
                  return;
                } else {
                  return;
                }
              } else {
                L12: {
                  var3 = ((rd) this).field_Pb.field_E - ((rd) this).field_A.field_B.field_Lb.field_i;
                  var5 = -((rd) this).field_A.field_B.field_Lb.field_f + ((rd) this).field_Pb.field_t;
                  var7 = ((rd) this).field_Pb.field_D - ((rd) this).field_A.field_B.field_Lb.field_j;
                  var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                  if (var9 >= 0.01) {
                    stackOut_72_0 = 2.0 / var9;
                    stackIn_73_0 = stackOut_72_0;
                    break L12;
                  } else {
                    stackOut_71_0 = 200.0;
                    stackIn_73_0 = stackOut_71_0;
                    break L12;
                  }
                }
                L13: {
                  var9 = stackIn_73_0;
                  var9 = var9 * (((rd) this).field_C + ((rd) this).field_Pb.field_C);
                  var7 = var7 * var9;
                  var3 = var3 * var9;
                  var5 = var5 * var9;
                  var11 = ((rd) this).field_Pb.field_E + var3;
                  var13 = var5 + ((rd) this).field_Pb.field_t;
                  var15 = var7 + ((rd) this).field_Pb.field_D;
                  var17 = ((rd) this).field_Pb.field_K + (var11 - ((rd) this).field_E) * 0.1;
                  var19 = ((rd) this).field_Pb.field_G + 0.1 * (-((rd) this).field_t + var13);
                  var17 = var17 - ((rd) this).field_K;
                  var19 = var19 - ((rd) this).field_G;
                  var21 = ((rd) this).field_Pb.field_L + 0.1 * (var15 - ((rd) this).field_D);
                  var21 = var21 - ((rd) this).field_L;
                  var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                  if (var9 > 0.04) {
                    var9 = 0.04 / var9;
                    break L13;
                  } else {
                    var9 = 1.0;
                    break L13;
                  }
                }
                ((rd) this).field_K = ((rd) this).field_K + var9 * var17;
                ((rd) this).field_G = ((rd) this).field_G + var9 * var19;
                ((rd) this).field_L = ((rd) this).field_L + var9 * var21;
                if (param1 < 94) {
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (((rd) this).field_Pb != null) {
                L14: {
                  var3 = ((rd) this).field_Pb.field_E - ((rd) this).field_A.field_B.field_Lb.field_i;
                  var5 = -((rd) this).field_A.field_B.field_Lb.field_f + ((rd) this).field_Pb.field_t;
                  var7 = ((rd) this).field_Pb.field_D - ((rd) this).field_A.field_B.field_Lb.field_j;
                  var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                  if (var9 >= 0.01) {
                    stackOut_61_0 = 2.0 / var9;
                    stackIn_62_0 = stackOut_61_0;
                    break L14;
                  } else {
                    stackOut_60_0 = 200.0;
                    stackIn_62_0 = stackOut_60_0;
                    break L14;
                  }
                }
                L15: {
                  var9 = stackIn_62_0;
                  var9 = var9 * (((rd) this).field_C + ((rd) this).field_Pb.field_C);
                  var7 = var7 * var9;
                  var3 = var3 * var9;
                  var5 = var5 * var9;
                  var11 = ((rd) this).field_Pb.field_E + var3;
                  var13 = var5 + ((rd) this).field_Pb.field_t;
                  var15 = var7 + ((rd) this).field_Pb.field_D;
                  var17 = ((rd) this).field_Pb.field_K + (var11 - ((rd) this).field_E) * 0.1;
                  var19 = ((rd) this).field_Pb.field_G + 0.1 * (-((rd) this).field_t + var13);
                  var17 = var17 - ((rd) this).field_K;
                  var19 = var19 - ((rd) this).field_G;
                  var21 = ((rd) this).field_Pb.field_L + 0.1 * (var15 - ((rd) this).field_D);
                  var21 = var21 - ((rd) this).field_L;
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
                  ((rd) this).field_K = ((rd) this).field_K + var9 * var17;
                  ((rd) this).field_G = ((rd) this).field_G + var9 * var19;
                  ((rd) this).field_L = ((rd) this).field_L + var9 * var21;
                  if (param1 >= 94) {
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return;
              } else {
                L17: {
                  ((rd) this).b((byte) 108, param0);
                  if (param1 >= 94) {
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return;
              }
            }
          } else {
            if (((rd) this).field_Pb == null) {
              L18: {
                ((rd) this).b((byte) 108, param0);
                if (param1 >= 94) {
                  break L18;
                } else {
                  break L18;
                }
              }
              return;
            } else {
              L19: {
                var3 = ((rd) this).field_Pb.field_E - ((rd) this).field_A.field_B.field_Lb.field_i;
                var5 = -((rd) this).field_A.field_B.field_Lb.field_f + ((rd) this).field_Pb.field_t;
                var7 = ((rd) this).field_Pb.field_D - ((rd) this).field_A.field_B.field_Lb.field_j;
                var9 = Math.sqrt(var5 * var5 + var3 * var3 + var7 * var7);
                if (var9 >= 0.01) {
                  stackOut_42_0 = 2.0 / var9;
                  stackIn_43_0 = stackOut_42_0;
                  break L19;
                } else {
                  stackOut_41_0 = 200.0;
                  stackIn_43_0 = stackOut_41_0;
                  break L19;
                }
              }
              L20: {
                var9 = stackIn_43_0;
                var9 = var9 * (((rd) this).field_C + ((rd) this).field_Pb.field_C);
                var7 = var7 * var9;
                var3 = var3 * var9;
                var5 = var5 * var9;
                var11 = ((rd) this).field_Pb.field_E + var3;
                var13 = var5 + ((rd) this).field_Pb.field_t;
                var15 = var7 + ((rd) this).field_Pb.field_D;
                var17 = ((rd) this).field_Pb.field_K + (var11 - ((rd) this).field_E) * 0.1;
                var19 = ((rd) this).field_Pb.field_G + 0.1 * (-((rd) this).field_t + var13);
                var17 = var17 - ((rd) this).field_K;
                var19 = var19 - ((rd) this).field_G;
                var21 = ((rd) this).field_Pb.field_L + 0.1 * (var15 - ((rd) this).field_D);
                var21 = var21 - ((rd) this).field_L;
                var9 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
                if (var9 > 0.04) {
                  var9 = 0.04 / var9;
                  break L20;
                } else {
                  var9 = 1.0;
                  break L20;
                }
              }
              ((rd) this).field_K = ((rd) this).field_K + var9 * var17;
              ((rd) this).field_G = ((rd) this).field_G + var9 * var19;
              ((rd) this).field_L = ((rd) this).field_L + var9 * var21;
              if (param1 < 94) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        if (((rd) this).field_Ob) {
          if (-1 != (((rd) this).field_fb.field_d ^ -1)) {
            super.a(param0, param1);
            return;
          } else {
            ((rd) this).field_S = true;
            super.a(param0, param1);
            return;
          }
        } else {
          super.a(param0, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = -1;
        field_Ib = "<col=FFFFFF>Extra life:</col> gives you another chance if you die! Always look out for these, as you can stockpile as many as you want, and you may need them later in the game. You start with two.";
    }
}
