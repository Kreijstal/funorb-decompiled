/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ld extends vj {
    private String field_e;
    private long field_f;
    static byte[][][] field_h;
    static String[] field_g;

    final void a(n param0, byte param1) {
        param0.a(this.field_f, (byte) -23);
        if (param1 > -15) {
            return;
        }
        try {
            param0.a(this.field_e, (byte) 111);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ld.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -71) {
            ed[] var2 = (ed[]) null;
            ld.a(9, (ed[]) null, 60, -23, 39, -65);
        }
        field_h = (byte[][][]) null;
        field_g = null;
    }

    final static void a(int param0, ed[] param1, int param2, int param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
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
        var22 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if (0 < param0) {
                    L2: {
                      if (null != param1[3]) {
                        stackIn_9_0 = param1[3].field_A;
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
                        stackIn_12_0 = param1[5].field_A;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param1[1] != null) {
                        stackIn_15_0 = param1[1].field_z;
                        break L4;
                      } else {
                        stackIn_15_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param1[7] == null) {
                        stackIn_18_0 = 0;
                        break L5;
                      } else {
                        stackIn_18_0 = param1[7].field_z;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param5 + param4;
                      var11 = param0 + param3;
                      var12 = var6_int + param4;
                      var13 = var10 + -var7;
                      var14 = var8 + param3;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 <= var17) {
                        break L6;
                      } else {
                        var17 = param5 * var6_int / (var6_int - -var7) + param4;
                        var16 = param5 * var6_int / (var6_int - -var7) + param4;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var19 < var18) {
                        var19 = param0 * var8 / (var9 + var8) + param3;
                        var18 = param0 * var8 / (var9 + var8) + param3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      em.a(kf.field_o);
                      if (null == param1[0]) {
                        break L8;
                      } else {
                        em.h(param4, param3, var16, var18);
                        param1[0].e(param4, param3);
                        em.b(kf.field_o);
                        break L8;
                      }
                    }
                    L9: {
                      if (param1[2] == null) {
                        break L9;
                      } else {
                        em.h(var17, param3, var10, var18);
                        param1[2].e(var13, param3);
                        em.b(kf.field_o);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] != null) {
                        em.h(param4, var19, var16, var11);
                        param1[6].e(param4, var15);
                        em.b(kf.field_o);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param1[8]) {
                        break L11;
                      } else {
                        em.h(var17, var19, var10, var11);
                        param1[8].e(var13, var15);
                        em.b(kf.field_o);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[1]) {
                        break L12;
                      } else {
                        if (0 == param1[1].field_A) {
                          break L12;
                        } else {
                          em.h(var16, param3, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              em.b(kf.field_o);
                              break L12;
                            } else {
                              param1[1].e(var20, param3);
                              var20 = var20 + param1[1].field_A;
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
                        if (-1 == (param1[7].field_A ^ -1)) {
                          break L14;
                        } else {
                          em.h(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              em.b(kf.field_o);
                              break L14;
                            } else {
                              param1[7].e(var20, var15);
                              var20 = var20 + param1[7].field_A;
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
                        if (-1 == (param1[3].field_z ^ -1)) {
                          break L16;
                        } else {
                          em.h(param4, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var20 >= var15) {
                              em.b(kf.field_o);
                              break L16;
                            } else {
                              param1[3].e(param4, var20);
                              var20 = var20 + param1[3].field_z;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (param1[5] == null) {
                        break L18;
                      } else {
                        if (param1[5].field_z != 0) {
                          em.h(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var20 >= var15) {
                              em.b(kf.field_o);
                              break L18;
                            } else {
                              param1[5].e(var13, var20);
                              var20 = var20 + param1[5].field_z;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param1[param2] == null) {
                        break L20;
                      } else {
                        if (0 == param1[4].field_A) {
                          break L20;
                        } else {
                          if (param1[4].field_z == 0) {
                            break L20;
                          } else {
                            em.h(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                em.b(kf.field_o);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param1[4].field_z;
                                    continue L21;
                                  } else {
                                    param1[4].e(var21, var20);
                                    var21 = var21 + param1[4].field_A;
                                    continue L22;
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
          L23: {
            var6 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var6);

            stackIn_70_1 = new StringBuilder().append("ld.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L23;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L23;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final static void a(int param0, byte param1) {
        if (param1 != -6) {
            ld.a(-16, (byte) 28);
        }
    }

    final static hj c(byte param0) {
        if (param0 <= 104) {
            ed[] var2 = (ed[]) null;
            ld.a(-62, (ed[]) null, -58, -40, -5, -81);
        }
        return aj.field_f;
    }

    ld(long param0, String param1) {
        try {
            this.field_f = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ld.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    fk a(byte param0) {
        if (param0 != 32) {
            return (fk) null;
        }
        return ja.field_a;
    }

    final static int a(ik param0, int param1, int param2, ij param3) {
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.field_o == null) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (param3.field_n != param0.field_j) {
                      break L1;
                    } else {
                      var4_int = param0.field_q.length;
                      var5 = param3.field_o[param1].length / var4_int;
                      var6 = param2;
                      L2: while (true) {
                        if (var6 >= var5) {
                          stackIn_23_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L3: {
                            if ((param3.field_k[param1][var6] ^ -1L) == (param0.field_l ^ -1L)) {
                              if (ic.a(param3.field_m[param1][var6], (byte) 120)) {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_20_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param0.field_q[var7] == param3.field_o[param1][var7 + var4_int * var6]) {
                                      var7++;
                                      continue L4;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            } else {
                              break L3;
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("ld.I(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    static {
        field_g = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
