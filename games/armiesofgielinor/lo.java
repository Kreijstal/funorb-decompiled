/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends tc {
    private int field_t;
    private byte[] field_s;
    int field_p;
    private ne[] field_r;
    int field_l;
    static me field_q;
    int field_n;
    int field_k;
    static um field_u;
    static String field_m;
    static String field_o;

    final static void a(mo param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mo var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        mo stackIn_9_1 = null;
        int stackIn_18_0 = 0;
        mo stackIn_18_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        mo stackOut_8_1 = null;
        int stackOut_17_0 = 0;
        mo stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  L3: {
                    if ((param0.field_a ^ -1) != param1) {
                      break L3;
                    } else {
                      if (0 == param0.field_e) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 0;
                  L4: while (true) {
                    if (lk.field_h <= var2_int) {
                      break L2;
                    } else {
                      var3 = an.field_F[var2_int];
                      stackOut_8_0 = 2;
                      stackOut_8_1 = (mo) (var3);
                      stackIn_18_0 = stackOut_8_0;
                      stackIn_18_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (stackIn_9_0 != stackIn_9_1.field_b) {
                            break L5;
                          } else {
                            if (param0.field_a != var3.field_a) {
                              break L5;
                            } else {
                              if (var3.field_e == param0.field_e) {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (null == param0.field_d) {
                    break L6;
                  } else {
                    ma.field_ab = param0.field_n;
                    rv.field_b = param0.field_d;
                    ge.field_h = param0.field_m;
                    no.field_S = param0.field_b;
                    break L6;
                  }
                }
                stackOut_17_0 = 3208;
                stackOut_17_1 = (mo) (param0);
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L1;
              }
              bc.a(stackIn_18_0, stackIn_18_1);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("lo.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
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

    private final void a(ne[] param0, vh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 >= 86) {
              if (param0 != null) {
                var4_int = param1.k(0);
                var5 = 0;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var4_int <= var6) {
                      break L2;
                    } else {
                      L3: {
                        var7 = param1.k(0);
                        var8 = param1.k(0);
                        if (-1 < (var7 ^ -1)) {
                          break L3;
                        } else {
                          if (this.field_l <= var7) {
                            break L3;
                          } else {
                            if (var8 < 0) {
                              break L3;
                            } else {
                              L4: {
                                if (var8 < this.field_n) {
                                  break L4;
                                } else {
                                  if (var11 == 0) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var9 = new jd(var7, var8, 0);
                              var10 = var7 + var8 * this.field_l;
                              if (0 > var10) {
                                break L3;
                              } else {
                                if (var10 > param0.length) {
                                  break L3;
                                } else {
                                  param0[var10].field_c = var9;
                                  param0[var10].field_c.field_O = var5;
                                  var5++;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      var6++;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("lo.G(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
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

    final int[][] e(int param0) {
        int[][] var2 = null;
        vh var3_ref_vh = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = new int[this.field_n][this.field_l];
        var8 = var9;
        var7 = var8;
        var2 = var7;
        if (this.field_r == null) {
          var9 = var8;
          var3_ref_vh = this.a((byte) 126);
          var4 = 0;
          L0: while (true) {
            L1: {
              if (this.field_n <= var4) {
                break L1;
              } else {
                stackOut_22_0 = 0;
                stackIn_54_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (var6 != 0) {
                  if (stackIn_54_0 != 28554) {
                    return (int[][]) null;
                  } else {
                    return var2;
                  }
                } else {
                  var5 = stackIn_23_0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (this.field_l <= var5) {
                          break L4;
                        } else {
                          var9[var4][var5] = var3_ref_vh.k(0);
                          var5++;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var4++;
                      break L3;
                    }
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (var6 == 0) {
              if (param0 != 28554) {
                return (int[][]) null;
              } else {
                return var2;
              }
            } else {
              var3 = 0;
              L5: while (true) {
                if (this.field_n > var3) {
                  L6: {
                    stackOut_37_0 = 0;
                    stackIn_46_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var6 != 0) {
                      break L6;
                    } else {
                      var4 = stackIn_38_0;
                      L7: while (true) {
                        L8: {
                          L9: {
                            if (var4 >= this.field_l) {
                              break L9;
                            } else {
                              var9[var3][var4] = this.field_r[var4 - -(this.field_l * var3)].field_h;
                              var4++;
                              if (var6 != 0) {
                                break L8;
                              } else {
                                if (var6 == 0) {
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          var3++;
                          break L8;
                        }
                        if (var6 == 0) {
                          continue L5;
                        } else {
                          stackOut_45_0 = param0;
                          stackIn_46_0 = stackOut_45_0;
                          break L6;
                        }
                      }
                    }
                  }
                  if (stackIn_46_0 != 28554) {
                    return (int[][]) null;
                  } else {
                    return var2;
                  }
                } else {
                  if (param0 != 28554) {
                    return (int[][]) null;
                  } else {
                    return var2;
                  }
                }
              }
            }
          }
        } else {
          var3 = 0;
          L10: while (true) {
            if (this.field_n > var3) {
              L11: {
                var9 = var8;
                stackOut_7_0 = 0;
                stackIn_16_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var6 != 0) {
                  break L11;
                } else {
                  var4 = stackIn_8_0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (var4 >= this.field_l) {
                          break L14;
                        } else {
                          var9[var3][var4] = this.field_r[var4 - -(this.field_l * var3)].field_h;
                          var4++;
                          if (var6 != 0) {
                            break L13;
                          } else {
                            if (var6 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var3++;
                      break L13;
                    }
                    if (var6 == 0) {
                      continue L10;
                    } else {
                      stackOut_15_0 = param0;
                      stackIn_16_0 = stackOut_15_0;
                      break L11;
                    }
                  }
                }
              }
              if (stackIn_16_0 != 28554) {
                return (int[][]) null;
              } else {
                return var2;
              }
            } else {
              if (param0 != 28554) {
                return (int[][]) null;
              } else {
                return var2;
              }
            }
          }
        }
    }

    private final ne[] a(int[] param0, int param1, ha param2) {
        int[][] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ne[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        ne[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        ne[] stackOut_17_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.field_n * this.field_l;
              if (param1 == 22654) {
                break L1;
              } else {
                discarded$2 = this.e(117);
                break L1;
              }
            }
            var5 = new ne[var4_int];
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              stackOut_4_0 = this.field_n;
              stackOut_4_1 = var7;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                if (stackIn_5_0 <= stackIn_5_1) {
                  stackOut_17_0 = (ne[]) (var5);
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  var8 = 0;
                  L4: while (true) {
                    if (var8 >= this.field_l) {
                      var7++;
                      continue L2;
                    } else {
                      stackOut_8_0 = var5.length ^ -1;
                      stackOut_8_1 = var6 ^ -1;
                      stackIn_5_0 = stackOut_8_0;
                      stackIn_5_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var9 != 0) {
                        continue L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_9_0 <= stackIn_9_1) {
                              break L6;
                            } else {
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            var5[var6] = new ne(param0[var6], param2);
                            if (-12 != (var5[var6].field_h ^ -1)) {
                              break L7;
                            } else {
                              var5[var6].field_h = 0;
                              break L7;
                            }
                          }
                          var6++;
                          break L5;
                        }
                        var8++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("lo.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    private final vh a(byte param0) {
        int var3 = 0;
        ne[] var4 = null;
        int var5 = 0;
        ne var6 = null;
        int var7 = 0;
        bv var8 = null;
        sc var9 = null;
        ne[] var10 = null;
        ne var11 = null;
        sc var12 = null;
        ne[] var13 = null;
        ne var14 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-5 >= (this.field_s.length ^ -1)) {
          var8 = new bv(this.field_s);
          this.field_t = bs.a(var8, 3);
          if (param0 == 126) {
            if ((this.field_t ^ -1) == -3) {
              var12 = po.a(var8, param0 + -24046);
              this.field_l = var12.field_k;
              this.field_p = var12.field_a;
              this.field_n = var12.field_e;
              this.field_r = var12.field_c;
              this.field_k = var12.field_j;
              var13 = this.field_r;
              var5 = 0;
              L0: while (true) {
                if (var5 < var13.length) {
                  var14 = var13[var5];
                  var14.field_m = var14.e(10);
                  var5++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            } else {
              this.field_l = var8.k(0);
              this.field_n = var8.k(0);
              if (-2 < (this.field_t ^ -1)) {
                this.field_p = 0;
                if ((this.field_t ^ -1) > -1) {
                  var3 = this.field_l * this.field_n;
                  var8.field_q = var8.field_q + var3;
                  this.field_k = var8.k(0);
                  var8.field_q = var8.field_q - (var3 + 1);
                  if (var7 != 0) {
                    this.field_k = var8.k(0);
                    return (vh) ((Object) var8);
                  } else {
                    return (vh) ((Object) var8);
                  }
                } else {
                  this.field_k = var8.k(0);
                  return (vh) ((Object) var8);
                }
              } else {
                this.field_p = var8.k(0);
                if (var7 == 0) {
                  if ((this.field_t ^ -1) > -1) {
                    var3 = this.field_l * this.field_n;
                    var8.field_q = var8.field_q + var3;
                    this.field_k = var8.k(0);
                    var8.field_q = var8.field_q - (var3 + 1);
                    if (var7 != 0) {
                      this.field_k = var8.k(0);
                      return (vh) ((Object) var8);
                    } else {
                      return (vh) ((Object) var8);
                    }
                  } else {
                    this.field_k = var8.k(0);
                    return (vh) ((Object) var8);
                  }
                } else {
                  this.field_p = 0;
                  if ((this.field_t ^ -1) > -1) {
                    var3 = this.field_l * this.field_n;
                    var8.field_q = var8.field_q + var3;
                    this.field_k = var8.k(0);
                    var8.field_q = var8.field_q - (var3 + 1);
                    if (var7 != 0) {
                      this.field_k = var8.k(0);
                      return (vh) ((Object) var8);
                    } else {
                      return (vh) ((Object) var8);
                    }
                  } else {
                    this.field_k = var8.k(0);
                    return (vh) ((Object) var8);
                  }
                }
              }
            }
          } else {
            this.field_l = 72;
            if ((this.field_t ^ -1) == -3) {
              var9 = po.a(var8, param0 + -24046);
              this.field_l = var9.field_k;
              this.field_p = var9.field_a;
              this.field_n = var9.field_e;
              this.field_r = var9.field_c;
              this.field_k = var9.field_j;
              var10 = this.field_r;
              var4 = var10;
              var5 = 0;
              L1: while (true) {
                if (var5 < var10.length) {
                  var11 = var10[var5];
                  var6 = var11;
                  var14 = var6;
                  var6 = var11;
                  var11.field_m = var11.e(10);
                  var5++;
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L2: {
                this.field_l = var8.k(0);
                this.field_n = var8.k(0);
                if (-2 < (this.field_t ^ -1)) {
                  this.field_p = 0;
                  break L2;
                } else {
                  this.field_p = var8.k(0);
                  if (var7 != 0) {
                    this.field_p = 0;
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if ((this.field_t ^ -1) <= -1) {
                          break L4;
                        } else {
                          var3 = this.field_l * this.field_n;
                          var8.field_q = var8.field_q + var3;
                          this.field_k = var8.k(0);
                          var8.field_q = var8.field_q - (var3 + 1);
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_k = var8.k(0);
                      break L3;
                    }
                    return (vh) ((Object) var8);
                  }
                }
              }
              if ((this.field_t ^ -1) > -1) {
                var3 = this.field_l * this.field_n;
                var8.field_q = var8.field_q + var3;
                this.field_k = var8.k(0);
                var8.field_q = var8.field_q - (var3 + 1);
                if (var7 == 0) {
                  return (vh) ((Object) var8);
                } else {
                  this.field_k = var8.k(0);
                  return (vh) ((Object) var8);
                }
              } else {
                this.field_k = var8.k(0);
                return (vh) ((Object) var8);
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(va param0, int param1) {
        RuntimeException runtimeException = null;
        va var3 = null;
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
              param0.field_y = new int[]{-1};
              param0.field_v = new char[]{(char)63};
              if (param1 == 19003) {
                break L1;
              } else {
                var3 = (va) null;
                lo.a((va) null, 21);
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
            stackOut_3_1 = new StringBuilder().append("lo.A(");
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        ru[] discarded$2 = null;
        kl var2 = null;
        field_o = null;
        if (param0 != 0) {
          var2 = (kl) null;
          discarded$2 = lo.a((String) null, 125, (String) null, (kl) null);
          field_u = null;
          field_q = null;
          field_m = null;
          return;
        } else {
          field_u = null;
          field_q = null;
          field_m = null;
          return;
        }
    }

    final static ru[] a(String param0, int param1, String param2, kl param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ru[] stackIn_2_0 = null;
        ru[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ru[] stackOut_3_0 = null;
        ru[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1 == -28106) {
              var4_int = param3.a(param2, 110);
              var5 = param3.a((byte) -74, var4_int, param0);
              stackOut_3_0 = ak.a(var5, param3, 0, var4_int);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ru[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("lo.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final ne[] a(int param0, ha param1) {
        vh discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        ne[] var3_array = null;
        vh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ne var5_ref_ne = null;
        int[] var6 = null;
        int var7_int = 0;
        ne[] var7 = null;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        ne var13 = null;
        jd var14 = null;
        int var15 = 0;
        ne[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        ne[] stackIn_5_0 = null;
        ne[] stackIn_11_0 = null;
        ne[] stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ne[] stackOut_35_0 = null;
        ne[] stackOut_4_0 = null;
        ne[] stackOut_10_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null == this.field_r) {
              var3_int = 116 % ((param0 - -31) / 60);
              var4 = this.a((byte) 126);
              var5 = this.field_n * this.field_l;
              var18 = new int[var5];
              var17 = var18;
              var6 = var17;
              if (2 + var5 > this.field_s.length) {
                throw new RuntimeException("Problem loading file");
              } else {
                var7_int = 0;
                L1: while (true) {
                  L2: {
                    if (var5 <= var7_int) {
                      break L2;
                    } else {
                      var6[var7_int] = var4.k(0);
                      var7_int++;
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      var7 = this.a(var18, 22654, param1);
                      if (0 <= this.field_t) {
                        break L4;
                      } else {
                        this.a(var7, var4, 105);
                        if (var15 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var8 = var4.k(0);
                    var9 = new tf(0, 0);
                    var10 = 0;
                    L5: while (true) {
                      if (var8 <= var10) {
                        break L3;
                      } else {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                var11 = var4.k(0);
                                var12 = var11;
                                if (var12 == 0) {
                                  break L9;
                                } else {
                                  if (1 != var12) {
                                    break L7;
                                  } else {
                                    if (var15 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var9.field_n = var4.k(0);
                              var9.field_o = var4.k(0);
                              var12 = var4.k(0);
                              var13_int = var4.k(0);
                              var14 = new jd(var9.field_n, var9.field_o, var12);
                              var14.field_O = var13_int;
                              var7[var9.field_o * this.field_l + var9.field_n].field_c = var14;
                              if (var15 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                            L10: {
                              L11: {
                                var9.field_n = var4.k(0);
                                var9.field_o = var4.k(0);
                                var12 = var4.k(0);
                                var13 = var7[var9.field_n - -(var9.field_o * this.field_l)];
                                if (var13.a(false)) {
                                  break L11;
                                } else {
                                  if (var13.e((byte) -125)) {
                                    break L11;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var13.field_a = var12;
                              break L10;
                            }
                            if (var15 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                          throw new RuntimeException("Illegal saved item type: " + var11);
                        }
                        var10++;
                        continue L5;
                      }
                    }
                  }
                  stackOut_35_0 = (ne[]) (var7);
                  stackIn_36_0 = stackOut_35_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              discarded$1 = this.a((byte) 126);
              var16 = this.field_r;
              var3_array = var16;
              var4_int = 0;
              L12: while (true) {
                L13: {
                  L14: {
                    if (var4_int >= var16.length) {
                      break L14;
                    } else {
                      stackOut_4_0 = (ne[]) (var3_array);
                      stackIn_11_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var15 != 0) {
                        break L13;
                      } else {
                        L15: {
                          var5_ref_ne = stackIn_5_0[var4_int];
                          var5_ref_ne.a((byte) -68, param1);
                          if (!var5_ref_ne.e((byte) -122)) {
                            break L15;
                          } else {
                            if (var5_ref_ne.a((byte) -107) == 0) {
                              var5_ref_ne.a(true, 1);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var4_int++;
                        if (var15 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = this.field_r;
                  stackIn_11_0 = stackOut_10_0;
                  break L13;
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("lo.E(").append(param0).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L16;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_36_0;
        }
    }

    lo(int param0, byte[] param1) {
        vh discarded$0 = null;
        try {
            this.field_s = param1;
            this.field_r = null;
            discarded$0 = this.a((byte) 126);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new me(12, 0, 1, 0);
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_o = "Logging in...";
    }
}
