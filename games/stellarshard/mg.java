/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    int field_u;
    boolean[] field_I;
    int field_B;
    int[] field_l;
    int[] field_a;
    int[][] field_f;
    int[][] field_i;
    int field_F;
    int field_d;
    int[] field_p;
    byte[] field_G;
    int field_K;
    int field_j;
    static int field_y;
    byte[] field_z;
    int field_w;
    int field_n;
    int field_q;
    int field_g;
    byte field_o;
    int field_m;
    static int field_t;
    int field_C;
    byte[] field_H;
    static int[] field_h;
    byte[] field_J;
    int field_A;
    int field_c;
    byte[] field_s;
    byte[] field_D;
    byte[][] field_v;
    static String field_k;
    boolean[] field_b;
    int field_r;
    int[] field_x;
    int[][] field_e;

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            mg.a(true);
        }
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var19 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (param4 < cc.field_c) {
                  L2: {
                    if ((param3 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if ((param7 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < cc.field_m) {
                      break L3;
                    } else {
                      if (param7 < cc.field_m) {
                        break L3;
                      } else {
                        if (param1 >= cc.field_m) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param6 == -445834032) {
                      break L4;
                    } else {
                      mg.a(false);
                      break L4;
                    }
                  }
                  L5: {
                    var14 = param0 + -param4;
                    if (param4 == param8) {
                      L6: {
                        if (param4 == param0) {
                          var12 = 0;
                          var9_int = param3 << -445834032;
                          var10 = param7 << 819412752;
                          var11 = 0;
                          break L6;
                        } else {
                          var15 = -param8 + param0;
                          if (param3 < param7) {
                            var12 = (param1 - param7 << -157546096) / var15;
                            var9_int = param3 << 15965520;
                            var11 = (-param3 + param1 << -1323619184) / var14;
                            var10 = param7 << 701339280;
                            break L6;
                          } else {
                            var10 = param3 << -352238320;
                            var11 = (param1 + -param7 << 1590199120) / var15;
                            var9_int = param7 << -1533066512;
                            var12 = (-param3 + param1 << 728384272) / var14;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (0 > param4) {
                          param4 = Math.min(-param4, -param4 + param8);
                          var10 = var10 + param4 * var12;
                          var9_int = var9_int + param4 * var11;
                          param4 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var13 = 0;
                      break L5;
                    } else {
                      L8: {
                        var10 = param3 << 1781485936;
                        var9_int = param3 << 1781485936;
                        var15 = -param4 + param8;
                        var11 = (-param3 + param7 << 1807727792) / var15;
                        var12 = (-param3 + param1 << 891780240) / var14;
                        if (var12 > var11) {
                          var13 = 0;
                          break L8;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (param4 >= 0) {
                            break L10;
                          } else {
                            if (-1 < (param8 ^ -1)) {
                              param4 = param8 + -param4;
                              var9_int = var9_int + param4 * var11;
                              var10 = var10 + param4 * var12;
                              param4 = param8;
                              break L9;
                            } else {
                              param4 = -param4;
                              var10 = var10 + param4 * var12;
                              var9_int = var9_int + param4 * var11;
                              param4 = 0;
                              break L10;
                            }
                          }
                        }
                        var16 = cc.field_i[param4];
                        L11: while (true) {
                          if (param8 <= param4) {
                            break L9;
                          } else {
                            L12: {
                              var17 = var9_int >> 2016565744;
                              if (var17 < cc.field_m) {
                                var18 = -(var9_int >> -450695600) + (var10 >> 650545424);
                                if (-1 == (var18 ^ -1)) {
                                  if ((var17 ^ -1) > -1) {
                                    break L12;
                                  } else {
                                    if (var17 >= cc.field_m) {
                                      break L12;
                                    } else {
                                      aj.a(param5, true, var18, param2, var17 - -var16);
                                      break L12;
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (var18 + var17 >= cc.field_m) {
                                      var18 = -var17 + cc.field_m + -1;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    aj.a(param5, true, var18, param2, var17 - -var16);
                                    break L12;
                                  } else {
                                    aj.a(param5, true, var17 + var18, param2, var16);
                                    break L12;
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                            param4++;
                            if (param4 >= cc.field_c) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var16 = var16 + ti.field_i;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L11;
                            }
                          }
                        }
                      }
                      var16 = -param8 + param0;
                      if (0 != var16) {
                        L14: {
                          var17 = param1 << -1782699248;
                          if (var13 != 0) {
                            var10 = param7 << -2100733392;
                            break L14;
                          } else {
                            var9_int = param7 << 1583416656;
                            break L14;
                          }
                        }
                        var11 = (-var9_int + var17) / var16;
                        var12 = (var17 + -var10) / var16;
                        break L5;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if (param4 >= 0) {
                      break L15;
                    } else {
                      param4 = -param4;
                      var9_int = var9_int + param4 * var11;
                      var10 = var10 + var12 * param4;
                      param4 = 0;
                      break L15;
                    }
                  }
                  var15 = cc.field_i[param4];
                  L16: while (true) {
                    if (param0 <= param4) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> -1103451824;
                        if (var16 < cc.field_m) {
                          var17 = -(var9_int >> 1058143952) + (var10 >> 413223728);
                          if (0 == var17) {
                            if ((var16 ^ -1) > -1) {
                              break L17;
                            } else {
                              if (cc.field_m <= var16) {
                                break L17;
                              } else {
                                aj.a(param5, true, var17, param2, var16 - -var15);
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (var17 + var16 >= cc.field_m) {
                                var17 = -var16 + (cc.field_m + -1);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if ((var16 ^ -1) > -1) {
                              aj.a(param5, true, var16 + var17, param2, var15);
                              break L17;
                            } else {
                              aj.a(param5, true, var17, param2, var15 + var16);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param4++;
                      if (cc.field_c > param4) {
                        var9_int = var9_int + var11;
                        var15 = var15 + ti.field_i;
                        var10 = var10 + var12;
                        continue L16;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) (var9);
            stackOut_77_1 = new StringBuilder().append("mg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param5 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L19;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L19;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    mg() {
        this.field_f = new int[6][258];
        this.field_l = new int[257];
        this.field_I = new boolean[16];
        this.field_u = 0;
        this.field_G = new byte[18002];
        this.field_i = new int[6][258];
        this.field_z = new byte[4096];
        this.field_a = new int[16];
        this.field_r = 0;
        this.field_p = new int[6];
        this.field_v = new byte[6][258];
        this.field_s = new byte[256];
        this.field_b = new boolean[256];
        this.field_x = new int[256];
        this.field_e = new int[6][258];
        this.field_J = new byte[18002];
    }

    static {
        field_t = 0;
        field_k = "Player";
    }
}
