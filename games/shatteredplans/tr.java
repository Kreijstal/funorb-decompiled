/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tr extends ia {
    private bi[] field_Mb;
    private om field_K;
    static String field_zb;
    boolean field_Bb;
    boolean field_Gb;
    private double field_wb;
    private int[] field_tb;
    private om field_ob;
    static String field_Fb;
    private om[][] field_qb;
    private bi[] field_Kb;
    boolean field_Ab;
    private int field_yb;
    private om field_Cb;
    mg field_rb;
    private double field_Nb;
    private int field_Hb;
    private double field_Jb;
    private mg field_Db;
    private int[][] field_Qb;
    static pf field_vb;
    private om field_Ib;
    int[] field_nb;
    static ej[] field_Eb;
    private bi[] field_xb;
    private om field_Ob;
    private int[] field_ub;
    static bi[] field_sb;
    static String field_Pb;
    static String field_pb;
    static int field_Lb;

    private final void c(ln param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              this.b(param0, true);
              this.e(param0, -29952);
              this.b(param0, -29496);
              if (((tr) this).field_I >= 1024.0f) {
                break L1;
              } else {
                this.d(param0, 10);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("tr.GA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 2 + 41);
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        ln[] var8 = null;
        ln var9 = null;
        ln[] var10 = null;
        ln var11 = null;
        bh var12 = null;
        ln[] var13 = null;
        ln var14 = null;
        bh var15 = null;
        ln[] var16 = null;
        ln var17 = null;
        bh var18 = null;
        ln[] var19 = null;
        ln var20 = null;
        bh var21 = null;
        ln[] var22 = null;
        ln var23 = null;
        ln[] var24 = null;
        ln var25 = null;
        bh var26 = null;
        ln[] var27 = null;
        ln var28 = null;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((tr) this).field_I <= 1024.0f) {
            var19 = ((tr) this).field_O.field_e;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var19.length) {
                L2: {
                  if (1024.0f > ((tr) this).field_I) {
                    var22 = ((tr) this).field_O.field_e;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var22.length) {
                        break L2;
                      } else {
                        var23 = var22[var3];
                        var28 = var23;
                        var28 = var23;
                        this.a(false, var23, -67);
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var24 = ((tr) this).field_O.field_e;
                var3 = 0;
                L4: while (true) {
                  if (var24.length <= var3) {
                    L5: {
                      if (1024.0f > ((tr) this).field_I) {
                        var27 = ((tr) this).field_O.field_e;
                        var3 = 0;
                        L6: while (true) {
                          if (var27.length <= var3) {
                            break L5;
                          } else {
                            var28 = var27[var3];
                            this.a(true, var28, 127);
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    this.h(-52);
                    this.i(92);
                    break L0;
                  } else {
                    var25 = var24[var3];
                    var28 = var25;
                    var28 = var25;
                    var26 = ((tr) this).field_h[var25.field_p];
                    if (var26.field_l <= 640) {
                      if (480 >= var26.field_q) {
                        if (var26.field_o >= 0) {
                          if (0 <= var26.field_i) {
                            this.c(var25, 2);
                            if (((tr) this).field_I > 330.0f) {
                              if (var25.field_u) {
                                this.a(var25, (byte) 102);
                                var3++;
                                continue L4;
                              } else {
                                var3++;
                                continue L4;
                              }
                            } else {
                              var3++;
                              continue L4;
                            }
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                var20 = var19[var3];
                var23 = var20;
                var28 = var23;
                var23 = var20;
                var21 = ((tr) this).field_h[var20.field_p];
                if (var21.field_l <= 640) {
                  if (var21.field_q <= 480) {
                    if (var21.field_o >= 0) {
                      if (var21.field_i >= 0) {
                        this.b(0, var20);
                        ((tr) this).a(-91, var20);
                        if (((tr) this).field_I < 330.0f) {
                          if (var20.field_u) {
                            this.a(var20, (byte) 101);
                            var3++;
                            continue L1;
                          } else {
                            var3++;
                            continue L1;
                          }
                        } else {
                          var3++;
                          continue L1;
                        }
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            var2 = 0;
            var8 = ((tr) this).field_O.field_e;
            var4 = 0;
            L7: while (true) {
              if (var8.length <= var4) {
                var10 = ((tr) this).field_O.field_e;
                var4 = 0;
                L8: while (true) {
                  if (var10.length <= var4) {
                    this.h(-90);
                    var13 = ((tr) this).field_O.field_e;
                    var4 = 0;
                    L9: while (true) {
                      if (var4 >= var13.length) {
                        var16 = ((tr) this).field_O.field_e;
                        var4 = 0;
                        L10: while (true) {
                          if (var16.length <= var4) {
                            this.i(92);
                            break L0;
                          } else {
                            var17 = var16[var4];
                            var20 = var17;
                            var23 = var20;
                            var28 = var23;
                            var20 = var17;
                            var18 = ((tr) this).field_h[var17.field_p];
                            if (var18.field_l <= 640) {
                              if (-481 <= var18.field_q) {
                                if (0 <= var18.field_o) {
                                  if (-1 <= var18.field_i) {
                                    this.a(false, var17, -128);
                                    var4++;
                                    continue L10;
                                  } else {
                                    var4++;
                                    continue L10;
                                  }
                                } else {
                                  var4++;
                                  continue L10;
                                }
                              } else {
                                var4++;
                                continue L10;
                              }
                            } else {
                              var4++;
                              continue L10;
                            }
                          }
                        }
                      } else {
                        var14 = var13[var4];
                        var17 = var14;
                        var20 = var17;
                        var23 = var20;
                        var17 = var14;
                        var15 = ((tr) this).field_h[var14.field_p];
                        if (var15.field_l <= 640) {
                          if (var15.field_q <= 480) {
                            if (var15.field_o >= 0) {
                              if (0 <= var15.field_i) {
                                rs.field_Cb.c(Integer.toString(((tr) this).field_eb[var14.field_p]), ((tr) this).field_i[var14.field_p] + -1, ((tr) this).field_J[var14.field_p] - -3, 16777215, -1);
                                var4++;
                                continue L9;
                              } else {
                                var4++;
                                continue L9;
                              }
                            } else {
                              var4++;
                              continue L9;
                            }
                          } else {
                            var4++;
                            continue L9;
                          }
                        } else {
                          var4++;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    var11 = var10[var4];
                    var17 = var11;
                    var20 = var17;
                    var23 = var20;
                    var17 = var11;
                    var12 = ((tr) this).field_h[var11.field_p];
                    if (-641 <= var12.field_l) {
                      if (480 >= var12.field_q) {
                        if (-1 <= var12.field_o) {
                          if (var12.field_i >= 0) {
                            this.a(11746, var11, var2);
                            if (var11.field_u) {
                              this.a(var11, (byte) 99);
                              var4++;
                              continue L8;
                            } else {
                              var4++;
                              continue L8;
                            }
                          } else {
                            var4++;
                            continue L8;
                          }
                        } else {
                          var4++;
                          continue L8;
                        }
                      } else {
                        var4++;
                        continue L8;
                      }
                    } else {
                      var4++;
                      continue L8;
                    }
                  }
                }
              } else {
                var9 = var8[var4];
                var11 = var9;
                var17 = var11;
                var11 = var9;
                if (var9.field_J > var2) {
                  var2 = var9.field_J;
                  var4++;
                  continue L7;
                } else {
                  var4++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    private final mg a(ln param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        mg var6 = null;
        int var6_int = 0;
        mg var7_ref_mg = null;
        int var7 = 0;
        boolean[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        ln var10 = null;
        double var11_double = 0.0;
        ln var11 = null;
        int var12 = 0;
        double var13_double = 0.0;
        int var13 = 0;
        int var14 = 0;
        double var15_double = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        boolean[] var33 = null;
        int[] var34 = null;
        boolean[] var35 = null;
        int[] var36 = null;
        boolean[] var37 = null;
        int[] var38 = null;
        boolean[] var39 = null;
        mg stackIn_10_0 = null;
        Object stackIn_20_0 = null;
        mg stackIn_40_0 = null;
        mg stackIn_44_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg stackOut_9_0 = null;
        mg stackOut_39_0 = null;
        mg stackOut_43_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var31 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (1024.0f < ((tr) this).field_I) {
            var7_ref_mg = (mg) (Object) param0.field_s.c(-127);
            L0: while (true) {
              if (var7_ref_mg != null) {
                L1: {
                  if (((tr) this).field_B != var7_ref_mg.field_G) {
                    break L1;
                  } else {
                    var6_int = (((tr) this).field_J[var7_ref_mg.field_y.field_p] + ((tr) this).field_J[var7_ref_mg.field_B.field_p]) / 2;
                    var5_int = (((tr) this).field_i[var7_ref_mg.field_B.field_p] + ((tr) this).field_i[var7_ref_mg.field_y.field_p]) / 2;
                    if ((-var5_int + param1) * (param1 - var5_int) + (-var6_int + param2) * (param2 + -var6_int) < 81) {
                      ((tr) this).field_nb[1] = var6_int;
                      ((tr) this).field_nb[0] = var5_int;
                      stackOut_9_0 = (mg) var7_ref_mg;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      break L1;
                    }
                  }
                }
                var7_ref_mg = (mg) (Object) param0.field_s.b(32);
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            var5_int = 0;
            var6 = (mg) (Object) param0.field_s.c(-127);
            L2: while (true) {
              if (var6 == null) {
                if (0 != var5_int) {
                  L3: {
                    if (((tr) this).field_I >= 330.0f) {
                      var7 = 12 * ((-1 + var5_int) / 12 + 1);
                      break L3;
                    } else {
                      var7 = 12 * ((-1 + var5_int) / 11 + 1);
                      break L3;
                    }
                  }
                  var39 = new boolean[var7];
                  var37 = var39;
                  var35 = var37;
                  var33 = var35;
                  var8 = var33;
                  var38 = new int[var7 * 2];
                  var36 = var38;
                  var34 = var36;
                  var32 = var34;
                  var9 = var32;
                  var10_int = 0;
                  L4: while (true) {
                    if (var10_int >= var7) {
                      var6 = (mg) (Object) param0.field_s.c(-127);
                      L5: while (true) {
                        if (var6 != null) {
                          L6: {
                            if (var6.field_G != ((tr) this).field_B) {
                              break L6;
                            } else {
                              L7: {
                                var10 = var6.field_y;
                                var11 = var6.field_B;
                                var12 = var10.field_p;
                                var13 = var11.field_p;
                                var14 = ((tr) this).field_i[var12];
                                var15 = ((tr) this).field_J[var12];
                                var16 = ((tr) this).field_i[var13];
                                var17 = ((tr) this).field_J[var13];
                                var20 = Math.sqrt((double)((-var15 + var17) * (-var15 + var17) + (-var14 + var16) * (var16 - var14)));
                                var22 = (double)(var16 + -var14) / var20;
                                var24 = (double)(var17 - var15) / var20;
                                var18 = var16 - (int)(var22 * (((tr) this).field_Jb * 150.0));
                                var19 = -(int)(((tr) this).field_Jb * 150.0 * var24) + var17;
                                var26 = this.a(var18, var38, var39, var15, var24, (byte) -55, var19, var14, var22);
                                var19 = var9[2 * var26 + 1];
                                var18 = var9[var26 * 2];
                                if (((tr) this).field_I >= 700.0f) {
                                  break L7;
                                } else {
                                  if (var7 > 12) {
                                    break L7;
                                  } else {
                                    if (fj.field_p.field_w * fj.field_p.field_w / 4 < (-var18 + param1) * (-var18 + param1) - -((-var19 + param2) * (-var19 + param2))) {
                                      break L6;
                                    } else {
                                      ((tr) this).field_nb[0] = var18;
                                      ((tr) this).field_nb[1] = var19;
                                      stackOut_39_0 = (mg) var6;
                                      stackIn_40_0 = stackOut_39_0;
                                      return stackIn_40_0;
                                    }
                                  }
                                }
                              }
                              var27 = var14 - -(int)((double)((tr) this).field_Hb * var22);
                              var28 = var15 + (int)((double)((tr) this).field_Hb * var24);
                              var29 = (var18 - -var27) / 2;
                              var30 = (var28 + var19) / 2;
                              var20 = Math.sqrt((double)((var28 + -var19) * (-var19 + var28) + (var27 - var18) * (-var18 + var27)));
                              var29 = (int)((double)var29 + -var24 * var20 / 10.0);
                              var30 = (int)((double)var30 + var22 * var20 / 10.0);
                              if ((-var30 + param2) * (param2 + -var30) + (-var29 + param1) * (-var29 + param1) < 81) {
                                ((tr) this).field_nb[0] = var29;
                                ((tr) this).field_nb[1] = var30;
                                stackOut_43_0 = (mg) var6;
                                stackIn_44_0 = stackOut_43_0;
                                return stackIn_44_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var6 = (mg) (Object) param0.field_s.b(32);
                          continue L5;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      L8: {
                        var11_double = (double)(var10_int * 2) * 3.141592653589793 / (double)var7;
                        if (((tr) this).field_I >= 330.0f) {
                          break L8;
                        } else {
                          if (4.4505895925855405 > var11_double) {
                            break L8;
                          } else {
                            if (var11_double > 4.97418836818384) {
                              break L8;
                            } else {
                              var8[var10_int] = true;
                              var9[2 * var10_int] = -1;
                              var9[1 + 2 * var10_int] = -1;
                              break L8;
                            }
                          }
                        }
                      }
                      var13_double = Math.sin(var11_double);
                      var15_double = Math.cos(var11_double);
                      var9[var10_int * 2] = (int)(var15_double * (150.0 * ((tr) this).field_wb)) + ((tr) this).field_i[param0.field_p];
                      var9[var10_int * 2 + 1] = (int)(150.0 * ((tr) this).field_wb * var13_double) + ((tr) this).field_J[param0.field_p];
                      var10_int++;
                      continue L4;
                    }
                  }
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (mg) (Object) stackIn_20_0;
                }
              } else {
                L9: {
                  if (var6.field_G != ((tr) this).field_B) {
                    break L9;
                  } else {
                    var5_int++;
                    break L9;
                  }
                }
                var6 = (mg) (Object) param0.field_s.b(32);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5;
            stackOut_47_1 = new StringBuilder().append("tr.DA(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L10;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param1 + 44 + param2 + 44 + -1 + 41);
        }
    }

    public static void g(int param0) {
        field_Fb = null;
        field_Eb = null;
        field_zb = null;
        field_pb = null;
        field_Pb = null;
        field_vb = null;
        field_sb = null;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        mg var3_ref_mg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[] var7_ref_boolean__ = null;
        double var8 = 0.0;
        int[] var8_ref_int__ = null;
        int var8_int = 0;
        int var9_int = 0;
        double var9 = 0.0;
        ln var9_ref_ln = null;
        double var10_double = 0.0;
        ln var10 = null;
        double var11 = 0.0;
        int var11_int = 0;
        double var12_double = 0.0;
        int var12 = 0;
        double var13 = 0.0;
        int var13_int = 0;
        double var14_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        double var17_double = 0.0;
        double var18_double = 0.0;
        int var18 = 0;
        double var19_double = 0.0;
        int var19 = 0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int[] var26 = null;
        boolean[] var27 = null;
        int[] var28 = null;
        boolean[] var29 = null;
        int[] var30 = null;
        boolean[] var31 = null;
        int[] var32 = null;
        boolean[] var33 = null;
        L0: {
          var24 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 92) {
            break L0;
          } else {
            var25 = null;
            this.b((ln) null, -92);
            break L0;
          }
        }
        if (((tr) this).field_rb == null) {
          return;
        } else {
          L1: {
            if (((tr) this).field_I > 1024.0f) {
              L2: {
                var2 = ((tr) this).field_ub[0];
                var3 = ((tr) this).field_ub[1];
                var3--;
                var4 = ((tr) this).field_i[((tr) this).field_rb.field_B.field_p] + -((tr) this).field_i[((tr) this).field_rb.field_y.field_p];
                var5 = ((tr) this).field_J[((tr) this).field_rb.field_B.field_p] + -((tr) this).field_J[((tr) this).field_rb.field_y.field_p];
                var6 = 0;
                if (var4 == 0) {
                  if (var5 > 0) {
                    var6 = 49152;
                    break L2;
                  } else {
                    var6 = 16384;
                    break L2;
                  }
                } else {
                  if (0 != var5) {
                    L3: {
                      var7 = var5;
                      var8 = Math.sqrt((double)(var4 * var4 - -(var5 * var5)));
                      if (0 > var7) {
                        var7 = -var7;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6 = (int)(Math.asin((double)var7 / var8) * 32768.0 / 3.141592653589793);
                    if (var4 >= 0) {
                      if (0 < var5) {
                        var6 = 65536 + -var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (var5 >= 0) {
                        var6 = var6 + 32768;
                        break L2;
                      } else {
                        var6 = -var6 + 32768;
                        break L2;
                      }
                    }
                  } else {
                    if (var4 > 0) {
                      var6 = 0;
                      break L2;
                    } else {
                      var6 = 32768;
                      break L2;
                    }
                  }
                }
              }
              gf.b(var2, var3, 30, 16777215);
              gf.c(var2, var3, 30, 16777215, 92);
              ie.a((om) (Object) ((tr) this).field_B.field_n, fj.field_p.field_z << 3, fj.field_p.field_w << 3, var2 * 16, 16 * var3, var6 + -16384, 4096);
              gf.c(var2, var3, 9, 0, 92);
              rs.field_Cb.c(Integer.toString(((tr) this).field_rb.field_z), var2, 4 + var3, 16777215, -1);
              di.field_i[0].f(var2 + (30 - di.field_i[0].field_z / 2), -(di.field_i[0].field_w / 2) + var3);
              di.field_i[1].f(-(di.field_i[0].field_z / 2) + (var2 - 30), var3 + -(di.field_i[0].field_w / 2));
              di.field_i[2].f(var2 - di.field_i[0].field_z / 2, -(di.field_i[0].field_w / 2) + 30 + var3);
              break L1;
            } else {
              var2 = 0;
              var3_ref_mg = (mg) (Object) ((tr) this).field_rb.field_B.field_s.c(-127);
              L4: while (true) {
                if (var3_ref_mg == null) {
                  if (0 != var2) {
                    L5: {
                      if (330.0f > ((tr) this).field_I) {
                        var4 = 12 * ((-1 + var2) / 11) + 12;
                        break L5;
                      } else {
                        var4 = 12 + (-1 + var2) / 12 * 12;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        var5 = 0;
                        var6 = 0;
                        if (700.0f <= ((tr) this).field_I) {
                          break L7;
                        } else {
                          if (var4 > 12) {
                            break L7;
                          } else {
                            var5 = ((tr) this).field_ub[0];
                            var6 = ((tr) this).field_ub[1];
                            break L6;
                          }
                        }
                      }
                      var33 = new boolean[var4];
                      var31 = var33;
                      var29 = var31;
                      var27 = var29;
                      var7_ref_boolean__ = var27;
                      var32 = new int[2 * var4];
                      var30 = var32;
                      var28 = var30;
                      var26 = var28;
                      var8_ref_int__ = var26;
                      var9_int = 0;
                      L8: while (true) {
                        if (~var4 >= ~var9_int) {
                          var3_ref_mg = (mg) (Object) ((tr) this).field_rb.field_B.field_s.c(-128);
                          L9: while (true) {
                            if (var3_ref_mg == null) {
                              break L6;
                            } else {
                              L10: {
                                if (var3_ref_mg.field_G != ((tr) this).field_B) {
                                  break L10;
                                } else {
                                  var9_ref_ln = var3_ref_mg.field_y;
                                  var10 = var3_ref_mg.field_B;
                                  var11_int = var9_ref_ln.field_p;
                                  var12 = var10.field_p;
                                  var13_int = ((tr) this).field_i[var11_int];
                                  var14 = ((tr) this).field_J[var11_int];
                                  var15 = ((tr) this).field_i[var12];
                                  var16 = ((tr) this).field_J[var12];
                                  var17_double = Math.sqrt((double)((var16 + -var14) * (var16 + -var14) + (-var13_int + var15) * (var15 - var13_int)));
                                  var19_double = (double)(var15 - var13_int) / var17_double;
                                  var5 = var15 - (int)(var19_double * (150.0 * ((tr) this).field_Jb));
                                  var21 = (double)(var16 + -var14) / var17_double;
                                  var6 = var16 - (int)(((tr) this).field_Jb * 150.0 * var21);
                                  var23 = this.a(var5, var32, var33, var14, var21, (byte) -52, var6, var13_int, var19_double);
                                  var5 = var8_ref_int__[var23 * 2];
                                  var6 = var8_ref_int__[var23 * 2 + 1];
                                  if (var3_ref_mg != ((tr) this).field_rb) {
                                    break L10;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var3_ref_mg = (mg) (Object) ((tr) this).field_rb.field_B.field_s.b(32);
                              continue L9;
                            }
                          }
                        } else {
                          L11: {
                            var10_double = 3.141592653589793 * (double)(var9_int * 2) / (double)var4;
                            if (((tr) this).field_I >= 330.0f) {
                              break L11;
                            } else {
                              if (4.4505895925855405 > var10_double) {
                                break L11;
                              } else {
                                if (4.97418836818384 < var10_double) {
                                  break L11;
                                } else {
                                  var7_ref_boolean__[var9_int] = true;
                                  var8_ref_int__[var9_int * 2] = -1;
                                  var8_ref_int__[var9_int * 2 + 1] = -1;
                                  break L11;
                                }
                              }
                            }
                          }
                          var12_double = Math.sin(var10_double);
                          var14_double = Math.cos(var10_double);
                          var8_ref_int__[2 * var9_int] = (int)(150.0 * ((tr) this).field_wb * var14_double) + ((tr) this).field_i[((tr) this).field_rb.field_B.field_p];
                          var8_ref_int__[1 + var9_int * 2] = (int)(150.0 * ((tr) this).field_wb * var12_double) + ((tr) this).field_J[((tr) this).field_rb.field_B.field_p];
                          var9_int++;
                          continue L8;
                        }
                      }
                    }
                    L12: {
                      var7 = ((tr) this).field_i[((tr) this).field_rb.field_y.field_p];
                      var8_int = ((tr) this).field_J[((tr) this).field_rb.field_y.field_p];
                      var9 = Math.sqrt((double)((-var8_int + var6) * (var6 - var8_int) + (-var7 + var5) * (-var7 + var5)));
                      var11 = (double)(-var7 + var5) / var9;
                      var13 = (double)(-var8_int + var6) / var9;
                      var15 = (int)(var11 * (double)((tr) this).field_Hb) + var7;
                      var16 = var8_int - -(int)((double)((tr) this).field_Hb * var13);
                      var17 = 0;
                      if (0.0 == var11) {
                        if (var13 <= 0.0) {
                          var17 = 16384;
                          break L12;
                        } else {
                          var17 = 49152;
                          break L12;
                        }
                      } else {
                        if (0.0 == var13) {
                          if (var11 > 0.0) {
                            var17 = 0;
                            break L12;
                          } else {
                            var17 = 32768;
                            break L12;
                          }
                        } else {
                          L13: {
                            var18_double = (double)(-var8_int + var6);
                            if (0.0 > var18_double) {
                              var18_double = -var18_double;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            var17 = (int)(32768.0 * Math.asin(var18_double / var9) / 3.141592653589793);
                            if (var11 < 0.0) {
                              if (var13 >= 0.0) {
                                var17 = var17 + 32768;
                                break L14;
                              } else {
                                var17 = 32768 + -var17;
                                break L12;
                              }
                            } else {
                              if (var13 <= 0.0) {
                                break L14;
                              } else {
                                var17 = 65536 + -var17;
                                break L12;
                              }
                            }
                          }
                          break L12;
                        }
                      }
                    }
                    L15: {
                      if (var9 > 1.0 + (((tr) this).field_Jb * 300.0 + 0.5 - ((tr) this).field_wb * 150.0)) {
                        eo.a(false, var16, var6, (byte) 69, 200, var5, var15);
                        break L15;
                      } else {
                        if (0 != var17) {
                          if (var17 == 32768) {
                            ((tr) this).field_Cb.i(1 + (var5 - 4), 5 + var16 - ((tr) this).field_Cb.field_w);
                            break L15;
                          } else {
                            if (var17 < 16384) {
                              ((tr) this).field_K.f(-((tr) this).field_K.field_z + var5 - -4, var6 + -4);
                              break L15;
                            } else {
                              L16: {
                                if (var17 <= 16384) {
                                  break L16;
                                } else {
                                  if (var17 < 32768) {
                                    ((tr) this).field_Ob.f(-4 + var5, var6 + -4);
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (var17 <= 32768) {
                                  break L17;
                                } else {
                                  if (var17 < 49152) {
                                    ((tr) this).field_K.i(-4 + (var5 - -1), 5 + -((tr) this).field_K.field_w + var6);
                                    break L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              if (49152 < var17) {
                                ((tr) this).field_Ob.i(1 + (4 + (-((tr) this).field_Ob.field_z + var5)), 1 + (4 + -((tr) this).field_Ob.field_w) + var6);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        } else {
                          ((tr) this).field_Cb.f(4 + var5 - ((tr) this).field_Cb.field_z, -4 + var16);
                          break L15;
                        }
                      }
                    }
                    L18: {
                      if (((tr) this).field_I >= 700.0f) {
                        break L18;
                      } else {
                        if (12 >= var4) {
                          gf.b(var5, var6, 30, 16777215);
                          gf.c(var5, var6, 30, 16777215, 92);
                          ie.a((om) (Object) ((tr) this).field_B.field_n, fj.field_p.field_z << 3, fj.field_p.field_w << 3, var5 * 16, var6 * 16, 3800 + (var17 - 16384), 4096);
                          gf.c(var5, var6, 9, 0, 92);
                          rs.field_Cb.c(Integer.toString(((tr) this).field_rb.field_z), var5, var6 + 4, 16777215, -1);
                          di.field_i[0].f(30 + (var5 - di.field_i[0].field_z / 2), -(di.field_i[0].field_w / 2) + var6);
                          di.field_i[1].f(-30 + (var5 - di.field_i[0].field_z / 2), var6 + -(di.field_i[0].field_w / 2));
                          di.field_i[2].f(-(di.field_i[0].field_z / 2) + var5, var6 - (-30 + di.field_i[0].field_w / 2));
                          break L1;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var18 = ((tr) this).field_ub[0];
                    var19 = ((tr) this).field_ub[1];
                    var19--;
                    gf.b(var18, var19, 30, 16777215);
                    gf.c(var18, var19, 30, 16777215, 92);
                    ie.a((om) (Object) ((tr) this).field_B.field_n, fj.field_p.field_z << 3, fj.field_p.field_w << 3, 16 * var18, 16 * var19, var17 + -16384, 4096);
                    gf.c(var18, var19, 9, 0, 92);
                    rs.field_Cb.c(Integer.toString(((tr) this).field_rb.field_z), var18, var19 + 4, 16777215, -1);
                    di.field_i[0].f(30 + var18 + -(di.field_i[0].field_z / 2), -(di.field_i[0].field_w / 2) + var19);
                    di.field_i[1].f(-30 + var18 - di.field_i[0].field_z / 2, var19 - di.field_i[0].field_w / 2);
                    di.field_i[2].f(-(di.field_i[0].field_z / 2) + var18, 30 + (var19 - di.field_i[0].field_w / 2));
                    break L1;
                  } else {
                    return;
                  }
                } else {
                  L19: {
                    if (((tr) this).field_B != var3_ref_mg.field_G) {
                      break L19;
                    } else {
                      var2++;
                      break L19;
                    }
                  }
                  var3_ref_mg = (mg) (Object) ((tr) this).field_rb.field_B.field_s.b(32);
                  continue L4;
                }
              }
            }
          }
          return;
        }
    }

    final void a(pf param0, int param1) {
        RuntimeException var3 = null;
        so var3_ref = null;
        float var3_float = 0.0f;
        float var4_float = 0.0f;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((tr) this).field_x) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var3_float = -((tr) this).field_k + ((tr) this).field_f;
                    var4_float = -((tr) this).field_E + ((tr) this).field_lb;
                    var5_float = -((tr) this).field_I + ((tr) this).field_H;
                    stackOut_2_0 = this;
                    stackIn_6_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (1.0f < Math.abs(var3_float)) {
                      break L3;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (Math.abs(var4_float) > 1.0f) {
                        break L3;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (Math.abs(var5_float) <= 1.0f) {
                          stackOut_7_0 = this;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L2;
                        } else {
                          stackOut_5_0 = this;
                          stackIn_6_0 = stackOut_5_0;
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L2;
                }
                ((tr) this).field_x = stackIn_8_1 != 0;
                ((tr) this).field_I = ((tr) this).field_I + 0.10000000149011612f * var5_float;
                ((tr) this).field_E = ((tr) this).field_E + 0.10000000149011612f * var4_float;
                ((tr) this).field_k = ((tr) this).field_k + 0.10000000149011612f * var3_float;
                break L1;
              }
            }
            ((tr) this).a(false);
            var3_ref = (so) (Object) ((tr) this).field_Y.d(0);
            L4: while (true) {
              if (var3_ref == null) {
                this.a(-3, param0);
                ((tr) this).field_o.h((byte) -26);
                if (param1 > 43) {
                  L5: {
                    qd.field_f = cl.field_n % 64 * 8;
                    if (256 < qd.field_f) {
                      qd.field_f = -qd.field_f + 512;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                L6: {
                  int fieldTemp$1 = var3_ref.field_u + 1;
                  var3_ref.field_u = var3_ref.field_u + 1;
                  if (fieldTemp$1 == 130) {
                    var3_ref.b((byte) -82);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var4 = 320;
                var5 = ((tr) this).field_o.d((byte) 14) / 2;
                var6 = var3_ref.field_h.field_p;
                var7 = ((tr) this).field_i[var6] + -var4;
                var8 = -var5 + ((tr) this).field_J[var6];
                var9 = (float)Math.sqrt((double)((float)(var7 * var7 - -(var8 * var8)) + ((tr) this).field_I * ((tr) this).field_I)) / 300.0f;
                var3_ref.field_i.a((byte) 120, (int)((float)(tf.field_p * pd.field_m.field_a << 6) / (var9 * 96.0f)));
                var3_ref = (so) (Object) ((tr) this).field_Y.a((byte) -71);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("tr.QA(");
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
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (!dp.field_t) {
          return;
        } else {
          L0: {
            ua.field_f.a(param1, -20429);
            var4 = mr.field_h.f(param2) ? 1 : 0;
            if (je.field_d == 0) {
              break L0;
            } else {
              if (var4 == 0) {
                eo.f(false);
                param1 = false;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (!param1) {
              break L1;
            } else {
              mr.field_h.a(param0, param3, (byte) -108);
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              ua.field_f.a(param1, -20429);
              break L2;
            }
          }
          L3: {
            var5 = mr.field_h.g(false) - -mr.field_h.field_B;
            if (var5 > 640) {
              jj.field_m = jj.field_m + 5;
              break L3;
            } else {
              if (var5 >= 635) {
                break L3;
              } else {
                if (jj.field_m <= 0) {
                  break L3;
                } else {
                  jj.field_m = jj.field_m - 5;
                  break L3;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        vn var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bi var11 = null;
        int var12_int = 0;
        fs[] var12 = null;
        int var14_int = 0;
        fs[] var14 = null;
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
        int[] var27 = null;
        int var28 = 0;
        fs var29 = null;
        bi var30 = null;
        bi var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        bi stackIn_6_0 = null;
        bi stackIn_9_0 = null;
        int stackIn_13_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        fs[] stackIn_22_0 = null;
        fs[] stackIn_23_0 = null;
        fs[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int[] stackIn_50_1 = null;
        int stackIn_51_0 = 0;
        int[] stackIn_51_1 = null;
        int stackIn_52_0 = 0;
        int[] stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int[] stackIn_54_0 = null;
        int[] stackIn_55_0 = null;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_49_0 = 0;
        int[] stackOut_49_1 = null;
        int stackOut_51_0 = 0;
        int[] stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_50_0 = 0;
        int[] stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int[] stackOut_53_0 = null;
        int[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        fs[] stackOut_21_0 = null;
        fs[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        fs[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        bi stackOut_5_0 = null;
        bi stackOut_4_0 = null;
        bi stackOut_8_0 = null;
        bi stackOut_7_0 = null;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = -44 % ((-22 - param0) / 54);
        var4 = (vn) (Object) ((tr) this).field_m.d(0);
        L0: while (true) {
          if (var4 == null) {
            return;
          } else {
            L1: {
              var6 = var4.field_o;
              var7 = var6.field_p;
              var8 = 20;
              if (1024.0f > ((tr) this).field_I) {
                L2: {
                  if (((tr) this).field_Z[var6.field_p] == null) {
                    stackOut_12_0 = 4210752;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = ((tr) this).field_Z[var6.field_p].field_g;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                qc.a(stackIn_13_0, 18117, ((tr) this).field_D[var6.field_p], 160);
                var12 = new fs[var4.field_q.length];
                var33 = new int[var4.field_q.length];
                var32 = var33;
                var27 = var32;
                var14_int = 0;
                L3: while (true) {
                  if (var14_int >= var12.length) {
                    ak.a(var33, -65, (Object[]) (Object) var12);
                    var14 = new fs[var12.length];
                    var15 = (-1 + var14.length) / 2;
                    var14[var15] = var12[0];
                    var16 = 1;
                    var17 = 1;
                    var18 = 1;
                    L4: while (true) {
                      if (var12.length <= var18) {
                        L5: {
                          var18 = (int)(((tr) this).field_wb * 200.0);
                          var19 = (int)(345.0 * ((tr) this).field_wb);
                          if (var19 <= 30 * var12.length) {
                            break L5;
                          } else {
                            var19 = 30 * var12.length;
                            break L5;
                          }
                        }
                        L6: {
                          var20 = -(var19 / 2) + ((tr) this).field_i[var6.field_p];
                          var21 = 5;
                          if (((tr) this).field_I < 700.0f) {
                            stackOut_35_0 = 10;
                            stackIn_36_0 = stackOut_35_0;
                            break L6;
                          } else {
                            stackOut_34_0 = 0;
                            stackIn_36_0 = stackOut_34_0;
                            break L6;
                          }
                        }
                        var22 = stackIn_36_0;
                        gf.a(-2 + var20, -(var18 / 2) + ((tr) this).field_J[var6.field_p] + -5, 4 + var19, 10 + var18 - -var22, var21, 0, 128);
                        var19 = var19 / var12.length;
                        var23 = (int)((double)((tr) this).field_J[var6.field_p] + 0.5 * (double)var18);
                        var24 = 0;
                        L7: while (true) {
                          if (var14.length <= var24) {
                            if (((tr) this).field_I >= 700.0f) {
                              break L1;
                            } else {
                              var28 = 0;
                              var24 = var28;
                              L8: while (true) {
                                if (var28 >= var14.length) {
                                  break L1;
                                } else {
                                  L9: {
                                    if (null == var14[var28]) {
                                      stackOut_44_0 = var4.field_v[-1 + var4.field_v.length];
                                      stackIn_45_0 = stackOut_44_0;
                                      break L9;
                                    } else {
                                      stackOut_43_0 = var4.field_v[var14[var28].field_x];
                                      stackIn_45_0 = stackOut_43_0;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    var25 = stackIn_45_0;
                                    if (var14[var28] == var4.field_k) {
                                      var25 = var25 + var4.field_n;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (var14[var28] != var4.field_l) {
                                      break L11;
                                    } else {
                                      L12: {
                                        stackOut_49_0 = ~var25;
                                        stackOut_49_1 = var4.field_m;
                                        stackIn_51_0 = stackOut_49_0;
                                        stackIn_51_1 = stackOut_49_1;
                                        stackIn_50_0 = stackOut_49_0;
                                        stackIn_50_1 = stackOut_49_1;
                                        if (null != var14[var28]) {
                                          stackOut_51_0 = stackIn_51_0;
                                          stackOut_51_1 = (int[]) (Object) stackIn_51_1;
                                          stackOut_51_2 = var14[var28].field_x;
                                          stackIn_52_0 = stackOut_51_0;
                                          stackIn_52_1 = stackOut_51_1;
                                          stackIn_52_2 = stackOut_51_2;
                                          break L12;
                                        } else {
                                          stackOut_50_0 = stackIn_50_0;
                                          stackOut_50_1 = (int[]) (Object) stackIn_50_1;
                                          stackOut_50_2 = var4.field_v.length + -1;
                                          stackIn_52_0 = stackOut_50_0;
                                          stackIn_52_1 = stackOut_50_1;
                                          stackIn_52_2 = stackOut_50_2;
                                          break L12;
                                        }
                                      }
                                      if (stackIn_52_0 <= ~stackIn_52_1[stackIn_52_2]) {
                                        break L11;
                                      } else {
                                        L13: {
                                          stackOut_53_0 = var4.field_v;
                                          stackIn_55_0 = stackOut_53_0;
                                          stackIn_54_0 = stackOut_53_0;
                                          if (null != var4.field_k) {
                                            stackOut_55_0 = (int[]) (Object) stackIn_55_0;
                                            stackOut_55_1 = var4.field_k.field_x;
                                            stackIn_56_0 = stackOut_55_0;
                                            stackIn_56_1 = stackOut_55_1;
                                            break L13;
                                          } else {
                                            stackOut_54_0 = (int[]) (Object) stackIn_54_0;
                                            stackOut_54_1 = var4.field_v.length + -1;
                                            stackIn_56_0 = stackOut_54_0;
                                            stackIn_56_1 = stackOut_54_1;
                                            break L13;
                                          }
                                        }
                                        if (stackIn_56_0[stackIn_56_1] <= 0) {
                                          break L11;
                                        } else {
                                          var25++;
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  rs.field_Cb.c(Integer.toString(var25), var19 / 2 + var20 - -(var19 * var28), rs.field_Cb.field_J / 2 + 5 + var23, 16777215, -1);
                                  var28++;
                                  continue L8;
                                }
                              }
                            }
                          } else {
                            this.a(var14[var24], var23, var19, var18, 121, var20 - -(var24 * var19), var4);
                            var24++;
                            continue L7;
                          }
                        }
                      } else {
                        L14: {
                          stackOut_21_0 = (fs[]) var14;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var16 == 0) {
                            stackOut_23_0 = (fs[]) (Object) stackIn_23_0;
                            stackOut_23_1 = -var17;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            break L14;
                          } else {
                            stackOut_22_0 = (fs[]) (Object) stackIn_22_0;
                            stackOut_22_1 = var17;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_24_1 = stackOut_22_1;
                            break L14;
                          }
                        }
                        L15: {
                          stackIn_24_0[stackIn_24_1 + var15] = var12[var18];
                          if (var16 == 0) {
                            var17++;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (var16 != 0) {
                            stackOut_29_0 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            break L16;
                          } else {
                            stackOut_28_0 = 1;
                            stackIn_30_0 = stackOut_28_0;
                            break L16;
                          }
                        }
                        var16 = stackIn_30_0;
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    L17: {
                      stackOut_15_0 = (int[]) var27;
                      stackOut_15_1 = var14_int;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (null != var4.field_q[var14_int]) {
                        stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = var4.field_m[var14_int];
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L17;
                      } else {
                        stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = var4.field_m[-1 + var4.field_m.length];
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L17;
                      }
                    }
                    stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                    var12[var14_int] = var4.field_q[var14_int];
                    var14_int++;
                    continue L3;
                  }
                }
              } else {
                L18: {
                  var10 = -(var8 >> 1) + ((tr) this).field_J[var7];
                  var12_int = ((tr) this).field_t / 20 % var4.field_q.length;
                  var9 = ((tr) this).field_i[var7] - (var8 >> 1);
                  var29 = var4.field_q[var12_int];
                  if (var29 != null) {
                    stackOut_5_0 = var29.field_e;
                    stackIn_6_0 = stackOut_5_0;
                    break L18;
                  } else {
                    stackOut_4_0 = wa.field_b;
                    stackIn_6_0 = stackOut_4_0;
                    break L18;
                  }
                }
                L19: {
                  var30 = stackIn_6_0;
                  var11 = var30;
                  var30.c(-1 + var9, -1 + var10, var8, var8);
                  if (var4.field_j != null) {
                    stackOut_8_0 = var4.field_j.field_o;
                    stackIn_9_0 = stackOut_8_0;
                    break L19;
                  } else {
                    stackOut_7_0 = fm.field_b;
                    stackIn_9_0 = stackOut_7_0;
                    break L19;
                  }
                }
                var31 = stackIn_9_0;
                var11 = var31;
                var31.f(-1 + -(var31.field_z >> 1) + (var8 + var9), -(var31.field_w >> 1) + (var8 + var10 - 1));
                break L1;
              }
            }
            var4 = (vn) (Object) ((tr) this).field_m.a((byte) -71);
            continue L0;
          }
        }
    }

    private final void a(ln param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 >= 91) {
              L1: {
                var3_int = 0;
                var4 = 0;
                if (1024.0f >= ((tr) this).field_I) {
                  break L1;
                } else {
                  var4 = 1;
                  var3_int = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = (cl.field_n + 5 * param0.field_p) % 104;
                  if (param0.field_B == 6) {
                    break L3;
                  } else {
                    if (param0.field_B == 7) {
                      break L3;
                    } else {
                      if (param0.field_B != 8) {
                        if (4 == param0.field_B) {
                          var6 = ((tr) this).field_Kb[0].field_o;
                          qa.field_p[0].b(((tr) this).field_i[param0.field_p] - (var6 / 2 - -var3_int), -(var6 / 2) + ((tr) this).field_J[param0.field_p] - var4, var6, var6);
                          if (4 >= var5) {
                            break L2;
                          } else {
                            if (var5 <= 48) {
                              ((tr) this).field_Kb[var5 / 4].c(-var3_int + -(var6 / 2) + ((tr) this).field_i[param0.field_p], -var4 + (-(var6 / 2) + ((tr) this).field_J[param0.field_p]), 128);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          var6 = ((tr) this).field_Mb[0].field_o;
                          qk.field_y[0].b(-var3_int + -(var6 / 2) + ((tr) this).field_i[param0.field_p], -var4 + -(var6 / 2) + ((tr) this).field_J[param0.field_p], var6, var6);
                          if (var5 <= 4) {
                            break L2;
                          } else {
                            if (var5 <= 48) {
                              ((tr) this).field_Mb[var5 / 4].c(-var3_int + -(var6 / 2) + ((tr) this).field_i[param0.field_p], ((tr) this).field_J[param0.field_p] - var6 / 2 - var4, 128);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6 = ((tr) this).field_xb[0].field_o;
                ge.field_k[0].b(-var3_int + (((tr) this).field_i[param0.field_p] + -(var6 / 2)), -var4 + ((tr) this).field_J[param0.field_p] - var6 / 2, var6, var6);
                if (4 >= var5) {
                  break L2;
                } else {
                  if (var5 > 48) {
                    break L2;
                  } else {
                    ((tr) this).field_xb[var5 / 4].c(-var3_int + -(var6 / 2) + ((tr) this).field_i[param0.field_p], -(var6 / 2) + ((tr) this).field_J[param0.field_p] - var4, 128);
                    break L2;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("tr.JA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
    }

    private final void a(boolean param0, ln param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        Object var6 = null;
        mg var6_ref = null;
        ln var7_ref_ln = null;
        int var7 = 0;
        int var8_int = 0;
        boolean[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int var10_int = 0;
        ln var10 = null;
        int var11_int = 0;
        double var11_double = 0.0;
        ln var11 = null;
        int var12 = 0;
        int var13 = 0;
        double var13_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        double var15_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        double var30_double = 0.0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int[] var34 = null;
        boolean[] var35 = null;
        int[] var36 = null;
        boolean[] var37 = null;
        int[] var38 = null;
        boolean[] var39 = null;
        int[] var40 = null;
        boolean[] var41 = null;
        L0: {
          var6 = null;
          var32 = ShatteredPlansClient.field_F ? 1 : 0;
          var4_int = -58 % ((22 - param2) / 61);
          if (((tr) this).field_I <= 1024.0f) {
            var5 = 0;
            var6_ref = (mg) (Object) param1.field_s.c(-127);
            L1: while (true) {
              if (var6_ref == null) {
                if (0 == var5) {
                  return;
                } else {
                  L2: {
                    if (330.0f <= ((tr) this).field_I) {
                      var7 = (1 - -((var5 + -1) / 12)) * 12;
                      break L2;
                    } else {
                      var7 = 12 * (1 - -((-1 + var5) / 11));
                      break L2;
                    }
                  }
                  var41 = new boolean[var7];
                  var39 = var41;
                  var37 = var39;
                  var35 = var37;
                  var8 = var35;
                  var40 = new int[2 * var7];
                  var38 = var40;
                  var36 = var38;
                  var34 = var36;
                  var9 = var34;
                  var33 = 0;
                  var10_int = var33;
                  L3: while (true) {
                    if (var7 <= var33) {
                      var6_ref = (mg) (Object) param1.field_s.c(-128);
                      L4: while (true) {
                        if (var6_ref == null) {
                          break L0;
                        } else {
                          L5: {
                            if (((tr) this).field_B != var6_ref.field_G) {
                              break L5;
                            } else {
                              var10 = var6_ref.field_y;
                              var11 = var6_ref.field_B;
                              var12 = var10.field_p;
                              var13 = var11.field_p;
                              var14 = ((tr) this).field_i[var12];
                              var15 = ((tr) this).field_J[var12];
                              var16 = ((tr) this).field_i[var13];
                              var17 = ((tr) this).field_J[var13];
                              var22 = Math.sqrt((double)((var16 + -var14) * (-var14 + var16) + (-var15 + var17) * (var17 + -var15)));
                              var24 = (double)(-var14 + var16) / var22;
                              var20 = -(int)(150.0 * ((tr) this).field_Jb * var24) + var16;
                              var26 = (double)(-var15 + var17) / var22;
                              var21 = var17 - (int)(var26 * (150.0 * ((tr) this).field_Jb));
                              var28 = this.a(var20, var40, var41, var15, var26, (byte) -28, var21, var14, var24);
                              var20 = var9[2 * var28];
                              var21 = var9[2 * var28 - -1];
                              var22 = Math.sqrt((double)((var20 + -var14) * (-var14 + var20) - -((var21 + -var15) * (-var15 + var21))));
                              var26 = (double)(var21 + -var15) / var22;
                              var24 = (double)(-var14 + var20) / var22;
                              var19 = var15 + (int)((double)((tr) this).field_Hb * var26);
                              var18 = var14 + (int)((double)((tr) this).field_Hb * var24);
                              if (var6_ref != ((tr) this).field_rb) {
                                L6: {
                                  var29 = 0;
                                  if (var24 != 0.0) {
                                    if (0.0 != var26) {
                                      L7: {
                                        var30_double = (double)(-var15 + var21);
                                        if (0.0 <= var30_double) {
                                          break L7;
                                        } else {
                                          var30_double = -var30_double;
                                          break L7;
                                        }
                                      }
                                      var29 = (int)(Math.asin(var30_double / var22) * 32768.0 / 3.141592653589793);
                                      if (var24 < 0.0) {
                                        if (var26 < 0.0) {
                                          var29 = -var29 + 32768;
                                          break L6;
                                        } else {
                                          var29 = var29 + 32768;
                                          break L6;
                                        }
                                      } else {
                                        if (0.0 >= var26) {
                                          break L6;
                                        } else {
                                          var29 = -var29 + 65536;
                                          break L6;
                                        }
                                      }
                                    } else {
                                      if (0.0 < var24) {
                                        var29 = 0;
                                        break L6;
                                      } else {
                                        var29 = 32768;
                                        break L6;
                                      }
                                    }
                                  } else {
                                    if (var26 > 0.0) {
                                      var29 = 49152;
                                      break L6;
                                    } else {
                                      var29 = 16384;
                                      break L6;
                                    }
                                  }
                                }
                                if (param0) {
                                  L8: {
                                    L9: {
                                      if (700.0f <= ((tr) this).field_I) {
                                        break L9;
                                      } else {
                                        if (var7 <= 12) {
                                          ie.a((om) (Object) ((tr) this).field_B.field_n, fj.field_p.field_z << 3, fj.field_p.field_w << 3, 16 * var20, var21 * 16, -16384 + (var29 + 3800), 4096);
                                          gf.c(var20, var21, 9, 0, 92);
                                          rs.field_Cb.c(Integer.toString(var6_ref.field_z), var20, 4 + var21, 16777215, -1);
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    gf.b(16 * var20, var21 * 16, 60, -1 + r.field_j.length, new int[5]);
                                    break L8;
                                  }
                                  if (700.0f >= ((tr) this).field_I) {
                                    break L5;
                                  } else {
                                    var30 = (var20 + var18) / 2;
                                    var31 = (var21 + var19) / 2;
                                    var30 = var30 - (int)(var26 * (var22 / 10.0));
                                    var31 = var31 + (int)(var24 * (var22 / 10.0));
                                    int discarded$1 = rs.field_Cb.c(Integer.toString(var6_ref.field_z));
                                    gf.c(var30, -1 + var31, 9, 16777215, 192);
                                    rs.field_Cb.c(Integer.toString(var6_ref.field_z), var30, 3 + var31, 0, -1);
                                    break L5;
                                  }
                                } else {
                                  if (var22 <= 1.0 + (0.5 + ((tr) this).field_Jb * 300.0 - 150.0 * ((tr) this).field_wb)) {
                                    if (0 == var29) {
                                      ((tr) this).field_Cb.f(-((tr) this).field_Cb.field_z + (var20 - -4), -4 + var19);
                                      break L5;
                                    } else {
                                      if (var29 != 32768) {
                                        if (var29 < 16384) {
                                          ((tr) this).field_K.f(4 + (var20 + -((tr) this).field_K.field_z), -4 + var21);
                                          break L5;
                                        } else {
                                          L10: {
                                            if (16384 >= var29) {
                                              break L10;
                                            } else {
                                              if (var29 >= 32768) {
                                                break L10;
                                              } else {
                                                ((tr) this).field_Ob.f(-4 + var20, -4 + var21);
                                                break L5;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (32768 >= var29) {
                                              break L11;
                                            } else {
                                              if (var29 < 49152) {
                                                ((tr) this).field_K.i(1 + var20 + -4, -((tr) this).field_K.field_w + var21 + 5);
                                                break L5;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          if (var29 <= 49152) {
                                            break L5;
                                          } else {
                                            ((tr) this).field_Ob.i(4 + (-((tr) this).field_Ob.field_z + (var20 + 1)), 4 + var21 - (((tr) this).field_Ob.field_w - 1));
                                            break L5;
                                          }
                                        }
                                      } else {
                                        ((tr) this).field_Cb.i(var20 - 3, 4 + var19 + -((tr) this).field_Cb.field_w - -1);
                                        break L5;
                                      }
                                    }
                                  } else {
                                    eo.a(false, var19, var21, (byte) 74, 200, var20, var18);
                                    break L5;
                                  }
                                }
                              } else {
                                L12: {
                                  L13: {
                                    if (700.0f <= ((tr) this).field_I) {
                                      break L13;
                                    } else {
                                      if (var7 <= 12) {
                                        ((tr) this).field_ub[1] = var21;
                                        ((tr) this).field_ub[0] = var20;
                                        if (((tr) this).field_Db != ((tr) this).field_rb) {
                                          break L12;
                                        } else {
                                          ((tr) this).field_tb[0] = var20;
                                          ((tr) this).field_tb[1] = var21;
                                          break L12;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var29 = (var20 + var18) / 2;
                                  var22 = Math.sqrt((double)((-var20 + var18) * (-var20 + var18) - -((var19 - var21) * (var19 + -var21))));
                                  var30 = (var21 - -var19) / 2;
                                  var29 = (int)((double)var29 + var22 * -var26 / 10.0);
                                  var30 = (int)((double)var30 + var22 * var24 / 10.0);
                                  ((tr) this).field_ub[0] = var29;
                                  ((tr) this).field_ub[1] = var30;
                                  if (((tr) this).field_rb != ((tr) this).field_Db) {
                                    break L12;
                                  } else {
                                    ((tr) this).field_tb[0] = var29;
                                    ((tr) this).field_tb[1] = var30;
                                    break L12;
                                  }
                                }
                                var6_ref = (mg) (Object) param1.field_s.b(32);
                                continue L4;
                              }
                            }
                          }
                          var6_ref = (mg) (Object) param1.field_s.b(32);
                          continue L4;
                        }
                      }
                    } else {
                      L14: {
                        var11_double = 3.141592653589793 * (double)(var33 * 2) / (double)var7;
                        if (330.0f <= ((tr) this).field_I) {
                          break L14;
                        } else {
                          if (var11_double < 4.4505895925855405) {
                            break L14;
                          } else {
                            if (4.97418836818384 < var11_double) {
                              break L14;
                            } else {
                              var8[var33] = true;
                              var9[2 * var33] = -1;
                              var9[1 + var33 * 2] = -1;
                              break L14;
                            }
                          }
                        }
                      }
                      var13_double = Math.sin(var11_double);
                      var15_double = Math.cos(var11_double);
                      var9[2 * var33] = ((tr) this).field_i[param1.field_p] + (int)(var15_double * (150.0 * ((tr) this).field_wb));
                      var9[1 + 2 * var33] = ((tr) this).field_J[param1.field_p] - -(int)(150.0 * ((tr) this).field_wb * var13_double);
                      var33++;
                      continue L3;
                    }
                  }
                }
              } else {
                L15: {
                  if (((tr) this).field_B != var6_ref.field_G) {
                    break L15;
                  } else {
                    var5++;
                    break L15;
                  }
                }
                var6_ref = (mg) (Object) param1.field_s.b(32);
                continue L1;
              }
            }
          } else {
            var5_ref_int__ = new int[]{-14671840, -12566464, -10461088, -8355712};
            var6_ref = (mg) (Object) param1.field_s.c(-128);
            L16: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                var7_ref_ln = var6_ref.field_y;
                var8_int = var7_ref_ln.field_p;
                var9_int = param1.field_p;
                var10_int = ((tr) this).field_i[var8_int];
                var11_int = ((tr) this).field_J[var8_int];
                var12 = ((tr) this).field_i[var9_int];
                var13 = ((tr) this).field_J[var9_int];
                var14 = (int)Math.sqrt((double)((var12 + -var10_int) * (var12 - var10_int) - -((-var11_int + var13) * (-var11_int + var13)))) + 1;
                var15 = cl.field_n / 2 % 10;
                L17: while (true) {
                  if (~var14 >= ~var15) {
                    L18: {
                      var15 = (var10_int + var12) / 2;
                      var16 = (var11_int + var13) / 2;
                      gf.c(var15, var16 - 1, 9, 16777215, 192);
                      rs.field_Cb.c(Integer.toString(var6_ref.field_z), var15, 3 + var16, 0, -1);
                      if (var6_ref != ((tr) this).field_rb) {
                        break L18;
                      } else {
                        var17 = (var10_int - -var12) / 2;
                        var18 = (var13 + var11_int) / 2;
                        ((tr) this).field_ub[0] = var17;
                        ((tr) this).field_ub[1] = var18;
                        if (((tr) this).field_rb == ((tr) this).field_Db) {
                          ((tr) this).field_tb[0] = var17;
                          ((tr) this).field_tb[1] = var18;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var6_ref = (mg) (Object) param1.field_s.b(32);
                    continue L16;
                  } else {
                    var16 = (1 + 2 * (var15 * (var12 - var10_int))) / (var14 * 2) + var10_int;
                    var17 = var11_int - -((var15 * 2 * (var13 - var11_int) + 1) / (var14 * 2));
                    gf.b(var16 << 4, var17 << 4, 30, 3, var5_ref_int__);
                    var15 += 10;
                    continue L17;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, ln param1, int param2) {
        fs var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fs var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var7 = ((tr) this).field_Z[param1.field_p];
              var4 = var7;
              if (var4 != null) {
                stackOut_2_0 = var7.field_s;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 8421504;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_3_0;
              var5 = ui.a(var5, 0, -80, -(((tr) this).field_eb[param1.field_p] * 160 / param2) + 160);
              qc.a(var5, 18117, ((tr) this).field_D[param1.field_p], 160);
              if (((tr) this).field_T != -1) {
                break L2;
              } else {
                this.a(param1, false);
                break L2;
              }
            }
            L3: {
              this.e(param1, -29952);
              if (param1.field_B >= 6) {
                L4: {
                  ((tr) this).a(-86, param1);
                  var6 = rs.field_Cb.c(Integer.toString(((tr) this).field_eb[param1.field_p])) + 1;
                  if (var6 < 10) {
                    var6 = 10;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                gf.c(((tr) this).field_i[param1.field_p] + -1, -1 + ((tr) this).field_J[param1.field_p], var6, 0, 128);
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (param1.field_I.equalsIgnoreCase("sol")) {
                ((tr) this).a(-71, param1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 == 11746) {
                break L6;
              } else {
                this.a((byte) -83, -5, -104);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("tr.EB(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
        }
    }

    final void a(int param0, fs[] param1) {
        try {
            ((tr) this).field_ib = param1;
            if (param0 >= -123) {
                Object var4 = null;
                this.d((ln) null, -124);
            }
            ((tr) this).field_cb = new int[((tr) this).field_ib.length][];
            this.j(0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "tr.SA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(pf param0, boolean param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        as var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        Object var37 = null;
        double var37_double = 0.0;
        om var37_ref = null;
        int var39 = 0;
        bi stackIn_28_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_27_0 = null;
        bi stackOut_26_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var37 = null;
        var39 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (200 < ((tr) this).field_t) {
              return;
            } else {
              var5_ref = (as) (Object) param0.d(0);
              L1: while (true) {
                if (var5_ref == null) {
                  break L0;
                } else {
                  L2: {
                    var6 = ((tr) this).field_i[var5_ref.field_q.field_p];
                    var7 = ((tr) this).field_J[var5_ref.field_q.field_p];
                    var8 = ((tr) this).field_i[var5_ref.field_s.field_p];
                    var9 = ((tr) this).field_J[var5_ref.field_s.field_p];
                    var10 = Math.sqrt((double)((var6 + -var8) * (-var8 + var6) + (var7 + -var9) * (var7 + -var9)));
                    var12 = (double)(var6 + -var8) / var10;
                    var14 = (double)(-var9 + var7) / var10;
                    var16 = (int)(var12 * (double)((tr) this).field_Hb) + var8;
                    var17 = (int)(var14 * (double)((tr) this).field_Hb) + var9;
                    var18 = -(int)(var12 * (double)((tr) this).field_Hb) + var6;
                    var19 = var7 - (int)(var14 * (double)((tr) this).field_Hb);
                    if (param1) {
                      L3: {
                        var20 = ((tr) this).field_t * (-var16 + var18) * 16 / 200 + var16 * 16;
                        var21 = (-var17 + var19) * (16 * ((tr) this).field_t) / 200 + 16 * var17;
                        var22 = Math.sqrt((double)((var21 - 16 * var17) * (var21 + -(var17 * 16)) + (var20 + -(16 * var16)) * (-(16 * var16) + var20)));
                        var10 = Math.sqrt((double)((-var17 + var19) * (256 * (-var17 + var19)) + (-var16 + var18) * ((var18 + -var16) * 256)));
                        var24 = var10 / 2.0;
                        var26 = 1.0 / var24;
                        var28 = var10 / 10.0 - (var22 - var24) * (-var24 + var22) * var26 * 0.2;
                        var30 = (double)((-var19 + var17) * 16);
                        var32 = (double)((var16 + -var18) * 16);
                        var30 = var30 / var10;
                        var32 = var32 / var10;
                        var34 = var20 - -(int)(var28 * var30);
                        var35 = -(int)(var32 * var28) + var21;
                        var36 = 0;
                        if (var12 == 0.0) {
                          if (0.0 < var14) {
                            var36 = 49152;
                            break L3;
                          } else {
                            var36 = 16384;
                            break L3;
                          }
                        } else {
                          if (0.0 == var14) {
                            if (0.0 < var12) {
                              var36 = 0;
                              break L3;
                            } else {
                              var36 = 32768;
                              break L3;
                            }
                          } else {
                            L4: {
                              var37_double = (double)((var19 + -var17) * 16);
                              if (var37_double >= 0.0) {
                                break L4;
                              } else {
                                var37_double = -var37_double;
                                break L4;
                              }
                            }
                            var36 = (int)(32768.0 * Math.asin(var37_double / var10) / 3.141592653589793);
                            if (var12 >= 0.0) {
                              if (0.0 < var14) {
                                var36 = -var36 + 65536;
                                break L3;
                              } else {
                                break L3;
                              }
                            } else {
                              if (0.0 > var14) {
                                var36 = -var36 + 32768;
                                break L3;
                              } else {
                                var36 = var36 + 32768;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      L5: {
                        var36 = var36 - 16384;
                        var36 = -3800 + (var36 + 7600 * ((tr) this).field_t / 200);
                        if (!param2) {
                          stackOut_27_0 = var5_ref.field_m.field_n;
                          stackIn_28_0 = stackOut_27_0;
                          break L5;
                        } else {
                          stackOut_26_0 = var5_ref.field_m.field_b;
                          stackIn_28_0 = stackOut_26_0;
                          break L5;
                        }
                      }
                      var37_ref = (om) (Object) stackIn_28_0;
                      ie.a(var37_ref, fj.field_p.field_z << 3, fj.field_p.field_w << 3, var34, var35, var36, 4096);
                      gf.c(var34 >> 4, var35 >> 4, 9, 0, 92);
                      rs.field_Cb.c(Integer.toString(var5_ref.field_x), var34 >> 4, (var35 >> 4) + 4, 16777215, -1);
                      break L2;
                    } else {
                      eo.a(false, var17, var19, (byte) 99, ((tr) this).field_t, var18, var16);
                      break L2;
                    }
                  }
                  var5_ref = (as) (Object) param0.a((byte) -71);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("tr.KB(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        ra.a(-120);
        for (var2 = 0; ((tr) this).field_ib.length > var2; var2++) {
            var3 = ((tr) this).field_ib[var2].field_k;
            ((tr) this).field_ib[var2].field_v = (bi) (Object) new om(cf.field_F.field_o, cf.field_F.field_p);
            ((tr) this).field_ib[var2].field_v.e();
            cf.field_F.b(0, 0, var3);
            for (var4 = 0; var4 < cf.field_F.field_B.length; var4++) {
                ((tr) this).field_ib[var2].field_v.field_B[var4] = we.a(-16777216, cf.field_F.field_B[var4]) + we.a(16777215, ((tr) this).field_ib[var2].field_v.field_B[var4]);
            }
            ((tr) this).field_ib[var2].field_n = (bi) (Object) new om(fj.field_p.field_o, fj.field_p.field_p);
            ((tr) this).field_ib[var2].field_n.e();
            fj.field_p.d(0, 0, var3);
            for (var4 = 0; var4 < fj.field_p.field_B.length; var4++) {
                ((tr) this).field_ib[var2].field_n.field_B[var4] = we.a(-16777216, fj.field_p.field_B[var4]) + we.a(((tr) this).field_ib[var2].field_n.field_B[var4], 16777215);
            }
            ((tr) this).field_ib[var2].field_b = (bi) (Object) new om(eq.field_o.field_o, eq.field_o.field_p);
            ((tr) this).field_ib[var2].field_b.e();
            eq.field_o.d(0, 0, var3);
            for (var4 = 0; eq.field_o.field_B.length > var4; var4++) {
                ((tr) this).field_ib[var2].field_b.field_B[var4] = we.a(16777215, ((tr) this).field_ib[var2].field_b.field_B[var4]) + we.a(eq.field_o.field_B[var4], -16777216);
            }
            ((tr) this).field_ib[var2].field_o = new bi(10, 12);
            ((tr) this).field_ib[var2].field_o.e();
            wo.field_b.b(1, 1, var3);
            ((tr) this).field_ib[var2].field_p = new bi(12, 12);
            ((tr) this).field_ib[var2].field_p.e();
            oo.field_a.b(1, 1, var3);
            ((tr) this).field_ib[var2].field_r = new bi(12, 12);
            ((tr) this).field_ib[var2].field_r.e();
            ab.field_e.b(1, 1, var3);
            ((tr) this).field_ib[var2].field_e = new bi(128, 128);
            ((tr) this).field_ib[var2].field_e.e();
            go.field_L.d(0, 0, var3);
            for (var4 = 0; var4 < ((tr) this).field_ib[var2].field_e.field_B.length; var4++) {
                if (((tr) this).field_ib[var2].field_e.field_B[var4] != 0) {
                    gf.c(var4 % ((tr) this).field_ib[var2].field_e.field_z, var4 / ((tr) this).field_ib[var2].field_e.field_z, ((tr) this).field_ib[var2].field_k, 128);
                    ((tr) this).field_ib[var2].field_e.field_B[var4] = ee.a(((tr) this).field_ib[var2].field_e.field_B[var4], -16777216);
                }
            }
            ((tr) this).field_ib[var2].field_c = new bi(18, 12);
            ((tr) this).field_ib[var2].field_c.e();
            bd.field_G.b(1, 1, var3);
            ((tr) this).field_ib[var2].field_d = new bi(16, 10);
            ((tr) this).field_ib[var2].field_d.e();
            bd.field_G.b(0, 0, var3);
            ((tr) this).field_ib[var2].field_o.f(16777215);
            ((tr) this).field_ib[var2].field_p.f(16777215);
            ((tr) this).field_ib[var2].field_r.f(16777215);
            ((tr) this).field_ib[var2].field_c.f(16777215);
            ((tr) this).field_cb[var2] = new int[256];
            for (var4 = 0; var4 < 256; var4++) {
                var5 = var3 & 16711935;
                var6 = 65280 & var3;
                var5 = var5 * var4;
                var6 = var6 * var4;
                var5 = var5 & -16711936;
                var6 = var6 & 16711680;
                ((tr) this).field_cb[var2][var4] = ee.a(var6, var5) >>> 8;
            }
        }
        cg.i(0);
    }

    private final void a(boolean param0, ln param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        fs var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              L1: {
                var3_int = param1.field_p;
                var4 = ((tr) this).field_Z[var3_int];
                if (var4 != null) {
                  if (param1 != ((tr) this).field_p) {
                    ((tr) this).field_ob.b((int)((double)(((tr) this).field_i[var3_int] - -1) - 345.0 * ((tr) this).field_wb / 2.0), (int)(-(((tr) this).field_wb * 400.0 / 2.0) + (double)(((tr) this).field_J[var3_int] - -1)), var4.field_s);
                    if (!((tr) this).field_X) {
                      break L1;
                    } else {
                      if (tl.field_u) {
                        ((tr) this).field_Ib.a((int)((double)(((tr) this).field_i[var3_int] + 1) - 345.0 * ((tr) this).field_wb / 2.0), (int)((double)(((tr) this).field_J[var3_int] + 1) - 400.0 * ((tr) this).field_wb / 2.0), qd.field_f);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    ((tr) this).field_Ib.b((int)(-(345.0 * ((tr) this).field_wb / 2.0) + (double)(((tr) this).field_i[var3_int] - -1)), (int)((double)(((tr) this).field_J[var3_int] + 1) - ((tr) this).field_wb * 400.0 / 2.0), var4.field_s);
                    break L1;
                  }
                } else {
                  if (param1 != ((tr) this).field_p) {
                    ((tr) this).field_ob.f((int)(-(((tr) this).field_wb * 345.0 / 2.0) + (double)(1 + ((tr) this).field_i[var3_int])), (int)(-(((tr) this).field_wb * 400.0 / 2.0) + (double)(1 + ((tr) this).field_J[var3_int])));
                    break L1;
                  } else {
                    ((tr) this).field_Ib.f((int)(-(((tr) this).field_wb * 345.0 / 2.0) + (double)(1 + ((tr) this).field_i[var3_int])), (int)(-(400.0 * ((tr) this).field_wb / 2.0) + (double)(1 + ((tr) this).field_J[var3_int])));
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("tr.GB(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    private final void b(int param0, ln param1) {
        try {
            if (!(~((tr) this).field_T != param0)) {
                this.a(param1, false);
            }
            this.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "tr.HA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final int a(int param0, int[] param1, boolean[] param2, int param3, double param4, byte param5, int param6, int param7, double param8) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var12_int = -1;
            var13 = 2147483647;
            var14 = 0;
            L1: while (true) {
              if (param2.length <= var14) {
                L2: {
                  if (param5 <= -14) {
                    break L2;
                  } else {
                    field_Lb = 34;
                    break L2;
                  }
                }
                L3: {
                  if (var12_int != -1) {
                    break L3;
                  } else {
                    var19 = 0;
                    var14 = var19;
                    L4: while (true) {
                      if (param2.length <= var19) {
                        break L3;
                      } else {
                        L5: {
                          if (param2[var19]) {
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var19++;
                        continue L4;
                      }
                    }
                  }
                }
                if (-1 == var12_int) {
                  throw new RuntimeException("Unable to anchor incoming fleet.");
                } else {
                  param2[var12_int] = true;
                  stackOut_17_0 = var12_int;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                }
              } else {
                L6: {
                  if (param2[var14]) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var14++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var12 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var12;
            stackOut_19_1 = new StringBuilder().append("tr.HB(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_18_0;
    }

    final void c(int param0, int param1, int param2) {
        int var5 = 0;
        L0: {
          L1: {
            var5 = ShatteredPlansClient.field_F ? 1 : 0;
            if (null == ((tr) this).field_S) {
              break L1;
            } else {
              if (((tr) this).field_Db == ((tr) this).field_S) {
                if (-16 >= ((tr) this).field_yb) {
                  break L0;
                } else {
                  if (((tr) this).field_I < 700.0f) {
                    int fieldTemp$9 = ((tr) this).field_yb + 1;
                    ((tr) this).field_yb = ((tr) this).field_yb + 1;
                    if (-16 == fieldTemp$9) {
                      ((tr) this).field_ub[0] = ((tr) this).field_tb[0];
                      ((tr) this).field_ub[1] = ((tr) this).field_tb[1];
                      ((tr) this).field_rb = ((tr) this).field_Db;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          if (((tr) this).field_yb <= 0) {
            ((tr) this).field_Db = ((tr) this).field_S;
            ((tr) this).field_tb[0] = ((tr) this).field_nb[0];
            ((tr) this).field_tb[1] = ((tr) this).field_nb[1];
            break L0;
          } else {
            int fieldTemp$10 = ((tr) this).field_yb - 1;
            ((tr) this).field_yb = ((tr) this).field_yb - 1;
            if (0 != fieldTemp$10) {
              break L0;
            } else {
              ((tr) this).field_rb = null;
              ((tr) this).field_ub[1] = -1;
              ((tr) this).field_Db = ((tr) this).field_S;
              ((tr) this).field_ub[0] = -1;
              ((tr) this).field_tb[0] = ((tr) this).field_nb[0];
              ((tr) this).field_tb[1] = ((tr) this).field_nb[1];
              break L0;
            }
          }
        }
        L2: {
          if (param2 >= 104) {
            break L2;
          } else {
            field_Fb = null;
            break L2;
          }
        }
    }

    private final void b(ln param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        double var5_double = 0.0;
        ik[] var5 = null;
        int var6 = 0;
        int var9 = 0;
        om var10 = null;
        om var11 = null;
        om var12 = null;
        om var13 = null;
        ik[] var14 = null;
        ik[] var15 = null;
        ik[] var16 = null;
        ik[] var17 = null;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0.field_B == 6) {
            break L0;
          } else {
            if (param0.field_B == 7) {
              break L0;
            } else {
              if (param0.field_B != 8) {
                L1: {
                  var3_int = param0.field_p;
                  var4 = 24;
                  if (((tr) this).field_I >= 330.0f) {
                    if (((tr) this).field_I < 1024.0f) {
                      L2: {
                        gf.c(((tr) this).field_i[var3_int], ((tr) this).field_J[var3_int], 25, 0, 128);
                        if (param0.field_G[0] == 0) {
                          break L2;
                        } else {
                          var14 = new ik[2 + 2 * param0.field_G[0]];
                          var5 = var14;
                          var5[0] = el.a(0, ((tr) this).field_J[var3_int] << 4, ((tr) this).field_i[var3_int] << 4);
                          var5[1] = el.a(0, ((tr) this).field_J[var3_int] + var4 / 2 << 4, -(int)((double)var4 * rh.field_e) + ((tr) this).field_i[var3_int] << 4);
                          var6 = 0;
                          L3: while (true) {
                            if (param0.field_G[0] <= var6) {
                              qn.a(var14, gm.field_k[0], true);
                              break L2;
                            } else {
                              var5[2 + 2 * var6] = el.a(0, ((tr) this).field_J[var3_int] - -(int)((double)var4 * Math.sin((double)(24 - 12 * var6) * 3.141592653589793 / 180.0)) << 4, ((tr) this).field_i[var3_int] - (int)((double)var4 * Math.cos((double)(24 - var6 * 12) * 3.141592653589793 / 180.0)) << 4);
                              var5[var6 * 2 + 3] = el.a(0, ((tr) this).field_J[var3_int] + (int)((double)var4 * Math.sin(3.141592653589793 * (double)(-(var6 * 12) + 18) / 180.0)) << 4, ((tr) this).field_i[var3_int] + -(int)((double)var4 * Math.cos(3.141592653589793 * (double)(-(12 * var6) + 18) / 180.0)) << 4);
                              var6++;
                              continue L3;
                            }
                          }
                        }
                      }
                      L4: {
                        if (param0.field_G[1] != 0) {
                          var15 = new ik[2 + 2 * param0.field_G[1]];
                          var5 = var15;
                          var5[0] = el.a(0, ((tr) this).field_J[var3_int] << 4, ((tr) this).field_i[var3_int] << 4);
                          var5[1] = el.a(0, var4 + ((tr) this).field_J[var3_int] << 4, ((tr) this).field_i[var3_int] << 4);
                          var6 = 0;
                          L5: while (true) {
                            if (var6 >= param0.field_G[1]) {
                              qn.a(var15, gm.field_k[1], true);
                              break L4;
                            } else {
                              var5[2 - -(2 * var6)] = el.a(0, ((tr) this).field_J[var3_int] + (int)(Math.cos((double)(6 + 12 * var6) * 3.141592653589793 / 180.0) * (double)var4) << 4, ((tr) this).field_i[var3_int] - (int)((double)var4 * Math.sin((double)(6 + var6 * 12) * 3.141592653589793 / 180.0)) << 4);
                              var5[2 - -(2 * var6) + 1] = el.a(0, ((tr) this).field_J[var3_int] + (int)(Math.cos(3.141592653589793 * (double)(var6 * 12 + 12) / 180.0) * (double)var4) << 4, ((tr) this).field_i[var3_int] - (int)(Math.sin(3.141592653589793 * (double)(12 + 12 * var6) / 180.0) * (double)var4) << 4);
                              var6++;
                              continue L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (param0.field_G[2] == 0) {
                          break L6;
                        } else {
                          var16 = new ik[2 + param0.field_G[2] * 2];
                          var5 = var16;
                          var5[0] = el.a(0, ((tr) this).field_J[var3_int] << 4, ((tr) this).field_i[var3_int] << 4);
                          var5[1] = el.a(0, ((tr) this).field_J[var3_int] - -var4 << 4, ((tr) this).field_i[var3_int] << 4);
                          var6 = 0;
                          L7: while (true) {
                            if (var6 >= param0.field_G[2]) {
                              qn.a(var16, gm.field_k[2], true);
                              break L6;
                            } else {
                              var5[var6 * 2 + 2] = el.a(0, ((tr) this).field_J[var3_int] - -(int)(Math.cos((double)(6 + 12 * var6) * 3.141592653589793 / 180.0) * (double)var4) << 4, ((tr) this).field_i[var3_int] - -(int)(Math.sin(3.141592653589793 * (double)(6 + var6 * 12) / 180.0) * (double)var4) << 4);
                              var5[2 - -(var6 * 2) - -1] = el.a(0, ((tr) this).field_J[var3_int] + (int)((double)var4 * Math.cos((double)(12 + 12 * var6) * 3.141592653589793 / 180.0)) << 4, ((tr) this).field_i[var3_int] - -(int)((double)var4 * Math.sin((double)(12 + 12 * var6) * 3.141592653589793 / 180.0)) << 4);
                              var6++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (param0.field_G[3] == 0) {
                        break L1;
                      } else {
                        var17 = new ik[2 * param0.field_G[3] + 2];
                        var5 = var17;
                        var5[0] = el.a(0, ((tr) this).field_J[var3_int] << 4, ((tr) this).field_i[var3_int] << 4);
                        var5[1] = el.a(0, var4 / 2 + ((tr) this).field_J[var3_int] << 4, (int)(rh.field_e * (double)var4) + ((tr) this).field_i[var3_int] << 4);
                        var6 = 0;
                        L8: while (true) {
                          if (param0.field_G[3] <= var6) {
                            qn.a(var17, gm.field_k[3], true);
                            break L1;
                          } else {
                            var5[2 + 2 * var6] = el.a(0, ((tr) this).field_J[var3_int] + (int)((double)var4 * Math.sin(3.141592653589793 * (double)(-(12 * var6) + 24) / 180.0)) << 4, ((tr) this).field_i[var3_int] + (int)(Math.cos(3.141592653589793 * (double)(24 - 12 * var6) / 180.0) * (double)var4) << 4);
                            var5[2 + var6 * 2 + 1] = el.a(0, ((tr) this).field_J[var3_int] - -(int)(Math.sin((double)(18 + -(12 * var6)) * 3.141592653589793 / 180.0) * (double)var4) << 4, ((tr) this).field_i[var3_int] + (int)((double)var4 * Math.cos(3.141592653589793 * (double)(18 - var6 * 12) / 180.0)) << 4);
                            var6++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    var5_double = (double)(((tr) this).field_g * (float)((tr) this).field_Hb / ((float)((tr) this).field_n * ((tr) this).field_I));
                    ((tr) this).field_qb[0][param0.field_G[0]].b(-(int)(var5_double * 35.0) + ((tr) this).field_i[var3_int] + -((tr) this).field_Hb, -((int)(var5_double * (double)((tr) this).field_qb[0][0].field_w) / 2) + ((tr) this).field_J[var3_int], (int)(var5_double * (double)((tr) this).field_qb[0][0].field_z), (int)((double)((tr) this).field_qb[0][0].field_w * var5_double));
                    ((tr) this).field_qb[1][param0.field_G[1]].b(-(int)(rh.field_e * (var5_double * 32.0)) + (-((tr) this).field_Hb + ((tr) this).field_i[var3_int]), (int)(var5_double * 33.0) + ((tr) this).field_J[var3_int], (int)(var5_double * (double)((tr) this).field_qb[1][0].field_z), (int)(var5_double * (double)((tr) this).field_qb[1][0].field_w));
                    ((tr) this).field_qb[2][param0.field_G[2]].b(-2 + (((tr) this).field_i[var3_int] - ((tr) this).field_Hb + (int)(rh.field_e * (62.0 * var5_double))), (int)(33.0 * var5_double) + ((tr) this).field_J[var3_int], (int)(var5_double * (double)((tr) this).field_qb[2][0].field_z), (int)(var5_double * (double)((tr) this).field_qb[2][0].field_w));
                    ((tr) this).field_qb[3][param0.field_G[3]].b(((tr) this).field_Hb + (((tr) this).field_i[var3_int] + (int)(var5_double * 4.0)), -((int)(var5_double * (double)((tr) this).field_qb[3][0].field_w) / 2) + ((tr) this).field_J[var3_int], (int)(var5_double * (double)((tr) this).field_qb[3][0].field_z), (int)((double)((tr) this).field_qb[3][0].field_w * var5_double));
                    if (!((tr) this).field_X) {
                      break L1;
                    } else {
                      if (!td.field_L) {
                        break L1;
                      } else {
                        mj.field_Nb[param0.field_G[0]].b(-(int)(var5_double * 35.0) + -((tr) this).field_Hb + ((tr) this).field_i[var3_int], -((int)(var5_double * (double)((tr) this).field_qb[0][0].field_w) / 2) + ((tr) this).field_J[var3_int], (int)((double)((tr) this).field_qb[0][0].field_z * var5_double), (int)(var5_double * (double)((tr) this).field_qb[0][0].field_w), qd.field_f);
                        ts.field_L[param0.field_G[1]].b(((tr) this).field_i[var3_int] + (-((tr) this).field_Hb - (int)(rh.field_e * (32.0 * var5_double))), ((tr) this).field_J[var3_int] + (int)(33.0 * var5_double), (int)(var5_double * (double)((tr) this).field_qb[1][0].field_z), (int)((double)((tr) this).field_qb[1][0].field_w * var5_double), qd.field_f);
                        var10 = (om) (Object) ts.field_L[param0.field_G[2]];
                        var11 = var10.h();
                        var11.a();
                        var11.b((int)(rh.field_e * (var5_double * 62.0)) + (((tr) this).field_i[var3_int] + -((tr) this).field_Hb + -2), ((tr) this).field_J[var3_int] - -(int)(var5_double * 33.0), (int)((double)((tr) this).field_qb[2][0].field_z * var5_double), (int)(var5_double * (double)((tr) this).field_qb[2][0].field_w), qd.field_f);
                        var12 = (om) (Object) mj.field_Nb[param0.field_G[3]];
                        var13 = var12.h();
                        var13.a();
                        var13.b((int)(var5_double * 4.0) + ((tr) this).field_i[var3_int] - -((tr) this).field_Hb, -((int)(var5_double * (double)((tr) this).field_qb[3][0].field_w) / 2) + ((tr) this).field_J[var3_int], (int)(var5_double * (double)((tr) this).field_qb[3][0].field_z), (int)((double)((tr) this).field_qb[3][0].field_w * var5_double), qd.field_f);
                        break L1;
                      }
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
        }
    }

    private final void d(ln param0, int param1) {
        RuntimeException var3 = null;
        qm[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qm[] var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new qm[((tr) this).field_s.e(0)];
              var3_array = var8;
              if (param1 == 10) {
                break L1;
              } else {
                ((tr) this).field_yb = 97;
                break L1;
              }
            }
            int discarded$1 = ((tr) this).field_s.a((byte) 76, (oh[]) (Object) var3_array);
            var6 = 0;
            L2: while (true) {
              if (~var6 <= ~var8.length) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (var8[var6].field_q == param0) {
                      break L4;
                    } else {
                      if (var8[var6].field_o != 3) {
                        break L3;
                      } else {
                        if (var8[var6].field_r == param0) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    var4 = ((tr) this).field_i[param0.field_p];
                    var5 = ((tr) this).field_J[param0.field_p];
                    if (((tr) this).field_I >= 330.0f) {
                      break L5;
                    } else {
                      var5 = var5 - (7 * ((tr) this).field_n / 10 - -44);
                      break L5;
                    }
                  }
                  L6: {
                    if (var8[var6].field_o != 0) {
                      if (var8[var6].field_o != 1) {
                        if (var8[var6].field_o == 2) {
                          var5 -= 24;
                          var4 += 3;
                          break L6;
                        } else {
                          var4 += 10;
                          var5 -= 20;
                          break L6;
                        }
                      } else {
                        var4 -= 5;
                        var5 -= 24;
                        break L6;
                      }
                    } else {
                      var4 -= 13;
                      var5 -= 21;
                      break L6;
                    }
                  }
                  co.field_s.d(var4, var5, gm.field_k[var8[var6].field_o]);
                  break L3;
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("tr.CB(");
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
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        ln var6_ref_ln = null;
        int var7_int = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ln[] var14 = null;
        ln[] var15 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        var14 = ((tr) this).field_O.field_e;
        var5 = 0;
        L0: while (true) {
          if (~var5 <= ~var14.length) {
            var15 = ((tr) this).field_O.field_e;
            var13 = 0;
            var5 = var13;
            var6 = 12 % ((7 - param2) / 59);
            L1: while (true) {
              if (var13 >= var15.length) {
                this.a(((tr) this).field_hb, false, true, true);
                this.a(((tr) this).field_hb, true, true, true);
                return;
              } else {
                L2: {
                  var7 = var15[var13];
                  var8 = var7.field_p;
                  if (!((tr) this).field_P[var8]) {
                    break L2;
                  } else {
                    L3: {
                      if (((tr) this).field_B != null) {
                        if (var7.field_t == ((tr) this).field_B) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        if (var7.field_t != null) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      var9 = ((tr) this).field_t;
                      if (var9 <= 125) {
                        break L4;
                      } else {
                        var9 = -((tr) this).field_t + 150;
                        break L4;
                      }
                    }
                    if (var9 > 0) {
                      L5: {
                        var10 = 0;
                        var11 = ((tr) this).field_n;
                        if (var11 >= 16) {
                          break L5;
                        } else {
                          var11 = 16;
                          break L5;
                        }
                      }
                      L6: {
                        if (25 <= var9) {
                          break L6;
                        } else {
                          L7: {
                            if (((tr) this).field_t > 125) {
                              var10 = re.a(0, 25, ((tr) this).field_t + -125, -var11, 0);
                              break L7;
                            } else {
                              var10 = re.a(var11, 25, ((tr) this).field_t, 0, 0);
                              break L7;
                            }
                          }
                          var11 = re.a(var11 / 2, 25, var9, var11, 0);
                          break L6;
                        }
                      }
                      co.field_p[4].b(((tr) this).field_i[var8] - var11, -var11 + (((tr) this).field_J[var8] + var10), 2 * var11, var11 * 2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var13++;
                continue L1;
              }
            }
          } else {
            L8: {
              var6_ref_ln = var14[var5];
              var7_int = var6_ref_ln.field_p;
              if (!((tr) this).field_P[var7_int]) {
                break L8;
              } else {
                L9: {
                  if (((tr) this).field_B == null) {
                    if (null != var6_ref_ln.field_t) {
                      break L9;
                    } else {
                      break L8;
                    }
                  } else {
                    if (var6_ref_ln.field_t == ((tr) this).field_B) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  var8 = ((tr) this).field_t;
                  if (var8 <= 125) {
                    break L10;
                  } else {
                    var8 = -((tr) this).field_t + 150;
                    break L10;
                  }
                }
                if (var8 <= 0) {
                  break L8;
                } else {
                  L11: {
                    var9 = ((tr) this).field_n;
                    if (var9 < 16) {
                      var9 = 16;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (var8 < 25) {
                    L12: {
                      if (125 >= ((tr) this).field_t) {
                        int discarded$2 = re.a(var9, 25, ((tr) this).field_t, 0, 0);
                        break L12;
                      } else {
                        int discarded$3 = re.a(0, 25, -125 + ((tr) this).field_t, -var9, 0);
                        break L12;
                      }
                    }
                    var9 = re.a(var9 / 2, 25, var8, var9, 0);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            var5++;
            continue L0;
          }
        }
    }

    private final void a(ln param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        fs var4 = null;
        mg var5_ref_mg = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.field_p;
              var4 = ((tr) this).field_Z[var3_int];
              if (var4 == null) {
                var5_ref_mg = (mg) (Object) param0.field_s.c(-127);
                L2: while (true) {
                  L3: {
                    if (var5_ref_mg == null) {
                      break L3;
                    } else {
                      if (var5_ref_mg.field_G == ((tr) this).field_B) {
                        break L3;
                      } else {
                        var5_ref_mg = (mg) (Object) param0.field_s.b(32);
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    if (var5_ref_mg == null) {
                      break L4;
                    } else {
                      if (null != ((tr) this).field_B) {
                        if (((tr) this).field_kb[param0.field_p]) {
                          if (!((tr) this).field_A[param0.field_p]) {
                            gr.a(64, -59, ((tr) this).field_D[param0.field_p], 16776960);
                            break L4;
                          } else {
                            gr.a(64, -86, ((tr) this).field_D[param0.field_p], 65280);
                            break L4;
                          }
                        } else {
                          gr.a(96, -101, ((tr) this).field_D[param0.field_p], 16711680);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (((tr) this).field_z[var3_int] == 0) {
                    return;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (var4 != null) {
                stackOut_20_0 = var4.field_g;
                stackIn_21_0 = stackOut_20_0;
                break L5;
              } else {
                stackOut_19_0 = 3158064;
                stackIn_21_0 = stackOut_19_0;
                break L5;
              }
            }
            L6: {
              var5 = stackIn_21_0;
              var12 = qp.a(true, ((tr) this).field_Qb[param0.field_p]);
              var11 = var12;
              var10 = var11;
              var9 = var10;
              var6 = var9;
              if (var6 == null) {
                break L6;
              } else {
                L7: {
                  if (((tr) this).field_z[var3_int] == 1) {
                    qc.a(((16711422 & var5) >> 1) + 16384 + ((var5 & 16579836) >> 2), 18117, var12, 192);
                    break L7;
                  } else {
                    if (((tr) this).field_z[var3_int] == 2) {
                      qc.a((var5 >> 1 & 8355711) + 4210752 - -((var5 & 16579836) >> 2), 18117, var12, 192);
                      break L7;
                    } else {
                      qc.a((9408399 & var5) << 1, 18117, var12, 128);
                      break L7;
                    }
                  }
                }
                if (var4 != ((tr) this).field_B) {
                  break L6;
                } else {
                  if (((tr) this).field_B == null) {
                    break L6;
                  } else {
                    if (!((tr) this).field_kb[param0.field_p]) {
                      L8: {
                        var7 = 96;
                        if (((tr) this).field_U[param0.field_p] == 0) {
                          var7 = 192;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      gr.a(var7, -65, var6, 16711680);
                      break L6;
                    } else {
                      if (((tr) this).field_A[param0.field_p]) {
                        break L6;
                      } else {
                        L9: {
                          var7 = 64;
                          if (((tr) this).field_a[param0.field_p] == 0) {
                            var7 = 128;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        gr.a(var7, -63, var6, 16776960);
                        break L6;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("tr.WA(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + 0 + 41);
        }
    }

    private final void b(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fs var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_p;
              var4 = ((tr) this).field_Z[var3_int];
              if (var4 != null) {
                stackOut_2_0 = var4.field_k;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 8421504;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_3_0;
              if (param1 == -29496) {
                break L2;
              } else {
                this.b(88, 27, -65);
                break L2;
              }
            }
            L3: {
              if (((tr) this).field_I >= 330.0f) {
                if (((tr) this).field_I < 1024.0f) {
                  ek.field_z.d(-(ek.field_z.field_z / 2) + ((tr) this).field_i[param0.field_p], ((tr) this).field_J[param0.field_p] - ek.field_z.field_w / 2, var5);
                  vg.field_t.f(((tr) this).field_i[param0.field_p] - vg.field_t.field_z / 2, -3 + ((tr) this).field_J[param0.field_p] + -(vg.field_t.field_w / 2));
                  rs.field_Cb.c(Integer.toString(((tr) this).field_eb[var3_int]), ((tr) this).field_i[var3_int], ((tr) this).field_J[var3_int] - -4, 16777215, -1);
                  if (param0.field_L <= 0) {
                    break L3;
                  } else {
                    if (6 <= param0.field_B) {
                      break L3;
                    } else {
                      L4: {
                        gf.b((((tr) this).field_i[var3_int] << 4) - -em.field_c[0], (((tr) this).field_J[var3_int] << 4) - -ul.field_Db[0], 50, 7, h.field_s);
                        if (param0.field_L == 2) {
                          gf.b((((tr) this).field_i[var3_int] << 4) - -em.field_c[1], ul.field_Db[1] + (((tr) this).field_J[var3_int] << 4), 50, 7, h.field_s);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (param0.field_L != 3) {
                        break L3;
                      } else {
                        gf.b(em.field_c[2] + (((tr) this).field_i[var3_int] << 4), ul.field_Db[2] + (((tr) this).field_J[var3_int] << 4), 50, 7, h.field_s);
                        gf.b((((tr) this).field_i[var3_int] << 4) + em.field_c[3], (((tr) this).field_J[var3_int] << 4) + ul.field_Db[3], 50, 7, h.field_s);
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              } else {
                L5: {
                  ek.field_z.d(-(ek.field_z.field_z / 2) + ((tr) this).field_i[param0.field_p], -(7 * ((tr) this).field_n / 10) + ((tr) this).field_J[param0.field_p] - 63, var5);
                  if (!((tr) this).field_X) {
                    break L5;
                  } else {
                    if (!me.field_j) {
                      break L5;
                    } else {
                      ek.field_z.a(-(ek.field_z.field_z / 2) + ((tr) this).field_i[param0.field_p], -(7 * ((tr) this).field_n / 10) + ((tr) this).field_J[param0.field_p] + -63, qd.field_f);
                      break L5;
                    }
                  }
                }
                ii.field_y.f(-(ii.field_y.field_z / 2) + ((tr) this).field_i[param0.field_p], -72 + (-(((tr) this).field_n * 7 / 10) + ((tr) this).field_J[param0.field_p]));
                rs.field_Cb.c(Integer.toString(((tr) this).field_eb[var3_int]), ((tr) this).field_i[var3_int], -41 + ((tr) this).field_J[var3_int] - 7 * ((tr) this).field_n / 10, 16777215, -1);
                rs.field_Cb.c(param0.field_I, ((tr) this).field_i[var3_int], ((tr) this).field_J[var3_int] - 7 * ((tr) this).field_n / 10 - 11, 16777215, -1);
                if (param0.field_L <= 0) {
                  break L3;
                } else {
                  if (param0.field_B >= 6) {
                    break L3;
                  } else {
                    L6: {
                      gf.b(em.field_c[0] + (((tr) this).field_i[var3_int] << 4), (((tr) this).field_J[var3_int] - (7 * ((tr) this).field_n / 10 - -45) << 4) - -ul.field_Db[0], 50, 7, h.field_s);
                      if (2 != param0.field_L) {
                        break L6;
                      } else {
                        gf.b(em.field_c[1] + (((tr) this).field_i[var3_int] << 4), ul.field_Db[1] + (-45 + ((tr) this).field_J[var3_int] + -(((tr) this).field_n * 7 / 10) << 4), 50, 7, h.field_s);
                        break L6;
                      }
                    }
                    if (param0.field_L == 3) {
                      gf.b(em.field_c[2] + (((tr) this).field_i[var3_int] << 4), ul.field_Db[2] + (((tr) this).field_J[var3_int] + (-(((tr) this).field_n * 7 / 10) - 45) << 4), 50, 7, h.field_s);
                      gf.b((((tr) this).field_i[var3_int] << 4) + em.field_c[3], ul.field_Db[3] + (((tr) this).field_J[var3_int] + -(7 * ((tr) this).field_n / 10) - 45 << 4), 50, 7, h.field_s);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("tr.KA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param1 + 41);
        }
    }

    private final void a(byte param0, pf param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        as var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        di var10 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((tr) this).field_o.field_d.f(244874369)) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 2;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var3_int = stackIn_4_0;
            if (param0 < -100) {
              var4 = ((tr) this).field_t;
              L2: while (true) {
                if (((tr) this).field_t - -var3_int <= var4) {
                  break L0;
                } else {
                  var5 = var4 % 20;
                  var6 = (as) (Object) param1.d(0);
                  L3: while (true) {
                    if (var6 == null) {
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        var7 = (-var6.field_r + var6.field_j << 4) * var4 / 200 + (var6.field_r << 4);
                        var8 = (var6.field_n << 4) + (-var6.field_n + var6.field_k << 4) * var4 / 200;
                        var9 = var4 * (var6.field_p - var6.field_w) / 200 + var6.field_w;
                        var9 = var9 - (200 + -var4) * (var4 * var6.field_v) / 40000;
                        var6.field_l[var5] = var7;
                        var6.field_o[var5] = var8;
                        var6.field_u[var5] = var9;
                        if (((tr) this).field_t != var6.field_z) {
                          break L4;
                        } else {
                          var10 = new di();
                          var10.field_o = var9;
                          var10.field_l = var8;
                          var10.field_h = var7;
                          ((tr) this).field_V.a((byte) -113, (oh) (Object) var10);
                          break L4;
                        }
                      }
                      var6 = (as) (Object) param1.a((byte) -71);
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("tr.LB(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final void a(int param0, pf param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vn var4 = null;
        di var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        fs var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((tr) this).field_o.field_d.f(param0 + 244874372)) {
                stackOut_3_0 = 2;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if (((tr) this).field_T != 0) {
                if (((tr) this).field_T != 1) {
                  if (((tr) this).field_T != 2) {
                    if (((tr) this).field_T != 3) {
                      break L2;
                    } else {
                      L3: {
                        if (((tr) this).field_t >= 200) {
                          break L3;
                        } else {
                          this.a((byte) -110, ((tr) this).field_hb);
                          break L3;
                        }
                      }
                      ((tr) this).field_t = ((tr) this).field_t + var3_int;
                      if (((tr) this).field_t >= 200) {
                        ((tr) this).a(-1, param1, false);
                        ((tr) this).field_o.field_X.d(false);
                        ((tr) this).field_o.field_X.field_o = da.field_f;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    ((tr) this).field_t = ((tr) this).field_t + var3_int;
                    if (150 > ((tr) this).field_t) {
                      break L2;
                    } else {
                      ((tr) this).a(3, param1, false);
                      break L2;
                    }
                  }
                } else {
                  var4 = (vn) (Object) ((tr) this).field_m.d(0);
                  L4: while (true) {
                    if (var4 == null) {
                      L5: {
                        if (((tr) this).field_t >= 200) {
                          break L5;
                        } else {
                          this.a((byte) -116, ((tr) this).field_v);
                          break L5;
                        }
                      }
                      var5 = 200;
                      ((tr) this).field_t = ((tr) this).field_t + var3_int;
                      if (var5 > ((tr) this).field_t) {
                        break L2;
                      } else {
                        ((tr) this).a(2, param1, false);
                        break L2;
                      }
                    } else {
                      L6: while (true) {
                        if (vc.a((byte) -39, 200 + var4.field_x) < 200) {
                          L7: {
                            if (var4.field_u < 0) {
                              break L7;
                            } else {
                              if (var4.field_u == 0) {
                                if (vc.a((byte) -39, 10) != 0) {
                                  break L7;
                                } else {
                                  var5 = 0;
                                  L8: while (true) {
                                    if (var4.field_q.length <= var5) {
                                      var4.field_u = -1;
                                      break L7;
                                    } else {
                                      var4.field_v[var5] = 0;
                                      var5++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                L9: while (true) {
                                  if (40 > qf.a((byte) 12, 40 + var4.field_u, ((tr) this).field_l)) {
                                    break L7;
                                  } else {
                                    var5 = qf.a((byte) 36, var4.field_u, ((tr) this).field_l);
                                    var6 = 0;
                                    L10: while (true) {
                                      if (var4.field_q.length <= var6) {
                                        continue L9;
                                      } else {
                                        L11: {
                                          var7 = var4.field_q[var6];
                                          if (var7 != null) {
                                            stackOut_29_0 = var7.field_x;
                                            stackIn_30_0 = stackOut_29_0;
                                            break L11;
                                          } else {
                                            stackOut_28_0 = -1 + var4.field_v.length;
                                            stackIn_30_0 = stackOut_28_0;
                                            break L11;
                                          }
                                        }
                                        var8 = stackIn_30_0;
                                        var9 = var4.field_v[var8];
                                        var5 = var5 - var9;
                                        if (var5 < 0) {
                                          var4.field_v[var8] = var4.field_v[var8] - 1;
                                          var4.field_u = var4.field_u - 1;
                                          continue L9;
                                        } else {
                                          var6++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4 = (vn) (Object) ((tr) this).field_m.a((byte) -71);
                          continue L4;
                        } else {
                          ((tr) this).field_Y.a((byte) -113, (oh) (Object) new so(var4.field_o));
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                L12: {
                  if (((tr) this).field_t < 200) {
                    this.a((byte) -117, ((tr) this).field_c);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (((tr) this).field_W == 0) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L13;
                  } else {
                    stackOut_9_0 = 25 - -(((tr) this).field_W * 125);
                    stackIn_11_0 = stackOut_9_0;
                    break L13;
                  }
                }
                L14: {
                  var4_int = stackIn_11_0;
                  if (var4_int >= 200) {
                    break L14;
                  } else {
                    var4_int = 200;
                    break L14;
                  }
                }
                ((tr) this).field_t = ((tr) this).field_t + var3_int;
                if (((tr) this).field_t >= var4_int) {
                  ((tr) this).a(1, param1, false);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L15: {
              if (param0 == -3) {
                break L15;
              } else {
                var11 = null;
                this.a((ln) null, false);
                break L15;
              }
            }
            var4_ref = (di) (Object) ((tr) this).field_V.d(0);
            L16: while (true) {
              if (var4_ref == null) {
                break L0;
              } else {
                L17: {
                  int fieldTemp$1 = var4_ref.field_n + 1;
                  var4_ref.field_n = var4_ref.field_n + 1;
                  if (fieldTemp$1 != 50) {
                    break L17;
                  } else {
                    var4_ref.b((byte) -115);
                    break L17;
                  }
                }
                var4_ref = (di) (Object) ((tr) this).field_V.a((byte) -71);
                continue L16;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var3;
            stackOut_61_1 = new StringBuilder().append("tr.UA(").append(param0).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L18;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L18;
            }
          }
          throw r.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 41);
        }
    }

    private final void a(fs param0, int param1, int param2, int param3, int param4, int param5, vn param6) {
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
        int[] var21 = null;
        int stackIn_3_0 = 0;
        int[] stackIn_9_0 = null;
        int[] stackIn_10_0 = null;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int[] stackOut_8_0 = null;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                stackOut_2_0 = param0.field_x;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = param6.field_v.length - 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var8_int = stackIn_3_0;
              var9 = param6.field_v[var8_int];
              if (param0 == param6.field_k) {
                var9 = var9 + param6.field_n;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 != param6.field_l) {
                break L3;
              } else {
                if (var9 >= param6.field_m[var8_int]) {
                  break L3;
                } else {
                  L4: {
                    stackOut_8_0 = param6.field_v;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (null == param6.field_k) {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = ((tr) this).field_ib.length;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L4;
                    } else {
                      stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                      stackOut_9_1 = param6.field_k.field_x;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L4;
                    }
                  }
                  if (stackIn_11_0[stackIn_11_1] > 0) {
                    var9++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L5: {
              var10 = param2 - 2;
              if (var10 > 20) {
                var10 = 20;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param4 > 104) {
                break L6;
              } else {
                field_vb = null;
                break L6;
              }
            }
            L7: {
              var11 = var10 / 2;
              if (var11 > 5) {
                var11 = 5;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var12 = param3 + -(var11 * 2);
              var13 = var12 * param6.field_m[var8_int] / param6.field_z;
              if (var13 != 0) {
                break L8;
              } else {
                var13 = 1;
                break L8;
              }
            }
            L9: {
              var13 = var13 + var11 * 2;
              gf.a(-2 + -(var10 / 2) + (param2 / 2 + param5), -2 + (param1 + -var13), var10 + 4, 4 + var13, 2 + var11, 0);
              if (param0 == null) {
                stackOut_26_0 = 8421504;
                stackIn_27_0 = stackOut_26_0;
                break L9;
              } else {
                stackOut_25_0 = param0.field_k;
                stackIn_27_0 = stackOut_25_0;
                break L9;
              }
            }
            L10: {
              L11: {
                var14 = stackIn_27_0;
                if (param0 != param6.field_j) {
                  break L11;
                } else {
                  if (!param6.field_o.field_u) {
                    break L11;
                  } else {
                    gf.f(-(var10 / 2) + param2 / 2 + param5 - 2, param1 - var13 - 2, 4 + var10, var13 + 4, 2 + var11, gm.field_k[0]);
                    break L10;
                  }
                }
              }
              jq.a(2 + var11, var14, 4 + var10, param1 + -var13 - 2, -2 + (param2 / 2 + param5 + -(var10 / 2)), (byte) -126, 4 + var13);
              break L10;
            }
            var15 = var12 * var9 / param6.field_z;
            if (var15 != 0) {
              L12: {
                var15 = var15 + 2 * var11;
                gf.a(-(var10 / 2) + param5 - -(param2 / 2), param1 - var15, var10, var15, var11, var14);
                var16 = var15 / 3;
                if (~(var11 * 2 - -1) >= ~var16) {
                  break L12;
                } else {
                  var16 = 1 + var11 * 2;
                  break L12;
                }
              }
              gf.b(-(var10 / 2) + (param2 / 2 + param5), -var15 + param1, var10, var16, var11, 0, var14);
              var21 = new int[4];
              gf.a(var21);
              gf.d(param5 - (-(param2 / 2) - -(var10 / 2)), param1 - var13, param2 / 2 + (param5 + var10 / 2), param1);
              ie.a(ii.field_q, param5 + (param2 / 2 + -(var10 / 2)), -var13 + param1);
              gf.b(var21);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var8;
            stackOut_37_1 = new StringBuilder().append("tr.AB(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          L14: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param6 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
    }

    final void a(pf param0, pf param1, boolean param2, int param3, boolean param4, el param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        om var8_ref_om = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        om var15 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((tr) this).field_s = param1;
              ((tr) this).field_mb = param0;
              ai.a(true);
              if (!sm.field_e) {
                break L1;
              } else {
                if (cl.field_n - ((tr) this).field_L <= 30) {
                  if (((tr) this).field_gb == null) {
                    break L1;
                  } else {
                    ((tr) this).field_gb.c(0, 0);
                    return;
                  }
                } else {
                  L2: {
                    if (null != ((tr) this).field_gb) {
                      break L2;
                    } else {
                      ((tr) this).field_gb = new bi(640, 480);
                      break L2;
                    }
                  }
                  bs.a(((tr) this).field_gb, 78);
                  break L1;
                }
              }
            }
            L3: {
              if (((tr) this).field_Nb == ((tr) this).field_wb) {
                break L3;
              } else {
                ((tr) this).field_Nb = ((tr) this).field_wb;
                ra.a(-122);
                var15 = new om(10, (int)(((tr) this).field_wb * 200.0));
                var15.e();
                var9 = 0;
                L4: while (true) {
                  if (var9 >= 10) {
                    var8_ref_om = new om(15, (int)(200.0 * ((tr) this).field_wb));
                    var8_ref_om.e();
                    var9 = 0;
                    L5: while (true) {
                      if (var9 >= 15) {
                        var9 = (int)(0.5 + 345.0 * ((tr) this).field_wb);
                        var10 = (int)(400.0 * ((tr) this).field_wb + 0.5);
                        ((tr) this).field_ob = new om(var9, var10);
                        ((tr) this).field_ob.e();
                        var15.f(0, (int)(((tr) this).field_wb * 100.0 + 0.5));
                        var15.h(-10 + var9, (int)(100.0 * ((tr) this).field_wb + 0.5));
                        var15.a(15, -5 + var10 + -(int)(100.0 * ((tr) this).field_wb * 0.5 + 0.5), 4096, (int)(((tr) this).field_wb * 100.0 * rh.field_e) - -3, 10923);
                        var15.a(15, -5 + -(int)(0.5 + 0.5 * (((tr) this).field_wb * 100.0)) + var10, 4096, -3 + var9 + -(int)(100.0 * ((tr) this).field_wb * rh.field_e), 21845);
                        var15.a(15, 4 + (int)(0.5 * (((tr) this).field_wb * 100.0)), 4096, -3 + (var9 + -(int)(rh.field_e * (100.0 * ((tr) this).field_wb))), 43691);
                        var15.a(15, 4 + (int)(100.0 * ((tr) this).field_wb * 0.5), 4096, (int)(((tr) this).field_wb * 100.0 * rh.field_e) + 3, 54613);
                        ((tr) this).field_Ib = new om(var9, var10);
                        ((tr) this).field_Ib.e();
                        var8_ref_om.f(0, (int)(0.5 + ((tr) this).field_wb * 100.0));
                        var8_ref_om.h(var9 + -15, (int)(0.5 + ((tr) this).field_wb * 100.0));
                        var8_ref_om.a(15, -7 + -(int)(0.5 * (100.0 * ((tr) this).field_wb) + 0.5) + var10, 4096, (int)(rh.field_e * (((tr) this).field_wb * 100.0)) + 3, 10923);
                        var8_ref_om.a(param3 + -12099, var10 - ((int)(0.5 + 0.5 * (((tr) this).field_wb * 100.0)) + 7), 4096, -5 + -(int)(rh.field_e * (100.0 * ((tr) this).field_wb)) + var9, 21845);
                        var8_ref_om.a(15, (int)(0.5 * (((tr) this).field_wb * 100.0)) + 6, 4096, -5 + var9 - (int)(rh.field_e * (((tr) this).field_wb * 100.0)), 43691);
                        var8_ref_om.a(15, (int)(0.5 * (((tr) this).field_wb * 100.0)) + 6, 4096, (int)(rh.field_e * (((tr) this).field_wb * 100.0)) + 3, 54613);
                        cg.i(0);
                        var11 = 0;
                        L6: while (true) {
                          if (var10 * var9 <= var11) {
                            L7: {
                              var11 = -((tr) this).field_Hb + -(int)(150.0 * ((tr) this).field_wb) + (int)(300.0 * ((tr) this).field_Jb + 0.5);
                              ((tr) this).field_Cb = new om(var11 + 4, var11 / 10 + 8);
                              ((tr) this).field_K = new om((int)(4.0 + (double)var11 * 0.5), (int)(4.0 + rh.field_e * (double)var11));
                              ((tr) this).field_Ob = new om((int)(4.0 + (double)var11 * 0.5), (int)(4.0 + rh.field_e * (double)var11));
                              ra.a(-113);
                              ((tr) this).field_Cb.e();
                              eo.a(true, 4, 4, (byte) 115, 200, var11, 0);
                              ((tr) this).field_K.e();
                              eo.a(true, ((tr) this).field_K.field_w - 1, 4, (byte) 77, 200, var11 / 2, 0);
                              ((tr) this).field_Ob.e();
                              eo.a(true, ((tr) this).field_K.field_w + -1, 4, (byte) -35, 200, 4, -1 + ((tr) this).field_Ob.field_z);
                              cg.i(0);
                              if (((tr) this).field_xb == null) {
                                ((tr) this).field_xb = new bi[13];
                                ((tr) this).field_Mb = new bi[13];
                                ((tr) this).field_Kb = new bi[13];
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ra.a(-125);
                            var12 = 0;
                            L8: while (true) {
                              if (var12 >= ((tr) this).field_xb.length) {
                                cg.i(0);
                                break L3;
                              } else {
                                L9: {
                                  var13 = (int)(((tr) this).field_Jb * (double)ge.field_k[var12].field_o);
                                  if (var13 < 20 + vg.field_t.field_w) {
                                    var13 = vg.field_t.field_w + 20;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (((tr) this).field_I <= 1024.0f) {
                                    break L10;
                                  } else {
                                    if ((double)var13 <= 345.0 * ((tr) this).field_wb * 0.9) {
                                      break L10;
                                    } else {
                                      var13 = (int)(((tr) this).field_wb * 345.0 * 0.9);
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  ((tr) this).field_xb[var12] = new bi(var13, var13);
                                  ((tr) this).field_xb[var12].e();
                                  ge.field_k[var12].b(0, 0, var13, var13);
                                  var13 = (int)(0.8 * (((tr) this).field_Jb * (double)qa.field_p[var12].field_o));
                                  if (var13 < 20 + vg.field_t.field_w) {
                                    var13 = vg.field_t.field_w - -20;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (((tr) this).field_I <= 1024.0f) {
                                    break L12;
                                  } else {
                                    if (0.9 * (((tr) this).field_wb * 345.0) < (double)var13) {
                                      var13 = (int)(0.9 * (345.0 * ((tr) this).field_wb));
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  ((tr) this).field_Kb[var12] = new bi(var13, var13);
                                  ((tr) this).field_Kb[var12].e();
                                  qa.field_p[var12].b(0, 0, var13, var13);
                                  var13 = (int)(((tr) this).field_Jb * (double)qk.field_y[var12].field_o);
                                  if (var13 < 20 + vg.field_t.field_w) {
                                    var13 = vg.field_t.field_w - -20;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (1024.0f >= ((tr) this).field_I) {
                                    break L14;
                                  } else {
                                    if (((tr) this).field_wb * 345.0 * 0.9 >= (double)var13) {
                                      break L14;
                                    } else {
                                      var13 = (int)(((tr) this).field_wb * 345.0 * 0.9);
                                      break L14;
                                    }
                                  }
                                }
                                ((tr) this).field_Mb[var12] = new bi(var13, var13);
                                ((tr) this).field_Mb[var12].e();
                                qk.field_y[var12].b(0, 0, var13, var13);
                                var12++;
                                continue L8;
                              }
                            }
                          } else {
                            ((tr) this).field_ob.field_B[var11] = ee.a(16777215, ((tr) this).field_ob.field_B[var11] << 8);
                            ((tr) this).field_Ib.field_B[var11] = ee.a(16777215, ((tr) this).field_Ib.field_B[var11] << 8);
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        var10 = 16777215 - -(285212672 * (-var9 + 15));
                        gf.j(var9, 0, 200, var10);
                        var9++;
                        continue L5;
                      }
                    }
                  } else {
                    var10 = 16777215 - 218103808 * var9 - 2113929216;
                    gf.j(var9, 0, 200, var10);
                    var9++;
                    continue L4;
                  }
                }
              }
            }
            L15: {
              ((tr) this).b(-94);
              if (param3 == 12114) {
                break L15;
              } else {
                ((tr) this).field_Bb = true;
                break L15;
              }
            }
            L16: {
              this.f(29201);
              this.d(true);
              if (!param2) {
                break L16;
              } else {
                L17: {
                  var7_int = 510 & cl.field_n << 3;
                  if (var7_int < 256) {
                    break L17;
                  } else {
                    var7_int = -var7_int + 511;
                    break L17;
                  }
                }
                var8 = 16711680;
                mp.field_b.a("Checksum", 320, 240, var8, -1, var7_int);
                mp.field_b.a("Failure", 320, mp.field_b.field_J + 240, var8, -1, var7_int);
                break L16;
              }
            }
            L18: {
              if (!sm.field_e) {
                break L18;
              } else {
                ((tr) this).field_L = cl.field_n;
                cg.i(param3 + -12114);
                ((tr) this).field_gb.c(0, 0);
                break L18;
              }
            }
            ((tr) this).field_o.l(123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("tr.FA(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L19;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L19;
            }
          }
          L20: {
            stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L20;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L20;
            }
          }
          L21: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param5 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L21;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L21;
            }
          }
          throw r.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 41);
        }
    }

    final void a(boolean param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          super.a(param0);
          ((tr) this).field_Hb = ((tr) this).field_n;
          if (vg.field_t.field_z / 2 > ((tr) this).field_Hb) {
            ((tr) this).field_Hb = vg.field_t.field_z / 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((tr) this).field_Jb = (double)(((tr) this).field_g / ((tr) this).field_I);
          if (700.0f >= ((tr) this).field_I) {
            break L1;
          } else {
            ((tr) this).field_Hb = ((tr) this).field_n;
            break L1;
          }
        }
        L2: {
          L3: {
            ((tr) this).field_wb = ((tr) this).field_Jb * 0.8;
            if (((tr) this).field_Qb == null) {
              break L3;
            } else {
              if (((tr) this).field_Qb.length >= ((tr) this).field_O.field_e.length) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((tr) this).field_Qb = (int[][]) ((tr) this).field_D.clone();
          break L2;
        }
        var2 = 10.0f;
        var2 = var2 * (300.0f / ((tr) this).field_I);
        var3 = (float)(rh.field_e * (double)var2);
        var4 = (float)(0.5 * (double)var2);
        var5 = 0;
        L4: while (true) {
          if (var5 >= ((tr) this).field_Qb.length) {
            return;
          } else {
            ((tr) this).field_Qb[var5][1] = (int)((float)((tr) this).field_Qb[var5][1] + var2);
            ((tr) this).field_Qb[var5][2] = (int)((float)((tr) this).field_Qb[var5][2] - var3);
            ((tr) this).field_Qb[var5][3] = (int)((float)((tr) this).field_Qb[var5][3] + var4);
            ((tr) this).field_Qb[var5][4] = (int)((float)((tr) this).field_Qb[var5][4] - var3);
            ((tr) this).field_Qb[var5][5] = (int)((float)((tr) this).field_Qb[var5][5] - var4);
            ((tr) this).field_Qb[var5][7] = (int)((float)((tr) this).field_Qb[var5][7] - var2);
            ((tr) this).field_Qb[var5][8] = (int)((float)((tr) this).field_Qb[var5][8] + var3);
            ((tr) this).field_Qb[var5][9] = (int)((float)((tr) this).field_Qb[var5][9] - var4);
            ((tr) this).field_Qb[var5][10] = (int)((float)((tr) this).field_Qb[var5][10] + var3);
            ((tr) this).field_Qb[var5][11] = (int)((float)((tr) this).field_Qb[var5][11] + var4);
            var5++;
            continue L4;
          }
        }
    }

    private final mg c(int param0, int param1, byte param2) {
        mg var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          ((tr) this).field_Ab = false;
          ((tr) this).field_Gb = false;
          ((tr) this).field_Bb = false;
          if (((tr) this).field_rb == null) {
            break L0;
          } else {
            if (di.field_i[0].field_z * di.field_i[0].field_z / 4 <= (-((tr) this).field_ub[0] - (-30 - param1)) * (param1 - (((tr) this).field_ub[0] + -30)) - -((param0 + -((tr) this).field_ub[1]) * (-((tr) this).field_ub[1] + param0))) {
              if (di.field_i[0].field_z * di.field_i[0].field_z / 4 > (param1 - 30 - ((tr) this).field_ub[0]) * (-30 + -((tr) this).field_ub[0] + param1) - -((param0 + -((tr) this).field_ub[1]) * (-((tr) this).field_ub[1] + param0))) {
                ((tr) this).field_Ab = true;
                return ((tr) this).field_rb;
              } else {
                if ((-30 + -((tr) this).field_ub[1] + param0) * (-30 - ((tr) this).field_ub[1] + param0) + (-((tr) this).field_ub[0] + param1) * (-((tr) this).field_ub[0] + param1) < di.field_i[0].field_z * di.field_i[0].field_z / 4) {
                  ((tr) this).field_Bb = true;
                  return ((tr) this).field_rb;
                } else {
                  if ((-((tr) this).field_ub[1] + param0) * (-((tr) this).field_ub[1] + param0) + (param1 + -((tr) this).field_ub[0]) * (-((tr) this).field_ub[0] + param1) < 900) {
                    return ((tr) this).field_rb;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((tr) this).field_Gb = true;
              return ((tr) this).field_rb;
            }
          }
        }
        L1: {
          if (param2 >= 99) {
            break L1;
          } else {
            tr.a(43, true, true, 77);
            break L1;
          }
        }
        L2: {
          if (null == ((tr) this).field_p) {
            break L2;
          } else {
            var4 = this.a(((tr) this).field_p, param1, param0, -1);
            if (var4 == null) {
              break L2;
            } else {
              return var4;
            }
          }
        }
        var5 = ((tr) this).field_O.field_e;
        var6 = 0;
        L3: while (true) {
          if (var6 < var5.length) {
            var7 = var5[var6];
            var4 = this.a(var7, param1, param0, -1);
            if (var4 != null) {
              return var4;
            } else {
              var6++;
              continue L3;
            }
          } else {
            return null;
          }
        }
    }

    private final void b(int param0, int param1, byte param2) {
        es var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = (es) (Object) ((tr) this).field_ab.d(0);
        L0: while (true) {
          if (var4 == null) {
            var4 = (es) (Object) ((tr) this).field_ab.d(0);
            L1: while (true) {
              if (var4 == null) {
                return;
              } else {
                L2: {
                  var5 = ((tr) this).field_t - 125 * var4.field_k;
                  if (0 >= var5) {
                    break L2;
                  } else {
                    if (var5 >= 150) {
                      break L2;
                    } else {
                      L3: {
                        var6 = var5;
                        if (var6 > 125) {
                          var6 = -var5 + 150;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var7 = var4.field_p.field_p;
                        var8 = ((tr) this).field_n;
                        if (-1 == var4.field_o) {
                          var8 = var8 * (((tr) this).field_u + var4.field_h * 3) / ((tr) this).field_u;
                          if (var8 >= 12) {
                            break L4;
                          } else {
                            var8 = 12;
                            break L4;
                          }
                        } else {
                          if (var8 < 32) {
                            var8 = 32;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var9 = 0;
                        if (var6 < 25) {
                          L6: {
                            if (var5 <= 125) {
                              var9 = re.a(var8, 25, var5, 0, 0);
                              break L6;
                            } else {
                              var9 = re.a(0, 25, -125 + var5, -var8, 0);
                              break L6;
                            }
                          }
                          var8 = re.a(var8 / 2, 25, var6, var8, 0);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (var4.field_o != -1) {
                        co.field_p[var4.field_o].b(-var8 + ((tr) this).field_i[var7], ((tr) this).field_J[var7] - -var9 - var8, var8 * 2, var8 * 2);
                        break L2;
                      } else {
                        if (var4.field_i == null) {
                          break L2;
                        } else {
                          var4.field_i.field_d.a(15, var9 + ((tr) this).field_J[var7], 4096 * var8 / bd.field_G.field_z, ((tr) this).field_i[var7], ((tr) this).field_t % 25 * 200);
                          break L2;
                        }
                      }
                    }
                  }
                }
                var4 = (es) (Object) ((tr) this).field_ab.a((byte) -71);
                continue L1;
              }
            }
          } else {
            L7: {
              var5 = -(var4.field_k * 125) + ((tr) this).field_t;
              if (var5 <= 0) {
                break L7;
              } else {
                if (var5 < 150) {
                  L8: {
                    var6 = var5;
                    var7 = var4.field_p.field_p;
                    if (var6 > 125) {
                      var6 = -var5 + 150;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    var8 = ((tr) this).field_n;
                    if (-1 == var4.field_o) {
                      var8 = var8 * (((tr) this).field_u + var4.field_h * 3) / ((tr) this).field_u;
                      if (var8 >= 12) {
                        break L9;
                      } else {
                        var8 = 12;
                        break L9;
                      }
                    } else {
                      if (var8 < 32) {
                        var8 = 32;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (25 > var6) {
                      L11: {
                        if (125 < var5) {
                          int discarded$2 = re.a(0, 25, var5 + -125, -var8, 0);
                          break L11;
                        } else {
                          int discarded$3 = re.a(var8, 25, var5, 0, 0);
                          break L11;
                        }
                      }
                      var8 = re.a(var8 / 2, 25, var6, var8, 0);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  qc.a(0, 18117, ((tr) this).field_D[var7], 64);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            var4 = (es) (Object) ((tr) this).field_ab.a((byte) -71);
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.a(((tr) this).field_v, false, true, true);
        this.a(((tr) this).field_v, true, true, true);
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        so var5 = null;
        di var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = ((tr) this).field_o.d((byte) 14) >> 1;
        var5 = (so) (Object) ((tr) this).field_Y.d(0);
        L0: while (true) {
          if (var5 == null) {
            var6 = (di) (Object) ((tr) this).field_V.d(0);
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (((tr) this).field_T == 0) {
                    this.a(((tr) this).field_c, false, false, true);
                    this.a(((tr) this).field_c, true, false, true);
                    this.b(320, var2, (byte) 101);
                    break L2;
                  } else {
                    if (((tr) this).field_T != 1) {
                      if (((tr) this).field_T == 2) {
                        this.b(320, var2, 123);
                        break L2;
                      } else {
                        if (((tr) this).field_T != 3) {
                          break L2;
                        } else {
                          this.a(320, var2, (byte) -93);
                          break L2;
                        }
                      }
                    } else {
                      this.a(var2, 320, 150);
                      this.a((byte) 82, var2, 320);
                      break L2;
                    }
                  }
                }
                return;
              } else {
                L3: {
                  var3 = var6.field_h - (int)(16.0f * ((tr) this).field_k);
                  var4 = -(int)(16.0f * ((tr) this).field_E) + var6.field_l;
                  if (var6.field_n >= 10) {
                    stackOut_10_0 = 320 - 320 * var6.field_n / 50;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_9_0 = (var6.field_n << 8) * 5 / 50;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_11_0;
                  var8 = (int)((float)var3 * (300.0f / ((float)var6.field_o + ((tr) this).field_I))) + 5120;
                  var9 = (int)(300.0f / ((float)var6.field_o + ((tr) this).field_I) * (float)var4) + (var2 << 4);
                  var10 = (int)(32000.0f / (((tr) this).field_I + (float)var6.field_o)) + 64;
                  if (var10 >= 400) {
                    break L4;
                  } else {
                    gf.b(var8, var9, var10, var7, vj.field_F);
                    break L4;
                  }
                }
                var6 = (di) (Object) ((tr) this).field_V.a((byte) -71);
                continue L1;
              }
            }
          } else {
            L5: {
              if (6 <= var5.field_u) {
                stackOut_4_0 = -(var5.field_u * 2) + 260;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = 40 * var5.field_u;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            var6_int = stackIn_5_0;
            var7 = var5.field_h.field_p;
            var3 = (var5.field_p * ((tr) this).field_n >> 10) + (((tr) this).field_i[var7] << 4);
            var4 = (var5.field_n * ((tr) this).field_n >> 10) + (((tr) this).field_J[var7] << 4);
            gf.b(var3, var4, ((tr) this).field_n + 4 << 1, var6_int, vj.field_F);
            var5 = (so) (Object) ((tr) this).field_Y.a((byte) -71);
            continue L0;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 83 % ((param0 - 16) / 58);
        ((tr) this).field_tb[0] = ((tr) this).field_nb[0];
        ((tr) this).field_tb[1] = ((tr) this).field_nb[1];
        ((tr) this).field_rb = ((tr) this).field_S;
        ((tr) this).field_Db = ((tr) this).field_S;
        ((tr) this).field_yb = 15;
        ((tr) this).field_ub[1] = ((tr) this).field_nb[1];
        ((tr) this).field_ub[0] = ((tr) this).field_nb[0];
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln var8 = null;
        ln[] var9 = null;
        int var10 = 0;
        ln var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        Object var23 = null;
        cs var23_ref = null;
        int var24 = 0;
        ln var24_ref_ln = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        ln var31 = null;
        ln var32 = null;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var23 = null;
        var30 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 44100;
        var5 = ((tr) this).field_O.field_e;
        var6 = -7 / ((param0 - 12) / 62);
        var7 = 0;
        L0: while (true) {
          if (var7 >= var5.length) {
            return;
          } else {
            var31 = var5[var7];
            var8 = var31;
            if (var31.field_D != null) {
              var9 = var31.field_D;
              var10 = 0;
              L1: while (true) {
                if (var9.length > var10) {
                  var32 = var9[var10];
                  if (var32.field_p >= var8.field_p) {
                    var3 = -var32.field_S + var8.field_S;
                    var2 = var8.field_A + -var32.field_A;
                    if (var2 * var2 - -(var3 * var3) > var4) {
                      L2: {
                        L3: {
                          L4: {
                            var12 = var8.field_p;
                            var13 = ((tr) this).field_i[var12];
                            var14 = ((tr) this).field_J[var12];
                            var15 = var32.field_p;
                            var16 = ((tr) this).field_i[var15];
                            var17 = ((tr) this).field_J[var15];
                            var18 = (int)(((tr) this).field_Jb * 170.0);
                            var19 = (float)(-var13 + var16);
                            var20 = (float)(var17 - var14);
                            var21 = (float)Math.sqrt((double)(var19 * var19 + var20 * var20));
                            var19 = var19 / var21;
                            var20 = var20 / var21;
                            var22 = 128;
                            if (!((tr) this).field_X) {
                              break L4;
                            } else {
                              if (er.field_g) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (((tr) this).field_p == var8) {
                            break L3;
                          } else {
                            if (var32 == ((tr) this).field_p) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        var22 = (int)((1.0 + Math.cos(3.141592653589793 * (double)(cl.field_n % 50) / 25.0)) * 64.0) + 127;
                        break L2;
                      }
                      var23_ref = (cs) (Object) ((tr) this).field_mb.d(0);
                      L5: while (true) {
                        L6: {
                          if (var23_ref == null) {
                            break L6;
                          } else {
                            L7: {
                              if (var23_ref.field_n != var8) {
                                break L7;
                              } else {
                                if (var23_ref.field_k == var32) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var32 != var23_ref.field_n) {
                                break L8;
                              } else {
                                if (var23_ref.field_k != var8) {
                                  break L8;
                                } else {
                                  var24_ref_ln = var8;
                                  var8 = var32;
                                  var11 = var24_ref_ln;
                                  break L6;
                                }
                              }
                            }
                            var23_ref = (cs) (Object) ((tr) this).field_mb.a((byte) -71);
                            continue L5;
                          }
                        }
                        if ((float)(var18 * 2) < var21) {
                          L9: {
                            if (var23_ref != null) {
                              stackOut_31_0 = 65537 * var22 + (var22 >> 1) * 256;
                              stackIn_32_0 = stackOut_31_0;
                              break L9;
                            } else {
                              stackOut_30_0 = var22 * 65793;
                              stackIn_32_0 = stackOut_30_0;
                              break L9;
                            }
                          }
                          L10: {
                            var24 = stackIn_32_0;
                            var25 = var13 + (int)((float)var18 * var19);
                            var26 = var14 + (int)(var20 * (float)var18);
                            var27 = var16 - (int)(var19 * (float)var18);
                            var28 = -(int)((float)var18 * var20) + var17;
                            if (var23_ref == null) {
                              break L10;
                            } else {
                              if (var23_ref.field_m != 3) {
                                var22 = (-1 + var23_ref.field_m) * var22 / 2;
                                var29 = 65537 * var22 - -(256 * (var22 >> 1));
                                if (fj.field_t.field_f) {
                                  we.a(9, var27 << 4, var26 << 4, var25 << 4, var24, 0, var28 << 4, var29, 80);
                                  var10++;
                                  continue L1;
                                } else {
                                  be.a((byte) 92, 0, var27 << 4, var24, var26 << 4, var29, var25 << 4, var28 << 4, 5);
                                  var10++;
                                  continue L1;
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (fj.field_t.field_f) {
                            kr.a(70, var26 << 4, var27 << 4, var25 << 4, var24, var28 << 4);
                            var10++;
                            continue L1;
                          } else {
                            u.a(var26 << 4, -40, var27 << 4, var25 << 4, var28 << 4, var24);
                            var10++;
                            continue L1;
                          }
                        } else {
                          var10++;
                          continue L1;
                        }
                      }
                    } else {
                      var10++;
                      continue L1;
                    }
                  } else {
                    var10++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L0;
                }
              }
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ds.field_c == null) {
          L0: {
            if (1 == param0) {
              break L0;
            } else {
              if (param0 == 7) {
                break L0;
              } else {
                ((tr) this).field_S = this.c(param3, param2, (byte) 111);
                if (((tr) this).field_S == null) {
                  L1: {
                    ((tr) this).field_p = ((tr) this).a(param2, false, param3);
                    if (param0 != param1) {
                      break L1;
                    } else {
                      L2: {
                        var5 = null;
                        if (((tr) this).field_p == null) {
                          break L2;
                        } else {
                          var5 = (Object) (Object) (qm) (Object) ((tr) this).field_s.d(0);
                          L3: while (true) {
                            if (var5 == null) {
                              break L2;
                            } else {
                              L4: {
                                if (((qm) var5).field_p != ((tr) this).field_B) {
                                  break L4;
                                } else {
                                  if (((tr) this).field_p == ((qm) var5).field_q) {
                                    break L2;
                                  } else {
                                    if (((tr) this).field_p == ((qm) var5).field_r) {
                                      break L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              var5 = (Object) (Object) (qm) (Object) ((tr) this).field_s.a((byte) -71);
                              continue L3;
                            }
                          }
                        }
                      }
                      if (-1 == ((tr) this).field_T) {
                        if (var5 == null) {
                          ((tr) this).field_o.a(10, 0, ub.field_Bb);
                          break L1;
                        } else {
                          ((tr) this).field_o.a(10, 0, re.a(vo.field_c, 4371, new String[2]));
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
                  ((tr) this).field_p = null;
                  return;
                }
              }
            }
          }
          ((tr) this).field_nb[1] = -1;
          ((tr) this).field_S = null;
          ((tr) this).field_nb[0] = -1;
          ((tr) this).field_p = ((tr) this).a(param2, false, param3);
          return;
        } else {
          ((tr) this).field_nb[0] = -1;
          ((tr) this).field_p = null;
          ((tr) this).field_S = null;
          ((tr) this).field_nb[1] = -1;
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var7 = 0;
        fs var8 = null;
        fs var9 = null;
        int var10_int = 0;
        bi var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ln[] var16 = null;
        ln var17 = null;
        ln[] var18 = null;
        ln var19 = null;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          var16 = ((tr) this).field_O.field_e;
          if (param2 >= 119) {
            break L0;
          } else {
            field_zb = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var16.length) {
              break L2;
            } else {
              var17 = var16[var5];
              var7 = var17.field_p;
              if (var7 < ((tr) this).field_Q.length) {
                var8 = ((tr) this).field_Q[var7];
                var9 = ((tr) this).field_Z[var7];
                if (var9 != var8) {
                  L3: {
                    if (((tr) this).field_B != null) {
                      if (var9 == ((tr) this).field_B) {
                        break L3;
                      } else {
                        if (((tr) this).field_B == var8) {
                          if (((tr) this).field_B != var17.field_t) {
                            break L3;
                          } else {
                            var5++;
                            continue L1;
                          }
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      if (var9 != null) {
                        break L3;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  L4: {
                    var10_int = ((tr) this).field_t;
                    if (var10_int > 125) {
                      var10_int = -((tr) this).field_t + 150;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var11 = ((tr) this).field_n;
                    if (16 > var11) {
                      var11 = 16;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (25 > var10_int) {
                    L6: {
                      if (((tr) this).field_t > 125) {
                        int discarded$2 = re.a(0, 25, -125 + ((tr) this).field_t, -var11, 0);
                        break L6;
                      } else {
                        int discarded$3 = re.a(var11, 25, ((tr) this).field_t, 0, 0);
                        break L6;
                      }
                    }
                    var11 = re.a(var11 / 2, 25, var10_int, var11, 0);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                break L2;
              }
            }
          }
          var18 = ((tr) this).field_O.field_e;
          var15 = 0;
          var5 = var15;
          L7: while (true) {
            L8: {
              if (var18.length <= var15) {
                break L8;
              } else {
                var19 = var18[var15];
                var7 = var19.field_p;
                if (var7 >= ((tr) this).field_Q.length) {
                  break L8;
                } else {
                  var8 = ((tr) this).field_Q[var7];
                  var9 = ((tr) this).field_Z[var7];
                  if (var8 != var9) {
                    L9: {
                      if (null == ((tr) this).field_B) {
                        if (var9 != null) {
                          var10 = co.field_p[5];
                          break L9;
                        } else {
                          var15++;
                          continue L7;
                        }
                      } else {
                        if (var9 == ((tr) this).field_B) {
                          var10 = co.field_p[5];
                          break L9;
                        } else {
                          if (var8 == ((tr) this).field_B) {
                            if (((tr) this).field_B != var19.field_t) {
                              var10 = co.field_p[4];
                              break L9;
                            } else {
                              var15++;
                              continue L7;
                            }
                          } else {
                            var15++;
                            continue L7;
                          }
                        }
                      }
                    }
                    L10: {
                      var11 = ((tr) this).field_t;
                      if (var11 <= 125) {
                        break L10;
                      } else {
                        var11 = 150 + -((tr) this).field_t;
                        break L10;
                      }
                    }
                    L11: {
                      var12 = 0;
                      var13 = ((tr) this).field_n;
                      if (var13 >= 16) {
                        break L11;
                      } else {
                        var13 = 16;
                        break L11;
                      }
                    }
                    L12: {
                      if (var11 < 25) {
                        L13: {
                          if (((tr) this).field_t > 125) {
                            var12 = re.a(0, 25, -125 + ((tr) this).field_t, -var13, 0);
                            break L13;
                          } else {
                            var12 = re.a(var13, 25, ((tr) this).field_t, 0, 0);
                            break L13;
                          }
                        }
                        var13 = re.a(var13 / 2, 25, var11, var13, 0);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var10.b(-var13 + ((tr) this).field_i[var7], ((tr) this).field_J[var7] - -var12 + -var13, 2 * var13, 2 * var13);
                    var15++;
                    continue L7;
                  } else {
                    var15++;
                    continue L7;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        nd[] var1_array = null;
        int var2 = 0;
        int var4 = 0;
        nd[] var5 = null;
        nd[] var6 = null;
        int var7 = 0;
        nd var8 = null;
        nd var9 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = fe.field_y;
            var1_array = var5;
            var2 = 0;
            L1: while (true) {
              if (var5.length <= var2) {
                var6 = fe.field_H;
                var1_array = var6;
                var7 = 0;
                var2 = var7;
                L2: while (true) {
                  if (var7 >= var6.length) {
                    L3: {
                      if (di.field_m == 0) {
                        sg.a(true, false, 0, kl.field_r, tk.field_C);
                        sg.a(true, true, 400, rk.field_h, tk.field_C);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      int fieldTemp$1 = di.field_m + 1;
                      di.field_m = di.field_m + 1;
                      if (500 != fieldTemp$1) {
                        break L4;
                      } else {
                        jc.a(2, (byte) -61);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L5: {
                      var9 = var6[var7];
                      if (var9.field_h != 0) {
                        L6: {
                          var9.field_a = var9.field_a + var9.field_h;
                          if (100 <= var9.field_a) {
                            var9.field_h = -var9.field_h;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (0 < var9.field_a) {
                          break L5;
                        } else {
                          var9.field_a = 0;
                          var9.field_h = 0;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      if (0 != var9.field_a) {
                        break L7;
                      } else {
                        if (0 != vc.a((byte) -39, 100)) {
                          break L7;
                        } else {
                          var9.field_h = 10;
                          break L7;
                        }
                      }
                    }
                    var7++;
                    continue L2;
                  }
                }
              } else {
                L8: {
                  var8 = var5[var2];
                  if (var8.field_h != 0) {
                    L9: {
                      var8.field_a = var8.field_a + var8.field_h;
                      if (var8.field_a < 100) {
                        break L9;
                      } else {
                        var8.field_h = -var8.field_h;
                        break L9;
                      }
                    }
                    if (-1 <= var8.field_a) {
                      var8.field_a = 0;
                      var8.field_h = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (-1 != var8.field_a) {
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "tr.CA(" + 119 + 41);
        }
    }

    private final void e(ln param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        qm[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = (int)(((tr) this).field_Jb * 300.0);
            var4 = new qm[((tr) this).field_s.e(0)];
            int discarded$1 = ((tr) this).field_s.a((byte) -56, (oh[]) (Object) var4);
            var5 = new int[var4.length];
            var6 = -1;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var4.length) {
                L2: {
                  if (var6 == -1) {
                    break L2;
                  } else {
                    var7 = 0;
                    L3: while (true) {
                      if (var6 <= var7) {
                        var7 = 1 + var6;
                        L4: while (true) {
                          if (var7 >= var4.length) {
                            break L2;
                          } else {
                            L5: {
                              if (var4[var6].field_r == var4[var7].field_q) {
                                var5[var7] = var5[var7] + 1;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var7++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (var4[var6].field_r != var4[var7].field_q) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
                var7 = var3_int / 6;
                var13 = 0;
                var8 = var13;
                L7: while (true) {
                  if (var13 >= var4.length) {
                    L8: {
                      if (var7 >= 24) {
                        break L8;
                      } else {
                        var7 = 24;
                        break L8;
                      }
                    }
                    break L0;
                  } else {
                    if (param0 == var4[var13].field_q) {
                      L9: {
                        var9 = ((tr) this).field_n << 5;
                        if (100 <= var9) {
                          break L9;
                        } else {
                          var9 = 100;
                          break L9;
                        }
                      }
                      L10: {
                        if (((tr) this).field_I >= 330.0f) {
                          L11: {
                            var10 = (int)(((tr) this).field_Jb * 1500.0);
                            if (var10 <= 700) {
                              break L11;
                            } else {
                              var10 = 700;
                              break L11;
                            }
                          }
                          L12: {
                            L13: {
                              if (((tr) this).field_I >= 1024.0f) {
                                break L13;
                              } else {
                                if (var10 >= 450) {
                                  break L13;
                                } else {
                                  var10 = 450;
                                  break L12;
                                }
                              }
                            }
                            if (var10 < 150) {
                              var10 = 150;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            var11 = 0;
                            if (((tr) this).field_I > 1024.0f) {
                              var11 = 1;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            stackOut_46_0 = ((tr) this).field_i[param0.field_p];
                            stackIn_48_0 = stackOut_46_0;
                            stackIn_47_0 = stackOut_46_0;
                            if (var11 != 0) {
                              stackOut_48_0 = stackIn_48_0;
                              stackOut_48_1 = 2;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              break L15;
                            } else {
                              stackOut_47_0 = stackIn_47_0;
                              stackOut_47_1 = 0;
                              stackIn_49_0 = stackOut_47_0;
                              stackIn_49_1 = stackOut_47_1;
                              break L15;
                            }
                          }
                          L16: {
                            stackOut_49_0 = stackIn_49_0 + -stackIn_49_1 << 4;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            if (var11 != 0) {
                              stackOut_51_0 = stackIn_51_0;
                              stackOut_51_1 = 1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              break L16;
                            } else {
                              stackOut_50_0 = stackIn_50_0;
                              stackOut_50_1 = 0;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_52_1 = stackOut_50_1;
                              break L16;
                            }
                          }
                          gf.b(stackIn_52_0, -stackIn_52_1 + ((tr) this).field_J[param0.field_p] << 4, var10, 255, ((tr) this).field_bb[var4[var13].field_o]);
                          break L10;
                        } else {
                          gf.b(((tr) this).field_i[param0.field_p] << 4, ((tr) this).field_J[param0.field_p] - ((tr) this).field_n * 7 / 10 + -44 << 4, 550, 255, ((tr) this).field_bb[var4[var13].field_o]);
                          break L10;
                        }
                      }
                      L17: {
                        if (var9 > 2000) {
                          var9 = 2000;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var13++;
                      continue L7;
                    } else {
                      L18: {
                        if (var4[var13].field_o != 3) {
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var13++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8 = 0;
                L19: while (true) {
                  if (var7 <= var8) {
                    L20: {
                      if (3 == var4[var7].field_o) {
                        var6 = var7;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    var7++;
                    continue L1;
                  } else {
                    L21: {
                      if (var4[var7].field_q == var4[var8].field_q) {
                        var5[var7] = var5[var7] + 1;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    var8++;
                    continue L19;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var3 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var3;
            stackOut_60_1 = new StringBuilder().append("tr.TA(");
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L22;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L22;
            }
          }
          throw r.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + -29952 + 41);
        }
    }

    tr(l param0, fs[] param1, fs param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        om var7_ref_om = null;
        int var7 = 0;
        om var8_ref_om = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        ((tr) this).field_tb = new int[]{-1, -1};
        ((tr) this).field_Nb = -1.0;
        ((tr) this).field_ub = new int[]{-1, -1};
        ((tr) this).field_nb = new int[]{-1, -1};
        ((tr) this).field_yb = 0;
        try {
          L0: {
            L1: {
              ((tr) this).field_ib = param1;
              ((tr) this).field_O = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((tr) this).field_X = stackIn_4_1 != 0;
            ((tr) this).field_B = param2;
            ((tr) this).field_cb = new int[((tr) this).field_ib.length][];
            this.j(0);
            ((tr) this).field_E = (float)(((tr) this).field_O.field_b / 2);
            ((tr) this).field_g = 200.0f;
            ((tr) this).field_I = 300.0f;
            ((tr) this).field_F = (float)(((tr) this).field_O.field_k * 300 / 450);
            ((tr) this).field_k = (float)(((tr) this).field_O.field_k / 2);
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= 4) {
                var6_int = 0;
                L3: while (true) {
                  if (256 <= var6_int) {
                    ((tr) this).field_z = new int[((tr) this).field_O.field_e.length];
                    ((tr) this).field_c = new pf();
                    ((tr) this).field_m = new pf();
                    ((tr) this).field_ab = new pf();
                    ((tr) this).field_v = new pf();
                    ((tr) this).field_hb = new pf();
                    ((tr) this).field_Y = new pf();
                    ((tr) this).field_V = new pf();
                    ((tr) this).field_P = new boolean[((tr) this).field_O.field_e.length];
                    ((tr) this).field_qb = new om[4][6];
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= 6) {
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= 4) {
                            break L0;
                          } else {
                            var7 = gm.field_k[var6_int];
                            var8 = 255 & var7 >> 16;
                            var9 = (65280 & var7) >> 8;
                            var10 = 255 & var7;
                            var11 = 0;
                            L6: while (true) {
                              if (6 <= var11) {
                                var6_int++;
                                continue L5;
                              } else {
                                var12 = 0;
                                L7: while (true) {
                                  if (((tr) this).field_qb[var6_int][var11].field_B.length <= var12) {
                                    var11++;
                                    continue L6;
                                  } else {
                                    L8: {
                                      var13 = (16711680 & ((tr) this).field_qb[var6_int][var11].field_B[var12]) >> 16;
                                      var14 = (65280 & ((tr) this).field_qb[var6_int][var11].field_B[var12]) >> 8;
                                      var15 = 255 & ((tr) this).field_qb[var6_int][var11].field_B[var12];
                                      if (var14 != var13) {
                                        break L8;
                                      } else {
                                        if (var13 != var15) {
                                          break L8;
                                        } else {
                                          if (128 < var13) {
                                            ((tr) this).field_qb[var6_int][var11].field_B[var12] = we.a(-16777216, ((tr) this).field_qb[var6_int][var11].field_B[var12]) + ((var10 * (256 + -var15) - (32640 + -(255 * var15)) >> 7) + ((-var14 + 256) * var9 + -32640 + var14 * 255 >> 7 << 8) + (255 * (var13 - 128) + var8 * (-var13 + 256) >> 7 << 16));
                                            break L8;
                                          } else {
                                            ((tr) this).field_qb[var6_int][var11].field_B[var12] = we.a(-16777216, ((tr) this).field_qb[var6_int][var11].field_B[var12]) + (var10 * var15 >> 7) + (var9 * var14 >> 7 << 8) + (var8 * var13 >> 7 << 16);
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                    var12++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var7_ref_om = (om) (Object) mj.field_Nb[var6_int];
                        var8_ref_om = (om) (Object) ts.field_L[var6_int];
                        ((tr) this).field_qb[0][var6_int] = var7_ref_om.h();
                        ((tr) this).field_qb[3][var6_int] = var7_ref_om.h();
                        ((tr) this).field_qb[3][var6_int].a();
                        ((tr) this).field_qb[1][var6_int] = var8_ref_om.h();
                        ((tr) this).field_qb[2][var6_int] = var8_ref_om.h();
                        ((tr) this).field_qb[2][var6_int].a();
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    ((tr) this).field_bb[0][var6_int] = ee.a(we.a(254, var6_int) << 7, var6_int);
                    ((tr) this).field_bb[1][var6_int] = var6_int << 8;
                    ((tr) this).field_bb[2][var6_int] = ee.a(var6_int << 8, var6_int << 16);
                    ((tr) this).field_bb[3][var6_int] = ee.a(var6_int << 16, var6_int);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                ((tr) this).field_bb[var6_int] = new int[256];
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("tr.<init>(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static hb a(byte param0, db param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        dn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 26) {
              stackOut_3_0 = new dn(param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("tr.DB(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (hb) (Object) stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = "Player Name: ";
        field_Fb = "Public";
        field_vb = new pf();
        field_pb = "<%0> is already on your friend list.";
        field_Pb = "Just play";
    }
}
