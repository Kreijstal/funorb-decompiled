/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lm extends ji {
    private int field_z;
    private int field_E;
    static cr field_F;
    private int field_C;
    private int field_L;
    private int field_A;
    private int field_K;
    static String field_H;
    private int field_D;
    private int field_y;
    static boolean field_G;
    private int field_J;
    private int field_I;

    public lm() {
        super(0, true);
        ((lm) this).field_z = 0;
        ((lm) this).field_L = 819;
        ((lm) this).field_E = 0;
        ((lm) this).field_C = 409;
        ((lm) this).field_A = 1024;
        ((lm) this).field_D = 1024;
        ((lm) this).field_J = 1024;
        ((lm) this).field_I = 1024;
        ((lm) this).field_y = 2048;
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 110) {
              L1: {
                var4_int = param1;
                if (0 != var4_int) {
                  if (var4_int == 1) {
                    ((lm) this).field_D = param2.a((byte) -11);
                    break L1;
                  } else {
                    if (var4_int != 2) {
                      if (var4_int != 3) {
                        if (var4_int == 4) {
                          ((lm) this).field_L = param2.a((byte) -11);
                          break L1;
                        } else {
                          if (5 == var4_int) {
                            ((lm) this).field_A = param2.a((byte) -11);
                            break L1;
                          } else {
                            if (var4_int != 6) {
                              if (var4_int != 7) {
                                if (var4_int != 8) {
                                  break L1;
                                } else {
                                  ((lm) this).field_J = param2.a((byte) -11);
                                  break L1;
                                }
                              } else {
                                ((lm) this).field_I = param2.a((byte) -11);
                                break L1;
                              }
                            } else {
                              ((lm) this).field_z = param2.h(-11);
                              break L1;
                            }
                          }
                        }
                      } else {
                        ((lm) this).field_C = param2.a((byte) -11);
                        break L1;
                      }
                    } else {
                      ((lm) this).field_y = param2.a((byte) -11);
                      break L1;
                    }
                  }
                } else {
                  ((lm) this).field_E = param2.h(-11);
                  break L1;
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
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("lm.C(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final static boolean a(r param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -78 / ((param1 - 64) / 52);
            stackOut_0_0 = param0.a((byte) -112);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lm.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (hm.field_F < 0) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (hm.field_F >= 75) {
              break L0;
            } else {
              var5 = (hm.field_F << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (hm.field_F <= 200) {
              break L1;
            } else {
              var5 = (250 + -hm.field_F << 8) / 50;
              break L1;
            }
          }
          L2: {
            lq.a(n.field_a, (byte) -94);
            oo.c();
            bi.c();
            bq.h(-125);
            if (256 > var5) {
              bi.b(0, 0, bi.field_e, bi.field_j, 0, 256 - var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ln.d(-28558);
            if (150 > hm.field_F) {
              n.field_a.b(var3, var4);
              break L3;
            } else {
              qn.field_r.c(15 + var3, var4 + 10, var5);
              break L3;
            }
          }
          L4: {
            var6 = -125 + hm.field_F;
            if (var6 <= 0) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  pl.field_h.d(var3, var4, var7);
                  break L4;
                } else {
                  if (var6 >= 30) {
                    var7 = (-(var6 * 256) + 12800) / 20;
                    pl.field_h.d(var3, var4, var7);
                    break L4;
                  } else {
                    pl.field_h.d(var3, var4, 256);
                    break L4;
                  }
                }
              }
            }
          }
          L5: {
            var6 = -140 + hm.field_F;
            if (var6 <= 0) {
              break L5;
            } else {
              L6: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L6;
                } else {
                  break L6;
                }
              }
              lr.field_O.c(var3 - -15, 10 + var4, var7 * var5 >> 8);
              break L5;
            }
          }
          return;
        }
    }

    final static er[] a(String param0, int param1, String param2, r param3) {
        er[] var4 = null;
        RuntimeException var4_ref = null;
        er[] var5 = null;
        er[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        er[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var5 = gk.a(param3, param0, param2, true);
            var4 = var5;
            var5[1].field_x = var5[1].field_y;
            var5[3].field_B = var5[3].field_t;
            var5[5].field_B = var5[5].field_t;
            var5[7].field_x = var5[7].field_y;
            stackOut_0_0 = (er[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("lm.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(23109).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void b(byte param0) {
        field_H = null;
        int var1 = -25;
        field_F = null;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[][] var4 = null;
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
        int var17 = 0;
        int var18 = 0;
        int[][] var19 = null;
        int[][] var20 = null;
        Random var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26_int = 0;
        int[] var26 = null;
        int[][] var27 = null;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[][] var39 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[][] var45 = null;
        int[][] var46 = null;
        int[][] var47 = null;
        int[][] var50 = null;
        int[][] var51 = null;
        int[][] var54 = null;
        int[][] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        var38 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var3 = ((lm) this).field_x.a(param0, (byte) 105);
            if (((lm) this).field_x.field_i) {
              var54 = ((lm) this).field_x.a(100);
              var50 = var54;
              var46 = var50;
              var39 = var46;
              var4 = var39;
              var5 = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var10 = 1;
              var11 = 1;
              var12 = 0;
              var13 = 0;
              var14 = ((lm) this).field_D * we.field_M >> 12;
              var15 = ((lm) this).field_y * we.field_M >> 12;
              var16 = aa.field_Vb * ((lm) this).field_C >> 12;
              var17 = aa.field_Vb * ((lm) this).field_L >> 12;
              if (var17 <= 1) {
                return var54[param0];
              } else {
                ((lm) this).field_K = we.field_M / 8 * ((lm) this).field_A >> 12;
                var18 = 1 + we.field_M / var14;
                var19 = new int[var18][3];
                var55 = new int[var18][3];
                var51 = var55;
                var47 = var51;
                var20 = var47;
                var21 = new Random((long)((lm) this).field_E);
                L1: while (true) {
                  L2: {
                    var23 = mj.a(-128, var21, var15 - var14) + var14;
                    var24 = var16 - -mj.a(-103, var21, -var16 + var17);
                    var25 = var23 + var8;
                    if (var25 > we.field_M) {
                      var23 = we.field_M + -var8;
                      var25 = we.field_M;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var11 != 0) {
                      var22 = 0;
                      break L3;
                    } else {
                      L4: {
                        var26_int = var9;
                        var56 = var55[var9];
                        var28 = 0;
                        var29_int = var5 + var25;
                        if (var29_int >= 0) {
                          break L4;
                        } else {
                          var29_int = var29_int + we.field_M;
                          break L4;
                        }
                      }
                      L5: {
                        if (we.field_M < var29_int) {
                          var29_int = var29_int - we.field_M;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var22 = var56[2];
                      L6: while (true) {
                        L7: {
                          var57 = var55[var26_int];
                          if (var29_int < var57[0]) {
                            break L7;
                          } else {
                            if (var29_int <= var57[1]) {
                              L8: {
                                if (var26_int == var9) {
                                  break L8;
                                } else {
                                  L9: {
                                    var30 = var5 + var8;
                                    if (0 > var30) {
                                      var30 = var30 + we.field_M;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (var30 <= we.field_M) {
                                      break L10;
                                    } else {
                                      var30 = var30 - we.field_M;
                                      break L10;
                                    }
                                  }
                                  var31 = 1;
                                  L11: while (true) {
                                    if (var31 > var28) {
                                      var31 = 0;
                                      L12: while (true) {
                                        if (var31 > var28) {
                                          break L8;
                                        } else {
                                          var42 = var20[(var9 - -var31) % var12];
                                          var33 = var42[2];
                                          if (var22 != var33) {
                                            L13: {
                                              var36 = var42[0];
                                              var37 = var42[1];
                                              if (var30 < var29_int) {
                                                var34 = Math.max(var30, var36);
                                                var35 = Math.min(var29_int, var37);
                                                break L13;
                                              } else {
                                                if (var36 == 0) {
                                                  var34 = 0;
                                                  var35 = Math.min(var29_int, var37);
                                                  break L13;
                                                } else {
                                                  var34 = Math.max(var30, var36);
                                                  var35 = we.field_M;
                                                  break L13;
                                                }
                                              }
                                            }
                                            this.a(var22 + -var33, (byte) -35, var21, var33, var4, var35 - var34, var34 - -var7);
                                            var31++;
                                            continue L12;
                                          } else {
                                            var31++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    } else {
                                      var41 = var20[(var31 + var9) % var12];
                                      var22 = Math.max(var22, var41[2]);
                                      var31++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                              var9 = var26_int;
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L14: {
                          var26_int++;
                          if (var26_int < var12) {
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var28++;
                        continue L6;
                      }
                    }
                  }
                  L15: {
                    if (aa.field_Vb < var22 + var24) {
                      var24 = aa.field_Vb - var22;
                      break L15;
                    } else {
                      var10 = 0;
                      break L15;
                    }
                  }
                  if (var25 == we.field_M) {
                    this.a(var24, (byte) -35, var21, var22, var4, var23, var8 - -var6);
                    if (var10 == 0) {
                      L16: {
                        var10 = 1;
                        int incrementValue$2 = var13;
                        var13++;
                        var44 = var19[incrementValue$2];
                        var26 = var44;
                        var44[1] = var25;
                        var26[2] = var24 + var22;
                        var44[0] = var8;
                        var27 = var20;
                        var45 = var19;
                        var19 = var27;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = mj.a(-102, var21, we.field_M);
                        var5 = -var7 + var6;
                        var8 = 0;
                        var28 = var5;
                        if (var28 >= 0) {
                          break L16;
                        } else {
                          var28 = var28 + we.field_M;
                          break L16;
                        }
                      }
                      L17: {
                        if (we.field_M >= var28) {
                          break L17;
                        } else {
                          var28 = var28 - we.field_M;
                          break L17;
                        }
                      }
                      var9 = 0;
                      L18: while (true) {
                        L19: {
                          var29 = var45[var9];
                          if (var28 < var29[0]) {
                            break L19;
                          } else {
                            if (var28 > var29[1]) {
                              break L19;
                            } else {
                              var11 = 0;
                              continue L1;
                            }
                          }
                        }
                        var9++;
                        if (var9 >= var12) {
                          var9 = 0;
                          continue L18;
                        } else {
                          continue L18;
                        }
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    int incrementValue$3 = var13;
                    var13++;
                    var43 = var19[incrementValue$3];
                    var26 = var43;
                    var26[2] = var22 + var24;
                    var43[0] = var8;
                    var43[1] = var25;
                    this.a(var24, (byte) -35, var21, var22, var4, var23, var8 - -var6);
                    var8 = var25;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final void a(int param0) {
        if (param0 > -98) {
            Object var3 = null;
            boolean discarded$0 = lm.a((r) null, (byte) 122);
        }
    }

    private final void a(int param0, byte param1, Random param2, int param3, int[][] param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_30_2 = null;
        int stackIn_30_3 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_31_2 = null;
        int stackIn_31_3 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int[] stackIn_45_2 = null;
        int stackIn_45_3 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int[] stackIn_46_2 = null;
        int stackIn_46_3 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int[] stackIn_47_2 = null;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int[] stackOut_44_2 = null;
        int stackOut_44_3 = 0;
        int[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int[] stackOut_46_2 = null;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int[] stackOut_45_2 = null;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int[] stackOut_31_2 = null;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((lm) this).field_J > 0) {
                stackOut_5_0 = -mj.a(-121, param2, ((lm) this).field_J) + 4096;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 4096;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var8_int = stackIn_6_0;
              var9 = ((lm) this).field_K * ((lm) this).field_I >> 12;
              stackOut_6_0 = ((lm) this).field_K;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (0 >= var9) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L2;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = mj.a(-104, param2, var9);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_9_0 + -stackIn_9_1;
              if (param6 >= we.field_M) {
                param6 = param6 - we.field_M;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var10 <= 0) {
                if (param6 - -param5 > we.field_M) {
                  var11 = -param6 + we.field_M;
                  var12 = 0;
                  L5: while (true) {
                    if (var12 >= param0) {
                      break L4;
                    } else {
                      var13 = param4[param3 - -var12];
                      qq.a(var13, param6, var11, var8_int);
                      qq.a(var13, 0, param5 - var11, var8_int);
                      var12++;
                      continue L5;
                    }
                  }
                } else {
                  var11 = 0;
                  L6: while (true) {
                    if (var11 >= param0) {
                      break L4;
                    } else {
                      qq.a(param4[param3 - -var11], param6, param5, var8_int);
                      var11++;
                      continue L6;
                    }
                  }
                }
              } else {
                L7: {
                  if (param0 <= 0) {
                    break L7;
                  } else {
                    if (0 < param5) {
                      L8: {
                        var11 = param5 / 2;
                        var12 = param0 / 2;
                        if (var10 <= var11) {
                          stackOut_19_0 = var10;
                          stackIn_20_0 = stackOut_19_0;
                          break L8;
                        } else {
                          stackOut_18_0 = var11;
                          stackIn_20_0 = stackOut_18_0;
                          break L8;
                        }
                      }
                      L9: {
                        var13_int = stackIn_20_0;
                        if (var10 <= var12) {
                          stackOut_22_0 = var10;
                          stackIn_23_0 = stackOut_22_0;
                          break L9;
                        } else {
                          stackOut_21_0 = var12;
                          stackIn_23_0 = stackOut_21_0;
                          break L9;
                        }
                      }
                      var14 = stackIn_23_0;
                      var15 = var13_int + param6;
                      var16 = param5 - var13_int * 2;
                      var17 = 0;
                      L10: while (true) {
                        if (var17 >= param0) {
                          break L4;
                        } else {
                          L11: {
                            var18 = param4[var17 - -param3];
                            if (var14 <= var17) {
                              var19 = param0 - var17 - 1;
                              if (var19 < var14) {
                                L12: {
                                  var20 = var19 * var8_int / var14;
                                  if (((lm) this).field_z == 0) {
                                    var21 = 0;
                                    L13: while (true) {
                                      if (var21 >= var13_int) {
                                        break L12;
                                      } else {
                                        var22 = var8_int * var21 / var13_int;
                                        int dupTemp$5 = b.a(-1 + (-var21 + (param5 + param6)), rm.field_z);
                                        var18[dupTemp$5] = var22 * var20 >> 12;
                                        var18[b.a(var21 + param6, rm.field_z)] = var22 * var20 >> 12;
                                        var21++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    var21 = 0;
                                    L14: while (true) {
                                      if (var21 >= var13_int) {
                                        break L12;
                                      } else {
                                        L15: {
                                          var22 = var8_int * var21 / var13_int;
                                          stackOut_44_0 = (int[]) var18;
                                          stackOut_44_1 = b.a(var21 + param6, rm.field_z);
                                          stackOut_44_2 = (int[]) var18;
                                          stackOut_44_3 = b.a(rm.field_z, -1 + (-var21 + (param5 + param6)));
                                          stackIn_46_0 = stackOut_44_0;
                                          stackIn_46_1 = stackOut_44_1;
                                          stackIn_46_2 = stackOut_44_2;
                                          stackIn_46_3 = stackOut_44_3;
                                          stackIn_45_0 = stackOut_44_0;
                                          stackIn_45_1 = stackOut_44_1;
                                          stackIn_45_2 = stackOut_44_2;
                                          stackIn_45_3 = stackOut_44_3;
                                          if (var22 >= var20) {
                                            stackOut_46_0 = (int[]) (Object) stackIn_46_0;
                                            stackOut_46_1 = stackIn_46_1;
                                            stackOut_46_2 = (int[]) (Object) stackIn_46_2;
                                            stackOut_46_3 = stackIn_46_3;
                                            stackOut_46_4 = var20;
                                            stackIn_47_0 = stackOut_46_0;
                                            stackIn_47_1 = stackOut_46_1;
                                            stackIn_47_2 = stackOut_46_2;
                                            stackIn_47_3 = stackOut_46_3;
                                            stackIn_47_4 = stackOut_46_4;
                                            break L15;
                                          } else {
                                            stackOut_45_0 = (int[]) (Object) stackIn_45_0;
                                            stackOut_45_1 = stackIn_45_1;
                                            stackOut_45_2 = (int[]) (Object) stackIn_45_2;
                                            stackOut_45_3 = stackIn_45_3;
                                            stackOut_45_4 = var22;
                                            stackIn_47_0 = stackOut_45_0;
                                            stackIn_47_1 = stackOut_45_1;
                                            stackIn_47_2 = stackOut_45_2;
                                            stackIn_47_3 = stackOut_45_3;
                                            stackIn_47_4 = stackOut_45_4;
                                            break L15;
                                          }
                                        }
                                        stackIn_47_2[stackIn_47_3] = stackIn_47_4;
                                        stackIn_47_0[stackIn_47_1] = stackIn_47_4;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                                if (var15 - -var16 > we.field_M) {
                                  var21 = -var15 + we.field_M;
                                  qq.a(var18, var15, var21, var20);
                                  qq.a(var18, 0, -var21 + var16, var20);
                                  break L11;
                                } else {
                                  qq.a(var18, var15, var16, var20);
                                  break L11;
                                }
                              } else {
                                var20 = 0;
                                L16: while (true) {
                                  if (var20 >= var13_int) {
                                    if (we.field_M >= var15 - -var16) {
                                      qq.a(var18, var15, var16, var8_int);
                                      break L11;
                                    } else {
                                      var20 = we.field_M - var15;
                                      qq.a(var18, var15, var20, var8_int);
                                      qq.a(var18, 0, var16 + -var20, var8_int);
                                      break L11;
                                    }
                                  } else {
                                    int dupTemp$6 = b.a(rm.field_z, param6 + param5 - (var20 + 1));
                                    var18[dupTemp$6] = var8_int * var20 / var13_int;
                                    var18[b.a(rm.field_z, param6 - -var20)] = var8_int * var20 / var13_int;
                                    var20++;
                                    continue L16;
                                  }
                                }
                              }
                            } else {
                              L17: {
                                var19 = var8_int * var17 / var14;
                                if (((lm) this).field_z == 0) {
                                  var20 = 0;
                                  L18: while (true) {
                                    if (var13_int <= var20) {
                                      break L17;
                                    } else {
                                      var21 = var8_int * var20 / var13_int;
                                      int dupTemp$7 = b.a(-1 + (-var20 + (param5 + param6)), rm.field_z);
                                      var18[dupTemp$7] = var19 * var21 >> 12;
                                      var18[b.a(param6 - -var20, rm.field_z)] = var19 * var21 >> 12;
                                      var20++;
                                      continue L18;
                                    }
                                  }
                                } else {
                                  var20 = 0;
                                  L19: while (true) {
                                    if (var20 >= var13_int) {
                                      break L17;
                                    } else {
                                      L20: {
                                        var21 = var8_int * var20 / var13_int;
                                        stackOut_29_0 = (int[]) var18;
                                        stackOut_29_1 = b.a(rm.field_z, param6 + var20);
                                        stackOut_29_2 = (int[]) var18;
                                        stackOut_29_3 = b.a(-1 + (param5 + (param6 + -var20)), rm.field_z);
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_31_1 = stackOut_29_1;
                                        stackIn_31_2 = stackOut_29_2;
                                        stackIn_31_3 = stackOut_29_3;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        stackIn_30_2 = stackOut_29_2;
                                        stackIn_30_3 = stackOut_29_3;
                                        if (var19 <= var21) {
                                          stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                                          stackOut_31_1 = stackIn_31_1;
                                          stackOut_31_2 = (int[]) (Object) stackIn_31_2;
                                          stackOut_31_3 = stackIn_31_3;
                                          stackOut_31_4 = var19;
                                          stackIn_32_0 = stackOut_31_0;
                                          stackIn_32_1 = stackOut_31_1;
                                          stackIn_32_2 = stackOut_31_2;
                                          stackIn_32_3 = stackOut_31_3;
                                          stackIn_32_4 = stackOut_31_4;
                                          break L20;
                                        } else {
                                          stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                                          stackOut_30_1 = stackIn_30_1;
                                          stackOut_30_2 = (int[]) (Object) stackIn_30_2;
                                          stackOut_30_3 = stackIn_30_3;
                                          stackOut_30_4 = var21;
                                          stackIn_32_0 = stackOut_30_0;
                                          stackIn_32_1 = stackOut_30_1;
                                          stackIn_32_2 = stackOut_30_2;
                                          stackIn_32_3 = stackOut_30_3;
                                          stackIn_32_4 = stackOut_30_4;
                                          break L20;
                                        }
                                      }
                                      stackIn_32_2[stackIn_32_3] = stackIn_32_4;
                                      stackIn_32_0[stackIn_32_1] = stackIn_32_4;
                                      var20++;
                                      continue L19;
                                    }
                                  }
                                }
                              }
                              if (we.field_M >= var16 + var15) {
                                qq.a(var18, var15, var16, var19);
                                break L11;
                              } else {
                                var20 = we.field_M - var15;
                                qq.a(var18, var15, var20, var19);
                                qq.a(var18, 0, -var20 + var16, var19);
                                break L11;
                              }
                            }
                          }
                          var17++;
                          continue L10;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var8 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var8;
            stackOut_69_1 = new StringBuilder().append("lm.A(").append(param0).append(',').append(-35).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          L22: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L22;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L22;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
