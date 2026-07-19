/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private uh field_e;
    static boolean field_b;
    private oa field_l;
    private pj field_f;
    static int field_h;
    private java.math.BigInteger field_g;
    private be[] field_d;
    private java.math.BigInteger field_j;
    static int[] field_k;
    private cd field_c;
    static int field_i;
    static String field_a;

    dk(uh param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static kk a(String param0, long param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        ac stackIn_5_0 = null;
        bd stackIn_9_0 = null;
        wj stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ac stackOut_4_0 = null;
        bd stackOut_8_0 = null;
        wj stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param4 >= 7) {
                break L1;
              } else {
                dk.a((byte) 119);
                break L1;
              }
            }
            L2: {
              if (-1L != (param1 ^ -1L)) {
                break L2;
              } else {
                if (param0 == null) {
                  break L2;
                } else {
                  stackOut_4_0 = new ac(param0, param3);
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param2) {
              stackOut_8_0 = new bd(param1, param3);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_10_0 = new wj(param1, param3);
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("dk.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kk) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kk) ((Object) stackIn_9_0);
          } else {
            return (kk) ((Object) stackIn_11_0);
          }
        }
    }

    final static void a(int param0, ti[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var22 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if ((param5 ^ -1) >= -1) {
                  break L1;
                } else {
                  if ((param0 ^ -1) >= -1) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param1[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param1[3].field_r;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null != param1[5]) {
                        stackOut_12_0 = param1[5].field_r;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null == param1[1]) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param1[1].field_s;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (null == param1[7]) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param1[7].field_s;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    var9 = stackIn_19_0;
                    var10 = param5 + param3;
                    if (param2 == -28018) {
                      L6: {
                        var11 = param4 + param0;
                        var12 = var6_int + param3;
                        var13 = var10 - var7;
                        var14 = param4 - -var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var16 > var17) {
                          var17 = param5 * var6_int / (var6_int + var7) + param3;
                          var16 = param5 * var6_int / (var6_int + var7) + param3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        sb.a(cc.field_d);
                        if (var19 >= var18) {
                          break L7;
                        } else {
                          var19 = param4 - -(param0 * var8 / (var8 - -var9));
                          var18 = param4 - -(param0 * var8 / (var8 - -var9));
                          break L7;
                        }
                      }
                      L8: {
                        if (param1[0] != null) {
                          sb.g(param3, param4, var16, var18);
                          param1[0].c(param3, param4);
                          sb.b(cc.field_d);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (null != param1[2]) {
                          sb.g(var17, param4, var10, var18);
                          param1[2].c(var13, param4);
                          sb.b(cc.field_d);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null != param1[6]) {
                          sb.g(param3, var19, var16, var11);
                          param1[6].c(param3, var15);
                          sb.b(cc.field_d);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null != param1[8]) {
                          sb.g(var17, var19, var10, var11);
                          param1[8].c(var13, var15);
                          sb.b(cc.field_d);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param1[1] == null) {
                          break L12;
                        } else {
                          if (-1 == (param1[1].field_r ^ -1)) {
                            break L12;
                          } else {
                            sb.g(var16, param4, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                sb.b(cc.field_d);
                                break L12;
                              } else {
                                param1[1].c(var20, param4);
                                var20 = var20 + param1[1].field_r;
                                if (var22 != 0) {
                                  break L12;
                                } else {
                                  continue L13;
                                }
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (param1[7] == null) {
                          break L14;
                        } else {
                          if (-1 == (param1[7].field_r ^ -1)) {
                            break L14;
                          } else {
                            sb.g(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                sb.b(cc.field_d);
                                break L14;
                              } else {
                                param1[7].c(var20, var15);
                                var20 = var20 + param1[7].field_r;
                                if (var22 != 0) {
                                  break L14;
                                } else {
                                  continue L15;
                                }
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null == param1[3]) {
                          break L16;
                        } else {
                          if (-1 == (param1[3].field_s ^ -1)) {
                            break L16;
                          } else {
                            sb.g(param3, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var15 <= var20) {
                                sb.b(cc.field_d);
                                break L16;
                              } else {
                                param1[3].c(param3, var20);
                                var20 = var20 + param1[3].field_s;
                                if (var22 != 0) {
                                  break L16;
                                } else {
                                  continue L17;
                                }
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (null == param1[5]) {
                          break L18;
                        } else {
                          if (0 == param1[5].field_s) {
                            break L18;
                          } else {
                            sb.g(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var20 >= var15) {
                                sb.b(cc.field_d);
                                break L18;
                              } else {
                                param1[5].c(var13, var20);
                                var20 = var20 + param1[5].field_s;
                                if (var22 != 0) {
                                  break L18;
                                } else {
                                  continue L19;
                                }
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (null == param1[4]) {
                          break L20;
                        } else {
                          if (param1[4].field_r == 0) {
                            break L20;
                          } else {
                            if (-1 == (param1[4].field_s ^ -1)) {
                              break L20;
                            } else {
                              sb.g(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  sb.b(cc.field_d);
                                  break L20;
                                } else {
                                  if (var22 != 0) {
                                    break L20;
                                  } else {
                                    var21 = var12;
                                    L22: while (true) {
                                      L23: {
                                        if (var13 <= var21) {
                                          var20 = var20 + param1[4].field_s;
                                          break L23;
                                        } else {
                                          param1[4].c(var21, var20);
                                          var21 = var21 + param1[4].field_r;
                                          if (var22 != 0) {
                                            break L23;
                                          } else {
                                            continue L22;
                                          }
                                        }
                                      }
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
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
            stackOut_85_0 = (RuntimeException) (var6);
            stackOut_85_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param1 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L24;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L24;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    final be a(int param0, boolean param1, int param2, ak param3, ak param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        be var9 = null;
        byte[] var13 = null;
        be stackIn_9_0 = null;
        be stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        be stackOut_12_0 = null;
        be stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (this.field_l == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (-1 < (param0 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_d.length <= param0) {
                    break L1;
                  } else {
                    if (null == this.field_d[param0]) {
                      L2: {
                        this.field_l.field_h = 6 + 72 * param0;
                        var6_int = this.field_l.c((byte) -112);
                        var7 = this.field_l.c((byte) -108);
                        var13 = new byte[64];
                        this.field_l.a(64, 2, var13, 0);
                        if (param2 == 24108) {
                          break L2;
                        } else {
                          field_b = true;
                          break L2;
                        }
                      }
                      var9 = new be(param0, param4, param3, this.field_e, this.field_c, var6_int, var13, var7, param1);
                      this.field_d[param0] = var9;
                      stackOut_12_0 = (be) (var9);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackOut_8_0 = this.field_d[param0];
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    private dk(uh param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              this.field_j = param3;
              this.field_e = param0;
              this.field_g = param2;
              this.field_c = param1;
              if (this.field_e.b(6)) {
                break L1;
              } else {
                this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("dk.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final boolean b(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        oa var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var15 = null;
        byte stackIn_23_0 = 0;
        byte stackIn_24_0 = 0;
        byte stackOut_22_0 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (this.field_l != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_f) {
              if (!this.field_e.b(6)) {
                this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_f.field_m) {
            var10 = new oa(this.field_f.e(256));
            var10.field_h = 5;
            var3 = var10.d((byte) 30);
            var10.field_h = var10.field_h + var3 * 72;
            var13 = new byte[var10.field_g.length + -var10.field_h];
            var11 = var13;
            var4 = var11;
            var10.a(var13.length, 2, var13, 0);
            if (!param0) {
              L1: {
                L2: {
                  if (this.field_g == null) {
                    break L2;
                  } else {
                    if (null == this.field_j) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_j);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) != -66) {
                throw new RuntimeException();
              } else {
                var15 = n.a(var10.field_g, -5 + (-var13.length + var10.field_h), -5705, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    stackOut_22_0 = var15[var7];
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var8 == 0) {
                      if (stackIn_24_0 != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L3;
                      }
                    } else {
                      return stackIn_23_0 != 0;
                    }
                  } else {
                    this.field_l = var10;
                    this.field_d = new be[var3];
                    return true;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_a = null;
        int var1 = 45 % ((67 - param0) / 36);
    }

    final void a(boolean param0) {
        be discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        ak var4 = null;
        be stackIn_8_0 = null;
        be stackIn_17_0 = null;
        be stackIn_21_0 = null;
        be stackOut_7_0 = null;
        be stackOut_22_0 = null;
        be stackOut_16_0 = null;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            var4 = (ak) null;
            discarded$2 = this.a(-91, false, 38, (ak) null, (ak) null);
            break L0;
          }
        }
        if (this.field_d == null) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            L2: {
              L3: {
                L4: {
                  if (this.field_d.length <= var2) {
                    break L4;
                  } else {
                    stackOut_7_0 = this.field_d[var2];
                    stackIn_21_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var3 != 0) {
                      L5: while (true) {
                        ((be) (Object) stackIn_21_0).b((byte) 126);
                        L6: while (true) {
                          var2++;
                          if (var3 == 0) {
                            if (var2 >= this.field_d.length) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                if (null == this.field_d[var2]) {
                                  continue L6;
                                } else {
                                  stackOut_22_0 = this.field_d[var2];
                                  stackIn_21_0 = stackOut_22_0;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    } else {
                      L7: {
                        if (stackIn_8_0 != null) {
                          this.field_d[var2].d(23881);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2 = 0;
                L8: while (true) {
                  if (var2 >= this.field_d.length) {
                    break L2;
                  } else {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L9: {
                        if (null == this.field_d[var2]) {
                          break L9;
                        } else {
                          stackOut_16_0 = this.field_d[var2];
                          stackIn_17_0 = stackOut_16_0;
                          ((be) (Object) stackIn_17_0).b((byte) 126);
                          break L9;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            return;
          }
        }
    }

    static {
        field_b = false;
        field_i = 0;
        field_a = "Next";
    }
}
