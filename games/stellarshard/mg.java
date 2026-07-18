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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var19 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (param4 < cc.field_c) {
                  L2: {
                    if (param3 >= 0) {
                      break L2;
                    } else {
                      if (param7 >= 0) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          return;
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
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param0 + -param4;
                    if (param4 == param8) {
                      L5: {
                        if (param4 == param0) {
                          var12 = 0;
                          var9_int = param3 << 16;
                          var10 = param7 << 16;
                          var11 = 0;
                          break L5;
                        } else {
                          var15 = -param8 + param0;
                          if (param3 < param7) {
                            var12 = (param1 - param7 << 16) / var15;
                            var9_int = param3 << 16;
                            var11 = (-param3 + param1 << 16) / var14;
                            var10 = param7 << 16;
                            break L5;
                          } else {
                            var10 = param3 << 16;
                            var11 = (param1 + -param7 << 16) / var15;
                            var9_int = param7 << 16;
                            var12 = (-param3 + param1 << 16) / var14;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (0 > param4) {
                          param4 = Math.min(-param4, -param4 + param8);
                          var10 = var10 + param4 * var12;
                          var9_int = var9_int + param4 * var11;
                          param4 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param3 << 16;
                        var9_int = param3 << 16;
                        var15 = -param4 + param8;
                        var11 = (-param3 + param7 << 16) / var15;
                        var12 = (-param3 + param1 << 16) / var14;
                        if (var12 > var11) {
                          var13 = 0;
                          break L7;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param4 >= 0) {
                            break L9;
                          } else {
                            if (param8 < 0) {
                              param4 = param8 + -param4;
                              var9_int = var9_int + param4 * var11;
                              var10 = var10 + param4 * var12;
                              param4 = param8;
                              break L8;
                            } else {
                              param4 = -param4;
                              var10 = var10 + param4 * var12;
                              var9_int = var9_int + param4 * var11;
                              param4 = 0;
                              break L9;
                            }
                          }
                        }
                        var16 = cc.field_i[param4];
                        L10: while (true) {
                          if (param8 <= param4) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (var17 < cc.field_m) {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (var17 >= cc.field_m) {
                                      break L11;
                                    } else {
                                      aj.a(param5, true, var18, param2, var17 - -var16);
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (var18 + var17 >= cc.field_m) {
                                      var18 = -var17 + cc.field_m + -1;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    aj.a(param5, true, var18, param2, var17 - -var16);
                                    break L11;
                                  } else {
                                    aj.a(param5, true, var17 + var18, param2, var16);
                                    break L11;
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            param4++;
                            if (param4 >= cc.field_c) {
                              return;
                            } else {
                              var16 = var16 + ti.field_i;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L10;
                            }
                          }
                        }
                      }
                      var16 = -param8 + param0;
                      if (0 != var16) {
                        L13: {
                          var17 = param1 << 16;
                          if (var13 != 0) {
                            var10 = param7 << 16;
                            break L13;
                          } else {
                            var9_int = param7 << 16;
                            break L13;
                          }
                        }
                        var11 = (-var9_int + var17) / var16;
                        var12 = (var17 + -var10) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (param4 >= 0) {
                      break L14;
                    } else {
                      param4 = -param4;
                      var9_int = var9_int + param4 * var11;
                      var10 = var10 + var12 * param4;
                      param4 = 0;
                      break L14;
                    }
                  }
                  var15 = cc.field_i[param4];
                  L15: while (true) {
                    if (param0 <= param4) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (var16 < cc.field_m) {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (0 == var17) {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (cc.field_m <= var16) {
                                break L16;
                              } else {
                                aj.a(param5, true, var17, param2, var16 - -var15);
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (var17 + var16 >= cc.field_m) {
                                var17 = -var16 + (cc.field_m + -1);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var16 < 0) {
                              aj.a(param5, true, var16 + var17, param2, var15);
                              break L16;
                            } else {
                              aj.a(param5, true, var17, param2, var15 + var16);
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      param4++;
                      if (cc.field_c > param4) {
                        var9_int = var9_int + var11;
                        var15 = var15 + ti.field_i;
                        var10 = var10 + var12;
                        continue L15;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var9;
            stackOut_75_1 = new StringBuilder().append("mg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param5 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + -445834032 + ',' + param7 + ',' + param8 + ')');
        }
    }

    mg() {
        ((mg) this).field_f = new int[6][258];
        ((mg) this).field_l = new int[257];
        ((mg) this).field_I = new boolean[16];
        ((mg) this).field_u = 0;
        ((mg) this).field_G = new byte[18002];
        ((mg) this).field_i = new int[6][258];
        ((mg) this).field_z = new byte[4096];
        ((mg) this).field_a = new int[16];
        ((mg) this).field_r = 0;
        ((mg) this).field_p = new int[6];
        ((mg) this).field_v = new byte[6][258];
        ((mg) this).field_s = new byte[256];
        ((mg) this).field_b = new boolean[256];
        ((mg) this).field_x = new int[256];
        ((mg) this).field_e = new int[6][258];
        ((mg) this).field_J = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0;
        field_k = "Player";
    }
}
