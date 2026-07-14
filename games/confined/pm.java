/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pm extends jl {
    double field_D;
    hn field_A;
    static nf[] field_w;
    double field_E;
    oi field_v;
    static bi field_x;
    static String[] field_B;
    double field_t;
    double field_C;
    pm field_y;
    boolean field_z;
    static String field_u;
    int field_s;

    final void d(int param0) {
        if (param0 != 10797) {
            boolean discarded$0 = ((pm) this).f(90);
        }
        if (!(((pm) this).field_z)) {
            ((pm) this).g(26402);
        }
    }

    void g(int param0) {
        ((pm) this).field_z = true;
        if (param0 != 26402) {
            field_x = null;
        }
    }

    abstract void a(boolean param0, ee param1);

    abstract void a(int param0, ah param1);

    final ka a(byte param0, bi param1, double param2) {
        int var6 = 14 / ((-15 - param0) / 53);
        ka var5 = new ka((pm) this, param2, param1);
        ri.a((rk) this, 0, (rk) (Object) var5);
        ((pm) this).field_z = true;
        return var5;
    }

    abstract void a(int param0, vg param1);

    final void a(int param0, boolean param1, double param2, byte param3, od param4, da param5, vg param6, oi param7, mn param8, int param9) {
        sk var12 = null;
        sk var12_ref = null;
        double var13_double = 0.0;
        int[] var13 = null;
        int[] var14 = null;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int[] var25 = null;
        int[] var27 = null;
        int[] var29 = null;
        double[] var30 = null;
        int[] var31 = null;
        od stackIn_4_0 = null;
        od stackIn_5_0 = null;
        od stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        od stackOut_3_0 = null;
        od stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        od stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (-1 != (param9 ^ -1)) {
          L0: {
            if (param9 != 256) {
              var30 = new double[12];
              param5.a((byte) 77, var30);
              var12 = this.a((double)(256 + -param9) * 0.00390625, param4, var30, 2, param6, param2, param7, param8);
              break L0;
            } else {
              L1: {
                var13_double = -((((pm) this).field_D - param6.field_O) / param2) + 1.0;
                var13_double = qn.field_v.a(var13_double, 0, ((pm) this).field_D);
                stackOut_3_0 = (od) param4;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var13_double <= 0.0) {
                  stackOut_5_0 = (od) (Object) stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = (od) (Object) stackIn_4_0;
                  stackOut_4_1 = (int)(16.0 * var13_double);
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              var12_ref = (sk) (Object) ((od) (Object) stackIn_6_0).a(stackIn_6_1, 65536, 0, 0, -256);
              break L0;
            }
          }
          var31 = new int[12];
          var29 = var31;
          var27 = var29;
          var25 = var27;
          var13 = var25;
          if (param3 == 44) {
            L2: {
              var13[0] = (int)(((pm) this).field_E * (double)param0);
              var13[2] = (int)(((pm) this).field_D * (double)param0);
              var13[1] = (int)((double)param0 * ((pm) this).field_t);
              param5.a(var31, -99);
              var14 = fn.field_h;
              fn.field_h = fd.field_e.field_z;
              var12.a(param6.a(param0, false), var31);
              fn.field_h = var14;
              var12.a();
              if (param1) {
                L3: {
                  var15 = -param6.field_T + ((pm) this).field_E;
                  var17 = -param6.field_L + ((pm) this).field_t;
                  var19 = ((pm) this).field_D - param6.field_O;
                  var21 = param6.field_H * var17 + param6.field_P * var15 + var19 * param6.field_N;
                  var23 = 8;
                  if (0.15 > var21) {
                    break L3;
                  } else {
                    var23 = (int)(0.02 / var21 * 640.0);
                    if (var23 <= 8) {
                      break L3;
                    } else {
                      var23 = 8;
                      break L3;
                    }
                  }
                }
                pm.b((int)qn.field_v.a((double)param9, param3 ^ 44, ((pm) this).field_D) >> 384620386, var23);
                break L2;
              } else {
                break L2;
              }
            }
            fn.h(sk.field_u, sk.field_j, sk.field_h, sk.field_G);
            fd.field_e.a(0, 0, -(param9 >> -1617485247) + 256);
            fn.field_h = fd.field_e.field_z;
            fn.e(0, 0, 640, 376, 0);
            fn.field_h = var14;
            fn.c();
            return;
          } else {
            return;
          }
        } else {
          ((pm) this).a(param4, param5, param7, (byte) 64, param2, param8, param6, param0);
          return;
        }
    }

    abstract void a(boolean param0, il param1);

    final static void b(int param0, int param1) {
        int[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var23 = null;
        byte[] var24 = null;
        if (sk.field_u >= sk.field_h) {
          return;
        } else {
          if (sk.field_j < sk.field_G) {
            L0: {
              wb.field_b = param0;
              rk.field_j = param1;
              var23 = fd.field_e.field_z;
              var21 = var23;
              var19 = var21;
              var17 = var19;
              var2 = var17;
              var24 = wm.field_gb;
              var4 = sk.field_u - 1;
              var5 = sk.field_j - 1;
              var6 = sk.field_h + 1;
              var7 = sk.field_G + 1;
              if (var4 >= 0) {
                break L0;
              } else {
                var4 = 0;
                break L0;
              }
            }
            L1: {
              if (var6 <= 640) {
                break L1;
              } else {
                var6 = 640;
                break L1;
              }
            }
            L2: {
              if (var5 >= 0) {
                break L2;
              } else {
                var5 = 0;
                break L2;
              }
            }
            L3: {
              if (var7 <= 376) {
                break L3;
              } else {
                var7 = 376;
                break L3;
              }
            }
            L4: {
              var8 = var5 * 640 + var4;
              var9 = 640 - (var6 - var4) + 1;
              var4++;
              var6--;
              var5++;
              var7--;
              if (var23[var8] != 0) {
                break L4;
              } else {
                if ((var2[var8 + 1] | var2[var8 + 640]) == 0) {
                  break L4;
                } else {
                  pm.a(var8, var4 - 1, var5 - 1);
                  break L4;
                }
              }
            }
            var8++;
            var10 = var4;
            L5: while (true) {
              if (var10 >= var6) {
                L6: {
                  if (var23[var8] != 0) {
                    break L6;
                  } else {
                    if ((var2[var8 - 1] | var2[var8 + 640]) == 0) {
                      break L6;
                    } else {
                      pm.a(var8, var6, var5 - 1);
                      break L6;
                    }
                  }
                }
                var8 = var8 + var9;
                var10 = var5;
                L7: while (true) {
                  if (var10 >= var7) {
                    L8: {
                      if (var23[var8] != 0) {
                        break L8;
                      } else {
                        if ((var2[var8 + 1] | var2[var8 - 640]) == 0) {
                          break L8;
                        } else {
                          pm.a(var8, var4 - 1, var7);
                          break L8;
                        }
                      }
                    }
                    var8++;
                    var10 = var4;
                    L9: while (true) {
                      if (var10 >= var6) {
                        L10: {
                          if (var23[var8] != 0) {
                            break L10;
                          } else {
                            if ((var2[var8 - 1] | var2[var8 - 640]) == 0) {
                              break L10;
                            } else {
                              pm.a(var8, var6, var7);
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var4 = var4 - rk.field_j;
                          var6 = var6 + rk.field_j;
                          var5 = var5 - rk.field_j;
                          var7 = var7 + rk.field_j;
                          if (var4 >= 0) {
                            break L11;
                          } else {
                            var4 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          if (var6 <= 640) {
                            break L12;
                          } else {
                            var6 = 640;
                            break L12;
                          }
                        }
                        L13: {
                          if (var5 >= 0) {
                            break L13;
                          } else {
                            var5 = 0;
                            break L13;
                          }
                        }
                        L14: {
                          if (var7 <= 376) {
                            break L14;
                          } else {
                            var7 = 376;
                            break L14;
                          }
                        }
                        var8 = var5 * 640 + var4;
                        var9 = 640 - (var6 - var4);
                        var10 = var5;
                        L15: while (true) {
                          if (var10 >= var7) {
                            return;
                          } else {
                            var11 = var4;
                            L16: while (true) {
                              if (var11 >= var6) {
                                var8 = var8 + var9;
                                var10++;
                                continue L15;
                              } else {
                                var12 = var24[var8] & 255;
                                if (var12 != 0) {
                                  var24[var8] = (byte) 0;
                                  var13 = fn.field_h[var8];
                                  var14 = (var13 ^ -1) & 16711935;
                                  var15 = (var13 ^ -1) & 65280;
                                  var16 = var14 * var12 & -16711936 | var15 * var12 & 16711680;
                                  fn.field_h[var8] = var13 + (var16 >>> 8);
                                  var8++;
                                  var11++;
                                  continue L16;
                                } else {
                                  var8++;
                                  var11++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (var23[var8] == 0) {
                          if ((var2[var8 - 1] | var2[var8 + 1] | var2[var8 - 640]) != 0) {
                            pm.a(var8, var10, var7);
                            var8++;
                            var10++;
                            continue L9;
                          } else {
                            var8++;
                            var10++;
                            continue L9;
                          }
                        } else {
                          var8++;
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    L17: {
                      if (var23[var8] != 0) {
                        break L17;
                      } else {
                        if ((var2[var8 + 1] | var2[var8 - 640] | var2[var8 + 640]) == 0) {
                          break L17;
                        } else {
                          pm.a(var8, var4 - 1, var10);
                          break L17;
                        }
                      }
                    }
                    var8++;
                    var11 = var4;
                    L18: while (true) {
                      if (var11 >= var6) {
                        L19: {
                          if (var23[var8] != 0) {
                            break L19;
                          } else {
                            if ((var2[var8 - 1] | var2[var8 - 640] | var2[var8 + 640]) == 0) {
                              break L19;
                            } else {
                              pm.a(var8, var6, var10);
                              break L19;
                            }
                          }
                        }
                        var8 = var8 + var9;
                        var10++;
                        continue L7;
                      } else {
                        if (var23[var8] == 0) {
                          if ((var2[var8 - 1] | var2[var8 + 1] | var2[var8 - 640] | var2[var8 + 640]) != 0) {
                            pm.a(var8, var11, var10);
                            var8++;
                            var11++;
                            continue L18;
                          } else {
                            var8++;
                            var11++;
                            continue L18;
                          }
                        } else {
                          var8++;
                          var11++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
              } else {
                if (var23[var8] == 0) {
                  if ((var2[var8 - 1] | var2[var8 + 1] | var2[var8 + 640]) != 0) {
                    pm.a(var8, var10, var5 - 1);
                    var8++;
                    var10++;
                    continue L5;
                  } else {
                    var8++;
                    var10++;
                    continue L5;
                  }
                } else {
                  var8++;
                  var10++;
                  continue L5;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    abstract boolean c(int param0);

    abstract void a(kh param0, int param1);

    void a(vg param0, boolean param1) {
        if (param1) {
            ((pm) this).field_A = null;
        }
    }

    final void a(boolean param0, double[] param1, int param2, double[] param3) {
        rn.field_c = param3[2 + param2] * param1[9] + (param3[1 + param2] * param1[6] + (((pm) this).field_E + param1[3] * param3[param2]));
        if (param0) {
            field_x = null;
        }
        ud.field_o = param1[7] * param3[1 + param2] + (param1[4] * param3[param2] + ((pm) this).field_t) + param1[10] * param3[param2 + 2];
        dh.field_sb = param1[5] * param3[param2] + ((pm) this).field_D + param1[8] * param3[param2 + 1] + param3[2 + param2] * param1[11];
    }

    final void a(double[] param0, pm param1, double param2, da param3, double[] param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        int var37 = 0;
        double[] var38 = null;
        double[] var39 = null;
        double[] var43 = null;
        double[] var47 = null;
        double[] var51 = null;
        double[] var52 = null;
        double[] var53 = null;
        double[] var54 = null;
        var37 = Confined.field_J ? 1 : 0;
        var51 = new double[12];
        var47 = var51;
        var43 = var47;
        var39 = var43;
        var38 = var39;
        var52 = var38;
        param3.a((byte) 62, var51);
        var9 = 0;
        var10 = -125 % ((param5 - -73) / 32);
        L0: while (true) {
          if (var9 >= param0.length) {
            return;
          } else {
            var11 = param0[var9];
            var13 = param0[var9 - -1];
            var15 = param0[2 + var9];
            ((pm) this).a(false, var52, var9, param4);
            var53 = param1.e(3008);
            var18 = var53[0] - rn.field_c;
            var20 = -ud.field_o + var53[1];
            var22 = -dh.field_sb + var53[2];
            var24 = Math.sqrt(var22 * var22 + (var20 * var20 + var18 * var18));
            if (var24 >= 0.001) {
              L1: {
                var24 = 1.0 / var24;
                var20 = var20 * var24;
                var18 = var18 * var24;
                var22 = var22 * var24;
                var24 = var15 * var22 + (var11 * var18 + var13 * var20);
                if (-0.99999 >= var24) {
                  break L1;
                } else {
                  if (var24 < 0.99999) {
                    var26 = Math.acos(var24) * param2;
                    var28 = -(var20 * var15) + var22 * var13;
                    var30 = var18 * var15 - var11 * var22;
                    var32 = var11 * var20 - var18 * var13;
                    var34 = 1.0 / Math.sqrt(var30 * var30 + var28 * var28 + var32 * var32);
                    hd.field_e.a(var26, var34 * var32, var28 * var34, var34 * var30, 7);
                    var54 = new double[12];
                    hd.field_e.a((byte) 72, var54);
                    var20 = var11 * var54[4] + var54[7] * var13 + var15 * var54[10];
                    var22 = var54[5] * var11 + var54[8] * var13 + var54[11] * var15;
                    var18 = var54[6] * var13 + var54[3] * var11 + var54[9] * var15;
                    var34 = 1.0 / Math.sqrt(var18 * var18 + var20 * var20 + var22 * var22);
                    var22 = var22 * var34;
                    var18 = var18 * var34;
                    var20 = var20 * var34;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              param0[var9] = var18;
              param0[1 + var9] = var20;
              param0[2 + var9] = var22;
              var9 += 3;
              continue L0;
            } else {
              var9 += 3;
              continue L0;
            }
          }
        }
    }

    private final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var3 = param1 - rk.field_j + 1;
          var4 = param1 + rk.field_j;
          var5 = param2 - rk.field_j + 1;
          var6 = param2 + rk.field_j;
          if (var3 >= 0) {
            break L0;
          } else {
            var3 = 0;
            break L0;
          }
        }
        L1: {
          if (var4 <= 640) {
            break L1;
          } else {
            var4 = 640;
            break L1;
          }
        }
        L2: {
          if (var5 >= 0) {
            break L2;
          } else {
            var5 = 0;
            break L2;
          }
        }
        L3: {
          if (var6 <= 376) {
            break L3;
          } else {
            var6 = 376;
            break L3;
          }
        }
        param0 = param0 + ((var5 - param2) * 640 + (var3 - param1));
        var7 = 640 - (var4 - var3);
        var8 = (double)wb.field_b / (double)rk.field_j;
        var10 = var5;
        L4: while (true) {
          if (var10 >= var6) {
            return;
          } else {
            var11 = var3;
            L5: while (true) {
              if (var11 >= var4) {
                var10++;
                param0 = param0 + var7;
                continue L4;
              } else {
                if (fd.field_e.field_z[param0] == 0) {
                  var12 = wb.field_b - (int)(Math.sqrt((double)((var11 - param1) * (var11 - param1) + (var10 - param2) * (var10 - param2))) * var8);
                  if (var12 > (wm.field_gb[param0] & 255)) {
                    wm.field_gb[param0] = (byte)var12;
                    var11++;
                    param0++;
                    continue L5;
                  } else {
                    var11++;
                    param0++;
                    continue L5;
                  }
                } else {
                  var11++;
                  param0++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void a(od param0, da param1, oi param2, byte param3, double param4, mn param5, vg param6, int param7) {
        double[] var16 = new double[12];
        param1.a((byte) 41, var16);
        sk var10 = this.a(param5, param2, param6, param0, var16, 3036, param4);
        int[] var17 = new int[12];
        int[] var15 = var17;
        int[] var13 = var15;
        var13[0] = (int)((double)param7 * ((pm) this).field_E);
        if (param3 != 64) {
            return;
        }
        var13[1] = (int)((double)param7 * ((pm) this).field_t);
        var13[2] = (int)(((pm) this).field_D * (double)param7);
        param1.a(var17, -127);
        var10.a(param6.a(param7, false), var17);
    }

    abstract boolean i(int param0);

    double[] e(int param0) {
        if (param0 != 3008) {
            return null;
        }
        return new double[]{((pm) this).field_E, ((pm) this).field_t, ((pm) this).field_D, 0.0, 0.0, 0.0};
    }

    final void a(nf param0, int param1, vg param2, byte param3, double param4) {
        pa.a(((pm) this).field_E, ((pm) this).field_C, (byte) -11, param1, ((pm) this).field_D, ((pm) this).field_t, param0, param4, param2);
        if (param3 != 91) {
        }
    }

    final void a(int param0, od param1, int param2, da param3, int param4, oi param5, double param6, vg param7, mn param8) {
        ((pm) this).a(param4, false, param6, (byte) 44, param1, param3, param7, param5, param8, param0);
        if (param2 != 27902) {
            Object var12 = null;
            fg discarded$0 = pm.a((String) null, true);
        }
    }

    void a(mm param0, boolean param1) {
        ((pm) this).a(102, (ah) (Object) param0);
        if (param1) {
            Object var4 = null;
            ((pm) this).a((byte) -43, (sa) null);
        }
    }

    private final sk a(double param0, od param1, double[] param2, int param3, vg param4, double param5, oi param6, mn param7) {
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        vb var21 = null;
        Object var22_ref = null;
        oi var22_ref_oi = null;
        double var22 = 0.0;
        double var23 = 0.0;
        int var24 = 0;
        int var25 = 0;
        double var25_double = 0.0;
        int var26_int = 0;
        double var26 = 0.0;
        int var27 = 0;
        double var27_double = 0.0;
        double var28 = 0.0;
        double var29 = 0.0;
        double var30 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        var22_ref = null;
        var37 = Confined.field_J ? 1 : 0;
        var11 = -((((pm) this).field_D - param4.field_O) / param5) + 1.0;
        var11 = qn.field_v.a(var11, param3 ^ param3, ((pm) this).field_D);
        if (0.0 >= var11) {
          return (sk) (Object) param1.a(0, 65536, 0, 0, -256);
        } else {
          var13 = 4.0;
          var15 = lm.field_a;
          var17 = ke.field_Z;
          var19 = sb.field_g;
          var21 = new vb(param7);
          var22_ref_oi = (oi) (Object) var21.b((rk) (Object) param6, 6);
          L0: while (true) {
            L1: {
              if (var22_ref_oi == null) {
                break L1;
              } else {
                if (var22_ref_oi == ((pm) this).field_v) {
                  break L1;
                } else {
                  L2: {
                    var23 = var22_ref_oi.field_t - ((pm) this).field_E;
                    var25_double = var22_ref_oi.field_o - ((pm) this).field_t;
                    var27_double = -((pm) this).field_D + var22_ref_oi.field_p;
                    var29 = var27_double * var27_double + (var23 * var23 + var25_double * var25_double);
                    var31 = var22_ref_oi.field_u;
                    if (0.01 > var29) {
                      break L2;
                    } else {
                      if (var29 >= var31 * 1e-8 * var31) {
                        L3: {
                          var33 = Math.sqrt(var29);
                          if (!var22_ref_oi.field_w) {
                            break L3;
                          } else {
                            if (this == (Object) (Object) var22_ref_oi.field_r) {
                              break L3;
                            } else {
                              var31 = var31 * (-(var23 * var22_ref_oi.field_m + var22_ref_oi.field_x * var25_double + var27_double * var22_ref_oi.field_v) / var33);
                              if (0.0 < var31 * (-(var23 * var22_ref_oi.field_m + var22_ref_oi.field_x * var25_double + var27_double * var22_ref_oi.field_v) / var33)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        L4: {
                          var35 = var31 / var29;
                          if (var35 <= 16.0) {
                            break L4;
                          } else {
                            var35 = 16.0;
                            break L4;
                          }
                        }
                        var33 = var35 / var33;
                        var13 = var13 + var35;
                        var23 = var23 * var33;
                        var27_double = var27_double * var33;
                        var25_double = var25_double * var33;
                        var19 = var19 + var27_double;
                        var17 = var17 + var25_double;
                        var15 = var15 + var23;
                        break L2;
                      } else {
                        var22_ref_oi = (oi) (Object) var21.b(param3 ^ -109);
                        continue L0;
                      }
                    }
                  }
                  var22_ref_oi = (oi) (Object) var21.b(param3 ^ -109);
                  continue L0;
                }
              }
            }
            L5: {
              var17 = var17 * param0;
              var19 = var19 * param0;
              var15 = var15 * param0;
              var13 = var13 * param0;
              var22 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
              var24 = (int)(var11 * (var22 * 8.0));
              var25 = (int)(var11 * (16.0 + 8.0 * var13));
              if (-257 <= (var24 + var25 ^ -1)) {
                break L5;
              } else {
                var26_int = var25 - var24;
                var27 = 256;
                var25 = (var27 + var26_int) / 2;
                var24 = (var27 - var26_int) / 2;
                break L5;
              }
            }
            if (-1 > (var24 ^ -1)) {
              L6: {
                if (var24 > 1024) {
                  var24 = 1024;
                  break L6;
                } else {
                  break L6;
                }
              }
              var28 = var17 * param2[4] + param2[3] * var15 + var19 * param2[5];
              var30 = param2[8] * var19 + (var15 * param2[6] + var17 * param2[7]);
              var19 = var19 * param2[11] + (param2[9] * var15 + var17 * param2[10]);
              var17 = var30;
              var15 = var28;
              var26 = 256.0 / var22;
              return (sk) (Object) param1.a(var25, 131072 / (3 * var24), (int)(var26 * var15), (int)(var26 * var17), (int)(var19 * var26));
            } else {
              return (sk) (Object) param1.a(var25, 65536, 0, 0, -256);
            }
          }
        }
    }

    abstract void a(hm param0, boolean param1);

    abstract void a(cl param0, byte param1);

    final ka a(int param0, bi param1, double param2, double param3, double param4) {
        if (param0 != -2384) {
            sk discarded$0 = this.a((mn) null, (oi) null, (vg) null, (od) null, (double[]) null, -98, -0.5432285346715034);
        }
        mb var9 = new mb((pm) this, param2, param4, param3, param1);
        ri.a((rk) this, 0, (rk) (Object) var9);
        ((pm) this).field_z = true;
        return (ka) (Object) var9;
    }

    void a(mn param0, byte param1) {
        int var3 = 26 / ((-2 - param1) / 62);
    }

    private final sk a(mn param0, oi param1, vg param2, od param3, double[] param4, int param5, double param6) {
        if (param5 != 3036) {
            ((pm) this).field_t = 1.0649507571035113;
        }
        return this.a(1.0, param3, param4, 2, param2, param6, param1, param0);
    }

    final void a(int param0, nf param1, double param2, vg param3) {
        int var6 = -120 % ((-70 - param0) / 41);
        pa.a(((pm) this).field_E, ((pm) this).field_C, (byte) -11, 256, ((pm) this).field_D, ((pm) this).field_t, param1, param2, param3);
    }

    void a(double param0, byte param1, double param2, double param3) {
        ((pm) this).field_E = ((pm) this).field_E - param0;
        ((pm) this).field_D = ((pm) this).field_D - param2;
        if (param1 != 46) {
            return;
        }
        ((pm) this).field_t = ((pm) this).field_t - param3;
    }

    abstract void a(int param0, mb param1);

    abstract void a(mn param0, double param1, int param2, vg param3, oi param4);

    final void a(nf param0, boolean param1, double param2, vg param3) {
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var21 = 0.0;
        int var23 = 0;
        nf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        nf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        nf stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        nf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        nf stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        nf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        L0: {
          var6 = -param3.field_T + ((pm) this).field_E;
          if (param1) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        L1: {
          var8 = ((pm) this).field_t - param3.field_L;
          var10 = -param3.field_O + ((pm) this).field_D;
          var12 = param3.field_R * var6 + param3.field_ab * var8 + var10 * param3.field_M;
          var14 = var10 * param3.field_F + (var6 * param3.field_V + var8 * param3.field_U);
          var16 = param3.field_N * var10 + (param3.field_H * var8 + var6 * param3.field_P);
          if (0.15 <= var16) {
            L2: {
              var18 = (int)(640.0 * (var12 / var16)) + 320;
              var19 = (int)(640.0 * (var14 / var16)) + 188;
              var20 = (int)(640.0 * (((pm) this).field_C / var16));
              var21 = 512.0 * (1.0 - var10 / param2);
              var23 = (int)qn.field_v.a(var21, 0, ((pm) this).field_D);
              stackOut_4_0 = (nf) param0;
              stackOut_4_1 = -var20 + var18;
              stackOut_4_2 = -var20 + var19;
              stackOut_4_3 = var20 * 2;
              stackOut_4_4 = var20 * 2;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              if ((var23 ^ -1) < -257) {
                stackOut_6_0 = (nf) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = 256;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L2;
              } else {
                stackOut_5_0 = (nf) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = var23;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L2;
              }
            }
            ((nf) (Object) stackIn_7_0).c(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final static fg a(String param0, boolean param1) {
        String var2 = null;
        fg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Confined.field_J ? 1 : 0;
        if (v.field_Db != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var6 = (CharSequence) (Object) param0;
              var2 = hh.a(0, var6);
              if (var2 != null) {
                L0: {
                  var3 = (fg) (Object) v.field_Db.a((long)var2.hashCode(), -1);
                  if (param1) {
                    break L0;
                  } else {
                    field_x = null;
                    break L0;
                  }
                }
                L1: while (true) {
                  if (var3 != null) {
                    var7 = (CharSequence) (Object) var3.field_ob;
                    var4 = hh.a(0, var7);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (fg) (Object) v.field_Db.a(-11);
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract boolean a(boolean param0, pm param1);

    abstract boolean a(pm param0, byte param1);

    void f(byte param0) {
        if (param0 >= -112) {
            field_u = null;
        }
    }

    abstract void a(pm param0, int param1);

    final static bm a(mi param0, String param1, String param2, byte param3) {
        int var4 = param0.a(param3 ^ -12, param1);
        int var5 = param0.a(var4, param2, -91);
        if (param3 != 112) {
            return null;
        }
        return a.a(param0, var4, var5, (byte) -99);
    }

    abstract boolean g(byte param0);

    double j(int param0) {
        if (param0 != -7672) {
            ((pm) this).field_E = 1.278893838032176;
        }
        return 0.0;
    }

    abstract void a(int param0, hf param1);

    public static void e(byte param0) {
        int var1 = 48 % ((param0 - -80) / 43);
        field_w = null;
        field_u = null;
        field_x = null;
        field_B = null;
    }

    abstract boolean f(int param0);

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        if (param0 != 256) {
            ((pm) this).field_y = null;
        }
    }

    void a(int param0, int param1) {
        if (param0 != 11878) {
            ((pm) this).field_E = 1.1697982632706019;
        }
    }

    abstract void a(byte param0, sa param1);

    void h(int param0) {
        if (param0 != 17086) {
            field_u = null;
        }
    }

    void a(dj param0, byte param1) {
        ((pm) this).a(true, (ee) (Object) param0);
        if (param1 != 80) {
            ((pm) this).a(-85, 27);
        }
    }

    void a(int param0, h param1) {
        ((pm) this).a(true, (ee) (Object) param1);
        if (param0 != 640) {
            Object var4 = null;
            ((pm) this).a(107, (od) null, 5, (da) null, -102, (oi) null, -0.8503192618374721, (vg) null, (mn) null);
        }
    }

    pm(hn param0, double param1, double param2, double param3, double param4) {
        ((pm) this).field_z = false;
        ((pm) this).field_A = param0;
        ((pm) this).field_t = param2;
        ((pm) this).field_E = param1;
        ((pm) this).field_C = param4;
        ((pm) this).field_D = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_u = "Brightness: ";
    }
}
