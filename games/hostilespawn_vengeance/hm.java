/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends am {
    int field_m;
    int field_p;
    static bd field_l;
    int field_i;
    int field_j;
    int field_k;
    int field_h;
    static String field_n;
    static String field_o;

    public static void d(int param0) {
        if (param0 != 5) {
            return;
        }
        field_o = null;
        field_l = null;
        field_n = null;
    }

    final static boolean c(int param0) {
        if (param0 != 8) {
            return false;
        }
        return !c.field_a.d((byte) -102) ? true : false;
    }

    final static void a(int param0, bd[] param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (-1 <= (param0 ^ -1)) {
                  break L1;
                } else {
                  if (param3 > 0) {
                    L2: {
                      if (param1[3] != null) {
                        stackIn_9_0 = param1[3].field_u;
                        break L2;
                      } else {
                        stackIn_9_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null == param1[5]) {
                        stackIn_12_0 = 0;
                        break L3;
                      } else {
                        stackIn_12_0 = param1[5].field_u;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null == param1[1]) {
                        stackIn_15_0 = 0;
                        break L4;
                      } else {
                        stackIn_15_0 = param1[1].field_r;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param1[7] != null) {
                        stackIn_18_0 = param1[7].field_r;
                        break L5;
                      } else {
                        stackIn_18_0 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param0 + param5;
                      var11 = param4 - -param3;
                      var12 = var6_int + param5;
                      var13 = -var7 + var10;
                      var14 = param4 - -var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = var6_int * param0 / (var7 + var6_int) + param5;
                        var16 = var6_int * param0 / (var7 + var6_int) + param5;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var18 > var19) {
                        var19 = param3 * var8 / (var9 + var8) + param4;
                        var18 = param3 * var8 / (var9 + var8) + param4;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      si.b(rj.field_M);
                      if (param1[0] == null) {
                        break L8;
                      } else {
                        si.f(param5, param4, var16, var18);
                        param1[0].e(param5, param4);
                        si.a(rj.field_M);
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param1[2]) {
                        si.f(var17, param4, var10, var18);
                        param1[2].e(var13, param4);
                        si.a(rj.field_M);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param1[6]) {
                        si.f(param5, var19, var16, var11);
                        param1[6].e(param5, var15);
                        si.a(rj.field_M);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[8] == null) {
                        break L11;
                      } else {
                        si.f(var17, var19, var10, var11);
                        param1[8].e(var13, var15);
                        si.a(rj.field_M);
                        break L11;
                      }
                    }
                    L12: {
                      if (param1[1] == null) {
                        break L12;
                      } else {
                        if (param1[1].field_u == 0) {
                          break L12;
                        } else {
                          si.f(var16, param4, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              si.a(rj.field_M);
                              break L12;
                            } else {
                              param1[1].e(var20, param4);
                              var20 = var20 + param1[1].field_u;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param1[7]) {
                        break L14;
                      } else {
                        if (param1[7].field_u == 0) {
                          break L14;
                        } else {
                          si.f(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var13 <= var20) {
                              si.a(rj.field_M);
                              break L14;
                            } else {
                              param1[7].e(var20, var15);
                              var20 = var20 + param1[7].field_u;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param1[3]) {
                        break L16;
                      } else {
                        if (0 != param1[3].field_r) {
                          si.f(param5, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              si.a(rj.field_M);
                              break L16;
                            } else {
                              param1[3].e(param5, var20);
                              var20 = var20 + param1[3].field_r;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (!param2) {
                        break L18;
                      } else {
                        hm.d(79);
                        break L18;
                      }
                    }
                    L19: {
                      if (null == param1[5]) {
                        break L19;
                      } else {
                        if (param1[5].field_r == 0) {
                          break L19;
                        } else {
                          si.f(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              si.a(rj.field_M);
                              break L19;
                            } else {
                              param1[5].e(var13, var20);
                              var20 = var20 + param1[5].field_r;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      if (param1[4] == null) {
                        break L21;
                      } else {
                        if (param1[4].field_u == 0) {
                          break L21;
                        } else {
                          if (param1[4].field_r == 0) {
                            break L21;
                          } else {
                            si.f(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                si.a(rj.field_M);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param1[4].field_r;
                                    continue L22;
                                  } else {
                                    param1[4].e(var21, var20);
                                    var21 = var21 + param1[4].field_u;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var6);

            stackIn_74_1 = new StringBuilder().append("hm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L24;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L24;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    hm(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param5;
        this.field_k = param3;
        this.field_p = param1;
        this.field_i = param2;
        this.field_h = param4;
        this.field_m = param0;
    }

    final static void a(int param0, int param1, vi param2, int param3, int param4) {
        try {
            param2.d(param4 + -4023, 12);
            param2.a((byte) -113, 17);
            param2.a((byte) -110, param0);
            if (param4 != 4122) {
                bd[] var6 = (bd[]) null;
                hm.a(84, (bd[]) null, false, 109, 3, -79);
            }
            param2.a((byte) -128, param1);
            param2.d(122, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "hm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
        field_n = "Names should contain a maximum of 12 characters";
    }
}
