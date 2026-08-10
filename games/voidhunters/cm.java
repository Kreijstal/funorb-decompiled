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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int[] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int[][] var19;
        int[][] var20;
        Random var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26_int;
        int[] var26;
        int[][] var27;
        int var28;
        int var29_int;
        int[] var29;
        int var30;
        int var31;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int[][] var40;
        int[] var42;
        int[] var43;
        int[] var44;
        int[] var45;
        int[][] var46;
        int[][] var47;
        int[][] var48;
        int[] var53;
        int[] var54;
        L0: {
          var38 = VoidHunters.field_G;
          var3 = this.field_f.a((byte) -43, param0);
          if (param1) {
            break L0;
          } else {
            this.field_l = 74;
            break L0;
          }
        }
        L1: {
          if (this.field_f.field_e) {
            var47 = this.field_f.b(73);
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
            var14 = hob.field_d * this.field_n >> 1375522636;
            var15 = this.field_q * hob.field_d >> -1867991188;
            var16 = this.field_k * noa.field_o >> -1651931796;
            var17 = noa.field_o * this.field_s >> 658337452;
            if (-2 > (var17 ^ -1)) {
              this.field_m = this.field_o * (hob.field_d / 8) >> 1681857420;
              var18 = hob.field_d / var14 + 1;
              var19 = new int[var18][3];
              var48 = new int[var18][3];
              var20 = var48;
              var21 = new Random((long)this.field_i);
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
                      var48 = var20;
                      var26_int = var9;
                      var54 = var48[var9];
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
                        var53 = var48[var26_int];
                        if (var29_int < var53[0]) {
                          break L8;
                        } else {
                          if ((var29_int ^ -1) < (var53[1] ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              var22 = var54[2];
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
                                        if ((var22 ^ -1) != (var33 ^ -1)) {
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
                      stackIn_20_0 = var12;
                      stackIn_20_1 = var26_int;
                      if (stackIn_20_0 <= stackIn_20_1) {
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
                      incrementValue$0 = var13;
                      var13++;
                      var45 = var19[incrementValue$0];
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
                      stackIn_58_0 = var12;
                      stackIn_58_1 = var9;
                      if (stackIn_58_0 > stackIn_58_1) {
                        continue L18;
                      } else {
                        var9 = 0;
                        continue L18;
                      }
                    }
                  }
                } else {
                  incrementValue$1 = var13;
                  var13++;
                  var44 = var19[incrementValue$1];
                  var26 = var44;
                  var44[1] = var25;
                  var44[0] = var8;
                  var26[2] = var24 + var22;
                  this.a(3349, var23, var47, var6 + var8, var24, var21, var22);
                  var8 = var25;
                  continue L2;
                }
              }
            } else {
              return var47[param0];
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    public cm() {
        super(0, true);
        this.field_r = 1024;
        this.field_i = 0;
        this.field_l = 1024;
        this.field_n = 1024;
        this.field_s = 819;
        this.field_p = 0;
        this.field_q = 2048;
        this.field_k = 409;
        this.field_o = 1024;
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Random var6 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                var6 = (Random) null;
                this.a(-81, -19, (int[][]) null, -71, 101, (Random) null, 28);
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (0 == var4_int) {
                this.field_i = param2.e((byte) -92);
                break L2;
              } else {
                if (1 != var4_int) {
                  if (-3 != (var4_int ^ -1)) {
                    if (-4 == (var4_int ^ -1)) {
                      this.field_k = param2.e(1869);
                      break L2;
                    } else {
                      if (var4_int == 4) {
                        this.field_s = param2.e(1869);
                        break L2;
                      } else {
                        if ((var4_int ^ -1) == -6) {
                          this.field_o = param2.e(1869);
                          break L2;
                        } else {
                          if (var4_int == 6) {
                            this.field_p = param2.e((byte) -88);
                            break L2;
                          } else {
                            if (-8 == (var4_int ^ -1)) {
                              this.field_l = param2.e(1869);
                              break L2;
                            } else {
                              if ((var4_int ^ -1) != -9) {
                                break L2;
                              } else {
                                this.field_r = param2.e(1869);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.field_q = param2.e(1869);
                    break L2;
                  }
                } else {
                  this.field_n = param2.e(1869);
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
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("cm.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                var6 = (String) null;
                cm.a((byte) 86, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_6_0 = new String(var3);
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
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("cm.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void c(byte param0) {
        if (param0 > -35) {
            Random var3 = (Random) null;
            this.a(72, -58, (int[][]) null, -109, -87, (Random) null, 122);
        }
    }

    public static void e(byte param0) {
        field_j = null;
        if (param0 > -115) {
            field_j = (int[]) null;
        }
    }

    private final void a(int param0, int param1, int[][] param2, int param3, int param4, Random param5, int param6) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_41_0;
        int stackIn_41_1;
        int[] stackIn_41_2;
        int stackIn_41_3;
        int[] stackIn_42_0;
        int stackIn_42_1;
        int[] stackIn_42_2;
        int stackIn_42_3;
        int stackIn_42_4;
        int[] stackIn_53_0;
        int stackIn_53_1;
        int[] stackIn_53_2;
        int stackIn_53_3;
        int[] stackIn_54_0;
        int stackIn_54_1;
        int[] stackIn_54_2;
        int stackIn_54_3;
        int stackIn_54_4;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var13_ref_int__ = null;
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
        Random var24 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if ((this.field_r ^ -1) < -1) {
                stackIn_4_0 = 4096 + -hob.a(param5, this.field_r, 123);
                break L1;
              } else {
                stackIn_4_0 = 4096;
                break L1;
              }
            }
            L2: {
              var8_int = stackIn_4_0;
              var9 = this.field_l * this.field_m >> 1301423372;
              stackIn_6_0 = this.field_m;

              if (0 >= var9) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = hob.a(param5, var9, param0 ^ 3439);
                break L2;
              }
            }
            L3: {
              var10 = stackIn_7_0 - stackIn_7_1;
              if (param0 == 3349) {
                break L3;
              } else {
                var24 = (Random) null;
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
              if ((var10 ^ -1) < -1) {
                L6: {
                  if ((param4 ^ -1) >= -1) {
                    break L6;
                  } else {
                    if (param1 > 0) {
                      L7: {
                        var11 = param1 / 2;
                        var12 = param4 / 2;
                        if (var11 < var10) {
                          stackIn_26_0 = var11;
                          break L7;
                        } else {
                          stackIn_26_0 = var10;
                          break L7;
                        }
                      }
                      L8: {
                        var13 = stackIn_26_0;
                        if (var12 >= var10) {
                          stackIn_29_0 = var10;
                          break L8;
                        } else {
                          stackIn_29_0 = var12;
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
                                if (-1 != (this.field_p ^ -1)) {
                                  var20 = 0;
                                  L12: while (true) {
                                    if (var20 >= var13) {
                                      break L11;
                                    } else {
                                      L13: {
                                        var21 = var8_int * var20 / var13;
                                        stackIn_41_0 = (int[]) (var18);

                                        stackIn_41_1 = dla.a(gbb.field_q, var20 + param3);

                                        stackIn_41_2 = (int[]) (var18);

                                        stackIn_41_3 = dla.a(param1 + (param3 - (var20 + 1)), gbb.field_q);

                                        if (var19 <= var21) {
                                          stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                                          stackIn_42_1 = stackIn_41_1;
                                          stackIn_42_2 = (int[]) ((Object) stackIn_41_2);
                                          stackIn_42_3 = stackIn_41_3;
                                          stackIn_42_4 = var19;
                                          break L13;
                                        } else {
                                          stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                                          stackIn_42_1 = stackIn_41_1;
                                          stackIn_42_2 = (int[]) ((Object) stackIn_41_2);
                                          stackIn_42_3 = stackIn_41_3;
                                          stackIn_42_4 = var21;
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
                                      dupTemp$0 = dla.a(gbb.field_q, param1 + param3 + -var20 - 1);
                                      var18[dupTemp$0] = var21 * var19 >> 528442636;
                                      var18[dla.a(param3 - -var20, gbb.field_q)] = var21 * var19 >> 528442636;
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
                                  if (0 == this.field_p) {
                                    var21 = 0;
                                    L16: while (true) {
                                      if (var21 >= var13) {
                                        break L15;
                                      } else {
                                        var22 = var8_int * var21 / var13;
                                        dupTemp$1 = dla.a(-var21 + (param1 + (param3 + -1)), gbb.field_q);
                                        var18[dupTemp$1] = var20 * var22 >> -781683540;
                                        var18[dla.a(gbb.field_q, param3 + var21)] = var20 * var22 >> -781683540;
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
                                          stackIn_53_0 = (int[]) (var18);

                                          stackIn_53_1 = dla.a(gbb.field_q, param3 - -var21);

                                          stackIn_53_2 = (int[]) (var18);

                                          stackIn_53_3 = dla.a(gbb.field_q, -var21 + (param3 + param1) - 1);

                                          if (var22 >= var20) {
                                            stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                            stackIn_54_1 = stackIn_53_1;
                                            stackIn_54_2 = (int[]) ((Object) stackIn_53_2);
                                            stackIn_54_3 = stackIn_53_3;
                                            stackIn_54_4 = var20;
                                            break L18;
                                          } else {
                                            stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                            stackIn_54_1 = stackIn_53_1;
                                            stackIn_54_2 = (int[]) ((Object) stackIn_53_2);
                                            stackIn_54_3 = stackIn_53_3;
                                            stackIn_54_4 = var22;
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
                                    dupTemp$2 = dla.a(-1 + param1 + param3 + -var20, gbb.field_q);
                                    var18[dupTemp$2] = var8_int * var20 / var13;
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
                decompiledRegionSelector0 = 0;
                break L0;
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
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var8 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var8);

            stackIn_71_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L22;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L23;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L23;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_72_0), stackIn_75_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_j = new int[1000];
    }
}
