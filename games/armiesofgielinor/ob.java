/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends hs {
    private int[] field_L;
    private int field_T;
    static String field_P;
    private int field_R;
    private int[] field_S;
    private int[] field_K;
    private int field_N;
    int field_Q;
    static volatile int field_J;
    static String[] field_M;
    static String field_O;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 8192) {
          field_J = 99;
          super.a(param0, param1, param2, param3 + 0, param4);
          return;
        } else {
          super.a(param0, param1, param2, param3 + 0, param4);
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param2 == 0) {
          L0: {
            if (null == this.field_K) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = this.field_K.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var4 = stackIn_5_0;
          var5 = new int[param0 * var4];
          if (this.field_L != null) {
            if (0 < this.field_L.length) {
              if (0 < var5.length) {
                if (-1 <= (param1 ^ -1)) {
                  this.field_L = var5;
                  return;
                } else {
                  vm.a(this.field_L, 0, var5, 0, var4 * Math.min(param1, param0));
                  this.field_L = var5;
                  return;
                }
              } else {
                this.field_L = var5;
                return;
              }
            } else {
              this.field_L = var5;
              return;
            }
          } else {
            this.field_L = var5;
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, kb param2, int param3) {
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_K[-1 + this.field_K.length];
              var6 = this.field_S[this.field_S.length + -1];
              stackOut_1_0 = this.field_l;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 > (param3 ^ -1)) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = this.field_K[param3 + -1];
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * stackIn_4_1 / var5_int;
              if ((param0 ^ -1) >= -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = this.field_S[-1 + param0];
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var8 = stackIn_7_0 * this.field_w / var6;
            var9 = this.field_K[param3] * this.field_l / var5_int;
            var10 = this.field_w * this.field_S[param0] / var6;
            var11 = param0 * this.field_K.length - -param3;
            var12 = 48 & this.field_L[var11];
            var13 = 192 & this.field_L[var11];
            var14 = param2.field_B;
            if (param1 == 65) {
              L3: {
                L4: {
                  var15 = param2.field_p;
                  var16 = param2.field_l;
                  var17 = param2.field_w;
                  if (var9 - var7 <= var16) {
                    break L4;
                  } else {
                    if ((this.field_L[var11] & 1) == 0) {
                      break L4;
                    } else {
                      var16 = -var7 + var9;
                      var14 = var7;
                      if (var20 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var16 <= -var7 + var9) {
                      break L6;
                    } else {
                      if (0 != (this.field_L[var11] & 4)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var12 != 16) {
                      break L7;
                    } else {
                      var14 = var7 - (-var9 + var16) >> 1138687553;
                      if (var20 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (32 != var12) {
                      break L8;
                    } else {
                      var14 = var9 - var16;
                      if (var20 == 0) {
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var14 = var7;
                  if (var20 == 0) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
                var14 = var7;
                var16 = -var7 + var9;
                break L3;
              }
              L9: {
                L10: {
                  L11: {
                    if (var17 >= var10 - var8) {
                      break L11;
                    } else {
                      if (-1 != (this.field_L[var11] & 2 ^ -1)) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    L13: {
                      if (var17 <= -var8 + var10) {
                        break L13;
                      } else {
                        if ((8 & this.field_L[var11]) != 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (64 == var13) {
                        break L14;
                      } else {
                        L15: {
                          if ((var13 ^ -1) == -129) {
                            break L15;
                          } else {
                            var15 = var8;
                            if (var20 == 0) {
                              break L9;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var15 = var10 - var17;
                        if (var20 == 0) {
                          break L9;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var15 = -var17 + var8 - -var10 >> 177823105;
                    if (var20 == 0) {
                      break L9;
                    } else {
                      break L12;
                    }
                  }
                  var17 = var10 - var8;
                  var15 = var8;
                  if (var20 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
                var15 = var8;
                var17 = var10 + -var8;
                break L9;
              }
              var18 = this.field_T;
              var19 = this.field_R;
              param2.a(var14 + var18, var16 - var18 * 2, var15 + var19, 8192, -(2 * var19) + var17);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var5);
            stackOut_36_1 = new StringBuilder().append("ob.C(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L16;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(kb param0, int param1, int param2) {
        int var4_int = this.field_N % this.field_K.length;
        int var5 = this.field_N / this.field_K.length;
        this.field_L[this.field_N] = param1;
        this.field_C[this.field_N] = param0;
        if (param0 != null) {
            this.a(var5, (byte) 65, param0, var4_int);
        }
        if (param2 != 0) {
            return;
        }
        try {
            this.field_N = this.field_N + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ob.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param3 > 103) {
              stackOut_3_0 = super.a(param0, param1, param2, 123, param4, param5, param6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("ob.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(int param0, boolean param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -3) {
                break L1;
              } else {
                if (-37 <= (param0 ^ -1)) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = param3;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      if (var8 >= var7) {
                        stackOut_39_0 = var5;
                        stackIn_40_0 = stackOut_39_0;
                        break L3;
                      } else {
                        var9 = param2.charAt(var8);
                        stackOut_7_0 = 0;
                        stackIn_40_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var11 != 0) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (stackIn_8_0 != var8) {
                                break L5;
                              } else {
                                L6: {
                                  if (45 == var9) {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                if (43 != var9) {
                                  break L5;
                                } else {
                                  if (!param1) {
                                    break L5;
                                  } else {
                                    if (var11 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            L7: {
                              L8: {
                                if (48 > var9) {
                                  break L8;
                                } else {
                                  if (var9 > 57) {
                                    break L8;
                                  } else {
                                    var9 -= 48;
                                    if (var11 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var9 < 65) {
                                  break L9;
                                } else {
                                  if (var9 > 90) {
                                    break L9;
                                  } else {
                                    var9 -= 55;
                                    if (var11 == 0) {
                                      break L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (97 > var9) {
                                  break L10;
                                } else {
                                  if (var9 <= 122) {
                                    var9 -= 87;
                                    break L7;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              throw new NumberFormatException();
                            }
                            if (var9 < param0) {
                              L11: {
                                if (var4_int != 0) {
                                  var9 = -var9;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var10 = var9 + param0 * var6;
                              if (var6 != var10 / param0) {
                                throw new NumberFormatException();
                              } else {
                                var6 = var10;
                                var5 = 1;
                                break L4;
                              }
                            } else {
                              throw new NumberFormatException();
                            }
                          }
                          var8++;
                          continue L2;
                        }
                      }
                    }
                    if (stackIn_40_0 != 0) {
                      stackOut_42_0 = var6;
                      stackIn_43_0 = stackOut_42_0;
                      break L0;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var4);
            stackOut_44_1 = new StringBuilder().append("ob.H(").append(param0).append(',').append(param1).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ')');
        }
        return stackIn_43_0;
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        kb[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= 23) {
          L0: {
            if (this.field_K != null) {
              stackOut_16_0 = this.field_K.length;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_15_0 = 0;
              stackIn_17_0 = stackOut_15_0;
              break L0;
            }
          }
          var4 = stackIn_17_0;
          var5 = new kb[param2 * var4];
          if (this.field_C != null) {
            if (-1 > (this.field_C.length ^ -1)) {
              if (-1 > (var5.length ^ -1)) {
                if (param1 > 0) {
                  vm.a(this.field_C, 0, var5, 0, Math.min(param1, param2) * var4);
                  this.field_C = var5;
                  return;
                } else {
                  this.field_C = var5;
                  return;
                }
              } else {
                this.field_C = var5;
                return;
              }
            } else {
              this.field_C = var5;
              return;
            }
          } else {
            this.field_C = var5;
            return;
          }
        } else {
          L1: {
            field_J = -52;
            if (this.field_K != null) {
              stackOut_3_0 = this.field_K.length;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var4 = stackIn_4_0;
          var5 = new kb[param2 * var4];
          if (this.field_C != null) {
            if (-1 > (this.field_C.length ^ -1)) {
              if (-1 > (var5.length ^ -1)) {
                if (param1 <= 0) {
                  this.field_C = var5;
                  return;
                } else {
                  vm.a(this.field_C, 0, var5, 0, Math.min(param1, param2) * var4);
                  this.field_C = var5;
                  return;
                }
              } else {
                this.field_C = var5;
                return;
              }
            } else {
              this.field_C = var5;
              return;
            }
          } else {
            this.field_C = var5;
            return;
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_17_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3 ^ 0)) {
              L1: {
                var5_int = param1;
                if (98 != var5_int) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    stackOut_13_0 = this.a((byte) 106, param0, this.field_K.length);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (99 == var5_int) {
                stackOut_15_0 = this.a(param0, this.field_K.length, true);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L2: {
                  if (96 != var5_int) {
                    break L2;
                  } else {
                    if (var6 == 0) {
                      stackOut_17_0 = this.a((byte) 88, param0);
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-98 == (var5_int ^ -1)) {
                  stackOut_19_0 = this.b(param3 ^ -12286, param0);
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  L3: {
                    if (param3 == -12215) {
                      break L3;
                    } else {
                      var7 = (int[]) null;
                      this.a(14, (int[]) null);
                      break L3;
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("ob.F(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_24_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void e(byte param0) {
        if (param0 <= 50) {
          field_O = (String) null;
          field_P = null;
          field_M = null;
          field_O = null;
          return;
        } else {
          field_P = null;
          field_M = null;
          field_O = null;
          return;
        }
    }

    final void d(byte param0) {
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        kb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          stackOut_1_0 = var2;
          stackOut_1_1 = this.field_C.length;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            if (stackIn_2_0 < stackIn_2_1) {
              var9 = var3 ^ -1;
              var8 = this.field_S.length ^ -1;
              if (var6 != 0) {
                if (var8 < var9) {
                  var7 = (kb) null;
                  discarded$10 = this.a(-86, 103, -38, 9, (kb) null, 3, 102);
                  return;
                } else {
                  return;
                }
              } else {
                if (var8 < var9) {
                  var4 = 0;
                  if (this.field_C.length <= var2) {
                    var3++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      if (param0 < 84) {
                        var7 = (kb) null;
                        discarded$11 = this.a(-86, 103, -38, 9, (kb) null, 3, 102);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    stackOut_18_0 = var4;
                    stackOut_18_1 = this.field_K.length;
                    stackIn_2_0 = stackOut_18_0;
                    stackIn_2_1 = stackOut_18_1;
                    continue L1;
                  }
                } else {
                  if (param0 < 84) {
                    var7 = (kb) null;
                    discarded$12 = this.a(-86, 103, -38, 9, (kb) null, 3, 102);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 < 84) {
                var7 = (kb) null;
                discarded$13 = this.a(-86, 103, -38, 9, (kb) null, 3, 102);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        kb[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null != this.field_S) {
            stackOut_2_0 = this.field_S.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new kb[param1 * var4];
        if (null != this.field_C) {
          if (-1 > (this.field_C.length ^ -1)) {
            if (var5.length > 0) {
              if ((param0 ^ -1) < -1) {
                var6 = 0;
                L1: while (true) {
                  if (var4 > var6) {
                    vm.a(this.field_C, var6 * param0, var5, var6 * param1, Math.min(param0, param1));
                    var6++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      return;
                    }
                  } else {
                    if (param2 != -20410) {
                      return;
                    } else {
                      this.field_C = var5;
                      return;
                    }
                  }
                }
              } else {
                if (param2 != -20410) {
                  return;
                } else {
                  this.field_C = var5;
                  return;
                }
              }
            } else {
              if (param2 != -20410) {
                return;
              } else {
                this.field_C = var5;
                return;
              }
            }
          } else {
            if (param2 != -20410) {
              return;
            } else {
              this.field_C = var5;
              return;
            }
          }
        } else {
          if (param2 != -20410) {
            return;
          } else {
            this.field_C = var5;
            return;
          }
        }
    }

    ob(int param0, int param1, int param2, int param3, kh param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_Q = 92;
        this.field_N = 0;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            vm.a(var10, 0, param5, 1);
            var9 = new int[param6];
            vm.a(var9, 0, param6, 1);
            this.a((byte) 78, var10);
            this.a(0, var9);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ob.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_S == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_S.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new int[param2 * var4];
        if (this.field_L != null) {
          if (0 < this.field_L.length) {
            if ((var5.length ^ -1) < -1) {
              if (-1 > (param1 ^ -1)) {
                var6 = 0;
                L1: while (true) {
                  if (var4 > var6) {
                    vm.a(this.field_L, var6 * param1, var5, param2 * var6, Math.min(param1, param2));
                    var6++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      return;
                    }
                  } else {
                    if (!param0) {
                      return;
                    } else {
                      this.field_L = var5;
                      return;
                    }
                  }
                }
              } else {
                if (!param0) {
                  return;
                } else {
                  this.field_L = var5;
                  return;
                }
              }
            } else {
              if (!param0) {
                return;
              } else {
                this.field_L = var5;
                return;
              }
            }
          } else {
            if (!param0) {
              return;
            } else {
              this.field_L = var5;
              return;
            }
          }
        } else {
          if (!param0) {
            return;
          } else {
            this.field_L = var5;
            return;
          }
        }
    }

    private final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_S) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = this.field_S.length;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var3_int = stackIn_4_0;
            var4 = param1.length;
            this.field_S = param1;
            var5 = param1;
            var6 = 0;
            var7 = param0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5.length <= var6) {
                    break L4;
                  } else {
                    var7 = var7 + var5[var6];
                    var5[var6] = var7 + var5[var6];
                    var6++;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.a((byte) 65, var3_int, var4);
                this.c(var4, var3_int, 0);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("ob.J(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void d(int param0, int param1, int param2) {
        if (param1 != 57) {
          this.field_N = 28;
          this.field_R = param0;
          this.field_T = param2;
          return;
        } else {
          this.field_R = param0;
          this.field_T = param2;
          return;
        }
    }

    private final void a(byte param0, int[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 85 % ((-2 - param0) / 62);
              if (this.field_K == null) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = this.field_K.length;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var4 = stackIn_4_0;
            var5 = param1.length;
            this.field_K = param1;
            var6 = param1;
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6.length <= var7) {
                    break L4;
                  } else {
                    var8 = var8 + var6[var7];
                    var6[var7] = var8 + var6[var7];
                    var7++;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.b(var4, var5, -20410);
                this.a(true, var4, var5);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static String j(int param0) {
        if (param0 != -129) {
            field_J = -78;
            return mk.field_f;
        }
        return mk.field_f;
    }

    static {
        field_P = "Holding your chosen god's standard high, order your forces into battle. For here, upon these bloodstained battlefields, will the armies of Gielinor wage war.";
        field_J = 0;
        field_O = "Game";
    }
}
