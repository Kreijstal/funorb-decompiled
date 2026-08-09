/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends ng {
    boolean field_H;
    static int field_F;
    private boolean field_K;
    static java.applet.Applet field_L;
    private boolean field_I;
    boolean field_M;
    static byte[] field_J;
    static String field_G;

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -58) {
                break L1;
              } else {
                field_J = (byte[]) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_H) {
                break L2;
              } else {
                if (this.a(102, param5, param3, param6, param4)) {
                  L3: {
                    this.a(param1, 27);
                    this.field_k = param2;
                    if (this.field_n == null) {
                      break L3;
                    } else {
                      if (!(this.field_n instanceof b)) {
                        break L3;
                      } else {
                        ((b) ((Object) this.field_n)).a(param4, 118, param3, param2, (qm) (this), param5, param6);
                        break L3;
                      }
                    }
                  }
                  stackIn_16_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("qm.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_H) {
                break L1;
              } else {
                if (!this.field_I) {
                  break L1;
                } else {
                  L2: {
                    param0.h(2);
                    this.field_K = true;
                    if (param1 == 27) {
                      break L2;
                    } else {
                      qm.a(-64, (sb) null, 111, 79, (sb) null, 120, -16, 109, (sb) null, 39, -126, (jl) null, 33, -16, (jl) null, -57, -112, -56, 119, 16);
                      break L2;
                    }
                  }
                  L3: {
                    if (null == this.field_n) {
                      break L3;
                    } else {
                      if (!(this.field_n instanceof cc)) {
                        break L3;
                      } else {
                        ((cc) ((Object) this.field_n)).a((ng) (this), param1 ^ 44, this.field_K);
                        break L3;
                      }
                    }
                  }
                  stackIn_18_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("qm.HA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_H = true;
                break L1;
              }
            }
            L2: {
              if (this.field_n == null) {
                break L2;
              } else {
                if (this.field_n instanceof vo) {
                  ((vo) ((Object) this.field_n)).a((qm) (this), param1, 11, param2, param3);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "qm.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_K = false;
                break L1;
              }
            }
            L2: {
              if (!this.a(-89, param2, param0, param3)) {
                break L2;
              } else {
                L3: {
                  this.a(param2, (byte) -2, param3, param0);
                  if (!this.field_M) {
                    break L3;
                  } else {
                    discarded$2 = param0.append(" active");
                    break L3;
                  }
                }
                if (this.field_H) {
                  break L2;
                } else {
                  discarded$3 = param0.append(" disabled");
                  break L2;
                }
              }
            }
            stackIn_13_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("qm.AA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_22_2 + ')');
        }
        return stackIn_13_0;
    }

    void a(int param0, int param1, int param2, ng param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (this.field_k == 0) {
                break L1;
              } else {
                if (this.field_k != ef.field_b) {
                  L2: {
                    if (!this.a(78, param2, param1, bg.field_k, uf.field_d)) {
                      break L2;
                    } else {
                      if (ef.field_b == 0) {
                        this.a(true, -param1 + bg.field_k, this.field_k, -param2 + uf.field_d);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(bg.field_k, param2, param3, 0, param1, uf.field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("qm.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_n) {
                break L1;
              } else {
                if (!(this.field_n instanceof b)) {
                  break L1;
                } else {
                  ((b) ((Object) this.field_n)).a(param4, (byte) 71, param0, param5, (qm) (this), param1);
                  break L1;
                }
              }
            }
            this.field_k = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7);

            stackIn_11_1 = new StringBuilder().append("qm.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    qm(String param0, fn param1) {
        this(param0, h.field_X.field_r, param1);
    }

    final static void a(rl param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_85_1 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        var30 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 761181602;
              var22 = param1[4] >> -246048734;
              var23 = param1[5] >> -1098812414;
              var24 = param1[6] >> -1044620926;
              var25 = param1[7] >> -385707870;
              var26 = param1[8] >> 1613946530;
              var27 = param1[9] >> 1788628002;
              var28 = param1[10] >> 1601499458;
              var29 = param1[11] >> -1808533406;
              var13 = var25 * param3[4] + var24 * param3[3] - -(param3[5] * var26) >> -1500521970;
              var12 = param3[5] * var23 + (param3[3] * var21 + param3[4] * var22) >> -945126674;
              var14 = var29 * param3[5] + (var28 * param3[4] + param3[3] * var27) >> 803521742;
              var20 = param3[11] * var29 + (var27 * param3[9] + param3[10] * var28) >> 1116052910;
              var19 = param3[10] * var25 + var24 * param3[9] - -(param3[11] * var26) >> -146386226;
              var17 = param3[8] * var29 + var28 * param3[7] + param3[6] * var27 >> -2062872690;
              var16 = var26 * param3[8] + var24 * param3[6] - -(var25 * param3[7]) >> 1389276270;
              var15 = var21 * param3[6] + param3[7] * var22 - -(var23 * param3[8]) >> 1331949326;
              var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> -2089981170;
              var21 = param3[0] - param1[0];
              var22 = param3[1] + -param1[1];
              var23 = -param1[2] + param3[2];
              if (param4 >= 3) {
                break L1;
              } else {
                qm.a(112, (sb) null, 29, 72, (sb) null, 76, -127, -121, (sb) null, -76, 4, (jl) null, -119, 13, (jl) null, 46, -72, 8, -22, -67);
                break L1;
              }
            }
            var9 = var21 * param1[3] - -(param1[4] * var22) + var23 * param1[5] >> -ai.field_x + 16;
            var10 = var23 * param1[8] + (param1[7] * var22 + param1[6] * var21) >> 16 + -ai.field_x;
            var11 = param1[11] * var23 + param1[9] * var21 - -(param1[10] * var22) >> -1423010576;
            var21 = ja.field_b;
            var22 = ja.field_i;
            var23 = 0;
            L2: while (true) {
              L3: {
                if (var23 >= param0.field_A) {
                  L4: {
                    if (param0.field_w == null) {
                      break L4;
                    } else {
                      if (param0.field_H == null) {
                        break L4;
                      } else {
                        if (param0.field_C == null) {
                          break L4;
                        } else {
                          if (param0.field_v == null) {
                            break L4;
                          } else {
                            if (null == param0.field_P) {
                              break L4;
                            } else {
                              if (param0.field_u == null) {
                                break L4;
                              } else {
                                if (param0.field_M == null) {
                                  break L4;
                                } else {
                                  if (param0.field_y == null) {
                                    break L4;
                                  } else {
                                    if (null != param0.field_R) {
                                      var23 = 0;
                                      L5: while (true) {
                                        if (param0.field_j <= var23) {
                                          break L4;
                                        } else {
                                          var24 = param0.field_w[var23];
                                          var25 = param0.field_H[var23];
                                          var26 = param0.field_C[var23];
                                          h.field_Y[var23] = (var26 * var18 + (var12 * var24 - -(var15 * var25)) >> 1632444336) + var9;
                                          vk.field_ub[var23] = (var26 * var19 + (var24 * var13 + var25 * var16) >> 416578480) + var10;
                                          gh.field_r[var23] = var11 - -(var26 * var20 + (var14 * var24 + var25 * var17) >> -118613232);
                                          var24 = param0.field_v[var23];
                                          var25 = param0.field_P[var23];
                                          var26 = param0.field_u[var23];
                                          eg.field_l[var23] = var9 - -(var18 * var26 + (var12 * var24 - -(var25 * var15)) >> -1575370448);
                                          dj.field_b[var23] = var10 + (var16 * var25 + var24 * var13 - -(var19 * var26) >> 1945691088);
                                          kh.field_c[var23] = (var20 * var26 + var14 * var24 - -(var25 * var17) >> -1789684176) + var11;
                                          var24 = param0.field_M[var23];
                                          var25 = param0.field_y[var23];
                                          var26 = param0.field_R[var23];
                                          eg.field_h[var23] = (var24 * var12 - (-(var15 * var25) + -(var26 * var18)) >> -1580121136) + var9;
                                          ip.field_x[var23] = var10 + (var24 * var13 - (-(var16 * var25) + -(var26 * var19)) >> -901180944);
                                          le.field_b[var23] = (var14 * var24 - (-(var25 * var17) - var26 * var20) >> -25757392) + var11;
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
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
                  if (param5) {
                    var9 = param3[3];
                    var10 = param3[4];
                    var11 = param3[5];
                    var12 = param3[6];
                    var13 = param3[7];
                    var14 = param3[8];
                    var15 = param3[9];
                    var16 = param3[10];
                    var17 = param3[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_65_0 = param0.field_a ^ -1;
                      stackIn_65_1 = var18 ^ -1;
                      if (stackIn_65_0 >= stackIn_65_1) {
                        break L3;
                      } else {
                        stackIn_68_0 = var18;
                        if (stackIn_68_0 >= wd.field_i.length) {
                          break L3;
                        } else {
                          var19 = param0.field_K[var18];
                          var20 = param0.field_q[var18];
                          var21 = param0.field_p[var18];
                          wd.field_i[var18] = var12 * var20 + (var9 * var19 + var15 * var21) >> 383177008;
                          lo.field_Ib[var18] = var16 * var21 + var20 * var13 + var19 * var10 >> -138139216;
                          wn.field_q[var18] = var17 * var21 + var11 * var19 + var14 * var20 >> 847763312;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  var24 = param0.field_k[var23];
                  var25 = param0.field_N[var23];
                  var26 = param0.field_E[var23];
                  var27 = (var18 * var26 + var24 * var12 - -(var25 * var15) >> -ai.field_x + 16) + var9;
                  var28 = var10 + (var26 * var19 + var13 * var24 - -(var25 * var16) >> 16 - ai.field_x);
                  var29 = var11 + (var25 * var17 + var24 * var14 - -(var26 * var20) >> 1738462096);
                  stackIn_65_0 = -51;

                  stackIn_65_1 = var29 ^ -1;

                  L8: {
                    if (stackIn_65_0 >= stackIn_65_1) {
                      L9: {
                        jp.field_a[var23] = var21 + var27 / var29;
                        al.field_m[var23] = var22 + var28 / var29;
                        qe.field_v[var23] = var29;
                        if ((var29 ^ -1) > (var7_int ^ -1)) {
                          var7_int = var29;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      if (var8 < var29) {
                        var8 = var29;
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      qe.field_v[var23] = -2147483648;
                      break L8;
                    }
                  }
                  L10: {
                    if (param6) {
                      ih.field_c[var23] = var27 >> ai.field_x;
                      qo.field_w[var23] = var28 >> ai.field_x;
                      ai.field_e[var23] = var29;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              ca.a(var8, param0, false, var7_int, param2);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var7);

            stackIn_77_1 = new StringBuilder().append("qm.UA(");

            if (param0 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L11;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',');

            if (param1 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L12;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L13;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L13;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_78_0), stackIn_86_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a((StringBuilder) null, false, 27, (Hashtable) null);
                break L1;
              }
            }
            stackIn_4_0 = this.field_K;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "qm.JA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, sb param1, int param2, int param3, sb param4, int param5, int param6, int param7, sb param8, int param9, int param10, jl param11, int param12, int param13, jl param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            L1: {
              ie.field_G = param11;
              lm.field_o = param14;
              el.a(param10, param13, param9, 93, param3);
              nb.a(param5, param6, 7, param1);
              mj.a(param2, param4, param0, 300, param12, param8);
              ug.a(param15, param19, -26104);
              k.a(param7, param18, -14129, param16);
              if (param17 >= 105) {
                break L1;
              } else {
                field_L = (java.applet.Applet) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("qm.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_23_2 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    qm(String param0, eb param1, fn param2) {
        super(param0, param1, param2);
        this.field_K = false;
        this.field_H = true;
        this.field_I = true;
    }

    final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_K) {
                this.field_K = false;
                if (this.field_n == null) {
                  break L1;
                } else {
                  if (this.field_n instanceof cc) {
                    ((cc) ((Object) this.field_n)).a((ng) (this), param0 ^ 58, this.field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 2) {
                break L2;
              } else {
                field_L = (java.applet.Applet) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "qm.OA(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 3) {
              L1: {
                if (!this.b(true)) {
                  break L1;
                } else {
                  L2: {
                    if (84 == param0) {
                      break L2;
                    } else {
                      if (83 == param0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.a(true, -1, 1, -1);
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("qm.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 7) {
                break L1;
              } else {
                field_F = 18;
                break L1;
              }
            }
            var3_int = mi.d(-4096, param1);
            var4 = th.a(param1, 8191);
            var5 = mi.d(-4096, param0);
            var6 = th.a(param0, 8191);
            var7 = (int)((long)var3_int * (long)var5 >> 468917712);
            var8 = (int)((long)var3_int * (long)var6 >> -1760164144);
            var9 = (int)((long)var5 * (long)var4 >> 161988112);
            var10 = (int)((long)var6 * (long)var4 >> 1728931536);
            stackIn_4_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "qm.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void j(int param0) {
        try {
            field_J = null;
            field_G = null;
            field_L = null;
            if (param0 < 62) {
                qm.a(8, (sb) null, 42, -55, (sb) null, 28, 88, -93, (sb) null, 77, 108, (jl) null, 5, -44, (jl) null, -125, -73, 115, -35, -117);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qm.RA(" + param0 + ')');
        }
    }

    protected qm() {
        this.field_K = false;
        this.field_H = true;
        this.field_I = true;
        try {
            this.field_y = h.field_X.field_s;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qm.<init>()");
        }
    }

    static {
        field_G = "<%0> wins!";
    }
}
