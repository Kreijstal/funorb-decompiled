/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iia extends ci {
    static String field_q;
    private int field_u;
    private int field_p;
    private int field_w;
    static int[] field_v;
    private int field_y;
    private int field_s;
    private int field_x;
    private int field_m;
    private int field_n;
    private int field_o;
    static jea field_r;
    private int field_t;

    private final void a(int param0, int param1, int[][] param2, byte param3, int param4, int param5, Random param6) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int[] stackIn_41_0;
        int stackIn_41_1;
        int[] stackIn_41_2;
        int stackIn_41_3;
        int[] stackIn_42_0;
        int stackIn_42_1;
        int[] stackIn_42_2;
        int stackIn_42_3;
        int stackIn_42_4;
        int[] stackIn_52_0;
        int stackIn_52_1;
        int[] stackIn_52_2;
        int stackIn_52_3;
        int[] stackIn_53_0;
        int stackIn_53_1;
        int[] stackIn_53_2;
        int stackIn_53_3;
        int stackIn_53_4;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
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
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_m <= 0) {
                stackIn_4_0 = 4096;
                break L1;
              } else {
                stackIn_4_0 = 4096 + -jqa.a(this.field_m, param6, 66);
                break L1;
              }
            }
            L2: {
              var8_int = stackIn_4_0;
              var9 = this.field_u * this.field_o >> -860281044;
              stackIn_6_0 = this.field_o;

              if (var9 > 0) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = jqa.a(var9, param6, 83);
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_7_0 - stackIn_7_1;
              if (param3 <= -30) {
                break L3;
              } else {
                this.field_y = -123;
                break L3;
              }
            }
            L4: {
              if (ns.field_g <= param1) {
                param1 = param1 - ns.field_g;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 < var10) {
                L6: {
                  if ((param0 ^ -1) >= -1) {
                    break L6;
                  } else {
                    if (-1 > (param4 ^ -1)) {
                      L7: {
                        var11 = param4 / 2;
                        var12 = param0 / 2;
                        if (var11 < var10) {
                          stackIn_27_0 = var11;
                          break L7;
                        } else {
                          stackIn_27_0 = var10;
                          break L7;
                        }
                      }
                      L8: {
                        var13 = stackIn_27_0;
                        if (var12 < var10) {
                          stackIn_30_0 = var12;
                          break L8;
                        } else {
                          stackIn_30_0 = var10;
                          break L8;
                        }
                      }
                      var14 = stackIn_30_0;
                      var15 = param1 - -var13;
                      var16 = -(2 * var13) + param4;
                      var17 = 0;
                      L9: while (true) {
                        if (var17 >= param0) {
                          break L5;
                        } else {
                          L10: {
                            var18 = param2[var17 + param5];
                            if (var14 <= var17) {
                              var19 = -var17 + param0 + -1;
                              if (var14 <= var19) {
                                var20 = 0;
                                L11: while (true) {
                                  if (var13 <= var20) {
                                    if (var16 + var15 > ns.field_g) {
                                      var20 = ns.field_g - var15;
                                      lua.a(var18, var15, var20, var8_int);
                                      lua.a(var18, 0, -var20 + var16, var8_int);
                                      break L10;
                                    } else {
                                      lua.a(var18, var15, var16, var8_int);
                                      break L10;
                                    }
                                  } else {
                                    dupTemp$0 = sea.c(una.field_b, -var20 + param4 + param1 - 1);
                                    var18[dupTemp$0] = var8_int * var20 / var13;
                                    var18[sea.c(una.field_b, param1 - -var20)] = var8_int * var20 / var13;
                                    var20++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L12: {
                                  var20 = var8_int * var19 / var14;
                                  if (this.field_t == 0) {
                                    var21 = 0;
                                    L13: while (true) {
                                      if (var21 >= var13) {
                                        break L12;
                                      } else {
                                        var22 = var21 * var8_int / var13;
                                        dupTemp$1 = sea.c(una.field_b, -1 + param4 + param1 - var21);
                                        var18[dupTemp$1] = var20 * var22 >> -901914740;
                                        var18[sea.c(var21 + param1, una.field_b)] = var20 * var22 >> -901914740;
                                        var21++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    var21 = 0;
                                    L14: while (true) {
                                      if (var13 <= var21) {
                                        break L12;
                                      } else {
                                        L15: {
                                          var22 = var8_int * var21 / var13;
                                          stackIn_52_0 = (int[]) (var18);

                                          stackIn_52_1 = sea.c(param1 - -var21, una.field_b);

                                          stackIn_52_2 = (int[]) (var18);

                                          stackIn_52_3 = sea.c(-1 + -var21 + param1 - -param4, una.field_b);

                                          if (var22 < var20) {
                                            stackIn_53_0 = (int[]) ((Object) stackIn_52_0);
                                            stackIn_53_1 = stackIn_52_1;
                                            stackIn_53_2 = (int[]) ((Object) stackIn_52_2);
                                            stackIn_53_3 = stackIn_52_3;
                                            stackIn_53_4 = var22;
                                            break L15;
                                          } else {
                                            stackIn_53_0 = (int[]) ((Object) stackIn_52_0);
                                            stackIn_53_1 = stackIn_52_1;
                                            stackIn_53_2 = (int[]) ((Object) stackIn_52_2);
                                            stackIn_53_3 = stackIn_52_3;
                                            stackIn_53_4 = var20;
                                            break L15;
                                          }
                                        }
                                        stackIn_53_2[stackIn_53_3] = stackIn_53_4;
                                        stackIn_53_0[stackIn_53_1] = stackIn_53_4;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                                if (var16 + var15 > ns.field_g) {
                                  var21 = -var15 + ns.field_g;
                                  lua.a(var18, var15, var21, var20);
                                  lua.a(var18, 0, -var21 + var16, var20);
                                  break L10;
                                } else {
                                  lua.a(var18, var15, var16, var20);
                                  break L10;
                                }
                              }
                            } else {
                              L16: {
                                var19 = var17 * var8_int / var14;
                                if (-1 != (this.field_t ^ -1)) {
                                  var20 = 0;
                                  L17: while (true) {
                                    if (var20 >= var13) {
                                      break L16;
                                    } else {
                                      L18: {
                                        var21 = var8_int * var20 / var13;
                                        stackIn_41_0 = (int[]) (var18);

                                        stackIn_41_1 = sea.c(var20 + param1, una.field_b);

                                        stackIn_41_2 = (int[]) (var18);

                                        stackIn_41_3 = sea.c(-var20 + (param1 - -param4 + -1), una.field_b);

                                        if (var21 < var19) {
                                          stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                                          stackIn_42_1 = stackIn_41_1;
                                          stackIn_42_2 = (int[]) ((Object) stackIn_41_2);
                                          stackIn_42_3 = stackIn_41_3;
                                          stackIn_42_4 = var21;
                                          break L18;
                                        } else {
                                          stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                                          stackIn_42_1 = stackIn_41_1;
                                          stackIn_42_2 = (int[]) ((Object) stackIn_41_2);
                                          stackIn_42_3 = stackIn_41_3;
                                          stackIn_42_4 = var19;
                                          break L18;
                                        }
                                      }
                                      stackIn_42_2[stackIn_42_3] = stackIn_42_4;
                                      stackIn_42_0[stackIn_42_1] = stackIn_42_4;
                                      var20++;
                                      continue L17;
                                    }
                                  }
                                } else {
                                  var20 = 0;
                                  L19: while (true) {
                                    if (var13 <= var20) {
                                      break L16;
                                    } else {
                                      var21 = var8_int * var20 / var13;
                                      dupTemp$2 = sea.c(-var20 + (param4 + (param1 - 1)), una.field_b);
                                      var18[dupTemp$2] = var21 * var19 >> 148820524;
                                      var18[sea.c(var20 + param1, una.field_b)] = var21 * var19 >> 148820524;
                                      var20++;
                                      continue L19;
                                    }
                                  }
                                }
                              }
                              if (ns.field_g >= var15 + var16) {
                                lua.a(var18, var15, var16, var19);
                                break L10;
                              } else {
                                var20 = -var15 + ns.field_g;
                                lua.a(var18, var15, var20, var19);
                                lua.a(var18, 0, var16 + -var20, var19);
                                break L10;
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
                if (ns.field_g >= param1 - -param4) {
                  var11 = 0;
                  L20: while (true) {
                    if (var11 >= param0) {
                      break L5;
                    } else {
                      lua.a(param2[param5 + var11], param1, param4, var8_int);
                      var11++;
                      continue L20;
                    }
                  }
                } else {
                  var11 = -param1 + ns.field_g;
                  var12 = 0;
                  L21: while (true) {
                    if (param0 <= var12) {
                      break L5;
                    } else {
                      var13_ref_int__ = param2[var12 + param5];
                      lua.a(var13_ref_int__, param1, var11, var8_int);
                      lua.a(var13_ref_int__, 0, param4 - var11, var8_int);
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
            stackIn_70_0 = (RuntimeException) (var8);

            stackIn_70_1 = new StringBuilder().append("iia.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L22;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L23;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L23;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_71_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int d(int param0, int param1) {
        int var2_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param1 == 22972) {
              var2_int = 1;
              L1: while (true) {
                if (1 << var2_int > param0) {
                  stackIn_7_0 = var2_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_2_0 = -94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "iia.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int d(int param0, int param1, int param2) {
        if (param2 != 2) {
            return 39;
        }
        if (param0 >= param1) {
            return param0;
        }
        return param1;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.field_y = 101;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if (1 == var4_int) {
                  this.field_p = param1.d(param0 ^ 21);
                  break L2;
                } else {
                  if (2 != var4_int) {
                    if (-4 != (var4_int ^ -1)) {
                      if (4 == var4_int) {
                        this.field_w = param1.d(126);
                        break L2;
                      } else {
                        if (5 == var4_int) {
                          this.field_n = param1.d(122);
                          break L2;
                        } else {
                          if (-7 == (var4_int ^ -1)) {
                            this.field_t = param1.h(255);
                            break L2;
                          } else {
                            if (-8 == (var4_int ^ -1)) {
                              this.field_u = param1.d(125);
                              break L2;
                            } else {
                              if (8 == var4_int) {
                                this.field_m = param1.d(126);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      this.field_y = param1.d(param0 ^ 22);
                      break L2;
                    }
                  } else {
                    this.field_s = param1.d(124);
                    break L2;
                  }
                }
              } else {
                this.field_x = param1.h(255);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("iia.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L3;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    public iia() {
        super(0, true);
        this.field_s = 2048;
        this.field_p = 1024;
        this.field_x = 0;
        this.field_w = 819;
        this.field_y = 409;
        this.field_n = 1024;
        this.field_m = 1024;
        this.field_t = 0;
        this.field_u = 1024;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            this.field_t = 123;
        }
    }

    final int[] c(int param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
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
        int[][] var39;
        int[] var41;
        int[] var42;
        int[] var43;
        int[][] var44;
        int[] var45;
        int[][] var46;
        int[][] var47;
        int[] var52;
        int[] var53;
        var38 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var3 = this.field_i.a((byte) 120, param1);
            if (this.field_i.field_d) {
              var46 = this.field_i.a(param0 ^ 1);
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
              var14 = this.field_p * ns.field_g >> 1850047884;
              var15 = ns.field_g * this.field_s >> 43974156;
              var16 = qda.field_i * this.field_y >> -1955949556;
              var17 = this.field_w * qda.field_i >> 2127772780;
              if (-2 <= (var17 ^ -1)) {
                return var46[param1];
              } else {
                this.field_o = ns.field_g / 8 * this.field_n >> 1588390636;
                var18 = ns.field_g / var14 + 1;
                var19 = new int[var18][3];
                var47 = new int[var18][3];
                var20 = var47;
                var21 = new Random((long)this.field_x);
                L1: while (true) {
                  L2: {
                    var23 = var14 - -jqa.a(-var14 + var15, var21, 126);
                    var24 = var16 + jqa.a(-var16 + var17, var21, 96);
                    var25 = var8 + var23;
                    if (ns.field_g < var25) {
                      var25 = ns.field_g;
                      var23 = ns.field_g - var8;
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
                        var53 = var47[var9];
                        var28 = 0;
                        var29_int = var5 + var25;
                        if (0 <= var29_int) {
                          break L4;
                        } else {
                          var29_int = var29_int + ns.field_g;
                          break L4;
                        }
                      }
                      L5: {
                        if (ns.field_g < var29_int) {
                          var29_int = var29_int - ns.field_g;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: while (true) {
                        L7: {
                          var52 = var47[var26_int];
                          if (var29_int < var52[0]) {
                            break L7;
                          } else {
                            if ((var52[1] ^ -1) <= (var29_int ^ -1)) {
                              L8: {
                                var22 = var53[2];
                                if (var9 == var26_int) {
                                  break L8;
                                } else {
                                  L9: {
                                    var30 = var5 + var8;
                                    if (-1 >= (var30 ^ -1)) {
                                      break L9;
                                    } else {
                                      var30 = var30 + ns.field_g;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (ns.field_g >= var30) {
                                      break L10;
                                    } else {
                                      var30 = var30 - ns.field_g;
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
                                          if ((var33 ^ -1) != (var22 ^ -1)) {
                                            L13: {
                                              var36 = var42[0];
                                              var37 = var42[1];
                                              if (var30 >= var29_int) {
                                                if (var36 == 0) {
                                                  var34 = 0;
                                                  var35 = Math.min(var29_int, var37);
                                                  break L13;
                                                } else {
                                                  var34 = Math.max(var30, var36);
                                                  var35 = ns.field_g;
                                                  break L13;
                                                }
                                              } else {
                                                var34 = Math.max(var30, var36);
                                                var35 = Math.min(var29_int, var37);
                                                break L13;
                                              }
                                            }
                                            this.a(-var33 + var22, var7 + var34, var4, (byte) -86, -var34 + var35, var33, var21);
                                            var31++;
                                            continue L12;
                                          } else {
                                            var31++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    } else {
                                      var41 = var20[(var9 + var31) % var12];
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
                        var28++;
                        var26_int++;
                        stackIn_21_0 = var26_int;
                        stackIn_21_1 = var12;
                        if (stackIn_21_0 >= stackIn_21_1) {
                          var26_int = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  }
                  L14: {
                    if (var24 + var22 > qda.field_i) {
                      var24 = qda.field_i - var22;
                      break L14;
                    } else {
                      var10 = 0;
                      break L14;
                    }
                  }
                  if (ns.field_g != var25) {
                    incrementValue$0 = var13;
                    var13++;
                    var45 = var19[incrementValue$0];
                    var26 = var45;
                    var45[0] = var8;
                    var45[1] = var25;
                    var26[2] = var22 + var24;
                    this.a(var24, var8 + var6, var46, (byte) -99, var23, var22, var21);
                    var8 = var25;
                    continue L1;
                  } else {
                    this.a(var24, var8 - -var6, var46, (byte) -81, var23, var22, var21);
                    if (var10 == 0) {
                      L15: {
                        var10 = 1;
                        incrementValue$1 = var13;
                        var13++;
                        var43 = var19[incrementValue$1];
                        var26 = var43;
                        var26[2] = var22 - -var24;
                        var43[0] = var8;
                        var43[1] = var25;
                        var27 = var20;
                        var44 = var19;
                        var19 = var27;
                        var12 = var13;
                        var7 = var6;
                        var13 = 0;
                        var6 = jqa.a(ns.field_g, var21, 71);
                        var5 = var6 - var7;
                        var8 = 0;
                        var28 = var5;
                        if (-1 < (var28 ^ -1)) {
                          var28 = var28 + ns.field_g;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        if (ns.field_g < var28) {
                          var28 = var28 - ns.field_g;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var9 = 0;
                      var11 = 0;
                      L17: while (true) {
                        L18: {
                          var29 = var44[var9];
                          if (var28 < var29[0]) {
                            break L18;
                          } else {
                            if ((var28 ^ -1) < (var29[1] ^ -1)) {
                              break L18;
                            } else {
                              continue L1;
                            }
                          }
                        }
                        var9++;
                        stackIn_61_0 = var9 ^ -1;
                        stackIn_61_1 = var12 ^ -1;
                        if (stackIn_61_0 > stackIn_61_1) {
                          continue L17;
                        } else {
                          var9 = 0;
                          continue L17;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return (int[]) null;
        }
    }

    public static void c(int param0) {
        field_r = null;
        if (param0 != -1) {
            return;
        }
        field_q = null;
        field_v = null;
    }

    static {
        field_q = "You cannot add yourself!";
        field_v = new int[8192];
    }
}
