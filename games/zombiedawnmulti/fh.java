/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int[][] field_p;
    static String field_f;
    fc field_i;
    static ja[] field_h;
    int field_r;
    private int[][] field_a;
    int field_c;
    static String field_e;
    boolean[][] field_k;
    private int field_o;
    private qk[] field_q;
    private int[][] field_l;
    static int field_n;
    static cj field_m;
    static String field_d;
    private int field_b;
    static int field_j;
    static String field_g;

    private final qk[] a(boolean param0, qk param1, qk[] param2) {
        qk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        qk[] var7 = null;
        qk[] stackIn_3_0 = null;
        qk[] stackIn_11_0 = null;
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
        qk[] stackOut_10_0 = null;
        qk[] stackOut_2_0 = null;
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var7 = new qk[param2.length + 1];
              var4 = var7;
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var5 ^ -1) <= (param2.length ^ -1)) {
                      break L3;
                    } else {
                      var7[var5] = param2[var5];
                      var5++;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7[param2.length] = param1;
                  break L2;
                }
                stackOut_10_0 = (qk[]) (var4);
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (qk[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4_ref);
            stackOut_12_1 = new StringBuilder().append("fh.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var4 = param2 / 24;
        var5 = param1 / 24;
        var6 = -2 / ((-9 - param0) / 59);
        var7 = 4;
        if (!this.a(var4, (byte) 16, var5)) {
          return false;
        } else {
          L0: {
            var8 = param2 % 24;
            var9 = param1 % 24;
            if ((var4 ^ -1) != -1) {
              stackOut_5_0 = this.a(var4 + -1, (byte) 125, var5);
              stackIn_6_0 = stackOut_5_0 ? 1 : 0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var10 = stackIn_6_0;
            if ((this.field_i.field_d + -1 ^ -1) == (var4 ^ -1)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = this.a(var4 + 1, (byte) 1, var5);
              stackIn_9_0 = stackOut_7_0 ? 1 : 0;
              break L1;
            }
          }
          L2: {
            var11 = stackIn_9_0;
            if ((var5 ^ -1) != (this.field_i.field_e + -1 ^ -1)) {
              stackOut_11_0 = this.a(var4, (byte) 119, 1 + var5);
              stackIn_12_0 = stackOut_11_0 ? 1 : 0;
              break L2;
            } else {
              stackOut_10_0 = 0;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            var12 = stackIn_12_0;
            if (var11 == 0) {
              break L3;
            } else {
              L4: {
                L5: {
                  stackOut_13_0 = var11;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if ((var9 ^ -1) > (var7 ^ -1)) {
                    break L5;
                  } else {
                    stackOut_14_0 = stackIn_14_0;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (!this.a(1 + var4, (byte) 126, 1 + var5)) {
                      stackOut_17_0 = stackIn_17_0;
                      stackOut_17_1 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L4;
                    } else {
                      stackOut_15_0 = stackIn_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                }
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L4;
              }
              var11 = stackIn_18_0 & stackIn_18_1;
              break L3;
            }
          }
          L6: {
            if (var10 == 0) {
              break L6;
            } else {
              L7: {
                L8: {
                  stackOut_20_0 = var10;
                  stackIn_23_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var9 < var7) {
                    break L8;
                  } else {
                    stackOut_21_0 = stackIn_21_0;
                    stackIn_24_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (!this.a(var4 + -1, (byte) -125, 1 + var5)) {
                      stackOut_24_0 = stackIn_24_0;
                      stackOut_24_1 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L7;
                    } else {
                      stackOut_22_0 = stackIn_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      break L8;
                    }
                  }
                }
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L7;
              }
              var10 = stackIn_25_0 & stackIn_25_1;
              break L6;
            }
          }
          L9: {
            if (var10 != 0) {
              break L9;
            } else {
              if (6 > var8) {
                return false;
              } else {
                break L9;
              }
            }
          }
          L10: {
            if (var11 != 0) {
              break L10;
            } else {
              if ((var8 ^ -1) < -9) {
                return false;
              } else {
                break L10;
              }
            }
          }
          L11: {
            if (var12 != 0) {
              break L11;
            } else {
              if ((var9 ^ -1) >= (var7 ^ -1)) {
                break L11;
              } else {
                return false;
              }
            }
          }
          return true;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nm var10 = null;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var5 = param0 / 24;
          var6 = param3 / 24;
          if (-1 < (var5 ^ -1)) {
            break L0;
          } else {
            if ((var6 ^ -1) > -1) {
              break L0;
            } else {
              if ((this.field_i.field_e ^ -1) >= (var6 ^ -1)) {
                break L0;
              } else {
                if (var5 < this.field_i.field_d) {
                  L1: {
                    if (param1) {
                      break L1;
                    } else {
                      var10 = (nm) null;
                      this.a(110, false, (nm) null, -115);
                      break L1;
                    }
                  }
                  L2: {
                    var7 = param0 % 24;
                    var8 = 1;
                    if (!param2) {
                      break L2;
                    } else {
                      L3: {
                        if (8 < var7) {
                          var8 = (byte)(var8 | 4);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (16 > var7) {
                        var8 = (byte)(var8 | 2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var9 = (byte)(this.field_i.field_k[var6][var5] & 7);
                    if ((var8 ^ -1) != (var8 & var9 ^ -1)) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  return stackIn_18_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final int a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        boolean discarded$1 = false;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.a(param1, true, param5, param0)) {
          var8 = 12.0f;
          var9 = -param3 + param1;
          var10 = -param4 + param0;
          var11 = g.b(var10 * var10 + var9 * var9);
          if (var11 == 0) {
            return 0;
          } else {
            L0: {
              var12 = var8 / (float)var11;
              var13 = var12 * (float)var9;
              if (param2 == -17201) {
                break L0;
              } else {
                discarded$1 = this.a(54, true, false, 113);
                break L0;
              }
            }
            var14 = (float)var10 * var12;
            var15 = (float)param3;
            var16 = (float)param4;
            var17 = 1;
            var18 = 1;
            var19 = var11;
            L1: while (true) {
              L2: {
                if ((float)var19 <= var8) {
                  break L2;
                } else {
                  var16 = var16 + var14;
                  var15 = var15 + var13;
                  stackOut_9_0 = var18;
                  stackIn_27_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (var20 != 0) {
                    return stackIn_27_0;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_10_0 == 0) {
                          break L4;
                        } else {
                          if (!this.a((int)var15, true, param5, (int)var16)) {
                            break L4;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L3;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L3;
                    }
                    L5: {
                      var18 = stackIn_14_0;
                      if (!param6) {
                        if (var18 != 0) {
                          break L5;
                        } else {
                          return -1;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var17 == 0) {
                              break L7;
                            } else {
                              if (!this.a((int)var15, true, param5, -48 + (int)var16)) {
                                break L7;
                              } else {
                                stackOut_17_0 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                break L6;
                              }
                            }
                          }
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        }
                        var17 = stackIn_19_0;
                        if (var17 != 0) {
                          break L5;
                        } else {
                          if (var18 == 0) {
                            return -1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var19 = (int)((float)var19 - var8);
                    if (var20 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return var11;
            }
          }
        } else {
          return -1;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_30_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_29_0 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 48) {
            break L0;
          } else {
            fh.a(true);
            break L0;
          }
        }
        this.field_q = new qk[]{};
        var2 = 0;
        L1: while (true) {
          stackOut_3_0 = var2;
          stackIn_4_0 = stackOut_3_0;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_4_0 >= this.field_i.field_e) {
                  break L4;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_30_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    var3 = stackIn_6_0;
                    L5: while (true) {
                      L6: {
                        if (this.field_i.field_d <= var3) {
                          break L6;
                        } else {
                          stackOut_8_0 = this.a(var3, (byte) 5, var2);
                          stackIn_4_0 = stackOut_8_0 ? 1 : 0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var8 != 0) {
                            continue L2;
                          } else {
                            L7: {
                              if (!stackIn_9_0) {
                                break L7;
                              } else {
                                L8: {
                                  if (this.a(1 + var3, (byte) 19, var2)) {
                                    break L8;
                                  } else {
                                    if (var8 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  var4 = this.a(var3, (byte) -30, var2 + 1) ? 1 : 0;
                                  var5 = this.a(var3 + 1, (byte) 127, var2 + 1) ? 1 : 0;
                                  var6 = this.a(var3, (byte) 114, var2 - 1) ? 1 : 0;
                                  var7 = this.a(1 + var3, (byte) 36, -1 + var2) ? 1 : 0;
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    if (var5 == 0) {
                                      this.field_q = this.a(false, new qk(24 * var3 - -1, var2 * 24 - -12), this.field_q);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (var4 != 0) {
                                    break L10;
                                  } else {
                                    if (var5 == 0) {
                                      break L10;
                                    } else {
                                      this.field_q = this.a(false, new qk(-1 + (24 * var3 + 48), 24 * var2 + 12), this.field_q);
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (var6 == 0) {
                                    break L11;
                                  } else {
                                    if (var7 == 0) {
                                      this.field_q = this.a(false, new qk(1 + 24 * var3, 24 * (var2 - -1) + -12), this.field_q);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (var6 != 0) {
                                  break L7;
                                } else {
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    this.field_q = this.a(false, new qk(47 + var3 * 24, (var2 - -1) * 24 + -12), this.field_q);
                                    break L7;
                                  }
                                }
                              }
                            }
                            var3++;
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var2++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_a = new int[this.field_q.length][this.field_q.length];
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L3;
            }
            var9 = stackIn_30_0;
            var2 = var9;
            L12: while (true) {
              L13: {
                if ((var9 ^ -1) <= (this.field_q.length ^ -1)) {
                  break L13;
                } else {
                  if (var8 != 0) {
                    break L13;
                  } else {
                    var3 = 0;
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var3 >= this.field_q.length) {
                            break L16;
                          } else {
                            this.field_a[var9][var3] = this.a(this.field_q[var9], this.field_q[var3], (byte) -71);
                            var3++;
                            if (var8 != 0) {
                              break L15;
                            } else {
                              if (var8 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        var9++;
                        break L15;
                      }
                      if (var8 == 0) {
                        continue L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ga var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        ra var12 = null;
        ab var13 = null;
        ga var14 = null;
        ra var15 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var14 = s.field_e;
            var2 = var14.g(31365);
            if (param0 == 1) {
              L1: {
                L2: {
                  if (0 != var2) {
                    break L2;
                  } else {
                    var11 = da.a(8);
                    var3 = var11;
                    var10 = var11;
                    var4 = var10;
                    var5 = var14;
                    var6 = ((k) ((Object) var5)).g(31365);
                    var7 = 0;
                    L3: while (true) {
                      L4: {
                        if ((var7 ^ -1) <= (var6 ^ -1)) {
                          break L4;
                        } else {
                          var10[var7] = ((k) ((Object) var5)).i(-1478490344);
                          var7++;
                          if (var8 != 0) {
                            break L1;
                          } else {
                            if (var8 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var12 = (ra) ((Object) so.field_j.c(param0 ^ 60));
                      if (var12 == null) {
                        ak.a((byte) -111);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var12.field_h = var11;
                        var12.field_k = true;
                        var12.a(true);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (1 == var2) {
                    break L5;
                  } else {
                    L6: {
                      if (var2 != 2) {
                        break L6;
                      } else {
                        var15 = (ra) ((Object) so.field_j.c(param0 ^ 76));
                        if (var15 == null) {
                          ak.a((byte) -128);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var15.field_h = da.a(8);
                          var15.field_k = true;
                          var15.a(true);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    bd.a("A1: " + ci.a(0), (Throwable) null, false);
                    ak.a((byte) -118);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                var13 = (ab) ((Object) ig.field_a.c(param0 ^ 73));
                if (var13 == null) {
                  ak.a((byte) -117);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  var13.a(true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 4;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "fh.P(" + param0 + ')');
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
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, nm param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_41_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_53_0 = 0;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = (int)(320.0f * param1.field_d - (float)param1.field_k);
              var4 = (int)(param1.field_d * 240.0f - (float)param1.field_g);
              var5 = 0;
              var7 = 44 / ((param0 - 63) / 34);
              if (var3_int >= -24) {
                break L1;
              } else {
                var5 = -(var3_int / 24);
                var3_int = var3_int % 24;
                break L1;
              }
            }
            L2: {
              var6 = 0;
              if (var4 >= -24) {
                break L2;
              } else {
                var6 = -(var4 / 24);
                var4 = var4 % 24;
                break L2;
              }
            }
            var8 = var5 - -55;
            var9 = 41 + var6;
            var10 = var3_int;
            var11 = var5;
            var12 = 0;
            var14 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var14 >= 41) {
                    break L5;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_16_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var22 != 0) {
                      break L4;
                    } else {
                      var15 = stackIn_8_0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (55 <= var15) {
                              break L8;
                            } else {
                              this.field_l[var14][var15] = 0;
                              var15++;
                              if (var22 != 0) {
                                break L7;
                              } else {
                                if (var22 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var14++;
                          break L7;
                        }
                        if (var22 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              }
              var13 = stackIn_16_0;
              this.field_o = var5;
              this.field_b = var6;
              L9: while (true) {
                stackOut_17_0 = var6 ^ -1;
                stackOut_17_1 = var9 ^ -1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (stackIn_18_0 <= stackIn_18_1) {
                        break L12;
                      } else {
                        L13: while (true) {
                          stackOut_19_0 = var5 ^ -1;
                          stackIn_38_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var22 != 0) {
                            break L11;
                          } else {
                            L14: {
                              if (stackIn_20_0 <= (var8 ^ -1)) {
                                break L14;
                              } else {
                                stackOut_21_0 = var5;
                                stackOut_21_1 = this.field_i.field_d;
                                stackIn_18_0 = stackOut_21_0;
                                stackIn_18_1 = stackOut_21_1;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                if (var22 != 0) {
                                  continue L10;
                                } else {
                                  L15: {
                                    L16: {
                                      L17: {
                                        if (stackIn_22_0 >= stackIn_22_1) {
                                          break L17;
                                        } else {
                                          if ((this.field_i.field_e ^ -1) < (var6 ^ -1)) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      oo.e(var3_int, var4, 24, 24, 1);
                                      var12++;
                                      var3_int += 24;
                                      if (var22 == 0) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    L18: {
                                      L19: {
                                        var14 = this.a(var5, var6, (byte) 126);
                                        var15 = (var14 & 127) >> -472508992;
                                        if (var15 < 0) {
                                          break L19;
                                        } else {
                                          if ((rn.field_a.length ^ -1) >= (var15 ^ -1)) {
                                            break L19;
                                          } else {
                                            rn.field_a[var15].c(var3_int, var4);
                                            if (var22 == 0) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                      oo.e(var3_int, var4, 24, 24, 7631988);
                                      break L18;
                                    }
                                    L20: {
                                      if (!qq.field_h) {
                                        break L20;
                                      } else {
                                        qp.field_w.c(Integer.toString(this.field_i.field_k[var6][var5]), 12 + var3_int, 12 + var4, 16777215, 1);
                                        break L20;
                                      }
                                    }
                                    var3_int += 24;
                                    this.field_l[var13][var12] = var14;
                                    var12++;
                                    break L15;
                                  }
                                  var5++;
                                  if (var22 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var13++;
                            var4 += 24;
                            var3_int = var10;
                            var12 = 0;
                            var5 = var11;
                            var6++;
                            if (var22 == 0) {
                              continue L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = qq.field_h;
                    stackIn_38_0 = stackOut_37_0 ? 1 : 0;
                    break L11;
                  }
                  L21: {
                    L22: {
                      if (stackIn_38_0 == 0) {
                        break L22;
                      } else {
                        var14 = param1.a(bd.field_g, 2);
                        var15 = param1.a(true, bo.field_d);
                        var16 = 0;
                        L23: while (true) {
                          L24: {
                            L25: {
                              if ((var16 ^ -1) <= (this.field_q.length ^ -1)) {
                                break L25;
                              } else {
                                var17 = param1.c(this.field_q[var16].field_g, -20126);
                                var18 = param1.d(this.field_q[var16].field_h, 119);
                                stackOut_41_0 = 0;
                                stackIn_54_0 = stackOut_41_0;
                                stackIn_42_0 = stackOut_41_0;
                                if (var22 != 0) {
                                  break L24;
                                } else {
                                  var19 = stackIn_42_0;
                                  L26: while (true) {
                                    L27: {
                                      L28: {
                                        if ((var19 ^ -1) <= (this.field_q.length ^ -1)) {
                                          break L28;
                                        } else {
                                          var20 = param1.c(this.field_q[var19].field_g, -20126);
                                          var21 = param1.d(this.field_q[var19].field_h, 107);
                                          stackOut_44_0 = -1;
                                          stackOut_44_1 = this.field_a[var16][var19] ^ -1;
                                          stackIn_49_0 = stackOut_44_0;
                                          stackIn_49_1 = stackOut_44_1;
                                          stackIn_45_0 = stackOut_44_0;
                                          stackIn_45_1 = stackOut_44_1;
                                          if (var22 != 0) {
                                            break L27;
                                          } else {
                                            L29: {
                                              if (stackIn_45_0 <= stackIn_45_1) {
                                                break L29;
                                              } else {
                                                oo.g(var17, var18, var20, var21, 65280, 48);
                                                break L29;
                                              }
                                            }
                                            var19++;
                                            if (var22 == 0) {
                                              continue L26;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_48_0 = -1;
                                      stackOut_48_1 = this.a(var15, 113, var14, this.field_q[var16].field_h, this.field_q[var16].field_g);
                                      stackIn_49_0 = stackOut_48_0;
                                      stackIn_49_1 = stackOut_48_1;
                                      break L27;
                                    }
                                    L30: {
                                      if (stackIn_49_0 != stackIn_49_1) {
                                        var19 = param1.c(var14, -20126);
                                        var20 = param1.d(var15, 122);
                                        oo.g(var17, var18, var19, var20, 16711680);
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                    var16++;
                                    if (var22 == 0) {
                                      continue L23;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L24;
                          }
                          var16 = stackIn_54_0;
                          L31: while (true) {
                            if ((var16 ^ -1) <= (this.field_q.length ^ -1)) {
                              break L22;
                            } else {
                              var17 = 320 + this.field_q[var16].field_g + -param1.field_k;
                              var18 = -param1.field_g + (this.field_q[var16].field_h + 240);
                              oo.d(var17, var18, 2, 16711680, 256);
                              qp.field_w.b(Integer.toString(var16), var17, var18, 16777215, 0, 64);
                              var16++;
                              if (var22 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L0;
                              } else {
                                if (var22 == 0) {
                                  continue L31;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L21;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var3 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) (var3);
            stackOut_60_1 = new StringBuilder().append("fh.M(").append(param0).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L32;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L32;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(qk param0, qk param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
        try {
          L0: {
            if (param2 == -71) {
              stackOut_3_0 = this.a(param0.field_h, -47, param0.field_g, param1.field_h, param1.field_g);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 94;
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
            stackOut_5_1 = new StringBuilder().append("fh.A(");
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void b(boolean param0) {
        boolean discarded$0 = false;
        this.field_r = 24 * this.field_i.field_d;
        if (!param0) {
            discarded$0 = this.a(-29, (byte) -50, -96);
        }
        this.field_c = this.field_i.field_e * 24;
    }

    final int a(int param0, int param1, byte param2) {
        if (!(-1 >= (param0 ^ -1))) {
            return 0;
        }
        if (!(param1 >= 0)) {
            return 0;
        }
        if ((param1 ^ -1) <= (this.field_i.field_e ^ -1)) {
            return 0;
        }
        if ((this.field_i.field_d ^ -1) >= (param0 ^ -1)) {
            return 0;
        }
        int var4 = 26 / ((param2 - -45) / 48);
        return this.field_i.field_f[param1][param0];
    }

    fh(fc param0) {
        RuntimeException runtimeException = null;
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] stackIn_3_0 = null;
        int[][] stackIn_8_0 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_2_0 = null;
        int[][] stackOut_7_0 = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_l = new int[41][55];
        try {
          L0: {
            this.field_i = param0;
            this.a(48);
            this.b(true);
            var8 = this.field_i.field_k;
            var7 = var8;
            var6 = var7;
            var2 = var6;
            this.field_p = new int[var8.length][var8[0].length];
            var3 = 0;
            L1: while (true) {
              stackOut_2_0 = (int[][]) (var8);
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((stackIn_3_0.length ^ -1) >= (var3 ^ -1)) {
                      break L4;
                    } else {
                      if (var5 != 0) {
                        break L3;
                      } else {
                        var4 = 0;
                        L5: while (true) {
                          L6: {
                            if (var4 >= var8[0].length) {
                              break L6;
                            } else {
                              stackOut_7_0 = this.field_p;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var5 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  stackOut_8_0 = stackIn_8_0[var3];
                                  stackOut_8_1 = var4;
                                  stackIn_10_0 = stackOut_8_0;
                                  stackIn_10_1 = stackOut_8_1;
                                  stackIn_9_0 = stackOut_8_0;
                                  stackIn_9_1 = stackOut_8_1;
                                  if ((tq.b(1, var8[var3][var4]) ^ -1) != -1) {
                                    stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                                    stackOut_10_1 = stackIn_10_1;
                                    stackOut_10_2 = 0;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    stackIn_11_2 = stackOut_10_2;
                                    break L7;
                                  } else {
                                    stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                                    stackOut_9_1 = stackIn_9_1;
                                    stackOut_9_2 = 33554432;
                                    stackIn_11_0 = stackOut_9_0;
                                    stackIn_11_1 = stackOut_9_1;
                                    stackIn_11_2 = stackOut_9_2;
                                    break L7;
                                  }
                                }
                                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                                var4++;
                                if (var5 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.field_k = new boolean[this.field_i.field_e][this.field_i.field_d];
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("fh.<init>(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final th b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        qk var8 = null;
        qk var9 = null;
        th var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        nm var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_103_0 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int[] stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_103_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    var6 = param3 / 24;
                    var7 = param1 / 24;
                    if (!this.a(var6, (byte) 118, var7)) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!this.a(var6, (byte) -25, var7 + -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    param1 -= 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!this.a(var6, (byte) 32, 1 + var7)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    param1 += 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.a(var6, (byte) 125, var7 + 2)) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (this.a(var6 - -1, (byte) 21, var7)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!this.a(var6 - 1, (byte) 116, var7)) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    param3 -= 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    param3 += 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    param1 += 48;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var7 = param1 / 24;
                    var6 = param3 / 24;
                    if (this.a(var6, (byte) 22, var7)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return null;
                }
                case 18: {
                    if (this.a(param3, true, true, param1)) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!this.a(var6 - 1, (byte) 122, var7)) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!this.a(1 + var6, (byte) 119, var7)) {
                        statePc = 22;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 22: {
                    param3 = 24 * var6;
                    if (var19 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    param3 = 24 + 24 * var6 + -1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var8 = new qk(param0, param2);
                    if (param4 == 8760) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var20 = (nm) null;
                    this.a(-105, true, (nm) null, 61);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var9 = new qk(param3, param1);
                    var10 = new th();
                    var10.a(var9, false);
                    var11 = this.a(var9, var8, (byte) -71);
                    if (-1 >= (var11 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return var10;
                }
                case 29: {
                    var23 = new int[this.field_q.length];
                    var21 = var23;
                    var12 = var21;
                    var24 = new int[this.field_q.length];
                    var22 = var24;
                    var13 = var22;
                    var14 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var23.length ^ -1) >= (var14 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var15 = this.a(var8, this.field_q[var14], (byte) -71);
                    var23[var14] = var15;
                    stackOut_31_0 = (int[]) (var13);
                    stackOut_31_1 = var14;
                    stackIn_93_0 = stackOut_31_0;
                    stackIn_93_1 = stackOut_31_1;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    if (var19 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = (int[]) ((Object) stackIn_32_0);
                    stackOut_32_1 = stackIn_32_1;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    if (-1 >= (var15 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = (int[]) ((Object) stackIn_33_0);
                    stackOut_33_1 = stackIn_33_1;
                    stackOut_33_2 = -2;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = (int[]) ((Object) stackIn_34_0);
                    stackOut_34_1 = stackIn_34_1;
                    stackOut_34_2 = -1;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_35_0[stackIn_35_1] = stackIn_35_2;
                    var14++;
                    if (var19 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14 = 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var14 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var14 = 0;
                    stackOut_38_0 = 0;
                    stackIn_56_0 = stackOut_38_0;
                    stackIn_39_0 = stackOut_38_0;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var15 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = var23.length ^ -1;
                    stackOut_40_1 = var15 ^ -1;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 >= stackIn_41_1) {
                        statePc = 54;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = var23[var15] ^ -1;
                    stackOut_42_1 = -1;
                    stackIn_41_0 = stackOut_42_0;
                    stackIn_41_1 = stackOut_42_1;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    if (var19 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (stackIn_43_0 > stackIn_43_1) {
                        statePc = 53;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var16 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if ((var23.length ^ -1) >= (var16 ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackOut_46_0 = -1;
                    stackOut_46_1 = this.field_a[var15][var16];
                    stackIn_41_0 = stackOut_46_0;
                    stackIn_41_1 = stackOut_46_1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (var19 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 == stackIn_47_1) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-1 == var23[var16]) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var23[var15] + this.field_a[var15][var16] >= var23[var16]) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var24 = var22;
                    var14 = 1;
                    var12[var16] = this.field_a[var15][var16] + var23[var15];
                    var24[var16] = var15;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var15++;
                    if (var19 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var19 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = -1;
                    stackIn_56_0 = stackOut_55_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var15 = stackIn_56_0;
                    var16 = -1;
                    var17 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var23.length <= var17) {
                        statePc = 66;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var18 = this.a(var9, this.field_q[var17], (byte) -71);
                    stackOut_58_0 = var18 ^ -1;
                    stackOut_58_1 = -1;
                    stackIn_67_0 = stackOut_58_0;
                    stackIn_67_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (var19 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 > stackIn_59_1) {
                        statePc = 65;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var23[var17] == -1) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 == (var16 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((var16 ^ -1) < (var18 - -var23[var17] ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var15 = var17;
                    var16 = var23[var17] + var18;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var17++;
                    if (var19 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = -1;
                    stackOut_66_1 = var16;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 != stackIn_67_1) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    return null;
                }
                case 69: {
                    if (var15 == -1) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var15 != var24[var15]) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    return null;
                }
                case 72: {
                    var10.a(-25612, this.field_q[var15].a(30544));
                    var15 = var24[var15];
                    if (var19 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    return var10;
                }
                case 75: {
                    if (var23[var15] + this.field_a[var15][var16] >= var23[var16]) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var24 = var22;
                    var14 = 1;
                    var12[var16] = this.field_a[var15][var16] + var23[var15];
                    var24[var16] = var15;
                    statePc = 80;
                    continue stateLoop;
                }
                case 78: {
                    if (-1 == var23[var16]) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0 == stackIn_82_1) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackOut_84_0 = -1;
                    stackOut_84_1 = this.field_a[var15][var16];
                    stackIn_98_0 = stackOut_84_0;
                    stackIn_98_1 = stackOut_84_1;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    if (var19 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackOut_85_0 = stackIn_85_0;
                    stackOut_85_1 = stackIn_85_1;
                    stackIn_82_0 = stackOut_85_0;
                    stackIn_82_1 = stackOut_85_1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 86: {
                    if ((var23.length ^ -1) >= (var16 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var16 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 89: {
                    var15++;
                    if (var19 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 > stackIn_91_1) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = stackIn_93_0[stackIn_93_1] ^ -1;
                    stackOut_93_1 = -1;
                    stackIn_98_0 = stackOut_93_0;
                    stackIn_98_1 = stackOut_93_1;
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    if (var19 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackOut_94_0 = stackIn_94_0;
                    stackOut_94_1 = stackIn_94_1;
                    stackIn_91_0 = stackOut_94_0;
                    stackIn_91_1 = stackOut_94_1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = (int[]) (var23);
                    stackOut_95_1 = var15;
                    stackIn_93_0 = stackOut_95_0;
                    stackIn_93_1 = stackOut_95_1;
                    statePc = 93;
                    continue stateLoop;
                }
                case 96: {
                    if (var19 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 >= stackIn_98_1) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = var23.length ^ -1;
                    stackOut_100_1 = var15 ^ -1;
                    stackIn_98_0 = stackOut_100_0;
                    stackIn_98_1 = stackOut_100_1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 101: {
                    var15 = stackIn_101_0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 102: {
                    var14 = 0;
                    stackOut_102_0 = 0;
                    stackIn_56_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackOut_103_0 = stackIn_103_0;
                    stackIn_101_0 = stackOut_103_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 104: {
                    if (var14 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        ee.field_b = false;
        if (null != mj.field_Ib) {
            mj.field_Ib.c((byte) 123);
        }
        if (!(0 == va.field_a)) {
            pf.a(89);
        }
        ti.field_Y = 0;
        if (param0 != 31706) {
            fh.b(-67);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (!(param0 >= 0)) {
            return false;
        }
        if (0 > param2) {
            return false;
        }
        if (!((param2 ^ -1) > (this.field_i.field_e ^ -1))) {
            return false;
        }
        int var4 = -18 / ((74 - param1) / 37);
        if (!(param0 < this.field_i.field_d)) {
            return false;
        }
        return 0 != (1 & this.field_i.field_k[param2][param0]) ? true : false;
    }

    final int[][] d(int param0) {
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] stackIn_7_0 = null;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[][] stackIn_13_0 = null;
        int[][] stackOut_6_0 = null;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 > 21) {
            break L0;
          } else {
            this.field_o = -62;
            break L0;
          }
        }
        var2 = new int[this.field_i.field_e][this.field_i.field_d];
        var3 = 0;
        L1: while (true) {
          L2: {
            if (var3 >= this.field_i.field_e) {
              break L2;
            } else {
              var4 = 0;
              L3: while (true) {
                L4: {
                  if ((var4 ^ -1) <= (this.field_i.field_d ^ -1)) {
                    break L4;
                  } else {
                    stackOut_6_0 = (int[][]) (var2);
                    stackIn_13_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      return stackIn_13_0;
                    } else {
                      L5: {
                        stackOut_7_0 = stackIn_7_0[var3];
                        stackOut_7_1 = var4;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (this.a(var4, (byte) -71, var3)) {
                          stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          break L5;
                        } else {
                          stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = -1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          break L5;
                        }
                      }
                      stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                      var4++;
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var3++;
                if (var5 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return var2;
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 85 % ((33 - param1) / 62);
        return this.a(param0, param2, -17201, param4, param3, true, false);
    }

    final void a(int param0, boolean param1, nm param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ja var15 = null;
        ja var16 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_93_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_92_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = (int)((float)(-param2.field_k) + 320.0f * param2.field_d);
              if ((var5_int ^ -1) > 23) {
                var5_int = var5_int % 24;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = (int)((float)(-param2.field_g) + param2.field_d * 240.0f);
              if (23 >= (var6 ^ -1)) {
                break L2;
              } else {
                var6 = var6 % 24;
                break L2;
              }
            }
            var7 = var5_int;
            var8 = 0;
            L3: while (true) {
              stackOut_7_0 = var8 ^ -1;
              stackOut_7_1 = -42;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              L4: while (true) {
                L5: {
                  L6: {
                    if (stackIn_8_0 <= stackIn_8_1) {
                      break L6;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_93_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var14 != 0) {
                        break L5;
                      } else {
                        var9 = stackIn_10_0;
                        L7: while (true) {
                          L8: {
                            if (var9 >= 55) {
                              break L8;
                            } else {
                              stackOut_12_0 = var9 + this.field_o ^ -1;
                              stackOut_12_1 = this.field_k[0].length ^ -1;
                              stackIn_8_0 = stackOut_12_0;
                              stackIn_8_1 = stackOut_12_1;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              if (var14 != 0) {
                                continue L4;
                              } else {
                                L9: {
                                  if (stackIn_13_0 <= stackIn_13_1) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if ((this.field_k.length ^ -1) < (var8 + this.field_b ^ -1)) {
                                        break L10;
                                      } else {
                                        if (var14 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      L12: {
                                        var10 = this.field_l[var8][var9];
                                        if ((param0 ^ -1) != -2) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (!this.field_k[var8 + this.field_b][var9 - -this.field_o]) {
                                              break L13;
                                            } else {
                                              var5_int += 24;
                                              if (var14 == 0) {
                                                break L9;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            var11 = ((var10 & 65408) >> -255187513) + -1;
                                            if (var11 < 0) {
                                              break L14;
                                            } else {
                                              if ((var11 ^ -1) > (od.field_Ab.length ^ -1)) {
                                                L15: {
                                                  if (param1) {
                                                    oo.e(var5_int, var6, 24, 24, 16711935);
                                                    break L15;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                                L16: {
                                                  L17: {
                                                    var15 = od.field_Ab[var11];
                                                    var16 = var15;
                                                    var16 = var15;
                                                    if (!this.field_k[var8 + this.field_b][this.field_o + var9]) {
                                                      break L17;
                                                    } else {
                                                      var15.c(var5_int, var6, 128);
                                                      if (var14 == 0) {
                                                        break L16;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  L18: {
                                                    L19: {
                                                      if (0 >= (1073741824 & var10)) {
                                                        break L19;
                                                      } else {
                                                        if (0 < (536870912 & var10)) {
                                                          break L18;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    L20: {
                                                      if (0 >= (var10 & 1073741824)) {
                                                        break L20;
                                                      } else {
                                                        var15.b(var5_int, var6);
                                                        if (var14 == 0) {
                                                          break L16;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    L21: {
                                                      if ((var10 & 536870912) > 0) {
                                                        break L21;
                                                      } else {
                                                        var15.g(var5_int, var6);
                                                        if (var14 == 0) {
                                                          break L16;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    var15.a(var5_int, var6);
                                                    if (var14 == 0) {
                                                      break L16;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                  var15.d(var5_int, var6);
                                                  break L16;
                                                }
                                                if (!po.field_p) {
                                                  break L14;
                                                } else {
                                                  if (-1 == (var10 & 33554432 ^ -1)) {
                                                    break L14;
                                                  } else {
                                                    oo.f(var5_int, var6, 24, 24, 8425216, 96);
                                                    break L14;
                                                  }
                                                }
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          if (var14 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L22: {
                                        if (param0 == 2) {
                                          break L22;
                                        } else {
                                          if (-4 == (param0 ^ -1)) {
                                            L23: {
                                              if ((-2147483648 & var10) != 0) {
                                                L24: {
                                                  if (param1) {
                                                    break L24;
                                                  } else {
                                                    L25: {
                                                      if (-1 != (var10 & 67108864 ^ -1)) {
                                                        break L25;
                                                      } else {
                                                        oo.f(var5_int, var6, 24, 24, 0, 128);
                                                        if (var14 == 0) {
                                                          break L23;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    L26: {
                                                      var11 = -1;
                                                      var12 = 511 & var10 >> 397339975;
                                                      var13 = var10 >> 1417821520 & 511;
                                                      if (var13 < 9) {
                                                        break L26;
                                                      } else {
                                                        if (var13 > 32) {
                                                          break L26;
                                                        } else {
                                                          var11 = -9 + var13;
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    L27: {
                                                      if ((var12 ^ -1) > -10) {
                                                        break L27;
                                                      } else {
                                                        if (-33 > (var12 ^ -1)) {
                                                          break L27;
                                                        } else {
                                                          var11 = var12 - 9;
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    L28: {
                                                      if ((var13 ^ -1) != -30) {
                                                        break L28;
                                                      } else {
                                                        var11 = 9;
                                                        break L28;
                                                      }
                                                    }
                                                    L29: {
                                                      L30: {
                                                        if (0 > var11) {
                                                          break L30;
                                                        } else {
                                                          if (var11 >= ne.field_Ab.length) {
                                                            break L30;
                                                          } else {
                                                            ne.field_Ab[var11].c(var5_int, var6, 128);
                                                            if (var14 == 0) {
                                                              break L29;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      oo.f(var5_int, var6, 24, 24, 0, 128);
                                                      ne.field_Ab[21].c(var5_int, var6 - -24, 128);
                                                      break L29;
                                                    }
                                                    if (var14 == 0) {
                                                      break L23;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                L31: {
                                                  if ((67108864 & var10 ^ -1) == -1) {
                                                    break L31;
                                                  } else {
                                                    oo.f(var5_int, var6, 24, 24, 65280, 128);
                                                    if (var14 == 0) {
                                                      break L23;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                                oo.f(var5_int, var6, 24, 24, 16711935, 128);
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            if (!wh.field_c) {
                                              break L11;
                                            } else {
                                              oo.a(var5_int, var6, 25, 25, 7864183);
                                              if (var14 == 0) {
                                                break L11;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      L32: {
                                        if (this.field_k[var8 - -this.field_b][this.field_o + var9]) {
                                          var5_int += 24;
                                          if (var14 == 0) {
                                            break L9;
                                          } else {
                                            break L32;
                                          }
                                        } else {
                                          break L32;
                                        }
                                      }
                                      var11 = -1 + ((var10 & 33488896) >> 14387344);
                                      if (-1 < (var11 ^ -1)) {
                                        break L11;
                                      } else {
                                        if (var11 < od.field_Ab.length) {
                                          L33: {
                                            var16 = od.field_Ab[var11];
                                            if (-1 > (268435456 & var10 ^ -1)) {
                                              break L33;
                                            } else {
                                              L34: {
                                                if ((var10 & 134217728) > 0) {
                                                  break L34;
                                                } else {
                                                  var16.g(var5_int, var6);
                                                  if (var14 == 0) {
                                                    break L11;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              var16.a(var5_int, var6);
                                              if (var14 == 0) {
                                                break L11;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          var16.b(var5_int, var6);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var5_int += 24;
                                    break L9;
                                  }
                                }
                                var9++;
                                if (var14 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var5_int = var7;
                          var6 += 24;
                          var8++;
                          if (var14 == 0) {
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackOut_92_0 = param3;
                  stackIn_93_0 = stackOut_92_0;
                  break L5;
                }
                L35: {
                  if (stackIn_93_0 == -1) {
                    break L35;
                  } else {
                    discarded$1 = this.a(-106, false, true, 19);
                    break L35;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var5 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var5);
            stackOut_96_1 = new StringBuilder().append("fh.E(").append(param0).append(',').append(param1).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param2 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L36;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L36;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_m = null;
        if (!param0) {
            field_n = -16;
        }
    }

    static {
        field_f = "<%0> has left the lobby.";
        field_j = 0;
        field_e = "Use this on a zombie or area to disrupt an ongoing effect. Thwart your enemies' evil plans!";
        field_g = "";
        field_d = "<%0>/<%1>";
    }
}
