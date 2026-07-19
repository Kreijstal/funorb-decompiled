/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pv extends ci {
    private boolean field_o;
    static String field_q;
    static String[] field_p;
    static String field_m;
    private boolean field_n;

    final void a(byte param0, uia param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var4_int = param2;
                    if (var4_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (1 != var4_int) {
                          break L6;
                        } else {
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if ((var4_int ^ -1) != -3) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L7: {
                    stackOut_10_0 = this;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (-2 != (param1.h(param0 ^ 148) ^ -1)) {
                      stackOut_12_0 = this;
                      stackOut_12_1 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L7;
                    } else {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      break L7;
                    }
                  }
                  ((pv) (this)).field_o = stackIn_13_1 != 0;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                L8: {
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (1 != param1.h(255)) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L8;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L8;
                  }
                }
                ((pv) (this)).field_n = stackIn_17_1 != 0;
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L9: {
                stackOut_18_0 = this;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (param1.h(255) != 1) {
                  stackOut_20_0 = this;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L9;
                } else {
                  stackOut_19_0 = this;
                  stackOut_19_1 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L9;
                }
              }
              ((pv) (this)).field_g = stackIn_21_1 != 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            runtimeException = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (runtimeException);
            stackOut_23_1 = new StringBuilder().append("pv.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    public pv() {
        super(1, false);
        this.field_o = true;
        this.field_n = true;
    }

    final int[] c(int param0, int param1) {
        int[][] discarded$1 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var7 = this.field_i.a((byte) -114, param1);
            var3 = var7;
            if (!this.field_i.field_d) {
              break L0;
            } else {
              L1: {
                stackOut_21_0 = this;
                stackOut_21_1 = 0;
                stackOut_21_2 = param0 ^ -17;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_23_2 = stackOut_21_2;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                if (this.field_n) {
                  stackOut_23_0 = this;
                  stackOut_23_1 = stackIn_23_1;
                  stackOut_23_2 = stackIn_23_2;
                  stackOut_23_3 = hba.field_b - param1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  stackIn_24_3 = stackOut_23_3;
                  break L1;
                } else {
                  stackOut_22_0 = this;
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = stackIn_22_2;
                  stackOut_22_3 = param1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_24_3 = stackOut_22_3;
                  break L1;
                }
              }
              L2: {
                var4 = this.c(stackIn_24_1, stackIn_24_2, stackIn_24_3);
                if (!this.field_o) {
                  break L2;
                } else {
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= ns.field_g) {
                      if (var6 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      var7[var5] = var4[-var5 + una.field_b];
                      var5++;
                      if (var6 != 0) {
                        break L0;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
              lua.a(var4, 0, var7, 0, ns.field_g);
              return var7;
            }
          }
          return var7;
        } else {
          discarded$1 = this.b(52, -14);
          var7 = this.field_i.a((byte) -114, param1);
          var3 = var7;
          if (this.field_i.field_d) {
            L4: {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackOut_4_2 = param0 ^ -17;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (this.field_n) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = hba.field_b - param1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L4;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = param1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L4;
              }
            }
            var4 = this.c(stackIn_7_1, stackIn_7_2, stackIn_7_3);
            if (this.field_o) {
              var5 = 0;
              L5: while (true) {
                if (var5 >= ns.field_g) {
                  if (var6 != 0) {
                    lua.a(var4, 0, var7, 0, ns.field_g);
                    return var7;
                  } else {
                    return var7;
                  }
                } else {
                  var7[var5] = var4[-var5 + una.field_b];
                  var5++;
                  if (var6 == 0) {
                    continue L5;
                  } else {
                    return var7;
                  }
                }
              }
            } else {
              lua.a(var4, 0, var7, 0, ns.field_g);
              return var7;
            }
          } else {
            return var7;
          }
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[][] var26 = null;
        int[][] var27 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          var20 = this.field_h.a(param0, (byte) 120);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_h.field_f) {
            L0: {
              stackOut_38_0 = this;
              stackIn_40_0 = stackOut_38_0;
              stackIn_39_0 = stackOut_38_0;
              if (!this.field_n) {
                stackOut_40_0 = this;
                stackOut_40_1 = param0;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                break L0;
              } else {
                stackOut_39_0 = this;
                stackOut_39_1 = -param0 + hba.field_b;
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                break L0;
              }
            }
            var27 = this.a(stackIn_41_1, 0, param1 ^ 0);
            var21 = var27[0];
            var16 = var21;
            var5 = var16;
            var22 = var27[1];
            var17 = var22;
            var6 = var17;
            var23 = var27[2];
            var18 = var23;
            var7 = var18;
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            if (this.field_o) {
              var11 = 0;
              L1: while (true) {
                if (var11 < ns.field_g) {
                  var8[var11] = var5[una.field_b + -var11];
                  var9[var11] = var6[una.field_b + -var11];
                  var10[var11] = var7[una.field_b + -var11];
                  var11++;
                  if (var12 == 0) {
                    if (var12 == 0) {
                      continue L1;
                    } else {
                      L2: {
                        if (var12 == 0) {
                          break L2;
                        } else {
                          var11 = 0;
                          L3: while (true) {
                            if (ns.field_g <= var11) {
                              break L2;
                            } else {
                              var8[var11] = var21[var11];
                              var9[var11] = var22[var11];
                              var10[var11] = var23[var11];
                              var11++;
                              if (var12 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                      return var13;
                    }
                  } else {
                    return var13;
                  }
                } else {
                  L4: {
                    if (var12 == 0) {
                      break L4;
                    } else {
                      var11 = 0;
                      L5: while (true) {
                        if (ns.field_g <= var11) {
                          break L4;
                        } else {
                          var8[var11] = var21[var11];
                          var9[var11] = var22[var11];
                          var10[var11] = var23[var11];
                          var11++;
                          if (var12 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  return var13;
                }
              }
            } else {
              var11 = 0;
              L6: while (true) {
                L7: {
                  if (ns.field_g <= var11) {
                    break L7;
                  } else {
                    var8[var11] = var21[var11];
                    var9[var11] = var22[var11];
                    var10[var11] = var23[var11];
                    var11++;
                    if (var12 == 0) {
                      continue L6;
                    } else {
                      var11 = 0;
                      L8: while (true) {
                        if (ns.field_g <= var11) {
                          break L7;
                        } else {
                          var8[var11] = var21[var11];
                          var9[var11] = var22[var11];
                          var10[var11] = var23[var11];
                          var11++;
                          if (var12 == 0) {
                            continue L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                return var13;
              }
            }
          } else {
            return var13;
          }
        } else {
          field_p = (String[]) null;
          var20 = this.field_h.a(param0, (byte) 120);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_h.field_f) {
            L9: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!this.field_n) {
                stackOut_6_0 = this;
                stackOut_6_1 = param0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L9;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = -param0 + hba.field_b;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L9;
              }
            }
            var26 = this.a(stackIn_7_1, 0, param1 ^ 0);
            var21 = var26[0];
            var16 = var21;
            var5 = var16;
            var22 = var26[1];
            var17 = var22;
            var6 = var17;
            var23 = var26[2];
            var18 = var23;
            var7 = var18;
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            if (this.field_o) {
              var11 = 0;
              L10: while (true) {
                if (var11 < ns.field_g) {
                  var8[var11] = var5[una.field_b + -var11];
                  var9[var11] = var6[una.field_b + -var11];
                  var10[var11] = var7[una.field_b + -var11];
                  var11++;
                  if (var12 == 0) {
                    if (var12 == 0) {
                      continue L10;
                    } else {
                      L11: {
                        if (var12 == 0) {
                          break L11;
                        } else {
                          var11 = 0;
                          L12: while (true) {
                            if (ns.field_g <= var11) {
                              break L11;
                            } else {
                              var8[var11] = var21[var11];
                              var9[var11] = var22[var11];
                              var10[var11] = var23[var11];
                              var11++;
                              if (var12 == 0) {
                                continue L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                      return var13;
                    }
                  } else {
                    return var13;
                  }
                } else {
                  L13: {
                    if (var12 == 0) {
                      break L13;
                    } else {
                      var11 = 0;
                      L14: while (true) {
                        if (ns.field_g <= var11) {
                          break L13;
                        } else {
                          var8[var11] = var21[var11];
                          var9[var11] = var22[var11];
                          var10[var11] = var23[var11];
                          var11++;
                          if (var12 == 0) {
                            continue L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  return var13;
                }
              }
            } else {
              var11 = 0;
              L15: while (true) {
                L16: {
                  if (ns.field_g <= var11) {
                    break L16;
                  } else {
                    var8[var11] = var21[var11];
                    var9[var11] = var22[var11];
                    var10[var11] = var23[var11];
                    var11++;
                    if (var12 == 0) {
                      continue L15;
                    } else {
                      var11 = 0;
                      L17: while (true) {
                        if (ns.field_g <= var11) {
                          break L16;
                        } else {
                          var8[var11] = var21[var11];
                          var9[var11] = var22[var11];
                          var10[var11] = var23[var11];
                          var11++;
                          if (var12 == 0) {
                            continue L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
                return var13;
              }
            }
          } else {
            return var13;
          }
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 > -80) {
            field_m = (String) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    static {
        field_p = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_m = "Password is valid";
        field_q = "Playing";
    }
}
