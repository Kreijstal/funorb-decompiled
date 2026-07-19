/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lca extends bca {
    static int field_s;
    static String field_r;
    private nq field_q;

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (0 > param0) {
                break L1;
              } else {
                if (param4 >= jb.field_n) {
                  break L1;
                } else {
                  L2: {
                    if (param1 >= 0) {
                      break L2;
                    } else {
                      if ((param7 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (-1 >= (param8 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param1 < jb.field_o) {
                      break L3;
                    } else {
                      if (jb.field_o > param7) {
                        break L3;
                      } else {
                        if (jb.field_o > param8) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param2 < -72) {
                      break L4;
                    } else {
                      field_r = (String) null;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = -param4 + param0;
                    if (param4 == param5) {
                      L6: {
                        if (param4 == param0) {
                          var11 = 0;
                          var10 = param7 << 2086996656;
                          var9_int = param1 << 866548304;
                          var12 = 0;
                          break L6;
                        } else {
                          var15 = -param5 + param0;
                          if (param1 < param7) {
                            var9_int = param1 << -203202480;
                            var10 = param7 << 1234972080;
                            var11 = (param8 - param1 << -1352277072) / var14;
                            var12 = (-param7 + param8 << -952907888) / var15;
                            break L6;
                          } else {
                            var12 = (-param1 + param8 << 518889008) / var14;
                            var11 = (-param7 + param8 << 1168651216) / var15;
                            var9_int = param7 << 558719408;
                            var10 = param1 << 545046320;
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      if (param4 >= 0) {
                        break L5;
                      } else {
                        param4 = Math.min(-param4, -param4 + param5);
                        var9_int = var9_int + param4 * var11;
                        var10 = var10 + param4 * var12;
                        param4 = 0;
                        break L5;
                      }
                    } else {
                      L7: {
                        var10 = param1 << 157472304;
                        var9_int = param1 << 157472304;
                        var15 = param5 + -param4;
                        var11 = (param7 - param1 << 353575440) / var15;
                        var12 = (param8 - param1 << -1888234288) / var14;
                        if (var11 >= var12) {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param4 >= 0) {
                            break L9;
                          } else {
                            if (0 > param5) {
                              param4 = param5 + -param4;
                              var9_int = var9_int + param4 * var11;
                              var10 = var10 + var12 * param4;
                              param4 = param5;
                              break L8;
                            } else {
                              param4 = -param4;
                              var9_int = var9_int + param4 * var11;
                              var10 = var10 + var12 * param4;
                              param4 = 0;
                              break L9;
                            }
                          }
                        }
                        var16 = jb.field_a[param4];
                        L10: while (true) {
                          if (param5 <= param4) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> -365039184;
                              if (jb.field_o <= var17) {
                                break L11;
                              } else {
                                var18 = (var10 >> 1837019184) - (var9_int >> -1669086896);
                                if (0 != var18) {
                                  L12: {
                                    if (var17 + var18 >= jb.field_o) {
                                      var18 = -var17 + (jb.field_o - 1);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if ((var17 ^ -1) <= -1) {
                                    ek.a(var18, param3, param6, (byte) 109, var17 + var16);
                                    break L11;
                                  } else {
                                    ek.a(var17 + var18, param3, param6, (byte) 127, var16);
                                    break L11;
                                  }
                                } else {
                                  if ((var17 ^ -1) > -1) {
                                    break L11;
                                  } else {
                                    if (jb.field_o <= var17) {
                                      break L11;
                                    } else {
                                      ek.a(var18, param3, param6, (byte) -127, var17 - -var16);
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            param4++;
                            if (param4 < jb.field_n) {
                              var16 = var16 + dg.field_i;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L10;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = -param5 + param0;
                      if (0 == var16) {
                        var11 = 0;
                        var12 = 0;
                        break L5;
                      } else {
                        L13: {
                          if (var13 != 0) {
                            var10 = param7 << -1203704560;
                            break L13;
                          } else {
                            var9_int = param7 << 1161530800;
                            break L13;
                          }
                        }
                        var17 = param8 << 2124055120;
                        var11 = (var17 + -var9_int) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if ((param4 ^ -1) > -1) {
                      param4 = -param4;
                      var10 = var10 + param4 * var12;
                      var9_int = var9_int + param4 * var11;
                      param4 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var15 = jb.field_a[param4];
                  L15: while (true) {
                    if (param0 <= param4) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> -1109928400;
                        if (jb.field_o <= var16) {
                          break L16;
                        } else {
                          var17 = -(var9_int >> -1971263376) + (var10 >> 1037516080);
                          if (var17 != 0) {
                            L17: {
                              if (jb.field_o > var16 + var17) {
                                break L17;
                              } else {
                                var17 = -1 + (-var16 + jb.field_o);
                                break L17;
                              }
                            }
                            if (var16 < 0) {
                              ek.a(var16 + var17, param3, param6, (byte) -128, var15);
                              break L16;
                            } else {
                              ek.a(var17, param3, param6, (byte) 10, var16 + var15);
                              break L16;
                            }
                          } else {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (jb.field_o > var16) {
                                ek.a(var17, param3, param6, (byte) -127, var15 + var16);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      param4++;
                      if (param4 >= jb.field_n) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var10 = var10 + var12;
                        var15 = var15 + dg.field_i;
                        var9_int = var9_int + var11;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var9);
            stackOut_75_1 = new StringBuilder().append("lca.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    final at a(int param0, gj param1) {
        at discarded$2 = null;
        RuntimeException var3 = null;
        gj var4 = null;
        bna stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bna stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var4 = (gj) null;
                discarded$2 = this.a(-68, (gj) null);
                break L1;
              }
            }
            stackOut_2_0 = new bna(param1, (lca) (this));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("lca.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    final void a(op param0, int param1) {
        try {
            this.a(param0, (byte) -2);
            int var3_int = 78 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lca.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        try {
            if (param0 >= -12) {
                lu var4 = (lu) null;
                this.a((byte) 127, (lu) null);
            }
            super.a((byte) -16, param1);
            er.a(this.field_q, 107, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lca.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lca(int param0, nq param1, nq param2) {
        super(param0, param1);
        try {
            this.field_q = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 > -84) {
            field_s = 4;
        }
        field_r = null;
    }

    lca(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 111);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_q = qi.a(param0, (byte) 41);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean c(boolean param0) {
        kha var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                lca.d((byte) 75);
                break L1;
              }
            }
            var1 = (kha) ((Object) iea.field_d.b((byte) 90));
            L2: while (true) {
              if (var1 == null) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-256 <= (mg.field_m.field_f[var1.field_h] + var1.field_g ^ -1)) {
                  var1 = (kha) ((Object) iea.field_d.c(0));
                  continue L2;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "lca.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_s = 0;
        field_r = "<%0> has entered a game.";
    }
}
