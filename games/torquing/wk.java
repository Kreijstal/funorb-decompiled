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
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var47 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var8_int = 0;
              var9 = param7;
              var10 = 0;
              var11 = param5 - param0;
              var12 = -param0 + param7;
              var13 = param5 * param5;
              var14 = param7 * param7;
              var15 = var11 * var11;
              var16 = var12 * var12;
              var17 = var14 << 1;
              var18 = var13 << 1;
              var19 = var16 << 1;
              var20 = var15 << 1;
              var21 = param7 << 1;
              var22 = var12 << 1;
              var23 = var17 + var13 * (-var21 + 1);
              var24 = var14 + -(var18 * (-1 + var21));
              var25 = (1 + -var22) * var15 + var19;
              var26 = -((var22 + -1) * var20) + var16;
              var27 = var13 << 2;
              var28 = var14 << 2;
              var29 = var15 << 2;
              var30 = var16 << 2;
              var31 = 3 * var17;
              var32 = (var21 + -3) * var18;
              var33 = var19 * 3;
              var34 = (var22 - 3) * var20;
              var35 = var28;
              var36 = var27 * (-1 + param7);
              var37 = var30;
              var38 = var29 * (-1 + var12);
              if (param3 < j.field_q) {
                break L1;
              } else {
                if (qk.field_p < param3) {
                  break L1;
                } else {
                  var57 = qd.field_a[param3];
                  var40 = ln.a(qg.field_z, kn.field_e, param4 + -param5, 87);
                  var41 = ln.a(qg.field_z, kn.field_e, param4 + param5, 105);
                  var42 = ln.a(qg.field_z, kn.field_e, param4 + -var11, 88);
                  var43 = ln.a(qg.field_z, kn.field_e, param4 + var11, 85);
                  di.a(var40, (byte) 92, param1, var57, var42);
                  di.a(var42, (byte) 30, param2, var57, var43);
                  di.a(var43, (byte) -125, param1, var57, var41);
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (var9 <= 0) {
                break L0;
              } else {
                L3: {
                  if (var9 > var12) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var39 = stackIn_8_0;
                  if (var39 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (0 <= var25) {
                        break L5;
                      } else {
                        L6: while (true) {
                          if (var25 >= 0) {
                            break L5;
                          } else {
                            var25 = var25 + var33;
                            var26 = var26 + var37;
                            var33 = var33 + var30;
                            var10++;
                            var37 = var37 + var30;
                            continue L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (var26 >= 0) {
                        break L7;
                      } else {
                        var25 = var25 + var33;
                        var26 = var26 + var37;
                        var37 = var37 + var30;
                        var10++;
                        var33 = var33 + var30;
                        break L7;
                      }
                    }
                    var26 = var26 + -var34;
                    var25 = var25 + -var38;
                    var38 = var38 - var29;
                    var34 = var34 - var29;
                    break L4;
                  }
                }
                L8: {
                  if (var23 >= 0) {
                    break L8;
                  } else {
                    L9: while (true) {
                      if (var23 >= 0) {
                        break L8;
                      } else {
                        var24 = var24 + var35;
                        var23 = var23 + var31;
                        var8_int++;
                        var35 = var35 + var28;
                        var31 = var31 + var28;
                        continue L9;
                      }
                    }
                  }
                }
                L10: {
                  if (0 <= var24) {
                    break L10;
                  } else {
                    var23 = var23 + var31;
                    var24 = var24 + var35;
                    var31 = var31 + var28;
                    var8_int++;
                    var35 = var35 + var28;
                    break L10;
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
                  continue L2;
                } else {
                  if (qk.field_p < var40) {
                    continue L2;
                  } else {
                    var42 = ln.a(qg.field_z, kn.field_e, param4 + var8_int, 111);
                    var43 = ln.a(qg.field_z, kn.field_e, -var8_int + param4, 118);
                    if (var39 != 0) {
                      L11: {
                        var44 = ln.a(qg.field_z, kn.field_e, var10 + param4, 104);
                        var45 = ln.a(qg.field_z, kn.field_e, -var10 + param4, 70);
                        if (j.field_q <= var40) {
                          var58 = qd.field_a[var40];
                          di.a(var43, (byte) -100, param1, var58, var45);
                          di.a(var45, (byte) 59, param2, var58, var44);
                          di.a(var44, (byte) -115, param1, var58, var42);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (qk.field_p >= var41) {
                        var59 = qd.field_a[var41];
                        di.a(var43, (byte) -111, param1, var59, var45);
                        di.a(var45, (byte) -96, param2, var59, var44);
                        di.a(var44, (byte) -116, param1, var59, var42);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    } else {
                      L12: {
                        if (var40 >= j.field_q) {
                          di.a(var43, (byte) 66, param1, qd.field_a[var40], var42);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (qk.field_p < var41) {
                        continue L2;
                      } else {
                        di.a(var43, (byte) 23, param1, qd.field_a[var41], var42);
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var8, "wk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + 0 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, t[] param1, t[] param2, int param3, int param4, int param5, int param6, boolean param7, int param8, int param9, int param10, uc param11, int param12, int param13, uc param14) {
        Object var16 = null;
        pl.a(param12, 0, param4, (t[]) null, param13, param1, cc.field_c, qa.field_l, param14, param2, 0, param11, 0, 0, 240, param6, 0, 480, uf.field_c, 320, 127);
        try {
            Torquing.a(-49, param7);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "wk.G(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 0 + ',' + param4 + ',' + 320 + ',' + param6 + ',' + param7 + ',' + 112 + ',' + 240 + ',' + 0 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
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
        RuntimeException var4 = null;
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
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        ((wk) this).field_e = new cf(256);
        try {
          L0: {
            ((wk) this).field_c = param2;
            ((wk) this).field_f = param1;
            var7 = new fj(param0.a(0, 100, 0));
            ((wk) this).field_g = var7.i(7088);
            ((wk) this).field_b = new un[((wk) this).field_g];
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((wk) this).field_g) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((wk) this).field_g) {
                    var5 = 0;
                    L3: while (true) {
                      if (((wk) this).field_g <= var5) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= ((wk) this).field_g) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((wk) this).field_g) {
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
                                              if (((wk) this).field_g <= var5) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (var5 >= ((wk) this).field_g) {
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
                                                                  if (((wk) this).field_g <= var5) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (var5 >= ((wk) this).field_g) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (((wk) this).field_g <= var5) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (((wk) this).field_g <= var5) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= ((wk) this).field_g) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (var5 >= ((wk) this).field_g) {
                                                                                        var5 = 0;
                                                                                        L20: while (true) {
                                                                                          if (var5 >= ((wk) this).field_g) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L21: {
                                                                                              if (((wk) this).field_b[var5] == null) {
                                                                                                break L21;
                                                                                              } else {
                                                                                                ((wk) this).field_b[var5].field_j = var7.i((byte) -101);
                                                                                                break L21;
                                                                                              }
                                                                                            }
                                                                                            var5++;
                                                                                            continue L20;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (null == ((wk) this).field_b[var5]) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            int discarded$14 = var7.c((byte) -56);
                                                                                            break L22;
                                                                                          }
                                                                                        }
                                                                                        var5++;
                                                                                        continue L19;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L23: {
                                                                                      if (null == ((wk) this).field_b[var5]) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        int discarded$15 = var7.i((byte) -101);
                                                                                        break L23;
                                                                                      }
                                                                                    }
                                                                                    var5++;
                                                                                    continue L18;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L24: {
                                                                                  if (null == ((wk) this).field_b[var5]) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    int discarded$16 = var7.i((byte) -101);
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                var5++;
                                                                                continue L17;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L25: {
                                                                              if (null == ((wk) this).field_b[var5]) {
                                                                                break L25;
                                                                              } else {
                                                                                int discarded$17 = var7.i((byte) -101);
                                                                                break L25;
                                                                              }
                                                                            }
                                                                            var5++;
                                                                            continue L16;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L26: {
                                                                          if (((wk) this).field_b[var5] == null) {
                                                                            break L26;
                                                                          } else {
                                                                            int discarded$18 = var7.i((byte) -101);
                                                                            break L26;
                                                                          }
                                                                        }
                                                                        var5++;
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L27: {
                                                                      if (((wk) this).field_b[var5] == null) {
                                                                        break L27;
                                                                      } else {
                                                                        byte discarded$19 = var7.f((byte) 104);
                                                                        break L27;
                                                                      }
                                                                    }
                                                                    var5++;
                                                                    continue L14;
                                                                  }
                                                                }
                                                              } else {
                                                                L28: {
                                                                  if (null == ((wk) this).field_b[var5]) {
                                                                    break L28;
                                                                  } else {
                                                                    L29: {
                                                                      stackOut_70_0 = ((wk) this).field_b[var5];
                                                                      stackIn_72_0 = stackOut_70_0;
                                                                      stackIn_71_0 = stackOut_70_0;
                                                                      if (var7.i((byte) -101) != 1) {
                                                                        stackOut_72_0 = (un) (Object) stackIn_72_0;
                                                                        stackOut_72_1 = 0;
                                                                        stackIn_73_0 = stackOut_72_0;
                                                                        stackIn_73_1 = stackOut_72_1;
                                                                        break L29;
                                                                      } else {
                                                                        stackOut_71_0 = (un) (Object) stackIn_71_0;
                                                                        stackOut_71_1 = 1;
                                                                        stackIn_73_0 = stackOut_71_0;
                                                                        stackIn_73_1 = stackOut_71_1;
                                                                        break L29;
                                                                      }
                                                                    }
                                                                    stackIn_73_0.field_e = stackIn_73_1 != 0;
                                                                    break L28;
                                                                  }
                                                                }
                                                                var5++;
                                                                continue L13;
                                                              }
                                                            }
                                                          } else {
                                                            L30: {
                                                              if (null == ((wk) this).field_b[var5]) {
                                                                break L30;
                                                              } else {
                                                                int discarded$20 = var7.i((byte) -101);
                                                                break L30;
                                                              }
                                                            }
                                                            var5++;
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        L31: {
                                                          if (null == ((wk) this).field_b[var5]) {
                                                            break L31;
                                                          } else {
                                                            byte discarded$21 = var7.f((byte) 30);
                                                            break L31;
                                                          }
                                                        }
                                                        var5++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    L32: {
                                                      if (null == ((wk) this).field_b[var5]) {
                                                        break L32;
                                                      } else {
                                                        byte discarded$22 = var7.f((byte) 93);
                                                        break L32;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                L33: {
                                                  if (null == ((wk) this).field_b[var5]) {
                                                    break L33;
                                                  } else {
                                                    ((wk) this).field_b[var5].field_d = (short)var7.i(7088);
                                                    break L33;
                                                  }
                                                }
                                                var5++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            L34: {
                                              if (null == ((wk) this).field_b[var5]) {
                                                break L34;
                                              } else {
                                                byte discarded$23 = var7.f((byte) 73);
                                                break L34;
                                              }
                                            }
                                            var5++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L35: {
                                          if (null == ((wk) this).field_b[var5]) {
                                            break L35;
                                          } else {
                                            byte discarded$24 = var7.f((byte) 80);
                                            break L35;
                                          }
                                        }
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    L36: {
                                      if (null == ((wk) this).field_b[var5]) {
                                        break L36;
                                      } else {
                                        byte discarded$25 = var7.f((byte) 106);
                                        break L36;
                                      }
                                    }
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L37: {
                                  if (null == ((wk) this).field_b[var5]) {
                                    break L37;
                                  } else {
                                    byte discarded$26 = var7.f((byte) 113);
                                    break L37;
                                  }
                                }
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            L38: {
                              if (((wk) this).field_b[var5] == null) {
                                break L38;
                              } else {
                                int discarded$27 = var7.i((byte) -101);
                                break L38;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L39: {
                          if (((wk) this).field_b[var5] == null) {
                            break L39;
                          } else {
                            L40: {
                              stackOut_17_0 = ((wk) this).field_b[var5];
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (1 != var7.i((byte) -101)) {
                                stackOut_19_0 = (un) (Object) stackIn_19_0;
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L40;
                              } else {
                                stackOut_18_0 = (un) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L40;
                              }
                            }
                            stackIn_20_0.field_h = stackIn_20_1 != 0;
                            break L39;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L41: {
                      if (((wk) this).field_b[var5] == null) {
                        break L41;
                      } else {
                        L42: {
                          stackOut_9_0 = ((wk) this).field_b[var5];
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var7.i((byte) -101) != 0) {
                            stackOut_11_0 = (un) (Object) stackIn_11_0;
                            stackOut_11_1 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L42;
                          } else {
                            stackOut_10_0 = (un) (Object) stackIn_10_0;
                            stackOut_10_1 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L42;
                          }
                        }
                        stackIn_12_0.field_g = stackIn_12_1 != 0;
                        break L41;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L43: {
                  if (1 != var7.i((byte) -101)) {
                    break L43;
                  } else {
                    ((wk) this).field_b[var5] = new un();
                    break L43;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L44: {
            var4 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) var4;
            stackOut_111_1 = new StringBuilder().append("wk.<init>(");
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param0 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L44;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L44;
            }
          }
          L45: {
            stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',');
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param1 == null) {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L45;
            } else {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L45;
            }
          }
          L46: {
            stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param2 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L46;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L46;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + ')');
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
