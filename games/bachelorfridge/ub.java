/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends at {
    static volatile boolean field_l;
    static sna field_k;
    gj field_o;
    static int field_j;
    private lc field_n;
    private int field_m;

    public static void d(int param0) {
        if (param0 != 1) {
            return;
        }
        field_k = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nc var4 = null;
        mha var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (nc) ((Object) tb.field_c.b((byte) 90));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == 1) {
                  var5 = (mha) ((Object) wba.field_g.b((byte) 90));
                  L2: while (true) {
                    if (var5 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      sja.a(param0, var5, true);
                      var5 = (mha) ((Object) wba.field_g.c(param1 + -1));
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                qn.a(param0, var4, -8692);
                var4 = (nc) ((Object) tb.field_c.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "ub.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, uha param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        gna[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        gna var13 = null;
        int var14 = 0;
        int var15 = 0;
        gna[] var16 = null;
        int[] var17 = null;
        gna[] var18 = null;
        int[] var19 = null;
        gna[][] stackIn_34_0 = null;
        gna[][] stackIn_35_0 = null;
        gna[][] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gna[][] stackOut_33_0 = null;
        gna[][] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        gna[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param7 > param4) {
                L2: {
                  stackOut_33_0 = gd.field_n;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if ((param4 ^ -1) == 0) {
                    stackOut_35_0 = (gna[][]) ((Object) stackIn_35_0);
                    stackOut_35_1 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L2;
                  } else {
                    stackOut_34_0 = (gna[][]) ((Object) stackIn_34_0);
                    stackOut_34_1 = 4 + param4;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_36_0[stackIn_36_1];
                  var18 = var16;
                  var8_array = var18;
                  var9 = 1;
                  if (param1) {
                    if (0 == (param4 ^ -1)) {
                      var10 = 0;
                      L4: while (true) {
                        if (qha.field_c.length <= var10) {
                          break L3;
                        } else {
                          if ((fia.field_r[var10 / 8] & 1 << (7 & var10)) != 0) {
                            var9 = 0;
                            break L3;
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L5: while (true) {
                        L6: {
                          if (var10 >= var16.length - 1) {
                            break L6;
                          } else {
                            if (0 == (sca.field_c[(var10 + param0) / 8] & 1 << (7 & param0 + var10))) {
                              var10++;
                              continue L5;
                            } else {
                              var9 = 0;
                              break L6;
                            }
                          }
                        }
                        param0 = param0 + (mja.field_s[param4] & 255);
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var10 = 0;
                var11 = 0;
                L7: while (true) {
                  L8: {
                    stackOut_52_0 = var11;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (param4 == -1) {
                      stackOut_54_0 = stackIn_54_0;
                      stackOut_54_1 = qha.field_c.length;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      break L8;
                    } else {
                      stackOut_53_0 = stackIn_53_0;
                      stackOut_53_1 = var18.length - 1;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_55_1 = stackOut_53_1;
                      break L8;
                    }
                  }
                  if (stackIn_55_0 >= stackIn_55_1) {
                    if (var10 == 0) {
                      var11 = 0;
                      L9: while (true) {
                        if (var18.length - 1 <= var11) {
                          break L1;
                        } else {
                          L10: {
                            if (0 == (param4 ^ -1)) {
                              param6 = var11;
                              break L10;
                            } else {
                              bja.field_o[param4] = (byte)var11;
                              break L10;
                            }
                          }
                          ub.a(param0, param1, -93, param3, param4 - -1, param5, param6, param7);
                          if (fla.field_q) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var11++;
                            continue L9;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L11: {
                      if (-1 != param4) {
                        bja.field_o[param4] = (byte)var11;
                        break L11;
                      } else {
                        param6 = var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (param4 != -1) {
                          break L13;
                        } else {
                          if (-2 == (qha.field_c.length ^ -1)) {
                            var12 = 1;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = var8_array[var11 + 1];
                      if (param1) {
                        L14: {
                          if (!var13.field_t) {
                            if (var9 != 0) {
                              if (var13.field_u) {
                                stackOut_77_0 = 1;
                                stackIn_79_0 = stackOut_77_0;
                                break L14;
                              } else {
                                stackOut_76_0 = 0;
                                stackIn_79_0 = stackOut_76_0;
                                break L14;
                              }
                            } else {
                              stackOut_74_0 = 0;
                              stackIn_79_0 = stackOut_74_0;
                              break L14;
                            }
                          } else {
                            stackOut_72_0 = 1;
                            stackIn_79_0 = stackOut_72_0;
                            break L14;
                          }
                        }
                        var12 = stackIn_79_0;
                        break L12;
                      } else {
                        L15: {
                          if (-1 != param4) {
                            if (var11 != (255 & pw.field_w.field_Eb[param4])) {
                              stackOut_69_0 = 0;
                              stackIn_70_0 = stackOut_69_0;
                              break L15;
                            } else {
                              stackOut_68_0 = 1;
                              stackIn_70_0 = stackOut_68_0;
                              break L15;
                            }
                          } else {
                            if (pw.field_w.field_Pb != qha.field_c[var11]) {
                              stackOut_66_0 = 0;
                              stackIn_70_0 = stackOut_66_0;
                              break L15;
                            } else {
                              stackOut_65_0 = 1;
                              stackIn_70_0 = stackOut_65_0;
                              break L15;
                            }
                          }
                        }
                        var12 = stackIn_70_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 != 0) {
                        var10 = 1;
                        ub.a(param0, param1, -73, param3, param4 - -1, param5, param6, param7);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (fla.field_q) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L17: while (true) {
                  if (pha.field_h.length <= var9) {
                    if (var8_int != 0) {
                      fla.field_q = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var19 = pha.field_h[var9];
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      L19: {
                        if (var12 >= var19.length) {
                          L20: {
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (ld.field_q == param4) {
                                break L20;
                              } else {
                                var9++;
                                continue L17;
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            if (var19.length <= var12) {
                              var8_int = 0;
                              break L19;
                            } else {
                              L22: {
                                var13_int = var19[var12];
                                if (var13_int != -1) {
                                  if (var13_int >= param4) {
                                    break L22;
                                  } else {
                                    ala.field_b[var13_int] = true;
                                    break L22;
                                  }
                                } else {
                                  uu.field_yb = true;
                                  break L22;
                                }
                              }
                              var12 += 2;
                              continue L21;
                            }
                          }
                        } else {
                          L23: {
                            var13_int = var19[var12];
                            var14 = var10_ref_int__[var12 + 1];
                            if ((var13_int ^ -1) != 0) {
                              L24: {
                                if (param4 != var13_int) {
                                  break L24;
                                } else {
                                  if (var14 != param3) {
                                    break L24;
                                  } else {
                                    var11 = 1;
                                    break L23;
                                  }
                                }
                              }
                              if (param4 > var13_int) {
                                if ((255 & bja.field_o[var13_int]) == var14) {
                                  break L23;
                                } else {
                                  break L19;
                                }
                              } else {
                                var9++;
                                continue L17;
                              }
                            } else {
                              if (qha.field_c[param6] == var14) {
                                break L23;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var12 += 2;
                          continue L18;
                        }
                      }
                      var9++;
                      continue L17;
                    }
                  }
                }
              }
            }
            L25: {
              if (param2 < -64) {
                break L25;
              } else {
                ub.a(25, 91);
                break L25;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) (var8);
            stackOut_102_1 = new StringBuilder().append("ub.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param5 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L26;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L26;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param6 + ',' + param7 + ')');
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

    final boolean c(byte param0) {
        int var4 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_m - 1;
        this.field_m = this.field_m - 1;
        if ((fieldTemp$0 ^ -1) < -1) {
            return false;
        }
        this.field_o.field_h.a(23189);
        jm var5 = (jm) ((Object) this.field_n.field_k.b((byte) 90));
        while (var5 != null) {
            var5.a((ub) (this), -107);
            var5 = (jm) ((Object) this.field_n.field_k.c(0));
        }
        int var3 = 81 % ((71 - param0) / 47);
        return true;
    }

    ub(gj param0, lc param1) {
        try {
            this.field_m = 25;
            this.field_o = param0;
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = true;
    }
}
