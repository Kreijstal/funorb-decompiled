/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static String field_b;
    static int field_a;
    static String field_c;
    private boolean field_e;
    private String field_d;

    final static void a(int param0, int param1, tg[] param2, byte param3, int param4, int param5) {
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
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
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
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var22 = Bounce.field_N;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param2[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param2[3].field_t;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null != param2[5]) {
                        stackOut_12_0 = param2[5].field_t;
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
                      if (param2[1] == null) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = param2[1].field_o;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param2[7] != null) {
                        stackOut_18_0 = param2[7].field_o;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    var9 = stackIn_19_0;
                    if (param3 < -67) {
                      L6: {
                        var10 = param4 + param5;
                        var11 = param1 - -param0;
                        var12 = var6_int + param5;
                        var13 = var10 + -var7;
                        var14 = param1 - -var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var17 >= var16) {
                          break L6;
                        } else {
                          var17 = param4 * var6_int / (var6_int + var7) + param5;
                          var16 = param4 * var6_int / (var6_int + var7) + param5;
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        if (var18 <= var19) {
                          break L7;
                        } else {
                          var19 = param1 - -(var8 * param0 / (var8 - -var9));
                          var18 = param1 - -(var8 * param0 / (var8 - -var9));
                          break L7;
                        }
                      }
                      L8: {
                        na.b(mg.field_j);
                        if (param2[0] == null) {
                          break L8;
                        } else {
                          na.c(param5, param1, var16, var18);
                          param2[0].a(param5, param1);
                          na.a(mg.field_j);
                          break L8;
                        }
                      }
                      L9: {
                        if (null == param2[2]) {
                          break L9;
                        } else {
                          na.c(var17, param1, var10, var18);
                          param2[2].a(var13, param1);
                          na.a(mg.field_j);
                          break L9;
                        }
                      }
                      L10: {
                        if (param2[6] != null) {
                          na.c(param5, var19, var16, var11);
                          param2[6].a(param5, var15);
                          na.a(mg.field_j);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null == param2[8]) {
                          break L11;
                        } else {
                          na.c(var17, var19, var10, var11);
                          param2[8].a(var13, var15);
                          na.a(mg.field_j);
                          break L11;
                        }
                      }
                      L12: {
                        if (param2[1] == null) {
                          break L12;
                        } else {
                          if (0 != param2[1].field_t) {
                            na.c(var16, param1, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                na.a(mg.field_j);
                                break L12;
                              } else {
                                param2[1].a(var20, param1);
                                var20 = var20 + param2[1].field_t;
                                continue L13;
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (param2[7] == null) {
                          break L14;
                        } else {
                          if (param2[7].field_t == 0) {
                            break L14;
                          } else {
                            na.c(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                na.a(mg.field_j);
                                break L14;
                              } else {
                                param2[7].a(var20, var15);
                                var20 = var20 + param2[7].field_t;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null == param2[3]) {
                          break L16;
                        } else {
                          if (param2[3].field_o == 0) {
                            break L16;
                          } else {
                            na.c(param5, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var20 >= var15) {
                                na.a(mg.field_j);
                                break L16;
                              } else {
                                param2[3].a(param5, var20);
                                var20 = var20 + param2[3].field_o;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (param2[5] == null) {
                          break L18;
                        } else {
                          if (param2[5].field_o != 0) {
                            na.c(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var20 >= var15) {
                                na.a(mg.field_j);
                                break L18;
                              } else {
                                param2[5].a(var13, var20);
                                var20 = var20 + param2[5].field_o;
                                continue L19;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if (null == param2[4]) {
                          break L20;
                        } else {
                          if (-1 == (param2[4].field_t ^ -1)) {
                            break L20;
                          } else {
                            if (param2[4].field_o == 0) {
                              break L20;
                            } else {
                              na.c(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var15 <= var20) {
                                  na.a(mg.field_j);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var13 <= var21) {
                                      var20 = var20 + param2[4].field_o;
                                      continue L21;
                                    } else {
                                      param2[4].a(var21, var20);
                                      var21 = var21 + param2[4].field_t;
                                      continue L22;
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
          L23: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var6);
            stackOut_71_1 = new StringBuilder().append("ve.C(").append(param0).append(',').append(param1).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L23;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L23;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final boolean a(byte param0) {
        if (param0 != 56) {
            field_b = (String) null;
        }
        return this.field_e;
    }

    public static void d(byte param0) {
        field_b = null;
        if (param0 != 85) {
            return;
        }
        field_c = null;
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = nj.field_o;
        synchronized (var1) {
          L0: {
            L1: {
              n.field_m = c.field_c;
              wh.field_d = wh.field_d + 1;
              uc.field_C = th.field_a;
              ll.field_y = q.field_H;
              mi.field_j = cl.field_o;
              cl.field_o = false;
              vh.field_e = ta.field_a;
              og.field_a = hb.field_B;
              rk.field_a = nc.field_b;
              if (param0 == -91) {
                break L1;
              } else {
                ve.a(108);
                break L1;
              }
            }
            ta.field_a = 0;
            break L0;
          }
        }
    }

    final static void a(int param0) {
        n var1 = null;
        var1 = (n) ((Object) qb.field_g.e((byte) 60));
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          L0: {
            na.a(var1.field_g, var1.field_k, var1.field_h);
            na.e(var1.field_l, var1.field_j, var1.field_i, var1.field_n);
            if (param0 <= -118) {
              break L0;
            } else {
              ve.b((byte) -90);
              break L0;
            }
          }
          var1.field_g = null;
          k.field_B.a(1, var1);
          return;
        }
    }

    final String c(byte param0) {
        if (param0 >= -49) {
            return (String) null;
        }
        return this.field_d;
    }

    ve(String param0) {
        this(param0, false);
    }

    ve(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.field_d = param0;
              if (this.field_d != null) {
                break L1;
              } else {
                this.field_d = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((ve) (this)).field_e = stackIn_6_1 != 0;
              if (-1 != (this.field_d.length() ^ -1)) {
                break L3;
              } else {
                this.field_e = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ve.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
