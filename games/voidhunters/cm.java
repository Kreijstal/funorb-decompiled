/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm extends le {
    private int field_r;
    private int field_s;
    private int field_p;
    private int field_q;
    private int field_n;
    private int field_i;
    private int field_m;
    private int field_l;
    private int field_k;
    private int field_o;
    static int[] field_j;

    final int[] a(int param0, boolean param1) {
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
        int var39 = 0;
        int[][] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[][] var46 = null;
        int[][] var47 = null;
        int[][] var48 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var55 = null;
        int[][] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        L0: {
          var38 = VoidHunters.field_G;
          var3 = ((cm) this).field_f.a((byte) -43, param0);
          if (param1) {
            break L0;
          } else {
            ((cm) this).field_l = 74;
            break L0;
          }
        }
        L1: {
          if (((cm) this).field_f.field_e) {
            var55 = ((cm) this).field_f.b(73);
            var51 = var55;
            var47 = var51;
            var40 = var47;
            var4 = var40;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var10 = 1;
            var11 = 1;
            var12 = 0;
            var13 = 0;
            var14 = hob.field_d * ((cm) this).field_n >> 12;
            var15 = ((cm) this).field_q * hob.field_d >> 12;
            var16 = ((cm) this).field_k * noa.field_o >> 12;
            var17 = noa.field_o * ((cm) this).field_s >> 12;
            if (var17 > 1) {
              ((cm) this).field_m = ((cm) this).field_o * (hob.field_d / 8) >> 12;
              var18 = hob.field_d / var14 + 1;
              var19 = new int[var18][3];
              var56 = new int[var18][3];
              var52 = var56;
              var48 = var52;
              var20 = var48;
              var21 = new Random((long)((cm) this).field_i);
              L2: while (true) {
                L3: {
                  var23 = var14 + hob.a(var21, -var14 + var15, 122);
                  var24 = var16 - -hob.a(var21, -var16 + var17, 127);
                  var25 = var23 + var8;
                  if (var25 > hob.field_d) {
                    var25 = hob.field_d;
                    var23 = -var8 + hob.field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var11 == 0) {
                    L5: {
                      var56 = var52;
                      var26_int = var9;
                      var58 = var56[var9];
                      var28 = 0;
                      var29_int = var5 + var25;
                      if (var29_int >= 0) {
                        break L5;
                      } else {
                        var29_int = var29_int + hob.field_d;
                        break L5;
                      }
                    }
                    L6: {
                      if (hob.field_d >= var29_int) {
                        break L6;
                      } else {
                        var29_int = var29_int - hob.field_d;
                        break L6;
                      }
                    }
                    L7: while (true) {
                      L8: {
                        var57 = var56[var26_int];
                        if (var29_int < var57[0]) {
                          break L8;
                        } else {
                          if (var29_int > var57[1]) {
                            break L8;
                          } else {
                            L9: {
                              var22 = var58[2];
                              if (var26_int != var9) {
                                L10: {
                                  var30 = var5 + var8;
                                  if (var30 >= 0) {
                                    break L10;
                                  } else {
                                    var30 = var30 + hob.field_d;
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var30 <= hob.field_d) {
                                    break L11;
                                  } else {
                                    var30 = var30 - hob.field_d;
                                    break L11;
                                  }
                                }
                                var31 = 1;
                                L12: while (true) {
                                  if (var31 > var28) {
                                    var39 = 0;
                                    var31 = var39;
                                    L13: while (true) {
                                      if (var39 > var28) {
                                        break L9;
                                      } else {
                                        var43 = var20[(var39 + var9) % var12];
                                        var33 = var43[2];
                                        if (var22 != var33) {
                                          L14: {
                                            var36 = var43[0];
                                            var37 = var43[1];
                                            if (var29_int > var30) {
                                              var34 = Math.max(var30, var36);
                                              var35 = Math.min(var29_int, var37);
                                              break L14;
                                            } else {
                                              if (var36 != 0) {
                                                var34 = Math.max(var30, var36);
                                                var35 = hob.field_d;
                                                break L14;
                                              } else {
                                                var35 = Math.min(var29_int, var37);
                                                var34 = 0;
                                                break L14;
                                              }
                                            }
                                          }
                                          this.a(3349, -var34 + var35, var4, var7 + var34, var22 + -var33, var21, var33);
                                          var39++;
                                          continue L13;
                                        } else {
                                          var39++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  } else {
                                    var42 = var20[(var31 + var9) % var12];
                                    var22 = Math.max(var22, var42[2]);
                                    var31++;
                                    continue L12;
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            var9 = var26_int;
                            break L4;
                          }
                        }
                      }
                      var28++;
                      var26_int++;
                      if (var12 <= var26_int) {
                        var26_int = 0;
                        continue L7;
                      } else {
                        continue L7;
                      }
                    }
                  } else {
                    var22 = 0;
                    break L4;
                  }
                }
                L15: {
                  if (var24 + var22 > noa.field_o) {
                    var24 = noa.field_o - var22;
                    break L15;
                  } else {
                    var10 = 0;
                    break L15;
                  }
                }
                if (var25 == hob.field_d) {
                  this.a(3349, var23, var4, var8 - -var6, var24, var21, var22);
                  if (var10 != 0) {
                    break L1;
                  } else {
                    L16: {
                      var10 = 1;
                      int incrementValue$2 = var13;
                      var13++;
                      var45 = var19[incrementValue$2];
                      var26 = var45;
                      var26[2] = var22 + var24;
                      var45[0] = var8;
                      var45[1] = var25;
                      var27 = var20;
                      var46 = var19;
                      var19 = var27;
                      var12 = var13;
                      var7 = var6;
                      var13 = 0;
                      var6 = hob.a(var21, hob.field_d, 124);
                      var5 = -var7 + var6;
                      var8 = 0;
                      var28 = var5;
                      if (var28 >= 0) {
                        break L16;
                      } else {
                        var28 = var28 + hob.field_d;
                        break L16;
                      }
                    }
                    L17: {
                      if (var28 <= hob.field_d) {
                        break L17;
                      } else {
                        var28 = var28 - hob.field_d;
                        break L17;
                      }
                    }
                    var9 = 0;
                    L18: while (true) {
                      L19: {
                        var29 = var46[var9];
                        if (var29[0] > var28) {
                          break L19;
                        } else {
                          if (var29[1] >= var28) {
                            var11 = 0;
                            continue L2;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var9++;
                      if (var12 > var9) {
                        continue L18;
                      } else {
                        var9 = 0;
                        continue L18;
                      }
                    }
                  }
                } else {
                  int incrementValue$3 = var13;
                  var13++;
                  var44 = var19[incrementValue$3];
                  var26 = var44;
                  var44[1] = var25;
                  var44[0] = var8;
                  var26[2] = var24 + var22;
                  this.a(3349, var23, var55, var6 + var8, var24, var21, var22);
                  var8 = var25;
                  continue L2;
                }
              }
            } else {
              return var55[param0];
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    public cm() {
        super(0, true);
        ((cm) this).field_r = 1024;
        ((cm) this).field_i = 0;
        ((cm) this).field_l = 1024;
        ((cm) this).field_n = 1024;
        ((cm) this).field_s = 819;
        ((cm) this).field_p = 0;
        ((cm) this).field_q = 2048;
        ((cm) this).field_k = 409;
        ((cm) this).field_o = 1024;
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object var6 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                var6 = null;
                this.a(-81, -19, (int[][]) null, -71, 101, (Random) null, 28);
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (0 == var4_int) {
                ((cm) this).field_i = param2.e((byte) -92);
                break L2;
              } else {
                if (1 != var4_int) {
                  if (var4_int != 2) {
                    if (var4_int == 3) {
                      ((cm) this).field_k = param2.e(1869);
                      break L2;
                    } else {
                      if (var4_int == 4) {
                        ((cm) this).field_s = param2.e(1869);
                        break L2;
                      } else {
                        if (var4_int == 5) {
                          ((cm) this).field_o = param2.e(1869);
                          break L2;
                        } else {
                          if (var4_int == 6) {
                            ((cm) this).field_p = param2.e((byte) -88);
                            break L2;
                          } else {
                            if (var4_int == 7) {
                              ((cm) this).field_l = param2.e(1869);
                              break L2;
                            } else {
                              if (var4_int != 8) {
                                break L2;
                              } else {
                                ((cm) this).field_r = param2.e(1869);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    ((cm) this).field_q = param2.e(1869);
                    break L2;
                  }
                } else {
                  ((cm) this).field_n = param2.e(1869);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("cm.F(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              var4 = 0;
              if (param0 == -87) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = cm.a((byte) 86, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_5_0 = new String(var3);
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3[-var4 + var2_int - 1] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("cm.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void c(byte param0) {
        if (param0 > -35) {
            Object var3 = null;
            this.a(72, -58, (int[][]) null, -109, -87, (Random) null, 122);
        }
    }

    public static void e() {
        field_j = null;
    }

    private final void a(int param0, int param1, int[][] param2, int param3, int param4, Random param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
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
        Object var24 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_42_2 = null;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int[] stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int[] stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int[] stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int[] stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int[] stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int[] stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
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
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((cm) this).field_r > 0) {
                stackOut_3_0 = 4096 + -hob.a(param5, ((cm) this).field_r, 123);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 4096;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var8_int = stackIn_4_0;
              var9 = ((cm) this).field_l * ((cm) this).field_m >> 12;
              stackOut_4_0 = ((cm) this).field_m;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 >= var9) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = hob.a(param5, var9, param0 ^ 3439);
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_7_0 - stackIn_7_1;
              if (param0 == 3349) {
                break L3;
              } else {
                var24 = null;
                this.a(-48, 78, (int[][]) null, 42, 103, (Random) null, -25);
                break L3;
              }
            }
            L4: {
              if (param3 < hob.field_d) {
                break L4;
              } else {
                param3 = param3 - hob.field_d;
                break L4;
              }
            }
            L5: {
              if (var10 > 0) {
                L6: {
                  if (param4 <= 0) {
                    break L6;
                  } else {
                    if (param1 > 0) {
                      L7: {
                        var11 = param1 / 2;
                        var12 = param4 / 2;
                        if (var11 < var10) {
                          stackOut_25_0 = var11;
                          stackIn_26_0 = stackOut_25_0;
                          break L7;
                        } else {
                          stackOut_24_0 = var10;
                          stackIn_26_0 = stackOut_24_0;
                          break L7;
                        }
                      }
                      L8: {
                        var13 = stackIn_26_0;
                        if (var12 >= var10) {
                          stackOut_28_0 = var10;
                          stackIn_29_0 = stackOut_28_0;
                          break L8;
                        } else {
                          stackOut_27_0 = var12;
                          stackIn_29_0 = stackOut_27_0;
                          break L8;
                        }
                      }
                      var14 = stackIn_29_0;
                      var15 = var13 + param3;
                      var16 = param1 - 2 * var13;
                      var17 = 0;
                      L9: while (true) {
                        if (var17 >= param4) {
                          break L5;
                        } else {
                          L10: {
                            var18 = param2[var17 - -param6];
                            if (var14 > var17) {
                              L11: {
                                var19 = var17 * var8_int / var14;
                                if (((cm) this).field_p != 0) {
                                  var20 = 0;
                                  L12: while (true) {
                                    if (var20 >= var13) {
                                      break L11;
                                    } else {
                                      L13: {
                                        var21 = var8_int * var20 / var13;
                                        stackOut_39_0 = (int[]) var18;
                                        stackOut_39_1 = dla.a(gbb.field_q, var20 + param3);
                                        stackOut_39_2 = (int[]) var18;
                                        stackOut_39_3 = dla.a(param1 + (param3 - (var20 + 1)), gbb.field_q);
                                        stackIn_41_0 = stackOut_39_0;
                                        stackIn_41_1 = stackOut_39_1;
                                        stackIn_41_2 = stackOut_39_2;
                                        stackIn_41_3 = stackOut_39_3;
                                        stackIn_40_0 = stackOut_39_0;
                                        stackIn_40_1 = stackOut_39_1;
                                        stackIn_40_2 = stackOut_39_2;
                                        stackIn_40_3 = stackOut_39_3;
                                        if (var19 <= var21) {
                                          stackOut_41_0 = (int[]) (Object) stackIn_41_0;
                                          stackOut_41_1 = stackIn_41_1;
                                          stackOut_41_2 = (int[]) (Object) stackIn_41_2;
                                          stackOut_41_3 = stackIn_41_3;
                                          stackOut_41_4 = var19;
                                          stackIn_42_0 = stackOut_41_0;
                                          stackIn_42_1 = stackOut_41_1;
                                          stackIn_42_2 = stackOut_41_2;
                                          stackIn_42_3 = stackOut_41_3;
                                          stackIn_42_4 = stackOut_41_4;
                                          break L13;
                                        } else {
                                          stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                                          stackOut_40_1 = stackIn_40_1;
                                          stackOut_40_2 = (int[]) (Object) stackIn_40_2;
                                          stackOut_40_3 = stackIn_40_3;
                                          stackOut_40_4 = var21;
                                          stackIn_42_0 = stackOut_40_0;
                                          stackIn_42_1 = stackOut_40_1;
                                          stackIn_42_2 = stackOut_40_2;
                                          stackIn_42_3 = stackOut_40_3;
                                          stackIn_42_4 = stackOut_40_4;
                                          break L13;
                                        }
                                      }
                                      stackIn_42_2[stackIn_42_3] = stackIn_42_4;
                                      stackIn_42_0[stackIn_42_1] = stackIn_42_4;
                                      var20++;
                                      continue L12;
                                    }
                                  }
                                } else {
                                  var20 = 0;
                                  L14: while (true) {
                                    if (var20 >= var13) {
                                      break L11;
                                    } else {
                                      var21 = var8_int * var20 / var13;
                                      int dupTemp$5 = dla.a(gbb.field_q, param1 + param3 + -var20 - 1);
                                      var18[dupTemp$5] = var21 * var19 >> 12;
                                      var18[dla.a(param3 - -var20, gbb.field_q)] = var21 * var19 >> 12;
                                      var20++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                              if (var16 + var15 <= hob.field_d) {
                                cua.a(var18, var15, var16, var19);
                                break L10;
                              } else {
                                var20 = -var15 + hob.field_d;
                                cua.a(var18, var15, var20, var19);
                                cua.a(var18, 0, -var20 + var16, var19);
                                break L10;
                              }
                            } else {
                              var19 = -var17 + (param4 - 1);
                              if (var19 < var14) {
                                L15: {
                                  var20 = var19 * var8_int / var14;
                                  if (0 == ((cm) this).field_p) {
                                    var21 = 0;
                                    L16: while (true) {
                                      if (var21 >= var13) {
                                        break L15;
                                      } else {
                                        var22 = var8_int * var21 / var13;
                                        int dupTemp$6 = dla.a(-var21 + (param1 + (param3 + -1)), gbb.field_q);
                                        var18[dupTemp$6] = var20 * var22 >> 12;
                                        var18[dla.a(gbb.field_q, param3 + var21)] = var20 * var22 >> 12;
                                        var21++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    var21 = 0;
                                    L17: while (true) {
                                      if (var21 >= var13) {
                                        break L15;
                                      } else {
                                        L18: {
                                          var22 = var21 * var8_int / var13;
                                          stackOut_51_0 = (int[]) var18;
                                          stackOut_51_1 = dla.a(gbb.field_q, param3 - -var21);
                                          stackOut_51_2 = (int[]) var18;
                                          stackOut_51_3 = dla.a(gbb.field_q, -var21 + (param3 + param1) - 1);
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_53_1 = stackOut_51_1;
                                          stackIn_53_2 = stackOut_51_2;
                                          stackIn_53_3 = stackOut_51_3;
                                          stackIn_52_0 = stackOut_51_0;
                                          stackIn_52_1 = stackOut_51_1;
                                          stackIn_52_2 = stackOut_51_2;
                                          stackIn_52_3 = stackOut_51_3;
                                          if (var22 >= var20) {
                                            stackOut_53_0 = (int[]) (Object) stackIn_53_0;
                                            stackOut_53_1 = stackIn_53_1;
                                            stackOut_53_2 = (int[]) (Object) stackIn_53_2;
                                            stackOut_53_3 = stackIn_53_3;
                                            stackOut_53_4 = var20;
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            stackIn_54_2 = stackOut_53_2;
                                            stackIn_54_3 = stackOut_53_3;
                                            stackIn_54_4 = stackOut_53_4;
                                            break L18;
                                          } else {
                                            stackOut_52_0 = (int[]) (Object) stackIn_52_0;
                                            stackOut_52_1 = stackIn_52_1;
                                            stackOut_52_2 = (int[]) (Object) stackIn_52_2;
                                            stackOut_52_3 = stackIn_52_3;
                                            stackOut_52_4 = var22;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_54_1 = stackOut_52_1;
                                            stackIn_54_2 = stackOut_52_2;
                                            stackIn_54_3 = stackOut_52_3;
                                            stackIn_54_4 = stackOut_52_4;
                                            break L18;
                                          }
                                        }
                                        stackIn_54_2[stackIn_54_3] = stackIn_54_4;
                                        stackIn_54_0[stackIn_54_1] = stackIn_54_4;
                                        var21++;
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                                if (hob.field_d >= var16 + var15) {
                                  cua.a(var18, var15, var16, var20);
                                  break L10;
                                } else {
                                  var21 = -var15 + hob.field_d;
                                  cua.a(var18, var15, var21, var20);
                                  cua.a(var18, 0, var16 - var21, var20);
                                  break L10;
                                }
                              } else {
                                var20 = 0;
                                L19: while (true) {
                                  if (var20 >= var13) {
                                    if (hob.field_d < var15 - -var16) {
                                      var20 = hob.field_d - var15;
                                      cua.a(var18, var15, var20, var8_int);
                                      cua.a(var18, 0, -var20 + var16, var8_int);
                                      break L10;
                                    } else {
                                      cua.a(var18, var15, var16, var8_int);
                                      break L10;
                                    }
                                  } else {
                                    int dupTemp$7 = dla.a(-1 + param1 + param3 + -var20, gbb.field_q);
                                    var18[dupTemp$7] = var8_int * var20 / var13;
                                    var18[dla.a(var20 + param3, gbb.field_q)] = var8_int * var20 / var13;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          }
                          var17++;
                          continue L9;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                return;
              } else {
                if (hob.field_d >= param3 - -param1) {
                  var11 = 0;
                  L20: while (true) {
                    if (var11 >= param4) {
                      break L5;
                    } else {
                      cua.a(param2[var11 + param6], param3, param1, var8_int);
                      var11++;
                      continue L20;
                    }
                  }
                } else {
                  var11 = -param3 + hob.field_d;
                  var12 = 0;
                  L21: while (true) {
                    if (var12 >= param4) {
                      break L5;
                    } else {
                      var13_ref_int__ = param2[param6 - -var12];
                      cua.a(var13_ref_int__, param3, var11, var8_int);
                      cua.a(var13_ref_int__, 0, -var11 + param1, var8_int);
                      var12++;
                      continue L21;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var8 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var8;
            stackOut_69_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',');
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
              break L22;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L22;
            }
          }
          L23: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param5 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L23;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[1000];
    }
}
