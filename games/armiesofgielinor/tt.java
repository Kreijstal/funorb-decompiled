/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static int field_c;
    private at[] field_b;
    static String[] field_a;
    static wk[] field_d;

    final String[] a(int param0) {
        String[] array$4 = null;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var2 = 0;
        String[][] var3 = null;
        int var4_int = 0;
        String[] var4 = null;
        bb var5_ref_bb = null;
        int var5 = 0;
        int var6 = 0;
        u var7_ref_u = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        String[] stackIn_15_0 = null;
        String[] stackIn_16_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        String[] stackOut_14_0 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0;
        var3 = new String[this.field_b.length][];
        var4_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_b.length <= var4_int) {
                break L2;
              } else {
                array$4 = new String[this.field_b[var4_int].b(false)];
                var3[var4_int] = array$4;
                var5_ref_bb = new bb(this.field_b[var4_int]);
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var8 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  var7_ref_u = (u) ((Object) var5_ref_bb.c(50));
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var7_ref_u == null) {
                          break L5;
                        } else {
                          var2++;
                          incrementValue$5 = var6;
                          var6++;
                          var3[var4_int][incrementValue$5] = var7_ref_u.field_m.a(param0 + -124);
                          var7_ref_u = (u) ((Object) var5_ref_bb.b(param0 ^ 50));
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (var8 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var4_int++;
                      break L4;
                    }
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = var2 + this.field_b.length;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var4 = new String[stackIn_11_0];
          var5 = 0;
          var6 = 0;
          L6: while (true) {
            if (this.field_b.length > var6) {
              stackOut_14_0 = (String[]) (var4);
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var8 == 0) {
                incrementValue$6 = var5;
                var5++;
                stackIn_16_0[incrementValue$6] = "player [" + var6 + "]";
                var7 = 0;
                L7: while (true) {
                  L8: {
                    if (var3[var6].length <= var7) {
                      var6++;
                      break L8;
                    } else {
                      incrementValue$7 = var5;
                      var5++;
                      var4[incrementValue$7] = var3[var6][var7];
                      var7++;
                      if (var8 != 0) {
                        break L8;
                      } else {
                        continue L7;
                      }
                    }
                  }
                  continue L6;
                }
              } else {
                return stackIn_15_0;
              }
            } else {
              return var4;
            }
          }
        }
    }

    final void a(byte param0) {
        at[] var2 = null;
        int var3 = 0;
        at var4 = null;
        bb var5 = null;
        u var6 = null;
        int var7 = 0;
        at[] var8 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_8_0 = false;
        int stackOut_1_0 = 0;
        boolean stackOut_7_0 = false;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var8 = this.field_b;
        var2 = var8;
        var3 = 0;
        L0: while (true) {
          stackOut_1_0 = var8.length ^ -1;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            if (stackIn_2_0 >= (var3 ^ -1)) {
              if (param0 < 4) {
                field_c = -58;
                return;
              } else {
                return;
              }
            } else {
              var4 = var8[var3];
              var5 = new bb(var4);
              if (var7 == 0) {
                var6 = (u) ((Object) var5.c(50));
                L2: while (true) {
                  if (var6 == null) {
                    var3++;
                    continue L0;
                  } else {
                    stackOut_7_0 = var6.field_m instanceof up;
                    stackIn_2_0 = stackOut_7_0 ? 1 : 0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var7 != 0) {
                      continue L1;
                    } else {
                      L3: {
                        if (stackIn_8_0) {
                          var6.d(87);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6 = (u) ((Object) var5.b(50));
                      continue L2;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int[] param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > 9) {
                break L1;
              } else {
                if (param0 < -10) {
                  break L1;
                } else {
                  if (244 < param1) {
                    break L1;
                  } else {
                    if (244 >= param0) {
                      var4_int = 5;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (-1 < (var4_int ^ -1)) {
                              break L4;
                            } else {
                              var5 = nd.field_d[var4_int];
                              stackOut_10_0 = bc.field_j[var5].length;
                              stackIn_23_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var6 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_11_0 > param2[var5]) {
                                    break L5;
                                  } else {
                                    param2[var5] = 0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (param2[var5] > -1) {
                                    if (!bc.field_j[var5][param2[var5]].a(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                                      break L6;
                                    } else {
                                      stackOut_19_0 = var5;
                                      stackIn_20_0 = stackOut_19_0;
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    }
                                  } else {
                                    if (lt.field_h[var5].b(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                                      stackOut_16_0 = var5;
                                      stackIn_17_0 = stackOut_16_0;
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var4_int--;
                                if (var6 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackOut_22_0 = param3;
                          stackIn_23_0 = stackOut_22_0 ? 1 : 0;
                          break L3;
                        }
                        L7: {
                          if (stackIn_23_0 == 0) {
                            break L7;
                          } else {
                            field_d = (wk[]) null;
                            break L7;
                          }
                        }
                        stackOut_25_0 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -2;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("tt.F(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        bb var3 = null;
        u var4 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = new bb(this.field_b[param1]);
        if (param0 == 244) {
          var4 = (u) ((Object) var3.c(50));
          L0: while (true) {
            if (var4 != null) {
              if (var5 == 0) {
                L1: {
                  if (var4.field_m instanceof up) {
                    var4.d(-115);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4 = (u) ((Object) var3.b(50));
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            return;
        }
        tt.a(true);
    }

    final boolean a(byte param0, int param1) {
        bb var3 = null;
        u var4 = null;
        int var5 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_5_0 = false;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = new bb(this.field_b[param1]);
        if (param0 <= -49) {
          var4 = (u) ((Object) var3.c(50));
          L0: while (true) {
            if (var4 != null) {
              stackOut_5_0 = var4.field_m.c(-128);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 == 0) {
                if (!stackIn_7_0) {
                  var4 = (u) ((Object) var3.b(50));
                  continue L0;
                } else {
                  return true;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1) {
        boolean discarded$2 = false;
        bb var3 = null;
        u var4 = null;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = new bb(this.field_b[param0]);
          var4 = (u) ((Object) var3.c(50));
          if (param1 <= -46) {
            break L0;
          } else {
            discarded$2 = this.a(85, 104);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            stackOut_4_0 = var4.field_m.b(0);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              if (stackIn_6_0) {
                return true;
              } else {
                var4 = (u) ((Object) var3.b(50));
                continue L1;
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return false;
          }
        }
    }

    tt(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_b = new at[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < this.field_b.length) {
            this.field_b[var2] = new at();
            var2++;
            if (var3 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(lv param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_b[param2].a(750, new u(param0));
              if (param1 >= 81) {
                break L1;
              } else {
                field_a = (String[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("tt.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
