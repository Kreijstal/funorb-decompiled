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
            var14 = hob.field_d * ((cm) this).field_n >> 1375522636;
            var15 = ((cm) this).field_q * hob.field_d >> -1867991188;
            var16 = ((cm) this).field_k * noa.field_o >> -1651931796;
            var17 = noa.field_o * ((cm) this).field_s >> 658337452;
            if (-2 > (var17 ^ -1)) {
              ((cm) this).field_m = ((cm) this).field_o * (hob.field_d / 8) >> 1681857420;
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
                      if ((var29_int ^ -1) <= -1) {
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
                                  if ((var30 ^ -1) <= -1) {
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
                      var13++;
                      var45 = var19[var13];
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
                      if ((var28 ^ -1) <= -1) {
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
                  var13++;
                  var44 = var19[var13];
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
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = VoidHunters.field_G;
          if (param1 <= -60) {
            break L0;
          } else {
            var6 = null;
            this.a(-81, -19, (int[][]) null, -71, 101, (Random) null, 28);
            break L0;
          }
        }
        L1: {
          var4 = param0;
          if (0 == var4) {
            ((cm) this).field_i = param2.e((byte) -92);
            break L1;
          } else {
            if (1 != var4) {
              if (-3 != var4) {
                if (-4 == var4) {
                  ((cm) this).field_k = param2.e(1869);
                  break L1;
                } else {
                  if (var4 == 4) {
                    ((cm) this).field_s = param2.e(1869);
                    break L1;
                  } else {
                    if (var4 == -6) {
                      ((cm) this).field_o = param2.e(1869);
                      break L1;
                    } else {
                      if (var4 == 6) {
                        ((cm) this).field_p = param2.e((byte) -88);
                        break L1;
                      } else {
                        if (-8 == var4) {
                          ((cm) this).field_l = param2.e(1869);
                          break L1;
                        } else {
                          if ((var4 ^ -1) != -9) {
                            break L1;
                          } else {
                            ((cm) this).field_r = param2.e(1869);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((cm) this).field_q = param2.e(1869);
                break L1;
              }
            } else {
              ((cm) this).field_n = param2.e(1869);
              break L1;
            }
          }
        }
    }

    final static String a(byte param0, String param1) {
        int var5 = VoidHunters.field_G;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        int var4 = 0;
        if (param0 != -87) {
            Object var6 = null;
            String discarded$0 = cm.a((byte) 86, (String) null);
        }
        while (var4 < var2) {
            var3[-var4 + var2 - 1] = param1.charAt(var4);
            var4++;
        }
        return new String(var3);
    }

    final void c(byte param0) {
        if (param0 > -35) {
            Object var3 = null;
            this.a(72, -58, (int[][]) null, -109, -87, (Random) null, 122);
        }
    }

    public static void e(byte param0) {
        field_j = null;
        if (param0 > -115) {
            field_j = null;
        }
    }

    private final void a(int param0, int param1, int[][] param2, int param3, int param4, Random param5, int param6) {
        int var8 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_38_2 = null;
        int stackIn_38_3 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int[] stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int[] stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int[] stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int[] stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int[] stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int[] stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int[] stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        L0: {
          var23 = VoidHunters.field_G;
          if ((((cm) this).field_r ^ -1) < -1) {
            stackOut_2_0 = 4096 + -hob.a(param5, ((cm) this).field_r, 123);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 4096;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var8 = stackIn_3_0;
          var9 = ((cm) this).field_l * ((cm) this).field_m >> 1301423372;
          stackOut_3_0 = ((cm) this).field_m;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 >= var9) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = hob.a(param5, var9, param0 ^ 3439);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          var10 = stackIn_6_0 - stackIn_6_1;
          if (param0 == 3349) {
            break L2;
          } else {
            var24 = null;
            this.a(-48, 78, (int[][]) null, 42, 103, (Random) null, -25);
            break L2;
          }
        }
        L3: {
          if (param3 < hob.field_d) {
            break L3;
          } else {
            param3 = param3 - hob.field_d;
            break L3;
          }
        }
        L4: {
          if ((var10 ^ -1) < -1) {
            if ((param4 ^ -1) >= -1) {
              return;
            } else {
              if (param1 > 0) {
                L5: {
                  var11 = param1 / 2;
                  var12 = param4 / 2;
                  if (var11 < var10) {
                    stackOut_23_0 = var11;
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_22_0 = var10;
                    stackIn_24_0 = stackOut_22_0;
                    break L5;
                  }
                }
                L6: {
                  var13 = stackIn_24_0;
                  if (var12 >= var10) {
                    stackOut_26_0 = var10;
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_25_0 = var12;
                    stackIn_27_0 = stackOut_25_0;
                    break L6;
                  }
                }
                var14 = stackIn_27_0;
                var15 = var13 + param3;
                var16 = param1 - 2 * var13;
                var17 = 0;
                L7: while (true) {
                  if (var17 >= param4) {
                    break L4;
                  } else {
                    var18 = param2[var17 - -param6];
                    if (var14 > var17) {
                      L8: {
                        var19 = var17 * var8 / var14;
                        if (-1 != (((cm) this).field_p ^ -1)) {
                          var20 = 0;
                          L9: while (true) {
                            if (var20 >= var13) {
                              break L8;
                            } else {
                              L10: {
                                var21 = var8 * var20 / var13;
                                stackOut_37_0 = (int[]) var18;
                                stackOut_37_1 = dla.a(gbb.field_q, var20 + param3);
                                stackOut_37_2 = (int[]) var18;
                                stackOut_37_3 = dla.a(param1 + (param3 - (var20 + 1)), gbb.field_q);
                                stackIn_39_0 = stackOut_37_0;
                                stackIn_39_1 = stackOut_37_1;
                                stackIn_39_2 = stackOut_37_2;
                                stackIn_39_3 = stackOut_37_3;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                stackIn_38_3 = stackOut_37_3;
                                if (var19 <= var21) {
                                  stackOut_39_0 = (int[]) (Object) stackIn_39_0;
                                  stackOut_39_1 = stackIn_39_1;
                                  stackOut_39_2 = (int[]) (Object) stackIn_39_2;
                                  stackOut_39_3 = stackIn_39_3;
                                  stackOut_39_4 = var19;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  stackIn_40_2 = stackOut_39_2;
                                  stackIn_40_3 = stackOut_39_3;
                                  stackIn_40_4 = stackOut_39_4;
                                  break L10;
                                } else {
                                  stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                                  stackOut_38_1 = stackIn_38_1;
                                  stackOut_38_2 = (int[]) (Object) stackIn_38_2;
                                  stackOut_38_3 = stackIn_38_3;
                                  stackOut_38_4 = var21;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  stackIn_40_2 = stackOut_38_2;
                                  stackIn_40_3 = stackOut_38_3;
                                  stackIn_40_4 = stackOut_38_4;
                                  break L10;
                                }
                              }
                              stackIn_40_2[stackIn_40_3] = stackIn_40_4;
                              stackIn_40_0[stackIn_40_1] = stackIn_40_4;
                              var20++;
                              continue L9;
                            }
                          }
                        } else {
                          var20 = 0;
                          L11: while (true) {
                            if (var20 >= var13) {
                              break L8;
                            } else {
                              var21 = var8 * var20 / var13;
                              var18[dla.a(gbb.field_q, param1 + param3 + -var20 - 1)] = var21 * var19 >> 528442636;
                              var18[dla.a(param3 - -var20, gbb.field_q)] = var21 * var19 >> 528442636;
                              var20++;
                              continue L11;
                            }
                          }
                        }
                      }
                      if (var16 + var15 <= hob.field_d) {
                        cua.a(var18, var15, var16, var19);
                        var17++;
                        continue L7;
                      } else {
                        var20 = -var15 + hob.field_d;
                        cua.a(var18, var15, var20, var19);
                        cua.a(var18, 0, -var20 + var16, var19);
                        var17++;
                        continue L7;
                      }
                    } else {
                      var19 = -var17 + (param4 - 1);
                      if (var19 < var14) {
                        L12: {
                          var20 = var19 * var8 / var14;
                          if (0 == ((cm) this).field_p) {
                            var21 = 0;
                            L13: while (true) {
                              if (var21 >= var13) {
                                break L12;
                              } else {
                                var22 = var8 * var21 / var13;
                                var18[dla.a(-var21 + (param1 + (param3 + -1)), gbb.field_q)] = var20 * var22 >> -781683540;
                                var18[dla.a(gbb.field_q, param3 + var21)] = var20 * var22 >> -781683540;
                                var21++;
                                continue L13;
                              }
                            }
                          } else {
                            var21 = 0;
                            L14: while (true) {
                              if (var21 >= var13) {
                                break L12;
                              } else {
                                L15: {
                                  var22 = var21 * var8 / var13;
                                  stackOut_49_0 = (int[]) var18;
                                  stackOut_49_1 = dla.a(gbb.field_q, param3 - -var21);
                                  stackOut_49_2 = (int[]) var18;
                                  stackOut_49_3 = dla.a(gbb.field_q, -var21 + (param3 + param1) - 1);
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  stackIn_51_3 = stackOut_49_3;
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  stackIn_50_2 = stackOut_49_2;
                                  stackIn_50_3 = stackOut_49_3;
                                  if (var22 >= var20) {
                                    stackOut_51_0 = (int[]) (Object) stackIn_51_0;
                                    stackOut_51_1 = stackIn_51_1;
                                    stackOut_51_2 = (int[]) (Object) stackIn_51_2;
                                    stackOut_51_3 = stackIn_51_3;
                                    stackOut_51_4 = var20;
                                    stackIn_52_0 = stackOut_51_0;
                                    stackIn_52_1 = stackOut_51_1;
                                    stackIn_52_2 = stackOut_51_2;
                                    stackIn_52_3 = stackOut_51_3;
                                    stackIn_52_4 = stackOut_51_4;
                                    break L15;
                                  } else {
                                    stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                                    stackOut_50_1 = stackIn_50_1;
                                    stackOut_50_2 = (int[]) (Object) stackIn_50_2;
                                    stackOut_50_3 = stackIn_50_3;
                                    stackOut_50_4 = var22;
                                    stackIn_52_0 = stackOut_50_0;
                                    stackIn_52_1 = stackOut_50_1;
                                    stackIn_52_2 = stackOut_50_2;
                                    stackIn_52_3 = stackOut_50_3;
                                    stackIn_52_4 = stackOut_50_4;
                                    break L15;
                                  }
                                }
                                stackIn_52_2[stackIn_52_3] = stackIn_52_4;
                                stackIn_52_0[stackIn_52_1] = stackIn_52_4;
                                var21++;
                                continue L14;
                              }
                            }
                          }
                        }
                        if (hob.field_d >= var16 + var15) {
                          cua.a(var18, var15, var16, var20);
                          var17++;
                          continue L7;
                        } else {
                          var21 = -var15 + hob.field_d;
                          cua.a(var18, var15, var21, var20);
                          cua.a(var18, 0, var16 - var21, var20);
                          var17++;
                          continue L7;
                        }
                      } else {
                        var20 = 0;
                        L16: while (true) {
                          if (var20 >= var13) {
                            if (hob.field_d < var15 - -var16) {
                              var20 = hob.field_d - var15;
                              cua.a(var18, var15, var20, var8);
                              cua.a(var18, 0, -var20 + var16, var8);
                              var17++;
                              continue L7;
                            } else {
                              cua.a(var18, var15, var16, var8);
                              var17++;
                              continue L7;
                            }
                          } else {
                            var18[dla.a(-1 + param1 + param3 + -var20, gbb.field_q)] = var8 * var20 / var13;
                            var18[dla.a(var20 + param3, gbb.field_q)] = var8 * var20 / var13;
                            var20++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (hob.field_d >= param3 - -param1) {
              var11 = 0;
              L17: while (true) {
                if (var11 >= param4) {
                  break L4;
                } else {
                  cua.a(param2[var11 + param6], param3, param1, var8);
                  var11++;
                  continue L17;
                }
              }
            } else {
              var11 = -param3 + hob.field_d;
              var12 = 0;
              L18: while (true) {
                if (var12 >= param4) {
                  break L4;
                } else {
                  var13_ref_int__ = param2[param6 - -var12];
                  cua.a(var13_ref_int__, param3, var11, var8);
                  cua.a(var13_ref_int__, 0, -var11 + param1, var8);
                  var12++;
                  continue L18;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[1000];
    }
}
