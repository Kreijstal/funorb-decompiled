/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk implements si {
    static int field_d;
    private cf field_e;
    static ei field_a;
    private la field_f;
    private int field_g;
    private un[] field_b;
    private la field_c;
    static int field_h;

    public final un a(int param0, byte param1) {
        if (param1 != 98) {
            return null;
        }
        return ((wk) this).field_b[param0];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var47 = Torquing.field_u;
          var8 = param6;
          var9 = param7;
          var10 = 0;
          var11 = param5 - param0;
          var12 = -param0 + param7;
          var13 = param5 * param5;
          var14 = param7 * param7;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << -1282675551;
          var18 = var13 << -730242783;
          var19 = var16 << 1639087201;
          var20 = var15 << -1084898975;
          var21 = param7 << -1299616831;
          var22 = var12 << 1173889633;
          var23 = var17 + var13 * (-var21 + 1);
          var24 = var14 + -(var18 * (-1 + var21));
          var25 = (1 + -var22) * var15 + var19;
          var26 = -((var22 + -1) * var20) + var16;
          var27 = var13 << -1839832542;
          var28 = var14 << 2062129314;
          var29 = var15 << 476592962;
          var30 = var16 << -1813483454;
          var31 = 3 * var17;
          var32 = (var21 + -3) * var18;
          var33 = var19 * 3;
          var34 = (var22 - 3) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param7);
          var37 = var30;
          var38 = var29 * (-1 + var12);
          if (param3 < j.field_q) {
            break L0;
          } else {
            if (qk.field_p < param3) {
              break L0;
            } else {
              var57 = qd.field_a[param3];
              var40 = ln.a(qg.field_z, kn.field_e, param4 + -param5, 87);
              var41 = ln.a(qg.field_z, kn.field_e, param4 + param5, 105);
              var42 = ln.a(qg.field_z, kn.field_e, param4 + -var11, param6 + 88);
              var43 = ln.a(qg.field_z, kn.field_e, param4 + var11, 85);
              di.a(var40, (byte) 92, param1, var57, var42);
              di.a(var42, (byte) 30, param2, var57, var43);
              di.a(var43, (byte) -125, param1, var57, var41);
              break L0;
            }
          }
        }
        L1: while (true) {
          if ((var9 ^ -1) >= -1) {
            return;
          } else {
            L2: {
              if (var9 > var12) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var39 = stackIn_7_0;
              if (var39 == 0) {
                break L3;
              } else {
                L4: {
                  if (0 <= var25) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if ((var25 ^ -1) <= -1) {
                        break L4;
                      } else {
                        var25 = var25 + var33;
                        var26 = var26 + var37;
                        var33 = var33 + var30;
                        var10++;
                        var37 = var37 + var30;
                        continue L5;
                      }
                    }
                  }
                }
                L6: {
                  if (var26 >= 0) {
                    break L6;
                  } else {
                    var25 = var25 + var33;
                    var26 = var26 + var37;
                    var37 = var37 + var30;
                    var10++;
                    var33 = var33 + var30;
                    break L6;
                  }
                }
                var26 = var26 + -var34;
                var25 = var25 + -var38;
                var38 = var38 - var29;
                var34 = var34 - var29;
                break L3;
              }
            }
            L7: {
              if (var23 >= 0) {
                break L7;
              } else {
                L8: while (true) {
                  if (-1 >= (var23 ^ -1)) {
                    break L7;
                  } else {
                    var24 = var24 + var35;
                    var23 = var23 + var31;
                    var8++;
                    var35 = var35 + var28;
                    var31 = var31 + var28;
                    continue L8;
                  }
                }
              }
            }
            L9: {
              if (0 <= var24) {
                break L9;
              } else {
                var23 = var23 + var31;
                var24 = var24 + var35;
                var31 = var31 + var28;
                var8++;
                var35 = var35 + var28;
                break L9;
              }
            }
            var23 = var23 + -var36;
            var24 = var24 + -var32;
            var36 = var36 - var27;
            var9--;
            var32 = var32 - var27;
            var40 = -var9 + param3;
            var41 = var9 + param3;
            if (j.field_q > var41) {
              continue L1;
            } else {
              if (qk.field_p < var40) {
                continue L1;
              } else {
                var42 = ln.a(qg.field_z, kn.field_e, param4 + var8, 111);
                var43 = ln.a(qg.field_z, kn.field_e, -var8 + param4, 118);
                if (var39 != 0) {
                  L10: {
                    var44 = ln.a(qg.field_z, kn.field_e, var10 + param4, 104);
                    var45 = ln.a(qg.field_z, kn.field_e, -var10 + param4, 70);
                    if (j.field_q <= var40) {
                      var58 = qd.field_a[var40];
                      di.a(var43, (byte) -100, param1, var58, var45);
                      di.a(var45, (byte) 59, param2, var58, var44);
                      di.a(var44, (byte) -115, param1, var58, var42);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (qk.field_p >= var41) {
                    var59 = qd.field_a[var41];
                    di.a(var43, (byte) -111, param1, var59, var45);
                    di.a(var45, (byte) -96, param2, var59, var44);
                    di.a(var44, (byte) -116, param1, var59, var42);
                    continue L1;
                  } else {
                    continue L1;
                  }
                } else {
                  L11: {
                    if (var40 >= j.field_q) {
                      di.a(var43, (byte) 66, param1, qd.field_a[var40], var42);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (qk.field_p < var41) {
                    continue L1;
                  } else {
                    di.a(var43, (byte) 23, param1, qd.field_a[var41], var42);
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, t[] param1, t[] param2, int param3, int param4, int param5, int param6, boolean param7, int param8, int param9, int param10, uc param11, int param12, int param13, uc param14) {
        Object var16 = null;
        pl.a(param12, 0, param4, (t[]) null, param13, param1, cc.field_c, qa.field_l, param14, param2, param3, param11, param0, 0, param9, param6, param10, 480, uf.field_c, param5, 127);
        if (param8 <= 109) {
            return;
        }
        Torquing.a(-49, param7);
    }

    public final boolean a(int param0, int param1) {
        wd var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 3) {
          L0: {
            L1: {
              var3 = ((wk) this).a((byte) 100, param0);
              if (var3 == null) {
                break L1;
              } else {
                if (!var3.a(param1 + 43, ((wk) this).field_c, (si) this)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public final int[] a(byte param0, int param1, boolean param2, float param3, int param4, int param5) {
        if (param0 >= -2) {
            return null;
        }
        return ((wk) this).a((byte) 52, param4).a(((wk) this).field_b[param4].field_e, ((wk) this).field_c, param1, (double)param3, param2, 0, (si) this, param5);
    }

    public static void a(byte param0) {
        if (param0 > -63) {
            Object var2 = null;
            wk.a(102, (t[]) null, (t[]) null, -29, -22, -52, 122, false, 50, -59, -118, (uc) null, -35, 64, (uc) null);
        }
        field_a = null;
    }

    wd a(byte param0, int param1) {
        ta var3 = ((wk) this).field_e.a((long)param1, 4604);
        if (var3 != null) {
            return (wd) (Object) var3;
        }
        byte[] var4 = ((wk) this).field_f.b(param1, (byte) 89);
        if (param0 < 19) {
            un discarded$0 = ((wk) this).a(60, (byte) 74);
        }
        if (var4 == null) {
            return null;
        }
        wd var5 = new wd(new fj(var4));
        ((wk) this).field_e.a((long)param1, (ta) (Object) var5, 0);
        return var5;
    }

    wk(la param0, la param1, la param2) {
        int var5 = 0;
        fj var7 = null;
        un stackIn_10_0 = null;
        un stackIn_11_0 = null;
        un stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        un stackIn_18_0 = null;
        un stackIn_19_0 = null;
        un stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        un stackIn_71_0 = null;
        un stackIn_72_0 = null;
        un stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        un stackOut_70_0 = null;
        un stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        un stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        un stackOut_17_0 = null;
        un stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        un stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        un stackOut_9_0 = null;
        un stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        un stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ((wk) this).field_e = new cf(256);
        ((wk) this).field_c = param2;
        ((wk) this).field_f = param1;
        var7 = new fj(param0.a(0, 100, 0));
        ((wk) this).field_g = var7.i(7088);
        ((wk) this).field_b = new un[((wk) this).field_g];
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((wk) this).field_g) {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((wk) this).field_g) {
                var5 = 0;
                L2: while (true) {
                  if (((wk) this).field_g <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((wk) this).field_g) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= ((wk) this).field_g) {
                            var5 = 0;
                            L5: while (true) {
                              if (((wk) this).field_g <= var5) {
                                var5 = 0;
                                L6: while (true) {
                                  if (((wk) this).field_g <= var5) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (((wk) this).field_g <= var5) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (((wk) this).field_g <= var5) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (var5 >= ((wk) this).field_g) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (((wk) this).field_g <= var5) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (((wk) this).field_g <= var5) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (((wk) this).field_g <= var5) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (((wk) this).field_g <= var5) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (var5 >= ((wk) this).field_g) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (((wk) this).field_g <= var5) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (((wk) this).field_g <= var5) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= ((wk) this).field_g) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= ((wk) this).field_g) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= ((wk) this).field_g) {
                                                                                        return;
                                                                                      } else {
                                                                                        if (((wk) this).field_b[var5] != null) {
                                                                                          ((wk) this).field_b[var5].field_j = var7.i((byte) -101);
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        } else {
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (null != ((wk) this).field_b[var5]) {
                                                                                      int discarded$14 = var7.c((byte) -56);
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    } else {
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (null != ((wk) this).field_b[var5]) {
                                                                                  int discarded$15 = var7.i((byte) -101);
                                                                                  var5++;
                                                                                  continue L17;
                                                                                } else {
                                                                                  var5++;
                                                                                  continue L17;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (null != ((wk) this).field_b[var5]) {
                                                                              int discarded$16 = var7.i((byte) -101);
                                                                              var5++;
                                                                              continue L16;
                                                                            } else {
                                                                              var5++;
                                                                              continue L16;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (null != ((wk) this).field_b[var5]) {
                                                                          int discarded$17 = var7.i((byte) -101);
                                                                          var5++;
                                                                          continue L15;
                                                                        } else {
                                                                          var5++;
                                                                          continue L15;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((wk) this).field_b[var5] != null) {
                                                                      int discarded$18 = var7.i((byte) -101);
                                                                      var5++;
                                                                      continue L14;
                                                                    } else {
                                                                      var5++;
                                                                      continue L14;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((wk) this).field_b[var5] != null) {
                                                                  byte discarded$19 = var7.f((byte) 104);
                                                                  var5++;
                                                                  continue L13;
                                                                } else {
                                                                  var5++;
                                                                  continue L13;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (null != ((wk) this).field_b[var5]) {
                                                              L20: {
                                                                stackOut_70_0 = ((wk) this).field_b[var5];
                                                                stackIn_72_0 = stackOut_70_0;
                                                                stackIn_71_0 = stackOut_70_0;
                                                                if (-2 != (var7.i((byte) -101) ^ -1)) {
                                                                  stackOut_72_0 = (un) (Object) stackIn_72_0;
                                                                  stackOut_72_1 = 0;
                                                                  stackIn_73_0 = stackOut_72_0;
                                                                  stackIn_73_1 = stackOut_72_1;
                                                                  break L20;
                                                                } else {
                                                                  stackOut_71_0 = (un) (Object) stackIn_71_0;
                                                                  stackOut_71_1 = 1;
                                                                  stackIn_73_0 = stackOut_71_0;
                                                                  stackIn_73_1 = stackOut_71_1;
                                                                  break L20;
                                                                }
                                                              }
                                                              stackIn_73_0.field_e = stackIn_73_1 != 0;
                                                              var5++;
                                                              continue L12;
                                                            } else {
                                                              var5++;
                                                              continue L12;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (null != ((wk) this).field_b[var5]) {
                                                          int discarded$20 = var7.i((byte) -101);
                                                          var5++;
                                                          continue L11;
                                                        } else {
                                                          var5++;
                                                          continue L11;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (null != ((wk) this).field_b[var5]) {
                                                      byte discarded$21 = var7.f((byte) 30);
                                                      var5++;
                                                      continue L10;
                                                    } else {
                                                      var5++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (null != ((wk) this).field_b[var5]) {
                                                  byte discarded$22 = var7.f((byte) 93);
                                                  var5++;
                                                  continue L9;
                                                } else {
                                                  var5++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          } else {
                                            if (null != ((wk) this).field_b[var5]) {
                                              ((wk) this).field_b[var5].field_d = (short)var7.i(7088);
                                              var5++;
                                              continue L8;
                                            } else {
                                              var5++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      } else {
                                        if (null != ((wk) this).field_b[var5]) {
                                          byte discarded$23 = var7.f((byte) 73);
                                          var5++;
                                          continue L7;
                                        } else {
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    if (null != ((wk) this).field_b[var5]) {
                                      byte discarded$24 = var7.f((byte) 80);
                                      var5++;
                                      continue L6;
                                    } else {
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                if (null != ((wk) this).field_b[var5]) {
                                  byte discarded$25 = var7.f((byte) 106);
                                  var5++;
                                  continue L5;
                                } else {
                                  var5++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            if (null != ((wk) this).field_b[var5]) {
                              byte discarded$26 = var7.f((byte) 113);
                              var5++;
                              continue L4;
                            } else {
                              var5++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        if (((wk) this).field_b[var5] != null) {
                          int discarded$27 = var7.i((byte) -101);
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (((wk) this).field_b[var5] != null) {
                      L21: {
                        stackOut_17_0 = ((wk) this).field_b[var5];
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (1 != var7.i((byte) -101)) {
                          stackOut_19_0 = (un) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L21;
                        } else {
                          stackOut_18_0 = (un) (Object) stackIn_18_0;
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L21;
                        }
                      }
                      stackIn_20_0.field_h = stackIn_20_1 != 0;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((wk) this).field_b[var5] != null) {
                  L22: {
                    stackOut_9_0 = ((wk) this).field_b[var5];
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (-1 != (var7.i((byte) -101) ^ -1)) {
                      stackOut_11_0 = (un) (Object) stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L22;
                    } else {
                      stackOut_10_0 = (un) (Object) stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L22;
                    }
                  }
                  stackIn_12_0.field_g = stackIn_12_1 != 0;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            if (1 == var7.i((byte) -101)) {
              ((wk) this).field_b[var5] = new un();
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_a = new ei();
    }
}
